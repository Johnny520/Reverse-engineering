package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements mg.a, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient mg.a f4548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f4549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Class f4550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f4551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f4552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4553l;

    public d(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f4549h = r1
            r0.f4550i = r2
            r0.f4551j = r3
            r0.f4552k = r4
            r0.f4553l = r5
            return
    }

    public abstract mg.a e();

    public final gg.e f() {
            r2 = this;
            boolean r0 = r2.f4553l
            java.lang.Class r1 = r2.f4550i
            if (r0 == 0) goto L11
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            gg.o r0 = new gg.o
            r0.<init>(r1)
            return r0
        L11:
            gg.f r0 = gg.v.a(r1)
            return r0
    }
}
