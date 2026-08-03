package Yue;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3707 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f6574 = "android:changeScroll:x";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f6575 = "android:changeScroll:y";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String[] f6576 = {f6574, f6575};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3707() {
    }

    private void captureValues(C7995 c7995) {
        c7995.f3177.put(f6574, Integer.valueOf(c7995.f3178.getScrollX()));
        c7995.f3177.put(f6575, Integer.valueOf(c7995.f3178.getScrollY()));
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (c7995 == null || c79952 == null) {
            return null;
        }
        View view = c79952.f3178;
        int iIntValue = ((Integer) c7995.f3177.get(f6574)).intValue();
        int iIntValue2 = ((Integer) c79952.f3177.get(f6574)).intValue();
        int iIntValue3 = ((Integer) c7995.f3177.get(f6575)).intValue();
        int iIntValue4 = ((Integer) c79952.f3177.get(f6575)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return C7994.m25201(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public String[] getTransitionProperties() {
        return f6576;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3707(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
