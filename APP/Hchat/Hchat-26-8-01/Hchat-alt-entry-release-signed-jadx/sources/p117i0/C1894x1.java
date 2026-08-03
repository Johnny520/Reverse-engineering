package p117i0;

import be.C0289k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p014b.C0126e;
import p020b5.C0184c;
import p069f.AbstractC0953p0;
import p069f.AbstractC0959s0;
import p069f.C0933f0;
import p069f.C0943k0;
import p069f.C0945l0;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1236q;
import p088g0.C1271o;
import p131j0.C2045a;
import p131j0.C2048d;
import p136j8.C2104o;
import p249qg.C3564g;
import p266s0.C3871a;
import p276sf.C3958e;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tg.C4183b0;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i0.x1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1894x1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public List f6288h;

    /* JADX INFO: renamed from: i */
    public List f6289i;

    /* JADX INFO: renamed from: j */
    public List f6290j;

    /* JADX INFO: renamed from: k */
    public C0945l0 f6291k;

    /* JADX INFO: renamed from: l */
    public C0945l0 f6292l;

    /* JADX INFO: renamed from: m */
    public C0945l0 f6293m;

    /* JADX INFO: renamed from: n */
    public Set f6294n;

    /* JADX INFO: renamed from: o */
    public C0945l0 f6295o;

    /* JADX INFO: renamed from: p */
    public int f6296p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ C1819d f6297q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1897y1 f6298r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894x1(C1897y1 c1897y1, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f6298r = c1897y1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4654f(C1897y1 c1897y1, List list, List list2, List list3, C0945l0 c0945l0, C0945l0 c0945l02, C0945l0 c0945l03, C0945l0 c0945l04) {
        char c10;
        long j3;
        long j4;
        synchronized (c1897y1.f6305c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i9 = 0; i9 < size; i9++) {
                    C1871q c1871q = (C1871q) list3.get(i9);
                    c1871q.m4588a();
                    c1897y1.m4668L(c1871q);
                }
                list3.clear();
                Object[] objArr = c0945l0.f2976b;
                long[] jArr = c0945l0.f2975a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j3 = 255;
                    while (true) {
                        long j5 = jArr[i10];
                        c10 = 7;
                        j4 = -9187201950435737472L;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j5 & 255) < 128) {
                                    C1871q c1871q2 = (C1871q) objArr[(i10 << 3) + i12];
                                    c1871q2.m4588a();
                                    c1897y1.m4668L(c1871q2);
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 == length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                } else {
                    c10 = 7;
                    j3 = 255;
                    j4 = -9187201950435737472L;
                }
                c0945l0.m2329b();
                Object[] objArr2 = c0945l02.f2976b;
                long[] jArr2 = c0945l02.f2975a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr2[i13];
                        if ((((~j10) << c10) & j10 & j4) != j4) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j10 & j3) < 128) {
                                    ((C1871q) objArr2[(i13 << 3) + i15]).m4594g();
                                }
                                j10 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            } else if (i13 == length2) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                c0945l02.m2329b();
                c0945l03.m2329b();
                Object[] objArr3 = c0945l04.f2976b;
                long[] jArr3 = c0945l04.f2975a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j11 = jArr3[i16];
                        if ((((~j11) << c10) & j11 & j4) != j4) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j11 & j3) < 128) {
                                    C1871q c1871q3 = (C1871q) objArr3[(i16 << 3) + i18];
                                    c1871q3.m4588a();
                                    c1897y1.m4668L(c1871q3);
                                }
                                j11 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            } else if (i16 == length3) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                }
                c0945l04.m2329b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m4655g(List list, C1897y1 c1897y1) {
        list.clear();
        synchronized (c1897y1.f6305c) {
            try {
                ArrayList arrayList = c1897y1.f6313k;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    list.add((AbstractC1887v0) arrayList.get(i9));
                }
                c1897y1.f6313k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C1894x1 c1894x1 = new C1894x1(this.f6298r, (InterfaceC5557c) obj3);
        c1894x1.f6297q = (C1819d) obj2;
        c1894x1.invokeSuspend(C3967n.f12976a);
        return EnumC5799a.f23547g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1819d c1819d;
        C0945l0 c0945l0;
        C0945l0 c0945l02;
        List list;
        Set set;
        List list2;
        C0945l0 c0945l03;
        List list3;
        C0945l0 c0945l04;
        List list4;
        C0945l0 c0945l05;
        List list5;
        C0945l0 c0945l06;
        C1897y1 c1897y1;
        Object objM7512o;
        C3564g c3564g;
        EnumC5799a enumC5799a;
        C1819d c1819d2;
        C0933f0 c0933f0;
        EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
        int i9 = this.f6296p;
        int i10 = 2;
        int i11 = 1;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            c1819d = this.f6297q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C0945l0 c0945l07 = AbstractC0959s0.f3019a;
            c0945l0 = new C0945l0();
            C0945l0 c0945l08 = new C0945l0();
            C0945l0 c0945l09 = new C0945l0();
            C2048d c2048d = new C2048d(c0945l09);
            c0945l02 = new C0945l0();
            list = arrayList;
            set = c2048d;
            list2 = arrayList2;
            c0945l03 = c0945l09;
            list3 = arrayList3;
            c0945l04 = c0945l08;
            synchronized (this.f6298r.f6305c) {
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C0945l0 c0945l010 = this.f6295o;
                set = this.f6294n;
                c0945l03 = this.f6293m;
                c0945l04 = this.f6292l;
                c0945l0 = this.f6291k;
                list3 = this.f6290j;
                list2 = this.f6289i;
                list = this.f6288h;
                C1819d c1819d3 = this.f6297q;
                AbstractC1089i.m2732I0(obj);
                c0945l02 = c0945l010;
                c1819d = c1819d3;
                C1897y1 c1897y12 = this.f6298r;
                synchronized (c1897y12.f6305c) {
                    try {
                        if (c1897y12.f6314l.m2323j()) {
                            C0933f0 c0933f0M5054b = C2045a.m5054b(c1897y12.f6314l);
                            c1897y12.f6314l.m2314a();
                            C0126e c0126e = c1897y12.f6315m;
                            ((C0943k0) c0126e.f332h).m2314a();
                            ((C0943k0) c0126e.f333i).m2314a();
                            c1897y12.f6317o.m2314a();
                            c0933f0 = new C0933f0(c0933f0M5054b.f2924b);
                            Object[] objArr = c0933f0M5054b.f2923a;
                            int i12 = c0933f0M5054b.f2924b;
                            enumC5799a = enumC5799a2;
                            int i13 = 0;
                            while (i13 < i12) {
                                int i14 = i13;
                                AbstractC1887v0 abstractC1887v0 = (AbstractC1887v0) objArr[i13];
                                c0933f0.m2286a(new C3958e(abstractC1887v0, c1897y12.f6316n.m2320g(abstractC1887v0)));
                                i13 = i14 + 1;
                                c1819d = c1819d;
                                objArr = objArr;
                            }
                            c1819d2 = c1819d;
                            c1897y12.f6316n.m2314a();
                        } else {
                            enumC5799a = enumC5799a2;
                            c1819d2 = c1819d;
                            c0933f0 = AbstractC0953p0.f3003b;
                            c0933f0.getClass();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Object[] objArr2 = c0933f0.f2923a;
                int i15 = c0933f0.f2924b;
                for (int i16 = 0; i16 < i15; i16++) {
                    C3958e c3958e = (C3958e) objArr2[i16];
                }
                C0184c c0184c = this.f6298r.f6304b;
                ((C3871a) c0184c.f469a).set(0);
                ((C0289k) c0184c.f470b).m1197f(new C1271o(28));
                enumC5799a2 = enumC5799a;
                c1819d = c1819d2;
                i10 = 2;
                i11 = 1;
                synchronized (this.f6298r.f6305c) {
                }
                C1897y1 c1897y13 = this.f6298r;
                this.f6297q = c1819d;
                this.f6288h = list;
                this.f6289i = list2;
                this.f6290j = list3;
                this.f6291k = c0945l0;
                this.f6292l = c0945l04;
                this.f6293m = c0945l03;
                this.f6294n = set;
                this.f6295o = c0945l02;
                this.f6296p = i11;
                if (c1897y13.m4660C()) {
                    objM7512o = C3967n.f12976a;
                } else {
                    C3564g c3564g2 = new C3564g(i11, AbstractC1184v0.m3214x(this));
                    c3564g2.m7513p();
                    synchronized (c1897y13.f6305c) {
                        if (c1897y13.m4660C()) {
                            c3564g = c3564g2;
                        } else {
                            c1897y13.f6320r = c3564g2;
                            c3564g = null;
                        }
                    }
                    if (c3564g != null) {
                        c3564g.resumeWith(C3967n.f12976a);
                    }
                    objM7512o = c3564g2.m7512o();
                    if (objM7512o != EnumC5799a.f23547g) {
                        objM7512o = C3967n.f12976a;
                    }
                }
                if (objM7512o != enumC5799a2) {
                    List list6 = list;
                    c0945l05 = c0945l0;
                    c0945l06 = c0945l02;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    C0945l0 c0945l011 = c0945l04;
                    C0945l0 c0945l012 = c0945l03;
                    c1897y1 = this.f6298r;
                    C4183b0 c4183b0 = C1897y1.f6302z;
                    if (c1897y1.m4667K()) {
                        List list7 = list4;
                        c0945l02 = c0945l06;
                        c0945l0 = c0945l05;
                        list = list5;
                        list3 = list7;
                        c0945l03 = c0945l012;
                        c0945l04 = c0945l011;
                        set = set2;
                        synchronized (this.f6298r.f6305c) {
                        }
                    } else {
                        C1891w1 c1891w1 = new C1891w1(this.f6298r, c0945l012, c0945l06, list5, list2, c0945l05, list4, c0945l011, set2);
                        this.f6297q = c1819d;
                        this.f6288h = list5;
                        this.f6289i = list2;
                        this.f6290j = list4;
                        this.f6291k = c0945l05;
                        this.f6292l = c0945l011;
                        this.f6293m = c0945l012;
                        this.f6294n = set2;
                        this.f6295o = c0945l06;
                        this.f6296p = i10;
                        if (c1819d.m4458d(c1891w1, this) != enumC5799a2) {
                            List list8 = list4;
                            c0945l02 = c0945l06;
                            c0945l0 = c0945l05;
                            list = list5;
                            list3 = list8;
                            c0945l03 = c0945l012;
                            c0945l04 = c0945l011;
                            set = set2;
                            C1897y1 c1897y122 = this.f6298r;
                            synchronized (c1897y122.f6305c) {
                            }
                        }
                    }
                }
                return enumC5799a2;
            }
            C0945l0 c0945l013 = this.f6295o;
            set = this.f6294n;
            c0945l03 = this.f6293m;
            c0945l04 = this.f6292l;
            C0945l0 c0945l014 = this.f6291k;
            List list9 = this.f6290j;
            list2 = this.f6289i;
            List list10 = this.f6288h;
            C1819d c1819d4 = this.f6297q;
            AbstractC1089i.m2732I0(obj);
            c0945l06 = c0945l013;
            c1819d = c1819d4;
            list4 = list9;
            list5 = list10;
            c0945l05 = c0945l014;
            Set set22 = set;
            C0945l0 c0945l0112 = c0945l04;
            C0945l0 c0945l0122 = c0945l03;
            c1897y1 = this.f6298r;
            C4183b0 c4183b02 = C1897y1.f6302z;
            if (c1897y1.m4667K()) {
            }
        }
    }
}
