package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs0 implements c80 {

    /* JADX INFO: renamed from: a */
    public final int f564a;

    /* JADX INFO: renamed from: b */
    public final C0541o8 f565b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0742sw f566c;

    /* JADX INFO: renamed from: d */
    public C0617pj f567d;

    /* JADX INFO: renamed from: e */
    public v41 f568e;

    /* JADX INFO: renamed from: f */
    public p60 f569f;

    /* JADX INFO: renamed from: g */
    public boolean f570g;

    /* JADX INFO: renamed from: h */
    public boolean f571h;

    /* JADX INFO: renamed from: i */
    public boolean f572i;

    /* JADX INFO: renamed from: j */
    public Object f573j;

    /* JADX INFO: renamed from: k */
    public boolean f574k;

    /* JADX INFO: renamed from: l */
    public as0 f575l;

    /* JADX INFO: renamed from: m */
    public boolean f576m;

    /* JADX INFO: renamed from: n */
    public long f577n;

    /* JADX INFO: renamed from: o */
    public long f578o;

    /* JADX INFO: renamed from: p */
    public long f579p;

    /* JADX INFO: renamed from: q */
    public boolean f580q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ d50 f581r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bs0(d50 d50Var, int i, C0541o8 c0541o8, InterfaceC0742sw interfaceC0742sw) {
        this.f581r = d50Var;
        this.f564a = i;
        this.f565b = c0541o8;
        this.f566c = interfaceC0742sw;
        int i2 = wf0.f7122b;
        this.f579p = System.nanoTime() - wf0.f7121a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c80
    /* JADX INFO: renamed from: a */
    public final void mo363a() {
        this.f576m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m364b() {
        p60 p60Var = this.f569f;
        if (p60Var != null) {
            switch (p60Var.f4766a) {
                case 0:
                    break;
                default:
                    i60 i60VarM3021b = p60Var.m3021b();
                    if ((i60VarM3021b != null ? i60VarM3021b.f2464f : null) != null) {
                        q60.m3195c(p60Var.f4767b, p60Var.f4768c);
                    }
                    break;
            }
        }
        this.f569f = null;
        v41 v41Var = this.f568e;
        if (v41Var != null) {
            v41Var.mo2633a();
        }
        this.f568e = null;
        this.f575l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m365c(C0309i6 c0309i6) {
        boolean zM366d;
        if (!this.f581r.f969a) {
            return false;
        }
        if (this.f576m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM366d = m366d(c0309i6);
            } finally {
                Trace.endSection();
            }
        } else {
            zM366d = m366d(c0309i6);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zM366d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c80
    public final void cancel() {
        if (this.f571h) {
            return;
        }
        this.f571h = true;
        m364b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m366d(C0309i6 c0309i6) {
        long j;
        ?? r12;
        List list;
        v41 v41VarM3198f;
        int i = this.f564a;
        long j2 = i;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
        o70 o70Var = (o70) ((n70) this.f581r.f970b).f4202b.invoke();
        if (!this.f571h) {
            int iMo2791a = o70Var.mo2791a();
            if (i >= 0 && i < iMo2791a) {
                Object objMo2793c = o70Var.mo2793c(i);
                Object obj = this.f573j;
                if (obj != null && !objMo2793c.equals(obj)) {
                    m364b();
                    return false;
                }
                Object objMo2794d = o70Var.mo2794d(i);
                C0541o8 c0541o8 = this.f565b;
                C0464m9 c0464m9 = (C0464m9) c0541o8.f4482c;
                if (c0541o8.f4481b != objMo2794d || c0464m9 == null) {
                    jh0 jh0Var = (jh0) c0541o8.f4480a;
                    Object objM1701g = jh0Var.m1701g(objMo2794d);
                    Object obj2 = objM1701g;
                    if (objM1701g == null) {
                        C0464m9 c0464m92 = new C0464m9();
                        c0464m92.f3875e = -1;
                        jh0Var.m1707m(objMo2794d, c0464m92);
                        obj2 = c0464m92;
                    }
                    c0464m9 = (C0464m9) obj2;
                    c0541o8.f4481b = objMo2794d;
                    c0541o8.f4482c = c0464m9;
                }
                m367e();
                long jM1558a = c0309i6.m1558a();
                this.f577n = jM1558a;
                int i2 = wf0.f7122b;
                this.f579p = System.nanoTime() - wf0.f7121a;
                this.f578o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jM1558a);
                if (m367e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (m371i(this.f577n, c0464m9.f3871a + c0464m9.f3872b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m369g(objMo2793c, objMo2794d, c0464m9);
                        } finally {
                        }
                    }
                    if (!m367e()) {
                        return true;
                    }
                }
                if (this.f569f != null) {
                    if (!m371i(this.f577n, c0464m9.f3873c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        p60 p60Var = this.f569f;
                        if (p60Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (p60Var.f4766a) {
                            case 0:
                                v41VarM3198f = p60Var.f4767b.m3198f(p60Var.f4768c);
                                break;
                            default:
                                q60 q60Var = p60Var.f4767b;
                                i60 i60VarM3021b = p60Var.m3021b();
                                if (i60VarM3021b != null) {
                                    q60Var.m3197d(i60VarM3021b, false);
                                }
                                v41VarM3198f = q60Var.m3198f(p60Var.f4768c);
                                break;
                        }
                        this.f568e = v41VarM3198f;
                        this.f569f = null;
                        this.f572i = true;
                        Trace.endSection();
                        m372j();
                        c0464m9.f3873c = C0464m9.m2449a(this.f578o, c0464m9.f3873c);
                    } finally {
                    }
                }
                if (!this.f574k) {
                    if (this.f577n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f575l = m370h();
                        this.f574k = true;
                    } finally {
                    }
                }
                as0 as0Var = this.f575l;
                if (as0Var != null) {
                    int i3 = c0464m9.f3875e;
                    boolean z = this.f576m;
                    List[] listArr = as0Var.f255b;
                    int i4 = as0Var.f256c;
                    List list2 = as0Var.f254a;
                    if (i4 < list2.size()) {
                        if (as0Var.f259f.f571h) {
                            z10.m5363c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((d80) list2.get(i5)).f992d = i3;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (as0Var.f256c < list2.size()) {
                                try {
                                    if (listArr[as0Var.f256c] == null) {
                                        if (c0309i6.m1558a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i6 = as0Var.f256c;
                                        d80 d80Var = (d80) list2.get(i6);
                                        InterfaceC0742sw interfaceC0742sw = d80Var.f989a;
                                        if (interfaceC0742sw == null) {
                                            list = C0294hs.f2354d;
                                        } else {
                                            b80 b80Var = new b80(d80Var, d80Var.f992d);
                                            interfaceC0742sw.invoke(b80Var);
                                            ArrayList arrayList = b80Var.f446b;
                                            d80Var.f994f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i6] = list;
                                    }
                                    List list3 = listArr[as0Var.f256c];
                                    list3.getClass();
                                    while (as0Var.f257d < list3.size()) {
                                        bs0 bs0Var = (bs0) list3.get(as0Var.f257d);
                                        if (z) {
                                            bs0 bs0Var2 = bs0Var != null ? bs0Var : null;
                                            if (bs0Var2 != null) {
                                                r12 = 1;
                                                bs0Var2.f576m = true;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        as0Var.f258e = r12;
                                        if (bs0Var.m365c(c0309i6)) {
                                            return r12;
                                        }
                                        as0Var.f257d += r12;
                                    }
                                    as0Var.f257d = 0;
                                    as0Var.f256c++;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                as0 as0Var2 = this.f575l;
                if (as0Var2 != null && as0Var2.f258e) {
                    m372j();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                    as0 as0Var3 = this.f575l;
                    if (as0Var3 != null) {
                        as0Var3.f258e = false;
                    }
                }
                C0617pj c0617pj = this.f567d;
                if (!this.f570g && c0617pj != null) {
                    if (!m371i(this.f577n, c0464m9.f3874d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        m368f(c0617pj.f4912a);
                        Trace.endSection();
                        m372j();
                        c0464m9.f3874d = C0464m9.m2449a(this.f578o, c0464m9.f3874d);
                        InterfaceC0742sw interfaceC0742sw2 = this.f566c;
                        if (interfaceC0742sw2 != null) {
                            interfaceC0742sw2.invoke(this);
                        }
                    } finally {
                    }
                }
                as0 as0Var4 = this.f575l;
                if (this.f570g && this.f574k && as0Var4 != null) {
                    List list4 = as0Var4.f254a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((d80) list4.get(i7)).f993e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = c0464m9.f3875e;
                    c0464m9.f3875e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((d80) list4.get(i9)).f994f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        c0464m9.f3874d = j;
                    }
                }
                return false;
            }
        }
        m364b();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m367e() {
        p60 p60Var;
        return this.f572i || ((p60Var = this.f569f) != null && p60Var.m3022c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m368f(long j) {
        if (this.f571h) {
            z10.m5361a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f570g) {
            z10.m5361a("Request was already measured!");
        }
        this.f570g = true;
        v41 v41Var = this.f568e;
        if (v41Var == null) {
            z10.m5362b("performComposition() must be called before performMeasure()");
            throw new C0725sg();
        }
        int iMo2788b = v41Var.mo2788b();
        for (int i = 0; i < iMo2788b; i++) {
            v41Var.mo2789c(i, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m369g(Object obj, Object obj2, final C0464m9 c0464m9) {
        p60 p60Var;
        p60 p60Var2 = this.f569f;
        int i = 0;
        int i2 = 1;
        if (p60Var2 == null) {
            d50 d50Var = this.f581r;
            InterfaceC0904ww interfaceC0904wwM2634a = ((n70) d50Var.f970b).m2634a(this.f564a, obj, obj2);
            q60 q60VarM5085a = ((x41) d50Var.f971c).m5085a();
            if (q60VarM5085a.f5056d.m272H()) {
                q60VarM5085a.m3203k(obj, interfaceC0904wwM2634a, true);
                p60Var = new p60(q60VarM5085a, obj, i2);
            } else {
                p60Var = new p60(q60VarM5085a, obj, i);
            }
            p60Var2 = p60Var;
            this.f569f = p60Var2;
            this.f573j = obj;
        }
        this.f580q = false;
        while (!p60Var2.m3022c() && !this.f580q) {
            j11 j11Var = new j11() { // from class: zr0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.j11
                /* JADX INFO: renamed from: a */
                public final boolean mo1606a() {
                    bs0 bs0Var = this.f7988d;
                    if (!bs0Var.f580q) {
                        bs0Var.m372j();
                        long j = bs0Var.f578o;
                        C0464m9 c0464m92 = c0464m9;
                        c0464m92.f3871a = C0464m9.m2449a(j, c0464m92.f3871a);
                        bs0Var.f580q = !bs0Var.m371i(bs0Var.f577n, r1 + c0464m92.f3872b);
                    }
                    return bs0Var.f580q;
                }
            };
            switch (p60Var2.f4766a) {
                case 0:
                    break;
                default:
                    i60 i60VarM3021b = p60Var2.m3021b();
                    yp0 yp0Var = i60VarM3021b != null ? i60VarM3021b.f2464f : null;
                    if (yp0Var != null && !yp0Var.m5289c()) {
                        q60 q60Var = p60Var2.f4767b;
                        l21 l21VarM4270k = u50.m4270k();
                        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
                        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
                        try {
                            b60 b60Var = q60Var.f5056d;
                            b60Var.f421t = true;
                            try {
                                yp0Var.m5291e(j11Var);
                                b60Var.f421t = false;
                            } finally {
                            }
                        } finally {
                            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                        }
                    }
                    break;
            }
        }
        m372j();
        boolean z = this.f580q;
        long j = this.f578o;
        if (z) {
            c0464m9.f3872b = C0464m9.m2449a(j, c0464m9.f3872b);
        } else {
            c0464m9.f3871a = C0464m9.m2449a(j, c0464m9.f3871a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final as0 m370h() {
        v41 v41Var = this.f568e;
        if (v41Var == null) {
            z10.m5362b("Should precompose before resolving nested prefetch states");
            throw new C0725sg();
        }
        zt0 zt0Var = new zt0();
        v41Var.mo2790d(new C0532o(15, zt0Var));
        List list = (List) zt0Var.f7995d;
        if (list != null) {
            return new as0(this, list);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m371i(long j, long j2) {
        if (this.f576m) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m372j() {
        int i = wf0.f7122b;
        long jNanoTime = System.nanoTime() - wf0.f7121a;
        long j = this.f579p;
        long jM2988X = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                C0675r3 c0675r3 = AbstractC0935xq.f7397d;
            } else {
                long j2 = j < 0 ? AbstractC0935xq.f7399f : AbstractC0935xq.f7398e;
                jM2988X = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
                int i2 = AbstractC0972yq.f7686a;
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jM2988X = jNanoTime < 0 ? AbstractC0935xq.f7399f : AbstractC0935xq.f7398e;
        } else {
            long j3 = jNanoTime - j;
            long j4 = (~(j3 ^ j)) & (j3 ^ jNanoTime);
            EnumC1013zq enumC1013zq = EnumC1013zq.NANOSECONDS;
            if (j4 < 0) {
                EnumC1013zq enumC1013zq2 = EnumC1013zq.MILLISECONDS;
                if (enumC1013zq.compareTo(enumC1013zq2) < 0) {
                    long j5 = (jNanoTime / 1000000) - (j / 1000000);
                    long j6 = (jNanoTime % 1000000) - (j % 1000000);
                    C0675r3 c0675r32 = AbstractC0935xq.f7397d;
                    long jM2988X2 = p30.m2988X(j5, enumC1013zq2);
                    long jM2988X3 = p30.m2988X(j6, enumC1013zq);
                    int i3 = ((int) jM2988X2) & 1;
                    if (i3 != (((int) jM2988X3) & 1)) {
                        jM2988X = i3 == 1 ? AbstractC0935xq.m5143a(jM2988X2 >> 1, jM2988X3 >> 1) : AbstractC0935xq.m5143a(jM2988X3 >> 1, jM2988X2 >> 1);
                    } else if (i3 == 0) {
                        long j7 = (jM2988X2 >> 1) + (jM2988X3 >> 1);
                        if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
                            jM2988X = p30.m3014x(j7 / 1000000);
                        } else {
                            jM2988X = j7 << 1;
                            int i4 = AbstractC0972yq.f7686a;
                        }
                    } else {
                        long jM2996f = p30.m2996f(jM2988X2 >> 1, jM2988X3 >> 1);
                        if (jM2996f == 9223372036854759646L) {
                            C0921xc.m5131l("Summing infinite durations of different signs yields an undefined result.");
                            return;
                        }
                        if (jM2996f == 4611686018427387903L || jM2996f == -4611686018427387903L) {
                            jM2988X = p30.m3014x(jM2996f);
                        } else if (-4611686018426L > jM2996f || jM2996f >= 4611686018427L) {
                            jM2988X = p30.m3014x(w60.m4908o(jM2996f, -4611686018427387903L, 4611686018427387903L));
                        } else {
                            jM2988X = (jM2996f * 1000000) << 1;
                            int i5 = AbstractC0972yq.f7686a;
                        }
                    }
                } else {
                    long j8 = j3 < 0 ? AbstractC0935xq.f7399f : AbstractC0935xq.f7398e;
                    jM2988X = ((-(j8 >> 1)) << 1) + ((long) (((int) j8) & 1));
                    int i6 = AbstractC0972yq.f7686a;
                }
            } else {
                jM2988X = p30.m2988X(j3, enumC1013zq);
            }
        }
        long j9 = jM2988X >> 1;
        C0675r3 c0675r33 = AbstractC0935xq.f7397d;
        long j10 = (((int) jM2988X) & 1) == 0 ? j9 : j9 > 9223372036854L ? Long.MAX_VALUE : j9 < -9223372036854L ? Long.MIN_VALUE : j9 * 1000000;
        this.f578o = j10;
        long j11 = this.f577n - j10;
        this.f577n = j11;
        this.f579p = jNanoTime;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f564a + ", constraints = " + this.f567d + ", isComposed = " + m367e() + ", isMeasured = " + this.f570g + ", isCanceled = " + this.f571h + " }";
    }
}
