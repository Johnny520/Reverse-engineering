package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4786 extends AbstractC8388 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f10710 = "android:fade:transitionAlpha";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f10711 = "Fade";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f10712 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f10713 = 2;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦۡ$ۥ */
    public static class C0491 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final View f1111;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1112 = false;

        public C0491(View view) {
            this.f1111 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8371.m27934(this.f1111, 1.0f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f1111.hasOverlappingRendering() && this.f1111.getLayerType() == 0) {
                this.f1112 = true;
                this.f1111.setLayerType(2, null);
            }
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f1111.setTag(C6934.C1117.f20100, Float.valueOf(this.f1111.getVisibility() == 0 ? C8371.m4347(this.f1111) : 0.0f));
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f1111.setTag(C6934.C1117.f20100, null);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo14462(@InterfaceC6391 AbstractC7956 abstractC7956, boolean z) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator, boolean z) {
            if (this.f1112) {
                this.f1111.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            C8371.m27934(this.f1111, 1.0f);
            C8371.m4346(this.f1111);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4786(int i) {
        setMode(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static float m14460(C7995 c7995, float f) {
        Float f2;
        return (c7995 == null || (f2 = (Float) c7995.f3177.get(f10710)) == null) ? f : f2.floatValue();
    }

    @Override // Yue.AbstractC8388, Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        super.captureStartValues(c7995);
        Float fValueOf = (Float) c7995.f3178.getTag(C6934.C1117.f20100);
        if (fValueOf == null) {
            fValueOf = c7995.f3178.getVisibility() == 0 ? Float.valueOf(C8371.m4347(c7995.f3178)) : Float.valueOf(0.0f);
        }
        c7995.f3177.put(f10710, fValueOf);
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        C8371.m27931(view);
        return m14461(view, m14460(c7995, 0.0f), 1.0f);
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        C8371.m27931(view);
        Animator animatorM14461 = m14461(view, m14460(c7995, 1.0f), 0.0f);
        if (animatorM14461 == null) {
            C8371.m27934(view, m14460(c79952, 1.0f));
        }
        return animatorM14461;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Animator m14461(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C8371.m27934(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C8371.f24973, f2);
        C0491 c0491 = new C0491(view);
        objectAnimatorOfFloat.addListener(c0491);
        getRootTransition().addListener(c0491);
        return objectAnimatorOfFloat;
    }

    public C4786() {
    }

    public C4786(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23045);
        setMode(C8021.m25322(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
