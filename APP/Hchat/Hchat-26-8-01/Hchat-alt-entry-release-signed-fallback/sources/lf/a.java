package lf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.k f8025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.k f8026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf.b[] f8027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f8029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.util.HashMap f8030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.List f8031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f8032h;

    public a(ac.k r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f8025a = r1
            ac.k r1 = r1.g()
            r0.f8026b = r1
            lf.b[] r1 = new lf.b[r2]
            r0.f8027c = r1
            r0.f8028d = r3
            return
    }

    public final void a(lf.b r2, int r3) {
            r1 = this;
            boolean r0 = r2.f8037e
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f8037e = r0
            r2.f8039g = r3
            java.util.ArrayList r3 = r1.f8029e
            r3.add(r2)
            return
    }

    public final void b(lf.b r4, int r5) {
            r3 = this;
            int r0 = r4.f8033a
            lf.b[] r1 = r3.f8027c
            r2 = r1[r0]
            if (r2 == 0) goto Lb
            r3.a(r2, r5)
        Lb:
            r2 = 0
            r4.f8037e = r2
            r4.f8038f = r5
            r1[r0] = r4
            return
    }
}
