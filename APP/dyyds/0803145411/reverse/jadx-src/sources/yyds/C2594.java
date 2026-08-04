package yyds;

import android.view.View;
import android.view.ViewGroup;
import com.android.app.CustomConstraintLayout;

/* JADX INFO: renamed from: yyds.ᲈᛱᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ CustomConstraintLayout f12778;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12779;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final CustomConstraintLayout f12780;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f12781;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f12782;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f12783;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f12784;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f12785;

    public C2594(CustomConstraintLayout customConstraintLayout, CustomConstraintLayout customConstraintLayout2) {
        this.f12778 = customConstraintLayout;
        this.f12780 = customConstraintLayout2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m4675(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4676(C0944 c0944, C0390 c0390) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        C2141 c2141 = c0944.f4344;
        C2141 c21412 = c0944.f4382;
        if (c0944.f20 == 8) {
            c0390.f2013 = 0;
            c0390.f2019 = 0;
            c0390.f2016 = 0;
            return;
        }
        if (c0944.f4342 == null) {
            return;
        }
        int i2 = c0390.f2014;
        int i3 = c0390.f2015;
        int i4 = c0390.f2018;
        int i5 = c0390.f2020;
        int i6 = this.f12781 + this.f12783;
        int i7 = this.f12785;
        View view = c0944.f4383;
        int iM4012 = AbstractC2104.m4012(i2);
        if (iM4012 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iM4012 == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f12784, i7, -2);
        } else if (iM4012 == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f12784, i7, -2);
            boolean z2 = c0944.f4363 == 1;
            int i8 = c0390.f2017;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == c0944.m2067();
                if (c0390.f2017 == 2 || !z2 || ((z2 && z3) || c0944.mo1172())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0944.m2072(), 1073741824);
                }
            }
        } else if (iM4012 != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f12784;
            int i10 = c21412 != null ? c21412.f10575 : 0;
            if (c2141 != null) {
                i10 += c2141.f10575;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iM40122 = AbstractC2104.m4012(i3);
        if (iM40122 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iM40122 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f12782, i6, -2);
        } else if (iM40122 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f12782, i6, -2);
            boolean z4 = c0944.f4389 == 1;
            int i11 = c0390.f2017;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == c0944.m2072();
                if (c0390.f2017 == 2 || !z4 || ((z4 && z5) || c0944.mo1168())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0944.m2067(), 1073741824);
                }
            }
        } else if (iM40122 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.f12782;
            int i13 = c21412 != null ? c0944.f4403.f10575 : 0;
            if (c2141 != null) {
                i13 += c0944.f4341.f10575;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        C0859 c0859 = c0944.f4342;
        CustomConstraintLayout customConstraintLayout = this.f12778;
        if (c0859 != null && AbstractC1741.m3480(customConstraintLayout.f6215, 256) && view.getMeasuredWidth() == c0944.m2072() && view.getMeasuredWidth() < c0859.m2072() && view.getMeasuredHeight() == c0944.m2067() && view.getMeasuredHeight() < c0859.m2067() && view.getBaseline() == c0944.f4399 && !c0944.m2069() && m4675(c0944.f4392, iMakeMeasureSpec, c0944.m2072()) && m4675(c0944.f4380, iMakeMeasureSpec2, c0944.m2067())) {
            c0390.f2013 = c0944.m2072();
            c0390.f2019 = c0944.m2067();
            c0390.f2016 = c0944.f4399;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && c0944.f4359 > 0.0f;
        boolean z11 = z7 && c0944.f4359 > 0.0f;
        if (view == null) {
            return;
        }
        C1357 c1357 = (C1357) view.getLayoutParams();
        int i14 = c0390.f2017;
        if (i14 != 1 && i14 != 2 && z6 && c0944.f4363 == 0 && z7 && c0944.f4389 == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            c0944.f4392 = iMakeMeasureSpec;
            c0944.f4380 = iMakeMeasureSpec2;
            c0944.f4373 = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = c0944.f4376;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = c0944.f4374;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = c0944.f4350;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c0944.f4404;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!AbstractC1741.m3480(customConstraintLayout.f6215, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * c0944.f4359) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / c0944.f4359) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c0944.f4392 = iMakeMeasureSpec;
                c0944.f4380 = iMakeMeasureSpec3;
                z = false;
                c0944.f4373 = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        c0390.f2012 = (iMax == c0390.f2018 && iMax2 == c0390.f2020) ? z : true;
        boolean z13 = c1357.f6269 ? true : z12;
        if (z13 && baseline != -1 && c0944.f4399 != baseline) {
            c0390.f2012 = true;
        }
        c0390.f2013 = iMax;
        c0390.f2019 = iMax2;
        c0390.f2011 = z13;
        c0390.f2016 = baseline;
    }
}
