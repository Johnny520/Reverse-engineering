package p000;

/* JADX INFO: renamed from: tm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0840tm implements p000.fr0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10411;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.activity.ComponentActivity f10412;

    public /* synthetic */ C0840tm(androidx.activity.ComponentActivity r1, int r2) {
            r0 = this;
            r0.f10411 = r2
            r0.f10412 = r1
            r0.<init>()
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r2, p000.br0 r3) {
            r1 = this;
            int r0 = r1.f10411
            switch(r0) {
                case 0: goto L87;
                case 1: goto L4a;
                case 2: goto L27;
                default: goto L5;
            }
        L5:
            br0 r0 = p000.br0.ON_CREATE
            if (r3 != r0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L26
            androidx.activity.ComponentActivity r1 = r1.f10412
            d51 r1 = r1.f345
            androidx.activity.ComponentActivity r2 = (androidx.activity.ComponentActivity) r2
            android.window.OnBackInvokedDispatcher r2 = p000.AbstractC0877um.m5937(r2)
            r1.getClass()
            r2.getClass()
            r1.f2897 = r2
            boolean r2 = r1.f2899
            r1.m1654(r2)
        L26:
            return
        L27:
            androidx.activity.ComponentActivity r2 = r1.f10412
            q92 r3 = r2.f344
            if (r3 != 0) goto L44
            java.lang.Object r3 = r2.getLastNonConfigurationInstance()
            vm r3 = (p000.C0915vm) r3
            if (r3 == 0) goto L39
            q92 r3 = r3.f11346
            r2.f344 = r3
        L39:
            q92 r3 = r2.f344
            if (r3 != 0) goto L44
            q92 r3 = new q92
            r3.<init>()
            r2.f344 = r3
        L44:
            jr0 r2 = r2.f342
            r2.m2985(r1)
            return
        L4a:
            br0 r2 = p000.br0.ON_DESTROY
            if (r3 != r2) goto L86
            androidx.activity.ComponentActivity r2 = r1.f10412
            a r2 = r2.f340
            r3 = 0
            r2.f1 = r3
            androidx.activity.ComponentActivity r2 = r1.f10412
            boolean r2 = r2.isChangingConfigurations()
            if (r2 != 0) goto L66
            androidx.activity.ComponentActivity r2 = r1.f10412
            q92 r2 = r2.mo191()
            r2.m4818()
        L66:
            androidx.activity.ComponentActivity r1 = r1.f10412
            wm r1 = r1.f346
            androidx.activity.ComponentActivity r2 = r1.f11762
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.removeCallbacks(r1)
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnDrawListener(r1)
        L86:
            return
        L87:
            br0 r2 = p000.br0.ON_STOP
            if (r3 != r2) goto L9e
            androidx.activity.ComponentActivity r1 = r1.f10412
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L98
            android.view.View r1 = r1.peekDecorView()
            goto L99
        L98:
            r1 = 0
        L99:
            if (r1 == 0) goto L9e
            r1.cancelPendingInputEvents()
        L9e:
            return
    }
}
