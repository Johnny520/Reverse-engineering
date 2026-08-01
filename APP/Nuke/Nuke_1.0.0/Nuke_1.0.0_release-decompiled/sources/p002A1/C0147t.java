package p002A1;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import p180j.C2363c;

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

    /* JADX INFO: renamed from: e */
    public final void m189e(EnumC0140m enumC0140m) {
        AbstractC1665j.m2985e(enumC0140m, "event");
        m188d("handleLifecycleEvent");
        m190f(enumC0140m.m183a());
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m191g() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0147t.m191g():void");
    }
}
