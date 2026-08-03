package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.rrweb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1995k extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7139c;

    /* JADX INFO: renamed from: d */
    public HashMap f7140d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r5, ILogger r6) {
        C1901c r52 = (C1901c) r5;
        r52.m4101h();
        r52.m4106p("type");
        r52.m4112w(r6, this.f7115a);
        r52.m4106p("timestamp");
        r52.m4111v(this.f7116b);
        r52.m4106p("data");
        r52.m4101h();
        r52.m4106p("tag");
        r52.m4115z(this.f7139c);
        r52.m4106p("payload");
        r52.m4101h();
        HashMap r0 = this.f7140d;
        if (r0 == null) goto L8;
        Iterator r1 = r0.keySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        String r2 = (String) r1.next();
        Object r3 = r0.get(r2);
        r52.m4106p(r2);
        r52.m4112w(r6, r3);
    L8:
        r52.m4102k();
        r52.m4102k();
        r52.m4102k();
    }
}
