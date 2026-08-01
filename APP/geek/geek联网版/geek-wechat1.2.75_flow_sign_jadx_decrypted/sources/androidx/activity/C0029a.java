package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0036a;
import java.util.Iterator;
import java.util.ListIterator;
import p000.AbstractC0493mp;
import p000.C0023am;
import p000.C0047ax;
import p000.C0084bx;
import p000.C0166dx;
import p000.C0240fx;
import p000.C0400k6;
import p000.C0785ul;
import p000.C0982zw;
import p000.EnumC0531nq;
import p000.InterfaceC0716sq;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0029a {

    /* JADX INFO: renamed from: a */
    public final Runnable f146a;

    /* JADX INFO: renamed from: b */
    public final C0400k6 f147b = new C0400k6();

    /* JADX INFO: renamed from: c */
    public C0785ul f148c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f149d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f150e;

    /* JADX INFO: renamed from: f */
    public boolean f151f;

    /* JADX INFO: renamed from: g */
    public boolean f152g;

    public C0029a(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM548a;
        this.f146a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM548a = C0166dx.f1435a.m941a(new C0982zw(this, 0), new C0982zw(this, 1), new C0047ax(0, this), new C0047ax(1, this));
            } else {
                onBackInvokedCallbackM548a = C0084bx.f789a.m548a(new C0047ax(2, this));
            }
            this.f149d = onBackInvokedCallbackM548a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m110a(InterfaceC0716sq interfaceC0716sq, C0785ul c0785ul) {
        AbstractC0493mp.m1857g("onBackPressedCallback", c0785ul);
        C0036a c0036aMo105e = interfaceC0716sq.mo105e();
        if (c0036aMo105e.f481c == EnumC0531nq.f3329a) {
            return;
        }
        c0785ul.f4837b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0036aMo105e, c0785ul));
        m113d();
        c0785ul.f4838c = new C0240fx(0, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m111b() {
        Object objPrevious;
        C0400k6 c0400k6 = this.f147b;
        c0400k6.getClass();
        ListIterator listIterator = c0400k6.listIterator(c0400k6.f2788c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C0785ul) objPrevious).f4836a) {
                    break;
                }
            }
        }
        C0785ul c0785ul = (C0785ul) objPrevious;
        this.f148c = null;
        if (c0785ul == null) {
            this.f146a.run();
            return;
        }
        C0023am c0023am = c0785ul.f4839d;
        c0023am.m94t(true);
        if (c0023am.f101h.f4836a) {
            c0023am.m62G();
        } else {
            c0023am.f100g.m111b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m112c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f150e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f149d) == null) {
            return;
        }
        C0084bx c0084bx = C0084bx.f789a;
        if (z && !this.f151f) {
            c0084bx.m549b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f151f = true;
        } else {
            if (z || !this.f151f) {
                return;
            }
            c0084bx.m550c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f151f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m113d() {
        boolean z = this.f152g;
        boolean z2 = false;
        C0400k6 c0400k6 = this.f147b;
        if (c0400k6 == null || !c0400k6.isEmpty()) {
            Iterator it = c0400k6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0785ul) it.next()).f4836a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f152g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m112c(z2);
    }
}
