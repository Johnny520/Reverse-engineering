package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface z extends i.k {
    @Override // i.k
    default i.n1 a(i.m1 r1) {
            r0 = this;
            hb.c r1 = new hb.c
            r1.<init>(r0)
            return r1
    }

    long b(float r1, float r2, float r3);

    float c(float r1, float r2, float r3, long r4);

    default float d(float r7, float r8, float r9) {
            r6 = this;
            long r4 = r6.b(r7, r8, r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            float r7 = r0.c(r1, r2, r3, r4)
            return r7
    }

    float e(float r1, float r2, float r3, long r4);
}
