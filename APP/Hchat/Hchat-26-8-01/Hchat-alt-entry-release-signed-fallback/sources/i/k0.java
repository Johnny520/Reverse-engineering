package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum k0 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.k0 f5705g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i.k0[] f5706h = null;

    static {
            i.k0 r0 = new i.k0
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2)
            i.k0.f5705g = r0
            i.k0 r1 = new i.k0
            java.lang.String r2 = "UserInput"
            r3 = 1
            r1.<init>(r2, r3)
            i.k0 r2 = new i.k0
            java.lang.String r3 = "PreventUserInput"
            r4 = 2
            r2.<init>(r3, r4)
            i.k0[] r0 = new i.k0[]{r0, r1, r2}
            i.k0.f5706h = r0
            return
    }

    public static i.k0 valueOf(java.lang.String r1) {
            java.lang.Class<i.k0> r0 = i.k0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i.k0 r1 = (i.k0) r1
            return r1
    }

    public static i.k0[] values() {
            i.k0[] r0 = i.k0.f5706h
            java.lang.Object r0 = r0.clone()
            i.k0[] r0 = (i.k0[]) r0
            return r0
    }
}
