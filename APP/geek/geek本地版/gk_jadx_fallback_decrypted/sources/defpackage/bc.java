package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements defpackage.i20 {
    public final java.util.concurrent.atomic.AtomicReference a;

    public bc(defpackage.l20 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // defpackage.i20
    public final java.util.Iterator iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            i20 r0 = (defpackage.i20) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This sequence can be consumed only once."
            r0.<init>(r1)
            throw r0
    }
}
