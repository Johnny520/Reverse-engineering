package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: nb */
/* JADX INFO: loaded from: classes.dex */
public final class C2274nb {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f7999j = null;

    /* JADX INFO: renamed from: a */
    public int f8000a;

    /* JADX INFO: renamed from: b */
    public int f8001b;

    /* JADX INFO: renamed from: c */
    public int f8002c;

    /* JADX INFO: renamed from: d */
    public float f8003d;

    /* JADX INFO: renamed from: e */
    public float f8004e;

    /* JADX INFO: renamed from: f */
    public float f8005f;

    /* JADX INFO: renamed from: g */
    public int f8006g;

    /* JADX INFO: renamed from: h */
    public String f8007h;

    /* JADX INFO: renamed from: i */
    public int f8008i;

    static {
        SparseIntArray r0 = new SparseIntArray();
        f7999j = r0;
        r0.append(3, 1);
        r0.append(5, 2);
        r0.append(9, 3);
        r0.append(2, 4);
        r0.append(1, 5);
        r0.append(0, 6);
        r0.append(4, 7);
        r0.append(8, 8);
        r0.append(7, 9);
        r0.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m4603a(Context r8, AttributeSet r9) {
        TypedArray r82 = r8.obtainStyledAttributes(r9, AbstractC0639Ou.f2040g);
        int r92 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r92) goto L28;
        int r2 = r82.getIndex(r1);
        switch(f7999j.get(r2)) {
            case 1: goto L26;
            case 2: goto L25;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L17;
            case 8: goto L16;
            case 9: goto L15;
            case 10: goto L7;
            default: goto L27;
        };
    L7:
        int r3 = r82.peekValue(r2).type;
        if (r3 != 1) goto L10;
        this.f8008i = r82.getResourceId(r2, -1);
        goto L27
    L10:
        if (r3 != 3) goto L14;
        String r32 = r82.getString(r2);
        this.f8007h = r32;
        if (r32.indexOf("/") <= 0) goto L27;
        this.f8008i = r82.getResourceId(r2, -1);
        goto L27
    L14:
        r82.getInteger(r2, this.f8008i);
        goto L27
    L15:
        this.f8005f = r82.getFloat(r2, this.f8005f);
        goto L27
    L16:
        this.f8006g = r82.getInteger(r2, this.f8006g);
        goto L27
    L17:
        this.f8003d = r82.getFloat(r2, this.f8003d);
        goto L27
    L18:
        this.f8001b = r82.getInteger(r2, this.f8001b);
        goto L27
    L19:
        this.f8000a = C2411qb.m4850f(r82, r2, this.f8000a);
        goto L27
    L20:
        r82.getInt(r2, 0);
        goto L27
    L25:
        this.f8002c = r82.getInt(r2, this.f8002c);
        goto L27
    L26:
        this.f8004e = r82.getFloat(r2, this.f8004e);
        goto L27
    L22:
        if (r82.peekValue(r2).type != 3) goto L24;
        r82.getString(r2);
        goto L27
    L24:
        String r22 = AbstractC0585Nj.f1897b[r82.getInteger(r2, 0)];
    L27:
        r1 = r1 + 1;
        goto L3
    L28:
        r82.recycle();
    }
}
