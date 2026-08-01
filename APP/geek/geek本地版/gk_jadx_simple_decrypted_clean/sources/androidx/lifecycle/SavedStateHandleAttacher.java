package androidx.lifecycle;

import defpackage.iq;
import defpackage.mq;
import defpackage.oq;
import defpackage.p10;
import defpackage.q10;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements mq {
    public final p10 a;

    public SavedStateHandleAttacher(p10 r1) {
        this.a = r1;
    }

    @Override // defpackage.mq
    public final void b(oq r2, iq r3) {
        if (r3 != iq.ON_CREATE) goto L9;
        r2.e().f(this);
        p10 r22 = this.a;
        if (r22.b == true) goto L10;
        r22.c = r22.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        r22.b = true;
        q10 r23 = (q10) r22.d.a();
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + r3).toString());
    }
}
