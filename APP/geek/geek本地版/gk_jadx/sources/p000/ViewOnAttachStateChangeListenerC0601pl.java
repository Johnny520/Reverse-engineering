package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0035a;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: pl */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0601pl implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3914a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3916c;

    public ViewOnAttachStateChangeListenerC0601pl(LayoutInflaterFactory2C0638ql layoutInflaterFactory2C0638ql, C0035a c0035a) {
        this.f3916c = layoutInflaterFactory2C0638ql;
        this.f3915b = c0035a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3914a) {
            case Base64.DEFAULT /* 0 */:
                C0035a c0035a = (C0035a) this.f3915b;
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
                c0035a.m264k();
                C0103cg.m674f((ViewGroup) abstractComponentCallbacksC0489ml.f3229E.getParent(), ((LayoutInflaterFactory2C0638ql) this.f3916c).f4108a.m2733y()).m679e();
                break;
            default:
                AbstractC0346ip.m1503o(u40.m2419a("ZA==\n", "ElH1bmmP0/k=\n"), view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3914a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                AbstractC0346ip.m1503o(u40.m2419a("3w==\n", "qZwR1n1Fv/g=\n"), view);
                ValueAnimator valueAnimator = (ValueAnimator) ((i00) this.f3915b).f2326b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Object tag = ((View) this.f3916c).getTag(2114519045);
                h40 h40Var = tag instanceof h40 ? (h40) tag : null;
                if (h40Var != null) {
                    h40Var.m1341c();
                }
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0601pl(i00 i00Var, View view) {
        this.f3915b = i00Var;
        this.f3916c = view;
    }

    /* JADX INFO: renamed from: a */
    private final void m2124a(View view) {
    }
}
