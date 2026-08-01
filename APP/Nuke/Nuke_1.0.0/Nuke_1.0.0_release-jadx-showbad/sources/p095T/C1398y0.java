package p095T;

import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000A.C0038T0;
import p000A.C0072l0;
import p014C1.C0240b;
import p047I0.C0711a0;
import p056K2.C0882h;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.C1286x;
import p105V.C1479a;
import p105V.C1486h;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p136b0.C1839a;
import p160f3.C2135g;
import p178i3.C2318C;
import p186k.AbstractC2413J;
import p186k.AbstractC2416M;
import p186k.C2404A;
import p186k.C2408E;
import p186k.C2409F;

/* JADX INFO: renamed from: T.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1398y0 extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public List f4978h;

    /* JADX INFO: renamed from: i */
    public List f4979i;

    /* JADX INFO: renamed from: j */
    public List f4980j;

    /* JADX INFO: renamed from: k */
    public C2409F f4981k;

    /* JADX INFO: renamed from: l */
    public C2409F f4982l;

    /* JADX INFO: renamed from: m */
    public C2409F f4983m;

    /* JADX INFO: renamed from: n */
    public Set f4984n;

    /* JADX INFO: renamed from: o */
    public C2409F f4985o;

    /* JADX INFO: renamed from: p */
    public int f4986p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ C0711a0 f4987q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1400z0 f4988r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398y0(C1400z0 c1400z0, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f4988r = c1400z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2673r(C1400z0 c1400z0, List list, List list2, List list3, C2409F c2409f, C2409F c2409f2, C2409F c2409f3, C2409F c2409f4) {
        char c5;
        long j5;
        long j6;
        synchronized (c1400z0.f4997c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C1397y c1397y = (C1397y) list3.get(i5);
                    c1397y.m2647a();
                    c1400z0.m2687L(c1397y);
                }
                list3.clear();
                Object[] objArr = c2409f.f7794b;
                long[] jArr = c2409f.f7793a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    j5 = 255;
                    while (true) {
                        long j7 = jArr[i6];
                        c5 = 7;
                        j6 = -9187201950435737472L;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j7 & 255) < 128) {
                                    C1397y c1397y2 = (C1397y) objArr[(i6 << 3) + i8];
                                    c1397y2.m2647a();
                                    c1400z0.m2687L(c1397y2);
                                }
                                j7 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            } else if (i6 == length) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                } else {
                    c5 = 7;
                    j5 = 255;
                    j6 = -9187201950435737472L;
                }
                c2409f.m4280b();
                Object[] objArr2 = c2409f2.f7794b;
                long[] jArr2 = c2409f2.f7793a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j8 = jArr2[i9];
                        if ((((~j8) << c5) & j8 & j6) != j6) {
                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j8 & j5) < 128) {
                                    ((C1397y) objArr2[(i9 << 3) + i11]).m2653g();
                                }
                                j8 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            } else if (i9 == length2) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                c2409f2.m4280b();
                c2409f3.m4280b();
                Object[] objArr3 = c2409f4.f7794b;
                long[] jArr3 = c2409f4.f7793a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j9 = jArr3[i12];
                        if ((((~j9) << c5) & j9 & j6) != j6) {
                            int i13 = 8 - ((~(i12 - length3)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j9 & j5) < 128) {
                                    C1397y c1397y3 = (C1397y) objArr3[(i12 << 3) + i14];
                                    c1397y3.m2647a();
                                    c1400z0.m2687L(c1397y3);
                                }
                                j9 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            } else if (i12 == length3) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                c2409f4.m4280b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m2674t(List list, C1400z0 c1400z0) {
        list.clear();
        synchronized (c1400z0.f4997c) {
            try {
                ArrayList arrayList = c1400z0.f5005k;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list.add((AbstractC1346X) arrayList.get(i5));
                }
                c1400z0.f5005k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        C1398y0 c1398y0 = new C1398y0(this.f4988r, (InterfaceC1046d) obj3);
        c1398y0.f4987q = (C0711a0) obj2;
        c1398y0.mo8p(C0891q.f2780a);
        return EnumC1152a.f3788d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0125 -> B:44:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01db -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C0711a0 c0711a0;
        C2409F c2409f;
        C2409F c2409f2;
        List list;
        Set set;
        List list2;
        C2409F c2409f3;
        List list3;
        C2409F c2409f4;
        List list4;
        C2409F c2409f5;
        List list5;
        C2409F c2409f6;
        C1400z0 c1400z0;
        Object objM3967r;
        C2135g c2135g;
        EnumC1152a enumC1152a;
        C0711a0 c0711a02;
        C2404A c2404a;
        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
        int i5 = this.f4986p;
        int i6 = 2;
        int i7 = 1;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            c0711a0 = this.f4987q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C2409F c2409f7 = AbstractC2416M.f7817a;
            c2409f = new C2409F();
            C2409F c2409f8 = new C2409F();
            C2409F c2409f9 = new C2409F();
            C1486h c1486h = new C1486h(c2409f9);
            c2409f2 = new C2409F();
            list = arrayList;
            set = c1486h;
            list2 = arrayList2;
            c2409f3 = c2409f9;
            list3 = arrayList3;
            c2409f4 = c2409f8;
            synchronized (this.f4988r.f4997c) {
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2409F c2409f10 = this.f4985o;
                set = this.f4984n;
                c2409f3 = this.f4983m;
                c2409f4 = this.f4982l;
                c2409f = this.f4981k;
                list3 = this.f4980j;
                list2 = this.f4979i;
                list = this.f4978h;
                C0711a0 c0711a03 = this.f4987q;
                AbstractC1784a.m3205S(obj);
                c2409f2 = c2409f10;
                c0711a0 = c0711a03;
                C1400z0 c1400z02 = this.f4988r;
                synchronized (c1400z02.f4997c) {
                    try {
                        if (c1400z02.f5006l.m4275j()) {
                            C2404A c2404aM2751b = C1479a.m2751b(c1400z02.f5006l);
                            c1400z02.f5006l.m4266a();
                            C0038T0 c0038t0 = c1400z02.f5007m;
                            ((C2408E) c0038t0.f169e).m4266a();
                            ((C2408E) c0038t0.f170f).m4266a();
                            c1400z02.f5009o.m4266a();
                            c2404a = new C2404A(c2404aM2751b.f7767b);
                            Object[] objArr = c2404aM2751b.f7766a;
                            int i8 = c2404aM2751b.f7767b;
                            enumC1152a = enumC1152a2;
                            int i9 = 0;
                            while (i9 < i8) {
                                int i10 = i9;
                                AbstractC1346X abstractC1346X = (AbstractC1346X) objArr[i9];
                                c2404a.m4243a(new C0882h(abstractC1346X, c1400z02.f5008n.m4272g(abstractC1346X)));
                                i9 = i10 + 1;
                                c0711a0 = c0711a0;
                                objArr = objArr;
                            }
                            c0711a02 = c0711a0;
                            c1400z02.f5008n.m4266a();
                        } else {
                            enumC1152a = enumC1152a2;
                            c0711a02 = c0711a0;
                            c2404a = AbstractC2413J.f7814b;
                            AbstractC1665j.m2983c(c2404a, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = c2404a.f7766a;
                int i11 = c2404a.f7767b;
                for (int i12 = 0; i12 < i11; i12++) {
                    C0882h c0882h = (C0882h) objArr2[i12];
                }
                C0072l0 c0072l0 = this.f4988r.f4996b;
                ((C1839a) c0072l0.f307e).set(0);
                ((C0240b) c0072l0.f308f).m431h(new C1286x(11));
                enumC1152a2 = enumC1152a;
                c0711a0 = c0711a02;
                i6 = 2;
                i7 = 1;
                synchronized (this.f4988r.f4997c) {
                }
                C1400z0 c1400z03 = this.f4988r;
                this.f4987q = c0711a0;
                this.f4978h = list;
                this.f4979i = list2;
                this.f4980j = list3;
                this.f4981k = c2409f;
                this.f4982l = c2409f4;
                this.f4983m = c2409f3;
                this.f4984n = set;
                this.f4985o = c2409f2;
                this.f4986p = i7;
                if (c1400z03.m2679C()) {
                    objM3967r = C0891q.f2780a;
                } else {
                    C2135g c2135g2 = new C2135g(i7, AbstractC1923e.m3448G(this));
                    c2135g2.m3968t();
                    synchronized (c1400z03.f4997c) {
                        if (c1400z03.m2679C()) {
                            c2135g = c2135g2;
                        } else {
                            c1400z03.f5012r = c2135g2;
                            c2135g = null;
                        }
                    }
                    if (c2135g != null) {
                        c2135g.mo278i(C0891q.f2780a);
                    }
                    objM3967r = c2135g2.m3967r();
                    if (objM3967r != EnumC1152a.f3788d) {
                        objM3967r = C0891q.f2780a;
                    }
                }
                if (objM3967r != enumC1152a2) {
                    List list6 = list;
                    c2409f5 = c2409f;
                    c2409f6 = c2409f2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    C2409F c2409f11 = c2409f4;
                    C2409F c2409f12 = c2409f3;
                    c1400z0 = this.f4988r;
                    C2318C c2318c = C1400z0.f4994z;
                    if (c1400z0.m2686K()) {
                        List list7 = list4;
                        c2409f2 = c2409f6;
                        c2409f = c2409f5;
                        list = list5;
                        list3 = list7;
                        c2409f3 = c2409f12;
                        c2409f4 = c2409f11;
                        set = set2;
                        synchronized (this.f4988r.f4997c) {
                        }
                    } else {
                        C1396x0 c1396x0 = new C1396x0(this.f4988r, c2409f12, c2409f6, list5, list2, c2409f5, list4, c2409f11, set2);
                        this.f4987q = c0711a0;
                        this.f4978h = list5;
                        this.f4979i = list2;
                        this.f4980j = list4;
                        this.f4981k = c2409f5;
                        this.f4982l = c2409f11;
                        this.f4983m = c2409f12;
                        this.f4984n = set2;
                        this.f4985o = c2409f6;
                        this.f4986p = i6;
                        if (c0711a0.m1209a(c1396x0, this) != enumC1152a2) {
                            List list8 = list4;
                            c2409f2 = c2409f6;
                            c2409f = c2409f5;
                            list = list5;
                            list3 = list8;
                            c2409f3 = c2409f12;
                            c2409f4 = c2409f11;
                            set = set2;
                            C1400z0 c1400z022 = this.f4988r;
                            synchronized (c1400z022.f4997c) {
                            }
                        }
                    }
                }
                return enumC1152a2;
            }
            C2409F c2409f13 = this.f4985o;
            set = this.f4984n;
            c2409f3 = this.f4983m;
            c2409f4 = this.f4982l;
            C2409F c2409f14 = this.f4981k;
            List list9 = this.f4980j;
            list2 = this.f4979i;
            List list10 = this.f4978h;
            C0711a0 c0711a04 = this.f4987q;
            AbstractC1784a.m3205S(obj);
            c2409f6 = c2409f13;
            c0711a0 = c0711a04;
            list4 = list9;
            list5 = list10;
            c2409f5 = c2409f14;
            Set set22 = set;
            C2409F c2409f112 = c2409f4;
            C2409F c2409f122 = c2409f3;
            c1400z0 = this.f4988r;
            C2318C c2318c2 = C1400z0.f4994z;
            if (c1400z0.m2686K()) {
            }
        }
    }
}
