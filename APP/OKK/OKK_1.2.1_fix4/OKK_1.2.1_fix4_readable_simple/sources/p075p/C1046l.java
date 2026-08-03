package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: p.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1046l {

    /* JADX INFO: renamed from: a */
    public int f4028a;

    /* JADX INFO: renamed from: b */
    public int f4029b;

    /* JADX INFO: renamed from: c */
    public float f4030c;

    /* JADX INFO: renamed from: d */
    public float f4031d;

    /* JADX INFO: renamed from: a */
    public final void m2523a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC1052r.f4055f);
        int r52 = r42.getIndexCount();
        int r02 = 0;
    L3:
        if (r02 >= r52) goto L16;
        int r1 = r42.getIndex(r02);
        if (r1 != 1) goto L7;
        this.f4030c = r42.getFloat(r1, this.f4030c);
    L15:
        r02 = r02 + 1;
        goto L3
    L7:
        if (r1 != 0) goto L10;
        int r12 = r42.getInt(r1, this.f4028a);
        this.f4028a = r12;
        this.f4028a = C1048n.f4045d[r12];
        goto L15
    L10:
        if (r1 != 4) goto L13;
        this.f4029b = r42.getInt(r1, this.f4029b);
        goto L15
    L13:
        if (r1 != 3) goto L15;
        this.f4031d = r42.getFloat(r1, this.f4031d);
        goto L15
    L16:
        r42.recycle();
    }
}
