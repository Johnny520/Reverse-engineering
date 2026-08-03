package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1952b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6886a;

    /* JADX INFO: renamed from: b */
    public String f6887b;

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap f6888c;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C1952b.class != r5.getClass()) goto L15;
        C1952b r52 = (C1952b) r5;
        if (AbstractC1856a.m4063i(this.f6886a, r52.f6886a) == false) goto L15;
        if (AbstractC1856a.m4063i(this.f6887b, r52.f6887b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6886a, this.f6887b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6886a == null) goto L6;
        r42.m4106p("name");
        r42.m4115z(this.f6886a);
    L6:
        if (this.f6887b == null) goto L8;
        r42.m4106p("version");
        r42.m4115z(this.f6887b);
    L8:
        ConcurrentHashMap r0 = this.f6888c;
        if (r0 == null) goto L14;
        Iterator r02 = r0.keySet().iterator();
    L12:
        if (r02.hasNext() == false) goto L14;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6888c, r1, r42, r1, r5);
    L14:
        r42.m4102k();
    }
}
