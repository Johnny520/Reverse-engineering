package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 {

    /* JADX INFO: renamed from: h */
    public static final rr0 f9716h;

    /* JADX INFO: renamed from: i */
    public static final rr0 f9717i;

    /* JADX INFO: renamed from: j */
    public static final rr0 f9718j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ rr0[] f9719k;

    static {
        rr0 rr0Var = new rr0("Cursor", 0);
        f9716h = rr0Var;
        rr0 rr0Var2 = new rr0("SelectionStart", 1);
        f9717i = rr0Var2;
        rr0 rr0Var3 = new rr0("SelectionEnd", 2);
        f9718j = rr0Var3;
        f9719k = new rr0[]{rr0Var, rr0Var2, rr0Var3};
    }

    public static rr0 valueOf(String str) {
        return (rr0) Enum.valueOf(rr0.class, str);
    }

    public static rr0[] values() {
        return (rr0[]) f9719k.clone();
    }
}
