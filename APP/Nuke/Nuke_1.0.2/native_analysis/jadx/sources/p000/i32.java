package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i32 {

    /* JADX INFO: renamed from: h */
    public static final i32 f4251h;

    /* JADX INFO: renamed from: i */
    public static final i32 f4252i;

    /* JADX INFO: renamed from: j */
    public static final i32 f4253j;

    /* JADX INFO: renamed from: k */
    public static final i32 f4254k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ i32[] f4255l;

    static {
        i32 i32Var = new i32("IMMEDIATE", 0);
        f4251h = i32Var;
        i32 i32Var2 = new i32("HIGH", 1);
        f4252i = i32Var2;
        i32 i32Var3 = new i32(hx0.NORMAL, 2);
        f4253j = i32Var3;
        i32 i32Var4 = new i32("LOW", 3);
        f4254k = i32Var4;
        f4255l = new i32[]{i32Var, i32Var2, i32Var3, i32Var4};
    }

    public static i32 valueOf(String str) {
        return (i32) Enum.valueOf(i32.class, str);
    }

    public static i32[] values() {
        return (i32[]) f4255l.clone();
    }
}
