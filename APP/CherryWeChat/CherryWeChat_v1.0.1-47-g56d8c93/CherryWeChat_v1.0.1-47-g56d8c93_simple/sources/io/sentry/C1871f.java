package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
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

    public C1871f(Date r3) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6709b = r3;
        this.f6708a = null;
    }

    /* JADX INFO: renamed from: a */
    public final Date m4092a() {
        Date r0 = this.f6709b;
        if (r0 != null) goto L5;
        Long r02 = this.f6708a;
        if (r02 == null) goto L11;
        Date r03 = AbstractC1856a.m4068n(r02.longValue());
        this.f6709b = r03;
        return r03;
    L11:
        throw new IllegalStateException("No timestamp set for breadcrumb");
    L5:
        return (Date) r0.clone();
    }

    /* JADX INFO: renamed from: b */
    public final void m4093b(String r2, Object r3) {
        if (r3 != null) goto L5;
        this.f6713f.remove(r2);
        return;
    L5:
        this.f6713f.put(r2, r3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f6710c.compareTo(((C1871f) r2).f6710c);
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L23:
        return false;
    L8:
        if (C1871f.class != r7.getClass()) goto L23;
        C1871f r72 = (C1871f) r7;
        if (m4092a().getTime() != r72.m4092a().getTime()) goto L23;
        if (AbstractC1856a.m4063i(this.f6711d, r72.f6711d) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6712e, r72.f6712e) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6714g, r72.f6714g) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6715h, r72.f6715h) == false) goto L23;
        if (this.f6716i != r72.f6716i) goto L23;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6709b, this.f6711d, this.f6712e, this.f6714g, this.f6715h, this.f6716i});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("timestamp");
        r42.m4112w(r5, m4092a());
        if (this.f6711d == null) goto L6;
        r42.m4106p("message");
        r42.m4115z(this.f6711d);
    L6:
        if (this.f6712e == null) goto L8;
        r42.m4106p("type");
        r42.m4115z(this.f6712e);
    L8:
        r42.m4106p("data");
        r42.m4112w(r5, this.f6713f);
        if (this.f6714g == null) goto L12;
        r42.m4106p("category");
        r42.m4115z(this.f6714g);
    L12:
        if (this.f6715h == null) goto L15;
        r42.m4106p("origin");
        r42.m4115z(this.f6715h);
    L15:
        if (this.f6716i == null) goto L17;
        r42.m4106p("level");
        r42.m4112w(r5, this.f6716i);
    L17:
        ConcurrentHashMap r0 = this.f6717j;
        if (r0 == null) goto L23;
        Iterator r02 = r0.keySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L23;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6717j, r1, r42, r1, r5);
    L23:
        r42.m4102k();
    }

    public C1871f(long r3) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6708a = Long.valueOf(r3);
        this.f6709b = null;
    }

    public C1871f(C1871f r3) {
        this.f6713f = new ConcurrentHashMap();
        this.f6710c = Long.valueOf(System.nanoTime());
        this.f6709b = r3.f6709b;
        this.f6708a = r3.f6708a;
        this.f6711d = r3.f6711d;
        this.f6712e = r3.f6712e;
        this.f6714g = r3.f6714g;
        this.f6715h = r3.f6715h;
        ConcurrentHashMap r0 = AbstractC1856a.m4045A(r3.f6713f);
        if (r0 == null) goto L5;
        this.f6713f = r0;
    L5:
        this.f6717j = AbstractC1856a.m4045A(r3.f6717j);
        this.f6716i = r3.f6716i;
    }

    public C1871f() {
        this(System.currentTimeMillis());
    }
}
