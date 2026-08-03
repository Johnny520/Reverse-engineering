package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8469b;

    public j0(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f8468a = r1
            r0.f8469b = r2
            return
    }

    public /* synthetic */ j0(int r3, int r4, int r5) {
            r2 = this;
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            r2.<init>(r3, r4)
            return
    }

    public abstract void a(h0.s r1, i0.a r2, l0.k r3, b5.i r4, m0.k0 r5);

    public l0.b b(h0.s r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            gg.f r0 = gg.v.a(r0)
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            return r0
    }
}
