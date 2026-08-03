package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1959i implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6940a;

    /* JADX INFO: renamed from: b */
    public Integer f6941b;

    /* JADX INFO: renamed from: c */
    public String f6942c;

    /* JADX INFO: renamed from: d */
    public String f6943d;

    /* JADX INFO: renamed from: e */
    public Integer f6944e;

    /* JADX INFO: renamed from: f */
    public String f6945f;

    /* JADX INFO: renamed from: g */
    public Boolean f6946g;

    /* JADX INFO: renamed from: h */
    public String f6947h;

    /* JADX INFO: renamed from: i */
    public String f6948i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap f6949j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1959i.class == obj.getClass()) {
            C1959i c1959i = (C1959i) obj;
            if (AbstractC1856a.m4063i(this.f6940a, c1959i.f6940a) && AbstractC1856a.m4063i(this.f6941b, c1959i.f6941b) && AbstractC1856a.m4063i(this.f6942c, c1959i.f6942c) && AbstractC1856a.m4063i(this.f6943d, c1959i.f6943d) && AbstractC1856a.m4063i(this.f6944e, c1959i.f6944e) && AbstractC1856a.m4063i(this.f6945f, c1959i.f6945f) && AbstractC1856a.m4063i(this.f6946g, c1959i.f6946g) && AbstractC1856a.m4063i(this.f6947h, c1959i.f6947h) && AbstractC1856a.m4063i(this.f6948i, c1959i.f6948i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6940a, this.f6941b, this.f6942c, this.f6943d, this.f6944e, this.f6945f, this.f6946g, this.f6947h, this.f6948i});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6940a != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6940a);
        }
        if (this.f6941b != null) {
            c1901c.m4106p("id");
            c1901c.m4114y(this.f6941b);
        }
        if (this.f6942c != null) {
            c1901c.m4106p("vendor_id");
            c1901c.m4115z(this.f6942c);
        }
        if (this.f6943d != null) {
            c1901c.m4106p("vendor_name");
            c1901c.m4115z(this.f6943d);
        }
        if (this.f6944e != null) {
            c1901c.m4106p("memory_size");
            c1901c.m4114y(this.f6944e);
        }
        if (this.f6945f != null) {
            c1901c.m4106p("api_type");
            c1901c.m4115z(this.f6945f);
        }
        if (this.f6946g != null) {
            c1901c.m4106p("multi_threaded_rendering");
            c1901c.m4113x(this.f6946g);
        }
        if (this.f6947h != null) {
            c1901c.m4106p("version");
            c1901c.m4115z(this.f6947h);
        }
        if (this.f6948i != null) {
            c1901c.m4106p("npot_support");
            c1901c.m4115z(this.f6948i);
        }
        ConcurrentHashMap concurrentHashMap = this.f6949j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6949j, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
