package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1958h implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6936a;

    /* JADX INFO: renamed from: b */
    public String f6937b;

    /* JADX INFO: renamed from: c */
    public String f6938c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f6939d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6936a == null) goto L6;
        r42.m4106p("city");
        r42.m4115z(this.f6936a);
    L6:
        if (this.f6937b == null) goto L9;
        r42.m4106p("country_code");
        r42.m4115z(this.f6937b);
    L9:
        if (this.f6938c == null) goto L11;
        r42.m4106p("region");
        r42.m4115z(this.f6938c);
    L11:
        ConcurrentHashMap r0 = this.f6939d;
        if (r0 == null) goto L17;
        Iterator r02 = r0.keySet().iterator();
    L15:
        if (r02.hasNext() == false) goto L17;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6939d, r1, r42, r1, r5);
    L17:
        r42.m4102k();
    }
}
