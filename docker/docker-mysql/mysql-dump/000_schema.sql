CREATE TABLE books_details (
  id INT AUTO_INCREMENT PRIMARY KEY,
  isbn VARCHAR(255),
  lang VARCHAR(255),
  publisher VARCHAR(255),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE books (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  author VARCHAR(255),
  details_id INT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY (details_id) REFERENCES books_details(id)
);

CREATE TABLE books_tags (
  id INT AUTO_INCREMENT PRIMARY KEY,
  value VARCHAR(255),
  book_id INT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY (book_id) REFERENCES books(id)
);