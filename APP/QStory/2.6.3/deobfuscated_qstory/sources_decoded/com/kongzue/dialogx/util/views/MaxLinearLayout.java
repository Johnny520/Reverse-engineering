package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p261.AbstractC8247;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaxLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11641;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11645;

    public MaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11641 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8247.f22816);
            this.f11645 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f11643 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f11644 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f11642 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f11644;
        this.f11644 = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f11642;
        this.f11642 = i2 == 0 ? getMinimumHeight() : i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f11641 == -1 && size2 != 0) {
            this.f11641 = size2;
        }
        int i3 = this.f11643;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f11645;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f11642 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f11644 = i;
        super.setMinimumWidth(i);
    }
}
