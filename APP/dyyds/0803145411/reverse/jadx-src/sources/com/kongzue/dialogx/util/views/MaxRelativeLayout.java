package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import yyds.AbstractC0158;
import yyds.AbstractC1655;
import yyds.C0200;
import yyds.InterfaceC0760;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f436;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f437;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f438;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f439;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public View.OnTouchListener f440;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f441;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f442;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f443;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f444;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f445;

    public MaxRelativeLayout(Context context) {
        super(context);
        this.f437 = -1;
        m300(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f440;
        if (onTouchListener != null) {
            this.f441 = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDialogXSafetyMode() {
        return this.f436;
    }

    public InterfaceC0760 getOnYChanged() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f442 != 0) {
            WeakReference weakReference = AbstractC1655.f8450;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f441;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f437;
        if (i3 == -1 && size2 != 0) {
            this.f437 = size2;
            i3 = size2;
        }
        if (this.f439) {
            this.f443 = Math.min(this.f443, Math.min(size2, i3));
        }
        int i4 = this.f445;
        if (size > i4 && i4 != 0) {
            size = getPaddingBottom() + i4 + getPaddingTop();
        }
        int i5 = this.f443;
        if (size2 > i5 && i5 != 0) {
            size2 = getPaddingLeft() + i5 + getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setContentView(View view) {
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f444 = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f438 = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f442 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f440 = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m300(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0158.f970);
            this.f443 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f445 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f438 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f444 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f439 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f436 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int minimumWidth = this.f438;
        if (minimumWidth == 0) {
            minimumWidth = getMinimumWidth();
        }
        this.f438 = minimumWidth;
        int minimumHeight = this.f444;
        if (minimumHeight == 0) {
            minimumHeight = getMinimumHeight();
        }
        this.f444 = minimumHeight;
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new C0200());
    }

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f437 = -1;
        m300(context, attributeSet);
    }
}
