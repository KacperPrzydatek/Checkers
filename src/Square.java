public class Square {
    private
            int _nameVertical;
            int _nameHorizontal;
            boolean _ifBlack;
            Piece _content; // mark for piece placed on this square
    public

    Square(int nameVer,int nameHor, boolean colour)
    {
        _nameVertical=nameVer;
        _nameHorizontal=nameHor;
        _ifBlack=colour;
    }
    void moveIn(Piece piece)
    {
        if(_content!=Global.Empty)
        {
            System.out.println("There is another piece on this square. Do another move.");
            System.out.println("MMark1 wstaw modal wyswietlajacy sie uzytkownikowi");
        }
        else
        {
            _content=piece;
        }
    }
    void moveOut()
    {
        if(_content==Global.Empty)
        {
            System.out.println("There is no piece on this square. Do another move.");
            System.out.println("MMark2 wstaw modal wyswietlajacy sie uzytkownikowi");
        }
        else
        {
            _content=Global.Empty;
        }
    }
    boolean amIEmpty()
    {
        if(_content!=Global.Empty) return false;
        else return true;
    }
}
