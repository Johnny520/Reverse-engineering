package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
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

    public C1896i1(InterfaceC1895i0 r2, Long r3, Long r4) {
        this.f6765a = r2.mo3621g().toString();
        this.f6766b = r2.mo3627m().f5738a.toString();
        if (r2.getName().isEmpty() == false) goto L5;
        String r22 = "unknown";
    L6:
        this.f6767c = r22;
        this.f6768d = r3;
        this.f6770f = r4;
        return;
    L5:
        r22 = r2.getName();
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m4097a(Long r5, Long r6, Long r7, Long r8) {
        if (this.f6769e != null) goto L6;
        this.f6769e = Long.valueOf(r5.longValue() - r6.longValue());
        this.f6768d = Long.valueOf(this.f6768d.longValue() - r6.longValue());
        this.f6771g = Long.valueOf(r7.longValue() - r8.longValue());
        this.f6770f = Long.valueOf(this.f6770f.longValue() - r8.longValue());
        return;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L28;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1896i1.class != r3.getClass()) goto L37;
        C1896i1 r32 = (C1896i1) r3;
        if (this.f6765a.equals(r32.f6765a) == true) goto L11;
        return false;
    L11:
        if (this.f6766b.equals(r32.f6766b) == true) goto L13;
        return false;
    L13:
        if (this.f6767c.equals(r32.f6767c) == true) goto L15;
        return false;
    L15:
        if (this.f6768d.equals(r32.f6768d) == true) goto L17;
        return false;
    L17:
        if (this.f6770f.equals(r32.f6770f) == true) goto L19;
        return false;
    L19:
        if (AbstractC1856a.m4063i(this.f6771g, r32.f6771g) == true) goto L21;
        return false;
    L21:
        if (AbstractC1856a.m4063i(this.f6769e, r32.f6769e) == true) goto L23;
        return false;
    L23:
        if (AbstractC1856a.m4063i(this.f6772h, r32.f6772h) == false) goto L36;
        return true;
    L36:
        return false;
    L37:
        return false;
    L28:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6765a, this.f6766b, this.f6767c, this.f6768d, this.f6769e, this.f6770f, this.f6771g, this.f6772h});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("id");
        r42.m4112w(r5, this.f6765a);
        r42.m4106p("trace_id");
        r42.m4112w(r5, this.f6766b);
        r42.m4106p("name");
        r42.m4112w(r5, this.f6767c);
        r42.m4106p("relative_start_ns");
        r42.m4112w(r5, this.f6768d);
        r42.m4106p("relative_end_ns");
        r42.m4112w(r5, this.f6769e);
        r42.m4106p("relative_cpu_start_ms");
        r42.m4112w(r5, this.f6770f);
        r42.m4106p("relative_cpu_end_ms");
        r42.m4112w(r5, this.f6771g);
        ConcurrentHashMap r0 = this.f6772h;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6772h, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
