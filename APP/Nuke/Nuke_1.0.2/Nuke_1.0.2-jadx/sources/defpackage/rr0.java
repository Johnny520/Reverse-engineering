package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 {
    public static final rr0 h;
    public static final rr0 i;
    public static final rr0 j;
    public static final /* synthetic */ rr0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        rr0 rr0Var = new rr0("Cursor", 0);
        h = rr0Var;
        rr0 rr0Var2 = new rr0("SelectionStart", 1);
        i = rr0Var2;
        rr0 rr0Var3 = new rr0("SelectionEnd", 2);
        j = rr0Var3;
        k = new rr0[]{rr0Var, rr0Var2, rr0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rr0 valueOf(String str) {
        return (rr0) Enum.valueOf(rr0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rr0[] values() {
        return (rr0[]) k.clone();
    }
}
