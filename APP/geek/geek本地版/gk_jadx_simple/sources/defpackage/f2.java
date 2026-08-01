package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements v0 {
    public final int a;
    public final Object b;

    public f2(Context r5) {
        int r0 = g2.h(r5, 0);
        this.b = new b2(new ContextThemeWrapper(r5, g2.h(r5, r0)));
        this.a = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public g2 a() {
        b2 r1 = (b2) this.b;
        g2 r0 = new g2(r1.a, this.a);
        View r2 = r1.e;
        e2 r3 = r0.f;
        if (r2 == null) goto L5;
        r3.n = r2;
    L16:
        if (r1.g == null) goto L32;
        AlertController$RecycleListView r22 = (AlertController$RecycleListView) r1.b.inflate(r3.r, null);
        if (r1.i == false) goto L20;
        int r6 = r3.s;
    L21:
        Object r7 = r1.g;
        ?? r72 = r7;
        if (r7 != null) goto L25;
        r72 = new d2(r1.a, r6, R.id.text1, null);
    L25:
        r3.o = r72;
        r3.p = r1.j;
        if (r1.h == null) goto L29;
        r22.setOnItemClickListener(new a2(r1, r3));
    L29:
        if (r1.i == false) goto L31;
        r22.setChoiceMode(1);
    L31:
        r3.e = r22;
        goto L32
    L20:
        r6 = r3.t;
    L32:
        r0.setCancelable(true);
        r0.setCanceledOnTouchOutside(true);
        r0.setOnCancelListener(null);
        r0.setOnDismissListener(null);
        lu r12 = r1.f;
        if (r12 == null) goto L35;
        r0.setOnKeyListener(r12);
    L35:
        return r0;
    L5:
        CharSequence r23 = r1.d;
        if (r23 == null) goto L10;
        r3.d = r23;
        TextView r4 = r3.l;
        if (r4 == null) goto L10;
        r4.setText(r23);
    L10:
        Drawable r24 = r1.c;
        if (r24 == null) goto L16;
        r3.j = r24;
        ImageView r42 = r3.k;
        if (r42 == null) goto L16;
        r42.setVisibility(0);
        r3.k.setImageDrawable(r24);
        goto L16
    }

    @Override // defpackage.v0
    public boolean c(View r2) {
        ((BottomSheetBehavior) this.b).B(this.a);
        return true;
    }

    public f2(int r1, gl[] r2) {
        this.a = r1;
        this.b = r2;
    }

    public f2(BottomSheetBehavior r1, int r2) {
        this.b = r1;
        this.a = r2;
    }
}
