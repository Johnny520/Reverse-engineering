package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class lc {
    public static final SparseIntArray e = null;
    public int a;
    public int b;
    public float c;
    public float d;

    static {
        SparseIntArray r0 = new SparseIntArray();
        e = r0;
        r0.append(2, 1);
        r0.append(4, 2);
        r0.append(5, 3);
        r0.append(1, 4);
        r0.append(0, 5);
        r0.append(3, 6);
    }

    public final void a(Context r6, AttributeSet r7) {
        TypedArray r62 = r6.obtainStyledAttributes(r7, ry.e);
        int r72 = r62.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r72) goto L17;
        int r2 = r62.getIndex(r1);
        switch(e.get(r2)) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L16;
        };
    L7:
        this.c = r62.getFloat(r2, this.c);
        goto L16
    L8:
        this.a = oc.f(r62, r2, this.a);
        goto L16
    L9:
        r62.getInt(r2, 0);
        goto L16
    L14:
        this.b = r62.getInt(r2, this.b);
        goto L16
    L15:
        this.d = r62.getFloat(r2, this.d);
        goto L16
    L11:
        if (r62.peekValue(r2).type != 3) goto L13;
        r62.getString(r2);
        goto L16
    L13:
        String r22 = ff.m[r62.getInteger(r2, 0)];
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        r62.recycle();
    }
}
