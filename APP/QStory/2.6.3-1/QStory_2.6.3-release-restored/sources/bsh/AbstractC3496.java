package bsh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f8318 = Collections.unmodifiableMap(new HashMap<String, Class<?>>() { // from class: bsh.Types$Suffix$1
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
