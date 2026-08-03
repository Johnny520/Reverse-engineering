package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1871f implements InterfaceC1567C0, Comparable {

    /* JADX INFO: renamed from: a */
    public final Long f6708a;

    /* JADX INFO: renamed from: b */
    public Date f6709b;

    /* JADX INFO: renamed from: c */
    public final Long f6710c;

    /* JADX INFO: renamed from: d */
    public String f6711d;

    /* JADX INFO: renamed from: e */
    public String f6712e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6713f;

    /* JADX INFO: renamed from: g */
    public String f6714g;

    /* JADX INFO: renamed from: h */
    public String f6715h;

    /* JADX INFO: renamed from: i */
    public EnumC1657a2 f6716i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap f6717j;

    public C1871f(Date date) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6709b = date;
        this.f6708a = null;
    }

    /* JADX INFO: renamed from: a */
    public final Date m4092a() {
        Date date = this.f6709b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.f6708a;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateM4068n = AbstractC1856a.m4068n(l.longValue());
        this.f6709b = dateM4068n;
        return dateM4068n;
    }

    /* JADX INFO: renamed from: b */
    public final void m4093b(String str, Object obj) {
        if (obj == null) {
            this.f6713f.remove(str);
        } else {
            this.f6713f.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6710c.compareTo(((C1871f) obj).f6710c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1871f.class == obj.getClass()) {
            C1871f c1871f = (C1871f) obj;
            if (m4092a().getTime() == c1871f.m4092a().getTime() && AbstractC1856a.m4063i(this.f6711d, c1871f.f6711d) && AbstractC1856a.m4063i(this.f6712e, c1871f.f6712e) && AbstractC1856a.m4063i(this.f6714g, c1871f.f6714g) && AbstractC1856a.m4063i(this.f6715h, c1871f.f6715h) && this.f6716i == c1871f.f6716i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6709b, this.f6711d, this.f6712e, this.f6714g, this.f6715h, this.f6716i});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, m4092a());
        if (this.f6711d != null) {
            c1901c.m4106p("message");
            c1901c.m4115z(this.f6711d);
        }
        if (this.f6712e != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.f6712e);
        }
        c1901c.m4106p("data");
        c1901c.m4112w(iLogger, this.f6713f);
        if (this.f6714g != null) {
            c1901c.m4106p("category");
            c1901c.m4115z(this.f6714g);
        }
        if (this.f6715h != null) {
            c1901c.m4106p("origin");
            c1901c.m4115z(this.f6715h);
        }
        if (this.f6716i != null) {
            c1901c.m4106p("level");
            c1901c.m4112w(iLogger, this.f6716i);
        }
        ConcurrentHashMap concurrentHashMap = this.f6717j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6717j, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1871f(long j) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6708a = Long.valueOf(j);
        this.f6709b = null;
    }

    public C1871f(C1871f c1871f) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6709b = c1871f.f6709b;
        this.f6708a = c1871f.f6708a;
        this.f6711d = c1871f.f6711d;
        this.f6712e = c1871f.f6712e;
        this.f6714g = c1871f.f6714g;
        this.f6715h = c1871f.f6715h;
        ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A(c1871f.f6713f);
        if (concurrentHashMapM4045A != null) {
            this.f6713f = concurrentHashMapM4045A;
        }
        this.f6717j = AbstractC1856a.m4045A(c1871f.f6717j);
        this.f6716i = c1871f.f6716i;
    }

    public C1871f() {
        this(System.currentTimeMillis());
    }
}
