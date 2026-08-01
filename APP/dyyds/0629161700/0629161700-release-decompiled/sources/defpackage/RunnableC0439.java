package defpackage;

/* JADX INFO: renamed from: ᛳᛳᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0439 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2168;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2169;

    public /* synthetic */ RunnableC0439(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2169 = r1
            r0.f2168 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r23 = this;
            r1 = r23
            int r0 = r1.f2169
            r2 = 0
            r4 = 0
            r7 = 8
            r8 = -1
            r9 = 2
            r10 = 0
            r11 = 1
            r12 = 0
            switch(r0) {
                case 0: goto L460;
                case 1: goto L446;
                case 2: goto L3b2;
                case 3: goto L3aa;
                case 4: goto L3a0;
                case 5: goto L338;
                case 6: goto L32e;
                case 7: goto L2ff;
                case 8: goto L2e1;
                case 9: goto L2d9;
                case 10: goto L1aa;
                case 11: goto L17e;
                case 12: goto L165;
                case 13: goto L15d;
                case 14: goto L153;
                case 15: goto L14b;
                case 16: goto L85;
                case 17: goto L75;
                case 18: goto L44;
                case 19: goto L25;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r1.f2168
            ᛷᛳᛶᛷ r0 = (defpackage.RunnableC1240) r0
            ᛵᛵᛱᛸ r0 = r0.f5549
            java.lang.Object r0 = r0.f3971
            ᛱᛳᲀᛷ r0 = (defpackage.C0060) r0
            ᛳᛸᛳᛸ r1 = r0.f701
            int r1 = r1.f2587
            if (r1 <= r8) goto L24
            r0.m477(r10)
        L24:
            return
        L25:
            java.lang.Object r0 = r1.f2168
            ᛵᛴᛳᲈ r0 = (defpackage.RunnableC0865) r0
            ᛱᛳᲀᛷ r0 = r0.f3919
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r0.f702
            if (r1 == 0) goto L32
            r1.setVisibility(r7)
        L32:
            ᛳᛸᛳᛸ r0 = r0.f701
            java.lang.ref.WeakReference r0 = r0.f2592
            if (r0 != 0) goto L39
            goto L40
        L39:
            java.lang.Object r0 = r0.get()
            r10 = r0
            android.view.View r10 = (android.view.View) r10
        L40:
            com.kongzue.dialogx.interfaces.AbstractC0008.m242(r10)
            return
        L44:
            java.lang.Object r0 = r1.f2168
            ᲁᛲᲇᲁ r0 = (defpackage.C1825) r0
            java.lang.Object r0 = r0.f7965
            ᛱᛳᲀᛷ r0 = (defpackage.C0060) r0
            ᛳᛸᛳᛸ r1 = r0.f701
            android.app.Activity r1 = r1.m271()
            if (r1 != 0) goto L55
            goto L74
        L55:
            ᛳᛸᛳᛸ r1 = r0.f701
            ᛲᛵᛲ r2 = r1.f2585
            if (r2 != 0) goto L62
            ᛲᛵᛲ r2 = new ᛲᛵᛲ
            r2.<init>(r9, r0)
            r1.f2585 = r2
        L62:
            r2.m952(r1)
            ᲈᲀᛴᛷ r1 = new ᲈᲀᛴᛷ
            r1.<init>()
            r1.m3793()
            ᛳᛸᛳᛸ r0 = r0.f701
            ᛳᲇᲇᛱ r1 = defpackage.EnumC0578.f2855
            r0.m260(r1)
        L74:
            return
        L75:
            java.lang.Object r0 = r1.f2168
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f195
            if (r0 == 0) goto L84
            ᲁᲀᛴᛷ r0 = r0.f107
            if (r0 == 0) goto L84
            r0.m3342()
        L84:
            return
        L85:
            java.lang.Object r0 = r1.f2168
            r2 = r0
            ᛵᲀᲇᛸ r2 = (defpackage.C0964) r2
            monitor-enter(r2)
            int r0 = r2.f4284     // Catch: java.lang.Throwable -> L148
            int r0 = r0 + r11
            r2.f4284 = r0     // Catch: java.lang.Throwable -> L148
            ᲀᛷᲁᛸ r0 = r2.m1911()     // Catch: java.lang.Throwable -> L148
            monitor-exit(r2)
            if (r0 != 0) goto L99
            goto L13d
        L99:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = r2.getName()
        La1:
            r4 = r0
            java.lang.String r0 = r4.f7626     // Catch: java.lang.Throwable -> Lc3
            r2.setName(r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r0 = r1.f2168     // Catch: java.lang.Throwable -> Lc3
            ᛵᲀᲇᛸ r0 = (defpackage.C0964) r0     // Catch: java.lang.Throwable -> Lc3
            java.util.logging.Logger r7 = r0.f4282     // Catch: java.lang.Throwable -> Lc3
            ᛴᛴᛸᛴ r8 = r4.f7625     // Catch: java.lang.Throwable -> Lc3
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = r7.isLoggable(r0)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto Lc5
            ᛵᲀᲇᛸ r0 = r8.f3203     // Catch: java.lang.Throwable -> Lc3
            long r13 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "starting"
            defpackage.AbstractC1533.m2774(r7, r4, r8, r0)     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r0 = move-exception
            goto L126
        Lc5:
            r13 = -1
        Lc7:
            long r5 = r4.mo2339()     // Catch: java.lang.Throwable -> L103
            if (r9 == 0) goto Lec
            ᛵᲀᲇᛸ r0 = r8.f3203     // Catch: java.lang.Throwable -> Lc3
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc3
            long r9 = r9 - r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r0.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r13 = "finished run in "
            r0.append(r13)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = defpackage.AbstractC1533.m2779(r9)     // Catch: java.lang.Throwable -> Lc3
            r0.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc3
            defpackage.AbstractC1533.m2774(r7, r4, r8, r0)     // Catch: java.lang.Throwable -> Lc3
        Lec:
            java.lang.Object r0 = r1.f2168     // Catch: java.lang.Throwable -> Lc3
            r7 = r0
            ᛵᲀᲇᛸ r7 = (defpackage.C0964) r7     // Catch: java.lang.Throwable -> Lc3
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lc3
            r7.m1910(r4, r5, r11)     // Catch: java.lang.Throwable -> L100
            ᲀᛷᲁᛸ r0 = r7.m1911()     // Catch: java.lang.Throwable -> L100
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc3
            if (r0 != 0) goto La1
        Lfc:
            r2.setName(r3)
            goto L13d
        L100:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc3
            throw r0     // Catch: java.lang.Throwable -> Lc3
        L103:
            r0 = move-exception
            if (r9 == 0) goto L125
            ᛵᲀᲇᛸ r5 = r8.f3203     // Catch: java.lang.Throwable -> Lc3
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc3
            long r5 = r5 - r13
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r9.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = "failed a run in "
            r9.append(r10)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = defpackage.AbstractC1533.m2779(r5)     // Catch: java.lang.Throwable -> Lc3
            r9.append(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> Lc3
            defpackage.AbstractC1533.m2774(r7, r4, r8, r5)     // Catch: java.lang.Throwable -> Lc3
        L125:
            throw r0     // Catch: java.lang.Throwable -> Lc3
        L126:
            java.lang.Object r1 = r1.f2168     // Catch: java.lang.Throwable -> L13e
            ᛵᲀᲇᛸ r1 = (defpackage.C0964) r1     // Catch: java.lang.Throwable -> L13e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L13e
            r5 = -1
            r1.m1910(r4, r5, r12)     // Catch: java.lang.Throwable -> L141
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13e
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L13e
            if (r1 == 0) goto L140
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L13e
            r0.interrupt()     // Catch: java.lang.Throwable -> L13e
            goto Lfc
        L13d:
            return
        L13e:
            r0 = move-exception
            goto L144
        L140:
            throw r0     // Catch: java.lang.Throwable -> L13e
        L141:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13e
            throw r0     // Catch: java.lang.Throwable -> L13e
        L144:
            r2.setName(r3)
            throw r0
        L148:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L14b:
            java.lang.Object r0 = r1.f2168
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.m211()
            return
        L153:
            java.lang.Object r0 = r1.f2168
            ᲈᛲᛵᲀ r0 = (defpackage.ComponentCallbacks2C2190) r0
            ᛷᛵᲁ r1 = r0.f9289
            r1.mo232(r0)
            return
        L15d:
            java.lang.Object r0 = r1.f2168
            ᲀᲇᲈᛳ r0 = (defpackage.C1776) r0
            r0.mo723()
            return
        L165:
            java.lang.Object r0 = r1.f2168
            ᛷᛷᛸᛱ r0 = (defpackage.C1315) r0
            android.view.View r1 = r0.f5814
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r1
            if (r1 == 0) goto L172
            r1.setVisibility(r7)
        L172:
            java.lang.Object r0 = r0.f5821
            ᛱᲁᲀᲁ r0 = (defpackage.C0185) r0
            android.view.View r0 = r0.m262()
            com.kongzue.dialogx.interfaces.AbstractC0008.m242(r0)
            return
        L17e:
            java.lang.Object r0 = r1.f2168
            ᲁᛲᲇᲁ r0 = (defpackage.C1825) r0
            java.lang.Object r0 = r0.f7965
            ᛷᛷᛸᛱ r0 = (defpackage.C1315) r0
            android.widget.EditText r1 = r0.f5817
            if (r1 != 0) goto L18b
            goto L1a9
        L18b:
            r1.requestFocus()
            android.widget.EditText r1 = r0.f5817
            r1.setFocusableInTouchMode(r11)
            java.lang.Object r1 = r0.f5821
            ᛱᲁᲀᲁ r1 = (defpackage.C0185) r1
            android.widget.EditText r2 = r0.f5817
            r1.m268(r2, r11)
            android.widget.EditText r0 = r0.f5817
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
        L1a9:
            return
        L1aa:
            java.lang.Object r0 = r1.f2168
            ᛲᲇᛷᲁ r0 = (defpackage.C0375) r0
            ᛱᛵᛷᲈ r5 = r0.f1934
            ᲈᛸᲈᛷ r6 = r0.f1937
            if (r6 == 0) goto L2d8
            long r13 = java.lang.System.currentTimeMillis()
            long r6 = r0.f1932
            r8 = -9223372036854775808
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L1c1
            goto L1c3
        L1c1:
            long r2 = r13 - r6
        L1c3:
            ᛱᛳᛶᛱ r6 = r0.f1945
            ᛷᛵᛱᲀ r6 = r6.getLayoutManager()
            android.graphics.Rect r7 = r0.f1943
            if (r7 != 0) goto L1d4
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0.f1943 = r7
        L1d4:
            ᲈᛸᲈᛷ r10 = r0.f1937
            android.view.View r10 = r10.f9791
            ᛱᛳᛶᛱ r11 = r6.f5691
            if (r11 != 0) goto L1e0
            r7.set(r12, r12, r12, r12)
            goto L1e7
        L1e0:
            android.graphics.Rect r10 = r11.m461(r10)
            r7.set(r10)
        L1e7:
            boolean r7 = r6.mo172()
            if (r7 == 0) goto L22c
            float r7 = r0.f1939
            float r10 = r0.f1924
            float r7 = r7 + r10
            int r7 = (int) r7
            android.graphics.Rect r10 = r0.f1943
            int r10 = r10.left
            int r10 = r7 - r10
            ᛱᛳᛶᛱ r11 = r0.f1945
            int r11 = r11.getPaddingLeft()
            int r10 = r10 - r11
            float r11 = r0.f1924
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 >= 0) goto L209
            if (r10 >= 0) goto L209
            goto L22d
        L209:
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 <= 0) goto L22c
            ᲈᛸᲈᛷ r10 = r0.f1937
            android.view.View r10 = r10.f9791
            int r10 = r10.getWidth()
            int r10 = r10 + r7
            android.graphics.Rect r7 = r0.f1943
            int r7 = r7.right
            int r10 = r10 + r7
            ᛱᛳᛶᛱ r7 = r0.f1945
            int r7 = r7.getWidth()
            ᛱᛳᛶᛱ r11 = r0.f1945
            int r11 = r11.getPaddingRight()
            int r7 = r7 - r11
            int r10 = r10 - r7
            if (r10 <= 0) goto L22c
            goto L22d
        L22c:
            r10 = r12
        L22d:
            boolean r6 = r6.mo170()
            if (r6 == 0) goto L273
            float r6 = r0.f1925
            float r7 = r0.f1927
            float r6 = r6 + r7
            int r6 = (int) r6
            android.graphics.Rect r7 = r0.f1943
            int r7 = r7.top
            int r7 = r6 - r7
            ᛱᛳᛶᛱ r11 = r0.f1945
            int r11 = r11.getPaddingTop()
            int r7 = r7 - r11
            float r11 = r0.f1927
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 >= 0) goto L250
            if (r7 >= 0) goto L250
            r12 = r7
            goto L273
        L250:
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 <= 0) goto L273
            ᲈᛸᲈᛷ r4 = r0.f1937
            android.view.View r4 = r4.f9791
            int r4 = r4.getHeight()
            int r4 = r4 + r6
            android.graphics.Rect r6 = r0.f1943
            int r6 = r6.bottom
            int r4 = r4 + r6
            ᛱᛳᛶᛱ r6 = r0.f1945
            int r6 = r6.getHeight()
            ᛱᛳᛶᛱ r7 = r0.f1945
            int r7 = r7.getPaddingBottom()
            int r6 = r6 - r7
            int r4 = r4 - r6
            if (r4 <= 0) goto L273
            r12 = r4
        L273:
            if (r10 == 0) goto L28f
            ᛱᛳᛶᛱ r6 = r0.f1945
            ᲈᛸᲈᛷ r4 = r0.f1937
            android.view.View r4 = r4.f9791
            int r7 = r4.getWidth()
            ᛱᛳᛶᛱ r4 = r0.f1945
            r4.getWidth()
            r21 = r8
            r8 = r10
            r9 = r2
            r2 = r21
            int r4 = r5.m587(r6, r7, r8, r9)
            goto L296
        L28f:
            r21 = r8
            r8 = r10
            r9 = r2
            r2 = r21
            r4 = r8
        L296:
            if (r12 == 0) goto L2ad
            ᛱᛳᛶᛱ r6 = r0.f1945
            ᲈᛸᲈᛷ r7 = r0.f1937
            android.view.View r7 = r7.f9791
            int r7 = r7.getHeight()
            ᛱᛳᛶᛱ r8 = r0.f1945
            r8.getHeight()
            r8 = r12
            int r12 = r5.m587(r6, r7, r8, r9)
            goto L2ae
        L2ad:
            r8 = r12
        L2ae:
            if (r4 != 0) goto L2b6
            if (r12 == 0) goto L2b3
            goto L2b6
        L2b3:
            r0.f1932 = r2
            goto L2d8
        L2b6:
            long r5 = r0.f1932
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L2be
            r0.f1932 = r13
        L2be:
            ᛱᛳᛶᛱ r2 = r0.f1945
            r2.scrollBy(r4, r12)
            ᲈᛸᲈᛷ r2 = r0.f1937
            if (r2 == 0) goto L2ca
            r0.m1106(r2)
        L2ca:
            ᛱᛳᛶᛱ r2 = r0.f1945
            ᛳᛳᛵᛲ r3 = r0.f1931
            r2.removeCallbacks(r3)
            ᛱᛳᛶᛱ r0 = r0.f1945
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            r0.postOnAnimation(r1)
        L2d8:
            return
        L2d9:
            java.lang.Object r0 = r1.f2168
            ᲈᛷᲀᲀ r0 = (defpackage.C2295) r0
            r0.m3715()
            throw r10
        L2e1:
            java.lang.Object r0 = r1.f2168
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            ᛷᛸᛱᛸ r1 = r0.f1606
            if (r1 == 0) goto L2fe
            ᛷᛸᛱᛸ r1 = r0.f1606
            if (r1 != 0) goto L2fe
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            r2 = 14
            r1.<init>(r2, r12)
            java.lang.Object r2 = defpackage.AbstractComponentCallbacksC0293.f1596
            r1.f5856 = r2
            r1.f5857 = r2
            r1.f5859 = r2
            r0.f1606 = r1
        L2fe:
            return
        L2ff:
            java.lang.Object r0 = r1.f2168
            ᲁᛴᛷᛴ r0 = (defpackage.C1848) r0
            android.animation.ValueAnimator r1 = r0.f8074
            int r2 = r0.f8071
            if (r2 == r11) goto L30c
            if (r2 == r9) goto L30f
            goto L32d
        L30c:
            r1.cancel()
        L30f:
            r2 = 3
            r0.f8071 = r2
            java.lang.Object r0 = r1.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r2 = new float[r9]
            r2[r12] = r0
            r2[r11] = r4
            r1.setFloatValues(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r1.start()
        L32d:
            return
        L32e:
            java.lang.Object r0 = r1.f2168
            ᛲᲈᲁᛸ r0 = (defpackage.C0398) r0
            r0.f2049 = r10
            r0.drawableStateChanged()
            return
        L338:
            java.lang.Object r0 = r1.f2168
            r2 = r0
            ᛵ r2 = (defpackage.C0804) r2
        L33d:
            boolean r0 = r2.f3717
            if (r0 == 0) goto L39f
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r2.f3718
            long r3 = r3 - r5
            long r5 = r2.f3721
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L37c
            float r0 = (float) r3
            float r3 = (float) r5
            float r0 = r0 / r3
            android.view.animation.Interpolator r3 = r2.f3722
            if (r3 == 0) goto L359
            float r0 = r3.getInterpolation(r0)
        L359:
            float r3 = r2.f3723
            float r4 = r2.f3713
            float r4 = r4 - r3
            float r4 = r4 * r0
            float r4 = r4 + r3
            ᛵᛴᲁᛲ r0 = r2.f3716
            if (r0 == 0) goto L393
            android.os.Handler r0 = r2.f3719
            if (r0 != 0) goto L373
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            r2.f3719 = r0
        L373:
            ᛷᛱᛶᛲ r3 = new ᛷᛱᛶᛲ
            r3.<init>(r1, r4)
            r0.post(r3)
            goto L393
        L37c:
            r2.f3717 = r12
            int r0 = r2.f3715
            if (r0 == r8) goto L386
            int r3 = r2.f3720
            if (r3 >= r0) goto L393
        L386:
            int r0 = r2.f3720
            int r0 = r0 + r11
            r2.f3720 = r0
            long r3 = java.lang.System.currentTimeMillis()
            r2.f3718 = r3
            r2.f3717 = r11
        L393:
            int r0 = r2.f3714     // Catch: java.lang.InterruptedException -> L39a
            long r3 = (long) r0     // Catch: java.lang.InterruptedException -> L39a
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L39a
            goto L33d
        L39a:
            r0 = move-exception
            r0.printStackTrace()
            goto L33d
        L39f:
            return
        L3a0:
            java.lang.Object r0 = r1.f2168
            ᲈᲇᛵᛳ r0 = (defpackage.DialogInterfaceOnCancelListenerC2351) r0
            ᛴᛲᛵᲈ r0 = r0.f10145
            r0.getClass()
            return
        L3aa:
            java.lang.Object r0 = r1.f2168
            ᲀᲀᛲᛴ r0 = (defpackage.C1732) r0
            r0.mo2037()
            return
        L3b2:
            java.lang.Object r0 = r1.f2168
            ᲁᲀᛷ r0 = (defpackage.ViewOnTouchListenerC1911) r0
            ᛲᲈᲁᛸ r4 = r0.f8315
            ᛸᛸᛷᲇ r5 = r0.f8318
            boolean r6 = r0.f8324
            if (r6 != 0) goto L3c0
            goto L43d
        L3c0:
            boolean r6 = r0.f8320
            if (r6 == 0) goto L3d6
            r0.f8320 = r12
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r5.f6854 = r6
            r8 = -1
            r5.f6860 = r8
            r5.f6859 = r6
            r6 = 1056964608(0x3f000000, float:0.5)
            r5.f6852 = r6
        L3d6:
            long r6 = r5.f6860
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L3eb
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r8 = r5.f6860
            int r10 = r5.f6853
            long r10 = (long) r10
            long r8 = r8 + r10
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L3eb
            goto L3f1
        L3eb:
            boolean r6 = r0.m3345()
            if (r6 != 0) goto L3f4
        L3f1:
            r0.f8324 = r12
            goto L43d
        L3f4:
            boolean r6 = r0.f8314
            if (r6 == 0) goto L411
            r0.f8314 = r12
            long r13 = android.os.SystemClock.uptimeMillis()
            r19 = 0
            r20 = 0
            r17 = 3
            r18 = 0
            r15 = r13
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r13, r15, r17, r18, r19, r20)
            r4.onTouchEvent(r6)
            r6.recycle()
        L411:
            long r6 = r5.f6859
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L43e
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r6 = r5.m2822(r2)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r6
            float r7 = r7 * r6
            r8 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r8
            float r6 = r6 + r7
            long r7 = r5.f6859
            long r7 = r2 - r7
            r5.f6859 = r2
            float r2 = (float) r7
            float r2 = r2 * r6
            float r3 = r5.f6855
            float r2 = r2 * r3
            int r2 = (int) r2
            ᛲᲈᲁᛸ r0 = r0.f8322
            r0.scrollListBy(r2)
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r4.postOnAnimation(r1)
        L43d:
            return
        L43e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r1)
            throw r0
        L446:
            java.lang.Object r0 = r1.f2168
            ᛷᛸᛱᛸ r0 = (defpackage.C1326) r0
        L44a:
            java.lang.Object r1 = r0.f5857     // Catch: java.lang.InterruptedException -> L458
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1     // Catch: java.lang.InterruptedException -> L458
            java.lang.ref.Reference r1 = r1.remove()     // Catch: java.lang.InterruptedException -> L458
            ᲀᛴᲀ r1 = (defpackage.C1664) r1     // Catch: java.lang.InterruptedException -> L458
            r0.m2467(r1)     // Catch: java.lang.InterruptedException -> L458
            goto L44a
        L458:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L44a
        L460:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r1.f2168
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
    }
}
