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
import androidx.compose.foundation.text.selection.C1758;
import java.util.ArrayList;
import java.util.List;
import p025.AbstractC7012;
import p171.C8436;
import p171.C8439;
import p332.C9496;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC3352 implements InterfaceC3295, InterfaceC3355 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7498;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C3303 f7499;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int[] f7500;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public SavedState f7501;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C3304 f7502;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f7503;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f7504;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f7505;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f7506;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7507;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f7508;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7509;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractC3290 f7510;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C3302 f7511;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7512;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3301();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7513;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f7514;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7515;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7515);
            parcel.writeInt(this.f7513);
            parcel.writeInt(this.f7514 ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7512 = 1;
        this.f7508 = false;
        this.f7507 = false;
        this.f7504 = false;
        this.f7503 = true;
        this.f7506 = -1;
        this.f7505 = Integer.MIN_VALUE;
        this.f7501 = null;
        this.f7502 = new C3304();
        this.f7499 = new C3303();
        this.f7498 = 2;
        this.f7500 = new int[2];
        C3353 c3353M5542 = AbstractC3352.m5542(context, attributeSet, i, i2);
        m5243(c3353M5542.f7943);
        boolean z = c3353M5542.f7941;
        mo5234(null);
        if (z != this.f7508) {
            this.f7508 = z;
            m5561();
        }
        mo5189(c3353M5542.f7940);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public C3351 mo5161() {
        return new C3351(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final View mo5204(int i) {
        int iM5557 = m5557();
        if (iM5557 == 0) {
            return null;
        }
        int iM5543 = i - AbstractC3352.m5543(m5558(0));
        if (iM5543 >= 0 && iM5543 < iM5557) {
            View viewM5558 = m5558(iM5543);
            if (AbstractC3352.m5543(viewM5558) == i) {
                return viewM5558;
            }
        }
        return super.mo5204(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo5162(C3358 c3358) {
        return m5217(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public int mo5163(C3358 c3358) {
        return m5220(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int mo5205(C3358 c3358) {
        return m5219(c3358);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m5206() {
        View viewM5225 = m5225(0, m5557(), false);
        if (viewM5225 == null) {
            return -1;
        }
        return AbstractC3352.m5543(viewM5225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m5207() {
        View viewM5225 = m5225(m5557() - 1, -1, false);
        if (viewM5225 == null) {
            return -1;
        }
        return AbstractC3352.m5543(viewM5225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m5208(C3364 c3364, C3302 c3302, C3358 c3358, boolean z) {
        int i;
        int i2 = c3302.f7706;
        int i3 = c3302.f7710;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c3302.f7710 = i3 + i2;
            }
            m5215(c3364, c3302);
        }
        int i4 = c3302.f7706 + c3302.f7709;
        while (true) {
            if ((!c3302.f7712 && i4 <= 0) || (i = c3302.f7705) < 0 || i >= c3358.m5585()) {
                break;
            }
            C3303 c3303 = this.f7499;
            c3303.f7718 = 0;
            c3303.f7717 = false;
            c3303.f7716 = false;
            c3303.f7715 = false;
            mo5167(c3364, c3358, c3302, c3303);
            if (!c3303.f7717) {
                int i5 = c3302.f7707;
                int i6 = c3303.f7718;
                c3302.f7707 = (c3302.f7703 * i6) + i5;
                if (!c3303.f7716 || c3302.f7711 != null || !c3358.f7962) {
                    c3302.f7706 -= i6;
                    i4 -= i6;
                }
                int i7 = c3302.f7710;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c3302.f7710 = i8;
                    int i9 = c3302.f7706;
                    if (i9 < 0) {
                        c3302.f7710 = i8 + i9;
                    }
                    m5215(c3364, c3302);
                }
                if (z && c3303.f7715) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c3302.f7706;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m5209() {
        if (this.f7511 == null) {
            C3302 c3302 = new C3302();
            c3302.f7708 = true;
            c3302.f7709 = 0;
            c3302.f7713 = 0;
            c3302.f7711 = null;
            this.f7511 = c3302;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m5210(boolean z) {
        return this.f7507 ? m5225(m5557() - 1, -1, z) : m5225(0, m5557(), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final View m5211(boolean z) {
        return this.f7507 ? m5225(0, m5557(), z) : m5225(m5557() - 1, -1, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public void mo5167(C3364 c3364, C3358 c3358, C3302 c3302, C3303 c3303) {
        int i;
        int iMo5397;
        int i2;
        int iMo53972;
        View viewM5433 = c3302.m5433(c3364);
        if (viewM5433 == null) {
            c3303.f7717 = true;
            return;
        }
        C3351 c3351 = (C3351) viewM5433.getLayoutParams();
        List list = c3302.f7711;
        boolean z = this.f7507;
        int i3 = c3302.f7703;
        if (list == null) {
            if (z == (i3 == -1)) {
                m5575(viewM5433);
            } else {
                m5573(viewM5433, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m5573(viewM5433, -1, true);
            } else {
                m5573(viewM5433, 0, true);
            }
        }
        mo5579(viewM5433);
        c3303.f7718 = this.f7510.mo5398(viewM5433);
        if (this.f7512 == 1) {
            if (m5213()) {
                iMo53972 = this.f7926 - getPaddingRight();
                iMo5397 = iMo53972 - this.f7510.mo5397(viewM5433);
            } else {
                int paddingLeft = getPaddingLeft();
                iMo53972 = this.f7510.mo5397(viewM5433) + paddingLeft;
                iMo5397 = paddingLeft;
            }
            int i4 = c3302.f7703;
            i2 = c3302.f7707;
            int i5 = c3303.f7718;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo53973 = this.f7510.mo5397(viewM5433) + paddingTop;
            int i7 = c3302.f7703;
            int i8 = c3302.f7707;
            int i9 = c3303.f7718;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iMo53972 = i8;
                i2 = paddingTop;
                i = iMo53973;
                iMo5397 = i10;
            } else {
                int i11 = i8 + i9;
                i = iMo53973;
                iMo5397 = i8;
                i2 = paddingTop;
                iMo53972 = i11;
            }
        }
        AbstractC3352.m5552(viewM5433, iMo5397, i2, iMo53972, i);
        if (c3351.f7924.isRemoved() || c3351.f7924.isUpdated()) {
            c3303.f7716 = true;
        }
        c3303.f7715 = viewM5433.hasFocusable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final View m5212() {
        return m5558(this.f7507 ? m5557() - 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final boolean m5213() {
        return this.f7937.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m5214(C3364 c3364, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM5558 = m5558(i);
                if (m5558(i) != null) {
                    this.f7939.m5506(i);
                }
                c3364.m5601(viewM5558);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM55582 = m5558(i3);
            if (m5558(i3) != null) {
                this.f7939.m5506(i3);
            }
            c3364.m5601(viewM55582);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final void m5215(C3364 c3364, C3302 c3302) {
        if (!c3302.f7708 || c3302.f7712) {
            return;
        }
        int i = c3302.f7710;
        int i2 = c3302.f7713;
        if (c3302.f7703 == -1) {
            int iM5557 = m5557();
            if (i < 0) {
                return;
            }
            int iMo5395 = (this.f7510.mo5395() - i) + i2;
            if (this.f7507) {
                for (int i3 = 0; i3 < iM5557; i3++) {
                    View viewM5558 = m5558(i3);
                    if (this.f7510.mo5396(viewM5558) < iMo5395 || this.f7510.mo5401(viewM5558) < iMo5395) {
                        m5214(c3364, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM5557 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM55582 = m5558(i5);
                if (this.f7510.mo5396(viewM55582) < iMo5395 || this.f7510.mo5401(viewM55582) < iMo5395) {
                    m5214(c3364, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM55572 = m5557();
        if (!this.f7507) {
            for (int i7 = 0; i7 < iM55572; i7++) {
                View viewM55583 = m5558(i7);
                if (this.f7510.mo5399(viewM55583) > i6 || this.f7510.mo5400(viewM55583) > i6) {
                    m5214(c3364, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM55572 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM55584 = m5558(i9);
            if (this.f7510.mo5399(viewM55584) > i6 || this.f7510.mo5400(viewM55584) > i6) {
                m5214(c3364, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public void mo5169(C3358 c3358, C3302 c3302, C1758 c1758) {
        int i = c3302.f7705;
        if (i < 0 || i >= c3358.m5585()) {
            return;
        }
        c1758.m2388(i, Math.max(0, c3302.f7710));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public void mo5216(C3358 c3358, int[] iArr) {
        int i;
        int iMo5406 = c3358.f7958 != -1 ? this.f7510.mo5406() : 0;
        if (this.f7511.f7703 == -1) {
            i = 0;
        } else {
            i = iMo5406;
            iMo5406 = 0;
        }
        iArr[0] = iMo5406;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m5217(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        m5209();
        AbstractC3290 abstractC3290 = this.f7510;
        boolean z = !this.f7503;
        return C9496.m14945(c3358, abstractC3290, m5210(z), m5211(z), this, this.f7503);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final int m5218(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f7512 == 1) ? 1 : Integer.MIN_VALUE : this.f7512 == 0 ? 1 : Integer.MIN_VALUE : this.f7512 == 1 ? -1 : Integer.MIN_VALUE : this.f7512 == 0 ? -1 : Integer.MIN_VALUE : (this.f7512 != 1 && m5213()) ? -1 : 1 : (this.f7512 != 1 && m5213()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m5219(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        m5209();
        AbstractC3290 abstractC3290 = this.f7510;
        boolean z = !this.f7503;
        return C9496.m14928(c3358, abstractC3290, m5210(z), m5211(z), this, this.f7503);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final int m5220(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        m5209();
        AbstractC3290 abstractC3290 = this.f7510;
        boolean z = !this.f7503;
        return C9496.m14946(c3358, abstractC3290, m5210(z), m5211(z), this, this.f7503, this.f7507);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final int m5221(int i, C3364 c3364, C3358 c3358, boolean z) {
        int iMo5404;
        int iMo54042 = this.f7510.mo5404() - i;
        if (iMo54042 <= 0) {
            return 0;
        }
        int i2 = -m5245(-iMo54042, c3364, c3358);
        int i3 = i + i2;
        if (!z || (iMo5404 = this.f7510.mo5404() - i3) <= 0) {
            return i2;
        }
        this.f7510.mo5402(iMo5404);
        return iMo5404 + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo5170(C3364 c3364, C3358 c3358, boolean z, boolean z2) {
        int i;
        int iM5557;
        int i2;
        m5209();
        int iM55572 = m5557();
        if (z2) {
            iM5557 = m5557() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM55572;
            iM5557 = 0;
            i2 = 1;
        }
        int iM5585 = c3358.m5585();
        int iMo5405 = this.f7510.mo5405();
        int iMo5404 = this.f7510.mo5404();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM5557 != i) {
            View viewM5558 = m5558(iM5557);
            int iM5543 = AbstractC3352.m5543(viewM5558);
            int iMo5396 = this.f7510.mo5396(viewM5558);
            int iMo5399 = this.f7510.mo5399(viewM5558);
            if (iM5543 >= 0 && iM5543 < iM5585) {
                if (!((C3351) viewM5558.getLayoutParams()).f7924.isRemoved()) {
                    boolean z3 = iMo5399 <= iMo5405 && iMo5396 < iMo5405;
                    boolean z4 = iMo5396 >= iMo5404 && iMo5399 > iMo5404;
                    if (!z3 && !z4) {
                        return viewM5558;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM5558;
                        } else if (view == null) {
                            view = viewM5558;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM5558;
                }
            }
            iM5557 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final View m5222() {
        return m5558(this.f7507 ? 0 : m5557() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final int m5223(int i, C3364 c3364, C3358 c3358, boolean z) {
        int iMo5405;
        int iMo54052 = i - this.f7510.mo5405();
        if (iMo54052 <= 0) {
            return 0;
        }
        int i2 = -m5245(iMo54052, c3364, c3358);
        int i3 = i + i2;
        if (!z || (iMo5405 = i3 - this.f7510.mo5405()) <= 0) {
            return i2;
        }
        this.f7510.mo5402(-iMo5405);
        return i2 - iMo5405;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final View m5224(int i, int i2) {
        int i3;
        int i4;
        m5209();
        if (i2 <= i && i2 >= i) {
            return m5558(i);
        }
        if (this.f7510.mo5396(m5558(i)) < this.f7510.mo5405()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = DexMap.TYPE_TYPE_LIST;
        }
        return this.f7512 == 0 ? this.f7938.m5475(i, i2, i3, i4) : this.f7932.m5475(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final View m5225(int i, int i2, boolean z) {
        m5209();
        int i3 = z ? 24579 : 320;
        return this.f7512 == 0 ? this.f7938.m5475(i, i2, i3, 320) : this.f7932.m5475(i, i2, i3, 320);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public int mo5171(int i, C3364 c3364, C3358 c3358) {
        if (this.f7512 == 1) {
            return 0;
        }
        return m5245(i, c3364, c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo5226(int i) {
        this.f7506 = i;
        this.f7505 = Integer.MIN_VALUE;
        SavedState savedState = this.f7501;
        if (savedState != null) {
            savedState.f7515 = -1;
        }
        m5561();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public void mo5227(RecyclerView recyclerView, int i) {
        C3292 c3292 = new C3292(recyclerView.getContext());
        c3292.f7662 = i;
        m5565(c3292);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final boolean mo5228() {
        if (this.f7927 != 1073741824 && this.f7928 != 1073741824) {
            int iM5557 = m5557();
            for (int i = 0; i < iM5557; i++) {
                ViewGroup.LayoutParams layoutParams = m5558(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public boolean mo5172() {
        return this.f7501 == null && this.f7509 == this.f7504;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final Parcelable mo5229() {
        SavedState savedState = this.f7501;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7515 = savedState.f7515;
            savedState2.f7513 = savedState.f7513;
            savedState2.f7514 = savedState.f7514;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m5557() <= 0) {
            savedState3.f7515 = -1;
            return savedState3;
        }
        m5209();
        boolean z = this.f7509 ^ this.f7507;
        savedState3.f7514 = z;
        if (z) {
            View viewM5222 = m5222();
            savedState3.f7513 = this.f7510.mo5404() - this.f7510.mo5399(viewM5222);
            savedState3.f7515 = AbstractC3352.m5543(viewM5222);
            return savedState3;
        }
        View viewM5212 = m5212();
        savedState3.f7515 = AbstractC3352.m5543(viewM5212);
        savedState3.f7513 = this.f7510.mo5396(viewM5212) - this.f7510.mo5405();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public boolean mo5173(int i, Bundle bundle) {
        int iMin;
        if (super.mo5173(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f7512 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f7937;
                iMin = Math.min(i2, mo5160(recyclerView.f7576, recyclerView.f7586) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f7937;
                iMin = Math.min(i3, mo5164(recyclerView2.f7576, recyclerView2.f7586) - 1);
            }
            if (iMin >= 0) {
                m5244(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public int mo5175(int i, C3364 c3364, C3358 c3358) {
        if (this.f7512 == 0) {
            return 0;
        }
        return m5245(i, c3364, c3358);
    }

    @Override // androidx.recyclerview.widget.InterfaceC3355
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PointF mo5230(int i) {
        if (m5557() == 0) {
            return null;
        }
        int i2 = (i < AbstractC3352.m5543(m5558(0))) != this.f7507 ? -1 : 1;
        return this.f7512 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo5231(int i, int i2, C3358 c3358, C1758 c1758) {
        if (this.f7512 != 0) {
            i = i2;
        }
        if (m5557() == 0 || i == 0) {
            return;
        }
        m5209();
        m5242(i > 0 ? 1 : -1, Math.abs(i), true, c3358);
        mo5169(c3358, this.f7511, c1758);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo5176(C3358 c3358) {
        return m5220(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo5177(C3358 c3358) {
        return m5217(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo5232(int i, C1758 c1758) {
        boolean z;
        int i2;
        SavedState savedState = this.f7501;
        if (savedState == null || (i2 = savedState.f7515) < 0) {
            m5246();
            z = this.f7507;
            i2 = this.f7506;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f7514;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f7498 && i2 >= 0 && i2 < i; i4++) {
            c1758.m2388(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int mo5233(C3358 c3358) {
        return m5219(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo5234(String str) {
        if (this.f7501 == null) {
            super.mo5234(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo5235() {
        return this.f7512 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean mo5236() {
        return this.f7512 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void mo5237(AccessibilityEvent accessibilityEvent) {
        super.mo5237(accessibilityEvent);
        if (m5557() > 0) {
            accessibilityEvent.setFromIndex(m5206());
            accessibilityEvent.setToIndex(m5207());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public View mo5179(View view, int i, C3364 c3364, C3358 c3358) {
        int iM5218;
        m5246();
        if (m5557() != 0 && (iM5218 = m5218(i)) != Integer.MIN_VALUE) {
            m5209();
            m5242(iM5218, (int) (this.f7510.mo5406() * 0.33333334f), false, c3358);
            C3302 c3302 = this.f7511;
            c3302.f7710 = Integer.MIN_VALUE;
            c3302.f7708 = false;
            m5208(c3364, c3302, c3358, true);
            boolean z = this.f7507;
            View viewM5224 = iM5218 == -1 ? z ? m5224(m5557() - 1, -1) : m5224(0, m5557()) : z ? m5224(0, m5557()) : m5224(m5557() - 1, -1);
            View viewM5212 = iM5218 == -1 ? m5212() : m5222();
            if (!viewM5212.hasFocusable()) {
                return viewM5224;
            }
            if (viewM5224 != null) {
                return viewM5212;
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
    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5180(C3364 c3364, C3358 c3358) {
        View focusedChild;
        View focusedChild2;
        View viewMo5170;
        int i;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int iM5221;
        int i6;
        View viewMo5204;
        int iMo5396;
        int iMo5404;
        int i7;
        int i8 = -1;
        if (!(this.f7501 == null && this.f7506 == -1) && c3358.m5585() == 0) {
            m5567(c3364);
            return;
        }
        SavedState savedState = this.f7501;
        if (savedState != null && (i7 = savedState.f7515) >= 0) {
            this.f7506 = i7;
        }
        m5209();
        boolean z = false;
        this.f7511.f7708 = false;
        m5246();
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f7939.f7814).contains(focusedChild)) {
            focusedChild = null;
        }
        C3304 c3304 = this.f7502;
        if (!c3304.f7719 || this.f7506 != -1 || this.f7501 != null) {
            c3304.m5435();
            c3304.f7720 = this.f7507 ^ this.f7504;
            if (c3358.f7962 || (i = this.f7506) == -1) {
                if (m5557() != 0) {
                    RecyclerView recyclerView2 = this.f7937;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f7939.f7814).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        C3351 c3351 = (C3351) focusedChild2.getLayoutParams();
                        if (c3351.f7924.isRemoved() || c3351.f7924.getLayoutPosition() < 0 || c3351.f7924.getLayoutPosition() >= c3358.m5585()) {
                            boolean z2 = this.f7509;
                            boolean z3 = this.f7504;
                            if (z2 == z3 && (viewMo5170 = mo5170(c3364, c3358, c3304.f7720, z3)) != null) {
                                int iM5543 = AbstractC3352.m5543(viewMo5170);
                                boolean z4 = c3304.f7720;
                                AbstractC3290 abstractC3290 = c3304.f7723;
                                if (z4) {
                                    c3304.f7721 = c3304.f7723.m5410() + abstractC3290.mo5399(viewMo5170);
                                } else {
                                    c3304.f7721 = abstractC3290.mo5396(viewMo5170);
                                }
                                c3304.f7722 = iM5543;
                                if (!c3358.f7962 && mo5172()) {
                                    int iMo53962 = this.f7510.mo5396(viewMo5170);
                                    int iMo5399 = this.f7510.mo5399(viewMo5170);
                                    int iMo5405 = this.f7510.mo5405();
                                    int iMo54042 = this.f7510.mo5404();
                                    boolean z5 = iMo5399 <= iMo5405 && iMo53962 < iMo5405;
                                    boolean z6 = iMo53962 >= iMo54042 && iMo5399 > iMo54042;
                                    if (z5 || z6) {
                                        if (c3304.f7720) {
                                            iMo5405 = iMo54042;
                                        }
                                        c3304.f7721 = iMo5405;
                                    }
                                }
                            } else {
                                c3304.m5437();
                                c3304.f7722 = this.f7504 ? c3358.m5585() - 1 : 0;
                            }
                        } else {
                            c3304.m5436(focusedChild2, AbstractC3352.m5543(focusedChild2));
                        }
                        c3304.f7719 = true;
                    }
                }
            } else if (i < 0 || i >= c3358.m5585()) {
                this.f7506 = -1;
                this.f7505 = Integer.MIN_VALUE;
                if (m5557() != 0) {
                }
            } else {
                int i9 = this.f7506;
                c3304.f7722 = i9;
                SavedState savedState2 = this.f7501;
                if (savedState2 != null && savedState2.f7515 >= 0) {
                    boolean z7 = savedState2.f7514;
                    c3304.f7720 = z7;
                    AbstractC3290 abstractC32902 = this.f7510;
                    if (z7) {
                        c3304.f7721 = abstractC32902.mo5404() - this.f7501.f7513;
                    } else {
                        c3304.f7721 = abstractC32902.mo5405() + this.f7501.f7513;
                    }
                } else if (this.f7505 == Integer.MIN_VALUE) {
                    View viewMo52042 = mo5204(i9);
                    if (viewMo52042 == null) {
                        if (m5557() > 0) {
                            c3304.f7720 = (this.f7506 < AbstractC3352.m5543(m5558(0))) == this.f7507;
                        }
                        c3304.m5437();
                    } else if (this.f7510.mo5398(viewMo52042) > this.f7510.mo5406()) {
                        c3304.m5437();
                    } else {
                        int iMo53963 = this.f7510.mo5396(viewMo52042) - this.f7510.mo5405();
                        AbstractC3290 abstractC32903 = this.f7510;
                        if (iMo53963 < 0) {
                            c3304.f7721 = abstractC32903.mo5405();
                            c3304.f7720 = false;
                        } else if (abstractC32903.mo5404() - this.f7510.mo5399(viewMo52042) < 0) {
                            c3304.f7721 = this.f7510.mo5404();
                            c3304.f7720 = true;
                        } else {
                            boolean z8 = c3304.f7720;
                            AbstractC3290 abstractC32904 = this.f7510;
                            c3304.f7721 = z8 ? this.f7510.m5410() + abstractC32904.mo5399(viewMo52042) : abstractC32904.mo5396(viewMo52042);
                        }
                    }
                } else {
                    boolean z9 = this.f7507;
                    c3304.f7720 = z9;
                    AbstractC3290 abstractC32905 = this.f7510;
                    if (z9) {
                        c3304.f7721 = abstractC32905.mo5404() - this.f7505;
                    } else {
                        c3304.f7721 = abstractC32905.mo5405() + this.f7505;
                    }
                }
                c3304.f7719 = true;
            }
        } else if (focusedChild != null && (this.f7510.mo5396(focusedChild) >= this.f7510.mo5404() || this.f7510.mo5399(focusedChild) <= this.f7510.mo5405())) {
            c3304.m5436(focusedChild, AbstractC3352.m5543(focusedChild));
        }
        C3302 c3302 = this.f7511;
        c3302.f7703 = c3302.f7714 >= 0 ? 1 : -1;
        int[] iArr = this.f7500;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5216(c3358, iArr);
        int iMo54052 = this.f7510.mo5405() + Math.max(0, iArr[0]);
        int iMo5403 = this.f7510.mo5403() + Math.max(0, iArr[1]);
        if (c3358.f7962 && (i6 = this.f7506) != -1 && this.f7505 != Integer.MIN_VALUE && (viewMo5204 = mo5204(i6)) != null) {
            boolean z10 = this.f7507;
            AbstractC3290 abstractC32906 = this.f7510;
            if (z10) {
                iMo5404 = abstractC32906.mo5404() - this.f7510.mo5399(viewMo5204);
                iMo5396 = this.f7505;
            } else {
                iMo5396 = abstractC32906.mo5396(viewMo5204) - this.f7510.mo5405();
                iMo5404 = this.f7505;
            }
            int i10 = iMo5404 - iMo5396;
            if (i10 > 0) {
                iMo54052 += i10;
            } else {
                iMo5403 -= i10;
            }
        }
        boolean z11 = c3304.f7720;
        boolean z12 = this.f7507;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        mo5168(c3364, c3358, c3304, i8);
        m5556(c3364);
        this.f7511.f7712 = this.f7510.mo5407() == 0 && this.f7510.mo5395() == 0;
        this.f7511.getClass();
        this.f7511.f7713 = 0;
        boolean z13 = c3304.f7720;
        int i11 = c3304.f7722;
        if (z13) {
            m5247(i11, c3304.f7721);
            C3302 c33022 = this.f7511;
            c33022.f7709 = iMo54052;
            m5208(c3364, c33022, c3358, false);
            C3302 c33023 = this.f7511;
            i3 = c33023.f7707;
            int i12 = c33023.f7705;
            int i13 = c33023.f7706;
            if (i13 > 0) {
                iMo5403 += i13;
            }
            m5248(c3304.f7722, c3304.f7721);
            C3302 c33024 = this.f7511;
            c33024.f7709 = iMo5403;
            c33024.f7705 += c33024.f7704;
            m5208(c3364, c33024, c3358, false);
            C3302 c33025 = this.f7511;
            i2 = c33025.f7707;
            int i14 = c33025.f7706;
            if (i14 > 0) {
                m5247(i12, i3);
                C3302 c33026 = this.f7511;
                c33026.f7709 = i14;
                m5208(c3364, c33026, c3358, false);
                i3 = this.f7511.f7707;
            }
        } else {
            m5248(i11, c3304.f7721);
            C3302 c33027 = this.f7511;
            c33027.f7709 = iMo5403;
            m5208(c3364, c33027, c3358, false);
            C3302 c33028 = this.f7511;
            i2 = c33028.f7707;
            int i15 = c33028.f7705;
            int i16 = c33028.f7706;
            if (i16 > 0) {
                iMo54052 += i16;
            }
            m5247(c3304.f7722, c3304.f7721);
            C3302 c33029 = this.f7511;
            c33029.f7709 = iMo54052;
            c33029.f7705 += c33029.f7704;
            m5208(c3364, c33029, c3358, false);
            C3302 c330210 = this.f7511;
            int i17 = c330210.f7707;
            int i18 = c330210.f7706;
            if (i18 > 0) {
                m5248(i15, i2);
                C3302 c330211 = this.f7511;
                c330211.f7709 = i18;
                m5208(c3364, c330211, c3358, false);
                i2 = this.f7511.f7707;
            }
            i3 = i17;
        }
        if (m5557() > 0) {
            if (this.f7507 ^ this.f7504) {
                int iM52212 = m5221(i2, c3364, c3358, true);
                i4 = i3 + iM52212;
                i5 = i2 + iM52212;
                iM5221 = m5223(i4, c3364, c3358, false);
            } else {
                int iM5223 = m5223(i3, c3364, c3358, true);
                i4 = i3 + iM5223;
                i5 = i2 + iM5223;
                iM5221 = m5221(i5, c3364, c3358, false);
            }
            i3 = i4 + iM5221;
            i2 = i5 + iM5221;
        }
        if (c3358.f7963 && m5557() != 0 && !c3358.f7962 && mo5172()) {
            List list2 = c3364.f7977;
            int size = list2.size();
            int iM55432 = AbstractC3352.m5543(m5558(0));
            int i19 = 0;
            int iMo5398 = 0;
            int iMo53982 = 0;
            while (i19 < size) {
                AbstractC3317 abstractC3317 = (AbstractC3317) list2.get(i19);
                if (!abstractC3317.isRemoved()) {
                    boolean z14 = abstractC3317.getLayoutPosition() < iM55432 ? true : z;
                    boolean z15 = this.f7507;
                    AbstractC3290 abstractC32907 = this.f7510;
                    View view = abstractC3317.itemView;
                    if (z14 != z15) {
                        iMo5398 += abstractC32907.mo5398(view);
                    } else {
                        iMo53982 += abstractC32907.mo5398(view);
                    }
                }
                i19++;
                z = false;
            }
            this.f7511.f7711 = list2;
            if (iMo5398 > 0) {
                m5247(AbstractC3352.m5543(m5212()), i3);
                C3302 c330212 = this.f7511;
                c330212.f7709 = iMo5398;
                r4 = 0;
                c330212.f7706 = 0;
                c330212.m5434(null);
                m5208(c3364, this.f7511, c3358, false);
            } else {
                r4 = 0;
            }
            if (iMo53982 > 0) {
                m5248(AbstractC3352.m5543(m5222()), i2);
                C3302 c330213 = this.f7511;
                c330213.f7709 = iMo53982;
                c330213.f7706 = r4;
                list = null;
                c330213.m5434(null);
                m5208(c3364, this.f7511, c3358, r4);
            } else {
                list = null;
            }
            this.f7511.f7711 = list;
        }
        if (c3358.f7962) {
            c3304.m5435();
        } else {
            AbstractC3290 abstractC32908 = this.f7510;
            abstractC32908.f7655 = abstractC32908.mo5406();
        }
        this.f7509 = this.f7504;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo5239(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7501 = savedState;
            if (this.f7506 != -1) {
                savedState.f7515 = -1;
            }
            m5561();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo5182(C3358 c3358) {
        this.f7501 = null;
        this.f7506 = -1;
        this.f7505 = Integer.MIN_VALUE;
        this.f7502.m5435();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo5188(C3364 c3364, C3358 c3358, C8436 c8436) {
        super.mo5188(c3364, c3358, c8436);
        AbstractC3283 abstractC3283 = this.f7937.f7539;
        if (abstractC3283 == null || abstractC3283.mo5354() <= 0) {
            return;
        }
        c8436.m13393(C8439.f20986);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo5240() {
        return this.f7508;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean mo5241() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public final void m5242(int i, int i2, boolean z, C3358 c3358) {
        int iMo5405;
        this.f7511.f7712 = this.f7510.mo5407() == 0 && this.f7510.mo5395() == 0;
        this.f7511.f7703 = i;
        int[] iArr = this.f7500;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5216(c3358, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C3302 c3302 = this.f7511;
        int i3 = z2 ? iMax2 : iMax;
        c3302.f7709 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c3302.f7713 = iMax;
        if (z2) {
            c3302.f7709 = this.f7510.mo5403() + i3;
            View viewM5222 = m5222();
            C3302 c33022 = this.f7511;
            c33022.f7704 = this.f7507 ? -1 : 1;
            int iM5543 = AbstractC3352.m5543(viewM5222);
            C3302 c33023 = this.f7511;
            c33022.f7705 = iM5543 + c33023.f7704;
            c33023.f7707 = this.f7510.mo5399(viewM5222);
            iMo5405 = this.f7510.mo5399(viewM5222) - this.f7510.mo5404();
        } else {
            View viewM5212 = m5212();
            C3302 c33024 = this.f7511;
            c33024.f7709 = this.f7510.mo5405() + c33024.f7709;
            C3302 c33025 = this.f7511;
            c33025.f7704 = this.f7507 ? 1 : -1;
            int iM55432 = AbstractC3352.m5543(viewM5212);
            C3302 c33026 = this.f7511;
            c33025.f7705 = iM55432 + c33026.f7704;
            c33026.f7707 = this.f7510.mo5396(viewM5212);
            iMo5405 = (-this.f7510.mo5396(viewM5212)) + this.f7510.mo5405();
        }
        C3302 c33027 = this.f7511;
        c33027.f7706 = i2;
        if (z) {
            c33027.f7706 = i2 - iMo5405;
        }
        c33027.f7710 = iMo5405;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public void mo5189(boolean z) {
        mo5234(null);
        if (this.f7504 == z) {
            return;
        }
        this.f7504 = z;
        m5561();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m5243(int i) {
        if (i != 0 && i != 1) {
            C6755.m11869(AbstractC7012.m12147(i, "invalid orientation:"));
            return;
        }
        mo5234(null);
        if (i != this.f7512 || this.f7510 == null) {
            AbstractC3290 abstractC3290M5409 = AbstractC3290.m5409(this, i);
            this.f7510 = abstractC3290M5409;
            this.f7502.f7723 = abstractC3290M5409;
            this.f7512 = i;
            m5561();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m5244(int i, int i2) {
        this.f7506 = i;
        this.f7505 = i2;
        SavedState savedState = this.f7501;
        if (savedState != null) {
            savedState.f7515 = -1;
        }
        m5561();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final int m5245(int i, C3364 c3364, C3358 c3358) {
        if (m5557() != 0 && i != 0) {
            m5209();
            this.f7511.f7708 = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m5242(i2, iAbs, true, c3358);
            C3302 c3302 = this.f7511;
            int iM5208 = m5208(c3364, c3302, c3358, false) + c3302.f7710;
            if (iM5208 >= 0) {
                if (iAbs > iM5208) {
                    i = i2 * iM5208;
                }
                this.f7510.mo5402(-i);
                this.f7511.f7714 = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m5246() {
        if (this.f7512 == 1 || !m5213()) {
            this.f7507 = this.f7508;
        } else {
            this.f7507 = !this.f7508;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final void m5247(int i, int i2) {
        this.f7511.f7706 = i2 - this.f7510.mo5405();
        C3302 c3302 = this.f7511;
        c3302.f7705 = i;
        c3302.f7704 = this.f7507 ? 1 : -1;
        c3302.f7703 = -1;
        c3302.f7707 = i2;
        c3302.f7710 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final void m5248(int i, int i2) {
        this.f7511.f7706 = this.f7510.mo5404() - i2;
        C3302 c3302 = this.f7511;
        c3302.f7704 = this.f7507 ? -1 : 1;
        c3302.f7705 = i;
        c3302.f7703 = 1;
        c3302.f7707 = i2;
        c3302.f7710 = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo5238(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.f7512 = 1;
        this.f7508 = false;
        this.f7507 = false;
        this.f7504 = false;
        this.f7503 = true;
        this.f7506 = -1;
        this.f7505 = Integer.MIN_VALUE;
        this.f7501 = null;
        this.f7502 = new C3304();
        this.f7499 = new C3303();
        this.f7498 = 2;
        this.f7500 = new int[2];
        m5243(i);
        mo5234(null);
        if (this.f7508) {
            this.f7508 = false;
            m5561();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public void mo5168(C3364 c3364, C3358 c3358, C3304 c3304, int i) {
    }
}
