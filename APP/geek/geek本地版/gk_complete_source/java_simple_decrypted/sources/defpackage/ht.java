package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class ht extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ jt c;

    public ht(jt r1, Context r2, int r3, String[] r4) {
        this.c = r1;
        super(r2, r3, r4);
        a();
    }

    public final void a() {
        jt r0 = this.c;
        ColorStateList r1 = r0.l;
        ColorStateList r2 = null;
        if (r1 == null) goto L5;
        int[] r4 = {R.attr.state_pressed};
        ColorStateList r5 = new ColorStateList(new int[][]{r4, new int[0]}, new int[]{r1.getColorForState(r4, 0), 0});
    L6:
        this.b = r5;
        if (r0.k != 0) goto L9;
    L11:
        this.a = r2;
        return;
    L9:
        if (r0.l == null) goto L11;
        int[] r12 = {R.attr.state_hovered, -16842919};
        int[] r22 = {R.attr.state_selected, -16842919};
        int r42 = r0.l.getColorForState(r22, 0);
        int r52 = r0.l.getColorForState(r12, 0);
        r2 = new ColorStateList(new int[][]{r22, r12, new int[0]}, new int[]{ib.b(r42, r0.k), ib.b(r52, r0.k), r0.k});
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
        jt r62 = this.c;
        Drawable r1 = null;
        if (r62.getText().toString().contentEquals(r52.getText()) == true) goto L7;
    L12:
        WeakHashMap r63 = ja0.a;
        s90.q(r52, r1);
        goto L13
    L7:
        if (r62.k == 0) goto L12;
        ColorDrawable r0 = new ColorDrawable(r62.k);
        if (this.b == null) goto L11;
        ch.h(r0, this.a);
        r1 = new RippleDrawable(this.b, r0, null);
        goto L12
    L11:
        r1 = r0;
    L13:
        return r42;
    }
}
