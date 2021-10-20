abstract class Game{
    protected GameInformacao info;
    public Game(GameInformacao info){
        this.info = info;
    }
    public abstract void criar();
    public abstract void fazer();
    public abstract void aplicar();

    public void Jogar(){
        criar();
        fazer();
        aplicar();
        escolher();
    }
    protected void escolher(){
        System.out.println("Escolha o jogo:"+this.getClass().getName());

    }
}