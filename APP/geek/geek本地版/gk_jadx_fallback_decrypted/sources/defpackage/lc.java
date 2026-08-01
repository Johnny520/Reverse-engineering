package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc {
    public static final android.util.SparseIntArray e = null;
    public int a;
    public int b;
    public float c;
    public float d;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            defpackage.lc.e = r0
            r1 = 2
            r2 = 1
            r0.append(r1, r2)
            r3 = 4
            r0.append(r3, r1)
            r1 = 5
            r4 = 3
            r0.append(r1, r4)
            r0.append(r2, r3)
            r2 = 0
            r0.append(r2, r1)
            r1 = 6
            r0.append(r4, r1)
            return
    }

    public final void a(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = defpackage.ry.e
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            r0 = 0
            r1 = r0
        Lc:
            if (r1 >= r7) goto L5c
            int r2 = r6.getIndex(r1)
            android.util.SparseIntArray r3 = defpackage.lc.e
            int r3 = r3.get(r2)
            switch(r3) {
                case 1: goto L51;
                case 2: goto L48;
                case 3: goto L32;
                case 4: goto L2e;
                case 5: goto L25;
                case 6: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L59
        L1c:
            float r3 = r5.c
            float r2 = r6.getFloat(r2, r3)
            r5.c = r2
            goto L59
        L25:
            int r3 = r5.a
            int r2 = defpackage.oc.f(r6, r2, r3)
            r5.a = r2
            goto L59
        L2e:
            r6.getInt(r2, r0)
            goto L59
        L32:
            android.util.TypedValue r3 = r6.peekValue(r2)
            int r3 = r3.type
            r4 = 3
            if (r3 != r4) goto L3f
            r6.getString(r2)
            goto L59
        L3f:
            java.lang.String[] r3 = defpackage.ff.m
            int r2 = r6.getInteger(r2, r0)
            r2 = r3[r2]
            goto L59
        L48:
            int r3 = r5.b
            int r2 = r6.getInt(r2, r3)
            r5.b = r2
            goto L59
        L51:
            float r3 = r5.d
            float r2 = r6.getFloat(r2, r3)
            r5.d = r2
        L59:
            int r1 = r1 + 1
            goto Lc
        L5c:
            r6.recycle()
            return
    }
}
