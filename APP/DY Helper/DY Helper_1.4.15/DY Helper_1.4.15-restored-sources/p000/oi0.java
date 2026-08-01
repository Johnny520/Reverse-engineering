package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi0 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8115;

    public /* synthetic */ oi0(int r1) {
            r0 = this;
            r0.f8115 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            int r6 = r6.f8115
            r0 = 0
            r1 = 1
            switch(r6) {
                case 0: goto L105;
                default: goto L7;
            }
        L7:
            int r6 = r8.getActionMasked()
            if (r6 != 0) goto L104
            long r6 = android.os.SystemClock.uptimeMillis()
            long r2 = p000.a01.f10
            long r2 = r6 - r2
            r4 = 350(0x15e, double:1.73E-321)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L102
            r6 = 0
            p000.a01.f10 = r6
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.a01.f4
            be0 r6 = p000.be0.f1670
            boolean r7 = r6.m938()
            if (r7 != 0) goto L2b
            goto L104
        L2b:
            java.util.concurrent.atomic.AtomicInteger r7 = p000.a01.f8
            int r8 = r7.get()
            if (r8 <= 0) goto L38
            p000.a01.m6(r1)
            goto L104
        L38:
            ae0 r6 = r6.m945()
            int[] r8 = p000.zz0.f13383
            int r2 = r6.ordinal()
            r8 = r8[r2]
            java.lang.String r2 = "rbe3d87ed96de26de"
            if (r8 != r1) goto Lf0
            boolean r6 = p000.ui1.m5867()
            r8 = 30
            if (r6 != 0) goto L51
            goto L62
        L51:
            java.lang.String r6 = "hidden_contact_peek_duration_seconds"
            android.content.SharedPreferences r1 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L5b
            int r8 = r1.getInt(r6, r8)     // Catch: java.lang.Throwable -> L5b
        L5b:
            r6 = 5
            r1 = 300(0x12c, float:4.2E-43)
            int r8 = p000.j81.m2906(r8, r6, r1)
        L62:
            java.util.concurrent.atomic.AtomicReference r6 = p000.a01.f6
            java.lang.Object r1 = r6.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L7f
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L7f
            java.lang.String r1 = r1.toString()
            goto L80
        L7f:
            r1 = 0
        L80:
            if (r1 != 0) goto L84
            java.lang.String r1 = ""
        L84:
            boolean r3 = p000.q02.m4671(r1)
            if (r3 != 0) goto La0
            r3 = 40
            boolean r3 = p000.q02.m4655(r1, r3)
            if (r3 == 0) goto L9b
            r3 = 41
            boolean r3 = p000.q02.m4655(r1, r3)
            if (r3 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.atomic.AtomicReference r3 = p000.a01.f7
            r3.set(r1)
        La0:
            fb0 r1 = p000.a01.f9
            if (r1 == 0) goto La9
            android.os.Handler r3 = p000.a01.f5
            r3.removeCallbacks(r1)
        La9:
            r7.set(r8)
            java.util.concurrent.atomic.AtomicInteger r7 = p000.a01.f8
            int r7 = r7.get()
            java.lang.Object r6 = r6.get()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r6.get()
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto Lc9
            java.lang.String r7 = p000.a01.m5(r7)
            r6.setText(r7)
        Lc9:
            fb0 r6 = new fb0
            r7 = 9
            r6.<init>(r7)
            p000.a01.f9 = r6
            android.os.Handler r7 = p000.a01.f5
            r3 = 1000(0x3e8, double:4.94E-321)
            r7.postDelayed(r6, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "临时显示倒计时已开始: "
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r7 = "s"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            p000.C0888ux.m5975(r2, r6)
            goto L104
        Lf0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "双击临时显示未生效: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p000.C0888ux.m5975(r2, r6)
            goto L104
        L102:
            p000.a01.f10 = r6
        L104:
            return r0
        L105:
            int r6 = r8.getActionMasked()
            if (r6 == 0) goto L11f
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r1) goto L118
            r2 = 3
            if (r6 == r2) goto L113
            goto L126
        L113:
            r7.setAlpha(r8)
        L116:
            r0 = r1
            goto L126
        L118:
            r7.setAlpha(r8)
            r7.performClick()
            goto L116
        L11f:
            r6 = 1059984507(0x3f2e147b, float:0.68)
            r7.setAlpha(r6)
            goto L116
        L126:
            return r0
    }
}
