package com.kongzue.dialogx.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface;

/* JADX INFO: loaded from: classes2.dex */
public class MaxRelativeLayout extends RelativeLayout implements DialogXSafetyModeInterface {
    private View contentView;
    private int dialogXSafetyMode;
    private float endAnimValue;
    private boolean interceptTouch;
    private boolean lockWidth;
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    int navBarHeight;
    Paint navBarPaint;
    private View.OnTouchListener onTouchListener;
    private OnYChanged onYChangedListener;
    private int preWidth;
    boolean reInterceptTouch;
    private float startAnimValue;

    public interface OnYChanged {
        /* JADX INFO: renamed from: y */
        void mo5090y(float f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaxRelativeLayout(Context context) {
        super(context);
        this.interceptTouch = true;
        this.startAnimValue = 0.0f;
        this.endAnimValue = 0.0f;
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
            this.lockWidth = typedArrayObtainStyledAttributes.getBoolean(C2413R.styleable.DialogXMaxLayout_lockWidth, false);
            this.interceptTouch = typedArrayObtainStyledAttributes.getBoolean(C2413R.styleable.DialogXMaxLayout_interceptTouch, true);
            this.dialogXSafetyMode = typedArrayObtainStyledAttributes.getInt(C2413R.styleable.DialogXMaxLayout_dialogXSafetyMode, 0);
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
        if (isInEditMode()) {
            return;
        }
        animate().setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.util.views.MaxRelativeLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                long jFloatValue = (long) (MaxRelativeLayout.this.startAnimValue + ((MaxRelativeLayout.this.endAnimValue - MaxRelativeLayout.this.startAnimValue) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                if (MaxRelativeLayout.this.onYChangedListener != null) {
                    MaxRelativeLayout.this.onYChangedListener.mo5090y(jFloatValue);
                }
            }
        });
    }

    public int dip2px(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null) {
            this.reInterceptTouch = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface
    public int getDialogXSafetyMode() {
        return this.dialogXSafetyMode;
    }

    public OnYChanged getOnYChanged() {
        return this.onYChangedListener;
    }

    public boolean isLockWidth() {
        return this.lockWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.navBarHeight == 0 || DialogX.bottomDialogNavbarColor == 0) {
            return;
        }
        if (this.navBarPaint == null) {
            Paint paint = new Paint();
            this.navBarPaint = paint;
            paint.setColor(DialogX.bottomDialogNavbarColor);
        }
        canvas.drawRect(0.0f, getHeight() - this.navBarHeight, getWidth(), getHeight(), this.navBarPaint);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.reInterceptTouch;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.preWidth == -1 && size2 != 0) {
            this.preWidth = size2;
        }
        if (this.lockWidth) {
            this.maxWidth = Math.min(this.maxWidth, Math.min(size2, this.preWidth));
        }
        int i3 = this.maxHeight;
        if (size > i3 && i3 != 0) {
            size = getPaddingTop() + i3 + getPaddingBottom();
        }
        int i4 = this.maxWidth;
        if (size2 > i4 && i4 != 0) {
            size2 = getPaddingRight() + i4 + getPaddingLeft();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public void setContentView(View view) {
        this.contentView = view;
    }

    public MaxRelativeLayout setDialogXSafetyMode(int i) {
        this.dialogXSafetyMode = i;
        return this;
    }

    public MaxRelativeLayout setLockWidth(boolean z) {
        this.lockWidth = z;
        return this;
    }

    public MaxRelativeLayout setMaxHeight(int i) {
        if (i > 0) {
            this.maxHeight = i;
        }
        return this;
    }

    public MaxRelativeLayout setMaxWidth(int i) {
        if (i > 0) {
            this.maxWidth = i;
        }
        return this;
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.minHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.minWidth = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.navBarHeight = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public MaxRelativeLayout setOnYChanged(OnYChanged onYChanged) {
        this.onYChangedListener = onYChanged;
        return this;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        OnYChanged onYChanged = this.onYChangedListener;
        if (onYChanged != null) {
            onYChanged.mo5090y(f);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interceptTouch = true;
        this.startAnimValue = 0.0f;
        this.endAnimValue = 0.0f;
        this.preWidth = -1;
        init(context, attributeSet);
    }

    public MaxRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interceptTouch = true;
        this.startAnimValue = 0.0f;
        this.endAnimValue = 0.0f;
        this.preWidth = -1;
        init(context, attributeSet);
    }
}
