package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l50 {
    public static final r60 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        r60 r60Var;
        int i = nx2.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            c60 c60Var = o90.a;
            vr0 vr0Var = ie1.a;
            vr0 vr0Var2 = vr0Var.m;
            r60Var = vr0Var;
            if (vr0Var == null) {
                r60Var = k50.q;
            }
        } else {
            r60Var = k50.q;
        }
        a = r60Var;
    }
}
