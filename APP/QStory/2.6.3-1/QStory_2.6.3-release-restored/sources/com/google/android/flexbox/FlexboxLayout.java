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
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC3914 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3910 f10177;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public SparseIntArray f10178;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int[] f10179;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f10180;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f10181;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f10182;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3912 f10183;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f10184;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10185;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10186;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f10187;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10188;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f10189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f10190;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10191;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10192;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10193;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3909();

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public boolean f10194;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f10195;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public int f10196;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public int f10197;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f10198;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public int f10199;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f10200;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public float f10201;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public float f10202;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f10203;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f10203;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10203);
            parcel.writeFloat(this.f10201);
            parcel.writeFloat(this.f10202);
            parcel.writeInt(this.f10196);
            parcel.writeFloat(this.f10195);
            parcel.writeInt(this.f10199);
            parcel.writeInt(this.f10200);
            parcel.writeInt(this.f10197);
            parcel.writeInt(this.f10198);
            parcel.writeByte(this.f10194 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
        public final int mo7461() {
            return this.f10197;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final int mo7462() {
            return this.f10198;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo7463() {
            return this.f10195;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo7464() {
            return this.f10201;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final boolean mo7465() {
            return this.f10194;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
        public final int mo7466() {
            return this.f10200;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
        public final int mo7467() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
        public final int mo7468() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final int mo7469() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
        public final int mo7470() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
        public final void mo7471(int i) {
            this.f10200 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo7472() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo7473() {
            return this.f10196;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo7474(int i) {
            this.f10199 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo7475() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo7476() {
            return this.f10202;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo7477() {
            return this.f10199;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10189 = -1;
        this.f10177 = new C3910(this);
        this.f10184 = new ArrayList();
        this.f10183 = new C3912();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3917.f10276, 0, 0);
        this.f10193 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f10191 = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f10192 = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.f10186 = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f10185 = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f10189 = typedArrayObtainStyledAttributes.getInt(8, -1);
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
            this.f10182 = i;
            this.f10188 = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.f10182 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.f10188 = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f10178 == null) {
            this.f10178 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f10178;
        C3910 c3910 = this.f10177;
        InterfaceC3914 interfaceC3914 = c3910.f10244;
        int flexItemCount = interfaceC3914.getFlexItemCount();
        ArrayList arrayListM7523 = c3910.m7523(flexItemCount);
        C3911 c3911 = new C3911();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c3911.f10245 = 1;
        } else {
            c3911.f10245 = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= interfaceC3914.getFlexItemCount()) {
            c3911.f10246 = flexItemCount;
        } else {
            c3911.f10246 = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C3911) arrayListM7523.get(i2)).f10246++;
            }
        }
        arrayListM7523.add(c3911);
        this.f10179 = C3910.m7522(flexItemCount + 1, arrayListM7523, sparseIntArray);
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
            layoutParams3.f10203 = 1;
            layoutParams3.f10201 = 0.0f;
            layoutParams3.f10202 = 1.0f;
            layoutParams3.f10196 = -1;
            layoutParams3.f10195 = -1.0f;
            layoutParams3.f10199 = -1;
            layoutParams3.f10200 = -1;
            layoutParams3.f10197 = 16777215;
            layoutParams3.f10198 = 16777215;
            layoutParams3.f10203 = layoutParams2.f10203;
            layoutParams3.f10201 = layoutParams2.f10201;
            layoutParams3.f10202 = layoutParams2.f10202;
            layoutParams3.f10196 = layoutParams2.f10196;
            layoutParams3.f10195 = layoutParams2.f10195;
            layoutParams3.f10199 = layoutParams2.f10199;
            layoutParams3.f10200 = layoutParams2.f10200;
            layoutParams3.f10197 = layoutParams2.f10197;
            layoutParams3.f10198 = layoutParams2.f10198;
            layoutParams3.f10194 = layoutParams2.f10194;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f10203 = 1;
            layoutParams4.f10201 = 0.0f;
            layoutParams4.f10202 = 1.0f;
            layoutParams4.f10196 = -1;
            layoutParams4.f10195 = -1.0f;
            layoutParams4.f10199 = -1;
            layoutParams4.f10200 = -1;
            layoutParams4.f10197 = 16777215;
            layoutParams4.f10198 = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f10203 = 1;
        layoutParams5.f10201 = 0.0f;
        layoutParams5.f10202 = 1.0f;
        layoutParams5.f10196 = -1;
        layoutParams5.f10195 = -1.0f;
        layoutParams5.f10199 = -1;
        layoutParams5.f10200 = -1;
        layoutParams5.f10197 = 16777215;
        layoutParams5.f10198 = 16777215;
        return layoutParams5;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getAlignContent() {
        return this.f10185;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getAlignItems() {
        return this.f10186;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f10190;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f10187;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getFlexDirection() {
        return this.f10193;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C3913> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f10184.size());
        for (C3913 c3913 : this.f10184) {
            if (c3913.m7544() != 0) {
                arrayList.add(c3913);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public List<C3913> getFlexLinesInternal() {
        return this.f10184;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getFlexWrap() {
        return this.f10191;
    }

    public int getJustifyContent() {
        return this.f10192;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getLargestMainSize() {
        Iterator it = this.f10184.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C3913) it.next()).f10250);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getMaxLine() {
        return this.f10189;
    }

    public int getShowDividerHorizontal() {
        return this.f10188;
    }

    public int getShowDividerVertical() {
        return this.f10182;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public int getSumOfCrossSize() {
        int size = this.f10184.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3913 c3913 = (C3913) this.f10184.get(i2);
            if (m7489(i2)) {
                i += mo7498() ? this.f10181 : this.f10180;
            }
            if (m7490(i2)) {
                i += mo7498() ? this.f10181 : this.f10180;
            }
            i += c3913.f10262;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f10187 == null && this.f10190 == null) {
            return;
        }
        if (this.f10188 == 0 && this.f10182 == 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int layoutDirection = getLayoutDirection();
        int i = this.f10193;
        if (i == 0) {
            m7483(canvas, layoutDirection == 1, this.f10191 == 2);
            return;
        }
        if (i == 1) {
            m7483(canvas, layoutDirection != 1, this.f10191 == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.f10191 == 2) {
                z = !z;
            }
            m7496(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.f10191 == 2) {
            z2 = !z2;
        }
        m7496(canvas, z2, true);
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
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int layoutDirection = getLayoutDirection();
        int i13 = this.f10193;
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
            flexboxLayout.m7485(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                z4 = layoutDirection == 1;
                if (this.f10191 == 2) {
                    z4 = !z4;
                }
                m7484(z4, false, i, i2, i3, i4);
                return;
            }
            if (i13 != 3) {
                C6755.m11864(this.f10193, "Invalid flex direction is set: ");
                return;
            }
            z4 = layoutDirection == 1;
            if (this.f10191 == 2) {
                z4 = !z4;
            }
            m7484(z4, true, i, i2, i3, i4);
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
        flexboxLayout2.m7485(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f10178 == null) {
            this.f10178 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f10178;
        C3910 c3910 = this.f10177;
        InterfaceC3914 interfaceC3914 = c3910.f10244;
        int flexItemCount = interfaceC3914.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.f10178;
            int flexItemCount2 = c3910.f10244.getFlexItemCount();
            this.f10179 = C3910.m7522(flexItemCount2, c3910.m7523(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewMo7478 = interfaceC3914.mo7478(i3);
            if (viewMo7478 != null && ((FlexItem) viewMo7478.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray22 = this.f10178;
                int flexItemCount22 = c3910.f10244.getFlexItemCount();
                this.f10179 = C3910.m7522(flexItemCount22, c3910.m7523(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.f10193;
        C3912 c3912 = this.f10183;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                C6755.m11864(this.f10193, "Invalid value for the flex direction is set: ");
                return;
            }
            this.f10184.clear();
            c3912.f10247 = null;
            c3912.f10248 = 0;
            this.f10177.m7526(this.f10183, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f10184 = c3912.f10247;
            c3910.m7537(i, i2, 0);
            c3910.m7538(i, i2, getPaddingRight() + getPaddingLeft());
            c3910.m7530(0);
            m7486(this.f10193, i, i2, c3912.f10248);
            return;
        }
        this.f10184.clear();
        c3912.f10247 = null;
        c3912.f10248 = 0;
        this.f10177.m7526(this.f10183, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f10184 = c3912.f10247;
        c3910.m7537(i, i2, 0);
        if (this.f10186 == 3) {
            for (C3913 c3913 : this.f10184) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < c3913.f10261; i5++) {
                    View viewM7491 = m7491(c3913.f10259 + i5);
                    if (viewM7491 != null && viewM7491.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewM7491.getLayoutParams();
                        int i6 = this.f10191;
                        int i7 = c3913.f10264;
                        iMax = i6 != 2 ? Math.max(iMax, viewM7491.getMeasuredHeight() + Math.max(i7 - viewM7491.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewM7491.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewM7491.getBaseline() + (i7 - viewM7491.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                c3913.f10262 = iMax;
            }
        }
        c3910.m7538(i, i2, getPaddingBottom() + getPaddingTop());
        c3910.m7530(0);
        m7486(this.f10193, i, i2, c3912.f10248);
    }

    public void setAlignContent(int i) {
        if (this.f10185 != i) {
            this.f10185 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f10186 != i) {
            this.f10186 = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f10190) {
            return;
        }
        this.f10190 = drawable;
        if (drawable != null) {
            this.f10181 = drawable.getIntrinsicHeight();
        } else {
            this.f10181 = 0;
        }
        if (this.f10190 == null && this.f10187 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f10187) {
            return;
        }
        this.f10187 = drawable;
        if (drawable != null) {
            this.f10180 = drawable.getIntrinsicWidth();
        } else {
            this.f10180 = 0;
        }
        if (this.f10190 == null && this.f10187 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f10193 != i) {
            this.f10193 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public void setFlexLines(List<C3913> list) {
        this.f10184 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f10191 != i) {
            this.f10191 = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f10192 != i) {
            this.f10192 = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f10189 != i) {
            this.f10189 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f10188) {
            this.f10188 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f10182) {
            this.f10182 = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View mo7478(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo7479(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View mo7480(int i) {
        return m7491(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7481(C3913 c3913) {
        if (mo7498()) {
            if ((this.f10182 & 4) > 0) {
                int i = c3913.f10250;
                int i2 = this.f10180;
                c3913.f10250 = i + i2;
                c3913.f10249 += i2;
                return;
            }
            return;
        }
        if ((this.f10188 & 4) > 0) {
            int i3 = c3913.f10250;
            int i4 = this.f10181;
            c3913.f10250 = i3 + i4;
            c3913.f10249 += i4;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7482(View view, int i, int i2, C3913 c3913) {
        if (m7492(i, i2)) {
            boolean zMo7498 = mo7498();
            int i3 = c3913.f10250;
            if (zMo7498) {
                int i4 = this.f10180;
                c3913.f10250 = i3 + i4;
                c3913.f10249 += i4;
            } else {
                int i5 = this.f10181;
                c3913.f10250 = i3 + i5;
                c3913.f10249 += i5;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7483(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f10184.size();
        for (int i = 0; i < size; i++) {
            C3913 c3913 = (C3913) this.f10184.get(i);
            for (int i2 = 0; i2 < c3913.f10261; i2++) {
                int i3 = c3913.f10259 + i2;
                View viewM7491 = m7491(i3);
                if (viewM7491 != null && viewM7491.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM7491.getLayoutParams();
                    if (m7492(i3, i2)) {
                        m7487(canvas, z ? viewM7491.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewM7491.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f10180, c3913.f10253, c3913.f10262);
                    }
                    if (i2 == c3913.f10261 - 1 && (this.f10182 & 4) > 0) {
                        m7487(canvas, z ? (viewM7491.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f10180 : viewM7491.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, c3913.f10253, c3913.f10262);
                    }
                }
            }
            if (m7489(i)) {
                m7488(canvas, paddingLeft, z2 ? c3913.f10251 : c3913.f10253 - this.f10181, iMax);
            }
            if (m7490(i) && (this.f10188 & 4) > 0) {
                m7488(canvas, paddingLeft, z2 ? c3913.f10253 - this.f10181 : c3913.f10251, iMax);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7484(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        C3913 c3913;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.f10184.size();
        for (int i12 = 0; i12 < size; i12++) {
            C3913 c39132 = (C3913) this.f10184.get(i12);
            if (m7489(i12)) {
                int i13 = this.f10180;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = i11;
            int i15 = this.f10192;
            char c2 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredHeight = paddingTop;
                f = i10 - paddingBottom;
            } else if (i15 == 1) {
                int i17 = c39132.f10250;
                f = i17 - paddingTop;
                measuredHeight = (i10 - i17) + paddingBottom;
            } else if (i15 != 2) {
                if (i15 == 3) {
                    measuredHeight = paddingTop;
                    f2 = (i10 - c39132.f10250) / (c39132.m7544() != 1 ? r13 - 1 : 1.0f);
                    f = i10 - paddingBottom;
                } else if (i15 == 4) {
                    int iM7544 = c39132.m7544();
                    f2 = iM7544 != 0 ? (i10 - c39132.f10250) / iM7544 : 0.0f;
                    float f3 = f2 / 2.0f;
                    measuredHeight = paddingTop + f3;
                    f = (i10 - paddingBottom) - f3;
                } else {
                    if (i15 != 5) {
                        C6755.m11864(this.f10192, "Invalid justifyContent is set: ");
                        return;
                    }
                    f2 = c39132.m7544() != 0 ? (i10 - c39132.f10250) / (r5 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i10 - paddingBottom) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < c39132.f10261) {
                    int i18 = c39132.f10259 + i5;
                    int i19 = i16;
                    View viewM7491 = m7491(i18);
                    if (viewM7491 != null) {
                        c = c2;
                        if (viewM7491.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) viewM7491.getLayoutParams();
                            float f4 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f5 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (m7492(i18, i5)) {
                                i9 = this.f10181;
                                float f6 = i9;
                                f4 += f6;
                                f5 -= f6;
                            } else {
                                i9 = 0;
                            }
                            float f7 = f5;
                            int i20 = (i5 != c39132.f10261 - i19 || (this.f10188 & 4) <= 0) ? 0 : this.f10181;
                            int i21 = i5;
                            C3910 c3910 = this.f10177;
                            if (z) {
                                if (z2) {
                                    i8 = i19;
                                    i7 = i21;
                                    c3910.m7536(viewM7491, c39132, true, i14 - viewM7491.getMeasuredWidth(), Math.round(f7) - viewM7491.getMeasuredHeight(), i14, Math.round(f7));
                                } else {
                                    i7 = i21;
                                    i8 = i19;
                                    c3910.m7536(viewM7491, c39132, true, i14 - viewM7491.getMeasuredWidth(), Math.round(f4), i14, viewM7491.getMeasuredHeight() + Math.round(f4));
                                }
                                i6 = i14;
                            } else {
                                i7 = i21;
                                i8 = i19;
                                i6 = i14;
                                if (z2) {
                                    c3910.m7536(viewM7491, c39132, false, paddingLeft, Math.round(f7) - viewM7491.getMeasuredHeight(), viewM7491.getMeasuredWidth() + paddingLeft, Math.round(f7));
                                } else {
                                    int i22 = paddingLeft;
                                    c3910.m7536(viewM7491, c39132, false, i22, Math.round(f4), viewM7491.getMeasuredWidth() + i22, viewM7491.getMeasuredHeight() + Math.round(f4));
                                    paddingLeft = i22;
                                }
                            }
                            measuredHeight = f4 + viewM7491.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f7 - ((viewM7491.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                c3913 = c39132;
                                c3913.m7543(viewM7491, 0, i20, 0, i9);
                            } else {
                                c3913 = c39132;
                                c3913.m7543(viewM7491, 0, i9, 0, i20);
                            }
                            c39132 = c3913;
                            f = measuredHeight2;
                        }
                        i5 = i7 + 1;
                        c2 = c;
                        i16 = i8;
                        i14 = i6;
                    } else {
                        c = c2;
                    }
                    i7 = i5;
                    i8 = i19;
                    i6 = i14;
                    i5 = i7 + 1;
                    c2 = c;
                    i16 = i8;
                    i14 = i6;
                }
                int i23 = c39132.f10262;
                paddingLeft += i23;
                i11 = i14 - i23;
            } else {
                float f8 = (i10 - c39132.f10250) / 2.0f;
                measuredHeight = paddingTop + f8;
                f = (i10 - paddingBottom) - f8;
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < c39132.f10261) {
            }
            int i232 = c39132.f10262;
            paddingLeft += i232;
            i11 = i14 - i232;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7485(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        C3913 c3913;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f10184.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3913 c39132 = (C3913) this.f10184.get(i11);
            if (m7489(i11)) {
                int i12 = this.f10181;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = paddingBottom;
            int i14 = this.f10192;
            char c = 4;
            int i15 = 2;
            boolean z3 = true;
            if (i14 == 0) {
                measuredWidth = paddingLeft;
                f = i10 - paddingRight;
            } else if (i14 == 1) {
                int i16 = c39132.f10250;
                f = i16 - paddingLeft;
                measuredWidth = (i10 - i16) + paddingRight;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    measuredWidth = paddingLeft;
                    f2 = (i10 - c39132.f10250) / (c39132.m7544() != 1 ? r7 - 1 : 1.0f);
                    f = i10 - paddingRight;
                } else if (i14 == 4) {
                    int iM7544 = c39132.m7544();
                    float f3 = iM7544 != 0 ? (i10 - c39132.f10250) / iM7544 : 0.0f;
                    float f4 = f3 / 2.0f;
                    measuredWidth = paddingLeft + f4;
                    float f5 = (i10 - paddingRight) - f4;
                    f2 = f3;
                    f = f5;
                } else {
                    if (i14 != 5) {
                        C6755.m11864(this.f10192, "Invalid justifyContent is set: ");
                        return;
                    }
                    f2 = c39132.m7544() != 0 ? (i10 - c39132.f10250) / (r3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i10 - paddingRight) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < c39132.f10261) {
                    int i17 = c39132.f10259 + i5;
                    View viewM7491 = m7491(i17);
                    char c2 = c;
                    if (viewM7491 != null) {
                        boolean z4 = z3;
                        if (viewM7491.getVisibility() == 8) {
                            z2 = z4;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewM7491.getLayoutParams();
                            float f6 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f7 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (m7492(i17, i5)) {
                                int i18 = this.f10180;
                                float f8 = i18;
                                f6 += f8;
                                f7 -= f8;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            float f9 = f7;
                            int i19 = (i5 != c39132.f10261 + (-1) || (this.f10182 & 4) <= 0) ? 0 : this.f10180;
                            if (this.f10191 == i15) {
                                int i20 = i15;
                                C3910 c3910 = this.f10177;
                                if (z) {
                                    i7 = i20;
                                    i8 = i5;
                                    view = viewM7491;
                                    z2 = z4;
                                    c3910.m7535(view, c39132, Math.round(f9) - viewM7491.getMeasuredWidth(), i13 - viewM7491.getMeasuredHeight(), Math.round(f9), i13);
                                } else {
                                    i8 = i5;
                                    view = viewM7491;
                                    z2 = z4;
                                    i7 = i20;
                                    c3910.m7535(view, c39132, Math.round(f6), i13 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f6), i13);
                                }
                                i6 = i13;
                            } else {
                                i8 = i5;
                                view = viewM7491;
                                z2 = z4;
                                i7 = i15;
                                i6 = i13;
                                C3910 c39102 = this.f10177;
                                if (z) {
                                    c39102.m7535(view, c39132, Math.round(f9) - view.getMeasuredWidth(), paddingTop, Math.round(f9), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i21 = paddingTop;
                                    c39102.m7535(view, c39132, Math.round(f6), i21, view.getMeasuredWidth() + Math.round(f6), view.getMeasuredHeight() + i21);
                                    paddingTop = i21;
                                }
                            }
                            measuredWidth = f6 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f9 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                c3913 = c39132;
                                c3913.m7543(view, i19, 0, i9, 0);
                            } else {
                                c3913 = c39132;
                                c3913.m7543(view, i9, 0, i19, 0);
                            }
                            c39132 = c3913;
                            f = measuredWidth2;
                            i5 = i8 + 1;
                            c = c2;
                            i15 = i7;
                            z3 = z2;
                            i13 = i6;
                        }
                    } else {
                        z2 = z3;
                    }
                    i7 = i15;
                    i8 = i5;
                    i6 = i13;
                    i5 = i8 + 1;
                    c = c2;
                    i15 = i7;
                    z3 = z2;
                    i13 = i6;
                }
                int i22 = c39132.f10262;
                paddingTop += i22;
                paddingBottom = i13 - i22;
            } else {
                int i23 = c39132.f10250;
                measuredWidth = paddingLeft + ((i10 - i23) / 2.0f);
                f = (i10 - paddingRight) - ((i10 - i23) / 2.0f);
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < c39132.f10261) {
            }
            int i222 = c39132.f10262;
            paddingTop += i222;
            paddingBottom = i13 - i222;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7486(int i, int i2, int i3, int i4) {
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
                C6755.m11869(AbstractC7012.m12147(i, "Invalid flex direction: "));
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
            C6755.m11870(AbstractC7012.m12147(mode, "Unknown width mode is set: "));
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
            C6755.m11870(AbstractC7012.m12147(mode2, "Unknown height mode is set: "));
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
    public final void m7487(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f10187;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f10180 + i, i3 + i2);
        this.f10187.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7488(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f10190;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f10181 + i2);
        this.f10190.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7489(int i) {
        if (i >= 0 && i < this.f10184.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((C3913) this.f10184.get(i2)).m7544() > 0) {
                    return mo7498() ? (this.f10188 & 2) != 0 : (this.f10182 & 2) != 0;
                }
            }
            if (mo7498()) {
                return (this.f10188 & 1) != 0;
            }
            if ((this.f10182 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m7490(int i) {
        if (i >= 0 && i < this.f10184.size()) {
            for (int i2 = i + 1; i2 < this.f10184.size(); i2++) {
                if (((C3913) this.f10184.get(i2)).m7544() > 0) {
                    return false;
                }
            }
            if (mo7498()) {
                return (this.f10188 & 4) != 0;
            }
            if ((this.f10182 & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final View m7491(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f10179;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7492(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewM7491 = m7491(i - i3);
            if (viewM7491 != null && viewM7491.getVisibility() != 8) {
                return mo7498() ? (this.f10182 & 2) != 0 : (this.f10188 & 2) != 0;
            }
        }
        return mo7498() ? (this.f10182 & 1) != 0 : (this.f10188 & 1) != 0;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo7493(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo7494(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo7498()) {
            i3 = m7492(i, i2) ? this.f10180 : 0;
            if ((this.f10182 & 4) <= 0) {
                return i3;
            }
            i4 = this.f10180;
        } else {
            i3 = m7492(i, i2) ? this.f10181 : 0;
            if ((this.f10188 & 4) <= 0) {
                return i3;
            }
            i4 = this.f10181;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo7495(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7496(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f10184.size();
        for (int i = 0; i < size; i++) {
            C3913 c3913 = (C3913) this.f10184.get(i);
            for (int i2 = 0; i2 < c3913.f10261; i2++) {
                int i3 = c3913.f10259 + i2;
                View viewM7491 = m7491(i3);
                if (viewM7491 != null && viewM7491.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM7491.getLayoutParams();
                    if (m7492(i3, i2)) {
                        m7488(canvas, c3913.f10254, z2 ? viewM7491.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewM7491.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f10181, c3913.f10262);
                    }
                    if (i2 == c3913.f10261 - 1 && (this.f10188 & 4) > 0) {
                        m7488(canvas, c3913.f10254, z2 ? (viewM7491.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f10181 : viewM7491.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, c3913.f10262);
                    }
                }
            }
            if (m7489(i)) {
                m7487(canvas, z ? c3913.f10252 : c3913.f10254 - this.f10180, paddingTop, iMax);
            }
            if (m7490(i) && (this.f10182 & 4) > 0) {
                m7487(canvas, z ? c3913.f10254 - this.f10180 : c3913.f10252, paddingTop, iMax);
            }
        }
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo7498() {
        int i = this.f10193;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo7497(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f10203 = 1;
        layoutParams.f10201 = 0.0f;
        layoutParams.f10202 = 1.0f;
        layoutParams.f10196 = -1;
        layoutParams.f10195 = -1.0f;
        layoutParams.f10199 = -1;
        layoutParams.f10200 = -1;
        layoutParams.f10197 = 16777215;
        layoutParams.f10198 = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3917.f10275);
        layoutParams.f10203 = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f10201 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f10202 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f10196 = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f10195 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f10199 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f10200 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.f10197 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.f10198 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.f10194 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
