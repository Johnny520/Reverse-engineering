package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H8 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113a;
    public final /* synthetic */ a.C0297o6 b;
    public final /* synthetic */ a.D7 c;

    public /* synthetic */ H8(a.C0297o6 r1, a.D7 r2, int r3) {
            r0 = this;
            r0.f113a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r4) {
            r3 = this;
            int r0 = r3.f113a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r4, r0)
            a.I8 r0 = new a.I8
            a.D7 r1 = r3.c
            r2 = 0
            r0.<init>(r1, r4, r2)
            a.o6 r4 = r3.b
            java.lang.Object r4 = a.C0297o6.a(r4, r0)
            return r4
        L19:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r4, r0)
            a.I8 r0 = new a.I8
            a.D7 r1 = r3.c
            r2 = 1
            r0.<init>(r1, r4, r2)
            a.o6 r4 = r3.b
            java.lang.Object r4 = a.C0297o6.a(r4, r0)
            return r4
    }
}
