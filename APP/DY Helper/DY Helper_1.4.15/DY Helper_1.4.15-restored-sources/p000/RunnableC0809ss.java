package p000;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0809ss implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10005;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.DialogInterfaceOnCancelListenerC0958ws f10006;

    public /* synthetic */ RunnableC0809ss(p000.DialogInterfaceOnCancelListenerC0958ws r1, int r2) {
            r0 = this;
            r0.f10005 = r2
            r0.f10006 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f10005
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            ws r1 = r1.f10006
            m60 r0 = r1.f7412
            if (r0 == 0) goto L12
            m60 r1 = r1.m3996()
            r1.getClass()
        L12:
            return
        L13:
            ws r1 = r1.f10006
            us r0 = r1.f11837
            xm r1 = r1.f11845
            r0.onDismiss(r1)
            return
    }
}
