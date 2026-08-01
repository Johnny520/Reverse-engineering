package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0036a;
import java.util.Iterator;
import java.util.ListIterator;
import p000.AbstractC0346ip;
import p000.C0400k6;
import p000.C0686rw;
import p000.C0712sl;
import p000.C0723sw;
import p000.C0760tw;
import p000.C0834vw;
import p000.C0908xw;
import p000.C0934yl;
import p000.EnumC0383jq;
import p000.InterfaceC0568oq;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0029a {

    /* JADX INFO: renamed from: a */
    public final Runnable f183a;

    /* JADX INFO: renamed from: b */
    public final C0400k6 f184b = new C0400k6();

    /* JADX INFO: renamed from: c */
    public C0712sl f185c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f186d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f187e;

    /* JADX INFO: renamed from: f */
    public boolean f188f;

    /* JADX INFO: renamed from: g */
    public boolean f189g;

    public C0029a(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM2390a;
        this.f183a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM2390a = C0834vw.f4888a.m2526a(new C0686rw(this, 0), new C0686rw(this, 1), new C0723sw(0, this), new C0723sw(1, this));
            } else {
                onBackInvokedCallbackM2390a = C0760tw.f4626a.m2390a(new C0723sw(2, this));
            }
            this.f186d = onBackInvokedCallbackM2390a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m125a(InterfaceC0568oq interfaceC0568oq, C0712sl c0712sl) {
        AbstractC0346ip.m1503o("onBackPressedCallback", c0712sl);
        C0036a c0036aMo120e = interfaceC0568oq.mo120e();
        if (c0036aMo120e.f518c == EnumC0383jq.f2656a) {
            return;
        }
        c0712sl.f4447b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0036aMo120e, c0712sl));
        m128d();
        c0712sl.f4448c = new C0908xw(0, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m126b() {
        Object objPrevious;
        C0400k6 c0400k6 = this.f184b;
        c0400k6.getClass();
        ListIterator listIterator = c0400k6.listIterator(c0400k6.f2706c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C0712sl) objPrevious).f4446a) {
                    break;
                }
            }
        }
        C0712sl c0712sl = (C0712sl) objPrevious;
        this.f185c = null;
        if (c0712sl == null) {
            this.f183a.run();
            return;
        }
        C0934yl c0934yl = c0712sl.f4449d;
        c0934yl.m2728t(true);
        if (c0934yl.f5359h.f4446a) {
            c0934yl.m2696G();
        } else {
            c0934yl.f5358g.m126b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m127c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f187e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f186d) == null) {
            return;
        }
        C0760tw c0760tw = C0760tw.f4626a;
        if (z && !this.f188f) {
            c0760tw.m2391b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f188f = true;
        } else {
            if (z || !this.f188f) {
                return;
            }
            c0760tw.m2392c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f188f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128d() {
        boolean z = this.f189g;
        boolean z2 = false;
        C0400k6 c0400k6 = this.f184b;
        if (c0400k6 == null || !c0400k6.isEmpty()) {
            Iterator it = c0400k6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0712sl) it.next()).f4446a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f189g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m127c(z2);
    }
}
