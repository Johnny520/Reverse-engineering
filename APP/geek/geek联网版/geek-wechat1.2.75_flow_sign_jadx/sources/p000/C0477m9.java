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

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477m9 extends x70 {

    /* JADX INFO: renamed from: A */
    public static final C0327i9 f3109A;

    /* JADX INFO: renamed from: B */
    public static final C0327i9 f3110B;

    /* JADX INFO: renamed from: w */
    public static final String[] f3111w = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: x */
    public static final C0327i9 f3112x;

    /* JADX INFO: renamed from: y */
    public static final C0327i9 f3113y;

    /* JADX INFO: renamed from: z */
    public static final C0327i9 f3114z;

    static {
        new C0290h9(PointF.class, "boundsOrigin").f2142a = new Rect();
        f3112x = new C0327i9(PointF.class, "topLeft", 0);
        f3113y = new C0327i9(PointF.class, "bottomRight", 1);
        f3114z = new C0327i9(PointF.class, "bottomRight", 2);
        f3109A = new C0327i9(PointF.class, "topLeft", 3);
        f3110B = new C0327i9(PointF.class, "position", 4);
    }

    /* JADX INFO: renamed from: F */
    public static void m1816F(d80 d80Var) {
        View view = d80Var.f1335b;
        HashMap map = d80Var.f1334a;
        WeakHashMap weakHashMap = oa0.f3426a;
        if (!aa0.m40c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: c */
    public final void mo1581c(d80 d80Var) {
        m1816F(d80Var);
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: f */
    public final void mo1583f(d80 d80Var) {
        m1816F(d80Var);
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: j */
    public final Animator mo1817j(ViewGroup viewGroup, d80 d80Var, d80 d80Var2) {
        int i;
        C0477m9 c0477m9;
        Animator animatorOfObject;
        if (d80Var != null) {
            HashMap map = d80Var.f1334a;
            if (d80Var2 != null) {
                HashMap map2 = d80Var2.f1334a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = d80Var2.f1335b;
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
                        gb0.m1221a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c0477m9 = this;
                            if (i2 == i3 && i4 == i5) {
                                c0477m9.f5221s.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, f3114z, (TypeConverter) null, C0426kw.m1716a(i6, i8, i7, i9));
                            } else {
                                c0477m9.f5221s.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, f3109A, (TypeConverter) null, C0426kw.m1716a(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c0477m9 = this;
                            c0477m9.f5221s.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, f3110B, (TypeConverter) null, C0426kw.m1716a(i2, i4, i3, i5));
                        } else {
                            c0477m9 = this;
                            C0440l9 c0440l9 = new C0440l9();
                            c0440l9.f2974e = view;
                            c0477m9.f5221s.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c0440l9, f3112x, (TypeConverter) null, C0426kw.m1716a(i2, i4, i3, i5));
                            c0477m9.f5221s.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c0440l9, f3113y, (TypeConverter) null, C0426kw.m1716a(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new C0366j9(c0440l9));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC0274gu.m1306L(viewGroup4, true);
                            c0477m9.m2643a(new C0403k9(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: o */
    public final String[] mo1818o() {
        return f3111w;
    }
}
