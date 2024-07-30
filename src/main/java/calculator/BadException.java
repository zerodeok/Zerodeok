package calculator;

    public class BadException extends Exception{
        public BadException(){
            super("분모에 0이 들어올수 없습니다.");
        }
    }
