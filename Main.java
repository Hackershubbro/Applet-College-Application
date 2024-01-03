// Done by Seenu Madhavan R
import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CollegeAdmissionForm extends Applet implements ActionListener {

    // Form components
    private Label nameLabel, dobLabel, religionLabel, casteLabel, percentageLabel, locationLabel, marksLabel,
            fatherNameLabel, motherNameLabel, courseLabel;
    private TextField nameTextField, dobTextField, religionTextField, casteTextField, percentageTextField,
            locationTextField, marksTextField, fatherNameTextField, motherNameTextField;
    private Choice courseChoice;
    private Button submitButton;
    private TextArea outputTextArea;

    public void init() {
        // Initialize form components
        nameLabel = new Label("Name:");
        add(nameLabel);

        nameTextField = new TextField(20);
        add(nameTextField);

        dobLabel = new Label("Date of Birth:");
        add(dobLabel);

        dobTextField = new TextField(20);
        add(dobTextField);

        religionTextField = new TextField(20);
        add(religionTextField);

        casteLabel = new Label("Caste:");
        add(casteLabel);

        casteTextField = new TextField(20);
        add(casteTextField);

        percentageLabel = new Label("Percentage of Marks:");
        add(percentageLabel);

        percentageTextField = new TextField(20);
        add(percentageTextField);

        locationLabel = new Label("Location:");
        add(locationLabel);

        locationTextField = new TextField(20);
        add(locationTextField);

        marksLabel = new Label("Marks of Previous College/School:");
        add(marksLabel);

        marksTextField = new TextField(20);
        add(marksTextField);

        fatherNameLabel = new Label("Father's Name:");
        add(fatherNameLabel);

        fatherNameTextField = new TextField(20);
        add(fatherNameTextField);

        motherNameLabel = new Label("Mother's Name:");
        add(motherNameLabel);

        motherNameTextField = new TextField(20);
        add(motherNameTextField);

        courseLabel = new Label("Course:");
        add(courseLabel);

        courseChoice = new Choice();
        courseChoice.add("Computer Science");
        courseChoice.add("Electrical Engineering");
        courseChoice.add("Mechanical Engineering");
        // Add more courses as needed
        add(courseChoice);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        outputTextArea = new TextArea("", 10, 40, TextArea.SCROLLBARS_BOTH);
        add(outputTextArea);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Handle the form submission logic here
            String name = nameTextField.getText();
            String dob = dobTextField.getText();
            String religion = religionTextField.getText();
            String caste = casteTextField.getText();
            String percentage = percentageTextField.getText();
            String location = locationTextField.getText();
            String marks = marksTextField.getText();
            String fatherName = fatherNameTextField.getText();
            String motherName = motherNameTextField.getText();
            String course = courseChoice.getSelectedItem();
            // Display the submitted information in the outputTextArea (you can customize this part)
            outputTextArea.setText("College Admission Form Submitted:\nName: " + name + "\nDOB: " + dob
                    + "\nCourse: " + courseChoice.getSelectedItem());
        }
    }
}
