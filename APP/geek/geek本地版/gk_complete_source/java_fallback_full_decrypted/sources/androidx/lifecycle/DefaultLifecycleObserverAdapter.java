package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements defpackage.mq {
    public final defpackage.vf a;
    public final defpackage.mq b;

    public DefaultLifecycleObserverAdapter(defpackage.vf r1, defpackage.mq r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r3, defpackage.iq r4) {
            r2 = this;
            int[] r0 = defpackage.wf.a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 7
            if (r0 == r1) goto Lf
            goto L1c
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ON_ANY must not been send by anybody"
            r3.<init>(r4)
            throw r3
        L17:
            vf r0 = r2.a
            r0.a()
        L1c:
            mq r0 = r2.b
            if (r0 == 0) goto L23
            r0.b(r3, r4)
        L23:
            return
    }
}
