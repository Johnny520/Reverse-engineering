package d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends oh.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile d.a f1882d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1883c;

    public a(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            d.a r2 = new d.a
            r0 = 1
            r2.<init>(r0)
            r1.f1883c = r2
            return
        Lf:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f1883c = r2
            d.b r2 = new d.b
            r0 = 0
            r2.<init>(r0)
            r0 = 4
            java.util.concurrent.Executors.newFixedThreadPool(r0, r2)
            return
    }
}
