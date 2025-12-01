package com.example.emptyviewsactivity_2023657278;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText etVehiclePrice, etDownPayment, etLoanPeriod, etInterestRate;
    private TextView tvLoanAmount, tvTotalInterest, tvTotalPayment, tvMonthlyPayment;
    private Button btnCalculate;

    private final DecimalFormat df = new DecimalFormat("#,##0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enable home button in action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Loan Calculator");
        }

        // Initialize views
        initializeViews();

        // Set up calculate button click listener
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLoan();
            }
        });
    }

    private void initializeViews() {
        etVehiclePrice = findViewById(R.id.etVehiclePrice);
        etDownPayment = findViewById(R.id.etDownPayment);
        etLoanPeriod = findViewById(R.id.etLoanPeriod);
        etInterestRate = findViewById(R.id.etInterestRate);

        tvLoanAmount = findViewById(R.id.tvLoanAmount);
        tvTotalInterest = findViewById(R.id.tvTotalInterest);
        tvTotalPayment = findViewById(R.id.tvTotalPayment);
        tvMonthlyPayment = findViewById(R.id.tvMonthlyPayment);

        btnCalculate = findViewById(R.id.btnCalculate);
    }

    private void calculateLoan() {
        try {
            // Get input values
            double vehiclePrice = Double.parseDouble(etVehiclePrice.getText().toString());
            double downPayment = Double.parseDouble(etDownPayment.getText().toString());
            int loanPeriod = Integer.parseInt(etLoanPeriod.getText().toString());
            double interestRate = Double.parseDouble(etInterestRate.getText().toString());

            // Validate inputs
            if (downPayment >= vehiclePrice) {
                Toast.makeText(this, "Down payment must be less than vehicle price", Toast.LENGTH_SHORT).show();
                return;
            }

            if (loanPeriod <= 0) {
                Toast.makeText(this, "Loan period must be greater than 0", Toast.LENGTH_SHORT).show();
                return;
            }

            // Perform calculations
            double loanAmount = vehiclePrice - downPayment;
            double totalInterest = loanAmount * (interestRate / 100) * loanPeriod;
            double totalPayment = loanAmount + totalInterest;
            double monthlyPayment = totalPayment / (loanPeriod * 12);

            // Display results
            displayResults(loanAmount, totalInterest, totalPayment, monthlyPayment);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter valid numbers in all fields", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "An error occurred during calculation", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("SetTextI18n")
    private void displayResults(double loanAmount, double totalInterest, double totalPayment, double monthlyPayment) {
        tvLoanAmount.setText("RM " + df.format(loanAmount));
        tvTotalInterest.setText("RM " + df.format(totalInterest));
        tvTotalPayment.setText("RM " + df.format(totalPayment));
        tvMonthlyPayment.setText("RM " + df.format(monthlyPayment));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            // Home icon pressed - go to homepage
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
            return true;
        } else if (id == R.id.menu_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}