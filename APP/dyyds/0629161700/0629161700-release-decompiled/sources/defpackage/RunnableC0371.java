package defpackage;

/* JADX INFO: renamed from: ᛲᲇᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0371 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0311 f1919;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2295 f1920;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1921;

    public /* synthetic */ RunnableC0371(defpackage.C0311 r1, defpackage.C2295 r2, int r3) {
            r0 = this;
            r0.f1921 = r3
            r0.f1919 = r1
            r0.f1920 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f1921
            r1 = 1
            r2 = 0
            ᛲᛶᛷᲈ r3 = r10.f1919
            ᲈᛷᲀᲀ r10 = r10.f1920
            switch(r0) {
                case 0: goto L124;
                default: goto Lb;
            }
        Lb:
            java.lang.ref.WeakReference r0 = r3.f1643
            r4 = 0
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get()
            ᛸᛸᲁ r0 = (defpackage.InterfaceC1550) r0
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 == 0) goto L1d
            r0.cancel()
        L1d:
            android.app.Activity r0 = defpackage.C0311.m986()
            android.app.Application r5 = r3.f1642
            boolean r5 = android.provider.Settings.canDrawOverlays(r5)
            if (r5 == 0) goto L31
            ᛷᛱᛳᛴ r0 = new ᛷᛱᛳᛴ
            android.app.Application r5 = r3.f1642
            r0.<init>(r5)
            goto L41
        L31:
            if (r0 == 0) goto L3a
            ᛷᛱᛳᛴ r5 = new ᛷᛱᛳᛴ
            r5.<init>(r0)
            r0 = r5
            goto L41
        L3a:
            ᛲᛳᲁᛶ r0 = new ᛲᛳᲁᛶ
            android.app.Application r5 = r3.f1642
            r0.<init>(r5)
        L41:
            boolean r5 = r0 instanceof defpackage.C1200
            if (r5 != 0) goto L79
            java.lang.String r5 = "android.app.compat.CompatChanges"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = "isChangeEnabled"
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L72
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L72
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L72
            r6 = 147798919(0x8cf3b87, double:7.30223684E-316)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r5.invoke(r4, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L72
            boolean r4 = java.lang.Boolean.parseBoolean(r4)     // Catch: java.lang.Throwable -> L72
            goto L77
        L72:
            r4 = move-exception
            r4.printStackTrace()
            r4 = r2
        L77:
            if (r4 != 0) goto L10d
        L79:
            java.lang.Object r4 = r10.f9710
            ᲀᛴᛱᛱ r4 = (defpackage.C1654) r4
            android.app.Application r5 = r3.f1642
            r4.getClass()
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r5)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            r4.setId(r6)
            r6 = 17
            r4.setGravity(r6)
            r7 = -285212673(0xffffffffeeffffff, float:-3.961408E28)
            r4.setTextColor(r7)
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r8 = 2
            r9 = 1096810496(0x41600000, float:14.0)
            float r7 = android.util.TypedValue.applyDimension(r8, r9, r7)
            r4.setTextSize(r2, r7)
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r8 = 1103101952(0x41c00000, float:24.0)
            float r7 = android.util.TypedValue.applyDimension(r1, r8, r7)
            int r7 = (int) r7
            android.content.res.Resources r8 = r5.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r9 = 1098907648(0x41800000, float:16.0)
            float r8 = android.util.TypedValue.applyDimension(r1, r9, r8)
            int r8 = (int) r8
            r4.setPaddingRelative(r7, r8, r7, r8)
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r8 = -2
            r7.<init>(r8, r8)
            r4.setLayoutParams(r7)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r8 = -1291845632(0xffffffffb3000000, float:-2.9802322E-8)
            r7.setColor(r8)
            android.content.res.Resources r8 = r5.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r9 = 1092616192(0x41200000, float:10.0)
            float r8 = android.util.TypedValue.applyDimension(r1, r9, r8)
            r7.setCornerRadius(r8)
            r4.setBackground(r7)
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r7 = 1077936128(0x40400000, float:3.0)
            float r1 = android.util.TypedValue.applyDimension(r1, r7, r5)
            r4.setZ(r1)
            r0.setView(r4)
            r0.setGravity(r6, r2, r2)
            r1 = 0
            r0.setMargin(r1, r1)
        L10d:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r3.f1643 = r1
            int r1 = r10.f9712
            r0.setDuration(r1)
            java.lang.Object r10 = r10.f9711
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r0.setText(r10)
            r0.show()
            return
        L124:
            r3.getClass()
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.getClass()
            android.app.Activity r0 = defpackage.C0311.m986()
            if (r0 != 0) goto L136
            r2 = 300(0x12c, float:4.2E-43)
        L136:
            long r6 = (long) r2
            long r4 = r4 + r6
            android.os.Handler r0 = defpackage.C0311.f1641
            ᛲᲇᛴᲇ r2 = new ᛲᲇᛴᲇ
            r2.<init>(r3, r10, r1)
            r0.postAtTime(r2, r4)
            return
    }
}
