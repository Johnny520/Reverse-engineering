package com.google.gson;

import com.google.gson.internal.AbstractC3221;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p009.AbstractC6183;
import p259.C8245;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum ToNumberPolicy implements InterfaceC3247 {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3247
        public Double readNumber(C8245 c8245) {
            return Double.valueOf(c8245.m13799());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3247
        public Number readNumber(C8245 c8245) {
            return new LazilyParsedNumber(c8245.m13789());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, C8245 c8245) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!(c8245.f22810 == Strictness.LENIENT)) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c8245.m13807(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM11585 = AbstractC6183.m11585("Cannot parse ", str, "; at path ");
                sbM11585.append(c8245.m13807(true));
                throw new JsonParseException(sbM11585.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3247
        public Number readNumber(C8245 c8245) throws IOException {
            String strM13789 = c8245.m13789();
            if (strM13789.indexOf(46) >= 0) {
                return parseAsDouble(strM13789, c8245);
            }
            try {
                return Long.valueOf(Long.parseLong(strM13789));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(strM13789, c8245);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3247
        public BigDecimal readNumber(C8245 c8245) throws IOException {
            String strM13789 = c8245.m13789();
            try {
                return AbstractC3221.m7318(strM13789);
            } catch (NumberFormatException e) {
                StringBuilder sbM11585 = AbstractC6183.m11585("Cannot parse ", strM13789, "; at path ");
                sbM11585.append(c8245.m13807(true));
                throw new JsonParseException(sbM11585.toString(), e);
            }
        }
    };

    @Override // com.google.gson.InterfaceC3247
    public abstract /* synthetic */ Number readNumber(C8245 c8245);
}
