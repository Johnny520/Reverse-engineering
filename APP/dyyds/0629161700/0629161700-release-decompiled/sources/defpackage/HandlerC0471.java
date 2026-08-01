package defpackage;

/* JADX INFO: renamed from: ᛳᛴᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0471 extends android.os.Handler {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f2352;

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
            java.lang.ref.WeakReference r2 = r2.f2352
            java.lang.Object r2 = r2.get()
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            int r3 = r3.what
            r0.onClick(r2, r3)
            return
    }
}
