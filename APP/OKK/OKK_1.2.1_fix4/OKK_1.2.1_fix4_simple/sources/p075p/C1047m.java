package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1047m {

    /* JADX INFO: renamed from: m */
    public static final SparseIntArray f4032m = null;

    /* JADX INFO: renamed from: a */
    public float f4033a;

    /* JADX INFO: renamed from: b */
    public float f4034b;

    /* JADX INFO: renamed from: c */
    public float f4035c;

    /* JADX INFO: renamed from: d */
    public float f4036d;

    /* JADX INFO: renamed from: e */
    public float f4037e;

    /* JADX INFO: renamed from: f */
    public float f4038f;

    /* JADX INFO: renamed from: g */
    public float f4039g;

    /* JADX INFO: renamed from: h */
    public float f4040h;

    /* JADX INFO: renamed from: i */
    public float f4041i;

    /* JADX INFO: renamed from: j */
    public float f4042j;

    /* JADX INFO: renamed from: k */
    public boolean f4043k;

    /* JADX INFO: renamed from: l */
    public float f4044l;

    static {
        SparseIntArray r02 = new SparseIntArray();
        f4032m = r02;
        r02.append(6, 1);
        r02.append(7, 2);
        r02.append(8, 3);
        r02.append(4, 4);
        r02.append(5, 5);
        r02.append(0, 6);
        r02.append(1, 7);
        r02.append(2, 8);
        r02.append(3, 9);
        r02.append(9, 10);
        r02.append(10, 11);
    }

    /* JADX INFO: renamed from: a */
    public final void m2524a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC1052r.f4057h);
        int r52 = r42.getIndexCount();
        int r02 = 0;
    L3:
        if (r02 >= r52) goto L19;
        int r1 = r42.getIndex(r02);
        switch(f4032m.get(r1)) {
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
        this.f4043k = true;
        this.f4044l = r42.getDimension(r1, this.f4044l);
        goto L18
    L8:
        this.f4042j = r42.getDimension(r1, this.f4042j);
        goto L18
    L9:
        this.f4041i = r42.getDimension(r1, this.f4041i);
        goto L18
    L10:
        this.f4040h = r42.getDimension(r1, this.f4040h);
        goto L18
    L11:
        this.f4039g = r42.getDimension(r1, this.f4039g);
        goto L18
    L12:
        this.f4038f = r42.getDimension(r1, this.f4038f);
        goto L18
    L13:
        this.f4037e = r42.getFloat(r1, this.f4037e);
        goto L18
    L14:
        this.f4036d = r42.getFloat(r1, this.f4036d);
        goto L18
    L15:
        this.f4035c = r42.getFloat(r1, this.f4035c);
        goto L18
    L16:
        this.f4034b = r42.getFloat(r1, this.f4034b);
        goto L18
    L17:
        this.f4033a = r42.getFloat(r1, this.f4033a);
    L18:
        r02 = r02 + 1;
        goto L3
    L19:
        r42.recycle();
    }
}
