package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long r9) {
            r8 = this;
            long r0 = r8.e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L8
            return r3
        L8:
            long r4 = r8.g
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 < 0) goto L28
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L28
        L17:
            long r9 = r9 - r4
            float r0 = r8.h
            float r1 = r6 - r0
            float r9 = (float) r9
            int r10 = r8.i
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = defpackage.lr.b(r9, r3, r6)
            float r9 = r9 * r0
            float r9 = r9 + r1
            return r9
        L28:
            long r9 = r9 - r0
            float r9 = (float) r9
            int r10 = r8.a
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = defpackage.lr.b(r9, r3, r6)
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            return r9
    }
}
