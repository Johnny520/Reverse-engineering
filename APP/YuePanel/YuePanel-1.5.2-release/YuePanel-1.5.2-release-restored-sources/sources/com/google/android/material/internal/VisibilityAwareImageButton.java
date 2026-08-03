package com.google.android.material.internal;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {
    private int userSetVisibility;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }

    public final void internalSetVisibility(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.userSetVisibility = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        internalSetVisibility(i, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userSetVisibility = getVisibility();
    }
}
