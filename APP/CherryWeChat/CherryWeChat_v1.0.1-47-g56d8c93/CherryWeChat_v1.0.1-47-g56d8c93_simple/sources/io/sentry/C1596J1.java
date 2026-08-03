package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1596J1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final C1970t f5755a;

    /* JADX INFO: renamed from: b */
    public final C1968r f5756b;

    /* JADX INFO: renamed from: c */
    public final C1613N2 f5757c;

    /* JADX INFO: renamed from: d */
    public Date f5758d;

    /* JADX INFO: renamed from: e */
    public HashMap f5759e;

    public C1596J1(C1970t r1, C1968r r2, C1613N2 r3) {
        this.f5755a = r1;
        this.f5756b = r2;
        this.f5757c = r3;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        C1970t r0 = this.f5755a;
        if (r0 == null) goto L5;
        r42.m4106p("event_id");
        r42.m4112w(r5, r0);
    L5:
        C1968r r02 = this.f5756b;
        if (r02 == null) goto L8;
        r42.m4106p("sdk");
        r42.m4112w(r5, r02);
    L8:
        C1613N2 r03 = this.f5757c;
        if (r03 == null) goto L12;
        r42.m4106p("trace");
        r42.m4112w(r5, r03);
    L12:
        if (this.f5758d == null) goto L14;
        r42.m4106p("sent_at");
        r42.m4112w(r5, AbstractC1856a.m4073t(this.f5758d));
    L14:
        HashMap r04 = this.f5759e;
        if (r04 == null) goto L20;
        Iterator r05 = r04.keySet().iterator();
    L18:
        if (r05.hasNext() == false) goto L20;
        String r1 = (String) r05.next();
        AbstractC1861d.m4086a(this.f5759e, r1, r42, r1, r5);
    L20:
        r42.m4102k();
    }
}
