package com.google.android.material.textfield;

import Yue.C4520;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class IconHelper {
    private IconHelper() {
    }

    public static void applyIconTint(@InterfaceC6391 TextInputLayout textInputLayout, @InterfaceC6391 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C4520.m13239(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C4520.m13236(drawable, colorStateList);
            } else {
                C4520.m13236(drawable, ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C4520.m13237(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType convertScaleType(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    private static int[] mergeIconState(@InterfaceC6391 TextInputLayout textInputLayout, @InterfaceC6391 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public static void refreshIconDrawableState(@InterfaceC6391 TextInputLayout textInputLayout, @InterfaceC6391 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = C4520.m13239(drawable).mutate();
        C4520.m13236(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void setCompatRippleBackgroundIfNeeded(@InterfaceC6391 CheckableImageButton checkableImageButton) {
    }

    private static void setIconClickable(@InterfaceC6391 CheckableImageButton checkableImageButton, @InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        boolean zM27393 = C8273.m27393(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM27393 || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM27393);
        checkableImageButton.setPressable(zM27393);
        checkableImageButton.setLongClickable(z);
        C8273.m27457(checkableImageButton, z2 ? 1 : 2);
    }

    public static void setIconMinSize(@InterfaceC6391 CheckableImageButton checkableImageButton, @InterfaceC6844 int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void setIconOnClickListener(@InterfaceC6391 CheckableImageButton checkableImageButton, @InterfaceC6490 View.OnClickListener onClickListener, @InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(@InterfaceC6391 CheckableImageButton checkableImageButton, @InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconScaleType(@InterfaceC6391 CheckableImageButton checkableImageButton, @InterfaceC6391 ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
