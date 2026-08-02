package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h62 extends tw2 implements nn0 {

    /* JADX INFO: renamed from: l */
    public List f3829l;

    /* JADX INFO: renamed from: m */
    public List f3830m;

    /* JADX INFO: renamed from: n */
    public List f3831n;

    /* JADX INFO: renamed from: o */
    public sk1 f3832o;

    /* JADX INFO: renamed from: p */
    public sk1 f3833p;

    /* JADX INFO: renamed from: q */
    public sk1 f3834q;

    /* JADX INFO: renamed from: r */
    public Set f3835r;

    /* JADX INFO: renamed from: s */
    public sk1 f3836s;

    /* JADX INFO: renamed from: t */
    public int f3837t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ C0880xb f3838u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ i62 f3839v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(i62 i62Var, t00 t00Var) {
        super(3, t00Var);
        this.f3839v = i62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2079t(i62 i62Var, List list, List list2, List list3, sk1 sk1Var, sk1 sk1Var2, sk1 sk1Var3, sk1 sk1Var4) {
        char c;
        long j;
        long j2;
        synchronized (i62Var.f4293c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C0220fy c0220fy = (C0220fy) list3.get(i);
                    c0220fy.m1730a();
                    i62Var.m2292L(c0220fy);
                }
                list3.clear();
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C0220fy c0220fy2 = (C0220fy) objArr[(i2 << 3) + i4];
                                    c0220fy2.m1730a();
                                    i62Var.m2292L(c0220fy2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                sk1Var.m4883b();
                Object[] objArr2 = sk1Var2.f10175b;
                long[] jArr2 = sk1Var2.f10174a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C0220fy) objArr2[(i5 << 3) + i7]).m1736g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                sk1Var2.m4883b();
                sk1Var3.m4883b();
                Object[] objArr3 = sk1Var4.f10175b;
                long[] jArr3 = sk1Var4.f10174a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C0220fy c0220fy3 = (C0220fy) objArr3[(i8 << 3) + i10];
                                    c0220fy3.m1730a();
                                    i62Var.m2292L(c0220fy3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                sk1Var4.m4883b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m2080u(List list, i62 i62Var) {
        list.clear();
        synchronized (i62Var.f4293c) {
            try {
                ArrayList arrayList = i62Var.f4301k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((ui1) arrayList.get(i));
                }
                i62Var.f4301k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        h62 h62Var = new h62(this.f3839v, (t00) obj3);
        h62Var.f3838u = (C0880xb) obj2;
        h62Var.mo7r(a83.f116a);
        return k20.f5323h;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        C0880xb c0880xb;
        sk1 sk1Var;
        sk1 sk1Var2;
        List list;
        Set set;
        List list2;
        sk1 sk1Var3;
        List list3;
        sk1 sk1Var4;
        List list4;
        sk1 sk1Var5;
        List list5;
        sk1 sk1Var6;
        i62 i62Var;
        Object objM3150t;
        C0469mp c0469mp;
        k20 k20Var;
        C0880xb c0880xb2;
        lk1 lk1Var;
        k20 k20Var2 = k20.f5323h;
        int i = this.f3837t;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            fg1.m1627T(obj);
            c0880xb = this.f3838u;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            sk1 sk1Var7 = fd2.f2911a;
            sk1Var = new sk1();
            sk1 sk1Var8 = new sk1();
            sk1 sk1Var9 = new sk1();
            gd2 gd2Var = new gd2(sk1Var9);
            sk1Var2 = new sk1();
            list = arrayList;
            set = gd2Var;
            list2 = arrayList2;
            sk1Var3 = sk1Var9;
            list3 = arrayList3;
            sk1Var4 = sk1Var8;
            synchronized (this.f3839v.f4293c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sk1 sk1Var10 = this.f3836s;
                set = this.f3835r;
                sk1Var3 = this.f3834q;
                sk1Var4 = this.f3833p;
                sk1Var = this.f3832o;
                list3 = this.f3831n;
                list2 = this.f3830m;
                list = this.f3829l;
                C0880xb c0880xb3 = this.f3838u;
                fg1.m1627T(obj);
                sk1Var2 = sk1Var10;
                c0880xb = c0880xb3;
                i62 i62Var2 = this.f3839v;
                synchronized (i62Var2.f4293c) {
                    try {
                        if (i62Var2.f4302l.m4508j()) {
                            lk1 lk1VarM4498b = rj1.m4498b(i62Var2.f4302l);
                            i62Var2.f4302l.m4499a();
                            sz0 sz0Var = i62Var2.f4303m;
                            ((rk1) sz0Var.f10436i).m4499a();
                            ((rk1) sz0Var.f10437j).m4499a();
                            i62Var2.f4305o.m4499a();
                            lk1Var = new lk1(lk1VarM4498b.f6164b);
                            Object[] objArr = lk1VarM4498b.f6163a;
                            int i4 = lk1VarM4498b.f6164b;
                            k20Var = k20Var2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                ui1 ui1Var = (ui1) objArr[i5];
                                lk1Var.m2925a(new ow1(ui1Var, i62Var2.f4304n.m4505g(ui1Var)));
                                i5 = i6 + 1;
                                c0880xb = c0880xb;
                                objArr = objArr;
                            }
                            c0880xb2 = c0880xb;
                            i62Var2.f4304n.m4499a();
                        } else {
                            k20Var = k20Var2;
                            c0880xb2 = c0880xb;
                            lk1Var = js1.f5196b;
                            lk1Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = lk1Var.f6163a;
                int i7 = lk1Var.f6164b;
                for (int i8 = 0; i8 < i7; i8++) {
                    ow1 ow1Var = (ow1) objArr2[i8];
                }
                C0043b5 c0043b5 = this.f3839v.f4292b;
                ((C0885xg) c0043b5.f562i).set(0);
                ((C0093cj) c0043b5.f563j).m832g(new vi1(18));
                k20Var2 = k20Var;
                c0880xb = c0880xb2;
                i2 = 2;
                i3 = 1;
                synchronized (this.f3839v.f4293c) {
                }
                i62 i62Var3 = this.f3839v;
                this.f3838u = c0880xb;
                this.f3829l = list;
                this.f3830m = list2;
                this.f3831n = list3;
                this.f3832o = sk1Var;
                this.f3833p = sk1Var4;
                this.f3834q = sk1Var3;
                this.f3835r = set;
                this.f3836s = sk1Var2;
                this.f3837t = i3;
                if (i62Var3.m2284C()) {
                    objM3150t = a83.f116a;
                } else {
                    C0469mp c0469mp2 = new C0469mp(i3, gf1.m1908z(this));
                    c0469mp2.m3151u();
                    synchronized (i62Var3.f4293c) {
                        if (i62Var3.m2284C()) {
                            c0469mp = c0469mp2;
                        } else {
                            i62Var3.f4308r = c0469mp2;
                            c0469mp = null;
                        }
                    }
                    if (c0469mp != null) {
                        c0469mp.mo2509h(a83.f116a);
                    }
                    objM3150t = c0469mp2.m3150t();
                    if (objM3150t != k20.f5323h) {
                        objM3150t = a83.f116a;
                    }
                }
                if (objM3150t != k20Var2) {
                    List list6 = list;
                    sk1Var5 = sk1Var;
                    sk1Var6 = sk1Var2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    sk1 sk1Var11 = sk1Var4;
                    sk1 sk1Var12 = sk1Var3;
                    i62Var = this.f3839v;
                    ju2 ju2Var = i62.f4290z;
                    if (i62Var.m2291K()) {
                        List list7 = list4;
                        sk1Var2 = sk1Var6;
                        sk1Var = sk1Var5;
                        list = list5;
                        list3 = list7;
                        sk1Var3 = sk1Var12;
                        sk1Var4 = sk1Var11;
                        set = set2;
                        synchronized (this.f3839v.f4293c) {
                        }
                    } else {
                        C0541of c0541of = new C0541of(this.f3839v, sk1Var12, sk1Var6, list5, list2, sk1Var5, list4, sk1Var11, set2);
                        this.f3838u = c0880xb;
                        this.f3829l = list5;
                        this.f3830m = list2;
                        this.f3831n = list4;
                        this.f3832o = sk1Var5;
                        this.f3833p = sk1Var11;
                        this.f3834q = sk1Var12;
                        this.f3835r = set2;
                        this.f3836s = sk1Var6;
                        this.f3837t = i2;
                        if (c0880xb.m6080a(c0541of, this) != k20Var2) {
                            List list8 = list4;
                            sk1Var2 = sk1Var6;
                            sk1Var = sk1Var5;
                            list = list5;
                            list3 = list8;
                            sk1Var3 = sk1Var12;
                            sk1Var4 = sk1Var11;
                            set = set2;
                            i62 i62Var22 = this.f3839v;
                            synchronized (i62Var22.f4293c) {
                            }
                        }
                    }
                }
                return k20Var2;
            }
            sk1 sk1Var13 = this.f3836s;
            set = this.f3835r;
            sk1Var3 = this.f3834q;
            sk1Var4 = this.f3833p;
            sk1 sk1Var14 = this.f3832o;
            List list9 = this.f3831n;
            list2 = this.f3830m;
            List list10 = this.f3829l;
            C0880xb c0880xb4 = this.f3838u;
            fg1.m1627T(obj);
            sk1Var6 = sk1Var13;
            c0880xb = c0880xb4;
            list4 = list9;
            list5 = list10;
            sk1Var5 = sk1Var14;
            Set set22 = set;
            sk1 sk1Var112 = sk1Var4;
            sk1 sk1Var122 = sk1Var3;
            i62Var = this.f3839v;
            ju2 ju2Var2 = i62.f4290z;
            if (i62Var.m2291K()) {
            }
        }
    }
}
