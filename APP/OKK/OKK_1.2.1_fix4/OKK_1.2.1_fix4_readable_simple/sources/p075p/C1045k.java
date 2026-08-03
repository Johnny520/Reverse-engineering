package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p067l.AbstractC0978a;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1045k {

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4023e = null;

    /* JADX INFO: renamed from: a */
    public int f4024a;

    /* JADX INFO: renamed from: b */
    public int f4025b;

    /* JADX INFO: renamed from: c */
    public float f4026c;

    /* JADX INFO: renamed from: d */
    public float f4027d;

    static {
        SparseIntArray r02 = new SparseIntArray();
        f4023e = r02;
        r02.append(2, 1);
        r02.append(4, 2);
        r02.append(5, 3);
        r02.append(1, 4);
        r02.append(0, 5);
        r02.append(3, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m2522a(Context r6, AttributeSet r7) {
        TypedArray r62 = r6.obtainStyledAttributes(r7, AbstractC1052r.f4054e);
        int r72 = r62.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r72) goto L17;
        int r2 = r62.getIndex(r1);
        switch(f4023e.get(r2)) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L16;
        };
    L7:
        this.f4026c = r62.getFloat(r2, this.f4026c);
        goto L16
    L8:
        this.f4024a = C1048n.m2527f(r62, r2, this.f4024a);
        goto L16
    L9:
        r62.getInt(r2, 0);
        goto L16
    L14:
        this.f4025b = r62.getInt(r2, this.f4025b);
        goto L16
    L15:
        this.f4027d = r62.getFloat(r2, this.f4027d);
        goto L16
    L11:
        if (r62.peekValue(r2).type != 3) goto L13;
        r62.getString(r2);
        goto L16
    L13:
        String r22 = AbstractC0978a.f3461a[r62.getInteger(r2, 0)];
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        r62.recycle();
    }
}
