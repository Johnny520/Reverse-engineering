package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc {
    public static final android.util.SparseIntArray m = null;
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
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            defpackage.nc.m = r0
            r1 = 6
            r2 = 1
            r0.append(r1, r2)
            r3 = 7
            r4 = 2
            r0.append(r3, r4)
            r5 = 8
            r6 = 3
            r0.append(r5, r6)
            r7 = 4
            r0.append(r7, r7)
            r7 = 5
            r0.append(r7, r7)
            r7 = 0
            r0.append(r7, r1)
            r0.append(r2, r3)
            r0.append(r4, r5)
            r1 = 9
            r0.append(r6, r1)
            r2 = 10
            r0.append(r1, r2)
            r1 = 11
            r0.append(r2, r1)
            return
    }

    public final void a(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int[] r0 = defpackage.ry.h
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Lb:
            if (r0 >= r5) goto L83
            int r1 = r4.getIndex(r0)
            android.util.SparseIntArray r2 = defpackage.nc.m
            int r2 = r2.get(r1)
            switch(r2) {
                case 1: goto L78;
                case 2: goto L6f;
                case 3: goto L66;
                case 4: goto L5d;
                case 5: goto L54;
                case 6: goto L4b;
                case 7: goto L42;
                case 8: goto L39;
                case 9: goto L30;
                case 10: goto L27;
                case 11: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L80
        L1b:
            r2 = 1
            r3.k = r2
            float r2 = r3.l
            float r1 = r4.getDimension(r1, r2)
            r3.l = r1
            goto L80
        L27:
            float r2 = r3.j
            float r1 = r4.getDimension(r1, r2)
            r3.j = r1
            goto L80
        L30:
            float r2 = r3.i
            float r1 = r4.getDimension(r1, r2)
            r3.i = r1
            goto L80
        L39:
            float r2 = r3.h
            float r1 = r4.getDimension(r1, r2)
            r3.h = r1
            goto L80
        L42:
            float r2 = r3.g
            float r1 = r4.getDimension(r1, r2)
            r3.g = r1
            goto L80
        L4b:
            float r2 = r3.f
            float r1 = r4.getDimension(r1, r2)
            r3.f = r1
            goto L80
        L54:
            float r2 = r3.e
            float r1 = r4.getFloat(r1, r2)
            r3.e = r1
            goto L80
        L5d:
            float r2 = r3.d
            float r1 = r4.getFloat(r1, r2)
            r3.d = r1
            goto L80
        L66:
            float r2 = r3.c
            float r1 = r4.getFloat(r1, r2)
            r3.c = r1
            goto L80
        L6f:
            float r2 = r3.b
            float r1 = r4.getFloat(r1, r2)
            r3.b = r1
            goto L80
        L78:
            float r2 = r3.a
            float r1 = r4.getFloat(r1, r2)
            r3.a = r1
        L80:
            int r0 = r0 + 1
            goto Lb
        L83:
            r4.recycle()
            return
    }
}
