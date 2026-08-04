package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0038;
import java.util.Iterator;
import java.util.ListIterator;
import yyds.AbstractC1535;
import yyds.C0217;
import yyds.C1209;
import yyds.C2241;
import yyds.C2748;
import yyds.EnumC1464;
import yyds.InterfaceC2671;
import yyds.RunnableC0309;

/* JADX INFO: renamed from: androidx.activity.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f38;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final RunnableC0309 f39;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0217 f40 = new C0217();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2241 f41;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f42;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final OnBackInvokedCallback f43;

    public C0033(RunnableC0309 runnableC0309) {
        this.f39 = runnableC0309;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f41 = new C2241(0, this);
            this.f43 = C1209.f5504.m2403(new C2241(1, this));
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m21(InterfaceC2671 interfaceC2671, C2748 c2748) {
        C0038 c0038Mo14 = interfaceC2671.mo14();
        if (c0038Mo14.f313 == EnumC1464.f6969) {
            return;
        }
        c2748.f7378.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0038Mo14, c2748));
        if (Build.VERSION.SDK_INT >= 33) {
            m23();
            c2748.f7379 = this.f41;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m22() {
        Object objPrevious;
        C0217 c0217 = this.f40;
        ListIterator listIterator = c0217.listIterator(c0217.mo868());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AbstractC1535) objPrevious).f7377) {
                    break;
                }
            }
        }
        AbstractC1535 abstractC1535 = (AbstractC1535) objPrevious;
        if (abstractC1535 != null) {
            abstractC1535.mo3166();
        } else {
            this.f39.run();
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m23() {
        boolean z;
        C0217 c0217 = this.f40;
        if (c0217 == null || !c0217.isEmpty()) {
            Iterator it = c0217.iterator();
            while (it.hasNext()) {
                if (((AbstractC1535) it.next()).f7377) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f38;
        OnBackInvokedCallback onBackInvokedCallback = this.f43;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C1209 c1209 = C1209.f5504;
        if (z && !this.f42) {
            c1209.m2404(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f42 = true;
        } else {
            if (z || !this.f42) {
                return;
            }
            c1209.m2405(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f42 = false;
        }
    }
}
