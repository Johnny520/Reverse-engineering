package p198m0;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p204n0.C2684c;

/* JADX INFO: renamed from: m0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2577h {

    /* JADX INFO: renamed from: a */
    public static final int[] f8211a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f8212b = new Rect();

    /* JADX INFO: renamed from: a */
    public static final C2684c m4521a(View view, View view2) {
        int[] iArr = f8211a;
        view.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i7 = iArr[0];
        float f2 = i6 - iArr[1];
        view.getFocusedRect(f8212b);
        float f5 = (i5 - i7) + r1.left;
        return new C2684c(f5, r1.top + f2, r1.width() + f5, f2 + r1.top + r1.height());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4522b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m4523c(int i5) {
        if (i5 == 5) {
            return 33;
        }
        if (i5 == 6) {
            return 130;
        }
        if (i5 == 3) {
            return 17;
        }
        if (i5 == 4) {
            return 66;
        }
        if (i5 == 1) {
            return 2;
        }
        return i5 == 2 ? 1 : null;
    }

    /* JADX INFO: renamed from: d */
    public static final C2575f m4524d(int i5) {
        if (i5 == 1) {
            return new C2575f(2);
        }
        if (i5 == 2) {
            return new C2575f(1);
        }
        if (i5 == 17) {
            return new C2575f(3);
        }
        if (i5 == 33) {
            return new C2575f(5);
        }
        if (i5 == 66) {
            return new C2575f(4);
        }
        if (i5 != 130) {
            return null;
        }
        return new C2575f(6);
    }
}
