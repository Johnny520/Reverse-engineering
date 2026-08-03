package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.rrweb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1992h implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public int f7126a;

    /* JADX INFO: renamed from: b */
    public float f7127b;

    /* JADX INFO: renamed from: c */
    public float f7128c;

    /* JADX INFO: renamed from: d */
    public long f7129d;

    /* JADX INFO: renamed from: e */
    public HashMap f7130e;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("id");
        r42.m4111v(this.f7126a);
        r42.m4106p("x");
        r42.m4110u(this.f7127b);
        r42.m4106p("y");
        r42.m4110u(this.f7128c);
        r42.m4106p("timeOffset");
        r42.m4111v(this.f7129d);
        HashMap r0 = this.f7130e;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7130e, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
