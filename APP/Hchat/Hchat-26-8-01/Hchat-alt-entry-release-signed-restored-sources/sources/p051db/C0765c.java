package p051db;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import java.util.Set;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: db.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0765c {

    /* JADX INFO: renamed from: a */
    public final String f2288a;

    /* JADX INFO: renamed from: b */
    public final int f2289b;

    /* JADX INFO: renamed from: c */
    public final String f2290c;

    /* JADX INFO: renamed from: d */
    public final List f2291d;

    /* JADX INFO: renamed from: e */
    public final List f2292e;

    /* JADX INFO: renamed from: f */
    public final List f2293f;

    /* JADX INFO: renamed from: g */
    public final long f2294g;

    /* JADX INFO: renamed from: h */
    public final int f2295h;

    /* JADX INFO: renamed from: i */
    public final Set f2296i;

    /* JADX INFO: renamed from: j */
    public final int f2297j;

    /* JADX INFO: renamed from: k */
    public final int f2298k;

    /* JADX INFO: renamed from: l */
    public final boolean f2299l;

    /* JADX INFO: renamed from: m */
    public final String f2300m;

    /* JADX INFO: renamed from: n */
    public final long f2301n;

    /* JADX INFO: renamed from: o */
    public final int f2302o;

    /* JADX INFO: renamed from: p */
    public final int f2303p;

    /* JADX INFO: renamed from: q */
    public final String f2304q;

    /* JADX INFO: renamed from: r */
    public final int f2305r;

    /* JADX INFO: renamed from: s */
    public final int f2306s;

    /* JADX INFO: renamed from: t */
    public final List f2307t;

    /* JADX INFO: renamed from: u */
    public final int f2308u;

    /* JADX INFO: renamed from: v */
    public final List f2309v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0765c(String str, int i9, String str2, List list, List list2, List list3, long j3, int i10, Set set, int i11, int i12, boolean z9, String str3, long j4, int i13, int i14, String str4, int i15, int i16, List list4, int i17, List list5) {
        str.getClass();
        list.getClass();
        set.getClass();
        list4.getClass();
        list5.getClass();
        this.f2288a = str;
        this.f2289b = i9;
        this.f2290c = str2;
        this.f2291d = list;
        this.f2292e = list2;
        this.f2293f = list3;
        this.f2294g = j3;
        this.f2295h = i10;
        this.f2296i = set;
        this.f2297j = i11;
        this.f2298k = i12;
        this.f2299l = z9;
        this.f2300m = str3;
        this.f2301n = j4;
        this.f2302o = i13;
        this.f2303p = i14;
        this.f2304q = str4;
        this.f2305r = i15;
        this.f2306s = i16;
        this.f2307t = list4;
        this.f2308u = i17;
        this.f2309v = list5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0765c m1980a(C0765c c0765c, int i9, String str, List list, List list2, List list3, long j3, int i10, Set set, int i11, int i12, boolean z9, String str2, long j4, int i13, int i14, String str3, int i15, int i16, List list4, int i17, List list5, int i18) {
        String str4 = c0765c.f2288a;
        int i19 = (i18 & 2) != 0 ? c0765c.f2289b : i9;
        String str5 = (i18 & 4) != 0 ? c0765c.f2290c : str;
        List list6 = (i18 & 8) != 0 ? c0765c.f2291d : list;
        List list7 = (i18 & 16) != 0 ? c0765c.f2292e : list2;
        List list8 = (i18 & 32) != 0 ? c0765c.f2293f : list3;
        long j5 = (i18 & 64) != 0 ? c0765c.f2294g : j3;
        int i20 = (i18 & 128) != 0 ? c0765c.f2295h : i10;
        Set set2 = (i18 & Opcodes.ACC_NATIVE) != 0 ? c0765c.f2296i : set;
        int i21 = (i18 & Opcodes.ACC_INTERFACE) != 0 ? c0765c.f2297j : i11;
        int i22 = (i18 & 1024) != 0 ? c0765c.f2298k : i12;
        boolean z10 = (i18 & Opcodes.ACC_STRICT) != 0 ? c0765c.f2299l : z9;
        String str6 = (i18 & 4096) != 0 ? c0765c.f2300m : str2;
        int i23 = i19;
        long j10 = (i18 & 8192) != 0 ? c0765c.f2301n : j4;
        int i24 = (i18 & 16384) != 0 ? c0765c.f2302o : i13;
        int i25 = (32768 & i18) != 0 ? c0765c.f2303p : i14;
        String str7 = (i18 & 65536) != 0 ? c0765c.f2304q : str3;
        int i26 = (i18 & Opcodes.ACC_DEPRECATED) != 0 ? c0765c.f2305r : i15;
        int i27 = (i18 & Opcodes.ASM4) != 0 ? c0765c.f2306s : i16;
        List list9 = (i18 & 524288) != 0 ? c0765c.f2307t : list4;
        int i28 = (i18 & 1048576) != 0 ? c0765c.f2308u : i17;
        List list10 = (i18 & 2097152) != 0 ? c0765c.f2309v : list5;
        c0765c.getClass();
        str4.getClass();
        list6.getClass();
        list8.getClass();
        set2.getClass();
        str7.getClass();
        list9.getClass();
        list10.getClass();
        return new C0765c(str4, i23, str5, list6, list7, list8, j5, i20, set2, i21, i22, z10, str6, j10, i24, i25, str7, i26, i27, list9, i28, list10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0765c)) {
            return false;
        }
        C0765c c0765c = (C0765c) obj;
        return AbstractC1416l.m3825a(this.f2288a, c0765c.f2288a) && this.f2289b == c0765c.f2289b && this.f2290c.equals(c0765c.f2290c) && AbstractC1416l.m3825a(this.f2291d, c0765c.f2291d) && this.f2292e.equals(c0765c.f2292e) && this.f2293f.equals(c0765c.f2293f) && this.f2294g == c0765c.f2294g && this.f2295h == c0765c.f2295h && AbstractC1416l.m3825a(this.f2296i, c0765c.f2296i) && this.f2297j == c0765c.f2297j && this.f2298k == c0765c.f2298k && this.f2299l == c0765c.f2299l && this.f2300m.equals(c0765c.f2300m) && this.f2301n == c0765c.f2301n && this.f2302o == c0765c.f2302o && this.f2303p == c0765c.f2303p && this.f2304q.equals(c0765c.f2304q) && this.f2305r == c0765c.f2305r && this.f2306s == c0765c.f2306s && AbstractC1416l.m3825a(this.f2307t, c0765c.f2307t) && this.f2308u == c0765c.f2308u && AbstractC1416l.m3825a(this.f2309v, c0765c.f2309v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2309v.hashCode() + AbstractC0921a.m2242e(this.f2308u, AbstractC2091b.m5158e(this.f2307t, AbstractC0921a.m2242e(this.f2306s, AbstractC0921a.m2242e(this.f2305r, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f2303p, AbstractC0921a.m2242e(this.f2302o, AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f2298k, AbstractC0921a.m2242e(this.f2297j, (this.f2296i.hashCode() + AbstractC0921a.m2242e(this.f2295h, AbstractC0921a.m2243f(AbstractC2091b.m5158e(this.f2293f, AbstractC2091b.m5158e(this.f2292e, AbstractC2091b.m5158e(this.f2291d, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f2289b, this.f2288a.hashCode() * 31, 31), 31, this.f2290c), 31), 31), 31), 31, this.f2294g), 31)) * 31, 31), 31), 31, this.f2299l), 31, this.f2300m), 31, this.f2301n), 31), 31), 31, this.f2304q), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f2289b, "ScheduledTaskItem(id=", this.f2288a, ", type=", ", content=");
        sbM2258u.append(this.f2290c);
        sbM2258u.append(", contentItems=");
        sbM2258u.append(this.f2291d);
        sbM2258u.append(", mediaPaths=");
        sbM2258u.append(this.f2292e);
        sbM2258u.append(", targetIds=");
        sbM2258u.append(this.f2293f);
        sbM2258u.append(", planTime=");
        sbM2258u.append(this.f2294g);
        sbM2258u.append(", repeatType=");
        sbM2258u.append(this.f2295h);
        sbM2258u.append(", repeatDays=");
        sbM2258u.append(this.f2296i);
        sbM2258u.append(", intervalSeconds=");
        sbM2258u.append(this.f2297j);
        sbM2258u.append(", mediaIntervalSeconds=");
        sbM2258u.append(this.f2298k);
        sbM2258u.append(", sendOnTimeout=");
        sbM2258u.append(this.f2299l);
        sbM2258u.append(", status=");
        sbM2258u.append(this.f2300m);
        sbM2258u.append(", lastExecutedTime=");
        sbM2258u.append(this.f2301n);
        sbM2258u.append(", lastSuccessCount=");
        sbM2258u.append(this.f2302o);
        sbM2258u.append(", lastFailCount=");
        sbM2258u.append(this.f2303p);
        sbM2258u.append(", remark=");
        sbM2258u.append(this.f2304q);
        sbM2258u.append(", targetType=");
        sbM2258u.append(this.f2305r);
        sbM2258u.append(", momentsType=");
        sbM2258u.append(this.f2306s);
        sbM2258u.append(", items=");
        sbM2258u.append(this.f2307t);
        sbM2258u.append(", sendChannel=");
        sbM2258u.append(this.f2308u);
        sbM2258u.append(", planTimes=");
        sbM2258u.append(this.f2309v);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }
}
