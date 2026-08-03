package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1948E implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6849a;

    /* JADX INFO: renamed from: b */
    public String f6850b;

    /* JADX INFO: renamed from: c */
    public String f6851c;

    /* JADX INFO: renamed from: d */
    public String f6852d;

    /* JADX INFO: renamed from: e */
    public String f6853e;

    /* JADX INFO: renamed from: f */
    public C1958h f6854f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap f6855g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap f6856h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1948E.class == obj.getClass()) {
            C1948E c1948e = (C1948E) obj;
            if (AbstractC1856a.m4063i(this.f6849a, c1948e.f6849a) && AbstractC1856a.m4063i(this.f6850b, c1948e.f6850b) && AbstractC1856a.m4063i(this.f6851c, c1948e.f6851c) && AbstractC1856a.m4063i(this.f6852d, c1948e.f6852d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6849a, this.f6850b, this.f6851c, this.f6852d});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6849a != null) {
            c1901c.m4106p("email");
            c1901c.m4115z(this.f6849a);
        }
        if (this.f6850b != null) {
            c1901c.m4106p("id");
            c1901c.m4115z(this.f6850b);
        }
        if (this.f6851c != null) {
            c1901c.m4106p("username");
            c1901c.m4115z(this.f6851c);
        }
        if (this.f6852d != null) {
            c1901c.m4106p("ip_address");
            c1901c.m4115z(this.f6852d);
        }
        if (this.f6853e != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6853e);
        }
        if (this.f6854f != null) {
            c1901c.m4106p("geo");
            this.f6854f.serialize(c1901c, iLogger);
        }
        if (this.f6855g != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f6855g);
        }
        ConcurrentHashMap concurrentHashMap = this.f6856h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6856h, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
