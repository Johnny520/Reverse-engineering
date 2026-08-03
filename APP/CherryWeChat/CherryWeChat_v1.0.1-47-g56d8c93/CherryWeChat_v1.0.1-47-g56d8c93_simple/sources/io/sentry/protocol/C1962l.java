package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1962l implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6965a;

    /* JADX INFO: renamed from: b */
    public String f6966b;

    /* JADX INFO: renamed from: c */
    public List f6967c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f6968d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6965a == null) goto L6;
        r42.m4106p("formatted");
        r42.m4115z(this.f6965a);
    L6:
        if (this.f6966b == null) goto L8;
        r42.m4106p("message");
        r42.m4115z(this.f6966b);
    L8:
        List r0 = this.f6967c;
        if (r0 != null) goto L11;
    L13:
        ConcurrentHashMap r02 = this.f6968d;
        if (r02 == null) goto L19;
        Iterator r03 = r02.keySet().iterator();
    L17:
        if (r03.hasNext() == false) goto L19;
        String r1 = (String) r03.next();
        AbstractC1861d.m4087b(this.f6968d, r1, r42, r1, r5);
    L19:
        r42.m4102k();
        return;
    L11:
        if (r0.isEmpty() == true) goto L13;
        r42.m4106p("params");
        r42.m4112w(r5, this.f6967c);
        goto L13
    }
}
