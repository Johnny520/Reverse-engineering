package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.C0973;
import androidx.core.view.AbstractC3103;
import androidx.customview.view.AbsSavedState;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.C3932;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0973 implements Checkable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f10757 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f10758;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10759;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f10760;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3984 f10761;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3983();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f10762;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10762 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10762 ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.imageButtonStyle);
        this.f10758 = true;
        this.f10760 = true;
        AbstractC3103.m4804(this, new C3932(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10759;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f10759 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f10757) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f10761 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f7044);
        setChecked(savedState.f10762);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10762 = this.f10759;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f10758 != z) {
            this.f10758 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f10758 || this.f10759 == z) {
            return;
        }
        this.f10759 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        InterfaceC3984 interfaceC3984;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (interfaceC3984 = this.f10761) == null) {
            return;
        }
        interfaceC3984.mo5043();
    }

    public void setOnFocusableChangedListener(InterfaceC3984 interfaceC3984) {
        this.f10761 = interfaceC3984;
    }

    public void setPressable(boolean z) {
        this.f10760 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f10760) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10759);
    }
}
