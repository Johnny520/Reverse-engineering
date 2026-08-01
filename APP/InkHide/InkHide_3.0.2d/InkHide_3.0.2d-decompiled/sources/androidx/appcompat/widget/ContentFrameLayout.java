package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p061e.C0537m;
import p061e.LayoutInflaterFactory2C0545u;
import p068h.MenuC0594m;
import p069i.C0677g;
import p069i.C0689k;
import p069i.C0697m1;
import p069i.InterfaceC0696m0;
import p069i.InterfaceC0699n0;
import p099y.C1054S;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public TypedValue f1016b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1017c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1018d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1019e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1020f;

    /* JADX INFO: renamed from: g */
    public TypedValue f1021g;

    /* JADX INFO: renamed from: h */
    public final Rect f1022h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0696m0 f1023i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1022h = new Rect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedHeightMajor() {
        if (this.f1020f == null) {
            this.f1020f = new TypedValue();
        }
        return this.f1020f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedHeightMinor() {
        if (this.f1021g == null) {
            this.f1021g = new TypedValue();
        }
        return this.f1021g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedWidthMajor() {
        if (this.f1018d == null) {
            this.f1018d = new TypedValue();
        }
        return this.f1018d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedWidthMinor() {
        if (this.f1019e == null) {
            this.f1019e = new TypedValue();
        }
        return this.f1019e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getMinWidthMajor() {
        if (this.f1016b == null) {
            this.f1016b = new TypedValue();
        }
        return this.f1016b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getMinWidthMinor() {
        if (this.f1017c == null) {
            this.f1017c = new TypedValue();
        }
        return this.f1017c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0696m0 interfaceC0696m0 = this.f1023i;
        if (interfaceC0696m0 != null) {
            interfaceC0696m0.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0689k c0689k;
        super.onDetachedFromWindow();
        InterfaceC0696m0 interfaceC0696m0 = this.f1023i;
        if (interfaceC0696m0 != null) {
            LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = ((C0537m) interfaceC0696m0).f1760c;
            InterfaceC0699n0 interfaceC0699n0 = layoutInflaterFactory2C0545u.f1827l;
            if (interfaceC0699n0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0699n0;
                actionBarOverlayLayout.m669k();
                ActionMenuView actionMenuView = ((C0697m1) actionBarOverlayLayout.f981f).f2351a.f1084b;
                if (actionMenuView != null && (c0689k = actionMenuView.f1006u) != null) {
                    c0689k.m1309f();
                    C0677g c0677g = c0689k.f2321u;
                    if (c0677g != null && c0677g.m1206b()) {
                        c0677g.f2106i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0545u.f1832q != null) {
                layoutInflaterFactory2C0545u.f1821f.getDecorView().removeCallbacks(layoutInflaterFactory2C0545u.f1833r);
                if (layoutInflaterFactory2C0545u.f1832q.isShowing()) {
                    try {
                        layoutInflaterFactory2C0545u.f1832q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0545u.f1832q = null;
            }
            C1054S c1054s = layoutInflaterFactory2C0545u.f1834s;
            if (c1054s != null) {
                c1054s.m2304b();
            }
            MenuC0594m menuC0594m = layoutInflaterFactory2C0545u.m1117x(0).f1781h;
            if (menuC0594m != null) {
                menuC0594m.m1184c(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i4;
        int i5;
        float fraction;
        int i6;
        int i7;
        float fraction2;
        int i8;
        int i9;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        Rect rect = this.f1022h;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f1019e : this.f1018d;
            if (typedValue != null && (i8 = typedValue.type) != 0) {
                if (i8 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i10 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i10, i10);
                } else {
                    i9 = 0;
                    if (i9 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                    }
                }
                i9 = (int) fraction3;
                if (i9 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i3;
        } else {
            TypedValue typedValue2 = z4 ? this.f1020f : this.f1021g;
            if (typedValue2 != null && (i6 = typedValue2.type) != 0) {
                if (i6 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i6 == 6) {
                    int i11 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i11, i11);
                } else {
                    i7 = 0;
                    if (i7 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    }
                }
                i7 = (int) fraction2;
                if (i7 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f1017c : this.f1016b;
            if (typedValue3 != null && (i4 = typedValue3.type) != 0) {
                if (i4 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i4 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i12, i12);
                } else {
                    i5 = 0;
                    if (i5 > 0) {
                        i5 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i5) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    }
                }
                i5 = (int) fraction;
                if (i5 > 0) {
                }
                if (measuredWidth >= i5) {
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAttachListener(InterfaceC0696m0 interfaceC0696m0) {
        this.f1023i = interfaceC0696m0;
    }
}
