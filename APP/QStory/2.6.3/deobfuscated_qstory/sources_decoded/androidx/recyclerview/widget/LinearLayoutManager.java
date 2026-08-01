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
import p009.AbstractC6183;
import p155.C7607;
import p155.C7610;
import p316.C8667;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2519 implements InterfaceC2462, InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7153;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2470 f7154;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int[] f7155;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public SavedState f7156;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C2471 f7157;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f7158;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f7159;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f7160;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f7161;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7162;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f7163;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7164;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC2457 f7165;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2469 f7166;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7167;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2468();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7168;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f7169;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7170;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7170);
            parcel.writeInt(this.f7168);
            parcel.writeInt(this.f7169 ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7167 = 1;
        this.f7163 = false;
        this.f7162 = false;
        this.f7159 = false;
        this.f7158 = true;
        this.f7161 = -1;
        this.f7160 = Integer.MIN_VALUE;
        this.f7156 = null;
        this.f7157 = new C2471();
        this.f7154 = new C2470();
        this.f7153 = 2;
        this.f7155 = new int[2];
        C2520 c2520M4982 = AbstractC2519.m4982(context, attributeSet, i, i2);
        m4683(c2520M4982.f7598);
        boolean z = c2520M4982.f7596;
        mo4674(null);
        if (z != this.f7163) {
            this.f7163 = z;
            m5001();
        }
        mo4629(c2520M4982.f7595);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public C2518 mo4601() {
        return new C2518(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View mo4644(int i) {
        int iM4997 = m4997();
        if (iM4997 == 0) {
            return null;
        }
        int iM4983 = i - AbstractC2519.m4983(m4998(0));
        if (iM4983 >= 0 && iM4983 < iM4997) {
            View viewM4998 = m4998(iM4983);
            if (AbstractC2519.m4983(viewM4998) == i) {
                return viewM4998;
            }
        }
        return super.mo4644(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo4602(C2525 c2525) {
        return m4657(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public int mo4603(C2525 c2525) {
        return m4660(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int mo4645(C2525 c2525) {
        return m4659(c2525);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m4646() {
        View viewM4665 = m4665(0, m4997(), false);
        if (viewM4665 == null) {
            return -1;
        }
        return AbstractC2519.m4983(viewM4665);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m4647() {
        View viewM4665 = m4665(m4997() - 1, -1, false);
        if (viewM4665 == null) {
            return -1;
        }
        return AbstractC2519.m4983(viewM4665);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m4648(C2531 c2531, C2469 c2469, C2525 c2525, boolean z) {
        int i;
        int i2 = c2469.f7361;
        int i3 = c2469.f7365;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2469.f7365 = i3 + i2;
            }
            m4655(c2531, c2469);
        }
        int i4 = c2469.f7361 + c2469.f7364;
        while (true) {
            if ((!c2469.f7367 && i4 <= 0) || (i = c2469.f7360) < 0 || i >= c2525.m5025()) {
                break;
            }
            C2470 c2470 = this.f7154;
            c2470.f7373 = 0;
            c2470.f7372 = false;
            c2470.f7371 = false;
            c2470.f7370 = false;
            mo4607(c2531, c2525, c2469, c2470);
            if (!c2470.f7372) {
                int i5 = c2469.f7362;
                int i6 = c2470.f7373;
                c2469.f7362 = (c2469.f7358 * i6) + i5;
                if (!c2470.f7371 || c2469.f7366 != null || !c2525.f7617) {
                    c2469.f7361 -= i6;
                    i4 -= i6;
                }
                int i7 = c2469.f7365;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2469.f7365 = i8;
                    int i9 = c2469.f7361;
                    if (i9 < 0) {
                        c2469.f7365 = i8 + i9;
                    }
                    m4655(c2531, c2469);
                }
                if (z && c2470.f7370) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2469.f7361;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m4649() {
        if (this.f7166 == null) {
            C2469 c2469 = new C2469();
            c2469.f7363 = true;
            c2469.f7364 = 0;
            c2469.f7368 = 0;
            c2469.f7366 = null;
            this.f7166 = c2469;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m4650(boolean z) {
        return this.f7162 ? m4665(m4997() - 1, -1, z) : m4665(0, m4997(), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final View m4651(boolean z) {
        return this.f7162 ? m4665(0, m4997(), z) : m4665(m4997() - 1, -1, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public void mo4607(C2531 c2531, C2525 c2525, C2469 c2469, C2470 c2470) {
        int i;
        int iMo4837;
        int i2;
        int iMo48372;
        View viewM4873 = c2469.m4873(c2531);
        if (viewM4873 == null) {
            c2470.f7372 = true;
            return;
        }
        C2518 c2518 = (C2518) viewM4873.getLayoutParams();
        List list = c2469.f7366;
        boolean z = this.f7162;
        int i3 = c2469.f7358;
        if (list == null) {
            if (z == (i3 == -1)) {
                m5015(viewM4873);
            } else {
                m5013(viewM4873, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m5013(viewM4873, -1, true);
            } else {
                m5013(viewM4873, 0, true);
            }
        }
        mo5019(viewM4873);
        c2470.f7373 = this.f7165.mo4838(viewM4873);
        if (this.f7167 == 1) {
            if (m4653()) {
                iMo48372 = this.f7581 - getPaddingRight();
                iMo4837 = iMo48372 - this.f7165.mo4837(viewM4873);
            } else {
                int paddingLeft = getPaddingLeft();
                iMo48372 = this.f7165.mo4837(viewM4873) + paddingLeft;
                iMo4837 = paddingLeft;
            }
            int i4 = c2469.f7358;
            i2 = c2469.f7362;
            int i5 = c2470.f7373;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo48373 = this.f7165.mo4837(viewM4873) + paddingTop;
            int i7 = c2469.f7358;
            int i8 = c2469.f7362;
            int i9 = c2470.f7373;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iMo48372 = i8;
                i2 = paddingTop;
                i = iMo48373;
                iMo4837 = i10;
            } else {
                int i11 = i8 + i9;
                i = iMo48373;
                iMo4837 = i8;
                i2 = paddingTop;
                iMo48372 = i11;
            }
        }
        AbstractC2519.m4992(viewM4873, iMo4837, i2, iMo48372, i);
        if (c2518.f7579.isRemoved() || c2518.f7579.isUpdated()) {
            c2470.f7371 = true;
        }
        c2470.f7370 = viewM4873.hasFocusable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final View m4652() {
        return m4998(this.f7162 ? m4997() - 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final boolean m4653() {
        return this.f7592.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m4654(C2531 c2531, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM4998 = m4998(i);
                if (m4998(i) != null) {
                    this.f7594.m4946(i);
                }
                c2531.m5041(viewM4998);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM49982 = m4998(i3);
            if (m4998(i3) != null) {
                this.f7594.m4946(i3);
            }
            c2531.m5041(viewM49982);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m4655(C2531 c2531, C2469 c2469) {
        if (!c2469.f7363 || c2469.f7367) {
            return;
        }
        int i = c2469.f7365;
        int i2 = c2469.f7368;
        if (c2469.f7358 == -1) {
            int iM4997 = m4997();
            if (i < 0) {
                return;
            }
            int iMo4835 = (this.f7165.mo4835() - i) + i2;
            if (this.f7162) {
                for (int i3 = 0; i3 < iM4997; i3++) {
                    View viewM4998 = m4998(i3);
                    if (this.f7165.mo4836(viewM4998) < iMo4835 || this.f7165.mo4841(viewM4998) < iMo4835) {
                        m4654(c2531, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4997 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM49982 = m4998(i5);
                if (this.f7165.mo4836(viewM49982) < iMo4835 || this.f7165.mo4841(viewM49982) < iMo4835) {
                    m4654(c2531, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM49972 = m4997();
        if (!this.f7162) {
            for (int i7 = 0; i7 < iM49972; i7++) {
                View viewM49983 = m4998(i7);
                if (this.f7165.mo4839(viewM49983) > i6 || this.f7165.mo4840(viewM49983) > i6) {
                    m4654(c2531, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM49972 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM49984 = m4998(i9);
            if (this.f7165.mo4839(viewM49984) > i6 || this.f7165.mo4840(viewM49984) > i6) {
                m4654(c2531, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public void mo4609(C2525 c2525, C2469 c2469, C0920 c0920) {
        int i = c2469.f7360;
        if (i < 0 || i >= c2525.m5025()) {
            return;
        }
        c0920.m1828(i, Math.max(0, c2469.f7365));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public void mo4656(C2525 c2525, int[] iArr) {
        int i;
        int iMo4846 = c2525.f7613 != -1 ? this.f7165.mo4846() : 0;
        if (this.f7166.f7358 == -1) {
            i = 0;
        } else {
            i = iMo4846;
            iMo4846 = 0;
        }
        iArr[0] = iMo4846;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m4657(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        m4649();
        AbstractC2457 abstractC2457 = this.f7165;
        boolean z = !this.f7158;
        return C8667.m14386(c2525, abstractC2457, m4650(z), m4651(z), this, this.f7158);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final int m4658(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f7167 == 1) ? 1 : Integer.MIN_VALUE : this.f7167 == 0 ? 1 : Integer.MIN_VALUE : this.f7167 == 1 ? -1 : Integer.MIN_VALUE : this.f7167 == 0 ? -1 : Integer.MIN_VALUE : (this.f7167 != 1 && m4653()) ? -1 : 1 : (this.f7167 != 1 && m4653()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m4659(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        m4649();
        AbstractC2457 abstractC2457 = this.f7165;
        boolean z = !this.f7158;
        return C8667.m14369(c2525, abstractC2457, m4650(z), m4651(z), this, this.f7158);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final int m4660(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        m4649();
        AbstractC2457 abstractC2457 = this.f7165;
        boolean z = !this.f7158;
        return C8667.m14387(c2525, abstractC2457, m4650(z), m4651(z), this, this.f7158, this.f7162);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final int m4661(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iMo4844;
        int iMo48442 = this.f7165.mo4844() - i;
        if (iMo48442 <= 0) {
            return 0;
        }
        int i2 = -m4685(-iMo48442, c2531, c2525);
        int i3 = i + i2;
        if (!z || (iMo4844 = this.f7165.mo4844() - i3) <= 0) {
            return i2;
        }
        this.f7165.mo4842(iMo4844);
        return iMo4844 + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo4610(androidx.recyclerview.widget.C2531 r17, androidx.recyclerview.widget.C2525 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.m4649()
            int r1 = r0.m4997()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.m4997()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.m5025()
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r7 = r0.f7165
            int r7 = r7.mo4845()
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r8 = r0.f7165
            int r8 = r8.mo4844()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.m4998(r1)
            int r13 = androidx.recyclerview.widget.AbstractC2519.m4983(r12)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r14 = r0.f7165
            int r14 = r14.mo4836(r12)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r15 = r0.f7165
            int r15 = r15.mo4839(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.飘花落叶言子苏世哲兰楪 r13 = (androidx.recyclerview.widget.C2518) r13
            androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰 r13 = r13.f7579
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4610(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, boolean, boolean):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final View m4662() {
        return m4998(this.f7162 ? 0 : m4997() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final int m4663(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iMo4845;
        int iMo48452 = i - this.f7165.mo4845();
        if (iMo48452 <= 0) {
            return 0;
        }
        int i2 = -m4685(iMo48452, c2531, c2525);
        int i3 = i + i2;
        if (!z || (iMo4845 = i3 - this.f7165.mo4845()) <= 0) {
            return i2;
        }
        this.f7165.mo4842(-iMo4845);
        return i2 - iMo4845;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final View m4664(int i, int i2) {
        int i3;
        int i4;
        m4649();
        if (i2 <= i && i2 >= i) {
            return m4998(i);
        }
        if (this.f7165.mo4836(m4998(i)) < this.f7165.mo4845()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = DexMap.TYPE_TYPE_LIST;
        }
        return this.f7167 == 0 ? this.f7593.m4915(i, i2, i3, i4) : this.f7587.m4915(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final View m4665(int i, int i2, boolean z) {
        m4649();
        int i3 = z ? 24579 : 320;
        return this.f7167 == 0 ? this.f7593.m4915(i, i2, i3, 320) : this.f7587.m4915(i, i2, i3, 320);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public int mo4611(int i, C2531 c2531, C2525 c2525) {
        if (this.f7167 == 1) {
            return 0;
        }
        return m4685(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo4666(int i) {
        this.f7161 = i;
        this.f7160 = Integer.MIN_VALUE;
        SavedState savedState = this.f7156;
        if (savedState != null) {
            savedState.f7170 = -1;
        }
        m5001();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public void mo4667(RecyclerView recyclerView, int i) {
        C2459 c2459 = new C2459(recyclerView.getContext());
        c2459.f7317 = i;
        m5005(c2459);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final boolean mo4668() {
        if (this.f7582 != 1073741824 && this.f7583 != 1073741824) {
            int iM4997 = m4997();
            for (int i = 0; i < iM4997; i++) {
                ViewGroup.LayoutParams layoutParams = m4998(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public boolean mo4612() {
        return this.f7156 == null && this.f7164 == this.f7159;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final Parcelable mo4669() {
        SavedState savedState = this.f7156;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7170 = savedState.f7170;
            savedState2.f7168 = savedState.f7168;
            savedState2.f7169 = savedState.f7169;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m4997() <= 0) {
            savedState3.f7170 = -1;
            return savedState3;
        }
        m4649();
        boolean z = this.f7164 ^ this.f7162;
        savedState3.f7169 = z;
        if (z) {
            View viewM4662 = m4662();
            savedState3.f7168 = this.f7165.mo4844() - this.f7165.mo4839(viewM4662);
            savedState3.f7170 = AbstractC2519.m4983(viewM4662);
            return savedState3;
        }
        View viewM4652 = m4652();
        savedState3.f7170 = AbstractC2519.m4983(viewM4652);
        savedState3.f7168 = this.f7165.mo4836(viewM4652) - this.f7165.mo4845();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public boolean mo4613(int i, Bundle bundle) {
        int iMin;
        if (super.mo4613(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f7167 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f7592;
                iMin = Math.min(i2, mo4600(recyclerView.f7231, recyclerView.f7241) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f7592;
                iMin = Math.min(i3, mo4604(recyclerView2.f7231, recyclerView2.f7241) - 1);
            }
            if (iMin >= 0) {
                m4684(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public int mo4615(int i, C2531 c2531, C2525 c2525) {
        if (this.f7167 == 0) {
            return 0;
        }
        return m4685(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PointF mo4670(int i) {
        if (m4997() == 0) {
            return null;
        }
        int i2 = (i < AbstractC2519.m4983(m4998(0))) != this.f7162 ? -1 : 1;
        return this.f7167 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo4671(int i, int i2, C2525 c2525, C0920 c0920) {
        if (this.f7167 != 0) {
            i = i2;
        }
        if (m4997() == 0 || i == 0) {
            return;
        }
        m4649();
        m4682(i > 0 ? 1 : -1, Math.abs(i), true, c2525);
        mo4609(c2525, this.f7166, c0920);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo4616(C2525 c2525) {
        return m4660(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo4617(C2525 c2525) {
        return m4657(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo4672(int i, C0920 c0920) {
        boolean z;
        int i2;
        SavedState savedState = this.f7156;
        if (savedState == null || (i2 = savedState.f7170) < 0) {
            m4686();
            z = this.f7162;
            i2 = this.f7161;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f7169;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f7153 && i2 >= 0 && i2 < i; i4++) {
            c0920.m1828(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int mo4673(C2525 c2525) {
        return m4659(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo4674(String str) {
        if (this.f7156 == null) {
            super.mo4674(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo4675() {
        return this.f7167 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean mo4676() {
        return this.f7167 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void mo4677(AccessibilityEvent accessibilityEvent) {
        super.mo4677(accessibilityEvent);
        if (m4997() > 0) {
            accessibilityEvent.setFromIndex(m4646());
            accessibilityEvent.setToIndex(m4647());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public View mo4619(View view, int i, C2531 c2531, C2525 c2525) {
        int iM4658;
        m4686();
        if (m4997() != 0 && (iM4658 = m4658(i)) != Integer.MIN_VALUE) {
            m4649();
            m4682(iM4658, (int) (this.f7165.mo4846() * 0.33333334f), false, c2525);
            C2469 c2469 = this.f7166;
            c2469.f7365 = Integer.MIN_VALUE;
            c2469.f7363 = false;
            m4648(c2531, c2469, c2525, true);
            boolean z = this.f7162;
            View viewM4664 = iM4658 == -1 ? z ? m4664(m4997() - 1, -1) : m4664(0, m4997()) : z ? m4664(0, m4997()) : m4664(m4997() - 1, -1);
            View viewM4652 = iM4658 == -1 ? m4652() : m4662();
            if (!viewM4652.hasFocusable()) {
                return viewM4664;
            }
            if (viewM4664 != null) {
                return viewM4652;
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
    public void mo4620(androidx.recyclerview.widget.C2531 r18, androidx.recyclerview.widget.C2525 r19) {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4620(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo4679(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7156 = savedState;
            if (this.f7161 != -1) {
                savedState.f7170 = -1;
            }
            m5001();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo4622(C2525 c2525) {
        this.f7156 = null;
        this.f7161 = -1;
        this.f7160 = Integer.MIN_VALUE;
        this.f7157.m4875();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo4628(C2531 c2531, C2525 c2525, C7607 c7607) {
        super.mo4628(c2531, c2525, c7607);
        AbstractC2450 abstractC2450 = this.f7592.f7194;
        if (abstractC2450 == null || abstractC2450.mo4794() <= 0) {
            return;
        }
        c7607.m12834(C7610.f20641);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo4680() {
        return this.f7163;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean mo4681() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public final void m4682(int i, int i2, boolean z, C2525 c2525) {
        int iMo4845;
        this.f7166.f7367 = this.f7165.mo4847() == 0 && this.f7165.mo4835() == 0;
        this.f7166.f7358 = i;
        int[] iArr = this.f7155;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4656(c2525, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C2469 c2469 = this.f7166;
        int i3 = z2 ? iMax2 : iMax;
        c2469.f7364 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2469.f7368 = iMax;
        if (z2) {
            c2469.f7364 = this.f7165.mo4843() + i3;
            View viewM4662 = m4662();
            C2469 c24692 = this.f7166;
            c24692.f7359 = this.f7162 ? -1 : 1;
            int iM4983 = AbstractC2519.m4983(viewM4662);
            C2469 c24693 = this.f7166;
            c24692.f7360 = iM4983 + c24693.f7359;
            c24693.f7362 = this.f7165.mo4839(viewM4662);
            iMo4845 = this.f7165.mo4839(viewM4662) - this.f7165.mo4844();
        } else {
            View viewM4652 = m4652();
            C2469 c24694 = this.f7166;
            c24694.f7364 = this.f7165.mo4845() + c24694.f7364;
            C2469 c24695 = this.f7166;
            c24695.f7359 = this.f7162 ? 1 : -1;
            int iM49832 = AbstractC2519.m4983(viewM4652);
            C2469 c24696 = this.f7166;
            c24695.f7360 = iM49832 + c24696.f7359;
            c24696.f7362 = this.f7165.mo4836(viewM4652);
            iMo4845 = (-this.f7165.mo4836(viewM4652)) + this.f7165.mo4845();
        }
        C2469 c24697 = this.f7166;
        c24697.f7361 = i2;
        if (z) {
            c24697.f7361 = i2 - iMo4845;
        }
        c24697.f7365 = iMo4845;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public void mo4629(boolean z) {
        mo4674(null);
        if (this.f7159 == z) {
            return;
        }
        this.f7159 = z;
        m5001();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m4683(int i) {
        if (i != 0 && i != 1) {
            C5925.m11310(AbstractC6183.m11588(i, "invalid orientation:"));
            return;
        }
        mo4674(null);
        if (i != this.f7167 || this.f7165 == null) {
            AbstractC2457 abstractC2457M4849 = AbstractC2457.m4849(this, i);
            this.f7165 = abstractC2457M4849;
            this.f7157.f7378 = abstractC2457M4849;
            this.f7167 = i;
            m5001();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m4684(int i, int i2) {
        this.f7161 = i;
        this.f7160 = i2;
        SavedState savedState = this.f7156;
        if (savedState != null) {
            savedState.f7170 = -1;
        }
        m5001();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final int m4685(int i, C2531 c2531, C2525 c2525) {
        if (m4997() != 0 && i != 0) {
            m4649();
            this.f7166.f7363 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m4682(i2, iAbs, true, c2525);
            C2469 c2469 = this.f7166;
            int iM4648 = m4648(c2531, c2469, c2525, false) + c2469.f7365;
            if (iM4648 >= 0) {
                if (iAbs > iM4648) {
                    i = i2 * iM4648;
                }
                this.f7165.mo4842(-i);
                this.f7166.f7369 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m4686() {
        if (this.f7167 == 1 || !m4653()) {
            this.f7162 = this.f7163;
        } else {
            this.f7162 = !this.f7163;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final void m4687(int i, int i2) {
        this.f7166.f7361 = i2 - this.f7165.mo4845();
        C2469 c2469 = this.f7166;
        c2469.f7360 = i;
        c2469.f7359 = this.f7162 ? 1 : -1;
        c2469.f7358 = -1;
        c2469.f7362 = i2;
        c2469.f7365 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final void m4688(int i, int i2) {
        this.f7166.f7361 = this.f7165.mo4844() - i2;
        C2469 c2469 = this.f7166;
        c2469.f7359 = this.f7162 ? -1 : 1;
        c2469.f7360 = i;
        c2469.f7358 = 1;
        c2469.f7362 = i2;
        c2469.f7365 = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo4678(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.f7167 = 1;
        this.f7163 = false;
        this.f7162 = false;
        this.f7159 = false;
        this.f7158 = true;
        this.f7161 = -1;
        this.f7160 = Integer.MIN_VALUE;
        this.f7156 = null;
        this.f7157 = new C2471();
        this.f7154 = new C2470();
        this.f7153 = 2;
        this.f7155 = new int[2];
        m4683(i);
        mo4674(null);
        if (this.f7163) {
            this.f7163 = false;
            m5001();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public void mo4608(C2531 c2531, C2525 c2525, C2471 c2471, int i) {
    }
}
