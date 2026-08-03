package jg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends jg.d {
    @Override // jg.d
    public final int a(int r3) {
            r2 = this;
            java.util.Random r0 = r2.f()
            int r0 = r0.nextInt()
            int r1 = 32 - r3
            int r0 = r0 >>> r1
            int r3 = -r3
            int r3 = r3 >> 31
            r3 = r3 & r0
            return r3
    }

    @Override // jg.d
    public final int b() {
            r1 = this;
            java.util.Random r0 = r1.f()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // jg.d
    public final long d() {
            r2 = this;
            java.util.Random r0 = r2.f()
            long r0 = r0.nextLong()
            return r0
    }

    public abstract java.util.Random f();

    public final int g(int r2) {
            r1 = this;
            java.util.Random r0 = r1.f()
            int r2 = r0.nextInt(r2)
            return r2
    }
}
