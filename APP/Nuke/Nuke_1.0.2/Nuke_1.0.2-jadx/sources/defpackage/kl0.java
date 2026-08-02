package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 {
    public static final kl0 h;
    public static final kl0 i;
    public static final kl0 j;
    public static final /* synthetic */ kl0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        kl0 kl0Var = new kl0("Active", 0);
        h = kl0Var;
        kl0 kl0Var2 = new kl0("ActiveParent", 1);
        i = kl0Var2;
        kl0 kl0Var3 = new kl0("Captured", 2);
        kl0 kl0Var4 = new kl0("Inactive", 3);
        j = kl0Var4;
        k = new kl0[]{kl0Var, kl0Var2, kl0Var3, kl0Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kl0 valueOf(String str) {
        return (kl0) Enum.valueOf(kl0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kl0[] values() {
        return (kl0[]) k.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                c80.s();
                return false;
            }
        }
        return true;
    }
}
