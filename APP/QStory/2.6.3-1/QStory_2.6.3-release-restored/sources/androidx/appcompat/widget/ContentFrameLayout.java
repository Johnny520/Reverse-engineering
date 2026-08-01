package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0939;
import androidx.appcompat.app.LayoutInflaterFactory2C0915;
import androidx.core.view.C3115;
import p206.MenuC8631;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public TypedValue f812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TypedValue f813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC1066 f814;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public TypedValue f815;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Rect f816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public TypedValue f817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public TypedValue f818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TypedValue f819;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f816 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f812 == null) {
            this.f812 = new TypedValue();
        }
        return this.f812;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f815 == null) {
            this.f815 = new TypedValue();
        }
        return this.f815;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f818 == null) {
            this.f818 = new TypedValue();
        }
        return this.f818;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f813 == null) {
            this.f813 = new TypedValue();
        }
        return this.f813;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f819 == null) {
            this.f819 = new TypedValue();
        }
        return this.f819;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f817 == null) {
            this.f817 = new TypedValue();
        }
        return this.f817;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1066 interfaceC1066 = this.f814;
        if (interfaceC1066 != null) {
            interfaceC1066.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1044 c1044;
        super.onDetachedFromWindow();
        InterfaceC1066 interfaceC1066 = this.f814;
        if (interfaceC1066 != null) {
            LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = ((C0939) interfaceC1066).f608;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C0915.f519;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.m1038();
                ActionMenuView actionMenuView = ((C0993) actionBarOverlayLayout.f785).f957.f856;
                if (actionMenuView != null && (c1044 = actionMenuView.f802) != null) {
                    c1044.m1264();
                    C1050 c1050 = c1044.f1128;
                    if (c1050 != null && c1050.m13704()) {
                        c1050.f21540.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0915.f506 != null) {
                layoutInflaterFactory2C0915.f513.getDecorView().removeCallbacks(layoutInflaterFactory2C0915.f509);
                if (layoutInflaterFactory2C0915.f506.isShowing()) {
                    try {
                        layoutInflaterFactory2C0915.f506.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0915.f506 = null;
            }
            C3115 c3115 = layoutInflaterFactory2C0915.f508;
            if (c3115 != null) {
                c3115.m4831();
            }
            MenuC8631 menuC8631 = layoutInflaterFactory2C0915.m778(0).f558;
            if (menuC8631 != null) {
                menuC8631.m13713(true);
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
        Rect rect = this.f816;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f813 : this.f818;
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
            TypedValue typedValue2 = z3 ? this.f812 : this.f815;
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
            TypedValue typedValue3 = z3 ? this.f817 : this.f819;
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

    public void setAttachListener(InterfaceC1066 interfaceC1066) {
        this.f814 = interfaceC1066;
    }
}
