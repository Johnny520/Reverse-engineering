package p000;

/* JADX INFO: renamed from: fi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0286fi implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3944;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.TextView f3945;

    public /* synthetic */ C0286fi(android.widget.TextView r1, int r2) {
            r0 = this;
            r0.f3944 = r2
            r0.f3945 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f3944
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L4f;
                case 2: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            android.widget.TextView r2 = r2.f3945
            r2.setText(r3)
            android.view.ViewPropertyAnimator r3 = r2.animate()
            r0 = 1051931443(0x3eb33333, float:0.35)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r0)
            r0 = 70
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            bu1 r0 = new bu1
            r1 = 0
            r0.<init>(r2, r1)
            android.view.ViewPropertyAnimator r2 = r3.withEndAction(r0)
            r2.start()
        L2d:
            s62 r2 = p000.s62.f9751
            return r2
        L30:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "当前账号已隐藏 "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " 人"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.widget.TextView r2 = r2.f3945
            r2.setText(r3)
            goto L2d
        L4f:
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            android.widget.TextView r2 = r2.f3945
            if (r2 == 0) goto L5b
            r2.setText(r3)
        L5b:
            s62 r2 = p000.s62.f9751
            return r2
        L5e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            android.widget.TextView r2 = r2.f3945
            r2.setEnabled(r3)
            if (r3 == 0) goto L6e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L71
        L6e:
            r0 = 1054280253(0x3ed70a3d, float:0.42)
        L71:
            r2.setAlpha(r0)
            if (r3 == 0) goto L79
            java.lang.String r3 = "确定颜色"
            goto L7b
        L79:
            java.lang.String r3 = "颜色代码无效，暂不能确定"
        L7b:
            r2.setContentDescription(r3)
            goto L2d
    }
}
