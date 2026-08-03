package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum t extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0.t f4992g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h0.t[] f4993h = null;

    static {
            h0.t r0 = new h0.t
            java.lang.String r1 = "EditableText"
            r2 = 0
            r0.<init>(r1, r2)
            h0.t.f4992g = r0
            h0.t r1 = new h0.t
            java.lang.String r2 = "StaticText"
            r3 = 1
            r1.<init>(r2, r3)
            h0.t[] r0 = new h0.t[]{r0, r1}
            h0.t.f4993h = r0
            return
    }

    public static h0.t valueOf(java.lang.String r1) {
            java.lang.Class<h0.t> r0 = h0.t.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            h0.t r1 = (h0.t) r1
            return r1
    }

    public static h0.t[] values() {
            h0.t[] r0 = h0.t.f4993h
            java.lang.Object r0 = r0.clone()
            h0.t[] r0 = (h0.t[]) r0
            return r0
    }
}
