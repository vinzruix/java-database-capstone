## MySQL Database Design

### Table: appointments

- id: INT, Primary Key, Auto Increment
- doctor_id: INT, Foreign Key → doctors(id)
- patient_id: INT, Foreign Key → patients(id)
- appointment_time: DATETIME, Not Null
- status: INT (0 = Scheduled, 1 = Completed, 2 = Cancelled)

### Table: doctors

- id: INT, Primary Key, Auto Increment
- name: STR, Not Null
- last_name: STR, Not Null
- clinic_location: INT, Foreign Key → clinic_locations(id)


### Table: patients

- id: INT, Primary Key, Auto Increment
- name: STR, Not Null
- last_name: STR, Not Null

### Table: admin

- id: INT, Primary Key, Auto Increment
- 
### Table: Payments

- id: INT, Primary Key, Auto Increment
- amount: FLOAT, Not Null
- appointment_id: INT, Foreign Key → appointments(id)


### Table: clinic_locations

- id: INT, Primary Key, Auto Increment
- name: STR, Unique
- location: STR, Not Null


## MongoDB Collection Design

### Collection: prescriptions

```json
{
  "_id": "ObjectId('64abc123456')",
  "patientName": "John Smith",
  "appointmentId": 51,
  "medication": "Paracetamol",
  "dosage": "500mg",
  "doctorNotes": "Take 1 tablet every 6 hours.",
  "refillCount": 2,
  "clinicLocationId": 3
}
```

### Collection: Feedback

```json
{
  "_id": "ObjectId('64abc123456')",
  "patientName": "John Smith",
  "appointmentId": 32,
  "clinicLocationId": 3,
  "content": "The doctor Tejeda should be more kind"
}
```


### Collection: logs

```json
{
  "_id": "ObjectId('64abc123456')",
  "status": "warning",
  "content": "Login attempt failed"
}
```

### Collection: messages

```json
{
  "_id": "ObjectId('64abc123456')",
  "message": "Hello",
  "senderName": "Yahir",
  "receptorName": "Alejandro"
}
```