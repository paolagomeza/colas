clase  pública ColasGenericas <T> {
     T  Esquina privada [];
    privado  int  Frente ;
    privado  int  Siguiente ;
    
    @SuppressWarnings ( "sin marcar " )
    
     ColasGenericas públicas ( int  N ) {
        Esquina  = ( T []) nuevo  objeto [ N ];
        
        Siguiente  =  0 ;
        
        Frente  =  - 1 ;
    }
    
     colaLlena pública booleana  () {
        if ( Siguiente  ==  Esquina . longitud) {
            volver  verdadero ;
        } más {
            devuelve  falso ;
        }
    }
    
     encolar público vacío  ( T Num ) arroja ExcepcionColaLlena {  
      
        if (colaVacia ()) {
            
            Frente  =  - 1 ;
            Siguiente  =  0 ;
        }
        if (colaLlena ()) {
            lanzar una  nueva  ExcepcionColaLlena ();
        }
        Esquina [ Siguiente ] =  Num ;
        Siguiente ++ ;
        
        if ( Siguiente  ==  1 ) {
            Frente  =  0 ;
        }
    }
    
    public  boolean  colaVacia () {
        if ( Frente  ==  Siguiente ) {
            volver  verdadero ;
        } más  si ( Frente  ==  - 1 ) {
            volver  verdadero ;
        } más {
            devuelve  falso ;
        }
    }
    
    public  T  sacar () lanza  ExcepcionColaVacia {
        if (colaVacia ()) {
            lanzar una  nueva  ExcepcionColaVacia ();
        }
        T valor =  Esquina [ Frente ];
        Frente ++ ;
        valor de retorno ;
    }
}
