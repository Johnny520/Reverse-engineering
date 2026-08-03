package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1991g extends AbstractC1989e implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: d */
    public EnumC1990f f7118d;

    /* JADX INFO: renamed from: e */
    public int f7119e;

    /* JADX INFO: renamed from: f */
    public float f7120f;

    /* JADX INFO: renamed from: g */
    public float f7121g;

    /* JADX INFO: renamed from: h */
    public int f7122h;

    /* JADX INFO: renamed from: i */
    public int f7123i;

    /* JADX INFO: renamed from: j */
    public HashMap f7124j;

    /* JADX INFO: renamed from: k */
    public HashMap f7125k;

    public C1991g() {
        super(EnumC1988d.MouseInteraction);
        this.f7122h = 2;
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
        c1901c.m4106p("type");
        c1901c.m4112w(iLogger, this.f7118d);
        c1901c.m4106p("id");
        c1901c.m4111v(this.f7119e);
        c1901c.m4106p("x");
        c1901c.m4110u(this.f7120f);
        c1901c.m4106p("y");
        c1901c.m4110u(this.f7121g);
        c1901c.m4106p("pointerType");
        c1901c.m4111v(this.f7122h);
        c1901c.m4106p("pointerId");
        c1901c.m4111v(this.f7123i);
        HashMap map = this.f7125k;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7125k, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        HashMap map2 = this.f7124j;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC1861d.m4086a(this.f7124j, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
