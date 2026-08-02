package p000;

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
public final class i62 extends AbstractC0941yx {

    /* JADX INFO: renamed from: a */
    public final C0880xb f4291a;

    /* JADX INFO: renamed from: b */
    public final C0043b5 f4292b;

    /* JADX INFO: renamed from: c */
    public final Object f4293c;

    /* JADX INFO: renamed from: d */
    public k21 f4294d;

    /* JADX INFO: renamed from: e */
    public Throwable f4295e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4296f;

    /* JADX INFO: renamed from: g */
    public List f4297g;

    /* JADX INFO: renamed from: h */
    public sk1 f4298h;

    /* JADX INFO: renamed from: i */
    public final zk1 f4299i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f4300j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4301k;

    /* JADX INFO: renamed from: l */
    public final rk1 f4302l;

    /* JADX INFO: renamed from: m */
    public final sz0 f4303m;

    /* JADX INFO: renamed from: n */
    public final rk1 f4304n;

    /* JADX INFO: renamed from: o */
    public final rk1 f4305o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4306p;

    /* JADX INFO: renamed from: q */
    public sk1 f4307q;

    /* JADX INFO: renamed from: r */
    public C0469mp f4308r;

    /* JADX INFO: renamed from: s */
    public final ju2 f4309s;

    /* JADX INFO: renamed from: t */
    public boolean f4310t;

    /* JADX INFO: renamed from: u */
    public final ju2 f4311u;

    /* JADX INFO: renamed from: v */
    public final C0043b5 f4312v;

    /* JADX INFO: renamed from: w */
    public final m21 f4313w;

    /* JADX INFO: renamed from: x */
    public final a20 f4314x;

    /* JADX INFO: renamed from: y */
    public final i51 f4315y;

    /* JADX INFO: renamed from: z */
    public static final ju2 f4290z = pp0.m3908f(jz1.f5285k);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f4289A = new AtomicReference(Boolean.FALSE);

    public i62(a20 a20Var) {
        C0880xb c0880xb = new C0880xb(new c62(this, 0));
        this.f4291a = c0880xb;
        this.f4292b = new C0043b5(new c62(this, 1));
        this.f4293c = new Object();
        this.f4296f = new ArrayList();
        this.f4298h = new sk1();
        this.f4299i = new zk1(new C0220fy[16]);
        this.f4300j = new ArrayList();
        this.f4301k = new ArrayList();
        this.f4302l = new rk1();
        this.f4303m = new sz0(28);
        this.f4304n = new rk1();
        this.f4305o = new rk1();
        this.f4309s = pp0.m3908f(null);
        this.f4311u = pp0.m3908f(f62.f2818j);
        this.f4312v = new C0043b5(29);
        m21 m21Var = new m21((k21) a20Var.mo15o(C0700sn.f10207K));
        m21Var.mo1707t(new C0792v(23, this));
        this.f4313w = m21Var;
        this.f4314x = a20Var.mo14k(c0880xb).mo14k(m21Var);
        this.f4315y = new i51(16);
    }

