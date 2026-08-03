package com.google.android.material.datepicker;

import Yue.C6740;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes.dex */
final class CalendarItemStyle {
    private final ColorStateList backgroundColor;

    @InterfaceC6391
    private final Rect insets;
    private final ShapeAppearanceModel itemShape;
    private final ColorStateList strokeColor;
    private final int strokeWidth;
    private final ColorStateList textColor;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, @InterfaceC6391 Rect rect) {
        C6740.m21412(rect.left);
        C6740.m21412(rect.top);
        C6740.m21412(rect.right);
        C6740.m21412(rect.bottom);
        this.insets = rect;
        this.textColor = colorStateList2;
        this.backgroundColor = colorStateList;
        this.strokeColor = colorStateList3;
        this.strokeWidth = i;
        this.itemShape = shapeAppearanceModel;
    }

    @InterfaceC6391
    public static CalendarItemStyle create(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        C6740.m3227(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1980R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
    }

    public int getBottomInset() {
        return this.insets.bottom;
    }

    public int getLeftInset() {
        return this.insets.left;
    }

    public int getRightInset() {
        return this.insets.right;
    }

    public int getTopInset() {
        return this.insets.top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void styleItem(@InterfaceC6391 TextView textView) {
        styleItem(textView, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void styleItem(@InterfaceC6391 TextView textView, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6490 ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.itemShape);
        materialShapeDrawable2.setShapeAppearanceModel(this.itemShape);
        if (colorStateList == null) {
            colorStateList = this.backgroundColor;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        if (colorStateList2 == null) {
            colorStateList2 = this.textColor;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.textColor.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.insets;
        C8273.m27447(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
