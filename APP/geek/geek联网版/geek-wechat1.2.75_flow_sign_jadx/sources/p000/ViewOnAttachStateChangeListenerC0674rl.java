package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0035a;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: rl */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0674rl implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4153a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4155c;

    public ViewOnAttachStateChangeListenerC0674rl(LayoutInflaterFactory2C0711sl layoutInflaterFactory2C0711sl, C0035a c0035a) {
        this.f4155c = layoutInflaterFactory2C0711sl;
        this.f4154b = c0035a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4153a) {
            case Base64.DEFAULT /* 0 */:
                C0035a c0035a = (C0035a) this.f4154b;
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
                c0035a.m249k();
                C0150dg.m915f((ViewGroup) abstractComponentCallbacksC0563ol.f3474E.getParent(), ((LayoutInflaterFactory2C0711sl) this.f4155c).f4339a.m99y()).m920e();
                break;
            default:
                AbstractC0493mp.m1857g(b50.m492a("ZA==\n", "EiSJS18LwR4=\n"), view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4153a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                AbstractC0493mp.m1857g(b50.m492a("sg==\n", "xKRtCW9q1GU=\n"), view);
                ValueAnimator valueAnimator = (ValueAnimator) ((p00) this.f4154b).f3560b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Object tag = ((View) this.f4155c).getTag(2114519045);
                o40 o40Var = tag instanceof o40 ? (o40) tag : null;
                if (o40Var != null) {
                    o40Var.m1986c();
                }
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0674rl(p00 p00Var, View view) {
        this.f4154b = p00Var;
        this.f4155c = view;
    }

    /* JADX INFO: renamed from: a */
    private final void m2298a(View view) {
    }
}
