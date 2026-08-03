package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements w0.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0.a f14823g;

    public v() {
            r2 = this;
            r2.<init>()
            s0.a r0 = new s0.a
            r1 = 0
            r0.<init>(r1)
            r2.f14823g = r0
            return
    }

    public final boolean e(int r2) {
            r1 = this;
            s0.a r0 = r1.f14823g
            int r0 = r0.get()
            r2 = r2 & r0
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public final void f(int r4) {
            r3 = this;
        L0:
            s0.a r0 = r3.f14823g
            int r1 = r0.get()
            r2 = r1 & r4
            if (r2 == 0) goto Lb
            goto L13
        Lb:
            r2 = r1 | r4
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L0
        L13:
            return
    }
}
