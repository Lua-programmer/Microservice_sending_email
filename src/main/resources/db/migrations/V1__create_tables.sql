CREATE TABLE tb_email (
    email_id SERIAL PRIMARY KEY NOT NULL,
    ownerRef VARCHAR(255) NOT NULL,
    emailFrom VARCHAR(255) NOT NULL,
    emailTo VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    text TEXT NOT NULL,
    sendDateEmail DATE,
    statusEmail TEXT
);