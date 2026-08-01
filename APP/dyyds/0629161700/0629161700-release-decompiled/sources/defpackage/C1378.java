package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1378 implements defpackage.InterfaceC0532, defpackage.InterfaceC0805, defpackage.InterfaceC1469 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.LayoutInflaterFactory2C1411 f6017;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6018;

    public /* synthetic */ C1378(defpackage.LayoutInflaterFactory2C1411 r1, int r2) {
            r0 = this;
            r0.f6018 = r2
            r0.f6017 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1469
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public boolean mo2546(defpackage.MenuC1701 r4) {
            r3 = this;
            int r0 = r3.f6018
            r1 = 1
            r2 = 108(0x6c, float:1.51E-43)
            ᛸᛱᛱᛲ r3 = r3.f6017
            switch(r0) {
                case 2: goto L24;
                default: goto La;
            }
        La:
            ᲀᛷᛱᲇ r0 = r4.mo2716()
            if (r4 != r0) goto L23
            boolean r0 = r3.f6160
            if (r0 == 0) goto L23
            android.view.Window r0 = r3.f6165
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L23
            boolean r3 = r3.f6157
            if (r3 != 0) goto L23
            r0.onMenuOpened(r2, r4)
        L23:
            return r1
        L24:
            android.view.Window r3 = r3.f6165
            android.view.Window$Callback r3 = r3.getCallback()
            if (r3 == 0) goto L2f
            r3.onMenuOpened(r2, r4)
        L2f:
            return r1
    }

    @Override // defpackage.InterfaceC0532
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public defpackage.C2300 mo1325(android.view.View r17, defpackage.C2300 r18) {
            r16 = this;
            r1 = r17
            r2 = r18
            ᛲᲇᲀᲈ r3 = r2.f9727
            ᛶᛳᛴᛲ r0 = r3.mo1126()
            int r4 = r0.f4598
            r0 = r16
            ᛸᛱᛱᛲ r5 = r0.f6017
            android.content.Context r6 = r5.f6153
            ᛶᛳᛴᛲ r0 = r3.mo1126()
            int r7 = r0.f4598
            androidx.appcompat.widget.ActionBarContextView r0 = r5.f6168
            r8 = 8
            r9 = 0
            if (r0 == 0) goto L14a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L14a
            androidx.appcompat.widget.ActionBarContextView r0 = r5.f6168
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            androidx.appcompat.widget.ActionBarContextView r0 = r5.f6168
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L137
            android.graphics.Rect r0 = r5.f6170
            if (r0 != 0) goto L4a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f6170 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f6140 = r0
        L4a:
            android.graphics.Rect r12 = r5.f6170
            android.graphics.Rect r0 = r5.f6140
            ᛶᛳᛴᛲ r13 = r3.mo1126()
            int r13 = r13.f4597
            ᛶᛳᛴᛲ r14 = r3.mo1126()
            int r14 = r14.f4598
            ᛶᛳᛴᛲ r15 = r3.mo1126()
            int r15 = r15.f4596
            ᛶᛳᛴᛲ r11 = r3.mo1126()
            int r11 = r11.f4595
            r12.set(r13, r14, r15, r11)
            android.view.ViewGroup r11 = r5.f6152
            java.lang.reflect.Method r13 = defpackage.AbstractC1211.f5457
            if (r13 == 0) goto L7f
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}     // Catch: java.lang.Exception -> L77
            r13.invoke(r11, r0)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r0 = move-exception
            java.lang.String r11 = "ViewUtils"
            java.lang.String r13 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r11, r13, r0)
        L7f:
            int r0 = r12.top
            int r11 = r12.left
            int r12 = r12.right
            android.view.ViewGroup r13 = r5.f6152
            java.util.WeakHashMap r14 = defpackage.AbstractC0858.f3911
            ᲈᛸᛱᲀ r13 = defpackage.AbstractC0054.m397(r13)
            if (r13 != 0) goto L91
            r14 = r9
            goto L99
        L91:
            ᛲᲇᲀᲈ r14 = r13.f9727
            ᛶᛳᛴᛲ r14 = r14.mo1126()
            int r14 = r14.f4597
        L99:
            if (r13 != 0) goto L9d
            r13 = r9
            goto La5
        L9d:
            ᛲᲇᲀᲈ r13 = r13.f9727
            ᛶᛳᛴᛲ r13 = r13.mo1126()
            int r13 = r13.f4596
        La5:
            int r15 = r10.topMargin
            if (r15 != r0) goto Lb4
            int r15 = r10.leftMargin
            if (r15 != r11) goto Lb4
            int r15 = r10.rightMargin
            if (r15 == r12) goto Lb2
            goto Lb4
        Lb2:
            r11 = r9
            goto Lbb
        Lb4:
            r10.topMargin = r0
            r10.leftMargin = r11
            r10.rightMargin = r12
            r11 = 1
        Lbb:
            if (r0 <= 0) goto Le1
            android.view.View r0 = r5.f6134
            if (r0 != 0) goto Le1
            android.view.View r0 = new android.view.View
            r0.<init>(r6)
            r5.f6134 = r0
            r0.setVisibility(r8)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r12 = r10.topMargin
            r15 = 51
            r8 = -1
            r0.<init>(r8, r12, r15)
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.ViewGroup r12 = r5.f6152
            android.view.View r13 = r5.f6134
            r12.addView(r13, r8, r0)
            goto L104
        Le1:
            android.view.View r0 = r5.f6134
            if (r0 == 0) goto L104
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r8 = r0.height
            int r12 = r10.topMargin
            if (r8 != r12) goto Lf9
            int r8 = r0.leftMargin
            if (r8 != r14) goto Lf9
            int r8 = r0.rightMargin
            if (r8 == r13) goto L104
        Lf9:
            r0.height = r12
            r0.leftMargin = r14
            r0.rightMargin = r13
            android.view.View r8 = r5.f6134
            r8.setLayoutParams(r0)
        L104:
            android.view.View r0 = r5.f6134
            if (r0 == 0) goto L10a
            r8 = 1
            goto L10b
        L10a:
            r8 = r9
        L10b:
            if (r8 == 0) goto L12f
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L12f
            android.view.View r0 = r5.f6134
            int r12 = r0.getWindowSystemUiVisibility()
            r12 = r12 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L125
            r12 = 1711669254(0x66060006, float:1.5819939E23)
            int r6 = r6.getColor(r12)
            goto L12c
        L125:
            r12 = 1711669253(0x66060005, float:1.5819937E23)
            int r6 = r6.getColor(r12)
        L12c:
            r0.setBackgroundColor(r6)
        L12f:
            boolean r0 = r5.f6159
            if (r0 != 0) goto L142
            if (r8 == 0) goto L142
            r7 = r9
            goto L142
        L137:
            int r0 = r10.topMargin
            if (r0 == 0) goto L140
            r10.topMargin = r9
            r8 = r9
            r11 = 1
            goto L142
        L140:
            r8 = r9
            r11 = r8
        L142:
            if (r11 == 0) goto L14b
            androidx.appcompat.widget.ActionBarContextView r0 = r5.f6168
            r0.setLayoutParams(r10)
            goto L14b
        L14a:
            r8 = r9
        L14b:
            android.view.View r0 = r5.f6134
            if (r0 == 0) goto L158
            if (r8 == 0) goto L153
            r8 = r9
            goto L155
        L153:
            r8 = 8
        L155:
            r0.setVisibility(r8)
        L158:
            if (r4 == r7) goto L1a7
            ᛶᛳᛴᛲ r0 = r3.mo1126()
            int r0 = r0.f4597
            ᛶᛳᛴᛲ r4 = r3.mo1126()
            int r4 = r4.f4596
            ᛶᛳᛴᛲ r3 = r3.mo1126()
            int r3 = r3.f4595
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 36
            if (r5 < r6) goto L178
            ᛲᛲᛷᛱ r5 = new ᛲᛲᛷᛱ
            r5.<init>(r2)
            goto L19b
        L178:
            r6 = 35
            if (r5 < r6) goto L182
            ᲈᛷᛸᛱ r5 = new ᲈᛷᛸᛱ
            r5.<init>(r2)
            goto L19b
        L182:
            r6 = 34
            if (r5 < r6) goto L18c
            ᛱᛲᲀᲀ r5 = new ᛱᛲᲀᲀ
            r5.<init>(r2)
            goto L19b
        L18c:
            r6 = 31
            if (r5 < r6) goto L196
            ᛸᲀᲈᛵ r5 = new ᛸᲀᲈᛵ
            r5.<init>(r2)
            goto L19b
        L196:
            ᛳᲇᛵᛷ r5 = new ᛳᲇᛵᛷ
            r5.<init>(r2)
        L19b:
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1985(r0, r7, r4, r3)
            r5.m3353(r0)
            ᲈᛸᛱᲀ r0 = r5.mo2550()
            goto L1a8
        L1a7:
            r0 = r2
        L1a8:
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            android.view.WindowInsets r2 = r0.m3731()
            if (r2 == 0) goto L1be
            android.view.WindowInsets r3 = r1.onApplyWindowInsets(r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1be
            ᲈᛸᛱᲀ r0 = defpackage.C2300.m3730(r1, r3)
        L1be:
            return r0
    }

    @Override // defpackage.InterfaceC1469
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo2547(defpackage.MenuC1701 r9, boolean r10) {
            r8 = this;
            int r0 = r8.f6018
            ᛸᛱᛱᛲ r8 = r8.f6017
            switch(r0) {
                case 2: goto L3c;
                default: goto L7;
            }
        L7:
            ᲀᛷᛱᲇ r0 = r9.mo2716()
            r1 = 0
            r2 = 1
            if (r0 == r9) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            if (r3 == 0) goto L15
            r9 = r0
        L15:
            ᛱᛳᲈᛵ[] r4 = r8.f6178
            if (r4 == 0) goto L1b
            int r5 = r4.length
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r1 >= r5) goto L2a
            r6 = r4[r1]
            if (r6 == 0) goto L27
            ᲀᛷᛱᲇ r7 = r6.f723
            if (r7 != r9) goto L27
            goto L2b
        L27:
            int r1 = r1 + 1
            goto L1c
        L2a:
            r6 = 0
        L2b:
            if (r6 == 0) goto L3b
            if (r3 == 0) goto L38
            int r9 = r6.f732
            r8.m2574(r9, r6, r0)
            r8.m2586(r6, r2)
            goto L3b
        L38:
            r8.m2586(r6, r10)
        L3b:
            return
        L3c:
            r8.m2582(r9)
            return
    }
}
