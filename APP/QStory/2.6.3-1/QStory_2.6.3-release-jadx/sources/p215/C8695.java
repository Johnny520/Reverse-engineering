package p215;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2982;
import androidx.constraintlayout.widget.ConstraintLayout;
import p219.AbstractC8716;
import p219.C8707;
import p219.C8708;
import p219.C8710;
import p219.C8713;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8695 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConstraintLayout f21890;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ConstraintLayout f21891;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21892;

    public C8695(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f21891 = constraintLayout;
        this.f21890 = constraintLayout2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m13782(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13783(C8708 c8708, C2982 c2982) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        boolean z;
        int i;
        int childMeasureSpec;
        if (c8708 == null) {
            return;
        }
        C8710 c8710 = c8708.f22045;
        C8710 c87102 = c8708.f22055;
        if (c8708.f22084 == 8) {
            c2982.f6689 = 0;
            c2982.f6688 = 0;
            c2982.f6695 = 0;
            return;
        }
        if (c8708.f22036 == null) {
            return;
        }
        C8687 c8687 = ConstraintLayout.f6726;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2982.f6693;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = c2982.f6692;
        int i2 = c2982.f6691;
        int i3 = c2982.f6690;
        int i4 = this.f21889 + this.f21888;
        int i5 = this.f21887;
        View view = c8708.f22085;
        int[] iArr = AbstractC8682.f21826;
        int i6 = iArr[constraintWidget$DimensionBehaviour.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21885, i5, -2);
            } else if (i6 == 3) {
                int i7 = this.f21885;
                int i8 = c87102 != null ? c87102.f22112 : 0;
                if (c8710 != null) {
                    i8 += c8710.f22112;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21885, i5, -2);
                boolean z2 = c8708.f22075 == 1;
                int i9 = c2982.f6697;
                if (i9 == 1 || i9 == 2) {
                    boolean z3 = view.getMeasuredHeight() == c8708.m13838();
                    if (c2982.f6697 == 2 || !z2 || ((z2 && z3) || c8708.mo13815())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(c8708.m13834(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec = childMeasureSpec;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        int i10 = iArr[constraintWidget$DimensionBehaviour2.ordinal()];
        if (i10 == 1) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (i10 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21892, i4, -2);
        } else if (i10 == 3) {
            int i11 = this.f21892;
            int i12 = c87102 != null ? c8708.f22054.f22112 : 0;
            if (c8710 != null) {
                i12 += c8708.f22044.f22112;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
        } else if (i10 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21892, i4, -2);
            boolean z4 = c8708.f22067 == 1;
            int i13 = c2982.f6697;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == c8708.m13834();
                if (c2982.f6697 == 2 || !z4 || ((z4 && z5) || c8708.mo13814())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c8708.m13838(), 1073741824);
                }
            }
        }
        C8707 c8707 = (C8707) c8708.f22036;
        ConstraintLayout constraintLayout = this.f21891;
        if (c8707 != null && AbstractC8716.m13867(constraintLayout.f6736, 256) && view.getMeasuredWidth() == c8708.m13834() && view.getMeasuredWidth() < c8707.m13834() && view.getMeasuredHeight() == c8708.m13838() && view.getMeasuredHeight() < c8707.m13838() && view.getBaseline() == c8708.f22101 && !c8708.m13816() && m13782(c8708.f22057, iMakeMeasureSpec, c8708.m13834()) && m13782(c8708.f22056, iMakeMeasureSpec2, c8708.m13838())) {
            c2982.f6689 = c8708.m13834();
            c2982.f6688 = c8708.m13838();
            c2982.f6695 = c8708.f22101;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3;
        boolean z7 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
        boolean z8 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z9 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z10 = z6 && c8708.f22098 > 0.0f;
        boolean z11 = z7 && c8708.f22098 > 0.0f;
        if (view == null) {
            return;
        }
        C8680 c8680 = (C8680) view.getLayoutParams();
        int i14 = c2982.f6697;
        if (i14 != 1 && i14 != 2 && z6 && c8708.f22075 == 0 && z7 && c8708.f22067 == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof AbstractC8686) && (c8708 instanceof C8713)) {
                ((AbstractC8686) view).mo4482((C8713) c8708, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c8708.f22057 = iMakeMeasureSpec;
            c8708.f22056 = iMakeMeasureSpec2;
            c8708.f22079 = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i15 = c8708.f22070;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = c8708.f22071;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = c8708.f22069;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c8708.f22053;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!AbstractC8716.m13867(constraintLayout.f6736, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * c8708.f22098) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / c8708.f22098) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c8708.f22057 = iMakeMeasureSpec;
                c8708.f22056 = iMakeMeasureSpec3;
                z = false;
                c8708.f22079 = false;
                iMax = view.getMeasuredWidth();
                iMax2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        c2982.f6696 = (iMax == c2982.f6691 && iMax2 == c2982.f6690) ? z : true;
        if (c8680.f21810) {
            z12 = true;
        }
        if (z12 && baseline != -1 && c8708.f22101 != baseline) {
            c2982.f6696 = true;
        }
        c2982.f6689 = iMax;
        c2982.f6688 = iMax2;
        c2982.f6694 = z12;
        c2982.f6695 = baseline;
    }
}
