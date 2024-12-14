public class Auto {

            if(dVelocidadActual >= dDistanciaFrenado) {
                dVelocidadActual = dVelocidadActual - dDistanciaFrenado;
            }else{
                dVelocidadActual = 0;
            }

        }
        System.out.println("Avance - Velocidad = " + dVelocidadActual);
    }
    public void frenarHastaDetener(){
        while(dVelocidadActual > 0){
            frenar();
        }
    }
    public void acelerarAlMaximo(){
        // como aceleran su auto al maximo....
    }



    //Setter and Getter:


    public String getsPlaca() {
        return sPlaca;
    }

    public void setsPlaca(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public double getdVelocidadMaxima() {
        return dVelocidadMaxima;
    }

    public void setdVelocidadMaxima(double dVelocidadMaxima) {
        this.dVelocidadMaxima = dVelocidadMaxima;
    }

    public boolean isbEncendidoMotor() {
        return bEncendidoMotor;
    }

    public void setbEncendidoMotor(boolean bEncendidoMotor) {
        this.bEncendidoMotor = bEncendidoMotor;
    }

    public boolean isbMovimiento() {
        return bMovimiento;
    }

    public void setbMovimiento(boolean bMovimiento) {
        this.bMovimiento = bMovimiento;
    }

    public boolean isbLucesEncendidas() {
        return bLucesEncendidas;
    }

    public void setbLucesEncendidas(boolean bLucesEncendidas) {
        this.bLucesEncendidas = bLucesEncendidas;
    }

    public double getdDistanciaFrenado() {
        return dDistanciaFrenado;
    }

    public void setdDistanciaFrenado(double dDistanciaFrenado) {
        this.dDistanciaFrenado = dDistanciaFrenado;
    }

    public double getdVelocidadActual() {
        return dVelocidadActual;
    }

    public void setdVelocidadActual(double dVelocidadActual) {
        this.dVelocidadActual = dVelocidadActual;
    }

    public double getdAceleracion() {
        return dAceleracion;
    }

    public void setdAceleracion(double dAceleracion) {
        this.dAceleracion = dAceleracion;
    }
}
