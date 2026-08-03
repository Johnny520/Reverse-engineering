package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
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

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L29:
        return false;
    L8:
        if (C1959i.class != r5.getClass()) goto L29;
        C1959i r52 = (C1959i) r5;
        if (AbstractC1856a.m4063i(this.f6940a, r52.f6940a) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6941b, r52.f6941b) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6942c, r52.f6942c) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6943d, r52.f6943d) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6944e, r52.f6944e) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6945f, r52.f6945f) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6946g, r52.f6946g) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6947h, r52.f6947h) == false) goto L29;
        if (AbstractC1856a.m4063i(this.f6948i, r52.f6948i) == false) goto L29;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6940a, this.f6941b, this.f6942c, this.f6943d, this.f6944e, this.f6945f, this.f6946g, this.f6947h, this.f6948i});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6940a == null) goto L6;
        r42.m4106p("name");
        r42.m4115z(this.f6940a);
    L6:
        if (this.f6941b == null) goto L9;
        r42.m4106p("id");
        r42.m4114y(this.f6941b);
    L9:
        if (this.f6942c == null) goto L12;
        r42.m4106p("vendor_id");
        r42.m4115z(this.f6942c);
    L12:
        if (this.f6943d == null) goto L15;
        r42.m4106p("vendor_name");
        r42.m4115z(this.f6943d);
    L15:
        if (this.f6944e == null) goto L18;
        r42.m4106p("memory_size");
        r42.m4114y(this.f6944e);
    L18:
        if (this.f6945f == null) goto L21;
        r42.m4106p("api_type");
        r42.m4115z(this.f6945f);
    L21:
        if (this.f6946g == null) goto L24;
        r42.m4106p("multi_threaded_rendering");
        r42.m4113x(this.f6946g);
    L24:
        if (this.f6947h == null) goto L27;
        r42.m4106p("version");
        r42.m4115z(this.f6947h);
    L27:
        if (this.f6948i == null) goto L29;
        r42.m4106p("npot_support");
        r42.m4115z(this.f6948i);
    L29:
        ConcurrentHashMap r0 = this.f6949j;
        if (r0 == null) goto L35;
        Iterator r02 = r0.keySet().iterator();
    L33:
        if (r02.hasNext() == false) goto L35;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6949j, r1, r42, r1, r5);
    L35:
        r42.m4102k();
    }
}
