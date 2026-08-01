package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mc {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int[] r0 = defpackage.ry.f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Lb:
            if (r0 >= r5) goto L48
            int r1 = r4.getIndex(r0)
            r2 = 1
            if (r1 != r2) goto L1d
            float r2 = r3.c
            float r1 = r4.getFloat(r1, r2)
            r3.c = r1
            goto L45
        L1d:
            if (r1 != 0) goto L2e
            int r2 = r3.a
            int r1 = r4.getInt(r1, r2)
            r3.a = r1
            int[] r2 = defpackage.oc.d
            r1 = r2[r1]
            r3.a = r1
            goto L45
        L2e:
            r2 = 4
            if (r1 != r2) goto L3a
            int r2 = r3.b
            int r1 = r4.getInt(r1, r2)
            r3.b = r1
            goto L45
        L3a:
            r2 = 3
            if (r1 != r2) goto L45
            float r2 = r3.d
            float r1 = r4.getFloat(r1, r2)
            r3.d = r1
        L45:
            int r0 = r0 + 1
            goto Lb
        L48:
            r4.recycle()
            return
    }
}
