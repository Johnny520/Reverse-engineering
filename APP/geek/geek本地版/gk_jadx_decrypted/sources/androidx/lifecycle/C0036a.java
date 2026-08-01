package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0346ip;
import p000.AbstractC0643qq;
import p000.C0270gq;
import p000.C0363j6;
import p000.C0606pq;
import p000.C0784uj;
import p000.EnumC0347iq;
import p000.EnumC0383jq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0531nq;
import p000.InterfaceC0568oq;
import p000.InterfaceC0817vf;
import p000.InterfaceC0936yn;
import p000.l10;
import p000.z30;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0036a {

    /* JADX INFO: renamed from: a */
    public final boolean f516a;

    /* JADX INFO: renamed from: b */
    public C0784uj f517b;

    /* JADX INFO: renamed from: c */
    public EnumC0383jq f518c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f519d;

    /* JADX INFO: renamed from: e */
    public int f520e;

    /* JADX INFO: renamed from: f */
    public boolean f521f;

    /* JADX INFO: renamed from: g */
    public boolean f522g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f523h;

    public C0036a(InterfaceC0568oq interfaceC0568oq) {
        new AtomicReference();
        this.f516a = true;
        this.f517b = new C0784uj();
        this.f518c = EnumC0383jq.f2657b;
        this.f523h = new ArrayList();
        this.f519d = new WeakReference(interfaceC0568oq);
    }

    /* JADX INFO: renamed from: a */
    public final void m274a(InterfaceC0531nq interfaceC0531nq) {
        InterfaceC0494mq reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0568oq interfaceC0568oq;
        m276c("addObserver");
        EnumC0383jq enumC0383jq = this.f518c;
        EnumC0383jq enumC0383jq2 = EnumC0383jq.f2656a;
        if (enumC0383jq != enumC0383jq2) {
            enumC0383jq2 = EnumC0383jq.f2657b;
        }
        C0606pq c0606pq = new C0606pq();
        HashMap map = AbstractC0643qq.f4112a;
        boolean z = interfaceC0531nq instanceof InterfaceC0494mq;
        boolean z2 = interfaceC0531nq instanceof InterfaceC0817vf;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0817vf) interfaceC0531nq, (InterfaceC0494mq) interfaceC0531nq);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0817vf) interfaceC0531nq, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC0494mq) interfaceC0531nq;
        } else {
            Class<?> cls = interfaceC0531nq.getClass();
            if (AbstractC0643qq.m2181b(cls) == 2) {
                Object obj2 = AbstractC0643qq.f4113b.get(cls);
                AbstractC0346ip.m1500l(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0643qq.m2180a((Constructor) list.get(0), interfaceC0531nq);
                    throw null;
                }
                int size = list.size();
                InterfaceC0936yn[] interfaceC0936ynArr = new InterfaceC0936yn[size];
                if (size > 0) {
                    AbstractC0643qq.m2180a((Constructor) list.get(0), interfaceC0531nq);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0936ynArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0531nq);
            }
        }
        c0606pq.f3922b = reflectiveGenericLifecycleObserver;
        c0606pq.f3921a = enumC0383jq2;
        C0784uj c0784uj = this.f517b;
        l10 l10VarMo1983a = c0784uj.mo1983a(interfaceC0531nq);
        if (l10VarMo1983a != null) {
            obj = l10VarMo1983a.f2989b;
        } else {
            HashMap map2 = c0784uj.f4731e;
            l10 l10Var = new l10(interfaceC0531nq, c0606pq);
            c0784uj.f3474d++;
            l10 l10Var2 = c0784uj.f3472b;
            if (l10Var2 == null) {
                c0784uj.f3471a = l10Var;
                c0784uj.f3472b = l10Var;
            } else {
                l10Var2.f2990c = l10Var;
                l10Var.f2991d = l10Var2;
                c0784uj.f3472b = l10Var;
            }
            map2.put(interfaceC0531nq, l10Var);
            obj = null;
        }
        if (((C0606pq) obj) == null && (interfaceC0568oq = (InterfaceC0568oq) this.f519d.get()) != null) {
            boolean z3 = this.f520e != 0 || this.f521f;
            EnumC0383jq enumC0383jqM275b = m275b(interfaceC0531nq);
            this.f520e++;
            while (c0606pq.f3921a.compareTo(enumC0383jqM275b) < 0 && this.f517b.f4731e.containsKey(interfaceC0531nq)) {
                EnumC0383jq enumC0383jq3 = c0606pq.f3921a;
                ArrayList arrayList = this.f523h;
                arrayList.add(enumC0383jq3);
                C0270gq c0270gq = EnumC0347iq.Companion;
                EnumC0383jq enumC0383jq4 = c0606pq.f3921a;
                c0270gq.getClass();
                AbstractC0346ip.m1503o("state", enumC0383jq4);
                int iOrdinal = enumC0383jq4.ordinal();
                EnumC0347iq enumC0347iq = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0347iq.ON_RESUME : EnumC0347iq.ON_START : EnumC0347iq.ON_CREATE;
                if (enumC0347iq == null) {
                    throw new IllegalStateException("no event up from " + c0606pq.f3921a);
                }
                c0606pq.m2129a(interfaceC0568oq, enumC0347iq);
                arrayList.remove(arrayList.size() - 1);
                enumC0383jqM275b = m275b(interfaceC0531nq);
            }
            if (!z3) {
                m281h();
            }
            this.f520e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0383jq m275b(InterfaceC0531nq interfaceC0531nq) {
        HashMap map = this.f517b.f4731e;
        l10 l10Var = map.containsKey(interfaceC0531nq) ? ((l10) map.get(interfaceC0531nq)).f2991d : null;
        EnumC0383jq enumC0383jq = l10Var != null ? ((C0606pq) l10Var.f2989b).f3921a : null;
        ArrayList arrayList = this.f523h;
        EnumC0383jq enumC0383jq2 = arrayList.isEmpty() ? null : (EnumC0383jq) arrayList.get(arrayList.size() - 1);
        EnumC0383jq enumC0383jq3 = this.f518c;
        AbstractC0346ip.m1503o("state1", enumC0383jq3);
        if (enumC0383jq == null || enumC0383jq.compareTo(enumC0383jq3) >= 0) {
            enumC0383jq = enumC0383jq3;
        }
        return (enumC0383jq2 == null || enumC0383jq2.compareTo(enumC0383jq) >= 0) ? enumC0383jq : enumC0383jq2;
    }

    /* JADX INFO: renamed from: c */
    public final void m276c(String str) {
        if (this.f516a) {
            ((C0363j6) C0363j6.m1550z().f2586d).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(z30.m2765j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m277d(EnumC0347iq enumC0347iq) {
        AbstractC0346ip.m1503o("event", enumC0347iq);
        m276c("handleLifecycleEvent");
        m278e(enumC0347iq.m1517a());
    }

    /* JADX INFO: renamed from: e */
    public final void m278e(EnumC0383jq enumC0383jq) {
        EnumC0383jq enumC0383jq2 = this.f518c;
        if (enumC0383jq2 == enumC0383jq) {
            return;
        }
        EnumC0383jq enumC0383jq3 = EnumC0383jq.f2657b;
        EnumC0383jq enumC0383jq4 = EnumC0383jq.f2656a;
        if (enumC0383jq2 == enumC0383jq3 && enumC0383jq == enumC0383jq4) {
            throw new IllegalStateException(("no event down from " + this.f518c + " in component " + this.f519d.get()).toString());
        }
        this.f518c = enumC0383jq;
        if (this.f521f || this.f520e != 0) {
            this.f522g = true;
            return;
        }
        this.f521f = true;
        m281h();
        this.f521f = false;
        if (this.f518c == enumC0383jq4) {
            this.f517b = new C0784uj();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m279f(InterfaceC0531nq interfaceC0531nq) {
        m276c("removeObserver");
        this.f517b.mo1984b(interfaceC0531nq);
    }

    /* JADX INFO: renamed from: g */
    public final void m280g() {
        m276c("setCurrentState");
        m278e(EnumC0383jq.f2658c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f522g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m281h() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0036a.m281h():void");
    }
}
