package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 {
    public static final ua0 h;
    public static final ua0 i;
    public static final ua0 j;
    public static final ua0 k;
    public static final /* synthetic */ ua0[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ua0 ua0Var = new ua0("Up", 0);
        h = ua0Var;
        ua0 ua0Var2 = new ua0("Drag", 1);
        i = ua0Var2;
        ua0 ua0Var3 = new ua0("Timeout", 2);
        j = ua0Var3;
        ua0 ua0Var4 = new ua0("Cancel", 3);
        k = ua0Var4;
        l = new ua0[]{ua0Var, ua0Var2, ua0Var3, ua0Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ua0 valueOf(String str) {
        return (ua0) Enum.valueOf(ua0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ua0[] values() {
        return (ua0[]) l.clone();
    }
}
