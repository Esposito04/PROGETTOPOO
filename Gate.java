package org.example;

public class Gate {

    protected int num;
    protected int terminal;

    public Gate(int num, int terminal) {

        this.num = num;
        this.terminal = terminal;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }
}
