//1). Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(),
// toString(). Определить дополнительно методы в классе,
// создающем массив объектов. Задать критерий выбора данных и
// вывести эти данные на консоль.
//	1.1). Student: id, Фамилия, Имя, Отчество, Дата рождения,
//	Адрес, Телефон, Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a)	список студентов заданного факультета;
//b)	списки студентов для каждого факультета и курса;
//c)	список студентов, родившихся после заданного года;
//d)	список учебной группы.
// задание выполнено как я его понял, ссори ;)
package com.example.Student;

import java.util.Scanner;

public class Main {
    private String[][] student;
    private int id;

    public void setId(int id) {
        this.id = id;

    }

    private String фамилия;

    public void setФамилия(String фамилия) {
        this.фамилия = фамилия;
    }

    public void setStudent(String[][] student) {
        this.student = student;
    }


    public Main(String[][] student, int id) {
        this.student = student;
        this.id = id;
    }

    public Main() {
    }

    private void createMassiv() {
        student[0][0] = "0";
        student[0][1] = "Сидоров";
        student[0][2] = "Петр";
        student[0][3] = "Витальевич";
        student[0][4] = "01.02.1990";
        student[0][5] = "ул.Крапоткина";
        student[0][6] = "345345";
        student[0][7] = "Исторический";
        student[0][8] = "3";
        student[0][9] = "5";
        student[1][0] = "1";
        student[1][1] = "Брундуков";
        student[1][2] = "Артем";
        student[1][3] = "Александрович";
        student[1][4] = "01.02.1992";
        student[1][5] = "ул.Давида";
        student[1][6] = "6785454";
        student[1][7] = "Биологический";
        student[1][8] = "2";
        student[1][9] = "3";
        student[2][0] = "2";
        student[2][1] = "Верещако";
        student[2][2] = "Владислав";
        student[2][3] = "Вячеславович";
        student[2][4] = "01.02.1989";
        student[2][5] = "ул.Лебедя";
        student[2][6] = "5455667";
        student[2][7] = "Исторический";
        student[2][8] = "5";
        student[2][9] = "1";
        student[3][0] = "3";
        student[3][1] = "Голотовский";
        student[3][2] = "Никита";
        student[3][3] = "Владимирович";
        student[3][4] = "01.02.1990";
        student[3][5] = "ул.Крапоткина";
        student[3][6] = "893434";
        student[3][7] = "Биологический";
        student[3][8] = "4";
        student[3][9] = "2";
        student[4][0] = "4";
        student[4][1] = "Добринская ";
        student[4][2] = "Дарья";
        student[4][3] = "Дмитриевна";
        student[4][4] = "01.02.1992";
        student[4][5] = "ул.Сепаратистов";
        student[4][6] = "233568";
        student[4][7] = "Географический";
        student[4][8] = "2";
        student[4][9] = "4";
        student[5][0] = "5";
        student[5][1] = "Жуковин ";
        student[5][2] = "Леонид";
        student[5][3] = "Максимович";
        student[5][4] = "01.02.1990";
        student[5][5] = "ул.Давида";
        student[5][6] = "9783242";
        student[5][7] = "Исторический";
        student[5][8] = "5";
        student[5][9] = "3";
        student[6][0] = "6";
        student[6][1] = "Зуева";
        student[6][2] = "Вероника";
        student[6][3] = "Вячеславовна";
        student[6][4] = "01.02.1989";
        student[6][5] = "ул.Опереты";
        student[6][6] = "6797833";
        student[6][7] = "Географический";
        student[6][8] = "3";
        student[6][9] = "1";
        student[7][0] = "7";
        student[7][1] = "Иванченков";
        student[7][2] = "Артур";
        student[7][3] = "Андреевич";
        student[7][4] = "01.02.1991";
        student[7][5] = "ул.Крапоткина";
        student[7][6] = "345345";
        student[7][7] = "Исторический";
        student[7][8] = "1";
        student[7][9] = "4";
        student[8][0] = "8";
        student[8][1] = "Игнатович";
        student[8][2] = "Диана";
        student[8][3] = "Викторовна";
        student[8][4] = "01.02.1989";
        student[8][5] = "ул.Лебедя";
        student[8][6] = "780978235";
        student[8][7] = "Исторический";
        student[8][8] = "2";
        student[8][9] = "3";
        student[9][0] = "9";
        student[9][1] = "Казаченок";
        student[9][2] = "Галина";
        student[9][3] = "Валерьевна";
        student[9][4] = "01.02.1990";
        student[9][5] = "ул.Красина";
        student[9][6] = "345343";
        student[9][7] = "Экономический";
        student[9][8] = "3";
        student[9][9] = "1";
        student[10][0] = "10";
        student[10][1] = "Коверзюк";
        student[10][2] = "Мария";
        student[10][3] = "Игоревна";
        student[10][4] = "01.02.1990";
        student[10][5] = "ул.Миронова";
        student[10][6] = "345345";
        student[10][7] = "Биологический";
        student[10][8] = "4";
        student[10][9] = "2";
        student[11][0] = "11";
        student[11][1] = "Козак";
        student[11][2] = "Александр";
        student[11][3] = "Николаевич";
        student[11][4] = "01.02.1991";
        student[11][5] = "ул.Заграницы";
        student[11][6] = "3453455";
        student[11][7] = "Географический";
        student[11][8] = "1";
        student[11][9] = "2";
        student[12][0] = "12";
        student[12][1] = "Кот";
        student[12][2] = "Юлия";
        student[12][3] = "Александровна";
        student[12][4] = "01.02.1987";
        student[12][5] = "ул.Павленко";
        student[12][6] = "98734534";
        student[12][7] = "Исторический";
        student[12][8] = "3";
        student[12][9] = "1";
        student[13][0] = "13";
        student[13][1] = "Кочеткова";
        student[13][2] = "Лилия";
        student[13][3] = "Геннадьевна";
        student[13][4] = "01.02.1987";
        student[13][5] = "ул.Космонавтов";
        student[13][6] = "567878";
        student[13][7] = "Географический";
        student[13][8] = "5";
        student[13][9] = "3";
        student[14][0] = "14";
        student[14][1] = "Кривецкий";
        student[14][2] = "Александр";
        student[14][3] = "Александрович";
        student[14][4] = "01.02.1989";
        student[14][5] = "ул.Крапоткина";
        student[14][6] = "3343664";
        student[14][7] = "Экономический";
        student[14][8] = "3";
        student[14][9] = "3";
        student[15][0] = "15";
        student[15][1] = "Марчик";
        student[15][2] = "Виктория";
        student[15][3] = "Леонидовна";
        student[15][4] = "01.02.1992";
        student[15][5] = "ул.Красной Армии";
        student[15][6] = "6767866";
        student[15][7] = "Исторический";
        student[15][8] = "5";
        student[15][9] = "5";
        student[16][0] = "16";
        student[16][1] = "Мирный";
        student[16][2] = "Владислав";
        student[16][3] = "Иванович";
        student[16][4] = "01.02.1993";
        student[16][5] = "ул.Миронова";
        student[16][6] = "2342342";
        student[16][7] = "Экономический";
        student[16][8] = "5";
        student[16][9] = "1";

    }

