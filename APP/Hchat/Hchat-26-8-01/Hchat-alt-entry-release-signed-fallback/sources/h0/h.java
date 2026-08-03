package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum h extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0.h f4898g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h0.h f4899h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h0.h f4900i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h0.h[] f4901j = null;

    static {
            h0.h r0 = new h0.h
            java.lang.String r1 = "CROSSED"
            r2 = 0
            r0.<init>(r1, r2)
            h0.h.f4898g = r0
            h0.h r1 = new h0.h
            java.lang.String r2 = "NOT_CROSSED"
            r3 = 1
            r1.<init>(r2, r3)
            h0.h.f4899h = r1
            h0.h r2 = new h0.h
            java.lang.String r3 = "COLLAPSED"
            r4 = 2
            r2.<init>(r3, r4)
            h0.h.f4900i = r2
            h0.h[] r0 = new h0.h[]{r0, r1, r2}
            h0.h.f4901j = r0
            return
    }

    public static h0.h valueOf(java.lang.String r1) {
            java.lang.Class<h0.h> r0 = h0.h.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            h0.h r1 = (h0.h) r1
            return r1
    }

    public static h0.h[] values() {
            h0.h[] r0 = h0.h.f4901j
            java.lang.Object r0 = r0.clone()
            h0.h[] r0 = (h0.h[]) r0
            return r0
    }
}
