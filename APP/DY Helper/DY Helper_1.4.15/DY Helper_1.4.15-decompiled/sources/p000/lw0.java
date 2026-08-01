package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lw0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6822;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.p002ui.MainActivity f6823;

    public /* synthetic */ lw0(com.example.dyhelper.p002ui.MainActivity r1, int r2) {
            r0 = this;
            r0.f6822 = r2
            r0.f6823 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f6822
            r1 = 1
            com.example.dyhelper.ui.MainActivity r5 = r5.f6823
            switch(r0) {
                case 0: goto L23;
                default: goto L8;
            }
        L8:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            float r6 = (float) r6
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = android.util.TypedValue.applyDimension(r1, r6, r5)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L23:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            if (r6 == 0) goto L2f
            r0 = 2
            goto L30
        L2f:
            r0 = r1
        L30:
            r2 = 0
            android.content.pm.PackageManager r3 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L41
            h22 r4 = r5.f2570     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L41
            android.content.ComponentName r4 = (android.content.ComponentName) r4     // Catch: java.lang.Throwable -> L41
            r3.setComponentEnabledSetting(r4, r0, r1)     // Catch: java.lang.Throwable -> L41
            goto L4a
        L41:
            java.lang.String r0 = "隐藏失败，请检查 Manifest 是否配置了 activity-alias"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
        L4a:
            if (r6 == 0) goto L4f
            java.lang.String r6 = "已隐藏桌面图标，稍后生效"
            goto L51
        L4f:
            java.lang.String r6 = "已恢复桌面图标，稍后生效"
        L51:
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            s62 r5 = p000.s62.f9751
            return r5
    }
}
