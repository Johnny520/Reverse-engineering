package m9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m9.c f8790h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m9.c f8791i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ m9.c[] f8792j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8793g;

    static {
            m9.c r0 = new m9.c
            java.lang.String r1 = "RPS"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            m9.c.f8790h = r0
            m9.c r1 = new m9.c
            java.lang.String r2 = "DICE"
            r4 = 2
            r1.<init>(r2, r3, r4)
            m9.c.f8791i = r1
            m9.c[] r0 = new m9.c[]{r0, r1}
            m9.c.f8792j = r0
            return
    }

    c(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f8793g = r3
            return
    }

    public static m9.c valueOf(java.lang.String r1) {
            java.lang.Class<m9.c> r0 = m9.c.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            m9.c r1 = (m9.c) r1
            return r1
    }

    public static m9.c[] values() {
            m9.c[] r0 = m9.c.f8792j
            java.lang.Object r0 = r0.clone()
            m9.c[] r0 = (m9.c[]) r0
            return r0
    }
}
