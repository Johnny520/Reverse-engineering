package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import p318.AbstractC8682;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC8682 {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3087();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public final int f9936;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public final boolean f9937;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public final float f9938;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public final boolean f9939;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final boolean f9940;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9940 = parcel.readByte() != 0;
            this.f9937 = parcel.readByte() != 0;
            this.f9936 = parcel.readInt();
            this.f9938 = parcel.readFloat();
            this.f9939 = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f9940 ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9937 ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f9936);
            parcel.writeFloat(this.f9938);
            parcel.writeByte(this.f9939 ? (byte) 1 : (byte) 0);
        }
    }

    public AppBarLayout$BaseBehavior() {
        this.f24481 = -1;
        this.f24479 = -1;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Parcelable mo7001(View view) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7002(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo7003(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo7004(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo7005(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p318.AbstractC8681, p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo7007(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ void mo7008(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        this.f24481 = -1;
        this.f24479 = -1;
    }
}
