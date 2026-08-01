package p260x;

import android.os.Trace;
import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import p000A.C0072l0;
import p027E4.C0330q;
import p029F0.InterfaceC0409k0;
import p049I2.AbstractC0797o;
import p068N1.C1013c;
import p110W0.C1577b;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p153e1.C2005a;
import p155e3.AbstractC2030a;
import p155e3.AbstractC2033d;
import p155e3.EnumC2032c;
import p203n.C2654f0;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: x.P */
/* JADX INFO: loaded from: classes.dex */
public final class C3410P implements InterfaceC3398D {

    /* JADX INFO: renamed from: a */
    public final int f10664a;

    /* JADX INFO: renamed from: b */
    public final C0072l0 f10665b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1601c f10666c;

    /* JADX INFO: renamed from: d */
    public C2005a f10667d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0409k0 f10668e;

    /* JADX INFO: renamed from: f */
    public boolean f10669f;

    /* JADX INFO: renamed from: g */
    public boolean f10670g;

    /* JADX INFO: renamed from: h */
    public boolean f10671h;

    /* JADX INFO: renamed from: i */
    public Object f10672i;

    /* JADX INFO: renamed from: j */
    public boolean f10673j;

    /* JADX INFO: renamed from: k */
    public C3409O f10674k;

    /* JADX INFO: renamed from: l */
    public boolean f10675l;

    /* JADX INFO: renamed from: m */
    public long f10676m;

    /* JADX INFO: renamed from: n */
    public long f10677n;

    /* JADX INFO: renamed from: o */
    public long f10678o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1013c f10679p;

    public C3410P(C1013c c1013c, int i5, C0072l0 c0072l0, C2654f0 c2654f0) {
        this.f10679p = c1013c;
        this.f10664a = i5;
        this.f10665b = c0072l0;
        this.f10666c = c2654f0;
        int i6 = AbstractC2033d.f6775b;
        this.f10678o = System.nanoTime() - AbstractC2033d.f6774a;
    }

    @Override // p260x.InterfaceC3398D
    /* JADX INFO: renamed from: a */
    public final void mo5673a() {
        this.f10675l = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m5675b() {
        InterfaceC0409k0 interfaceC0409k0 = this.f10668e;
        if (interfaceC0409k0 != null) {
            interfaceC0409k0.mo612a();
        }
        this.f10668e = null;
        this.f10674k = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5676c(C3418a c3418a) {
        boolean zM5677d;
        if (!this.f10679p.f3128a) {
            return false;
        }
        if (this.f10675l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM5677d = m5677d(c3418a);
            } finally {
                Trace.endSection();
            }
        } else {
            zM5677d = m5677d(c3418a);
        }
        AbstractC1926h.m3556I("compose:lazy:prefetch:execute:item", -1L);
        return zM5677d;
    }

    @Override // p260x.InterfaceC3398D
    public final void cancel() {
        if (this.f10670g) {
            return;
        }
        this.f10670g = true;
        m5675b();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5677d(p260x.C3418a r26) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p260x.C3410P.m5677d(x.a):boolean");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5678e() {
        return this.f10671h;
    }

    /* JADX INFO: renamed from: f */
    public final void m5679f(long j5) {
        if (this.f10670g) {
            AbstractC3204b.m5475a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f10669f) {
            AbstractC3204b.m5475a("Request was already measured!");
        }
        this.f10669f = true;
        InterfaceC0409k0 interfaceC0409k0 = this.f10668e;
        if (interfaceC0409k0 == null) {
            AbstractC3204b.m5476b("performComposition() must be called before performMeasure()");
            throw new C0330q();
        }
        int iMo614c = interfaceC0409k0.mo614c();
        for (int i5 = 0; i5 < iMo614c; i5++) {
            interfaceC0409k0.mo615d(j5, i5);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C3409O m5680g() {
        InterfaceC0409k0 interfaceC0409k0 = this.f10668e;
        if (interfaceC0409k0 == null) {
            AbstractC3204b.m5476b("Should precompose before resolving nested prefetch states");
            throw new C0330q();
        }
        C1675t c1675t = new C1675t();
        interfaceC0409k0.mo613b(new C3407M(1, c1675t));
        List list = (List) c1675t.f5710e;
        if (list != null) {
            return new C3409O(this, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5681h(long j5, long j6) {
        if (this.f10675l) {
            j6 = 0;
        }
        return j5 > j6;
    }

    /* JADX INFO: renamed from: i */
    public final void m5682i() {
        int i5 = AbstractC2033d.f6775b;
        long jNanoTime = System.nanoTime() - AbstractC2033d.f6774a;
        long j5 = this.f10678o;
        EnumC2032c enumC2032c = EnumC2032c.NANOSECONDS;
        AbstractC1665j.m2985e(enumC2032c, "unit");
        long jM1376D = 0;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j5) {
                C1577b c1577b = AbstractC2030a.f6765d;
            } else {
                jM1376D = AbstractC2030a.m3733d(j5 < 0 ? AbstractC2030a.f6767f : AbstractC2030a.f6766e);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jM1376D = jNanoTime < 0 ? AbstractC2030a.f6767f : AbstractC2030a.f6766e;
        } else {
            long j6 = jNanoTime - j5;
            if (((~(j6 ^ j5)) & (j6 ^ jNanoTime)) < 0) {
                EnumC2032c enumC2032c2 = EnumC2032c.MILLISECONDS;
                if (enumC2032c.compareTo(enumC2032c2) < 0) {
                    long jM3226l = AbstractC1784a.m3226l(1L, enumC2032c2, enumC2032c);
                    long j7 = (jNanoTime / jM3226l) - (j5 / jM3226l);
                    long j8 = (jNanoTime % jM3226l) - (j5 % jM3226l);
                    C1577b c1577b2 = AbstractC2030a.f6765d;
                    jM1376D = AbstractC2030a.m3731b(AbstractC0797o.m1376D(j7, enumC2032c2), AbstractC0797o.m1376D(j8, enumC2032c));
                } else {
                    jM1376D = AbstractC2030a.m3733d(j6 < 0 ? AbstractC2030a.f6767f : AbstractC2030a.f6766e);
                }
            } else {
                jM1376D = AbstractC0797o.m1376D(j6, enumC2032c);
            }
        }
        long j9 = jM1376D >> 1;
        C1577b c1577b3 = AbstractC2030a.f6765d;
        long j10 = (1 & ((int) jM1376D)) == 0 ? j9 : j9 > 9223372036854L ? Long.MAX_VALUE : j9 < -9223372036854L ? Long.MIN_VALUE : j9 * ((long) 1000000);
        this.f10677n = j10;
        long j11 = this.f10676m - j10;
        this.f10676m = j11;
        this.f10678o = jNanoTime;
        AbstractC1926h.m3556I("compose:lazy:prefetch:available_time_nanos", j11);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f10664a + ", constraints = " + this.f10667d + ", isComposed = " + m5678e() + ", isMeasured = " + this.f10669f + ", isCanceled = " + this.f10670g + " }";
    }
}
