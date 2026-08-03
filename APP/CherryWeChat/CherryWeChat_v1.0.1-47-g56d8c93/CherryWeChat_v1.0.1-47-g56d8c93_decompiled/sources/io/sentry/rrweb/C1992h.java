package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

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
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("id");
        c1901c.m4111v(this.f7126a);
        c1901c.m4106p("x");
        c1901c.m4110u(this.f7127b);
        c1901c.m4106p("y");
        c1901c.m4110u(this.f7128c);
        c1901c.m4106p("timeOffset");
        c1901c.m4111v(this.f7129d);
        HashMap map = this.f7130e;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7130e, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
