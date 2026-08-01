package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.foundation.text.selection.C0920;
import java.util.List;
import p007.AbstractC6136;
import p155.C7606;
import p155.C7609;
import p316.C8675;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2519 implements InterfaceC2462, InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7152;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2470 f7153;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int[] f7154;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public SavedState f7155;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C2471 f7156;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f7157;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f7158;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f7159;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f7160;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7161;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f7162;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7163;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC2457 f7164;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2469 f7165;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7166;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2468();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7167;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f7168;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7169;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7169);
            parcel.writeInt(this.f7167);
            parcel.writeInt(this.f7168 ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7166 = 1;
        this.f7162 = false;
        this.f7161 = false;
        this.f7158 = false;
        this.f7157 = true;
        this.f7160 = -1;
        this.f7159 = Integer.MIN_VALUE;
        this.f7155 = null;
        this.f7156 = new C2471();
        this.f7153 = new C2470();
        this.f7152 = 2;
        this.f7154 = new int[2];
        C2520 c2520M4972 = AbstractC2519.m4972(context, attributeSet, i, i2);
        m4673(c2520M4972.f7597);
        boolean z = c2520M4972.f7595;
        mo4664(null);
        if (z != this.f7162) {
            this.f7162 = z;
            m4991();
        }
        mo4619(c2520M4972.f7594);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public C2518 mo4591() {
        return new C2518(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View mo4634(int i) {
        int iM4987 = m4987();
        if (iM4987 == 0) {
            return null;
        }
        int iM4973 = i - AbstractC2519.m4973(m4988(0));
        if (iM4973 >= 0 && iM4973 < iM4987) {
            View viewM4988 = m4988(iM4973);
            if (AbstractC2519.m4973(viewM4988) == i) {
                return viewM4988;
            }
        }
        return super.mo4634(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo4592(C2525 c2525) {
        return m4647(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public int mo4593(C2525 c2525) {
        return m4650(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int mo4635(C2525 c2525) {
        return m4649(c2525);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m4636() {
        View viewM4655 = m4655(0, m4987(), false);
        if (viewM4655 == null) {
            return -1;
        }
        return AbstractC2519.m4973(viewM4655);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m4637() {
        View viewM4655 = m4655(m4987() - 1, -1, false);
        if (viewM4655 == null) {
            return -1;
        }
        return AbstractC2519.m4973(viewM4655);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m4638(C2531 c2531, C2469 c2469, C2525 c2525, boolean z) {
        int i;
        int i2 = c2469.f7360;
        int i3 = c2469.f7364;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2469.f7364 = i3 + i2;
            }
            m4645(c2531, c2469);
        }
        int i4 = c2469.f7360 + c2469.f7363;
        while (true) {
            if ((!c2469.f7366 && i4 <= 0) || (i = c2469.f7359) < 0 || i >= c2525.m5015()) {
                break;
            }
            C2470 c2470 = this.f7153;
            c2470.f7372 = 0;
            c2470.f7371 = false;
            c2470.f7370 = false;
            c2470.f7369 = false;
            mo4597(c2531, c2525, c2469, c2470);
            if (!c2470.f7371) {
                int i5 = c2469.f7361;
                int i6 = c2470.f7372;
                c2469.f7361 = (c2469.f7357 * i6) + i5;
                if (!c2470.f7370 || c2469.f7365 != null || !c2525.f7616) {
                    c2469.f7360 -= i6;
                    i4 -= i6;
                }
                int i7 = c2469.f7364;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2469.f7364 = i8;
                    int i9 = c2469.f7360;
                    if (i9 < 0) {
                        c2469.f7364 = i8 + i9;
                    }
                    m4645(c2531, c2469);
                }
                if (z && c2470.f7369) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2469.f7360;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m4639() {
        if (this.f7165 == null) {
            C2469 c2469 = new C2469();
            c2469.f7362 = true;
            c2469.f7363 = 0;
            c2469.f7367 = 0;
            c2469.f7365 = null;
            this.f7165 = c2469;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m4640(boolean z) {
        return this.f7161 ? m4655(m4987() - 1, -1, z) : m4655(0, m4987(), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final View m4641(boolean z) {
        return this.f7161 ? m4655(0, m4987(), z) : m4655(m4987() - 1, -1, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public void mo4597(C2531 c2531, C2525 c2525, C2469 c2469, C2470 c2470) {
        int i;
        int iMo4827;
        int i2;
        int iMo48272;
        View viewM4863 = c2469.m4863(c2531);
        if (viewM4863 == null) {
            c2470.f7371 = true;
            return;
        }
        C2518 c2518 = (C2518) viewM4863.getLayoutParams();
        List list = c2469.f7365;
        boolean z = this.f7161;
        int i3 = c2469.f7357;
        if (list == null) {
            if (z == (i3 == -1)) {
                m5005(viewM4863);
            } else {
                m5003(viewM4863, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m5003(viewM4863, -1, true);
            } else {
                m5003(viewM4863, 0, true);
            }
        }
        mo5009(viewM4863);
        c2470.f7372 = this.f7164.mo4828(viewM4863);
        if (this.f7166 == 1) {
            if (m4643()) {
                iMo48272 = this.f7580 - getPaddingRight();
                iMo4827 = iMo48272 - this.f7164.mo4827(viewM4863);
            } else {
                int paddingLeft = getPaddingLeft();
                iMo48272 = this.f7164.mo4827(viewM4863) + paddingLeft;
                iMo4827 = paddingLeft;
            }
            int i4 = c2469.f7357;
            i2 = c2469.f7361;
            int i5 = c2470.f7372;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo48273 = this.f7164.mo4827(viewM4863) + paddingTop;
            int i7 = c2469.f7357;
            int i8 = c2469.f7361;
            int i9 = c2470.f7372;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iMo48272 = i8;
                i2 = paddingTop;
                i = iMo48273;
                iMo4827 = i10;
            } else {
                int i11 = i8 + i9;
                i = iMo48273;
                iMo4827 = i8;
                i2 = paddingTop;
                iMo48272 = i11;
            }
        }
        AbstractC2519.m4982(viewM4863, iMo4827, i2, iMo48272, i);
        if (c2518.f7578.isRemoved() || c2518.f7578.isUpdated()) {
            c2470.f7370 = true;
        }
        c2470.f7369 = viewM4863.hasFocusable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final View m4642() {
        return m4988(this.f7161 ? m4987() - 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final boolean m4643() {
        return this.f7591.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m4644(C2531 c2531, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM4988 = m4988(i);
                if (m4988(i) != null) {
                    this.f7593.m4936(i);
                }
                c2531.m5031(viewM4988);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM49882 = m4988(i3);
            if (m4988(i3) != null) {
                this.f7593.m4936(i3);
            }
            c2531.m5031(viewM49882);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m4645(C2531 c2531, C2469 c2469) {
        if (!c2469.f7362 || c2469.f7366) {
            return;
        }
        int i = c2469.f7364;
        int i2 = c2469.f7367;
        if (c2469.f7357 == -1) {
            int iM4987 = m4987();
            if (i < 0) {
                return;
            }
            int iMo4825 = (this.f7164.mo4825() - i) + i2;
            if (this.f7161) {
                for (int i3 = 0; i3 < iM4987; i3++) {
                    View viewM4988 = m4988(i3);
                    if (this.f7164.mo4826(viewM4988) < iMo4825 || this.f7164.mo4831(viewM4988) < iMo4825) {
                        m4644(c2531, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4987 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM49882 = m4988(i5);
                if (this.f7164.mo4826(viewM49882) < iMo4825 || this.f7164.mo4831(viewM49882) < iMo4825) {
                    m4644(c2531, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM49872 = m4987();
        if (!this.f7161) {
            for (int i7 = 0; i7 < iM49872; i7++) {
                View viewM49883 = m4988(i7);
                if (this.f7164.mo4829(viewM49883) > i6 || this.f7164.mo4830(viewM49883) > i6) {
                    m4644(c2531, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM49872 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM49884 = m4988(i9);
            if (this.f7164.mo4829(viewM49884) > i6 || this.f7164.mo4830(viewM49884) > i6) {
                m4644(c2531, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public void mo4599(C2525 c2525, C2469 c2469, C0920 c0920) {
        int i = c2469.f7359;
        if (i < 0 || i >= c2525.m5015()) {
            return;
        }
        c0920.m1818(i, Math.max(0, c2469.f7364));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public void mo4646(C2525 c2525, int[] iArr) {
        int i;
        int iMo4836 = c2525.f7612 != -1 ? this.f7164.mo4836() : 0;
        if (this.f7165.f7357 == -1) {
            i = 0;
        } else {
            i = iMo4836;
            iMo4836 = 0;
        }
        iArr[0] = iMo4836;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m4647(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        m4639();
        AbstractC2457 abstractC2457 = this.f7164;
        boolean z = !this.f7157;
        return C8675.m14369(c2525, abstractC2457, m4640(z), m4641(z), this, this.f7157);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final int m4648(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f7166 == 1) ? 1 : Integer.MIN_VALUE : this.f7166 == 0 ? 1 : Integer.MIN_VALUE : this.f7166 == 1 ? -1 : Integer.MIN_VALUE : this.f7166 == 0 ? -1 : Integer.MIN_VALUE : (this.f7166 != 1 && m4643()) ? -1 : 1 : (this.f7166 != 1 && m4643()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m4649(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        m4639();
        AbstractC2457 abstractC2457 = this.f7164;
        boolean z = !this.f7157;
        return C8675.m14371(c2525, abstractC2457, m4640(z), m4641(z), this, this.f7157);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final int m4650(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        m4639();
        AbstractC2457 abstractC2457 = this.f7164;
        boolean z = !this.f7157;
        return C8675.m14368(c2525, abstractC2457, m4640(z), m4641(z), this, this.f7157, this.f7161);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final int m4651(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iMo4834;
        int iMo48342 = this.f7164.mo4834() - i;
        if (iMo48342 <= 0) {
            return 0;
        }
        int i2 = -m4675(-iMo48342, c2531, c2525);
        int i3 = i + i2;
        if (!z || (iMo4834 = this.f7164.mo4834() - i3) <= 0) {
            return i2;
        }
        this.f7164.mo4832(iMo4834);
        return iMo4834 + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo4600(androidx.recyclerview.widget.C2531 r17, androidx.recyclerview.widget.C2525 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.m4639()
            int r1 = r0.m4987()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.m4987()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.m5015()
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r7 = r0.f7164
            int r7 = r7.mo4835()
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r8 = r0.f7164
            int r8 = r8.mo4834()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.m4988(r1)
            int r13 = androidx.recyclerview.widget.AbstractC2519.m4973(r12)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r14 = r0.f7164
            int r14 = r14.mo4826(r12)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r15 = r0.f7164
            int r15 = r15.mo4829(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.飘花落叶言子苏世哲兰楪 r13 = (androidx.recyclerview.widget.C2518) r13
            androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰 r13 = r13.f7578
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4600(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, boolean, boolean):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final View m4652() {
        return m4988(this.f7161 ? 0 : m4987() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final int m4653(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iMo4835;
        int iMo48352 = i - this.f7164.mo4835();
        if (iMo48352 <= 0) {
            return 0;
        }
        int i2 = -m4675(iMo48352, c2531, c2525);
        int i3 = i + i2;
        if (!z || (iMo4835 = i3 - this.f7164.mo4835()) <= 0) {
            return i2;
        }
        this.f7164.mo4832(-iMo4835);
        return i2 - iMo4835;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final View m4654(int i, int i2) {
        int i3;
        int i4;
        m4639();
        if (i2 <= i && i2 >= i) {
            return m4988(i);
        }
        if (this.f7164.mo4826(m4988(i)) < this.f7164.mo4835()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = DexMap.TYPE_TYPE_LIST;
        }
        return this.f7166 == 0 ? this.f7592.m4905(i, i2, i3, i4) : this.f7586.m4905(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final View m4655(int i, int i2, boolean z) {
        m4639();
        int i3 = z ? 24579 : 320;
        return this.f7166 == 0 ? this.f7592.m4905(i, i2, i3, 320) : this.f7586.m4905(i, i2, i3, 320);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public int mo4601(int i, C2531 c2531, C2525 c2525) {
        if (this.f7166 == 1) {
            return 0;
        }
        return m4675(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo4656(int i) {
        this.f7160 = i;
        this.f7159 = Integer.MIN_VALUE;
        SavedState savedState = this.f7155;
        if (savedState != null) {
            savedState.f7169 = -1;
        }
        m4991();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public void mo4657(RecyclerView recyclerView, int i) {
        C2459 c2459 = new C2459(recyclerView.getContext());
        c2459.f7316 = i;
        m4995(c2459);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final boolean mo4658() {
        if (this.f7581 != 1073741824 && this.f7582 != 1073741824) {
            int iM4987 = m4987();
            for (int i = 0; i < iM4987; i++) {
                ViewGroup.LayoutParams layoutParams = m4988(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public boolean mo4602() {
        return this.f7155 == null && this.f7163 == this.f7158;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final Parcelable mo4659() {
        SavedState savedState = this.f7155;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7169 = savedState.f7169;
            savedState2.f7167 = savedState.f7167;
            savedState2.f7168 = savedState.f7168;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m4987() <= 0) {
            savedState3.f7169 = -1;
            return savedState3;
        }
        m4639();
        boolean z = this.f7163 ^ this.f7161;
        savedState3.f7168 = z;
        if (z) {
            View viewM4652 = m4652();
            savedState3.f7167 = this.f7164.mo4834() - this.f7164.mo4829(viewM4652);
            savedState3.f7169 = AbstractC2519.m4973(viewM4652);
            return savedState3;
        }
        View viewM4642 = m4642();
        savedState3.f7169 = AbstractC2519.m4973(viewM4642);
        savedState3.f7167 = this.f7164.mo4826(viewM4642) - this.f7164.mo4835();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public boolean mo4603(int i, Bundle bundle) {
        int iMin;
        if (super.mo4603(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f7166 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f7591;
                iMin = Math.min(i2, mo4590(recyclerView.f7230, recyclerView.f7240) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f7591;
                iMin = Math.min(i3, mo4594(recyclerView2.f7230, recyclerView2.f7240) - 1);
            }
            if (iMin >= 0) {
                m4674(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public int mo4605(int i, C2531 c2531, C2525 c2525) {
        if (this.f7166 == 0) {
            return 0;
        }
        return m4675(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PointF mo4660(int i) {
        if (m4987() == 0) {
            return null;
        }
        int i2 = (i < AbstractC2519.m4973(m4988(0))) != this.f7161 ? -1 : 1;
        return this.f7166 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo4661(int i, int i2, C2525 c2525, C0920 c0920) {
        if (this.f7166 != 0) {
            i = i2;
        }
        if (m4987() == 0 || i == 0) {
            return;
        }
        m4639();
        m4672(i > 0 ? 1 : -1, Math.abs(i), true, c2525);
        mo4599(c2525, this.f7165, c0920);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo4606(C2525 c2525) {
        return m4650(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo4607(C2525 c2525) {
        return m4647(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo4662(int i, C0920 c0920) {
        boolean z;
        int i2;
        SavedState savedState = this.f7155;
        if (savedState == null || (i2 = savedState.f7169) < 0) {
            m4676();
            z = this.f7161;
            i2 = this.f7160;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f7168;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f7152 && i2 >= 0 && i2 < i; i4++) {
            c0920.m1818(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int mo4663(C2525 c2525) {
        return m4649(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo4664(String str) {
        if (this.f7155 == null) {
            super.mo4664(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo4665() {
        return this.f7166 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean mo4666() {
        return this.f7166 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void mo4667(AccessibilityEvent accessibilityEvent) {
        super.mo4667(accessibilityEvent);
        if (m4987() > 0) {
            accessibilityEvent.setFromIndex(m4636());
            accessibilityEvent.setToIndex(m4637());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public View mo4609(View view, int i, C2531 c2531, C2525 c2525) {
        int iM4648;
        m4676();
        if (m4987() != 0 && (iM4648 = m4648(i)) != Integer.MIN_VALUE) {
            m4639();
            m4672(iM4648, (int) (this.f7164.mo4836() * 0.33333334f), false, c2525);
            C2469 c2469 = this.f7165;
            c2469.f7364 = Integer.MIN_VALUE;
            c2469.f7362 = false;
            m4638(c2531, c2469, c2525, true);
            boolean z = this.f7161;
            View viewM4654 = iM4648 == -1 ? z ? m4654(m4987() - 1, -1) : m4654(0, m4987()) : z ? m4654(0, m4987()) : m4654(m4987() - 1, -1);
            View viewM4642 = iM4648 == -1 ? m4642() : m4652();
            if (!viewM4642.hasFocusable()) {
                return viewM4654;
            }
            if (viewM4654 != null) {
                return viewM4642;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4610(androidx.recyclerview.widget.C2531 r18, androidx.recyclerview.widget.C2525 r19) {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4610(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo4669(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7155 = savedState;
            if (this.f7160 != -1) {
                savedState.f7169 = -1;
            }
            m4991();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo4612(C2525 c2525) {
        this.f7155 = null;
        this.f7160 = -1;
        this.f7159 = Integer.MIN_VALUE;
        this.f7156.m4865();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo4618(C2531 c2531, C2525 c2525, C7606 c7606) {
        super.mo4618(c2531, c2525, c7606);
        AbstractC2450 abstractC2450 = this.f7591.f7193;
        if (abstractC2450 == null || abstractC2450.mo4784() <= 0) {
            return;
        }
        c7606.m12805(C7609.f20646);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo4670() {
        return this.f7162;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean mo4671() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public final void m4672(int i, int i2, boolean z, C2525 c2525) {
        int iMo4835;
        this.f7165.f7366 = this.f7164.mo4837() == 0 && this.f7164.mo4825() == 0;
        this.f7165.f7357 = i;
        int[] iArr = this.f7154;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4646(c2525, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C2469 c2469 = this.f7165;
        int i3 = z2 ? iMax2 : iMax;
        c2469.f7363 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2469.f7367 = iMax;
        if (z2) {
            c2469.f7363 = this.f7164.mo4833() + i3;
            View viewM4652 = m4652();
            C2469 c24692 = this.f7165;
            c24692.f7358 = this.f7161 ? -1 : 1;
            int iM4973 = AbstractC2519.m4973(viewM4652);
            C2469 c24693 = this.f7165;
            c24692.f7359 = iM4973 + c24693.f7358;
            c24693.f7361 = this.f7164.mo4829(viewM4652);
            iMo4835 = this.f7164.mo4829(viewM4652) - this.f7164.mo4834();
        } else {
            View viewM4642 = m4642();
            C2469 c24694 = this.f7165;
            c24694.f7363 = this.f7164.mo4835() + c24694.f7363;
            C2469 c24695 = this.f7165;
            c24695.f7358 = this.f7161 ? 1 : -1;
            int iM49732 = AbstractC2519.m4973(viewM4642);
            C2469 c24696 = this.f7165;
            c24695.f7359 = iM49732 + c24696.f7358;
            c24696.f7361 = this.f7164.mo4826(viewM4642);
            iMo4835 = (-this.f7164.mo4826(viewM4642)) + this.f7164.mo4835();
        }
        C2469 c24697 = this.f7165;
        c24697.f7360 = i2;
        if (z) {
            c24697.f7360 = i2 - iMo4835;
        }
        c24697.f7364 = iMo4835;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public void mo4619(boolean z) {
        mo4664(null);
        if (this.f7158 == z) {
            return;
        }
        this.f7158 = z;
        m4991();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m4673(int i) {
        if (i != 0 && i != 1) {
            C5919.m11249(AbstractC6136.m11556(i, "invalid orientation:"));
            return;
        }
        mo4664(null);
        if (i != this.f7166 || this.f7164 == null) {
            AbstractC2457 abstractC2457M4839 = AbstractC2457.m4839(this, i);
            this.f7164 = abstractC2457M4839;
            this.f7156.f7377 = abstractC2457M4839;
            this.f7166 = i;
            m4991();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m4674(int i, int i2) {
        this.f7160 = i;
        this.f7159 = i2;
        SavedState savedState = this.f7155;
        if (savedState != null) {
            savedState.f7169 = -1;
        }
        m4991();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final int m4675(int i, C2531 c2531, C2525 c2525) {
        if (m4987() != 0 && i != 0) {
            m4639();
            this.f7165.f7362 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m4672(i2, iAbs, true, c2525);
            C2469 c2469 = this.f7165;
            int iM4638 = m4638(c2531, c2469, c2525, false) + c2469.f7364;
            if (iM4638 >= 0) {
                if (iAbs > iM4638) {
                    i = i2 * iM4638;
                }
                this.f7164.mo4832(-i);
                this.f7165.f7368 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m4676() {
        if (this.f7166 == 1 || !m4643()) {
            this.f7161 = this.f7162;
        } else {
            this.f7161 = !this.f7162;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final void m4677(int i, int i2) {
        this.f7165.f7360 = i2 - this.f7164.mo4835();
        C2469 c2469 = this.f7165;
        c2469.f7359 = i;
        c2469.f7358 = this.f7161 ? 1 : -1;
        c2469.f7357 = -1;
        c2469.f7361 = i2;
        c2469.f7364 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final void m4678(int i, int i2) {
        this.f7165.f7360 = this.f7164.mo4834() - i2;
        C2469 c2469 = this.f7165;
        c2469.f7358 = this.f7161 ? -1 : 1;
        c2469.f7359 = i;
        c2469.f7357 = 1;
        c2469.f7361 = i2;
        c2469.f7364 = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo4668(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.f7166 = 1;
        this.f7162 = false;
        this.f7161 = false;
        this.f7158 = false;
        this.f7157 = true;
        this.f7160 = -1;
        this.f7159 = Integer.MIN_VALUE;
        this.f7155 = null;
        this.f7156 = new C2471();
        this.f7153 = new C2470();
        this.f7152 = 2;
        this.f7154 = new int[2];
        m4673(i);
        mo4664(null);
        if (this.f7162) {
            this.f7162 = false;
            m4991();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public void mo4598(C2531 c2531, C2525 c2525, C2471 c2471, int i) {
    }
}
