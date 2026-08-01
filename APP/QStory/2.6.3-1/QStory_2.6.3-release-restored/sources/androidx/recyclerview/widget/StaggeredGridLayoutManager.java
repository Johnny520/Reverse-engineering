package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p025.AbstractC7012;
import p140.C8242;
import p171.C8436;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC3352 implements InterfaceC3355 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public SavedState f7603;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7604;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7605;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C3324 f7606;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7607;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7608;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7609;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f7610;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7611;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3305 f7612;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public BitSet f7613;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7614;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f7615;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int f7616;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC3290 f7617;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC3290 f7618;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C3319[] f7619;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7620;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C3307 f7621;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Rect f7622;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f7623;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final RunnableC3337 f7624;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f7625;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean f7626;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3320();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f7631;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public int f7632;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int[] f7633;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public boolean f7634;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public boolean f7635;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int[] f7636;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public ArrayList f7637;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7638;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public int f7639;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7640;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7640);
            parcel.writeInt(this.f7638);
            parcel.writeInt(this.f7639);
            if (this.f7639 > 0) {
                parcel.writeIntArray(this.f7633);
            }
            parcel.writeInt(this.f7632);
            if (this.f7632 > 0) {
                parcel.writeIntArray(this.f7636);
            }
            parcel.writeInt(this.f7634 ? 1 : 0);
            parcel.writeInt(this.f7635 ? 1 : 0);
            parcel.writeInt(this.f7631 ? 1 : 0);
            parcel.writeList(this.f7637);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7620 = -1;
        this.f7611 = false;
        this.f7614 = false;
        this.f7609 = -1;
        this.f7610 = Integer.MIN_VALUE;
        this.f7606 = new C3324();
        this.f7605 = 2;
        this.f7622 = new Rect();
        this.f7621 = new C3307(this);
        this.f7625 = false;
        this.f7626 = true;
        this.f7624 = new RunnableC3337(this, 2);
        C3353 c3353M5542 = AbstractC3352.m5542(context, attributeSet, i, i2);
        int i3 = c3353M5542.f7943;
        if (i3 != 0 && i3 != 1) {
            C6755.m11869("invalid orientation.");
            throw null;
        }
        mo5234(null);
        if (i3 != this.f7616) {
            this.f7616 = i3;
            AbstractC3290 abstractC3290 = this.f7618;
            this.f7618 = this.f7617;
            this.f7617 = abstractC3290;
            m5561();
        }
        m5350(c3353M5542.f7942);
        boolean z = c3353M5542.f7941;
        mo5234(null);
        SavedState savedState = this.f7603;
        if (savedState != null && savedState.f7634 != z) {
            savedState.f7634 = z;
        }
        this.f7611 = z;
        m5561();
        this.f7612 = new C3305();
        this.f7618 = AbstractC3290.m5409(this, this.f7616);
        this.f7617 = AbstractC3290.m5409(this, 1 - this.f7616);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public static int m5318(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final int mo5160(C3364 c3364, C3358 c3358) {
        if (this.f7616 == 0) {
            return Math.min(this.f7620, c3358.m5585());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C3351 mo5161() {
        return this.f7616 == 0 ? new C3308(-2, -1) : new C3308(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo5162(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        boolean z = !this.f7626;
        return C9496.m14945(c3358, this.f7618, m5333(z), m5336(z), this, this.f7626);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo5163(C3358 c3358) {
        return m5331(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo5205(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        boolean z = !this.f7626;
        return C9496.m14928(c3358, this.f7618, m5333(z), m5336(z), this, this.f7626);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final int mo5164(C3364 c3364, C3358 c3358) {
        if (this.f7616 == 1) {
            return Math.min(this.f7620, c3358.m5585());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final C3351 mo5165(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3308((ViewGroup.MarginLayoutParams) layoutParams) : new C3308(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C3351 mo5166(Context context, AttributeSet attributeSet) {
        return new C3308(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m5319(int i) {
        int iM5472 = this.f7619[0].m5472(i);
        for (int i2 = 1; i2 < this.f7620; i2++) {
            int iM54722 = this.f7619[i2].m5472(i);
            if (iM54722 < iM5472) {
                iM5472 = iM54722;
            }
        }
        return iM5472;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5320(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM5324 = this.f7614 ? m5324() : m5321();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                C3324 c3324 = this.f7606;
                c3324.m5489(i5);
                if (i3 != 1) {
                    c3324.m5487(i, i2);
                } else if (i3 == 2) {
                    c3324.m5481(i, i2);
                } else if (i3 == 8) {
                    c3324.m5481(i, 1);
                    c3324.m5487(i2, 1);
                }
                if (i4 > iM5324) {
                    return;
                }
                if (i5 <= (this.f7614 ? m5321() : m5324())) {
                    m5561();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        C3324 c33242 = this.f7606;
        c33242.m5489(i5);
        if (i3 != 1) {
        }
        if (i4 > iM5324) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m5321() {
        if (m5557() == 0) {
            return 0;
        }
        return AbstractC3352.m5543(m5558(0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m5322(C3364 c3364, C3358 c3358, boolean z) {
        int iMo5405;
        int iM5319 = m5319(Integer.MAX_VALUE);
        if (iM5319 != Integer.MAX_VALUE && (iMo5405 = iM5319 - this.f7618.mo5405()) > 0) {
            int iM5330 = iMo5405 - m5330(iMo5405, c3364, c3358);
            if (!z || iM5330 <= 0) {
                return;
            }
            this.f7618.mo5402(-iM5330);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final int m5323(int i) {
        int iM5467 = this.f7619[0].m5467(i);
        for (int i2 = 1; i2 < this.f7620; i2++) {
            int iM54672 = this.f7619[i2].m5467(i);
            if (iM54672 > iM5467) {
                iM5467 = iM54672;
            }
        }
        return iM5467;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final int m5324() {
        int iM5557 = m5557();
        if (iM5557 == 0) {
            return 0;
        }
        return AbstractC3352.m5543(m5558(iM5557 - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m5325(C3364 c3364, int i) {
        while (m5557() > 0) {
            View viewM5558 = m5558(0);
            AbstractC3290 abstractC3290 = this.f7618;
            if (abstractC3290.mo5399(viewM5558) > i || abstractC3290.mo5400(viewM5558) > i) {
                return;
            }
            C3308 c3308 = (C3308) viewM5558.getLayoutParams();
            if (c3308.f7769) {
                for (int i2 = 0; i2 < this.f7620; i2++) {
                    if (this.f7619[i2].f7790.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7620; i3++) {
                    this.f7619[i3].m5470();
                }
            } else if (c3308.f7768.f7790.size() == 1) {
                return;
            } else {
                c3308.f7768.m5470();
            }
            m5559(viewM5558, c3364);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m5326() {
        if (this.f7616 == 1 || !m5342()) {
            this.f7614 = this.f7611;
        } else {
            this.f7614 = !this.f7611;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m5327(C3364 c3364, C3305 c3305) {
        if (!c3305.f7729 || c3305.f7732) {
            return;
        }
        int i = c3305.f7728;
        int i2 = c3305.f7725;
        if (i == 0) {
            if (i2 == -1) {
                m5328(c3364, c3305.f7731);
                return;
            } else {
                m5325(c3364, c3305.f7724);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = c3305.f7724;
            int iM5472 = this.f7619[0].m5472(i4);
            while (i3 < this.f7620) {
                int iM54722 = this.f7619[i3].m5472(i4);
                if (iM54722 > iM5472) {
                    iM5472 = iM54722;
                }
                i3++;
            }
            int i5 = i4 - iM5472;
            int iMin = c3305.f7731;
            if (i5 >= 0) {
                iMin -= Math.min(i5, c3305.f7728);
            }
            m5328(c3364, iMin);
            return;
        }
        int i6 = c3305.f7731;
        int iM5467 = this.f7619[0].m5467(i6);
        while (i3 < this.f7620) {
            int iM54672 = this.f7619[i3].m5467(i6);
            if (iM54672 < iM5467) {
                iM5467 = iM54672;
            }
            i3++;
        }
        int i7 = iM5467 - c3305.f7731;
        int iMin2 = c3305.f7724;
        if (i7 >= 0) {
            iMin2 += Math.min(i7, c3305.f7728);
        }
        m5325(c3364, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m5328(C3364 c3364, int i) {
        for (int iM5557 = m5557() - 1; iM5557 >= 0; iM5557--) {
            View viewM5558 = m5558(iM5557);
            AbstractC3290 abstractC3290 = this.f7618;
            if (abstractC3290.mo5396(viewM5558) < i || abstractC3290.mo5401(viewM5558) < i) {
                return;
            }
            C3308 c3308 = (C3308) viewM5558.getLayoutParams();
            if (c3308.f7769) {
                for (int i2 = 0; i2 < this.f7620; i2++) {
                    if (this.f7619[i2].f7790.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7620; i3++) {
                    this.f7619[i3].m5469();
                }
            } else if (c3308.f7768.f7790.size() == 1) {
                return;
            } else {
                c3308.f7768.m5469();
            }
            m5559(viewM5558, c3364);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m5329(int i) {
        C3305 c3305 = this.f7612;
        c3305.f7725 = i;
        c3305.f7726 = this.f7614 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final int m5330(int i, C3364 c3364, C3358 c3358) {
        if (m5557() == 0 || i == 0) {
            return 0;
        }
        m5339(i, c3358);
        C3305 c3305 = this.f7612;
        int iM5335 = m5335(c3364, c3305, c3358);
        if (c3305.f7728 >= iM5335) {
            i = i < 0 ? -iM5335 : iM5335;
        }
        this.f7618.mo5402(-i);
        this.f7608 = this.f7614;
        c3305.f7728 = 0;
        m5327(c3364, c3305);
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m5331(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        boolean z = !this.f7626;
        return C9496.m14946(c3358, this.f7618, m5333(z), m5336(z), this, this.f7626, this.f7614);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final boolean m5332() {
        int iM5321;
        int iM5324;
        if (m5557() != 0 && this.f7605 != 0 && this.f7936) {
            if (this.f7614) {
                iM5321 = m5324();
                iM5324 = m5321();
            } else {
                iM5321 = m5321();
                iM5324 = m5324();
            }
            C3324 c3324 = this.f7606;
            if (iM5321 == 0 && m5341() != null) {
                c3324.m5477();
                this.f7935 = true;
                m5561();
                return true;
            }
            if (this.f7625) {
                int i = this.f7614 ? -1 : 1;
                int i2 = iM5324 + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5484 = c3324.m5484(iM5321, i2, i);
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5484 == null) {
                    this.f7625 = false;
                    c3324.m5485(i2);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM54842 = c3324.m5484(iM5321, staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5484.f7630, i * (-1));
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM54842 == null) {
                    c3324.m5485(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5484.f7630);
                } else {
                    c3324.m5485(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM54842.f7630 + 1);
                }
                this.f7935 = true;
                m5561();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final View m5333(boolean z) {
        AbstractC3290 abstractC3290 = this.f7618;
        int iMo5405 = abstractC3290.mo5405();
        int iMo5404 = abstractC3290.mo5404();
        int iM5557 = m5557();
        View view = null;
        for (int i = 0; i < iM5557; i++) {
            View viewM5558 = m5558(i);
            int iMo5396 = abstractC3290.mo5396(viewM5558);
            if (abstractC3290.mo5399(viewM5558) > iMo5405 && iMo5396 < iMo5404) {
                if (iMo5396 >= iMo5405 || !z) {
                    return viewM5558;
                }
                if (view == null) {
                    view = viewM5558;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m5334(C3364 c3364, C3358 c3358, boolean z) {
        int iMo5404;
        int iM5323 = m5323(Integer.MIN_VALUE);
        if (iM5323 != Integer.MIN_VALUE && (iMo5404 = this.f7618.mo5404() - iM5323) > 0) {
            int i = iMo5404 - (-m5330(-iMo5404, c3364, c3358));
            if (!z || i <= 0) {
                return;
            }
            this.f7618.mo5402(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032e  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5335(C3364 c3364, C3305 c3305, C3358 c3358) {
        int i;
        C3319 c3319;
        C3305 c33052;
        int i2;
        int i3;
        int iM5319;
        int iMo5398;
        int i4;
        int i5;
        boolean zM5342;
        AbstractC3290 abstractC3290;
        int iMo5405;
        int iMo53982;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        C3364 c33642 = c3364;
        int i10 = 0;
        int i11 = 1;
        this.f7613.set(0, this.f7620, true);
        C3305 c33053 = this.f7612;
        int i12 = c33053.f7732 ? c3305.f7725 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c3305.f7725 == 1 ? c3305.f7731 + c3305.f7728 : c3305.f7724 - c3305.f7728;
        m5349(c3305.f7725, i12);
        boolean z3 = this.f7614;
        AbstractC3290 abstractC32902 = this.f7618;
        int iMo5404 = z3 ? abstractC32902.mo5404() : abstractC32902.mo5405();
        boolean z4 = false;
        while (true) {
            int i13 = c3305.f7727;
            if (i13 < 0 || i13 >= c3358.m5585() || (!c33053.f7732 && this.f7613.isEmpty())) {
                break;
            }
            View viewM5591 = c33642.m5591(c3305.f7727);
            c3305.f7727 += c3305.f7726;
            C3308 c3308 = (C3308) viewM5591.getLayoutParams();
            int layoutPosition = c3308.f7924.getLayoutPosition();
            C3324 c3324 = this.f7606;
            int[] iArr = (int[]) c3324.f7801;
            int i14 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            int i15 = i14 == -1 ? i11 : i10;
            if (i15 != 0) {
                if (c3308.f7769) {
                    c3319 = this.f7619[i10];
                    i = i15;
                } else {
                    boolean zM5340 = m5340(c3305.f7725);
                    int i16 = this.f7620;
                    if (zM5340) {
                        i9 = i16 - 1;
                        i8 = -1;
                        i7 = -1;
                    } else {
                        i7 = i11;
                        i8 = i16;
                        i9 = i10;
                    }
                    C3319 c33192 = null;
                    if (c3305.f7725 == i11) {
                        int iMo54052 = abstractC32902.mo5405();
                        int i17 = Integer.MAX_VALUE;
                        while (i9 != i8) {
                            int i18 = i15;
                            C3319 c33193 = this.f7619[i9];
                            int i19 = i9;
                            int iM5467 = c33193.m5467(iMo54052);
                            if (iM5467 < i17) {
                                c33192 = c33193;
                                i17 = iM5467;
                            }
                            i9 = i19 + i7;
                            i15 = i18;
                        }
                        i = i15;
                    } else {
                        i = i15;
                        int iMo54042 = abstractC32902.mo5404();
                        int i20 = Integer.MIN_VALUE;
                        while (i9 != i8) {
                            C3319 c33194 = this.f7619[i9];
                            int i21 = i8;
                            int iM5472 = c33194.m5472(iMo54042);
                            if (iM5472 > i20) {
                                i20 = iM5472;
                                c33192 = c33194;
                            }
                            i9 += i7;
                            i8 = i21;
                        }
                    }
                    c3319 = c33192;
                }
                c3324.m5476(layoutPosition);
                ((int[]) c3324.f7801)[layoutPosition] = c3319.f7786;
            } else {
                i = i15;
                c3319 = this.f7619[i14];
            }
            c3308.f7768 = c3319;
            if (c3305.f7725 == 1) {
                m5575(viewM5591);
            } else {
                m5573(viewM5591, 0, false);
            }
            boolean z5 = c3308.f7769;
            int i22 = this.f7616;
            if (!z5) {
                c33052 = c33053;
                i2 = i12;
                i3 = 1;
                if (i22 == 1) {
                    m5338(viewM5591, AbstractC3352.m5549(false, this.f7615, this.f7928, 0, ((ViewGroup.MarginLayoutParams) c3308).width), AbstractC3352.m5549(true, this.f7925, this.f7927, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c3308).height));
                } else {
                    m5338(viewM5591, AbstractC3352.m5549(true, this.f7926, this.f7928, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c3308).width), AbstractC3352.m5549(false, this.f7615, this.f7927, 0, ((ViewGroup.MarginLayoutParams) c3308).height));
                }
            } else if (i22 == 1) {
                i2 = i12;
                c33052 = c33053;
                i3 = 1;
                m5338(viewM5591, this.f7604, AbstractC3352.m5549(true, this.f7925, this.f7927, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c3308).height));
            } else {
                c33052 = c33053;
                i2 = i12;
                i3 = 1;
                m5338(viewM5591, AbstractC3352.m5549(true, this.f7926, this.f7928, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c3308).width), this.f7604);
            }
            int i23 = c3305.f7725;
            boolean z6 = c3308.f7769;
            if (i23 == i3) {
                iMo5398 = z6 ? m5323(iMo5404) : c3319.m5467(iMo5404);
                iM5319 = abstractC32902.mo5398(viewM5591) + iMo5398;
                if (i != 0 && c3308.f7769) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7629 = new int[this.f7620];
                    for (int i24 = 0; i24 < this.f7620; i24++) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7629[i24] = iMo5398 - this.f7619[i24].m5467(iMo5398);
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7628 = -1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630 = layoutPosition;
                    c3324.m5479(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
            } else {
                iM5319 = z6 ? m5319(iMo5404) : c3319.m5472(iMo5404);
                iMo5398 = iM5319 - abstractC32902.mo5398(viewM5591);
                if (i != 0 && c3308.f7769) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7629 = new int[this.f7620];
                    for (int i25 = 0; i25 < this.f7620; i25++) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7629[i25] = this.f7619[i25].m5472(iM5319) - iM5319;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7628 = 1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7630 = layoutPosition;
                    c3324.m5479(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2);
                }
            }
            if (!c3308.f7769 || c3305.f7726 != -1) {
                i4 = 1;
            } else if (i != 0) {
                this.f7625 = true;
                i4 = 1;
            } else {
                int i26 = c3305.f7725;
                C3319[] c3319Arr = this.f7619;
                if (i26 != 1) {
                    int iM54722 = c3319Arr[0].m5472(Integer.MIN_VALUE);
                    int i27 = 1;
                    while (true) {
                        if (i27 >= this.f7620) {
                            z2 = true;
                            break;
                        }
                        if (this.f7619[i27].m5472(Integer.MIN_VALUE) != iM54722) {
                            z2 = false;
                            break;
                        }
                        i27++;
                    }
                } else {
                    int iM54672 = c3319Arr[0].m5467(Integer.MIN_VALUE);
                    int i28 = 1;
                    while (true) {
                        if (i28 >= this.f7620) {
                            z2 = true;
                            break;
                        }
                        if (this.f7619[i28].m5467(Integer.MIN_VALUE) != iM54672) {
                            z2 = false;
                            break;
                        }
                        i28++;
                    }
                }
                i4 = 1;
                if (!z2) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 = c3324.m5488(layoutPosition);
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 != null) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488.f7627 = true;
                    }
                    this.f7625 = true;
                }
                i5 = c3305.f7725;
                boolean z7 = c3308.f7769;
                if (i5 != i4) {
                    if (z7) {
                        for (int i29 = this.f7620 - i4; i29 >= 0; i29--) {
                            this.f7619[i29].m5465(viewM5591);
                        }
                    } else {
                        c3308.f7768.m5465(viewM5591);
                    }
                } else if (z7) {
                    for (int i30 = this.f7620 - 1; i30 >= 0; i30--) {
                        this.f7619[i30].m5466(viewM5591);
                    }
                } else {
                    c3308.f7768.m5466(viewM5591);
                }
                zM5342 = m5342();
                abstractC3290 = this.f7617;
                if (zM5342 || i22 != 1) {
                    iMo5405 = !c3308.f7769 ? abstractC3290.mo5405() : abstractC3290.mo5405() + (c3319.f7786 * this.f7615);
                    iMo53982 = abstractC3290.mo5398(viewM5591) + iMo5405;
                } else {
                    iMo53982 = c3308.f7769 ? abstractC3290.mo5404() : abstractC3290.mo5404() - (((this.f7620 - 1) - c3319.f7786) * this.f7615);
                    iMo5405 = iMo53982 - abstractC3290.mo5398(viewM5591);
                }
                if (i22 != 1) {
                    AbstractC3352.m5552(viewM5591, iMo5405, iMo5398, iMo53982, iM5319);
                } else {
                    AbstractC3352.m5552(viewM5591, iMo5398, iMo5405, iM5319, iMo53982);
                }
                z = c3308.f7769;
                c33053 = c33052;
                int i31 = c33053.f7725;
                if (z) {
                    i6 = i2;
                    m5347(c3319, i31, i6);
                } else {
                    i6 = i2;
                    m5349(i31, i6);
                }
                c33642 = c3364;
                m5327(c33642, c33053);
                if (!c33053.f7730 && viewM5591.hasFocusable()) {
                    boolean z8 = c3308.f7769;
                    BitSet bitSet = this.f7613;
                    if (z8) {
                        bitSet.clear();
                    } else {
                        bitSet.set(c3319.f7786, false);
                    }
                }
                i11 = 1;
                z4 = true;
                i12 = i6;
                i10 = 0;
            }
            i5 = c3305.f7725;
            boolean z72 = c3308.f7769;
            if (i5 != i4) {
            }
            zM5342 = m5342();
            abstractC3290 = this.f7617;
            if (zM5342) {
                if (!c3308.f7769) {
                }
                iMo53982 = abstractC3290.mo5398(viewM5591) + iMo5405;
            }
            if (i22 != 1) {
            }
            z = c3308.f7769;
            c33053 = c33052;
            int i312 = c33053.f7725;
            if (z) {
            }
            c33642 = c3364;
            m5327(c33642, c33053);
            if (!c33053.f7730) {
            }
            i11 = 1;
            z4 = true;
            i12 = i6;
            i10 = 0;
        }
        if (!z4) {
            m5327(c33642, c33053);
        }
        int iMo54053 = c33053.f7725 == -1 ? abstractC32902.mo5405() - m5319(abstractC32902.mo5405()) : m5323(abstractC32902.mo5404()) - abstractC32902.mo5404();
        if (iMo54053 > 0) {
            return Math.min(c3305.f7728, iMo54053);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final View m5336(boolean z) {
        AbstractC3290 abstractC3290 = this.f7618;
        int iMo5405 = abstractC3290.mo5405();
        int iMo5404 = abstractC3290.mo5404();
        View view = null;
        for (int iM5557 = m5557() - 1; iM5557 >= 0; iM5557--) {
            View viewM5558 = m5558(iM5557);
            int iMo5396 = abstractC3290.mo5396(viewM5558);
            int iMo5399 = abstractC3290.mo5399(viewM5558);
            if (iMo5399 > iMo5405 && iMo5396 < iMo5404) {
                if (iMo5399 <= iMo5404 || !z) {
                    return viewM5558;
                }
                if (view == null) {
                    view = viewM5558;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ff  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5337(C3364 c3364, C3358 c3358, boolean z) {
        SavedState savedState;
        C3319[] c3319Arr;
        int iM5543;
        int i;
        boolean z2;
        SavedState savedState2 = this.f7603;
        C3307 c3307 = this.f7621;
        if (!(savedState2 == null && this.f7609 == -1) && c3358.m5585() == 0) {
            m5567(c3364);
            c3307.m5453();
            return;
        }
        boolean z3 = c3307.f7762;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c3307.f7767;
        boolean z4 = true;
        boolean z5 = (z3 && this.f7609 == -1 && this.f7603 == null) ? false : true;
        C3324 c3324 = this.f7606;
        if (z5) {
            c3307.m5453();
            SavedState savedState3 = this.f7603;
            AbstractC3290 abstractC3290 = this.f7618;
            if (savedState3 != null) {
                int i2 = savedState3.f7639;
                if (i2 > 0) {
                    if (i2 == this.f7620) {
                        for (int i3 = 0; i3 < this.f7620; i3++) {
                            this.f7619[i3].m5462();
                            SavedState savedState4 = this.f7603;
                            int iMo5404 = savedState4.f7633[i3];
                            if (iMo5404 != Integer.MIN_VALUE) {
                                iMo5404 += savedState4.f7635 ? abstractC3290.mo5404() : abstractC3290.mo5405();
                            }
                            C3319 c3319 = this.f7619[i3];
                            c3319.f7789 = iMo5404;
                            c3319.f7788 = iMo5404;
                        }
                    } else {
                        savedState3.f7633 = null;
                        savedState3.f7639 = 0;
                        savedState3.f7632 = 0;
                        savedState3.f7636 = null;
                        savedState3.f7637 = null;
                        savedState3.f7640 = savedState3.f7638;
                    }
                }
                SavedState savedState5 = this.f7603;
                this.f7607 = savedState5.f7631;
                boolean z6 = savedState5.f7634;
                mo5234(null);
                SavedState savedState6 = this.f7603;
                if (savedState6 != null && savedState6.f7634 != z6) {
                    savedState6.f7634 = z6;
                }
                this.f7611 = z6;
                m5561();
                m5326();
                SavedState savedState7 = this.f7603;
                int i4 = savedState7.f7640;
                if (i4 != -1) {
                    this.f7609 = i4;
                    c3307.f7764 = savedState7.f7635;
                } else {
                    c3307.f7764 = this.f7614;
                }
                if (savedState7.f7632 > 1) {
                    c3324.f7801 = savedState7.f7636;
                    c3324.f7800 = savedState7.f7637;
                }
            } else {
                m5326();
                c3307.f7764 = this.f7614;
            }
            if (c3358.f7962 || (i = this.f7609) == -1) {
                if (this.f7608) {
                    int iM5585 = c3358.m5585();
                    int iM5557 = m5557();
                    for (int i5 = 0; i5 < iM5557; i5++) {
                        int iM55432 = AbstractC3352.m5543(m5558(i5));
                        if (iM55432 >= 0 && iM55432 < iM5585) {
                            iM5543 = iM55432;
                            break;
                        }
                    }
                    iM5543 = 0;
                    c3307.f7766 = iM5543;
                    c3307.f7765 = Integer.MIN_VALUE;
                    c3307.f7762 = true;
                } else {
                    int iM55852 = c3358.m5585();
                    for (int iM55572 = m5557() - 1; iM55572 >= 0; iM55572--) {
                        iM5543 = AbstractC3352.m5543(m5558(iM55572));
                        if (iM5543 >= 0 && iM5543 < iM55852) {
                            break;
                        }
                    }
                    iM5543 = 0;
                    c3307.f7766 = iM5543;
                    c3307.f7765 = Integer.MIN_VALUE;
                    c3307.f7762 = true;
                }
            } else if (i < 0 || i >= c3358.m5585()) {
                this.f7609 = -1;
                this.f7610 = Integer.MIN_VALUE;
                if (this.f7608) {
                }
            } else {
                SavedState savedState8 = this.f7603;
                if (savedState8 == null || savedState8.f7640 == -1 || savedState8.f7639 < 1) {
                    View viewMo5204 = mo5204(this.f7609);
                    if (viewMo5204 != null) {
                        c3307.f7766 = this.f7614 ? m5324() : m5321();
                        if (this.f7610 != Integer.MIN_VALUE) {
                            if (c3307.f7764) {
                                c3307.f7765 = (abstractC3290.mo5404() - this.f7610) - abstractC3290.mo5399(viewMo5204);
                            } else {
                                c3307.f7765 = (abstractC3290.mo5405() + this.f7610) - abstractC3290.mo5396(viewMo5204);
                            }
                        } else if (abstractC3290.mo5398(viewMo5204) > abstractC3290.mo5406()) {
                            c3307.f7765 = c3307.f7764 ? abstractC3290.mo5404() : abstractC3290.mo5405();
                        } else {
                            int iMo5396 = abstractC3290.mo5396(viewMo5204) - abstractC3290.mo5405();
                            if (iMo5396 < 0) {
                                c3307.f7765 = -iMo5396;
                            } else {
                                int iMo54042 = abstractC3290.mo5404() - abstractC3290.mo5399(viewMo5204);
                                if (iMo54042 < 0) {
                                    c3307.f7765 = iMo54042;
                                } else {
                                    c3307.f7765 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f7609;
                        c3307.f7766 = i6;
                        int i7 = this.f7610;
                        if (i7 == Integer.MIN_VALUE) {
                            if (m5557() == 0) {
                                z2 = this.f7614;
                            } else if ((i6 < m5321()) != this.f7614) {
                            }
                            c3307.f7764 = z2;
                            AbstractC3290 abstractC32902 = staggeredGridLayoutManager.f7618;
                            c3307.f7765 = z2 ? abstractC32902.mo5404() : abstractC32902.mo5405();
                        } else {
                            boolean z7 = c3307.f7764;
                            AbstractC3290 abstractC32903 = staggeredGridLayoutManager.f7618;
                            if (z7) {
                                c3307.f7765 = abstractC32903.mo5404() - i7;
                            } else {
                                c3307.f7765 = abstractC32903.mo5405() + i7;
                            }
                        }
                        c3307.f7763 = true;
                    }
                } else {
                    c3307.f7765 = Integer.MIN_VALUE;
                    c3307.f7766 = this.f7609;
                }
                c3307.f7762 = true;
            }
        }
        if (this.f7603 == null && this.f7609 == -1 && (c3307.f7764 != this.f7608 || m5342() != this.f7607)) {
            c3324.m5477();
            c3307.f7763 = true;
        }
        if (m5557() > 0 && ((savedState = this.f7603) == null || savedState.f7639 < 1)) {
            if (c3307.f7763) {
                for (int i8 = 0; i8 < this.f7620; i8++) {
                    this.f7619[i8].m5462();
                    int i9 = c3307.f7765;
                    if (i9 != Integer.MIN_VALUE) {
                        C3319 c33192 = this.f7619[i8];
                        c33192.f7789 = i9;
                        c33192.f7788 = i9;
                    }
                }
            } else if (z5 || c3307.f7761 == null) {
                int i10 = 0;
                while (true) {
                    int i11 = this.f7620;
                    c3319Arr = this.f7619;
                    if (i10 >= i11) {
                        break;
                    }
                    C3319 c33193 = c3319Arr[i10];
                    boolean z8 = this.f7614;
                    int i12 = c3307.f7765;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = c33193.f7785;
                    int iM5467 = z8 ? c33193.m5467(Integer.MIN_VALUE) : c33193.m5472(Integer.MIN_VALUE);
                    c33193.m5462();
                    if (iM5467 != Integer.MIN_VALUE && ((!z8 || iM5467 >= staggeredGridLayoutManager2.f7618.mo5404()) && (z8 || iM5467 <= staggeredGridLayoutManager2.f7618.mo5405()))) {
                        if (i12 != Integer.MIN_VALUE) {
                            iM5467 += i12;
                        }
                        c33193.f7788 = iM5467;
                        c33193.f7789 = iM5467;
                    }
                    i10++;
                }
                int length = c3319Arr.length;
                int[] iArr = c3307.f7761;
                if (iArr == null || iArr.length < length) {
                    c3307.f7761 = new int[staggeredGridLayoutManager.f7619.length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    c3307.f7761[i13] = c3319Arr[i13].m5472(Integer.MIN_VALUE);
                }
            } else {
                for (int i14 = 0; i14 < this.f7620; i14++) {
                    C3319 c33194 = this.f7619[i14];
                    c33194.m5462();
                    int i15 = c3307.f7761[i14];
                    c33194.f7789 = i15;
                    c33194.f7788 = i15;
                }
            }
        }
        m5556(c3364);
        C3305 c3305 = this.f7612;
        c3305.f7729 = false;
        this.f7625 = false;
        AbstractC3290 abstractC32904 = this.f7617;
        int iMo5406 = abstractC32904.mo5406();
        this.f7615 = iMo5406 / this.f7620;
        this.f7604 = View.MeasureSpec.makeMeasureSpec(iMo5406, abstractC32904.mo5407());
        m5348(c3307.f7766, c3358);
        if (c3307.f7764) {
            m5329(-1);
            m5335(c3364, c3305, c3358);
            m5329(1);
            c3305.f7727 = c3307.f7766 + c3305.f7726;
            m5335(c3364, c3305, c3358);
        } else {
            m5329(1);
            m5335(c3364, c3305, c3358);
            m5329(-1);
            c3305.f7727 = c3307.f7766 + c3305.f7726;
            m5335(c3364, c3305, c3358);
        }
        if (abstractC32904.mo5407() != 1073741824) {
            int iM55573 = m5557();
            float fMax = 0.0f;
            for (int i16 = 0; i16 < iM55573; i16++) {
                View viewM5558 = m5558(i16);
                float fMo5398 = abstractC32904.mo5398(viewM5558);
                if (fMo5398 >= fMax) {
                    if (((C3308) viewM5558.getLayoutParams()).f7769) {
                        fMo5398 = (fMo5398 * 1.0f) / this.f7620;
                    }
                    fMax = Math.max(fMax, fMo5398);
                }
            }
            int i17 = this.f7615;
            int iRound = Math.round(fMax * this.f7620);
            if (abstractC32904.mo5407() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, abstractC32904.mo5406());
            }
            this.f7615 = iRound / this.f7620;
            this.f7604 = View.MeasureSpec.makeMeasureSpec(iRound, abstractC32904.mo5407());
            if (this.f7615 != i17) {
                for (int i18 = 0; i18 < iM55573; i18++) {
                    View viewM55582 = m5558(i18);
                    C3308 c3308 = (C3308) viewM55582.getLayoutParams();
                    if (!c3308.f7769) {
                        boolean zM5342 = m5342();
                        int i19 = this.f7616;
                        if (zM5342 && i19 == 1) {
                            int i20 = -((this.f7620 - 1) - c3308.f7768.f7786);
                            viewM55582.offsetLeftAndRight((this.f7615 * i20) - (i20 * i17));
                        } else {
                            int i21 = c3308.f7768.f7786;
                            int i22 = this.f7615 * i21;
                            int i23 = i21 * i17;
                            if (i19 == 1) {
                                viewM55582.offsetLeftAndRight(i22 - i23);
                            } else {
                                viewM55582.offsetTopAndBottom(i22 - i23);
                            }
                        }
                    }
                }
            }
        }
        if (m5557() > 0) {
            if (this.f7614) {
                m5334(c3364, c3358, true);
                m5322(c3364, c3358, false);
            } else {
                m5322(c3364, c3358, true);
                m5334(c3364, c3358, false);
            }
        }
        if (!z || c3358.f7962 || this.f7605 == 0 || m5557() <= 0 || (!this.f7625 && m5341() == null)) {
            z4 = false;
        } else {
            RecyclerView recyclerView = this.f7937;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f7624);
            }
            if (!m5332()) {
            }
        }
        if (c3358.f7962) {
            c3307.m5453();
        }
        this.f7608 = c3307.f7764;
        this.f7607 = m5342();
        if (z4) {
            c3307.m5453();
            m5337(c3364, c3358, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m5338(View view, int i, int i2) {
        Rect rect = this.f7622;
        m5574(rect, view);
        C3308 c3308 = (C3308) view.getLayoutParams();
        int iM5318 = m5318(i, ((ViewGroup.MarginLayoutParams) c3308).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c3308).rightMargin + rect.right);
        int iM53182 = m5318(i2, ((ViewGroup.MarginLayoutParams) c3308).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c3308).bottomMargin + rect.bottom);
        if (m5564(view, iM5318, iM53182, c3308)) {
            view.measure(iM5318, iM53182);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m5339(int i, C3358 c3358) {
        int iM5321;
        int i2;
        if (i > 0) {
            iM5321 = m5324();
            i2 = 1;
        } else {
            iM5321 = m5321();
            i2 = -1;
        }
        C3305 c3305 = this.f7612;
        c3305.f7729 = true;
        m5348(iM5321, c3358);
        m5329(i2);
        c3305.f7727 = iM5321 + c3305.f7726;
        c3305.f7728 = Math.abs(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final boolean m5340(int i) {
        if (this.f7616 == 0) {
            return (i == -1) != this.f7614;
        }
        return ((i == -1) == this.f7614) == m5342();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m5341() {
        int i;
        boolean z;
        boolean z2;
        int iM5557 = m5557();
        int i2 = iM5557 - 1;
        BitSet bitSet = new BitSet(this.f7620);
        bitSet.set(0, this.f7620, true);
        byte b = (this.f7616 == 1 && m5342()) ? (byte) 1 : (byte) -1;
        if (this.f7614) {
            iM5557 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM5557 ? 1 : -1;
        while (i2 != iM5557) {
            View viewM5558 = m5558(i2);
            C3308 c3308 = (C3308) viewM5558.getLayoutParams();
            boolean z3 = bitSet.get(c3308.f7768.f7786);
            AbstractC3290 abstractC3290 = this.f7618;
            if (z3) {
                C3319 c3319 = c3308.f7768;
                if (this.f7614) {
                    int i4 = c3319.f7788;
                    if (i4 == Integer.MIN_VALUE) {
                        c3319.m5464();
                        i4 = c3319.f7788;
                    }
                    if (i4 < abstractC3290.mo5404()) {
                        z = ((C3308) ((View) AbstractC7012.m12145(1, c3319.f7790)).getLayoutParams()).f7769;
                        z2 = !z;
                    }
                    z2 = false;
                } else {
                    int i5 = c3319.f7789;
                    if (i5 == Integer.MIN_VALUE) {
                        c3319.m5463();
                        i5 = c3319.f7789;
                    }
                    if (i5 > abstractC3290.mo5405()) {
                        z = ((C3308) ((View) c3319.f7790.get(0)).getLayoutParams()).f7769;
                        z2 = !z;
                    }
                    z2 = false;
                }
                if (!z2) {
                    bitSet.clear(c3308.f7768.f7786);
                    if (!c3308.f7769 && (i = i2 + i3) != iM5557) {
                        View viewM55582 = m5558(i);
                        if (this.f7614) {
                            int iMo5396 = abstractC3290.mo5396(viewM5558);
                            int iMo53962 = abstractC3290.mo5396(viewM55582);
                            if (iMo5396 <= iMo53962) {
                                if (iMo5396 != iMo53962) {
                                    continue;
                                }
                            }
                        } else {
                            int iMo5399 = abstractC3290.mo5399(viewM5558);
                            int iMo53992 = abstractC3290.mo5399(viewM55582);
                            if (iMo5399 >= iMo53992) {
                                if (iMo5399 == iMo53992) {
                                    if ((c3308.f7768.f7786 - ((C3308) viewM55582.getLayoutParams()).f7768.f7786 < 0) != (b < 0)) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2 += i3;
                }
            } else {
                if (!c3308.f7769) {
                    View viewM555822 = m5558(i);
                    if (this.f7614) {
                    }
                }
                i2 += i3;
            }
            return viewM5558;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final boolean m5342() {
        return this.f7937.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo5171(int i, C3364 c3364, C3358 c3358) {
        return m5330(i, c3364, c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5226(int i) {
        SavedState savedState = this.f7603;
        if (savedState != null && savedState.f7640 != i) {
            savedState.f7633 = null;
            savedState.f7639 = 0;
            savedState.f7640 = -1;
            savedState.f7638 = -1;
        }
        this.f7609 = i;
        this.f7610 = Integer.MIN_VALUE;
        m5561();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo5227(RecyclerView recyclerView, int i) {
        C3292 c3292 = new C3292(recyclerView.getContext());
        c3292.f7662 = i;
        m5565(c3292);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final boolean mo5172() {
        return this.f7603 == null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void mo5343(int i) {
        if (i == 0) {
            m5332();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo5229() {
        int iM5472;
        int iMo5405;
        int[] iArr;
        SavedState savedState = this.f7603;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7639 = savedState.f7639;
            savedState2.f7640 = savedState.f7640;
            savedState2.f7638 = savedState.f7638;
            savedState2.f7633 = savedState.f7633;
            savedState2.f7632 = savedState.f7632;
            savedState2.f7636 = savedState.f7636;
            savedState2.f7634 = savedState.f7634;
            savedState2.f7635 = savedState.f7635;
            savedState2.f7631 = savedState.f7631;
            savedState2.f7637 = savedState.f7637;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f7634 = this.f7611;
        savedState3.f7635 = this.f7608;
        savedState3.f7631 = this.f7607;
        C3324 c3324 = this.f7606;
        if (c3324 == null || (iArr = (int[]) c3324.f7801) == null) {
            savedState3.f7632 = 0;
        } else {
            savedState3.f7636 = iArr;
            savedState3.f7632 = iArr.length;
            savedState3.f7637 = (ArrayList) c3324.f7800;
        }
        if (m5557() <= 0) {
            savedState3.f7640 = -1;
            savedState3.f7638 = -1;
            savedState3.f7639 = 0;
            return savedState3;
        }
        savedState3.f7640 = this.f7608 ? m5324() : m5321();
        View viewM5336 = this.f7614 ? m5336(true) : m5333(true);
        savedState3.f7638 = viewM5336 != null ? AbstractC3352.m5543(viewM5336) : -1;
        int i = this.f7620;
        savedState3.f7639 = i;
        savedState3.f7633 = new int[i];
        for (int i2 = 0; i2 < this.f7620; i2++) {
            boolean z = this.f7608;
            C3319[] c3319Arr = this.f7619;
            AbstractC3290 abstractC3290 = this.f7618;
            if (z) {
                iM5472 = c3319Arr[i2].m5467(Integer.MIN_VALUE);
                if (iM5472 != Integer.MIN_VALUE) {
                    iMo5405 = abstractC3290.mo5404();
                    iM5472 -= iMo5405;
                }
            } else {
                iM5472 = c3319Arr[i2].m5472(Integer.MIN_VALUE);
                if (iM5472 != Integer.MIN_VALUE) {
                    iMo5405 = abstractC3290.mo5405();
                    iM5472 -= iMo5405;
                }
            }
            savedState3.f7633[i2] = iM5472;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo5174(Rect rect, int i, int i2) {
        int iM5550;
        int iM55502;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7616 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7937;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            iM55502 = AbstractC3352.m5550(i2, iHeight, recyclerView.getMinimumHeight());
            iM5550 = AbstractC3352.m5550(i, (this.f7615 * this.f7620) + paddingRight, this.f7937.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7937;
            WeakHashMap weakHashMap2 = AbstractC3103.f6939;
            iM5550 = AbstractC3352.m5550(i, iWidth, recyclerView2.getMinimumWidth());
            iM55502 = AbstractC3352.m5550(i2, (this.f7615 * this.f7620) + paddingBottom, this.f7937.getMinimumHeight());
        }
        this.f7937.setMeasuredDimension(iM5550, iM55502);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo5175(int i, C3364 c3364, C3358 c3358) {
        return m5330(i, c3364, c3358);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.InterfaceC3355
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF mo5230(int i) {
        int i2 = -1;
        if (m5557() != 0) {
            if ((i < m5321()) == this.f7614) {
            }
        } else if (this.f7614) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f7616 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5231(int i, int i2, C3358 c3358, C1758 c1758) {
        C3305 c3305;
        int iM5467;
        int iM5472;
        if (this.f7616 != 0) {
            i = i2;
        }
        if (m5557() == 0 || i == 0) {
            return;
        }
        m5339(i, c3358);
        int[] iArr = this.f7623;
        if (iArr == null || iArr.length < this.f7620) {
            this.f7623 = new int[this.f7620];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f7620;
            c3305 = this.f7612;
            if (i3 >= i5) {
                break;
            }
            if (c3305.f7726 == -1) {
                iM5467 = c3305.f7724;
                iM5472 = this.f7619[i3].m5472(iM5467);
            } else {
                iM5467 = this.f7619[i3].m5467(c3305.f7731);
                iM5472 = c3305.f7731;
            }
            int i6 = iM5467 - iM5472;
            if (i6 >= 0) {
                this.f7623[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f7623, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c3305.f7727;
            if (i8 < 0 || i8 >= c3358.m5585()) {
                return;
            }
            c1758.m2388(c3305.f7727, this.f7623[i7]);
            c3305.f7727 += c3305.f7726;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo5176(C3358 c3358) {
        return m5331(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo5177(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        boolean z = !this.f7626;
        return C9496.m14945(c3358, this.f7618, m5333(z), m5336(z), this, this.f7626);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo5233(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        boolean z = !this.f7626;
        return C9496.m14928(c3358, this.f7618, m5333(z), m5336(z), this, this.f7626);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo5234(String str) {
        if (this.f7603 == null) {
            super.mo5234(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo5235() {
        return this.f7616 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo5178(C3351 c3351) {
        return c3351 instanceof C3308;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo5236() {
        return this.f7616 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo5237(AccessibilityEvent accessibilityEvent) {
        super.mo5237(accessibilityEvent);
        if (m5557() > 0) {
            View viewM5333 = m5333(false);
            View viewM5336 = m5336(false);
            if (viewM5333 == null || viewM5336 == null) {
                return;
            }
            int iM5543 = AbstractC3352.m5543(viewM5333);
            int iM55432 = AbstractC3352.m5543(viewM5336);
            if (iM5543 < iM55432) {
                accessibilityEvent.setFromIndex(iM5543);
                accessibilityEvent.setToIndex(iM55432);
            } else {
                accessibilityEvent.setFromIndex(iM55432);
                accessibilityEvent.setToIndex(iM5543);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo5179(View view, int i, C3364 c3364, C3358 c3358) {
        View viewM5279;
        int i2;
        View viewM5471;
        if (m5557() != 0) {
            RecyclerView recyclerView = this.f7937;
            if (recyclerView == null || (viewM5279 = recyclerView.m5279(view)) == null || ((ArrayList) this.f7939.f7814).contains(viewM5279)) {
                viewM5279 = null;
            }
            if (viewM5279 != null) {
                m5326();
                int i3 = this.f7616;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 != 0) {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && m5342()) {
                    }
                } else if (i3 != 1 && m5342()) {
                }
                if (i2 != Integer.MIN_VALUE) {
                    C3308 c3308 = (C3308) viewM5279.getLayoutParams();
                    boolean z = c3308.f7769;
                    C3319 c3319 = c3308.f7768;
                    int iM5324 = i2 == 1 ? m5324() : m5321();
                    m5348(iM5324, c3358);
                    m5329(i2);
                    C3305 c3305 = this.f7612;
                    c3305.f7727 = c3305.f7726 + iM5324;
                    c3305.f7728 = (int) (this.f7618.mo5406() * 0.33333334f);
                    c3305.f7730 = true;
                    c3305.f7729 = false;
                    m5335(c3364, c3305, c3358);
                    this.f7608 = this.f7614;
                    if (!z && (viewM5471 = c3319.m5471(iM5324, i2)) != null && viewM5471 != viewM5279) {
                        return viewM5471;
                    }
                    if (m5340(i2)) {
                        for (int i4 = this.f7620 - 1; i4 >= 0; i4--) {
                            View viewM54712 = this.f7619[i4].m5471(iM5324, i2);
                            if (viewM54712 != null && viewM54712 != viewM5279) {
                                return viewM54712;
                            }
                        }
                    } else {
                        for (int i5 = 0; i5 < this.f7620; i5++) {
                            View viewM54713 = this.f7619[i5].m5471(iM5324, i2);
                            if (viewM54713 != null && viewM54713 != viewM5279) {
                                return viewM54713;
                            }
                        }
                    }
                    boolean z2 = (this.f7611 ^ true) == (i2 == -1);
                    if (!z) {
                        View viewMo5204 = mo5204(z2 ? c3319.m5461() : c3319.m5460());
                        if (viewMo5204 != null && viewMo5204 != viewM5279) {
                            return viewMo5204;
                        }
                    }
                    if (m5340(i2)) {
                        for (int i6 = this.f7620 - 1; i6 >= 0; i6--) {
                            if (i6 != c3319.f7786) {
                                C3319[] c3319Arr = this.f7619;
                                View viewMo52042 = mo5204(z2 ? c3319Arr[i6].m5461() : c3319Arr[i6].m5460());
                                if (viewMo52042 != null && viewMo52042 != viewM5279) {
                                    return viewMo52042;
                                }
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.f7620; i7++) {
                            C3319[] c3319Arr2 = this.f7619;
                            View viewMo52043 = mo5204(z2 ? c3319Arr2[i7].m5461() : c3319Arr2[i7].m5460());
                            if (viewMo52043 != null && viewMo52043 != viewM5279) {
                                return viewMo52043;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo5238(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7937;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f7624);
        }
        for (int i = 0; i < this.f7620; i++) {
            this.f7619[i].m5462();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void mo5344(AbstractC3283 abstractC3283) {
        this.f7606.m5477();
        for (int i = 0; i < this.f7620; i++) {
            this.f7619[i].m5462();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void mo5345(int i) {
        super.mo5345(i);
        for (int i2 = 0; i2 < this.f7620; i2++) {
            C3319 c3319 = this.f7619[i2];
            int i3 = c3319.f7789;
            if (i3 != Integer.MIN_VALUE) {
                c3319.f7789 = i3 + i;
            }
            int i4 = c3319.f7788;
            if (i4 != Integer.MIN_VALUE) {
                c3319.f7788 = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo5180(C3364 c3364, C3358 c3358) {
        m5337(c3364, c3358, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo5181(RecyclerView recyclerView, int i, int i2) {
        m5320(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo5239(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7603 = savedState;
            if (this.f7609 != -1) {
                savedState.f7640 = -1;
                savedState.f7638 = -1;
                savedState.f7633 = null;
                savedState.f7639 = 0;
                savedState.f7632 = 0;
                savedState.f7636 = null;
                savedState.f7637 = null;
            }
            m5561();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo5182(C3358 c3358) {
        this.f7609 = -1;
        this.f7610 = Integer.MIN_VALUE;
        this.f7603 = null;
        this.f7621.m5453();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5183(int i, int i2) {
        m5320(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo5184(int i, int i2) {
        m5320(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo5185(C3364 c3364, C3358 c3358, View view, C8436 c8436) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C3308)) {
            m5578(view, c8436);
            return;
        }
        C3308 c3308 = (C3308) layoutParams;
        C3319 c3319 = c3308.f7768;
        if (this.f7616 == 0) {
            c8436.m13400(C8242.m13201(false, c3319 == null ? -1 : c3319.f7786, c3308.f7769 ? this.f7620 : 1, -1, -1));
        } else {
            c8436.m13400(C8242.m13201(false, -1, -1, c3319 == null ? -1 : c3319.f7786, c3308.f7769 ? this.f7620 : 1));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo5186(int i, int i2) {
        m5320(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo5187() {
        this.f7606.m5477();
        m5561();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo5188(C3364 c3364, C3358 c3358, C8436 c8436) {
        super.mo5188(c3364, c3358, c8436);
        c8436.m13402("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final boolean mo5240() {
        return this.f7611;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo5241() {
        return this.f7605 != 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void mo5346(int i) {
        super.mo5346(i);
        for (int i2 = 0; i2 < this.f7620; i2++) {
            C3319 c3319 = this.f7619[i2];
            int i3 = c3319.f7789;
            if (i3 != Integer.MIN_VALUE) {
                c3319.f7789 = i3 + i;
            }
            int i4 = c3319.f7788;
            if (i4 != Integer.MIN_VALUE) {
                c3319.f7788 = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m5347(C3319 c3319, int i, int i2) {
        int i3 = c3319.f7787;
        int i4 = c3319.f7786;
        if (i == -1) {
            int i5 = c3319.f7789;
            if (i5 == Integer.MIN_VALUE) {
                c3319.m5463();
                i5 = c3319.f7789;
            }
            if (i5 + i3 <= i2) {
                this.f7613.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c3319.f7788;
        if (i6 == Integer.MIN_VALUE) {
            c3319.m5464();
            i6 = c3319.f7788;
        }
        if (i6 - i3 >= i2) {
            this.f7613.set(i4, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m5348(int i, C3358 c3358) {
        int iMo5406;
        int iMo54062;
        int i2;
        C3305 c3305 = this.f7612;
        boolean z = false;
        c3305.f7728 = 0;
        c3305.f7727 = i;
        C3292 c3292 = this.f7931;
        AbstractC3290 abstractC3290 = this.f7618;
        if (c3292 == null || !c3292.f7658 || (i2 = c3358.f7958) == -1) {
            iMo5406 = 0;
            iMo54062 = 0;
        } else {
            if (this.f7614 == (i2 < i)) {
                iMo5406 = abstractC3290.mo5406();
                iMo54062 = 0;
            } else {
                iMo54062 = abstractC3290.mo5406();
                iMo5406 = 0;
            }
        }
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null || !recyclerView.f7571) {
            c3305.f7731 = abstractC3290.mo5395() + iMo5406;
            c3305.f7724 = -iMo54062;
        } else {
            c3305.f7724 = abstractC3290.mo5405() - iMo54062;
            c3305.f7731 = abstractC3290.mo5404() + iMo5406;
        }
        c3305.f7730 = false;
        c3305.f7729 = true;
        if (abstractC3290.mo5407() == 0 && abstractC3290.mo5395() == 0) {
            z = true;
        }
        c3305.f7732 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m5349(int i, int i2) {
        for (int i3 = 0; i3 < this.f7620; i3++) {
            if (!this.f7619[i3].f7790.isEmpty()) {
                m5347(this.f7619[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m5350(int i) {
        mo5234(null);
        if (i != this.f7620) {
            this.f7606.m5477();
            m5561();
            this.f7620 = i;
            this.f7613 = new BitSet(this.f7620);
            this.f7619 = new C3319[this.f7620];
            for (int i2 = 0; i2 < this.f7620; i2++) {
                this.f7619[i2] = new C3319(this, i2);
            }
            m5561();
        }
    }

    public StaggeredGridLayoutManager(int i) {
        this.f7620 = -1;
        this.f7611 = false;
        this.f7614 = false;
        this.f7609 = -1;
        this.f7610 = Integer.MIN_VALUE;
        this.f7606 = new C3324();
        this.f7605 = 2;
        this.f7622 = new Rect();
        this.f7621 = new C3307(this);
        this.f7625 = false;
        this.f7626 = true;
        this.f7624 = new RunnableC3337(this, 2);
        this.f7616 = 1;
        m5350(i);
        this.f7612 = new C3305();
        this.f7618 = AbstractC3290.m5409(this, this.f7616);
        this.f7617 = AbstractC3290.m5409(this, 1 - this.f7616);
    }
}
