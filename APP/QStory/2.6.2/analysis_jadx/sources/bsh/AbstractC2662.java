package bsh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f7971 = Collections.unmodifiableMap(new HashMap<String, Class<?>>() { // from class: bsh.Types$Suffix$1
        private static final long serialVersionUID = 1;

        {
            put("O", Byte.TYPE);
            put("S", Short.TYPE);
            put("I", Integer.TYPE);
            put("L", Long.TYPE);
            put("W", BigInteger.class);
            put("w", BigDecimal.class);
            put("d", Double.TYPE);
            put("f", Float.TYPE);
        }
    });
}
