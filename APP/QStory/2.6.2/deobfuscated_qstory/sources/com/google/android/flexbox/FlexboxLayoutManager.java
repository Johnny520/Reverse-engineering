package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2457;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2456;
import androidx.recyclerview.widget.C2459;
import androidx.recyclerview.widget.C2518;
import androidx.recyclerview.widget.C2520;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;
import androidx.recyclerview.widget.InterfaceC2522;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends AbstractC2519 implements InterfaceC3081, InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final Rect f9854 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f9855;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f9856;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC2457 f9857;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC2457 f9858;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f9859;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public SavedState f9860;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C3085 f9861;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C3083 f9862;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C2525 f9865;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C2531 f9866;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f9867;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f9868;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f9870;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f9871;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f9872;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseArray f9873;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f9874;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f9875;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C3079 f9876;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Context f9877;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public View f9878;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int f9869 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f9864 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3077 f9863 = new C3077(this);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class LayoutParams extends C2518 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3082();

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        public boolean f9879;

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
        public int f9880;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
        public int f9881;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public int f9882;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f9883;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public float f9884;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f9885;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public float f9886;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f9887;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f9883);
            parcel.writeFloat(this.f9886);
            parcel.writeInt(this.f9887);
            parcel.writeFloat(this.f9884);
            parcel.writeInt(this.f9885);
            parcel.writeInt(this.f9882);
            parcel.writeInt(this.f9881);
            parcel.writeInt(this.f9880);
            parcel.writeByte(this.f9879 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
        public final int mo6915() {
            return this.f9881;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
        public final int mo6916() {
            return this.f9880;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final boolean mo6917() {
            return this.f9879;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo6918() {
            return this.f9884;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo6919() {
            return this.f9883;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final int mo6920() {
            return this.f9882;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
        public final int mo6921() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
        public final int mo6922() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final int mo6923() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
        public final int mo6924() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
        public final void mo6925(int i) {
            this.f9882 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo6926() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo6927() {
            return this.f9887;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo6928(int i) {
            this.f9885 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo6929() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo6930() {
            return this.f9886;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo6931() {
            return this.f9885;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3086();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f9888;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f9889;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f9889);
            sb.append(", mAnchorOffset=");
            return AbstractC0053.m154(sb, this.f9888, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9889);
            parcel.writeInt(this.f9888);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C3083 c3083 = new C3083(this);
        this.f9862 = c3083;
        this.f9859 = -1;
        this.f9855 = Integer.MIN_VALUE;
        this.f9856 = Integer.MIN_VALUE;
        this.f9874 = Integer.MIN_VALUE;
        this.f9873 = new SparseArray();
        this.f9875 = -1;
        this.f9876 = new C3079();
        C2520 c2520M4972 = AbstractC2519.m4972(context, attributeSet, i, i2);
        int i3 = c2520M4972.f7597;
        if (i3 != 0) {
            if (i3 == 1) {
                if (c2520M4972.f7595) {
                    m6972(3);
                } else {
                    m6972(2);
                }
            }
        } else if (c2520M4972.f7595) {
            m6972(1);
        } else {
            m6972(0);
        }
        int i4 = this.f9871;
        if (i4 != 1) {
            if (i4 == 0) {
                m4996();
                this.f9864.clear();
                C3083.m6999(c3083);
                c3083.f9919 = 0;
            }
            this.f9871 = 1;
            this.f9858 = null;
            this.f9857 = null;
            m4991();
        }
        if (this.f9870 != 4) {
            m4996();
            this.f9864.clear();
            C3083.m6999(c3083);
            c3083.f9919 = 0;
            this.f9870 = 4;
            m4991();
        }
        this.f9877 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m6953(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getAlignItems() {
        return this.f9870;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getFlexDirection() {
        return this.f9872;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getFlexItemCount() {
        return this.f9865.m5015();
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final List getFlexLinesInternal() {
        return this.f9864;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getFlexWrap() {
        return this.f9871;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getLargestMainSize() {
        if (this.f9864.size() == 0) {
            return 0;
        }
        int size = this.f9864.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((C3080) this.f9864.get(i)).f9900);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getMaxLine() {
        return this.f9869;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final int getSumOfCrossSize() {
        int size = this.f9864.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C3080) this.f9864.get(i2)).f9912;
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public final void setFlexLines(List list) {
        this.f9864 = list;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4591() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f9883 = 0.0f;
        layoutParams.f9886 = 1.0f;
        layoutParams.f9887 = -1;
        layoutParams.f9884 = -1.0f;
        layoutParams.f9881 = 16777215;
        layoutParams.f9880 = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo4592(C2525 c2525) {
        return m6967(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo4593(C2525 c2525) {
        return m6963(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo4635(C2525 c2525) {
        return m6964(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C2518 mo4596(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f9883 = 0.0f;
        layoutParams.f9886 = 1.0f;
        layoutParams.f9887 = -1;
        layoutParams.f9884 = -1.0f;
        layoutParams.f9881 = 16777215;
        layoutParams.f9880 = 16777215;
        return layoutParams;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final View m6954(int i, int i2, int i3) {
        int iM4973;
        m6968();
        if (this.f9861 == null) {
            C3085 c3085 = new C3085();
            c3085.f9933 = 1;
            this.f9861 = c3085;
        }
        int iMo4835 = this.f9858.mo4835();
        int iMo4834 = this.f9858.mo4834();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM4988 = m4988(i);
            if (viewM4988 != null && (iM4973 = AbstractC2519.m4973(viewM4988)) >= 0 && iM4973 < i3) {
                if (((C2518) viewM4988.getLayoutParams()).f7578.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM4988;
                    }
                } else {
                    if (this.f9858.mo4826(viewM4988) >= iMo4835 && this.f9858.mo4829(viewM4988) <= iMo4834) {
                        return viewM4988;
                    }
                    if (view == null) {
                        view = viewM4988;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m6955(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iM6974;
        int iMo4834;
        if (mo6952() || !this.f9868) {
            int iMo48342 = this.f9858.mo4834() - i;
            if (iMo48342 <= 0) {
                return 0;
            }
            iM6974 = -m6974(-iMo48342, c2531, c2525);
        } else {
            int iMo4835 = i - this.f9858.mo4835();
            if (iMo4835 <= 0) {
                return 0;
            }
            iM6974 = m6974(iMo4835, c2531, c2525);
        }
        int i2 = i + iM6974;
        if (!z || (iMo4834 = this.f9858.mo4834() - i2) <= 0) {
            return iM6974;
        }
        this.f9858.mo4832(iMo4834);
        return iMo4834 + iM6974;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final View m6956(int i) {
        View viewM6954 = m6954(m4987() - 1, -1, i);
        if (viewM6954 == null) {
            return null;
        }
        return m6959(viewM6954, (C3080) this.f9864.get(this.f9863.f9892[AbstractC2519.m4973(viewM6954)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m6957(android.view.View r6, com.google.android.flexbox.C3080 r7) {
        /*
            r5 = this;
            boolean r0 = r5.mo6952()
            int r7 = r7.f9911
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.m4988(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f9868
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9858
            int r3 = r3.mo4829(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9858
            int r4 = r4.mo4829(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9858
            int r3 = r3.mo4826(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9858
            int r4 = r4.mo4826(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6957(android.view.View, com.google.android.flexbox.飘花落叶言子楪世苏兰哲):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m6958(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewM4988 = m4988(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f7580 - getPaddingRight();
            int paddingBottom = this.f7579 - getPaddingBottom();
            int iM4978 = AbstractC2519.m4978(viewM4988) - ((ViewGroup.MarginLayoutParams) ((C2518) viewM4988.getLayoutParams())).leftMargin;
            int iM4971 = AbstractC2519.m4971(viewM4988) - ((ViewGroup.MarginLayoutParams) ((C2518) viewM4988.getLayoutParams())).topMargin;
            int iM4975 = AbstractC2519.m4975(viewM4988) + ((ViewGroup.MarginLayoutParams) ((C2518) viewM4988.getLayoutParams())).rightMargin;
            int iM4976 = AbstractC2519.m4976(viewM4988) + ((ViewGroup.MarginLayoutParams) ((C2518) viewM4988.getLayoutParams())).bottomMargin;
            boolean z = iM4978 >= paddingRight || iM4975 >= paddingLeft;
            boolean z2 = iM4971 >= paddingBottom || iM4976 >= paddingTop;
            if (z && z2) {
                return viewM4988;
            }
            i += i3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m6959(android.view.View r6, com.google.android.flexbox.C3080 r7) {
        /*
            r5 = this;
            boolean r0 = r5.mo6952()
            int r1 = r5.m4987()
            int r1 = r1 + (-2)
            int r2 = r5.m4987()
            int r7 = r7.f9911
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.m4988(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f9868
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9858
            int r3 = r3.mo4826(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9858
            int r4 = r4.mo4826(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9858
            int r3 = r3.mo4829(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9858
            int r4 = r4.mo4829(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6959(android.view.View, com.google.android.flexbox.飘花落叶言子楪世苏兰哲):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m6960(C3083 c3083, boolean z, boolean z2) {
        if (z2) {
            int i = mo6952() ? this.f7581 : this.f7582;
            this.f9861.f9931 = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.f9861.f9931 = false;
        }
        if (mo6952() || !this.f9868) {
            this.f9861.f9932 = c3083.f9920 - this.f9858.mo4835();
        } else {
            this.f9861.f9932 = (this.f9878.getWidth() - c3083.f9920) - this.f9858.mo4835();
        }
        C3085 c3085 = this.f9861;
        c3085.f9929 = c3083.f9922;
        c3085.f9933 = -1;
        c3085.f9928 = c3083.f9920;
        c3085.f9927 = Integer.MIN_VALUE;
        int i2 = c3083.f9921;
        c3085.f9930 = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.f9864.size();
        int i3 = c3083.f9921;
        if (size > i3) {
            C3080 c3080 = (C3080) this.f9864.get(i3);
            C3085 c30852 = this.f9861;
            c30852.f9930--;
            c30852.f9929 -= c3080.f9911;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m6961(int i) {
        View viewM6958 = m6958(m4987() - 1, -1);
        if (i >= (viewM6958 != null ? AbstractC2519.m4973(viewM6958) : -1)) {
            return;
        }
        int iM4987 = m4987();
        C3077 c3077 = this.f9863;
        c3077.m6996(iM4987);
        c3077.m6993(iM4987);
        c3077.m6995(iM4987);
        if (i >= c3077.f9892.length) {
            return;
        }
        this.f9875 = i;
        View viewM4988 = m4988(0);
        if (viewM4988 == null) {
            return;
        }
        this.f9859 = AbstractC2519.m4973(viewM4988);
        if (mo6952() || !this.f9868) {
            this.f9855 = this.f9858.mo4826(viewM4988) - this.f9858.mo4835();
        } else {
            this.f9855 = this.f9858.mo4833() + this.f9858.mo4829(viewM4988);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m6962(C3083 c3083, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = mo6952() ? this.f7581 : this.f7582;
            this.f9861.f9931 = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.f9861.f9931 = false;
        }
        if (mo6952() || !this.f9868) {
            this.f9861.f9932 = this.f9858.mo4834() - c3083.f9920;
        } else {
            this.f9861.f9932 = c3083.f9920 - getPaddingRight();
        }
        C3085 c3085 = this.f9861;
        c3085.f9929 = c3083.f9922;
        c3085.f9933 = 1;
        c3085.f9928 = c3083.f9920;
        c3085.f9927 = Integer.MIN_VALUE;
        c3085.f9930 = c3083.f9921;
        if (!z || this.f9864.size() <= 1 || (i = c3083.f9921) < 0 || i >= this.f9864.size() - 1) {
            return;
        }
        C3080 c3080 = (C3080) this.f9864.get(c3083.f9921);
        C3085 c30852 = this.f9861;
        c30852.f9930++;
        c30852.f9929 += c3080.f9911;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m6963(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        int iM5015 = c2525.m5015();
        View viewM6966 = m6966(iM5015);
        View viewM6956 = m6956(iM5015);
        if (c2525.m5015() == 0 || viewM6966 == null || viewM6956 == null) {
            return 0;
        }
        int iM4973 = AbstractC2519.m4973(viewM6966);
        int iM49732 = AbstractC2519.m4973(viewM6956);
        int iAbs = Math.abs(this.f9858.mo4829(viewM6956) - this.f9858.mo4826(viewM6966));
        int i = this.f9863.f9892[iM4973];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iM49732] - i) + 1))) + (this.f9858.mo4835() - this.f9858.mo4826(viewM6966)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final int m6964(C2525 c2525) {
        if (m4987() == 0) {
            return 0;
        }
        int iM5015 = c2525.m5015();
        m6968();
        View viewM6966 = m6966(iM5015);
        View viewM6956 = m6956(iM5015);
        if (c2525.m5015() == 0 || viewM6966 == null || viewM6956 == null) {
            return 0;
        }
        return Math.min(this.f9858.mo4836(), this.f9858.mo4829(viewM6956) - this.f9858.mo4826(viewM6966));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m6965(C2531 c2531, C2525 c2525, C3085 c3085) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Rect rect3;
        int i13;
        int i14 = c3085.f9927;
        if (i14 != Integer.MIN_VALUE) {
            int i15 = c3085.f9932;
            if (i15 < 0) {
                c3085.f9927 = i14 + i15;
            }
            m6969(c2531, c3085);
        }
        int i16 = c3085.f9932;
        boolean zMo6952 = mo6952();
        int i17 = i16;
        int i18 = 0;
        while (true) {
            if (i17 <= 0 && !this.f9861.f9931) {
                break;
            }
            List list = this.f9864;
            int i19 = c3085.f9929;
            if (i19 < 0 || i19 >= c2525.m5015() || (i = c3085.f9930) < 0 || i >= list.size()) {
                break;
            }
            C3080 c3080 = (C3080) this.f9864.get(c3085.f9930);
            c3085.f9929 = c3080.f9909;
            boolean zMo69522 = mo6952();
            C3083 c3083 = this.f9862;
            Rect rect4 = f9854;
            C3077 c3077 = this.f9863;
            if (zMo69522) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i20 = this.f7580;
                int i21 = c3085.f9928;
                if (c3085.f9933 == -1) {
                    i21 -= c3080.f9912;
                }
                int i22 = i21;
                int i23 = c3085.f9929;
                float f = c3083.f9919;
                float f2 = paddingLeft - f;
                float measuredWidth = (i20 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i24 = c3080.f9911;
                i2 = i16;
                int i25 = i23;
                int i26 = 0;
                while (i25 < i23 + i24) {
                    int i27 = i23;
                    View viewMo6932 = mo6932(i25);
                    if (viewMo6932 == null) {
                        i13 = i27;
                        z2 = zMo6952;
                        i11 = i24;
                        i12 = i25;
                        rect3 = rect4;
                    } else {
                        z2 = zMo6952;
                        if (c3085.f9933 == 1) {
                            m5004(rect4, viewMo6932);
                            m5005(viewMo6932);
                        } else {
                            m5004(rect4, viewMo6932);
                            m5003(viewMo6932, i26, false);
                            i26++;
                        }
                        int i28 = i26;
                        float f3 = measuredWidth;
                        long j = c3077.f9891[i25];
                        int i29 = (int) j;
                        int i30 = (int) (j >> 32);
                        if (m6971(viewMo6932, i29, i30, (LayoutParams) viewMo6932.getLayoutParams())) {
                            viewMo6932.measure(i29, i30);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((C2518) viewMo6932.getLayoutParams()).f7576.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C2518) viewMo6932.getLayoutParams()).f7576.right);
                        int i31 = i22 + ((C2518) viewMo6932.getLayoutParams()).f7576.top;
                        boolean z3 = this.f9868;
                        i11 = i24;
                        C3077 c30772 = this.f9863;
                        if (z3) {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c30772.m6989(viewMo6932, c3080, Math.round(f5) - viewMo6932.getMeasuredWidth(), i31, Math.round(f5), viewMo6932.getMeasuredHeight() + i31);
                        } else {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c30772.m6989(viewMo6932, c3080, Math.round(f4), i31, viewMo6932.getMeasuredWidth() + Math.round(f4), viewMo6932.getMeasuredHeight() + i31);
                        }
                        float measuredWidth2 = viewMo6932.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C2518) viewMo6932.getLayoutParams()).f7576.right + fMax + f4;
                        measuredWidth = f5 - (((viewMo6932.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((C2518) viewMo6932.getLayoutParams()).f7576.left) + fMax);
                        f2 = measuredWidth2;
                        i26 = i28;
                    }
                    i25 = i12 + 1;
                    zMo6952 = z2;
                    i24 = i11;
                    i23 = i13;
                    rect4 = rect3;
                }
                z = zMo6952;
                c3085.f9930 += this.f9861.f9933;
                i6 = c3080.f9912;
                i5 = i17;
            } else {
                i2 = i16;
                z = zMo6952;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i32 = this.f7579;
                int i33 = c3085.f9928;
                if (c3085.f9933 == -1) {
                    int i34 = c3080.f9912;
                    i4 = i33 + i34;
                    i3 = i33 - i34;
                } else {
                    i3 = i33;
                    i4 = i3;
                }
                int i35 = c3085.f9929;
                float f6 = i32 - paddingBottom;
                float f7 = c3083.f9919;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i36 = c3080.f9911;
                float measuredHeight = f9;
                int i37 = i35;
                float measuredHeight2 = f8;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    int i39 = i35;
                    View viewMo69322 = mo6932(i37);
                    if (viewMo69322 == null) {
                        i7 = i17;
                        i8 = i36;
                        i9 = i39;
                        rect2 = rect5;
                        i10 = i37;
                    } else {
                        float f10 = measuredHeight2;
                        i7 = i17;
                        long j2 = c3077.f9891[i37];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        if (m6971(viewMo69322, i40, i41, (LayoutParams) viewMo69322.getLayoutParams())) {
                            viewMo69322.measure(i40, i41);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C2518) viewMo69322.getLayoutParams()).f7576.top;
                        float f12 = measuredHeight - (((ViewGroup.MarginLayoutParams) r7).rightMargin + ((C2518) viewMo69322.getLayoutParams()).f7576.bottom);
                        if (c3085.f9933 == 1) {
                            rect = rect5;
                            m5004(rect, viewMo69322);
                            m5005(viewMo69322);
                        } else {
                            rect = rect5;
                            m5004(rect, viewMo69322);
                            m5003(viewMo69322, i38, false);
                            i38++;
                        }
                        int i42 = i3 + ((C2518) viewMo69322.getLayoutParams()).f7576.left;
                        int i43 = i4 - ((C2518) viewMo69322.getLayoutParams()).f7576.right;
                        Rect rect6 = rect;
                        boolean z4 = this.f9868;
                        boolean z5 = this.f9867;
                        i8 = i36;
                        C3077 c30773 = this.f9863;
                        if (!z4) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            if (z5) {
                                c30773.m6990(viewMo69322, c3080, z4, i42, Math.round(f12) - viewMo69322.getMeasuredHeight(), viewMo69322.getMeasuredWidth() + i42, Math.round(f12));
                            } else {
                                c30773.m6990(viewMo69322, c3080, z4, i42, Math.round(f11), viewMo69322.getMeasuredWidth() + i42, viewMo69322.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (z5) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c30773.m6990(viewMo69322, c3080, z4, i43 - viewMo69322.getMeasuredWidth(), Math.round(f12) - viewMo69322.getMeasuredHeight(), i43, Math.round(f12));
                        } else {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c30773.m6990(viewMo69322, c3080, z4, i43 - viewMo69322.getMeasuredWidth(), Math.round(f11), i43, viewMo69322.getMeasuredHeight() + Math.round(f11));
                        }
                        measuredHeight = f12 - (((viewMo69322.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).bottomMargin) + ((C2518) viewMo69322.getLayoutParams()).f7576.top) + fMax2);
                        measuredHeight2 = viewMo69322.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C2518) viewMo69322.getLayoutParams()).f7576.bottom + fMax2 + f11;
                    }
                    i37 = i10 + 1;
                    i17 = i7;
                    i36 = i8;
                    i35 = i9;
                    rect5 = rect2;
                }
                i5 = i17;
                c3085.f9930 += this.f9861.f9933;
                i6 = c3080.f9912;
            }
            i18 += i6;
            if (z || !this.f9868) {
                c3085.f9928 += c3080.f9912 * c3085.f9933;
            } else {
                c3085.f9928 -= c3080.f9912 * c3085.f9933;
            }
            i17 = i5 - c3080.f9912;
            i16 = i2;
            zMo6952 = z;
        }
        int i44 = i16;
        int i45 = c3085.f9932 - i18;
        c3085.f9932 = i45;
        int i46 = c3085.f9927;
        if (i46 != Integer.MIN_VALUE) {
            int i47 = i46 + i18;
            c3085.f9927 = i47;
            if (i45 < 0) {
                c3085.f9927 = i47 + i45;
            }
            m6969(c2531, c3085);
        }
        return i44 - c3085.f9932;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final View m6966(int i) {
        View viewM6954 = m6954(0, m4987(), i);
        if (viewM6954 == null) {
            return null;
        }
        int i2 = this.f9863.f9892[AbstractC2519.m4973(viewM6954)];
        if (i2 == -1) {
            return null;
        }
        return m6957(viewM6954, (C3080) this.f9864.get(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m6967(C2525 c2525) {
        if (m4987() != 0) {
            int iM5015 = c2525.m5015();
            View viewM6966 = m6966(iM5015);
            View viewM6956 = m6956(iM5015);
            if (c2525.m5015() != 0 && viewM6966 != null && viewM6956 != null) {
                View viewM6958 = m6958(0, m4987());
                int iM4973 = viewM6958 == null ? -1 : AbstractC2519.m4973(viewM6958);
                return (int) ((Math.abs(this.f9858.mo4829(viewM6956) - this.f9858.mo4826(viewM6966)) / (((m6958(m4987() - 1, -1) != null ? AbstractC2519.m4973(r4) : -1) - iM4973) + 1)) * c2525.m5015());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m6968() {
        if (this.f9858 != null) {
            return;
        }
        boolean zMo6952 = mo6952();
        int i = this.f9871;
        if (zMo6952) {
            if (i == 0) {
                this.f9858 = new C2456(this, 0);
                this.f9857 = new C2456(this, 1);
                return;
            } else {
                this.f9858 = new C2456(this, 1);
                this.f9857 = new C2456(this, 0);
                return;
            }
        }
        if (i == 0) {
            this.f9858 = new C2456(this, 1);
            this.f9857 = new C2456(this, 0);
        } else {
            this.f9858 = new C2456(this, 0);
            this.f9857 = new C2456(this, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6969(androidx.recyclerview.widget.C2531 r10, com.google.android.flexbox.C3085 r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6969(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, com.google.android.flexbox.飘花落叶言子楪苏哲世兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final int m6970(int i) {
        if (m4987() == 0 || i == 0) {
            return 0;
        }
        m6968();
        boolean zMo6952 = mo6952();
        View view = this.f9878;
        int width = zMo6952 ? view.getWidth() : view.getHeight();
        int i2 = zMo6952 ? this.f7580 : this.f7579;
        int layoutDirection = this.f7591.getLayoutDirection();
        C3083 c3083 = this.f9862;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + c3083.f9919) - width, iAbs);
            }
            int i3 = c3083.f9919;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - c3083.f9919) - width, i);
            }
            int i4 = c3083.f9919;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final boolean m6971(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f7587 && m6953(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m6953(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m6972(int i) {
        if (this.f9872 != i) {
            m4996();
            this.f9872 = i;
            this.f9858 = null;
            this.f9857 = null;
            this.f9864.clear();
            C3083 c3083 = this.f9862;
            C3083.m6999(c3083);
            c3083.f9919 = 0;
            m4991();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final int m6973(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iM6974;
        int iMo4835;
        if (mo6952() || !this.f9868) {
            int iMo48352 = i - this.f9858.mo4835();
            if (iMo48352 <= 0) {
                return 0;
            }
            iM6974 = -m6974(iMo48352, c2531, c2525);
        } else {
            int iMo4834 = this.f9858.mo4834() - i;
            if (iMo4834 <= 0) {
                return 0;
            }
            iM6974 = m6974(-iMo4834, c2531, c2525);
        }
        int i2 = i + iM6974;
        if (!z || (iMo4835 = i2 - this.f9858.mo4835()) <= 0) {
            return iM6974;
        }
        this.f9858.mo4832(-iMo4835);
        return iM6974 - iMo4835;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m6974(int r20, androidx.recyclerview.widget.C2531 r21, androidx.recyclerview.widget.C2525 r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6974(int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):int");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo4601(int i, C2531 c2531, C2525 c2525) {
        if (!mo6952() || this.f9871 == 0) {
            int iM6974 = m6974(i, c2531, c2525);
            this.f9873.clear();
            return iM6974;
        }
        int iM6970 = m6970(i);
        this.f9862.f9919 += iM6970;
        this.f9857.mo4832(-iM6970);
        return iM6970;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo4656(int i) {
        this.f9859 = i;
        this.f9855 = Integer.MIN_VALUE;
        SavedState savedState = this.f9860;
        if (savedState != null) {
            savedState.f9889 = -1;
        }
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
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo4659() {
        SavedState savedState = this.f9860;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f9889 = savedState.f9889;
            savedState2.f9888 = savedState.f9888;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m4987() <= 0) {
            savedState3.f9889 = -1;
            return savedState3;
        }
        View viewM4988 = m4988(0);
        savedState3.f9889 = AbstractC2519.m4973(viewM4988);
        savedState3.f9888 = this.f9858.mo4826(viewM4988) - this.f9858.mo4835();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4605(int i, C2531 c2531, C2525 c2525) {
        if (mo6952() || (this.f9871 == 0 && !mo6952())) {
            int iM6974 = m6974(i, c2531, c2525);
            this.f9873.clear();
            return iM6974;
        }
        int iM6970 = m6970(i);
        this.f9862.f9919 += iM6970;
        this.f9857.mo4832(-iM6970);
        return iM6970;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View mo6932(int i) {
        View view = (View) this.f9873.get(i);
        return view != null ? view : this.f9866.m5021(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo6933(int i, int i2, int i3) {
        return AbstractC2519.m4979(mo4666(), this.f7580, this.f7582, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final View mo6934(int i) {
        return mo6932(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6936(View view, int i, int i2, C3080 c3080) {
        m5004(f9854, view);
        if (mo6952()) {
            int i3 = ((C2518) view.getLayoutParams()).f7576.left + ((C2518) view.getLayoutParams()).f7576.right;
            c3080.f9900 += i3;
            c3080.f9899 += i3;
        } else {
            int i4 = ((C2518) view.getLayoutParams()).f7576.top + ((C2518) view.getLayoutParams()).f7576.bottom;
            c3080.f9900 += i4;
            c3080.f9899 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final PointF mo4660(int i) {
        View viewM4988;
        if (m4987() == 0 || (viewM4988 = m4988(0)) == null) {
            return null;
        }
        int i2 = i < AbstractC2519.m4973(viewM4988) ? -1 : 1;
        return mo6952() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo4606(C2525 c2525) {
        return m6963(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo4607(C2525 c2525) {
        return m6967(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo4663(C2525 c2525) {
        return m6964(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4665() {
        if (this.f9871 == 0) {
            return !mo6952();
        }
        if (!mo6952()) {
            int i = this.f7579;
            View view = this.f9878;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo4608(C2518 c2518) {
        return c2518 instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo4666() {
        if (this.f9871 == 0) {
            return mo6952();
        }
        if (!mo6952()) {
            return true;
        }
        int i = this.f7580;
        View view = this.f9878;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final int mo6947(int i, int i2, int i3) {
        return AbstractC2519.m4979(mo4665(), this.f7579, this.f7581, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo6948(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo6952()) {
            i3 = ((C2518) view.getLayoutParams()).f7576.left;
            i4 = ((C2518) view.getLayoutParams()).f7576.right;
        } else {
            i3 = ((C2518) view.getLayoutParams()).f7576.top;
            i4 = ((C2518) view.getLayoutParams()).f7576.bottom;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo6949(View view) {
        int i;
        int i2;
        if (mo6952()) {
            i = ((C2518) view.getLayoutParams()).f7576.top;
            i2 = ((C2518) view.getLayoutParams()).f7576.bottom;
        } else {
            i = ((C2518) view.getLayoutParams()).f7576.left;
            i2 = ((C2518) view.getLayoutParams()).f7576.right;
        }
        return i + i2;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6951(View view, int i) {
        this.f9873.put(i, view);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo6952() {
        int i = this.f9872;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5006(RecyclerView recyclerView) {
        this.f9878 = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo4774(AbstractC2450 abstractC2450) {
        m4996();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4610(androidx.recyclerview.widget.C2531 r22, androidx.recyclerview.widget.C2525 r23) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo4610(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo4611(RecyclerView recyclerView, int i, int i2) {
        m6961(i);
        m6961(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo4669(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f9860 = (SavedState) parcelable;
            m4991();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo4612(C2525 c2525) {
        this.f9860 = null;
        this.f9859 = -1;
        this.f9855 = Integer.MIN_VALUE;
        this.f9875 = -1;
        C3083.m6999(this.f9862);
        this.f9873.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo4613(int i, int i2) {
        m6961(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5007(int i) {
        m6961(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo4614(int i, int i2) {
        m6961(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo4616(int i, int i2) {
        m6961(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo4671() {
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6935(C3080 c3080) {
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4668(RecyclerView recyclerView) {
    }
}
