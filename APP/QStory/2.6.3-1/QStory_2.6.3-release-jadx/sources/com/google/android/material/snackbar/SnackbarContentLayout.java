package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.C0328R;
import p050.AbstractC7176;
import p333.AbstractC9501;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10926;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Button f10927;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Button f10928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TextView f10929;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC7176.m12482(context, C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24812);
    }

    public Button getActionView() {
        return this.f10927;
    }

    public Button getCloseView() {
        return this.f10928;
    }

    public TextView getMessageView() {
        return this.f10929;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f10929 = (TextView) findViewById(C0328R.id.snackbar_text);
        this.f10927 = (Button) findViewById(C0328R.id.snackbar_action);
        this.f10928 = (Button) findViewById(C0328R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0328R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0328R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f10929.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f10926 <= 0 || this.f10927.getMeasuredWidth() <= this.f10926) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m7751(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m7751(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f10926 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m7751(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10929.getPaddingTop() == i2 && this.f10929.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f10929;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
