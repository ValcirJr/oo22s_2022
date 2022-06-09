package br.edu.utfpr.enums;

import java.math.BigDecimal;

public enum Tamanho {
    BROTO() {
        @Override
        public BigDecimal getValor() {
            return BigDecimal.valueOf(25);
        }
    },
    PEQUENO() {
        @Override
        public BigDecimal getValor() {
            return BigDecimal.valueOf(35);
        }
    },
    MEDIO() {
        @Override
        public BigDecimal getValor() {
            return BigDecimal.valueOf(55);
        }
    },
    GRANDE() {
        @Override
        public BigDecimal getValor() {
            return BigDecimal.valueOf(70);
        }
    },
    FAMILIA() {
        @Override
        public BigDecimal getValor() {
            return BigDecimal.valueOf(100);
        }
    };

    public abstract BigDecimal getValor();
}
