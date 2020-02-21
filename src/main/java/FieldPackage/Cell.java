package FieldPackage;

import java.util.ArrayList;
import java.util.HashMap;

class Cell {
    //координаты клетки в массиве field
    private int x;
    private int y;
    //символ, хранящийся в клетке
    private Symbol symbol;
    //таблица, в которой хранятся длины линий разных типов (диагональ, горизонаталь, вертикаль),
    // проходящих через эту клетку
    private HashMap<CombType, Comb> combs = new HashMap<>();
    // список с соседями клетки
    private ArrayList<Cell> neighbours = new ArrayList<>();
    //конструктор
    public Cell (int x, int y, Symbol s) {
        this.x = x;
        this. y = y;
        symbol = s;
        combs.put(CombType.HORIZONTAL, null);
        combs.put(CombType.VERTICAL, null);
        combs.put(CombType.DIAGONAL_UP, null);
        combs.put(CombType.DIAGONAL_DOWN, null);
    }

    //методы для получения координат клетки
    public int getX () { return x;}
    public int getY () { return y;}
    //методы для добавления соседей и получения списка соседей клетки
    public void addNeighbour (Cell neighbour) {neighbours.add(neighbour);}
    public ArrayList<Cell> getNeighbours () { return neighbours;}
    //метод для получения непрерывной линии заданного типа, проходящей через эту клетку
    public Comb getComb (CombType combType) {return combs.get(combType);}
    //метод для замены линии, которая проходит через данную клетку
    public  void  setComb (Comb comb, CombType combType) {combs.put(combType, comb );}
    //get и set для символа
    public Symbol getSymbol () { return symbol;}
    public void setSymbol (Symbol symbol) {this.symbol = symbol;}
}
