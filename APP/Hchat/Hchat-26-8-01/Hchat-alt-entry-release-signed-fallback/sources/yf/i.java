package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends yf.c implements gg.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22439g;

    public i(int r1, wf.c r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f22439g = r1
            return
    }

    @Override // gg.i
    public final int getArity() {
            r1 = this;
            int r0 = r1.f22439g
            return r0
    }

    @Override // yf.a
    public final java.lang.String toString() {
            r1 = this;
            wf.c r0 = r1.getCompletion()
            if (r0 != 0) goto L10
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            java.lang.String r0 = gg.w.a(r1)
            return r0
        L10:
            java.lang.String r0 = super.toString()
            return r0
    }
}
