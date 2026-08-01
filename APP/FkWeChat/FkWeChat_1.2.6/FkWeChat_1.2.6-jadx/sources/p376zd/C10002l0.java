package p376zd;

/* JADX INFO: renamed from: zd.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10002l0 implements InterfaceC10024w0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC9999k f33576q;

    /* JADX INFO: renamed from: r */
    public final C9995i f33577r;

    /* JADX INFO: renamed from: s */
    public C10012q0 f33578s;

    /* JADX INFO: renamed from: t */
    public int f33579t;

    /* JADX INFO: renamed from: u */
    public boolean f33580u;

    /* JADX INFO: renamed from: v */
    public long f33581v;

    public C10002l0(InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        this.f33576q = interfaceC9999k;
        C9995i c9995iMo38699b = interfaceC9999k.mo38699b();
        this.f33577r = c9995iMo38699b;
        C10012q0 c10012q0 = c9995iMo38699b.f33561q;
        this.f33578s = c10012q0;
        this.f33579t = c10012q0 != null ? c10012q0.f33617b : -1;
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33580u = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r4.f33617b) goto L16;
     */
    @Override // p376zd.InterfaceC10024w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(p376zd.C9995i r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L70
            boolean r3 = r8.f33580u
            if (r3 != 0) goto L6a
            zd.q0 r3 = r8.f33578s
            if (r3 == 0) goto L29
            zd.i r4 = r8.f33577r
            zd.q0 r4 = r4.f33561q
            if (r3 != r4) goto L21
            int r3 = r8.f33579t
            r4.getClass()
            int r4 = r4.f33617b
            if (r3 != r4) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            p376zd.C10010p0.m38820a(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            zd.k r0 = r8.f33576q
            long r1 = r8.f33581v
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo38710i(r1)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            zd.q0 r0 = r8.f33578s
            if (r0 != 0) goto L4f
            zd.i r0 = r8.f33577r
            zd.q0 r0 = r0.f33561q
            if (r0 == 0) goto L4f
            r8.f33578s = r0
            r0.getClass()
            int r0 = r0.f33617b
            r8.f33579t = r0
        L4f:
            zd.i r0 = r8.f33577r
            long r0 = r0.size()
            long r2 = r8.f33581v
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            zd.i r2 = r8.f33577r
            long r4 = r8.f33581v
            r3 = r9
            r2.m38712j(r3, r4, r6)
            long r9 = r8.f33581v
            long r9 = r9 + r6
            r8.f33581v = r9
            return r6
        L6a:
            java.lang.String r9 = "closed"
            p376zd.C10010p0.m38820a(r9)
            goto L26
        L70:
            java.lang.String r9 = "byteCount < 0: "
            p376zd.C9991g.m38662a(r9, r10)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: p376zd.C10002l0.read(zd.i, long):long");
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return this.f33576q.timeout();
    }
}
