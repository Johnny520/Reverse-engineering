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
import p164.AbstractC7667;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3184 extends ArrayAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3188 f10690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ColorStateList f10691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ColorStateList f10692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3184(C3188 c3188, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f10690 = c3188;
        m7231();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C3188 c3188 = this.f10690;
            Drawable drawable = null;
            if (c3188.getText().toString().contentEquals(textView.getText()) && c3188.f10735 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c3188.f10735);
                if (this.f10691 != null) {
                    colorDrawable.setTintList(this.f10692);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f10691, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableM7149 = FocusRingDrawable.m7149(getContext(), rippleDrawable, null);
                    if (focusRingDrawableM7149 != null) {
                        focusRingDrawableM7149.f10395.f24362 = c3188.f10742;
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
    public final void m7231() {
        ColorStateList colorStateList;
        C3188 c3188 = this.f10690;
        ColorStateList colorStateList2 = c3188.f10734;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f10691 = colorStateList;
        if (c3188.f10735 != 0 && c3188.f10734 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC7667.m12975(c3188.f10734.getColorForState(iArr3, 0), c3188.f10735), AbstractC7667.m12975(c3188.f10734.getColorForState(iArr2, 0), c3188.f10735), c3188.f10735});
        }
        this.f10692 = colorStateList3;
    }
}
