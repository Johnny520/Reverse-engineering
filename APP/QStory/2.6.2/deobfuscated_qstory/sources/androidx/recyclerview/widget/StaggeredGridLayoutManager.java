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
import p124.C7412;
import p155.C7606;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2519 implements InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public SavedState f7257;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7258;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f7259;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2491 f7260;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7261;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7262;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7263;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f7264;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7265;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2472 f7266;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public BitSet f7267;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7268;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f7269;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int f7270;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC2457 f7271;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC2457 f7272;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2486[] f7273;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f7274;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C2474 f7275;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Rect f7276;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int[] f7277;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final RunnableC2504 f7278;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f7279;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean f7280;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2487();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f7285;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public int f7286;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int[] f7287;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public boolean f7288;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public boolean f7289;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int[] f7290;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public ArrayList f7291;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f7292;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public int f7293;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f7294;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7294);
            parcel.writeInt(this.f7292);
            parcel.writeInt(this.f7293);
            if (this.f7293 > 0) {
                parcel.writeIntArray(this.f7287);
            }
            parcel.writeInt(this.f7286);
            if (this.f7286 > 0) {
                parcel.writeIntArray(this.f7290);
            }
            parcel.writeInt(this.f7288 ? 1 : 0);
            parcel.writeInt(this.f7289 ? 1 : 0);
            parcel.writeInt(this.f7285 ? 1 : 0);
            parcel.writeList(this.f7291);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7274 = -1;
        this.f7265 = false;
        this.f7268 = false;
        this.f7263 = -1;
        this.f7264 = Integer.MIN_VALUE;
        this.f7260 = new C2491();
        this.f7259 = 2;
        this.f7276 = new Rect();
        this.f7275 = new C2474(this);
        this.f7279 = false;
        this.f7280 = true;
        this.f7278 = new RunnableC2504(this, 2);
        C2520 c2520M4972 = AbstractC2519.m4972(context, attributeSet, i, i2);
        int i3 = c2520M4972.f7597;
        if (i3 != 0 && i3 != 1) {
            C5919.m11249("invalid orientation.");
            throw null;
        }
        mo4664(null);
        if (i3 != this.f7270) {
            this.f7270 = i3;
            AbstractC2457 abstractC2457 = this.f7272;
            this.f7272 = this.f7271;
            this.f7271 = abstractC2457;
            m4991();
        }
        m4780(c2520M4972.f7596);
        boolean z = c2520M4972.f7595;
        mo4664(null);
        SavedState savedState = this.f7257;
        if (savedState != null && savedState.f7288 != z) {
            savedState.f7288 = z;
        }
        this.f7265 = z;
        m4991();
        this.f7266 = new C2472();
        this.f7272 = AbstractC2457.m4839(this, this.f7270);
        this.f7271 = AbstractC2457.m4839(this, 1 - this.f7270);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public static int m4748(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final int mo4590(C2531 c2531, C2525 c2525) {
        if (this.f7270 == 0) {
            return Math.min(this.f7274, c2525.m5015());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4591() {
        return this.f7270 == 0 ? new C2475(-2, -1) : new C2475(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo4592(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        boolean z = !this.f7280;
        return C8675.m14369(c2525, this.f7272, m4763(z), m4766(z), this, this.f7280);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo4593(C2525 c2525) {
        return m4761(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo4635(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        boolean z = !this.f7280;
        return C8675.m14371(c2525, this.f7272, m4763(z), m4766(z), this, this.f7280);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final int mo4594(C2531 c2531, C2525 c2525) {
        if (this.f7270 == 1) {
            return Math.min(this.f7274, c2525.m5015());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final C2518 mo4595(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2475((ViewGroup.MarginLayoutParams) layoutParams) : new C2475(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C2518 mo4596(Context context, AttributeSet attributeSet) {
        return new C2475(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final int m4749(int i) {
        int iM4902 = this.f7273[0].m4902(i);
        for (int i2 = 1; i2 < this.f7274; i2++) {
            int iM49022 = this.f7273[i2].m4902(i);
            if (iM49022 < iM4902) {
                iM4902 = iM49022;
            }
        }
        return iM4902;
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
    public final void m4750(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f7268
            if (r0 == 0) goto L9
            int r0 = r7.m4754()
            goto Ld
        L9:
            int r0 = r7.m4751()
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
            androidx.recyclerview.widget.飘花落叶言子哲苏楪兰世 r4 = r7.f7260
            r4.m4919(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.m4911(r8, r5)
            r4.m4917(r9, r5)
            goto L3a
        L33:
            r4.m4911(r8, r9)
            goto L3a
        L37:
            r4.m4917(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            goto L4f
        L3d:
            boolean r8 = r7.f7268
            if (r8 == 0) goto L46
            int r8 = r7.m4751()
            goto L4a
        L46:
            int r8 = r7.m4754()
        L4a:
            if (r3 > r8) goto L4f
            r7.m4991()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4750(int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final int m4751() {
        if (m4987() == 0) {
            return 0;
        }
        return AbstractC2519.m4973(m4988(0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m4752(C2531 c2531, C2525 c2525, boolean z) {
        int iMo4835;
        int iM4749 = m4749(Integer.MAX_VALUE);
        if (iM4749 != Integer.MAX_VALUE && (iMo4835 = iM4749 - this.f7272.mo4835()) > 0) {
            int iM4760 = iMo4835 - m4760(iMo4835, c2531, c2525);
            if (!z || iM4760 <= 0) {
                return;
            }
            this.f7272.mo4832(-iM4760);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final int m4753(int i) {
        int iM4897 = this.f7273[0].m4897(i);
        for (int i2 = 1; i2 < this.f7274; i2++) {
            int iM48972 = this.f7273[i2].m4897(i);
            if (iM48972 > iM4897) {
                iM4897 = iM48972;
            }
        }
        return iM4897;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final int m4754() {
        int iM4987 = m4987();
        if (iM4987 == 0) {
            return 0;
        }
        return AbstractC2519.m4973(m4988(iM4987 - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m4755(C2531 c2531, int i) {
        while (m4987() > 0) {
            View viewM4988 = m4988(0);
            AbstractC2457 abstractC2457 = this.f7272;
            if (abstractC2457.mo4829(viewM4988) > i || abstractC2457.mo4830(viewM4988) > i) {
                return;
            }
            C2475 c2475 = (C2475) viewM4988.getLayoutParams();
            if (c2475.f7423) {
                for (int i2 = 0; i2 < this.f7274; i2++) {
                    if (this.f7273[i2].f7444.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7274; i3++) {
                    this.f7273[i3].m4900();
                }
            } else if (c2475.f7422.f7444.size() == 1) {
                return;
            } else {
                c2475.f7422.m4900();
            }
            m4989(viewM4988, c2531);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m4756() {
        if (this.f7270 == 1 || !m4772()) {
            this.f7268 = this.f7265;
        } else {
            this.f7268 = !this.f7265;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m4757(C2531 c2531, C2472 c2472) {
        if (!c2472.f7383 || c2472.f7386) {
            return;
        }
        int i = c2472.f7382;
        int i2 = c2472.f7379;
        if (i == 0) {
            if (i2 == -1) {
                m4758(c2531, c2472.f7385);
                return;
            } else {
                m4755(c2531, c2472.f7378);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = c2472.f7378;
            int iM4902 = this.f7273[0].m4902(i4);
            while (i3 < this.f7274) {
                int iM49022 = this.f7273[i3].m4902(i4);
                if (iM49022 > iM4902) {
                    iM4902 = iM49022;
                }
                i3++;
            }
            int i5 = i4 - iM4902;
            int iMin = c2472.f7385;
            if (i5 >= 0) {
                iMin -= Math.min(i5, c2472.f7382);
            }
            m4758(c2531, iMin);
            return;
        }
        int i6 = c2472.f7385;
        int iM4897 = this.f7273[0].m4897(i6);
        while (i3 < this.f7274) {
            int iM48972 = this.f7273[i3].m4897(i6);
            if (iM48972 < iM4897) {
                iM4897 = iM48972;
            }
            i3++;
        }
        int i7 = iM4897 - c2472.f7385;
        int iMin2 = c2472.f7378;
        if (i7 >= 0) {
            iMin2 += Math.min(i7, c2472.f7382);
        }
        m4755(c2531, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m4758(C2531 c2531, int i) {
        for (int iM4987 = m4987() - 1; iM4987 >= 0; iM4987--) {
            View viewM4988 = m4988(iM4987);
            AbstractC2457 abstractC2457 = this.f7272;
            if (abstractC2457.mo4826(viewM4988) < i || abstractC2457.mo4831(viewM4988) < i) {
                return;
            }
            C2475 c2475 = (C2475) viewM4988.getLayoutParams();
            if (c2475.f7423) {
                for (int i2 = 0; i2 < this.f7274; i2++) {
                    if (this.f7273[i2].f7444.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f7274; i3++) {
                    this.f7273[i3].m4899();
                }
            } else if (c2475.f7422.f7444.size() == 1) {
                return;
            } else {
                c2475.f7422.m4899();
            }
            m4989(viewM4988, c2531);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public final void m4759(int i) {
        C2472 c2472 = this.f7266;
        c2472.f7379 = i;
        c2472.f7380 = this.f7268 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public final int m4760(int i, C2531 c2531, C2525 c2525) {
        if (m4987() == 0 || i == 0) {
            return 0;
        }
        m4769(i, c2525);
        C2472 c2472 = this.f7266;
        int iM4765 = m4765(c2531, c2472, c2525);
        if (c2472.f7382 >= iM4765) {
            i = i < 0 ? -iM4765 : iM4765;
        }
        this.f7272.mo4832(-i);
        this.f7262 = this.f7268;
        c2472.f7382 = 0;
        m4757(c2531, c2472);
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m4761(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        boolean z = !this.f7280;
        return C8675.m14368(c2525, this.f7272, m4763(z), m4766(z), this, this.f7280, this.f7268);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final boolean m4762() {
        int iM4751;
        int iM4754;
        if (m4987() != 0 && this.f7259 != 0 && this.f7590) {
            if (this.f7268) {
                iM4751 = m4754();
                iM4754 = m4751();
            } else {
                iM4751 = m4751();
                iM4754 = m4754();
            }
            C2491 c2491 = this.f7260;
            if (iM4751 == 0 && m4771() != null) {
                c2491.m4907();
                this.f7589 = true;
                m4991();
                return true;
            }
            if (this.f7279) {
                int i = this.f7268 ? -1 : 1;
                int i2 = iM4754 + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4914 = c2491.m4914(iM4751, i2, i);
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4914 == null) {
                    this.f7279 = false;
                    c2491.m4915(i2);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49142 = c2491.m4914(iM4751, staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4914.f7284, i * (-1));
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49142 == null) {
                    c2491.m4915(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4914.f7284);
                } else {
                    c2491.m4915(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM49142.f7284 + 1);
                }
                this.f7589 = true;
                m4991();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final View m4763(boolean z) {
        AbstractC2457 abstractC2457 = this.f7272;
        int iMo4835 = abstractC2457.mo4835();
        int iMo4834 = abstractC2457.mo4834();
        int iM4987 = m4987();
        View view = null;
        for (int i = 0; i < iM4987; i++) {
            View viewM4988 = m4988(i);
            int iMo4826 = abstractC2457.mo4826(viewM4988);
            if (abstractC2457.mo4829(viewM4988) > iMo4835 && iMo4826 < iMo4834) {
                if (iMo4826 >= iMo4835 || !z) {
                    return viewM4988;
                }
                if (view == null) {
                    view = viewM4988;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m4764(C2531 c2531, C2525 c2525, boolean z) {
        int iMo4834;
        int iM4753 = m4753(Integer.MIN_VALUE);
        if (iM4753 != Integer.MIN_VALUE && (iMo4834 = this.f7272.mo4834() - iM4753) > 0) {
            int i = iMo4834 - (-m4760(-iMo4834, c2531, c2525));
            if (!z || i <= 0) {
                return;
            }
            this.f7272.mo4832(i);
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
    public final int m4765(androidx.recyclerview.widget.C2531 r23, androidx.recyclerview.widget.C2472 r24, androidx.recyclerview.widget.C2525 r25) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4765(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子世苏楪兰哲, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final View m4766(boolean z) {
        AbstractC2457 abstractC2457 = this.f7272;
        int iMo4835 = abstractC2457.mo4835();
        int iMo4834 = abstractC2457.mo4834();
        View view = null;
        for (int iM4987 = m4987() - 1; iM4987 >= 0; iM4987--) {
            View viewM4988 = m4988(iM4987);
            int iMo4826 = abstractC2457.mo4826(viewM4988);
            int iMo4829 = abstractC2457.mo4829(viewM4988);
            if (iMo4829 > iMo4835 && iMo4826 < iMo4834) {
                if (iMo4829 <= iMo4834 || !z) {
                    return viewM4988;
                }
                if (view == null) {
                    view = viewM4988;
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
    public final void m4767(androidx.recyclerview.widget.C2531 r17, androidx.recyclerview.widget.C2525 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4767(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m4768(View view, int i, int i2) {
        Rect rect = this.f7276;
        m5004(rect, view);
        C2475 c2475 = (C2475) view.getLayoutParams();
        int iM4748 = m4748(i, ((ViewGroup.MarginLayoutParams) c2475).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c2475).rightMargin + rect.right);
        int iM47482 = m4748(i2, ((ViewGroup.MarginLayoutParams) c2475).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c2475).bottomMargin + rect.bottom);
        if (m4994(view, iM4748, iM47482, c2475)) {
            view.measure(iM4748, iM47482);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final void m4769(int i, C2525 c2525) {
        int iM4751;
        int i2;
        if (i > 0) {
            iM4751 = m4754();
            i2 = 1;
        } else {
            iM4751 = m4751();
            i2 = -1;
        }
        C2472 c2472 = this.f7266;
        c2472.f7383 = true;
        m4778(iM4751, c2525);
        m4759(i2);
        c2472.f7381 = iM4751 + c2472.f7380;
        c2472.f7382 = Math.abs(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final boolean m4770(int i) {
        if (this.f7270 == 0) {
            return (i == -1) != this.f7268;
        }
        return ((i == -1) == this.f7268) == m4772();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m4771() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4771():android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final boolean m4772() {
        return this.f7591.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo4601(int i, C2531 c2531, C2525 c2525) {
        return m4760(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo4656(int i) {
        SavedState savedState = this.f7257;
        if (savedState != null && savedState.f7294 != i) {
            savedState.f7287 = null;
            savedState.f7293 = 0;
            savedState.f7294 = -1;
            savedState.f7292 = -1;
        }
        this.f7263 = i;
        this.f7264 = Integer.MIN_VALUE;
        m4991();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo4657(RecyclerView recyclerView, int i) {
        C2459 c2459 = new C2459(recyclerView.getContext());
        c2459.f7316 = i;
        m4995(c2459);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final boolean mo4602() {
        return this.f7257 == null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void mo4773(int i) {
        if (i == 0) {
            m4762();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo4659() {
        int iM4902;
        int iMo4835;
        int[] iArr;
        SavedState savedState = this.f7257;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7293 = savedState.f7293;
            savedState2.f7294 = savedState.f7294;
            savedState2.f7292 = savedState.f7292;
            savedState2.f7287 = savedState.f7287;
            savedState2.f7286 = savedState.f7286;
            savedState2.f7290 = savedState.f7290;
            savedState2.f7288 = savedState.f7288;
            savedState2.f7289 = savedState.f7289;
            savedState2.f7285 = savedState.f7285;
            savedState2.f7291 = savedState.f7291;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f7288 = this.f7265;
        savedState3.f7289 = this.f7262;
        savedState3.f7285 = this.f7261;
        C2491 c2491 = this.f7260;
        if (c2491 == null || (iArr = (int[]) c2491.f7455) == null) {
            savedState3.f7286 = 0;
        } else {
            savedState3.f7290 = iArr;
            savedState3.f7286 = iArr.length;
            savedState3.f7291 = (ArrayList) c2491.f7454;
        }
        if (m4987() <= 0) {
            savedState3.f7294 = -1;
            savedState3.f7292 = -1;
            savedState3.f7293 = 0;
            return savedState3;
        }
        savedState3.f7294 = this.f7262 ? m4754() : m4751();
        View viewM4766 = this.f7268 ? m4766(true) : m4763(true);
        savedState3.f7292 = viewM4766 != null ? AbstractC2519.m4973(viewM4766) : -1;
        int i = this.f7274;
        savedState3.f7293 = i;
        savedState3.f7287 = new int[i];
        for (int i2 = 0; i2 < this.f7274; i2++) {
            boolean z = this.f7262;
            C2486[] c2486Arr = this.f7273;
            AbstractC2457 abstractC2457 = this.f7272;
            if (z) {
                iM4902 = c2486Arr[i2].m4897(Integer.MIN_VALUE);
                if (iM4902 != Integer.MIN_VALUE) {
                    iMo4835 = abstractC2457.mo4834();
                    iM4902 -= iMo4835;
                }
            } else {
                iM4902 = c2486Arr[i2].m4902(Integer.MIN_VALUE);
                if (iM4902 != Integer.MIN_VALUE) {
                    iMo4835 = abstractC2457.mo4835();
                    iM4902 -= iMo4835;
                }
            }
            savedState3.f7287[i2] = iM4902;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo4604(Rect rect, int i, int i2) {
        int iM4980;
        int iM49802;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7270 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7591;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            iM49802 = AbstractC2519.m4980(i2, iHeight, recyclerView.getMinimumHeight());
            iM4980 = AbstractC2519.m4980(i, (this.f7269 * this.f7274) + paddingRight, this.f7591.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7591;
            WeakHashMap weakHashMap2 = AbstractC2270.f6593;
            iM4980 = AbstractC2519.m4980(i, iWidth, recyclerView2.getMinimumWidth());
            iM49802 = AbstractC2519.m4980(i2, (this.f7269 * this.f7274) + paddingBottom, this.f7591.getMinimumHeight());
        }
        this.f7591.setMeasuredDimension(iM4980, iM49802);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4605(int i, C2531 c2531, C2525 c2525) {
        return m4760(i, c2531, c2525);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF mo4660(int r4) {
        /*
            r3 = this;
            int r0 = r3.m4987()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f7268
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m4751()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f7268
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f7270
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4660(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo4661(int i, int i2, C2525 c2525, C0920 c0920) {
        C2472 c2472;
        int iM4897;
        int iM4902;
        if (this.f7270 != 0) {
            i = i2;
        }
        if (m4987() == 0 || i == 0) {
            return;
        }
        m4769(i, c2525);
        int[] iArr = this.f7277;
        if (iArr == null || iArr.length < this.f7274) {
            this.f7277 = new int[this.f7274];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f7274;
            c2472 = this.f7266;
            if (i3 >= i5) {
                break;
            }
            if (c2472.f7380 == -1) {
                iM4897 = c2472.f7378;
                iM4902 = this.f7273[i3].m4902(iM4897);
            } else {
                iM4897 = this.f7273[i3].m4897(c2472.f7385);
                iM4902 = c2472.f7385;
            }
            int i6 = iM4897 - iM4902;
            if (i6 >= 0) {
                this.f7277[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f7277, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c2472.f7381;
            if (i8 < 0 || i8 >= c2525.m5015()) {
                return;
            }
            c0920.m1818(c2472.f7381, this.f7277[i7]);
            c2472.f7381 += c2472.f7380;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo4606(C2525 c2525) {
        return m4761(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo4607(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        boolean z = !this.f7280;
        return C8675.m14369(c2525, this.f7272, m4763(z), m4766(z), this, this.f7280);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo4663(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        boolean z = !this.f7280;
        return C8675.m14371(c2525, this.f7272, m4763(z), m4766(z), this, this.f7280);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4664(String str) {
        if (this.f7257 == null) {
            super.mo4664(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4665() {
        return this.f7270 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo4608(C2518 c2518) {
        return c2518 instanceof C2475;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo4666() {
        return this.f7270 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo4667(AccessibilityEvent accessibilityEvent) {
        super.mo4667(accessibilityEvent);
        if (m4987() > 0) {
            View viewM4763 = m4763(false);
            View viewM4766 = m4766(false);
            if (viewM4763 == null || viewM4766 == null) {
                return;
            }
            int iM4973 = AbstractC2519.m4973(viewM4763);
            int iM49732 = AbstractC2519.m4973(viewM4766);
            if (iM4973 < iM49732) {
                accessibilityEvent.setFromIndex(iM4973);
                accessibilityEvent.setToIndex(iM49732);
            } else {
                accessibilityEvent.setFromIndex(iM49732);
                accessibilityEvent.setToIndex(iM4973);
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
    public final android.view.View mo4609(android.view.View r10, int r11, androidx.recyclerview.widget.C2531 r12, androidx.recyclerview.widget.C2525 r13) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4609(android.view.View, int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4668(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7591;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f7278);
        }
        for (int i = 0; i < this.f7274; i++) {
            this.f7273[i].m4892();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void mo4774(AbstractC2450 abstractC2450) {
        this.f7260.m4907();
        for (int i = 0; i < this.f7274; i++) {
            this.f7273[i].m4892();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void mo4775(int i) {
        super.mo4775(i);
        for (int i2 = 0; i2 < this.f7274; i2++) {
            C2486 c2486 = this.f7273[i2];
            int i3 = c2486.f7443;
            if (i3 != Integer.MIN_VALUE) {
                c2486.f7443 = i3 + i;
            }
            int i4 = c2486.f7442;
            if (i4 != Integer.MIN_VALUE) {
                c2486.f7442 = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo4610(C2531 c2531, C2525 c2525) {
        m4767(c2531, c2525, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo4611(RecyclerView recyclerView, int i, int i2) {
        m4750(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo4669(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7257 = savedState;
            if (this.f7263 != -1) {
                savedState.f7294 = -1;
                savedState.f7292 = -1;
                savedState.f7287 = null;
                savedState.f7293 = 0;
                savedState.f7286 = 0;
                savedState.f7290 = null;
                savedState.f7291 = null;
            }
            m4991();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo4612(C2525 c2525) {
        this.f7263 = -1;
        this.f7264 = Integer.MIN_VALUE;
        this.f7257 = null;
        this.f7275.m4883();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo4613(int i, int i2) {
        m4750(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo4614(int i, int i2) {
        m4750(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo4615(C2531 c2531, C2525 c2525, View view, C7606 c7606) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2475)) {
            m5008(view, c7606);
            return;
        }
        C2475 c2475 = (C2475) layoutParams;
        C2486 c2486 = c2475.f7422;
        if (this.f7270 == 0) {
            c7606.m12812(C7412.m12615(false, c2486 == null ? -1 : c2486.f7440, c2475.f7423 ? this.f7274 : 1, -1, -1));
        } else {
            c7606.m12812(C7412.m12615(false, -1, -1, c2486 == null ? -1 : c2486.f7440, c2475.f7423 ? this.f7274 : 1));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo4616(int i, int i2) {
        m4750(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo4617() {
        this.f7260.m4907();
        m4991();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo4618(C2531 c2531, C2525 c2525, C7606 c7606) {
        super.mo4618(c2531, c2525, c7606);
        c7606.m12814("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final boolean mo4670() {
        return this.f7265;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo4671() {
        return this.f7259 != 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void mo4776(int i) {
        super.mo4776(i);
        for (int i2 = 0; i2 < this.f7274; i2++) {
            C2486 c2486 = this.f7273[i2];
            int i3 = c2486.f7443;
            if (i3 != Integer.MIN_VALUE) {
                c2486.f7443 = i3 + i;
            }
            int i4 = c2486.f7442;
            if (i4 != Integer.MIN_VALUE) {
                c2486.f7442 = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m4777(C2486 c2486, int i, int i2) {
        int i3 = c2486.f7441;
        int i4 = c2486.f7440;
        if (i == -1) {
            int i5 = c2486.f7443;
            if (i5 == Integer.MIN_VALUE) {
                c2486.m4893();
                i5 = c2486.f7443;
            }
            if (i5 + i3 <= i2) {
                this.f7267.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c2486.f7442;
        if (i6 == Integer.MIN_VALUE) {
            c2486.m4894();
            i6 = c2486.f7442;
        }
        if (i6 - i3 >= i2) {
            this.f7267.set(i4, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    public final void m4778(int i, C2525 c2525) {
        int iMo4836;
        int iMo48362;
        int i2;
        C2472 c2472 = this.f7266;
        boolean z = false;
        c2472.f7382 = 0;
        c2472.f7381 = i;
        C2459 c2459 = this.f7585;
        AbstractC2457 abstractC2457 = this.f7272;
        if (c2459 == null || !c2459.f7312 || (i2 = c2525.f7612) == -1) {
            iMo4836 = 0;
            iMo48362 = 0;
        } else {
            if (this.f7268 == (i2 < i)) {
                iMo4836 = abstractC2457.mo4836();
                iMo48362 = 0;
            } else {
                iMo48362 = abstractC2457.mo4836();
                iMo4836 = 0;
            }
        }
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null || !recyclerView.f7225) {
            c2472.f7385 = abstractC2457.mo4825() + iMo4836;
            c2472.f7378 = -iMo48362;
        } else {
            c2472.f7378 = abstractC2457.mo4835() - iMo48362;
            c2472.f7385 = abstractC2457.mo4834() + iMo4836;
        }
        c2472.f7384 = false;
        c2472.f7383 = true;
        if (abstractC2457.mo4837() == 0 && abstractC2457.mo4825() == 0) {
            z = true;
        }
        c2472.f7386 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public final void m4779(int i, int i2) {
        for (int i3 = 0; i3 < this.f7274; i3++) {
            if (!this.f7273[i3].f7444.isEmpty()) {
                m4777(this.f7273[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public final void m4780(int i) {
        mo4664(null);
        if (i != this.f7274) {
            this.f7260.m4907();
            m4991();
            this.f7274 = i;
            this.f7267 = new BitSet(this.f7274);
            this.f7273 = new C2486[this.f7274];
            for (int i2 = 0; i2 < this.f7274; i2++) {
                this.f7273[i2] = new C2486(this, i2);
            }
            m4991();
        }
    }

    public StaggeredGridLayoutManager(int i) {
        this.f7274 = -1;
        this.f7265 = false;
        this.f7268 = false;
        this.f7263 = -1;
        this.f7264 = Integer.MIN_VALUE;
        this.f7260 = new C2491();
        this.f7259 = 2;
        this.f7276 = new Rect();
        this.f7275 = new C2474(this);
        this.f7279 = false;
        this.f7280 = true;
        this.f7278 = new RunnableC2504(this, 2);
        this.f7270 = 1;
        m4780(i);
        this.f7266 = new C2472();
        this.f7272 = AbstractC2457.m4839(this, this.f7270);
        this.f7271 = AbstractC2457.m4839(this, 1 - this.f7270);
    }
}
