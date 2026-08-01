package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ot0 extends AbstractC0727si {

    /* JADX INFO: renamed from: a */
    public final C0715s6 f4631a;

    /* JADX INFO: renamed from: b */
    public final C0541o8 f4632b;

    /* JADX INFO: renamed from: c */
    public final Object f4633c;

    /* JADX INFO: renamed from: d */
    public c40 f4634d;

    /* JADX INFO: renamed from: e */
    public Throwable f4635e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4636f;

    /* JADX INFO: renamed from: g */
    public List f4637g;

    /* JADX INFO: renamed from: h */
    public kh0 f4638h;

    /* JADX INFO: renamed from: i */
    public final sh0 f4639i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f4640j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4641k;

    /* JADX INFO: renamed from: l */
    public final jh0 f4642l;

    /* JADX INFO: renamed from: m */
    public final C0111d f4643m;

    /* JADX INFO: renamed from: n */
    public final jh0 f4644n;

    /* JADX INFO: renamed from: o */
    public final jh0 f4645o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4646p;

    /* JADX INFO: renamed from: q */
    public LinkedHashSet f4647q;

    /* JADX INFO: renamed from: r */
    public C0884wc f4648r;

    /* JADX INFO: renamed from: s */
    public C0910x1 f4649s;

    /* JADX INFO: renamed from: t */
    public boolean f4650t;

    /* JADX INFO: renamed from: u */
    public final z31 f4651u;

    /* JADX INFO: renamed from: v */
    public final C0541o8 f4652v;

    /* JADX INFO: renamed from: w */
    public final e40 f4653w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC0618pk f4654x;

    /* JADX INFO: renamed from: y */
    public final jo0 f4655y;

    /* JADX INFO: renamed from: z */
    public static final z31 f4630z = pf1.m3048d(oq0.f4605g);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f4629A = new AtomicReference(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ot0(InterfaceC0618pk interfaceC0618pk) {
        C0715s6 c0715s6 = new C0715s6(new it0(this, 0));
        this.f4631a = c0715s6;
        it0 it0Var = new it0(this, 1);
        C0541o8 c0541o8 = new C0541o8();
        c0541o8.f4480a = new C0238g9(0);
        c0541o8.f4481b = new C0681r9();
        c0541o8.f4482c = new C0081c7(8, c0541o8, it0Var);
        this.f4632b = c0541o8;
        this.f4633c = new Object();
        this.f4636f = new ArrayList();
        this.f4638h = new kh0();
        this.f4639i = new sh0(new C0964yi[16]);
        this.f4640j = new ArrayList();
        this.f4641k = new ArrayList();
        this.f4642l = new jh0();
        this.f4643m = new C0111d(13);
        this.f4644n = new jh0();
        this.f4645o = new jh0();
        this.f4651u = pf1.m3048d(jt0.f2943f);
        this.f4652v = new C0541o8(9);
        e40 e40Var = new e40((c40) interfaceC0618pk.mo64l(C0496n2.f4129I));
        e40Var.mo482r(new C0532o(17, this));
        this.f4653w = e40Var;
        this.f4654x = interfaceC0618pk.mo63h(c0715s6).mo63h(e40Var);
        this.f4655y = new jo0(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final void m2942G(ArrayList arrayList, ot0 ot0Var, C0964yi c0964yi) {
        arrayList.clear();
        synchronized (ot0Var.f4633c) {
            Iterator it = ot0Var.f4641k.iterator();
            if (it.hasNext()) {
                ((mg0) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m2943w(nh0 nh0Var) {
        try {
            if (nh0Var.mo822w() instanceof n21) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            nh0Var.mo807c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m2944A() {
        return this.f4639i.f5770f != 0 || m2957z() || m2945B() || this.f4642l.m1704j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m2945B() {
        return !this.f4650t && (((C0238g9) ((C0681r9) this.f4632b.f4481b).f5329c).get() & 134217727) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2946C() {
        boolean z;
        synchronized (this.f4633c) {
            if (this.f4638h.m1897h() || this.f4639i.f5770f != 0 || m2957z()) {
                z = true;
            } else if (!m2945B()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final List m2947D() {
        List list = this.f4637g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f4636f;
        List arrayList2 = arrayList.isEmpty() ? C0294hs.f2354d : new ArrayList(arrayList);
        this.f4637g = arrayList2;
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m2948E() {
        InterfaceC0798uc interfaceC0798ucM2956y;
        synchronized (this.f4633c) {
            interfaceC0798ucM2956y = m2956y();
            if (((jt0) this.f4651u.getValue()).compareTo(jt0.f2942e) <= 0) {
                Throwable th = this.f4635e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (interfaceC0798ucM2956y != null) {
            ((C0884wc) interfaceC0798ucM2956y).mo541i(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m2949F(C0964yi c0964yi) {
        synchronized (this.f4633c) {
            ArrayList arrayList = this.f4641k;
            if (arrayList.size() > 0) {
                ((mg0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        if (((p000.uo0) r11.get(r4)).f6275e == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r12 = (p000.uo0) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r12.f6275e != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        r12 = (p000.mg0) r12.f6274d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r4 = r18.f4633c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        p000.AbstractC0170ef.m928G(r18.f4641k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0179, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0187, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0189, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (((p000.uo0) r12).f6275e == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0197, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019a, code lost:
    
        r11 = r3;
     */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2950H(List list, kh0 kh0Var) {
        nh0 nh0VarMo805C;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((mg0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C0964yi c0964yi = (C0964yi) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0964yi.f7646y.f4864F) {
                AbstractC0653qi.m3252a("Check failed");
            }
            int i2 = 16;
            C0532o c0532o = new C0532o(i2, c0964yi);
            C0073c c0073c = new C0073c(i2, c0964yi, kh0Var);
            l21 l21VarM4172j = t21.m4172j();
            nh0 nh0Var = l21VarM4172j instanceof nh0 ? (nh0) l21VarM4172j : null;
            if (nh0Var == null || (nh0VarMo805C = nh0Var.mo805C(c0532o, c0073c)) == null) {
                C0921xc.m5134o("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                l21 l21VarM1969j = nh0VarMo805C.m1969j();
                try {
                    synchronized (this.f4633c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                mg0 mg0Var = (mg0) list2.get(i3);
                                jh0 jh0Var = this.f4642l;
                                mg0Var.getClass();
                                Object objM3250a = qg0.m3250a(jh0Var);
                                arrayList.add(new uo0(mg0Var, objM3250a));
                            }
                            int size3 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    break;
                                }
                                uo0 uo0Var = (uo0) arrayList.get(i4);
                                if (uo0Var.f6275e == null) {
                                    C0111d c0111d = this.f4643m;
                                    ((mg0) uo0Var.f6274d).getClass();
                                    if (((jh0) c0111d.f919e).m1696b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i5 = 0; i5 < size4; i5++) {
                                            uo0 uo0Var2 = (uo0) arrayList.get(i5);
                                            if (uo0Var2.f6275e == null) {
                                                C0111d c0111d2 = this.f4643m;
                                                ((mg0) uo0Var2.f6274d).getClass();
                                                jh0 jh0Var2 = (jh0) c0111d2.f919e;
                                                if (jh0Var2.m1703i()) {
                                                    ((jh0) c0111d2.f920f).m1695a();
                                                }
                                            }
                                            arrayList3.add(uo0Var2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i4++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        if (((uo0) arrayList.get(i6)).f6275e != null) {
                            break;
                        }
                        i6++;
                    }
                    c0964yi.m5277r(arrayList);
                    l21.m1966q(l21VarM1969j);
                } catch (Throwable th) {
                    l21.m1966q(l21VarM1969j);
                    throw th;
                }
            } finally {
                m2943w(nh0VarMo805C);
            }
        }
        return AbstractC0960ye.m5253W(map.keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final C0964yi m2951I(C0964yi c0964yi, kh0 kh0Var) {
        nh0 nh0VarMo805C;
        if (c0964yi.f7646y.f4864F || c0964yi.f7647z == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f4647q;
        if (linkedHashSet == null || !linkedHashSet.contains(c0964yi)) {
            int i = 16;
            C0532o c0532o = new C0532o(i, c0964yi);
            C0073c c0073c = new C0073c(i, c0964yi, kh0Var);
            l21 l21VarM4172j = t21.m4172j();
            nh0 nh0Var = l21VarM4172j instanceof nh0 ? (nh0) l21VarM4172j : null;
            if (nh0Var == null || (nh0VarMo805C = nh0Var.mo805C(c0532o, c0073c)) == null) {
                C0921xc.m5134o("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    l21 l21VarM1969j = nh0VarMo805C.m1969j();
                    if (kh0Var != null) {
                        try {
                            if (kh0Var.m1897h()) {
                                C0081c7 c0081c7 = new C0081c7(10, kh0Var, c0964yi);
                                C0616pi c0616pi = c0964yi.f7646y;
                                if (c0616pi.f4864F) {
                                    AbstractC0653qi.m3252a("Preparing a composition while composing is not supported");
                                }
                                c0616pi.f4864F = true;
                                try {
                                    c0081c7.invoke();
                                    c0616pi.f4864F = false;
                                } catch (Throwable th) {
                                    c0616pi.f4864F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            l21.m1966q(l21VarM1969j);
                            throw th2;
                        }
                    }
                    boolean zM5283x = c0964yi.m5283x();
                    l21.m1966q(l21VarM1969j);
                    if (zM5283x) {
                        return c0964yi;
                    }
                } finally {
                    m2943w(nh0VarMo805C);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m2952J(Throwable th, C0964yi c0964yi) throws Throwable {
        int i = 21;
        if (!((Boolean) f4629A.get()).booleanValue() || (th instanceof C0963yh)) {
            synchronized (this.f4633c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C0910x1 c0910x1 = this.f4649s;
                if (c0910x1 != null) {
                    throw ((Throwable) c0910x1.f7232e);
                }
                this.f4649s = new C0910x1(i, th);
            }
            throw th;
        }
        synchronized (this.f4633c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4640j.clear();
                this.f4639i.m4077g();
                this.f4638h = new kh0();
                this.f4641k.clear();
                this.f4642l.m1695a();
                this.f4644n.m1695a();
                this.f4649s = new C0910x1(i, th);
                if (c0964yi != null) {
                    m2954L(c0964yi);
                }
                m2956y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m2953K() {
        boolean zM2944A;
        synchronized (this.f4633c) {
            if (this.f4638h.m1896g()) {
                return m2944A();
            }
            List listM2947D = m2947D();
            fy0 fy0Var = new fy0(this.f4638h);
            this.f4638h = new kh0();
            try {
                int size = listM2947D.size();
                for (int i = 0; i < size; i++) {
                    ((C0964yi) listM2947D.get(i)).m5284y(fy0Var);
                    if (((jt0) this.f4651u.getValue()).compareTo(jt0.f2942e) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4633c) {
                    if (m2956y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM2944A = m2944A();
                }
                return zM2944A;
            } catch (Throwable th) {
                synchronized (this.f4633c) {
                    kh0 kh0Var = this.f4638h;
                    kh0Var.getClass();
                    Iterator<E> it = fy0Var.iterator();
                    while (it.hasNext()) {
                        kh0Var.m1900k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m2954L(C0964yi c0964yi) {
        ArrayList arrayList = this.f4646p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4646p = arrayList;
        }
        if (!arrayList.contains(c0964yi)) {
            arrayList.add(c0964yi);
        }
        if (this.f4636f.remove(c0964yi)) {
            this.f4637g = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: a */
    public final void mo2708a(C0964yi c0964yi, InterfaceC0904ww interfaceC0904ww) throws Throwable {
        jt0 jt0Var;
        boolean zContains;
        nh0 nh0VarMo805C;
        boolean z = c0964yi.f7646y.f4864F;
        synchronized (this.f4633c) {
            jt0 jt0Var2 = (jt0) this.f4651u.getValue();
            jt0Var = jt0.f2942e;
            zContains = jt0Var2.compareTo(jt0Var) > 0 ? true ^ m2947D().contains(c0964yi) : true;
        }
        try {
            int i = 16;
            C0532o c0532o = new C0532o(i, c0964yi);
            C0073c c0073c = new C0073c(i, c0964yi, null);
            l21 l21VarM4172j = t21.m4172j();
            nh0 nh0Var = l21VarM4172j instanceof nh0 ? (nh0) l21VarM4172j : null;
            if (nh0Var == null || (nh0VarMo805C = nh0Var.mo805C(c0532o, c0073c)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                l21 l21VarM1969j = nh0VarMo805C.m1969j();
                try {
                    c0964yi.m5269j(interfaceC0904ww);
                    synchronized (this.f4633c) {
                        if (((jt0) this.f4651u.getValue()).compareTo(jt0Var) > 0 && !m2947D().contains(c0964yi)) {
                            this.f4636f.add(c0964yi);
                            this.f4637g = null;
                        }
                    }
                    if (!z) {
                        t21.m4172j().mo816m();
                    }
                    try {
                        m2949F(c0964yi);
                        try {
                            c0964yi.m5263d();
                            c0964yi.m5265f();
                            if (z) {
                                return;
                            }
                            t21.m4172j().mo816m();
                        } catch (Throwable th) {
                            m2952J(th, null);
                        }
                    } catch (Throwable th2) {
                        m2952J(th2, c0964yi);
                    }
                } finally {
                    l21.m1966q(l21VarM1969j);
                }
            } finally {
                m2943w(nh0VarMo805C);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f4633c) {
                }
            }
            m2952J(th3, c0964yi);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: b */
    public final kh0 mo2709b(C0964yi c0964yi, j11 j11Var, InterfaceC0904ww interfaceC0904ww) {
        C0541o8 c0541o8 = this.f4652v;
        try {
            j11 j11Var2 = c0964yi.f7640s;
            c0964yi.f7640s = j11Var;
            try {
                mo2708a(c0964yi, interfaceC0904ww);
                kh0 kh0Var = (kh0) c0541o8.m2801e();
                if (kh0Var == null) {
                    kh0Var = ey0.f1546a;
                    kh0Var.getClass();
                }
                return kh0Var;
            } finally {
                c0964yi.f7640s = j11Var2;
            }
        } finally {
            c0541o8.m2808m(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: d */
    public final boolean mo2711d() {
        return ((Boolean) f4629A.get()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: e */
    public final boolean mo2712e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: f */
    public final boolean mo2713f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: g */
    public final long mo2714g() {
        return 1000L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: h */
    public final InterfaceC0690ri mo2715h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: j */
    public final InterfaceC0618pk mo2717j() {
        return this.f4654x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: k */
    public final boolean mo2718k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: l */
    public final void mo2719l(C0964yi c0964yi) {
        InterfaceC0798uc interfaceC0798ucM2956y;
        synchronized (this.f4633c) {
            if (this.f4639i.m4078h(c0964yi)) {
                interfaceC0798ucM2956y = null;
            } else {
                this.f4639i.m4072b(c0964yi);
                interfaceC0798ucM2956y = m2956y();
            }
        }
        if (interfaceC0798ucM2956y != null) {
            ((C0884wc) interfaceC0798ucM2956y).mo541i(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: m */
    public final lg0 mo2720m(mg0 mg0Var) {
        lg0 lg0Var;
        synchronized (this.f4633c) {
            lg0Var = (lg0) this.f4644n.m1705k(mg0Var);
        }
        return lg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: n */
    public final kh0 mo2721n(C0964yi c0964yi, j11 j11Var, kh0 kh0Var) {
        C0541o8 c0541o8 = this.f4652v;
        try {
            m2953K();
            c0964yi.m5284y(new fy0(kh0Var));
            j11 j11Var2 = c0964yi.f7640s;
            c0964yi.f7640s = j11Var;
            try {
                C0964yi c0964yiM2951I = m2951I(c0964yi, null);
                if (c0964yiM2951I != null) {
                    m2949F(c0964yi);
                    c0964yiM2951I.m5263d();
                    c0964yiM2951I.m5265f();
                }
                kh0 kh0Var2 = (kh0) c0541o8.m2801e();
                if (kh0Var2 == null) {
                    kh0Var2 = ey0.f1546a;
                    kh0Var2.getClass();
                }
                return kh0Var2;
            } finally {
                c0964yi.f7640s = j11Var2;
            }
        } finally {
            c0541o8.m2808m(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: q */
    public final void mo2724q(ht0 ht0Var) {
        C0541o8 c0541o8 = this.f4652v;
        kh0 kh0Var = (kh0) c0541o8.m2801e();
        if (kh0Var == null) {
            kh0 kh0Var2 = ey0.f1546a;
            kh0Var = new kh0();
            c0541o8.m2808m(kh0Var);
        }
        kh0Var.m1890a(ht0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: r */
    public final void mo2725r(C0964yi c0964yi) {
        synchronized (this.f4633c) {
            try {
                LinkedHashSet linkedHashSet = this.f4647q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f4647q = linkedHashSet;
                }
                linkedHashSet.add(c0964yi);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: s */
    public final InterfaceC0958yc mo2726s(C0310i7 c0310i7) {
        C0541o8 c0541o8 = this.f4632b;
        C0681r9 c0681r9 = (C0681r9) c0541o8.f4481b;
        hj0 hj0Var = new hj0();
        hj0Var.f2273a = c0310i7;
        return c0681r9.m3429d(hj0Var, (C0081c7) c0541o8.f4482c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: v */
    public final void mo2729v(C0964yi c0964yi) {
        synchronized (this.f4633c) {
            if (this.f4636f.remove(c0964yi)) {
                this.f4637g = null;
            }
            this.f4639i.m4080j(c0964yi);
            this.f4640j.remove(c0964yi);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m2955x() {
        synchronized (this.f4633c) {
            if (((jt0) this.f4651u.getValue()).compareTo(jt0.f2945h) >= 0) {
                z31 z31Var = this.f4651u;
                jt0 jt0Var = jt0.f2942e;
                z31Var.getClass();
                z31Var.m5413j(null, jt0Var);
            }
        }
        this.f4653w.mo478a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final InterfaceC0798uc m2956y() {
        z31 z31Var = this.f4651u;
        int iCompareTo = ((jt0) z31Var.getValue()).compareTo(jt0.f2942e);
        ArrayList arrayList = this.f4641k;
        ArrayList arrayList2 = this.f4640j;
        sh0 sh0Var = this.f4639i;
        if (iCompareTo > 0) {
            C0910x1 c0910x1 = this.f4649s;
            jt0 jt0Var = jt0.f2946i;
            jt0 jt0Var2 = jt0.f2943f;
            if (c0910x1 == null) {
                if (this.f4634d == null) {
                    this.f4638h = new kh0();
                    sh0Var.m4077g();
                    if (m2957z() || m2945B()) {
                        jt0Var2 = jt0.f2944g;
                    }
                } else {
                    jt0Var2 = (sh0Var.f5770f != 0 || this.f4638h.m1897h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m2957z() || m2945B() || this.f4642l.m1704j()) ? jt0Var : jt0.f2945h;
                }
            }
            z31Var.m5413j(null, jt0Var2);
            if (jt0Var2 != jt0Var) {
                return null;
            }
            C0884wc c0884wc = this.f4648r;
            this.f4648r = null;
            return c0884wc;
        }
        List listM2947D = m2947D();
        int size = listM2947D.size();
        for (int i = 0; i < size; i++) {
        }
        this.f4636f.clear();
        this.f4637g = C0294hs.f2354d;
        this.f4638h = new kh0();
        sh0Var.m4077g();
        arrayList2.clear();
        arrayList.clear();
        this.f4646p = null;
        C0884wc c0884wc2 = this.f4648r;
        if (c0884wc2 != null) {
            c0884wc2.mo543k(null);
        }
        this.f4648r = null;
        this.f4649s = null;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m2957z() {
        return !this.f4650t && (((C0238g9) ((C0681r9) this.f4631a.f5657f).f5329c).get() & 134217727) > 0;
    }

    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: o */
    public final void mo2722o(Set set) {
    }
}
