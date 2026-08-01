package p000;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0455k3 implements p000.InterfaceC0806sp {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5721;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f5722;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f5723;

    public C0455k3(android.view.Choreographer r2, p000.C0345h3 r3) {
            r1 = this;
            r0 = 0
            r1.f5721 = r0
            r1.<init>()
            r1.f5722 = r2
            r1.f5723 = r3
            return
    }

    public C0455k3(p000.dl1 r2) {
            r1 = this;
            r0 = 1
            r1.f5721 = r0
            r1.<init>()
            r1.f5722 = r2
            b8 r2 = new b8
            r0 = 0
            r2.<init>(r0)
            r1.f5723 = r2
            return
    }

    public C0455k3(p000.C0455k3 r2) {
            r1 = this;
            r0 = 2
            r1.f5721 = r0
            r1.<init>()
            r1.f5722 = r2
            zz r2 = new zz
            r2.<init>()
            r1.f5723 = r2
            return
    }

    @Override // p000.InterfaceC0806sp
    public p000.InterfaceC0843tp getKey() {
            r0 = this;
            xn0 r0 = p000.xn0.f12227
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m3139(p000.a80 r7, p000.AbstractC0695pp r8) {
            r6 = this;
            int r0 = r6.f5721
            switch(r0) {
                case 0: goto Lc5;
                case 1: goto L95;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof p000.aa1
            if (r0 == 0) goto L18
            r0 = r8
            aa1 r0 = (p000.aa1) r0
            int r1 = r0.f163
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f163 = r1
            goto L1d
        L18:
            aa1 r0 = new aa1
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f161
            cq r1 = p000.EnumC0184cq.f2716
            int r2 = r0.f163
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            p000.i81.m2649(r8)
            goto L8e
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r6)
            r8 = 0
            goto L8e
        L36:
            a80 r7 = r0.f160
            p000.i81.m2649(r8)
            goto L7e
        L3c:
            p000.i81.m2649(r8)
            java.lang.Object r8 = r6.f5723
            zz r8 = (p000.C1076zz) r8
            r0.f160 = r7
            r0.f163 = r4
            java.lang.Object r2 = r8.f13380
            monitor-enter(r2)
            boolean r5 = r8.f13379     // Catch: java.lang.Throwable -> L92
            monitor-exit(r2)
            if (r5 == 0) goto L52
            s62 r8 = p000.s62.f9751
            goto L7b
        L52:
            ae r2 = new ae
            op r5 = p000.AbstractC0978xb.m6563(r0)
            r2.<init>(r4, r5)
            r2.m87()
            java.lang.Object r4 = r8.f13380
            monitor-enter(r4)
            java.lang.Object r5 = r8.f13381     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8f
            r5.add(r2)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r4)
            xv r4 = new xv
            r5 = 2
            r4.<init>(r8, r5, r2)
            r2.m89(r4)
            java.lang.Object r8 = r2.m86()
            if (r8 != r1) goto L79
            goto L7b
        L79:
            s62 r8 = p000.s62.f9751
        L7b:
            if (r8 != r1) goto L7e
            goto L8d
        L7e:
            java.lang.Object r6 = r6.f5722
            k3 r6 = (p000.C0455k3) r6
            r8 = 0
            r0.f160 = r8
            r0.f163 = r3
            java.lang.Object r8 = r6.m3139(r7, r0)
            if (r8 != r1) goto L8e
        L8d:
            r8 = r1
        L8e:
            return r8
        L8f:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L92:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L95:
            ae r0 = new ae
            op r8 = p000.AbstractC0978xb.m6563(r8)
            r1 = 1
            r0.<init>(r1, r8)
            r0.m87()
            java.lang.Object r8 = r6.f5723
            b8 r8 = (p000.C0068b8) r8
            nc r1 = new nc
            r1.<init>()
            r1.f7511 = r0
            r1.f7512 = r7
            java.lang.Object r6 = r6.f5722
            dl1 r6 = (p000.dl1) r6
            be r6 = r8.m810(r1, r6)
            oc r7 = new oc
            r8 = 0
            r7.<init>(r8, r6)
            r0.m89(r7)
            java.lang.Object r6 = r0.m86()
            return r6
        Lc5:
            java.lang.Object r0 = r6.f5723
            h3 r0 = (p000.C0345h3) r0
            ae r1 = new ae
            op r8 = p000.AbstractC0978xb.m6563(r8)
            r2 = 1
            r1.<init>(r2, r8)
            r1.m87()
            j3 r8 = new j3
            r8.<init>(r1, r6, r7)
            android.view.Choreographer r7 = r0.f4546
            java.lang.Object r3 = r6.f5722
            android.view.Choreographer r3 = (android.view.Choreographer) r3
            boolean r7 = p000.ln0.m3626(r7, r3)
            if (r7 == 0) goto L10c
            java.lang.Object r6 = r0.f4548
            monitor-enter(r6)
            java.util.ArrayList r7 = r0.f4550     // Catch: java.lang.Throwable -> Lfd
            r7.add(r8)     // Catch: java.lang.Throwable -> Lfd
            boolean r7 = r0.f4553     // Catch: java.lang.Throwable -> Lfd
            if (r7 != 0) goto Lff
            r0.f4553 = r2     // Catch: java.lang.Throwable -> Lfd
            android.view.Choreographer r7 = r0.f4546     // Catch: java.lang.Throwable -> Lfd
            g3 r2 = r0.f4554     // Catch: java.lang.Throwable -> Lfd
            r7.postFrameCallback(r2)     // Catch: java.lang.Throwable -> Lfd
            goto Lff
        Lfd:
            r7 = move-exception
            goto L10a
        Lff:
            monitor-exit(r6)
            i3 r6 = new i3
            r7 = 0
            r6.<init>(r0, r7, r8)
            r1.m89(r6)
            goto L11c
        L10a:
            monitor-exit(r6)
            throw r7
        L10c:
            java.lang.Object r7 = r6.f5722
            android.view.Choreographer r7 = (android.view.Choreographer) r7
            r7.postFrameCallback(r8)
            i3 r7 = new i3
            r0 = 1
            r7.<init>(r6, r0, r8)
            r1.m89(r7)
        L11c:
            java.lang.Object r6 = r1.m86()
            return r6
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0880up mo1784(p000.InterfaceC0880up r2) {
            r1 = this;
            int r0 = r1.f5721
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            up r1 = p000.pd2.m4462(r1, r2)
            return r1
        La:
            up r1 = p000.pd2.m4462(r1, r2)
            return r1
        Lf:
            up r1 = p000.pd2.m4462(r1, r2)
            return r1
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0806sp mo1785(p000.InterfaceC0843tp r2) {
            r1 = this;
            int r0 = r1.f5721
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sp r1 = p000.pd2.m4498(r1, r2)
            return r1
        La:
            sp r1 = p000.pd2.m4498(r1, r2)
            return r1
        Lf:
            sp r1 = p000.pd2.m4498(r1, r2)
            return r1
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1787(p000.e80 r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5721
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r2.invoke(r3, r1)
            return r1
        La:
            java.lang.Object r1 = r2.invoke(r3, r1)
            return r1
        Lf:
            java.lang.Object r1 = r2.invoke(r3, r1)
            return r1
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0880up mo1788(p000.InterfaceC0843tp r2) {
            r1 = this;
            int r0 = r1.f5721
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            up r1 = p000.pd2.m4460(r1, r2)
            return r1
        La:
            up r1 = p000.pd2.m4460(r1, r2)
            return r1
        Lf:
            up r1 = p000.pd2.m4460(r1, r2)
            return r1
    }
}
