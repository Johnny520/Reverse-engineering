package p144;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p069.AbstractC7390;
import p091.C7787;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8291 extends AbstractC8312 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String[] f20534 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C8295 f20531 = new C8295("topLeft", 0, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C8295 f20530 = new C8295("bottomRight", 1, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C8295 f20533 = new C8295("bottomRight", 2, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final C8295 f20532 = new C8295("topLeft", 3, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C8295 f20529 = new C8295("position", 4, PointF.class);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m13219(C8298 c8298) {
        View view = c8298.f20554;
        HashMap map = c8298.f20555;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo13220(C8298 c8298) {
        m13219(c8298);
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo13221(C8298 c8298) {
        m13219(c8298);
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] mo13222() {
        return f20534;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Animator mo13223(ViewGroup viewGroup, C8298 c8298, C8298 c82982) {
        int i;
        C8291 c8291;
        Animator animatorOfObject;
        if (c8298 == null) {
            return null;
        }
        HashMap map = c8298.f20555;
        if (c82982 == null) {
            return null;
        }
        HashMap map2 = c82982.f20555;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c82982.f20554;
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
        AbstractC8297.m13245(view, i2, i4, i6, i8);
        if (i14 != 2) {
            c8291 = this;
            if (i2 == i3 && i4 == i5) {
                c8291.f20594.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20533, (TypeConverter) null, C7787.m12820(i6, i8, i7, i9));
            } else {
                c8291.f20594.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f20532, (TypeConverter) null, C7787.m12820(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            c8291 = this;
            c8291.f20594.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f20529, (TypeConverter) null, C7787.m12820(i2, i4, i3, i5));
        } else {
            c8291 = this;
            C8292 c8292 = new C8292(view);
            c8291.f20594.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c8292, f20531, (TypeConverter) null, C7787.m12820(i2, i4, i3, i5));
            c8291.f20594.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c8292, f20530, (TypeConverter) null, C7787.m12820(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new C8294(c8292));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC7390.m12620(viewGroup4, true);
            c8291.m13272().m13269(new C8293(viewGroup4));
        }
        return animatorOfObject;
    }
}
