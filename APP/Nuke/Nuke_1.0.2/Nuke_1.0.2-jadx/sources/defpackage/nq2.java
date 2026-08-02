package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 {
    public static final nq2 h;
    public static final nq2 i;
    public static final nq2 j;
    public static final /* synthetic */ nq2[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        nq2 nq2Var = new nq2("START", 0);
        h = nq2Var;
        nq2 nq2Var2 = new nq2("STOP", 1);
        i = nq2Var2;
        nq2 nq2Var3 = new nq2("STOP_AND_RESET_REPLAY_CACHE", 2);
        j = nq2Var3;
        k = new nq2[]{nq2Var, nq2Var2, nq2Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nq2 valueOf(String str) {
        return (nq2) Enum.valueOf(nq2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nq2[] values() {
        return (nq2[]) k.clone();
    }
}
