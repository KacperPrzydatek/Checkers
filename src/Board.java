public class Board {
    private
    Square[][] _board=new Square[8][8];
    public
    void startGame()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                {
                    _board[i][j].moveIn(Global.Empty);
                }

            }
        }
    }

}
