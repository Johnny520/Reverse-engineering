package p000;

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

/* JADX INFO: renamed from: Aq */
/* JADX INFO: loaded from: classes.dex */
public final class C0033Aq extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f69a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f70b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0076Bq f71c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033Aq(C0076Bq c0076Bq, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f71c = c0076Bq;
        m56a();
    }

    /* JADX INFO: renamed from: a */
    public final void m56a() {
        ColorStateList colorStateList;
        C0076Bq c0076Bq = this.f71c;
        ColorStateList colorStateList2 = c0076Bq.f184l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f70b = colorStateList;
        if (c0076Bq.f183k != 0 && c0076Bq.f184l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC2797za.m5365c(c0076Bq.f184l.getColorForState(iArr3, 0), c0076Bq.f183k), AbstractC2797za.m5365c(c0076Bq.f184l.getColorForState(iArr2, 0), c0076Bq.f183k), c0076Bq.f183k});
        }
        this.f69a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0076Bq c0076Bq = this.f71c;
            Drawable rippleDrawable = null;
            if (c0076Bq.getText().toString().contentEquals(textView.getText()) && c0076Bq.f183k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0076Bq.f183k);
                if (this.f70b != null) {
                    colorDrawable.setTintList(this.f69a);
                    rippleDrawable = new RippleDrawable(this.f70b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
