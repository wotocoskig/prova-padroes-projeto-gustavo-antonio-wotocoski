public class Main {
    public static void main(String[] args) {
        EmissorApolice emissorAuto = new EmissorAuto();
        emissorAuto.emitir("Carlos Silva", 50000.00); // 50k veículo

        EmissorApolice emissorResidencial = new EmissorResidencial();
        emissorResidencial.emitir("Ana Souza", 300000.00); // 300k imóvel

        EmissorApolice emissorVida = new EmissorVida();
        emissorVida.emitir("João Pedro", 1000000.00); // 1M capital
    }
}

