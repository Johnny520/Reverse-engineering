package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum h extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.h f5679g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.h f5680h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i.h[] f5681i = null;

    static {
            i.h r0 = new i.h
            java.lang.String r1 = "BoundReached"
            r2 = 0
            r0.<init>(r1, r2)
            i.h.f5679g = r0
            i.h r1 = new i.h
            java.lang.String r2 = "Finished"
            r3 = 1
            r1.<init>(r2, r3)
            i.h.f5680h = r1
            i.h[] r0 = new i.h[]{r0, r1}
            i.h.f5681i = r0
            return
    }

    public static i.h valueOf(java.lang.String r1) {
            java.lang.Class<i.h> r0 = i.h.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i.h r1 = (i.h) r1
            return r1
    }

    public static i.h[] values() {
            i.h[] r0 = i.h.f5681i
            java.lang.Object r0 = r0.clone()
            i.h[] r0 = (i.h[]) r0
            return r0
    }
}
