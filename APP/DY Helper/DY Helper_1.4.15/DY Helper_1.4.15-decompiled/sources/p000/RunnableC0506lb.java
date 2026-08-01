package p000;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0506lb implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6529;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f6530;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f6531;

    public /* synthetic */ RunnableC0506lb(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.f6529 = r3
            r0.f6530 = r1
            r0.f6531 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f6529
            int r1 = r3.f6531
            android.view.View r3 = r3.f6530
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L15
            tg r0 = p000.AbstractC0871ug.f10771
            r2 = 0
            r0.m5694(r3, r1, r2)
        L15:
            return
        L16:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5407(r3, r1)
            return
    }
}
