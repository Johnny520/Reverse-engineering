package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3694 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f6532 = "android:changeBounds:bounds";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f6533 = "android:changeBounds:clip";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f6534 = "android:changeBounds:parent";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f6535 = "android:changeBounds:windowX";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f6536 = "android:changeBounds:windowY";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String[] f6537 = {f6532, f6533, f6534, f6535, f6536};

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Property<C3701, PointF> f6538 = new C0225(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final Property<C3701, PointF> f6539 = new C0226(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Property<View, PointF> f6540 = new C3695(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Property<View, PointF> f6541 = new C3696(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Property<View, PointF> f6542 = new C3697(PointF.class, "position");

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final C7048 f6543 = new C7048();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f6544;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ */
    public class C0225 extends Property<C3701, PointF> {
        public C0225(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(C3701 c3701) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(C3701 c3701, PointF pointF) {
            c3701.m10148(pointF);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟ */
    public class C0226 extends Property<C3701, PointF> {
        public C0226(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(C3701 c3701) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(C3701 c3701, PointF pointF) {
            c3701.m780(pointF);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public class C3695 extends Property<View, PointF> {
        public C3695(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C8371.m27933(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C3696 extends Property<View, PointF> {
        public C3696(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C8371.m27933(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C3697 extends Property<View, PointF> {
        public C3697(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C8371.m27933(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C3698 extends AnimatorListenerAdapter {
        private final C3701 mViewBounds;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C3701 f470;

        public C3698(C3701 c3701) {
            this.f470 = c3701;
            this.mViewBounds = c3701;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C3699 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final View f472;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Rect f473;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f6545;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Rect f6546;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean f6547;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f6548;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int f6549;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int f6550;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int f6551;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int f6552;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final int f6553;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final int f6554;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final int f6555;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f6556;

        public C3699(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f472 = view;
            this.f473 = rect;
            this.f6545 = z;
            this.f6546 = rect2;
            this.f6547 = z2;
            this.f6548 = i;
            this.f6549 = i2;
            this.f6550 = i3;
            this.f6551 = i4;
            this.f6552 = i5;
            this.f6553 = i6;
            this.f6554 = i7;
            this.f6555 = i8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f6556 = true;
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f472.setTag(C6934.C1117.f20096, this.f472.getClipBounds());
            this.f472.setClipBounds(this.f6547 ? null : this.f6546);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            Rect rect = (Rect) this.f472.getTag(C6934.C1117.f20096);
            this.f472.setTag(C6934.C1117.f20096, null);
            this.f472.setClipBounds(rect);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.f6556) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.f6545) {
                    rect = this.f473;
                }
            } else if (!this.f6547) {
                rect = this.f6546;
            }
            this.f472.setClipBounds(rect);
            if (z) {
                C8371.m27933(this.f472, this.f6548, this.f6549, this.f6550, this.f6551);
            } else {
                C8371.m27933(this.f472, this.f6552, this.f6553, this.f6554, this.f6555);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int iMax = Math.max(this.f6550 - this.f6548, this.f6554 - this.f6552);
            int iMax2 = Math.max(this.f6551 - this.f6549, this.f6555 - this.f6553);
            int i = z ? this.f6552 : this.f6548;
            int i2 = z ? this.f6553 : this.f6549;
            C8371.m27933(this.f472, i, i2, iMax + i, iMax2 + i2);
            this.f472.setClipBounds(z ? this.f6546 : this.f473);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C3700 extends C7985 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f474 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public final ViewGroup f475;

        public C3700(@InterfaceC6391 ViewGroup viewGroup) {
            this.f475 = viewGroup;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C8311.m27700(this.f475, false);
            this.f474 = true;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            if (!this.f474) {
                C8311.m27700(this.f475, false);
            }
            abstractC7956.removeListener(this);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C8311.m27700(this.f475, false);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            C8311.m27700(this.f475, true);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C3701 {

        /* JADX INFO: renamed from: ۥ */
        public int f476;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f477;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f6557;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f6558;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final View f6559;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f6560;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f6561;

        public C3701(View view) {
            this.f6559 = view;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m780(PointF pointF) {
            this.f6557 = Math.round(pointF.x);
            this.f6558 = Math.round(pointF.y);
            int i = this.f6561 + 1;
            this.f6561 = i;
            if (this.f6560 == i) {
                m781();
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m781() {
            C8371.m27933(this.f6559, this.f476, this.f477, this.f6557, this.f6558);
            this.f6560 = 0;
            this.f6561 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m10148(PointF pointF) {
            this.f476 = Math.round(pointF.x);
            this.f477 = Math.round(pointF.y);
            int i = this.f6560 + 1;
            this.f6560 = i;
            if (i == this.f6561) {
                m781();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3694() {
        this.f6544 = false;
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        Rect rect;
        captureValues(c7995);
        if (!this.f6544 || (rect = (Rect) c7995.f3178.getTag(C6934.C1117.f20096)) == null) {
            return;
        }
        c7995.f3177.put(f6533, rect);
    }

    public final void captureValues(C7995 c7995) {
        View view = c7995.f3178;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c7995.f3177.put(f6532, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c7995.f3177.put(f6534, c7995.f3178.getParent());
        if (this.f6544) {
            c7995.f3177.put(f6533, view.getClipBounds());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        int i;
        View view;
        int i2;
        int i3;
        int i4;
        ObjectAnimator objectAnimatorM2992;
        int i5;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorM25201;
        if (c7995 == null || c79952 == null) {
            return null;
        }
        Map<String, Object> map = c7995.f3177;
        Map<String, Object> map2 = c79952.f3177;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f6534);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f6534);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c79952.f3178;
        Rect rect = (Rect) c7995.f3177.get(f6532);
        Rect rect2 = (Rect) c79952.f3177.get(f6532);
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect3 = (Rect) c7995.f3177.get(f6533);
        Rect rect4 = (Rect) c79952.f3177.get(f6533);
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i = 0;
        } else {
            i = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        if (this.f6544) {
            view = view2;
            C8371.m27933(view, i6, i8, Math.max(i14, i16) + i6, i8 + Math.max(i15, i17));
            if (i6 == i7 && i8 == i9) {
                i2 = i11;
                i3 = i10;
                i4 = i8;
                objectAnimatorM2992 = null;
            } else {
                i2 = i11;
                i3 = i10;
                i4 = i8;
                objectAnimatorM2992 = C6497.m2992(view, f6542, getPathMotion().getPath(i6, i8, i7, i9));
            }
            boolean z = rect3 == null;
            if (z) {
                i5 = 0;
                rect3 = new Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
            }
            Rect rect5 = rect3;
            int i18 = rect4 == null ? 1 : i5;
            Rect rect6 = i18 != 0 ? new Rect(i5, i5, i16, i17) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f6543, rect5, rect6);
                C3699 c3699 = new C3699(view, rect5, z, rect6, i18, i6, i4, i3, i12, i7, i9, i2, i13);
                objectAnimatorOfObject.addListener(c3699);
                addListener(c3699);
            }
            animatorM25201 = C7994.m25201(objectAnimatorM2992, objectAnimatorOfObject);
        } else {
            view = view2;
            C8371.m27933(view, i6, i8, i10, i12);
            if (i != 2) {
                animatorM25201 = (i6 == i7 && i8 == i9) ? C6497.m2992(view, f6540, getPathMotion().getPath(i10, i12, i11, i13)) : C6497.m2992(view, f6541, getPathMotion().getPath(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorM25201 = C6497.m2992(view, f6542, getPathMotion().getPath(i6, i8, i7, i9));
            } else {
                C3701 c3701 = new C3701(view);
                ObjectAnimator objectAnimatorM29922 = C6497.m2992(c3701, f6538, getPathMotion().getPath(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorM29923 = C6497.m2992(c3701, f6539, getPathMotion().getPath(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM29922, objectAnimatorM29923);
                animatorSet.addListener(new C3698(c3701));
                animatorM25201 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C8311.m27700(viewGroup4, true);
            getRootTransition().addListener(new C3700(viewGroup4));
        }
        return animatorM25201;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public String[] getTransitionProperties() {
        return f6537;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m10146() {
        return this.f6544;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m10147(boolean z) {
        this.f6544 = z;
    }

    public C3694(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6544 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23043);
        boolean zM25316 = C8021.m25316(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        m10147(zM25316);
    }
}
