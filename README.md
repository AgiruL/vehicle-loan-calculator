A mobile application for estimating monthly vehicle loan payments, developed for a mobile technology assignment. Built with Android Studio using Java.

#📱 App Features:

##🏠 Home Screen:

1. Clean and intuitive homepage with app logo

2. Brief description of the app's functionality

3. Direct navigation to Calculator and About pages

Purple background theme

##🧮 Loan Calculator
1. Input Fields:
- Vehicle Price (RM)

- Down Payment (RM)

- Loan Period (Years)

- Interest Rate (%) per year

2. Automatic Calculations:
- Loan Amount = Vehicle Price – Down Payment

- Total Interest = Loan Amount × (Interest Rate / 100) × Loan Period

- Total Payment = Loan Amount + Total Interest

- Monthly Payment = Total Payment ÷ (Loan Period × 12)

3. Visual Features:
- Gray calculator container

- Orange "Calculate" button

- White-purplish background

- Professional results display

##ℹ️ About Page
1. Application icon display

2. Author information (Name, Matric No, Course)

3. Copyright notice

4. Clickable GitHub repository URL

5. Navigation back to calculator or homepage

##📊 Sample Calculation
- Input	Value
- Vehicle Price	RM 80,000
- Down Payment	RM 10,000
- Loan Period	5 years
- Interest Rate	3.5% per year
Results:
Loan Amount: RM 70,000.00
Total Interest: RM 12,250.00
Total Payment: RM 82,250.00
Monthly Payment: RM 1,370.83

##🎨 UI Design
1. Color Scheme
- Homepage: Light purple background (#FFE6E6FA)

- Calculator & About: White-purplish background (#FFF5F0FF)

- Calculator Container: Light gray (#FFD3D3D3)

- Calculate Button: Orange (#FFFF9800)

- Action Bar: Purple (#FF6200EE)

2. Navigation
- Home → Calculator/About: Direct buttons

- Calculator → About: Menu option (3 dots)

- About → Calculator: Back button or menu option

- Any screen → Home: Action bar back arrow

##🛠️ Technical Implementation
1. Project Structure
text
app/
├── src/main/java/com/example/emptyviewsactivity_2023657278/
│   ├── HomeActivity.java      # Homepage controller
│   ├── MainActivity.java      # Calculator controller  
│   └── AboutActivity.java     # About page controller
├── src/main/res/
│   ├── layout/                # UI layouts
│   ├── menu/                  # Navigation menus
│   └── values/                # Colors, strings, styles
2. Key Components
- Activities: Three main activities with proper lifecycle management

- Layouts: Responsive designs using LinearLayout and ScrollView

- Navigation: Intent-based navigation with proper back stack

- Input Validation: Error handling for invalid inputs

- Decimal Formatting: Proper currency formatting (RM #,##0.00)

3. Dependencies
- Minimum SDK: API 21 (Android 5.0)

- Target SDK: Latest Android

- Language: Java

- Libraries: AppCompat for backward compatibility

##📱 User Interface Requirements Met
✅ Application Title: Visible on all screens
✅ Navigation Menu: Home and About navigation
✅ About Page Components:
- Application Icon ✓
- Author Information ✓
- Copyright Notice ✓
- Clickable GitHub URL ✓
✅ Calculation Functionality: Accurate loan calculations ✓
✅ Responsive Design: Works on various screen sizes ✓

##🔧 How to Build and Run
1. Prerequisites
Android Studio (latest version)
Android SDK with API 21+
Java Development Kit (JDK) 8 or higher

2. Installation Steps
Clone the repository:

bash
git clone https://github.com/yourusername/vehicle-loan-calculator.git
- Open in Android Studio:

File → Open → Select project folder

Build the project:

Build → Make Project

Run on emulator or device:

Run → Run 'app'

Select your device/emulator

Testing the App
Launch the app on emulator or device

Navigate to Calculator from Homepage

- Enter test values:
Vehicle Price: 80000
Down Payment: 10000
Loan Period: 5
Interest Rate: 3.5

Click "Calculate" button

Verify results match sample calculation

##📁 File Structure Details
1. Layout Files
activity_home.xml - Homepage layout with navigation buttons
activity_main.xml - Calculator layout with input fields and results
activity_about.xml - About page layout with author info

2. Java Files
HomeActivity.java - Manages homepage navigation
MainActivity.java - Handles loan calculations and UI updates
AboutActivity.java - Displays app information and GitHub link

3. Resource Files
colors.xml - Color definitions for the app theme
strings.xml - String resources
styles.xml - App theme and styling
main_menu.xml - Calculator page menu
about_menu.xml - About page menu


##📝 License
Copyright © 2025 Vehicle Loan Calculator. All rights reserved.

##This project is developed for educational purposes as part of a mobile technology assignment.

👨‍💻 Author
Name: AMIRUL HAZIQ BIN BADRUL HISHAM
Matric No: 2023657278
Course: CDCS251
GitHub: AgiruL


Stack Overflow Community

Course Instructor for assignment guidelines
