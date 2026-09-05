## Admin User stories

**Login:**
_As an Admin, I want to log into the portal with my credentials, so that I can manage the platform securely._

**Acceptance Criteria:**

1.
    - **Given** the admin wants to log into the portal
    - **When** he types his password and username correctly
    - **Then** the credentials are verified
    - **And** the admin is redirected to the portal

2.
    - **Given** the admin wants to log into the portal
    - **When** he types his password and username incorrectly
    - **Then** the credentials are denied
    - **And** the admin is notified that the credentials are incorrect

**Priority:** Medium

**Story Points:** 2

**Notes:** NA

---

**Log out:**
_As an Admin, I want to log out the portal ,so that I protect the system access._

**Acceptance Criteria:**

1.
    - **Given** the admin wants to log out
    - **When** he clicks into a bottom that says "log out"
    - **Then** the admin session finish
    - **And** the admin is redirected to the login page

**Priority:** Low

**Story Points:** 1

**Notes:** NA

---

**Add doctors:**
_As an Admin, I want to add doctors, so that I can manage them in the portal._

**Acceptance Criteria:**

1.
    - **Given** the admin has an active session
    - **When** he fills a form to add doctors and sent it
    - **Then** a new doctor will be added to the portal
    - **And** the admin will be notified that the doctor was added


2.
    - **Given** the admin has added successfully a new doctor
    - **When** the doctor tries to log into the portal
    - **Then** his credentials must be valid
    - **And** he must be redirected to the portal

**Priority:** High

**Story Points:** 3

**Notes:** NA

---

**Delete doctors:**
_As an Admin, I want to delete doctors, so that their credentials are no more valid._

**Acceptance Criteria:**

1.
    - **Given** the admin has an active session
    - **When** he fills a form to delete a doctor and sent it
    - **Then** that doctor will be deleted within his credentials
    - **And** the admin will be notified that the doctor was deleted

**Priority:** High

**Story Points:** 3

**Notes:** NA

## Patient User stories

**Available doctors:**
_As a Patient, I want to see all the doctors available without a session, so that I choose the best option for me._

**Acceptance Criteria:**

1.
    - **Given** the patient wants to see all the available doctors without an account
    - **When** enters to the portal and clicks a bottom called "doctors"
    - **Then** he is redirected to that page
    - **And** a list with all the available doctors is displayed

**Priority:** High

**Story Points:** 3

**Notes:** NA

---

**Sign up:**
_As a Patient, I want to create an account, so that I can schedule an appointment._

**Acceptance Criteria:**

1.
    - **Given** the patient wants to create and account
    - **When** he fills a form with his email and password and sent it
    - **Then** a new patient user will be created
    - **And** he will be notified that his register was successful

**Priority:** Medium

**Story Points:** 2

**Notes:** NA

---

**Log in:**
_As a patient, I want to log in, so that I can manage my bookings._

**Acceptance Criteria:**

1.
    - **Given** the patient is in the login page
    - **When** he types his credentials correctly
    - **Then** his credentials will be verified
    - **And** the patient will be redirected to his dashboard

**Priority:** Medium

**Story Points:** 2

**Notes:** NA

---

**Log out:**
_As a patient, I want to log out, so that I can secure my account._

**Acceptance Criteria:**

1.
    - **Given** the patient wants to log out
    - **When** he clicks into a bottom that says "log out"
    - **Then** the patient session finish
    - **And** the patient is redirected to the login page

**Priority:** Low

**Story Points:** 1

**Notes:** NA

---

**View appointments:**
_As a patient, I want to see all my upcoming appointments, so that I can prepare myself._

**Acceptance Criteria:**

1.
    - **Given** the patient has an active session
    - **When** he clicks into a bottom that says "dashboard"
    - **Then** the patient will be redirected to his own dashboard
    - **And** the patient will be able to see all his upcoming appointments

**Priority:** High

**Story Points:** 3

**Notes:** NA

## Doctor User stories

**Update my profile data:**
_As a doctor, I want to update all my contact information, so that my patients can have information about me
up-to-date._

**Acceptance Criteria:**

1.
    - **Given** the doctor has an active session
    - **When** and clicks a bottom called "profile"
    - **Then** a form with all his information will be displayed

**Priority:** Low

**Story Points:** 1

**Notes:** NA

---

**View patient details:**
_As a Doctor, I want to see details about my patients, so that I be prepared for each one._

**Acceptance Criteria:**

1.
    - **Given** the doctor has an active session
    - **When** he clicks into a patient
    - **Then** the information about that patient will be shown

**Priority:** High

**Story Points:** 3

**Notes:** NA

---

**Log in:**
_As a Doctor, I want to log in, so that I can manage my appointments._

**Acceptance Criteria:**

1.
    - **Given** the doctor is in the login page
    - **When** he types his credentials correctly
    - **Then** his credentials will be verified
    - **And** the doctor will be redirected to his dashboard

**Priority:** Medium

**Story Points:** 2

**Notes:** NA

---

**Log out:**
_As a doctor, I want to log out, so that I can secure my account._

**Acceptance Criteria:**

1.
    - **Given** the doctor wants to log out
    - **When** he clicks into a bottom that says "log out"
    - **Then** the doctor session finish
    - **And** the doctor is redirected to the login page

**Priority:** Low

**Story Points:** 1

**Notes:** NA

---

**View appointment calendar:**
_As a doctor, I want to see all my appointments in a calendar, so that I can manage my schedule and stay organized._

**Acceptance Criteria:**

1.
    - **Given** the doctor has an active session
    - **When** he clicks into a bottom that says "dashboard"
    - **Then** the doctor will be redirected to his own dashboard
    - **And** the doctor will be able to see all his appointments in a calendar

**Priority:** High

**Story Points:** 3

**Notes:** NA




