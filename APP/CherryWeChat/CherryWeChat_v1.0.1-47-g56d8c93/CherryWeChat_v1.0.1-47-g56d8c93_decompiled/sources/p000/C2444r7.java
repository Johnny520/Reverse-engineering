package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444r7 extends AbstractC0356IB {

    /* JADX INFO: renamed from: A */
    public static final String[] f8561A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: B */
    public static final C2264n7 f8562B = new C2264n7(0, PointF.class, "topLeft");

    /* JADX INFO: renamed from: C */
    public static final C2264n7 f8563C = new C2264n7(1, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: D */
    public static final C2264n7 f8564D = new C2264n7(2, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: E */
    public static final C2264n7 f8565E = new C2264n7(3, PointF.class, "topLeft");

    /* JADX INFO: renamed from: F */
    public static final C2264n7 f8566F = new C2264n7(4, PointF.class, "position");

    /* JADX INFO: renamed from: I */
    public static void m4891I(C0657PB c0657pb) {
        View view = c0657pb.f2100b;
        HashMap map = c0657pb.f2099a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB c0657pb) {
        m4891I(c0657pb);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB c0657pb) {
        m4891I(c0657pb);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: k */
    public final Animator mo775k(ViewGroup viewGroup, C0657PB c0657pb, C0657PB c0657pb2) {
        int i;
        C2444r7 c2444r7;
        Animator animatorM2593a;
        if (c0657pb != null) {
            HashMap map = c0657pb.f2099a;
            if (c0657pb2 != null) {
                HashMap map2 = c0657pb2.f2099a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c0657pb2.f2100b;
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
                        AbstractC0574NE.m1116a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c2444r7 = this;
                            if (i2 == i3 && i4 == i5) {
                                c2444r7.f1217v.getClass();
                                animatorM2593a = AbstractC1338dt.m2593a(view, f8564D, C1517hw.m2891c(i6, i8, i7, i9));
                            } else {
                                c2444r7.f1217v.getClass();
                                animatorM2593a = AbstractC1338dt.m2593a(view, f8565E, C1517hw.m2891c(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c2444r7 = this;
                            c2444r7.f1217v.getClass();
                            animatorM2593a = AbstractC1338dt.m2593a(view, f8566F, C1517hw.m2891c(i2, i4, i3, i5));
                        } else {
                            c2444r7 = this;
                            C2401q7 c2401q7 = new C2401q7(view);
                            c2444r7.f1217v.getClass();
                            ObjectAnimator objectAnimatorM2593a = AbstractC1338dt.m2593a(c2401q7, f8562B, C1517hw.m2891c(i2, i4, i3, i5));
                            c2444r7.f1217v.getClass();
                            ObjectAnimator objectAnimatorM2593a2 = AbstractC1338dt.m2593a(c2401q7, f8563C, C1517hw.m2891c(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM2593a, objectAnimatorM2593a2);
                            animatorSet.addListener(new C2307o7(c2401q7));
                            animatorM2593a = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC0828TB.m1630H(viewGroup4, true);
                            c2444r7.m779o().m766a(new C2350p7(viewGroup4));
                        }
                        return animatorM2593a;
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: q */
    public final String[] mo780q() {
        return f8561A;
    }
}
