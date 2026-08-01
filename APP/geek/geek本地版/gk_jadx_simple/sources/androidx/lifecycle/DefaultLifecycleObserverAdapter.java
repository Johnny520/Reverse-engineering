package androidx.lifecycle;

import defpackage.iq;
import defpackage.mq;
import defpackage.oq;
import defpackage.vf;
import defpackage.wf;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements mq {
    public final vf a;
    public final mq b;

    public DefaultLifecycleObserverAdapter(vf r1, mq r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.mq
    public final void b(oq r3, iq r4) {
        int r0 = wf.a[r4.ordinal()];
        if (r0 != 3) goto L5;
        this.a.a();
    L10:
        mq r02 = this.b;
        if (r02 == null) goto L14;
        r02.b(r3, r4);
        return;
    L14:
        return;
    L5:
        if (r0 != 7) goto L10;
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
