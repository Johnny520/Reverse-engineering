package p000;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0747r3 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public p000.C0904vc f9242;

    /* JADX INFO: renamed from: κ */
    public int f9243;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f9244;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.InterfaceC0546me f9245;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.C0609o3 f9246;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ p000.g21 f9247;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ p000.g21 f9248;

    public C0747r3(p000.InterfaceC0546me r1, p000.C0609o3 r2, p000.g21 r3, p000.g21 r4, p000.InterfaceC0631op r5) {
            r0 = this;
            r0.f9245 = r1
            r0.f9246 = r2
            r0.f9247 = r3
            r0.f9248 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            bq r1 = (p000.InterfaceC0086bq) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            r3 r0 = (p000.C0747r3) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r7, java.lang.Object r8) {
            r6 = this;
            r3 r0 = new r3
            g21 r3 = r6.f9247
            g21 r4 = r6.f9248
            me r1 = r6.f9245
            o3 r2 = r6.f9246
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f9244 = r8
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f9243
            me r1 = r14.f9245
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L13
            vc r0 = r14.f9242
            java.lang.Object r3 = r14.f9244
            bq r3 = (p000.InterfaceC0086bq) r3
            p000.i81.m2649(r15)
            goto L35
        L13:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r14)
            r14 = 0
            return r14
        L1a:
            p000.i81.m2649(r15)
            java.lang.Object r15 = r14.f9244
            bq r15 = (p000.InterfaceC0086bq) r15
            vc r0 = r1.iterator()
            r3 = r15
        L26:
            r14.f9244 = r3
            r14.f9242 = r0
            r14.f9243 = r2
            java.lang.Object r15 = r0.m6166(r14)
            cq r4 = p000.EnumC0184cq.f2716
            if (r15 != r4) goto L35
            return r4
        L35:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L63
            java.lang.Object r15 = r0.m6167()
            java.lang.Object r4 = r1.mo3816()
            boolean r5 = r4 instanceof p000.C0869ue
            r6 = 0
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r6
        L4c:
            if (r4 != 0) goto L50
            r8 = r15
            goto L51
        L50:
            r8 = r4
        L51:
            q3 r7 = new q3
            r12 = 0
            r13 = 0
            o3 r9 = r14.f9246
            g21 r10 = r14.f9247
            g21 r11 = r14.f9248
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15 = 3
            p000.ln0.m3610(r3, r6, r7, r15)
            goto L26
        L63:
            s62 r14 = p000.s62.f9751
            return r14
    }
}
