package p041d1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import p057e1.C0808c;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: d1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0662h {

    /* JADX INFO: renamed from: a */
    public static final int[] f2041a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f2042b = new Rect();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0808c m1837a(View view, View view2) {
        int[] iArr = f2041a;
        view.getLocationInWindow(iArr);
        int i9 = iArr[0];
        int i10 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i11 = iArr[0];
        float f3 = i10 - iArr[1];
        view.getFocusedRect(f2042b);
        float f10 = (i9 - i11) + r1.left;
        return new C0808c(f10, r1.top + f3, r1.width() + f10, f3 + r1.top + r1.height());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m1838b(View view, Integer num, Rect rect) {
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
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Integer m1839c(int i9) {
        if (i9 == 5) {
            return 33;
        }
        if (i9 == 6) {
            return 130;
        }
        if (i9 == 3) {
            return 17;
        }
        if (i9 == 4) {
            return 66;
        }
        if (i9 == 1) {
            return 2;
        }
        return i9 == 2 ? 1 : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C0660f m1840d(int i9) {
        if (i9 == 1) {
            return new C0660f(2);
        }
        if (i9 == 2) {
            return new C0660f(1);
        }
        if (i9 == 17) {
            return new C0660f(3);
        }
        if (i9 == 33) {
            return new C0660f(5);
        }
        if (i9 == 66) {
            return new C0660f(4);
        }
        if (i9 != 130) {
            return null;
        }
        return new C0660f(6);
    }
}
