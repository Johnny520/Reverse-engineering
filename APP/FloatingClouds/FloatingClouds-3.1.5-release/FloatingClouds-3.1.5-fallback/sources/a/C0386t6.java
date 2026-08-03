package a;

/* JADX INFO: renamed from: a.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0386t6 extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0115e3 f695a;
    public a.C0115e3 b;

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r5) {
            r4 = this;
            a.e3 r0 = r4.f695a
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.b(r5)
            goto Lb
        La:
            r0 = r1
        Lb:
            a.e3 r2 = r4.b
            if (r2 == 0) goto L14
            int r2 = r2.b(r5)
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 10
            r5.i(r3)
            r3 = 9
            r5.a(r3, r1)
            r3 = 8
            r5.a(r3, r1)
            r3 = 7
            r5.a(r3, r1)
            r3 = 6
            r5.a(r3, r1)
            r3 = 5
            r5.a(r3, r1)
            r3 = 4
            r5.a(r3, r1)
            r3 = 3
            r5.a(r3, r2)
            r2 = 2
            r5.a(r2, r0)
            r0 = 1
            r5.a(r0, r1)
            r5.a(r1, r1)
            int r0 = r5.e()
            r5.f(r0)
            return r0
    }
}
