package a;

/* JADX INFO: loaded from: classes.dex */
public final class Bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int r3, int r4) {
            r2 = this;
            r2.c = r3
            r2.d = r4
            r0 = 1
            r2.h = r0
            boolean r0 = r2.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L16
            if (r4 == r1) goto L11
            r2.f32a = r4
        L11:
            if (r3 == r1) goto L1e
            r2.b = r3
            return
        L16:
            if (r3 == r1) goto L1a
            r2.f32a = r3
        L1a:
            if (r4 == r1) goto L1e
            r2.b = r4
        L1e:
            return
    }
}
