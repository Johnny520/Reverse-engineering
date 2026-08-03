package com.google.android.material.dialog;

import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MaterialDialogs {
    private MaterialDialogs() {
    }

    @InterfaceC6391
    public static Rect getDialogBackgroundInsets(@InterfaceC6391 Context context, @InterfaceC3451 int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, C1980R.styleable.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @InterfaceC6391
    public static InsetDrawable insetDrawable(@InterfaceC6490 Drawable drawable, @InterfaceC6391 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
