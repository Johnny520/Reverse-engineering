package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends i5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f7288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k5.o f7289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w5.a f7291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7295q;

    public w(k5.u r1, a5.a r2, k5.o r3, int r4, o5.c r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f7288j = r1
            r0.f7289k = r3
            r1 = 1
            int r1 = r2.o(r1)
            int r1 = r1 + r4
            r0.f7293o = r1
            r3 = 0
            int r2 = r2.o(r3)
            r0.f7290l = r2
            int r1 = r5.seekTo(r1)
            r0.f7292n = r1
            r1 = 0
            r0.f7291m = r1
            r0.f7294p = r6
            return
    }

    public w(k5.u r1, a5.a r2, k5.o r3, int r4, o5.m r5, o5.c r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.f7288j = r1
            r0.f7289k = r3
            r1 = 1
            int r1 = r2.o(r1)
            int r1 = r1 + r4
            r0.f7293o = r1
            r3 = 0
            int r2 = r2.o(r3)
            r0.f7290l = r2
            int r1 = r6.seekTo(r1)
            r0.f7292n = r1
            r5.c()
            w5.a r1 = r5.b()
            r0.f7291m = r1
            r0.f7294p = r7
            return
    }

    @Override // i5.a
    public final java.lang.String f1() {
            r1 = this;
            k5.o r0 = r1.f7289k
            java.lang.String r0 = r0.getType()
            return r0
    }

    @Override // i5.a
    public final java.lang.String getName() {
            r4 = this;
            k5.u r0 = r4.f7288j
            k5.s r1 = r0.f7280r
            androidx.lifecycle.x r2 = r0.f7263a
            int r3 = r4.f7295q
            if (r3 != 0) goto L14
            k5.p r0 = r0.f7282t
            int r3 = r4.f7293o
            int r0 = r0.b(r3)
            r4.f7295q = r0
        L14:
            int r0 = r4.f7295q
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.a
    public final java.lang.String getType() {
            r4 = this;
            k5.u r0 = r4.f7288j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            int r3 = r4.f7295q
            if (r3 != 0) goto L14
            k5.p r0 = r0.f7282t
            int r3 = r4.f7293o
            int r0 = r0.b(r3)
            r4.f7295q = r0
        L14:
            int r0 = r4.f7295q
            int r0 = r0 + 2
            int r0 = r2.P(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }
}
