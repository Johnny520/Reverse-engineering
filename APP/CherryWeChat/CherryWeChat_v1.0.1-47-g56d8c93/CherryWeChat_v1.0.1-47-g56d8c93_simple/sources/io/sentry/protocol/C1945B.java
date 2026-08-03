package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1945B implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String[] f6846a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6847b;

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C1945B.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Arrays.equals(this.f6846a, ((C1945B) r3).f6846a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6846a);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6846a == null) goto L5;
        r42.m4106p("active_profiles");
        r42.m4112w(r5, this.f6846a);
    L5:
        ConcurrentHashMap r0 = this.f6847b;
        if (r0 == null) goto L11;
        Iterator r02 = r0.keySet().iterator();
    L9:
        if (r02.hasNext() == false) goto L11;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6847b, r1, r42, r1, r5);
    L11:
        r42.m4102k();
    }
}
