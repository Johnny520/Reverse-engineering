package p117i0;

import android.util.Log;
import be.C0289k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p010aa.C0035c;
import p014b.C0126e;
import p015b0.C0136d0;
import p020b5.C0184c;
import p036c9.C0446i;
import p041d1.C0655c0;
import p069f.AbstractC0959s0;
import p069f.C0943k0;
import p069f.C0945l0;
import p085fg.InterfaceC1235p;
import p131j0.C2045a;
import p131j0.C2046b;
import p131j0.C2048d;
import p136j8.C2104o;
import p235q0.C3420b;
import p249qg.C3564g;
import p249qg.C3593q;
import p249qg.C3600t0;
import p249qg.InterfaceC3561f;
import p249qg.InterfaceC3596r0;
import p266s0.C3871a;
import p276sf.C3958e;
import p276sf.C3967n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.C4651b;
import p322w0.C4656g;
import tf.AbstractC4166m;
import tf.C4173t;
import tg.AbstractC4201s;
import tg.C4183b0;
import ug.AbstractC4338c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.y1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1897y1 extends AbstractC1863o {

    /* JADX INFO: renamed from: a */
    public final C1819d f6303a;

    /* JADX INFO: renamed from: b */
    public final C0184c f6304b;

    /* JADX INFO: renamed from: c */
    public final Object f6305c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3596r0 f6306d;

    /* JADX INFO: renamed from: e */
    public Throwable f6307e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f6308f;

    /* JADX INFO: renamed from: g */
    public Object f6309g;

    /* JADX INFO: renamed from: h */
    public C0945l0 f6310h;

    /* JADX INFO: renamed from: i */
    public final C2046b f6311i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f6312j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f6313k;

    /* JADX INFO: renamed from: l */
    public final C0943k0 f6314l;

    /* JADX INFO: renamed from: m */
    public final C0126e f6315m;

    /* JADX INFO: renamed from: n */
    public final C0943k0 f6316n;

    /* JADX INFO: renamed from: o */
    public final C0943k0 f6317o;

    /* JADX INFO: renamed from: p */
    public ArrayList f6318p;

    /* JADX INFO: renamed from: q */
    public C0945l0 f6319q;

    /* JADX INFO: renamed from: r */
    public C3564g f6320r;

    /* JADX INFO: renamed from: s */
    public final C4183b0 f6321s;

    /* JADX INFO: renamed from: t */
    public boolean f6322t;

    /* JADX INFO: renamed from: u */
    public final C4183b0 f6323u;

    /* JADX INFO: renamed from: v */
    public final C0184c f6324v;

    /* JADX INFO: renamed from: w */
    public final C3600t0 f6325w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC5561g f6326x;

    /* JADX INFO: renamed from: y */
    public final C1823e f6327y;

    /* JADX INFO: renamed from: z */
    public static final C4183b0 f6302z = AbstractC4201s.m8464b(C3420b.f11046j);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f6301A = new AtomicReference(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1897y1(InterfaceC5561g interfaceC5561g) {
        C1819d c1819d = new C1819d(new C1879s1(this, 0));
        this.f6303a = c1819d;
        C1879s1 c1879s1 = new C1879s1(this, 1);
        C0184c c0184c = new C0184c();
        c0184c.f469a = new C3871a(0);
        c0184c.f470b = new C0289k(4);
        c0184c.f471c = new C0035c(c0184c, 16, c1879s1);
        this.f6304b = c0184c;
        this.f6305c = new Object();
        this.f6308f = new ArrayList();
        this.f6310h = new C0945l0();
        this.f6311i = new C2046b(new C1871q[16]);
        this.f6312j = new ArrayList();
        this.f6313k = new ArrayList();
        this.f6314l = new C0943k0();
        this.f6315m = new C0126e(12);
        this.f6316n = new C0943k0();
        this.f6317o = new C0943k0();
        this.f6321s = AbstractC4201s.m8464b(null);
        this.f6323u = AbstractC4201s.m8464b(EnumC1885u1.f6258i);
        this.f6324v = new C0184c(22);
        C3600t0 c3600t0 = new C3600t0((InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h));
        c3600t0.mo7491o(new C0136d0(this, 19));
        this.f6325w = c3600t0;
        this.f6326x = interfaceC5561g.mo2059e(c1819d).mo2059e(c3600t0);
        this.f6327y = new C1823e(9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final void m4656G(ArrayList arrayList, C1897y1 c1897y1, C1871q c1871q) {
        arrayList.clear();
        synchronized (c1897y1.f6305c) {
            Iterator it = c1897y1.f6313k.iterator();
            if (it.hasNext()) {
                ((AbstractC1887v0) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m4657w(C4651b c4651b) {
        try {
            if (c4651b.mo9091w() instanceof C4656g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c4651b.mo9086c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m4658A() {
        return this.f6311i.f6893i != 0 || m4671z() || m4659B() || this.f6314l.m2323j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m4659B() {
        return !this.f6322t && (((C3871a) ((C0289k) this.f6304b.f470b).f840c).get() & 134217727) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4660C() {
        boolean z9;
        synchronized (this.f6305c) {
            if (this.f6310h.m2335h() || this.f6311i.f6893i != 0 || m4671z()) {
                z9 = true;
            } else if (!m4659B()) {
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: D */
    public final List m4661D() {
        ?? r02 = this.f6309g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f6308f;
        List arrayList2 = arrayList.isEmpty() ? C4173t.f13710g : new ArrayList(arrayList);
        this.f6309g = arrayList2;
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m4662E() {
        InterfaceC3561f interfaceC3561fM4670y;
        synchronized (this.f6305c) {
            interfaceC3561fM4670y = m4670y();
            if (((EnumC1885u1) this.f6323u.getValue()).compareTo(EnumC1885u1.f6257h) <= 0) {
                Throwable th2 = this.f6307e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th2);
                throw cancellationException;
            }
        }
        if (interfaceC3561fM4670y != null) {
            ((C3564g) interfaceC3561fM4670y).resumeWith(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m4663F(C1871q c1871q) {
        synchronized (this.f6305c) {
            ArrayList arrayList = this.f6313k;
            if (arrayList.size() > 0) {
                ((AbstractC1887v0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        if (((p276sf.C3958e) r10.get(r4)).f12962h == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        r11 = (p276sf.C3958e) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        if (r11.f12962h != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        r11 = (p117i0.AbstractC1887v0) r11.f12961g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        r4 = r17.f6305c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        tf.AbstractC4171r.m8432h1(r17.f6313k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (((p276sf.C3958e) r11).f12962h == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        r10 = r3;
     */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m4664H(List list, C0945l0 c0945l0) {
        C4651b c4651bMo9085C;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            ((AbstractC1887v0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C1871q c1871q = (C1871q) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c1871q.f6200B.f6081F) {
                AbstractC1855m.m4573a("Check failed");
            }
            C0136d0 c0136d0 = new C0136d0(c1871q, 18);
            C0446i c0446i = new C0446i(c1871q, 21, c0945l0);
            AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
            C4651b c4651b = abstractC4655fM9129j instanceof C4651b ? (C4651b) abstractC4655fM9129j : null;
            if (c4651b == null || (c4651bMo9085C = c4651b.mo9085C(c0136d0, c0446i)) == null) {
                C2104o.m5276A("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                AbstractC4655f abstractC4655fM9110j = c4651bMo9085C.m9110j();
                try {
                    synchronized (this.f6305c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                AbstractC1887v0 abstractC1887v0 = (AbstractC1887v0) list2.get(i10);
                                C0943k0 c0943k0 = this.f6314l;
                                abstractC1887v0.getClass();
                                Object objM5053a = C2045a.m5053a(c0943k0);
                                arrayList.add(new C3958e(abstractC1887v0, objM5053a));
                            }
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                }
                                C3958e c3958e = (C3958e) arrayList.get(i11);
                                if (c3958e.f12962h == null) {
                                    C0126e c0126e = this.f6315m;
                                    ((AbstractC1887v0) c3958e.f12961g).getClass();
                                    if (((C0943k0) c0126e.f332h).m2315b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            C3958e c3958e2 = (C3958e) arrayList.get(i12);
                                            if (c3958e2.f12962h == null) {
                                                C0126e c0126e2 = this.f6315m;
                                                ((AbstractC1887v0) c3958e2.f12961g).getClass();
                                                C0943k0 c0943k02 = (C0943k0) c0126e2.f332h;
                                                if (c0943k02.m2322i()) {
                                                    ((C0943k0) c0126e2.f333i).m2314a();
                                                }
                                            }
                                            arrayList3.add(c3958e2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i11++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size5) {
                            break;
                        }
                        if (((C3958e) arrayList.get(i13)).f12962h != null) {
                            break;
                        }
                        i13++;
                    }
                    c1871q.m4605r(arrayList);
                    AbstractC4655f.m9106q(abstractC4655fM9110j);
                } catch (Throwable th2) {
                    AbstractC4655f.m9106q(abstractC4655fM9110j);
                    throw th2;
                }
            } finally {
                m4657w(c4651bMo9085C);
            }
        }
        return AbstractC4166m.m8407P1(map.keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final C1871q m4665I(C1871q c1871q, C0945l0 c0945l0) {
        C4651b c4651bMo9085C;
        if (c1871q.f6200B.f6081F || c1871q.f6201C == 3) {
            return null;
        }
        C0945l0 c0945l02 = this.f6319q;
        if (c0945l02 == null || !c0945l02.m2330c(c1871q)) {
            C0136d0 c0136d0 = new C0136d0(c1871q, 18);
            C0446i c0446i = new C0446i(c1871q, 21, c0945l0);
            AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
            C4651b c4651b = abstractC4655fM9129j instanceof C4651b ? (C4651b) abstractC4655fM9129j : null;
            if (c4651b == null || (c4651bMo9085C = c4651b.mo9085C(c0136d0, c0446i)) == null) {
                C2104o.m5276A("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                AbstractC4655f abstractC4655fM9110j = c4651bMo9085C.m9110j();
                if (c0945l0 != null) {
                    try {
                        if (c0945l0.m2335h()) {
                            C0035c c0035c = new C0035c(c0945l0, 17, c1871q);
                            C1836h0 c1836h0 = c1871q.f6200B;
                            if (c1836h0.f6081F) {
                                AbstractC1855m.m4573a("Preparing a composition while composing is not supported");
                            }
                            c1836h0.f6081F = true;
                            try {
                                c0035c.invoke();
                                c1836h0.f6081F = false;
                            } catch (Throwable th2) {
                                c1836h0.f6081F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC4655f.m9106q(abstractC4655fM9110j);
                        throw th3;
                    }
                }
                boolean zM4610w = c1871q.m4610w();
                AbstractC4655f.m9106q(abstractC4655fM9110j);
                if (zM4610w) {
                    return c1871q;
                }
            } finally {
                m4657w(c4651bMo9085C);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m4666J(Throwable th2, C1871q c1871q) throws Throwable {
        if (!((Boolean) f6301A.get()).booleanValue() || (th2 instanceof C1847k)) {
            synchronized (this.f6305c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th2);
                C1882t1 c1882t1 = (C1882t1) this.f6321s.getValue();
                if (c1882t1 != null) {
                    throw c1882t1.f6253a;
                }
                C4183b0 c4183b0 = this.f6321s;
                C1882t1 c1882t12 = new C1882t1(th2);
                c4183b0.getClass();
                c4183b0.m8446h(null, c1882t12);
            }
            throw th2;
        }
        synchronized (this.f6305c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f6312j.clear();
                this.f6311i.m5061g();
                this.f6310h = new C0945l0();
                this.f6313k.clear();
                this.f6314l.m2314a();
                this.f6316n.m2314a();
                C4183b0 c4183b02 = this.f6321s;
                C1882t1 c1882t13 = new C1882t1(th2);
                c4183b02.getClass();
                c4183b02.m8446h(null, c1882t13);
                if (c1871q != null) {
                    m4668L(c1871q);
                }
                if (m4670y() != null) {
                    AbstractC1855m.m4573a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m4667K() {
        boolean zM4658A;
        synchronized (this.f6305c) {
            if (this.f6310h.m2334g()) {
                return m4658A();
            }
            List listM4661D = m4661D();
            C2048d c2048d = new C2048d(this.f6310h);
            this.f6310h = new C0945l0();
            try {
                int size = listM4661D.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((C1871q) listM4661D.get(i9)).m4611x(c2048d);
                    if (((EnumC1885u1) this.f6323u.getValue()).compareTo(EnumC1885u1.f6257h) <= 0) {
                        break;
                    }
                }
                synchronized (this.f6305c) {
                    if (m4670y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM4658A = m4658A();
                }
                return zM4658A;
            } catch (Throwable th2) {
                synchronized (this.f6305c) {
                    C0945l0 c0945l0 = this.f6310h;
                    c0945l0.getClass();
                    Iterator<E> it = c2048d.iterator();
                    while (it.hasNext()) {
                        c0945l0.m2338k(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m4668L(C1871q c1871q) {
        ArrayList arrayList = this.f6318p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f6318p = arrayList;
        }
        if (!arrayList.contains(c1871q)) {
            arrayList.add(c1871q);
        }
        if (this.f6308f.remove(c1871q)) {
            this.f6309g = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: a */
    public final void mo4461a(C1871q c1871q, InterfaceC1235p interfaceC1235p) throws Throwable {
        EnumC1885u1 enumC1885u1;
        boolean zContains;
        C4651b c4651bMo9085C;
        boolean z9 = c1871q.f6200B.f6081F;
        synchronized (this.f6305c) {
            EnumC1885u1 enumC1885u12 = (EnumC1885u1) this.f6323u.getValue();
            enumC1885u1 = EnumC1885u1.f6257h;
            zContains = enumC1885u12.compareTo(enumC1885u1) > 0 ? true ^ m4661D().contains(c1871q) : true;
        }
        try {
            C0136d0 c0136d0 = new C0136d0(c1871q, 18);
            C0446i c0446i = new C0446i(c1871q, 21, null);
            AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
            C4651b c4651b = abstractC4655fM9129j instanceof C4651b ? (C4651b) abstractC4655fM9129j : null;
            if (c4651b == null || (c4651bMo9085C = c4651b.mo9085C(c0136d0, c0446i)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC4655f abstractC4655fM9110j = c4651bMo9085C.m9110j();
                try {
                    c1871q.m4597j(interfaceC1235p);
                    synchronized (this.f6305c) {
                        if (((EnumC1885u1) this.f6323u.getValue()).compareTo(enumC1885u1) > 0 && !m4661D().contains(c1871q)) {
                            this.f6308f.add(c1871q);
                            this.f6309g = null;
                        }
                    }
                    if (!z9) {
                        AbstractC4662m.m9129j().mo9089m();
                    }
                    try {
                        m4663F(c1871q);
                        try {
                            c1871q.m4591d();
                            c1871q.m4593f();
                            if (z9) {
                                return;
                            }
                            AbstractC4662m.m9129j().mo9089m();
                        } catch (Throwable th2) {
                            m4666J(th2, null);
                        }
                    } catch (Throwable th3) {
                        m4666J(th3, c1871q);
                    }
                } finally {
                    AbstractC4655f.m9106q(abstractC4655fM9110j);
                }
            } finally {
                m4657w(c4651bMo9085C);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f6305c) {
                }
            }
            m4666J(th4, c1871q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: b */
    public final C0945l0 mo4462b(C1871q c1871q, InterfaceC1826e2 interfaceC1826e2, InterfaceC1235p interfaceC1235p) {
        C0184c c0184c = this.f6324v;
        try {
            InterfaceC1826e2 interfaceC1826e22 = c1871q.f6217v;
            c1871q.f6217v = interfaceC1826e2;
            try {
                mo4461a(c1871q, interfaceC1235p);
                C0945l0 c0945l0 = (C0945l0) c0184c.m818o();
                if (c0945l0 == null) {
                    c0945l0 = AbstractC0959s0.f3019a;
                    c0945l0.getClass();
                }
                return c0945l0;
            } finally {
                c1871q.f6217v = interfaceC1826e22;
            }
        } finally {
            c0184c.m797O(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: d */
    public final boolean mo4464d() {
        return ((Boolean) f6301A.get()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: e */
    public final boolean mo4465e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: f */
    public final boolean mo4466f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: g */
    public final long mo4467g() {
        return 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: h */
    public final InterfaceC1859n mo4468h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: j */
    public final InterfaceC5561g mo4470j() {
        return this.f6326x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: k */
    public final boolean mo4471k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: l */
    public final void mo4472l(C1871q c1871q) {
        InterfaceC3561f interfaceC3561fM4670y;
        synchronized (this.f6305c) {
            if (this.f6311i.m5062h(c1871q)) {
                interfaceC3561fM4670y = null;
            } else {
                this.f6311i.m5056b(c1871q);
                interfaceC3561fM4670y = m4670y();
            }
        }
        if (interfaceC3561fM4670y != null) {
            ((C3564g) interfaceC3561fM4670y).resumeWith(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: m */
    public final AbstractC1884u0 mo4473m(AbstractC1887v0 abstractC1887v0) {
        AbstractC1884u0 abstractC1884u0;
        synchronized (this.f6305c) {
            abstractC1884u0 = (AbstractC1884u0) this.f6316n.m2324k(abstractC1887v0);
        }
        return abstractC1884u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: n */
    public final C0945l0 mo4474n(C1871q c1871q, InterfaceC1826e2 interfaceC1826e2, C0945l0 c0945l0) {
        C0184c c0184c = this.f6324v;
        try {
            m4667K();
            c1871q.m4611x(new C2048d(c0945l0));
            InterfaceC1826e2 interfaceC1826e22 = c1871q.f6217v;
            c1871q.f6217v = interfaceC1826e2;
            try {
                C1871q c1871qM4665I = m4665I(c1871q, null);
                if (c1871qM4665I != null) {
                    m4663F(c1871q);
                    c1871qM4665I.m4591d();
                    c1871qM4665I.m4593f();
                }
                C0945l0 c0945l02 = (C0945l0) c0184c.m818o();
                if (c0945l02 == null) {
                    c0945l02 = AbstractC0959s0.f3019a;
                    c0945l02.getClass();
                }
                return c0945l02;
            } finally {
                c1871q.f6217v = interfaceC1826e22;
            }
        } finally {
            c0184c.m797O(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: q */
    public final void mo4477q(C1876r1 c1876r1) {
        C0184c c0184c = this.f6324v;
        C0945l0 c0945l0 = (C0945l0) c0184c.m818o();
        if (c0945l0 == null) {
            C0945l0 c0945l02 = AbstractC0959s0.f3019a;
            c0945l0 = new C0945l0();
            c0184c.m797O(c0945l0);
        }
        c0945l0.m2328a(c1876r1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: r */
    public final void mo4478r(C1871q c1871q) {
        synchronized (this.f6305c) {
            try {
                C0945l0 c0945l0 = this.f6319q;
                if (c0945l0 == null) {
                    C0945l0 c0945l02 = AbstractC0959s0.f3019a;
                    c0945l0 = new C0945l0();
                    this.f6319q = c0945l0;
                }
                c0945l0.m2328a(c1871q);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: s */
    public final InterfaceC1827f mo4479s(C0655c0 c0655c0) {
        C0184c c0184c = this.f6304b;
        C0289k c0289k = (C0289k) c0184c.f470b;
        C1817c1 c1817c1 = new C1817c1();
        c1817c1.f6036a = c0655c0;
        return c0289k.m1195d(c1817c1, (C0035c) c0184c.f471c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: v */
    public final void mo4482v(C1871q c1871q) {
        synchronized (this.f6305c) {
            if (this.f6308f.remove(c1871q)) {
                this.f6309g = null;
            }
            this.f6311i.m5064j(c1871q);
            this.f6312j.remove(c1871q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m4669x() {
        synchronized (this.f6305c) {
            if (((EnumC1885u1) this.f6323u.getValue()).compareTo(EnumC1885u1.f6260k) >= 0) {
                C4183b0 c4183b0 = this.f6323u;
                EnumC1885u1 enumC1885u1 = EnumC1885u1.f6257h;
                c4183b0.getClass();
                c4183b0.m8446h(null, enumC1885u1);
            }
        }
        this.f6325w.mo7485a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final InterfaceC3561f m4670y() {
        C4183b0 c4183b0 = this.f6323u;
        int iCompareTo = ((EnumC1885u1) c4183b0.getValue()).compareTo(EnumC1885u1.f6257h);
        C4183b0 c4183b02 = this.f6321s;
        ArrayList arrayList = this.f6313k;
        ArrayList arrayList2 = this.f6312j;
        C2046b c2046b = this.f6311i;
        if (iCompareTo > 0) {
            Object value = c4183b02.getValue();
            EnumC1885u1 enumC1885u1 = EnumC1885u1.f6261l;
            EnumC1885u1 enumC1885u12 = EnumC1885u1.f6258i;
            if (value == null) {
                if (this.f6306d == null) {
                    this.f6310h = new C0945l0();
                    c2046b.m5061g();
                    if (m4671z() || m4659B()) {
                        enumC1885u12 = EnumC1885u1.f6259j;
                    }
                } else {
                    enumC1885u12 = (c2046b.f6893i != 0 || this.f6310h.m2335h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m4671z() || m4659B() || this.f6314l.m2323j()) ? enumC1885u1 : EnumC1885u1.f6260k;
                }
            }
            c4183b0.m8446h(null, enumC1885u12);
            if (enumC1885u12 != enumC1885u1) {
                return null;
            }
            C3564g c3564g = this.f6320r;
            this.f6320r = null;
            return c3564g;
        }
        List listM4661D = m4661D();
        int size = listM4661D.size();
        for (int i9 = 0; i9 < size; i9++) {
        }
        this.f6308f.clear();
        this.f6309g = C4173t.f13710g;
        this.f6310h = new C0945l0();
        c2046b.m5061g();
        arrayList2.clear();
        arrayList.clear();
        this.f6318p = null;
        C3564g c3564g2 = this.f6320r;
        if (c3564g2 != null) {
            c3564g2.mo7500w(null);
        }
        this.f6320r = null;
        c4183b02.getClass();
        c4183b02.m8446h(null, AbstractC4338c.f14500b);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m4671z() {
        return !this.f6322t && (((C3871a) ((C0289k) this.f6303a.f6043i).f840c).get() & 134217727) > 0;
    }

    @Override // p117i0.AbstractC1863o
    /* JADX INFO: renamed from: o */
    public final void mo4475o(Set set) {
    }
}
