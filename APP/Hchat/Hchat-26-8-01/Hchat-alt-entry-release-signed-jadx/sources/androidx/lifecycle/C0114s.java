package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import okio.C3193a;
import p012ah.C0086a;
import p039d.C0642a;
import p055e.AbstractC0800e;
import p055e.C0796a;
import p055e.C0797b;
import p055e.C0798c;
import p055e.C0799d;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p294u3.C4248a;
import tg.AbstractC4201s;
import tg.C4183b0;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0114s {

    /* JADX INFO: renamed from: a */
    public final boolean f298a;

    /* JADX INFO: renamed from: b */
    public C0796a f299b;

    /* JADX INFO: renamed from: c */
    public EnumC0107l f300c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f301d;

    /* JADX INFO: renamed from: e */
    public int f302e;

    /* JADX INFO: renamed from: f */
    public boolean f303f;

    /* JADX INFO: renamed from: g */
    public boolean f304g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f305h;

    /* JADX INFO: renamed from: i */
    public final C4183b0 f306i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0114s(InterfaceC0112q interfaceC0112q, boolean z9) {
        new AtomicReference(null);
        this.f298a = z9;
        this.f299b = new C0796a();
        EnumC0107l enumC0107l = EnumC0107l.f290h;
        this.f300c = enumC0107l;
        this.f305h = new ArrayList();
        this.f301d = new WeakReference(interfaceC0112q);
        this.f306i = AbstractC4201s.m8464b(enumC0107l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m552a(InterfaceC0111p interfaceC0111p) {
        InterfaceC0110o c0101f;
        C0113r c0113r;
        InterfaceC0112q interfaceC0112q;
        interfaceC0111p.getClass();
        m554c("addObserver");
        EnumC0107l enumC0107l = this.f300c;
        EnumC0107l enumC0107l2 = EnumC0107l.f289g;
        if (enumC0107l != enumC0107l2) {
            enumC0107l2 = EnumC0107l.f290h;
        }
        C0113r c0113r2 = new C0113r();
        HashMap map = AbstractC0115t.f307a;
        boolean z9 = interfaceC0111p instanceof InterfaceC0110o;
        boolean z10 = interfaceC0111p instanceof InterfaceC0097d;
        if (z9 && z10) {
            c0101f = new C0101f((InterfaceC0097d) interfaceC0111p, (InterfaceC0110o) interfaceC0111p);
        } else if (z10) {
            c0101f = new C0101f((InterfaceC0097d) interfaceC0111p, null);
        } else if (z9) {
            c0101f = (InterfaceC0110o) interfaceC0111p;
        } else {
            Class<?> cls = interfaceC0111p.getClass();
            if (AbstractC0115t.m561b(cls) == 2) {
                Object obj = AbstractC0115t.f308b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0115t.m560a((Constructor) list.get(0), interfaceC0111p);
                    throw null;
                }
                int size = list.size();
                InterfaceC0103h[] interfaceC0103hArr = new InterfaceC0103h[size];
                if (size > 0) {
                    AbstractC0115t.m560a((Constructor) list.get(0), interfaceC0111p);
                    throw null;
                }
                c0101f = new C4248a(interfaceC0103hArr);
            } else {
                c0101f = new C0101f(interfaceC0111p);
            }
        }
        c0113r2.f297b = c0101f;
        c0113r2.f296a = enumC0107l2;
        C0796a c0796a = this.f299b;
        C0798c c0798c = (C0798c) c0796a.f2387k.get(interfaceC0111p);
        if (c0798c != null) {
            c0113r = c0798c.f2392h;
        } else {
            HashMap map2 = c0796a.f2387k;
            C0798c c0798c2 = new C0798c(interfaceC0111p, c0113r2);
            c0796a.f2386j++;
            C0798c c0798c3 = c0796a.f2384h;
            if (c0798c3 == null) {
                c0796a.f2383g = c0798c2;
                c0796a.f2384h = c0798c2;
            } else {
                c0798c3.f2393i = c0798c2;
                c0798c2.f2394j = c0798c3;
                c0796a.f2384h = c0798c2;
            }
            map2.put(interfaceC0111p, c0798c2);
            c0113r = null;
        }
        if (c0113r == null && (interfaceC0112q = (InterfaceC0112q) this.f301d.get()) != null) {
            boolean z11 = this.f302e != 0 || this.f303f;
            EnumC0107l enumC0107lM553b = m553b(interfaceC0111p);
            this.f302e++;
            while (c0113r2.f296a.compareTo(enumC0107lM553b) < 0 && this.f299b.f2387k.containsKey(interfaceC0111p)) {
                EnumC0107l enumC0107l3 = c0113r2.f296a;
                ArrayList arrayList = this.f305h;
                arrayList.add(enumC0107l3);
                C0104i c0104i = EnumC0106k.Companion;
                EnumC0107l enumC0107l4 = c0113r2.f296a;
                c0104i.getClass();
                enumC0107l4.getClass();
                int iOrdinal = enumC0107l4.ordinal();
                EnumC0106k enumC0106k = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0106k.ON_RESUME : EnumC0106k.ON_START : EnumC0106k.ON_CREATE;
                if (enumC0106k == null) {
                    C3193a.m6823l(c0113r2.f296a, "no event up from ");
                    return;
                } else {
                    c0113r2.m551a(interfaceC0112q, enumC0106k);
                    arrayList.remove(arrayList.size() - 1);
                    enumC0107lM553b = m553b(interfaceC0111p);
                }
            }
            if (!z11) {
                m559h();
            }
            this.f302e--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final EnumC0107l m553b(InterfaceC0111p interfaceC0111p) {
        HashMap map = this.f299b.f2387k;
        C0798c c0798c = map.containsKey(interfaceC0111p) ? ((C0798c) map.get(interfaceC0111p)).f2394j : null;
        EnumC0107l enumC0107l = c0798c != null ? c0798c.f2392h.f296a : null;
        ArrayList arrayList = this.f305h;
        EnumC0107l enumC0107l2 = arrayList.isEmpty() ? null : (EnumC0107l) arrayList.get(arrayList.size() - 1);
        EnumC0107l enumC0107l3 = this.f300c;
        enumC0107l3.getClass();
        if (enumC0107l == null || enumC0107l.compareTo(enumC0107l3) >= 0) {
            enumC0107l = enumC0107l3;
        }
        return (enumC0107l2 == null || enumC0107l2.compareTo(enumC0107l) >= 0) ? enumC0107l : enumC0107l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m554c(String str) {
        C0642a c0642a;
        if (this.f298a) {
            if (C0642a.f2002d != null) {
                c0642a = C0642a.f2002d;
            } else {
                synchronized (C0642a.class) {
                    try {
                        if (C0642a.f2002d == null) {
                            C0642a.f2002d = new C0642a(0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c0642a = C0642a.f2002d;
            }
            ((C0642a) c0642a.f2003c).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C0086a.m449h(AbstractC0921a.m2251n("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m555d(EnumC0106k enumC0106k) {
        enumC0106k.getClass();
        m554c("handleLifecycleEvent");
        m556e(enumC0106k.m549a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m556e(EnumC0107l enumC0107l) {
        if (this.f300c == enumC0107l) {
            return;
        }
        InterfaceC0112q interfaceC0112q = (InterfaceC0112q) this.f301d.get();
        EnumC0107l enumC0107l2 = this.f300c;
        enumC0107l2.getClass();
        EnumC0107l enumC0107l3 = EnumC0107l.f290h;
        EnumC0107l enumC0107l4 = EnumC0107l.f289g;
        if (enumC0107l2 == enumC0107l3 && enumC0107l == enumC0107l4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0107l.f291i + "' to be moved to '" + enumC0107l + "' in component " + interfaceC0112q).toString());
        }
        if (enumC0107l2 == enumC0107l4 && enumC0107l2 != enumC0107l) {
            throw new IllegalStateException(("State is '" + enumC0107l4 + "' and cannot be moved to `" + enumC0107l + "` in component " + interfaceC0112q).toString());
        }
        this.f300c = enumC0107l;
        if (this.f303f || this.f302e != 0) {
            this.f304g = true;
            return;
        }
        this.f303f = true;
        m559h();
        this.f303f = false;
        if (this.f300c == enumC0107l4) {
            this.f299b = new C0796a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m557f(InterfaceC0111p interfaceC0111p) {
        interfaceC0111p.getClass();
        m554c("removeObserver");
        C0796a c0796a = this.f299b;
        WeakHashMap weakHashMap = c0796a.f2385i;
        HashMap map = c0796a.f2387k;
        C0798c c0798c = (C0798c) map.get(interfaceC0111p);
        if (c0798c != null) {
            c0796a.f2386j--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC0800e) it.next()).mo2031a(c0798c);
                }
            }
            C0798c c0798c2 = c0798c.f2394j;
            C0798c c0798c3 = c0798c.f2393i;
            if (c0798c2 != null) {
                c0798c2.f2393i = c0798c3;
            } else {
                c0796a.f2383g = c0798c3;
            }
            C0798c c0798c4 = c0798c.f2393i;
            if (c0798c4 != null) {
                c0798c4.f2394j = c0798c2;
            } else {
                c0796a.f2384h = c0798c2;
            }
            c0798c.f2393i = null;
            c0798c.f2394j = null;
        }
        map.remove(interfaceC0111p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m558g(EnumC0107l enumC0107l) {
        m554c("setCurrentState");
        m556e(enumC0107l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r11.f304g = false;
        r0 = r11.f300c;
        r1 = r11.f306i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = ug.AbstractC4338c.f14500b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r1.m8446h(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m559h() {
        InterfaceC0112q interfaceC0112q = (InterfaceC0112q) this.f301d.get();
        if (interfaceC0112q == null) {
            C2104o.m5276A("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C0796a c0796a = this.f299b;
            if (c0796a.f2386j != 0) {
                C0798c c0798c = c0796a.f2383g;
                c0798c.getClass();
                EnumC0107l enumC0107l = c0798c.f2392h.f296a;
                C0798c c0798c2 = this.f299b.f2384h;
                c0798c2.getClass();
                EnumC0107l enumC0107l2 = c0798c2.f2392h.f296a;
                if (enumC0107l == enumC0107l2 && this.f300c == enumC0107l2) {
                    break;
                }
                this.f304g = false;
                EnumC0107l enumC0107l3 = this.f300c;
                C0798c c0798c3 = this.f299b.f2383g;
                c0798c3.getClass();
                int iCompareTo = enumC0107l3.compareTo(c0798c3.f2392h.f296a);
                ArrayList arrayList = this.f305h;
                if (iCompareTo < 0) {
                    C0796a c0796a2 = this.f299b;
                    C0797b c0797b = new C0797b(c0796a2.f2384h, c0796a2.f2383g, 1);
                    c0796a2.f2385i.put(c0797b, Boolean.FALSE);
                    while (c0797b.hasNext() && !this.f304g) {
                        Map.Entry entry = (Map.Entry) c0797b.next();
                        entry.getClass();
                        InterfaceC0111p interfaceC0111p = (InterfaceC0111p) entry.getKey();
                        C0113r c0113r = (C0113r) entry.getValue();
                        while (c0113r.f296a.compareTo(this.f300c) > 0 && !this.f304g && this.f299b.f2387k.containsKey(interfaceC0111p)) {
                            C0104i c0104i = EnumC0106k.Companion;
                            EnumC0107l enumC0107l4 = c0113r.f296a;
                            c0104i.getClass();
                            enumC0107l4.getClass();
                            int iOrdinal = enumC0107l4.ordinal();
                            EnumC0106k enumC0106k = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0106k.ON_PAUSE : EnumC0106k.ON_STOP : EnumC0106k.ON_DESTROY;
                            if (enumC0106k == null) {
                                C3193a.m6823l(c0113r.f296a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(enumC0106k.m549a());
                                c0113r.m551a(interfaceC0112q, enumC0106k);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                C0798c c0798c4 = this.f299b.f2384h;
                if (!this.f304g && c0798c4 != null && this.f300c.compareTo(c0798c4.f2392h.f296a) > 0) {
                    C0796a c0796a3 = this.f299b;
                    c0796a3.getClass();
                    C0799d c0799d = new C0799d(c0796a3);
                    c0796a3.f2385i.put(c0799d, Boolean.FALSE);
                    while (c0799d.hasNext() && !this.f304g) {
                        Map.Entry entry2 = (Map.Entry) c0799d.next();
                        InterfaceC0111p interfaceC0111p2 = (InterfaceC0111p) entry2.getKey();
                        C0113r c0113r2 = (C0113r) entry2.getValue();
                        while (c0113r2.f296a.compareTo(this.f300c) < 0 && !this.f304g && this.f299b.f2387k.containsKey(interfaceC0111p2)) {
                            arrayList.add(c0113r2.f296a);
                            C0104i c0104i2 = EnumC0106k.Companion;
                            EnumC0107l enumC0107l5 = c0113r2.f296a;
                            c0104i2.getClass();
                            enumC0107l5.getClass();
                            int iOrdinal2 = enumC0107l5.ordinal();
                            EnumC0106k enumC0106k2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0106k.ON_RESUME : EnumC0106k.ON_START : EnumC0106k.ON_CREATE;
                            if (enumC0106k2 == null) {
                                C3193a.m6823l(c0113r2.f296a, "no event up from ");
                                return;
                            } else {
                                c0113r2.m551a(interfaceC0112q, enumC0106k2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
