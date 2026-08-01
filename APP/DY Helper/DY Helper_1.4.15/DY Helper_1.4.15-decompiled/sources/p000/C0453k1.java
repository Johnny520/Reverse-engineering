package p000;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0453k1 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5699;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5700;

    public /* synthetic */ C0453k1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5699 = r1
            r0.f5700 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    public C0453k1(p000.br1 r1, p000.ViewOnAttachStateChangeListenerC0496l1 r2) {
            r0 = this;
            r2 = 0
            r0.f5699 = r2
            r0.f5700 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r15 = this;
            int r0 = r15.f5699
            switch(r0) {
                case 0: goto L1e8;
                case 1: goto L118;
                case 2: goto L10e;
                case 3: goto Lf6;
                case 4: goto Le2;
                case 5: goto Lc6;
                case 6: goto La5;
                case 7: goto L8b;
                case 8: goto L12;
                default: goto L5;
            }
        L5:
            android.view.inputmethod.BaseInputConnection r0 = new android.view.inputmethod.BaseInputConnection
            java.lang.Object r15 = r15.f5700
            j32 r15 = (p000.j32) r15
            android.view.View r15 = r15.f5305
            r1 = 0
            r0.<init>(r15, r1)
            return r0
        L12:
            java.lang.Object r15 = r15.f5700
            h12 r15 = (p000.h12) r15
            kq0 r15 = r15.m2343()
            yp0 r0 = r15.f6080
            java.util.List r1 = r0.m7000()
            h21 r1 = (p000.h21) r1
            k21 r1 = r1.f4540
            int r1 = r1.f5718
            int r2 = r15.f6092
            if (r2 == r1) goto L88
            b21 r15 = r15.f6084
            java.lang.Object[] r1 = r15.f1429
            long[] r15 = r15.f1427
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 7
            r4 = 0
            if (r2 < 0) goto L71
            r5 = r4
        L38:
            r6 = r15[r5]
            long r8 = ~r6
            long r8 = r8 << r3
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L6c
            int r8 = r5 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L51:
            if (r10 >= r8) goto L6a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L66
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            dq0 r11 = (p000.dq0) r11
            r12 = 1
            r11.f3238 = r12
        L66:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L51
        L6a:
            if (r8 != r9) goto L71
        L6c:
            if (r5 == r2) goto L71
            int r5 = r5 + 1
            goto L38
        L71:
            yp0 r15 = r0.f12750
            if (r15 == 0) goto L7f
            bq0 r15 = r0.f12734
            boolean r15 = r15.f1804
            if (r15 != 0) goto L88
            p000.yp0.m6967(r0, r4, r3)
            goto L88
        L7f:
            boolean r15 = r0.m7002()
            if (r15 != 0) goto L88
            p000.yp0.m6968(r0, r4, r3)
        L88:
            s62 r15 = p000.s62.f9751
            return r15
        L8b:
            java.lang.Object r15 = r15.f5700
            ol1 r15 = (p000.ol1) r15
            r0 = 0
            r15.f8144 = r0
            java.lang.String r0 = "OnPositionedDispatch"
            android.os.Trace.beginSection(r0)
            r15.m4249()     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            s62 r15 = p000.s62.f9751
            return r15
        La0:
            r15 = move-exception
            android.os.Trace.endSection()
            throw r15
        La5:
            java.lang.Object r15 = r15.f5700
            lr0 r15 = (p000.lr0) r15
            n r15 = r15.f6748
            java.lang.Object r15 = r15.f7336
            vw0 r15 = (p000.vw0) r15
            boolean r0 = r15.f11452
            if (r0 == 0) goto Lb4
            goto Lc3
        Lb4:
            boolean r0 = r15.f11453
            if (r0 == 0) goto Lbd
            java.lang.String r0 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            p000.qi1.m4885(r0)
        Lbd:
            r15.m6282()
            r0 = 1
            r15.f11453 = r0
        Lc3:
            s62 r15 = p000.s62.f9751
            return r15
        Lc6:
            java.lang.Object r15 = r15.f5700
            dq0 r15 = (p000.dq0) r15
            x91 r0 = r15.f3240
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ldf
            zn r15 = r15.f3237
            if (r15 == 0) goto Ldf
            r15.m7192()
        Ldf:
            s62 r15 = p000.s62.f9751
            return r15
        Le2:
            java.lang.Object r15 = r15.f5700
            yp0 r15 = (p000.yp0) r15
            bq0 r15 = r15.f12734
            ox0 r0 = r15.f1815
            r1 = 1
            r0.f8318 = r1
            jw0 r15 = r15.f1816
            if (r15 == 0) goto Lf3
            r15.f5613 = r1
        Lf3:
            s62 r15 = p000.s62.f9751
            return r15
        Lf6:
            java.lang.Object r15 = r15.f5700
            n5 r15 = (p000.C0574n5) r15
            java.lang.Object r15 = r15.f7387
            android.view.View r15 = (android.view.View) r15
            android.content.Context r15 = r15.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r15 = r15.getSystemService(r0)
            r15.getClass()
            android.view.inputmethod.InputMethodManager r15 = (android.view.inputmethod.InputMethodManager) r15
            return r15
        L10e:
            java.lang.Object r15 = r15.f5700
            c50 r15 = (p000.c50) r15
            r15.m1135()
            s62 r15 = p000.s62.f9751
            return r15
        L118:
            java.lang.Object r15 = r15.f5700
            pn r15 = (p000.C0693pn) r15
            r0 = 0
            boolean r2 = p000.bn0.m985(r0, r0)
            android.view.View r15 = r15.f8596
            if (r2 == 0) goto L1d2
            android.content.Context r15 = r15.getContext()
            r0 = r15
        L12b:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L147
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L135
            goto L14e
        L135:
            boolean r1 = r0 instanceof android.inputmethodservice.InputMethodService
            if (r1 == 0) goto L13a
            goto L14e
        L13a:
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L13f
            goto L14e
        L13f:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            if (r1 != 0) goto L149
        L147:
            r0 = r2
            goto L14e
        L149:
            android.content.Context r0 = r0.getBaseContext()
            goto L12b
        L14e:
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L19d
            uc2 r15 = p000.vc2.f11238
            r15.getClass()
            wc2 r15 = p000.uc2.f10698
            r15.getClass()
            r4 = r0
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 < r6) goto L16d
            yc2 r5 = p000.yc2.f12578
            goto L16f
        L16d:
            xn0 r5 = p000.xn0.f12224
        L16f:
            x r15 = r15.f11683
            tc2 r15 = r5.mo6611(r4, r15)
            android.graphics.Rect r4 = r15.m5629()
            int r4 = r4.width()
            android.graphics.Rect r15 = r15.m5629()
            int r15 = r15.height()
            long r4 = (long) r4
            long r3 = r4 << r3
            long r5 = (long) r15
            long r1 = r1 & r5
            long r1 = r1 | r3
            as r15 = p000.jx0.m3035(r0)
            long r3 = p000.AbstractC0782s1.m5322(r1)
            long r3 = r15.mo593(r3)
            cs r15 = new cs
            r15.<init>(r1, r3)
            goto L1e7
        L19d:
            android.content.res.Resources r0 = r15.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            as r15 = p000.jx0.m3035(r15)
            int r4 = r0.screenWidthDp
            float r4 = (float) r4
            int r0 = r0.screenHeightDp
            float r0 = (float) r0
            long r4 = p000.AbstractC0782s1.m5324(r4, r0)
            long r6 = r15.mo584(r4)
            long r8 = r6 >> r3
            int r15 = (int) r8
            float r15 = java.lang.Float.intBitsToFloat(r15)
            int r15 = (int) r15
            long r6 = r6 & r1
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (int) r0
            long r6 = (long) r15
            long r6 = r6 << r3
            long r8 = (long) r0
            long r0 = r8 & r1
            long r0 = r0 | r6
            cs r15 = new cs
            r15.<init>(r0, r4)
            goto L1e7
        L1d2:
            android.content.Context r15 = r15.getContext()
            as r15 = p000.jx0.m3035(r15)
            long r2 = p000.AbstractC0782s1.m5322(r0)
            long r2 = r15.mo593(r2)
            cs r15 = new cs
            r15.<init>(r0, r2)
        L1e7:
            return r15
        L1e8:
            java.lang.Object r15 = r15.f5700
            br1 r15 = (p000.br1) r15
            r15.getClass()
            s62 r15 = p000.s62.f9751
            return r15
    }
}
