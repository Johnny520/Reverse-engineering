package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.o2 f8273a;

    public m2(m.o2 r1) {
            r0 = this;
            r0.<init>()
            r0.f8273a = r1
            return
    }

    public final long a(int r4, long r5) {
            r3 = this;
            m.o2 r0 = r3.f8273a
            r0.f8314j = r4
            k.k1 r1 = r0.f8306b
            if (r1 == 0) goto L21
            m.i2 r2 = r0.f8305a
            boolean r2 = r2.d()
            if (r2 != 0) goto L18
            m.i2 r2 = r0.f8305a
            boolean r2 = r2.c()
            if (r2 == 0) goto L21
        L18:
            int r4 = r0.f8314j
            b0.d0 r0 = r0.f8317m
            long r4 = r1.b(r5, r4, r0)
            return r4
        L21:
            m.u1 r1 = r0.f8315k
            long r4 = r0.c(r1, r5, r4)
            return r4
    }
}
