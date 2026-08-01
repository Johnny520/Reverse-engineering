package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements android.os.Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto L9
            r3 = 0
            return r3
        L9:
            java.lang.Object r3 = r3.obj
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L14:
            java.lang.Object r3 = r3.obj
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
    }
}
