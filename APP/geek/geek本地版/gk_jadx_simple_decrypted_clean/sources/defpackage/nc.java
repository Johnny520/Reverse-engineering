package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class nc {
    public static final SparseIntArray m = null;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public float l;

    static {
        SparseIntArray r0 = new SparseIntArray();
        m = r0;
        r0.append(6, 1);
        r0.append(7, 2);
        r0.append(8, 3);
        r0.append(4, 4);
        r0.append(5, 5);
        r0.append(0, 6);
        r0.append(1, 7);
        r0.append(2, 8);
        r0.append(3, 9);
        r0.append(9, 10);
        r0.append(10, 11);
    }

    public final void a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, ry.h);
        int r52 = r42.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r52) goto L19;
        int r1 = r42.getIndex(r0);
        switch(m.get(r1)) {
            case 1: goto L17;
            case 2: goto L16;
            case 3: goto L15;
            case 4: goto L14;
            case 5: goto L13;
            case 6: goto L12;
            case 7: goto L11;
            case 8: goto L10;
            case 9: goto L9;
            case 10: goto L8;
            case 11: goto L7;
            default: goto L18;
        };
    L7:
        this.k = true;
        this.l = r42.getDimension(r1, this.l);
        goto L18
    L8:
        this.j = r42.getDimension(r1, this.j);
        goto L18
    L9:
        this.i = r42.getDimension(r1, this.i);
        goto L18
    L10:
        this.h = r42.getDimension(r1, this.h);
        goto L18
    L11:
        this.g = r42.getDimension(r1, this.g);
        goto L18
    L12:
        this.f = r42.getDimension(r1, this.f);
        goto L18
    L13:
        this.e = r42.getFloat(r1, this.e);
        goto L18
    L14:
        this.d = r42.getFloat(r1, this.d);
        goto L18
    L15:
        this.c = r42.getFloat(r1, this.c);
        goto L18
    L16:
        this.b = r42.getFloat(r1, this.b);
        goto L18
    L17:
        this.a = r42.getFloat(r1, this.a);
    L18:
        r0 = r0 + 1;
        goto L3
    L19:
        r42.recycle();
    }
}
