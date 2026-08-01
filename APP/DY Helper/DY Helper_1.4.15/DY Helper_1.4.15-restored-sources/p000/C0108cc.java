package p000;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0108cc implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2060;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2061;

    public /* synthetic */ C0108cc(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2060 = r1
            r0.f2061 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0108cc(p000.r01 r1, int r2) {
            r0 = this;
            r2 = 0
            r0.f2060 = r2
            r0.<init>()
            r0.f2061 = r1
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int r3 = r0.f2060
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r3) {
                case 0: goto L3d3;
                case 1: goto L397;
                case 2: goto L377;
                case 3: goto L35b;
                case 4: goto L333;
                case 5: goto L2d1;
                case 6: goto L2a8;
                case 7: goto L1fd;
                case 8: goto L188;
                case 9: goto L16e;
                case 10: goto L10f;
                case 11: goto Leb;
                case 12: goto L1b;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r0.f2061
            a80 r0 = (p000.a80) r0
            s62 r2 = (p000.s62) r2
            r0.invoke(r1)
        L18:
            s62 r0 = p000.s62.f9751
            return r0
        L1b:
            java.lang.Object r0 = r0.f2061
            java.util.List r0 = (java.util.List) r0
            r10 = r1
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r1 = r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.getClass()
            int r2 = r0.size()
            if (r2 != r7) goto L4d
            java.lang.Object r0 = p000.AbstractC0984xh.m6654(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 4
            int r1 = p000.q02.m4669(r10, r0, r1, r6, r2)
            if (r1 >= 0) goto L42
        L3f:
            r2 = r5
            goto Ld5
        L42:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            l91 r2 = new l91
            r2.<init>(r1, r0)
            goto Ld5
        L4d:
            xm0 r2 = new xm0
            if (r1 >= 0) goto L52
            r1 = r6
        L52:
            int r3 = r10.length()
            r2.<init>(r1, r3, r7)
            int r3 = r2.f11349
            int r2 = r2.f11348
            boolean r4 = r10 instanceof java.lang.String
            if (r4 == 0) goto L9b
            if (r3 <= 0) goto L65
            if (r1 <= r2) goto L69
        L65:
            if (r3 >= 0) goto L3f
            if (r2 > r1) goto L3f
        L69:
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L88
            java.lang.Object r7 = r4.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r9 = r10
            java.lang.String r9 = (java.lang.String) r9
            int r11 = r8.length()
            boolean r8 = r8.regionMatches(r6, r9, r1, r11)
            if (r8 == 0) goto L6d
            goto L89
        L88:
            r7 = r5
        L89:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            l91 r2 = new l91
            r2.<init>(r0, r7)
            goto Ld5
        L97:
            if (r1 == r2) goto L3f
            int r1 = r1 + r3
            goto L69
        L9b:
            if (r3 <= 0) goto L9f
            if (r1 <= r2) goto La3
        L9f:
            if (r3 >= 0) goto L3f
            if (r2 > r1) goto L3f
        La3:
            r11 = r1
        La4:
            java.util.Iterator r1 = r0.iterator()
        La8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r1.next()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            int r12 = r8.length()
            r13 = 0
            boolean r6 = p000.q02.m4677(r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto La8
            goto Lc3
        Lc2:
            r4 = r5
        Lc3:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Ld1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            l91 r2 = new l91
            r2.<init>(r0, r4)
            goto Ld5
        Ld1:
            if (r11 == r2) goto L3f
            int r11 = r11 + r3
            goto La4
        Ld5:
            if (r2 == 0) goto Lea
            java.lang.Object r0 = r2.f6502
            java.lang.Object r1 = r2.f6503
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            l91 r5 = new l91
            r5.<init>(r0, r1)
        Lea:
            return r5
        Leb:
            java.lang.Object r0 = r0.f2061
            char[] r0 = (char[]) r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            int r0 = p000.q02.m4670(r1, r0, r2, r6)
            if (r0 >= 0) goto L101
            goto L10e
        L101:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            l91 r5 = new l91
            r5.<init>(r0, r1)
        L10e:
            return r5
        L10f:
            java.lang.Object r0 = r0.f2061
            kx1 r0 = (p000.kx1) r0
            java.util.Set r1 = (java.util.Set) r1
            tw1 r2 = (p000.tw1) r2
            java.util.concurrent.atomic.AtomicReference r2 = r0.f6299
        L119:
            java.lang.Object r3 = r2.get()
            if (r3 != 0) goto L123
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            goto L141
        L123:
            boolean r5 = r3 instanceof java.util.Set
            if (r5 == 0) goto L132
            java.util.Set[] r5 = new java.util.Set[r4]
            r5[r6] = r3
            r5[r7] = r1
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            goto L141
        L132:
            boolean r5 = r3 instanceof java.util.List
            if (r5 == 0) goto L163
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r8 = p000.AbstractC1021yh.m6896(r1)
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r5, r8)
        L141:
            boolean r8 = r2.compareAndSet(r3, r5)
            if (r8 == 0) goto L15c
            boolean r1 = r0.m3424()
            if (r1 == 0) goto L159
            b1 r1 = r0.f6298
            η r2 = new η
            r3 = 16
            r2.<init>(r3, r0)
            r1.invoke(r2)
        L159:
            s62 r0 = p000.s62.f9751
            return r0
        L15c:
            java.lang.Object r8 = r2.get()
            if (r8 == r3) goto L141
            goto L119
        L163:
            java.lang.String r0 = "Unexpected notification"
            p000.AbstractC0804sn.m5527(r0)
            pm r0 = new pm
            r0.<init>()
            throw r0
        L16e:
            java.lang.Object r0 = r0.f2061
            qm1 r0 = (p000.qm1) r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.widget.Switch r2 = (android.widget.Switch) r2
            r2.getClass()
            r0.f9050 = r1
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "feed_enable_preload"
            p000.ui1.m5871(r0, r1)
            goto L18
        L188:
            java.lang.Object r0 = r0.f2061
            mp1 r0 = (p000.mp1) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            r1 = r2
            sp r1 = (p000.InterfaceC0806sp) r1
            tp r2 = r1.getKey()
            up r0 = r0.f7240
            sp r0 = r0.mo1785(r2)
            xn0 r4 = p000.xn0.f12226
            if (r2 == r4) goto L1ab
            if (r1 == r0) goto L1a8
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1bf
        L1a8:
            int r3 = r3 + 1
            goto L1bf
        L1ab:
            r8 = r0
            fo0 r8 = (p000.fo0) r8
            fo0 r1 = (p000.fo0) r1
        L1b0:
            if (r1 != 0) goto L1b3
            goto L1bb
        L1b3:
            if (r1 != r8) goto L1b6
            goto L1ba
        L1b6:
            boolean r0 = r1 instanceof p000.wq1
            if (r0 != 0) goto L1e9
        L1ba:
            r5 = r1
        L1bb:
            if (r5 != r8) goto L1c4
            if (r8 != 0) goto L1a8
        L1bf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L1c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = ", expected child of "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1e9:
            wq1 r1 = (p000.wq1) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4053
            java.lang.Object r0 = r0.get(r1)
            pf r0 = (p000.InterfaceC0685pf) r0
            if (r0 == 0) goto L1fb
            fo0 r0 = r0.getParent()
            r1 = r0
            goto L1b0
        L1fb:
            r1 = r5
            goto L1b0
        L1fd:
            java.lang.Object r0 = r0.f2061
            kl1 r0 = (p000.kl1) r0
            java.util.Set r1 = (java.util.Set) r1
            tw1 r2 = (p000.tw1) r2
            java.lang.Object r2 = r0.f6003
            monitor-enter(r2)
            f02 r3 = r0.f6021     // Catch: java.lang.Throwable -> L263
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L263
            fl1 r3 = (p000.fl1) r3     // Catch: java.lang.Throwable -> L263
            fl1 r8 = p000.fl1.f4009     // Catch: java.lang.Throwable -> L263
            int r3 = r3.compareTo(r8)     // Catch: java.lang.Throwable -> L263
            if (r3 < 0) goto L299
            c21 r3 = r0.f6008     // Catch: java.lang.Throwable -> L263
            boolean r5 = r1 instanceof p000.vq1     // Catch: java.lang.Throwable -> L263
            if (r5 == 0) goto L273
            vq1 r1 = (p000.vq1) r1     // Catch: java.lang.Throwable -> L263
            c21 r1 = r1.f11364     // Catch: java.lang.Throwable -> L263
            java.lang.Object[] r5 = r1.f1942     // Catch: java.lang.Throwable -> L263
            long[] r1 = r1.f1941     // Catch: java.lang.Throwable -> L263
            int r8 = r1.length     // Catch: java.lang.Throwable -> L263
            int r8 = r8 - r4
            if (r8 < 0) goto L295
            r4 = r6
        L22b:
            r9 = r1[r4]     // Catch: java.lang.Throwable -> L263
            long r11 = ~r9     // Catch: java.lang.Throwable -> L263
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L26e
            int r11 = r4 - r8
            int r11 = ~r11     // Catch: java.lang.Throwable -> L263
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L245:
            if (r13 >= r11) goto L26c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L268
            int r14 = r4 << 3
            int r14 = r14 + r13
            r14 = r5[r14]     // Catch: java.lang.Throwable -> L263
            boolean r15 = r14 instanceof p000.j02     // Catch: java.lang.Throwable -> L263
            if (r15 == 0) goto L265
            r15 = r14
            j02 r15 = (p000.j02) r15     // Catch: java.lang.Throwable -> L263
            boolean r15 = r15.m2846(r7)     // Catch: java.lang.Throwable -> L263
            if (r15 != 0) goto L265
            goto L268
        L263:
            r0 = move-exception
            goto L2a6
        L265:
            r3.m1107(r14)     // Catch: java.lang.Throwable -> L263
        L268:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L245
        L26c:
            if (r11 != r12) goto L295
        L26e:
            if (r4 == r8) goto L295
            int r4 = r4 + 1
            goto L22b
        L273:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L263
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L263
        L279:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L263
            if (r4 == 0) goto L295
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L263
            boolean r5 = r4 instanceof p000.j02     // Catch: java.lang.Throwable -> L263
            if (r5 == 0) goto L291
            r5 = r4
            j02 r5 = (p000.j02) r5     // Catch: java.lang.Throwable -> L263
            boolean r5 = r5.m2846(r7)     // Catch: java.lang.Throwable -> L263
            if (r5 != 0) goto L291
            goto L279
        L291:
            r3.m1107(r4)     // Catch: java.lang.Throwable -> L263
            goto L279
        L295:
            yd r5 = r0.m3333()     // Catch: java.lang.Throwable -> L263
        L299:
            monitor-exit(r2)
            if (r5 == 0) goto L2a3
            s62 r0 = p000.s62.f9751
            ae r5 = (p000.C0015ae) r5
            r5.mo75(r0)
        L2a3:
            s62 r0 = p000.s62.f9751
            return r0
        L2a6:
            monitor-exit(r2)
            throw r0
        L2a8:
            java.lang.Object r0 = r0.f2061
            d81 r0 = (p000.d81) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            if (r1 < 0) goto L2ce
            java.util.List r3 = r0.f2957
            int r3 = r3.size()
            if (r1 >= r3) goto L2ce
            java.util.List r3 = r0.f2957
            r3.set(r1, r2)
            java.util.List r1 = r0.f2957
            p000.e81.m1886(r1)
            r0.m1673()
        L2ce:
            s62 r0 = p000.s62.f9751
            return r0
        L2d1:
            java.lang.Object r0 = r0.f2061
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r1 = r2
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.String r5 = " "
            qy0 r6 = p000.qy0.f9157
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L317
            r6 = 100
            long r6 = (long) r6
            long r6 = r6 * r3
            long r6 = r6 / r1
            int r6 = (int) r6
            java.lang.String r3 = p000.qy0.m4961(r3)
            java.lang.String r1 = p000.qy0.m4961(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = "%  "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "/"
            java.lang.String r0 = p000.lz1.m3691(r2, r0, r1)
            goto L332
        L317:
            java.lang.String r1 = p000.qy0.m4961(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r0 = " 已下载"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L332:
            return r0
        L333:
            java.lang.Object r0 = r0.f2061
            an r0 = (p000.C0024an) r0
            v80 r1 = (p000.v80) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r4) goto L345
            r3 = r7
            goto L346
        L345:
            r3 = r6
        L346:
            r2 = r2 & r7
            boolean r2 = r1.m6075(r2, r3)
            if (r2 == 0) goto L355
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.invoke(r1, r2)
            goto L358
        L355:
            r1.m6078()
        L358:
            s62 r0 = p000.s62.f9751
            return r0
        L35b:
            r0 = r1
            v80 r0 = (p000.v80) r0
            r1 = r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            if (r2 == r4) goto L36a
            r6 = r7
        L36a:
            r1 = r1 & r7
            boolean r1 = r0.m6075(r1, r6)
            if (r1 != 0) goto L376
            r0.m6078()
            goto L18
        L376:
            throw r5
        L377:
            java.lang.Object r0 = r0.f2061
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            if (r0 == 0) goto L389
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 != r7) goto L389
            goto L391
        L389:
            if (r0 == 0) goto L392
            boolean r0 = r0.isInstance(r2)
            if (r0 != r7) goto L392
        L391:
            r6 = r7
        L392:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L397:
            java.lang.Object r0 = r0.f2061
            en1 r0 = (p000.en1) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            boolean r1 = r2 instanceof p000.InterfaceC0291fn
            if (r1 == 0) goto L3bc
            r1 = r2
            fn r1 = (p000.InterfaceC0291fn) r1
            c21 r3 = r0.f3610
            if (r3 != 0) goto L3b4
            int r3 = p000.uq1.f10933
            c21 r3 = new c21
            r3.<init>()
            r0.f3610 = r3
        L3b4:
            r3.m1116(r1)
            k21 r3 = r0.f3608
            r3.m3127(r1)
        L3bc:
            boolean r1 = r2 instanceof p000.a90
            if (r1 == 0) goto L3c6
            r1 = r2
            a90 r1 = (p000.a90) r1
            r0.m1940(r1)
        L3c6:
            boolean r0 = r2 instanceof p000.bl1
            if (r0 == 0) goto L3d0
            r0 = r2
            bl1 r0 = (p000.bl1) r0
            r0.m980()
        L3d0:
            s62 r0 = p000.s62.f9751
            return r0
        L3d3:
            java.lang.Object r0 = r0.f2061
            r01 r0 = (p000.r01) r0
            v80 r1 = (p000.v80) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = p000.v81.m6136(r7)
            p000.AbstractC0243ec.m1893(r0, r1, r2)
            goto L18
    }
}
