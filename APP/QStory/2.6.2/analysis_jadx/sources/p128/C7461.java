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
import kotlin.reflect.jvm.internal.AbstractC5061;
import p075.C6957;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7461 extends AbstractC7482 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C7465 f20189;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C7465 f20190;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C7465 f20191;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final C7465 f20192;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C7465 f20193;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String[] f20194 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    static {
        String str = "topLeft";
        Class<PointF> cls = PointF.class;
        f20191 = new C7465(str, 0, cls);
        String str2 = "bottomRight";
        f20190 = new C7465(str2, 1, cls);
        f20193 = new C7465(str2, 2, cls);
        f20192 = new C7465(str, 3, cls);
        f20189 = new C7465("position", 4, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m12633(C7468 c7468) {
        View view = c7468.f20214;
        HashMap map = c7468.f20215;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12634(C7468 c7468) {
        m12633(c7468);
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo12635(C7468 c7468) {
        m12633(c7468);
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] mo12636() {
        return f20194;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Animator mo12637(ViewGroup viewGroup, C7468 c7468, C7468 c74682) {
        int i;
        C7461 c7461;
        Animator animatorOfObject;
        if (c7468 == null) {
            return null;
        }
        HashMap map = c7468.f20215;
        if (c74682 == null) {
            return null;
        }
        HashMap map2 = c74682.f20215;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c74682.f20214;
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
        AbstractC7467.m12659(view, i2, i4, i6, i8);
        if (i14 != 2) {
            c7461 = this;
            if (i2 == i3 && i4 == i5) {
                c7461.f20254.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20193, (TypeConverter) null, C6957.m12236(i6, i8, i7, i9));
            } else {
                c7461.f20254.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20192, (TypeConverter) null, C6957.m12236(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            c7461 = this;
            c7461.f20254.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f20189, (TypeConverter) null, C6957.m12236(i2, i4, i3, i5));
        } else {
            c7461 = this;
            C7462 c7462 = new C7462(view);
            c7461.f20254.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c7462, f20191, (TypeConverter) null, C6957.m12236(i2, i4, i3, i5));
            c7461.f20254.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c7462, f20190, (TypeConverter) null, C6957.m12236(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new C7464(c7462));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC5061.m10017(viewGroup4, true);
            c7461.m12684().m12681(new C7463(viewGroup4));
        }
        return animatorOfObject;
    }
}
