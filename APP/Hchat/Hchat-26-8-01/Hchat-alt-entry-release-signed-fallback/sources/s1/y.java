package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum y extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s1.y f12324g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s1.y f12325h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s1.y f12326i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ s1.y[] f12327j = null;

    static {
            s1.y r0 = new s1.y
            java.lang.String r1 = "Unknown"
            r2 = 0
            r0.<init>(r1, r2)
            s1.y.f12324g = r0
            s1.y r1 = new s1.y
            java.lang.String r2 = "Dispatching"
            r3 = 1
            r1.<init>(r2, r3)
            s1.y.f12325h = r1
            s1.y r2 = new s1.y
            java.lang.String r3 = "NotDispatching"
            r4 = 2
            r2.<init>(r3, r4)
            s1.y.f12326i = r2
            s1.y[] r0 = new s1.y[]{r0, r1, r2}
            s1.y.f12327j = r0
            return
    }

    public static s1.y valueOf(java.lang.String r1) {
            java.lang.Class<s1.y> r0 = s1.y.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            s1.y r1 = (s1.y) r1
            return r1
    }

    public static s1.y[] values() {
            s1.y[] r0 = s1.y.f12327j
            java.lang.Object r0 = r0.clone()
            s1.y[] r0 = (s1.y[]) r0
            return r0
    }
}
