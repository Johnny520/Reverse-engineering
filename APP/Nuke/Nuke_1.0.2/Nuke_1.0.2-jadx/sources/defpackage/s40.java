package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 {
    public static final s40 h;
    public static final s40 i;
    public static final s40 j;
    public static final /* synthetic */ s40[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        s40 s40Var = new s40("PREFER_ARGB_8888", 0);
        h = s40Var;
        s40 s40Var2 = new s40("PREFER_RGB_565", 1);
        i = s40Var2;
        k = new s40[]{s40Var, s40Var2};
        j = s40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s40 valueOf(String str) {
        return (s40) Enum.valueOf(s40.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s40[] values() {
        return (s40[]) k.clone();
    }
}
