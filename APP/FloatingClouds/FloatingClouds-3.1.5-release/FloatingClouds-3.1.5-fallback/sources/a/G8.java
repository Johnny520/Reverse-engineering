package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G8 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97a;
    public final /* synthetic */ a.D7 b;

    public /* synthetic */ G8(a.D7 r1, int r2) {
            r0 = this;
            r0.f97a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r2) {
            r1 = this;
            int r0 = r1.f97a
            switch(r0) {
                case 0: goto L35;
                case 1: goto L29;
                case 2: goto L1d;
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r2, r0)
            a.D7 r0 = r1.b
            java.lang.Object r2 = r0.f(r2)
            return r2
        L11:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r2, r0)
            a.D7 r0 = r1.b
            java.lang.Object r2 = r0.f(r2)
            return r2
        L1d:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r2, r0)
            a.D7 r0 = r1.b
            java.lang.Object r2 = r0.f(r2)
            return r2
        L29:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r2, r0)
            a.D7 r0 = r1.b
            java.lang.Object r2 = r0.f(r2)
            return r2
        L35:
            java.lang.String r0 = "chain"
            a.C0193i9.e(r2, r0)
            a.D7 r0 = r1.b
            java.lang.Object r2 = r0.f(r2)
            return r2
    }
}
