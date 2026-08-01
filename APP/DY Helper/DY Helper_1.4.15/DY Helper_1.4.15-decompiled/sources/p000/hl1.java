package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hl1 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public p000.hi0 f4764;

    /* JADX INFO: renamed from: κ */
    public int f4765;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f4766;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.kl1 f4767;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.jl1 f4768;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ p000.C0455k3 f4769;

    public hl1(p000.kl1 r1, p000.jl1 r2, p000.C0455k3 r3, p000.InterfaceC0631op r4) {
            r0 = this;
            r0.f4767 = r1
            r0.f4768 = r2
            r0.f4769 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            bq r1 = (p000.InterfaceC0086bq) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            hl1 r0 = (p000.hl1) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r4, java.lang.Object r5) {
            r3 = this;
            hl1 r0 = new hl1
            jl1 r1 = r3.f4768
            k3 r2 = r3.f4769
            kl1 r3 = r3.f4767
            r0.<init>(r3, r1, r2, r4)
            r0.f4766 = r5
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r15) {
            r14 = this;
            cq r0 = p000.EnumC0184cq.f2716
            int r1 = r14.f4765
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L18
            hi0 r0 = r14.f4764
            java.lang.Object r1 = r14.f4766
            fo0 r1 = (p000.fo0) r1
            p000.i81.m2649(r15)     // Catch: java.lang.Throwable -> L15
            goto L13b
        L15:
            r15 = move-exception
            goto L169
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r14)
            return r2
        L1e:
            p000.i81.m2649(r15)
            java.lang.Object r15 = r14.f4766
            bq r15 = (p000.InterfaceC0086bq) r15
            up r15 = r15.mo993()
            xn0 r1 = p000.xn0.f12226
            sp r1 = r15.mo1785(r1)
            fo0 r1 = (p000.fo0) r1
            if (r1 == 0) goto L1a8
            kl1 r15 = r14.f4767
            java.lang.Object r4 = r15.f6003
            monitor-enter(r4)
            java.lang.Throwable r5 = r15.f6005     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L1a5
            f02 r5 = r15.f6021     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L5e
            fl1 r5 = (p000.fl1) r5     // Catch: java.lang.Throwable -> L5e
            fl1 r6 = p000.fl1.f4006     // Catch: java.lang.Throwable -> L5e
            int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L5e
            if (r5 <= 0) goto L19d
            fo0 r5 = r15.f6004     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L195
            r15.f6004 = r1     // Catch: java.lang.Throwable -> L5e
            yd r15 = r15.m3333()     // Catch: java.lang.Throwable -> L5e
            if (r15 == 0) goto L61
            java.lang.String r15 = "called outside of runRecomposeAndApplyChanges"
            p000.AbstractC0804sn.m5526(r15)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r14 = move-exception
            goto L1a6
        L61:
            monitor-exit(r4)
            kl1 r15 = r14.f4767
            cc r4 = new cc
            r5 = 7
            r4.<init>(r5, r15)
            eu1 r15 = p000.ax1.f1360
            p000.ax1.m623(r15)
            java.lang.Object r15 = p000.ax1.f1362
            monitor-enter(r15)
            java.lang.Object r5 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L192
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L192
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6650(r4, r5)     // Catch: java.lang.Throwable -> L192
            p000.ax1.f1367 = r5     // Catch: java.lang.Throwable -> L192
            monitor-exit(r15)
            hi0 r15 = new hi0
            r15.<init>(r4)
            f02 r4 = p000.kl1.f5999
            kl1 r4 = r14.f4767
            rk0 r4 = r4.f6024
        L88:
            f02 r5 = p000.kl1.f5999
            java.lang.Object r6 = r5.getValue()
            oa1 r6 = (p000.oa1) r6
            x r7 = p000.C0966x.f11929
            ga1 r8 = r6.f8014
            boolean r9 = r8.containsKey(r4)
            if (r9 == 0) goto L9c
            r8 = r6
            goto Ld7
        L9c:
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto Lb1
            is0 r9 = new is0
            r9.<init>(r7, r7)
            ga1 r7 = r8.m2295(r4, r9)
            oa1 r8 = new oa1
            r8.<init>(r4, r4, r7)
            goto Ld7
        Lb1:
            java.lang.Object r9 = r6.f8013
            java.lang.Object r10 = r8.get(r9)
            r10.getClass()
            is0 r10 = (p000.is0) r10
            is0 r11 = new is0
            java.lang.Object r10 = r10.f5176
            r11.<init>(r10, r4)
            ga1 r8 = r8.m2295(r9, r11)
            is0 r10 = new is0
            r10.<init>(r9, r7)
            ga1 r7 = r8.m2295(r4, r10)
            oa1 r8 = new oa1
            java.lang.Object r9 = r6.f8012
            r8.<init>(r9, r4, r7)
        Ld7:
            if (r6 == r8) goto Le4
            uy r7 = p000.AbstractC0978xb.f12108
            if (r6 != 0) goto Lde
            r6 = r7
        Lde:
            boolean r5 = r5.m1988(r6, r8)
            if (r5 == 0) goto L88
        Le4:
            kl1 r4 = r14.f4767     // Catch: java.lang.Throwable -> L121
            java.lang.Object r5 = r4.f6003     // Catch: java.lang.Throwable -> L121
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L121
            java.util.List r4 = r4.m3310()     // Catch: java.lang.Throwable -> L166
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L121
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L121
            r6 = 0
            r7 = r6
        Lf4:
            if (r7 >= r5) goto L123
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L121
            zn r8 = (p000.C1064zn) r8     // Catch: java.lang.Throwable -> L121
            ow1 r8 = r8.f13181     // Catch: java.lang.Throwable -> L121
            java.lang.Object[] r8 = r8.f8288     // Catch: java.lang.Throwable -> L121
            int r9 = r8.length     // Catch: java.lang.Throwable -> L121
            r10 = r6
        L102:
            if (r10 >= r9) goto L11a
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L121
            boolean r12 = r11 instanceof p000.bl1     // Catch: java.lang.Throwable -> L121
            if (r12 == 0) goto L10d
            bl1 r11 = (p000.bl1) r11     // Catch: java.lang.Throwable -> L121
            goto L10e
        L10d:
            r11 = r2
        L10e:
            if (r11 == 0) goto L117
            zn r12 = r11.f1777     // Catch: java.lang.Throwable -> L121
            if (r12 == 0) goto L117
            r12.m7199(r11, r2)     // Catch: java.lang.Throwable -> L121
        L117:
            int r10 = r10 + 1
            goto L102
        L11a:
            int r7 = r7 + 1
            goto Lf4
        L11d:
            r13 = r0
            r0 = r15
            r15 = r13
            goto L169
        L121:
            r0 = move-exception
            goto L11d
        L123:
            ne r4 = new ne     // Catch: java.lang.Throwable -> L121
            jl1 r5 = r14.f4768     // Catch: java.lang.Throwable -> L121
            k3 r6 = r14.f4769     // Catch: java.lang.Throwable -> L121
            r7 = 2
            r4.<init>(r5, r6, r2, r7)     // Catch: java.lang.Throwable -> L121
            r14.f4766 = r1     // Catch: java.lang.Throwable -> L121
            r14.f4764 = r15     // Catch: java.lang.Throwable -> L121
            r14.f4765 = r3     // Catch: java.lang.Throwable -> L121
            java.lang.Object r3 = p000.AbstractC1021yh.m6892(r4, r14)     // Catch: java.lang.Throwable -> L121
            if (r3 != r0) goto L13a
            return r0
        L13a:
            r0 = r15
        L13b:
            r0.m2510()
            kl1 r15 = r14.f4767
            java.lang.Object r0 = r15.f6003
            monitor-enter(r0)
            fo0 r3 = r15.f6004     // Catch: java.lang.Throwable -> L14a
            if (r3 != r1) goto L14c
            r15.f6004 = r2     // Catch: java.lang.Throwable -> L14a
            goto L14c
        L14a:
            r14 = move-exception
            goto L164
        L14c:
            yd r15 = r15.m3333()     // Catch: java.lang.Throwable -> L14a
            if (r15 == 0) goto L157
            java.lang.String r15 = "called outside of runRecomposeAndApplyChanges"
            p000.AbstractC0804sn.m5526(r15)     // Catch: java.lang.Throwable -> L14a
        L157:
            monitor-exit(r0)
            f02 r15 = p000.kl1.f5999
            kl1 r14 = r14.f4767
            rk0 r14 = r14.f6024
            p000.rk0.m5103(r14)
            s62 r14 = p000.s62.f9751
            return r14
        L164:
            monitor-exit(r0)
            throw r14
        L166:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L121
            throw r0     // Catch: java.lang.Throwable -> L121
        L169:
            r0.m2510()
            kl1 r0 = r14.f4767
            java.lang.Object r3 = r0.f6003
            monitor-enter(r3)
            fo0 r4 = r0.f6004     // Catch: java.lang.Throwable -> L178
            if (r4 != r1) goto L17a
            r0.f6004 = r2     // Catch: java.lang.Throwable -> L178
            goto L17a
        L178:
            r14 = move-exception
            goto L190
        L17a:
            yd r0 = r0.m3333()     // Catch: java.lang.Throwable -> L178
            if (r0 == 0) goto L185
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            p000.AbstractC0804sn.m5526(r0)     // Catch: java.lang.Throwable -> L178
        L185:
            monitor-exit(r3)
            f02 r0 = p000.kl1.f5999
            kl1 r14 = r14.f4767
            rk0 r14 = r14.f6024
            p000.rk0.m5103(r14)
            throw r15
        L190:
            monitor-exit(r3)
            throw r14
        L192:
            r14 = move-exception
            monitor-exit(r15)
            throw r14
        L195:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r15 = "Recomposer already running"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L5e
            throw r14     // Catch: java.lang.Throwable -> L5e
        L19d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r15 = "Recomposer shut down"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L5e
            throw r14     // Catch: java.lang.Throwable -> L5e
        L1a5:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L1a6:
            monitor-exit(r4)
            throw r14
        L1a8:
            java.lang.String r14 = "Current context doesn't contain Job in it: "
            p000.C1080.m7278(r15, r14)
            return r2
    }
}