    public static void main(String[] args) {
        Student mass = new Student();
        Main brass = new Main();
        String[][] student = mass.getStudent();
        brass.setStudent(student);
        int id = mass.getId();
        brass.setId(id);
        String toString = mass.toString();
        brass.toString();
        //brass.createArray();
        brass.createMassiv();
        brass.studyGroup();
       // brass.birthDay();
        // brass.kursList();
        //brass.listFaculties();
        // brass.show();
        // brass.studentsList();
        // brass.setTip();
        String фамилия = mass.getФамилия();
        brass.setФамилия(фамилия);
        //mass.getФамилия();
        // System.out.println(brass.фамилия + mass.фамилия);

    }

    private void studyGroup(){
        System.out.println("Список студентов 1 группы :");
        for (int i = 0; i < 16; i++) {
            if (student[i][9] == "1") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 2 группы :");
        for (int i = 0; i < 16; i++) {
            if (student[i][9] == "2") {

                System.out.println(student[i][1] + " " + student[i][2] + "Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 3 группы  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][9] == "3") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 4 группы  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][9] == "4") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }
        System.out.println("Список студентов 5 группы  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][9] == "5") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }
    }



    private void birthDay() {
        System.out.println(" Cписок студентов, родившихся после какого года нужен , введите год ");
        id = input1();
        for (int i = 0; i <= 16; i++) {
            if (id < Integer.parseInt(student[i][4].substring(6, 10))) {
                System.out.println(student[i][1] + " " + student[i][2] + " год рождения " + student[i][4]);
            }
        }
    }


    private void listFaculties() {
        System.out.println("Список студентов историческог факультета :");
        for (int i = 0; i < 16; i++) {
            if (student[i][7] == "Исторический") {

                System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
            }
        }

        System.out.println("Список студентов биологическог факультета :");
        for (int i = 0; i < 16; i++) {
            if (student[i][7] == "Биологический") {

                System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
            }
        }

        System.out.println("Список студентов географического факультета :");
        for (int i = 0; i < 16; i++) {
            if (student[i][7] == "Географический") {

                System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
            }
        }

        System.out.println("Список студентов экономического факультета :");
        for (int i = 0; i < 16; i++) {
            if (student[i][7] == "Экономический") {

                System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
            }
        }

    }


    private void kursList() {
        System.out.println("Список студентов 1 курса :");
        for (int i = 0; i < 16; i++) {
            if (student[i][8] == "1") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 2 курса :");
        for (int i = 0; i < 16; i++) {
            if (student[i][8] == "2") {

                System.out.println(student[i][1] + " " + student[i][2] + "Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 3 курса  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][8] == "3") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }

        System.out.println("Список студентов 4 курса  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][8] == "4") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }
        System.out.println("Список студентов 5 курса  :");
        for (int i = 0; i < 16; i++) {
            if (student[i][8] == "5") {

                System.out.println(student[i][1] + " " + student[i][2] + " Факультет: " + student[i][7]);
            }
        }
    }


    private void studentsList() {
        System.out.println("Выберите факультет ");
        System.out.println("1-Исторический, 2-Биологический , 3-Географический, 4-Экономический");
        id = input1();
        System.out.println("Список студентов факультета :");
        if (id == 1) {
            for (int i = 0; i < 16; i++) {
                if (student[i][7] == "Исторический") {
                    System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
                }
            }
        }
        if (id == 2) {
            for (int i = 0; i < 16; i++) {
                if (student[i][7] == "Биологический") {
                    System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
                }
            }
        }
        if (id == 3) {
            for (int i = 0; i < 16; i++) {
                if (student[i][7] == "Географический") {
                    System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
                }
            }
        }
        if (id == 4) {
            for (int i = 0; i < 16; i++) {
                if (student[i][7] == "Экономический") {
                    System.out.println(student[i][1] + " " + student[i][2] + " Курс: " + student[i][8]);
                }
            }
        }
    }

    public void createArray() {

        String[] question = new String[10];
        question[0] = "Введите id студента  ";
        question[1] = "Введите фамилию студента";
        question[2] = "Введите имя студента";
        question[3] = "Введите отчество студента";
        question[4] = "Введите Дату рождения студента";
        question[5] = "Введите адрес студента";
        question[6] = "Введите номер телефона студента";
        question[7] = "Введите факультет студента";
        question[8] = "Введите курс студента";
        question[9] = "Введите группу студента";

        String numStr = null;
        System.out.println(" Заполняем карточку студента ");
        for (int i = 0; i < 10; i++) {
            System.out.println(question[i]);

            if (i == 0) {
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    id = sc.nextInt();
                }
                student[id][i] = "";
                student[id][i] = student[id][i] + id;
                System.out.println(student[id][i]);
            }
            if (i >= 1) {
                student[id][i] = "";
                student[id][i] = student[id][i] + "; " + input();
                System.out.println(student[id][i]);
            }
            System.out.println("Продолжаем ввод? 1-да, 0-нет");
            if (input1() == 1) {
                createArray();
            }

        }

    }

    public void show() {
        for (int j = 0; j <= 16; j++) {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + student[j][i]);

            }
        }
    }

    public String input() {
        String numStr = null;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            numStr = sc.nextLine();
        }
        return numStr;
    }


    private void setTip() {
        String[] question = new String[10];
        question[0] = "Введите id студента  ";
        question[1] = "Введите фамилию студента";
        question[2] = "Введите имя студента";
        question[3] = "Введите отчество студента";
        question[4] = "Введите Дату рождения студента";
        question[5] = "Введите адрес студента";
        question[6] = "Введите номер телефона студента";
        question[7] = "Введите факультет студента";
        question[8] = "Введите курс студента";
        question[9] = "Введите группу студента";


        System.out.println("Введите id студента ");

        id = input1();
        System.out.println(student[id]);
        System.out.println("Какое поле будем редактировать ");
        System.out.println("1 -  Фамилия,2 - Имя,3 - Отчество,4 - Дата рождения,5 - Адрес,6 - Телефон,7 - Факультет,8 - Курс,9 - Группа.");
        int id1 = input1();

        System.out.println(question[id1]);

        student[id][id1] = "";
        student[id][id1] = student[id][id1] + "; " + input();
        System.out.println(student[id][id1]);
        System.out.println("Продолжаем 1-да, 0 - нет");
        input1();
        if (input1() == 1) {
            setTip();
        }
        show();
    }

    private void setTip(Main mass) {
        String[] question = new String[10];
        question[0] = "Введите id студента  ";
        question[1] = "Введите фамилию студента";
        question[2] = "Введите имя студента";
        question[3] = "Введите отчество студента";
        question[4] = "Введите Дату рождения студента";
        question[5] = "Введите адрес студента";
        question[6] = "Введите номер телефона студента";
        question[7] = "Введите факультет студента";
        question[8] = "Введите курс студента";
        question[9] = "Введите группу студента";
        mass.setФамилия(input());


        System.out.println("Введите id студента ");

        id = input1();
        System.out.println(student[id]);
        System.out.println("Какое поле будем редактировать ");
        System.out.println("1 -  Фамилия,2 - Имя,3 - Отчество,4 - Дата рождения,5 - Адрес,6 - Телефон,7 - Факультет,8 - Курс,9 - Группа.");
        int id1 = input1();

        System.out.println(question[id1]);

        student[id][id1] = "";
        student[id][id1] = student[id][id1] + "; " + input();
        System.out.println(student[id][id1]);
        System.out.println("Продолжаем 1-да, 0 - нет");
        input1();
        if (input1() == 1) {
            setTip();
        }
        show();
    }

    private void getTip() {
        System.out.println("Введите id студента ");
        input();
        System.out.println(student[id]);
        System.out.println("Какое поле Вас Интересует ");
        System.out.println("1 -  Фамилия,2 - Имя,3 - Отчество,4 - Дата рождения,5 - Адрес,6 - Телефон,7 - Факультет,8 - Курс,9 - Группа.");
        System.out.println(student[input1()]);
    }

    @Override
    public String toString() {
        return "Пример";
    }

    public int input1() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        return n;
    }
}
// public class CreateArray {

