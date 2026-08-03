package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i0.p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f6049c;

    public u(fg.a r2) {
            r1 = this;
            r0 = 1
            r1.f6048b = r0
            i0.e r0 = i0.e.f5870m
            r1.<init>(r2)
            r1.f6049c = r0
            return
    }

    public u(fg.l r3) {
            r2 = this;
            r0 = 0
            r2.f6048b = r0
            bi.c r0 = new bi.c
            r1 = 26
            r0.<init>(r1)
            r2.<init>(r0)
            i0.v r0 = new i0.v
            r0.<init>(r3)
            r2.f6049c = r0
            return
    }

    @Override // i0.p1
    public final i0.q1 a(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f6048b
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            i0.q1 r1 = new i0.q1
            if (r14 != 0) goto Lc
            r0 = 1
        La:
            r4 = r0
            goto Le
        Lc:
            r0 = 0
            goto La
        Le:
            java.lang.Object r0 = r13.f6049c
            r5 = r0
            i0.e r5 = (i0.e) r5
            r6 = 1
            r2 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L1a:
            r3 = r14
            i0.q1 r7 = new i0.q1
            if (r3 != 0) goto L22
            r14 = 1
        L20:
            r10 = r14
            goto L24
        L22:
            r14 = 0
            goto L20
        L24:
            r11 = 0
            r12 = 1
            r8 = r13
            r9 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
    }

    @Override // i0.p1
    public i0.p2 b() {
            r1 = this;
            int r0 = r1.f6048b
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            i0.p2 r0 = super.b()
            return r0
        La:
            java.lang.Object r0 = r1.f6049c
            i0.v r0 = (i0.v) r0
            return r0
    }
}
