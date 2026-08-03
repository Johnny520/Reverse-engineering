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

    public C0033Aq(C0076Bq r1, Context r2, int r3, String[] r4) {
        this.f71c = r1;
        super(r2, r3, r4);
        m56a();
    }

    /* JADX INFO: renamed from: a */
    public final void m56a() {
        C0076Bq r0 = this.f71c;
        ColorStateList r1 = r0.f184l;
        ColorStateList r2 = null;
        if (r1 == null) goto L5;
        int[] r4 = {R.attr.state_pressed};
        ColorStateList r5 = new ColorStateList(new int[][]{r4, new int[0]}, new int[]{r1.getColorForState(r4, 0), 0});
    L6:
        this.f70b = r5;
        if (r0.f183k != 0) goto L9;
    L11:
        this.f69a = r2;
        return;
    L9:
        if (r0.f184l == null) goto L11;
        int[] r12 = {R.attr.state_hovered, -16842919};
        int[] r22 = {R.attr.state_selected, -16842919};
        int r42 = r0.f184l.getColorForState(r22, 0);
        int r52 = r0.f184l.getColorForState(r12, 0);
        r2 = new ColorStateList(new int[][]{r22, r12, new int[0]}, new int[]{AbstractC2797za.m5365c(r42, r0.f183k), AbstractC2797za.m5365c(r52, r0.f183k), r0.f183k});
        goto L11
    L5:
        r5 = null;
        goto L6
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r4, View r5, ViewGroup r6) {
        View r42 = super.getView(r4, r5, r6);
        if ((r42 instanceof TextView) == false) goto L13;
        TextView r52 = (TextView) r42;
        C0076Bq r62 = this.f71c;
        Drawable r1 = null;
        if (r62.getText().toString().contentEquals(r52.getText()) == true) goto L7;
    L12:
        r52.setBackground(r1);
        goto L13
    L7:
        if (r62.f183k == 0) goto L12;
        ColorDrawable r0 = new ColorDrawable(r62.f183k);
        if (this.f70b == null) goto L11;
        r0.setTintList(this.f69a);
        r1 = new RippleDrawable(this.f70b, r0, null);
        goto L12
    L11:
        r1 = r0;
    L13:
        return r42;
    }
}
