package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface l2 {
    long a();

    long b();

    default float c() {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            return r0
    }

    default long d() {
            r2 = this;
            r0 = 48
            float r0 = (float) r0
            long r0 = g4.a.d(r0, r0)
            return r0
    }

    default float e() {
            r1 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            return r0
    }

    float f();

    default float g() {
            r1 = this;
            r0 = 1098907648(0x41800000, float:16.0)
            return r0
    }
}
