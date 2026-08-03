package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1997m extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7150c;

    /* JADX INFO: renamed from: d */
    public int f7151d;

    /* JADX INFO: renamed from: e */
    public long f7152e;

    /* JADX INFO: renamed from: f */
    public long f7153f;

    /* JADX INFO: renamed from: g */
    public String f7154g;

    /* JADX INFO: renamed from: h */
    public String f7155h;

    /* JADX INFO: renamed from: i */
    public int f7156i;

    /* JADX INFO: renamed from: j */
    public int f7157j;

    /* JADX INFO: renamed from: k */
    public int f7158k;

    /* JADX INFO: renamed from: l */
    public String f7159l;

    /* JADX INFO: renamed from: m */
    public int f7160m;

    /* JADX INFO: renamed from: n */
    public int f7161n;

    /* JADX INFO: renamed from: o */
    public int f7162o;

    /* JADX INFO: renamed from: p */
    public HashMap f7163p;

    /* JADX INFO: renamed from: q */
    public ConcurrentHashMap f7164q;

    /* JADX INFO: renamed from: r */
    public ConcurrentHashMap f7165r;

    public C1997m() {
        super(EnumC1987c.Custom);
        this.f7154g = "h264";
        this.f7155h = "mp4";
        this.f7159l = "constant";
        this.f7150c = "video";
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L40:
        return false;
    L8:
        if (C1997m.class != r7.getClass()) goto L40;
        if (super.equals(r7) == true) goto L13;
        return false;
    L13:
        C1997m r72 = (C1997m) r7;
        if (this.f7151d != r72.f7151d) goto L40;
        if (this.f7152e != r72.f7152e) goto L40;
        if (this.f7153f != r72.f7153f) goto L40;
        if (this.f7156i != r72.f7156i) goto L40;
        if (this.f7157j != r72.f7157j) goto L40;
        if (this.f7158k != r72.f7158k) goto L40;
        if (this.f7160m != r72.f7160m) goto L40;
        if (this.f7161n != r72.f7161n) goto L40;
        if (this.f7162o != r72.f7162o) goto L40;
        if (AbstractC1856a.m4063i(this.f7150c, r72.f7150c) == false) goto L40;
        if (AbstractC1856a.m4063i(this.f7154g, r72.f7154g) == false) goto L40;
        if (AbstractC1856a.m4063i(this.f7155h, r72.f7155h) == false) goto L40;
        if (AbstractC1856a.m4063i(this.f7159l, r72.f7159l) == false) goto L40;
        return true;
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f7150c, Integer.valueOf(this.f7151d), Long.valueOf(this.f7152e), Long.valueOf(this.f7153f), this.f7154g, this.f7155h, Integer.valueOf(this.f7156i), Integer.valueOf(this.f7157j), Integer.valueOf(this.f7158k), this.f7159l, Integer.valueOf(this.f7160m), Integer.valueOf(this.f7161n), Integer.valueOf(this.f7162o)});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4112w(r5, this.f7115a);
        r42.m4106p("timestamp");
        r42.m4111v(this.f7116b);
        r42.m4106p("data");
        r42.m4101h();
        r42.m4106p("tag");
        r42.m4115z(this.f7150c);
        r42.m4106p("payload");
        r42.m4101h();
        r42.m4106p("segmentId");
        r42.m4111v(this.f7151d);
        r42.m4106p("size");
        r42.m4111v(this.f7152e);
        r42.m4106p("duration");
        r42.m4111v(this.f7153f);
        r42.m4106p("encoding");
        r42.m4115z(this.f7154g);
        r42.m4106p("container");
        r42.m4115z(this.f7155h);
        r42.m4106p("height");
        r42.m4111v(this.f7156i);
        r42.m4106p("width");
        r42.m4111v(this.f7157j);
        r42.m4106p("frameCount");
        r42.m4111v(this.f7158k);
        r42.m4106p("frameRate");
        r42.m4111v(this.f7160m);
        r42.m4106p("frameRateType");
        r42.m4115z(this.f7159l);
        r42.m4106p("left");
        r42.m4111v(this.f7161n);
        r42.m4106p("top");
        r42.m4111v(this.f7162o);
        ConcurrentHashMap r0 = this.f7164q;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7164q, r1, r42, r1, r5);
    L8:
        r42.m4102k();
        ConcurrentHashMap r03 = this.f7165r;
        if (r03 == null) goto L14;
        Iterator r04 = r03.keySet().iterator();
    L12:
        if (r04.hasNext() == false) goto L14;
        String r12 = (String) r04.next();
        AbstractC1861d.m4087b(this.f7165r, r12, r42, r12, r5);
    L14:
        r42.m4102k();
        HashMap r05 = this.f7163p;
        if (r05 == null) goto L20;
        Iterator r06 = r05.keySet().iterator();
    L18:
        if (r06.hasNext() == false) goto L20;
        String r13 = (String) r06.next();
        AbstractC1861d.m4086a(this.f7163p, r13, r42, r13, r5);
    L20:
        r42.m4102k();
    }
}
