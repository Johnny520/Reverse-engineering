package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements f1.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k.o0 f7027b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k.o0 f7028c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7029a;

    static {
            k.o0 r0 = new k.o0
            r1 = 0
            r0.<init>(r1)
            k.o0.f7027b = r0
            k.o0 r0 = new k.o0
            r1 = 1
            r0.<init>(r1)
            k.o0.f7028c = r0
            return
    }

    public /* synthetic */ o0(int r1) {
            r0 = this;
            r0.f7029a = r1
            r0.<init>()
            return
    }

    @Override // f1.r0
    public final f1.c0 a(long r6, u2.m r8, u2.c r9) {
            r5 = this;
            int r8 = r5.f7029a
            switch(r8) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            float r8 = k.y.f7111a
            int r8 = r9.G0(r8)
            float r8 = (float) r8
            f1.k0 r9 = new f1.k0
            e1.c r0 = new e1.c
            float r1 = -r8
            r2 = 32
            long r2 = r6 >> r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r8
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r7 = 0
            r0.<init>(r1, r7, r2, r6)
            r9.<init>(r0)
            return r9
        L2e:
            float r8 = k.y.f7111a
            int r8 = r9.G0(r8)
            float r8 = (float) r8
            f1.k0 r9 = new f1.k0
            e1.c r0 = new e1.c
            float r1 = -r8
            r2 = 32
            long r2 = r6 >> r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r8
            r7 = 0
            r0.<init>(r7, r1, r2, r6)
            r9.<init>(r0)
            return r9
    }
}
