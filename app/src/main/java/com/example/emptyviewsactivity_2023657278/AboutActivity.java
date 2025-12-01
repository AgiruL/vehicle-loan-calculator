package com.example.emptyviewsactivity_2023657278;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    private TextView tvGitHubUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Enable home button in action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("About");
        }

        initializeViews();
        setupGitHubLink();
    }

    private void initializeViews() {
        tvGitHubUrl = findViewById(R.id.tvGitHubUrl);

        // Update with your actual information
        TextView tvAuthorName = findViewById(R.id.tvAuthorName);
        TextView tvMatricNo = findViewById(R.id.tvMatricNo);
        TextView tvCourse = findViewById(R.id.tvCourse);

        tvAuthorName.setText("Name: AMIRUL HAZIQ BIN BADRUL HISHAM");
        tvMatricNo.setText("Matric No: 2023657278");
        tvCourse.setText("Course: CDCS251");
    }

    private void setupGitHubLink() {
        tvGitHubUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String githubUrl = "https://github.com/AgiruL/vehicle-loan-calculator.git";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_menu, menu);
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
        } else if (id == R.id.menu_calculator) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressLint({"MissingSuperCall", "GestureBackNavigation"})
    @Override
    public void onBackPressed() {
        // When back button pressed, go to Calculator
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}