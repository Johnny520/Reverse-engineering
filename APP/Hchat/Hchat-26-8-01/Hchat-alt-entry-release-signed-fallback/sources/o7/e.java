package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends k7.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k7.a[] f9569l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k7.a[] f9570k;

    static {
            r0 = 0
            k7.a[] r0 = new k7.a[r0]
            o7.e.f9569l = r0
            return
    }

    public e(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            k7.a[] r1 = o7.e.f9569l
            goto La
        L8:
            k7.a[] r1 = new k7.a[r1]
        La:
            r0.f9570k = r1
            return
    }

    @Override // k7.c
    public final k7.a[] L() {
            r1 = this;
            k7.a[] r0 = r1.f9570k
            return r0
    }

    @Override // k7.c
    public void N() {
            r0 = this;
            return
    }

    public final void P(int r2, k7.a r3) {
            r1 = this;
            k7.a[] r0 = r1.f9570k
            r0[r2] = r3
            r3.H(r2)
            r3.J(r1)
            return
    }
}
