package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends l5.a0 implements t5.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7857d;

    public c0(k5.u r2, int r3) {
            r1 = this;
            f5.f r0 = f5.f.f3285s
            r1.<init>(r2, r0, r3)
            androidx.lifecycle.x r2 = r2.f7264b
            int r3 = r3 + 2
            int r2 = r2.P(r3)
            r1.f7857d = r2
            return
    }

    @Override // l5.a0, t5.d
    public final int c() {
            r1 = this;
            int r0 = r1.f7857d
            int r0 = r0 * 2
            int r0 = r0 + 4
            return r0
    }

    @Override // t5.j
    public final java.util.List s() {
            r3 = this;
            k5.u r0 = r3.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r3.f7849c
            int r1 = r1 + 4
            int r0 = r0.J(r1)
            k5.r r1 = new k5.r
            r2 = 1
            r1.<init>(r0, r2, r3)
            return r1
    }
}
