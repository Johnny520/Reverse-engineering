package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000.C0130D0;
import p000.C0273GE;
import p000.C2483s3;
import p000.C2663wB;
import p000.C2781z0;
import p000.InterfaceC0449Kc;
import p000.InterfaceC2626vb;
import p000.LayoutInflaterFactory2C0176E3;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f3792a;

    /* JADX INFO: renamed from: b */
    public TypedValue f3793b;

    /* JADX INFO: renamed from: c */
    public TypedValue f3794c;

    /* JADX INFO: renamed from: d */
    public TypedValue f3795d;

    /* JADX INFO: renamed from: e */
    public TypedValue f3796e;

    /* JADX INFO: renamed from: f */
    public TypedValue f3797f;

    /* JADX INFO: renamed from: g */
    public final Rect f3798g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2626vb f3799h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3798g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3796e == null) {
            this.f3796e = new TypedValue();
        }
        return this.f3796e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3797f == null) {
            this.f3797f = new TypedValue();
        }
        return this.f3797f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3794c == null) {
            this.f3794c = new TypedValue();
        }
        return this.f3794c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3795d == null) {
            this.f3795d = new TypedValue();
        }
        return this.f3795d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3792a == null) {
            this.f3792a = new TypedValue();
        }
        return this.f3792a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3793b == null) {
            this.f3793b = new TypedValue();
        }
        return this.f3793b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2626vb interfaceC2626vb = this.f3799h;
        if (interfaceC2626vb != null) {
            interfaceC2626vb.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0130D0 c0130d0;
        super.onDetachedFromWindow();
        InterfaceC2626vb interfaceC2626vb = this.f3799h;
        if (interfaceC2626vb != null) {
            LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = ((C2483s3) interfaceC2626vb).f8734b;
            InterfaceC0449Kc interfaceC0449Kc = layoutInflaterFactory2C0176E3.f501r;
            if (interfaceC0449Kc != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0449Kc;
                actionBarOverlayLayout.m2088k();
                ActionMenuView actionMenuView = ((C2663wB) actionBarOverlayLayout.f3754e).f9213a.f3823a;
                if (actionMenuView != null && (c0130d0 = actionMenuView.f3781t) != null) {
                    c0130d0.m214c();
                    C2781z0 c2781z0 = c0130d0.f321t;
                    if (c2781z0 != null && c2781z0.m5291b()) {
                        c2781z0.f9323i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0176E3.f506w != null) {
                layoutInflaterFactory2C0176E3.f495l.getDecorView().removeCallbacks(layoutInflaterFactory2C0176E3.f507x);
                if (layoutInflaterFactory2C0176E3.f506w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0176E3.f506w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0176E3.f506w = null;
            }
            C0273GE c0273ge = layoutInflaterFactory2C0176E3.f508y;
            if (c0273ge != null) {
                c0273ge.m554b();
            }
            MenuC2204lr menuC2204lr = layoutInflaterFactory2C0176E3.m360z(0).f336h;
            if (menuC2204lr != null) {
                menuC2204lr.m4430c(true);
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
        Rect rect = this.f3798g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f3795d : this.f3794c;
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
            TypedValue typedValue2 = z3 ? this.f3796e : this.f3797f;
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
            TypedValue typedValue3 = z3 ? this.f3793b : this.f3792a;
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

    public void setAttachListener(InterfaceC2626vb interfaceC2626vb) {
        this.f3799h = interfaceC2626vb;
    }
}
