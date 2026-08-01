package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import p164.AbstractC7666;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3183 extends ArrayAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3187 f10685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ColorStateList f10686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ColorStateList f10687;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3183(C3187 c3187, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f10685 = c3187;
        m7244();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C3187 c3187 = this.f10685;
            Drawable drawable = null;
            if (c3187.getText().toString().contentEquals(textView.getText()) && c3187.f10730 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c3187.f10730);
                if (this.f10686 != null) {
                    colorDrawable.setTintList(this.f10687);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f10686, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableM7162 = FocusRingDrawable.m7162(getContext(), rippleDrawable, null);
                    if (focusRingDrawableM7162 != null) {
                        focusRingDrawableM7162.f10390.f24371 = c3187.f10737;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7244() {
        ColorStateList colorStateList;
        C3187 c3187 = this.f10685;
        ColorStateList colorStateList2 = c3187.f10729;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f10686 = colorStateList;
        if (c3187.f10730 != 0 && c3187.f10729 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC7666.m12946(c3187.f10729.getColorForState(iArr3, 0), c3187.f10730), AbstractC7666.m12946(c3187.f10729.getColorForState(iArr2, 0), c3187.f10730), c3187.f10730});
        }
        this.f10687 = colorStateList3;
    }
}
