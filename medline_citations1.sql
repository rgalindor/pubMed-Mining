CREATE DATABASE IF NOT EXISTS medline;

USE medline;

CREATE TABLE IF NOT EXISTS citation2 (
        citation_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        pubmed_id       VARCHAR(10) UNIQUE NOT NULL,
        title   VARCHAR(500) CHARSET utf8 NOT NULL,
        author VARCHAR(500) CHARSET utf8 NULL
)

