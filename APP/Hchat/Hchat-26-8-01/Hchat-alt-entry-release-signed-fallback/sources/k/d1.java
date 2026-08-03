package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d1 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k.d1 f6939g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k.d1 f6940h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k.d1[] f6941i = null;

    static {
            k.d1 r0 = new k.d1
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2)
            k.d1.f6939g = r0
            k.d1 r1 = new k.d1
            java.lang.String r2 = "UserInput"
            r3 = 1
            r1.<init>(r2, r3)
            k.d1.f6940h = r1
            k.d1 r2 = new k.d1
            java.lang.String r3 = "PreventUserInput"
            r4 = 2
            r2.<init>(r3, r4)
            k.d1[] r0 = new k.d1[]{r0, r1, r2}
            k.d1.f6941i = r0
            return
    }

    public static k.d1 valueOf(java.lang.String r1) {
            java.lang.Class<k.d1> r0 = k.d1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            k.d1 r1 = (k.d1) r1
            return r1
    }

    public static k.d1[] values() {
            k.d1[] r0 = k.d1.f6941i
            java.lang.Object r0 = r0.clone()
            k.d1[] r0 = (k.d1[]) r0
            return r0
    }
}
