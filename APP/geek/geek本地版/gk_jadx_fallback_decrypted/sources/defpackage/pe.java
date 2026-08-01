package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum pe extends java.lang.Enum {
    public static final defpackage.pe a = null;
    public static final /* synthetic */ defpackage.pe[] b = null;

    static {
            pe r0 = new pe
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.pe.a = r0
            pe r1 = new pe
            java.lang.String r2 = "UNDECIDED"
            r3 = 1
            r1.<init>(r2, r3)
            pe r2 = new pe
            java.lang.String r3 = "RESUMED"
            r4 = 2
            r2.<init>(r3, r4)
            pe[] r0 = new defpackage.pe[]{r0, r1, r2}
            defpackage.pe.b = r0
            return
    }

    public static defpackage.pe valueOf(java.lang.String r1) {
            java.lang.Class<pe> r0 = defpackage.pe.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pe r1 = (defpackage.pe) r1
            return r1
    }

    public static defpackage.pe[] values() {
            pe[] r0 = defpackage.pe.b
            java.lang.Object r0 = r0.clone()
            pe[] r0 = (defpackage.pe[]) r0
            return r0
    }
}
