package androidx.activity.result;

import defpackage.iq;
import defpackage.mq;
import defpackage.oq;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements mq {
    @Override // defpackage.mq
    public final void b(oq r2, iq r3) {
        if (iq.ON_START.equals(r3) == false) goto L5;
        throw null;
    L5:
        if (iq.ON_STOP.equals(r3) == false) goto L7;
        throw null;
    L7:
        if (iq.ON_DESTROY.equals(r3) == true) goto L9;
        return;
    L9:
        throw null;
    }
}
