package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: ob */
/* JADX INFO: loaded from: classes.dex */
public final class C2317ob {

    /* JADX INFO: renamed from: a */
    public int f8160a;

    /* JADX INFO: renamed from: b */
    public int f8161b;

    /* JADX INFO: renamed from: c */
    public float f8162c;

    /* JADX INFO: renamed from: d */
    public float f8163d;

    /* JADX INFO: renamed from: a */
    public final void m4726a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0639Ou.f2041h);
        int r52 = r42.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r52) goto L16;
        int r1 = r42.getIndex(r0);
        if (r1 != 1) goto L7;
        this.f8162c = r42.getFloat(r1, this.f8162c);
    L15:
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 0) goto L10;
        int r12 = r42.getInt(r1, this.f8160a);
        this.f8160a = r12;
        this.f8160a = C2411qb.f8451d[r12];
        goto L15
    L10:
        if (r1 != 4) goto L13;
        this.f8161b = r42.getInt(r1, this.f8161b);
        goto L15
    L13:
        if (r1 != 3) goto L15;
        this.f8163d = r42.getFloat(r1, this.f8163d);
        goto L15
    L16:
        r42.recycle();
    }
}
