package p002A1;

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
import p011B4.AbstractC0231b;
import p048I1.C0777b;
import p117X2.AbstractC1665j;
import p174i.C2264a;
import p178i3.AbstractC2339t;
import p178i3.C2318C;
import p180j.AbstractC2365e;
import p180j.C2361a;
import p180j.C2362b;
import p180j.C2363c;
import p180j.C2364d;

/* JADX INFO: renamed from: A1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0147t extends AbstractC0142o {

    /* JADX INFO: renamed from: a */
    public final boolean f539a;

    /* JADX INFO: renamed from: b */
    public C2361a f540b;

    /* JADX INFO: renamed from: c */
    public EnumC0141n f541c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f542d;

    /* JADX INFO: renamed from: e */
    public int f543e;

    /* JADX INFO: renamed from: f */
    public boolean f544f;

    /* JADX INFO: renamed from: g */
    public boolean f545g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f546h;

    /* JADX INFO: renamed from: i */
    public final C2318C f547i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0147t(InterfaceC0145r interfaceC0145r, boolean z5) {
        new AtomicReference(null);
        this.f539a = z5;
        this.f540b = new C2361a();
        EnumC0141n enumC0141n = EnumC0141n.f532e;
        this.f541c = enumC0141n;
        this.f546h = new ArrayList();
        this.f542d = new WeakReference(interfaceC0145r);
        this.f547i = AbstractC2339t.m4166b(enumC0141n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.AbstractC0142o
    /* JADX INFO: renamed from: a */
    public final void mo184a(InterfaceC0144q interfaceC0144q) {
        InterfaceC0143p c0134g;
        C0146s c0146s;
        InterfaceC0145r interfaceC0145r;
        AbstractC1665j.m2985e(interfaceC0144q, "observer");
        m188d("addObserver");
        EnumC0141n enumC0141n = this.f541c;
        EnumC0141n enumC0141n2 = EnumC0141n.f531d;
        if (enumC0141n != enumC0141n2) {
            enumC0141n2 = EnumC0141n.f532e;
        }
        C0146s c0146s2 = new C0146s();
        HashMap map = AbstractC0148u.f548a;
        boolean z5 = interfaceC0144q instanceof InterfaceC0143p;
        boolean z6 = interfaceC0144q instanceof InterfaceC0132e;
        int i5 = 1;
        if (z5 && z6) {
            c0134g = new C0134g((InterfaceC0132e) interfaceC0144q, (InterfaceC0143p) interfaceC0144q);
        } else if (z6) {
            c0134g = new C0134g((InterfaceC0132e) interfaceC0144q, (InterfaceC0143p) null);
        } else if (z5) {
            c0134g = (InterfaceC0143p) interfaceC0144q;
        } else {
            Class<?> cls = interfaceC0144q.getClass();
            if (AbstractC0148u.m193b(cls) == 2) {
                Object obj = AbstractC0148u.f549b.get(cls);
                AbstractC1665j.m2982b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0148u.m192a((Constructor) list.get(0), interfaceC0144q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0135h[] interfaceC0135hArr = new InterfaceC0135h[size];
                if (size > 0) {
                    AbstractC0148u.m192a((Constructor) list.get(0), interfaceC0144q);
                    throw null;
                }
                c0134g = new C0777b(i5, interfaceC0135hArr);
            } else {
                c0134g = new C0134g(interfaceC0144q);
            }
        }
        c0146s2.f538b = c0134g;
        c0146s2.f537a = enumC0141n2;
        C2361a c2361a = this.f540b;
        C2363c c2363c = (C2363c) c2361a.f7662h.get(interfaceC0144q);
        if (c2363c != null) {
            c0146s = c2363c.f7667e;
        } else {
            HashMap map2 = c2361a.f7662h;
            C2363c c2363c2 = new C2363c(interfaceC0144q, c0146s2);
            c2361a.f7661g++;
            C2363c c2363c3 = c2361a.f7659e;
            if (c2363c3 == null) {
                c2361a.f7658d = c2363c2;
                c2361a.f7659e = c2363c2;
            } else {
                c2363c3.f7668f = c2363c2;
                c2363c2.f7669g = c2363c3;
                c2361a.f7659e = c2363c2;
            }
            map2.put(interfaceC0144q, c2363c2);
            c0146s = null;
        }
        if (c0146s == null && (interfaceC0145r = (InterfaceC0145r) this.f542d.get()) != null) {
            boolean z7 = this.f543e != 0 || this.f544f;
            EnumC0141n enumC0141nM187c = m187c(interfaceC0144q);
            this.f543e++;
            while (c0146s2.f537a.compareTo(enumC0141nM187c) < 0 && this.f540b.f7662h.containsKey(interfaceC0144q)) {
                EnumC0141n enumC0141n3 = c0146s2.f537a;
                ArrayList arrayList = this.f546h;
                arrayList.add(enumC0141n3);
                C0138k c0138k = EnumC0140m.Companion;
                EnumC0141n enumC0141n4 = c0146s2.f537a;
                c0138k.getClass();
                AbstractC1665j.m2985e(enumC0141n4, "state");
                int iOrdinal = enumC0141n4.ordinal();
                EnumC0140m enumC0140m = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0140m.ON_RESUME : EnumC0140m.ON_START : EnumC0140m.ON_CREATE;
                if (enumC0140m == null) {
                    throw new IllegalStateException("no event up from " + c0146s2.f537a);
                }
                c0146s2.m186a(interfaceC0145r, enumC0140m);
                arrayList.remove(arrayList.size() - 1);
                enumC0141nM187c = m187c(interfaceC0144q);
            }
            if (!z7) {
                m191g();
            }
            this.f543e--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.AbstractC0142o
    /* JADX INFO: renamed from: b */
    public final void mo185b(InterfaceC0144q interfaceC0144q) {
        AbstractC1665j.m2985e(interfaceC0144q, "observer");
        m188d("removeObserver");
        C2361a c2361a = this.f540b;
        WeakHashMap weakHashMap = c2361a.f7660f;
        HashMap map = c2361a.f7662h;
        C2363c c2363c = (C2363c) map.get(interfaceC0144q);
        if (c2363c != null) {
            c2361a.f7661g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC2365e) it.next()).mo4216a(c2363c);
                }
            }
            C2363c c2363c2 = c2363c.f7669g;
            if (c2363c2 != null) {
                c2363c2.f7668f = c2363c.f7668f;
            } else {
                c2361a.f7658d = c2363c.f7668f;
            }
            C2363c c2363c3 = c2363c.f7668f;
            if (c2363c3 != null) {
                c2363c3.f7669g = c2363c2;
            } else {
                c2361a.f7659e = c2363c2;
            }
            c2363c.f7668f = null;
            c2363c.f7669g = null;
        }
        map.remove(interfaceC0144q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final EnumC0141n m187c(InterfaceC0144q interfaceC0144q) {
        HashMap map = this.f540b.f7662h;
        C2363c c2363c = map.containsKey(interfaceC0144q) ? ((C2363c) map.get(interfaceC0144q)).f7669g : null;
        EnumC0141n enumC0141n = c2363c != null ? c2363c.f7667e.f537a : null;
        ArrayList arrayList = this.f546h;
        EnumC0141n enumC0141n2 = arrayList.isEmpty() ? null : (EnumC0141n) arrayList.get(arrayList.size() - 1);
        EnumC0141n enumC0141n3 = this.f541c;
        AbstractC1665j.m2985e(enumC0141n3, "state1");
        if (enumC0141n == null || enumC0141n.compareTo(enumC0141n3) >= 0) {
            enumC0141n = enumC0141n3;
        }
        return (enumC0141n2 == null || enumC0141n2.compareTo(enumC0141n) >= 0) ? enumC0141n : enumC0141n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m188d(String str) {
        C2264a c2264a;
        if (this.f539a) {
            if (C2264a.f7406d != null) {
                c2264a = C2264a.f7406d;
            } else {
                synchronized (C2264a.class) {
                    try {
                        if (C2264a.f7406d == null) {
                            C2264a.f7406d = new C2264a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c2264a = C2264a.f7406d;
            }
            ((C2264a) c2264a.f7407c).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0231b.m400k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m189e(EnumC0140m enumC0140m) {
        AbstractC1665j.m2985e(enumC0140m, "event");
        m188d("handleLifecycleEvent");
        m190f(enumC0140m.m183a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m190f(EnumC0141n enumC0141n) {
        if (this.f541c == enumC0141n) {
            return;
        }
        InterfaceC0145r interfaceC0145r = (InterfaceC0145r) this.f542d.get();
        EnumC0141n enumC0141n2 = this.f541c;
        AbstractC1665j.m2985e(enumC0141n2, "current");
        EnumC0141n enumC0141n3 = EnumC0141n.f532e;
        EnumC0141n enumC0141n4 = EnumC0141n.f531d;
        if (enumC0141n2 == enumC0141n3 && enumC0141n == enumC0141n4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0141n.f533f + "' to be moved to '" + enumC0141n + "' in component " + interfaceC0145r).toString());
        }
        if (enumC0141n2 == enumC0141n4 && enumC0141n2 != enumC0141n) {
            throw new IllegalStateException(("State is '" + enumC0141n4 + "' and cannot be moved to `" + enumC0141n + "` in component " + interfaceC0145r).toString());
        }
        this.f541c = enumC0141n;
        if (this.f544f || this.f543e != 0) {
            this.f545g = true;
            return;
        }
        this.f544f = true;
        m191g();
        this.f544f = false;
        if (this.f541c == enumC0141n4) {
            this.f540b = new C2361a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r12.f545g = false;
        r0 = r12.f541c;
        r1 = r12.f547i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = p184j3.AbstractC2384c.f7730b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r1.m4147g(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m191g() {
        InterfaceC0145r interfaceC0145r = (InterfaceC0145r) this.f542d.get();
        if (interfaceC0145r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C2361a c2361a = this.f540b;
            if (c2361a.f7661g != 0) {
                C2363c c2363c = c2361a.f7658d;
                AbstractC1665j.m2982b(c2363c);
                EnumC0141n enumC0141n = c2363c.f7667e.f537a;
                C2363c c2363c2 = this.f540b.f7659e;
                AbstractC1665j.m2982b(c2363c2);
                EnumC0141n enumC0141n2 = c2363c2.f7667e.f537a;
                if (enumC0141n == enumC0141n2 && this.f541c == enumC0141n2) {
                    break;
                }
                this.f545g = false;
                EnumC0141n enumC0141n3 = this.f541c;
                C2363c c2363c3 = this.f540b.f7658d;
                AbstractC1665j.m2982b(c2363c3);
                int iCompareTo = enumC0141n3.compareTo(c2363c3.f7667e.f537a);
                ArrayList arrayList = this.f546h;
                if (iCompareTo < 0) {
                    C2361a c2361a2 = this.f540b;
                    C2362b c2362b = new C2362b(c2361a2.f7659e, c2361a2.f7658d, 1);
                    c2361a2.f7660f.put(c2362b, Boolean.FALSE);
                    while (c2362b.hasNext() && !this.f545g) {
                        Map.Entry entry = (Map.Entry) c2362b.next();
                        AbstractC1665j.m2982b(entry);
                        InterfaceC0144q interfaceC0144q = (InterfaceC0144q) entry.getKey();
                        C0146s c0146s = (C0146s) entry.getValue();
                        while (c0146s.f537a.compareTo(this.f541c) > 0 && !this.f545g && this.f540b.f7662h.containsKey(interfaceC0144q)) {
                            C0138k c0138k = EnumC0140m.Companion;
                            EnumC0141n enumC0141n4 = c0146s.f537a;
                            c0138k.getClass();
                            AbstractC1665j.m2985e(enumC0141n4, "state");
                            int iOrdinal = enumC0141n4.ordinal();
                            EnumC0140m enumC0140m = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0140m.ON_PAUSE : EnumC0140m.ON_STOP : EnumC0140m.ON_DESTROY;
                            if (enumC0140m == null) {
                                throw new IllegalStateException("no event down from " + c0146s.f537a);
                            }
                            arrayList.add(enumC0140m.m183a());
                            c0146s.m186a(interfaceC0145r, enumC0140m);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C2363c c2363c4 = this.f540b.f7659e;
                if (!this.f545g && c2363c4 != null && this.f541c.compareTo(c2363c4.f7667e.f537a) > 0) {
                    C2361a c2361a3 = this.f540b;
                    c2361a3.getClass();
                    C2364d c2364d = new C2364d(c2361a3);
                    c2361a3.f7660f.put(c2364d, Boolean.FALSE);
                    while (c2364d.hasNext() && !this.f545g) {
                        Map.Entry entry2 = (Map.Entry) c2364d.next();
                        InterfaceC0144q interfaceC0144q2 = (InterfaceC0144q) entry2.getKey();
                        C0146s c0146s2 = (C0146s) entry2.getValue();
                        while (c0146s2.f537a.compareTo(this.f541c) < 0 && !this.f545g && this.f540b.f7662h.containsKey(interfaceC0144q2)) {
                            arrayList.add(c0146s2.f537a);
                            C0138k c0138k2 = EnumC0140m.Companion;
                            EnumC0141n enumC0141n5 = c0146s2.f537a;
                            c0138k2.getClass();
                            AbstractC1665j.m2985e(enumC0141n5, "state");
                            int iOrdinal2 = enumC0141n5.ordinal();
                            EnumC0140m enumC0140m2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0140m.ON_RESUME : EnumC0140m.ON_START : EnumC0140m.ON_CREATE;
                            if (enumC0140m2 == null) {
                                throw new IllegalStateException("no event up from " + c0146s2.f537a);
                            }
                            c0146s2.m186a(interfaceC0145r, enumC0140m2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
