package com.google.android.material.internal;

import Yue.AbstractC2967;
import Yue.C3024;
import Yue.C3055;
import Yue.C3311;
import Yue.C6898;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class CheckableImageButton extends C3311 implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = {R.attr.state_checked};
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC6391
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean checked;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@InterfaceC6391 Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.checked) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = DRAWABLE_STATE_CHECKED;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    @Override // android.view.View
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.checkable || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.pressable = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.pressable) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18490);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkable = true;
        this.pressable = true;
        C8273.m27439(this, new C3024() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // Yue.C3024
            public void onInitializeAccessibilityEvent(View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                c3055.m6055(CheckableImageButton.this.isCheckable());
                c3055.m6056(CheckableImageButton.this.isChecked());
            }
        });
    }
}
