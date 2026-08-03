package com.google.android.material.internal;

import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawLeftInsetForeground;
    private boolean drawRightInsetForeground;
    private boolean drawTopInsetForeground;

    @InterfaceC6490
    Drawable insetForeground;
    Rect insets;
    private Rect tempRect;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrimInsetsFrameLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets == null || this.insetForeground == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.drawTopInsetForeground) {
            this.tempRect.set(0, 0, width, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawBottomInsetForeground) {
            this.tempRect.set(0, height - this.insets.bottom, width, height);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawLeftInsetForeground) {
            Rect rect = this.tempRect;
            Rect rect2 = this.insets;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawRightInsetForeground) {
            Rect rect3 = this.tempRect;
            Rect rect4 = this.insets;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void onInsetsChanged(C8472 c8472) {
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.drawBottomInsetForeground = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.drawLeftInsetForeground = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.drawRightInsetForeground = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.drawTopInsetForeground = z;
    }

    public void setScrimInsetForeground(@InterfaceC6490 Drawable drawable) {
        this.insetForeground = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ScrimInsetsFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new Rect();
        this.drawTopInsetForeground = true;
        this.drawBottomInsetForeground = true;
        this.drawLeftInsetForeground = true;
        this.drawRightInsetForeground = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1980R.styleable.ScrimInsetsFrameLayout, i, C1980R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.insetForeground = typedArrayObtainStyledAttributes.getDrawable(C1980R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C8273.m27468(this, new InterfaceC6545() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // Yue.InterfaceC6545
            public C8472 onApplyWindowInsets(View view, @InterfaceC6391 C8472 c8472) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.insets == null) {
                    scrimInsetsFrameLayout.insets = new Rect();
                }
                ScrimInsetsFrameLayout.this.insets.set(c8472.m28291(), c8472.m28293(), c8472.m28292(), c8472.m28290());
                ScrimInsetsFrameLayout.this.onInsetsChanged(c8472);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!c8472.m28298() || ScrimInsetsFrameLayout.this.insetForeground == null);
                C8273.m27425(ScrimInsetsFrameLayout.this);
                return c8472.m28278();
            }
        });
    }
}
