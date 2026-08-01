package androidx.lifecycle;

import defpackage.iq;
import defpackage.mq;
import defpackage.oq;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements mq {
    public boolean a;

    @Override // defpackage.mq
    public final void b(oq r2, iq r3) {
        if (r3 != iq.ON_DESTROY) goto L6;
        this.a = false;
        r2.e().f(this);
        return;
    }
}
