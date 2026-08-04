package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import yyds.AbstractC0797;
import yyds.AbstractC1165;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0797 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f386;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f387;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f388;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f389;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f389 = true;
        this.f387 = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1165.f5362);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue == null || (i4 = typedValuePeekValue.data) != -1) {
            m253(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m253(i4);
        }
        typedArrayObtainStyledAttributes.getBoolean(1, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        if (this.f389 != z) {
            this.f389 = z;
            if (z && (i3 = this.f387) == 6) {
                i2 = i3;
                i = 3;
            } else {
                i = this.f387;
                i2 = i;
            }
            if (i2 != i) {
                this.f387 = i;
                if (i == 6 || i != 3) {
                }
                throw null;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(3, false);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final void m253(int i) {
        boolean z = this.f386;
        if (i == -1) {
            if (z) {
                return;
            }
            this.f386 = true;
        } else if (z || this.f388 != i) {
            this.f386 = false;
            this.f388 = Math.max(0, i);
        }
    }

    public BottomSheetBehavior() {
        this.f389 = true;
        this.f387 = 4;
    }
}
