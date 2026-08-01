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

/* JADX INFO: renamed from: mt */
/* JADX INFO: loaded from: classes.dex */
public final class C0497mt extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f3192a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0534nt f3194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0497mt(C0534nt c0534nt, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f3194c = c0534nt;
        m1880a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1880a() {
        ColorStateList colorStateList;
        C0534nt c0534nt = this.f3194c;
        ColorStateList colorStateList2 = c0534nt.f3347l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3193b = colorStateList;
        if (c0534nt.f3346k != 0 && c0534nt.f3347l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0627qb.m2142b(c0534nt.f3347l.getColorForState(iArr3, 0), c0534nt.f3346k), AbstractC0627qb.m2142b(c0534nt.f3347l.getColorForState(iArr2, 0), c0534nt.f3346k), c0534nt.f3346k});
        }
        this.f3192a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0534nt c0534nt = this.f3194c;
            Drawable rippleDrawable = null;
            if (c0534nt.getText().toString().contentEquals(textView.getText()) && c0534nt.f3346k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0534nt.f3346k);
                if (this.f3193b != null) {
                    AbstractC0187eh.m995h(colorDrawable, this.f3192a);
                    rippleDrawable = new RippleDrawable(this.f3193b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2669q(textView, rippleDrawable);
        }
        return view2;
    }
}
