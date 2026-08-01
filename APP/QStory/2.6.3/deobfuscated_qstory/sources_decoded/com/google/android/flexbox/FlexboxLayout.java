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
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC3082 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3078 f9832;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public SparseIntArray f9833;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int[] f9834;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9835;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f9836;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9837;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3080 f9838;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f9839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9840;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9841;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f9842;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9843;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9844;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f9845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9848;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3077();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f9849;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f9850;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int f9851;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public int f9852;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f9853;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int f9854;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f9855;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public float f9856;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public float f9857;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f9858;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f9858;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9858);
            parcel.writeFloat(this.f9856);
            parcel.writeFloat(this.f9857);
            parcel.writeInt(this.f9851);
            parcel.writeFloat(this.f9850);
            parcel.writeInt(this.f9854);
            parcel.writeInt(this.f9855);
            parcel.writeInt(this.f9852);
            parcel.writeInt(this.f9853);
            parcel.writeByte(this.f9849 ? (byte) 1 : (byte) 0);
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
            return this.f9852;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final int mo6903() {
            return this.f9853;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo6904() {
            return this.f9850;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo6905() {
            return this.f9856;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final boolean mo6906() {
            return this.f9849;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
        public final int mo6907() {
            return this.f9855;
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
            this.f9855 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo6913() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo6914() {
            return this.f9851;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo6915(int i) {
            this.f9854 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo6916() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo6917() {
            return this.f9857;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo6918() {
            return this.f9854;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9844 = -1;
        this.f9832 = new C3078(this);
        this.f9839 = new ArrayList();
        this.f9838 = new C3080();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3085.f9931, 0, 0);
        this.f9848 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f9846 = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f9847 = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.f9841 = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f9840 = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f9844 = typedArrayObtainStyledAttributes.getInt(8, -1);
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
            this.f9837 = i;
            this.f9843 = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.f9837 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.f9843 = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f9833 == null) {
            this.f9833 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9833;
        C3078 c3078 = this.f9832;
        InterfaceC3082 interfaceC3082 = c3078.f9899;
        int flexItemCount = interfaceC3082.getFlexItemCount();
        ArrayList arrayListM6964 = c3078.m6964(flexItemCount);
        C3079 c3079 = new C3079();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c3079.f9900 = 1;
        } else {
            c3079.f9900 = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= interfaceC3082.getFlexItemCount()) {
            c3079.f9901 = flexItemCount;
        } else {
            c3079.f9901 = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C3079) arrayListM6964.get(i2)).f9901++;
            }
        }
        arrayListM6964.add(c3079);
        this.f9834 = C3078.m6963(flexItemCount + 1, arrayListM6964, sparseIntArray);
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
            layoutParams3.f9858 = 1;
            layoutParams3.f9856 = 0.0f;
            layoutParams3.f9857 = 1.0f;
            layoutParams3.f9851 = -1;
            layoutParams3.f9850 = -1.0f;
            layoutParams3.f9854 = -1;
            layoutParams3.f9855 = -1;
            layoutParams3.f9852 = 16777215;
            layoutParams3.f9853 = 16777215;
            layoutParams3.f9858 = layoutParams2.f9858;
            layoutParams3.f9856 = layoutParams2.f9856;
            layoutParams3.f9857 = layoutParams2.f9857;
            layoutParams3.f9851 = layoutParams2.f9851;
            layoutParams3.f9850 = layoutParams2.f9850;
            layoutParams3.f9854 = layoutParams2.f9854;
            layoutParams3.f9855 = layoutParams2.f9855;
            layoutParams3.f9852 = layoutParams2.f9852;
            layoutParams3.f9853 = layoutParams2.f9853;
            layoutParams3.f9849 = layoutParams2.f9849;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f9858 = 1;
            layoutParams4.f9856 = 0.0f;
            layoutParams4.f9857 = 1.0f;
            layoutParams4.f9851 = -1;
            layoutParams4.f9850 = -1.0f;
            layoutParams4.f9854 = -1;
            layoutParams4.f9855 = -1;
            layoutParams4.f9852 = 16777215;
            layoutParams4.f9853 = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f9858 = 1;
        layoutParams5.f9856 = 0.0f;
        layoutParams5.f9857 = 1.0f;
        layoutParams5.f9851 = -1;
        layoutParams5.f9850 = -1.0f;
        layoutParams5.f9854 = -1;
        layoutParams5.f9855 = -1;
        layoutParams5.f9852 = 16777215;
        layoutParams5.f9853 = 16777215;
        return layoutParams5;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getAlignContent() {
        return this.f9840;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getAlignItems() {
        return this.f9841;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9845;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9842;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getFlexDirection() {
        return this.f9848;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C3081> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f9839.size());
        for (C3081 c3081 : this.f9839) {
            if (c3081.m6985() != 0) {
                arrayList.add(c3081);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public List<C3081> getFlexLinesInternal() {
        return this.f9839;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getFlexWrap() {
        return this.f9846;
    }

    public int getJustifyContent() {
        return this.f9847;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getLargestMainSize() {
        Iterator it = this.f9839.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C3081) it.next()).f9905);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getMaxLine() {
        return this.f9844;
    }

    public int getShowDividerHorizontal() {
        return this.f9843;
    }

    public int getShowDividerVertical() {
        return this.f9837;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public int getSumOfCrossSize() {
        int size = this.f9839.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3081 c3081 = (C3081) this.f9839.get(i2);
            if (m6930(i2)) {
                i += mo6939() ? this.f9836 : this.f9835;
            }
            if (m6931(i2)) {
                i += mo6939() ? this.f9836 : this.f9835;
            }
            i += c3081.f9917;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f9842 == null && this.f9845 == null) {
            return;
        }
        if (this.f9843 == 0 && this.f9837 == 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        int layoutDirection = getLayoutDirection();
        int i = this.f9848;
        if (i == 0) {
            m6924(canvas, layoutDirection == 1, this.f9846 == 2);
            return;
        }
        if (i == 1) {
            m6924(canvas, layoutDirection != 1, this.f9846 == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.f9846 == 2) {
                z = !z;
            }
            m6937(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.f9846 == 2) {
            z2 = !z2;
        }
        m6937(canvas, z2, true);
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
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        int layoutDirection = getLayoutDirection();
        int i13 = this.f9848;
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
            flexboxLayout.m6926(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                z4 = layoutDirection == 1;
                if (this.f9846 == 2) {
                    z4 = !z4;
                }
                m6925(z4, false, i, i2, i3, i4);
                return;
            }
            if (i13 != 3) {
                C5925.m11305(this.f9848, "Invalid flex direction is set: ");
                return;
            }
            z4 = layoutDirection == 1;
            if (this.f9846 == 2) {
                z4 = !z4;
            }
            m6925(z4, true, i, i2, i3, i4);
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
        flexboxLayout2.m6926(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f9833 == null) {
            this.f9833 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9833;
        C3078 c3078 = this.f9832;
        InterfaceC3082 interfaceC3082 = c3078.f9899;
        int flexItemCount = interfaceC3082.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.f9833;
            int flexItemCount2 = c3078.f9899.getFlexItemCount();
            this.f9834 = C3078.m6963(flexItemCount2, c3078.m6964(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewMo6919 = interfaceC3082.mo6919(i3);
            if (viewMo6919 != null && ((FlexItem) viewMo6919.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray22 = this.f9833;
                int flexItemCount22 = c3078.f9899.getFlexItemCount();
                this.f9834 = C3078.m6963(flexItemCount22, c3078.m6964(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.f9848;
        C3080 c3080 = this.f9838;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                C5925.m11305(this.f9848, "Invalid value for the flex direction is set: ");
                return;
            }
            this.f9839.clear();
            c3080.f9902 = null;
            c3080.f9903 = 0;
            this.f9832.m6967(this.f9838, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f9839 = c3080.f9902;
            c3078.m6978(i, i2, 0);
            c3078.m6979(i, i2, getPaddingRight() + getPaddingLeft());
            c3078.m6971(0);
            m6927(this.f9848, i, i2, c3080.f9903);
            return;
        }
        this.f9839.clear();
        c3080.f9902 = null;
        c3080.f9903 = 0;
        this.f9832.m6967(this.f9838, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f9839 = c3080.f9902;
        c3078.m6978(i, i2, 0);
        if (this.f9841 == 3) {
            for (C3081 c3081 : this.f9839) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < c3081.f9916; i5++) {
                    View viewM6932 = m6932(c3081.f9914 + i5);
                    if (viewM6932 != null && viewM6932.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewM6932.getLayoutParams();
                        int i6 = this.f9846;
                        int i7 = c3081.f9919;
                        iMax = i6 != 2 ? Math.max(iMax, viewM6932.getMeasuredHeight() + Math.max(i7 - viewM6932.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewM6932.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewM6932.getBaseline() + (i7 - viewM6932.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                c3081.f9917 = iMax;
            }
        }
        c3078.m6979(i, i2, getPaddingBottom() + getPaddingTop());
        c3078.m6971(0);
        m6927(this.f9848, i, i2, c3080.f9903);
    }

    public void setAlignContent(int i) {
        if (this.f9840 != i) {
            this.f9840 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f9841 != i) {
            this.f9841 = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f9845) {
            return;
        }
        this.f9845 = drawable;
        if (drawable != null) {
            this.f9836 = drawable.getIntrinsicHeight();
        } else {
            this.f9836 = 0;
        }
        if (this.f9845 == null && this.f9842 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f9842) {
            return;
        }
        this.f9842 = drawable;
        if (drawable != null) {
            this.f9835 = drawable.getIntrinsicWidth();
        } else {
            this.f9835 = 0;
        }
        if (this.f9845 == null && this.f9842 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f9848 != i) {
            this.f9848 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    public void setFlexLines(List<C3081> list) {
        this.f9839 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f9846 != i) {
            this.f9846 = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f9847 != i) {
            this.f9847 = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f9844 != i) {
            this.f9844 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f9843) {
            this.f9843 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f9837) {
            this.f9837 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View mo6919(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo6920(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View mo6921(int i) {
        return m6932(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6922(C3081 c3081) {
        if (mo6939()) {
            if ((this.f9837 & 4) > 0) {
                int i = c3081.f9905;
                int i2 = this.f9835;
                c3081.f9905 = i + i2;
                c3081.f9904 += i2;
                return;
            }
            return;
        }
        if ((this.f9843 & 4) > 0) {
            int i3 = c3081.f9905;
            int i4 = this.f9836;
            c3081.f9905 = i3 + i4;
            c3081.f9904 += i4;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo6923(View view, int i, int i2, C3081 c3081) {
        if (m6933(i, i2)) {
            boolean zMo6939 = mo6939();
            int i3 = c3081.f9905;
            if (zMo6939) {
                int i4 = this.f9835;
                c3081.f9905 = i3 + i4;
                c3081.f9904 += i4;
            } else {
                int i5 = this.f9836;
                c3081.f9905 = i3 + i5;
                c3081.f9904 += i5;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6924(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f9839.size();
        for (int i = 0; i < size; i++) {
            C3081 c3081 = (C3081) this.f9839.get(i);
            for (int i2 = 0; i2 < c3081.f9916; i2++) {
                int i3 = c3081.f9914 + i2;
                View viewM6932 = m6932(i3);
                if (viewM6932 != null && viewM6932.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM6932.getLayoutParams();
                    if (m6933(i3, i2)) {
                        m6928(canvas, z ? viewM6932.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewM6932.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9835, c3081.f9908, c3081.f9917);
                    }
                    if (i2 == c3081.f9916 - 1 && (this.f9837 & 4) > 0) {
                        m6928(canvas, z ? (viewM6932.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9835 : viewM6932.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, c3081.f9908, c3081.f9917);
                    }
                }
            }
            if (m6930(i)) {
                m6929(canvas, paddingLeft, z2 ? c3081.f9906 : c3081.f9908 - this.f9836, iMax);
            }
            if (m6931(i) && (this.f9843 & 4) > 0) {
                m6929(canvas, paddingLeft, z2 ? c3081.f9908 - this.f9836 : c3081.f9906, iMax);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6925(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m6925(boolean, boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6926(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m6926(boolean, int, int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m6927(int i, int i2, int i3, int i4) {
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
                C5925.m11310(AbstractC6183.m11588(i, "Invalid flex direction: "));
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
            C5925.m11311(AbstractC6183.m11588(mode, "Unknown width mode is set: "));
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
            C5925.m11311(AbstractC6183.m11588(mode2, "Unknown height mode is set: "));
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
    public final void m6928(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9842;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f9835 + i, i3 + i2);
        this.f9842.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6929(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9845;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f9836 + i2);
        this.f9845.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m6930(int i) {
        if (i >= 0 && i < this.f9839.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((C3081) this.f9839.get(i2)).m6985() > 0) {
                    return mo6939() ? (this.f9843 & 2) != 0 : (this.f9837 & 2) != 0;
                }
            }
            if (mo6939()) {
                return (this.f9843 & 1) != 0;
            }
            if ((this.f9837 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m6931(int i) {
        if (i >= 0 && i < this.f9839.size()) {
            for (int i2 = i + 1; i2 < this.f9839.size(); i2++) {
                if (((C3081) this.f9839.get(i2)).m6985() > 0) {
                    return false;
                }
            }
            if (mo6939()) {
                return (this.f9843 & 4) != 0;
            }
            if ((this.f9837 & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final View m6932(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f9834;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m6933(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewM6932 = m6932(i - i3);
            if (viewM6932 != null && viewM6932.getVisibility() != 8) {
                return mo6939() ? (this.f9837 & 2) != 0 : (this.f9843 & 2) != 0;
            }
        }
        return mo6939() ? (this.f9837 & 1) != 0 : (this.f9843 & 1) != 0;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo6934(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo6935(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo6939()) {
            i3 = m6933(i, i2) ? this.f9835 : 0;
            if ((this.f9837 & 4) <= 0) {
                return i3;
            }
            i4 = this.f9835;
        } else {
            i3 = m6933(i, i2) ? this.f9836 : 0;
            if ((this.f9843 & 4) <= 0) {
                return i3;
            }
            i4 = this.f9836;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo6936(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6937(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f9839.size();
        for (int i = 0; i < size; i++) {
            C3081 c3081 = (C3081) this.f9839.get(i);
            for (int i2 = 0; i2 < c3081.f9916; i2++) {
                int i3 = c3081.f9914 + i2;
                View viewM6932 = m6932(i3);
                if (viewM6932 != null && viewM6932.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM6932.getLayoutParams();
                    if (m6933(i3, i2)) {
                        m6929(canvas, c3081.f9909, z2 ? viewM6932.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewM6932.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9836, c3081.f9917);
                    }
                    if (i2 == c3081.f9916 - 1 && (this.f9843 & 4) > 0) {
                        m6929(canvas, c3081.f9909, z2 ? (viewM6932.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9836 : viewM6932.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, c3081.f9917);
                    }
                }
            }
            if (m6930(i)) {
                m6928(canvas, z ? c3081.f9907 : c3081.f9909 - this.f9835, paddingTop, iMax);
            }
            if (m6931(i) && (this.f9837 & 4) > 0) {
                m6928(canvas, z ? c3081.f9909 - this.f9835 : c3081.f9907, paddingTop, iMax);
            }
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo6939() {
        int i = this.f9848;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.InterfaceC3082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo6938(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f9858 = 1;
        layoutParams.f9856 = 0.0f;
        layoutParams.f9857 = 1.0f;
        layoutParams.f9851 = -1;
        layoutParams.f9850 = -1.0f;
        layoutParams.f9854 = -1;
        layoutParams.f9855 = -1;
        layoutParams.f9852 = 16777215;
        layoutParams.f9853 = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3085.f9930);
        layoutParams.f9858 = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f9856 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f9857 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f9851 = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f9850 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f9854 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f9855 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.f9852 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.f9853 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.f9849 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
