package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends m51 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: h */
    public List f4327h;

    /* JADX INFO: renamed from: i */
    public List f4328i;

    /* JADX INFO: renamed from: j */
    public List f4329j;

    /* JADX INFO: renamed from: k */
    public kh0 f4330k;

    /* JADX INFO: renamed from: l */
    public kh0 f4331l;

    /* JADX INFO: renamed from: m */
    public kh0 f4332m;

    /* JADX INFO: renamed from: n */
    public Set f4333n;

    /* JADX INFO: renamed from: o */
    public kh0 f4334o;

    /* JADX INFO: renamed from: p */
    public int f4335p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ C0715s6 f4336q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ ot0 f4337r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(ot0 ot0Var, InterfaceC0322ik interfaceC0322ik) {
        super(3, interfaceC0322ik);
        this.f4337r = ot0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2738p(ot0 ot0Var, List list, List list2, List list3, kh0 kh0Var, kh0 kh0Var2, kh0 kh0Var3, kh0 kh0Var4) {
        char c;
        long j;
        long j2;
        synchronized (ot0Var.f4633c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C0964yi c0964yi = (C0964yi) list3.get(i);
                    c0964yi.m5260a();
                    ot0Var.m2954L(c0964yi);
                }
                list3.clear();
                Object[] objArr = kh0Var.f3151b;
                long[] jArr = kh0Var.f3150a;
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
                                    C0964yi c0964yi2 = (C0964yi) objArr[(i2 << 3) + i4];
                                    c0964yi2.m5260a();
                                    ot0Var.m2954L(c0964yi2);
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
                kh0Var.m1891b();
                Object[] objArr2 = kh0Var2.f3151b;
                long[] jArr2 = kh0Var2.f3150a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C0964yi) objArr2[(i5 << 3) + i7]).m5266g();
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
                kh0Var2.m1891b();
                kh0Var3.m1891b();
                Object[] objArr3 = kh0Var4.f3151b;
                long[] jArr3 = kh0Var4.f3150a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C0964yi c0964yi3 = (C0964yi) objArr3[(i8 << 3) + i10];
                                    c0964yi3.m5260a();
                                    ot0Var.m2954L(c0964yi3);
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
                kh0Var4.m1891b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m2739q(List list, ot0 ot0Var) {
        list.clear();
        synchronized (ot0Var.f4633c) {
            try {
                ArrayList arrayList = ot0Var.f4641k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((mg0) arrayList.get(i));
                }
                ot0Var.f4641k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        nt0 nt0Var = new nt0(this.f4337r, (InterfaceC0322ik) obj3);
        nt0Var.f4336q = (C0715s6) obj2;
        nt0Var.mo16m(na1.f4229a);
        return EnumC1007zk.f7916d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d8 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        C0715s6 c0715s6;
        kh0 kh0Var;
        kh0 kh0Var2;
        List list;
        Set set;
        final List list2;
        kh0 kh0Var3;
        List list3;
        kh0 kh0Var4;
        final List list4;
        final kh0 kh0Var5;
        final List list5;
        final kh0 kh0Var6;
        ot0 ot0Var;
        Object objM4990t;
        C0884wc c0884wc;
        EnumC1007zk enumC1007zk;
        C0715s6 c0715s62;
        dh0 dh0Var;
        EnumC1007zk enumC1007zk2 = EnumC1007zk.f7916d;
        int i = this.f4335p;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            w60.m4891M(obj);
            c0715s6 = this.f4336q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            kh0 kh0Var7 = ey0.f1546a;
            kh0Var = new kh0();
            kh0 kh0Var8 = new kh0();
            kh0 kh0Var9 = new kh0();
            fy0 fy0Var = new fy0(kh0Var9);
            kh0Var2 = new kh0();
            list = arrayList;
            set = fy0Var;
            list2 = arrayList2;
            kh0Var3 = kh0Var9;
            list3 = arrayList3;
            kh0Var4 = kh0Var8;
            synchronized (this.f4337r.f4633c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kh0 kh0Var10 = this.f4334o;
                set = this.f4333n;
                kh0Var3 = this.f4332m;
                kh0Var4 = this.f4331l;
                kh0Var = this.f4330k;
                list3 = this.f4329j;
                list2 = this.f4328i;
                list = this.f4327h;
                C0715s6 c0715s63 = this.f4336q;
                w60.m4891M(obj);
                kh0Var2 = kh0Var10;
                c0715s6 = c0715s63;
                ot0 ot0Var2 = this.f4337r;
                synchronized (ot0Var2.f4633c) {
                    try {
                        if (ot0Var2.f4642l.m1704j()) {
                            dh0 dh0VarM3251b = qg0.m3251b(ot0Var2.f4642l);
                            ot0Var2.f4642l.m1695a();
                            C0111d c0111d = ot0Var2.f4643m;
                            ((jh0) c0111d.f919e).m1695a();
                            ((jh0) c0111d.f920f).m1695a();
                            ot0Var2.f4645o.m1695a();
                            dh0Var = new dh0(dh0VarM3251b.f1109b);
                            Object[] objArr = dh0VarM3251b.f1108a;
                            int i4 = dh0VarM3251b.f1109b;
                            enumC1007zk = enumC1007zk2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                mg0 mg0Var = (mg0) objArr[i5];
                                dh0Var.m697a(new uo0(mg0Var, ot0Var2.f4644n.m1701g(mg0Var)));
                                i5 = i6 + 1;
                                c0715s6 = c0715s6;
                                objArr = objArr;
                            }
                            c0715s62 = c0715s6;
                            ot0Var2.f4644n.m1695a();
                        } else {
                            enumC1007zk = enumC1007zk2;
                            c0715s62 = c0715s6;
                            dh0Var = kk0.f3183b;
                            dh0Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = dh0Var.f1108a;
                int i7 = dh0Var.f1109b;
                for (int i8 = 0; i8 < i7; i8++) {
                    uo0 uo0Var = (uo0) objArr2[i8];
                }
                C0541o8 c0541o8 = this.f4337r.f4632b;
                ((C0238g9) c0541o8.f4480a).set(0);
                ((C0681r9) c0541o8.f4481b).m3430e(new pg0(2));
                i2 = 2;
                enumC1007zk2 = enumC1007zk;
                c0715s6 = c0715s62;
                i3 = 1;
                synchronized (this.f4337r.f4633c) {
                }
                ot0 ot0Var3 = this.f4337r;
                this.f4336q = c0715s6;
                this.f4327h = list;
                this.f4328i = list2;
                this.f4329j = list3;
                this.f4330k = kh0Var;
                this.f4331l = kh0Var4;
                this.f4332m = kh0Var3;
                this.f4333n = set;
                this.f4334o = kh0Var2;
                this.f4335p = i3;
                if (ot0Var3.m2946C()) {
                    objM4990t = na1.f4229a;
                } else {
                    C0884wc c0884wc2 = new C0884wc(i3, rd0.m3497z(this));
                    c0884wc2.m4992v();
                    synchronized (ot0Var3.f4633c) {
                        if (ot0Var3.m2946C()) {
                            c0884wc = c0884wc2;
                        } else {
                            ot0Var3.f4648r = c0884wc2;
                            c0884wc = null;
                        }
                    }
                    if (c0884wc != null) {
                        c0884wc.mo541i(na1.f4229a);
                    }
                    objM4990t = c0884wc2.m4990t();
                    if (objM4990t != EnumC1007zk.f7916d) {
                        objM4990t = na1.f4229a;
                    }
                }
                if (objM4990t != enumC1007zk2) {
                    List list6 = list;
                    kh0Var5 = kh0Var;
                    kh0Var6 = kh0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final kh0 kh0Var11 = kh0Var4;
                    final kh0 kh0Var12 = kh0Var3;
                    ot0Var = this.f4337r;
                    z31 z31Var = ot0.f4630z;
                    if (ot0Var.m2953K()) {
                        List list7 = list4;
                        kh0Var2 = kh0Var6;
                        kh0Var = kh0Var5;
                        list = list5;
                        list3 = list7;
                        kh0Var3 = kh0Var12;
                        kh0Var4 = kh0Var11;
                        set = set2;
                        synchronized (this.f4337r.f4633c) {
                        }
                    } else {
                        final ot0 ot0Var4 = this.f4337r;
                        InterfaceC0742sw interfaceC0742sw = new InterfaceC0742sw() { // from class: mt0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x01da */
                            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:133:0x01f7 */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
                            /* JADX WARN: Removed duplicated region for block: B:236:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:246:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:269:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
                            /* JADX WARN: Type inference failed for: r11v10 */
                            /* JADX WARN: Type inference failed for: r11v11 */
                            /* JADX WARN: Type inference failed for: r11v2 */
                            /* JADX WARN: Type inference failed for: r11v3, types: [int] */
                            /* JADX WARN: Type inference failed for: r11v4 */
                            /* JADX WARN: Type inference failed for: r11v5, types: [int] */
                            /* JADX WARN: Type inference failed for: r15v10 */
                            /* JADX WARN: Type inference failed for: r15v11 */
                            /* JADX WARN: Type inference failed for: r15v9 */
                            /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
                            /* JADX WARN: Type inference failed for: r4v1 */
                            /* JADX WARN: Type inference failed for: r4v14 */
                            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                            /* JADX WARN: Type inference failed for: r4v3 */
                            /* JADX WARN: Type inference failed for: r4v9 */
                            @Override // p000.InterfaceC0742sw
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                boolean zM2957z;
                                Object[] objArr3;
                                l21 e91Var;
                                l21 l21VarM1969j;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                ?? r15;
                                kh0 kh0Var13;
                                Object[] objArr4;
                                boolean z;
                                ot0 ot0Var5 = ot0Var4;
                                kh0 kh0Var14 = kh0Var12;
                                kh0 kh0Var15 = kh0Var6;
                                List list12 = list5;
                                List list13 = list2;
                                kh0 kh0Var16 = kh0Var5;
                                ?? r4 = list4;
                                kh0 kh0Var17 = kh0Var11;
                                Set set3 = set2;
                                final long jLongValue = ((Long) obj2).longValue();
                                synchronized (ot0Var5.f4633c) {
                                    zM2957z = ot0Var5.m2957z();
                                }
                                boolean z2 = false;
                                if (zM2957z) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((C0681r9) ot0Var5.f4631a.f5657f).m3430e(new InterfaceC0742sw() { // from class: nb
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p000.InterfaceC0742sw
                                            public final Object invoke(Object obj3) {
                                                C0884wc c0884wc3;
                                                Object bv0Var;
                                                long j2 = jLongValue;
                                                C0544ob c0544ob = (C0544ob) obj3;
                                                InterfaceC0742sw interfaceC0742sw2 = c0544ob.f4501b;
                                                if (interfaceC0742sw2 != null && (c0884wc3 = c0544ob.f4500a) != null) {
                                                    try {
                                                        bv0Var = interfaceC0742sw2.invoke(Long.valueOf(j2));
                                                    } catch (Throwable th2) {
                                                        bv0Var = new bv0(th2);
                                                    }
                                                    c0884wc3.mo541i(bv0Var);
                                                }
                                                return na1.f4229a;
                                            }
                                        });
                                        synchronized (t21.f5893c) {
                                            kh0 kh0Var18 = t21.f5900j.f4268h;
                                            if (kh0Var18 != null) {
                                                z = kh0Var18.m1897h();
                                            }
                                        }
                                        if (z) {
                                            t21.m4163a();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    ot0Var5.m2953K();
                                    synchronized (ot0Var5.f4633c) {
                                        try {
                                            sh0 sh0Var = ot0Var5.f4639i;
                                            Object[] objArr5 = sh0Var.f5768d;
                                            int i9 = sh0Var.f5770f;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list12.add((C0964yi) objArr5[i10]);
                                            }
                                            ot0Var5.f4639i.m4077g();
                                        } finally {
                                        }
                                    }
                                    kh0Var14.m1891b();
                                    kh0Var15.m1891b();
                                    try {
                                        try {
                                            while (true) {
                                                if (list12.isEmpty() && list13.isEmpty()) {
                                                    break;
                                                }
                                                try {
                                                    int size = list12.size();
                                                    for (int i11 = 0; i11 < size; i11++) {
                                                        C0964yi c0964yi = (C0964yi) list12.get(i11);
                                                        C0964yi c0964yiM2951I = ot0Var5.m2951I(c0964yi, kh0Var14);
                                                        if (c0964yiM2951I != null) {
                                                            r4.add(c0964yiM2951I);
                                                        }
                                                        kh0Var15.m1890a(c0964yi);
                                                    }
                                                    list12.clear();
                                                    if (kh0Var14.m1897h() || ot0Var5.f4639i.f5770f != 0) {
                                                        synchronized (ot0Var5.f4633c) {
                                                            try {
                                                                List listM2947D = ot0Var5.m2947D();
                                                                int size2 = listM2947D.size();
                                                                for (int i12 = 0; i12 < size2; i12++) {
                                                                    C0964yi c0964yi2 = (C0964yi) listM2947D.get(i12);
                                                                    if (!kh0Var15.m1892c(c0964yi2) && c0964yi2.m5282w(set3)) {
                                                                        list12.add(c0964yi2);
                                                                    }
                                                                }
                                                                sh0 sh0Var2 = ot0Var5.f4639i;
                                                                int i13 = sh0Var2.f5770f;
                                                                int i14 = 0;
                                                                int i15 = 0;
                                                                while (true) {
                                                                    objArr3 = sh0Var2.f5768d;
                                                                    if (i14 >= i13) {
                                                                        break;
                                                                    }
                                                                    C0964yi c0964yi3 = (C0964yi) objArr3[i14];
                                                                    if (!kh0Var15.m1892c(c0964yi3) && !list12.contains(c0964yi3)) {
                                                                        list12.add(c0964yi3);
                                                                        i15++;
                                                                    } else if (i15 > 0) {
                                                                        Object[] objArr6 = sh0Var2.f5768d;
                                                                        objArr6[i14 - i15] = objArr6[i14];
                                                                    }
                                                                    i14++;
                                                                }
                                                                int i16 = i13 - i15;
                                                                Arrays.fill(objArr3, i16, i13, (Object) null);
                                                                sh0Var2.f5770f = i16;
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (list12.isEmpty()) {
                                                        try {
                                                            nt0.m2739q(list13, ot0Var5);
                                                            while (!list13.isEmpty()) {
                                                                List listM2950H = ot0Var5.m2950H(list13, kh0Var14);
                                                                kh0Var16.getClass();
                                                                Iterator it = listM2950H.iterator();
                                                                while (it.hasNext()) {
                                                                    kh0Var16.m1900k(it.next());
                                                                }
                                                                nt0.m2739q(list13, ot0Var5);
                                                            }
                                                        } catch (Throwable th2) {
                                                            ot0Var5.m2952J(th2, null);
                                                            nt0.m2738p(ot0Var5, list12, list13, r4, kh0Var16, kh0Var17, kh0Var14, kh0Var15);
                                                        }
                                                    }
                                                    z2 = false;
                                                } catch (Throwable th3) {
                                                    try {
                                                        ot0Var5.m2952J(th3, null);
                                                        nt0.m2738p(ot0Var5, list12, list13, r4, kh0Var16, kh0Var17, kh0Var14, kh0Var15);
                                                    } finally {
                                                        list12.clear();
                                                    }
                                                }
                                                return na1.f4229a;
                                            }
                                            if (r4.isEmpty()) {
                                                if (kh0Var16.m1897h()) {
                                                }
                                                if (kh0Var17.m1897h()) {
                                                }
                                                e91Var.mo807c();
                                                synchronized (ot0Var5.f4633c) {
                                                }
                                            } else {
                                                try {
                                                    int size3 = r4.size();
                                                    for (?? r11 = z2; r11 < size3; r11++) {
                                                        kh0Var17.m1890a((C0964yi) r4.get(r11));
                                                    }
                                                    int size4 = r4.size();
                                                    for (?? r112 = z2; r112 < size4; r112++) {
                                                        ((C0964yi) r4.get(r112)).m5263d();
                                                    }
                                                    if (kh0Var16.m1897h()) {
                                                        j = 255;
                                                    } else {
                                                        try {
                                                            kh0Var17.m1899j(kh0Var16);
                                                            Object[] objArr7 = kh0Var16.f3151b;
                                                            long[] jArr = kh0Var16.f3150a;
                                                            int length = jArr.length - 2;
                                                            if (length >= 0) {
                                                                int i17 = 0;
                                                                j = 255;
                                                                while (true) {
                                                                    long j2 = jArr[i17];
                                                                    list8 = list12;
                                                                    list9 = list13;
                                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                                            if ((j2 & 255) < 128) {
                                                                                try {
                                                                                    ((C0964yi) objArr7[(i17 << 3) + i19]).m5265f();
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    try {
                                                                                        ot0Var5.m2952J(th, null);
                                                                                        nt0.m2738p(ot0Var5, list8, list9, r4, kh0Var16, kh0Var17, kh0Var14, kh0Var15);
                                                                                        l21.m1966q(l21VarM1969j);
                                                                                        return na1.f4229a;
                                                                                    } finally {
                                                                                        kh0Var16.m1891b();
                                                                                    }
                                                                                }
                                                                            }
                                                                            j2 >>= 8;
                                                                        }
                                                                        if (i18 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i17 == length) {
                                                                            break;
                                                                        }
                                                                        i17++;
                                                                        list12 = list8;
                                                                        list13 = list9;
                                                                    }
                                                                }
                                                            } else {
                                                                list8 = list12;
                                                                list9 = list13;
                                                                j = 255;
                                                            }
                                                            list12 = list8;
                                                            list13 = list9;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            list8 = list12;
                                                            list9 = list13;
                                                        }
                                                    }
                                                    if (kh0Var17.m1897h()) {
                                                        try {
                                                            Object[] objArr8 = kh0Var17.f3151b;
                                                            long[] jArr2 = kh0Var17.f3150a;
                                                            int length2 = jArr2.length - 2;
                                                            if (length2 >= 0) {
                                                                list10 = list12;
                                                                list11 = list13;
                                                                int i20 = 0;
                                                                r4 = r4;
                                                                while (true) {
                                                                    try {
                                                                        long j3 = jArr2[i20];
                                                                        r15 = r4;
                                                                        kh0Var13 = kh0Var16;
                                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                                            int i22 = 0;
                                                                            while (i22 < i21) {
                                                                                if ((j3 & j) < 128) {
                                                                                    try {
                                                                                        ((C0964yi) objArr8[(i20 << 3) + i22]).m5266g();
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        try {
                                                                                            ot0Var5.m2952J(th, null);
                                                                                            nt0.m2738p(ot0Var5, list10, list11, r15, kh0Var13, kh0Var17, kh0Var14, kh0Var15);
                                                                                            return na1.f4229a;
                                                                                        } finally {
                                                                                            kh0Var17.m1891b();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j3 >>= 8;
                                                                                i22++;
                                                                                objArr8 = objArr8;
                                                                            }
                                                                            objArr4 = objArr8;
                                                                            if (i21 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            objArr4 = objArr8;
                                                                        }
                                                                        if (i20 == length2) {
                                                                            break;
                                                                        }
                                                                        i20++;
                                                                        kh0Var16 = kh0Var13;
                                                                        r4 = r15;
                                                                        objArr8 = objArr4;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        r15 = r4;
                                                                        kh0Var13 = kh0Var16;
                                                                        ot0Var5.m2952J(th, null);
                                                                        nt0.m2738p(ot0Var5, list10, list11, r15, kh0Var13, kh0Var17, kh0Var14, kh0Var15);
                                                                        return na1.f4229a;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            list10 = list12;
                                                            list11 = list13;
                                                        }
                                                    }
                                                    e91Var.mo807c();
                                                    synchronized (ot0Var5.f4633c) {
                                                        ot0Var5.m2956y();
                                                    }
                                                    t21.m4172j().mo816m();
                                                    kh0Var15.m1891b();
                                                    kh0Var14.m1891b();
                                                    ot0Var5.f4647q = null;
                                                } catch (Throwable th9) {
                                                    try {
                                                        ot0Var5.m2952J(th9, null);
                                                        nt0.m2738p(ot0Var5, list12, list13, r4, kh0Var16, kh0Var17, kh0Var14, kh0Var15);
                                                        l21.m1966q(l21VarM1969j);
                                                        return na1.f4229a;
                                                    } finally {
                                                        r4.clear();
                                                    }
                                                }
                                            }
                                            return na1.f4229a;
                                        } finally {
                                            l21.m1966q(l21VarM1969j);
                                        }
                                        l21VarM1969j = e91Var.m1969j();
                                    } finally {
                                        e91Var.mo807c();
                                    }
                                    l21 l21VarM4172j = t21.m4172j();
                                    e91Var = l21VarM4172j instanceof nh0 ? new e91((nh0) l21VarM4172j, null, null, true, false) : new f91(l21VarM4172j, null, true, z2);
                                } finally {
                                }
                            }
                        };
                        this.f4336q = c0715s6;
                        this.f4327h = list5;
                        this.f4328i = list2;
                        this.f4329j = list4;
                        this.f4330k = kh0Var5;
                        this.f4331l = kh0Var11;
                        this.f4332m = kh0Var12;
                        this.f4333n = set2;
                        this.f4334o = kh0Var6;
                        this.f4335p = i2;
                        if (c0715s6.m4008c(interfaceC0742sw, this) != enumC1007zk2) {
                            List list8 = list4;
                            kh0Var2 = kh0Var6;
                            kh0Var = kh0Var5;
                            list = list5;
                            list3 = list8;
                            kh0Var3 = kh0Var12;
                            kh0Var4 = kh0Var11;
                            set = set2;
                            ot0 ot0Var22 = this.f4337r;
                            synchronized (ot0Var22.f4633c) {
                            }
                        }
                    }
                }
                return enumC1007zk2;
            }
            kh0 kh0Var13 = this.f4334o;
            set = this.f4333n;
            kh0Var3 = this.f4332m;
            kh0Var4 = this.f4331l;
            kh0 kh0Var14 = this.f4330k;
            List list9 = this.f4329j;
            list2 = this.f4328i;
            List list10 = this.f4327h;
            C0715s6 c0715s64 = this.f4336q;
            w60.m4891M(obj);
            kh0Var6 = kh0Var13;
            c0715s6 = c0715s64;
            list4 = list9;
            list5 = list10;
            kh0Var5 = kh0Var14;
            final Set set22 = set;
            final kh0 kh0Var112 = kh0Var4;
            final kh0 kh0Var122 = kh0Var3;
            ot0Var = this.f4337r;
            z31 z31Var2 = ot0.f4630z;
            if (ot0Var.m2953K()) {
            }
        }
    }
}
