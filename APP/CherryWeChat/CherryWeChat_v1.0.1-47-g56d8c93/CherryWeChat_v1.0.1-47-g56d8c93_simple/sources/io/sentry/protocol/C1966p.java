package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1966p implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6988a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6989b;

    /* JADX INFO: renamed from: c */
    public Integer f6990c;

    /* JADX INFO: renamed from: d */
    public Long f6991d;

    /* JADX INFO: renamed from: e */
    public Object f6992e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6993f;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6988a == null) goto L6;
        r42.m4106p("cookies");
        r42.m4115z(this.f6988a);
    L6:
        if (this.f6989b == null) goto L9;
        r42.m4106p("headers");
        r42.m4112w(r5, this.f6989b);
    L9:
        if (this.f6990c == null) goto L12;
        r42.m4106p("status_code");
        r42.m4112w(r5, this.f6990c);
    L12:
        if (this.f6991d == null) goto L15;
        r42.m4106p("body_size");
        r42.m4112w(r5, this.f6991d);
    L15:
        if (this.f6992e == null) goto L17;
        r42.m4106p("data");
        r42.m4112w(r5, this.f6992e);
    L17:
        ConcurrentHashMap r0 = this.f6993f;
        if (r0 == null) goto L23;
        Iterator r02 = r0.keySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L23;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6993f, r1, r42, r1, r5);
    L23:
        r42.m4102k();
    }
}
