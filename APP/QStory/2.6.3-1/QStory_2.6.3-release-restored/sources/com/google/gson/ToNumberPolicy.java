package com.google.gson;

import com.google.gson.internal.AbstractC4053;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p025.AbstractC7012;
import p275.C9074;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum ToNumberPolicy implements InterfaceC4079 {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC4079
        public Double readNumber(C9074 c9074) {
            return Double.valueOf(c9074.m14358());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC4079
        public Number readNumber(C9074 c9074) {
            return new LazilyParsedNumber(c9074.m14348());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, C9074 c9074) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!(c9074.f23155 == Strictness.LENIENT)) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c9074.m14366(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM12144 = AbstractC7012.m12144("Cannot parse ", str, "; at path ");
                sbM12144.append(c9074.m14366(true));
                throw new JsonParseException(sbM12144.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC4079
        public Number readNumber(C9074 c9074) throws IOException {
            String strM14348 = c9074.m14348();
            if (strM14348.indexOf(46) >= 0) {
                return parseAsDouble(strM14348, c9074);
            }
            try {
                return Long.valueOf(Long.parseLong(strM14348));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(strM14348, c9074);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC4079
        public BigDecimal readNumber(C9074 c9074) throws IOException {
            String strM14348 = c9074.m14348();
            try {
                return AbstractC4053.m7877(strM14348);
            } catch (NumberFormatException e) {
                StringBuilder sbM12144 = AbstractC7012.m12144("Cannot parse ", strM14348, "; at path ");
                sbM12144.append(c9074.m14366(true));
                throw new JsonParseException(sbM12144.toString(), e);
            }
        }
    };

    @Override // com.google.gson.InterfaceC4079
    public abstract /* synthetic */ Number readNumber(C9074 c9074);
}
