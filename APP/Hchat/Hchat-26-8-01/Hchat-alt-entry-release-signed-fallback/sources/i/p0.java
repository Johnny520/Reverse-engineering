package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p0 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.p0 f5746g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i.p0[] f5747h = null;

    static {
            i.p0 r0 = new i.p0
            java.lang.String r1 = "Restart"
            r2 = 0
            r0.<init>(r1, r2)
            i.p0.f5746g = r0
            i.p0 r1 = new i.p0
            java.lang.String r2 = "Reverse"
            r3 = 1
            r1.<init>(r2, r3)
            i.p0[] r0 = new i.p0[]{r0, r1}
            i.p0.f5747h = r0
            return
    }

    public static i.p0 valueOf(java.lang.String r1) {
            java.lang.Class<i.p0> r0 = i.p0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i.p0 r1 = (i.p0) r1
            return r1
    }

    public static i.p0[] values() {
            i.p0[] r0 = i.p0.f5747h
            java.lang.Object r0 = r0.clone()
            i.p0[] r0 = (i.p0[]) r0
            return r0
    }
}
