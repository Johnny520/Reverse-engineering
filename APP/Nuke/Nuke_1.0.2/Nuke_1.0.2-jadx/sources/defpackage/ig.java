package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig {
    public static final int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object x92Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            x92Var = property != null ? wv2.e0(property) : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Integer num = (Integer) (x92Var instanceof x92 ? null : x92Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
