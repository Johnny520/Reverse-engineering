package p260x;

import android.os.Trace;
import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.List;
import p000A.C0072l0;
import p027E4.C0330q;
import p029F0.C0373K;
import p029F0.C0413m0;
import p029F0.InterfaceC0409k0;
import p041H0.C0564I;
import p049I2.AbstractC0797o;
import p061L2.C0981u;
import p068N1.C1013c;
import p105V.C1480b;
import p105V.C1483e;
import p110W0.C1577b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p153e1.C2005a;
import p155e3.AbstractC2030a;
import p155e3.AbstractC2033d;
import p155e3.EnumC2032c;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p186k.C2408E;
import p203n.C2654f0;
import p238t.AbstractC3204b;
import p255w.C3377h;
import p255w.C3382m;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3410P(C1013c c1013c, int i5, C0072l0 c0072l0, C2654f0 c2654f0) {
        this.f10679p = c1013c;
        this.f10664a = i5;
        this.f10665b = c0072l0;
        this.f10666c = c2654f0;
        int i6 = AbstractC2033d.f6775b;
        this.f10678o = System.nanoTime() - AbstractC2033d.f6774a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p260x.InterfaceC3398D
    /* JADX INFO: renamed from: a */
    public final void mo5673a() {
        this.f10675l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5675b() {
        InterfaceC0409k0 interfaceC0409k0 = this.f10668e;
        if (interfaceC0409k0 != null) {
            interfaceC0409k0.mo612a();
        }
        this.f10668e = null;
        this.f10674k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p260x.InterfaceC3398D
    public final void cancel() {
        if (this.f10670g) {
            return;
        }
        this.f10670g = true;
        m5675b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5677d(C3418a c3418a) {
        boolean z5;
        List[] listArr;
        C3410P c3410p;
        ?? r11;
        int i5;
        List list;
        int i6;
        boolean z6;
        List[] listArr2;
        int i7 = this.f10664a;
        long j5 = i7;
        AbstractC1926h.m3556I("compose:lazy:prefetch:execute:item", j5);
        C1013c c1013c = this.f10679p;
        C3377h c3377h = (C3377h) ((C3438u) c1013c.f3129b).f10741b.mo6a();
        if (!this.f10670g) {
            int iM5611c = c3377h.m5611c();
            if (i7 >= 0 && i7 < iM5611c) {
                Object objM5612d = c3377h.m5612d(i7);
                Object obj = this.f10672i;
                if (obj != null && !objM5612d.equals(obj)) {
                    m5675b();
                    return false;
                }
                Object objM5610b = c3377h.m5610b(i7);
                C0072l0 c0072l0 = this.f10665b;
                C3420c c3420c = (C3420c) c0072l0.f309g;
                if (c0072l0.f308f != objM5610b || c3420c == null) {
                    C2408E c2408e = (C2408E) c0072l0.f307e;
                    Object objM4272g = c2408e.m4272g(objM5610b);
                    Object obj2 = objM4272g;
                    if (objM4272g == null) {
                        C3420c c3420c2 = new C3420c();
                        c3420c2.f10699d = -1;
                        c2408e.m4278m(objM5610b, c3420c2);
                        obj2 = c3420c2;
                    }
                    c3420c = (C3420c) obj2;
                    c0072l0.f308f = objM5610b;
                    c0072l0.f309g = c3420c;
                }
                m5678e();
                long jM5684a = c3418a.m5684a();
                this.f10676m = jM5684a;
                int i8 = AbstractC2033d.f6775b;
                this.f10678o = System.nanoTime() - AbstractC2033d.f6774a;
                this.f10677n = 0L;
                AbstractC1926h.m3556I("compose:lazy:prefetch:available_time_nanos", jM5684a);
                boolean z7 = true;
                if (m5678e()) {
                    if (!this.f10673j) {
                        if (this.f10676m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.f10674k = m5680g();
                                this.f10673j = true;
                            } finally {
                            }
                        }
                    }
                    C3409O c3409o = this.f10674k;
                    if (c3409o != null) {
                        int i9 = c3420c.f10699d;
                        boolean z8 = this.f10675l;
                        List[] listArr3 = c3409o.f10659b;
                        int i10 = c3409o.f10660c;
                        List list2 = c3409o.f10658a;
                        if (i10 < list2.size()) {
                            if (c3409o.f10663f.f10670g) {
                                AbstractC3204b.m5477c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                            try {
                                int size = list2.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    ((C3399E) list2.get(i11)).f10630d = i9;
                                }
                                Trace.endSection();
                                Trace.beginSection("compose:lazy:prefetch:nested");
                                while (c3409o.f10660c < list2.size()) {
                                    try {
                                        if (listArr3[c3409o.f10660c] != null) {
                                            z5 = z8;
                                            listArr = listArr3;
                                            c3410p = null;
                                        } else {
                                            if (c3418a.m5684a() <= 0) {
                                                return z7;
                                            }
                                            int i12 = c3409o.f10660c;
                                            C3399E c3399e = (C3399E) list2.get(i12);
                                            C3382m c3382m = c3399e.f10627a;
                                            if (c3382m == null) {
                                                list = C0981u.f3047d;
                                                i5 = i12;
                                                z5 = z8;
                                                listArr = listArr3;
                                                c3410p = null;
                                            } else {
                                                int i13 = c3399e.f10630d;
                                                ArrayList arrayList = new ArrayList();
                                                int i14 = c3382m.f10551d;
                                                AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
                                                i5 = i12;
                                                AbstractC2086r.m3859k(abstractC2074fM3853e, AbstractC2086r.m3856h(abstractC2074fM3853e), abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null);
                                                if (i13 == -1) {
                                                    i13 = 2;
                                                }
                                                int i15 = 0;
                                                while (i15 < i13) {
                                                    int i16 = i14 + i15;
                                                    C1013c c1013c2 = c3399e.f10629c;
                                                    if (c1013c2 == null) {
                                                        i6 = i15;
                                                        z6 = z8;
                                                        listArr2 = listArr3;
                                                    } else {
                                                        i6 = i15;
                                                        z6 = z8;
                                                        listArr2 = listArr3;
                                                        arrayList.add(new C3410P(c1013c2, i16, c3399e.f10628b, null));
                                                    }
                                                    i15 = i6 + 1;
                                                    z8 = z6;
                                                    listArr3 = listArr2;
                                                }
                                                z5 = z8;
                                                listArr = listArr3;
                                                c3410p = null;
                                                c3399e.f10632f = arrayList.size();
                                                list = arrayList;
                                            }
                                            listArr[i5] = list;
                                        }
                                        List list3 = listArr[c3409o.f10660c];
                                        AbstractC1665j.m2982b(list3);
                                        while (c3409o.f10661d < list3.size()) {
                                            C3410P c3410p2 = (C3410P) list3.get(c3409o.f10661d);
                                            if (z5) {
                                                C3410P c3410p3 = c3410p2 != null ? c3410p2 : c3410p;
                                                if (c3410p3 != null) {
                                                    r11 = 1;
                                                    c3410p3.f10675l = true;
                                                }
                                            } else {
                                                r11 = 1;
                                            }
                                            c3409o.f10662e = r11;
                                            if (c3410p2.m5676c(c3418a)) {
                                                return r11;
                                            }
                                            c3409o.f10661d += r11;
                                        }
                                        c3409o.f10661d = 0;
                                        c3409o.f10660c++;
                                        z8 = z5;
                                        listArr3 = listArr;
                                        z7 = true;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    C3409O c3409o2 = this.f10674k;
                    if (c3409o2 != null && c3409o2.f10662e) {
                        m5682i();
                        AbstractC1926h.m3556I("compose:lazy:prefetch:execute:item", j5);
                        C3409O c3409o3 = this.f10674k;
                        if (c3409o3 != null) {
                            c3409o3.f10662e = false;
                        }
                    }
                    C2005a c2005a = this.f10667d;
                    if (!this.f10669f && c2005a != null) {
                        if (!m5681h(this.f10676m, c3420c.f10698c)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m5679f(c2005a.f6726a);
                            Trace.endSection();
                            m5682i();
                            c3420c.f10698c = C3420c.m5686a(this.f10677n, c3420c.f10698c);
                            InterfaceC1601c interfaceC1601c = this.f10666c;
                            if (interfaceC1601c != null) {
                                interfaceC1601c.mo1h(this);
                            }
                        } finally {
                        }
                    }
                    C3409O c3409o4 = this.f10674k;
                    if (!this.f10669f || !this.f10673j || c3409o4 == null) {
                        return false;
                    }
                    List list4 = c3409o4.f10658a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i17 = 0; i17 < size2; i17++) {
                        iMin = Math.min(iMin, ((C3399E) list4.get(i17)).f10631e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i18 = c3420c.f10699d;
                    c3420c.f10699d = i18 == -1 ? iMin : ((i18 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i19 = 0; i19 < size3; i19++) {
                        iMin2 = Math.min(iMin2, ((C3399E) list4.get(i19)).f10632f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 >= iMin) {
                        return false;
                    }
                    c3420c.f10698c = 0L;
                    return false;
                }
                if (m5681h(this.f10676m, c3420c.f10696a)) {
                    Trace.beginSection("compose:lazy:prefetch:compose");
                    try {
                        if (this.f10668e != null) {
                            AbstractC3204b.m5475a("Request was already composed!");
                        }
                        InterfaceC1603e interfaceC1603eM5703a = ((C3438u) c1013c.f3129b).m5703a(i7, objM5612d, objM5610b);
                        this.f10672i = objM5612d;
                        C0373K c0373kM675a = ((C0413m0) c1013c.f3130c).m675a();
                        C0564I c0564i = c0373kM675a.f1171d;
                        if (c0564i.m799G()) {
                            c0373kM675a.m622g();
                            if (!c0373kM675a.f1177j.m4268c(objM5612d)) {
                                c0373kM675a.f1182o.m4276k(objM5612d);
                                C2408E c2408e2 = c0373kM675a.f1180m;
                                Object objM4272g2 = c2408e2.m4272g(objM5612d);
                                if (objM4272g2 == null) {
                                    objM4272g2 = c0373kM675a.m627l(objM5612d);
                                    if (objM4272g2 != null) {
                                        c0373kM675a.m624i(((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(objM4272g2), ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f);
                                        c0373kM675a.f1185r++;
                                    } else {
                                        int i20 = ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f;
                                        C0564I c0564i2 = new C0564I(2);
                                        c0564i.f1728u = true;
                                        c0564i.m793A(i20, c0564i2);
                                        c0564i.f1728u = false;
                                        c0373kM675a.f1185r++;
                                        objM4272g2 = c0564i2;
                                    }
                                    c2408e2.m4278m(objM5612d, objM4272g2);
                                }
                                c0373kM675a.m626k((C0564I) objM4272g2, objM5612d, false, interfaceC1603eM5703a);
                            }
                        }
                        this.f10668e = c0373kM675a.m620e(objM5612d);
                        this.f10671h = true;
                        Trace.endSection();
                        m5682i();
                        c3420c.f10696a = C3420c.m5686a(this.f10677n, c3420c.f10696a);
                    } finally {
                    }
                }
                if (m5678e()) {
                }
                return true;
            }
        }
        m5675b();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5678e() {
        return this.f10671h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5681h(long j5, long j6) {
        if (this.f10675l) {
            j6 = 0;
        }
        return j5 > j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f10664a + ", constraints = " + this.f10667d + ", isComposed = " + m5678e() + ", isMeasured = " + this.f10669f + ", isCanceled = " + this.f10670g + " }";
    }
}
