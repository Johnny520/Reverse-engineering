package p000;

/* JADX INFO: renamed from: us */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0883us implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.DialogInterfaceOnCancelListenerC0958ws f10937;

    public DialogInterfaceOnDismissListenerC0883us(p000.DialogInterfaceOnCancelListenerC0958ws r1) {
            r0 = this;
            r0.<init>()
            r0.f10937 = r1
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            ws r0 = r0.f10937
            xm r1 = r0.f11845
            if (r1 == 0) goto L9
            r0.onDismiss(r1)
        L9:
            return
    }
}
