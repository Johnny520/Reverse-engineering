package androidx.appcompat.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public TypedValue f26228;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public TypedValue f26229;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public TypedValue f26230;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public TypedValue f26231;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public TypedValue f26232;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public TypedValue f26233;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Rect f26234;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public InterfaceC1619 f26235;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$ۥ */
    public interface InterfaceC1619 {
        void onDetachedFromWindow();

        /* JADX INFO: renamed from: ۥ */
        void mo4615();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContentFrameLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f26232 == null) {
            this.f26232 = new TypedValue();
        }
        return this.f26232;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f26233 == null) {
            this.f26233 = new TypedValue();
        }
        return this.f26233;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f26230 == null) {
            this.f26230 = new TypedValue();
        }
        return this.f26230;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f26231 == null) {
            this.f26231 = new TypedValue();
        }
        return this.f26231;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f26228 == null) {
            this.f26228 = new TypedValue();
        }
        return this.f26228;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f26229 == null) {
            this.f26229 = new TypedValue();
        }
        return this.f26229;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1619 interfaceC1619 = this.f26235;
        if (interfaceC1619 != null) {
            interfaceC1619.mo4615();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1619 interfaceC1619 = this.f26235;
        if (interfaceC1619 != null) {
            interfaceC1619.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
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
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f26231 : this.f26230;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        Rect rect = this.f26234;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f26232 : this.f26233;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 > 0) {
                        Rect rect2 = this.f26234;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f26229 : this.f26228;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        Rect rect3 = this.f26234;
                        i4 -= rect3.left + rect3.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
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
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC1619 interfaceC1619) {
        this.f26235 = interfaceC1619;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public void m4664(Rect rect) {
        fitSystemWindows(rect);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟ */
    public void m4665(int i, int i2, int i3, int i4) {
        this.f26234.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ContentFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26234 = new Rect();
    }
}
