package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p060h0.AbstractC0945a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f2432a;

    /* JADX INFO: renamed from: b */
    public Button f2433b;

    /* JADX INFO: renamed from: c */
    public int f2434c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0805P.m2039S(context, C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1886a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2432a.getPaddingTop() == i3 && this.f2432a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f2432a;
        Field field = AbstractC0080Q.f219a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f2433b;
    }

    public TextView getMessageView() {
        return this.f2432a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2432a = (TextView) findViewById(C1031R.id.snackbar_text);
        this.f2433b = (Button) findViewById(C1031R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1031R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C1031R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2432a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f2434c <= 0 || this.f2433b.getMeasuredWidth() <= this.f2434c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1886a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1886a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f2434c = i2;
    }
}
