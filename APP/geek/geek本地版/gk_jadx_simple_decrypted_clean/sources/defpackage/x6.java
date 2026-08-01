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
        if (r9 >= this.e) goto L5;
        return 0.0f;
    L5:
        long r4 = this.g;
        if (r4 < 0) goto L13;
        if (r9 < r4) goto L13;
        float r0 = this.h;
        return (lr.b((r9 - r4) / this.i, 0.0f, 1.0f) * r0) + (1.0f - r0);
    L13:
        return lr.b((r9 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
    }
}
