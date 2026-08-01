package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0060b9 extends r70 {

    /* JADX INFO: renamed from: A */
    public static final C0884x8 f781A;

    /* JADX INFO: renamed from: B */
    public static final C0884x8 f782B;

    /* JADX INFO: renamed from: w */
    public static final String[] f783w = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: x */
    public static final C0884x8 f784x;

    /* JADX INFO: renamed from: y */
    public static final C0884x8 f785y;

    /* JADX INFO: renamed from: z */
    public static final C0884x8 f786z;

    static {
        new C0847w8(PointF.class, "boundsOrigin").f4936a = new Rect();
        f784x = new C0884x8(PointF.class, "topLeft", 0);
        f785y = new C0884x8(PointF.class, "bottomRight", 1);
        f786z = new C0884x8(PointF.class, "bottomRight", 2);
        f781A = new C0884x8(PointF.class, "topLeft", 3);
        f782B = new C0884x8(PointF.class, "position", 4);
    }

    /* JADX INFO: renamed from: F */
    public static void m543F(x70 x70Var) {
        View view = x70Var.f5122b;
        HashMap map = x70Var.f5121a;
        WeakHashMap weakHashMap = ja0.f2600a;
        if (!v90.m2496c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: c */
    public final void mo544c(x70 x70Var) {
        m543F(x70Var);
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: f */
    public final void mo545f(x70 x70Var) {
        m543F(x70Var);
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: j */
    public final Animator mo546j(ViewGroup viewGroup, x70 x70Var, x70 x70Var2) {
        int i;
        C0060b9 c0060b9;
        Animator animatorOfObject;
        if (x70Var != null) {
            HashMap map = x70Var.f5121a;
            if (x70Var2 != null) {
                HashMap map2 = x70Var2.f5121a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = x70Var2.f5122b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        bb0.m551a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c0060b9 = this;
                            if (i2 == i3 && i4 == i5) {
                                c0060b9.f4243s.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, f786z, (TypeConverter) null, C0354iy.m1527a(i6, i8, i7, i9));
                            } else {
                                c0060b9.f4243s.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, f781A, (TypeConverter) null, C0354iy.m1527a(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c0060b9 = this;
                            c0060b9.f4243s.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, f782B, (TypeConverter) null, C0354iy.m1527a(i2, i4, i3, i5));
                        } else {
                            c0060b9 = this;
                            C0010a9 c0010a9 = new C0010a9();
                            c0010a9.f94e = view;
                            c0060b9.f4243s.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c0010a9, f784x, (TypeConverter) null, C0354iy.m1527a(i2, i4, i3, i5));
                            c0060b9.f4243s.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c0010a9, f785y, (TypeConverter) null, C0354iy.m1527a(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new C0921y8(c0010a9));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC0979zt.m2821Q(viewGroup4, true);
                            c0060b9.m2261a(new C0958z8(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: o */
    public final String[] mo547o() {
        return f783w;
    }
}
