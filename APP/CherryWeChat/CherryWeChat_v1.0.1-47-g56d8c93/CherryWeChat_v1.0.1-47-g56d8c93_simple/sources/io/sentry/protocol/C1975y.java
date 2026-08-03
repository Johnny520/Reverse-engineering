package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1975y implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public List f7055a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f7056b;

    /* JADX INFO: renamed from: c */
    public Boolean f7057c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f7058d;

    public C1975y(List r1) {
        this.f7055a = r1;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f7055a == null) goto L6;
        r42.m4106p("frames");
        r42.m4112w(r5, this.f7055a);
    L6:
        if (this.f7056b == null) goto L9;
        r42.m4106p("registers");
        r42.m4112w(r5, this.f7056b);
    L9:
        if (this.f7057c == null) goto L11;
        r42.m4106p("snapshot");
        r42.m4113x(this.f7057c);
    L11:
        ConcurrentHashMap r0 = this.f7058d;
        if (r0 == null) goto L17;
        Iterator r02 = r0.keySet().iterator();
    L15:
        if (r02.hasNext() == false) goto L17;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7058d, r1, r42, r1, r5);
    L17:
        r42.m4102k();
    }
}
