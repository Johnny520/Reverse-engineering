package p000;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0269f1 extends p000.C0568n {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.ViewOnAttachStateChangeListenerC0496l1 f3719;

    public C0269f1(p000.ViewOnAttachStateChangeListenerC0496l1 r1) {
            r0 = this;
            r0.f3719 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.C0568n
    /* JADX INFO: renamed from: ξ */
    public final void mo1989(int r1, p000.C1128 r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            l1 r0 = r0.f3719
            r0.m3449(r1, r2, r3, r4)
            return
    }

    @Override // p000.C0568n
    /* JADX INFO: renamed from: ο */
    public final p000.C1128 mo1990(int r50) {
            r49 = this;
            r0 = r50
            r1 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r3 = r49
            l1 r3 = r3.f3719
            android.view.accessibility.AccessibilityManager r4 = r3.f6361
            androidx.compose.ui.platform.AndroidComposeView r5 = r3.f6358
            pn r6 = r5.getComposeViewContext()
            hr0 r6 = r6.f8598
            jr0 r6 = r6.mo192()
            cr0 r6 = r6.f5558
            cr0 r7 = p000.cr0.f2724
            if (r6 != r7) goto L30
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L74
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            э r8 = new э
            r8.<init>(r0)
            goto Lca9
        L30:
            sm0 r6 = r3.m3457()
            java.lang.Object r6 = r6.m5525(r0)
            ds1 r6 = (p000.ds1) r6
            if (r6 != 0) goto L4d
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L74
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            э r8 = new э
            r8.<init>(r0)
            goto Lca9
        L4d:
            bs1 r7 = r6.f3268
            xr1 r9 = r7.m1015()
            is1 r10 = p000.fs1.f4111
            b21 r9 = r9.f12268
            java.lang.Object r9 = r9.m695(r10)
            if (r9 != 0) goto L5e
            r9 = 0
        L5e:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = p000.ln0.m3626(r9, r10)
            r10 = 34
            if (r9 == 0) goto L77
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r10) goto L71
            boolean r12 = p000.AbstractC1117.m7297(r4)
            goto L72
        L71:
            r12 = 1
        L72:
            if (r12 != 0) goto L77
        L74:
            r8 = 0
            goto Lca9
        L77:
            android.view.accessibility.AccessibilityNodeInfo r12 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            э r13 = new э
            r13.<init>(r12)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 0
            if (r14 < r10) goto L8b
            p000.AbstractC1117.m7299(r12, r9)
        L88:
            r49 = 0
            goto La6
        L8b:
            android.os.Bundle r1 = r12.getExtras()
            if (r1 == 0) goto L88
            r49 = 0
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            int r17 = r1.getInt(r8, r15)
            r17 = r17 & (-65)
            if (r9 == 0) goto La0
            r9 = 64
            goto La1
        La0:
            r9 = r15
        La1:
            r9 = r17 | r9
            r1.putInt(r8, r9)
        La6:
            r1 = -1
            if (r0 != r1) goto Lbc
            android.view.ViewParent r8 = r5.getParentForAccessibility()
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto Lb4
            android.view.View r8 = (android.view.View) r8
            goto Lb6
        Lb4:
            r8 = r49
        Lb6:
            r13.f13479 = r1
            r12.setParent(r8)
            goto Le3
        Lbc:
            bs1 r8 = r7.m1016()
            if (r8 == 0) goto Lc9
            int r8 = r8.f1826
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto Lcb
        Lc9:
            r8 = r49
        Lcb:
            if (r8 == 0) goto Lcaf
            int r8 = r8.intValue()
            es1 r9 = r5.getSemanticsOwner()
            bs1 r9 = r9.m1953()
            int r9 = r9.f1826
            if (r8 != r9) goto Lde
            r8 = r1
        Lde:
            r13.f13479 = r8
            r12.setParent(r5, r8)
        Le3:
            r13.f13480 = r0
            r12.setSource(r5, r0)
            ym0 r6 = r6.f3269
            int r8 = r6.f12684
            float r8 = (float) r8
            int r9 = r6.f12685
            float r9 = (float) r9
            int r15 = r6.f12686
            float r15 = (float) r15
            int r6 = r6.f12687
            float r6 = (float) r6
            android.graphics.Rect r6 = r3.m3447(r8, r9, r15, r6)
            r12.setBoundsInScreen(r6)
            l11 r6 = r3.f6354
            kz1 r8 = r3.f6370
            android.content.Context r9 = r5.getContext()
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r15 = "android.view.View"
            r13.m7358(r15)
            xr1 r15 = r7.f1824
            b21 r11 = r15.f12268
            is1 r1 = p000.fs1.f4089
            boolean r1 = r11.m691(r1)
            if (r1 == 0) goto L11f
            java.lang.String r1 = "android.widget.EditText"
            r13.m7358(r1)
        L11f:
            is1 r1 = p000.fs1.f4085
            boolean r1 = r11.m691(r1)
            if (r1 == 0) goto L12c
            java.lang.String r1 = "android.widget.TextView"
            r13.m7358(r1)
        L12c:
            is1 r1 = p000.fs1.f4120
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L136
            r1 = r49
        L136:
            so1 r1 = (p000.so1) r1
            if (r1 == 0) goto L191
            int r10 = r1.f9982
            boolean r22 = r7.m1019()
            if (r22 != 0) goto L152
            r22 = r2
            r2 = 4
            java.util.List r21 = p000.bs1.m1005(r2, r7)
            boolean r21 = r21.isEmpty()
            r23 = r4
            if (r21 == 0) goto L195
            goto L157
        L152:
            r22 = r2
            r2 = 4
            r23 = r4
        L157:
            java.lang.String r4 = "AccessibilityNodeInfo.roleDescription"
            if (r10 != r2) goto L16a
            r2 = 2131689611(0x7f0f008b, float:1.9008242E38)
            java.lang.String r2 = r9.getString(r2)
            android.os.Bundle r10 = r12.getExtras()
            r10.putCharSequence(r4, r2)
            goto L195
        L16a:
            r2 = 2
            if (r10 != r2) goto L17c
            r2 = 2131689610(0x7f0f008a, float:1.900824E38)
            java.lang.String r2 = r9.getString(r2)
            android.os.Bundle r10 = r12.getExtras()
            r10.putCharSequence(r4, r2)
            goto L195
        L17c:
            java.lang.String r2 = p000.v71.m6047(r10)
            r4 = 5
            if (r10 != r4) goto L18d
            boolean r4 = r7.m1021()
            if (r4 != 0) goto L18d
            boolean r4 = r15.f12270
            if (r4 == 0) goto L195
        L18d:
            r13.m7358(r2)
            goto L195
        L191:
            r22 = r2
            r23 = r4
        L195:
            android.content.Context r2 = r5.getContext()
            java.lang.String r2 = r2.getPackageName()
            r12.setPackageName(r2)
            boolean r2 = p000.h62.m2432(r7)
            r12.setImportantForAccessibility(r2)
            r2 = 34
            if (r14 < r2) goto L1b1
            boolean r2 = p000.AbstractC1117.m7297(r23)
        L1af:
            r4 = 4
            goto L1b3
        L1b1:
            r2 = 1
            goto L1af
        L1b3:
            java.util.List r10 = p000.bs1.m1005(r4, r7)
            int r4 = r10.size()
            r19 = r2
            r23 = r8
            r2 = 0
            r14 = 0
        L1c1:
            android.view.accessibility.AccessibilityNodeInfo r8 = r13.f13478
            if (r14 >= r4) goto L234
            java.lang.Object r24 = r10.get(r14)
            r25 = r4
            r4 = r24
            bs1 r4 = (p000.bs1) r4
            r24 = r10
            sm0 r10 = r3.m3457()
            r26 = r14
            int r14 = r4.f1826
            boolean r10 = r10.m5524(r14)
            if (r10 == 0) goto L22d
            androidx.compose.ui.platform.AndroidViewsHandler r10 = r5.getAndroidViewsHandler$ui()
            java.util.HashMap r10 = r10.getLayoutNodeToHolder()
            yp0 r4 = r4.f1823
            java.lang.Object r4 = r10.get(r4)
            androidx.compose.ui.viewinterop.AndroidViewHolder r4 = (androidx.compose.p001ui.viewinterop.AndroidViewHolder) r4
            r10 = -1
            if (r14 != r10) goto L1f3
            goto L22d
        L1f3:
            if (r4 == 0) goto L1f9
            r8.addChild(r4)
            goto L228
        L1f9:
            sm0 r4 = r3.m3457()
            java.lang.Object r4 = r4.m5525(r14)
            ds1 r4 = (p000.ds1) r4
            if (r4 == 0) goto L220
            bs1 r4 = r4.f3268
            if (r4 == 0) goto L220
            xr1 r4 = r4.m1015()
            is1 r8 = p000.fs1.f4111
            b21 r4 = r4.f12268
            java.lang.Object r4 = r4.m695(r8)
            if (r4 != 0) goto L219
            r4 = r49
        L219:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r8)
            goto L221
        L220:
            r4 = 0
        L221:
            if (r19 != 0) goto L225
            if (r4 != 0) goto L228
        L225:
            r12.addChild(r5, r14)
        L228:
            r6.m3468(r14, r2)
            int r2 = r2 + 1
        L22d:
            int r14 = r26 + 1
            r10 = r24
            r4 = r25
            goto L1c1
        L234:
            int r2 = r3.f6365
            if (r0 != r2) goto L242
            r2 = 1
            r8.setAccessibilityFocused(r2)
            ч r2 = p000.C1125.f13470
            r13.m7354(r2)
            goto L24b
        L242:
            r2 = 0
            r8.setAccessibilityFocused(r2)
            ч r2 = p000.C1125.f13469
            r13.m7354(r2)
        L24b:
            g4 r2 = p000.kn0.m3339(r7)
            if (r2 == 0) goto L4fe
            r5.getFontFamilyResolver()
            yr r27 = r5.getDensity()
            m6 r10 = r3.f6350
            android.text.SpannableString r14 = new android.text.SpannableString
            java.lang.String r4 = r2.f4228
            r30 = r5
            java.util.List r5 = r2.f4227
            r14.<init>(r4)
            java.util.ArrayList r2 = r2.f4229
            r31 = r4
            if (r2 == 0) goto L38e
            int r4 = r2.size()
            r33 = r3
            r3 = 0
        L272:
            if (r3 >= r4) goto L37d
            java.lang.Object r24 = r2.get(r3)
            r34 = r2
            r2 = r24
            f4 r2 = (p000.C0272f4) r2
            r35 = r3
            java.lang.Object r3 = r2.f3745
            ux1 r3 = (p000.ux1) r3
            r36 = r4
            int r4 = r2.f3746
            int r2 = r2.f3747
            r37 = r13
            f32 r13 = r3.f10996
            r38 = r1
            long r0 = r13.mo2033()
            r39 = r6
            r13 = r7
            long r6 = r3.f10997
            r25 = r6
            d60 r6 = r3.f10998
            b60 r7 = r3.f10999
            r40 = r6
            g32 r6 = r3.f11005
            r41 = r13
            av0 r13 = r3.f11006
            r43 = r11
            r42 = r12
            long r11 = r3.f11007
            r44 = r11
            c32 r11 = r3.f11008
            f32 r3 = r3.f10996
            r46 = r8
            r12 = r9
            long r8 = r3.mo2033()
            boolean r8 = p000.C0114ci.m1192(r0, r8)
            r47 = 16
            if (r8 == 0) goto L2c3
            goto L2d0
        L2c3:
            int r3 = (r0 > r47 ? 1 : (r0 == r47 ? 0 : -1))
            if (r3 == 0) goto L2cd
            oi r3 = new oi
            r3.<init>(r0)
            goto L2d0
        L2cd:
            xn0 r0 = p000.xn0.f12221
            r3 = r0
        L2d0:
            long r0 = r3.mo2033()
            p000.p91.m4407(r14, r0, r4, r2)
            r29 = r2
            r28 = r4
            r24 = r14
            p000.p91.m4408(r24, r25, r27, r28, r29)
            r0 = r24
            r1 = r28
            if (r40 != 0) goto L2ec
            if (r7 == 0) goto L2e9
            goto L2ec
        L2e9:
            r3 = 33
            goto L328
        L2ec:
            if (r40 != 0) goto L2f1
            d60 r3 = p000.d60.f2921
            goto L2f3
        L2f1:
            r3 = r40
        L2f3:
            if (r7 == 0) goto L2f8
            int r4 = r7.f1499
            goto L2f9
        L2f8:
            r4 = 0
        L2f9:
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            d60 r8 = p000.d60.f2920
            int r3 = r3.f2924
            int r8 = r8.f2924
            int r3 = p000.ln0.m3632(r3, r8)
            if (r3 < 0) goto L30a
            r3 = 1
        L308:
            r8 = 1
            goto L30c
        L30a:
            r3 = 0
            goto L308
        L30c:
            if (r4 != r8) goto L310
            r4 = 1
            goto L311
        L310:
            r4 = 0
        L311:
            if (r4 == 0) goto L317
            if (r3 == 0) goto L317
            r3 = 3
            goto L320
        L317:
            if (r3 == 0) goto L31b
            r3 = 1
            goto L320
        L31b:
            if (r4 == 0) goto L31f
            r3 = 2
            goto L320
        L31f:
            r3 = 0
        L320:
            r7.<init>(r3)
            r3 = 33
            r0.setSpan(r7, r1, r2, r3)
        L328:
            if (r11 == 0) goto L344
            int r4 = r11.f1960
            r7 = r4 | 1
            if (r7 != r4) goto L338
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r0.setSpan(r7, r1, r2, r3)
        L338:
            r7 = r4 | 2
            if (r7 != r4) goto L344
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            r0.setSpan(r4, r1, r2, r3)
        L344:
            if (r6 == 0) goto L350
            android.text.style.ScaleXSpan r4 = new android.text.style.ScaleXSpan
            float r6 = r6.f4225
            r4.<init>(r6)
            r0.setSpan(r4, r1, r2, r3)
        L350:
            p000.p91.m4409(r0, r13, r1, r2)
            int r4 = (r44 > r47 ? 1 : (r44 == r47 ? 0 : -1))
            if (r4 == 0) goto L363
            android.text.style.BackgroundColorSpan r4 = new android.text.style.BackgroundColorSpan
            int r6 = p000.kn0.m3355(r44)
            r4.<init>(r6)
            r0.setSpan(r4, r1, r2, r3)
        L363:
            int r3 = r35 + 1
            r14 = r0
            r9 = r12
            r2 = r34
            r4 = r36
            r13 = r37
            r1 = r38
            r6 = r39
            r7 = r41
            r12 = r42
            r11 = r43
            r8 = r46
            r0 = r50
            goto L272
        L37d:
            r38 = r1
            r39 = r6
            r41 = r7
            r46 = r8
            r43 = r11
            r42 = r12
            r37 = r13
            r0 = r14
            r12 = r9
            goto L391
        L38e:
            r33 = r3
            goto L37d
        L391:
            int r1 = r31.length()
            jz r2 = p000.C0450jz.f5672
            if (r5 == 0) goto L3c7
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r5.size()
            r3.<init>(r4)
            int r4 = r5.size()
            r6 = 0
        L3a7:
            if (r6 >= r4) goto L3c8
            java.lang.Object r7 = r5.get(r6)
            r8 = r7
            f4 r8 = (p000.C0272f4) r8
            java.lang.Object r9 = r8.f3745
            boolean r9 = r9 instanceof p000.q72
            if (r9 == 0) goto L3c4
            int r9 = r8.f3746
            int r8 = r8.f3747
            r11 = 0
            boolean r8 = p000.AbstractC0346h4.m2359(r11, r1, r9, r8)
            if (r8 == 0) goto L3c4
            r3.add(r7)
        L3c4:
            int r6 = r6 + 1
            goto L3a7
        L3c7:
            r3 = r2
        L3c8:
            int r1 = r3.size()
            r4 = 0
        L3cd:
            if (r4 >= r1) goto L3f8
            java.lang.Object r6 = r3.get(r4)
            f4 r6 = (p000.C0272f4) r6
            java.lang.Object r7 = r6.f3745
            q72 r7 = (p000.q72) r7
            int r8 = r6.f3746
            int r6 = r6.f3747
            boolean r9 = r7 instanceof p000.q72
            if (r9 == 0) goto L3f4
            android.text.style.TtsSpan$VerbatimBuilder r9 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r7 = r7.f8902
            r9.<init>(r7)
            android.text.style.TtsSpan r7 = r9.build()
            r9 = 33
            r0.setSpan(r7, r8, r6, r9)
            int r4 = r4 + 1
            goto L3cd
        L3f4:
            p000.C1080.m7272()
            return r49
        L3f8:
            int r1 = r31.length()
            if (r5 == 0) goto L42c
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r5.size()
            r3.<init>(r4)
            int r4 = r5.size()
            r6 = 0
        L40c:
            if (r6 >= r4) goto L42d
            java.lang.Object r7 = r5.get(r6)
            r8 = r7
            f4 r8 = (p000.C0272f4) r8
            java.lang.Object r9 = r8.f3745
            boolean r9 = r9 instanceof p000.a72
            if (r9 == 0) goto L429
            int r9 = r8.f3746
            int r8 = r8.f3747
            r11 = 0
            boolean r8 = p000.AbstractC0346h4.m2359(r11, r1, r9, r8)
            if (r8 == 0) goto L429
            r3.add(r7)
        L429:
            int r6 = r6 + 1
            goto L40c
        L42c:
            r3 = r2
        L42d:
            int r1 = r3.size()
            r4 = 0
        L432:
            if (r4 >= r1) goto L460
            java.lang.Object r6 = r3.get(r4)
            f4 r6 = (p000.C0272f4) r6
            java.lang.Object r7 = r6.f3745
            a72 r7 = (p000.a72) r7
            int r8 = r6.f3746
            int r6 = r6.f3747
            java.lang.Object r9 = r10.f6967
            java.util.WeakHashMap r9 = (java.util.WeakHashMap) r9
            java.lang.Object r11 = r9.get(r7)
            if (r11 != 0) goto L456
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r13 = r7.f93
            r11.<init>(r13)
            r9.put(r7, r11)
        L456:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r9 = 33
            r0.setSpan(r11, r8, r6, r9)
            int r4 = r4 + 1
            goto L432
        L460:
            int r1 = r31.length()
            if (r5 == 0) goto L494
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r5.size()
            r2.<init>(r3)
            int r3 = r5.size()
            r4 = 0
        L474:
            if (r4 >= r3) goto L494
            java.lang.Object r6 = r5.get(r4)
            r7 = r6
            f4 r7 = (p000.C0272f4) r7
            java.lang.Object r8 = r7.f3745
            boolean r8 = r8 instanceof p000.hs0
            if (r8 == 0) goto L491
            int r8 = r7.f3746
            int r7 = r7.f3747
            r11 = 0
            boolean r7 = p000.AbstractC0346h4.m2359(r11, r1, r8, r7)
            if (r7 == 0) goto L491
            r2.add(r6)
        L491:
            int r4 = r4 + 1
            goto L474
        L494:
            int r1 = r2.size()
            r3 = 0
        L499:
            if (r3 >= r1) goto L4f5
            java.lang.Object r4 = r2.get(r3)
            f4 r4 = (p000.C0272f4) r4
            int r5 = r4.f3746
            java.lang.Object r6 = r4.f3745
            int r7 = r4.f3747
            if (r5 == r7) goto L4f0
            r8 = r6
            hs0 r8 = (p000.hs0) r8
            boolean r9 = r8 instanceof p000.gs0
            if (r9 == 0) goto L4d6
            f4 r4 = new f4
            r6.getClass()
            gs0 r6 = (p000.gs0) r6
            r4.<init>(r5, r7, r6)
            java.lang.Object r8 = r10.f6968
            java.util.WeakHashMap r8 = (java.util.WeakHashMap) r8
            java.lang.Object r9 = r8.get(r4)
            if (r9 != 0) goto L4ce
            android.text.style.URLSpan r9 = new android.text.style.URLSpan
            java.lang.String r6 = r6.f4440
            r9.<init>(r6)
            r8.put(r4, r9)
        L4ce:
            android.text.style.URLSpan r9 = (android.text.style.URLSpan) r9
            r4 = 33
            r0.setSpan(r9, r5, r7, r4)
            goto L4f2
        L4d6:
            java.lang.Object r6 = r10.f6969
            java.util.WeakHashMap r6 = (java.util.WeakHashMap) r6
            java.lang.Object r9 = r6.get(r4)
            if (r9 != 0) goto L4e8
            dn r9 = new dn
            r9.<init>(r8)
            r6.put(r4, r9)
        L4e8:
            android.text.style.ClickableSpan r9 = (android.text.style.ClickableSpan) r9
            r4 = 33
            r0.setSpan(r9, r5, r7, r4)
            goto L4f2
        L4f0:
            r4 = 33
        L4f2:
            int r3 = r3 + 1
            goto L499
        L4f5:
            java.lang.CharSequence r0 = p000.ViewOnAttachStateChangeListenerC0496l1.m3438(r0)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            r1 = r46
            goto L512
        L4fe:
            r38 = r1
            r33 = r3
            r30 = r5
            r39 = r6
            r41 = r7
            r43 = r11
            r42 = r12
            r37 = r13
            r12 = r9
            r0 = r49
            r1 = r8
        L512:
            r1.setText(r0)
            is1 r0 = p000.fs1.f4094
            r2 = r43
            boolean r3 = r2.m691(r0)
            if (r3 == 0) goto L535
            r3 = r42
            r8 = 1
            r3.setContentInvalid(r8)
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L52d
            r0 = r49
        L52d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setError(r0)
        L532:
            r13 = r41
            goto L538
        L535:
            r3 = r42
            goto L532
        L538:
            java.lang.String r0 = p000.kn0.m3338(r13, r12)
            r1.setStateDescription(r0)
            boolean r0 = p000.kn0.m3337(r13)
            r3.setCheckable(r0)
            is1 r0 = p000.fs1.f4092
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L550
            r0 = r49
        L550:
            r42 r0 = (p000.r42) r0
            if (r0 == 0) goto L565
            r42 r4 = p000.r42.f9260
            if (r0 != r4) goto L55d
            r8 = 1
            r1.setChecked(r8)
            goto L565
        L55d:
            r42 r4 = p000.r42.f9261
            if (r0 != r4) goto L565
            r11 = 0
            r1.setChecked(r11)
        L565:
            is1 r0 = p000.fs1.f4091
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L56f
            r0 = r49
        L56f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L58c
            boolean r0 = r0.booleanValue()
            if (r38 != 0) goto L57d
            r4 = r38
            r6 = 4
            goto L588
        L57d:
            r4 = r38
            int r5 = r4.f9982
            r6 = 4
            if (r5 != r6) goto L588
            r1.setSelected(r0)
            goto L58f
        L588:
            r1.setChecked(r0)
            goto L58f
        L58c:
            r4 = r38
            r6 = 4
        L58f:
            boolean r0 = r15.f12270
            if (r0 == 0) goto L59d
            java.util.List r0 = p000.bs1.m1005(r6, r13)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b7
        L59d:
            is1 r0 = p000.fs1.f4098
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L5a7
            r0 = r49
        L5a7:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5b2
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L5b4
        L5b2:
            r0 = r49
        L5b4:
            r1.setContentDescription(r0)
        L5b7:
            is1 r0 = p000.fs1.f4121
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L5c1
            r0 = r49
        L5c1:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5ea
            r5 = r13
        L5c6:
            if (r5 == 0) goto L5e4
            xr1 r6 = r5.f1824
            is1 r7 = p000.gs1.f4442
            b21 r8 = r6.f12268
            boolean r8 = r8.m691(r7)
            if (r8 == 0) goto L5df
            java.lang.Object r5 = r6.m6780(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L5e5
        L5df:
            bs1 r5 = r5.m1016()
            goto L5c6
        L5e4:
            r5 = 0
        L5e5:
            if (r5 == 0) goto L5ea
            r3.setViewIdResourceName(r0)
        L5ea:
            is1 r0 = p000.fs1.f4105
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L5f4
            r0 = r49
        L5f4:
            s62 r0 = (p000.s62) r0
            r8 = 1
            if (r0 == 0) goto L5fc
            r1.setHeading(r8)
        L5fc:
            is1 r0 = p000.fs1.f4106
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L606
            r0 = r49
        L606:
            s62 r0 = (p000.s62) r0
            if (r0 == 0) goto L60d
            r3.setTextEntryKey(r8)
        L60d:
            r0 = r50
            r10 = -1
            if (r0 == r10) goto L627
            int r5 = r13.f1826
            r6 = r39
            int r5 = r6.m3466(r5)
            if (r5 == r10) goto L620
            r3.setDrawingOrder(r5)
            goto L627
        L620:
            java.lang.String r5 = "AccessibilityDelegate"
            java.lang.String r6 = "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"
            android.util.Log.w(r5, r6)
        L627:
            is1 r5 = p000.fs1.f4093
            boolean r5 = r2.m691(r5)
            r3.setPassword(r5)
            is1 r5 = p000.fs1.f4095
            java.lang.Object r5 = r2.m695(r5)
            if (r5 != 0) goto L63a
            r5 = r49
        L63a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = p000.ln0.m3626(r5, r6)
            r3.setEditable(r5)
            is1 r5 = p000.fs1.f4096
            java.lang.Object r5 = r2.m695(r5)
            if (r5 != 0) goto L64d
            r5 = r49
        L64d:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L656
            int r5 = r5.intValue()
            goto L657
        L656:
            r5 = -1
        L657:
            r3.setMaxTextLength(r5)
            boolean r5 = p000.kn0.m3362(r13)
            r1.setEnabled(r5)
            is1 r5 = p000.fs1.f4109
            boolean r7 = r2.m691(r5)
            r1.setFocusable(r7)
            boolean r7 = r3.isFocusable()
            if (r7 == 0) goto L698
            java.lang.Object r7 = r15.m6780(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.setFocused(r7)
            boolean r7 = r3.isFocused()
            if (r7 == 0) goto L68f
            r7 = r37
            r8 = 2
            r7.m7353(r8)
            r8 = r33
            r8.f6366 = r0
        L68d:
            r9 = 1
            goto L69d
        L68f:
            r8 = r33
            r7 = r37
            r9 = 1
            r7.m7353(r9)
            goto L69d
        L698:
            r8 = r33
            r7 = r37
            goto L68d
        L69d:
            boolean r10 = p000.h62.m2431(r13)
            r10 = r10 ^ r9
            r1.setVisibleToUser(r10)
            boolean r9 = r13.m1019()
            if (r9 == 0) goto L6b3
            bs1 r41 = r13.m1016()
            r41.getClass()
            goto L6b5
        L6b3:
            r41 = r13
        L6b5:
            ml1 r9 = r41.m1017()
            float r10 = r9.f7200
            float r11 = r9.f7202
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L6c3
            r10 = 1
            goto L6c4
        L6c3:
            r10 = 0
        L6c4:
            float r11 = r9.f7201
            float r9 = r9.f7203
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 < 0) goto L6ce
            r9 = 1
            goto L6cf
        L6ce:
            r9 = 0
        L6cf:
            r9 = r9 | r10
            if (r9 == 0) goto L6d7
            r11 = 0
            r1.setVisibleToUser(r11)
            goto L6d8
        L6d7:
            r11 = 0
        L6d8:
            is1 r9 = p000.fs1.f4108
            java.lang.Object r9 = r2.m695(r9)
            if (r9 != 0) goto L6e2
            r9 = r49
        L6e2:
            if (r9 != 0) goto Lcaa
            r1.setClickable(r11)
            is1 r9 = p000.wr1.f11813
            java.lang.Object r9 = r2.m695(r9)
            if (r9 != 0) goto L6f1
            r9 = r49
        L6f1:
            м r9 = (p000.C1114) r9
            if (r9 == 0) goto L746
            is1 r11 = p000.fs1.f4091
            java.lang.Object r11 = r2.m695(r11)
            if (r11 != 0) goto L6ff
            r11 = r49
        L6ff:
            boolean r11 = p000.ln0.m3626(r11, r6)
            if (r4 != 0) goto L707
        L705:
            r10 = 0
            goto L70d
        L707:
            int r14 = r4.f9982
            r10 = 4
            if (r14 != r10) goto L705
            r10 = 1
        L70d:
            if (r10 != 0) goto L71e
            if (r4 != 0) goto L713
        L711:
            r4 = 0
            goto L719
        L713:
            int r4 = r4.f9982
            r10 = 3
            if (r4 != r10) goto L711
            r4 = 1
        L719:
            if (r4 == 0) goto L71c
            goto L71e
        L71c:
            r4 = 0
            goto L71f
        L71e:
            r4 = 1
        L71f:
            if (r4 == 0) goto L728
            if (r4 == 0) goto L726
            if (r11 != 0) goto L726
            goto L728
        L726:
            r4 = 0
            goto L729
        L728:
            r4 = 1
        L729:
            r1.setClickable(r4)
            boolean r4 = p000.kn0.m3362(r13)
            if (r4 == 0) goto L746
            boolean r4 = r3.isClickable()
            if (r4 == 0) goto L746
            ч r4 = new ч
            java.lang.String r9 = r9.f13446
            r10 = 16
            r11 = r49
            r4.<init>(r11, r10, r9, r11)
            r7.m7354(r4)
        L746:
            r11 = 0
            r1.setLongClickable(r11)
            is1 r4 = p000.wr1.f11814
            java.lang.Object r4 = r2.m695(r4)
            if (r4 != 0) goto L753
            r4 = 0
        L753:
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L76d
            r9 = 1
            r1.setLongClickable(r9)
            boolean r9 = p000.kn0.m3362(r13)
            if (r9 == 0) goto L76d
            ч r9 = new ч
            r10 = 32
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L76d:
            is1 r4 = p000.wr1.f11826
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L783
            ч r9 = new ч
            r10 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L783:
            boolean r4 = p000.kn0.m3362(r13)
            if (r4 == 0) goto L810
            is1 r4 = p000.wr1.f11821
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L79f
            ч r9 = new ч
            r10 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L79f:
            is1 r4 = p000.wr1.f11825
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L7b6
            ч r9 = new ч
            r10 = 16908372(0x1020054, float:2.3877464E-38)
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L7b6:
            is1 r4 = p000.wr1.f11827
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L7cc
            ч r9 = new ч
            r10 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L7cc:
            is1 r4 = p000.wr1.f11828
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            if (r4 == 0) goto L810
            boolean r9 = r3.isFocused()
            if (r9 == 0) goto L810
            p0 r9 = r30.getClipboardManager()
            android.content.ClipboardManager r10 = r9.f8375
            if (r10 != 0) goto L7f3
            android.content.Context r10 = r9.f8374
            java.lang.String r11 = "clipboard"
            java.lang.Object r10 = r10.getSystemService(r11)
            r10.getClass()
            android.content.ClipboardManager r10 = (android.content.ClipboardManager) r10
            r9.f8375 = r10
        L7f3:
            android.content.ClipDescription r9 = r10.getPrimaryClipDescription()
            if (r9 == 0) goto L800
            java.lang.String r10 = "text/*"
            boolean r9 = r9.hasMimeType(r10)
            goto L801
        L800:
            r9 = 0
        L801:
            if (r9 == 0) goto L810
            ч r9 = new ч
            r10 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r4 = r4.f13446
            r9.<init>(r4, r10)
            r7.m7354(r9)
        L810:
            java.lang.String r4 = p000.ViewOnAttachStateChangeListenerC0496l1.m3439(r13)
            if (r4 == 0) goto L81f
            int r4 = r4.length()
            if (r4 != 0) goto L81d
            goto L81f
        L81d:
            r4 = 0
            goto L820
        L81f:
            r4 = 1
        L820:
            if (r4 != 0) goto L8d9
            int r4 = r8.m3456(r13)
            int r9 = r8.m3455(r13)
            r3.setTextSelection(r4, r9)
            is1 r4 = p000.wr1.f11820
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            м r4 = (p000.C1114) r4
            ч r9 = new ч
            if (r4 == 0) goto L83c
            java.lang.String r4 = r4.f13446
            goto L83d
        L83c:
            r4 = 0
        L83d:
            r10 = 131072(0x20000, float:1.83671E-40)
            r9.<init>(r4, r10)
            r7.m7354(r9)
            r4 = 256(0x100, float:3.59E-43)
            r7.m7353(r4)
            r4 = 512(0x200, float:7.17E-43)
            r7.m7353(r4)
            r4 = 11
            r1.setMovementGranularities(r4)
            is1 r4 = p000.fs1.f4098
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L867
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L865
            goto L867
        L865:
            r4 = 0
            goto L868
        L867:
            r4 = 1
        L868:
            if (r4 == 0) goto L8d9
            is1 r4 = p000.wr1.f11812
            boolean r4 = r2.m691(r4)
            if (r4 == 0) goto L8d9
            is1 r4 = p000.fs1.f4089
            boolean r4 = r2.m691(r4)
            if (r4 == 0) goto L885
            java.lang.Object r4 = p000.v81.m6122(r15, r5)
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 != 0) goto L885
            goto L8cb
        L885:
            yp0 r4 = r13.f1823
            yp0 r4 = r4.m7005()
        L88b:
            if (r4 == 0) goto L8ad
            xr1 r5 = r4.m7007()
            if (r5 == 0) goto L8a4
            boolean r6 = r5.f12270
            r9 = 1
            if (r6 != r9) goto L8a4
            is1 r6 = p000.fs1.f4089
            b21 r5 = r5.f12268
            boolean r5 = r5.m691(r6)
            if (r5 == 0) goto L8a4
            r5 = 1
            goto L8a5
        L8a4:
            r5 = 0
        L8a5:
            if (r5 == 0) goto L8a8
            goto L8ae
        L8a8:
            yp0 r4 = r4.m7005()
            goto L88b
        L8ad:
            r4 = 0
        L8ae:
            if (r4 == 0) goto L8cd
            xr1 r4 = r4.m7007()
            if (r4 == 0) goto L8c8
            is1 r5 = p000.fs1.f4109
            b21 r4 = r4.f12268
            java.lang.Object r4 = r4.m695(r5)
            if (r4 != 0) goto L8c1
            r4 = 0
        L8c1:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r5)
            goto L8c9
        L8c8:
            r4 = 0
        L8c9:
            if (r4 != 0) goto L8cd
        L8cb:
            r4 = 1
            goto L8ce
        L8cd:
            r4 = 0
        L8ce:
            if (r4 != 0) goto L8d9
            int r4 = r3.getMovementGranularities()
            r4 = r4 | 20
            r1.setMovementGranularities(r4)
        L8d9:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = "androidx.compose.ui.semantics.id"
            r4.add(r5)
            java.lang.CharSequence r5 = r7.m7357()
            if (r5 == 0) goto L8f2
            int r5 = r5.length()
            if (r5 != 0) goto L8f0
            goto L8f2
        L8f0:
            r5 = 0
            goto L8f3
        L8f2:
            r5 = 1
        L8f3:
            if (r5 != 0) goto L902
            is1 r5 = p000.wr1.f11812
            boolean r5 = r2.m691(r5)
            if (r5 == 0) goto L902
            java.lang.String r5 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r4.add(r5)
        L902:
            is1 r5 = p000.fs1.f4121
            boolean r5 = r2.m691(r5)
            if (r5 == 0) goto L90f
            java.lang.String r5 = "androidx.compose.ui.semantics.testTag"
            r4.add(r5)
        L90f:
            is1 r5 = p000.fs1.f4097
            boolean r5 = r2.m691(r5)
            if (r5 == 0) goto L92b
            java.lang.String r5 = "androidx.compose.ui.semantics.shapeType"
            r4.add(r5)
            java.lang.String r5 = "androidx.compose.ui.semantics.shapeRect"
            r4.add(r5)
            java.lang.String r5 = "androidx.compose.ui.semantics.shapeCorners"
            r4.add(r5)
            java.lang.String r5 = "androidx.compose.ui.semantics.shapeRegion"
            r4.add(r5)
        L92b:
            r3.setAvailableExtraData(r4)
            is1 r4 = p000.fs1.f4100
            java.lang.Object r4 = p000.v81.m6122(r15, r4)
            vj1 r4 = (p000.vj1) r4
            if (r4 == 0) goto L994
            is1 r5 = p000.wr1.f11819
            boolean r6 = r2.m691(r5)
            if (r6 == 0) goto L946
            java.lang.String r6 = "android.widget.SeekBar"
            r7.m7358(r6)
            goto L94b
        L946:
            java.lang.String r6 = "android.widget.ProgressBar"
            r7.m7358(r6)
        L94b:
            vj1 r6 = p000.vj1.f11314
            if (r4 == r6) goto L959
            r4 = 0
            r9 = 1
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r9, r4, r4, r4)
            r3.setRangeInfo(r6)
            goto L95b
        L959:
            r4 = 0
            r9 = 1
        L95b:
            boolean r2 = r2.m691(r5)
            if (r2 == 0) goto L995
            boolean r2 = p000.kn0.m3362(r13)
            if (r2 == 0) goto L995
            float r16 = r22.floatValue()
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 >= 0) goto L970
            goto L972
        L970:
            r16 = r4
        L972:
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 >= 0) goto L97b
            ч r2 = p000.C1125.f13471
            r7.m7354(r2)
        L97b:
            float r2 = r22.floatValue()
            float r3 = r22.floatValue()
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L988
            r2 = r3
        L988:
            r16 = 0
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 <= 0) goto L995
            ч r2 = p000.C1125.f13472
            r7.m7354(r2)
            goto L995
        L994:
            r9 = 1
        L995:
            p000.AbstractC0073bd.m871(r7, r13)
            xr1 r2 = r13.m1015()
            is1 r3 = p000.fs1.f4103
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto L9a7
            r2 = 0
        L9a7:
            if (r2 != 0) goto La09
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            xr1 r3 = r13.m1015()
            is1 r4 = p000.fs1.f4102
            b21 r3 = r3.f12268
            java.lang.Object r3 = r3.m695(r4)
            if (r3 != 0) goto L9bd
            r3 = 0
        L9bd:
            if (r3 == 0) goto L9e5
            r4 = 4
            java.util.List r3 = p000.bs1.m1005(r4, r13)
            int r4 = r3.size()
            r5 = 0
        L9c9:
            if (r5 >= r4) goto L9e5
            java.lang.Object r6 = r3.get(r5)
            bs1 r6 = (p000.bs1) r6
            xr1 r10 = r6.m1015()
            is1 r11 = p000.fs1.f4091
            b21 r10 = r10.f12268
            boolean r10 = r10.m691(r11)
            if (r10 == 0) goto L9e2
            r2.add(r6)
        L9e2:
            int r5 = r5 + 1
            goto L9c9
        L9e5:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto La0c
            boolean r3 = p000.AbstractC0073bd.m874(r2)
            if (r3 == 0) goto L9f3
            r4 = r9
            goto L9f7
        L9f3:
            int r4 = r2.size()
        L9f7:
            if (r3 == 0) goto L9ff
            int r2 = r2.size()
        L9fd:
            r11 = 0
            goto La01
        L9ff:
            r2 = r9
            goto L9fd
        La01:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r2 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r4, r2, r11, r11)
            r1.setCollectionInfo(r2)
            goto La0c
        La09:
            p000.C1080.m7264()
        La0c:
            xr1 r2 = r13.m1015()
            is1 r3 = p000.fs1.f4104
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto La1b
            r2 = 0
        La1b:
            if (r2 != 0) goto Lad3
            bs1 r2 = r13.m1016()
            if (r2 != 0) goto La25
            goto Lad6
        La25:
            xr1 r3 = r2.m1015()
            is1 r4 = p000.fs1.f4102
            b21 r3 = r3.f12268
            java.lang.Object r3 = r3.m695(r4)
            if (r3 != 0) goto La34
            r3 = 0
        La34:
            if (r3 == 0) goto Lad6
            xr1 r3 = r2.m1015()
            is1 r4 = p000.fs1.f4103
            b21 r3 = r3.f12268
            java.lang.Object r3 = r3.m695(r4)
            if (r3 != 0) goto La45
            r3 = 0
        La45:
            if (r3 != 0) goto Lacf
            xr1 r3 = r13.m1015()
            is1 r4 = p000.fs1.f4091
            b21 r3 = r3.f12268
            boolean r3 = r3.m691(r4)
            if (r3 != 0) goto La57
            goto Lad6
        La57:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 4
            java.util.List r2 = p000.bs1.m1005(r4, r2)
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        La67:
            if (r5 >= r4) goto La93
            java.lang.Object r10 = r2.get(r5)
            bs1 r10 = (p000.bs1) r10
            xr1 r11 = r10.m1015()
            is1 r14 = p000.fs1.f4091
            b21 r11 = r11.f12268
            boolean r11 = r11.m691(r14)
            if (r11 == 0) goto La90
            r3.add(r10)
            yp0 r10 = r10.f1823
            int r10 = r10.m7006()
            yp0 r11 = r13.f1823
            int r11 = r11.m7006()
            if (r10 >= r11) goto La90
            int r6 = r6 + 1
        La90:
            int r5 = r5 + 1
            goto La67
        La93:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto Lad6
            boolean r2 = p000.AbstractC0073bd.m874(r3)
            if (r2 == 0) goto Laa2
            r31 = 0
            goto Laa4
        Laa2:
            r31 = r6
        Laa4:
            if (r2 == 0) goto Laa9
            r33 = r6
            goto Laab
        Laa9:
            r33 = 0
        Laab:
            xr1 r2 = r13.m1015()
            is1 r3 = p000.fs1.f4091
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto Labb
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        Labb:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r36 = r2.booleanValue()
            r35 = 0
            r32 = 1
            r34 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r2 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r31, r32, r33, r34, r35, r36)
            r1.setCollectionItemInfo(r2)
            goto Lad6
        Lacf:
            p000.C1080.m7264()
            goto Lad6
        Lad3:
            p000.C1080.m7264()
        Lad6:
            xr1 r2 = r13.m1018()
            is1 r3 = p000.fs1.f4118
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            p000.lz1.m3698(r2)
            xr1 r2 = r13.m1018()
            is1 r3 = p000.wr1.f11815
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            м r2 = (p000.C1114) r2
            xr1 r2 = r13.m1018()
            is1 r3 = p000.fs1.f4119
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            p000.lz1.m3698(r2)
            p000.AbstractC1021yh.m6877(r7, r13)
            xr1 r2 = r13.m1018()
            is1 r3 = p000.fs1.f4101
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setPaneTitle(r2)
            boolean r2 = p000.kn0.m3362(r13)
            if (r2 == 0) goto Lc4d
            xr1 r2 = r13.m1018()
            is1 r3 = p000.wr1.f11829
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto Lb2e
            ч r3 = new ч
            r4 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r2 = r2.f13446
            r3.<init>(r2, r4)
            r7.m7354(r3)
        Lb2e:
            xr1 r2 = r13.m1018()
            is1 r3 = p000.wr1.f11830
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto Lb48
            ч r3 = new ч
            r4 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r2 = r2.f13446
            r3.<init>(r2, r4)
            r7.m7354(r3)
        Lb48:
            xr1 r2 = r13.m1018()
            is1 r3 = p000.wr1.f11831
            java.lang.Object r2 = p000.v81.m6122(r2, r3)
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto Lb62
            ч r3 = new ч
            r4 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r2 = r2.f13446
            r3.<init>(r2, r4)
            r7.m7354(r3)
        Lb62:
            xr1 r2 = r13.m1018()
            is1 r3 = p000.wr1.f11833
            r2.getClass()
            is1 r4 = p000.wr1.f11833
            b21 r2 = r2.f12268
            boolean r2 = r2.m691(r4)
            if (r2 == 0) goto Lc4d
            xr1 r2 = r13.m1018()
            java.lang.Object r2 = r2.m6780(r3)
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            m11 r4 = p000.ViewOnAttachStateChangeListenerC0496l1.f6341
            int r5 = r4.f6888
            if (r3 >= r5) goto Lc39
            kz1 r3 = new kz1
            r11 = 0
            r3.<init>(r11)
            u11 r5 = p000.z31.f12956
            u11 r5 = new u11
            r5.<init>()
            r6 = r23
            int[] r10 = r6.f6333
            int r11 = r6.f6335
            int r10 = p000.AbstractC1021yh.m6880(r11, r0, r10)
            if (r10 < 0) goto Lba4
            r11 = r9
            goto Lba5
        Lba4:
            r11 = 0
        Lba5:
            if (r11 == 0) goto Lc1d
            java.lang.Object r9 = r6.m3428(r0)
            u11 r9 = (p000.u11) r9
            r10 = 16
            int[] r10 = new int[r10]
            int[] r11 = r4.f6887
            int r4 = r4.f6888
            r15 = r10
            r10 = 0
            r14 = 0
        Lbb8:
            if (r10 >= r4) goto Lbe6
            r16 = r11[r10]
            r18 = r4
            int r4 = r14 + 1
            r21 = r9
            int r9 = r15.length
            if (r9 >= r4) goto Lbd8
            int r9 = r15.length
            r19 = 3
            int r9 = r9 * 3
            r20 = 2
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r4, r9)
            int[] r9 = java.util.Arrays.copyOf(r15, r9)
            r15 = r9
            goto Lbdc
        Lbd8:
            r19 = 3
            r20 = 2
        Lbdc:
            r15[r14] = r16
            int r10 = r10 + 1
            r14 = r4
            r4 = r18
            r9 = r21
            goto Lbb8
        Lbe6:
            r21 = r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r9 = r2.size()
            if (r9 > 0) goto Lc10
            int r2 = r4.size()
            if (r2 > 0) goto Lbfb
            r9 = 0
            goto Lc25
        Lbfb:
            r11 = 0
            java.lang.Object r0 = r4.get(r11)
            p000.lz1.m3698(r0)
            if (r14 > 0) goto Lc0c
            java.lang.String r0 = "Index must be between 0 and size"
            p000.C1080.m7269(r0)
            r9 = 0
            return r9
        Lc0c:
            r9 = 0
            r0 = r15[r11]
            throw r9
        Lc10:
            r9 = 0
            r11 = 0
            java.lang.Object r0 = r2.get(r11)
            p000.lz1.m3698(r0)
            r21.getClass()
            throw r9
        Lc1d:
            r9 = 0
            r11 = 0
            int r10 = r2.size()
            if (r10 > 0) goto Lc2e
        Lc25:
            kz1 r2 = r8.f6369
            r2.m3429(r0, r3)
            r6.m3429(r0, r5)
            goto Lc4d
        Lc2e:
            java.lang.Object r0 = r2.get(r11)
            p000.lz1.m3698(r0)
            r4.m3702(r11)
            throw r9
        Lc39:
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't have more than "
            r0.<init>(r1)
            int r1 = r4.f6888
            java.lang.String r2 = " custom actions for one widget"
            java.lang.String r0 = p000.AbstractC0602nx.m4131(r0, r1, r2)
            p000.C1080.m7279(r0)
            return r9
        Lc4d:
            boolean r2 = p000.kn0.m3363(r13, r12)
            r1.setScreenReaderFocusable(r2)
            l11 r2 = r8.f6346
            int r2 = r2.m3466(r0)
            r10 = -1
            if (r2 == r10) goto Lc79
            androidx.compose.ui.platform.AndroidViewsHandler r3 = r30.getAndroidViewsHandler$ui()
            androidx.compose.ui.viewinterop.AndroidViewHolder r3 = p000.v71.m6045(r3, r2)
            if (r3 == 0) goto Lc6d
            r1.setTraversalBefore(r3)
            r3 = r30
            goto Lc72
        Lc6d:
            r3 = r30
            r1.setTraversalBefore(r3, r2)
        Lc72:
            java.lang.String r2 = r8.f6348
            r9 = 0
            r8.m3449(r0, r7, r2, r9)
            goto Lc7c
        Lc79:
            r3 = r30
            r9 = 0
        Lc7c:
            l11 r2 = r8.f6347
            int r2 = r2.m3466(r0)
            r10 = -1
            if (r2 == r10) goto Lc97
            androidx.compose.ui.platform.AndroidViewsHandler r3 = r3.getAndroidViewsHandler$ui()
            androidx.compose.ui.viewinterop.AndroidViewHolder r2 = p000.v71.m6045(r3, r2)
            if (r2 == 0) goto Lc97
            r1.setTraversalAfter(r2)
            java.lang.String r1 = r8.f6349
            r8.m3449(r0, r7, r1, r9)
        Lc97:
            xr1 r0 = r13.m1018()
            is1 r1 = p000.gs1.f4443
            java.lang.Object r0 = p000.v81.m6122(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lca8
            r7.m7358(r0)
        Lca8:
            r8 = r7
        Lca9:
            return r8
        Lcaa:
            p000.C1080.m7264()
            r9 = 0
            return r9
        Lcaf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "semanticsNode "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " has null parent"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.am0.m179(r0)
            pm r0 = new pm
            r0.<init>()
            throw r0
    }

    @Override // p000.C0568n
    /* JADX INFO: renamed from: τ */
    public final p000.C1128 mo1991(int r3) {
            r2 = this;
            r0 = 1
            l1 r1 = r2.f3719
            if (r3 == r0) goto L1a
            r0 = 2
            if (r3 != r0) goto Lf
            int r3 = r1.f6365
            э r2 = r2.mo1990(r3)
            return r2
        Lf:
            java.lang.String r2 = "Unknown focus type: "
            java.lang.String r2 = p000.a12.m17(r2, r3)
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
        L1a:
            int r3 = r1.f6366
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L22
            r2 = 0
            return r2
        L22:
            э r2 = r2.mo1990(r3)
            return r2
    }

    @Override // p000.C0568n
    /* JADX INFO: renamed from: ω */
    public final boolean mo1992(int r20, int r21, android.os.Bundle r22) {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r19
            r3 = r22
            l1 r2 = r2.f3719
            android.view.accessibility.AccessibilityManager r4 = r2.f6361
            androidx.compose.ui.platform.AndroidComposeView r5 = r2.f6358
            sm0 r6 = r2.m3457()
            java.lang.Object r6 = r6.m5525(r0)
            ds1 r6 = (p000.ds1) r6
            if (r6 == 0) goto L1e
            bs1 r9 = r6.f3268
            if (r9 != 0) goto L22
        L1e:
            r18 = 0
            goto L77d
        L22:
            yp0 r6 = r9.f1823
            int r8 = r9.f1826
            xr1 r10 = r9.f1824
            b21 r11 = r10.f12268
            is1 r12 = p000.fs1.f4111
            java.lang.Object r12 = r11.m695(r12)
            if (r12 != 0) goto L33
            r12 = 0
        L33:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r12 = p000.ln0.m3626(r12, r14)
            r15 = 1
            if (r12 == 0) goto L4b
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r12 < r13) goto L47
            boolean r12 = p000.AbstractC1117.m7297(r4)
            goto L48
        L47:
            r12 = r15
        L48:
            if (r12 != 0) goto L4b
            goto L1e
        L4b:
            r12 = 64
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r12) goto L746
            r4 = 128(0x80, float:1.8E-43)
            if (r1 == r4) goto L72e
            r12 = 512(0x200, float:7.17E-43)
            r13 = 2
            r4 = 256(0x100, float:3.59E-43)
            r7 = -1
            if (r1 == r4) goto L5cb
            if (r1 == r12) goto L5cb
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r1 == r4) goto L5ab
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r1 == r4) goto L587
            boolean r4 = p000.kn0.m3362(r9)
            if (r4 != 0) goto L6e
            goto L1e
        L6e:
            if (r1 == r15) goto L55e
            if (r1 == r13) goto L540
            switch(r1) {
                case 16: goto L517;
                case 32: goto L4f7;
                case 4096: goto L133;
                case 8192: goto L133;
                case 32768: goto L405;
                case 65536: goto L3e5;
                case 262144: goto L3c5;
                case 524288: goto L3a5;
                case 1048576: goto L385;
                case 2097152: goto L352;
                case 16908342: goto L18a;
                case 16908349: goto L156;
                case 16908372: goto L136;
                default: goto L75;
            }
        L75:
            switch(r1) {
                case 16908344: goto L133;
                case 16908345: goto L133;
                case 16908346: goto L133;
                case 16908347: goto L133;
                default: goto L78;
            }
        L78:
            switch(r1) {
                case 16908358: goto L113;
                case 16908359: goto Lf3;
                case 16908360: goto Ld3;
                case 16908361: goto Lb3;
                default: goto L7b;
            }
        L7b:
            kz1 r2 = r2.f6369
            java.lang.Object r0 = r2.m3428(r0)
            kz1 r0 = (p000.kz1) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.m3428(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L8e
            goto L1e
        L8e:
            is1 r0 = p000.wr1.f11833
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L98
            r13 = 0
            goto L99
        L98:
            r13 = r0
        L99:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L9e
            goto L1e
        L9e:
            int r0 = r13.size()
            if (r0 > 0) goto La6
            goto L1e
        La6:
            r0 = 0
            java.lang.Object r0 = r13.get(r0)
            r0.getClass()
            p000.C1080.m7264()
            r0 = 0
            return r0
        Lb3:
            is1 r0 = p000.wr1.f11810
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto Lbd
            r13 = 0
            goto Lbe
        Lbd:
            r13 = r0
        Lbe:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Ld3:
            is1 r0 = p000.wr1.f11835
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto Ldd
            r13 = 0
            goto Lde
        Ldd:
            r13 = r0
        Lde:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Lf3:
            is1 r0 = p000.wr1.f11809
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto Lfd
            r13 = 0
            goto Lfe
        Lfd:
            r13 = r0
        Lfe:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L113:
            is1 r0 = p000.wr1.f11834
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L11d
            r13 = 0
            goto L11e
        L11d:
            r13 = r0
        L11e:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L133:
            r14 = 0
            goto L425
        L136:
            is1 r0 = p000.wr1.f11825
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L140
            r13 = 0
            goto L141
        L140:
            r13 = r0
        L141:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L156:
            if (r3 == 0) goto L1e
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto L162
            goto L1e
        L162:
            is1 r1 = p000.wr1.f11819
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L16c
            r13 = 0
            goto L16d
        L16c:
            r13 = r1
        L16d:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r1 = r13.f13447
            a80 r1 = (p000.a80) r1
            if (r1 == 0) goto L1e
            float r0 = r3.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L18a:
            bs1 r0 = r9.m1016()
            if (r0 == 0) goto L1a0
            xr1 r1 = r0.f1824
            is1 r2 = p000.wr1.f11815
            b21 r1 = r1.f12268
            java.lang.Object r1 = r1.m695(r2)
            if (r1 != 0) goto L19d
            r1 = 0
        L19d:
            м r1 = (p000.C1114) r1
            goto L1a1
        L1a0:
            r1 = 0
        L1a1:
            if (r1 != 0) goto L1bb
            if (r0 == 0) goto L1bb
            bs1 r0 = r0.m1016()
            if (r0 == 0) goto L1a0
            xr1 r1 = r0.f1824
            is1 r2 = p000.wr1.f11815
            b21 r1 = r1.f12268
            java.lang.Object r1 = r1.m695(r2)
            if (r1 != 0) goto L1b8
            r1 = 0
        L1b8:
            м r1 = (p000.C1114) r1
            goto L1a1
        L1bb:
            if (r0 != 0) goto L1f5
            ml1 r0 = r9.m1012()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r0.f7200
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            float r3 = r0.f7201
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r0.f7202
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            float r4 = (float) r6
            int r4 = p000.jx0.m3061(r4)
            float r0 = r0.f7203
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            float r0 = (float) r6
            int r0 = p000.jx0.m3061(r0)
            r1.<init>(r2, r3, r4, r0)
            boolean r0 = r5.requestRectangleOnScreen(r1)
            return r0
        L1f5:
            r1 = 0
            r7 = r1
            r3 = 0
        L1f9:
            if (r0 == 0) goto L351
            yp0 r5 = r0.f1823
            xr1 r10 = r0.f1824
            b21 r10 = r10.f12268
            is1 r11 = p000.wr1.f11815
            java.lang.Object r11 = r10.m695(r11)
            if (r11 != 0) goto L20a
            r11 = 0
        L20a:
            м r11 = (p000.C1114) r11
            if (r11 == 0) goto L348
            k31 r12 = r5.f12733
            gm0 r12 = r12.f5726
            ml1 r12 = p000.AbstractC0782s1.m5327(r12)
            k31 r5 = r5.f12733
            gm0 r5 = r5.f5726
            mp0 r5 = r5.mo2336()
            if (r5 == 0) goto L227
            q31 r5 = (p000.q31) r5
            long r13 = r5.m4745(r1)
            goto L228
        L227:
            r13 = r1
        L228:
            ml1 r5 = r12.m3870(r13)
            q31 r12 = r9.m1009()
            if (r12 == 0) goto L243
            q01 r13 = r12.mo2315()
            boolean r13 = r13.f8784
            if (r13 == 0) goto L23b
            goto L23c
        L23b:
            r12 = 0
        L23c:
            if (r12 == 0) goto L243
            long r12 = r12.m4745(r1)
            goto L244
        L243:
            r12 = r1
        L244:
            long r12 = p000.o41.m4205(r12, r7)
            q31 r14 = r9.m1009()
            if (r14 == 0) goto L251
            long r1 = r14.f2117
            goto L253
        L251:
            r1 = 0
        L253:
            long r1 = p000.AbstractC0782s1.m5322(r1)
            ml1 r1 = p000.i91.m2676(r12, r1)
            float r2 = r1.f7200
            float r12 = r5.f7200
            float r2 = r2 - r12
            float r12 = r1.f7202
            float r13 = r5.f7202
            float r12 = r12 - r13
            float r13 = java.lang.Math.signum(r2)
            float r14 = java.lang.Math.signum(r12)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L280
            float r13 = java.lang.Math.abs(r2)
            float r14 = java.lang.Math.abs(r12)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 >= 0) goto L27e
            goto L281
        L27e:
            r2 = r12
            goto L281
        L280:
            r2 = 0
        L281:
            float r12 = r1.f7201
            float r13 = r5.f7201
            float r12 = r12 - r13
            float r1 = r1.f7203
            float r5 = r5.f7203
            float r1 = r1 - r5
            float r5 = java.lang.Math.signum(r12)
            float r13 = java.lang.Math.signum(r1)
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 != 0) goto L2a6
            float r5 = java.lang.Math.abs(r12)
            float r13 = java.lang.Math.abs(r1)
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 >= 0) goto L2a4
            goto L2a7
        L2a4:
            r12 = r1
            goto L2a7
        L2a6:
            r12 = 0
        L2a7:
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r5 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r5
            r5 = 32
            long r1 = r1 << r5
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r16
            long r1 = r1 | r12
            r12 = 0
            boolean r14 = p000.o41.m4203(r1, r12)
            if (r14 == 0) goto L2c9
            r20 = r5
            r14 = 0
            r4 = r1
            goto L30b
        L2c9:
            r20 = r5
            r14 = 0
            long r4 = r1 >> r20
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r12 = r1 & r16
            int r5 = (int) r12
            float r5 = java.lang.Float.intBitsToFloat(r5)
            is1 r12 = p000.fs1.f4118
            java.lang.Object r12 = r10.m695(r12)
            if (r12 != 0) goto L2e3
            r12 = 0
        L2e3:
            if (r12 != 0) goto L343
            np0 r12 = r6.f12727
            np0 r13 = p000.np0.f7702
            if (r12 != r13) goto L2ed
            r12 = r15
            goto L2ee
        L2ed:
            r12 = 0
        L2ee:
            if (r12 == 0) goto L2f1
            float r4 = -r4
        L2f1:
            is1 r12 = p000.fs1.f4119
            java.lang.Object r10 = r10.m695(r12)
            if (r10 != 0) goto L2fa
            r10 = 0
        L2fa:
            if (r10 != 0) goto L33e
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r12 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r12 = r12 << r20
            long r4 = r4 & r16
            long r4 = r4 | r12
        L30b:
            m80 r10 = r11.f13447
            e80 r10 = (p000.e80) r10
            if (r10 == 0) goto L334
            long r11 = r4 >> r20
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            long r4 = r4 & r16
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r4 = r10.invoke(r11, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r15) goto L334
            goto L336
        L334:
            if (r3 == 0) goto L338
        L336:
            r3 = r15
            goto L339
        L338:
            r3 = 0
        L339:
            long r7 = p000.o41.m4204(r7, r1)
            goto L349
        L33e:
            p000.C1080.m7264()
            r0 = 0
            return r0
        L343:
            p000.C1080.m7264()
            r0 = 0
            return r0
        L348:
            r14 = 0
        L349:
            bs1 r0 = r0.m1016()
            r1 = 0
            goto L1f9
        L351:
            return r3
        L352:
            if (r3 == 0) goto L35b
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r3.getString(r0)
            goto L35c
        L35b:
            r0 = 0
        L35c:
            is1 r1 = p000.wr1.f11821
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L366
            r13 = 0
            goto L367
        L366:
            r13 = r1
        L367:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r1 = r13.f13447
            a80 r1 = (p000.a80) r1
            if (r1 == 0) goto L1e
            g4 r2 = new g4
            if (r0 != 0) goto L377
            java.lang.String r0 = ""
        L377:
            r2.<init>(r0)
            java.lang.Object r0 = r1.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L385:
            is1 r0 = p000.wr1.f11831
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L38f
            r13 = 0
            goto L390
        L38f:
            r13 = r0
        L390:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3a5:
            is1 r0 = p000.wr1.f11830
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L3af
            r13 = 0
            goto L3b0
        L3af:
            r13 = r0
        L3b0:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3c5:
            is1 r0 = p000.wr1.f11829
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L3cf
            r13 = 0
            goto L3d0
        L3cf:
            r13 = r0
        L3d0:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3e5:
            is1 r0 = p000.wr1.f11827
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L3ef
            r13 = 0
            goto L3f0
        L3ef:
            r13 = r0
        L3f0:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L405:
            is1 r0 = p000.wr1.f11828
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L40f
            r13 = 0
            goto L410
        L40f:
            r13 = r0
        L410:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L425:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L42b
            r0 = r15
            goto L42c
        L42b:
            r0 = 0
        L42c:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 != r2) goto L432
            r2 = r15
            goto L433
        L432:
            r2 = 0
        L433:
            r3 = 16908345(0x1020039, float:2.387739E-38)
            if (r1 != r3) goto L43a
            r3 = r15
            goto L43b
        L43a:
            r3 = 0
        L43b:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r1 != r4) goto L442
            r4 = r15
            goto L443
        L442:
            r4 = 0
        L443:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r1 != r5) goto L44a
            r5 = r15
            goto L44b
        L44a:
            r5 = 0
        L44b:
            r7 = 16908346(0x102003a, float:2.3877392E-38)
            if (r1 != r7) goto L451
            goto L452
        L451:
            r15 = 0
        L452:
            if (r0 != 0) goto L456
            if (r2 == 0) goto L48e
        L456:
            is1 r0 = p000.fs1.f4100
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L45f
            r0 = 0
        L45f:
            vj1 r0 = (p000.vj1) r0
            is1 r1 = p000.wr1.f11819
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L46a
            r1 = 0
        L46a:
            м r1 = (p000.C1114) r1
            if (r0 == 0) goto L48e
            if (r1 == 0) goto L48e
            r0 = 20
            float r0 = (float) r0
            float r4 = r14 / r0
            if (r2 == 0) goto L478
            float r4 = -r4
        L478:
            m80 r0 = r1.f13447
            a80 r0 = (p000.a80) r0
            if (r0 == 0) goto L1e
            float r4 = r4 + r14
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L48e:
            k31 r0 = r6.f12733
            gm0 r0 = r0.f5726
            ml1 r0 = p000.AbstractC0782s1.m5327(r0)
            r0.m3867()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            is1 r1 = p000.wr1.f11811
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L4a7
            r1 = 0
        L4a7:
            м r1 = (p000.C1114) r1
            if (r1 == 0) goto L4c4
            m80 r1 = r1.f13447
            a80 r1 = (p000.a80) r1
            if (r1 == 0) goto L4c4
            java.lang.Object r1 = r1.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4c4
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
        L4c4:
            is1 r0 = p000.wr1.f11815
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L4cd
            r0 = 0
        L4cd:
            м r0 = (p000.C1114) r0
            if (r0 != 0) goto L4d3
            goto L1e
        L4d3:
            is1 r0 = p000.fs1.f4118
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L4dc
            r0 = 0
        L4dc:
            if (r0 != 0) goto L4f2
            is1 r0 = p000.fs1.f4119
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L4e8
            r13 = 0
            goto L4e9
        L4e8:
            r13 = r0
        L4e9:
            if (r13 != 0) goto L4ed
            goto L1e
        L4ed:
            p000.C1080.m7264()
            r0 = 0
            return r0
        L4f2:
            p000.C1080.m7264()
            r0 = 0
            return r0
        L4f7:
            is1 r0 = p000.wr1.f11814
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L501
            r13 = 0
            goto L502
        L501:
            r13 = r0
        L502:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L517:
            is1 r1 = p000.wr1.f11813
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L520
            r1 = 0
        L520:
            м r1 = (p000.C1114) r1
            if (r1 == 0) goto L534
            m80 r1 = r1.f13447
            p70 r1 = (p000.p70) r1
            if (r1 == 0) goto L534
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L530:
            r3 = 12
            r4 = 0
            goto L536
        L534:
            r1 = 0
            goto L530
        L536:
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r0, r15, r4, r3)
            if (r1 == 0) goto L1e
            boolean r0 = r1.booleanValue()
            return r0
        L540:
            is1 r0 = p000.fs1.f4109
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L54a
            r13 = 0
            goto L54b
        L54a:
            r13 = r0
        L54b:
            boolean r0 = p000.ln0.m3626(r13, r14)
            if (r0 == 0) goto L1e
            v40 r0 = r5.getFocusOwner()
            y40 r0 = (p000.y40) r0
            r1 = 8
            r2 = 0
            r0.m6823(r1, r2, r15)
            return r15
        L55e:
            boolean r0 = r5.isInTouchMode()
            if (r0 == 0) goto L567
            r5.requestFocusFromTouch()
        L567:
            is1 r0 = p000.wr1.f11832
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L571
            r13 = 0
            goto L572
        L571:
            r13 = r0
        L572:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L587:
            if (r3 == 0) goto L590
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r0 = r3.getInt(r0, r7)
            goto L591
        L590:
            r0 = r7
        L591:
            if (r3 == 0) goto L599
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r7 = r3.getInt(r1, r7)
        L599:
            r1 = 0
            boolean r0 = r2.m3446(r9, r0, r7, r1)
            if (r0 == 0) goto L5aa
            int r3 = r2.m3461(r8)
            r4 = 12
            r5 = 0
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r3, r1, r5, r4)
        L5aa:
            return r0
        L5ab:
            is1 r0 = p000.wr1.f11826
            java.lang.Object r0 = r11.m695(r0)
            if (r0 != 0) goto L5b5
            r13 = 0
            goto L5b6
        L5b5:
            r13 = r0
        L5b6:
            м r13 = (p000.C1114) r13
            if (r13 == 0) goto L1e
            m80 r0 = r13.f13447
            p70 r0 = (p000.p70) r0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L5cb:
            if (r3 == 0) goto L1e
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r0 = r3.getInt(r0)
            java.lang.String r6 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r3 = r3.getBoolean(r6)
            if (r1 != r4) goto L5dd
            r1 = r15
            goto L5de
        L5dd:
            r1 = 0
        L5de:
            java.lang.Integer r6 = r2.f6372
            if (r6 != 0) goto L5e3
            goto L5e9
        L5e3:
            int r6 = r6.intValue()
            if (r8 == r6) goto L5f1
        L5e9:
            r2.f6371 = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r2.f6372 = r6
        L5f1:
            java.lang.String r6 = p000.ViewOnAttachStateChangeListenerC0496l1.m3439(r9)
            if (r6 == 0) goto L1e
            int r8 = r6.length()
            if (r8 != 0) goto L5ff
            goto L1e
        L5ff:
            java.lang.String r8 = p000.ViewOnAttachStateChangeListenerC0496l1.m3439(r9)
            if (r8 == 0) goto L61b
            int r14 = r8.length()
            if (r14 != 0) goto L60c
            goto L61b
        L60c:
            if (r0 == r15) goto L69f
            if (r0 == r13) goto L676
            r5 = 4
            if (r0 == r5) goto L632
            r13 = 8
            if (r0 == r13) goto L61e
            r13 = 16
            if (r0 == r13) goto L632
        L61b:
            r13 = 0
            goto L6c7
        L61e:
            у r5 = p000.C1121.f13466
            if (r5 != 0) goto L629
            у r5 = new у
            r5.<init>()
            p000.C1121.f13466 = r5
        L629:
            у r13 = p000.C1121.f13466
            r13.getClass()
            r13.f13452 = r8
            goto L6c7
        L632:
            is1 r13 = p000.wr1.f11812
            boolean r13 = r11.m691(r13)
            if (r13 != 0) goto L63b
            goto L61b
        L63b:
            m32 r10 = p000.v71.m6038(r10)
            if (r10 != 0) goto L642
            goto L61b
        L642:
            if (r0 != r5) goto L65a
            с r5 = p000.C1119.f13456
            if (r5 != 0) goto L650
            с r5 = new с
            r13 = 2
            r5.<init>(r13)
            p000.C1119.f13456 = r5
        L650:
            с r13 = p000.C1119.f13456
            r13.getClass()
            r13.f13452 = r8
            r13.f13460 = r10
            goto L6c7
        L65a:
            т r5 = p000.C1120.f13461
            if (r5 != 0) goto L66a
            т r5 = new т
            r5.<init>()
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            p000.C1120.f13461 = r5
        L66a:
            т r13 = p000.C1120.f13461
            r13.getClass()
            r13.f13452 = r8
            r13.f13464 = r10
            r13.f13465 = r9
            goto L6c7
        L676:
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            с r10 = p000.C1119.f13455
            if (r10 != 0) goto L696
            с r10 = new с
            r13 = 1
            r10.<init>(r13)
            java.text.BreakIterator r5 = java.text.BreakIterator.getWordInstance(r5)
            r10.f13460 = r5
            p000.C1119.f13455 = r10
        L696:
            с r13 = p000.C1119.f13455
            r13.getClass()
            r13.m7310(r8)
            goto L6c7
        L69f:
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            с r10 = p000.C1119.f13454
            if (r10 != 0) goto L6bf
            с r10 = new с
            r13 = 0
            r10.<init>(r13)
            java.text.BreakIterator r5 = java.text.BreakIterator.getCharacterInstance(r5)
            r10.f13460 = r5
            p000.C1119.f13454 = r10
        L6bf:
            с r13 = p000.C1119.f13454
            r13.getClass()
            r13.m7310(r8)
        L6c7:
            if (r13 != 0) goto L6cb
            goto L1e
        L6cb:
            int r5 = r2.m3455(r9)
            if (r5 != r7) goto L6d9
            if (r1 == 0) goto L6d5
            r5 = 0
            goto L6d9
        L6d5:
            int r5 = r6.length()
        L6d9:
            if (r1 == 0) goto L6e0
            int[] r5 = r13.mo7303(r5)
            goto L6e4
        L6e0:
            int[] r5 = r13.mo7307(r5)
        L6e4:
            if (r5 != 0) goto L6e8
            goto L1e
        L6e8:
            r18 = 0
            r6 = r5[r18]
            r13 = r5[r15]
            if (r3 == 0) goto L711
            is1 r3 = p000.fs1.f4098
            boolean r3 = r11.m691(r3)
            if (r3 != 0) goto L711
            is1 r3 = p000.fs1.f4089
            boolean r3 = r11.m691(r3)
            if (r3 == 0) goto L711
            int r3 = r2.m3456(r9)
            if (r3 != r7) goto L70b
            if (r1 == 0) goto L70a
            r3 = r6
            goto L70b
        L70a:
            r3 = r13
        L70b:
            if (r1 == 0) goto L70f
            r5 = r13
            goto L717
        L70f:
            r5 = r6
            goto L717
        L711:
            if (r1 == 0) goto L715
            r3 = r13
            goto L716
        L715:
            r3 = r6
        L716:
            r5 = r3
        L717:
            if (r1 == 0) goto L71b
            r10 = r4
            goto L71c
        L71b:
            r10 = r12
        L71c:
            g1 r8 = new g1
            r1 = r15
            long r14 = android.os.SystemClock.uptimeMillis()
            r11 = r0
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.f6343 = r8
            r2.m3446(r9, r3, r5, r1)
            return r1
        L72e:
            r1 = r15
            int r3 = r2.f6365
            if (r3 != r0) goto L735
            r15 = r1
            goto L736
        L735:
            r15 = 0
        L736:
            if (r15 == 0) goto L1e
            r2.f6365 = r13
            r5.invalidate()
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = 12
            r5 = 0
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r0, r3, r5, r4)
            return r1
        L746:
            r1 = r15
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L755
            boolean r3 = r4.isTouchExplorationEnabled()
            if (r3 == 0) goto L755
            r15 = r1
            goto L756
        L755:
            r15 = 0
        L756:
            if (r15 != 0) goto L75a
            goto L1e
        L75a:
            int r3 = r2.f6365
            if (r3 != r0) goto L760
            r15 = r1
            goto L761
        L760:
            r15 = 0
        L761:
            if (r15 != 0) goto L1e
            if (r3 == r13) goto L76e
            r4 = 65536(0x10000, float:9.1835E-41)
            r6 = 12
            r7 = 0
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r3, r4, r7, r6)
            goto L771
        L76e:
            r6 = 12
            r7 = 0
        L771:
            r2.f6365 = r0
            r5.invalidate()
            r3 = 32768(0x8000, float:4.5918E-41)
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r0, r3, r7, r6)
            return r1
        L77d:
            return r18
    }
}
