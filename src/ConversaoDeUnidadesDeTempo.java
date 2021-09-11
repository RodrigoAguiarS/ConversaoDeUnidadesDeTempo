public class ConversaoDeUnidadesDeTempo {
    public static final int constanteDeTempo = 60;

    //HORAS -> MINUTOS
    public static float converteHorasParaMinutos(float horas){
        return horas * constanteDeTempo;
    }
    //HORAS -> SEGUNDOS
    public static float converteHorasParaSegundos(float horas){
        return horas * constanteDeTempo *constanteDeTempo;
    }


}
