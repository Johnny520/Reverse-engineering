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
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p071j.C0732a;
import p073k.AbstractC0739e;
import p073k.C0735a;
import p073k.C0736b;
import p073k.C0737c;
import p073k.C0738d;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0486u {

    /* JADX INFO: renamed from: a */
    public final boolean f1526a;

    /* JADX INFO: renamed from: b */
    public C0735a f1527b;

    /* JADX INFO: renamed from: c */
    public EnumC0479n f1528c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f1529d;

    /* JADX INFO: renamed from: e */
    public int f1530e;

    /* JADX INFO: renamed from: f */
    public boolean f1531f;

    /* JADX INFO: renamed from: g */
    public boolean f1532g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1533h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0486u(InterfaceC0484s interfaceC0484s) {
        new AtomicReference();
        this.f1526a = true;
        this.f1527b = new C0735a();
        this.f1528c = EnumC0479n.f1518b;
        this.f1533h = new ArrayList();
        this.f1529d = new WeakReference(interfaceC0484s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m927a(InterfaceC0483r interfaceC0483r) {
        InterfaceC0482q reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0484s interfaceC0484s;
        ArrayList arrayList = this.f1533h;
        AbstractC0223g.m418e(interfaceC0483r, "observer");
        m929c("addObserver");
        EnumC0479n enumC0479n = this.f1528c;
        EnumC0479n enumC0479n2 = EnumC0479n.f1517a;
        if (enumC0479n != enumC0479n2) {
            enumC0479n2 = EnumC0479n.f1518b;
        }
        C0485t c0485t = new C0485t();
        HashMap map = AbstractC0487v.f1534a;
        boolean z2 = interfaceC0483r instanceof InterfaceC0482q;
        boolean z3 = interfaceC0483r instanceof InterfaceC0470e;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0470e) interfaceC0483r, (InterfaceC0482q) interfaceC0483r);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0470e) interfaceC0483r, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0482q) interfaceC0483r;
        } else {
            Class<?> cls = interfaceC0483r.getClass();
            if (AbstractC0487v.m936b(cls) == 2) {
                Object obj2 = AbstractC0487v.f1535b.get(cls);
                AbstractC0223g.m415b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0487v.m935a((Constructor) list.get(0), interfaceC0483r);
                    throw null;
                }
                int size = list.size();
                InterfaceC0473h[] interfaceC0473hArr = new InterfaceC0473h[size];
                if (size > 0) {
                    AbstractC0487v.m935a((Constructor) list.get(0), interfaceC0483r);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0473hArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0483r);
            }
        }
        c0485t.f1525b = reflectiveGenericLifecycleObserver;
        c0485t.f1524a = enumC0479n2;
        C0735a c0735a = this.f1527b;
        C0737c c0737cMo1389a = c0735a.mo1389a(interfaceC0483r);
        if (c0737cMo1389a != null) {
            obj = c0737cMo1389a.f2495b;
        } else {
            HashMap map2 = c0735a.f2490e;
            C0737c c0737c = new C0737c(interfaceC0483r, c0485t);
            c0735a.f2504d++;
            C0737c c0737c2 = c0735a.f2502b;
            if (c0737c2 == null) {
                c0735a.f2501a = c0737c;
                c0735a.f2502b = c0737c;
            } else {
                c0737c2.f2496c = c0737c;
                c0737c.f2497d = c0737c2;
                c0735a.f2502b = c0737c;
            }
            map2.put(interfaceC0483r, c0737c);
            obj = null;
        }
        if (((C0485t) obj) == null && (interfaceC0484s = (InterfaceC0484s) this.f1529d.get()) != null) {
            boolean z4 = this.f1530e != 0 || this.f1531f;
            EnumC0479n enumC0479nM928b = m928b(interfaceC0483r);
            this.f1530e++;
            while (c0485t.f1524a.compareTo(enumC0479nM928b) < 0 && this.f1527b.f2490e.containsKey(interfaceC0483r)) {
                arrayList.add(c0485t.f1524a);
                C0476k c0476k = EnumC0478m.Companion;
                EnumC0479n enumC0479n3 = c0485t.f1524a;
                c0476k.getClass();
                AbstractC0223g.m418e(enumC0479n3, "state");
                int iOrdinal = enumC0479n3.ordinal();
                EnumC0478m enumC0478m = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0478m.ON_RESUME : EnumC0478m.ON_START : EnumC0478m.ON_CREATE;
                if (enumC0478m == null) {
                    throw new IllegalStateException("no event up from " + c0485t.f1524a);
                }
                c0485t.m926a(interfaceC0484s, enumC0478m);
                arrayList.remove(arrayList.size() - 1);
                enumC0479nM928b = m928b(interfaceC0483r);
            }
            if (!z4) {
                m934h();
            }
            this.f1530e--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final EnumC0479n m928b(InterfaceC0483r interfaceC0483r) {
        C0485t c0485t;
        HashMap map = this.f1527b.f2490e;
        C0737c c0737c = map.containsKey(interfaceC0483r) ? ((C0737c) map.get(interfaceC0483r)).f2497d : null;
        EnumC0479n enumC0479n = (c0737c == null || (c0485t = (C0485t) c0737c.f2495b) == null) ? null : c0485t.f1524a;
        ArrayList arrayList = this.f1533h;
        EnumC0479n enumC0479n2 = arrayList.isEmpty() ? null : (EnumC0479n) arrayList.get(arrayList.size() - 1);
        EnumC0479n enumC0479n3 = this.f1528c;
        AbstractC0223g.m418e(enumC0479n3, "state1");
        if (enumC0479n == null || enumC0479n.compareTo(enumC0479n3) >= 0) {
            enumC0479n = enumC0479n3;
        }
        return (enumC0479n2 == null || enumC0479n2.compareTo(enumC0479n) >= 0) ? enumC0479n : enumC0479n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m929c(String str) {
        if (this.f1526a) {
            ((C0732a) C0732a.m1388Q().f2486p).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0174d.m353i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m930d(EnumC0478m enumC0478m) {
        AbstractC0223g.m418e(enumC0478m, "event");
        m929c("handleLifecycleEvent");
        m931e(enumC0478m.m925a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m931e(EnumC0479n enumC0479n) {
        EnumC0479n enumC0479n2 = this.f1528c;
        if (enumC0479n2 == enumC0479n) {
            return;
        }
        EnumC0479n enumC0479n3 = EnumC0479n.f1518b;
        EnumC0479n enumC0479n4 = EnumC0479n.f1517a;
        if (enumC0479n2 == enumC0479n3 && enumC0479n == enumC0479n4) {
            throw new IllegalStateException(("no event down from " + this.f1528c + " in component " + this.f1529d.get()).toString());
        }
        this.f1528c = enumC0479n;
        if (this.f1531f || this.f1530e != 0) {
            this.f1532g = true;
            return;
        }
        this.f1531f = true;
        m934h();
        this.f1531f = false;
        if (this.f1528c == enumC0479n4) {
            this.f1527b = new C0735a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m932f(InterfaceC0483r interfaceC0483r) {
        m929c("removeObserver");
        C0735a c0735a = this.f1527b;
        C0737c c0737cMo1389a = c0735a.mo1389a(interfaceC0483r);
        if (c0737cMo1389a != null) {
            c0735a.f2504d--;
            WeakHashMap weakHashMap = c0735a.f2503c;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC0739e) it.next()).mo1390a(c0737cMo1389a);
                }
            }
            C0737c c0737c = c0737cMo1389a.f2497d;
            if (c0737c != null) {
                c0737c.f2496c = c0737cMo1389a.f2496c;
            } else {
                c0735a.f2501a = c0737cMo1389a.f2496c;
            }
            C0737c c0737c2 = c0737cMo1389a.f2496c;
            if (c0737c2 != null) {
                c0737c2.f2497d = c0737c;
            } else {
                c0735a.f2502b = c0737c;
            }
            c0737cMo1389a.f2496c = null;
            c0737cMo1389a.f2497d = null;
        }
        c0735a.f2490e.remove(interfaceC0483r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m933g() {
        EnumC0479n enumC0479n = EnumC0479n.f1519c;
        m929c("setCurrentState");
        m931e(enumC0479n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f1532g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m934h() {
        InterfaceC0484s interfaceC0484s = (InterfaceC0484s) this.f1529d.get();
        if (interfaceC0484s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0735a c0735a = this.f1527b;
            if (c0735a.f2504d != 0) {
                C0737c c0737c = c0735a.f2501a;
                AbstractC0223g.m415b(c0737c);
                EnumC0479n enumC0479n = ((C0485t) c0737c.f2495b).f1524a;
                C0737c c0737c2 = this.f1527b.f2502b;
                AbstractC0223g.m415b(c0737c2);
                EnumC0479n enumC0479n2 = ((C0485t) c0737c2.f2495b).f1524a;
                if (enumC0479n == enumC0479n2 && this.f1528c == enumC0479n2) {
                    break;
                }
                this.f1532g = false;
                EnumC0479n enumC0479n3 = this.f1528c;
                C0737c c0737c3 = this.f1527b.f2501a;
                AbstractC0223g.m415b(c0737c3);
                if (enumC0479n3.compareTo(((C0485t) c0737c3.f2495b).f1524a) < 0) {
                    C0735a c0735a2 = this.f1527b;
                    C0736b c0736b = new C0736b(c0735a2.f2502b, c0735a2.f2501a, 1);
                    c0735a2.f2503c.put(c0736b, Boolean.FALSE);
                    while (c0736b.hasNext() && !this.f1532g) {
                        Map.Entry entry = (Map.Entry) c0736b.next();
                        AbstractC0223g.m417d(entry, "next()");
                        InterfaceC0483r interfaceC0483r = (InterfaceC0483r) entry.getKey();
                        C0485t c0485t = (C0485t) entry.getValue();
                        while (c0485t.f1524a.compareTo(this.f1528c) > 0 && !this.f1532g && this.f1527b.f2490e.containsKey(interfaceC0483r)) {
                            C0476k c0476k = EnumC0478m.Companion;
                            EnumC0479n enumC0479n4 = c0485t.f1524a;
                            c0476k.getClass();
                            AbstractC0223g.m418e(enumC0479n4, "state");
                            int iOrdinal = enumC0479n4.ordinal();
                            EnumC0478m enumC0478m = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0478m.ON_PAUSE : EnumC0478m.ON_STOP : EnumC0478m.ON_DESTROY;
                            if (enumC0478m == null) {
                                throw new IllegalStateException("no event down from " + c0485t.f1524a);
                            }
                            this.f1533h.add(enumC0478m.m925a());
                            c0485t.m926a(interfaceC0484s, enumC0478m);
                            ArrayList arrayList = this.f1533h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C0737c c0737c4 = this.f1527b.f2502b;
                if (!this.f1532g && c0737c4 != null && this.f1528c.compareTo(((C0485t) c0737c4.f2495b).f1524a) > 0) {
                    C0735a c0735a3 = this.f1527b;
                    c0735a3.getClass();
                    C0738d c0738d = new C0738d(c0735a3);
                    c0735a3.f2503c.put(c0738d, Boolean.FALSE);
                    while (c0738d.hasNext() && !this.f1532g) {
                        Map.Entry entry2 = (Map.Entry) c0738d.next();
                        InterfaceC0483r interfaceC0483r2 = (InterfaceC0483r) entry2.getKey();
                        C0485t c0485t2 = (C0485t) entry2.getValue();
                        while (c0485t2.f1524a.compareTo(this.f1528c) < 0 && !this.f1532g && this.f1527b.f2490e.containsKey(interfaceC0483r2)) {
                            this.f1533h.add(c0485t2.f1524a);
                            C0476k c0476k2 = EnumC0478m.Companion;
                            EnumC0479n enumC0479n5 = c0485t2.f1524a;
                            c0476k2.getClass();
                            AbstractC0223g.m418e(enumC0479n5, "state");
                            int iOrdinal2 = enumC0479n5.ordinal();
                            EnumC0478m enumC0478m2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0478m.ON_RESUME : EnumC0478m.ON_START : EnumC0478m.ON_CREATE;
                            if (enumC0478m2 == null) {
                                throw new IllegalStateException("no event up from " + c0485t2.f1524a);
                            }
                            c0485t2.m926a(interfaceC0484s, enumC0478m2);
                            ArrayList arrayList2 = this.f1533h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
