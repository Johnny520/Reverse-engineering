package p215oc;

/* JADX INFO: renamed from: oc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5716k implements InterfaceC5718m {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5728w f18039q;

    /* JADX INFO: renamed from: r */
    public final C5708d f18040r;

    /* JADX INFO: renamed from: s */
    public C5721p f18041s;

    /* JADX INFO: renamed from: t */
    public int f18042t;

    /* JADX INFO: renamed from: u */
    public boolean f18043u;

    /* JADX INFO: renamed from: v */
    public long f18044v;

    public C5716k(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        this.f18039q = interfaceC5728w;
        C5708d c5708dMo23102b = interfaceC5728w.mo23102b();
        this.f18040r = c5708dMo23102b;
        this.f18041s = c5708dMo23102b.m23109h();
        C5721p c5721pM23109h = c5708dMo23102b.m23109h();
        this.f18042t = c5721pM23109h != null ? c5721pM23109h.m23146f() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r3 == r4.m23146f()) goto L16;
     */
    @Override // p215oc.InterfaceC5718m
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo23100N(p215oc.C5708d r7, long r8) {
        /*
            r6 = this;
            r7.getClass()
            boolean r0 = r6.f18043u
            if (r0 != 0) goto L8e
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L86
            oc.p r3 = r6.f18041s
            if (r3 == 0) goto L33
            oc.d r4 = r6.f18040r
            oc.p r4 = r4.m23109h()
            if (r3 != r4) goto L2b
            int r3 = r6.f18042t
            oc.d r4 = r6.f18040r
            oc.p r4 = r4.m23109h()
            r4.getClass()
            int r4 = r4.m23146f()
            if (r3 != r4) goto L2b
            goto L33
        L2b:
            java.lang.String r7 = "Peek source is invalid because upstream source was used"
            p376zd.C10010p0.m38820a(r7)
        L30:
            r7 = 0
            return r7
        L33:
            if (r2 != 0) goto L36
            return r0
        L36:
            oc.w r0 = r6.f18039q
            long r1 = r6.f18044v
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo23110i(r1)
            if (r0 != 0) goto L46
            r7 = -1
            return r7
        L46:
            oc.p r0 = r6.f18041s
            if (r0 != 0) goto L69
            oc.d r0 = r6.f18040r
            oc.p r0 = r0.m23109h()
            if (r0 == 0) goto L69
            oc.d r0 = r6.f18040r
            oc.p r0 = r0.m23109h()
            r6.f18041s = r0
            oc.d r0 = r6.f18040r
            oc.p r0 = r0.m23109h()
            r0.getClass()
            int r0 = r0.m23146f()
            r6.f18042t = r0
        L69:
            oc.d r0 = r6.f18040r
            long r0 = r0.m23111j()
            long r2 = r6.f18044v
            long r0 = r0 - r2
            long r8 = java.lang.Math.min(r8, r0)
            oc.d r0 = r6.f18040r
            long r2 = r6.f18044v
            long r4 = r2 + r8
            r1 = r7
            r0.m23105e(r1, r2, r4)
            long r0 = r6.f18044v
            long r0 = r0 + r8
            r6.f18044v = r0
            return r8
        L86:
            java.lang.String r7 = "byteCount ("
            java.lang.String r0 = ") < 0"
            p215oc.C5702a.m23079a(r7, r8, r0)
            goto L30
        L8e:
            java.lang.String r7 = "Source is closed."
            p376zd.C10010p0.m38820a(r7)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: p215oc.C5716k.mo23100N(oc.d, long):long");
    }

    @Override // p215oc.InterfaceC5718m, java.lang.AutoCloseable, p215oc.InterfaceC5717l
    public void close() {
        this.f18043u = true;
    }
}
