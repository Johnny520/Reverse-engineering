package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import java.util.Date;
import java.util.HashMap;

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

    public C1596J1(C1970t c1970t, C1968r c1968r, C1613N2 c1613n2) {
        this.f5755a = c1970t;
        this.f5756b = c1968r;
        this.f5757c = c1613n2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        C1970t c1970t = this.f5755a;
        if (c1970t != null) {
            c1901c.m4106p("event_id");
            c1901c.m4112w(iLogger, c1970t);
        }
        C1968r c1968r = this.f5756b;
        if (c1968r != null) {
            c1901c.m4106p("sdk");
            c1901c.m4112w(iLogger, c1968r);
        }
        C1613N2 c1613n2 = this.f5757c;
        if (c1613n2 != null) {
            c1901c.m4106p("trace");
            c1901c.m4112w(iLogger, c1613n2);
        }
        if (this.f5758d != null) {
            c1901c.m4106p("sent_at");
            c1901c.m4112w(iLogger, AbstractC1856a.m4073t(this.f5758d));
        }
        HashMap map = this.f5759e;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f5759e, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
