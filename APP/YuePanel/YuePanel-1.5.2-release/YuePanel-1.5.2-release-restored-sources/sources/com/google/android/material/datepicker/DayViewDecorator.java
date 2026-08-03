package com.google.android.material.datepicker;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class DayViewDecorator implements Parcelable {
    @InterfaceC6490
    public ColorStateList getBackgroundColor(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    @InterfaceC6490
    public Drawable getCompoundDrawableBottom(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    @InterfaceC6490
    public Drawable getCompoundDrawableLeft(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    @InterfaceC6490
    public Drawable getCompoundDrawableRight(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    @InterfaceC6490
    public Drawable getCompoundDrawableTop(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    @InterfaceC6490
    public CharSequence getContentDescription(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2, @InterfaceC6490 CharSequence charSequence) {
        return charSequence;
    }

    @InterfaceC6490
    public ColorStateList getTextColor(@InterfaceC6391 Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public void initialize(@InterfaceC6391 Context context) {
    }
}
