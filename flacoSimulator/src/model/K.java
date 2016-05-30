package model;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class K {
    public static class Ruta{
    }
    
    public static class Recurso{
        private static final String RUTA_IC_FLACO_CHICO = "/recursos/flacoChico.png";
        private static final String RUTA_IC_FLACO_CHICO_SORPRENDIDO = "/recursos/flachoChicoSorprendido.png";
        private static final String RUTA_IC_FLACO = "/recursos/flaco.png";
        private static final String RUTA_IC_MALULO = "/recursos/malulo.png";
        private static final String RUTA_IC_FLACO_BOCA_ABIERTA = "/recursos/flacoBocaAbierta.png";
        
        public static final ImageIcon IC_FLACO_CHICO = new ImageIcon(
                K.class.getResource(RUTA_IC_FLACO_CHICO)
        );
        
        public static final ImageIcon IC_FLACO_CHICO_SORPRENDIDO = new ImageIcon(
                K.class.getResource(RUTA_IC_FLACO_CHICO_SORPRENDIDO)
        );
        
        public static final ImageIcon IC_FLACO = new ImageIcon(
                K.class.getResource(RUTA_IC_FLACO)
        );
        
        public static final ImageIcon IC_MALULO = new ImageIcon(
                K.class.getResource(RUTA_IC_MALULO)
        );
        
        public static final ImageIcon IC_FLACO_BOCA_ABIERTA = new ImageIcon(
                K.class.getResource(RUTA_IC_FLACO_BOCA_ABIERTA)
        );
    }
    
    public static class Size{
        public final static Dimension flacoChico = new Dimension(41,62);
        public final static Dimension malulo = new Dimension(41,62);
    }
    
}
