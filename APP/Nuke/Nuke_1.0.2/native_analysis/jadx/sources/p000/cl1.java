package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl1 {

    /* JADX INFO: renamed from: h */
    public static final cl1 f1614h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cl1[] f1615i;

    static {
        cl1 cl1Var = new cl1("Default", 0);
        f1614h = cl1Var;
        f1615i = new cl1[]{cl1Var, new cl1("UserInput", 1), new cl1("PreventUserInput", 2)};
    }

    public static cl1 valueOf(String str) {
        return (cl1) Enum.valueOf(cl1.class, str);
    }

    public static cl1[] values() {
        return (cl1[]) f1615i.clone();
    }
}
