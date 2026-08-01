package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC3081 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3077 f9827;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public SparseIntArray f9828;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int[] f9829;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9830;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f9831;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9832;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3079 f9833;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f9834;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f9837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f9840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9843;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3076();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f9844;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f9845;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int f9846;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public int f9847;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f9848;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int f9849;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f9850;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public float f9851;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public float f9852;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f9853;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f9853;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9853);
            parcel.writeFloat(this.f9851);
            parcel.writeFloat(this.f9852);
            parcel.writeInt(this.f9846);
            parcel.writeFloat(this.f9845);
            parcel.writeInt(this.f9849);
            parcel.writeInt(this.f9850);
            parcel.writeInt(this.f9847);
            parcel.writeInt(this.f9848);
            parcel.writeByte(this.f9844 ? (byte) 1 : (byte) 0);
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
            return this.f9847;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
        public final int mo6916() {
            return this.f9848;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final boolean mo6917() {
            return this.f9844;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo6918() {
            return this.f9845;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo6919() {
            return this.f9851;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final int mo6920() {
            return this.f9850;
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
            this.f9850 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo6926() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo6927() {
            return this.f9846;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo6928(int i) {
            this.f9849 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo6929() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo6930() {
            return this.f9852;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo6931() {
            return this.f9849;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9839 = -1;
        this.f9827 = new C3077(this);
        this.f9834 = new ArrayList();
        this.f9833 = new C3079();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3084.f9926, 0, 0);
        this.f9843 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f9841 = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f9842 = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.f9836 = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f9835 = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f9839 = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.f9832 = i;
            this.f9838 = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.f9832 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.f9838 = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f9828 == null) {
            this.f9828 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9828;
        C3077 c3077 = this.f9827;
        InterfaceC3081 interfaceC3081 = c3077.f9894;
        int flexItemCount = interfaceC3081.getFlexItemCount();
        ArrayList arrayListM6977 = c3077.m6977(flexItemCount);
        C3078 c3078 = new C3078();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c3078.f9895 = 1;
        } else {
            c3078.f9895 = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= interfaceC3081.getFlexItemCount()) {
            c3078.f9896 = flexItemCount;
        } else {
            c3078.f9896 = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C3078) arrayListM6977.get(i2)).f9896++;
            }
        }
        arrayListM6977.add(c3078);
        this.f9829 = C3077.m6976(flexItemCount + 1, arrayListM6977, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f9853 = 1;
            layoutParams3.f9851 = 0.0f;
            layoutParams3.f9852 = 1.0f;
            layoutParams3.f9846 = -1;
            layoutParams3.f9845 = -1.0f;
            layoutParams3.f9849 = -1;
            layoutParams3.f9850 = -1;
            layoutParams3.f9847 = 16777215;
            layoutParams3.f9848 = 16777215;
            layoutParams3.f9853 = layoutParams2.f9853;
            layoutParams3.f9851 = layoutParams2.f9851;
            layoutParams3.f9852 = layoutParams2.f9852;
            layoutParams3.f9846 = layoutParams2.f9846;
            layoutParams3.f9845 = layoutParams2.f9845;
            layoutParams3.f9849 = layoutParams2.f9849;
            layoutParams3.f9850 = layoutParams2.f9850;
            layoutParams3.f9847 = layoutParams2.f9847;
            layoutParams3.f9848 = layoutParams2.f9848;
            layoutParams3.f9844 = layoutParams2.f9844;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f9853 = 1;
            layoutParams4.f9851 = 0.0f;
            layoutParams4.f9852 = 1.0f;
            layoutParams4.f9846 = -1;
            layoutParams4.f9845 = -1.0f;
            layoutParams4.f9849 = -1;
            layoutParams4.f9850 = -1;
            layoutParams4.f9847 = 16777215;
            layoutParams4.f9848 = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f9853 = 1;
        layoutParams5.f9851 = 0.0f;
        layoutParams5.f9852 = 1.0f;
        layoutParams5.f9846 = -1;
        layoutParams5.f9845 = -1.0f;
        layoutParams5.f9849 = -1;
        layoutParams5.f9850 = -1;
        layoutParams5.f9847 = 16777215;
        layoutParams5.f9848 = 16777215;
        return layoutParams5;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getAlignContent() {
        return this.f9835;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getAlignItems() {
        return this.f9836;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9840;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9837;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getFlexDirection() {
        return this.f9843;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C3080> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f9834.size());
        for (C3080 c3080 : this.f9834) {
            if (c3080.m6998() != 0) {
                arrayList.add(c3080);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public List<C3080> getFlexLinesInternal() {
        return this.f9834;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getFlexWrap() {
        return this.f9841;
    }

    public int getJustifyContent() {
        return this.f9842;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getLargestMainSize() {
        Iterator it = this.f9834.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C3080) it.next()).f9900);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getMaxLine() {
        return this.f9839;
    }

    public int getShowDividerHorizontal() {
        return this.f9838;
    }

    public int getShowDividerVertical() {
        return this.f9832;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public int getSumOfCrossSize() {
        int size = this.f9834.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3080 c3080 = (C3080) this.f9834.get(i2);
            if (m6943(i2)) {
                i += mo6952() ? this.f9831 : this.f9830;
            }
            if (m6944(i2)) {
                i += mo6952() ? this.f9831 : this.f9830;
            }
            i += c3080.f9912;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f9837 == null && this.f9840 == null) {
            return;
        }
        if (this.f9838 == 0 && this.f9832 == 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        int layoutDirection = getLayoutDirection();
        int i = this.f9843;
        if (i == 0) {
            m6937(canvas, layoutDirection == 1, this.f9841 == 2);
            return;
        }
        if (i == 1) {
            m6937(canvas, layoutDirection != 1, this.f9841 == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.f9841 == 2) {
                z = !z;
            }
            m6950(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.f9841 == 2) {
            z2 = !z2;
        }
        m6950(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        FlexboxLayout flexboxLayout;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        FlexboxLayout flexboxLayout2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        int layoutDirection = getLayoutDirection();
        int i13 = this.f9843;
        if (i13 == 0) {
            if (layoutDirection == 1) {
                z2 = true;
                flexboxLayout = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                flexboxLayout = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            flexboxLayout.m6939(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                z4 = layoutDirection == 1;
                if (this.f9841 == 2) {
                    z4 = !z4;
                }
                m6938(z4, false, i, i2, i3, i4);
                return;
            }
            if (i13 != 3) {
                C5919.m11244(this.f9843, "Invalid flex direction is set: ");
                return;
            }
            z4 = layoutDirection == 1;
            if (this.f9841 == 2) {
                z4 = !z4;
            }
            m6938(z4, true, i, i2, i3, i4);
            return;
        }
        if (layoutDirection != 1) {
            z3 = true;
            flexboxLayout2 = this;
            i9 = i;
            i12 = i2;
            i11 = i4;
            i10 = i3;
        } else {
            z3 = false;
            flexboxLayout2 = this;
            i9 = i;
            i10 = i3;
            i11 = i4;
            i12 = i2;
        }
        flexboxLayout2.m6939(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f9828 == null) {
            this.f9828 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9828;
        C3077 c3077 = this.f9827;
        InterfaceC3081 interfaceC3081 = c3077.f9894;
        int flexItemCount = interfaceC3081.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.f9828;
            int flexItemCount2 = c3077.f9894.getFlexItemCount();
            this.f9829 = C3077.m6976(flexItemCount2, c3077.m6977(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewMo6932 = interfaceC3081.mo6932(i3);
            if (viewMo6932 != null && ((FlexItem) viewMo6932.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray22 = this.f9828;
                int flexItemCount22 = c3077.f9894.getFlexItemCount();
                this.f9829 = C3077.m6976(flexItemCount22, c3077.m6977(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.f9843;
        C3079 c3079 = this.f9833;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                C5919.m11244(this.f9843, "Invalid value for the flex direction is set: ");
                return;
            }
            this.f9834.clear();
            c3079.f9897 = null;
            c3079.f9898 = 0;
            this.f9827.m6980(this.f9833, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f9834 = c3079.f9897;
            c3077.m6991(i, i2, 0);
            c3077.m6992(i, i2, getPaddingRight() + getPaddingLeft());
            c3077.m6984(0);
            m6940(this.f9843, i, i2, c3079.f9898);
            return;
        }
        this.f9834.clear();
        c3079.f9897 = null;
        c3079.f9898 = 0;
        this.f9827.m6980(this.f9833, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f9834 = c3079.f9897;
        c3077.m6991(i, i2, 0);
        if (this.f9836 == 3) {
            for (C3080 c3080 : this.f9834) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < c3080.f9911; i5++) {
                    View viewM6945 = m6945(c3080.f9909 + i5);
                    if (viewM6945 != null && viewM6945.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewM6945.getLayoutParams();
                        int i6 = this.f9841;
                        int i7 = c3080.f9914;
                        iMax = i6 != 2 ? Math.max(iMax, viewM6945.getMeasuredHeight() + Math.max(i7 - viewM6945.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewM6945.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewM6945.getBaseline() + (i7 - viewM6945.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                c3080.f9912 = iMax;
            }
        }
        c3077.m6992(i, i2, getPaddingBottom() + getPaddingTop());
        c3077.m6984(0);
        m6940(this.f9843, i, i2, c3079.f9898);
    }

    public void setAlignContent(int i) {
        if (this.f9835 != i) {
            this.f9835 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f9836 != i) {
            this.f9836 = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f9840) {
            return;
        }
        this.f9840 = drawable;
        if (drawable != null) {
            this.f9831 = drawable.getIntrinsicHeight();
        } else {
            this.f9831 = 0;
        }
        if (this.f9840 == null && this.f9837 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f9837) {
            return;
        }
        this.f9837 = drawable;
        if (drawable != null) {
            this.f9830 = drawable.getIntrinsicWidth();
        } else {
            this.f9830 = 0;
        }
        if (this.f9840 == null && this.f9837 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f9843 != i) {
            this.f9843 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    public void setFlexLines(List<C3080> list) {
        this.f9834 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f9841 != i) {
            this.f9841 = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f9842 != i) {
            this.f9842 = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f9839 != i) {
            this.f9839 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f9838) {
            this.f9838 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f9832) {
            this.f9832 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View mo6932(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo6933(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View mo6934(int i) {
        return m6945(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6935(C3080 c3080) {
        if (mo6952()) {
            if ((this.f9832 & 4) > 0) {
                int i = c3080.f9900;
                int i2 = this.f9830;
                c3080.f9900 = i + i2;
                c3080.f9899 += i2;
                return;
            }
            return;
        }
        if ((this.f9838 & 4) > 0) {
            int i3 = c3080.f9900;
            int i4 = this.f9831;
            c3080.f9900 = i3 + i4;
            c3080.f9899 += i4;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo6936(View view, int i, int i2, C3080 c3080) {
        if (m6946(i, i2)) {
            boolean zMo6952 = mo6952();
            int i3 = c3080.f9900;
            if (zMo6952) {
                int i4 = this.f9830;
                c3080.f9900 = i3 + i4;
                c3080.f9899 += i4;
            } else {
                int i5 = this.f9831;
                c3080.f9900 = i3 + i5;
                c3080.f9899 += i5;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6937(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f9834.size();
        for (int i = 0; i < size; i++) {
            C3080 c3080 = (C3080) this.f9834.get(i);
            for (int i2 = 0; i2 < c3080.f9911; i2++) {
                int i3 = c3080.f9909 + i2;
                View viewM6945 = m6945(i3);
                if (viewM6945 != null && viewM6945.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM6945.getLayoutParams();
                    if (m6946(i3, i2)) {
                        m6941(canvas, z ? viewM6945.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewM6945.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9830, c3080.f9903, c3080.f9912);
                    }
                    if (i2 == c3080.f9911 - 1 && (this.f9832 & 4) > 0) {
                        m6941(canvas, z ? (viewM6945.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9830 : viewM6945.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, c3080.f9903, c3080.f9912);
                    }
                }
            }
            if (m6943(i)) {
                m6942(canvas, paddingLeft, z2 ? c3080.f9901 : c3080.f9903 - this.f9831, iMax);
            }
            if (m6944(i) && (this.f9838 & 4) > 0) {
                m6942(canvas, paddingLeft, z2 ? c3080.f9903 - this.f9831 : c3080.f9901, iMax);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6938(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m6938(boolean, boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6939(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m6939(boolean, int, int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m6940(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                C5919.m11249(AbstractC6136.m11556(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            C5919.m11250(AbstractC6136.m11556(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            C5919.m11250(AbstractC6136.m11556(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m6941(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9837;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f9830 + i, i3 + i2);
        this.f9837.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6942(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9840;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f9831 + i2);
        this.f9840.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m6943(int i) {
        if (i >= 0 && i < this.f9834.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((C3080) this.f9834.get(i2)).m6998() > 0) {
                    return mo6952() ? (this.f9838 & 2) != 0 : (this.f9832 & 2) != 0;
                }
            }
            if (mo6952()) {
                return (this.f9838 & 1) != 0;
            }
            if ((this.f9832 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m6944(int i) {
        if (i >= 0 && i < this.f9834.size()) {
            for (int i2 = i + 1; i2 < this.f9834.size(); i2++) {
                if (((C3080) this.f9834.get(i2)).m6998() > 0) {
                    return false;
                }
            }
            if (mo6952()) {
                return (this.f9838 & 4) != 0;
            }
            if ((this.f9832 & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final View m6945(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f9829;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m6946(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewM6945 = m6945(i - i3);
            if (viewM6945 != null && viewM6945.getVisibility() != 8) {
                return mo6952() ? (this.f9832 & 2) != 0 : (this.f9838 & 2) != 0;
            }
        }
        return mo6952() ? (this.f9832 & 1) != 0 : (this.f9838 & 1) != 0;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo6947(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo6948(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo6952()) {
            i3 = m6946(i, i2) ? this.f9830 : 0;
            if ((this.f9832 & 4) <= 0) {
                return i3;
            }
            i4 = this.f9830;
        } else {
            i3 = m6946(i, i2) ? this.f9831 : 0;
            if ((this.f9838 & 4) <= 0) {
                return i3;
            }
            i4 = this.f9831;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo6949(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6950(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f9834.size();
        for (int i = 0; i < size; i++) {
            C3080 c3080 = (C3080) this.f9834.get(i);
            for (int i2 = 0; i2 < c3080.f9911; i2++) {
                int i3 = c3080.f9909 + i2;
                View viewM6945 = m6945(i3);
                if (viewM6945 != null && viewM6945.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM6945.getLayoutParams();
                    if (m6946(i3, i2)) {
                        m6942(canvas, c3080.f9904, z2 ? viewM6945.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewM6945.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9831, c3080.f9912);
                    }
                    if (i2 == c3080.f9911 - 1 && (this.f9838 & 4) > 0) {
                        m6942(canvas, c3080.f9904, z2 ? (viewM6945.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9831 : viewM6945.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, c3080.f9912);
                    }
                }
            }
            if (m6943(i)) {
                m6941(canvas, z ? c3080.f9902 : c3080.f9904 - this.f9830, paddingTop, iMax);
            }
            if (m6944(i) && (this.f9832 & 4) > 0) {
                m6941(canvas, z ? c3080.f9904 - this.f9830 : c3080.f9902, paddingTop, iMax);
            }
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo6952() {
        int i = this.f9843;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.InterfaceC3081
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo6951(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f9853 = 1;
        layoutParams.f9851 = 0.0f;
        layoutParams.f9852 = 1.0f;
        layoutParams.f9846 = -1;
        layoutParams.f9845 = -1.0f;
        layoutParams.f9849 = -1;
        layoutParams.f9850 = -1;
        layoutParams.f9847 = 16777215;
        layoutParams.f9848 = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3084.f9925);
        layoutParams.f9853 = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f9851 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f9852 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f9846 = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f9845 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f9849 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f9850 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.f9847 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.f9848 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.f9844 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
