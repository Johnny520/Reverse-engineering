package p000;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0430lg implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3483b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0430lg(int i, Object obj) {
        this.f3482a = i;
        this.f3483b = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: lt.a(java.lang.ClassLoader, io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: wy.l(java.lang.Class, io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object intercept(XposedInterface.Chain chain) {
        int i = this.f3482a;
        Object obj = this.f3483b;
        switch (i) {
            case 0:
                return C0473mg.m2546k0((Method) obj, chain);
            case 1:
                return C0443lt.m2079n((ClassLoader) obj, chain);
            case 2:
                return C0906wy.m5052q((Class) obj, chain);
            default:
                return kf1.m1805H0((kf1) obj, chain);
        }
    }
}
