package com.android.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import yyds.AbstractC1224;
import yyds.C1213;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class CustomRecyclerView extends C1213 {

    /* JADX INFO: renamed from: ᛴᲇᛵᛸ, reason: contains not printable characters */
    public int f373;

    public CustomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f373 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1224.f5606);
            this.f373 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // yyds.C1213, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f373 > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == 0 || size > this.f373) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f373, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f373 = i;
        requestLayout();
    }

    public CustomRecyclerView(Context context) {
        super(context, null);
        this.f373 = -1;
    }
}
