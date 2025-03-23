package database;

public class Student {
        private int id;
        private String last_name;
        private String first_name;
        private String middle_name;
        private String birth_date;
        private String record_book_number;

        public Student(int id,
                       String last_name,
                       String first_name,
                       String middle_name,
                       String birth_date,
                       String record_book_number) {
            this.id = id;
            this.last_name = last_name;
            this.first_name = first_name;
            this.middle_name = middle_name;
            this.birth_date = birth_date;
            this.record_book_number = record_book_number;
        }

        public String getBirthDate() {
            return birth_date;
        }

        @Override
        public String toString() {
            return String.format("%d: %s %s %s, Дата народження: %s, Номер залікової: %s",
                    id, last_name, first_name, middle_name, birth_date, record_book_number);
        }
    }

