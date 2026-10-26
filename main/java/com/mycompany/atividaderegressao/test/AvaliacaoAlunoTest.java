import com.mycompany.atividaderegressao.main.AvaliacaoAluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AvaliacaoAlunoTest {

    private static final double DELTA = 0.0001;

    private AvaliacaoAluno avaliacao;

    @BeforeEach
    void setUp() {
        avaliacao = new AvaliacaoAluno();
    }

    // ---------- calcularMedia ----------

    @Test
    void calcularMedia_deveAplicarPeso40NaP1ePeso60NaP2() {
    }

    @Test
    void calcularMedia_deveRetornarMesmoValorQuandoNotasForemIguais() {
    }

    @Test
    void calcularMedia_deveRetornarZeroQuandoAmbasNotasForemZero() {
    }

    @Test
    void calcularMedia_deveRetornarDezQuandoAmbasNotasForemDez() {
    }

    @Test
    void calcularMedia_deveLancarExcecaoQuandoP1ForNegativa() {
    }

    @Test
    void calcularMedia_deveLancarExcecaoQuandoP2ForNegativa() {
    }

    @Test
    void calcularMedia_deveLancarExcecaoQuandoP1ForMaiorQueDez() {
    }

    @Test
    void calcularMedia_deveLancarExcecaoQuandoP2ForMaiorQueDez() {
    }

    // ---------- situacao (por média) ----------

    @Test
    void situacao_deveAprovarQuandoMediaForMaiorQueSete() {
    }

    @Test
    void situacao_deveAprovarQuandoMediaForExatamenteSete() {
    }

    @Test
    void situacao_deveColocarEmExameQuandoMediaForLogoAbaixoDeSete() {
    }

    @Test
    void situacao_deveColocarEmExameQuandoMediaForExatamenteQuatro() {
    }

    @Test
    void situacao_deveReprovarQuandoMediaForLogoAbaixoDeQuatro() {
    }

    @Test
    void situacao_deveReprovarQuandoMediaForZero() {
    }

    @Test
    void situacao_deveAprovarQuandoAmbasNotasForemDez() {
    }

    @Test
    void situacao_deveLancarExcecaoQuandoNotaForMaiorQueDez() {
    }

    @Test
    void situacao_deveLancarExcecaoQuandoNotaForNegativa() {
    }

    // ---------- situacao (por frequência) ----------

    @Test
    void situacao_deveReprovarPorFaltaQuandoFrequenciaForLogoAbaixoDeSetentaECinco() {
    }

    @Test
    void situacao_deveNaoReprovarPorFaltaQuandoFrequenciaForExatamenteSetentaECinco() {
    }

    @Test
    void situacao_deveReprovarPorFaltaQuandoFrequenciaForZero() {
    }

    @Test
    void situacao_deveAceitarFrequenciaDeCemPorCento() {
    }

    @Test
    void situacao_deveReprovarPorFaltaMesmoQuandoMediaForAlta() {
    }

    @Test
    void situacao_deveLancarExcecaoQuandoFrequenciaForNegativa() {
    }

    @Test
    void situacao_deveLancarExcecaoQuandoFrequenciaForMaiorQueCem() {
    }

    // ---------- calcularMediaComBonus (Apenas na versão 1.1)----------

    // @Test
    // void calcularMediaComBonus_deveSomarOBonusAMedia() {
    // }

    // @Test
    // void calcularMediaComBonus_deveRetornarMediaOriginalQuandoBonusForZero() {
    // }

    // @Test
    // void calcularMediaComBonus_deveAceitarBonusMaximoDeUmPonto() {
    // }

    // @Test
    // void calcularMediaComBonus_deveLimitarResultadoEmDezQuandoMediaMaisBonusUltrapassar() {
    // }

    // @Test
    // void calcularMediaComBonus_deveLancarExcecaoQuandoBonusForNegativo() {
    // }

    // @Test
    // void calcularMediaComBonus_deveLancarExcecaoQuandoBonusForMaiorQueOMaximo() {
    // }

    // @Test
    // void calcularMediaComBonus_deveLancarExcecaoQuandoNotaForInvalida() {
    // }
}