package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of implements in0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ of(pf pfVar, in0 in0Var, c73 c73Var, LinkedHashMap linkedHashMap, x51 x51Var, LinkedHashMap linkedHashMap2, xk1 xk1Var, String str, ju juVar) {
        this.i = pfVar;
        this.j = in0Var;
        this.k = c73Var;
        this.l = linkedHashMap;
        this.n = x51Var;
        this.m = linkedHashMap2;
        this.o = xk1Var;
        this.p = str;
        this.q = juVar;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        boolean z;
        vr2 vr2Var;
        char c;
        long j;
        boolean z2;
        switch (this.h) {
            case 0:
                pf pfVar = (pf) this.i;
                in0 in0Var = (in0) this.j;
                c73 c73Var = (c73) this.k;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.l;
                x51 x51Var = (x51) this.n;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.m;
                xk1 xk1Var = (xk1) this.o;
                String str = (String) this.p;
                ju juVar = (ju) this.q;
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.a(s81Var, "theme_mode", new kw(-226335914, true, new b81(pfVar, in0Var, c73Var, linkedHashMap, 2)), 2);
                s81.a(s81Var, "language_mode", new kw(-1482813633, true, new b81(x51Var, in0Var, c73Var, linkedHashMap2, 3)), 2);
                s81.a(s81Var, "click_haptic", new kw(1357828382, true, new x(3, in0Var, c73Var)), 2);
                s81.a(s81Var, "theme_color", new kw(-96496899, true, new tr(2, xk1Var, juVar, str)), 2);
                return a83.a;
            default:
                i62 i62Var = (i62) this.i;
                sk1 sk1Var = (sk1) this.j;
                sk1 sk1Var2 = (sk1) this.k;
                List list = (List) this.l;
                List list2 = (List) this.m;
                sk1 sk1Var3 = (sk1) this.n;
                ?? r7 = (List) this.o;
                sk1 sk1Var4 = (sk1) this.p;
                Set set = (Set) this.q;
                long jLongValue = ((Long) obj).longValue();
                synchronized (i62Var.c) {
                    z = i62Var.z();
                }
                boolean z3 = false;
                if (z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((cj) i62Var.a.j).g(new c8(jLongValue, 1));
                        synchronized (ds2.c) {
                            sk1 sk1Var5 = ds2.j.h;
                            if (sk1Var5 != null) {
                                z2 = sk1Var5.h();
                            }
                        }
                        if (z2) {
                            ds2.a();
                        }
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    i62Var.K();
                    synchronized (i62Var.c) {
                        try {
                            zk1 zk1Var = i62Var.i;
                            Object[] objArr = zk1Var.h;
                            int i = zk1Var.j;
                            for (int i2 = 0; i2 < i; i2++) {
                                list.add((fy) objArr[i2]);
                            }
                            i62Var.i.g();
                        } finally {
                        }
                    }
                    sk1Var.b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            vr2 vr2VarJ = ds2.j();
                            vr2 a43Var = vr2VarJ instanceof wk1 ? new a43((wk1) vr2VarJ, null, null, true, false) : new b43(vr2VarJ, null, true, z3);
                            try {
                                vr2 vr2VarJ2 = a43Var.j();
                                try {
                                    if (r7.isEmpty()) {
                                        long j2 = 255;
                                        if (sk1Var3.h()) {
                                        }
                                        if (sk1Var4.h()) {
                                        }
                                        vr2.q(vr2Var);
                                        a43Var.c();
                                        synchronized (i62Var.c) {
                                        }
                                    } else {
                                        try {
                                            int size = r7.size();
                                            for (?? r3 = z3; r3 < size; r3++) {
                                                sk1Var4.a((fy) r7.get(r3));
                                            }
                                            int size2 = r7.size();
                                            for (?? r32 = z3; r32 < size2; r32++) {
                                                ((fy) r7.get(r32)).d();
                                            }
                                            long j22 = 255;
                                            try {
                                                if (sk1Var3.h()) {
                                                    vr2Var = vr2VarJ2;
                                                    c = 7;
                                                    j = 128;
                                                } else {
                                                    try {
                                                        sk1Var4.j(sk1Var3);
                                                        Object[] objArr2 = sk1Var3.b;
                                                        c = 7;
                                                        long[] jArr = sk1Var3.a;
                                                        j = 128;
                                                        int length = jArr.length - 2;
                                                        if (length >= 0) {
                                                            int i3 = 0;
                                                            while (true) {
                                                                int i4 = length;
                                                                long j3 = jArr[i3];
                                                                vr2Var = vr2VarJ2;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i5 = 8 - ((~(i3 - i4)) >>> 31);
                                                                    for (int i6 = 0; i6 < i5; i6++) {
                                                                        if ((j3 & 255) < 128) {
                                                                            try {
                                                                                ((fy) objArr2[(i3 << 3) + i6]).f();
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                try {
                                                                                    i62Var.J(th, null);
                                                                                    h62.t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                                                    sk1Var3.b();
                                                                                    vr2.q(vr2Var);
                                                                                    return a83.a;
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
                                                                            vr2VarJ2 = vr2Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            vr2Var = vr2VarJ2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        vr2Var = vr2VarJ2;
                                                    }
                                                }
                                                if (sk1Var4.h()) {
                                                    try {
                                                        Object[] objArr3 = sk1Var4.b;
                                                        long[] jArr2 = sk1Var4.a;
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
                                                                            ((fy) objArr4[(i7 << 3) + i9]).g();
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
                                                            i62Var.J(th3, null);
                                                            h62.t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                            vr2.q(vr2Var);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                vr2.q(vr2Var);
                                                a43Var.c();
                                                synchronized (i62Var.c) {
                                                    if (i62Var.y() != null) {
                                                        tx.a("unexpected to get continuation here");
                                                        break;
                                                    }
                                                }
                                                ds2.j().m();
                                                sk1Var2.b();
                                                sk1Var.b();
                                                i62Var.q = null;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                vr2.q(vr2Var);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                i62Var.J(th5, null);
                                                h62.t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                                r7.clear();
                                                vr2.q(vr2VarJ2);
                                                return a83.a;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    vr2Var = vr2VarJ2;
                                    vr2.q(vr2Var);
                                    throw th;
                                }
                            } finally {
                                a43Var.c();
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    fy fyVar = (fy) list.get(i10);
                                    fy fyVarI = i62Var.I(fyVar, sk1Var);
                                    if (fyVarI != null) {
                                        r7.add(fyVarI);
                                    }
                                    sk1Var2.a(fyVar);
                                }
                                list.clear();
                                if (sk1Var.h() || i62Var.i.j != 0) {
                                    synchronized (i62Var.c) {
                                        try {
                                            List listD = i62Var.D();
                                            int size4 = listD.size();
                                            for (int i11 = 0; i11 < size4; i11++) {
                                                fy fyVar2 = (fy) listD.get(i11);
                                                if (!sk1Var2.c(fyVar2) && fyVar2.v(set)) {
                                                    list.add(fyVar2);
                                                }
                                            }
                                            zk1 zk1Var2 = i62Var.i;
                                            int i12 = zk1Var2.j;
                                            int i13 = 0;
                                            int i14 = 0;
                                            while (true) {
                                                Object[] objArr5 = zk1Var2.h;
                                                if (i13 < i12) {
                                                    fy fyVar3 = (fy) objArr5[i13];
                                                    if (!sk1Var2.c(fyVar3) && !list.contains(fyVar3)) {
                                                        list.add(fyVar3);
                                                        i14++;
                                                    } else if (i14 > 0) {
                                                        Object[] objArr6 = zk1Var2.h;
                                                        objArr6[i13 - i14] = objArr6[i13];
                                                    }
                                                    i13++;
                                                } else {
                                                    int i15 = i12 - i14;
                                                    Arrays.fill(objArr5, i15, i12, (Object) null);
                                                    zk1Var2.j = i15;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        h62.u(list2, i62Var);
                                        while (!list2.isEmpty()) {
                                            List listH = i62Var.H(list2, sk1Var);
                                            sk1Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                sk1Var3.k(it.next());
                                            }
                                            h62.u(list2, i62Var);
                                        }
                                    } catch (Throwable th7) {
                                        i62Var.J(th7, null);
                                        h62.t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                    }
                                    break;
                                }
                                z3 = false;
                            } catch (Throwable th8) {
                                try {
                                    i62Var.J(th8, null);
                                    h62.t(i62Var, list, list2, r7, sk1Var3, sk1Var4, sk1Var, sk1Var2);
                                } finally {
                                }
                            }
                        }
                        return a83.a;
                    }
                } finally {
                }
        }
    }

    public /* synthetic */ of(i62 i62Var, sk1 sk1Var, sk1 sk1Var2, List list, List list2, sk1 sk1Var3, List list3, sk1 sk1Var4, Set set) {
        this.i = i62Var;
        this.j = sk1Var;
        this.k = sk1Var2;
        this.l = list;
        this.m = list2;
        this.n = sk1Var3;
        this.o = list3;
        this.p = sk1Var4;
        this.q = set;
    }
}
