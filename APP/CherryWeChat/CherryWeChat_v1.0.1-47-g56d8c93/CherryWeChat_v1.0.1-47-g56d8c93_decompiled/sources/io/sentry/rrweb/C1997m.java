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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1997m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1997m c1997m = (C1997m) obj;
        return this.f7151d == c1997m.f7151d && this.f7152e == c1997m.f7152e && this.f7153f == c1997m.f7153f && this.f7156i == c1997m.f7156i && this.f7157j == c1997m.f7157j && this.f7158k == c1997m.f7158k && this.f7160m == c1997m.f7160m && this.f7161n == c1997m.f7161n && this.f7162o == c1997m.f7162o && AbstractC1856a.m4063i(this.f7150c, c1997m.f7150c) && AbstractC1856a.m4063i(this.f7154g, c1997m.f7154g) && AbstractC1856a.m4063i(this.f7155h, c1997m.f7155h) && AbstractC1856a.m4063i(this.f7159l, c1997m.f7159l);
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f7150c, Integer.valueOf(this.f7151d), Long.valueOf(this.f7152e), Long.valueOf(this.f7153f), this.f7154g, this.f7155h, Integer.valueOf(this.f7156i), Integer.valueOf(this.f7157j), Integer.valueOf(this.f7158k), this.f7159l, Integer.valueOf(this.f7160m), Integer.valueOf(this.f7161n), Integer.valueOf(this.f7162o)});
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
        c1901c.m4106p("tag");
        c1901c.m4115z(this.f7150c);
        c1901c.m4106p("payload");
        c1901c.m4101h();
        c1901c.m4106p("segmentId");
        c1901c.m4111v(this.f7151d);
        c1901c.m4106p("size");
        c1901c.m4111v(this.f7152e);
        c1901c.m4106p("duration");
        c1901c.m4111v(this.f7153f);
        c1901c.m4106p("encoding");
        c1901c.m4115z(this.f7154g);
        c1901c.m4106p("container");
        c1901c.m4115z(this.f7155h);
        c1901c.m4106p("height");
        c1901c.m4111v(this.f7156i);
        c1901c.m4106p("width");
        c1901c.m4111v(this.f7157j);
        c1901c.m4106p("frameCount");
        c1901c.m4111v(this.f7158k);
        c1901c.m4106p("frameRate");
        c1901c.m4111v(this.f7160m);
        c1901c.m4106p("frameRateType");
        c1901c.m4115z(this.f7159l);
        c1901c.m4106p("left");
        c1901c.m4111v(this.f7161n);
        c1901c.m4106p("top");
        c1901c.m4111v(this.f7162o);
        ConcurrentHashMap concurrentHashMap = this.f7164q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7164q, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        ConcurrentHashMap concurrentHashMap2 = this.f7165r;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC1861d.m4087b(this.f7165r, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
        HashMap map = this.f7163p;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC1861d.m4086a(this.f7163p, str3, c1901c, str3, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
