package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import p318.AbstractC8674;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC8674 {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3088();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public final int f9941;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public final boolean f9942;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public final float f9943;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public final boolean f9944;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final boolean f9945;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9945 = parcel.readByte() != 0;
            this.f9942 = parcel.readByte() != 0;
            this.f9941 = parcel.readInt();
            this.f9943 = parcel.readFloat();
            this.f9944 = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f9945 ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9942 ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f9941);
            parcel.writeFloat(this.f9943);
            parcel.writeByte(this.f9944 ? (byte) 1 : (byte) 0);
        }
    }

    public AppBarLayout$BaseBehavior() {
        this.f24473 = -1;
        this.f24471 = -1;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Parcelable mo6988(View view) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo6989(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo6990(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo6991(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo6992(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p318.AbstractC8673, p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo6994(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ void mo6995(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        this.f24473 = -1;
        this.f24471 = -1;
    }
}
