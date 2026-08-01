package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class mc {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, ry.f);
        int r52 = r42.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r52) goto L16;
        int r1 = r42.getIndex(r0);
        if (r1 != 1) goto L7;
        this.c = r42.getFloat(r1, this.c);
    L15:
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 0) goto L10;
        int r12 = r42.getInt(r1, this.a);
        this.a = r12;
        this.a = oc.d[r12];
        goto L15
    L10:
        if (r1 != 4) goto L13;
        this.b = r42.getInt(r1, this.b);
        goto L15
    L13:
        if (r1 != 3) goto L15;
        this.d = r42.getFloat(r1, this.d);
        goto L15
    L16:
        r42.recycle();
    }
}
