package com.kongzue.dialogx.util.views;

import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kongzue.dialogx.C2413R;

/* JADX INFO: loaded from: classes2.dex */
public class MaxLinearLayout extends LinearLayout {
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    private int preWidth;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaxLinearLayout(Context context) {
        super(context);
        this.preWidth = -1;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2413R.styleable.DialogXMaxLayout);
            this.maxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.DialogXMaxLayout_maxLayoutWidth, 0);
            this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.DialogXMaxLayout_maxLayoutHeight, 0);
            this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.DialogXMaxLayout_minLayoutWidth, 0);
            this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.DialogXMaxLayout_minLayoutHeight, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int minimumWidth = this.minWidth;
        if (minimumWidth == 0) {
            minimumWidth = getMinimumWidth();
        }
        this.minWidth = minimumWidth;
        int minimumHeight = this.minHeight;
        if (minimumHeight == 0) {
            minimumHeight = getMinimumHeight();
        }
        this.minHeight = minimumHeight;
    }

    public int dip2px(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.preWidth == -1 && size2 != 0) {
            this.preWidth = size2;
        }
        int i3 = this.maxHeight;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.maxWidth;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public MaxLinearLayout setMaxHeight(int i) {
        this.maxHeight = i;
        return this;
    }

    public MaxLinearLayout setMaxWidth(int i) {
        this.maxWidth = i;
        return this;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.minHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.minWidth = i;
        super.setMinimumWidth(i);
    }

    public MaxLinearLayout(Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.preWidth = -1;
        init(context, attributeSet);
    }

    public MaxLinearLayout(Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.preWidth = -1;
        init(context, attributeSet);
    }
}
