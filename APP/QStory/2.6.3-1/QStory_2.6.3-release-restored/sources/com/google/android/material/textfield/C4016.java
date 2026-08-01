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
import p180.AbstractC8496;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4016 extends ArrayAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C4020 f11035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ColorStateList f11036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ColorStateList f11037;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4016(C4020 c4020, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f11035 = c4020;
        m7790();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C4020 c4020 = this.f11035;
            Drawable drawable = null;
            if (c4020.getText().toString().contentEquals(textView.getText()) && c4020.f11080 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c4020.f11080);
                if (this.f11036 != null) {
                    colorDrawable.setTintList(this.f11037);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f11036, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableM7708 = FocusRingDrawable.m7708(getContext(), rippleDrawable, null);
                    if (focusRingDrawableM7708 != null) {
                        focusRingDrawableM7708.f10740.f24707 = c4020.f11087;
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
    public final void m7790() {
        ColorStateList colorStateList;
        C4020 c4020 = this.f11035;
        ColorStateList colorStateList2 = c4020.f11079;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f11036 = colorStateList;
        if (c4020.f11080 != 0 && c4020.f11079 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC8496.m13534(c4020.f11079.getColorForState(iArr3, 0), c4020.f11080), AbstractC8496.m13534(c4020.f11079.getColorForState(iArr2, 0), c4020.f11080), c4020.f11080});
        }
        this.f11037 = colorStateList3;
    }
}
