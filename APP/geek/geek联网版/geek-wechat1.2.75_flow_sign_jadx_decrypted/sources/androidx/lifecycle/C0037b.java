package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import p000.AbstractC0717sr;
import p000.C0023am;
import p000.C0363j6;
import p000.C0431l0;
import p000.C0680rr;
import p000.DialogInterfaceOnCancelListenerC0743tg;
import p000.InterfaceC0716sq;
import p000.g40;
import p000.s10;
import p000.t10;
import p000.v10;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public class C0037b {

    /* JADX INFO: renamed from: j */
    public static final Object f487j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f488a = new Object();

    /* JADX INFO: renamed from: b */
    public final v10 f489b = new v10();

    /* JADX INFO: renamed from: c */
    public int f490c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f491d;

    /* JADX INFO: renamed from: e */
    public volatile Object f492e;

    /* JADX INFO: renamed from: f */
    public volatile Object f493f;

    /* JADX INFO: renamed from: g */
    public int f494g;

    /* JADX INFO: renamed from: h */
    public boolean f495h;

    /* JADX INFO: renamed from: i */
    public boolean f496i;

    public C0037b() {
        Object obj = f487j;
        this.f493f = obj;
        this.f492e = obj;
        this.f494g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m267a(String str) {
        ((C0363j6) C0363j6.m1574P().f2663f).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(g40.m1147j("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m268b(AbstractC0717sr abstractC0717sr) {
        if (abstractC0717sr.f4359b) {
            if (!abstractC0717sr.mo258e()) {
                abstractC0717sr.m2383c(false);
                return;
            }
            int i = abstractC0717sr.f4360c;
            int i2 = this.f494g;
            if (i >= i2) {
                return;
            }
            abstractC0717sr.f4360c = i2;
            C0431l0 c0431l0 = abstractC0717sr.f4358a;
            Object obj = this.f492e;
            c0431l0.getClass();
            InterfaceC0716sq interfaceC0716sq = (InterfaceC0716sq) obj;
            DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg = (DialogInterfaceOnCancelListenerC0743tg) c0431l0.f2886b;
            if (interfaceC0716sq == null || !dialogInterfaceOnCancelListenerC0743tg.f4515W) {
                return;
            }
            View viewM2031A = dialogInterfaceOnCancelListenerC0743tg.m2031A();
            if (viewM2031A.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogInterfaceOnCancelListenerC0743tg.f4519a0 != null) {
                if (C0023am.m55A(3)) {
                    Log.d("FragmentManager", "DialogFragment " + c0431l0 + " setting the content view on " + dialogInterfaceOnCancelListenerC0743tg.f4519a0);
                }
                dialogInterfaceOnCancelListenerC0743tg.f4519a0.setContentView(viewM2031A);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m269c(AbstractC0717sr abstractC0717sr) {
        if (this.f495h) {
            this.f496i = true;
            return;
        }
        this.f495h = true;
        do {
            this.f496i = false;
            if (abstractC0717sr != null) {
                m268b(abstractC0717sr);
                abstractC0717sr = null;
            } else {
                v10 v10Var = this.f489b;
                v10Var.getClass();
                t10 t10Var = new t10(v10Var);
                v10Var.f4874c.put(t10Var, Boolean.FALSE);
                while (t10Var.hasNext()) {
                    m268b((AbstractC0717sr) ((Map.Entry) t10Var.next()).getValue());
                    if (this.f496i) {
                        break;
                    }
                }
            }
        } while (this.f496i);
        this.f495h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m270d(C0431l0 c0431l0) {
        Object obj;
        m267a("observeForever");
        C0680rr c0680rr = new C0680rr(this, c0431l0);
        v10 v10Var = this.f489b;
        s10 s10VarMo2531a = v10Var.mo2531a(c0431l0);
        if (s10VarMo2531a != null) {
            obj = s10VarMo2531a.f4188b;
        } else {
            s10 s10Var = new s10(c0431l0, c0680rr);
            v10Var.f4875d++;
            s10 s10Var2 = v10Var.f4873b;
            if (s10Var2 == null) {
                v10Var.f4872a = s10Var;
                v10Var.f4873b = s10Var;
            } else {
                s10Var2.f4189c = s10Var;
                s10Var.f4190d = s10Var2;
                v10Var.f4873b = s10Var;
            }
            obj = null;
        }
        AbstractC0717sr abstractC0717sr = (AbstractC0717sr) obj;
        if (abstractC0717sr instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0717sr != null) {
            return;
        }
        c0680rr.m2383c(true);
    }

    /* JADX INFO: renamed from: e */
    public final void m271e(Object obj) {
        m267a("setValue");
        this.f494g++;
        this.f492e = obj;
        m269c(null);
    }
}