    /* JADX INFO: renamed from: G */
    public static final void m2280G(ArrayList arrayList, i62 i62Var, C0220fy c0220fy) {
        arrayList.clear();
        synchronized (i62Var.f4293c) {
            Iterator it = i62Var.f4301k.iterator();
            if (it.hasNext()) {
                ((ui1) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2281w(wk1 wk1Var) {
        try {
            if (wk1Var.mo90w() instanceof xr2) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            wk1Var.mo75c();
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2282A() {
        return this.f4299i.f13936j != 0 || m2295z() || m2283B() || this.f4302l.m4508j();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2283B() {
        return !this.f4310t && (((C0885xg) ((C0093cj) this.f4292b.f563j).f1581c).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2284C() {
        boolean z;
        synchronized (this.f4293c) {
            if (this.f4298h.m4889h() || this.f4299i.f13936j != 0 || m2295z()) {
                z = true;
            } else if (!m2283B()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: D */
    public final List m2285D() {
        List list = this.f4297g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f4296f;
        List arrayList2 = arrayList.isEmpty() ? be0.f819h : new ArrayList(arrayList);
        this.f4297g = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: E */
    public final void m2286E() {
        InterfaceC0432lp interfaceC0432lpM2294y;
        synchronized (this.f4293c) {
            interfaceC0432lpM2294y = m2294y();
            if (((f62) this.f4311u.getValue()).compareTo(f62.f2817i) <= 0) {
                Throwable th = this.f4295e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (interfaceC0432lpM2294y != null) {
            ((C0469mp) interfaceC0432lpM2294y).mo2509h(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2287F(C0220fy c0220fy) {
        synchronized (this.f4293c) {
            ArrayList arrayList = this.f4301k;
            if (arrayList.size() > 0) {
                ((ui1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (((p000.ow1) r11.get(r4)).f7863i == null) goto L116;
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
    
        r12 = (p000.ow1) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        if (r12.f7863i != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        r12 = (p000.ui1) r12.f7862h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r4 = r18.f4293c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        p000.AbstractC0325iu.m2393g0(r3, r18.f4301k);
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
    
        if (((p000.ow1) r12).f7863i == null) goto L122;
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
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2288H(List list, sk1 sk1Var) {
        wk1 wk1VarMo73C;
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
            C0220fy c0220fy = (C0220fy) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0220fy.f3174C.f3600F) {
                AbstractC0752tx.m5443a("Check failed");
            }
            C0792v c0792v = new C0792v(22, c0220fy);
            C0115d2 c0115d2 = new C0115d2(29, c0220fy, sk1Var);
            vr2 vr2VarM1126j = ds2.m1126j();
            wk1 wk1Var = vr2VarM1126j instanceof wk1 ? (wk1) vr2VarM1126j : null;
            if (wk1Var == null || (wk1VarMo73C = wk1Var.mo73C(c0792v, c0115d2)) == null) {
                C0676s.m4653l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                vr2 vr2VarM5787j = wk1VarMo73C.m5787j();
                try {
                    synchronized (this.f4293c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ui1 ui1Var = (ui1) list2.get(i2);
                                rk1 rk1Var = this.f4302l;
                                ui1Var.getClass();
                                Object objM4497a = rj1.m4497a(rk1Var);
                                arrayList.add(new ow1(ui1Var, objM4497a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                ow1 ow1Var = (ow1) arrayList.get(i3);
                                if (ow1Var.f7863i == null) {
                                    sz0 sz0Var = this.f4303m;
                                    ((ui1) ow1Var.f7862h).getClass();
                                    if (((rk1) sz0Var.f10436i).m4500b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            ow1 ow1Var2 = (ow1) arrayList.get(i4);
                                            if (ow1Var2.f7863i == null) {
                                                sz0 sz0Var2 = this.f4303m;
                                                ((ui1) ow1Var2.f7862h).getClass();
                                                rk1 rk1Var2 = (rk1) sz0Var2.f10436i;
                                                if (rk1Var2.m4507i()) {
                                                    ((rk1) sz0Var2.f10437j).m4499a();
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
                        if (((ow1) arrayList.get(i5)).f7863i != null) {
                            break;
                        }
                        i5++;
                    }
                    c0220fy.m1747r(arrayList);
                    vr2.m5784q(vr2VarM5787j);
                } catch (Throwable th) {
                    vr2.m5784q(vr2VarM5787j);
                    throw th;
                }
            } finally {
                m2281w(wk1VarMo73C);
            }
        }
        return AbstractC0142du.m1148F0(map.keySet());
    }

    /* JADX INFO: renamed from: I */
    public final C0220fy m2289I(C0220fy c0220fy, sk1 sk1Var) {
        wk1 wk1VarMo73C;
        if (c0220fy.f3174C.f3600F || c0220fy.f3175D == 3) {
            return null;
        }
        sk1 sk1Var2 = this.f4307q;
        if (sk1Var2 == null || !sk1Var2.m4884c(c0220fy)) {
            C0792v c0792v = new C0792v(22, c0220fy);
            C0115d2 c0115d2 = new C0115d2(29, c0220fy, sk1Var);
            vr2 vr2VarM1126j = ds2.m1126j();
            wk1 wk1Var = vr2VarM1126j instanceof wk1 ? (wk1) vr2VarM1126j : null;
            if (wk1Var == null || (wk1VarMo73C = wk1Var.mo73C(c0792v, c0115d2)) == null) {
                C0676s.m4653l("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    vr2 vr2VarM5787j = wk1VarMo73C.m5787j();
                    if (sk1Var != null) {
                        try {
                            if (sk1Var.m4889h()) {
                                C0640r1 c0640r1 = new C0640r1(27, sk1Var, c0220fy);
                                go0 go0Var = c0220fy.f3174C;
                                if (go0Var.f3600F) {
                                    AbstractC0752tx.m5443a("Preparing a composition while composing is not supported");
                                }
                                go0Var.f3600F = true;
                                try {
                                    c0640r1.mo6a();
                                    go0Var.f3600F = false;
                                } catch (Throwable th) {
                                    go0Var.f3600F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            vr2.m5784q(vr2VarM5787j);
                            throw th2;
                        }
                    }
                    boolean zM1752w = c0220fy.m1752w();
                    vr2.m5784q(vr2VarM5787j);
                    if (zM1752w) {
                        return c0220fy;
                    }
                } finally {
                    m2281w(wk1VarMo73C);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m2290J(Throwable th, C0220fy c0220fy) throws Throwable {
        if (!((Boolean) f4289A.get()).booleanValue() || (th instanceof C0977zw)) {
            synchronized (this.f4293c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                e62 e62Var = (e62) this.f4309s.getValue();
                if (e62Var != null) {
                    throw e62Var.f2328a;
                }
                ju2 ju2Var = this.f4309s;
                e62 e62Var2 = new e62(th);
                ju2Var.getClass();
                ju2Var.m2576h(null, e62Var2);
            }
            throw th;
        }
        synchronized (this.f4293c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4300j.clear();
                this.f4299i.m6428g();
                this.f4298h = new sk1();
                this.f4301k.clear();
                this.f4302l.m4499a();
                this.f4304n.m4499a();
                ju2 ju2Var2 = this.f4309s;
                e62 e62Var3 = new e62(th);
                ju2Var2.getClass();
                ju2Var2.m2576h(null, e62Var3);
                if (c0220fy != null) {
                    m2292L(c0220fy);
                }
                if (m2294y() != null) {
                    AbstractC0752tx.m5443a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m2291K() {
        boolean zM2282A;
        synchronized (this.f4293c) {
            if (this.f4298h.m4888g()) {
                return m2282A();
            }
            List listM2285D = m2285D();
            gd2 gd2Var = new gd2(this.f4298h);
            this.f4298h = new sk1();
            try {
                int size = listM2285D.size();
                for (int i = 0; i < size; i++) {
                    ((C0220fy) listM2285D.get(i)).m1753x(gd2Var);
                    if (((f62) this.f4311u.getValue()).compareTo(f62.f2817i) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4293c) {
                    if (m2294y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM2282A = m2282A();
                }
                return zM2282A;
            } catch (Throwable th) {
                synchronized (this.f4293c) {
                    sk1 sk1Var = this.f4298h;
                    sk1Var.getClass();
                    Iterator<E> it = gd2Var.iterator();
                    while (it.hasNext()) {
                        sk1Var.m4892k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2292L(C0220fy c0220fy) {
        ArrayList arrayList = this.f4306p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4306p = arrayList;
        }
        if (!arrayList.contains(c0220fy)) {
            arrayList.add(c0220fy);
        }
        if (this.f4296f.remove(c0220fy)) {
            this.f4297g = null;
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: a */
    public final void mo1375a(C0220fy c0220fy, mn0 mn0Var) throws Throwable {
        f62 f62Var;
        boolean zContains;
        wk1 wk1VarMo73C;
        boolean z = c0220fy.f3174C.f3600F;
        synchronized (this.f4293c) {
            f62 f62Var2 = (f62) this.f4311u.getValue();
            f62Var = f62.f2817i;
            zContains = f62Var2.compareTo(f62Var) > 0 ? true ^ m2285D().contains(c0220fy) : true;
        }
        try {
            C0792v c0792v = new C0792v(22, c0220fy);
            C0115d2 c0115d2 = new C0115d2(29, c0220fy, null);
            vr2 vr2VarM1126j = ds2.m1126j();
            wk1 wk1Var = vr2VarM1126j instanceof wk1 ? (wk1) vr2VarM1126j : null;
            if (wk1Var == null || (wk1VarMo73C = wk1Var.mo73C(c0792v, c0115d2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                vr2 vr2VarM5787j = wk1VarMo73C.m5787j();
                try {
                    c0220fy.m1739j(mn0Var);
                    synchronized (this.f4293c) {
                        if (((f62) this.f4311u.getValue()).compareTo(f62Var) > 0 && !m2285D().contains(c0220fy)) {
                            this.f4296f.add(c0220fy);
                            this.f4297g = null;
                        }
                    }
                    if (!z) {
                        ds2.m1126j().mo84m();
                    }
                    try {
                        m2287F(c0220fy);
                        try {
                            c0220fy.m1733d();
                            c0220fy.m1735f();
                            if (z) {
                                return;
                            }
                            ds2.m1126j().mo84m();
                        } catch (Throwable th) {
                            m2290J(th, null);
                        }
                    } catch (Throwable th2) {
                        m2290J(th2, c0220fy);
                    }
                } finally {
                    vr2.m5784q(vr2VarM5787j);
                }
            } finally {
                m2281w(wk1VarMo73C);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f4293c) {
                }
            }
            m2290J(th3, c0220fy);
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: b */
    public final sk1 mo1376b(C0220fy c0220fy, sq2 sq2Var, mn0 mn0Var) {
        C0043b5 c0043b5 = this.f4312v;
        try {
            sq2 sq2Var2 = c0220fy.f3191w;
            c0220fy.f3191w = sq2Var;
            try {
                mo1375a(c0220fy, mn0Var);
                sk1 sk1Var = (sk1) c0043b5.m429p();
                if (sk1Var == null) {
                    sk1Var = fd2.f2911a;
                    sk1Var.getClass();
                }
                return sk1Var;
            } finally {
                c0220fy.f3191w = sq2Var2;
            }
        } finally {
            c0043b5.m410A(null);
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: d */
    public final boolean mo1378d() {
        return ((Boolean) f4289A.get()).booleanValue();
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: e */
    public final boolean mo1379e() {
        return false;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: f */
    public final boolean mo1380f() {
        return false;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: g */
    public final long mo1381g() {
        return 1000L;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: h */
    public final InterfaceC0902xx mo1382h() {
        return null;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: j */
    public final a20 mo1384j() {
        return this.f4314x;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: k */
    public final boolean mo1385k() {
        return false;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: l */
    public final void mo1386l(C0220fy c0220fy) {
        InterfaceC0432lp interfaceC0432lpM2294y;
        synchronized (this.f4293c) {
            if (this.f4299i.m6429h(c0220fy)) {
                interfaceC0432lpM2294y = null;
            } else {
                this.f4299i.m6423b(c0220fy);
                interfaceC0432lpM2294y = m2294y();
            }
        }
        if (interfaceC0432lpM2294y != null) {
            ((C0469mp) interfaceC0432lpM2294y).mo2509h(a83.f116a);
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: m */
    public final ti1 mo1387m(ui1 ui1Var) {
        ti1 ti1Var;
        synchronized (this.f4293c) {
            ti1Var = (ti1) this.f4304n.m4509k(ui1Var);
        }
        return ti1Var;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: n */
    public final sk1 mo1388n(C0220fy c0220fy, sq2 sq2Var, sk1 sk1Var) {
        C0043b5 c0043b5 = this.f4312v;
        try {
            m2291K();
            c0220fy.m1753x(new gd2(sk1Var));
            sq2 sq2Var2 = c0220fy.f3191w;
            c0220fy.f3191w = sq2Var;
            try {
                C0220fy c0220fyM2289I = m2289I(c0220fy, null);
                if (c0220fyM2289I != null) {
                    m2287F(c0220fy);
                    c0220fyM2289I.m1733d();
                    c0220fyM2289I.m1735f();
                }
                sk1 sk1Var2 = (sk1) c0043b5.m429p();
                if (sk1Var2 == null) {
                    sk1Var2 = fd2.f2911a;
                    sk1Var2.getClass();
                }
                return sk1Var2;
            } finally {
                c0220fy.f3191w = sq2Var2;
            }
        } finally {
            c0043b5.m410A(null);
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: q */
    public final void mo1391q(b62 b62Var) {
        C0043b5 c0043b5 = this.f4312v;
        sk1 sk1Var = (sk1) c0043b5.m429p();
        if (sk1Var == null) {
            sk1 sk1Var2 = fd2.f2911a;
            sk1Var = new sk1();
            c0043b5.m410A(sk1Var);
        }
        sk1Var.m4882a(b62Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: r */
    public final void mo1392r(C0220fy c0220fy) {
        synchronized (this.f4293c) {
            try {
                sk1 sk1Var = this.f4307q;
                if (sk1Var == null) {
                    sk1 sk1Var2 = fd2.f2911a;
                    sk1Var = new sk1();
                    this.f4307q = sk1Var;
                }
                sk1Var.m4882a(c0220fy);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: s */
    public final InterfaceC0508np mo1393s(C0159ea c0159ea) {
        C0043b5 c0043b5 = this.f4292b;
        C0093cj c0093cj = (C0093cj) c0043b5.f563j;
        qn1 qn1Var = new qn1();
        qn1Var.f9046a = c0159ea;
        return c0093cj.m829d(qn1Var, (C0640r1) c0043b5.f564k);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: v */
    public final void mo1396v(C0220fy c0220fy) {
        synchronized (this.f4293c) {
            if (this.f4296f.remove(c0220fy)) {
                this.f4297g = null;
            }
            this.f4299i.m6431j(c0220fy);
            this.f4300j.remove(c0220fy);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2293x() {
        synchronized (this.f4293c) {
            if (((f62) this.f4311u.getValue()).compareTo(f62.f2820l) >= 0) {
                ju2 ju2Var = this.f4311u;
                f62 f62Var = f62.f2817i;
                ju2Var.getClass();
                ju2Var.m2576h(null, f62Var);
            }
        }
        this.f4313w.mo1704c(null);
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC0432lp m2294y() throws j90 {
        ju2 ju2Var = this.f4311u;
        int iCompareTo = ((f62) ju2Var.getValue()).compareTo(f62.f2817i);
        ju2 ju2Var2 = this.f4309s;
        ArrayList arrayList = this.f4301k;
        ArrayList arrayList2 = this.f4300j;
        zk1 zk1Var = this.f4299i;
        if (iCompareTo > 0) {
            Object value = ju2Var2.getValue();
            f62 f62Var = f62.f2821m;
            f62 f62Var2 = f62.f2818j;
            if (value == null) {
                if (this.f4294d == null) {
                    this.f4298h = new sk1();
                    zk1Var.m6428g();
                    if (m2295z() || m2283B()) {
                        f62Var2 = f62.f2819k;
                    }
                } else {
                    f62Var2 = (zk1Var.f13936j != 0 || this.f4298h.m4889h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m2295z() || m2283B() || this.f4302l.m4508j()) ? f62Var : f62.f2820l;
                }
            }
            ju2Var.m2576h(null, f62Var2);
            if (f62Var2 != f62Var) {
                return null;
            }
            C0469mp c0469mp = this.f4308r;
            this.f4308r = null;
            return c0469mp;
        }
        List listM2285D = m2285D();
        int size = listM2285D.size();
        for (int i = 0; i < size; i++) {
        }
        this.f4296f.clear();
        this.f4297g = be0.f819h;
        this.f4298h = new sk1();
        zk1Var.m6428g();
        arrayList2.clear();
        arrayList.clear();
        this.f4306p = null;
        C0469mp c0469mp2 = this.f4308r;
        if (c0469mp2 != null) {
            c0469mp2.mo2512n(null);
        }
        this.f4308r = null;
        ju2Var2.m2575g(null);
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2295z() {
        return !this.f4310t && (((C0885xg) ((C0093cj) this.f4291a.f12935j).f1581c).get() & 134217727) > 0;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: o */
    public final void mo1389o(Set set) {
    }
}
