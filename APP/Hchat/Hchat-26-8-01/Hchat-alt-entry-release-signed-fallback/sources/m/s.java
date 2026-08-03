package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum s extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m.s f8352g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m.s f8353h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m.s f8354i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ m.s[] f8355j = null;

    static {
            m.s r0 = new m.s
            java.lang.String r1 = "Yes"
            r2 = 0
            r0.<init>(r1, r2)
            m.s.f8352g = r0
            m.s r1 = new m.s
            java.lang.String r2 = "No"
            r3 = 1
            r1.<init>(r2, r3)
            m.s.f8353h = r1
            m.s r2 = new m.s
            java.lang.String r3 = "NotInitialized"
            r4 = 2
            r2.<init>(r3, r4)
            m.s.f8354i = r2
            m.s[] r0 = new m.s[]{r0, r1, r2}
            m.s.f8355j = r0
            return
    }

    public static m.s valueOf(java.lang.String r1) {
            java.lang.Class<m.s> r0 = m.s.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m.s r1 = (m.s) r1
            return r1
    }

    public static m.s[] values() {
            m.s[] r0 = m.s.f8355j
            java.lang.Object r0 = r0.clone()
            m.s[] r0 = (m.s[]) r0
            return r0
    }
}
