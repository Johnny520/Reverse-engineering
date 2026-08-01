package com.google.gson;

import com.google.gson.internal.AbstractC3220;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p007.AbstractC6136;
import p259.C8244;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum ToNumberPolicy implements InterfaceC3246 {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3246
        public Double readNumber(C8244 c8244) {
            return Double.valueOf(c8244.m13781());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3246
        public Number readNumber(C8244 c8244) {
            return new LazilyParsedNumber(c8244.m13771());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, C8244 c8244) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!(c8244.f22811 == Strictness.LENIENT)) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c8244.m13789(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM11550 = AbstractC6136.m11550("Cannot parse ", str, "; at path ");
                sbM11550.append(c8244.m13789(true));
                throw new JsonParseException(sbM11550.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3246
        public Number readNumber(C8244 c8244) throws IOException {
            String strM13771 = c8244.m13771();
            if (strM13771.indexOf(46) >= 0) {
                return parseAsDouble(strM13771, c8244);
            }
            try {
                return Long.valueOf(Long.parseLong(strM13771));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(strM13771, c8244);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.InterfaceC3246
        public BigDecimal readNumber(C8244 c8244) throws IOException {
            String strM13771 = c8244.m13771();
            try {
                return AbstractC3220.m7331(strM13771);
            } catch (NumberFormatException e) {
                StringBuilder sbM11550 = AbstractC6136.m11550("Cannot parse ", strM13771, "; at path ");
                sbM11550.append(c8244.m13789(true));
                throw new JsonParseException(sbM11550.toString(), e);
            }
        }
    };

    @Override // com.google.gson.InterfaceC3246
    public abstract /* synthetic */ Number readNumber(C8244 c8244);
}
