package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements defpackage.mq {
    public final defpackage.yn[] a;

    public CompositeGeneratedAdaptersObserver(defpackage.yn[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r3, defpackage.iq r4) {
            r2 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            yn[] r3 = r2.a
            int r4 = r3.length
            r0 = 0
            r1 = 0
            if (r4 > 0) goto L13
            int r4 = r3.length
            if (r4 > 0) goto L10
            return
        L10:
            r3 = r3[r1]
            throw r0
        L13:
            r3 = r3[r1]
            throw r0
    }
}
