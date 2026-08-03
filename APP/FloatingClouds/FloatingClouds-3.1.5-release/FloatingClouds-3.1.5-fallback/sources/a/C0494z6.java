package a;

/* JADX INFO: renamed from: a.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494z6 extends a.Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f777a;
    public a.AbstractC0040a2 b;

    public /* synthetic */ C0494z6(int r1) {
            r0 = this;
            r0.f777a = r1
            r0.<init>()
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r4) {
            r3 = this;
            int r0 = r3.f777a
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            a.a2 r0 = r3.b
            a.pb r0 = (a.C0320pb) r0
            r1 = 0
            if (r0 == 0) goto L11
            int r0 = r0.b(r4)
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 7
            r4.i(r2)
            r2 = 6
            r4.a(r2, r0)
            r0 = 4
            r4.a(r0, r1)
            r0 = 3
            r4.a(r0, r1)
            r0 = 1
            r4.a(r0, r1)
            r4.a(r1, r1)
            int r0 = r4.e()
            r4.f(r0)
            return r0
        L31:
            a.a2 r0 = r3.b
            a.t6 r0 = (a.C0386t6) r0
            r1 = 0
            if (r0 == 0) goto L3d
            int r0 = r0.b(r4)
            goto L3e
        L3d:
            r0 = r1
        L3e:
            r2 = 7
            r4.i(r2)
            r2 = 6
            r4.a(r2, r0)
            r0 = 4
            r4.a(r0, r1)
            r0 = 3
            r4.a(r0, r1)
            r0 = 1
            r4.a(r0, r1)
            r4.a(r1, r1)
            int r0 = r4.e()
            r4.f(r0)
            return r0
    }
}
