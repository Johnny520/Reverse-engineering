package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements defpackage.mq {
    public final defpackage.nq a;
    public final defpackage.na b;

    public ReflectiveGenericLifecycleObserver(defpackage.nq r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            pa r0 = defpackage.pa.c
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.a
            java.lang.Object r1 = r1.get(r3)
            na r1 = (defpackage.na) r1
            if (r1 == 0) goto L16
            goto L1b
        L16:
            r1 = 0
            na r1 = r0.a(r3, r1)
        L1b:
            r2.b = r1
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r4, defpackage.iq r5) {
            r3 = this;
            na r0 = r3.b
            java.util.HashMap r0 = r0.a
            java.lang.Object r1 = r0.get(r5)
            java.util.List r1 = (java.util.List) r1
            nq r2 = r3.a
            defpackage.na.a(r1, r4, r5, r2)
            iq r1 = defpackage.iq.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            defpackage.na.a(r0, r4, r5, r2)
            return
    }
}
