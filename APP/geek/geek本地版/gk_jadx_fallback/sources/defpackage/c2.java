package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends android.os.Handler {
    public java.lang.ref.WeakReference a;

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
            r1 = 1
            if (r0 == r1) goto Lf
            return
        Lf:
            java.lang.Object r3 = r3.obj
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r3.dismiss()
            return
        L17:
            java.lang.Object r0 = r3.obj
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            java.lang.ref.WeakReference r1 = r2.a
            java.lang.Object r1 = r1.get()
            android.content.DialogInterface r1 = (android.content.DialogInterface) r1
            int r3 = r3.what
            r0.onClick(r1, r3)
            return
    }
}
