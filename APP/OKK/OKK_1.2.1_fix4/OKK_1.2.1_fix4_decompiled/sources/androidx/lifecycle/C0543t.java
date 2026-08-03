package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p059h.C0943a;
import p061i.C0948a;
import p061i.C0949b;
import p061i.C0950c;
import p061i.C0951d;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0543t {

    /* JADX INFO: renamed from: a */
    public final boolean f1491a;

    /* JADX INFO: renamed from: b */
    public C0948a f1492b;

    /* JADX INFO: renamed from: c */
    public EnumC0536m f1493c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f1494d;

    /* JADX INFO: renamed from: e */
    public int f1495e;

    /* JADX INFO: renamed from: f */
    public boolean f1496f;

    /* JADX INFO: renamed from: g */
    public boolean f1497g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1498h;

    public C0543t(InterfaceC0541r interfaceC0541r) {
        AbstractC0307g.m703e(interfaceC0541r, "provider");
        new AtomicReference();
        this.f1491a = true;
        this.f1492b = new C0948a();
        this.f1493c = EnumC0536m.f1483b;
        this.f1498h = new ArrayList();
        this.f1494d = new WeakReference(interfaceC0541r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1254a(InterfaceC0540q interfaceC0540q) {
        InterfaceC0539p reflectiveGenericLifecycleObserver;
        InterfaceC0541r interfaceC0541r;
        ArrayList arrayList = this.f1498h;
        AbstractC0307g.m703e(interfaceC0540q, "observer");
        m1256c("addObserver");
        EnumC0536m enumC0536m = this.f1493c;
        EnumC0536m enumC0536m2 = EnumC0536m.f1482a;
        if (enumC0536m != enumC0536m2) {
            enumC0536m2 = EnumC0536m.f1483b;
        }
        C0542s c0542s = new C0542s();
        HashMap map = AbstractC0544u.f1499a;
        boolean z2 = interfaceC0540q instanceof InterfaceC0539p;
        boolean z3 = interfaceC0540q instanceof InterfaceC0527d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0527d) interfaceC0540q, (InterfaceC0539p) interfaceC0540q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0527d) interfaceC0540q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0539p) interfaceC0540q;
        } else {
            Class<?> cls = interfaceC0540q.getClass();
            if (AbstractC0544u.m1261b(cls) == 2) {
                Object obj = AbstractC0544u.f1500b.get(cls);
                AbstractC0307g.m700b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0544u.m1260a((Constructor) list.get(0), interfaceC0540q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0530g[] interfaceC0530gArr = new InterfaceC0530g[size];
                if (size > 0) {
                    AbstractC0544u.m1260a((Constructor) list.get(0), interfaceC0540q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0530gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0540q);
            }
        }
        c0542s.f1490b = reflectiveGenericLifecycleObserver;
        c0542s.f1489a = enumC0536m2;
        if (((C0542s) this.f1492b.m2283c(interfaceC0540q, c0542s)) == null && (interfaceC0541r = (InterfaceC0541r) this.f1494d.get()) != null) {
            boolean z4 = this.f1495e != 0 || this.f1496f;
            EnumC0536m enumC0536mM1255b = m1255b(interfaceC0540q);
            this.f1495e++;
            while (c0542s.f1489a.compareTo(enumC0536mM1255b) < 0 && this.f1492b.f3365e.containsKey(interfaceC0540q)) {
                arrayList.add(c0542s.f1489a);
                C0533j c0533j = EnumC0535l.Companion;
                EnumC0536m enumC0536m3 = c0542s.f1489a;
                c0533j.getClass();
                EnumC0535l enumC0535lM1251a = C0533j.m1251a(enumC0536m3);
                if (enumC0535lM1251a == null) {
                    throw new IllegalStateException("no event up from " + c0542s.f1489a);
                }
                c0542s.m1253a(interfaceC0541r, enumC0535lM1251a);
                arrayList.remove(arrayList.size() - 1);
                enumC0536mM1255b = m1255b(interfaceC0540q);
            }
            if (!z4) {
                m1259f();
            }
            this.f1495e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0536m m1255b(InterfaceC0540q interfaceC0540q) {
        C0542s c0542s;
        HashMap map = this.f1492b.f3365e;
        C0950c c0950c = map.containsKey(interfaceC0540q) ? ((C0950c) map.get(interfaceC0540q)).f3372d : null;
        EnumC0536m enumC0536m = (c0950c == null || (c0542s = (C0542s) c0950c.f3370b) == null) ? null : c0542s.f1489a;
        ArrayList arrayList = this.f1498h;
        EnumC0536m enumC0536m2 = arrayList.isEmpty() ^ true ? (EnumC0536m) arrayList.get(arrayList.size() - 1) : null;
        EnumC0536m enumC0536m3 = this.f1493c;
        AbstractC0307g.m703e(enumC0536m3, "state1");
        if (enumC0536m == null || enumC0536m.compareTo(enumC0536m3) >= 0) {
            enumC0536m = enumC0536m3;
        }
        return (enumC0536m2 == null || enumC0536m2.compareTo(enumC0536m) >= 0) ? enumC0536m : enumC0536m2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1256c(String str) {
        C0943a c0943a;
        if (this.f1491a) {
            if (C0943a.f3351c != null) {
                c0943a = C0943a.f3351c;
            } else {
                synchronized (C0943a.class) {
                    try {
                        if (C0943a.f3351c == null) {
                            C0943a.f3351c = new C0943a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0943a = C0943a.f3351c;
            }
            ((C0943a) c0943a.f3352b).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0324d.m723f("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1257d(EnumC0535l enumC0535l) {
        AbstractC0307g.m703e(enumC0535l, "event");
        m1256c("handleLifecycleEvent");
        EnumC0536m enumC0536mM1252a = enumC0535l.m1252a();
        EnumC0536m enumC0536m = this.f1493c;
        if (enumC0536m == enumC0536mM1252a) {
            return;
        }
        EnumC0536m enumC0536m2 = EnumC0536m.f1483b;
        EnumC0536m enumC0536m3 = EnumC0536m.f1482a;
        if (enumC0536m == enumC0536m2 && enumC0536mM1252a == enumC0536m3) {
            throw new IllegalStateException(("no event down from " + this.f1493c + " in component " + this.f1494d.get()).toString());
        }
        this.f1493c = enumC0536mM1252a;
        if (this.f1496f || this.f1495e != 0) {
            this.f1497g = true;
            return;
        }
        this.f1496f = true;
        m1259f();
        this.f1496f = false;
        if (this.f1493c == enumC0536m3) {
            this.f1492b = new C0948a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1258e(InterfaceC0540q interfaceC0540q) {
        AbstractC0307g.m703e(interfaceC0540q, "observer");
        m1256c("removeObserver");
        this.f1492b.mo2282b(interfaceC0540q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f1497g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1259f() {
        InterfaceC0541r interfaceC0541r = (InterfaceC0541r) this.f1494d.get();
        if (interfaceC0541r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0948a c0948a = this.f1492b;
            if (c0948a.f3379d != 0) {
                C0950c c0950c = c0948a.f3376a;
                AbstractC0307g.m700b(c0950c);
                EnumC0536m enumC0536m = ((C0542s) c0950c.f3370b).f1489a;
                C0950c c0950c2 = this.f1492b.f3377b;
                AbstractC0307g.m700b(c0950c2);
                EnumC0536m enumC0536m2 = ((C0542s) c0950c2.f3370b).f1489a;
                if (enumC0536m == enumC0536m2 && this.f1493c == enumC0536m2) {
                    break;
                }
                this.f1497g = false;
                EnumC0536m enumC0536m3 = this.f1493c;
                C0950c c0950c3 = this.f1492b.f3376a;
                AbstractC0307g.m700b(c0950c3);
                if (enumC0536m3.compareTo(((C0542s) c0950c3.f3370b).f1489a) < 0) {
                    C0948a c0948a2 = this.f1492b;
                    C0949b c0949b = new C0949b(c0948a2.f3377b, c0948a2.f3376a, 1);
                    c0948a2.f3378c.put(c0949b, Boolean.FALSE);
                    while (c0949b.hasNext() && !this.f1497g) {
                        Map.Entry entry = (Map.Entry) c0949b.next();
                        AbstractC0307g.m702d(entry, "next()");
                        InterfaceC0540q interfaceC0540q = (InterfaceC0540q) entry.getKey();
                        C0542s c0542s = (C0542s) entry.getValue();
                        while (c0542s.f1489a.compareTo(this.f1493c) > 0 && !this.f1497g && this.f1492b.f3365e.containsKey(interfaceC0540q)) {
                            C0533j c0533j = EnumC0535l.Companion;
                            EnumC0536m enumC0536m4 = c0542s.f1489a;
                            c0533j.getClass();
                            AbstractC0307g.m703e(enumC0536m4, "state");
                            int iOrdinal = enumC0536m4.ordinal();
                            EnumC0535l enumC0535l = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0535l.ON_PAUSE : EnumC0535l.ON_STOP : EnumC0535l.ON_DESTROY;
                            if (enumC0535l == null) {
                                throw new IllegalStateException("no event down from " + c0542s.f1489a);
                            }
                            this.f1498h.add(enumC0535l.m1252a());
                            c0542s.m1253a(interfaceC0541r, enumC0535l);
                            this.f1498h.remove(r4.size() - 1);
                        }
                    }
                }
                C0950c c0950c4 = this.f1492b.f3377b;
                if (!this.f1497g && c0950c4 != null && this.f1493c.compareTo(((C0542s) c0950c4.f3370b).f1489a) > 0) {
                    C0948a c0948a3 = this.f1492b;
                    c0948a3.getClass();
                    C0951d c0951d = new C0951d(c0948a3);
                    c0948a3.f3378c.put(c0951d, Boolean.FALSE);
                    while (c0951d.hasNext() && !this.f1497g) {
                        Map.Entry entry2 = (Map.Entry) c0951d.next();
                        InterfaceC0540q interfaceC0540q2 = (InterfaceC0540q) entry2.getKey();
                        C0542s c0542s2 = (C0542s) entry2.getValue();
                        while (c0542s2.f1489a.compareTo(this.f1493c) < 0 && !this.f1497g && this.f1492b.f3365e.containsKey(interfaceC0540q2)) {
                            this.f1498h.add(c0542s2.f1489a);
                            C0533j c0533j2 = EnumC0535l.Companion;
                            EnumC0536m enumC0536m5 = c0542s2.f1489a;
                            c0533j2.getClass();
                            EnumC0535l enumC0535lM1251a = C0533j.m1251a(enumC0536m5);
                            if (enumC0535lM1251a == null) {
                                throw new IllegalStateException("no event up from " + c0542s2.f1489a);
                            }
                            c0542s2.m1253a(interfaceC0541r, enumC0535lM1251a);
                            this.f1498h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
