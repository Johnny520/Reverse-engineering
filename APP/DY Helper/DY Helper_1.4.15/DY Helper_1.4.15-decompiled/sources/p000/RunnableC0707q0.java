package p000;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0707q0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8768;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.compose.p001ui.platform.AndroidComposeView f8769;

    public /* synthetic */ RunnableC0707q0(androidx.compose.p001ui.platform.AndroidComposeView r1, int r2) {
            r0 = this;
            r0.f8768 = r2
            r0.f8769 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f8768
            androidx.compose.ui.platform.AndroidComposeView r3 = r3.f8769
            switch(r0) {
                case 0: goto L29;
                case 1: goto Lf;
                default: goto L7;
            }
        L7:
            yp0 r3 = r3.getRoot()
            androidx.compose.p001ui.platform.AndroidComposeView.m370(r3)
            return
        Lf:
            r0 = 0
            r3.f922 = r0
            android.view.MotionEvent r0 = r3.f954
            r0.getClass()
            int r1 = r0.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L23
            r3.m379(r0)
            goto L28
        L23:
            java.lang.String r3 = "The ACTION_HOVER_EXIT event was not cleared."
            p000.C1080.m7279(r3)
        L28:
            return
        L29:
            w6 r3 = r3.f907
            java.lang.Class r0 = androidx.compose.p001ui.platform.AndroidComposeView.f872
            java.lang.String r0 = "AndroidOwner:outOfFrameExecutor"
            android.os.Trace.beginSection(r0)
        L32:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L42
            java.lang.Object r0 = r3.removeLast()     // Catch: java.lang.Throwable -> L46
            p70 r0 = (p000.p70) r0     // Catch: java.lang.Throwable -> L46
            r0.invoke()     // Catch: java.lang.Throwable -> L46
            goto L32
        L42:
            android.os.Trace.endSection()
            return
        L46:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
    }
}
