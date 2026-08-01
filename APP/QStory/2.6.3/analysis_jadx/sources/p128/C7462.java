package p128;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p053.AbstractC6561;
import p075.C6958;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7462 extends AbstractC7483 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String[] f20189 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C7466 f20186 = new C7466("topLeft", 0, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C7466 f20185 = new C7466("bottomRight", 1, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C7466 f20188 = new C7466("bottomRight", 2, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final C7466 f20187 = new C7466("topLeft", 3, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C7466 f20184 = new C7466("position", 4, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m12660(C7469 c7469) {
        View view = c7469.f20209;
        HashMap map = c7469.f20210;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12661(C7469 c7469) {
        m12660(c7469);
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo12662(C7469 c7469) {
        m12660(c7469);
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] mo12663() {
        return f20189;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Animator mo12664(ViewGroup viewGroup, C7469 c7469, C7469 c74692) {
        int i;
        C7462 c7462;
        Animator animatorOfObject;
        if (c7469 == null) {
            return null;
        }
        HashMap map = c7469.f20210;
        if (c74692 == null) {
            return null;
        }
        HashMap map2 = c74692.f20210;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c74692.f20209;
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
        if (i14 <= 0) {
            return null;
        }
        AbstractC7468.m12686(view, i2, i4, i6, i8);
        if (i14 != 2) {
            c7462 = this;
            if (i2 == i3 && i4 == i5) {
                c7462.f20249.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20188, (TypeConverter) null, C6958.m12261(i6, i8, i7, i9));
            } else {
                c7462.f20249.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20187, (TypeConverter) null, C6958.m12261(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            c7462 = this;
            c7462.f20249.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f20184, (TypeConverter) null, C6958.m12261(i2, i4, i3, i5));
        } else {
            c7462 = this;
            C7463 c7463 = new C7463(view);
            c7462.f20249.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c7463, f20186, (TypeConverter) null, C6958.m12261(i2, i4, i3, i5));
            c7462.f20249.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c7463, f20185, (TypeConverter) null, C6958.m12261(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new C7465(c7463));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC6561.m12061(viewGroup4, true);
            c7462.m12713().m12710(new C7464(viewGroup4));
        }
        return animatorOfObject;
    }
}
