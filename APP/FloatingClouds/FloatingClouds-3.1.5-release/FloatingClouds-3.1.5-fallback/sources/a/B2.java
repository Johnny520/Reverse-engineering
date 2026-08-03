package a;

/* JADX INFO: loaded from: classes.dex */
public enum B2 extends java.lang.Enum<a.B2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.B2 f22a = null;
    public static final /* synthetic */ a.B2[] b = null;

    static {
            a.B2 r0 = new a.B2
            java.lang.String r1 = "NORMAL"
            r2 = 0
            r0.<init>(r1, r2)
            a.B2.f22a = r0
            a.B2 r1 = new a.B2
            java.lang.String r2 = "BYPASS"
            r3 = 1
            r1.<init>(r2, r3)
            a.B2 r2 = new a.B2
            java.lang.String r3 = "FORCE_RESCAN"
            r4 = 2
            r2.<init>(r3, r4)
            a.B2[] r0 = new a.B2[]{r0, r1, r2}
            a.B2.b = r0
            return
    }

    B2() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static a.B2 valueOf(java.lang.String r1) {
            java.lang.Class<a.B2> r0 = a.B2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a.B2 r1 = (a.B2) r1
            return r1
    }

    public static a.B2[] values() {
            a.B2[] r0 = a.B2.b
            java.lang.Object r0 = r0.clone()
            a.B2[] r0 = (a.B2[]) r0
            return r0
    }
}
