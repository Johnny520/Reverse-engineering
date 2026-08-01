package p000;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0465kd implements p000.jn0 {

    /* JADX INFO: renamed from: β */
    public static final p000.C0465kd f5856 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.C0465kd f5857 = null;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f5858;

    static {
            kd r0 = new kd
            r1 = 0
            r0.<init>(r1)
            p000.C0465kd.f5856 = r0
            kd r0 = new kd
            r1 = 1
            r0.<init>(r1)
            p000.C0465kd.f5857 = r0
            return
    }

    public /* synthetic */ C0465kd(int r1) {
            r0 = this;
            r0.f5858 = r1
            r0.<init>()
            return
    }

    @Override // p000.jn0
    /* JADX INFO: renamed from: α */
    public final p000.zn1 mo2973(p000.yk1 r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            int r0 = r0.f5858
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L24a;
                case 1: goto L1a7;
                default: goto Lc;
            }
        Lc:
            java.lang.String r0 = "networkResponse"
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "Content-Length"
            java.lang.String r7 = "cacheResponse"
            java.lang.System.currentTimeMillis()
            i5 r9 = r1.f12664
            n5 r8 = new n5
            r10 = 6
            r8.<init>(r10, r9, r3, r4)
            java.lang.Object r11 = r9.f4919
            fd r11 = (p000.C0281fd) r11
            if (r11 != 0) goto L33
            int r11 = p000.C0281fd.f3883
            java.lang.Object r11 = r9.f4916
            vc0 r11 = (p000.vc0) r11
            fd r11 = p000.pd2.m4461(r11)
            r9.f4919 = r11
        L33:
            boolean r11 = r11.f3893
            if (r11 == 0) goto L3c
            n5 r8 = new n5
            r8.<init>(r10, r3, r3, r4)
        L3c:
            java.lang.Object r10 = r8.f7387
            i5 r10 = (p000.C0384i5) r10
            java.lang.Object r8 = r8.f7388
            zn1 r8 = (p000.zn1) r8
            r11 = 20
            if (r10 != 0) goto L7e
            if (r8 != 0) goto L7e
            ao1 r15 = p000.bo1.f1795
            zz1 r25 = p000.p52.f8428
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            zj1 r10 = p000.zj1.f13131
            java.lang.String r11 = "Unsatisfiable Request (only-if-cached)"
            long r22 = java.lang.System.currentTimeMillis()
            vc0 r14 = new vc0
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r14.<init>(r0)
            zn1 r8 = new zn1
            r12 = 504(0x1f8, float:7.06E-43)
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = -1
            r24 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25)
            goto L1a6
        L7e:
            if (r10 != 0) goto L96
            r8.getClass()
            yn1 r0 = r8.m7206()
            zn1 r1 = p000.p91.m4410(r8)
            p000.yn1.m6944(r7, r1)
            r0.f12700 = r1
            zn1 r8 = r0.m6945()
            goto L1a6
        L96:
            zn1 r1 = r1.m6922(r10)
            if (r8 == 0) goto L185
            int r9 = r1.f13200
            r10 = 304(0x130, float:4.26E-43)
            if (r9 != r10) goto L17d
            yn1 r9 = r8.m7206()
            vc0 r10 = r8.f13202
            vc0 r12 = r1.f13202
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r11)
            int r11 = r10.size()
            r14 = r4
        Lb4:
            if (r14 >= r11) goto L10b
            java.lang.String r15 = r10.m6169(r14)
            r26 = r3
            java.lang.String r3 = r10.m6171(r14)
            java.lang.String r4 = "Warning"
            boolean r4 = r4.equalsIgnoreCase(r15)
            if (r4 == 0) goto Ld4
            java.lang.String r4 = "1"
            r17 = r10
            r10 = 0
            boolean r4 = p000.x02.m6485(r3, r4, r10)
            if (r4 == 0) goto Ld6
            goto L103
        Ld4:
            r17 = r10
        Ld6:
            boolean r4 = r6.equalsIgnoreCase(r15)
            if (r4 != 0) goto Lf5
            boolean r4 = r5.equalsIgnoreCase(r15)
            if (r4 != 0) goto Lf5
            boolean r4 = r2.equalsIgnoreCase(r15)
            if (r4 == 0) goto Le9
            goto Lf5
        Le9:
            boolean r4 = p000.AbstractC0782s1.m5337(r15)
            if (r4 == 0) goto Lf5
            java.lang.String r4 = r12.m6168(r15)
            if (r4 != 0) goto L103
        Lf5:
            r13.add(r15)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            r13.add(r3)
        L103:
            int r14 = r14 + 1
            r4 = 0
            r3 = r26
            r10 = r17
            goto Lb4
        L10b:
            r26 = r3
            int r3 = r12.size()
            r4 = 0
        L112:
            if (r4 >= r3) goto L146
            java.lang.String r10 = r12.m6169(r4)
            boolean r11 = r6.equalsIgnoreCase(r10)
            if (r11 != 0) goto L143
            boolean r11 = r5.equalsIgnoreCase(r10)
            if (r11 != 0) goto L143
            boolean r11 = r2.equalsIgnoreCase(r10)
            if (r11 == 0) goto L12b
            goto L143
        L12b:
            boolean r11 = p000.AbstractC0782s1.m5337(r10)
            if (r11 == 0) goto L143
            java.lang.String r11 = r12.m6171(r4)
            r13.add(r10)
            java.lang.CharSequence r10 = p000.q02.m4660(r11)
            java.lang.String r10 = r10.toString()
            r13.add(r10)
        L143:
            int r4 = r4 + 1
            goto L112
        L146:
            vc0 r2 = new vc0
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]
            java.lang.Object[] r3 = r13.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.<init>(r3)
            uc0 r2 = r2.m6170()
            r9.f12696 = r2
            long r2 = r1.f13208
            r9.f12702 = r2
            long r2 = r1.f13209
            r9.f12703 = r2
            zn1 r2 = p000.p91.m4410(r8)
            p000.yn1.m6944(r7, r2)
            r9.f12700 = r2
            zn1 r2 = p000.p91.m4410(r1)
            p000.yn1.m6944(r0, r2)
            r9.f12699 = r2
            r9.m6945()
            bo1 r0 = r1.f13203
            r0.close()
            throw r26
        L17d:
            r26 = r3
            bo1 r2 = r8.f13203
            p000.sd2.m5472(r2)
            goto L187
        L185:
            r26 = r3
        L187:
            yn1 r2 = r1.m7206()
            if (r8 == 0) goto L192
            zn1 r3 = p000.p91.m4410(r8)
            goto L194
        L192:
            r3 = r26
        L194:
            p000.yn1.m6944(r7, r3)
            r2.f12700 = r3
            zn1 r1 = p000.p91.m4410(r1)
            p000.yn1.m6944(r0, r1)
            r2.f12699 = r1
            zn1 r8 = r2.m6945()
        L1a6:
            return r8
        L1a7:
            r26 = r3
            uk1 r3 = r1.f12660
            monitor-enter(r3)
            boolean r0 = r3.f10902     // Catch: java.lang.Throwable -> L236
            if (r0 == 0) goto L240
            boolean r0 = r3.f10899     // Catch: java.lang.Throwable -> L236
            if (r0 != 0) goto L238
            boolean r0 = r3.f10898     // Catch: java.lang.Throwable -> L236
            if (r0 != 0) goto L238
            boolean r0 = r3.f10901     // Catch: java.lang.Throwable -> L236
            if (r0 != 0) goto L238
            boolean r0 = r3.f10900     // Catch: java.lang.Throwable -> L236
            if (r0 != 0) goto L238
            monitor-exit(r3)
            c00 r0 = r3.f10894
            r0.getClass()
            vk1 r4 = r0.mo1093()
            t41 r5 = r3.f10888
            r4.getClass()
            r5.getClass()
            int r6 = r1.f12666
            m6 r7 = r4.f11330
            dg0 r8 = r4.f11331
            if (r8 == 0) goto L1e0
            eg0 r6 = new eg0
            r6.<init>(r5, r4, r1, r8)
            goto L208
        L1e0:
            java.net.Socket r8 = r4.f11327
            r8.setSoTimeout(r6)
            java.lang.Object r8 = r7.f6968
            rk1 r8 = (p000.rk1) r8
            rx1 r8 = r8.f9395
            m42 r8 = r8.mo2105()
            long r9 = (long) r6
            r8.mo2874(r9)
            java.lang.Object r6 = r7.f6969
            qk1 r6 = (p000.qk1) r6
            iw1 r6 = r6.f9028
            m42 r6 = r6.mo2505()
            int r8 = r1.f12667
            long r8 = (long) r8
            r6.mo2874(r8)
            uf0 r6 = new uf0
            r6.<init>(r5, r4, r7)
        L208:
            zz r4 = new zz
            r4.<init>(r3, r0, r6)
            r3.f10897 = r4
            r3.f10904 = r4
            monitor-enter(r3)
            r3.f10898 = r2     // Catch: java.lang.Throwable -> L233
            r3.f10899 = r2     // Catch: java.lang.Throwable -> L233
            monitor-exit(r3)
            boolean r0 = r3.f10903
            if (r0 != 0) goto L22b
            r0 = 61
            r10 = 0
            r3 = r26
            yk1 r0 = p000.yk1.m6921(r1, r10, r4, r3, r0)
            i5 r1 = r1.f12664
            zn1 r3 = r0.m6922(r1)
            goto L232
        L22b:
            r3 = r26
            java.lang.String r0 = "Canceled"
            p000.C1080.m7281(r0)
        L232:
            return r3
        L233:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L236:
            r0 = move-exception
            goto L248
        L238:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L236
            throw r0     // Catch: java.lang.Throwable -> L236
        L240:
            java.lang.String r0 = "released"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L236
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L236
            throw r1     // Catch: java.lang.Throwable -> L236
        L248:
            monitor-exit(r3)
            throw r0
        L24a:
            java.lang.String r4 = "close"
            java.lang.String r5 = "upgrade"
            java.lang.String r6 = "Connection"
            zz r8 = r1.f12663
            r8.getClass()
            java.lang.Object r0 = r8.f13380
            r7 = r0
            uk1 r7 = (p000.uk1) r7
            java.lang.Object r0 = r8.f13382
            r14 = r0
            b00 r14 = (p000.b00) r14
            i5 r1 = r1.f12664
            java.lang.Object r0 = r1.f4917
            kn1 r0 = (p000.kn1) r0
            java.lang.Object r9 = r1.f4916
            vc0 r9 = (p000.vc0) r9
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Object r12 = r1.f4915
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = p000.jx0.m3031(r12)
            if (r12 == 0) goto L27b
            if (r0 == 0) goto L27b
            r12 = r2
            goto L27c
        L27b:
            r12 = 0
        L27c:
            java.lang.String r13 = r9.m6168(r6)
            boolean r15 = r5.equalsIgnoreCase(r13)
            r14.mo644(r1)     // Catch: java.io.IOException -> L329
            if (r12 == 0) goto L312
            java.lang.String r12 = "100-continue"
            java.lang.String r13 = "Expect"
            java.lang.String r9 = r9.m6168(r13)     // Catch: java.io.IOException -> L30d
            boolean r9 = r12.equalsIgnoreCase(r9)     // Catch: java.io.IOException -> L30d
            if (r9 == 0) goto L2ac
            r14.mo648()     // Catch: java.io.IOException -> L2a7
            yn1 r9 = r8.m7254(r2)     // Catch: java.io.IOException -> L2a1
            r17 = r9
            goto L2ae
        L2a1:
            r0 = move-exception
            r17 = r3
        L2a4:
            r2 = r10
            goto L32f
        L2a7:
            r0 = move-exception
            r8.m7255(r0)     // Catch: java.io.IOException -> L2a1
            throw r0     // Catch: java.io.IOException -> L2a1
        L2ac:
            r17 = r3
        L2ae:
            if (r17 != 0) goto L2ef
            r0.getClass()     // Catch: java.io.IOException -> L2ed
            r0.getClass()     // Catch: java.io.IOException -> L2ed
            r12 = r10
            long r10 = r0.m3382()     // Catch: java.io.IOException -> L2ea
            iw1 r9 = r14.mo652(r1, r10)     // Catch: java.io.IOException -> L2ea
            xz r7 = new xz     // Catch: java.io.IOException -> L2ea
            r18 = r12
            r12 = 0
            r2 = r18
            r7.<init>(r8, r9, r10, r12)     // Catch: java.io.IOException -> L2e8
            qk1 r9 = new qk1     // Catch: java.io.IOException -> L2e8
            r9.<init>(r7)     // Catch: java.io.IOException -> L2e8
            byte[] r7 = r0.f6058     // Catch: java.io.IOException -> L2e8
            int r0 = r0.f6057     // Catch: java.io.IOException -> L2e8
            boolean r10 = r9.f9030     // Catch: java.io.IOException -> L2e8
            if (r10 != 0) goto L2df
            sc r10 = r9.f9029     // Catch: java.io.IOException -> L2e8
            r10.m5464(r7, r0)     // Catch: java.io.IOException -> L2e8
            r9.m4892()     // Catch: java.io.IOException -> L2e8
            goto L2e4
        L2df:
            java.lang.String r0 = "closed"
            p000.C1080.m7279(r0)     // Catch: java.io.IOException -> L2e8
        L2e4:
            r9.close()     // Catch: java.io.IOException -> L2e8
            goto L31d
        L2e8:
            r0 = move-exception
            goto L32f
        L2ea:
            r0 = move-exception
            r2 = r12
            goto L32f
        L2ed:
            r0 = move-exception
            goto L2a4
        L2ef:
            r2 = r10
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = 1
            r10 = 0
            r7.m5933(r8, r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> L2e8
            vk1 r0 = r8.m7253()     // Catch: java.io.IOException -> L2e8
            dg0 r0 = r0.f11331     // Catch: java.io.IOException -> L2e8
            if (r0 == 0) goto L302
            r0 = 1
            goto L303
        L302:
            r0 = 0
        L303:
            if (r0 != 0) goto L31d
            a00 r0 = r14.mo650()     // Catch: java.io.IOException -> L2e8
            r0.mo3()     // Catch: java.io.IOException -> L2e8
            goto L31d
        L30d:
            r0 = move-exception
            r2 = r10
        L30f:
            r17 = 0
            goto L32f
        L312:
            r2 = r10
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = 1
            r10 = 0
            r7.m5933(r8, r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> L327
            r17 = 0
        L31d:
            r14.mo646()     // Catch: java.io.IOException -> L322
            r13 = 0
            goto L338
        L322:
            r0 = move-exception
            r8.m7255(r0)     // Catch: java.io.IOException -> L2e8
            throw r0     // Catch: java.io.IOException -> L2e8
        L327:
            r0 = move-exception
            goto L30f
        L329:
            r0 = move-exception
            r2 = r10
            r8.m7255(r0)     // Catch: java.io.IOException -> L327
            throw r0     // Catch: java.io.IOException -> L327
        L32f:
            boolean r7 = r0 instanceof p000.C0593no
            if (r7 != 0) goto L48f
            boolean r7 = r8.f13379
            if (r7 == 0) goto L48e
            r13 = r0
        L338:
            if (r17 != 0) goto L342
            r10 = 0
            yn1 r17 = r8.m7254(r10)     // Catch: java.io.IOException -> L345
            r17.getClass()     // Catch: java.io.IOException -> L345
        L342:
            r0 = r17
            goto L348
        L345:
            r0 = move-exception
            goto L487
        L348:
            r0.f12691 = r1     // Catch: java.io.IOException -> L345
            vk1 r7 = r8.m7253()     // Catch: java.io.IOException -> L345
            qc0 r7 = r7.f11328     // Catch: java.io.IOException -> L345
            r0.f12695 = r7     // Catch: java.io.IOException -> L345
            r0.f12702 = r2     // Catch: java.io.IOException -> L345
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L345
            r0.f12703 = r9     // Catch: java.io.IOException -> L345
            zn1 r0 = r0.m6945()     // Catch: java.io.IOException -> L345
            int r7 = r0.f13200     // Catch: java.io.IOException -> L345
        L360:
            vc0 r9 = r0.f13202
            bo1 r10 = r0.f13203
            r11 = 100
            if (r7 != r11) goto L36a
        L368:
            r11 = 0
            goto L373
        L36a:
            r11 = 102(0x66, float:1.43E-43)
            if (r11 > r7) goto L393
            r11 = 200(0xc8, float:2.8E-43)
            if (r7 >= r11) goto L393
            goto L368
        L373:
            yn1 r0 = r8.m7254(r11)     // Catch: java.io.IOException -> L345
            r0.getClass()     // Catch: java.io.IOException -> L345
            r0.f12691 = r1     // Catch: java.io.IOException -> L345
            vk1 r7 = r8.m7253()     // Catch: java.io.IOException -> L345
            qc0 r7 = r7.f11328     // Catch: java.io.IOException -> L345
            r0.f12695 = r7     // Catch: java.io.IOException -> L345
            r0.f12702 = r2     // Catch: java.io.IOException -> L345
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L345
            r0.f12703 = r9     // Catch: java.io.IOException -> L345
            zn1 r0 = r0.m6945()     // Catch: java.io.IOException -> L345
            int r7 = r0.f13200     // Catch: java.io.IOException -> L345
            goto L360
        L393:
            r11 = 0
            r1 = 101(0x65, float:1.42E-43)
            if (r7 != r1) goto L39a
            r1 = 1
            goto L39b
        L39a:
            r1 = r11
        L39b:
            if (r1 == 0) goto L3b3
            vk1 r2 = r8.m7253()     // Catch: java.io.IOException -> L345
            dg0 r2 = r2.f11331     // Catch: java.io.IOException -> L345
            if (r2 == 0) goto L3a7
            r2 = 1
            goto L3a8
        L3a7:
            r2 = r11
        L3a8:
            if (r2 != 0) goto L3ab
            goto L3b3
        L3ab:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L345
            java.lang.String r1 = "Unexpected 101 code on HTTP/2 connection"
            r0.<init>(r1)     // Catch: java.io.IOException -> L345
            throw r0     // Catch: java.io.IOException -> L345
        L3b3:
            if (r1 == 0) goto L3c4
            java.lang.String r1 = r9.m6168(r6)     // Catch: java.io.IOException -> L345
            if (r1 != 0) goto L3bc
            r1 = 0
        L3bc:
            boolean r1 = r5.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> L345
            if (r1 == 0) goto L3c4
            r2 = 1
            goto L3c5
        L3c4:
            r2 = r11
        L3c5:
            if (r15 == 0) goto L3e8
            if (r2 == 0) goto L3e8
            yn1 r0 = r0.m7206()     // Catch: java.io.IOException -> L345
            v62 r1 = new v62     // Catch: java.io.IOException -> L345
            ez0 r2 = r10.mo566()     // Catch: java.io.IOException -> L345
            long r9 = r10.mo565()     // Catch: java.io.IOException -> L345
            r1.<init>(r2, r9)     // Catch: java.io.IOException -> L345
            r0.f12697 = r1     // Catch: java.io.IOException -> L345
            n5 r1 = r8.m7256()     // Catch: java.io.IOException -> L345
            r0.f12698 = r1     // Catch: java.io.IOException -> L345
            zn1 r0 = r0.m6945()     // Catch: java.io.IOException -> L345
            r2 = r7
            goto L41d
        L3e8:
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = r9.m6168(r1)     // Catch: java.io.IOException -> L482
            if (r1 != 0) goto L3f1
            r1 = 0
        L3f1:
            long r10 = r14.mo651(r0)     // Catch: java.io.IOException -> L482
            rx1 r9 = r14.mo645(r0)     // Catch: java.io.IOException -> L482
            r2 = r7
            yz r7 = new yz     // Catch: java.io.IOException -> L482
            r12 = 0
            r7.<init>(r8, r9, r10, r12)     // Catch: java.io.IOException -> L482
            zk1 r3 = new zk1     // Catch: java.io.IOException -> L482
            rk1 r5 = new rk1     // Catch: java.io.IOException -> L482
            r5.<init>(r7)     // Catch: java.io.IOException -> L482
            r3.<init>(r1, r10, r5)     // Catch: java.io.IOException -> L482
            yn1 r0 = r0.m7206()     // Catch: java.io.IOException -> L345
            r0.f12697 = r3     // Catch: java.io.IOException -> L345
            i2 r1 = new i2     // Catch: java.io.IOException -> L345
            r3 = 10
            r1.<init>(r3)     // Catch: java.io.IOException -> L345
            r0.f12705 = r1     // Catch: java.io.IOException -> L345
            zn1 r0 = r0.m6945()     // Catch: java.io.IOException -> L345
        L41d:
            i5 r1 = r0.f13197     // Catch: java.io.IOException -> L345
            r1.getClass()     // Catch: java.io.IOException -> L345
            java.lang.Object r1 = r1.f4916     // Catch: java.io.IOException -> L345
            vc0 r1 = (p000.vc0) r1     // Catch: java.io.IOException -> L345
            java.lang.String r1 = r1.m6168(r6)     // Catch: java.io.IOException -> L345
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> L345
            if (r1 != 0) goto L441
            vc0 r1 = r0.f13202     // Catch: java.io.IOException -> L345
            java.lang.String r1 = r1.m6168(r6)     // Catch: java.io.IOException -> L345
            if (r1 != 0) goto L43a
            r3 = 0
            goto L43b
        L43a:
            r3 = r1
        L43b:
            boolean r1 = r4.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> L345
            if (r1 == 0) goto L448
        L441:
            a00 r1 = r14.mo650()     // Catch: java.io.IOException -> L345
            r1.mo3()     // Catch: java.io.IOException -> L345
        L448:
            r1 = 204(0xcc, float:2.86E-43)
            if (r2 == r1) goto L450
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L45c
        L450:
            bo1 r1 = r0.f13203     // Catch: java.io.IOException -> L345
            long r3 = r1.mo565()     // Catch: java.io.IOException -> L345
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L45d
        L45c:
            return r0
        L45d:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.io.IOException -> L345
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L345
            r3.<init>()     // Catch: java.io.IOException -> L345
            java.lang.String r4 = "HTTP "
            r3.append(r4)     // Catch: java.io.IOException -> L345
            r3.append(r2)     // Catch: java.io.IOException -> L345
            java.lang.String r2 = " had non-zero Content-Length: "
            r3.append(r2)     // Catch: java.io.IOException -> L345
            bo1 r0 = r0.f13203     // Catch: java.io.IOException -> L345
            long r4 = r0.mo565()     // Catch: java.io.IOException -> L345
            r3.append(r4)     // Catch: java.io.IOException -> L345
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L345
            r1.<init>(r0)     // Catch: java.io.IOException -> L345
            throw r1     // Catch: java.io.IOException -> L345
        L482:
            r0 = move-exception
            r8.m7255(r0)     // Catch: java.io.IOException -> L345
            throw r0     // Catch: java.io.IOException -> L345
        L487:
            if (r13 == 0) goto L48d
            p000.ln0.m3624(r13, r0)
            throw r13
        L48d:
            throw r0
        L48e:
            throw r0
        L48f:
            throw r0
    }
}
