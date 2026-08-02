package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class km2 {
    public static final km2 h;
    public static final km2 i;
    public static final /* synthetic */ km2[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        km2 km2Var = new km2("Inherit", 0);
        h = km2Var;
        km2 km2Var2 = new km2("SecureOn", 1);
        i = km2Var2;
        j = new km2[]{km2Var, km2Var2, new km2("SecureOff", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static km2 valueOf(String str) {
        return (km2) Enum.valueOf(km2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static km2[] values() {
        return (km2[]) j.clone();
    }
}
