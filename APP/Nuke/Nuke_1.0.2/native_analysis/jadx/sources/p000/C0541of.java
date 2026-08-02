package p000;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0541of implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7650h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f7651i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f7652j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7653k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f7654l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f7655m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f7656n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f7657o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7658p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7659q;

    public /* synthetic */ C0541of(EnumC0578pf enumC0578pf, in0 in0Var, c73 c73Var, LinkedHashMap linkedHashMap, x51 x51Var, LinkedHashMap linkedHashMap2, xk1 xk1Var, String str, C0363ju c0363ju) {
        this.f7651i = enumC0578pf;
        this.f7652j = in0Var;
        this.f7653k = c73Var;
        this.f7654l = linkedHashMap;
        this.f7656n = x51Var;
        this.f7655m = linkedHashMap2;
        this.f7657o = xk1Var;
        this.f7658p = str;
        this.f7659q = c0363ju;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection, java.util.List] */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        boolean zM2295z;
        vr2 vr2Var;
        char c;
        long j;
        boolean z;
        switch (this.f7650h) {
            case 0:
                EnumC0578pf enumC0578pf = (EnumC0578pf) this.f7651i;
                in0 in0Var = (in0) this.f7652j;
                c73 c73Var = (c73) this.f7653k;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7654l;
                x51 x51Var = (x51) this.f7656n;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f7655m;
                xk1 xk1Var = (xk1) this.f7657o;
                String str = (String) this.f7658p;
                C0363ju c0363ju = (C0363ju) this.f7659q;
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.m4760a(s81Var, "theme_mode", new C0402kw(-226335914, true, new b81(enumC0578pf, in0Var, c73Var, linkedHashMap, 2)), 2);
                s81.m4760a(s81Var, "language_mode", new C0402kw(-1482813633, true, new b81(x51Var, in0Var, c73Var, linkedHashMap2, 3)), 2);
                s81.m4760a(s81Var, "click_haptic", new C0402kw(1357828382, true, new C0866x(3, in0Var, c73Var)), 2);
                s81.m4760a(s81Var, "theme_color", new C0402kw(-96496899, true, new C0746tr(2, xk1Var, c0363ju, str)), 2);
                return a83.f116a;
            default:
                i62 i62Var = (i62) this.f7651i;
                sk1 sk1Var = (sk1) this.f7652j;
                sk1 sk1Var2 = (sk1) this.f7653k;
                List list = (List) this.f7654l;
                List list2 = (List) this.f7655m;
                sk1 sk1Var3 = (sk1) this.f7656n;
                ?? r7 = (List) this.f7657o;
                sk1 sk1Var4 = (sk1) this.f7658p;
                Set set = (Set) this.f7659q;
                long jLongValue = ((Long) obj).longValue();
                synchronized (i62Var.f4293c) {
                    zM2295z = i62Var.m2295z();
                }
                boolean z2 = false;
                if (zM2295z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((C0093cj) i62Var.f4291a.f12935j).m832g(new C0082c8(jLongValue, 1));
                        synchronized (ds2.f2181c) {
                            sk1 sk1Var5 = ds2.f2188j.f12560h;
                            if (sk1Var5 != null) {
                                z = sk1Var5.m4889h();
                            }
                        }
                        if (z) {
                            ds2.m1117a();
                        }
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    i62Var.m2291K();
                    synchronized (i62Var.f4293c) {
                        try {
                            zk1 zk1Var = i62Var.f4299i;
                            Object[] objArr = zk1Var.f13934h;
                            int i = zk1Var.f13936j;
                            for (int i2 = 0; i2 < i; i2++) {
                                list.add((C0220fy) objArr[i2]);
                            }
                            i62Var.f4299i.m6428g();
                        } finally {
                        }
                    }
                    sk1Var.m4883b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            vr2 vr2VarM1126j = ds2.m1126j();
                            vr2 a43Var = vr2VarM1126j instanceof wk1 ? new a43((wk1) vr2VarM1126j, null, null, true, false) : new b43(vr2VarM1126j, null, true, z2);
                            try {
                                vr2 vr2VarM5787j = a43Var.m5787j();
                                try {
                                    if (r7.isEmpty()) {
                                        long j2 = 255;
                                        if (sk1Var3.m4889h()) {
                                        }
                                        if (sk1Var4.m4889h()) {
                                        }
                                        vr2.m5784q(vr2Var);
                                        a43Var.mo75c();
                                        synchronized (i62Var.f4293c) {
                                        }
                                    } else {
                                        try {
                                            int size = r7.size();
                                            for (?? r3 = z2; r3 < size; r3++) {
                                                sk1Var4.m4882a((C0220fy) r7.get(r3));
                                            }
                                            int size2 = r7.size();
                                            for (?? r32 = z2; r32 < size2; r32++) {
                                                ((C0220fy) r7.get(r32)).m1733d();
                                            }
                                            long j22 = 255;
                                            try {
                                                if (sk1Var3.m4889h()) {
                                                    vr2Var = vr2VarM5787j;
                                                    c = 7;
                                                    j = 128;
                                                } else {
                                                    try {
                                                        sk1Var4.m4891j(sk1Var3);
                                                        Object[] objArr2 = sk1Var3.f10175b;
                                                        c = 7;
                                                        long[] jArr = sk1Var3.f10174a;
                                                        j = 128;
                                                        int length = jArr.length - 2;
                                                        if (length >= 0) {
                                                            int i3 = 0;
                                                            while (true) {
                                                                int i4 = length;
                                                                long j3 = jArr[i3];
                                                                vr2Var = vr2VarM5787j;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i5 = 8 - ((~(i3 - i4)) >>> 31);
                                                                    for (int i6 = 0; i6 < i5; i6++) {
                                                                        if ((j3 & 255) < 128) {
                                                                            try {
                                                                                ((C0220fy) objArr2[(i3 << 3) + i6]).m1735f();
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                try {
                                                                                    i62Var.m2290J(th, null);
                                                                                    h62.m2079t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                                                    sk1Var3.m4883b();
                                                                                    vr2.m5784q(vr2Var);
                                                                                    return a83.f116a;
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        }
                                                                        j3 >>= 8;
                                                                    }
                                                                    if (i5 == 8) {
                                                                        length = i4;
                                                                        if (i3 != length) {
                                                                            i3++;
                                                                            vr2VarM5787j = vr2Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            vr2Var = vr2VarM5787j;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        vr2Var = vr2VarM5787j;
                                                    }
                                                }
                                                if (sk1Var4.m4889h()) {
                                                    try {
                                                        Object[] objArr3 = sk1Var4.f10175b;
                                                        long[] jArr2 = sk1Var4.f10174a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i7 = 0;
                                                            while (true) {
                                                                long j4 = jArr2[i7];
                                                                Object[] objArr4 = objArr3;
                                                                long[] jArr3 = jArr2;
                                                                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                                                    int i9 = 0;
                                                                    while (i9 < i8) {
                                                                        if ((j4 & j22) < j) {
                                                                            ((C0220fy) objArr4[(i7 << 3) + i9]).m1736g();
                                                                        }
                                                                        j4 >>= 8;
                                                                        i9++;
                                                                        j22 = 255;
                                                                    }
                                                                    if (i8 == 8) {
                                                                    }
                                                                }
                                                                if (i7 != length2) {
                                                                    i7++;
                                                                    objArr3 = objArr4;
                                                                    jArr2 = jArr3;
                                                                    j22 = 255;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        try {
                                                            i62Var.m2290J(th3, null);
                                                            h62.m2079t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                            vr2.m5784q(vr2Var);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                vr2.m5784q(vr2Var);
                                                a43Var.mo75c();
                                                synchronized (i62Var.f4293c) {
                                                    if (i62Var.m2294y() != null) {
                                                        AbstractC0752tx.m5443a("unexpected to get continuation here");
                                                        break;
                                                    }
                                                }
                                                ds2.m1126j().mo84m();
                                                sk1Var2.m4883b();
                                                sk1Var.m4883b();
                                                i62Var.f4307q = null;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                vr2.m5784q(vr2Var);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                i62Var.m2290J(th5, null);
                                                h62.m2079t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                r7.clear();
                                                vr2.m5784q(vr2VarM5787j);
                                                return a83.f116a;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    vr2Var = vr2VarM5787j;
                                    vr2.m5784q(vr2Var);
                                    throw th;
                                }
                            } finally {
                                a43Var.mo75c();
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    C0220fy c0220fy = (C0220fy) list.get(i10);
                                    C0220fy c0220fyM2289I = i62Var.m2289I(c0220fy, sk1Var);
                                    if (c0220fyM2289I != null) {
                                        r7.add(c0220fyM2289I);
                                    }
                                    sk1Var2.m4882a(c0220fy);
                                }
                                list.clear();
                                if (sk1Var.m4889h() || i62Var.f4299i.f13936j != 0) {
                                    synchronized (i62Var.f4293c) {
                                        try {
                                            List listM2285D = i62Var.m2285D();
                                            int size4 = listM2285D.size();
                                            for (int i11 = 0; i11 < size4; i11++) {
                                                C0220fy c0220fy2 = (C0220fy) listM2285D.get(i11);
                                                if (!sk1Var2.m4884c(c0220fy2) && c0220fy2.m1751v(set)) {
                                                    list.add(c0220fy2);
                                                }
                                            }
                                            zk1 zk1Var2 = i62Var.f4299i;
                                            int i12 = zk1Var2.f13936j;
                                            int i13 = 0;
                                            int i14 = 0;
                                            while (true) {
                                                Object[] objArr5 = zk1Var2.f13934h;
                                                if (i13 < i12) {
                                                    C0220fy c0220fy3 = (C0220fy) objArr5[i13];
                                                    if (!sk1Var2.m4884c(c0220fy3) && !list.contains(c0220fy3)) {
                                                        list.add(c0220fy3);
                                                        i14++;
                                                    } else if (i14 > 0) {
                                                        Object[] objArr6 = zk1Var2.f13934h;
                                                        objArr6[i13 - i14] = objArr6[i13];
                                                    }
                                                    i13++;
                                                } else {
                                                    int i15 = i12 - i14;
                                                    Arrays.fill(objArr5, i15, i12, (Object) null);
                                                    zk1Var2.f13936j = i15;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        h62.m2080u(list2, i62Var);
                                        while (!list2.isEmpty()) {
                                            List listM2288H = i62Var.m2288H(list2, sk1Var);
                                            sk1Var3.getClass();
                                            Iterator it = listM2288H.iterator();
                                            while (it.hasNext()) {
                                                sk1Var3.m4892k(it.next());
                                            }
                                            h62.m2080u(list2, i62Var);
                                        }
                                    } catch (Throwable th7) {
                                        i62Var.m2290J(th7, null);
                                        h62.m2079t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                    }
                                    break;
                                }
                                z2 = false;
                            } catch (Throwable th8) {
                                try {
                                    i62Var.m2290J(th8, null);
                                    h62.m2079t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                } finally {
                                }
                            }
                        }
                        return a83.f116a;
                    }
                } finally {
                }
        }
    }

    public /* synthetic */ C0541of(i62 i62Var, sk1 sk1Var, sk1 sk1Var2, List list, List list2, sk1 sk1Var3, List list3, sk1 sk1Var4, Set set) {
        this.f7651i = i62Var;
        this.f7652j = sk1Var;
        this.f7653k = sk1Var2;
        this.f7654l = list;
        this.f7655m = list2;
        this.f7656n = sk1Var3;
        this.f7657o = list3;
        this.f7658p = sk1Var4;
        this.f7659q = set;
    }
}
