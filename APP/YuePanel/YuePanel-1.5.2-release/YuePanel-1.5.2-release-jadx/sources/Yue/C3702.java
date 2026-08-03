package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3702 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f6563 = "android:clipBounds:bounds";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f6562 = "android:clipBounds:clip";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String[] f6564 = {f6562};

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Rect f6565 = new Rect();

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠$ۥ */
    public static class C0227 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final Rect f478;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Rect f479;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final View f6566;

        public C0227(View view, Rect rect, Rect rect2) {
            this.f6566 = view;
            this.f478 = rect;
            this.f479 = rect2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            Rect clipBounds = this.f6566.getClipBounds();
            if (clipBounds == null) {
                clipBounds = C3702.f6565;
            }
            this.f6566.setTag(C6934.C1117.f20096, clipBounds);
            this.f6566.setClipBounds(this.f479);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f6566.setClipBounds((Rect) this.f6566.getTag(C6934.C1117.f20096));
            this.f6566.setTag(C6934.C1117.f20096, null);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                this.f6566.setClipBounds(this.f478);
            } else {
                this.f6566.setClipBounds(this.f479);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3702() {
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        m10149(c7995, false);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        m10149(c7995, true);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null || c79952 == null || !c7995.f3177.containsKey(f6562) || !c79952.f3177.containsKey(f6562)) {
            return null;
        }
        Rect rect = (Rect) c7995.f3177.get(f6562);
        Rect rect2 = (Rect) c79952.f3177.get(f6562);
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) c7995.f3177.get(f6563) : rect;
        Rect rect4 = rect2 == null ? (Rect) c79952.f3177.get(f6563) : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        c79952.f3178.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c79952.f3178, (Property<View, V>) C8371.f24974, (TypeEvaluator) new C7048(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        C0227 c0227 = new C0227(c79952.f3178, rect, rect2);
        objectAnimatorOfObject.addListener(c0227);
        addListener(c0227);
        return objectAnimatorOfObject;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public String[] getTransitionProperties() {
        return f6564;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m10149(C7995 c7995, boolean z) {
        View view = c7995.f3178;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(C6934.C1117.f20096) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f6565 ? clipBounds : null;
        c7995.f3177.put(f6562, rect);
        if (rect == null) {
            c7995.f3177.put(f6563, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3702(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
