package p000;

import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: ua */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0796ua implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6173a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ae.a0(java.lang.ClassLoader):void, ae.c0(java.lang.ClassLoader):void, ap.c(java.lang.ClassLoader, java.lang.String):void, ck0.D(java.lang.ClassLoader, java.lang.Class<?>):void, ec1.u0(java.lang.Class<?>):void, fk0.X(java.lang.ClassLoader, java.lang.Class<?>):void, k11.j(java.lang.Class<?>):void, lt.i(java.lang.ClassLoader):void, lt.k(java.lang.ClassLoader):void, m11.k(java.lang.ClassLoader):void, m11.o(java.lang.ClassLoader):void, m11.q(java.lang.ClassLoader):void, mg.g0(java.lang.ClassLoader):void, mg.l0():void, mg.n0(java.lang.ClassLoader, java.lang.Class<?>, java.lang.Class<?>):void, mg.p0(java.lang.Class<?>):void, o00.b(java.lang.ClassLoader, java.util.List<? extends java.lang.Class<?>>):void, ob0.S(java.lang.ClassLoader, java.lang.Class<?>):void, va.f():void, vs0.w(java.lang.ClassLoader, java.lang.Class<?>, java.lang.String):void, wy.w(java.lang.ClassLoader):void, xa1.g(java.lang.ClassLoader):void, yu0.b(java.lang.ClassLoader, java.lang.Class<?>, java.lang.String):void, yy.P(java.lang.ClassLoader):void, yy.S(java.lang.ClassLoader):void, yy.U(java.lang.ClassLoader):void] */
    public /* synthetic */ C0796ua(int i) {
        this.f6173a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ap.a(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: k11.b(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: o00.a(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: va.a(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: xa1.a(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: yu0.a(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object intercept(XposedInterface.Chain chain) {
        switch (this.f6173a) {
            case 0:
                return C0833va.m4427g(chain);
            case 1:
                return C0015ae.m95b0(chain);
            case 2:
                return C0015ae.m99d0(chain);
            case 3:
                return C0473mg.m2540h0(chain);
            case 4:
                return C0473mg.m2558q0(chain);
            case 5:
                return C0473mg.m2542i0(chain);
            case 6:
                return C0473mg.m2550m0(chain);
            case 7:
                return C0473mg.m2554o0(chain);
            case 8:
                return C0026ap.m193d(chain);
            case 9:
                return C0443lt.m2075j(chain);
            case 10:
                return C0443lt.m2077l(chain);
            case 11:
                return C0906wy.m5057x(chain);
            case 12:
                return C0980yy.m5316T(chain);
            case 13:
                return C0980yy.m5313Q(chain);
            case 14:
                return C0980yy.m5318V(chain);
            case j50.f2734e /* 15 */:
                return o00.m2749c(chain);
            case 16:
                return ob0.m2834T(chain);
            case 17:
                return ck0.m554E(chain);
            case 18:
                return fk0.m1127Y(chain);
            case 19:
                return fk0.m1130a0(chain);
            case 20:
                return fk0.m1132b0(chain);
            case 21:
                return vs0.m4785x(chain);
            case 22:
                return vs0.m4787z(chain);
            case 23:
                return yu0.m5295c(chain);
            case 24:
                return k11.m1759k(chain);
            case 25:
                return m11.m2414l(chain);
            case 26:
                return m11.m2418p(chain);
            case 27:
                return m11.m2420r(chain);
            case 28:
                return xa1.m5111h(chain);
            default:
                return ec1.m911v0(chain);
        }
    }
}
