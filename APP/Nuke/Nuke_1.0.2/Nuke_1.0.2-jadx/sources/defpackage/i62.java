package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i62 extends yx {
    public final xb a;
    public final b5 b;
    public final Object c;
    public k21 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public sk1 h;
    public final zk1 i;
    public final ArrayList j;
    public final ArrayList k;
    public final rk1 l;
    public final sz0 m;
    public final rk1 n;
    public final rk1 o;
    public ArrayList p;
    public sk1 q;
    public mp r;
    public final ju2 s;
    public boolean t;
    public final ju2 u;
    public final b5 v;
    public final m21 w;
    public final a20 x;
    public final i51 y;
    public static final ju2 z = pp0.f(jz1.k);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i62(a20 a20Var) {
        xb xbVar = new xb(new c62(this, 0));
        this.a = xbVar;
        this.b = new b5(new c62(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new sk1();
        this.i = new zk1(new fy[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new rk1();
        this.m = new sz0(28);
        this.n = new rk1();
        this.o = new rk1();
        this.s = pp0.f(null);
        this.u = pp0.f(f62.j);
        this.v = new b5(29);
        m21 m21Var = new m21((k21) a20Var.o(sn.K));
        m21Var.t(new v(23, this));
        this.w = m21Var;
        this.x = a20Var.k(xbVar).k(m21Var);
        this.y = new i51(16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(ArrayList arrayList, i62 i62Var, fy fyVar) {
        arrayList.clear();
        synchronized (i62Var.c) {
            Iterator it = i62Var.k.iterator();
            if (it.hasNext()) {
                ((ui1) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void w(wk1 wk1Var) {
        try {
            if (wk1Var.w() instanceof xr2) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            wk1Var.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean A() {
        return this.i.j != 0 || z() || B() || this.l.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B() {
        return !this.t && (((xg) ((cj) this.b.j).c).get() & 134217727) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            if (this.h.h() || this.i.j != 0 || z()) {
                z2 = true;
            } else if (!B()) {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? be0.h : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        lp lpVarY;
        synchronized (this.c) {
            lpVarY = y();
            if (((f62) this.u.getValue()).compareTo(f62.i) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (lpVarY != null) {
            ((mp) lpVarY).h(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(fy fyVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((ui1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (((defpackage.ow1) r11.get(r4)).i == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r12 = (defpackage.ow1) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        if (r12.i != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        r12 = (defpackage.ui1) r12.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        defpackage.iu.g0(r3, r18.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        if (((defpackage.ow1) r12).i == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H(List list, sk1 sk1Var) {
        wk1 wk1VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((ui1) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            fy fyVar = (fy) entry.getKey();
            List list2 = (List) entry.getValue();
            if (fyVar.C.F) {
                tx.a("Check failed");
            }
            v vVar = new v(22, fyVar);
            d2 d2Var = new d2(29, fyVar, sk1Var);
            vr2 vr2VarJ = ds2.j();
            wk1 wk1Var = vr2VarJ instanceof wk1 ? (wk1) vr2VarJ : null;
            if (wk1Var == null || (wk1VarC = wk1Var.C(vVar, d2Var)) == null) {
                s.l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                vr2 vr2VarJ2 = wk1VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ui1 ui1Var = (ui1) list2.get(i2);
                                rk1 rk1Var = this.l;
                                ui1Var.getClass();
                                Object objA = rj1.a(rk1Var);
                                arrayList.add(new ow1(ui1Var, objA));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                ow1 ow1Var = (ow1) arrayList.get(i3);
                                if (ow1Var.i == null) {
                                    sz0 sz0Var = this.m;
                                    ((ui1) ow1Var.h).getClass();
                                    if (((rk1) sz0Var.i).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            ow1 ow1Var2 = (ow1) arrayList.get(i4);
                                            if (ow1Var2.i == null) {
                                                sz0 sz0Var2 = this.m;
                                                ((ui1) ow1Var2.h).getClass();
                                                rk1 rk1Var2 = (rk1) sz0Var2.i;
                                                if (rk1Var2.i()) {
                                                    ((rk1) sz0Var2.j).a();
                                                }
                                            }
                                            arrayList3.add(ow1Var2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((ow1) arrayList.get(i5)).i != null) {
                            break;
                        }
                        i5++;
                    }
                    fyVar.r(arrayList);
                    vr2.q(vr2VarJ2);
                } catch (Throwable th) {
                    vr2.q(vr2VarJ2);
                    throw th;
                }
            } finally {
                w(wk1VarC);
            }
        }
        return du.F0(map.keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fy I(fy fyVar, sk1 sk1Var) {
        wk1 wk1VarC;
        if (fyVar.C.F || fyVar.D == 3) {
            return null;
        }
        sk1 sk1Var2 = this.q;
        if (sk1Var2 == null || !sk1Var2.c(fyVar)) {
            v vVar = new v(22, fyVar);
            d2 d2Var = new d2(29, fyVar, sk1Var);
            vr2 vr2VarJ = ds2.j();
            wk1 wk1Var = vr2VarJ instanceof wk1 ? (wk1) vr2VarJ : null;
            if (wk1Var == null || (wk1VarC = wk1Var.C(vVar, d2Var)) == null) {
                s.l("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    vr2 vr2VarJ2 = wk1VarC.j();
                    if (sk1Var != null) {
                        try {
                            if (sk1Var.h()) {
                                r1 r1Var = new r1(27, sk1Var, fyVar);
                                go0 go0Var = fyVar.C;
                                if (go0Var.F) {
                                    tx.a("Preparing a composition while composing is not supported");
                                }
                                go0Var.F = true;
                                try {
                                    r1Var.a();
                                    go0Var.F = false;
                                } catch (Throwable th) {
                                    go0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            vr2.q(vr2VarJ2);
                            throw th2;
                        }
                    }
                    boolean zW = fyVar.w();
                    vr2.q(vr2VarJ2);
                    if (zW) {
                        return fyVar;
                    }
                } finally {
                    w(wk1VarC);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(Throwable th, fy fyVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof zw)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                e62 e62Var = (e62) this.s.getValue();
                if (e62Var != null) {
                    throw e62Var.a;
                }
                ju2 ju2Var = this.s;
                e62 e62Var2 = new e62(th);
                ju2Var.getClass();
                ju2Var.h(null, e62Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new sk1();
                this.k.clear();
                this.l.a();
                this.n.a();
                ju2 ju2Var2 = this.s;
                e62 e62Var3 = new e62(th);
                ju2Var2.getClass();
                ju2Var2.h(null, e62Var3);
                if (fyVar != null) {
                    L(fyVar);
                }
                if (y() != null) {
                    tx.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            gd2 gd2Var = new gd2(this.h);
            this.h = new sk1();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((fy) listD.get(i)).x(gd2Var);
                    if (((f62) this.u.getValue()).compareTo(f62.i) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    sk1 sk1Var = this.h;
                    sk1Var.getClass();
                    Iterator<E> it = gd2Var.iterator();
                    while (it.hasNext()) {
                        sk1Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(fy fyVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(fyVar)) {
            arrayList.add(fyVar);
        }
        if (this.f.remove(fyVar)) {
            this.g = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void a(fy fyVar, mn0 mn0Var) throws Throwable {
        f62 f62Var;
        boolean zContains;
        wk1 wk1VarC;
        boolean z2 = fyVar.C.F;
        synchronized (this.c) {
            f62 f62Var2 = (f62) this.u.getValue();
            f62Var = f62.i;
            zContains = f62Var2.compareTo(f62Var) > 0 ? true ^ D().contains(fyVar) : true;
        }
        try {
            v vVar = new v(22, fyVar);
            d2 d2Var = new d2(29, fyVar, null);
            vr2 vr2VarJ = ds2.j();
            wk1 wk1Var = vr2VarJ instanceof wk1 ? (wk1) vr2VarJ : null;
            if (wk1Var == null || (wk1VarC = wk1Var.C(vVar, d2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                vr2 vr2VarJ2 = wk1VarC.j();
                try {
                    fyVar.j(mn0Var);
                    synchronized (this.c) {
                        if (((f62) this.u.getValue()).compareTo(f62Var) > 0 && !D().contains(fyVar)) {
                            this.f.add(fyVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        ds2.j().m();
                    }
                    try {
                        F(fyVar);
                        try {
                            fyVar.d();
                            fyVar.f();
                            if (z2) {
                                return;
                            }
                            ds2.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, fyVar);
                    }
                } finally {
                    vr2.q(vr2VarJ2);
                }
            } finally {
                w(wk1VarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th3, fyVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final sk1 b(fy fyVar, sq2 sq2Var, mn0 mn0Var) {
        b5 b5Var = this.v;
        try {
            sq2 sq2Var2 = fyVar.w;
            fyVar.w = sq2Var;
            try {
                a(fyVar, mn0Var);
                sk1 sk1Var = (sk1) b5Var.p();
                if (sk1Var == null) {
                    sk1Var = fd2.a;
                    sk1Var.getClass();
                }
                return sk1Var;
            } finally {
                fyVar.w = sq2Var2;
            }
        } finally {
            b5Var.A(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final long g() {
        return 1000L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final xx h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final a20 j() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void l(fy fyVar) {
        lp lpVarY;
        synchronized (this.c) {
            if (this.i.h(fyVar)) {
                lpVarY = null;
            } else {
                this.i.b(fyVar);
                lpVarY = y();
            }
        }
        if (lpVarY != null) {
            ((mp) lpVarY).h(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final ti1 m(ui1 ui1Var) {
        ti1 ti1Var;
        synchronized (this.c) {
            ti1Var = (ti1) this.n.k(ui1Var);
        }
        return ti1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final sk1 n(fy fyVar, sq2 sq2Var, sk1 sk1Var) {
        b5 b5Var = this.v;
        try {
            K();
            fyVar.x(new gd2(sk1Var));
            sq2 sq2Var2 = fyVar.w;
            fyVar.w = sq2Var;
            try {
                fy fyVarI = I(fyVar, null);
                if (fyVarI != null) {
                    F(fyVar);
                    fyVarI.d();
                    fyVarI.f();
                }
                sk1 sk1Var2 = (sk1) b5Var.p();
                if (sk1Var2 == null) {
                    sk1Var2 = fd2.a;
                    sk1Var2.getClass();
                }
                return sk1Var2;
            } finally {
                fyVar.w = sq2Var2;
            }
        } finally {
            b5Var.A(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void q(b62 b62Var) {
        b5 b5Var = this.v;
        sk1 sk1Var = (sk1) b5Var.p();
        if (sk1Var == null) {
            sk1 sk1Var2 = fd2.a;
            sk1Var = new sk1();
            b5Var.A(sk1Var);
        }
        sk1Var.a(b62Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void r(fy fyVar) {
        synchronized (this.c) {
            try {
                sk1 sk1Var = this.q;
                if (sk1Var == null) {
                    sk1 sk1Var2 = fd2.a;
                    sk1Var = new sk1();
                    this.q = sk1Var;
                }
                sk1Var.a(fyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final np s(ea eaVar) {
        b5 b5Var = this.b;
        cj cjVar = (cj) b5Var.j;
        qn1 qn1Var = new qn1();
        qn1Var.a = eaVar;
        return cjVar.d(qn1Var, (r1) b5Var.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void v(fy fyVar) {
        synchronized (this.c) {
            if (this.f.remove(fyVar)) {
                this.g = null;
            }
            this.i.j(fyVar);
            this.j.remove(fyVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() {
        synchronized (this.c) {
            if (((f62) this.u.getValue()).compareTo(f62.l) >= 0) {
                ju2 ju2Var = this.u;
                f62 f62Var = f62.i;
                ju2Var.getClass();
                ju2Var.h(null, f62Var);
            }
        }
        this.w.c(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lp y() throws j90 {
        ju2 ju2Var = this.u;
        int iCompareTo = ((f62) ju2Var.getValue()).compareTo(f62.i);
        ju2 ju2Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        zk1 zk1Var = this.i;
        if (iCompareTo > 0) {
            Object value = ju2Var2.getValue();
            f62 f62Var = f62.m;
            f62 f62Var2 = f62.j;
            if (value == null) {
                if (this.d == null) {
                    this.h = new sk1();
                    zk1Var.g();
                    if (z() || B()) {
                        f62Var2 = f62.k;
                    }
                } else {
                    f62Var2 = (zk1Var.j != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? f62Var : f62.l;
                }
            }
            ju2Var.h(null, f62Var2);
            if (f62Var2 != f62Var) {
                return null;
            }
            mp mpVar = this.r;
            this.r = null;
            return mpVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = be0.h;
        this.h = new sk1();
        zk1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        mp mpVar2 = this.r;
        if (mpVar2 != null) {
            mpVar2.n(null);
        }
        this.r = null;
        ju2Var2.g(null);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z() {
        return !this.t && (((xg) ((cj) this.a.j).c).get() & 134217727) > 0;
    }

    @Override // defpackage.yx
    public final void o(Set set) {
    }
}
