package p000;

/* JADX INFO: renamed from: ig */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0312ig {

    /* JADX INFO: renamed from: a */
    public static final int f4602a;

    static {
        Object x92Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            x92Var = property != null ? wv2.m6013e0(property) : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Integer num = (Integer) (x92Var instanceof x92 ? null : x92Var);
        f4602a = num != null ? num.intValue() : 2097152;
    }
}
