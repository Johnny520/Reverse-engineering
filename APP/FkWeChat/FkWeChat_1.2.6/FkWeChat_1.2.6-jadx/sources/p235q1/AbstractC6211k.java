package p235q1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p042d2.AbstractC1856a;
import p042d2.AbstractC1859d;
import p121i3.EnumC3191u;
import p179m2.ViewTreeObserverOnGlobalLayoutListenerC4898r;
import p235q1.C6203g;
import p250r1.C6457g;

/* JADX INFO: renamed from: q1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6211k {

    /* JADX INFO: renamed from: a */
    public static final int[] f19280a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f19281b = new Rect();

    /* JADX INFO: renamed from: a */
    public static final C6457g m24421a(View view, View view2) {
        int[] iArr = f19280a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        Rect rect = f19281b;
        view.getFocusedRect(rect);
        int i12 = rect.left;
        return new C6457g(i12 + f10, rect.top + f11, f10 + i12 + rect.width(), f11 + rect.top + rect.height());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m24422b(View view, Integer num, Rect rect) {
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
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC4898r) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC4898r) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m24423c(int i10) {
        C6203g.a aVar = C6203g.f19254b;
        if (C6203g.m24374l(i10, aVar.m24385h())) {
            return 33;
        }
        if (C6203g.m24374l(i10, aVar.m24378a())) {
            return Integer.valueOf(Opcodes.IXOR);
        }
        if (C6203g.m24374l(i10, aVar.m24381d())) {
            return 17;
        }
        if (C6203g.m24374l(i10, aVar.m24384g())) {
            return 66;
        }
        if (C6203g.m24374l(i10, aVar.m24382e())) {
            return 2;
        }
        return C6203g.m24374l(i10, aVar.m24383f()) ? 1 : null;
    }

    /* JADX INFO: renamed from: d */
    public static final C6203g m24424d(int i10) {
        if (i10 == 1) {
            return C6203g.m24371i(C6203g.f19254b.m24383f());
        }
        if (i10 == 2) {
            return C6203g.m24371i(C6203g.f19254b.m24382e());
        }
        if (i10 == 17) {
            return C6203g.m24371i(C6203g.f19254b.m24381d());
        }
        if (i10 == 33) {
            return C6203g.m24371i(C6203g.f19254b.m24385h());
        }
        if (i10 == 66) {
            return C6203g.m24371i(C6203g.f19254b.m24384g());
        }
        if (i10 != 130) {
            return null;
        }
        return C6203g.m24371i(C6203g.f19254b.m24378a());
    }

    /* JADX INFO: renamed from: e */
    public static final C6203g m24425e(KeyEvent keyEvent) {
        long jM6605a = AbstractC1859d.m6605a(keyEvent);
        AbstractC1856a.a aVar = AbstractC1856a.f5030a;
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6585l())) {
            return C6203g.m24371i(C6203g.f19254b.m24383f());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6584k())) {
            return C6203g.m24371i(C6203g.f19254b.m24382e());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6590q())) {
            return C6203g.m24371i(AbstractC1859d.m6610f(keyEvent) ? C6203g.f19254b.m24383f() : C6203g.f19254b.m24382e());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6578e())) {
            return C6203g.m24371i(C6203g.f19254b.m24384g());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6577d())) {
            return C6203g.m24371i(C6203g.f19254b.m24381d());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6579f()) || AbstractC1856a.m6573s(jM6605a, aVar.m6588o())) {
            return C6203g.m24371i(C6203g.f19254b.m24385h());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6576c()) || AbstractC1856a.m6573s(jM6605a, aVar.m6587n())) {
            return C6203g.m24371i(C6203g.f19254b.m24378a());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6575b()) || AbstractC1856a.m6573s(jM6605a, aVar.m6580g()) || AbstractC1856a.m6573s(jM6605a, aVar.m6586m())) {
            return C6203g.m24371i(C6203g.f19254b.m24379b());
        }
        if (AbstractC1856a.m6573s(jM6605a, aVar.m6574a()) || AbstractC1856a.m6573s(jM6605a, aVar.m6581h())) {
            return C6203g.m24371i(C6203g.f19254b.m24380c());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC3191u m24426f(int i10) {
        if (i10 == 0) {
            return EnumC3191u.f8484q;
        }
        if (i10 != 1) {
            return null;
        }
        return EnumC3191u.f8485r;
    }
}
