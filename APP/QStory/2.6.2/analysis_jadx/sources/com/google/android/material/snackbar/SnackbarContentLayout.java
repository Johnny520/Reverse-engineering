package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.R;
import p175.AbstractC7738;
import p317.AbstractC8680;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Button f10577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Button f10578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TextView f10579;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC7738.m13027(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24475);
    }

    public Button getActionView() {
        return this.f10577;
    }

    public Button getCloseView() {
        return this.f10578;
    }

    public TextView getMessageView() {
        return this.f10579;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f10579 = (TextView) findViewById(R.id.snackbar_text);
        this.f10577 = (Button) findViewById(R.id.snackbar_action);
        this.f10578 = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f10579.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f10576 <= 0 || this.f10577.getMeasuredWidth() <= this.f10576) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m7205(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m7205(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f10576 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m7205(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10579.getPaddingTop() == i2 && this.f10579.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f10579;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
