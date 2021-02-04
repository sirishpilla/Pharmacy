Please feel free to mail me if anything doesn't work as intended or having any doubt.
sirish.pilla@siu.edu

I have used MYSQL since I was not able to access ORACLE DATABASE in our college.
This project is implemented in Spring Boot Java Framework.
Tomcat is embedded so there is no need to start a server.
Can be run on Eclipse but STS is preferable.
Always relaunch the program when you want to run it since tomcat is embedded it doesn't run on same port twice.

SQL
THE SCHEMA.SQL file is in scripts folder and can be run in comman line using command assigned to it in command prompt.
THE DATA.SQL file is in scripts folder and can be run in comman line using command assigned to it in command prompt.

I did not right error handling due to time constraint so it displays exception error pages whenever the referential integrity is effected.


localhost:8080 has the index page

INDEX PAGE Displays funcionality buttons
(1) List all (distinct) patients

Patient List-Dipslays list of Patients and gives llinks to doctor info on clicking the doctor_ssn in the page.

Doctor List-Displays List of Doctors

Pharmacy List-Lists all the pharmacies

Drugs LIST-This button gives all the drugs and pharmacy company names.
I have attached the pharmacy phone number to it for simplicity.


PRESCRIPTION LIST- Lists all the prescriptions

CONTRACT LIST- LISTS ALL THE CONTRACTS AND CHANGE/UPDATE DELETE COntracts

Patient Enquiry-Takes patient name and birth date as input and gives patient prescription info(GUI a bit MESSED up).
DOES NOT GIVE INFO and produces null values if there is no correct match of name and birth_date.Please refer pri_phy_patient table or patients list button for data.

Drugs SOld in Highest Price- Gives list of all drugs and the pharm co name along with the price in which they are sold highest.

Drugs Completed Today-List all prescriptions completed today (using drop-off date = today date).

Drugs Ready but not picked up-List all prescriptions ready_to_go but have not been picked up (for the purpose of reminding
patients)



