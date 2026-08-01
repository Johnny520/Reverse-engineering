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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends AbstractC2519 implements InterfaceC3082, InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final Rect f9859 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f9860;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f9861;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC2457 f9862;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC2457 f9863;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f9864;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public SavedState f9865;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C3086 f9866;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C3084 f9867;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C2525 f9870;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C2531 f9871;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f9872;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f9873;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f9875;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f9876;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f9877;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseArray f9878;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f9879;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f9880;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C3080 f9881;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Context f9882;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public View f9883;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int f9874 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f9869 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3078 f9868 = new C3078(this);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LayoutParams extends C2518 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3083();

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        public boolean f9884;

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
        public int f9885;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
        public int f9886;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public int f9887;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f9888;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public float f9889;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f9890;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public float f9891;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f9892;

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
            parcel.writeFloat(this.f9888);
            parcel.writeFloat(this.f9891);
            parcel.writeInt(this.f9892);
            parcel.writeFloat(this.f9889);
            parcel.writeInt(this.f9890);
            parcel.writeInt(this.f9887);
            parcel.writeInt(this.f9886);
            parcel.writeInt(this.f9885);
            parcel.writeByte(this.f9884 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
        public final int mo6902() {
            return this.f9886;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final int mo6903() {
            return this.f9885;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo6904() {
            return this.f9889;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo6905() {
            return this.f9888;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final boolean mo6906() {
            return this.f9884;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
        public final int mo6907() {
            return this.f9887;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
        public final int mo6908() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
        public final int mo6909() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final int mo6910() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
        public final int mo6911() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
        public final void mo6912(int i) {
            this.f9887 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo6913() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo6914() {
            return this.f9892;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo6915(int i) {
            this.f9890 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo6916() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo6917() {
            return this.f9891;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo6918() {
            return this.f9890;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3087();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f9893;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f9894;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f9894);
            sb.append(", mAnchorOffset=");
            return AbstractC0053.m156(sb, this.f9893, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9894);
            parcel.writeInt(this.f9893);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C3084 c3084 = new C3084(this);
        this.f9867 = c3084;
        this.f9864 = -1;
        this.f9860 = Integer.MIN_VALUE;
        this.f9861 = Integer.MIN_VALUE;
        this.f9879 = Integer.MIN_VALUE;
        this.f9878 = new SparseArray();
        this.f9880 = -1;
        this.f9881 = new C3080();
        C2520 c2520M4982 = AbstractC2519.m4982(context, attributeSet, i, i2);
        int i3 = c2520M4982.f7598;
        if (i3 != 0) {
            if (i3 == 1) {
                if (c2520M4982.f7596) {
                    m6959(3);
                } else {
                    m6959(2);
                }
            }
        } else if (c2520M4982.f7596) {
            m6959(1);
        } else {
            m6959(0);
        }
        int i4 = this.f9876;
        if (i4 != 1) {
            if (i4 == 0) {
                m5006();
                this.f9869.clear();
                C3084.m6986(c3084);
                c3084.f9924 = 0;
            }
            this.f9876 = 1;
            this.f9863 = null;
            this.f9862 = null;
            m5001();
        }
        if (this.f9875 != 4) {
            m5006();
            this.f9869.clear();
            C3084.m6986(c3084);
            c3084.f9924 = 0;
            this.f9875 = 4;
            m5001();
        }
        this.f9882 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m6940(int i, int i2, int i3) {
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

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getAlignItems() {
        return this.f9875;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getFlexDirection() {
        return this.f9877;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getFlexItemCount() {
        return this.f9870.m5025();
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final List getFlexLinesInternal() {
        return this.f9869;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getFlexWrap() {
        return this.f9876;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getLargestMainSize() {
        if (this.f9869.size() == 0) {
            return 0;
        }
        int size = this.f9869.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((C3081) this.f9869.get(i)).f9905);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getMaxLine() {
        return this.f9874;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final int getSumOfCrossSize() {
        int size = this.f9869.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C3081) this.f9869.get(i2)).f9917;
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public final void setFlexLines(List list) {
        this.f9869 = list;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4601() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f9888 = 0.0f;
        layoutParams.f9891 = 1.0f;
        layoutParams.f9892 = -1;
        layoutParams.f9889 = -1.0f;
        layoutParams.f9886 = 16777215;
        layoutParams.f9885 = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo4602(C2525 c2525) {
        return m6954(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo4603(C2525 c2525) {
        return m6950(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo4645(C2525 c2525) {
        return m6951(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C2518 mo4606(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f9888 = 0.0f;
        layoutParams.f9891 = 1.0f;
        layoutParams.f9892 = -1;
        layoutParams.f9889 = -1.0f;
        layoutParams.f9886 = 16777215;
        layoutParams.f9885 = 16777215;
        return layoutParams;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final View m6941(int i, int i2, int i3) {
        int iM4983;
        m6955();
        if (this.f9866 == null) {
            C3086 c3086 = new C3086();
            c3086.f9938 = 1;
            this.f9866 = c3086;
        }
        int iMo4845 = this.f9863.mo4845();
        int iMo4844 = this.f9863.mo4844();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM4998 = m4998(i);
            if (viewM4998 != null && (iM4983 = AbstractC2519.m4983(viewM4998)) >= 0 && iM4983 < i3) {
                if (((C2518) viewM4998.getLayoutParams()).f7579.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM4998;
                    }
                } else {
                    if (this.f9863.mo4836(viewM4998) >= iMo4845 && this.f9863.mo4839(viewM4998) <= iMo4844) {
                        return viewM4998;
                    }
                    if (view == null) {
                        view = viewM4998;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m6942(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iM6961;
        int iMo4844;
        if (mo6939() || !this.f9873) {
            int iMo48442 = this.f9863.mo4844() - i;
            if (iMo48442 <= 0) {
                return 0;
            }
            iM6961 = -m6961(-iMo48442, c2531, c2525);
        } else {
            int iMo4845 = i - this.f9863.mo4845();
            if (iMo4845 <= 0) {
                return 0;
            }
            iM6961 = m6961(iMo4845, c2531, c2525);
        }
        int i2 = i + iM6961;
        if (!z || (iMo4844 = this.f9863.mo4844() - i2) <= 0) {
            return iM6961;
        }
        this.f9863.mo4842(iMo4844);
        return iMo4844 + iM6961;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final View m6943(int i) {
        View viewM6941 = m6941(m4997() - 1, -1, i);
        if (viewM6941 == null) {
            return null;
        }
        return m6946(viewM6941, (C3081) this.f9869.get(this.f9868.f9897[AbstractC2519.m4983(viewM6941)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m6944(android.view.View r6, com.google.android.flexbox.C3081 r7) {
        /*
            r5 = this;
            boolean r0 = r5.mo6939()
            int r7 = r7.f9916
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.m4998(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f9873
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9863
            int r3 = r3.mo4839(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9863
            int r4 = r4.mo4839(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9863
            int r3 = r3.mo4836(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9863
            int r4 = r4.mo4836(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6944(android.view.View, com.google.android.flexbox.飘花落叶言子楪世苏兰哲):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m6945(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewM4998 = m4998(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f7581 - getPaddingRight();
            int paddingBottom = this.f7580 - getPaddingBottom();
            int iM4988 = AbstractC2519.m4988(viewM4998) - ((ViewGroup.MarginLayoutParams) ((C2518) viewM4998.getLayoutParams())).leftMargin;
            int iM4981 = AbstractC2519.m4981(viewM4998) - ((ViewGroup.MarginLayoutParams) ((C2518) viewM4998.getLayoutParams())).topMargin;
            int iM4985 = AbstractC2519.m4985(viewM4998) + ((ViewGroup.MarginLayoutParams) ((C2518) viewM4998.getLayoutParams())).rightMargin;
            int iM4986 = AbstractC2519.m4986(viewM4998) + ((ViewGroup.MarginLayoutParams) ((C2518) viewM4998.getLayoutParams())).bottomMargin;
            boolean z = iM4988 >= paddingRight || iM4985 >= paddingLeft;
            boolean z2 = iM4981 >= paddingBottom || iM4986 >= paddingTop;
            if (z && z2) {
                return viewM4998;
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
    public final android.view.View m6946(android.view.View r6, com.google.android.flexbox.C3081 r7) {
        /*
            r5 = this;
            boolean r0 = r5.mo6939()
            int r1 = r5.m4997()
            int r1 = r1 + (-2)
            int r2 = r5.m4997()
            int r7 = r7.f9916
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.m4998(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f9873
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9863
            int r3 = r3.mo4836(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9863
            int r4 = r4.mo4836(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r3 = r5.f9863
            int r3 = r3.mo4839(r6)
            androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪 r4 = r5.f9863
            int r4 = r4.mo4839(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6946(android.view.View, com.google.android.flexbox.飘花落叶言子楪世苏兰哲):android.view.View");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m6947(C3084 c3084, boolean z, boolean z2) {
        if (z2) {
            int i = mo6939() ? this.f7582 : this.f7583;
            this.f9866.f9936 = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.f9866.f9936 = false;
        }
        if (mo6939() || !this.f9873) {
            this.f9866.f9937 = c3084.f9925 - this.f9863.mo4845();
        } else {
            this.f9866.f9937 = (this.f9883.getWidth() - c3084.f9925) - this.f9863.mo4845();
        }
        C3086 c3086 = this.f9866;
        c3086.f9934 = c3084.f9927;
        c3086.f9938 = -1;
        c3086.f9933 = c3084.f9925;
        c3086.f9932 = Integer.MIN_VALUE;
        int i2 = c3084.f9926;
        c3086.f9935 = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.f9869.size();
        int i3 = c3084.f9926;
        if (size > i3) {
            C3081 c3081 = (C3081) this.f9869.get(i3);
            C3086 c30862 = this.f9866;
            c30862.f9935--;
            c30862.f9934 -= c3081.f9916;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m6948(int i) {
        View viewM6945 = m6945(m4997() - 1, -1);
        if (i >= (viewM6945 != null ? AbstractC2519.m4983(viewM6945) : -1)) {
            return;
        }
        int iM4997 = m4997();
        C3078 c3078 = this.f9868;
        c3078.m6983(iM4997);
        c3078.m6980(iM4997);
        c3078.m6982(iM4997);
        if (i >= c3078.f9897.length) {
            return;
        }
        this.f9880 = i;
        View viewM4998 = m4998(0);
        if (viewM4998 == null) {
            return;
        }
        this.f9864 = AbstractC2519.m4983(viewM4998);
        if (mo6939() || !this.f9873) {
            this.f9860 = this.f9863.mo4836(viewM4998) - this.f9863.mo4845();
        } else {
            this.f9860 = this.f9863.mo4843() + this.f9863.mo4839(viewM4998);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m6949(C3084 c3084, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = mo6939() ? this.f7582 : this.f7583;
            this.f9866.f9936 = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.f9866.f9936 = false;
        }
        if (mo6939() || !this.f9873) {
            this.f9866.f9937 = this.f9863.mo4844() - c3084.f9925;
        } else {
            this.f9866.f9937 = c3084.f9925 - getPaddingRight();
        }
        C3086 c3086 = this.f9866;
        c3086.f9934 = c3084.f9927;
        c3086.f9938 = 1;
        c3086.f9933 = c3084.f9925;
        c3086.f9932 = Integer.MIN_VALUE;
        c3086.f9935 = c3084.f9926;
        if (!z || this.f9869.size() <= 1 || (i = c3084.f9926) < 0 || i >= this.f9869.size() - 1) {
            return;
        }
        C3081 c3081 = (C3081) this.f9869.get(c3084.f9926);
        C3086 c30862 = this.f9866;
        c30862.f9935++;
        c30862.f9934 += c3081.f9916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m6950(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        int iM5025 = c2525.m5025();
        View viewM6953 = m6953(iM5025);
        View viewM6943 = m6943(iM5025);
        if (c2525.m5025() == 0 || viewM6953 == null || viewM6943 == null) {
            return 0;
        }
        int iM4983 = AbstractC2519.m4983(viewM6953);
        int iM49832 = AbstractC2519.m4983(viewM6943);
        int iAbs = Math.abs(this.f9863.mo4839(viewM6943) - this.f9863.mo4836(viewM6953));
        int i = this.f9868.f9897[iM4983];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iM49832] - i) + 1))) + (this.f9863.mo4845() - this.f9863.mo4836(viewM6953)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final int m6951(C2525 c2525) {
        if (m4997() == 0) {
            return 0;
        }
        int iM5025 = c2525.m5025();
        m6955();
        View viewM6953 = m6953(iM5025);
        View viewM6943 = m6943(iM5025);
        if (c2525.m5025() == 0 || viewM6953 == null || viewM6943 == null) {
            return 0;
        }
        return Math.min(this.f9863.mo4846(), this.f9863.mo4839(viewM6943) - this.f9863.mo4836(viewM6953));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m6952(C2531 c2531, C2525 c2525, C3086 c3086) {
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
        int i14 = c3086.f9932;
        if (i14 != Integer.MIN_VALUE) {
            int i15 = c3086.f9937;
            if (i15 < 0) {
                c3086.f9932 = i14 + i15;
            }
            m6956(c2531, c3086);
        }
        int i16 = c3086.f9937;
        boolean zMo6939 = mo6939();
        int i17 = i16;
        int i18 = 0;
        while (true) {
            if (i17 <= 0 && !this.f9866.f9936) {
                break;
            }
            List list = this.f9869;
            int i19 = c3086.f9934;
            if (i19 < 0 || i19 >= c2525.m5025() || (i = c3086.f9935) < 0 || i >= list.size()) {
                break;
            }
            C3081 c3081 = (C3081) this.f9869.get(c3086.f9935);
            c3086.f9934 = c3081.f9914;
            boolean zMo69392 = mo6939();
            C3084 c3084 = this.f9867;
            Rect rect4 = f9859;
            C3078 c3078 = this.f9868;
            if (zMo69392) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i20 = this.f7581;
                int i21 = c3086.f9933;
                if (c3086.f9938 == -1) {
                    i21 -= c3081.f9917;
                }
                int i22 = i21;
                int i23 = c3086.f9934;
                float f = c3084.f9924;
                float f2 = paddingLeft - f;
                float measuredWidth = (i20 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i24 = c3081.f9916;
                i2 = i16;
                int i25 = i23;
                int i26 = 0;
                while (i25 < i23 + i24) {
                    int i27 = i23;
                    View viewMo6919 = mo6919(i25);
                    if (viewMo6919 == null) {
                        i13 = i27;
                        z2 = zMo6939;
                        i11 = i24;
                        i12 = i25;
                        rect3 = rect4;
                    } else {
                        z2 = zMo6939;
                        if (c3086.f9938 == 1) {
                            m5014(rect4, viewMo6919);
                            m5015(viewMo6919);
                        } else {
                            m5014(rect4, viewMo6919);
                            m5013(viewMo6919, i26, false);
                            i26++;
                        }
                        int i28 = i26;
                        float f3 = measuredWidth;
                        long j = c3078.f9896[i25];
                        int i29 = (int) j;
                        int i30 = (int) (j >> 32);
                        if (m6958(viewMo6919, i29, i30, (LayoutParams) viewMo6919.getLayoutParams())) {
                            viewMo6919.measure(i29, i30);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((C2518) viewMo6919.getLayoutParams()).f7577.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C2518) viewMo6919.getLayoutParams()).f7577.right);
                        int i31 = i22 + ((C2518) viewMo6919.getLayoutParams()).f7577.top;
                        boolean z3 = this.f9873;
                        i11 = i24;
                        C3078 c30782 = this.f9868;
                        if (z3) {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c30782.m6976(viewMo6919, c3081, Math.round(f5) - viewMo6919.getMeasuredWidth(), i31, Math.round(f5), viewMo6919.getMeasuredHeight() + i31);
                        } else {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c30782.m6976(viewMo6919, c3081, Math.round(f4), i31, viewMo6919.getMeasuredWidth() + Math.round(f4), viewMo6919.getMeasuredHeight() + i31);
                        }
                        float measuredWidth2 = viewMo6919.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C2518) viewMo6919.getLayoutParams()).f7577.right + fMax + f4;
                        measuredWidth = f5 - (((viewMo6919.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((C2518) viewMo6919.getLayoutParams()).f7577.left) + fMax);
                        f2 = measuredWidth2;
                        i26 = i28;
                    }
                    i25 = i12 + 1;
                    zMo6939 = z2;
                    i24 = i11;
                    i23 = i13;
                    rect4 = rect3;
                }
                z = zMo6939;
                c3086.f9935 += this.f9866.f9938;
                i6 = c3081.f9917;
                i5 = i17;
            } else {
                i2 = i16;
                z = zMo6939;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i32 = this.f7580;
                int i33 = c3086.f9933;
                if (c3086.f9938 == -1) {
                    int i34 = c3081.f9917;
                    i4 = i33 + i34;
                    i3 = i33 - i34;
                } else {
                    i3 = i33;
                    i4 = i3;
                }
                int i35 = c3086.f9934;
                float f6 = i32 - paddingBottom;
                float f7 = c3084.f9924;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i36 = c3081.f9916;
                float measuredHeight = f9;
                int i37 = i35;
                float measuredHeight2 = f8;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    int i39 = i35;
                    View viewMo69192 = mo6919(i37);
                    if (viewMo69192 == null) {
                        i7 = i17;
                        i8 = i36;
                        i9 = i39;
                        rect2 = rect5;
                        i10 = i37;
                    } else {
                        float f10 = measuredHeight2;
                        i7 = i17;
                        long j2 = c3078.f9896[i37];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        if (m6958(viewMo69192, i40, i41, (LayoutParams) viewMo69192.getLayoutParams())) {
                            viewMo69192.measure(i40, i41);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C2518) viewMo69192.getLayoutParams()).f7577.top;
                        float f12 = measuredHeight - (((ViewGroup.MarginLayoutParams) r7).rightMargin + ((C2518) viewMo69192.getLayoutParams()).f7577.bottom);
                        if (c3086.f9938 == 1) {
                            rect = rect5;
                            m5014(rect, viewMo69192);
                            m5015(viewMo69192);
                        } else {
                            rect = rect5;
                            m5014(rect, viewMo69192);
                            m5013(viewMo69192, i38, false);
                            i38++;
                        }
                        int i42 = i3 + ((C2518) viewMo69192.getLayoutParams()).f7577.left;
                        int i43 = i4 - ((C2518) viewMo69192.getLayoutParams()).f7577.right;
                        Rect rect6 = rect;
                        boolean z4 = this.f9873;
                        boolean z5 = this.f9872;
                        i8 = i36;
                        C3078 c30783 = this.f9868;
                        if (!z4) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            if (z5) {
                                c30783.m6977(viewMo69192, c3081, z4, i42, Math.round(f12) - viewMo69192.getMeasuredHeight(), viewMo69192.getMeasuredWidth() + i42, Math.round(f12));
                            } else {
                                c30783.m6977(viewMo69192, c3081, z4, i42, Math.round(f11), viewMo69192.getMeasuredWidth() + i42, viewMo69192.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (z5) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c30783.m6977(viewMo69192, c3081, z4, i43 - viewMo69192.getMeasuredWidth(), Math.round(f12) - viewMo69192.getMeasuredHeight(), i43, Math.round(f12));
                        } else {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c30783.m6977(viewMo69192, c3081, z4, i43 - viewMo69192.getMeasuredWidth(), Math.round(f11), i43, viewMo69192.getMeasuredHeight() + Math.round(f11));
                        }
                        measuredHeight = f12 - (((viewMo69192.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).bottomMargin) + ((C2518) viewMo69192.getLayoutParams()).f7577.top) + fMax2);
                        measuredHeight2 = viewMo69192.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C2518) viewMo69192.getLayoutParams()).f7577.bottom + fMax2 + f11;
                    }
                    i37 = i10 + 1;
                    i17 = i7;
                    i36 = i8;
                    i35 = i9;
                    rect5 = rect2;
                }
                i5 = i17;
                c3086.f9935 += this.f9866.f9938;
                i6 = c3081.f9917;
            }
            i18 += i6;
            if (z || !this.f9873) {
                c3086.f9933 += c3081.f9917 * c3086.f9938;
            } else {
                c3086.f9933 -= c3081.f9917 * c3086.f9938;
            }
            i17 = i5 - c3081.f9917;
            i16 = i2;
            zMo6939 = z;
        }
        int i44 = i16;
        int i45 = c3086.f9937 - i18;
        c3086.f9937 = i45;
        int i46 = c3086.f9932;
        if (i46 != Integer.MIN_VALUE) {
            int i47 = i46 + i18;
            c3086.f9932 = i47;
            if (i45 < 0) {
                c3086.f9932 = i47 + i45;
            }
            m6956(c2531, c3086);
        }
        return i44 - c3086.f9937;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final View m6953(int i) {
        View viewM6941 = m6941(0, m4997(), i);
        if (viewM6941 == null) {
            return null;
        }
        int i2 = this.f9868.f9897[AbstractC2519.m4983(viewM6941)];
        if (i2 == -1) {
            return null;
        }
        return m6944(viewM6941, (C3081) this.f9869.get(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m6954(C2525 c2525) {
        if (m4997() != 0) {
            int iM5025 = c2525.m5025();
            View viewM6953 = m6953(iM5025);
            View viewM6943 = m6943(iM5025);
            if (c2525.m5025() != 0 && viewM6953 != null && viewM6943 != null) {
                View viewM6945 = m6945(0, m4997());
                int iM4983 = viewM6945 == null ? -1 : AbstractC2519.m4983(viewM6945);
                return (int) ((Math.abs(this.f9863.mo4839(viewM6943) - this.f9863.mo4836(viewM6953)) / (((m6945(m4997() - 1, -1) != null ? AbstractC2519.m4983(r4) : -1) - iM4983) + 1)) * c2525.m5025());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m6955() {
        if (this.f9863 != null) {
            return;
        }
        boolean zMo6939 = mo6939();
        int i = this.f9876;
        if (zMo6939) {
            if (i == 0) {
                this.f9863 = new C2456(this, 0);
                this.f9862 = new C2456(this, 1);
                return;
            } else {
                this.f9863 = new C2456(this, 1);
                this.f9862 = new C2456(this, 0);
                return;
            }
        }
        if (i == 0) {
            this.f9863 = new C2456(this, 1);
            this.f9862 = new C2456(this, 0);
        } else {
            this.f9863 = new C2456(this, 0);
            this.f9862 = new C2456(this, 1);
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
    public final void m6956(androidx.recyclerview.widget.C2531 r10, com.google.android.flexbox.C3086 r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6956(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, com.google.android.flexbox.飘花落叶言子楪苏哲世兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final int m6957(int i) {
        if (m4997() == 0 || i == 0) {
            return 0;
        }
        m6955();
        boolean zMo6939 = mo6939();
        View view = this.f9883;
        int width = zMo6939 ? view.getWidth() : view.getHeight();
        int i2 = zMo6939 ? this.f7581 : this.f7580;
        int layoutDirection = this.f7592.getLayoutDirection();
        C3084 c3084 = this.f9867;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + c3084.f9924) - width, iAbs);
            }
            int i3 = c3084.f9924;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - c3084.f9924) - width, i);
            }
            int i4 = c3084.f9924;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final boolean m6958(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f7588 && m6940(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m6940(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m6959(int i) {
        if (this.f9877 != i) {
            m5006();
            this.f9877 = i;
            this.f9863 = null;
            this.f9862 = null;
            this.f9869.clear();
            C3084 c3084 = this.f9867;
            C3084.m6986(c3084);
            c3084.f9924 = 0;
            m5001();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final int m6960(int i, C2531 c2531, C2525 c2525, boolean z) {
        int iM6961;
        int iMo4845;
        if (mo6939() || !this.f9873) {
            int iMo48452 = i - this.f9863.mo4845();
            if (iMo48452 <= 0) {
                return 0;
            }
            iM6961 = -m6961(iMo48452, c2531, c2525);
        } else {
            int iMo4844 = this.f9863.mo4844() - i;
            if (iMo4844 <= 0) {
                return 0;
            }
            iM6961 = m6961(-iMo4844, c2531, c2525);
        }
        int i2 = i + iM6961;
        if (!z || (iMo4845 = i2 - this.f9863.mo4845()) <= 0) {
            return iM6961;
        }
        this.f9863.mo4842(-iMo4845);
        return iM6961 - iMo4845;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m6961(int r20, androidx.recyclerview.widget.C2531 r21, androidx.recyclerview.widget.C2525 r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m6961(int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):int");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo4611(int i, C2531 c2531, C2525 c2525) {
        if (!mo6939() || this.f9876 == 0) {
            int iM6961 = m6961(i, c2531, c2525);
            this.f9878.clear();
            return iM6961;
        }
        int iM6957 = m6957(i);
        this.f9867.f9924 += iM6957;
        this.f9862.mo4842(-iM6957);
        return iM6957;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo4666(int i) {
        this.f9864 = i;
        this.f9860 = Integer.MIN_VALUE;
        SavedState savedState = this.f9865;
        if (savedState != null) {
            savedState.f9894 = -1;
        }
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
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo4669() {
        SavedState savedState = this.f9865;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f9894 = savedState.f9894;
            savedState2.f9893 = savedState.f9893;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m4997() <= 0) {
            savedState3.f9894 = -1;
            return savedState3;
        }
        View viewM4998 = m4998(0);
        savedState3.f9894 = AbstractC2519.m4983(viewM4998);
        savedState3.f9893 = this.f9863.mo4836(viewM4998) - this.f9863.mo4845();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4615(int i, C2531 c2531, C2525 c2525) {
        if (mo6939() || (this.f9876 == 0 && !mo6939())) {
            int iM6961 = m6961(i, c2531, c2525);
            this.f9878.clear();
            return iM6961;
        }
        int iM6957 = m6957(i);
        this.f9867.f9924 += iM6957;
        this.f9862.mo4842(-iM6957);
        return iM6957;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View mo6919(int i) {
        View view = (View) this.f9878.get(i);
        return view != null ? view : this.f9871.m5031(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo6920(int i, int i2, int i3) {
        return AbstractC2519.m4989(mo4676(), this.f7581, this.f7583, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final View mo6921(int i) {
        return mo6919(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6923(View view, int i, int i2, C3081 c3081) {
        m5014(f9859, view);
        if (mo6939()) {
            int i3 = ((C2518) view.getLayoutParams()).f7577.left + ((C2518) view.getLayoutParams()).f7577.right;
            c3081.f9905 += i3;
            c3081.f9904 += i3;
        } else {
            int i4 = ((C2518) view.getLayoutParams()).f7577.top + ((C2518) view.getLayoutParams()).f7577.bottom;
            c3081.f9905 += i4;
            c3081.f9904 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final PointF mo4670(int i) {
        View viewM4998;
        if (m4997() == 0 || (viewM4998 = m4998(0)) == null) {
            return null;
        }
        int i2 = i < AbstractC2519.m4983(viewM4998) ? -1 : 1;
        return mo6939() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo4616(C2525 c2525) {
        return m6950(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo4617(C2525 c2525) {
        return m6954(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo4673(C2525 c2525) {
        return m6951(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4675() {
        if (this.f9876 == 0) {
            return !mo6939();
        }
        if (!mo6939()) {
            int i = this.f7580;
            View view = this.f9883;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo4618(C2518 c2518) {
        return c2518 instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo4676() {
        if (this.f9876 == 0) {
            return mo6939();
        }
        if (!mo6939()) {
            return true;
        }
        int i = this.f7581;
        View view = this.f9883;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final int mo6934(int i, int i2, int i3) {
        return AbstractC2519.m4989(mo4675(), this.f7580, this.f7582, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo6935(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo6939()) {
            i3 = ((C2518) view.getLayoutParams()).f7577.left;
            i4 = ((C2518) view.getLayoutParams()).f7577.right;
        } else {
            i3 = ((C2518) view.getLayoutParams()).f7577.top;
            i4 = ((C2518) view.getLayoutParams()).f7577.bottom;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo6936(View view) {
        int i;
        int i2;
        if (mo6939()) {
            i = ((C2518) view.getLayoutParams()).f7577.top;
            i2 = ((C2518) view.getLayoutParams()).f7577.bottom;
        } else {
            i = ((C2518) view.getLayoutParams()).f7577.left;
            i2 = ((C2518) view.getLayoutParams()).f7577.right;
        }
        return i + i2;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6938(View view, int i) {
        this.f9878.put(i, view);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo6939() {
        int i = this.f9877;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5016(RecyclerView recyclerView) {
        this.f9883 = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo4784(AbstractC2450 abstractC2450) {
        m5006();
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
    public final void mo4620(androidx.recyclerview.widget.C2531 r22, androidx.recyclerview.widget.C2525 r23) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo4620(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo4621(RecyclerView recyclerView, int i, int i2) {
        m6948(i);
        m6948(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo4679(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f9865 = (SavedState) parcelable;
            m5001();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo4622(C2525 c2525) {
        this.f9865 = null;
        this.f9864 = -1;
        this.f9860 = Integer.MIN_VALUE;
        this.f9880 = -1;
        C3084.m6986(this.f9867);
        this.f9878.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo4623(int i, int i2) {
        m6948(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5017(int i) {
        m6948(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo4624(int i, int i2) {
        m6948(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo4626(int i, int i2) {
        m6948(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo4681() {
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6922(C3081 c3081) {
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4678(RecyclerView recyclerView) {
    }
}
