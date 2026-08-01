package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v30 implements android.os.Handler.Callback {
    public final /* synthetic */ defpackage.i0 a;

    public v30(defpackage.i0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r2.what
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            i0 r0 = r1.a
            java.lang.Object r2 = r2.obj
            if (r2 != 0) goto L14
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L11
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        L14:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }
}
