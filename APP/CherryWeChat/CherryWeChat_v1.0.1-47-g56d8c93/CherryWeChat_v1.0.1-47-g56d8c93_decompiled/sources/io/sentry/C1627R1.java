package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1970t;
import java.util.AbstractMap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627R1 extends AbstractC1568C1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: p */
    public Date f5845p;

    /* JADX INFO: renamed from: q */
    public C1962l f5846q;

    /* JADX INFO: renamed from: r */
    public String f5847r;

    /* JADX INFO: renamed from: s */
    public C2065z0 f5848s;

    /* JADX INFO: renamed from: t */
    public C2065z0 f5849t;

    /* JADX INFO: renamed from: u */
    public EnumC1657a2 f5850u;

    /* JADX INFO: renamed from: v */
    public String f5851v;

    /* JADX INFO: renamed from: w */
    public List f5852w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f5853x;

    /* JADX INFO: renamed from: y */
    public AbstractMap f5854y;

    public C1627R1(C1869a c1869a) {
        this();
        this.f5613j = c1869a;
    }

    /* JADX INFO: renamed from: c */
    public final C1969s m3738c() {
        Boolean bool;
        C2065z0 c2065z0 = this.f5849t;
        if (c2065z0 == null) {
            return null;
        }
        for (C1969s c1969s : c2065z0.f7297a) {
            C1961k c1961k = c1969s.f7009f;
            if (c1961k != null && (bool = c1961k.f6957d) != null && !bool.booleanValue()) {
                return c1969s;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3739d() {
        C2065z0 c2065z0 = this.f5849t;
        return (c2065z0 == null || c2065z0.f7297a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, this.f5845p);
        if (this.f5846q != null) {
            c1901c.m4106p("message");
            c1901c.m4112w(iLogger, this.f5846q);
        }
        if (this.f5847r != null) {
            c1901c.m4106p("logger");
            c1901c.m4115z(this.f5847r);
        }
        C2065z0 c2065z0 = this.f5848s;
        if (c2065z0 != null && !c2065z0.f7297a.isEmpty()) {
            c1901c.m4106p("threads");
            c1901c.m4101h();
            c1901c.m4106p("values");
            c1901c.m4112w(iLogger, this.f5848s.f7297a);
            c1901c.m4102k();
        }
        C2065z0 c2065z02 = this.f5849t;
        if (c2065z02 != null && !c2065z02.f7297a.isEmpty()) {
            c1901c.m4106p("exception");
            c1901c.m4101h();
            c1901c.m4106p("values");
            c1901c.m4112w(iLogger, this.f5849t.f7297a);
            c1901c.m4102k();
        }
        if (this.f5850u != null) {
            c1901c.m4106p("level");
            c1901c.m4112w(iLogger, this.f5850u);
        }
        if (this.f5851v != null) {
            c1901c.m4106p("transaction");
            c1901c.m4115z(this.f5851v);
        }
        if (this.f5852w != null) {
            c1901c.m4106p("fingerprint");
            c1901c.m4112w(iLogger, this.f5852w);
        }
        if (this.f5854y != null) {
            c1901c.m4106p("modules");
            c1901c.m4112w(iLogger, this.f5854y);
        }
        AbstractC1856a.m4049E(this, c1901c, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f5853x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f5853x, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1627R1() {
        C1970t c1970t = new C1970t();
        Date dateM4067m = AbstractC1856a.m4067m();
        super(c1970t);
        this.f5845p = dateM4067m;
    }
}
