package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class au implements qw {
    public final Object a;
    public int b;
    public int c;

    public au(View r1) {
        this.a = r1;
    }

    @Override // defpackage.qw
    public wc0 d(View r5, wc0 r6) {
        View r52 = (View) this.a;
        int r0 = r6.a.f(7).b;
        int r1 = this.b;
        if (r1 < 0) goto L5;
        int r12 = r1 + r0;
        r52.getLayoutParams().height = r12;
        r52.setLayoutParams(r52.getLayoutParams());
    L5:
        r52.setPadding(r52.getPaddingLeft(), this.c + r0, r52.getPaddingRight(), r52.getPaddingBottom());
        return r6;
    }

    public au(Context r7, XmlResourceParser r8) {
        this.a = new ArrayList();
        this.c = -1;
        TypedArray r82 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), ry.g);
        int r0 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L13;
        int r2 = r82.getIndex(r1);
        if (r2 != 0) goto L8;
        this.b = r82.getResourceId(r2, this.b);
    L12:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r2 != 1) goto L12;
        int r22 = r82.getResourceId(r2, this.c);
        this.c = r22;
        String r3 = r7.getResources().getResourceTypeName(r22);
        r7.getResources().getResourceName(r22);
        if ("layout".equals(r3) == false) goto L12;
        new oc().b((ConstraintLayout) LayoutInflater.from(r7).inflate(r22, null));
        goto L12
    L13:
        r82.recycle();
    }

    public au(View r1, int r2, int r3) {
        this.b = r2;
        this.a = r1;
        this.c = r3;
    }
}
