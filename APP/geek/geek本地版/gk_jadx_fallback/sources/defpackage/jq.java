package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum jq extends java.lang.Enum {
    public static final defpackage.jq a = null;
    public static final defpackage.jq b = null;
    public static final defpackage.jq c = null;
    public static final defpackage.jq d = null;
    public static final defpackage.jq e = null;
    public static final /* synthetic */ defpackage.jq[] f = null;

    static {
            jq r0 = new jq
            java.lang.String r1 = "DESTROYED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.jq.a = r0
            jq r1 = new jq
            java.lang.String r2 = "INITIALIZED"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.jq.b = r1
            jq r2 = new jq
            java.lang.String r3 = "CREATED"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.jq.c = r2
            jq r3 = new jq
            java.lang.String r4 = "STARTED"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.jq.d = r3
            jq r4 = new jq
            java.lang.String r5 = "RESUMED"
            r6 = 4
            r4.<init>(r5, r6)
            defpackage.jq.e = r4
            jq[] r0 = new defpackage.jq[]{r0, r1, r2, r3, r4}
            defpackage.jq.f = r0
            return
    }

    public static defpackage.jq valueOf(java.lang.String r1) {
            java.lang.Class<jq> r0 = defpackage.jq.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jq r1 = (defpackage.jq) r1
            return r1
    }

    public static defpackage.jq[] values() {
            jq[] r0 = defpackage.jq.f
            java.lang.Object r0 = r0.clone()
            jq[] r0 = (defpackage.jq[]) r0
            return r0
    }
}
