package p095T;

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
import p000A.C0010F;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0066i0;
import p000A.C0072l0;
import p000A.C0073m;
import p001A0.C0102b;
import p014C1.C0240b;
import p029F0.C0363A;
import p047I0.C0711a0;
import p056K2.C0882h;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p074O2.InterfaceC1051i;
import p105V.C1479a;
import p105V.C1483e;
import p105V.C1486h;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p124Z.C1778b;
import p136b0.C1839a;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.C2070b;
import p158f0.C2076h;
import p160f3.C2117U;
import p160f3.C2135g;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2133f;
import p178i3.AbstractC2339t;
import p178i3.C2318C;
import p186k.AbstractC2416M;
import p186k.C2408E;
import p186k.C2409F;

/* JADX INFO: renamed from: T.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1400z0 extends AbstractC1391v {

    /* JADX INFO: renamed from: a */
    public final C0711a0 f4995a;

    /* JADX INFO: renamed from: b */
    public final C0072l0 f4996b;

    /* JADX INFO: renamed from: c */
    public final Object f4997c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2115S f4998d;

    /* JADX INFO: renamed from: e */
    public Throwable f4999e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5000f;

    /* JADX INFO: renamed from: g */
    public Object f5001g;

    /* JADX INFO: renamed from: h */
    public C2409F f5002h;

    /* JADX INFO: renamed from: i */
    public final C1483e f5003i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f5004j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f5005k;

    /* JADX INFO: renamed from: l */
    public final C2408E f5006l;

    /* JADX INFO: renamed from: m */
    public final C0038T0 f5007m;

    /* JADX INFO: renamed from: n */
    public final C2408E f5008n;

    /* JADX INFO: renamed from: o */
    public final C2408E f5009o;

    /* JADX INFO: renamed from: p */
    public ArrayList f5010p;

    /* JADX INFO: renamed from: q */
    public LinkedHashSet f5011q;

    /* JADX INFO: renamed from: r */
    public C2135g f5012r;

    /* JADX INFO: renamed from: s */
    public C0066i0 f5013s;

    /* JADX INFO: renamed from: t */
    public boolean f5014t;

    /* JADX INFO: renamed from: u */
    public final C2318C f5015u;

    /* JADX INFO: renamed from: v */
    public final C0072l0 f5016v;

    /* JADX INFO: renamed from: w */
    public final C2117U f5017w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1051i f5018x;

    /* JADX INFO: renamed from: y */
    public final C1357e f5019y;

    /* JADX INFO: renamed from: z */
    public static final C2318C f4994z = AbstractC2339t.m4166b(C1778b.f6080g);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f4993A = new AtomicReference(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1400z0(InterfaceC1051i interfaceC1051i) {
        C0711a0 c0711a0 = new C0711a0(new C1390u0(this, 0));
        this.f4995a = c0711a0;
        this.f4996b = new C0072l0(new C1390u0(this, 1));
        this.f4997c = new Object();
        this.f5000f = new ArrayList();
        this.f5002h = new C2409F();
        this.f5003i = new C1483e(new C1397y[16]);
        this.f5004j = new ArrayList();
        this.f5005k = new ArrayList();
        this.f5006l = new C2408E();
        this.f5007m = new C0038T0(14);
        this.f5008n = new C2408E();
        this.f5009o = new C2408E();
        this.f5015u = AbstractC2339t.m4166b(EnumC1392v0.f4936f);
        this.f5016v = new C0072l0(16);
        C2117U c2117u = new C2117U((InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e));
        c2117u.mo3909w(new C0049a(13, this));
        this.f5017w = c2117u;
        this.f5018x = interfaceC1051i.mo1168m(c0711a0).mo1168m(c2117u);
        this.f5019y = new C1357e(9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final void m2675G(ArrayList arrayList, C1400z0 c1400z0, C1397y c1397y) {
        arrayList.clear();
        synchronized (c1400z0.f4997c) {
            Iterator it = c1400z0.f5005k.iterator();
            if (it.hasNext()) {
                ((AbstractC1346X) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m2676w(C2070b c2070b) {
        try {
            if (c2070b.mo3800w() instanceof C2076h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c2070b.mo3787c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m2677A() {
        return this.f5003i.f5183f != 0 || m2690z() || m2678B() || this.f5006l.m4275j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m2678B() {
        return !this.f5014t && (((C1839a) ((C0240b) this.f4996b.f308f).f810c).get() & 134217727) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2679C() {
        boolean z5;
        synchronized (this.f4997c) {
            if (this.f5002h.m4286h() || this.f5003i.f5183f != 0 || m2690z()) {
                z5 = true;
            } else if (!m2678B()) {
                z5 = false;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: D */
    public final List m2680D() {
        ?? r02 = this.f5001g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f5000f;
        List arrayList2 = arrayList.isEmpty() ? C0981u.f3047d : new ArrayList(arrayList);
        this.f5001g = arrayList2;
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m2681E() {
        InterfaceC2133f interfaceC2133fM2689y;
        synchronized (this.f4997c) {
            interfaceC2133fM2689y = m2689y();
            if (((EnumC1392v0) this.f5015u.getValue()).compareTo(EnumC1392v0.f4935e) <= 0) {
                Throwable th = this.f4999e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (interfaceC2133fM2689y != null) {
            ((C2135g) interfaceC2133fM2689y).mo278i(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m2682F(C1397y c1397y) {
        synchronized (this.f4997c) {
            ArrayList arrayList = this.f5005k;
            if (arrayList.size() > 0) {
                ((AbstractC1346X) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
    
        if (((p056K2.C0882h) r10.get(r4)).f2770e == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015e, code lost:
    
        r11 = (p056K2.C0882h) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if (r11.f2770e != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        r11 = (p095T.AbstractC1346X) r11.f2769d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        r4 = r17.f4997c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0175, code lost:
    
        p061L2.AbstractC0978r.m2032N(r3, r17.f5005k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        if (((p056K2.C0882h) r11).f2770e == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
    
        r10 = r3;
     */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2683H(List list, C2409F c2409f) {
        C2070b c2070bMo3799C;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            ((AbstractC1346X) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C1397y c1397y = (C1397y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c1397y.f4976y.f4868F) {
                AbstractC1387t.m2638a("Check failed");
            }
            C0049a c0049a = new C0049a(12, c1397y);
            C0010F c0010f = new C0010F(4, c1397y, c2409f);
            AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
            C2070b c2070b = abstractC2074fM3834j instanceof C2070b ? (C2070b) abstractC2074fM3834j : null;
            if (c2070b == null || (c2070bMo3799C = c2070b.mo3799C(c0049a, c0010f)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC2074f abstractC2074fM3813j = c2070bMo3799C.m3813j();
                try {
                    synchronized (this.f4997c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                AbstractC1346X abstractC1346X = (AbstractC1346X) list2.get(i6);
                                C2408E c2408e = this.f5006l;
                                abstractC1346X.getClass();
                                Object objM2750a = C1479a.m2750a(c2408e);
                                arrayList.add(new C0882h(abstractC1346X, objM2750a));
                            }
                            int size3 = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    break;
                                }
                                C0882h c0882h = (C0882h) arrayList.get(i7);
                                if (c0882h.f2770e == null) {
                                    C0038T0 c0038t0 = this.f5007m;
                                    ((AbstractC1346X) c0882h.f2769d).getClass();
                                    if (((C2408E) c0038t0.f169e).m4267b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i8 = 0; i8 < size4; i8++) {
                                            C0882h c0882h2 = (C0882h) arrayList.get(i8);
                                            if (c0882h2.f2770e == null) {
                                                C0038T0 c0038t02 = this.f5007m;
                                                ((AbstractC1346X) c0882h2.f2769d).getClass();
                                                C2408E c2408e2 = (C2408E) c0038t02.f169e;
                                                if (c2408e2.m4274i()) {
                                                    ((C2408E) c0038t02.f170f).m4266a();
                                                }
                                            }
                                            arrayList3.add(c0882h2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i7++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size5) {
                            break;
                        }
                        if (((C0882h) arrayList.get(i9)).f2770e != null) {
                            break;
                        }
                        i9++;
                    }
                    c1397y.m2664r(arrayList);
                    AbstractC2074f.m3811q(abstractC2074fM3813j);
                } catch (Throwable th) {
                    AbstractC2074f.m3811q(abstractC2074fM3813j);
                    throw th;
                }
            } finally {
                m2676w(c2070bMo3799C);
            }
        }
        return AbstractC0973m.m2024e0(map.keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final C1397y m2684I(C1397y c1397y, C2409F c2409f) {
        C2070b c2070bMo3799C;
        if (c1397y.f4976y.f4868F || c1397y.f4977z == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f5011q;
        if (linkedHashSet == null || !linkedHashSet.contains(c1397y)) {
            C0049a c0049a = new C0049a(12, c1397y);
            C0010F c0010f = new C0010F(4, c1397y, c2409f);
            AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
            C2070b c2070b = abstractC2074fM3834j instanceof C2070b ? (C2070b) abstractC2074fM3834j : null;
            if (c2070b == null || (c2070bMo3799C = c2070b.mo3799C(c0049a, c0010f)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC2074f abstractC2074fM3813j = c2070bMo3799C.m3813j();
                if (c2409f != null) {
                    try {
                        if (c2409f.m4286h()) {
                            C0073m c0073m = new C0073m(13, c2409f, c1397y);
                            C1383r c1383r = c1397y.f4976y;
                            if (c1383r.f4868F) {
                                AbstractC1387t.m2638a("Preparing a composition while composing is not supported");
                            }
                            c1383r.f4868F = true;
                            try {
                                c0073m.mo6a();
                                c1383r.f4868F = false;
                            } catch (Throwable th) {
                                c1383r.f4868F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC2074f.m3811q(abstractC2074fM3813j);
                        throw th2;
                    }
                }
                boolean zM2670x = c1397y.m2670x();
                AbstractC2074f.m3811q(abstractC2074fM3813j);
                if (zM2670x) {
                    return c1397y;
                }
            } finally {
                m2676w(c2070bMo3799C);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m2685J(Throwable th, C1397y c1397y) throws Throwable {
        if (!((Boolean) f4993A.get()).booleanValue() || (th instanceof C1369k)) {
            synchronized (this.f4997c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C0066i0 c0066i0 = this.f5013s;
                if (c0066i0 != null) {
                    throw ((Throwable) c0066i0.f297e);
                }
                this.f5013s = new C0066i0(19, th);
            }
            throw th;
        }
        synchronized (this.f4997c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f5004j.clear();
                this.f5003i.m2758g();
                this.f5002h = new C2409F();
                this.f5005k.clear();
                this.f5006l.m4266a();
                this.f5008n.m4266a();
                this.f5013s = new C0066i0(19, th);
                if (c1397y != null) {
                    m2687L(c1397y);
                }
                m2689y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m2686K() {
        boolean zM2677A;
        synchronized (this.f4997c) {
            if (this.f5002h.m4285g()) {
                return m2677A();
            }
            List listM2680D = m2680D();
            C1486h c1486h = new C1486h(this.f5002h);
            this.f5002h = new C2409F();
            try {
                int size = listM2680D.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((C1397y) listM2680D.get(i5)).m2671y(c1486h);
                    if (((EnumC1392v0) this.f5015u.getValue()).compareTo(EnumC1392v0.f4935e) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4997c) {
                    if (m2689y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM2677A = m2677A();
                }
                return zM2677A;
            } catch (Throwable th) {
                synchronized (this.f4997c) {
                    C2409F c2409f = this.f5002h;
                    c2409f.getClass();
                    Iterator<E> it = c1486h.iterator();
                    while (it.hasNext()) {
                        c2409f.m4288j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m2687L(C1397y c1397y) {
        ArrayList arrayList = this.f5010p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5010p = arrayList;
        }
        if (!arrayList.contains(c1397y)) {
            arrayList.add(c1397y);
        }
        if (this.f5000f.remove(c1397y)) {
            this.f5001g = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: a */
    public final void mo2519a(C1397y c1397y, InterfaceC1603e interfaceC1603e) throws Throwable {
        EnumC1392v0 enumC1392v0;
        boolean zContains;
        C2070b c2070bMo3799C;
        boolean z5 = c1397y.f4976y.f4868F;
        synchronized (this.f4997c) {
            EnumC1392v0 enumC1392v02 = (EnumC1392v0) this.f5015u.getValue();
            enumC1392v0 = EnumC1392v0.f4935e;
            zContains = enumC1392v02.compareTo(enumC1392v0) > 0 ? true ^ m2680D().contains(c1397y) : true;
        }
        try {
            C0049a c0049a = new C0049a(12, c1397y);
            C0010F c0010f = new C0010F(4, c1397y, null);
            AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
            C2070b c2070b = abstractC2074fM3834j instanceof C2070b ? (C2070b) abstractC2074fM3834j : null;
            if (c2070b == null || (c2070bMo3799C = c2070b.mo3799C(c0049a, c0010f)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC2074f abstractC2074fM3813j = c2070bMo3799C.m3813j();
                try {
                    c1397y.m2656j(interfaceC1603e);
                    synchronized (this.f4997c) {
                        if (((EnumC1392v0) this.f5015u.getValue()).compareTo(enumC1392v0) > 0 && !m2680D().contains(c1397y)) {
                            this.f5000f.add(c1397y);
                            this.f5001g = null;
                        }
                    }
                    if (!z5) {
                        AbstractC2082n.m3834j().mo3795m();
                    }
                    try {
                        m2682F(c1397y);
                        try {
                            c1397y.m2650d();
                            c1397y.m2652f();
                            if (z5) {
                                return;
                            }
                            AbstractC2082n.m3834j().mo3795m();
                        } catch (Throwable th) {
                            m2685J(th, null);
                        }
                    } catch (Throwable th2) {
                        m2685J(th2, c1397y);
                    }
                } finally {
                    AbstractC2074f.m3811q(abstractC2074fM3813j);
                }
            } finally {
                m2676w(c2070bMo3799C);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f4997c) {
                }
            }
            m2685J(th3, c1397y);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: b */
    public final C2409F mo2520b(C1397y c1397y, C0363A c0363a, InterfaceC1603e interfaceC1603e) {
        C0072l0 c0072l0 = this.f5016v;
        try {
            C0363A c0363a2 = c1397y.f4970s;
            c1397y.f4970s = c0363a;
            try {
                mo2519a(c1397y, interfaceC1603e);
                C2409F c2409f = (C2409F) c0072l0.m105i();
                if (c2409f == null) {
                    c2409f = AbstractC2416M.f7817a;
                    AbstractC1665j.m2983c(c2409f, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return c2409f;
            } finally {
                c1397y.f4970s = c0363a2;
            }
        } finally {
            c0072l0.m115u(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: d */
    public final boolean mo2522d() {
        return ((Boolean) f4993A.get()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: e */
    public final boolean mo2523e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: f */
    public final boolean mo2524f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: g */
    public final long mo2525g() {
        return 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: h */
    public final InterfaceC1389u mo2526h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo2528j() {
        return this.f5018x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: k */
    public final boolean mo2529k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: l */
    public final void mo2530l(C1397y c1397y) {
        InterfaceC2133f interfaceC2133fM2689y;
        synchronized (this.f4997c) {
            if (this.f5003i.m2759h(c1397y)) {
                interfaceC2133fM2689y = null;
            } else {
                this.f5003i.m2753b(c1397y);
                interfaceC2133fM2689y = m2689y();
            }
        }
        if (interfaceC2133fM2689y != null) {
            ((C2135g) interfaceC2133fM2689y).mo278i(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: m */
    public final AbstractC1344W mo2531m(AbstractC1346X abstractC1346X) {
        AbstractC1344W abstractC1344W;
        synchronized (this.f4997c) {
            abstractC1344W = (AbstractC1344W) this.f5008n.m4276k(abstractC1346X);
        }
        return abstractC1344W;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: n */
    public final C2409F mo2532n(C1397y c1397y, C0363A c0363a, C2409F c2409f) {
        C0072l0 c0072l0 = this.f5016v;
        try {
            m2686K();
            c1397y.m2671y(new C1486h(c2409f));
            C0363A c0363a2 = c1397y.f4970s;
            c1397y.f4970s = c0363a;
            try {
                C1397y c1397yM2684I = m2684I(c1397y, null);
                if (c1397yM2684I != null) {
                    m2682F(c1397y);
                    c1397yM2684I.m2650d();
                    c1397yM2684I.m2652f();
                }
                C2409F c2409f2 = (C2409F) c0072l0.m105i();
                if (c2409f2 == null) {
                    c2409f2 = AbstractC2416M.f7817a;
                    AbstractC1665j.m2983c(c2409f2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return c2409f2;
            } finally {
                c1397y.f4970s = c0363a2;
            }
        } finally {
            c0072l0.m115u(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: q */
    public final void mo2535q(C1388t0 c1388t0) {
        C0072l0 c0072l0 = this.f5016v;
        C2409F c2409f = (C2409F) c0072l0.m105i();
        if (c2409f == null) {
            C2409F c2409f2 = AbstractC2416M.f7817a;
            c2409f = new C2409F();
            c0072l0.m115u(c2409f);
        }
        c2409f.m4279a(c1388t0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: r */
    public final void mo2536r(C1397y c1397y) {
        synchronized (this.f4997c) {
            try {
                LinkedHashSet linkedHashSet = this.f5011q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f5011q = linkedHashSet;
                }
                linkedHashSet.add(c1397y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: s */
    public final InterfaceC1359f mo2537s(C0102b c0102b) {
        C0072l0 c0072l0 = this.f4996b;
        C0240b c0240b = (C0240b) c0072l0.f308f;
        C1350a0 c1350a0 = new C1350a0();
        c1350a0.f4784a = c0102b;
        return c0240b.m427d(c1350a0, (C0073m) c0072l0.f309g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: v */
    public final void mo2540v(C1397y c1397y) {
        synchronized (this.f4997c) {
            if (this.f5000f.remove(c1397y)) {
                this.f5001g = null;
            }
            this.f5003i.m2761j(c1397y);
            this.f5004j.remove(c1397y);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m2688x() {
        synchronized (this.f4997c) {
            if (((EnumC1392v0) this.f5015u.getValue()).compareTo(EnumC1392v0.f4938h) >= 0) {
                C2318C c2318c = this.f5015u;
                EnumC1392v0 enumC1392v0 = EnumC1392v0.f4935e;
                c2318c.getClass();
                c2318c.m4147g(null, enumC1392v0);
            }
        }
        this.f5017w.mo3905c(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final InterfaceC2133f m2689y() {
        C2318C c2318c = this.f5015u;
        int iCompareTo = ((EnumC1392v0) c2318c.getValue()).compareTo(EnumC1392v0.f4935e);
        ArrayList arrayList = this.f5005k;
        ArrayList arrayList2 = this.f5004j;
        C1483e c1483e = this.f5003i;
        if (iCompareTo > 0) {
            C0066i0 c0066i0 = this.f5013s;
            EnumC1392v0 enumC1392v0 = EnumC1392v0.f4939i;
            EnumC1392v0 enumC1392v02 = EnumC1392v0.f4936f;
            if (c0066i0 == null) {
                if (this.f4998d == null) {
                    this.f5002h = new C2409F();
                    c1483e.m2758g();
                    if (m2690z() || m2678B()) {
                        enumC1392v02 = EnumC1392v0.f4937g;
                    }
                } else {
                    enumC1392v02 = (c1483e.f5183f != 0 || this.f5002h.m4286h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m2690z() || m2678B() || this.f5006l.m4275j()) ? enumC1392v0 : EnumC1392v0.f4938h;
                }
            }
            c2318c.getClass();
            c2318c.m4147g(null, enumC1392v02);
            if (enumC1392v02 != enumC1392v0) {
                return null;
            }
            C2135g c2135g = this.f5012r;
            this.f5012r = null;
            return c2135g;
        }
        List listM2680D = m2680D();
        int size = listM2680D.size();
        for (int i5 = 0; i5 < size; i5++) {
        }
        this.f5000f.clear();
        this.f5001g = C0981u.f3047d;
        this.f5002h = new C2409F();
        c1483e.m2758g();
        arrayList2.clear();
        arrayList.clear();
        this.f5010p = null;
        C2135g c2135g2 = this.f5012r;
        if (c2135g2 != null) {
            c2135g2.mo3952k(null);
        }
        this.f5012r = null;
        this.f5013s = null;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m2690z() {
        return !this.f5014t && (((C1839a) ((C0240b) this.f4995a.f2253f).f810c).get() & 134217727) > 0;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: o */
    public final void mo2533o(Set set) {
    }
}
