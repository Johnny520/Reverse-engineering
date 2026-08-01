package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements defpackage.mq {
    public boolean a;

    @Override // defpackage.mq
    public final void b(defpackage.oq r2, defpackage.iq r3) {
            r1 = this;
            iq r0 = defpackage.iq.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.a = r3
            androidx.lifecycle.a r2 = r2.e()
            r2.f(r1)
        Le:
            return
    }
}
