package com.google.android.material.divider;

import Yue.C4187;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC4398;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_MaterialDivider;

    @InterfaceC3897
    private int color;

    @InterfaceC6391
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialDivider(@InterfaceC6391 Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    @InterfaceC6844
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @InterfaceC6844
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC6391 Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = C8273.m27356(this) == 1;
        int i2 = z ? this.insetEnd : this.insetStart;
        if (z) {
            width = getWidth();
            i = this.insetStart;
        } else {
            width = getWidth();
            i = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.thickness;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@InterfaceC3897 int i) {
        if (this.color != i) {
            this.color = i;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@InterfaceC3906 int i) {
        setDividerColor(C4187.m12060(getContext(), i));
    }

    public void setDividerInsetEnd(@InterfaceC6844 int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(@InterfaceC4398 int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@InterfaceC6844 int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(@InterfaceC4398 int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@InterfaceC6844 int i) {
        if (this.thickness != i) {
            this.thickness = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@InterfaceC4398 int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialDivider(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialDivider, i, i2, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(C1980R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
