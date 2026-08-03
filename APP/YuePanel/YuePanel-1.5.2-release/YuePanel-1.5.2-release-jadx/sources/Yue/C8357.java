package Yue;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8357 {

    /* JADX INFO: renamed from: ۥ */
    public final WeakReference<View> f3431;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۦ$ۥ */
    public class C1496 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC8359 f3432;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ View f3433;

        public C1496(InterfaceC8359 interfaceC8359, View view) {
            this.f3432 = interfaceC8359;
            this.f3433 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3432.mo33(this.f3433);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3432.mo34(this.f3433);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3432.mo5710(this.f3433);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۦ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C1497 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ViewPropertyAnimator m4325(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ViewPropertyAnimator m4326(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ViewPropertyAnimator m27893(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static ViewPropertyAnimator m27894(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    public C8357(View view) {
        this.f3431 = new WeakReference<>(view);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public C8357 m4324(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C8357 m27856(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27857() {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long m27858() {
        View view = this.f3431.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Interpolator m27859() {
        View view = this.f3431.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public long m27860() {
        View view = this.f3431.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C8357 m27861(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C8357 m27862(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C8357 m27863(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C8357 m27864(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8357 m27865(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C8357 m27866(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C8357 m27867(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C8357 m27868(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C8357 m27869(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C8357 m27870(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C8357 m27871(long j) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8357 m27872(@InterfaceC6490 Interpolator interpolator) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C8357 m27873(@InterfaceC6490 InterfaceC8359 interfaceC8359) {
        View view = this.f3431.get();
        if (view != null) {
            m27874(view, interfaceC8359);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m27874(View view, InterfaceC8359 interfaceC8359) {
        if (interfaceC8359 != null) {
            view.animate().setListener(new C1496(interfaceC8359, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C8357 m27875(long j) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C8357 m27876(@InterfaceC6490 final InterfaceC8361 interfaceC8361) {
        final View view = this.f3431.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC8361 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥۢۤۦۥ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC8361.mo4329(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m27877() {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C8357 m27878(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C8357 m27879(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C8357 m27880(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public C8357 m27881(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8357 m27882(float f) {
        View view = this.f3431.get();
        if (view != null) {
            C1497.m4325(view.animate(), f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C8357 m27883(float f) {
        View view = this.f3431.get();
        if (view != null) {
            C1497.m4326(view.animate(), f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C8357 m27884(@InterfaceC6391 Runnable runnable) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @InterfaceC6391
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C8357 m27885() {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C8357 m27886(@InterfaceC6391 Runnable runnable) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public C8357 m27887(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C8357 m27888(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public C8357 m27889(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C8357 m27890(float f) {
        View view = this.f3431.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C8357 m27891(float f) {
        View view = this.f3431.get();
        if (view != null) {
            C1497.m27893(view.animate(), f);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public C8357 m27892(float f) {
        View view = this.f3431.get();
        if (view != null) {
            C1497.m27894(view.animate(), f);
        }
        return this;
    }
}
