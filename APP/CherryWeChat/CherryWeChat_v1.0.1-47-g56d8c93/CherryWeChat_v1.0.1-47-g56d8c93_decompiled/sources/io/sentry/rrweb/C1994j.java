package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1994j extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7135c;

    /* JADX INFO: renamed from: d */
    public int f7136d;

    /* JADX INFO: renamed from: e */
    public int f7137e;

    /* JADX INFO: renamed from: f */
    public HashMap f7138f;

    public C1994j() {
        super(EnumC1987c.Meta);
        this.f7135c = "";
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1994j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1994j c1994j = (C1994j) obj;
        return this.f7136d == c1994j.f7136d && this.f7137e == c1994j.f7137e && AbstractC1856a.m4063i(this.f7135c, c1994j.f7135c);
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f7135c, Integer.valueOf(this.f7136d), Integer.valueOf(this.f7137e)});
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
        c1901c.m4106p("href");
        c1901c.m4115z(this.f7135c);
        c1901c.m4106p("height");
        c1901c.m4111v(this.f7136d);
        c1901c.m4106p("width");
        c1901c.m4111v(this.f7137e);
        HashMap map = this.f7138f;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7138f, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        c1901c.m4102k();
    }
}
