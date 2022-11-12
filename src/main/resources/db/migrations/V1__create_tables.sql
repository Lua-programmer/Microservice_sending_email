CREATE TABLE tb_email (
    email_id SERIAL PRIMARY KEY NOT NULL,
    owner_ref VARCHAR(255) NOT NULL,
    email_from VARCHAR(255) NOT NULL,
    email_to VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    text TEXT NOT NULL,
    send_date_email DATE,
    status_email TEXT
);