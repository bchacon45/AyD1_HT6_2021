/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import Objetos.RegistroAcademico;
import Objetos.Carrera;
import Objetos.Horario;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Bryan
 */
public class BRYAN_EDUARDO_CHACON_LOPEZ {
    @InjectMocks
    AsignarHorario horario_nuevo;
    
    @Mock
    Carrera carrera;
    
    @Mock
    RegistroAcademico reg_academico;
    
    @Test
    public void getCodigoHorarioTest() throws Exception{
        when(reg_academico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(reg_academico.getAnio()).thenReturn(2015);
        Horario nuevoHorario = horario_nuevo.generarHorario(carrera, reg_academico);
        assertEquals(985, nuevoHorario.getCodigoHorario());
    }
    
    @Test
    public void getDescripcionHorarioTest() throws Exception{
        when(reg_academico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(reg_academico.getAnio()).thenReturn(2015);
        Horario nuevoHorario = horario_nuevo.generarHorario(carrera, reg_academico);
        assertEquals("Mixto", nuevoHorario.getDescripcion());
    }
}
