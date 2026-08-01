package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: qj */
/* JADX INFO: loaded from: classes.dex */
public final class C0635qj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3914a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3915b = false;

    /* JADX INFO: renamed from: c */
    public final Object f3916c;

    public C0635qj(View view) {
        this.f3916c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3914a) {
            case Base64.NO_PADDING /* 1 */:
                this.f3915b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3914a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3916c;
                gb0.f1949a.mo1324I(view, 1.0f);
                if (this.f3915b) {
                    view.setLayerType(0, null);
                }
                break;
            default:
                C0932yj c0932yj = (C0932yj) this.f3916c;
                if (this.f3915b) {
                    this.f3915b = false;
                } else if (((Float) c0932yj.f5462z.getAnimatedValue()).floatValue() != 0.0f) {
                    c0932yj.f5435A = 2;
                    c0932yj.f5455s.invalidate();
                } else {
                    c0932yj.f5435A = 0;
                    c0932yj.m2768f(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3914a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3916c;
                WeakHashMap weakHashMap = oa0.f3426a;
                if (x90.m2660h(view) && view.getLayerType() == 0) {
                    this.f3915b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0635qj(C0932yj c0932yj) {
        this.f3916c = c0932yj;
    }
}
