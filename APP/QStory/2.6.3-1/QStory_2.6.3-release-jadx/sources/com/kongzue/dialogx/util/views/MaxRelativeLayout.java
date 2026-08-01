package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.C4009;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p273.C9061;
import p277.AbstractC9076;
import p277.AbstractC9077;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11991 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11992;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View.OnTouchListener f11993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11995;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C9061 f11996;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11997;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f11998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f11999;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12000;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12001;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12002;

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11999 = -1;
        int i = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9076.f23161);
            this.f12002 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f12000 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f12001 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f11995 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f11994 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11998 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f12001;
        this.f12001 = i2 == 0 ? getMinimumWidth() : i2;
        int i3 = this.f11995;
        this.f11995 = i3 == 0 ? getMinimumHeight() : i3;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C4009(this, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f11993;
        if (onTouchListener != null) {
            this.f11992 = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDialogXSafetyMode() {
        return this.f11998;
    }

    public InterfaceC4592 getOnYChanged() {
        return this.f11996;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11997 != 0) {
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11992;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f11999 == -1 && size2 != 0) {
            this.f11999 = size2;
        }
        if (this.f11994) {
            this.f12002 = Math.min(this.f12002, Math.min(size2, this.f11999));
        }
        int i3 = this.f12000;
        if (size > i3 && i3 != 0) {
            size = getPaddingBottom() + i3 + getPaddingTop();
        }
        int i4 = this.f12002;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingLeft() + i4 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f11995 = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f12001 = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f11997 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f11993 = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C9061 c9061 = this.f11996;
        if (c9061 != null) {
            c9061.m14310(f);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8634(int i) {
        if (i > 0) {
            this.f12002 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8635(int i) {
        if (i > 0) {
            this.f12000 = i;
        }
    }

    public void setContentView(View view) {
    }
}
