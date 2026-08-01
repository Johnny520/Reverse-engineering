package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.C3176;
import p033.AbstractC6325;
import p257.C8231;
import p261.AbstractC8246;
import p261.AbstractC8247;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11641 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11642;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View.OnTouchListener f11643;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11645;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C8231 f11646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f11648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f11649;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11652;

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11649 = -1;
        int i = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8246.f22817);
            this.f11652 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f11650 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f11651 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f11645 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f11644 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11648 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f11651;
        this.f11651 = i2 == 0 ? getMinimumWidth() : i2;
        int i3 = this.f11645;
        this.f11645 = i3 == 0 ? getMinimumHeight() : i3;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C3176(this, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f11643;
        if (onTouchListener != null) {
            this.f11642 = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDialogXSafetyMode() {
        return this.f11648;
    }

    public InterfaceC3759 getOnYChanged() {
        return this.f11646;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11647 != 0) {
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11642;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f11649 == -1 && size2 != 0) {
            this.f11649 = size2;
        }
        if (this.f11644) {
            this.f11652 = Math.min(this.f11652, Math.min(size2, this.f11649));
        }
        int i3 = this.f11650;
        if (size > i3 && i3 != 0) {
            size = getPaddingBottom() + i3 + getPaddingTop();
        }
        int i4 = this.f11652;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingLeft() + i4 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f11645 = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f11651 = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f11647 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f11643 = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C8231 c8231 = this.f11646;
        if (c8231 != null) {
            c8231.m13735(f);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8088(int i) {
        if (i > 0) {
            this.f11652 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8089(int i) {
        if (i > 0) {
            this.f11650 = i;
        }
    }

    public void setContentView(View view) {
    }
}
