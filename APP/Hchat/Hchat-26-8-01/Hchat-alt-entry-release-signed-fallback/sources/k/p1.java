package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class p1 implements k.n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f7035a;

    public p1(android.widget.Magnifier r1) {
            r0 = this;
            r0.<init>()
            r0.f7035a = r1
            return
    }

    @Override // k.n1
    public void a(long r3, long r5) {
            r2 = this;
            android.widget.Magnifier r5 = r2.f7035a
            r6 = 32
            long r0 = r3 >> r6
            int r6 = (int) r0
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r5.show(r6, r3)
            return
    }

    public final void b() {
            r1 = this;
            android.widget.Magnifier r0 = r1.f7035a
            r0.dismiss()
            return
    }

    public final long c() {
            r6 = this;
            android.widget.Magnifier r0 = r6.f7035a
            int r0 = r0.getWidth()
            android.widget.Magnifier r1 = r6.f7035a
            int r1 = r1.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final void d() {
            r1 = this;
            android.widget.Magnifier r0 = r1.f7035a
            r0.update()
            return
    }
}
