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
import java.util.Iterator;
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

    public C1627R1(C1869a r1) {
        this();
        this.f5613j = r1;
    }

    /* JADX INFO: renamed from: c */
    public final C1969s m3738c() {
        C2065z0 r0 = this.f5849t;
        if (r0 == null) goto L14;
        Iterator r02 = r0.f7297a.iterator();
    L6:
        if (r02.hasNext() == false) goto L24;
        C1969s r1 = (C1969s) r02.next();
        C1961k r2 = r1.f7009f;
        if (r2 == null) goto L6;
        Boolean r22 = r2.f6957d;
        if (r22 == null) goto L6;
        if (r22.booleanValue() == true) goto L6;
        return r1;
    L24:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3739d() {
        C2065z0 r0 = this.f5849t;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.f7297a.isEmpty() == true) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("timestamp");
        r42.m4112w(r5, this.f5845p);
        if (this.f5846q == null) goto L6;
        r42.m4106p("message");
        r42.m4112w(r5, this.f5846q);
    L6:
        if (this.f5847r == null) goto L8;
        r42.m4106p("logger");
        r42.m4115z(this.f5847r);
    L8:
        C2065z0 r0 = this.f5848s;
        if (r0 != null) goto L11;
    L13:
        C2065z0 r02 = this.f5849t;
        if (r02 == null) goto L19;
        if (r02.f7297a.isEmpty() == true) goto L19;
        r42.m4106p("exception");
        r42.m4101h();
        r42.m4106p("values");
        r42.m4112w(r5, this.f5849t.f7297a);
        r42.m4102k();
    L19:
        if (this.f5850u == null) goto L22;
        r42.m4106p("level");
        r42.m4112w(r5, this.f5850u);
    L22:
        if (this.f5851v == null) goto L25;
        r42.m4106p("transaction");
        r42.m4115z(this.f5851v);
    L25:
        if (this.f5852w == null) goto L28;
        r42.m4106p("fingerprint");
        r42.m4112w(r5, this.f5852w);
    L28:
        if (this.f5854y == null) goto L30;
        r42.m4106p("modules");
        r42.m4112w(r5, this.f5854y);
    L30:
        AbstractC1856a.m4049E(this, r42, r5);
        ConcurrentHashMap r03 = this.f5853x;
        if (r03 == null) goto L36;
        Iterator r04 = r03.keySet().iterator();
    L34:
        if (r04.hasNext() == false) goto L36;
        String r1 = (String) r04.next();
        AbstractC1861d.m4087b(this.f5853x, r1, r42, r1, r5);
    L36:
        r42.m4102k();
        return;
    L11:
        if (r0.f7297a.isEmpty() == true) goto L13;
        r42.m4106p("threads");
        r42.m4101h();
        r42.m4106p("values");
        r42.m4112w(r5, this.f5848s.f7297a);
        r42.m4102k();
        goto L13
    }

    public C1627R1() {
        C1970t r0 = new C1970t();
        Date r1 = AbstractC1856a.m4067m();
        super(r0);
        this.f5845p = r1;
    }
}
