package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import yyds.AbstractC0185;
import yyds.AbstractC0319;
import yyds.AbstractC0353;
import yyds.AbstractC0359;
import yyds.AbstractC0897;
import yyds.AbstractC2551;
import yyds.C0053;
import yyds.C0134;
import yyds.C0188;
import yyds.C1043;
import yyds.C1213;
import yyds.C1273;
import yyds.C1438;
import yyds.C1588;
import yyds.C2347;
import yyds.C2442;
import yyds.C2526;
import yyds.C2540;
import yyds.C2637;
import yyds.C2808;
import yyds.InterfaceC1180;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2551 implements InterfaceC1180 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final int f330;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final C1438 f331;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f332;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final boolean f333;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public AbstractC0353 f334;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public C1273 f335;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final boolean f336;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public C2442 f337;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public boolean f338;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f339;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final C1588 f340;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final int[] f341;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f342;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f343;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int f344;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f343 = 1;
        this.f333 = false;
        this.f339 = false;
        this.f338 = false;
        this.f336 = true;
        this.f332 = -1;
        this.f344 = Integer.MIN_VALUE;
        this.f335 = null;
        this.f331 = new C1438();
        this.f340 = new C1588();
        this.f330 = 2;
        this.f341 = new int[2];
        C2540 c2540M4595 = AbstractC2551.m4595(context, attributeSet, i, i2);
        m210(c2540M4595.f12518);
        boolean z = c2540M4595.f12520;
        mo196(null);
        if (z != this.f333) {
            this.f333 = z;
            m4605();
        }
        mo167(c2540M4595.f12521);
    }

    /* JADX INFO: renamed from: ᛱᛱᛸᛷ, reason: contains not printable characters */
    public final void m170(C2808 c2808, C2442 c2442) {
        if (!c2442.f12011 || c2442.f12015) {
            return;
        }
        int i = c2442.f12013;
        int i2 = c2442.f12009;
        if (c2442.f12018 == -1) {
            int iM4613 = m4613();
            if (i < 0) {
                return;
            }
            int iMo1037 = (this.f334.mo1037() - i) + i2;
            if (this.f339) {
                for (int i3 = 0; i3 < iM4613; i3++) {
                    View viewM4614 = m4614(i3);
                    if (this.f334.mo1046(viewM4614) < iMo1037 || this.f334.mo1054(viewM4614) < iMo1037) {
                        m202(c2808, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4613 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM46142 = m4614(i5);
                if (this.f334.mo1046(viewM46142) < iMo1037 || this.f334.mo1054(viewM46142) < iMo1037) {
                    m202(c2808, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM46132 = m4613();
        if (!this.f339) {
            for (int i7 = 0; i7 < iM46132; i7++) {
                View viewM46143 = m4614(i7);
                if (this.f334.mo1056(viewM46143) > i6 || this.f334.mo1043(viewM46143) > i6) {
                    m202(c2808, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM46132 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM46144 = m4614(i9);
            if (this.f334.mo1056(viewM46144) > i6 || this.f334.mo1043(viewM46144) > i6) {
                m202(c2808, i8, i9);
                return;
            }
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public int mo128(C2637 c2637) {
        return m201(c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛵᛳᛳ */
    public int mo129(int i, C2808 c2808, C2637 c2637) {
        if (this.f343 == 1) {
            return 0;
        }
        return m208(i, c2808, c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void mo171(int i, int i2, C2637 c2637, C2347 c2347) {
        if (this.f343 != 0) {
            i = i2;
        }
        if (m4613() == 0 || i == 0) {
            return;
        }
        m209();
        m195(i > 0 ? 1 : -1, Math.abs(i), true, c2637);
        mo151(c2637, this.f337, c2347);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛱᛵᛱ */
    public boolean mo133() {
        return this.f335 == null && this.f342 == this.f338;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final int mo172(C2637 c2637) {
        return m203(c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo173(int i, C2347 c2347) {
        boolean z;
        int i2;
        C1273 c1273 = this.f335;
        if (c1273 == null || (i2 = c1273.f5859) < 0) {
            m184();
            z = this.f339;
            i2 = this.f332;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c1273.f5858;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f330 && i2 >= 0 && i2 < i; i4++) {
            c2347.m4361(i2, 0);
            i2 += i3;
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo174() {
        return this.f343 == 1;
    }

    /* JADX INFO: renamed from: ᛲᛶᛵᛲ, reason: contains not printable characters */
    public final boolean m175() {
        return this.f12600.getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: ᛲᲁᛲᛸ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo137(C2808 c2808, C2637 c2637, boolean z, boolean z2) {
        int i;
        int iM4613;
        int i2;
        m209();
        int iM46132 = m4613();
        if (z2) {
            iM4613 = m4613() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM46132;
            iM4613 = 0;
            i2 = 1;
        }
        int iM4742 = c2637.m4742();
        int iMo1038 = this.f334.mo1038();
        int iMo1039 = this.f334.mo1039();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM4613 != i) {
            View viewM4614 = m4614(iM4613);
            int iM4603 = AbstractC2551.m4603(viewM4614);
            int iMo1046 = this.f334.mo1046(viewM4614);
            int iMo1056 = this.f334.mo1056(viewM4614);
            if (iM4603 >= 0 && iM4603 < iM4742) {
                if (!((C2526) viewM4614.getLayoutParams()).f12448.m774()) {
                    boolean z3 = iMo1056 <= iMo1038 && iMo1046 < iMo1038;
                    boolean z4 = iMo1046 >= iMo1039 && iMo1056 > iMo1039;
                    if (!z3 && !z4) {
                        return viewM4614;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM4614;
                        } else if (view == null) {
                            view = viewM4614;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM4614;
                }
            }
            iM4613 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: ᛲᲈᲀᛲ */
    public void mo139(C2808 c2808, C2637 c2637, C1438 c1438, int i) {
    }

    @Override // yyds.InterfaceC1180
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final PointF mo176(int i) {
        if (m4613() == 0) {
            return null;
        }
        int i2 = (i < AbstractC2551.m4603(m4614(0))) != this.f339 ? -1 : 1;
        return this.f343 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: ᛲᲈᲈ, reason: contains not printable characters */
    public final View m177() {
        return m4614(this.f339 ? m4613() - 1 : 0);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛷᛶᛲ */
    public View mo142(View view, int i, C2808 c2808, C2637 c2637) {
        int iM192;
        m184();
        if (m4613() != 0 && (iM192 = m192(i)) != Integer.MIN_VALUE) {
            m209();
            m195(iM192, (int) (this.f334.mo1036() * 0.33333334f), false, c2637);
            C2442 c2442 = this.f337;
            c2442.f12013 = Integer.MIN_VALUE;
            c2442.f12011 = false;
            m182(c2808, c2442, c2637, true);
            boolean z = this.f339;
            View viewM191 = iM192 == -1 ? z ? m191(m4613() - 1, -1) : m191(0, m4613()) : z ? m191(0, m4613()) : m191(m4613() - 1, -1);
            View viewM177 = iM192 == -1 ? m177() : m179();
            if (!viewM177.hasFocusable()) {
                return viewM191;
            }
            if (viewM191 != null) {
                return viewM177;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛵ, reason: contains not printable characters */
    public final int m178(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        m209();
        AbstractC0353 abstractC0353 = this.f334;
        boolean z = !this.f336;
        return AbstractC0319.m980(c2637, abstractC0353, m185(z), m188(z), this, this.f336);
    }

    /* JADX INFO: renamed from: ᛳᲁᲀᛷ, reason: contains not printable characters */
    public final View m179() {
        return m4614(this.f339 ? 0 : m4613() - 1);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public int mo144(C2637 c2637) {
        return m178(c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛵᛷᛳ */
    public boolean mo146(int i, Bundle bundle) {
        int iMin;
        if (super.mo146(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f343 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                C1213 c1213 = this.f12600;
                iMin = Math.min(i2, mo130(c1213.f5529, c1213.f5568) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                C1213 c12132 = this.f12600;
                iMin = Math.min(i3, mo136(c12132.f5529, c12132.f5568) - 1);
            }
            if (iMin >= 0) {
                m197(iMin, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛴᛶᛳᛸ, reason: contains not printable characters */
    public final int m180(int i, C2808 c2808, C2637 c2637, boolean z) {
        int iMo1038;
        int iMo10382 = i - this.f334.mo1038();
        if (iMo10382 <= 0) {
            return 0;
        }
        int i2 = -m208(iMo10382, c2808, c2637);
        int i3 = i + i2;
        if (!z || (iMo1038 = i3 - this.f334.mo1038()) <= 0) {
            return i2;
        }
        this.f334.mo1045(-iMo1038);
        return i2 - iMo1038;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public final void mo181(AccessibilityEvent accessibilityEvent) {
        super.mo181(accessibilityEvent);
        if (m4613() > 0) {
            View viewM205 = m205(0, m4613(), false);
            accessibilityEvent.setFromIndex(viewM205 == null ? -1 : AbstractC2551.m4603(viewM205));
            View viewM2052 = m205(m4613() - 1, -1, false);
            accessibilityEvent.setToIndex(viewM2052 != null ? AbstractC2551.m4603(viewM2052) : -1);
        }
    }

    /* JADX INFO: renamed from: ᛴᲇᛵᛸ, reason: contains not printable characters */
    public final int m182(C2808 c2808, C2442 c2442, C2637 c2637, boolean z) {
        int i;
        int i2 = c2442.f12017;
        int i3 = c2442.f12013;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2442.f12013 = i3 + i2;
            }
            m170(c2808, c2442);
        }
        int i4 = c2442.f12017 + c2442.f12008;
        while (true) {
            if ((!c2442.f12015 && i4 <= 0) || (i = c2442.f12019) < 0 || i >= c2637.m4742()) {
                break;
            }
            C1588 c1588 = this.f340;
            c1588.f8074 = 0;
            c1588.f8075 = false;
            c1588.f8076 = false;
            c1588.f8077 = false;
            mo168(c2808, c2637, c2442, c1588);
            if (!c1588.f8075) {
                int i5 = c2442.f12012;
                int i6 = c1588.f8074;
                c2442.f12012 = (c2442.f12018 * i6) + i5;
                if (!c1588.f8076 || c2442.f12014 != null || !c2637.f12977) {
                    c2442.f12017 -= i6;
                    i4 -= i6;
                }
                int i7 = c2442.f12013;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2442.f12013 = i8;
                    int i9 = c2442.f12017;
                    if (i9 < 0) {
                        c2442.f12013 = i8 + i9;
                    }
                    m170(c2808, c2442);
                }
                if (z && c1588.f8077) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2442.f12017;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public final void mo183(int i) {
        this.f332 = i;
        this.f344 = Integer.MIN_VALUE;
        C1273 c1273 = this.f335;
        if (c1273 != null) {
            c1273.f5859 = -1;
        }
        m4605();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public C2526 mo150() {
        return new C2526(-2, -2);
    }

    /* JADX INFO: renamed from: ᛵᛶᛸᲇ, reason: contains not printable characters */
    public final void m184() {
        if (this.f343 == 1 || !m175()) {
            this.f339 = this.f333;
        } else {
            this.f339 = !this.f333;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᲈᛷ */
    public void mo151(C2637 c2637, C2442 c2442, C2347 c2347) {
        int i = c2442.f12019;
        if (i < 0 || i >= c2637.m4742()) {
            return;
        }
        c2347.m4361(i, Math.max(0, c2442.f12013));
    }

    /* JADX INFO: renamed from: ᛵᲁᛴᛴ, reason: contains not printable characters */
    public final View m185(boolean z) {
        return this.f339 ? m205(m4613() - 1, -1, z) : m205(0, m4613(), z);
    }

    /* JADX INFO: renamed from: ᛵᲇᛸᲇ, reason: contains not printable characters */
    public final void m186(int i, int i2) {
        this.f337.f12017 = this.f334.mo1039() - i2;
        C2442 c2442 = this.f337;
        c2442.f12010 = this.f339 ? -1 : 1;
        c2442.f12019 = i;
        c2442.f12018 = 1;
        c2442.f12012 = i2;
        c2442.f12013 = Integer.MIN_VALUE;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᲈᲇᛵ */
    public void mo152(C2808 c2808, C2637 c2637, C0134 c0134) {
        super.mo152(c2808, c2637, c0134);
        AbstractC0359 abstractC0359 = this.f12600.f5537;
        if (abstractC0359 == null || abstractC0359.mo531() <= 0) {
            return;
        }
        c0134.m586(C1043.f4742);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final View mo187(int i) {
        int iM4613 = m4613();
        if (iM4613 == 0) {
            return null;
        }
        int iM4603 = i - AbstractC2551.m4603(m4614(0));
        if (iM4603 >= 0 && iM4603 < iM4613) {
            View viewM4614 = m4614(iM4603);
            if (AbstractC2551.m4603(viewM4614) == i) {
                return viewM4614;
            }
        }
        return super.mo187(i);
    }

    /* JADX INFO: renamed from: ᛶᛴᛲᛸ, reason: contains not printable characters */
    public final View m188(boolean z) {
        return this.f339 ? m205(0, m4613(), z) : m205(m4613() - 1, -1, z);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛵᛸᛳ, reason: contains not printable characters */
    public final void mo189(C1213 c1213, int i) {
        C0053 c0053 = new C0053(c1213.getContext());
        c0053.f557 = i;
        m4612(c0053);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo190() {
        return this.f333;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public int mo154(C2637 c2637) {
        return m201(c2637);
    }

    /* JADX INFO: renamed from: ᛷᛴᛶᛳ, reason: contains not printable characters */
    public final View m191(int i, int i2) {
        int i3;
        int i4;
        m209();
        if (i2 <= i && i2 >= i) {
            return m4614(i);
        }
        if (this.f334.mo1046(m4614(i)) < this.f334.mo1038()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f343 == 0 ? this.f12605.m555(i, i2, i3, i4) : this.f12607.m555(i, i2, i3, i4);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public int mo155(C2637 c2637) {
        return m178(c2637);
    }

    /* JADX INFO: renamed from: ᛷᛶᛱᛸ, reason: contains not printable characters */
    public final int m192(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f343 == 1) ? 1 : Integer.MIN_VALUE : this.f343 == 0 ? 1 : Integer.MIN_VALUE : this.f343 == 1 ? -1 : Integer.MIN_VALUE : this.f343 == 0 ? -1 : Integer.MIN_VALUE : (this.f343 != 1 && m175()) ? -1 : 1 : (this.f343 != 1 && m175()) ? 1 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018c  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᲈᛳᛲ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo157(C2808 c2808, C2637 c2637) {
        View focusedChild;
        View focusedChild2;
        View viewMo137;
        int i;
        int iMo1046;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iM207;
        int i7;
        View viewMo187;
        int iMo10462;
        int iMo1039;
        int i8;
        int i9 = -1;
        if (!(this.f335 == null && this.f332 == -1) && c2637.m4742() == 0) {
            m4607(c2808);
            return;
        }
        C1273 c1273 = this.f335;
        if (c1273 != null && (i8 = c1273.f5859) >= 0) {
            this.f332 = i8;
        }
        m209();
        boolean z = false;
        this.f337.f12011 = false;
        m184();
        C1213 c1213 = this.f12600;
        if (c1213 == null || (focusedChild = c1213.getFocusedChild()) == null || ((ArrayList) this.f12598.f13647).contains(focusedChild)) {
            focusedChild = null;
        }
        C1438 c1438 = this.f331;
        if (!c1438.f6831 || this.f332 != -1 || this.f335 != null) {
            c1438.m2939();
            c1438.f6835 = this.f339 ^ this.f338;
            if (c2637.f12977 || (i = this.f332) == -1) {
                if (m4613() != 0) {
                    C1213 c12132 = this.f12600;
                    if (c12132 == null || (focusedChild2 = c12132.getFocusedChild()) == null || ((ArrayList) this.f12598.f13647).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        C2526 c2526 = (C2526) focusedChild2.getLayoutParams();
                        if (c2526.f12448.m774() || c2526.f12448.m787() < 0 || c2526.f12448.m787() >= c2637.m4742()) {
                            boolean z2 = this.f342;
                            boolean z3 = this.f338;
                            if (z2 == z3 && (viewMo137 = mo137(c2808, c2637, c1438.f6835, z3)) != null) {
                                int iM4603 = AbstractC2551.m4603(viewMo137);
                                boolean z4 = c1438.f6835;
                                AbstractC0353 abstractC0353 = c1438.f6832;
                                if (z4) {
                                    int iMo1056 = abstractC0353.mo1056(viewMo137);
                                    AbstractC0353 abstractC03532 = c1438.f6832;
                                    c1438.f6834 = (Integer.MIN_VALUE == abstractC03532.f1828 ? 0 : abstractC03532.mo1036() - abstractC03532.f1828) + iMo1056;
                                } else {
                                    c1438.f6834 = abstractC0353.mo1046(viewMo137);
                                }
                                c1438.f6833 = iM4603;
                                if (!c2637.f12977 && mo133()) {
                                    int iMo10463 = this.f334.mo1046(viewMo137);
                                    int iMo10562 = this.f334.mo1056(viewMo137);
                                    int iMo1038 = this.f334.mo1038();
                                    int iMo10392 = this.f334.mo1039();
                                    boolean z5 = iMo10562 <= iMo1038 && iMo10463 < iMo1038;
                                    boolean z6 = iMo10463 >= iMo10392 && iMo10562 > iMo10392;
                                    if (z5 || z6) {
                                        if (c1438.f6835) {
                                            iMo1038 = iMo10392;
                                        }
                                        c1438.f6834 = iMo1038;
                                    }
                                }
                            } else {
                                c1438.m2937();
                                c1438.f6833 = this.f338 ? c2637.m4742() - 1 : 0;
                            }
                        } else {
                            c1438.m2938(focusedChild2, AbstractC2551.m4603(focusedChild2));
                        }
                        c1438.f6831 = true;
                    }
                }
            } else if (i < 0 || i >= c2637.m4742()) {
                this.f332 = -1;
                this.f344 = Integer.MIN_VALUE;
                if (m4613() != 0) {
                }
            } else {
                int i10 = this.f332;
                c1438.f6833 = i10;
                C1273 c12732 = this.f335;
                if (c12732 != null && c12732.f5859 >= 0) {
                    boolean z7 = c12732.f5858;
                    c1438.f6835 = z7;
                    AbstractC0353 abstractC03533 = this.f334;
                    if (z7) {
                        c1438.f6834 = abstractC03533.mo1039() - this.f335.f5860;
                    } else {
                        c1438.f6834 = abstractC03533.mo1038() + this.f335.f5860;
                    }
                } else if (this.f344 == Integer.MIN_VALUE) {
                    View viewMo1872 = mo187(i10);
                    if (viewMo1872 == null) {
                        if (m4613() > 0) {
                            c1438.f6835 = (this.f332 < AbstractC2551.m4603(m4614(0))) == this.f339;
                        }
                        c1438.m2937();
                    } else if (this.f334.mo1040(viewMo1872) > this.f334.mo1036()) {
                        c1438.m2937();
                    } else {
                        int iMo10464 = this.f334.mo1046(viewMo1872) - this.f334.mo1038();
                        AbstractC0353 abstractC03534 = this.f334;
                        if (iMo10464 < 0) {
                            c1438.f6834 = abstractC03534.mo1038();
                            c1438.f6835 = false;
                        } else if (abstractC03534.mo1039() - this.f334.mo1056(viewMo1872) < 0) {
                            c1438.f6834 = this.f334.mo1039();
                            c1438.f6835 = true;
                        } else {
                            boolean z8 = c1438.f6835;
                            AbstractC0353 abstractC03535 = this.f334;
                            if (z8) {
                                int iMo10563 = abstractC03535.mo1056(viewMo1872);
                                AbstractC0353 abstractC03536 = this.f334;
                                iMo1046 = (Integer.MIN_VALUE == abstractC03536.f1828 ? 0 : abstractC03536.mo1036() - abstractC03536.f1828) + iMo10563;
                            } else {
                                iMo1046 = abstractC03535.mo1046(viewMo1872);
                            }
                            c1438.f6834 = iMo1046;
                        }
                    }
                } else {
                    boolean z9 = this.f339;
                    c1438.f6835 = z9;
                    AbstractC0353 abstractC03537 = this.f334;
                    if (z9) {
                        c1438.f6834 = abstractC03537.mo1039() - this.f344;
                    } else {
                        c1438.f6834 = abstractC03537.mo1038() + this.f344;
                    }
                }
                c1438.f6831 = true;
            }
        } else if (focusedChild != null && (this.f334.mo1046(focusedChild) >= this.f334.mo1039() || this.f334.mo1056(focusedChild) <= this.f334.mo1038())) {
            c1438.m2938(focusedChild, AbstractC2551.m4603(focusedChild));
        }
        C2442 c2442 = this.f337;
        c2442.f12018 = c2442.f12016 >= 0 ? 1 : -1;
        int[] iArr = this.f341;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMo1036 = c2637.f12975 != -1 ? this.f334.mo1036() : 0;
        if (this.f337.f12018 == -1) {
            i2 = 0;
        } else {
            i2 = iMo1036;
            iMo1036 = 0;
        }
        iArr[0] = iMo1036;
        iArr[1] = i2;
        int iMo10382 = this.f334.mo1038() + Math.max(0, iMo1036);
        int iMo1051 = this.f334.mo1051() + Math.max(0, iArr[1]);
        if (c2637.f12977 && (i7 = this.f332) != -1 && this.f344 != Integer.MIN_VALUE && (viewMo187 = mo187(i7)) != null) {
            boolean z10 = this.f339;
            AbstractC0353 abstractC03538 = this.f334;
            if (z10) {
                iMo1039 = abstractC03538.mo1039() - this.f334.mo1056(viewMo187);
                iMo10462 = this.f344;
            } else {
                iMo10462 = abstractC03538.mo1046(viewMo187) - this.f334.mo1038();
                iMo1039 = this.f344;
            }
            int i11 = iMo1039 - iMo10462;
            if (i11 > 0) {
                iMo10382 += i11;
            } else {
                iMo1051 -= i11;
            }
        }
        boolean z11 = c1438.f6835;
        boolean z12 = this.f339;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        mo139(c2808, c2637, c1438, i9);
        m4626(c2808);
        this.f337.f12015 = this.f334.mo1049() == 0 && this.f334.mo1037() == 0;
        this.f337.getClass();
        this.f337.f12009 = 0;
        boolean z13 = c1438.f6835;
        int i12 = c1438.f6833;
        if (z13) {
            m204(i12, c1438.f6834);
            C2442 c24422 = this.f337;
            c24422.f12008 = iMo10382;
            m182(c2808, c24422, c2637, false);
            C2442 c24423 = this.f337;
            i4 = c24423.f12012;
            int i13 = c24423.f12019;
            int i14 = c24423.f12017;
            if (i14 > 0) {
                iMo1051 += i14;
            }
            m186(c1438.f6833, c1438.f6834);
            C2442 c24424 = this.f337;
            c24424.f12008 = iMo1051;
            c24424.f12019 += c24424.f12010;
            m182(c2808, c24424, c2637, false);
            C2442 c24425 = this.f337;
            i3 = c24425.f12012;
            int i15 = c24425.f12017;
            if (i15 > 0) {
                m204(i13, i4);
                C2442 c24426 = this.f337;
                c24426.f12008 = i15;
                m182(c2808, c24426, c2637, false);
                i4 = this.f337.f12012;
            }
        } else {
            m186(i12, c1438.f6834);
            C2442 c24427 = this.f337;
            c24427.f12008 = iMo1051;
            m182(c2808, c24427, c2637, false);
            C2442 c24428 = this.f337;
            i3 = c24428.f12012;
            int i16 = c24428.f12019;
            int i17 = c24428.f12017;
            if (i17 > 0) {
                iMo10382 += i17;
            }
            m204(c1438.f6833, c1438.f6834);
            C2442 c24429 = this.f337;
            c24429.f12008 = iMo10382;
            c24429.f12019 += c24429.f12010;
            m182(c2808, c24429, c2637, false);
            C2442 c244210 = this.f337;
            int i18 = c244210.f12012;
            int i19 = c244210.f12017;
            if (i19 > 0) {
                m186(i16, i3);
                C2442 c244211 = this.f337;
                c244211.f12008 = i19;
                m182(c2808, c244211, c2637, false);
                i3 = this.f337.f12012;
            }
            i4 = i18;
        }
        if (m4613() > 0) {
            if (this.f339 ^ this.f338) {
                int iM2072 = m207(i3, c2808, c2637, true);
                i5 = i4 + iM2072;
                i6 = i3 + iM2072;
                iM207 = m180(i5, c2808, c2637, false);
            } else {
                int iM180 = m180(i4, c2808, c2637, true);
                i5 = i4 + iM180;
                i6 = i3 + iM180;
                iM207 = m207(i6, c2808, c2637, false);
            }
            i4 = i5 + iM207;
            i3 = i6 + iM207;
        }
        if (c2637.f12978 && m4613() != 0 && !c2637.f12977 && mo133()) {
            List list2 = c2808.f13694;
            int size = list2.size();
            int iM46032 = AbstractC2551.m4603(m4614(0));
            int i20 = 0;
            int iMo1040 = 0;
            int iMo10402 = 0;
            while (i20 < size) {
                AbstractC0185 abstractC0185 = (AbstractC0185) list2.get(i20);
                boolean zM774 = abstractC0185.m774();
                View view = abstractC0185.f1093;
                if (!zM774) {
                    boolean z14 = abstractC0185.m787() < iM46032 ? true : z;
                    boolean z15 = this.f339;
                    AbstractC0353 abstractC03539 = this.f334;
                    if (z14 != z15) {
                        iMo1040 += abstractC03539.mo1040(view);
                    } else {
                        iMo10402 += abstractC03539.mo1040(view);
                    }
                }
                i20++;
                z = false;
            }
            this.f337.f12014 = list2;
            if (iMo1040 > 0) {
                m204(AbstractC2551.m4603(m177()), i4);
                C2442 c244212 = this.f337;
                c244212.f12008 = iMo1040;
                r4 = 0;
                c244212.f12017 = 0;
                c244212.m4479(null);
                m182(c2808, this.f337, c2637, false);
            } else {
                r4 = 0;
            }
            if (iMo10402 > 0) {
                m186(AbstractC2551.m4603(m179()), i3);
                C2442 c244213 = this.f337;
                c244213.f12008 = iMo10402;
                c244213.f12017 = r4;
                list = null;
                c244213.m4479(null);
                m182(c2808, this.f337, c2637, r4);
            } else {
                list = null;
            }
            this.f337.f12014 = list;
        }
        if (c2637.f12977) {
            c1438.m2939();
        } else {
            AbstractC0353 abstractC035310 = this.f334;
            abstractC035310.f1828 = abstractC035310.mo1036();
        }
        this.f342 = this.f338;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int mo193(C2637 c2637) {
        return m203(c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public final void mo194(Parcelable parcelable) {
        if (parcelable instanceof C1273) {
            C1273 c1273 = (C1273) parcelable;
            this.f335 = c1273;
            if (this.f332 != -1) {
                c1273.f5859 = -1;
            }
            m4605();
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛸᲇᛱᲇ */
    public int mo159(int i, C2808 c2808, C2637 c2637) {
        if (this.f343 == 0) {
            return 0;
        }
        return m208(i, c2808, c2637);
    }

    /* JADX INFO: renamed from: ᲀᛱᲁᲁ, reason: contains not printable characters */
    public final void m195(int i, int i2, boolean z, C2637 c2637) {
        int i3;
        int iMo1038;
        this.f337.f12015 = this.f334.mo1049() == 0 && this.f334.mo1037() == 0;
        this.f337.f12018 = i;
        int[] iArr = this.f341;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMo1036 = c2637.f12975 != -1 ? this.f334.mo1036() : 0;
        if (this.f337.f12018 == -1) {
            i3 = 0;
        } else {
            i3 = iMo1036;
            iMo1036 = 0;
        }
        iArr[0] = iMo1036;
        iArr[1] = i3;
        int iMax = Math.max(0, iMo1036);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C2442 c2442 = this.f337;
        int i4 = z2 ? iMax2 : iMax;
        c2442.f12008 = i4;
        if (!z2) {
            iMax = iMax2;
        }
        c2442.f12009 = iMax;
        if (z2) {
            c2442.f12008 = this.f334.mo1051() + i4;
            View viewM179 = m179();
            C2442 c24422 = this.f337;
            c24422.f12010 = this.f339 ? -1 : 1;
            int iM4603 = AbstractC2551.m4603(viewM179);
            C2442 c24423 = this.f337;
            c24422.f12019 = iM4603 + c24423.f12010;
            c24423.f12012 = this.f334.mo1056(viewM179);
            iMo1038 = this.f334.mo1056(viewM179) - this.f334.mo1039();
        } else {
            View viewM177 = m177();
            C2442 c24424 = this.f337;
            c24424.f12008 = this.f334.mo1038() + c24424.f12008;
            C2442 c24425 = this.f337;
            c24425.f12010 = this.f339 ? 1 : -1;
            int iM46032 = AbstractC2551.m4603(viewM177);
            C2442 c24426 = this.f337;
            c24425.f12019 = iM46032 + c24426.f12010;
            c24426.f12012 = this.f334.mo1046(viewM177);
            iMo1038 = (-this.f334.mo1046(viewM177)) + this.f334.mo1038();
        }
        C2442 c24427 = this.f337;
        c24427.f12017 = i2;
        if (z) {
            c24427.f12017 = i2 - iMo1038;
        }
        c24427.f12013 = iMo1038;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo196(String str) {
        C1213 c1213;
        if (this.f335 != null || (c1213 = this.f12600) == null) {
            return;
        }
        c1213.m2457(str);
    }

    /* JADX INFO: renamed from: ᲀᛴᛸᛷ, reason: contains not printable characters */
    public final void m197(int i, int i2) {
        this.f332 = i;
        this.f344 = i2;
        C1273 c1273 = this.f335;
        if (c1273 != null) {
            c1273.f5859 = -1;
        }
        m4605();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public final Parcelable mo198() {
        C1273 c1273 = this.f335;
        if (c1273 != null) {
            C1273 c12732 = new C1273();
            c12732.f5859 = c1273.f5859;
            c12732.f5860 = c1273.f5860;
            c12732.f5858 = c1273.f5858;
            return c12732;
        }
        C1273 c12733 = new C1273();
        if (m4613() <= 0) {
            c12733.f5859 = -1;
            return c12733;
        }
        m209();
        boolean z = this.f342 ^ this.f339;
        c12733.f5858 = z;
        if (z) {
            View viewM179 = m179();
            c12733.f5860 = this.f334.mo1039() - this.f334.mo1056(viewM179);
            c12733.f5859 = AbstractC2551.m4603(viewM179);
            return c12733;
        }
        View viewM177 = m177();
        c12733.f5859 = AbstractC2551.m4603(viewM177);
        c12733.f5860 = this.f334.mo1046(viewM177) - this.f334.mo1038();
        return c12733;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final void mo199(C1213 c1213) {
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final boolean mo200() {
        return true;
    }

    /* JADX INFO: renamed from: ᲁᛸᛲᲈ, reason: contains not printable characters */
    public final int m201(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        m209();
        AbstractC0353 abstractC0353 = this.f334;
        boolean z = !this.f336;
        return AbstractC0319.m986(c2637, abstractC0353, m185(z), m188(z), this, this.f336, this.f339);
    }

    /* JADX INFO: renamed from: ᲇᛱᛷᲇ, reason: contains not printable characters */
    public final void m202(C2808 c2808, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM4614 = m4614(i);
                m4611(i);
                c2808.m4927(viewM4614);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM46142 = m4614(i3);
            m4611(i3);
            c2808.m4927(viewM46142);
        }
    }

    /* JADX INFO: renamed from: ᲇᛳᛱ, reason: contains not printable characters */
    public final int m203(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        m209();
        AbstractC0353 abstractC0353 = this.f334;
        boolean z = !this.f336;
        return AbstractC0319.m991(c2637, abstractC0353, m185(z), m188(z), this, this.f336);
    }

    /* JADX INFO: renamed from: ᲇᛵᲀᲇ, reason: contains not printable characters */
    public final void m204(int i, int i2) {
        this.f337.f12017 = i2 - this.f334.mo1038();
        C2442 c2442 = this.f337;
        c2442.f12019 = i;
        c2442.f12010 = this.f339 ? 1 : -1;
        c2442.f12018 = -1;
        c2442.f12012 = i2;
        c2442.f12013 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᲇᛸᛴᛱ, reason: contains not printable characters */
    public final View m205(int i, int i2, boolean z) {
        m209();
        int i3 = z ? 24579 : 320;
        return this.f343 == 0 ? this.f12605.m555(i, i2, i3, 320) : this.f12607.m555(i, i2, i3, 320);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean mo206() {
        return this.f343 == 0;
    }

    /* JADX INFO: renamed from: ᲈᛱᛶᲀ, reason: contains not printable characters */
    public final int m207(int i, C2808 c2808, C2637 c2637, boolean z) {
        int iMo1039;
        int iMo10392 = this.f334.mo1039() - i;
        if (iMo10392 <= 0) {
            return 0;
        }
        int i2 = -m208(-iMo10392, c2808, c2637);
        int i3 = i + i2;
        if (!z || (iMo1039 = this.f334.mo1039() - i3) <= 0) {
            return i2;
        }
        this.f334.mo1045(iMo1039);
        return iMo1039 + i2;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᛳ */
    public void mo0(C2637 c2637) {
        this.f335 = null;
        this.f332 = -1;
        this.f344 = Integer.MIN_VALUE;
        this.f331.m2939();
    }

    /* JADX INFO: renamed from: ᲈᛳᲀᲈ, reason: contains not printable characters */
    public final int m208(int i, C2808 c2808, C2637 c2637) {
        if (m4613() != 0 && i != 0) {
            m209();
            this.f337.f12011 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m195(i2, iAbs, true, c2637);
            C2442 c2442 = this.f337;
            int iM182 = m182(c2808, c2442, c2637, false) + c2442.f12013;
            if (iM182 >= 0) {
                if (iAbs > iM182) {
                    i = i2 * iM182;
                }
                this.f334.mo1045(-i);
                this.f337.f12016 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᲈᛵᛶᛲ, reason: contains not printable characters */
    public final void m209() {
        if (this.f337 == null) {
            C2442 c2442 = new C2442();
            c2442.f12011 = true;
            c2442.f12008 = 0;
            c2442.f12009 = 0;
            c2442.f12014 = null;
            this.f337 = c2442;
        }
    }

    /* JADX INFO: renamed from: ᲈᛶᛲᛶ, reason: contains not printable characters */
    public final void m210(int i) {
        if (i != 0 && i != 1) {
            C0188.m798(AbstractC0897.m1989(i, "invalid orientation:"));
            return;
        }
        mo196(null);
        if (i != this.f343 || this.f334 == null) {
            AbstractC0353 abstractC0353M1035 = AbstractC0353.m1035(this, i);
            this.f334 = abstractC0353M1035;
            this.f331.f6832 = abstractC0353M1035;
            this.f343 = i;
            m4605();
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᲁᛵᛶ, reason: contains not printable characters */
    public final boolean mo211() {
        if (this.f12595 != 1073741824 && this.f12603 != 1073741824) {
            int iM4613 = m4613();
            for (int i = 0; i < iM4613; i++) {
                ViewGroup.LayoutParams layoutParams = m4614(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲈᲁᛶᛸ */
    public void mo167(boolean z) {
        mo196(null);
        if (this.f338 == z) {
            return;
        }
        this.f338 = z;
        m4605();
    }

    /* JADX INFO: renamed from: ᲈᲁᛷᛶ */
    public void mo168(C2808 c2808, C2637 c2637, C2442 c2442, C1588 c1588) {
        int i;
        int iMo1055;
        int i2;
        int iMo10552;
        View viewM4480 = c2442.m4480(c2808);
        if (viewM4480 == null) {
            c1588.f8075 = true;
            return;
        }
        C2526 c2526 = (C2526) viewM4480.getLayoutParams();
        List list = c2442.f12014;
        boolean z = this.f339;
        int i3 = c2442.f12018;
        if (list == null) {
            if (z == (i3 == -1)) {
                m4609(viewM4480, -1, false);
            } else {
                m4609(viewM4480, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m4609(viewM4480, -1, true);
            } else {
                m4609(viewM4480, 0, true);
            }
        }
        C2526 c25262 = (C2526) viewM4480.getLayoutParams();
        Rect rectM2450 = this.f12600.m2450(viewM4480);
        int i4 = rectM2450.left + rectM2450.right;
        int i5 = rectM2450.top + rectM2450.bottom;
        int iM4599 = AbstractC2551.m4599(mo206(), this.f12593, this.f12603, m4615() + m4621() + ((ViewGroup.MarginLayoutParams) c25262).leftMargin + ((ViewGroup.MarginLayoutParams) c25262).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c25262).width);
        int iM45992 = AbstractC2551.m4599(mo174(), this.f12599, this.f12595, m4620() + m4616() + ((ViewGroup.MarginLayoutParams) c25262).topMargin + ((ViewGroup.MarginLayoutParams) c25262).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c25262).height);
        if (m4622(viewM4480, iM4599, iM45992, c25262)) {
            viewM4480.measure(iM4599, iM45992);
        }
        c1588.f8074 = this.f334.mo1040(viewM4480);
        if (this.f343 == 1) {
            if (m175()) {
                iMo10552 = this.f12593 - m4615();
                iMo1055 = iMo10552 - this.f334.mo1055(viewM4480);
            } else {
                int iM4621 = m4621();
                iMo10552 = this.f334.mo1055(viewM4480) + iM4621;
                iMo1055 = iM4621;
            }
            int i6 = c2442.f12018;
            i2 = c2442.f12012;
            int i7 = c1588.f8074;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iM4616 = m4616();
            int iMo10553 = this.f334.mo1055(viewM4480) + iM4616;
            int i9 = c2442.f12018;
            int i10 = c2442.f12012;
            int i11 = c1588.f8074;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iMo10552 = i10;
                i2 = iM4616;
                i = iMo10553;
                iMo1055 = i12;
            } else {
                int i13 = i10 + i11;
                i = iMo10553;
                iMo1055 = i10;
                i2 = iM4616;
                iMo10552 = i13;
            }
        }
        AbstractC2551.m4601(viewM4480, iMo1055, i2, iMo10552, i);
        if (c2526.f12448.m774() || c2526.f12448.m782()) {
            c1588.f8076 = true;
        }
        c1588.f8077 = viewM4480.hasFocusable();
    }

    public LinearLayoutManager(int i) {
        this.f343 = 1;
        this.f333 = false;
        this.f339 = false;
        this.f338 = false;
        this.f336 = true;
        this.f332 = -1;
        this.f344 = Integer.MIN_VALUE;
        this.f335 = null;
        this.f331 = new C1438();
        this.f340 = new C1588();
        this.f330 = 2;
        this.f341 = new int[2];
        m210(i);
        mo196(null);
        if (this.f333) {
            this.f333 = false;
            m4605();
        }
    }
}
