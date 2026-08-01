package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.C3177;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p257.C8232;
import p261.AbstractC8247;
import p261.AbstractC8248;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11646 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11647;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View.OnTouchListener f11648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C8232 f11651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f11653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f11654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11657;

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11654 = -1;
        int i = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8247.f22816);
            this.f11657 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f11655 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f11656 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f11650 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f11649 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11653 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f11656;
        this.f11656 = i2 == 0 ? getMinimumWidth() : i2;
        int i3 = this.f11650;
        this.f11650 = i3 == 0 ? getMinimumHeight() : i3;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C3177(this, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f11648;
        if (onTouchListener != null) {
            this.f11647 = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDialogXSafetyMode() {
        return this.f11653;
    }

    public InterfaceC3760 getOnYChanged() {
        return this.f11651;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11652 != 0) {
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11647;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f11654 == -1 && size2 != 0) {
            this.f11654 = size2;
        }
        if (this.f11649) {
            this.f11657 = Math.min(this.f11657, Math.min(size2, this.f11654));
        }
        int i3 = this.f11655;
        if (size > i3 && i3 != 0) {
            size = getPaddingBottom() + i3 + getPaddingTop();
        }
        int i4 = this.f11657;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingLeft() + i4 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f11650 = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f11656 = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f11652 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f11648 = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C8232 c8232 = this.f11651;
        if (c8232 != null) {
            c8232.m13751(f);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8075(int i) {
        if (i > 0) {
            this.f11657 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8076(int i) {
        if (i > 0) {
            this.f11655 = i;
        }
    }

    public void setContentView(View view) {
    }
}
