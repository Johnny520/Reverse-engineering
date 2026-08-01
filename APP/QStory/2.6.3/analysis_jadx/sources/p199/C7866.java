package p199;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import androidx.constraintlayout.widget.ConstraintLayout;
import p203.AbstractC7887;
import p203.C7878;
import p203.C7879;
import p203.C7881;
import p203.C7884;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7866 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConstraintLayout f21545;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ConstraintLayout f21546;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21547;

    public C7866(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f21546 = constraintLayout;
        this.f21545 = constraintLayout2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m13223(int i, int i2, int i3) {
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
    public final void m13224(C7879 c7879, C2149 c2149) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        boolean z;
        int i;
        int childMeasureSpec;
        if (c7879 == null) {
            return;
        }
        C7881 c7881 = c7879.f21700;
        C7881 c78812 = c7879.f21710;
        if (c7879.f21739 == 8) {
            c2149.f6344 = 0;
            c2149.f6343 = 0;
            c2149.f6350 = 0;
            return;
        }
        if (c7879.f21691 == null) {
            return;
        }
        C7858 c7858 = ConstraintLayout.f6381;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2149.f6348;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = c2149.f6347;
        int i2 = c2149.f6346;
        int i3 = c2149.f6345;
        int i4 = this.f21544 + this.f21543;
        int i5 = this.f21542;
        View view = c7879.f21740;
        int[] iArr = AbstractC7853.f21481;
        int i6 = iArr[constraintWidget$DimensionBehaviour.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21540, i5, -2);
            } else if (i6 == 3) {
                int i7 = this.f21540;
                int i8 = c78812 != null ? c78812.f21767 : 0;
                if (c7881 != null) {
                    i8 += c7881.f21767;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21540, i5, -2);
                boolean z2 = c7879.f21730 == 1;
                int i9 = c2149.f6352;
                if (i9 == 1 || i9 == 2) {
                    boolean z3 = view.getMeasuredHeight() == c7879.m13279();
                    if (c2149.f6352 == 2 || !z2 || ((z2 && z3) || c7879.mo13256())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(c7879.m13275(), 1073741824);
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
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21547, i4, -2);
        } else if (i10 == 3) {
            int i11 = this.f21547;
            int i12 = c78812 != null ? c7879.f21709.f21767 : 0;
            if (c7881 != null) {
                i12 += c7879.f21699.f21767;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
        } else if (i10 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21547, i4, -2);
            boolean z4 = c7879.f21722 == 1;
            int i13 = c2149.f6352;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == c7879.m13275();
                if (c2149.f6352 == 2 || !z4 || ((z4 && z5) || c7879.mo13255())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c7879.m13279(), 1073741824);
                }
            }
        }
        C7878 c7878 = (C7878) c7879.f21691;
        ConstraintLayout constraintLayout = this.f21546;
        if (c7878 != null && AbstractC7887.m13308(constraintLayout.f6391, 256) && view.getMeasuredWidth() == c7879.m13275() && view.getMeasuredWidth() < c7878.m13275() && view.getMeasuredHeight() == c7879.m13279() && view.getMeasuredHeight() < c7878.m13279() && view.getBaseline() == c7879.f21756 && !c7879.m13257() && m13223(c7879.f21712, iMakeMeasureSpec, c7879.m13275()) && m13223(c7879.f21711, iMakeMeasureSpec2, c7879.m13279())) {
            c2149.f6344 = c7879.m13275();
            c2149.f6343 = c7879.m13279();
            c2149.f6350 = c7879.f21756;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3;
        boolean z7 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
        boolean z8 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z9 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z10 = z6 && c7879.f21753 > 0.0f;
        boolean z11 = z7 && c7879.f21753 > 0.0f;
        if (view == null) {
            return;
        }
        C7851 c7851 = (C7851) view.getLayoutParams();
        int i14 = c2149.f6352;
        if (i14 != 1 && i14 != 2 && z6 && c7879.f21730 == 0 && z7 && c7879.f21722 == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof AbstractC7857) && (c7879 instanceof C7884)) {
                ((AbstractC7857) view).mo3922((C7884) c7879, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c7879.f21712 = iMakeMeasureSpec;
            c7879.f21711 = iMakeMeasureSpec2;
            c7879.f21734 = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i15 = c7879.f21725;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = c7879.f21726;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = c7879.f21724;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c7879.f21708;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!AbstractC7887.m13308(constraintLayout.f6391, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * c7879.f21753) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / c7879.f21753) + 0.5f);
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
                c7879.f21712 = iMakeMeasureSpec;
                c7879.f21711 = iMakeMeasureSpec3;
                z = false;
                c7879.f21734 = false;
                iMax = view.getMeasuredWidth();
                iMax2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        c2149.f6351 = (iMax == c2149.f6346 && iMax2 == c2149.f6345) ? z : true;
        if (c7851.f21465) {
            z12 = true;
        }
        if (z12 && baseline != -1 && c7879.f21756 != baseline) {
            c2149.f6351 = true;
        }
        c2149.f6344 = iMax;
        c2149.f6343 = iMax2;
        c2149.f6349 = z12;
        c2149.f6350 = baseline;
    }
}
