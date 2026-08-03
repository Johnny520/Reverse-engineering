package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends yf.g implements gg.i {
    private final int arity;

    public h(wf.c r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 2
            r0.arity = r1
            return
    }

    @Override // gg.i
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // yf.a
    public java.lang.String toString() {
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
