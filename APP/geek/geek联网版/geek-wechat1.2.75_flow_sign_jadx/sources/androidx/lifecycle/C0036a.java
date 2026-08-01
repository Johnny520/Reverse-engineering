package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0493mp;
import p000.AbstractC0790uq;
import p000.C0363j6;
import p000.C0420kq;
import p000.C0753tq;
import p000.C0858wj;
import p000.EnumC0494mq;
import p000.EnumC0531nq;
import p000.InterfaceC0111co;
import p000.InterfaceC0642qq;
import p000.InterfaceC0679rq;
import p000.InterfaceC0716sq;
import p000.InterfaceC0854wf;
import p000.g40;
import p000.s10;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0036a {

    /* JADX INFO: renamed from: a */
    public final boolean f479a;

    /* JADX INFO: renamed from: b */
    public C0858wj f480b;

    /* JADX INFO: renamed from: c */
    public EnumC0531nq f481c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f482d;

    /* JADX INFO: renamed from: e */
    public int f483e;

    /* JADX INFO: renamed from: f */
    public boolean f484f;

    /* JADX INFO: renamed from: g */
    public boolean f485g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f486h;

    public C0036a(InterfaceC0716sq interfaceC0716sq) {
        new AtomicReference();
        this.f479a = true;
        this.f480b = new C0858wj();
        this.f481c = EnumC0531nq.f3330b;
        this.f486h = new ArrayList();
        this.f482d = new WeakReference(interfaceC0716sq);
    }

    /* JADX INFO: renamed from: a */
    public final void m259a(InterfaceC0679rq interfaceC0679rq) {
        InterfaceC0642qq reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0716sq interfaceC0716sq;
        m261c("addObserver");
        EnumC0531nq enumC0531nq = this.f481c;
        EnumC0531nq enumC0531nq2 = EnumC0531nq.f3329a;
        if (enumC0531nq != enumC0531nq2) {
            enumC0531nq2 = EnumC0531nq.f3330b;
        }
        C0753tq c0753tq = new C0753tq();
        HashMap map = AbstractC0790uq.f4843a;
        boolean z = interfaceC0679rq instanceof InterfaceC0642qq;
        boolean z2 = interfaceC0679rq instanceof InterfaceC0854wf;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0854wf) interfaceC0679rq, (InterfaceC0642qq) interfaceC0679rq);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0854wf) interfaceC0679rq, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC0642qq) interfaceC0679rq;
        } else {
            Class<?> cls = interfaceC0679rq.getClass();
            if (AbstractC0790uq.m2481b(cls) == 2) {
                Object obj2 = AbstractC0790uq.f4844b.get(cls);
                AbstractC0493mp.m1854d(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0790uq.m2480a((Constructor) list.get(0), interfaceC0679rq);
                    throw null;
                }
                int size = list.size();
                InterfaceC0111co[] interfaceC0111coArr = new InterfaceC0111co[size];
                if (size > 0) {
                    AbstractC0790uq.m2480a((Constructor) list.get(0), interfaceC0679rq);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0111coArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0679rq);
            }
        }
        c0753tq.f4572b = reflectiveGenericLifecycleObserver;
        c0753tq.f4571a = enumC0531nq2;
        C0858wj c0858wj = this.f480b;
        s10 s10VarMo2531a = c0858wj.mo2531a(interfaceC0679rq);
        if (s10VarMo2531a != null) {
            obj = s10VarMo2531a.f4188b;
        } else {
            HashMap map2 = c0858wj.f5100e;
            s10 s10Var = new s10(interfaceC0679rq, c0753tq);
            c0858wj.f4875d++;
            s10 s10Var2 = c0858wj.f4873b;
            if (s10Var2 == null) {
                c0858wj.f4872a = s10Var;
                c0858wj.f4873b = s10Var;
            } else {
                s10Var2.f4189c = s10Var;
                s10Var.f4190d = s10Var2;
                c0858wj.f4873b = s10Var;
            }
            map2.put(interfaceC0679rq, s10Var);
            obj = null;
        }
        if (((C0753tq) obj) == null && (interfaceC0716sq = (InterfaceC0716sq) this.f482d.get()) != null) {
            boolean z3 = this.f483e != 0 || this.f484f;
            EnumC0531nq enumC0531nqM260b = m260b(interfaceC0679rq);
            this.f483e++;
            while (c0753tq.f4571a.compareTo(enumC0531nqM260b) < 0 && this.f480b.f5100e.containsKey(interfaceC0679rq)) {
                EnumC0531nq enumC0531nq3 = c0753tq.f4571a;
                ArrayList arrayList = this.f486h;
                arrayList.add(enumC0531nq3);
                C0420kq c0420kq = EnumC0494mq.Companion;
                EnumC0531nq enumC0531nq4 = c0753tq.f4571a;
                c0420kq.getClass();
                AbstractC0493mp.m1857g("state", enumC0531nq4);
                int iOrdinal = enumC0531nq4.ordinal();
                EnumC0494mq enumC0494mq = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0494mq.ON_RESUME : EnumC0494mq.ON_START : EnumC0494mq.ON_CREATE;
                if (enumC0494mq == null) {
                    throw new IllegalStateException("no event up from " + c0753tq.f4571a);
                }
                c0753tq.m2420a(interfaceC0716sq, enumC0494mq);
                arrayList.remove(arrayList.size() - 1);
                enumC0531nqM260b = m260b(interfaceC0679rq);
            }
            if (!z3) {
                m266h();
            }
            this.f483e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0531nq m260b(InterfaceC0679rq interfaceC0679rq) {
        HashMap map = this.f480b.f5100e;
        s10 s10Var = map.containsKey(interfaceC0679rq) ? ((s10) map.get(interfaceC0679rq)).f4190d : null;
        EnumC0531nq enumC0531nq = s10Var != null ? ((C0753tq) s10Var.f4188b).f4571a : null;
        ArrayList arrayList = this.f486h;
        EnumC0531nq enumC0531nq2 = arrayList.isEmpty() ? null : (EnumC0531nq) arrayList.get(arrayList.size() - 1);
        EnumC0531nq enumC0531nq3 = this.f481c;
        AbstractC0493mp.m1857g("state1", enumC0531nq3);
        if (enumC0531nq == null || enumC0531nq.compareTo(enumC0531nq3) >= 0) {
            enumC0531nq = enumC0531nq3;
        }
        return (enumC0531nq2 == null || enumC0531nq2.compareTo(enumC0531nq) >= 0) ? enumC0531nq : enumC0531nq2;
    }

    /* JADX INFO: renamed from: c */
    public final void m261c(String str) {
        if (this.f479a) {
            ((C0363j6) C0363j6.m1574P().f2663f).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(g40.m1147j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m262d(EnumC0494mq enumC0494mq) {
        AbstractC0493mp.m1857g("event", enumC0494mq);
        m261c("handleLifecycleEvent");
        m263e(enumC0494mq.m1879a());
    }

    /* JADX INFO: renamed from: e */
    public final void m263e(EnumC0531nq enumC0531nq) {
        EnumC0531nq enumC0531nq2 = this.f481c;
        if (enumC0531nq2 == enumC0531nq) {
            return;
        }
        EnumC0531nq enumC0531nq3 = EnumC0531nq.f3330b;
        EnumC0531nq enumC0531nq4 = EnumC0531nq.f3329a;
        if (enumC0531nq2 == enumC0531nq3 && enumC0531nq == enumC0531nq4) {
            throw new IllegalStateException(("no event down from " + this.f481c + " in component " + this.f482d.get()).toString());
        }
        this.f481c = enumC0531nq;
        if (this.f484f || this.f483e != 0) {
            this.f485g = true;
            return;
        }
        this.f484f = true;
        m266h();
        this.f484f = false;
        if (this.f481c == enumC0531nq4) {
            this.f480b = new C0858wj();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m264f(InterfaceC0679rq interfaceC0679rq) {
        m261c("removeObserver");
        this.f480b.mo2532b(interfaceC0679rq);
    }

    /* JADX INFO: renamed from: g */
    public final void m265g() {
        m261c("setCurrentState");
        m263e(EnumC0531nq.f3331c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f485g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m266h() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0036a.m266h():void");
    }
}
