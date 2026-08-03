package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1995k extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7139c;

    /* JADX INFO: renamed from: d */
    public HashMap f7140d;

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
        c1901c.m4106p("tag");
        c1901c.m4115z(this.f7139c);
        c1901c.m4106p("payload");
        c1901c.m4101h();
        HashMap map = this.f7140d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                c1901c.m4106p(str);
                c1901c.m4112w(iLogger, obj);
            }
        }
        c1901c.m4102k();
        c1901c.m4102k();
        c1901c.m4102k();
    }
}
