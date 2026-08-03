package com.google.android.exoplayer2.p001ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.AbstractC0896Uu;
import p000.InterfaceC0735R4;
import p000.RunnableC0778S4;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f4347d = 0;

    /* JADX INFO: renamed from: a */
    public final RunnableC0778S4 f4348a;

    /* JADX INFO: renamed from: b */
    public float f4349b;

    /* JADX INFO: renamed from: c */
    public int f4350c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4350c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0896Uu.f2790a, 0, 0);
            try {
                this.f4350c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f4348a = new RunnableC0778S4(this);
    }

    public int getResizeMode() {
        return this.f4350c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f4349b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f4349b / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        RunnableC0778S4 runnableC0778S4 = this.f4348a;
        if (fAbs <= 0.01f) {
            if (runnableC0778S4.f2458b) {
                return;
            }
            runnableC0778S4.f2458b = true;
            ((AspectRatioFrameLayout) runnableC0778S4.f2459c).post(runnableC0778S4);
            return;
        }
        int i3 = this.f4350c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f4349b;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.f4349b;
                    } else {
                        f2 = this.f4349b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f4349b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.f4349b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f4349b;
            measuredWidth = (int) (f4 * f);
        }
        if (!runnableC0778S4.f2458b) {
            runnableC0778S4.f2458b = true;
            ((AspectRatioFrameLayout) runnableC0778S4.f2459c).post(runnableC0778S4);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f4349b != f) {
            this.f4349b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC0735R4 interfaceC0735R4) {
    }

    public void setResizeMode(int i) {
        if (this.f4350c != i) {
            this.f4350c = i;
            requestLayout();
        }
    }
}
