
package service;

public interface NesspresoService {
    public void Menu();
    public int ActualCap(int act_cap, int max_cap);
    public int ServCup(int act_cap, int cup);
    public int EmptyPot(int act_cap);
    public int EnterCoffee(int max_cap, int act_cap, int cafe_ingresado);
}
