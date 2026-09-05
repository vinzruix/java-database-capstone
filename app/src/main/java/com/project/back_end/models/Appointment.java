package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Appointment {

    // @Entity annotation:
//    - Marks the class as a JPA entity, meaning it represents a table in the database.
//    - Required for persistence frameworks (e.g., Hibernate) to map the class to a database table.


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @NotNull
    private Doctor doctor;

    @ManyToOne
    @NotNull
    private Patient patient;


    @Future(message = "Appointment must be in the future")
    private LocalDateTime appointmentTime;

    @NotNull
    private int status;

    @Size(max = 200)
    private String notes;


    @Size(max = 50)
    private String reasonForVisit;


    @Transient
    private LocalDateTime getEndTime() {
        return appointmentTime.plusHours(1);
    }


    @Transient
    private LocalDate getAppointmentDate() {
        return appointmentTime.toLocalDate();
    }

    @Transient
    private LocalTime getAppointmentTimeOnly() {
        return appointmentTime.toLocalTime();
    }

    public Appointment() {

    }

    public Appointment(Long id, Doctor doctor, Patient patient, LocalDateTime appointmentTime, int status, String reasonForVisit, String notes) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.notes = notes;
        this.reasonForVisit = reasonForVisit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

