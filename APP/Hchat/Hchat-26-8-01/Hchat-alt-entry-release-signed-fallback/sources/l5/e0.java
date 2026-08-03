package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends l5.a0 implements t5.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7860d;

    public e0(k5.u r2, int r3) {
            r1 = this;
            f5.f r0 = f5.f.f3286t
            r1.<init>(r2, r0, r3)
            androidx.lifecycle.x r2 = r2.f7264b
            int r3 = r3 + 2
            int r2 = r2.P(r3)
            r1.f7860d = r2
            return
    }

    @Override // l5.a0, t5.d
    public final int c() {
            r1 = this;
            int r0 = r1.f7860d
            int r0 = r0 * 4
            int r0 = r0 + 2
            return r0
    }

    @Override // t5.j
    public final java.util.List s() {
            r1 = this;
            l5.d0 r0 = new l5.d0
            r0.<init>(r1)
            return r0
    }
}
