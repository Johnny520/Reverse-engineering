package p000;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0780s extends android.os.Handler {

    /* JADX INFO: renamed from: α */
    public java.lang.ref.WeakReference f9636;

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = -3
            if (r0 == r1) goto L17
            r1 = -2
            if (r0 == r1) goto L17
            r1 = -1
            if (r0 == r1) goto L17
            r2 = 1
            if (r0 == r2) goto Lf
            return
        Lf:
            java.lang.Object r2 = r3.obj
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r2.dismiss()
            return
        L17:
            java.lang.Object r0 = r3.obj
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            java.lang.ref.WeakReference r2 = r2.f9636
            java.lang.Object r2 = r2.get()
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            int r3 = r3.what
            r0.onClick(r2, r3)
            return
    }
}
