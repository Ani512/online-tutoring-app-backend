package onlinetutoring.com.teamelevenbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    private static final String COMPANY_EMAIL = "aplusonlinetutoring11@gmail.com";
    private static final String EMAIL_SUBJECT_CO = "Appointment Confirmation for A+ Tutors";
    private static final String EMAIL_SUBJECT_CA = "Appointment Cancellation for A+ Tutors";

    private JavaMailSender mailSender;
    @Autowired
    public void setEmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendConfirmationEmail(String toEmail, String fromEmail, String subject, LocalDateTime start) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(COMPANY_EMAIL);
        message.setTo(toEmail);
        message.setSubject(EMAIL_SUBJECT_CO);

        message.setText("Hello!\n\nYour tutoring appointment for "
                + subject
                + " is confirmed with "
                + fromEmail
                + " on "
                + start.getMonth() + "/" + start.getDayOfMonth() + "/" + start.getYear()
                + " at "
                + start.getHour() + ":" + start.getMinute()
                + "\n\nPlease visit our website - https://online-tutoring-team-eleven.vercel.app - if you want to cancel or reschedule.\n\n"
                + "Regards\n\nA+ Tutors");

        mailSender.send(message);
    }

    public void sendCancellationEmail(String toEmail, String fromEmail, String subject, LocalDateTime start) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(COMPANY_EMAIL);
        message.setTo(toEmail);
        message.setSubject(EMAIL_SUBJECT_CA);

        message.setText("Hello!\n\nYour tutoring appointment for "
                + subject
                + " with "
                + fromEmail
                + " on "
                + start.getMonth() + "/" + start.getDayOfMonth() + "/" + start.getYear()
                + " at "
                + start.getHour() + ":" + start.getMinute()
                + " has been successfully cancelled."
                + "\n\nPlease visit our website - https://online-tutoring-team-eleven.vercel.app - to schedule a new appointment.\n\n"
                + "Regards\n\nA+ Tutors");

        mailSender.send(message);
    }
}
