package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements defpackage.mq {
    @Override // defpackage.mq
    public final void b(defpackage.oq r2, defpackage.iq r3) {
            r1 = this;
            iq r2 = defpackage.iq.ON_START
            boolean r2 = r2.equals(r3)
            r0 = 0
            if (r2 != 0) goto L1c
            iq r2 = defpackage.iq.ON_STOP
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1b
            iq r2 = defpackage.iq.ON_DESTROY
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            return
        L1a:
            throw r0
        L1b:
            throw r0
        L1c:
            throw r0
    }
}
