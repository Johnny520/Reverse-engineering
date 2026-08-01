package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum pe extends Enum {
    public static final pe a = null;
    public static final /* synthetic */ pe[] b = null;

    static {
        pe r0 = new pe("COROUTINE_SUSPENDED", 0);
        a = r0;
        b = new pe[]{r0, new pe("UNDECIDED", 1), new pe("RESUMED", 2)};
    }

    public static pe valueOf(String r1) {
        return (pe) Enum.valueOf(pe.class, r1);
    }

    public static pe[] values() {
        return (pe[]) b.clone();
    }
}
