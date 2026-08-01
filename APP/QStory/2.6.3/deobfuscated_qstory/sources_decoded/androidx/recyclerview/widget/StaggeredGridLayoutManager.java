package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p124.C7413;
import p155.C7607;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2519 implements InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public SavedState f7258;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7259;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7260;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2491 f7261;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7262;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7263;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7264;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f7265;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7266;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2472 f7267;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public BitSet f7268;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7269;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f7270;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int f7271;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC2457 f7272;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC2457 f7273;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2486[] f7274;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7275;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C2474 f7276;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Rect f7277;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f7278;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final RunnableC2504 f7279;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f7280;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean f7281;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2487();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f7286;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public int f7287;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int[] f7288;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public boolean f7289;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public boolean f7290;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int[] f7291;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public ArrayList f7292;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7293;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public int f7294;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7295;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7295);
            parcel.writeInt(this.f7293);
            parcel.writeInt(this.f7294);
            if (this.f7294 > 0) {
                parcel.writeIntArray(this.f7288);
            }
            parcel.writeInt(this.f7287);
            if (this.f7287 > 0) {
                parcel.writeIntArray(this.f7291);
            }
            parcel.writeInt(this.f7289 ? 1 : 0);
            parcel.writeInt(this.f7290 ? 1 : 0);
            parcel.writeInt(this.f7286 ? 1 : 0);
            parcel.writeList(this.f7292);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7275 = -1;
        this.f7266 = false;
        this.f7269 = false;
        this.f7264 = -1;
        this.f7265 = Integer.MIN_VALUE;
        this.f7261 = new C2491();
        this.f7260 = 2;
        this.f7277 = new Rect();
        this.f7276 = new C2474(this);
        this.f7280 = false;
        this.f7281 = true;
        this.f7279 = new RunnableC2504(this, 2);
        C2520 c2520M4982 = AbstractC2519.m4982(context, attributeSet, i, i2);
        int i3 = c2520M4982.f7598;
        if (i3 != 0 && i3 != 1) {
            C5925.m11310("invalid orientation.");
            throw null;
        }
        mo4674(null);
        if (i3 != this.f7271) {
            this.f7271 = i3;
            AbstractC2457 abstractC2457 = this.f7273;
            this.f7273 = this.f7272;
            this.f7272 = abstractC2457;
            m5001();
        }
        m4790(c2520M4982.f7597);
        boolean z = c2520M4982.f7596;
        mo4674(null);
        SavedState savedState = this.f7258;
        if (savedState != null && savedState.f7289 != z) {
            savedState.f7289 = z;
        }
        this.f7266 = z;
        m5001();
        this.f7267 = new C2472();
        this.f7273 = AbstractC2457.m4849(this, this.f7271);
        this.f7272 = AbstractC2457.m4849(this, 1 - this.f7271);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public static int m4758(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final int mo4600(C2531 c2531, C2525 c2525) {
        if (this.f7271 == 0) {
            return Math.min(this.f7275, c2525.m5025());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4601() {
        return this.f7271 == 0 ? new C2475(-2, -1) : new C2475(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo4602(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        boolean z = !this.f7281;
        return C8667.m14386(c2525, this.f7273, m4773(z), m4776(z), this, this.f7281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo4603(C2525 c2525) {
        return m4771(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo4645(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        boolean z = !this.f7281;
        return C8667.m14369(c2525, this.f7273, m4773(z), m4776(z), this, this.f7281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final int mo4604(C2531 c2531, C2525 c2525) {
        if (this.f7271 == 1) {
            return Math.min(this.f7275, c2525.m5025());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final C2518 mo4605(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2475((ViewGroup.MarginLayoutParams) layoutParams) : new C2475(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C2518 mo4606(Context context, AttributeSet attributeSet) {
        return new C2475(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m4759(int i) {
        int iM4912 = this.f7274[0].m4912(i);
        for (int i2 = 1; i2 < this.f7275; i2++) {
            int iM49122 = this.f7274[i2].m4912(i);
            if (iM49122 < iM4912) {
                iM4912 = iM49122;
            }
        }
        return iM4912;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4760(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f7269
            if (r0 == 0) goto L9
            int r0 = r7.m4764()
            goto Ld
        L9:
            int r0 = r7.m4761()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.飘花落叶言子哲苏楪兰世 r4 = r7.f7261
            r4.m4929(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.m4921(r8, r5)
            r4.m4927(r9, r5)
            goto L3a
        L33:
            r4.m4921(r8, r9)
            goto L3a
        L37:
            r4.m4927(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            goto L4f
        L3d:
            boolean r8 = r7.f7269
            if (r8 == 0) goto L46
            int r8 = r7.m4761()
            goto L4a
        L46:
            int r8 = r7.m4764()
        L4a:
            if (r3 > r8) goto L4f
            r7.m5001()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4760(int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m4761() {
        if (m4997() == 0) {
            return 0;
        }
        return AbstractC2519.m4983(m4998(0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m4762(C2531 c2531, C2525 c2525, boolean z) {
        int iMo4845;
        int iM4759 = m4759(Integer.MAX_VALUE);
        if (iM4759 != Integer.MAX_VALUE && (iMo4845 = iM4759 - this.f7273.mo4845()) > 0) {
            int iM4770 = iMo4845 - m4770(iMo4845, c2531, c2525);
            if (!z || iM4770 <= 0) {
                return;
            }
            this.f7273.mo4842(-iM4770);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final int m4763(int i) {
        int iM4907 = this.f7274[0].m4907(i);
        for (int i2 = 1; i2 < this.f7275; i2++) {
            int iM49072 = this.f7274[i2].m4907(i);
            if (iM49072 > iM4907) {
                iM4907 = iM49072;
            }
        }
        return iM4907;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final int m4764() {
        int iM4997 = m4997();
        if (iM4997 == 0) {
            return 0;
        }
        return AbstractC2519.m4983(m4998(iM4997 - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m4765(C2531 c2531, int i) {
        while (m4997() > 0) {
            View viewM4998 = m4998(0);
            AbstractC2457 abstractC2457 = this.f7273;
            if (abstractC2457.mo4839(viewM4998) > i || abstractC2457.mo4840(viewM4998) > i) {
                return;
            }
            C2475 c2475 = (C2475) viewM4998.getLayoutParams();
            if (c2475.f7424) {
                for (int i2 = 0; i2 < this.f7275; i2++) {
                    if (this.f7274[i2].f7445.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7275; i3++) {
                    this.f7274[i3].m4910();
                }
            } else if (c2475.f7423.f7445.size() == 1) {
                return;
            } else {
                c2475.f7423.m4910();
            }
            m4999(viewM4998, c2531);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m4766() {
        if (this.f7271 == 1 || !m4782()) {
            this.f7269 = this.f7266;
        } else {
            this.f7269 = !this.f7266;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m4767(C2531 c2531, C2472 c2472) {
        if (!c2472.f7384 || c2472.f7387) {
            return;
        }
        int i = c2472.f7383;
        int i2 = c2472.f7380;
        if (i == 0) {
            if (i2 == -1) {
                m4768(c2531, c2472.f7386);
                return;
            } else {
                m4765(c2531, c2472.f7379);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = c2472.f7379;
            int iM4912 = this.f7274[0].m4912(i4);
            while (i3 < this.f7275) {
                int iM49122 = this.f7274[i3].m4912(i4);
                if (iM49122 > iM4912) {
                    iM4912 = iM49122;
                }
                i3++;
            }
            int i5 = i4 - iM4912;
            int iMin = c2472.f7386;
            if (i5 >= 0) {
                iMin -= Math.min(i5, c2472.f7383);
            }
            m4768(c2531, iMin);
            return;
        }
        int i6 = c2472.f7386;
        int iM4907 = this.f7274[0].m4907(i6);
        while (i3 < this.f7275) {
            int iM49072 = this.f7274[i3].m4907(i6);
            if (iM49072 < iM4907) {
                iM4907 = iM49072;
            }
            i3++;
        }
        int i7 = iM4907 - c2472.f7386;
        int iMin2 = c2472.f7379;
        if (i7 >= 0) {
            iMin2 += Math.min(i7, c2472.f7383);
        }
        m4765(c2531, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m4768(C2531 c2531, int i) {
        for (int iM4997 = m4997() - 1; iM4997 >= 0; iM4997--) {
            View viewM4998 = m4998(iM4997);
            AbstractC2457 abstractC2457 = this.f7273;
            if (abstractC2457.mo4836(viewM4998) < i || abstractC2457.mo4841(viewM4998) < i) {
                return;
            }
            C2475 c2475 = (C2475) viewM4998.getLayoutParams();
            if (c2475.f7424) {
                for (int i2 = 0; i2 < this.f7275; i2++) {
                    if (this.f7274[i2].f7445.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7275; i3++) {
                    this.f7274[i3].m4909();
                }
            } else if (c2475.f7423.f7445.size() == 1) {
                return;
            } else {
                c2475.f7423.m4909();
            }
            m4999(viewM4998, c2531);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m4769(int i) {
        C2472 c2472 = this.f7267;
        c2472.f7380 = i;
        c2472.f7381 = this.f7269 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final int m4770(int i, C2531 c2531, C2525 c2525) {
        if (m4997() == 0 || i == 0) {
            return 0;
        }
        m4779(i, c2525);
        C2472 c2472 = this.f7267;
        int iM4775 = m4775(c2531, c2472, c2525);
        if (c2472.f7383 >= iM4775) {
            i = i < 0 ? -iM4775 : iM4775;
        }
        this.f7273.mo4842(-i);
        this.f7263 = this.f7269;
        c2472.f7383 = 0;
        m4767(c2531, c2472);
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m4771(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        boolean z = !this.f7281;
        return C8667.m14387(c2525, this.f7273, m4773(z), m4776(z), this, this.f7281, this.f7269);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final boolean m4772() {
        int iM4761;
        int iM4764;
        if (m4997() != 0 && this.f7260 != 0 && this.f7591) {
            if (this.f7269) {
                iM4761 = m4764();
                iM4764 = m4761();
            } else {
                iM4761 = m4761();
                iM4764 = m4764();
            }
            C2491 c2491 = this.f7261;
            if (iM4761 == 0 && m4781() != null) {
                c2491.m4917();
                this.f7590 = true;
                m5001();
                return true;
            }
            if (this.f7280) {
                int i = this.f7269 ? -1 : 1;
                int i2 = iM4764 + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4924 = c2491.m4924(iM4761, i2, i);
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4924 == null) {
                    this.f7280 = false;
                    c2491.m4925(i2);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49242 = c2491.m4924(iM4761, staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4924.f7285, i * (-1));
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49242 == null) {
                    c2491.m4925(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4924.f7285);
                } else {
                    c2491.m4925(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49242.f7285 + 1);
                }
                this.f7590 = true;
                m5001();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final View m4773(boolean z) {
        AbstractC2457 abstractC2457 = this.f7273;
        int iMo4845 = abstractC2457.mo4845();
        int iMo4844 = abstractC2457.mo4844();
        int iM4997 = m4997();
        View view = null;
        for (int i = 0; i < iM4997; i++) {
            View viewM4998 = m4998(i);
            int iMo4836 = abstractC2457.mo4836(viewM4998);
            if (abstractC2457.mo4839(viewM4998) > iMo4845 && iMo4836 < iMo4844) {
                if (iMo4836 >= iMo4845 || !z) {
                    return viewM4998;
                }
                if (view == null) {
                    view = viewM4998;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m4774(C2531 c2531, C2525 c2525, boolean z) {
        int iMo4844;
        int iM4763 = m4763(Integer.MIN_VALUE);
        if (iM4763 != Integer.MIN_VALUE && (iMo4844 = this.f7273.mo4844() - iM4763) > 0) {
            int i = iMo4844 - (-m4770(-iMo4844, c2531, c2525));
            if (!z || i <= 0) {
                return;
            }
            this.f7273.mo4842(i);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4775(androidx.recyclerview.widget.C2531 r23, androidx.recyclerview.widget.C2472 r24, androidx.recyclerview.widget.C2525 r25) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4775(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子世苏楪兰哲, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final View m4776(boolean z) {
        AbstractC2457 abstractC2457 = this.f7273;
        int iMo4845 = abstractC2457.mo4845();
        int iMo4844 = abstractC2457.mo4844();
        View view = null;
        for (int iM4997 = m4997() - 1; iM4997 >= 0; iM4997--) {
            View viewM4998 = m4998(iM4997);
            int iMo4836 = abstractC2457.mo4836(viewM4998);
            int iMo4839 = abstractC2457.mo4839(viewM4998);
            if (iMo4839 > iMo4845 && iMo4836 < iMo4844) {
                if (iMo4839 <= iMo4844 || !z) {
                    return viewM4998;
                }
                if (view == null) {
                    view = viewM4998;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4777(androidx.recyclerview.widget.C2531 r17, androidx.recyclerview.widget.C2525 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4777(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m4778(View view, int i, int i2) {
        Rect rect = this.f7277;
        m5014(rect, view);
        C2475 c2475 = (C2475) view.getLayoutParams();
        int iM4758 = m4758(i, ((ViewGroup.MarginLayoutParams) c2475).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c2475).rightMargin + rect.right);
        int iM47582 = m4758(i2, ((ViewGroup.MarginLayoutParams) c2475).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c2475).bottomMargin + rect.bottom);
        if (m5004(view, iM4758, iM47582, c2475)) {
            view.measure(iM4758, iM47582);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m4779(int i, C2525 c2525) {
        int iM4761;
        int i2;
        if (i > 0) {
            iM4761 = m4764();
            i2 = 1;
        } else {
            iM4761 = m4761();
            i2 = -1;
        }
        C2472 c2472 = this.f7267;
        c2472.f7384 = true;
        m4788(iM4761, c2525);
        m4769(i2);
        c2472.f7382 = iM4761 + c2472.f7381;
        c2472.f7383 = Math.abs(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final boolean m4780(int i) {
        if (this.f7271 == 0) {
            return (i == -1) != this.f7269;
        }
        return ((i == -1) == this.f7269) == m4782();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m4781() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4781():android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final boolean m4782() {
        return this.f7592.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo4611(int i, C2531 c2531, C2525 c2525) {
        return m4770(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo4666(int i) {
        SavedState savedState = this.f7258;
        if (savedState != null && savedState.f7295 != i) {
            savedState.f7288 = null;
            savedState.f7294 = 0;
            savedState.f7295 = -1;
            savedState.f7293 = -1;
        }
        this.f7264 = i;
        this.f7265 = Integer.MIN_VALUE;
        m5001();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo4667(RecyclerView recyclerView, int i) {
        C2459 c2459 = new C2459(recyclerView.getContext());
        c2459.f7317 = i;
        m5005(c2459);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final boolean mo4612() {
        return this.f7258 == null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void mo4783(int i) {
        if (i == 0) {
            m4772();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo4669() {
        int iM4912;
        int iMo4845;
        int[] iArr;
        SavedState savedState = this.f7258;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7294 = savedState.f7294;
            savedState2.f7295 = savedState.f7295;
            savedState2.f7293 = savedState.f7293;
            savedState2.f7288 = savedState.f7288;
            savedState2.f7287 = savedState.f7287;
            savedState2.f7291 = savedState.f7291;
            savedState2.f7289 = savedState.f7289;
            savedState2.f7290 = savedState.f7290;
            savedState2.f7286 = savedState.f7286;
            savedState2.f7292 = savedState.f7292;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f7289 = this.f7266;
        savedState3.f7290 = this.f7263;
        savedState3.f7286 = this.f7262;
        C2491 c2491 = this.f7261;
        if (c2491 == null || (iArr = (int[]) c2491.f7456) == null) {
            savedState3.f7287 = 0;
        } else {
            savedState3.f7291 = iArr;
            savedState3.f7287 = iArr.length;
            savedState3.f7292 = (ArrayList) c2491.f7455;
        }
        if (m4997() <= 0) {
            savedState3.f7295 = -1;
            savedState3.f7293 = -1;
            savedState3.f7294 = 0;
            return savedState3;
        }
        savedState3.f7295 = this.f7263 ? m4764() : m4761();
        View viewM4776 = this.f7269 ? m4776(true) : m4773(true);
        savedState3.f7293 = viewM4776 != null ? AbstractC2519.m4983(viewM4776) : -1;
        int i = this.f7275;
        savedState3.f7294 = i;
        savedState3.f7288 = new int[i];
        for (int i2 = 0; i2 < this.f7275; i2++) {
            boolean z = this.f7263;
            C2486[] c2486Arr = this.f7274;
            AbstractC2457 abstractC2457 = this.f7273;
            if (z) {
                iM4912 = c2486Arr[i2].m4907(Integer.MIN_VALUE);
                if (iM4912 != Integer.MIN_VALUE) {
                    iMo4845 = abstractC2457.mo4844();
                    iM4912 -= iMo4845;
                }
            } else {
                iM4912 = c2486Arr[i2].m4912(Integer.MIN_VALUE);
                if (iM4912 != Integer.MIN_VALUE) {
                    iMo4845 = abstractC2457.mo4845();
                    iM4912 -= iMo4845;
                }
            }
            savedState3.f7288[i2] = iM4912;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo4614(Rect rect, int i, int i2) {
        int iM4990;
        int iM49902;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7271 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7592;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            iM49902 = AbstractC2519.m4990(i2, iHeight, recyclerView.getMinimumHeight());
            iM4990 = AbstractC2519.m4990(i, (this.f7270 * this.f7275) + paddingRight, this.f7592.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7592;
            WeakHashMap weakHashMap2 = AbstractC2270.f6594;
            iM4990 = AbstractC2519.m4990(i, iWidth, recyclerView2.getMinimumWidth());
            iM49902 = AbstractC2519.m4990(i2, (this.f7270 * this.f7275) + paddingBottom, this.f7592.getMinimumHeight());
        }
        this.f7592.setMeasuredDimension(iM4990, iM49902);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4615(int i, C2531 c2531, C2525 c2525) {
        return m4770(i, c2531, c2525);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF mo4670(int r4) {
        /*
            r3 = this;
            int r0 = r3.m4997()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f7269
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m4761()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f7269
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f7271
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4670(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo4671(int i, int i2, C2525 c2525, C0920 c0920) {
        C2472 c2472;
        int iM4907;
        int iM4912;
        if (this.f7271 != 0) {
            i = i2;
        }
        if (m4997() == 0 || i == 0) {
            return;
        }
        m4779(i, c2525);
        int[] iArr = this.f7278;
        if (iArr == null || iArr.length < this.f7275) {
            this.f7278 = new int[this.f7275];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f7275;
            c2472 = this.f7267;
            if (i3 >= i5) {
                break;
            }
            if (c2472.f7381 == -1) {
                iM4907 = c2472.f7379;
                iM4912 = this.f7274[i3].m4912(iM4907);
            } else {
                iM4907 = this.f7274[i3].m4907(c2472.f7386);
                iM4912 = c2472.f7386;
            }
            int i6 = iM4907 - iM4912;
            if (i6 >= 0) {
                this.f7278[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f7278, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c2472.f7382;
            if (i8 < 0 || i8 >= c2525.m5025()) {
                return;
            }
            c0920.m1828(c2472.f7382, this.f7278[i7]);
            c2472.f7382 += c2472.f7381;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo4616(C2525 c2525) {
        return m4771(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo4617(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        boolean z = !this.f7281;
        return C8667.m14386(c2525, this.f7273, m4773(z), m4776(z), this, this.f7281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo4673(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        boolean z = !this.f7281;
        return C8667.m14369(c2525, this.f7273, m4773(z), m4776(z), this, this.f7281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4674(String str) {
        if (this.f7258 == null) {
            super.mo4674(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4675() {
        return this.f7271 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo4618(C2518 c2518) {
        return c2518 instanceof C2475;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo4676() {
        return this.f7271 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo4677(AccessibilityEvent accessibilityEvent) {
        super.mo4677(accessibilityEvent);
        if (m4997() > 0) {
            View viewM4773 = m4773(false);
            View viewM4776 = m4776(false);
            if (viewM4773 == null || viewM4776 == null) {
                return;
            }
            int iM4983 = AbstractC2519.m4983(viewM4773);
            int iM49832 = AbstractC2519.m4983(viewM4776);
            if (iM4983 < iM49832) {
                accessibilityEvent.setFromIndex(iM4983);
                accessibilityEvent.setToIndex(iM49832);
            } else {
                accessibilityEvent.setFromIndex(iM49832);
                accessibilityEvent.setToIndex(iM4983);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo4619(android.view.View r10, int r11, androidx.recyclerview.widget.C2531 r12, androidx.recyclerview.widget.C2525 r13) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4619(android.view.View, int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4678(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7592;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f7279);
        }
        for (int i = 0; i < this.f7275; i++) {
            this.f7274[i].m4902();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void mo4784(AbstractC2450 abstractC2450) {
        this.f7261.m4917();
        for (int i = 0; i < this.f7275; i++) {
            this.f7274[i].m4902();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void mo4785(int i) {
        super.mo4785(i);
        for (int i2 = 0; i2 < this.f7275; i2++) {
            C2486 c2486 = this.f7274[i2];
            int i3 = c2486.f7444;
            if (i3 != Integer.MIN_VALUE) {
                c2486.f7444 = i3 + i;
            }
            int i4 = c2486.f7443;
            if (i4 != Integer.MIN_VALUE) {
                c2486.f7443 = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo4620(C2531 c2531, C2525 c2525) {
        m4777(c2531, c2525, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo4621(RecyclerView recyclerView, int i, int i2) {
        m4760(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo4679(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7258 = savedState;
            if (this.f7264 != -1) {
                savedState.f7295 = -1;
                savedState.f7293 = -1;
                savedState.f7288 = null;
                savedState.f7294 = 0;
                savedState.f7287 = 0;
                savedState.f7291 = null;
                savedState.f7292 = null;
            }
            m5001();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo4622(C2525 c2525) {
        this.f7264 = -1;
        this.f7265 = Integer.MIN_VALUE;
        this.f7258 = null;
        this.f7276.m4893();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo4623(int i, int i2) {
        m4760(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo4624(int i, int i2) {
        m4760(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo4625(C2531 c2531, C2525 c2525, View view, C7607 c7607) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2475)) {
            m5018(view, c7607);
            return;
        }
        C2475 c2475 = (C2475) layoutParams;
        C2486 c2486 = c2475.f7423;
        if (this.f7271 == 0) {
            c7607.m12841(C7413.m12642(false, c2486 == null ? -1 : c2486.f7441, c2475.f7424 ? this.f7275 : 1, -1, -1));
        } else {
            c7607.m12841(C7413.m12642(false, -1, -1, c2486 == null ? -1 : c2486.f7441, c2475.f7424 ? this.f7275 : 1));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo4626(int i, int i2) {
        m4760(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo4627() {
        this.f7261.m4917();
        m5001();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo4628(C2531 c2531, C2525 c2525, C7607 c7607) {
        super.mo4628(c2531, c2525, c7607);
        c7607.m12843("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final boolean mo4680() {
        return this.f7266;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo4681() {
        return this.f7260 != 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void mo4786(int i) {
        super.mo4786(i);
        for (int i2 = 0; i2 < this.f7275; i2++) {
            C2486 c2486 = this.f7274[i2];
            int i3 = c2486.f7444;
            if (i3 != Integer.MIN_VALUE) {
                c2486.f7444 = i3 + i;
            }
            int i4 = c2486.f7443;
            if (i4 != Integer.MIN_VALUE) {
                c2486.f7443 = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m4787(C2486 c2486, int i, int i2) {
        int i3 = c2486.f7442;
        int i4 = c2486.f7441;
        if (i == -1) {
            int i5 = c2486.f7444;
            if (i5 == Integer.MIN_VALUE) {
                c2486.m4903();
                i5 = c2486.f7444;
            }
            if (i5 + i3 <= i2) {
                this.f7268.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c2486.f7443;
        if (i6 == Integer.MIN_VALUE) {
            c2486.m4904();
            i6 = c2486.f7443;
        }
        if (i6 - i3 >= i2) {
            this.f7268.set(i4, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m4788(int i, C2525 c2525) {
        int iMo4846;
        int iMo48462;
        int i2;
        C2472 c2472 = this.f7267;
        boolean z = false;
        c2472.f7383 = 0;
        c2472.f7382 = i;
        C2459 c2459 = this.f7586;
        AbstractC2457 abstractC2457 = this.f7273;
        if (c2459 == null || !c2459.f7313 || (i2 = c2525.f7613) == -1) {
            iMo4846 = 0;
            iMo48462 = 0;
        } else {
            if (this.f7269 == (i2 < i)) {
                iMo4846 = abstractC2457.mo4846();
                iMo48462 = 0;
            } else {
                iMo48462 = abstractC2457.mo4846();
                iMo4846 = 0;
            }
        }
        RecyclerView recyclerView = this.f7592;
        if (recyclerView == null || !recyclerView.f7226) {
            c2472.f7386 = abstractC2457.mo4835() + iMo4846;
            c2472.f7379 = -iMo48462;
        } else {
            c2472.f7379 = abstractC2457.mo4845() - iMo48462;
            c2472.f7386 = abstractC2457.mo4844() + iMo4846;
        }
        c2472.f7385 = false;
        c2472.f7384 = true;
        if (abstractC2457.mo4847() == 0 && abstractC2457.mo4835() == 0) {
            z = true;
        }
        c2472.f7387 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m4789(int i, int i2) {
        for (int i3 = 0; i3 < this.f7275; i3++) {
            if (!this.f7274[i3].f7445.isEmpty()) {
                m4787(this.f7274[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m4790(int i) {
        mo4674(null);
        if (i != this.f7275) {
            this.f7261.m4917();
            m5001();
            this.f7275 = i;
            this.f7268 = new BitSet(this.f7275);
            this.f7274 = new C2486[this.f7275];
            for (int i2 = 0; i2 < this.f7275; i2++) {
                this.f7274[i2] = new C2486(this, i2);
            }
            m5001();
        }
    }

    public StaggeredGridLayoutManager(int i) {
        this.f7275 = -1;
        this.f7266 = false;
        this.f7269 = false;
        this.f7264 = -1;
        this.f7265 = Integer.MIN_VALUE;
        this.f7261 = new C2491();
        this.f7260 = 2;
        this.f7277 = new Rect();
        this.f7276 = new C2474(this);
        this.f7280 = false;
        this.f7281 = true;
        this.f7279 = new RunnableC2504(this, 2);
        this.f7271 = 1;
        m4790(i);
        this.f7267 = new C2472();
        this.f7273 = AbstractC2457.m4849(this, this.f7271);
        this.f7272 = AbstractC2457.m4849(this, 1 - this.f7271);
    }
}
