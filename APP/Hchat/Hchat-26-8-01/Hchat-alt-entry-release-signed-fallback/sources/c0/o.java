package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum o extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0.o f969g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0.o f970h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0.o f971i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c0.o[] f972j = null;

    static {
            c0.o r0 = new c0.o
            java.lang.String r1 = "Uninitialized"
            r2 = 0
            r0.<init>(r1, r2)
            c0.o.f969g = r0
            c0.o r1 = new c0.o
            java.lang.String r2 = "Detached"
            r3 = 1
            r1.<init>(r2, r3)
            c0.o.f970h = r1
            c0.o r2 = new c0.o
            java.lang.String r3 = "Attached"
            r4 = 2
            r2.<init>(r3, r4)
            c0.o.f971i = r2
            c0.o[] r0 = new c0.o[]{r0, r1, r2}
            c0.o.f972j = r0
            return
    }

    public static c0.o valueOf(java.lang.String r1) {
            java.lang.Class<c0.o> r0 = c0.o.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            c0.o r1 = (c0.o) r1
            return r1
    }

    public static c0.o[] values() {
            c0.o[] r0 = c0.o.f972j
            java.lang.Object r0 = r0.clone()
            c0.o[] r0 = (c0.o[]) r0
            return r0
    }
}
