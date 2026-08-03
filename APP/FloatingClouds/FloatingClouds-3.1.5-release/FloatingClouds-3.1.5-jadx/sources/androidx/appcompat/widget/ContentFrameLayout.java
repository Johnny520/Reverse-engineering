package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0998f;
import p000a.C0181Jg;
import p000a.C0326S0;
import p000a.InterfaceC0223M4;
import p000a.LayoutInflaterFactory2C0291Q0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f3957a;

    /* JADX INFO: renamed from: b */
    public TypedValue f3958b;

    /* JADX INFO: renamed from: c */
    public TypedValue f3959c;

    /* JADX INFO: renamed from: d */
    public TypedValue f3960d;

    /* JADX INFO: renamed from: e */
    public TypedValue f3961e;

    /* JADX INFO: renamed from: f */
    public TypedValue f3962f;

    /* JADX INFO: renamed from: g */
    public final Rect f3963g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1018a f3964h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC1018a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3963g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3961e == null) {
            this.f3961e = new TypedValue();
        }
        return this.f3961e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3962f == null) {
            this.f3962f = new TypedValue();
        }
        return this.f3962f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3959c == null) {
            this.f3959c = new TypedValue();
        }
        return this.f3959c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3960d == null) {
            this.f3960d = new TypedValue();
        }
        return this.f3960d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3957a == null) {
            this.f3957a = new TypedValue();
        }
        return this.f3957a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3958b == null) {
            this.f3958b = new TypedValue();
        }
        return this.f3958b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1018a interfaceC1018a = this.f3964h;
        if (interfaceC1018a != null) {
            interfaceC1018a.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1018a interfaceC1018a = this.f3964h;
        if (interfaceC1018a != null) {
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = ((C0326S0) interfaceC1018a).f1160a;
            InterfaceC0223M4 interfaceC0223M4 = layoutInflaterFactory2C0291Q0.f1033r;
            if (interfaceC0223M4 != null) {
                interfaceC0223M4.mo615l();
            }
            if (layoutInflaterFactory2C0291Q0.f1038w != null) {
                layoutInflaterFactory2C0291Q0.f1027l.getDecorView().removeCallbacks(layoutInflaterFactory2C0291Q0.f1039x);
                if (layoutInflaterFactory2C0291Q0.f1038w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0291Q0.f1038w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0291Q0.f1038w = null;
            }
            C0181Jg c0181Jg = layoutInflaterFactory2C0291Q0.f1040y;
            if (c0181Jg != null) {
                c0181Jg.m489b();
            }
            C0998f c0998f = layoutInflaterFactory2C0291Q0.m806P(0).f1067h;
            if (c0998f != null) {
                c0998f.m2318c(true);
            }
        }
    }

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
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f3963g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f3960d : this.f3959c;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f3961e : this.f3962f;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f3958b : this.f3957a;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth >= i4) {
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1018a interfaceC1018a) {
        this.f3964h = interfaceC1018a;
    }
}
