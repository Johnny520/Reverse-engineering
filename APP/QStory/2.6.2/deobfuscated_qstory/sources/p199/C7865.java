package p199;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import androidx.constraintlayout.widget.ConstraintLayout;
import p203.AbstractC7886;
import p203.C7877;
import p203.C7878;
import p203.C7880;
import p203.C7883;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConstraintLayout f21548;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ConstraintLayout f21549;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21550;

    public C7865(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f21549 = constraintLayout;
        this.f21548 = constraintLayout2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m13195(int i, int i2, int i3) {
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
    public final void m13196(C7878 c7878, C2149 c2149) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        boolean z;
        int i;
        int childMeasureSpec;
        if (c7878 == null) {
            return;
        }
        C7880 c7880 = c7878.f21703;
        C7880 c78802 = c7878.f21713;
        if (c7878.f21742 == 8) {
            c2149.f6343 = 0;
            c2149.f6342 = 0;
            c2149.f6349 = 0;
            return;
        }
        if (c7878.f21694 == null) {
            return;
        }
        C7857 c7857 = ConstraintLayout.f6380;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2149.f6347;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = c2149.f6346;
        int i2 = c2149.f6345;
        int i3 = c2149.f6344;
        int i4 = this.f21547 + this.f21546;
        int i5 = this.f21545;
        View view = c7878.f21743;
        int[] iArr = AbstractC7852.f21484;
        int i6 = iArr[constraintWidget$DimensionBehaviour.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21543, i5, -2);
            } else if (i6 == 3) {
                int i7 = this.f21543;
                int i8 = c78802 != null ? c78802.f21770 : 0;
                if (c7880 != null) {
                    i8 += c7880.f21770;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21543, i5, -2);
                boolean z2 = c7878.f21733 == 1;
                int i9 = c2149.f6351;
                if (i9 == 1 || i9 == 2) {
                    boolean z3 = view.getMeasuredHeight() == c7878.m13251();
                    if (c2149.f6351 == 2 || !z2 || ((z2 && z3) || c7878.mo13228())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(c7878.m13247(), 1073741824);
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
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21550, i4, -2);
        } else if (i10 == 3) {
            int i11 = this.f21550;
            int i12 = c78802 != null ? c7878.f21712.f21770 : 0;
            if (c7880 != null) {
                i12 += c7878.f21702.f21770;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
        } else if (i10 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f21550, i4, -2);
            boolean z4 = c7878.f21725 == 1;
            int i13 = c2149.f6351;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == c7878.m13247();
                if (c2149.f6351 == 2 || !z4 || ((z4 && z5) || c7878.mo13227())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c7878.m13251(), 1073741824);
                }
            }
        }
        C7877 c7877 = (C7877) c7878.f21694;
        ConstraintLayout constraintLayout = this.f21549;
        if (c7877 != null && AbstractC7886.m13280(constraintLayout.f6390, 256) && view.getMeasuredWidth() == c7878.m13247() && view.getMeasuredWidth() < c7877.m13247() && view.getMeasuredHeight() == c7878.m13251() && view.getMeasuredHeight() < c7877.m13251() && view.getBaseline() == c7878.f21759 && !c7878.m13229() && m13195(c7878.f21715, iMakeMeasureSpec, c7878.m13247()) && m13195(c7878.f21714, iMakeMeasureSpec2, c7878.m13251())) {
            c2149.f6343 = c7878.m13247();
            c2149.f6342 = c7878.m13251();
            c2149.f6349 = c7878.f21759;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3;
        boolean z7 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
        boolean z8 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z9 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z10 = z6 && c7878.f21756 > 0.0f;
        boolean z11 = z7 && c7878.f21756 > 0.0f;
        if (view == null) {
            return;
        }
        C7850 c7850 = (C7850) view.getLayoutParams();
        int i14 = c2149.f6351;
        if (i14 != 1 && i14 != 2 && z6 && c7878.f21733 == 0 && z7 && c7878.f21725 == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof AbstractC7856) && (c7878 instanceof C7883)) {
                ((AbstractC7856) view).mo3912((C7883) c7878, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c7878.f21715 = iMakeMeasureSpec;
            c7878.f21714 = iMakeMeasureSpec2;
            c7878.f21737 = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i15 = c7878.f21728;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = c7878.f21729;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = c7878.f21727;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c7878.f21711;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!AbstractC7886.m13280(constraintLayout.f6390, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * c7878.f21756) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / c7878.f21756) + 0.5f);
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
                c7878.f21715 = iMakeMeasureSpec;
                c7878.f21714 = iMakeMeasureSpec3;
                z = false;
                c7878.f21737 = false;
                iMax = view.getMeasuredWidth();
                iMax2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        c2149.f6350 = (iMax == c2149.f6345 && iMax2 == c2149.f6344) ? z : true;
        if (c7850.f21468) {
            z12 = true;
        }
        if (z12 && baseline != -1 && c7878.f21759 != baseline) {
            c2149.f6350 = true;
        }
        c2149.f6343 = iMax;
        c2149.f6342 = iMax2;
        c2149.f6348 = z12;
        c2149.f6349 = baseline;
    }
}
