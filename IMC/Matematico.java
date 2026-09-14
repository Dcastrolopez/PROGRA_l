public class Matematico {
    
    public String calculo_imc(float peso, float altura) {
        
        String resultado;
        float imc = (peso / (altura * altura));
        if (imc < 18.5) {
            resultado = imc + " Bajo peso";
        } else if (imc < 25) {
            resultado = imc + " Peso normal";
        } else if (imc < 30) {
            resultado = imc + " Sobrepeso";
        } else if (imc < 35) {
            resultado = imc + " Obesidad Grado l";
        } else if (imc < 40) {
            resultado = imc + " Obesidad Grado ll";
        } else {
            resultado = imc + " Obesidad Grado lll";
        }
        return resultado;
        }
    }
