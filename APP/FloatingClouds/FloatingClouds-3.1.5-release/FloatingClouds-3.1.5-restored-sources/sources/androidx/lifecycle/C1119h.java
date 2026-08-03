package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.AbstractC1116e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0010A9;
import p000a.C0040C1;
import p000a.C0124Gd;
import p000a.C0631i9;
import p000a.C0704m6;
import p000a.C0944z;
import p000a.InterfaceC0295Q4;
import p000a.InterfaceC0916x9;
import p000a.InterfaceC0935y9;

/* JADX INFO: renamed from: androidx.lifecycle.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1119h extends AbstractC1116e {

    /* JADX INFO: renamed from: a */
    public final boolean f4679a;

    /* JADX INFO: renamed from: b */
    public C0704m6<InterfaceC0916x9, a> f4680b;

    /* JADX INFO: renamed from: c */
    public AbstractC1116e.b f4681c;

    /* JADX INFO: renamed from: d */
    public final WeakReference<InterfaceC0935y9> f4682d;

    /* JADX INFO: renamed from: e */
    public int f4683e;

    /* JADX INFO: renamed from: f */
    public boolean f4684f;

    /* JADX INFO: renamed from: g */
    public boolean f4685g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<AbstractC1116e.b> f4686h;

    /* JADX INFO: renamed from: androidx.lifecycle.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public AbstractC1116e.b f4687a;

        /* JADX INFO: renamed from: b */
        public InterfaceC1118g f4688b;

        /* JADX INFO: renamed from: a */
        public final void m2602a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
            AbstractC1116e.b bVarM2595a = aVar.m2595a();
            AbstractC1116e.b bVar = this.f4687a;
            C0631i9.m1482e(bVar, "state1");
            if (bVarM2595a.compareTo(bVar) < 0) {
                bVar = bVarM2595a;
            }
            this.f4687a = bVar;
            this.f4688b.mo485a(interfaceC0935y9, aVar);
            this.f4687a = bVarM2595a;
        }
    }

    public C1119h(InterfaceC0935y9 interfaceC0935y9) {
        new AtomicReference();
        this.f4679a = true;
        this.f4680b = new C0704m6<>();
        this.f4681c = AbstractC1116e.b.f4673b;
        this.f4686h = new ArrayList<>();
        this.f4682d = new WeakReference<>(interfaceC0935y9);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.AbstractC1116e
    /* JADX INFO: renamed from: a */
    public final void mo2592a(InterfaceC0916x9 interfaceC0916x9) {
        InterfaceC1118g reflectiveGenericLifecycleObserver;
        a aVar;
        InterfaceC0935y9 interfaceC0935y9;
        ArrayList<AbstractC1116e.b> arrayList = this.f4686h;
        m2597e("addObserver");
        AbstractC1116e.b bVar = this.f4681c;
        AbstractC1116e.b bVar2 = AbstractC1116e.b.f4672a;
        if (bVar != bVar2) {
            bVar2 = AbstractC1116e.b.f4673b;
        }
        a aVar2 = new a();
        HashMap map = C0010A9.f50a;
        boolean z = interfaceC0916x9 instanceof InterfaceC1118g;
        boolean z2 = interfaceC0916x9 instanceof InterfaceC0295Q4;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0295Q4) interfaceC0916x9, (InterfaceC1118g) interfaceC0916x9);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0295Q4) interfaceC0916x9, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC1118g) interfaceC0916x9;
        } else {
            Class<?> cls = interfaceC0916x9.getClass();
            if (C0010A9.m42b(cls) == 2) {
                Object obj = C0010A9.f51b.get(cls);
                C0631i9.m1479b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C0010A9.m41a((Constructor) list.get(0), interfaceC0916x9));
                } else {
                    int size = list.size();
                    InterfaceC1113b[] interfaceC1113bArr = new InterfaceC1113b[size];
                    for (int i = 0; i < size; i++) {
                        interfaceC1113bArr[i] = C0010A9.m41a((Constructor) list.get(i), interfaceC0916x9);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1113bArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0916x9);
            }
        }
        aVar2.f4688b = reflectiveGenericLifecycleObserver;
        aVar2.f4687a = bVar2;
        C0704m6<InterfaceC0916x9, a> c0704m6 = this.f4680b;
        C0124Gd.c<InterfaceC0916x9, a> cVarMo324a = c0704m6.mo324a(interfaceC0916x9);
        if (cVarMo324a != null) {
            aVar = cVarMo324a.f410b;
        } else {
            HashMap<K, C0124Gd.c<K, V>> map2 = c0704m6.f2652e;
            C0124Gd.c<K, V> cVar = new C0124Gd.c<>(interfaceC0916x9, aVar2);
            c0704m6.f408d++;
            C0124Gd.c<K, V> cVar2 = c0704m6.f406b;
            if (cVar2 == 0) {
                c0704m6.f405a = cVar;
                c0704m6.f406b = cVar;
            } else {
                cVar2.f411c = cVar;
                cVar.f412d = cVar2;
                c0704m6.f406b = cVar;
            }
            map2.put((K) interfaceC0916x9, cVar);
            aVar = null;
        }
        if (aVar == null && (interfaceC0935y9 = this.f4682d.get()) != null) {
            boolean z3 = this.f4683e != 0 || this.f4684f;
            AbstractC1116e.b bVarM2596d = m2596d(interfaceC0916x9);
            this.f4683e++;
            while (aVar2.f4687a.compareTo(bVarM2596d) < 0 && this.f4680b.f2652e.containsKey(interfaceC0916x9)) {
                arrayList.add(aVar2.f4687a);
                AbstractC1116e.a.C1342a c1342a = AbstractC1116e.a.Companion;
                AbstractC1116e.b bVar3 = aVar2.f4687a;
                c1342a.getClass();
                C0631i9.m1482e(bVar3, "state");
                int iOrdinal = bVar3.ordinal();
                AbstractC1116e.a aVar3 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : AbstractC1116e.a.ON_RESUME : AbstractC1116e.a.ON_START : AbstractC1116e.a.ON_CREATE;
                if (aVar3 == null) {
                    throw new IllegalStateException("no event up from " + aVar2.f4687a);
                }
                aVar2.m2602a(interfaceC0935y9, aVar3);
                arrayList.remove(arrayList.size() - 1);
                bVarM2596d = m2596d(interfaceC0916x9);
            }
            if (!z3) {
                m2601i();
            }
            this.f4683e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1116e
    /* JADX INFO: renamed from: b */
    public final AbstractC1116e.b mo2593b() {
        return this.f4681c;
    }

    @Override // androidx.lifecycle.AbstractC1116e
    /* JADX INFO: renamed from: c */
    public final void mo2594c(InterfaceC0916x9 interfaceC0916x9) {
        C0631i9.m1482e(interfaceC0916x9, "observer");
        m2597e("removeObserver");
        this.f4680b.mo325b(interfaceC0916x9);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1116e.b m2596d(InterfaceC0916x9 interfaceC0916x9) {
        a aVar;
        HashMap<InterfaceC0916x9, C0124Gd.c<InterfaceC0916x9, a>> map = this.f4680b.f2652e;
        C0124Gd.c<InterfaceC0916x9, a> cVar = map.containsKey(interfaceC0916x9) ? map.get(interfaceC0916x9).f412d : null;
        AbstractC1116e.b bVar = (cVar == null || (aVar = cVar.f410b) == null) ? null : aVar.f4687a;
        ArrayList<AbstractC1116e.b> arrayList = this.f4686h;
        AbstractC1116e.b bVar2 = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        AbstractC1116e.b bVar3 = this.f4681c;
        C0631i9.m1482e(bVar3, "state1");
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: e */
    public final void m2597e(String str) {
        if (this.f4679a) {
            C0040C1.m122g().f157a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(C0944z.m2227g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2598f(AbstractC1116e.a aVar) {
        C0631i9.m1482e(aVar, "event");
        m2597e("handleLifecycleEvent");
        m2599g(aVar.m2595a());
    }

    /* JADX INFO: renamed from: g */
    public final void m2599g(AbstractC1116e.b bVar) {
        AbstractC1116e.b bVar2 = this.f4681c;
        if (bVar2 == bVar) {
            return;
        }
        AbstractC1116e.b bVar3 = AbstractC1116e.b.f4673b;
        AbstractC1116e.b bVar4 = AbstractC1116e.b.f4672a;
        if (bVar2 == bVar3 && bVar == bVar4) {
            throw new IllegalStateException(("no event down from " + this.f4681c + " in component " + this.f4682d.get()).toString());
        }
        this.f4681c = bVar;
        if (this.f4684f || this.f4683e != 0) {
            this.f4685g = true;
            return;
        }
        this.f4684f = true;
        m2601i();
        this.f4684f = false;
        if (this.f4681c == bVar4) {
            this.f4680b = new C0704m6<>();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2600h(AbstractC1116e.b bVar) {
        C0631i9.m1482e(bVar, "state");
        m2597e("setCurrentState");
        m2599g(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f4685g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2601i() {
        InterfaceC0935y9 interfaceC0935y9 = this.f4682d.get();
        if (interfaceC0935y9 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0704m6<InterfaceC0916x9, a> c0704m6 = this.f4680b;
            if (c0704m6.f408d != 0) {
                C0124Gd.c<InterfaceC0916x9, a> cVar = c0704m6.f405a;
                C0631i9.m1479b(cVar);
                AbstractC1116e.b bVar = cVar.f410b.f4687a;
                C0124Gd.c<InterfaceC0916x9, a> cVar2 = this.f4680b.f406b;
                C0631i9.m1479b(cVar2);
                AbstractC1116e.b bVar2 = cVar2.f410b.f4687a;
                if (bVar == bVar2 && this.f4681c == bVar2) {
                    break;
                }
                this.f4685g = false;
                AbstractC1116e.b bVar3 = this.f4681c;
                C0124Gd.c<InterfaceC0916x9, a> cVar3 = this.f4680b.f405a;
                C0631i9.m1479b(cVar3);
                if (bVar3.compareTo(cVar3.f410b.f4687a) < 0) {
                    C0704m6<InterfaceC0916x9, a> c0704m62 = this.f4680b;
                    C0124Gd.b bVar4 = new C0124Gd.b(c0704m62.f406b, c0704m62.f405a);
                    c0704m62.f407c.put(bVar4, Boolean.FALSE);
                    while (bVar4.hasNext() && !this.f4685g) {
                        Map.Entry entry = (Map.Entry) bVar4.next();
                        C0631i9.m1481d(entry, "next()");
                        InterfaceC0916x9 interfaceC0916x9 = (InterfaceC0916x9) entry.getKey();
                        a aVar = (a) entry.getValue();
                        while (aVar.f4687a.compareTo(this.f4681c) > 0 && !this.f4685g && this.f4680b.f2652e.containsKey(interfaceC0916x9)) {
                            AbstractC1116e.a.C1342a c1342a = AbstractC1116e.a.Companion;
                            AbstractC1116e.b bVar5 = aVar.f4687a;
                            c1342a.getClass();
                            C0631i9.m1482e(bVar5, "state");
                            int iOrdinal = bVar5.ordinal();
                            AbstractC1116e.a aVar2 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : AbstractC1116e.a.ON_PAUSE : AbstractC1116e.a.ON_STOP : AbstractC1116e.a.ON_DESTROY;
                            if (aVar2 == null) {
                                throw new IllegalStateException("no event down from " + aVar.f4687a);
                            }
                            this.f4686h.add(aVar2.m2595a());
                            aVar.m2602a(interfaceC0935y9, aVar2);
                            ArrayList<AbstractC1116e.b> arrayList = this.f4686h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C0124Gd.c<InterfaceC0916x9, a> cVar4 = this.f4680b.f406b;
                if (!this.f4685g && cVar4 != null && this.f4681c.compareTo(cVar4.f410b.f4687a) > 0) {
                    C0704m6<InterfaceC0916x9, a> c0704m63 = this.f4680b;
                    c0704m63.getClass();
                    C0124Gd.d dVar = new C0124Gd.d();
                    c0704m63.f407c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f4685g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0916x9 interfaceC0916x92 = (InterfaceC0916x9) entry2.getKey();
                        a aVar3 = (a) entry2.getValue();
                        while (aVar3.f4687a.compareTo(this.f4681c) < 0 && !this.f4685g && this.f4680b.f2652e.containsKey(interfaceC0916x92)) {
                            this.f4686h.add(aVar3.f4687a);
                            AbstractC1116e.a.C1342a c1342a2 = AbstractC1116e.a.Companion;
                            AbstractC1116e.b bVar6 = aVar3.f4687a;
                            c1342a2.getClass();
                            C0631i9.m1482e(bVar6, "state");
                            int iOrdinal2 = bVar6.ordinal();
                            AbstractC1116e.a aVar4 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : AbstractC1116e.a.ON_RESUME : AbstractC1116e.a.ON_START : AbstractC1116e.a.ON_CREATE;
                            if (aVar4 == null) {
                                throw new IllegalStateException("no event up from " + aVar3.f4687a);
                            }
                            aVar3.m2602a(interfaceC0935y9, aVar4);
                            ArrayList<AbstractC1116e.b> arrayList2 = this.f4686h;
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
