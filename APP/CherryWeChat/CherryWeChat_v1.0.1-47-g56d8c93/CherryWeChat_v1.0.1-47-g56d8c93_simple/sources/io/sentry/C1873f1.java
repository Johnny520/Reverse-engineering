package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1873f1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public C1970t f6718a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6719b;

    public C1873f1(C1970t r1) {
        this.f6718a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C1873f1) == true) goto L10;
        return false;
    L10:
        return this.f6718a.equals(((C1873f1) r2).f6718a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6718a});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("profiler_id");
        r42.m4112w(r5, this.f6718a);
        ConcurrentHashMap r0 = this.f6719b;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6719b, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
