package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1972v implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f7016a;

    /* JADX INFO: renamed from: b */
    public String f7017b;

    /* JADX INFO: renamed from: c */
    public String f7018c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f7019d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f7016a == null) goto L6;
        r42.m4106p("name");
        r42.m4115z(this.f7016a);
    L6:
        if (this.f7017b == null) goto L9;
        r42.m4106p("version");
        r42.m4115z(this.f7017b);
    L9:
        if (this.f7018c == null) goto L11;
        r42.m4106p("raw_description");
        r42.m4115z(this.f7018c);
    L11:
        ConcurrentHashMap r0 = this.f7019d;
        if (r0 == null) goto L17;
        Iterator r02 = r0.keySet().iterator();
    L15:
        if (r02.hasNext() == false) goto L17;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7019d, r1, r42, r1, r5);
    L17:
        r42.m4102k();
    }
}
