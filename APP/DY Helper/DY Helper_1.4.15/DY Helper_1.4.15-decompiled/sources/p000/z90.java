package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z90 implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13014;

    public /* synthetic */ z90(int r1) {
            r0 = this;
            r0.f13014 = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            int r0 = r0.f13014
            switch(r0) {
                case 0: goto L10;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u72.f10633
            r1 = 0
            r0.set(r1)
            return
        Lc:
            r0 = 0
            p000.bv1.f1854 = r0
            return
        L10:
            r0 = 0
            p000.ia0.f4971 = r0
            return
    }
}
