package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 {

    /* JADX INFO: renamed from: h */
    public static final ag2 f192h;

    /* JADX INFO: renamed from: i */
    public static final ag2 f193i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ ag2[] f194j;

    static {
        ag2 ag2Var = new ag2("INVALID_SCRIPT", 0);
        f192h = ag2Var;
        ag2 ag2Var2 = new ag2("DUPLICATE_ID", 1);
        f193i = ag2Var2;
        f194j = new ag2[]{ag2Var, ag2Var2};
    }

    public static ag2 valueOf(String str) {
        return (ag2) Enum.valueOf(ag2.class, str);
    }

    public static ag2[] values() {
        return (ag2[]) f194j.clone();
    }
}
