package p000;

/* JADX INFO: renamed from: vw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0925vw implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11446;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f11447;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.view.KeyEvent.Callback f11448;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f11449;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f11450;

    public /* synthetic */ RunnableC0925vw(int r2, android.app.Activity r3, p000.C0558mq r4, java.lang.String r5) {
            r1 = this;
            r0 = 3
            r1.f11446 = r0
            r1.<init>()
            r1.f11447 = r2
            r1.f11448 = r3
            r1.f11450 = r4
            r1.f11449 = r5
            return
    }

    public /* synthetic */ RunnableC0925vw(android.app.Activity r2, java.lang.String r3, int r4, p000.C0999xw r5) {
            r1 = this;
            r0 = 0
            r1.f11446 = r0
            r1.<init>()
            r1.f11448 = r2
            r1.f11449 = r3
            r1.f11447 = r4
            r1.f11450 = r5
            return
    }

    public /* synthetic */ RunnableC0925vw(android.view.ViewGroup r1, int r2, android.widget.FrameLayout r3, p000.dz0 r4, int r5) {
            r0 = this;
            r0.f11446 = r5
            r0.f11448 = r1
            r0.f11447 = r2
            r0.f11449 = r3
            r0.f11450 = r4
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0925vw(android.widget.ProgressBar r2, int r3, android.widget.TextView r4, java.lang.String r5) {
            r1 = this;
            r0 = 4
            r1.f11446 = r0
            r1.<init>()
            r1.f11448 = r2
            r1.f11447 = r3
            r1.f11450 = r4
            r1.f11449 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.f11446
            r3 = 16
            r4 = 0
            switch(r1) {
                case 0: goto L106;
                case 1: goto Le1;
                case 2: goto Lbc;
                case 3: goto L25;
                default: goto La;
            }
        La:
            android.view.KeyEvent$Callback r1 = r0.f11448
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r2 = r0.f11447
            java.lang.Object r3 = r0.f11450
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r0 = r0.f11449
            java.lang.String r0 = (java.lang.String) r0
            r5 = 100
            int r2 = p000.j81.m2906(r2, r4, r5)
            r1.setProgress(r2)
            r3.setText(r0)
            return
        L25:
            int r1 = r0.f11447
            android.view.KeyEvent$Callback r3 = r0.f11448
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r0.f11450
            mq r4 = (p000.C0558mq) r4
            java.lang.Object r0 = r0.f11449
            java.lang.String r0 = (java.lang.String) r0
            sh1 r5 = p000.sh1.f9903
            java.util.concurrent.atomic.AtomicInteger r6 = p000.sh1.f9909
            int r6 = r6.get()
            if (r6 == r1) goto L44
            java.lang.String r0 = "auto next pager fallback cancelled by newer interaction"
            p000.sh1.m5510(r0)
            goto Lbb
        L44:
            java.lang.ref.WeakReference r1 = p000.sh1.f9912
            if (r1 == 0) goto L50
            java.lang.Object r1 = r1.get()
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2
            goto L51
        L50:
            r2 = 0
        L51:
            if (r2 == r3) goto L59
            java.lang.String r0 = "auto next pager fallback cancelled: activity changed"
            p000.sh1.m5510(r0)
            goto Lbb
        L59:
            pq r1 = p000.C0696pq.f8651
            mq r1 = p000.C0696pq.m4566()
            if (r1 != 0) goto L62
            goto L9e
        L62:
            long r6 = r1.f7247
            long r8 = r4.f7247
            java.lang.String r2 = r4.f7244
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L6d
            goto L7e
        L6d:
            if (r2 == 0) goto L9e
            boolean r6 = p000.q02.m4671(r2)
            if (r6 == 0) goto L76
            goto L9e
        L76:
            java.lang.String r6 = r1.f7244
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L9e
        L7e:
            long r2 = r4.f7247
            long r4 = r1.f7247
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "auto next pager confirmed work change class="
            java.lang.String r5 = ", generation="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r4, r0, r2, r5)
            java.lang.String r2 = "->"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.sh1.m5510(r0)
            goto Lbb
        L9e:
            boolean r1 = r5.m5521(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "auto next pager work unchanged class="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", nativeSwipeScheduled="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.sh1.m5510(r0)
        Lbb:
            return
        Lbc:
            android.view.KeyEvent$Callback r1 = r0.f11448
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = r0.f11447
            java.lang.Object r5 = r0.f11449
            android.widget.HorizontalScrollView r5 = (android.widget.HorizontalScrollView) r5
            java.lang.Object r0 = r0.f11450
            dz0 r0 = (p000.dz0) r0
            android.view.View r1 = r1.getChildAt(r2)
            if (r1 != 0) goto Ld1
            goto Le0
        Ld1:
            int r1 = r1.getLeft()
            int r0 = r0.m1825(r3)
            int r1 = r1 - r0
            if (r1 >= 0) goto Ldd
            r1 = r4
        Ldd:
            r5.smoothScrollTo(r1, r4)
        Le0:
            return
        Le1:
            android.view.KeyEvent$Callback r1 = r0.f11448
            android.widget.GridLayout r1 = (android.widget.GridLayout) r1
            int r2 = r0.f11447
            java.lang.Object r5 = r0.f11449
            android.widget.ScrollView r5 = (android.widget.ScrollView) r5
            java.lang.Object r0 = r0.f11450
            dz0 r0 = (p000.dz0) r0
            android.view.View r1 = r1.getChildAt(r2)
            if (r1 != 0) goto Lf6
            goto L105
        Lf6:
            int r1 = r1.getTop()
            int r0 = r0.m1825(r3)
            int r1 = r1 - r0
            if (r1 >= 0) goto L102
            r1 = r4
        L102:
            r5.smoothScrollTo(r4, r1)
        L105:
            return
        L106:
            android.view.KeyEvent$Callback r1 = r0.f11448
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r5 = r0.f11449
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.f11447
            java.lang.Object r0 = r0.f11450
            xw r0 = (p000.C0999xw) r0
            r7 = 24
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 4
            r9 = -1
            r10 = 1
            android.content.res.Resources r11 = r1.getResources()     // Catch: java.lang.Throwable -> L241
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch: java.lang.Throwable -> L241
            float r11 = r11.density     // Catch: java.lang.Throwable -> L241
            ww r12 = new ww     // Catch: java.lang.Throwable -> L241
            r12.<init>(r4, r11)     // Catch: java.lang.Throwable -> L241
            android.widget.LinearLayout r11 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L241
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L241
            r11.setOrientation(r10)     // Catch: java.lang.Throwable -> L241
            r13 = 17
            r11.setGravity(r13)     // Catch: java.lang.Throwable -> L241
            java.lang.Object r14 = r12.invoke(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r14 = (java.lang.Number) r14     // Catch: java.lang.Throwable -> L241
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> L241
            java.lang.Object r15 = r12.invoke(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Throwable -> L241
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L241
            java.lang.Object r7 = r12.invoke(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L241
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L241
            java.lang.Object r16 = r12.invoke(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r16 = (java.lang.Number) r16     // Catch: java.lang.Throwable -> L241
            int r2 = r16.intValue()     // Catch: java.lang.Throwable -> L241
            r11.setPadding(r14, r15, r7, r2)     // Catch: java.lang.Throwable -> L241
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L241
            r2.<init>()     // Catch: java.lang.Throwable -> L241
            r7 = -436207616(0xffffffffe6000000, float:-1.5111573E23)
            r2.setColor(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.Object r3 = r12.invoke(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L241
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L241
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L241
            r2.setCornerRadius(r3)     // Catch: java.lang.Throwable -> L241
            r11.setBackground(r2)     // Catch: java.lang.Throwable -> L241
            android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> L241
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L241
            java.lang.String r3 = " 温馨提醒"
            r2.setText(r3)     // Catch: java.lang.Throwable -> L241
            r3 = 1099956224(0x41900000, float:18.0)
            r2.setTextSize(r3)     // Catch: java.lang.Throwable -> L241
            r2.setTextColor(r9)     // Catch: java.lang.Throwable -> L241
            r2.setGravity(r13)     // Catch: java.lang.Throwable -> L241
            r11.addView(r2)     // Catch: java.lang.Throwable -> L241
            android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> L241
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L241
            r2.setText(r5)     // Catch: java.lang.Throwable -> L241
            r3 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r3)     // Catch: java.lang.Throwable -> L241
            r2.setTextColor(r9)     // Catch: java.lang.Throwable -> L241
            r2.setGravity(r13)     // Catch: java.lang.Throwable -> L241
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Object r3 = r12.invoke(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L241
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L241
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L241
            java.lang.Object r7 = r12.invoke(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L241
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L241
            r2.setPadding(r4, r3, r4, r7)     // Catch: java.lang.Throwable -> L241
            r3 = 260(0x104, float:3.64E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Object r3 = r12.invoke(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L241
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L241
            r2.setMaxWidth(r3)     // Catch: java.lang.Throwable -> L241
            r11.addView(r2)     // Catch: java.lang.Throwable -> L241
            android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> L241
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L241
            int r3 = r6 / 60
            int r6 = r6 % 60
            java.lang.String r7 = "分钟"
            java.lang.String r12 = "已连续使用 "
            if (r3 <= 0) goto L20c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L241
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L241
            r14.append(r3)     // Catch: java.lang.Throwable -> L241
            java.lang.String r3 = "小时"
            r14.append(r3)     // Catch: java.lang.Throwable -> L241
            r14.append(r6)     // Catch: java.lang.Throwable -> L241
            r14.append(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.String r3 = r14.toString()     // Catch: java.lang.Throwable -> L241
            goto L21b
        L20c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L241
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L241
            r3.append(r6)     // Catch: java.lang.Throwable -> L241
            r3.append(r7)     // Catch: java.lang.Throwable -> L241
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L241
        L21b:
            r2.setText(r3)     // Catch: java.lang.Throwable -> L241
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)     // Catch: java.lang.Throwable -> L241
            r3 = -1426063361(0xffffffffaaffffff, float:-4.5474732E-13)
            r2.setTextColor(r3)     // Catch: java.lang.Throwable -> L241
            r2.setGravity(r13)     // Catch: java.lang.Throwable -> L241
            r11.addView(r2)     // Catch: java.lang.Throwable -> L241
            android.widget.Toast r2 = new android.widget.Toast     // Catch: java.lang.Throwable -> L241
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L241
            r2.setView(r11)     // Catch: java.lang.Throwable -> L241
            r2.setDuration(r10)     // Catch: java.lang.Throwable -> L241
            r2.setGravity(r13, r4, r4)     // Catch: java.lang.Throwable -> L241
            r2.show()     // Catch: java.lang.Throwable -> L241
            goto L248
        L241:
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r5, r10)     // Catch: java.lang.Throwable -> L248
            r2.show()     // Catch: java.lang.Throwable -> L248
        L248:
            boolean r0 = r0.f12333
            if (r0 == 0) goto L2a3
            long[] r0 = new long[r8]     // Catch: java.lang.Throwable -> L268
            r0 = {x02b0: FILL_ARRAY_DATA , data: [0, 200, 100, 200} // fill-array     // Catch: java.lang.Throwable -> L268
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L268
            r3 = 31
            if (r2 < r3) goto L27b
            java.lang.String r2 = "vibrator_manager"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L268
            boolean r2 = p000.AbstractC0671p1.m4351(r1)     // Catch: java.lang.Throwable -> L268
            if (r2 == 0) goto L26a
            android.os.VibratorManager r1 = p000.AbstractC0671p1.m4360(r1)     // Catch: java.lang.Throwable -> L268
            goto L26b
        L268:
            r0 = move-exception
            goto L293
        L26a:
            r1 = 0
        L26b:
            if (r1 == 0) goto L2a3
            android.os.Vibrator r1 = p000.AbstractC0671p1.m4359(r1)     // Catch: java.lang.Throwable -> L268
            if (r1 == 0) goto L2a3
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createWaveform(r0, r9)     // Catch: java.lang.Throwable -> L268
            r1.vibrate(r0)     // Catch: java.lang.Throwable -> L268
            goto L2a3
        L27b:
            java.lang.String r2 = "vibrator"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L268
            boolean r2 = r1 instanceof android.os.Vibrator     // Catch: java.lang.Throwable -> L268
            if (r2 == 0) goto L288
            android.os.Vibrator r1 = (android.os.Vibrator) r1     // Catch: java.lang.Throwable -> L268
            goto L289
        L288:
            r1 = 0
        L289:
            if (r1 == 0) goto L2a3
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createWaveform(r0, r9)     // Catch: java.lang.Throwable -> L268
            r1.vibrate(r0)     // Catch: java.lang.Throwable -> L268
            goto L2a3
        L293:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "振动失败: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            java.lang.String r1 = "DYHelper:DurationAlert"
            r2 = 0
            p000.C0888ux.m5988(r1, r0, r2, r8, r2)
        L2a3:
            return
    }
}
