package p000;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0706ry implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5569a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f5570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5571c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0706ry(Class cls, Method method) {
        this.f5570b = cls;
        this.f5571c = method;
    }

    /* JADX DEBUG: Class process forced to load method for inline: m11.c(java.lang.ClassLoader, java.lang.Class, io.github.libxposed.api.XposedInterface$Chain):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object intercept(XposedInterface.Chain chain) {
        int i = this.f5569a;
        Class cls = this.f5570b;
        Object obj = this.f5571c;
        switch (i) {
            case 0:
                return C0906wy.m5054t(cls, (Method) obj, chain);
            default:
                return m11.m2422t((ClassLoader) obj, cls, chain);
        }
    }

    public /* synthetic */ C0706ry(ClassLoader classLoader, Class cls) {
        this.f5571c = classLoader;
        this.f5570b = cls;
    }
}
