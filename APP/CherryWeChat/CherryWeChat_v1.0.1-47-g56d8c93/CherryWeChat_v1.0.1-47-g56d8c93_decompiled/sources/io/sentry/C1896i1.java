package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1896i1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6765a;

    /* JADX INFO: renamed from: b */
    public String f6766b;

    /* JADX INFO: renamed from: c */
    public String f6767c;

    /* JADX INFO: renamed from: d */
    public Long f6768d;

    /* JADX INFO: renamed from: e */
    public Long f6769e;

    /* JADX INFO: renamed from: f */
    public Long f6770f;

    /* JADX INFO: renamed from: g */
    public Long f6771g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap f6772h;

    public C1896i1(InterfaceC1895i0 interfaceC1895i0, Long l, Long l2) {
        this.f6765a = interfaceC1895i0.mo3621g().toString();
        this.f6766b = interfaceC1895i0.mo3627m().f5738a.toString();
        this.f6767c = interfaceC1895i0.getName().isEmpty() ? "unknown" : interfaceC1895i0.getName();
        this.f6768d = l;
        this.f6770f = l2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4097a(Long l, Long l2, Long l3, Long l4) {
        if (this.f6769e == null) {
            this.f6769e = Long.valueOf(l.longValue() - l2.longValue());
            this.f6768d = Long.valueOf(this.f6768d.longValue() - l2.longValue());
            this.f6771g = Long.valueOf(l3.longValue() - l4.longValue());
            this.f6770f = Long.valueOf(this.f6770f.longValue() - l4.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1896i1.class != obj.getClass()) {
            return false;
        }
        C1896i1 c1896i1 = (C1896i1) obj;
        return this.f6765a.equals(c1896i1.f6765a) && this.f6766b.equals(c1896i1.f6766b) && this.f6767c.equals(c1896i1.f6767c) && this.f6768d.equals(c1896i1.f6768d) && this.f6770f.equals(c1896i1.f6770f) && AbstractC1856a.m4063i(this.f6771g, c1896i1.f6771g) && AbstractC1856a.m4063i(this.f6769e, c1896i1.f6769e) && AbstractC1856a.m4063i(this.f6772h, c1896i1.f6772h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6765a, this.f6766b, this.f6767c, this.f6768d, this.f6769e, this.f6770f, this.f6771g, this.f6772h});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("id");
        c1901c.m4112w(iLogger, this.f6765a);
        c1901c.m4106p("trace_id");
        c1901c.m4112w(iLogger, this.f6766b);
        c1901c.m4106p("name");
        c1901c.m4112w(iLogger, this.f6767c);
        c1901c.m4106p("relative_start_ns");
        c1901c.m4112w(iLogger, this.f6768d);
        c1901c.m4106p("relative_end_ns");
        c1901c.m4112w(iLogger, this.f6769e);
        c1901c.m4106p("relative_cpu_start_ms");
        c1901c.m4112w(iLogger, this.f6770f);
        c1901c.m4106p("relative_cpu_end_ms");
        c1901c.m4112w(iLogger, this.f6771g);
        ConcurrentHashMap concurrentHashMap = this.f6772h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6772h, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
