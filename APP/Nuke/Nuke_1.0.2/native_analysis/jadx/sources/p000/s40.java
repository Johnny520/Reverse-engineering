package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 {

    /* JADX INFO: renamed from: h */
    public static final s40 f9902h;

    /* JADX INFO: renamed from: i */
    public static final s40 f9903i;

    /* JADX INFO: renamed from: j */
    public static final s40 f9904j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ s40[] f9905k;

    static {
        s40 s40Var = new s40("PREFER_ARGB_8888", 0);
        f9902h = s40Var;
        s40 s40Var2 = new s40("PREFER_RGB_565", 1);
        f9903i = s40Var2;
        f9905k = new s40[]{s40Var, s40Var2};
        f9904j = s40Var;
    }

    public static s40 valueOf(String str) {
        return (s40) Enum.valueOf(s40.class, str);
    }

    public static s40[] values() {
        return (s40[]) f9905k.clone();
    }
}
