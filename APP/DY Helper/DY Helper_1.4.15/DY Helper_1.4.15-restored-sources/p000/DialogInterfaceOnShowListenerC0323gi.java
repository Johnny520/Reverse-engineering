package p000;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0323gi implements android.content.DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4376;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f4377;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.content.Context f4378;

    public /* synthetic */ DialogInterfaceOnShowListenerC0323gi(java.lang.Object r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f4376 = r3
            r0.f4377 = r1
            r0.f4378 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r3) {
            r2 = this;
            int r3 = r2.f4376
            switch(r3) {
                case 0: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r2.f4377
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            android.content.Context r2 = r2.f4378
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L45
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r3.setBackgroundDrawable(r0)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            r3.setDimAmount(r0)
            r0 = 2
            r3.addFlags(r0)
            r0 = 131080(0x20008, float:1.83682E-40)
            r3.clearFlags(r0)
            r0 = 16
            r3.setSoftInputMode(r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r0 = 1064346583(0x3f70a3d7, float:0.94)
            float r2 = r2 * r0
            int r2 = (int) r2
            r0 = -2
            r3.setLayout(r2, r0)
        L45:
            return
        L46:
            java.lang.Object r3 = r2.f4377
            um1 r3 = (p000.um1) r3
            java.lang.Object r3 = r3.f10912
            if (r3 == 0) goto L8e
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L8d
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r3.setBackgroundDrawable(r0)
            android.view.View r0 = r3.getDecorView()
            r0.setPadding(r1, r1, r1, r1)
            android.content.Context r2 = r2.f4378
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r0 = 1064011039(0x3f6b851f, float:0.92)
            float r2 = r2 * r0
            int r2 = p000.jx0.m3061(r2)
            r0 = -2
            r3.setLayout(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.setDimAmount(r2)
            r2 = 2
            r3.addFlags(r2)
            r2 = 16
            r3.setSoftInputMode(r2)
        L8d:
            return
        L8e:
            java.lang.String r2 = "dialog"
            p000.ln0.m3650(r2)
            r2 = 0
            throw r2
    }
}
