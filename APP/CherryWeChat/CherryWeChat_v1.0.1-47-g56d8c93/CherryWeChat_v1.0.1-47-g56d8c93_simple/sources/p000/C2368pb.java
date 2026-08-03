package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: pb */
/* JADX INFO: loaded from: classes.dex */
public final class C2368pb {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f8320n = null;

    /* JADX INFO: renamed from: a */
    public float f8321a;

    /* JADX INFO: renamed from: b */
    public float f8322b;

    /* JADX INFO: renamed from: c */
    public float f8323c;

    /* JADX INFO: renamed from: d */
    public float f8324d;

    /* JADX INFO: renamed from: e */
    public float f8325e;

    /* JADX INFO: renamed from: f */
    public float f8326f;

    /* JADX INFO: renamed from: g */
    public float f8327g;

    /* JADX INFO: renamed from: h */
    public int f8328h;

    /* JADX INFO: renamed from: i */
    public float f8329i;

    /* JADX INFO: renamed from: j */
    public float f8330j;

    /* JADX INFO: renamed from: k */
    public float f8331k;

    /* JADX INFO: renamed from: l */
    public boolean f8332l;

    /* JADX INFO: renamed from: m */
    public float f8333m;

    static {
        SparseIntArray r0 = new SparseIntArray();
        f8320n = r0;
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
        r0.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m4796a(Context r4, AttributeSet r5) {
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0639Ou.f2043j);
        int r52 = r42.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r52) goto L20;
        int r1 = r42.getIndex(r0);
        switch(f8320n.get(r1)) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            case 7: goto L12;
            case 8: goto L11;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L8;
            case 12: goto L7;
            default: goto L19;
        };
    L7:
        this.f8328h = C2411qb.m4850f(r42, r1, this.f8328h);
        goto L19
    L8:
        this.f8332l = true;
        this.f8333m = r42.getDimension(r1, this.f8333m);
        goto L19
    L9:
        this.f8331k = r42.getDimension(r1, this.f8331k);
        goto L19
    L10:
        this.f8330j = r42.getDimension(r1, this.f8330j);
        goto L19
    L11:
        this.f8329i = r42.getDimension(r1, this.f8329i);
        goto L19
    L12:
        this.f8327g = r42.getDimension(r1, this.f8327g);
        goto L19
    L13:
        this.f8326f = r42.getDimension(r1, this.f8326f);
        goto L19
    L14:
        this.f8325e = r42.getFloat(r1, this.f8325e);
        goto L19
    L15:
        this.f8324d = r42.getFloat(r1, this.f8324d);
        goto L19
    L16:
        this.f8323c = r42.getFloat(r1, this.f8323c);
        goto L19
    L17:
        this.f8322b = r42.getFloat(r1, this.f8322b);
        goto L19
    L18:
        this.f8321a = r42.getFloat(r1, this.f8321a);
    L19:
        r0 = r0 + 1;
        goto L3
    L20:
        r42.recycle();
    }
}
