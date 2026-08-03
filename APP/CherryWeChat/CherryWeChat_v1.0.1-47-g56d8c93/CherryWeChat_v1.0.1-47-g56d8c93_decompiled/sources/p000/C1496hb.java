package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: hb */
/* JADX INFO: loaded from: classes.dex */
public final class C1496hb {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f5273a;

    /* JADX INFO: renamed from: b */
    public int f5274b;

    /* JADX INFO: renamed from: c */
    public int f5275c;

    /* JADX INFO: renamed from: d */
    public int f5276d;

    /* JADX INFO: renamed from: e */
    public int f5277e;

    /* JADX INFO: renamed from: f */
    public int f5278f;

    /* JADX INFO: renamed from: g */
    public int f5279g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f5280h;

    public C1496hb(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5280h = constraintLayout;
        this.f5273a = constraintLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2864a(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: b */
    public final void m2865b(C2454rb c2454rb, C0178E5 c0178e5) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (c2454rb == null) {
            return;
        }
        C1259cb c1259cb = c2454rb.f8590K;
        C1259cb c1259cb2 = c2454rb.f8588I;
        if (c2454rb.f8619g0 == 8) {
            c0178e5.f524e = 0;
            c0178e5.f525f = 0;
            c0178e5.f526g = 0;
            return;
        }
        if (c2454rb.f8599T == null) {
            return;
        }
        C1475gy c1475gy = ConstraintLayout.f3870p;
        int i2 = c0178e5.f520a;
        int i3 = c0178e5.f521b;
        int i4 = c0178e5.f522c;
        int i5 = c0178e5.f523d;
        int i6 = this.f5274b + this.f5275c;
        int i7 = this.f5276d;
        View view = c2454rb.f8617f0;
        int iM424v = AbstractC0213Ey.m424v(i2);
        if (iM424v == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iM424v == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5278f, i7, -2);
        } else if (iM424v == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5278f, i7, -2);
            boolean z2 = c2454rb.f8639r == 1;
            int i8 = c0178e5.f529j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == c2454rb.m4933k();
                if (c0178e5.f529j == 2 || !z2 || ((z2 && z3) || c2454rb.mo4334A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c2454rb.m4937q(), 1073741824);
                }
            }
        } else if (iM424v != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f5278f;
            int i10 = c1259cb2 != null ? c1259cb2.f4271g : 0;
            if (c1259cb != null) {
                i10 += c1259cb.f4271g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iM424v2 = AbstractC0213Ey.m424v(i3);
        if (iM424v2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iM424v2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5279g, i6, -2);
        } else if (iM424v2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5279g, i6, -2);
            boolean z4 = c2454rb.f8640s == 1;
            int i11 = c0178e5.f529j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == c2454rb.m4937q();
                if (c0178e5.f529j == 2 || !z4 || ((z4 && z5) || c2454rb.mo4335B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2454rb.m4933k(), 1073741824);
                }
            }
        } else if (iM424v2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.f5279g;
            int i13 = c1259cb2 != null ? c2454rb.f8589J.f4271g : 0;
            if (c1259cb != null) {
                i13 += c2454rb.f8591L.f4271g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        C2497sb c2497sb = (C2497sb) c2454rb.f8599T;
        ConstraintLayout constraintLayout = this.f5280h;
        if (c2497sb != null && AbstractC0714Qj.m1492n(constraintLayout.f3879i, 256) && view.getMeasuredWidth() == c2454rb.m4937q() && view.getMeasuredWidth() < c2497sb.m4937q() && view.getMeasuredHeight() == c2454rb.m4933k() && view.getMeasuredHeight() < c2497sb.m4933k() && view.getBaseline() == c2454rb.f8607a0 && !c2454rb.m4946z() && m2864a(c2454rb.f8586G, iMakeMeasureSpec, c2454rb.m4937q()) && m2864a(c2454rb.f8587H, iMakeMeasureSpec2, c2454rb.m4933k())) {
            c0178e5.f524e = c2454rb.m4937q();
            c0178e5.f525f = c2454rb.m4933k();
            c0178e5.f526g = c2454rb.f8607a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && c2454rb.f8602W > 0.0f;
        boolean z11 = z7 && c2454rb.f8602W > 0.0f;
        if (view == null) {
            return;
        }
        C1452gb c1452gb = (C1452gb) view.getLayoutParams();
        int i14 = c0178e5.f529j;
        if (i14 != 1 && i14 != 2 && z6 && c2454rb.f8639r == 0 && z7 && c2454rb.f8640s == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof AbstractC0960WE) && (c2454rb instanceof C0368Ih)) {
                ((AbstractC0960WE) view).mo1836j((C0368Ih) c2454rb, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c2454rb.f8586G = iMakeMeasureSpec;
            c2454rb.f8587H = iMakeMeasureSpec2;
            c2454rb.f8618g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = c2454rb.f8642u;
            int iMax2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = c2454rb.f8643v;
            if (i16 > 0) {
                iMax2 = Math.min(i16, iMax2);
            }
            int i17 = c2454rb.f8645x;
            iMax = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c2454rb.f8646y;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            if (!AbstractC0714Qj.m1492n(constraintLayout.f3879i, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * c2454rb.f8602W) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / c2454rb.f8602W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c2454rb.f8586G = iMakeMeasureSpec;
                c2454rb.f8587H = iMakeMeasureSpec3;
                z = false;
                c2454rb.f8618g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        c0178e5.f528i = (measuredWidth == c0178e5.f522c && iMax == c0178e5.f523d) ? z : true;
        boolean z13 = c1452gb.f5111c0 ? true : z12;
        if (z13 && baseline != -1 && c2454rb.f8607a0 != baseline) {
            c0178e5.f528i = true;
        }
        c0178e5.f524e = measuredWidth;
        c0178e5.f525f = iMax;
        c0178e5.f527h = z13;
        c0178e5.f526g = baseline;
    }
}
