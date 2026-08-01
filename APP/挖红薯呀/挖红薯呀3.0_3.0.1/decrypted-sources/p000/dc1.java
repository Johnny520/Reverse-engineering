package p000;

import io.github.libxposed.api.XposedInterface;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc1 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1051a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [af1.A(java.lang.ClassLoader):void, af1.C(java.lang.Class<?>):void, af1.G(java.lang.Class<?>, int, java.lang.Class<?>[], hw):void, af1.s(java.lang.ClassLoader):void, af1.u(java.lang.Class<?>):void, af1.w(java.lang.Class<?>):void, ec1.x0(java.lang.reflect.Method, java.lang.String):void] */
    public /* synthetic */ dc1(int i) {
        this.f1051a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: af1.f(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: ec1.q(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object intercept(XposedInterface.Chain chain) {
        switch (this.f1051a) {
            case 0:
                return ec1.m917y0(chain);
            case 1:
                return af1.m161v(chain);
            case 2:
                return af1.m163x(chain);
            case 3:
                return af1.m164y(chain);
            case 4:
                return af1.m139H(chain);
            case 5:
                return af1.m159t(chain);
            case 6:
                return af1.m135D(chain);
            case 7:
                return af1.m136E(chain);
            case 8:
                return af1.m137F(chain);
            case 9:
                return af1.m133B(chain);
            default:
                return af1.m165z(chain);
        }
    }
}
