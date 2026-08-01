package androidx.lifecycle;

import defpackage.iq;
import defpackage.mq;
import defpackage.na;
import defpackage.nq;
import defpackage.oq;
import defpackage.pa;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements mq {
    public final nq a;
    public final na b;

    public ReflectiveGenericLifecycleObserver(nq r3) {
        this.a = r3;
        pa r0 = pa.c;
        Class<?> r32 = r3.getClass();
        na r1 = (na) r0.a.get(r32);
        if (r1 != null) goto L6;
        r1 = r0.a(r32, null);
    L6:
        this.b = r1;
    }

    @Override // defpackage.mq
    public final void b(oq r4, iq r5) {
        HashMap r0 = this.b.a;
        List r1 = (List) r0.get(r5);
        nq r2 = this.a;
        na.a(r1, r4, r5, r2);
        na.a((List) r0.get(iq.ON_ANY), r4, r5, r2);
    }
}
