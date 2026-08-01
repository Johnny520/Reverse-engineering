package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import p000.AbstractC0569or;
import p000.C0363j6;
import p000.C0431l0;
import p000.C0532nr;
import p000.C0934yl;
import p000.DialogInterfaceOnCancelListenerC0670rg;
import p000.InterfaceC0568oq;
import p000.l10;
import p000.m10;
import p000.o10;
import p000.z30;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public class C0037b {

    /* JADX INFO: renamed from: j */
    public static final Object f524j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f525a = new Object();

    /* JADX INFO: renamed from: b */
    public final o10 f526b = new o10();

    /* JADX INFO: renamed from: c */
    public int f527c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f528d;

    /* JADX INFO: renamed from: e */
    public volatile Object f529e;

    /* JADX INFO: renamed from: f */
    public volatile Object f530f;

    /* JADX INFO: renamed from: g */
    public int f531g;

    /* JADX INFO: renamed from: h */
    public boolean f532h;

    /* JADX INFO: renamed from: i */
    public boolean f533i;

    public C0037b() {
        Object obj = f524j;
        this.f530f = obj;
        this.f529e = obj;
        this.f531g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m282a(String str) {
        ((C0363j6) C0363j6.m1550z().f2586d).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(z30.m2765j("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m283b(AbstractC0569or abstractC0569or) {
        if (abstractC0569or.f3574b) {
            if (!abstractC0569or.mo273e()) {
                abstractC0569or.m2021c(false);
                return;
            }
            int i = abstractC0569or.f3575c;
            int i2 = this.f531g;
            if (i >= i2) {
                return;
            }
            abstractC0569or.f3575c = i2;
            C0431l0 c0431l0 = abstractC0569or.f3573a;
            Object obj = this.f529e;
            c0431l0.getClass();
            InterfaceC0568oq interfaceC0568oq = (InterfaceC0568oq) obj;
            DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg = (DialogInterfaceOnCancelListenerC0670rg) c0431l0.f2980b;
            if (interfaceC0568oq == null || !dialogInterfaceOnCancelListenerC0670rg.f4276W) {
                return;
            }
            View viewM1829A = dialogInterfaceOnCancelListenerC0670rg.m1829A();
            if (viewM1829A.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogInterfaceOnCancelListenerC0670rg.f4280a0 != null) {
                if (C0934yl.m2689A(3)) {
                    Log.d("FragmentManager", "DialogFragment " + c0431l0 + " setting the content view on " + dialogInterfaceOnCancelListenerC0670rg.f4280a0);
                }
                dialogInterfaceOnCancelListenerC0670rg.f4280a0.setContentView(viewM1829A);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m284c(AbstractC0569or abstractC0569or) {
        if (this.f532h) {
            this.f533i = true;
            return;
        }
        this.f532h = true;
        do {
            this.f533i = false;
            if (abstractC0569or != null) {
                m283b(abstractC0569or);
                abstractC0569or = null;
            } else {
                o10 o10Var = this.f526b;
                o10Var.getClass();
                m10 m10Var = new m10(o10Var);
                o10Var.f3473c.put(m10Var, Boolean.FALSE);
                while (m10Var.hasNext()) {
                    m283b((AbstractC0569or) ((Map.Entry) m10Var.next()).getValue());
                    if (this.f533i) {
                        break;
                    }
                }
            }
        } while (this.f533i);
        this.f532h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m285d(C0431l0 c0431l0) {
        Object obj;
        m282a("observeForever");
        C0532nr c0532nr = new C0532nr(this, c0431l0);
        o10 o10Var = this.f526b;
        l10 l10VarMo1983a = o10Var.mo1983a(c0431l0);
        if (l10VarMo1983a != null) {
            obj = l10VarMo1983a.f2989b;
        } else {
            l10 l10Var = new l10(c0431l0, c0532nr);
            o10Var.f3474d++;
            l10 l10Var2 = o10Var.f3472b;
            if (l10Var2 == null) {
                o10Var.f3471a = l10Var;
                o10Var.f3472b = l10Var;
            } else {
                l10Var2.f2990c = l10Var;
                l10Var.f2991d = l10Var2;
                o10Var.f3472b = l10Var;
            }
            obj = null;
        }
        AbstractC0569or abstractC0569or = (AbstractC0569or) obj;
        if (abstractC0569or instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0569or != null) {
            return;
        }
        c0532nr.m2021c(true);
    }

    /* JADX INFO: renamed from: e */
    public final void m286e(Object obj) {
        m282a("setValue");
        this.f531g++;
        this.f529e = obj;
        m284c(null);
    }
}
