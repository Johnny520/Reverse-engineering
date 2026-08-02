package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l50 {

    /* JADX INFO: renamed from: a */
    public static final r60 f5937a;

    static {
        String property;
        r60 r60Var;
        int i = nx2.f7364a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            c60 c60Var = o90.f7590a;
            vr0 vr0Var = ie1.f4583a;
            vr0 vr0Var2 = vr0Var.f12144m;
            r60Var = vr0Var;
            if (vr0Var == null) {
                r60Var = k50.f5346q;
            }
        } else {
            r60Var = k50.f5346q;
        }
        f5937a = r60Var;
    }
}
