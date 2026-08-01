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
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ht */
/* JADX INFO: loaded from: classes.dex */
public final class C0310ht extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f2303a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f2304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0386jt f2305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310ht(C0386jt c0386jt, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f2305c = c0386jt;
        m1373a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1373a() {
        ColorStateList colorStateList;
        C0386jt c0386jt = this.f2305c;
        ColorStateList colorStateList2 = c0386jt.f2674l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f2304b = colorStateList;
        if (c0386jt.f2673k != 0 && c0386jt.f2674l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0329ib.m1426b(c0386jt.f2674l.getColorForState(iArr3, 0), c0386jt.f2673k), AbstractC0329ib.m1426b(c0386jt.f2674l.getColorForState(iArr2, 0), c0386jt.f2673k), c0386jt.f2673k});
        }
        this.f2303a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0386jt c0386jt = this.f2305c;
            Drawable rippleDrawable = null;
            if (c0386jt.getText().toString().contentEquals(textView.getText()) && c0386jt.f2673k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0386jt.f2673k);
                if (this.f2304b != null) {
                    AbstractC0104ch.m688h(colorDrawable, this.f2303a);
                    rippleDrawable = new RippleDrawable(this.f2304b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2325q(textView, rippleDrawable);
        }
        return view2;
    }
}
