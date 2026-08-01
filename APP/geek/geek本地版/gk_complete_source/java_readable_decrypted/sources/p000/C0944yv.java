package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
public final class C0944yv {

    /* JADX INFO: renamed from: a */
    public Method f5407a;

    /* JADX INFO: renamed from: b */
    public Method f5408b;

    /* JADX INFO: renamed from: c */
    public Method f5409c;

    public C0944yv(Method method, Method method2, Method method3) {
        this.f5407a = method;
        this.f5408b = method2;
        this.f5409c = method3;
    }

    /* JADX INFO: renamed from: a */
    public static void m2743a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
