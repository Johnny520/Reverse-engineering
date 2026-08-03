package com.google.android.material.snackbar;

import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SnackbarContentLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(@InterfaceC6391 View view, int i, int i2) {
        if (C8273.m27408(view)) {
            C8273.m27471(view, C8273.m27367(view), i, C8273.m27366(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean updateViewsWithinLayout(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.messageView.getPaddingTop() == i2 && this.messageView.getPaddingBottom() == i3) {
            return z;
        }
        updateTopBottomPadding(this.messageView, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
        this.messageView.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.messageView.animate().alpha(1.0f).setDuration(j).setInterpolator(this.contentInterpolator).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j).setInterpolator(this.contentInterpolator).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
        this.messageView.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.messageView.animate().alpha(0.0f).setDuration(j).setInterpolator(this.contentInterpolator).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j).setInterpolator(this.contentInterpolator).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(C1980R.id.snackbar_text);
        this.actionView = (Button) findViewById(C1980R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1980R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C1980R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.messageView.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.maxInlineActionWidth = i;
    }

    public void updateActionTextColorAlphaIfNeeded(float f) {
        if (f != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, C1980R.attr.colorSurface), this.actionView.getCurrentTextColor(), f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SnackbarContentLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, C1980R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
