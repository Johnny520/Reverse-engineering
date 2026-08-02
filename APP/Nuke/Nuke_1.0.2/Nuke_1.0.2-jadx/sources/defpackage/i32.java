package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i32 {
    public static final i32 h;
    public static final i32 i;
    public static final i32 j;
    public static final i32 k;
    public static final /* synthetic */ i32[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        i32 i32Var = new i32("IMMEDIATE", 0);
        h = i32Var;
        i32 i32Var2 = new i32("HIGH", 1);
        i = i32Var2;
        i32 i32Var3 = new i32(hx0.NORMAL, 2);
        j = i32Var3;
        i32 i32Var4 = new i32("LOW", 3);
        k = i32Var4;
        l = new i32[]{i32Var, i32Var2, i32Var3, i32Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i32 valueOf(String str) {
        return (i32) Enum.valueOf(i32.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i32[] values() {
        return (i32[]) l.clone();
    }
}
