package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.C0126;
import androidx.core.view.AbstractC2270;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.button.C3099;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0126 implements Checkable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f10407 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f10408;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10409;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f10410;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3151 f10411;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3150();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f10412;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10412 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10412 ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.imageButtonStyle);
        this.f10408 = true;
        this.f10410 = true;
        AbstractC2270.m4234(this, new C3099(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10409;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f10409 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f10407) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f10411 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6698);
        setChecked(savedState.f10412);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10412 = this.f10409;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f10408 != z) {
            this.f10408 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f10408 || this.f10409 == z) {
            return;
        }
        this.f10409 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        InterfaceC3151 interfaceC3151;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (interfaceC3151 = this.f10411) == null) {
            return;
        }
        interfaceC3151.mo4473();
    }

    public void setOnFocusableChangedListener(InterfaceC3151 interfaceC3151) {
        this.f10411 = interfaceC3151;
    }

    public void setPressable(boolean z) {
        this.f10410 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f10410) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10409);
    }
}
