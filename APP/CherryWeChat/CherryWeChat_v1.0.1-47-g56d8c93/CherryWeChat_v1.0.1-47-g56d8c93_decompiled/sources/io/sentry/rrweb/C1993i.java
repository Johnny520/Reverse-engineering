package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.rrweb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1993i extends AbstractC1989e implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: d */
    public int f7131d;

    /* JADX INFO: renamed from: e */
    public List f7132e;

    /* JADX INFO: renamed from: f */
    public HashMap f7133f;

    /* JADX INFO: renamed from: g */
    public HashMap f7134g;

    public C1993i() {
        super(EnumC1988d.TouchMove);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("type");
        c1901c.m4112w(iLogger, this.f7115a);
        c1901c.m4106p("timestamp");
        c1901c.m4111v(this.f7116b);
        c1901c.m4106p("data");
        c1901c.m4101h();
        c1901c.m4106p("source");
        c1901c.m4112w(iLogger, this.f7117c);
        List list = this.f7132e;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("positions");
            c1901c.m4112w(iLogger, this.f7132e);
        }
        c1901c.m4106p("pointerId");
        c1901c.m4111v(this.f7131d);
        HashMap map = this.f7134g;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7134g, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        HashMap map2 = this.f7133f;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC1861d.m4086a(this.f7133f, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
