package p000;

/* JADX INFO: renamed from: re */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0758re implements p000.g40 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.um1 f9351;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.InterfaceC0086bq f9352;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0795se f9353;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.g40 f9354;

    public C0758re(p000.um1 r1, p000.InterfaceC0086bq r2, p000.C0795se r3, p000.g40 r4) {
            r0 = this;
            r0.<init>()
            r0.f9351 = r1
            r0.f9352 = r2
            r0.f9353 = r3
            r0.f9354 = r4
            return
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r7, p000.InterfaceC0631op r8) {
            r6 = this;
            boolean r0 = r8 instanceof p000.C0721qe
            if (r0 == 0) goto L13
            r0 = r8
            qe r0 = (p000.C0721qe) r0
            int r1 = r0.f8981
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8981 = r1
            goto L18
        L13:
            qe r0 = new qe
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8979
            int r1 = r0.f8981
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            java.lang.Object r7 = r0.f8978
            re r6 = r0.f8977
            p000.i81.m2649(r8)
            goto L9c
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r6)
            r6 = 0
            return r6
        L31:
            p000.i81.m2649(r8)
            um1 r8 = r6.f9351
            java.lang.Object r8 = r8.f10912
            fo0 r8 = (p000.fo0) r8
            if (r8 == 0) goto L9c
            nf r1 = new nf
            java.lang.String r3 = "Child of the scoped flow was cancelled"
            r4 = 0
            r1.<init>(r3, r4)
            r8.mo2180(r1)
            r0.f8977 = r6
            r0.f8978 = r7
            r0.f8981 = r2
            r8.getClass()
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.fo0.f4052
            java.lang.Object r1 = r1.get(r8)
            boolean r3 = r1 instanceof p000.ml0
            s62 r4 = p000.s62.f9751
            if (r3 != 0) goto L65
            up r8 = r0.f8639
            r8.getClass()
            p000.AbstractC1021yh.m6848(r8)
            goto L97
        L65:
            int r1 = r8.m2177(r1)
            if (r1 < 0) goto L50
            ae r1 = new ae
            op r0 = p000.AbstractC0978xb.m6563(r0)
            r3 = 1
            r1.<init>(r3, r0)
            r1.m87()
            of r0 = new of
            r5 = 1
            r0.<init>(r5, r1)
            vt r8 = p000.AbstractC1021yh.m6866(r8, r3, r0)
            ud r0 = new ud
            r0.<init>(r3, r8)
            r1.m91(r0)
            java.lang.Object r8 = r1.m86()
            cq r0 = p000.EnumC0184cq.f2716
            if (r8 != r0) goto L93
            goto L94
        L93:
            r8 = r4
        L94:
            if (r8 != r0) goto L97
            r4 = r8
        L97:
            cq r8 = p000.EnumC0184cq.f2716
            if (r4 != r8) goto L9c
            return r8
        L9c:
            um1 r8 = r6.f9351
            bq r0 = r6.f9352
            pe r1 = new pe
            se r3 = r6.f9353
            g40 r6 = r6.f9354
            r4 = 0
            r1.<init>(r3, r6, r7, r4)
            xz1 r6 = p000.ln0.m3610(r0, r4, r1, r2)
            r8.f10912 = r6
            s62 r6 = p000.s62.f9751
            return r6
    }
}
