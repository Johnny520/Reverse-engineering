package p000;

/* JADX INFO: renamed from: pn */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0693pn {

    /* JADX INFO: renamed from: α */
    public final android.view.View f8596;

    /* JADX INFO: renamed from: β */
    public final p000.AbstractC0878un f8597;

    /* JADX INFO: renamed from: γ */
    public final p000.hr0 f8598;

    /* JADX INFO: renamed from: δ */
    public final p000.kq1 f8599;

    /* JADX INFO: renamed from: ε */
    public final p000.r92 f8600;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0568n f8601;

    /* JADX INFO: renamed from: η */
    public final p000.y21 f8602;

    /* JADX INFO: renamed from: θ */
    public final android.content.res.Configuration f8603;

    /* JADX INFO: renamed from: ι */
    public final p000.g21 f8604;

    /* JADX INFO: renamed from: κ */
    public final p000.C0342h0 f8605;

    /* JADX INFO: renamed from: λ */
    public final p000.C0381i2 f8606;

    /* JADX INFO: renamed from: μ */
    public final p000.C0670p0 f8607;

    /* JADX INFO: renamed from: ν */
    public final p000.C0606o0 f8608;

    /* JADX INFO: renamed from: ξ */
    public final p000.e50 f8609;

    /* JADX INFO: renamed from: ο */
    public final p000.g21 f8610;

    /* JADX INFO: renamed from: π */
    public final p000.rc0 f8611;

    /* JADX INFO: renamed from: ρ */
    public final p000.C0498l3 f8612;

    /* JADX INFO: renamed from: σ */
    public final p000.aq0 f8613;

    /* JADX INFO: renamed from: τ */
    public final p000.lm0 f8614;

    /* JADX INFO: renamed from: υ */
    public final p000.C0319ge f8615;

    /* JADX INFO: renamed from: φ */
    public int f8616;

    /* JADX INFO: renamed from: χ */
    public final p000.ComponentCallbacks2C0629on f8617;

    public C0693pn(p000.C0693pn r4, android.view.View r5, p000.AbstractC0878un r6, p000.hr0 r7, p000.kq1 r8, p000.r92 r9) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Lc
            android.view.View r1 = r4.f8596
            if (r1 == 0) goto Lc
            android.content.Context r1 = r1.getContext()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            android.content.Context r2 = r5.getContext()
            boolean r1 = p000.ln0.m3626(r1, r2)
            r3.<init>()
            r3.f8596 = r5
            r3.f8597 = r6
            r3.f8598 = r7
            r3.f8599 = r8
            r3.f8600 = r9
            if (r1 == 0) goto L2a
            r4.getClass()
            n r6 = r4.f8601
            goto L31
        L2a:
            n r6 = new n
            r7 = 24
            r6.<init>(r7)
        L31:
            r3.f8601 = r6
            if (r4 == 0) goto L39
            y21 r6 = r4.f8602
            if (r6 != 0) goto L3f
        L39:
            y21 r6 = new y21
            r7 = 5
            r6.<init>(r7)
        L3f:
            r3.f8602 = r6
            if (r1 == 0) goto L49
            r4.getClass()
            android.content.res.Configuration r6 = r4.f8603
            goto L5a
        L49:
            android.content.res.Configuration r6 = new android.content.res.Configuration
            android.content.Context r7 = r5.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            r6.<init>(r7)
        L5a:
            r3.f8603 = r6
            if (r1 == 0) goto L64
            r4.getClass()
            g21 r6 = r4.f8604
            goto L6d
        L64:
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>(r6)
            x91 r6 = p000.j81.m2882(r7)
        L6d:
            r3.f8604 = r6
            if (r1 == 0) goto L77
            r4.getClass()
            h0 r6 = r4.f8605
            goto L8b
        L77:
            h0 r6 = new h0
            android.content.Context r7 = r5.getContext()
            r6.<init>()
            java.lang.String r8 = "accessibility"
            java.lang.Object r7 = r7.getSystemService(r8)
            r7.getClass()
            android.view.accessibility.AccessibilityManager r7 = (android.view.accessibility.AccessibilityManager) r7
        L8b:
            r3.f8605 = r6
            if (r1 == 0) goto L95
            r4.getClass()
            i2 r6 = r4.f8606
            goto L9e
        L95:
            i2 r6 = new i2
            r5.getContext()
            r7 = 3
            r6.<init>(r7)
        L9e:
            r3.f8606 = r6
            if (r1 == 0) goto La8
            r4.getClass()
            p0 r6 = r4.f8607
            goto Lb1
        La8:
            p0 r6 = new p0
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        Lb1:
            r3.f8607 = r6
            if (r1 == 0) goto Lbb
            r4.getClass()
            o0 r6 = r4.f8608
            goto Lc0
        Lbb:
            o0 r6 = new o0
            r6.<init>()
        Lc0:
            r3.f8608 = r6
            if (r1 == 0) goto Lca
            r4.getClass()
            e50 r6 = r4.f8609
            goto Ld3
        Lca:
            i2 r6 = new i2
            r5.getContext()
            r7 = 0
            r6.<init>(r7)
        Ld3:
            r3.f8609 = r6
            if (r1 == 0) goto Ldd
            r4.getClass()
            g21 r6 = r4.f8610
            goto Led
        Ldd:
            android.content.Context r6 = r5.getContext()
            g50 r6 = p000.jx0.m3050(r6)
            xn0 r7 = p000.xn0.f12218
            x91 r8 = new x91
            r8.<init>(r6, r7)
            r6 = r8
        Led:
            r3.f8610 = r6
            if (r4 == 0) goto Lf3
            android.view.View r0 = r4.f8596
        Lf3:
            if (r5 != r0) goto Lf8
            rc0 r6 = r4.f8611
            goto Lff
        Lf8:
            rk0 r6 = new rk0
            r7 = 10
            r6.<init>(r7)
        Lff:
            r3.f8611 = r6
            if (r1 == 0) goto L109
            r4.getClass()
            l3 r5 = r4.f8612
            goto L116
        L109:
            l3 r6 = new l3
            android.content.Context r5 = r5.getContext()
            android.view.ViewConfiguration.get(r5)
            r6.<init>()
            r5 = r6
        L116:
            r3.f8612 = r5
            if (r4 == 0) goto L11e
            aq0 r5 = r4.f8613
            if (r5 != 0) goto L123
        L11e:
            aq0 r5 = new aq0
            r5.<init>()
        L123:
            r3.f8613 = r5
            lm0 r5 = new lm0
            r6 = 1
            r7 = 0
            r5.<init>(r6, r7)
            r3.f8614 = r5
            if (r4 == 0) goto L134
            ge r4 = r4.f8615
            if (r4 != 0) goto L139
        L134:
            ge r4 = new ge
            r4.<init>()
        L139:
            r3.f8615 = r4
            k1 r4 = new k1
            r5 = 1
            r4.<init>(r5, r3)
            on r4 = new on
            r4.<init>(r3)
            r3.f8617 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4552(androidx.compose.p001ui.platform.AndroidComposeView r26, p000.e80 r27, p000.v80 r28, int r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = 123858079(0x761ec9f, float:1.6996655E-34)
            r3.m6083(r5)
            boolean r5 = r3.m6092(r1)
            if (r5 == 0) goto L18
            r5 = 4
            goto L19
        L18:
            r5 = 2
        L19:
            r5 = r5 | r4
            boolean r6 = r3.m6092(r2)
            if (r6 == 0) goto L23
            r6 = 32
            goto L25
        L23:
            r6 = 16
        L25:
            r5 = r5 | r6
            boolean r6 = r3.m6092(r0)
            if (r6 == 0) goto L2f
            r6 = 256(0x100, float:3.59E-43)
            goto L31
        L2f:
            r6 = 128(0x80, float:1.8E-43)
        L31:
            r5 = r5 | r6
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r9 = 1
            if (r6 == r7) goto L3b
            r6 = r9
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r5 = r5 & r9
            boolean r5 = r3.m6075(r5, r6)
            if (r5 == 0) goto L23f
            r5 = 2131296763(0x7f0901fb, float:1.8211452E38)
            java.lang.Object r6 = r1.getTag(r5)
            boolean r7 = r6 instanceof java.util.Set
            if (r7 == 0) goto L59
            boolean r7 = r6 instanceof p000.lo0
            if (r7 == 0) goto L56
            boolean r7 = r6 instanceof p000.qo0
            if (r7 == 0) goto L59
        L56:
            java.util.Set r6 = (java.util.Set) r6
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 != 0) goto L81
            android.view.ViewParent r6 = r1.getParent()
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L67
            android.view.View r6 = (android.view.View) r6
            goto L68
        L67:
            r6 = 0
        L68:
            if (r6 == 0) goto L6f
            java.lang.Object r5 = r6.getTag(r5)
            goto L70
        L6f:
            r5 = 0
        L70:
            boolean r6 = r5 instanceof java.util.Set
            if (r6 == 0) goto L80
            boolean r6 = r5 instanceof p000.lo0
            if (r6 == 0) goto L7c
            boolean r6 = r5 instanceof p000.qo0
            if (r6 == 0) goto L80
        L7c:
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            goto L81
        L80:
            r6 = 0
        L81:
            if (r6 == 0) goto La4
            wn r5 = r3.m6106()
            r6.add(r5)
            r3.f11173 = r9
            r3.f11138 = r9
            ow1 r5 = r3.f11159
            r5.m4301()
            ow1 r5 = r3.f11143
            r5.m4301()
            rw1 r5 = r3.f11144
            ow1 r7 = r5.f9538
            java.util.HashMap r11 = r7.f8295
            r5.f9542 = r11
            n11 r7 = r7.f8296
            r5.f9543 = r7
        La4:
            java.lang.Object r5 = r3.m6073()
            kq1 r7 = r0.f8599
            i2 r11 = p000.C0730qn.f9051
            if (r5 != r11) goto L16a
            android.view.ViewParent r5 = r1.getParent()
            r5.getClass()
            android.view.View r5 = (android.view.View) r5
            r12 = 2131296500(0x7f0900f4, float:1.8210918E38)
            java.lang.Object r12 = r5.getTag(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto Lc5
            java.lang.String r12 = (java.lang.String) r12
            goto Lc6
        Lc5:
            r12 = 0
        Lc6:
            if (r12 != 0) goto Ld0
            int r5 = r5.getId()
            java.lang.String r12 = java.lang.String.valueOf(r5)
        Ld0:
            java.lang.String r5 = "SaveableStateRegistry:"
            java.lang.String r5 = p000.lz1.m3687(r5, r12)
            n5 r12 = r7.mo189()
            android.os.Bundle r13 = r12.m3985(r5)
            if (r13 == 0) goto L108
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Set r15 = r13.keySet()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        Lef:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L109
            java.lang.Object r16 = r15.next()
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8
            java.util.ArrayList r10 = r13.getParcelableArrayList(r8)
            r10.getClass()
            r14.put(r8, r10)
            goto Lef
        L108:
            r14 = 0
        L109:
            m02 r8 = p000.yp1.f12763
            y21 r8 = new y21
            r8.<init>()
            if (r14 == 0) goto L142
            boolean r10 = r14.isEmpty()
            if (r10 == 0) goto L119
            goto L142
        L119:
            b21 r10 = new b21
            int r13 = r14.size()
            r10.<init>(r13)
            java.util.Set r13 = r14.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L12a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L143
            java.lang.Object r14 = r13.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            java.lang.Object r14 = r14.getValue()
            r10.m701(r15, r14)
            goto L12a
        L142:
            r10 = 0
        L143:
            r8.f12428 = r10
            hq1 r10 = r12.m3964(r5)
            if (r10 == 0) goto L14d
            r9 = 0
            goto L15c
        L14d:
            qm r10 = new qm     // Catch: java.lang.IllegalArgumentException -> L158
            r10.<init>(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L158
            r12.m3974(r5, r10)     // Catch: java.lang.IllegalArgumentException -> L158
            r17 = r9
            goto L15a
        L158:
            r17 = 0
        L15a:
            r9 = r17
        L15c:
            wt r10 = new wt
            xt r13 = new xt
            r13.<init>(r9, r12, r5)
            r10.<init>(r8, r13)
            r3.m6115(r10)
            r5 = r10
        L16a:
            wt r5 = (p000.C0959wt) r5
            boolean r8 = r3.m6092(r5)
            java.lang.Object r9 = r3.m6073()
            if (r8 != 0) goto L178
            if (r9 != r11) goto L181
        L178:
            b0 r9 = new b0
            r8 = 7
            r9.<init>(r8, r5)
            r3.m6115(r9)
        L181:
            a80 r9 = (p000.a80) r9
            s62 r8 = p000.s62.f9751
            boolean r8 = r3.m6090(r8)
            java.lang.Object r10 = r3.m6073()
            if (r8 != 0) goto L191
            if (r10 != r11) goto L199
        L191:
            tt r10 = new tt
            r10.<init>(r9)
            r3.m6115(r10)
        L199:
            tt r10 = (p000.C0847tt) r10
            yx r8 = p000.AbstractC0292fo.f4051
            java.lang.Object r9 = r3.m6094(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            boolean r10 = r1.getScrollCaptureInProgress$ui()
            r9 = r9 | r10
            android.view.View r10 = r1.getView()
            boolean r10 = r3.m6090(r10)
            java.lang.Object r12 = r3.m6073()
            if (r10 != 0) goto L1bc
            if (r12 != r11) goto L1c7
        L1bc:
            ba2 r12 = new ba2
            r1.getView()
            r12.<init>()
            r3.m6115(r12)
        L1c7:
            ba2 r12 = (p000.ba2) r12
            ak1 r10 = p000.wu0.f11867
            hr0 r11 = r0.f8598
            q4 r13 = r10.mo171(r11)
            ak1 r10 = p000.yu0.f12796
            q4 r14 = r10.mo171(r7)
            m02 r7 = p000.AbstractC0856u1.f10549
            n r10 = r0.f8601
            q4 r15 = r7.mo171(r10)
            m02 r7 = p000.AbstractC0856u1.f10550
            y21 r10 = r0.f8602
            q4 r16 = r7.mo171(r10)
            m02 r7 = p000.AbstractC0856u1.f10548
            android.content.Context r10 = r1.getContext()
            q4 r17 = r7.mo171(r10)
            m02 r7 = p000.pm0.f8593
            q4 r18 = r7.mo171(r6)
            yx r6 = p000.AbstractC0856u1.f10547
            android.content.res.Configuration r7 = r1.getConfiguration()
            q4 r19 = r6.mo171(r7)
            m02 r6 = p000.yp1.f12763
            q4 r20 = r6.mo171(r5)
            m02 r5 = p000.AbstractC0856u1.f10551
            android.view.View r6 = r1.getView()
            q4 r21 = r5.mo171(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            q4 r22 = r8.mo171(r5)
            m02 r5 = p000.AbstractC0292fo.f4048
            g92 r6 = r1.getViewConfiguration()
            q4 r23 = r5.mo171(r6)
            yx r5 = p000.ff0.f3919
            q4 r24 = r5.mo171(r12)
            q4[] r5 = new p000.C0711q4[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            nn r6 = new nn
            r6.<init>(r1, r0, r2)
            r7 = 1317454175(0x4e86c15f, float:1.1304099E9)
            an r6 = p000.kn0.m3349(r7, r6, r3)
            r7 = 56
            p000.AbstractC0978xb.m6579(r5, r6, r3, r7)
            goto L242
        L23f:
            r3.m6078()
        L242:
            bl1 r3 = r3.m6101()
            if (r3 == 0) goto L24f
            nn r5 = new nn
            r5.<init>(r0, r1, r2, r4)
            r3.f1780 = r5
        L24f:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4553() {
            r3 = this;
            int r0 = r3.f8616
            int r0 = r0 + (-1)
            r3.f8616 = r0
            if (r0 >= 0) goto L12
            java.lang.String r0 = "ComposeViewContext"
            java.lang.String r1 = "View count has dropped below 0"
            android.util.Log.e(r0, r1)
            r0 = 0
            r3.f8616 = r0
        L12:
            int r0 = r3.f8616
            if (r0 != 0) goto L2d
            android.view.View r0 = r3.f8596
            android.content.Context r1 = r0.getContext()
            on r2 = r3.f8617
            r1.unregisterComponentCallbacks(r2)
            lm0 r3 = r3.f8614
            r3.getClass()
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r3.removeOnWindowFocusChangeListener(r2)
        L2d:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4554() {
            r3 = this;
            int r0 = r3.f8616
            r1 = 1
            int r0 = r0 + r1
            r3.f8616 = r0
            if (r0 != r1) goto L34
            android.view.View r0 = r3.f8596
            android.content.Context r1 = r0.getContext()
            on r2 = r3.f8617
            r1.registerComponentCallbacks(r2)
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r3.m4555(r1)
            boolean r1 = r0.hasWindowFocus()
            lm0 r3 = r3.f8614
            x91 r3 = r3.f6712
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.setValue(r1)
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r3.addOnWindowFocusChangeListener(r2)
        L34:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m4555(android.content.res.Configuration r4) {
            r3 = this;
            android.content.res.Configuration r0 = r3.f8603
            int r0 = r0.updateFrom(r4)
            if (r0 == 0) goto L6e
            n r1 = r3.f8601
            java.lang.Object r1 = r1.f7336
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L32
            r1.remove()
            goto L16
        L32:
            p000.C1080.m7264()
            return
        L36:
            g21 r1 = r3.f8604
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r4)
            r1.setValue(r2)
            y21 r4 = r3.f8602
            monitor-enter(r4)
            java.lang.Object r1 = r4.f12428     // Catch: java.lang.Throwable -> L6b
            n11 r1 = (p000.n11) r1     // Catch: java.lang.Throwable -> L6b
            r1.m3938()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r4)
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r4 = r4 & r0
            if (r4 == 0) goto L5f
            g21 r4 = r3.f8610
            android.view.View r1 = r3.f8596
            android.content.Context r1 = r1.getContext()
            g50 r1 = p000.jx0.m3050(r1)
            r4.setValue(r1)
        L5f:
            r4 = -1342235264(0xffffffffafff1d80, float:-4.640519E-10)
            r4 = r4 & r0
            if (r4 == 0) goto L6e
            lm0 r3 = r3.f8614
            r3.getClass()
            return
        L6b:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L6e:
            return
    }
}
