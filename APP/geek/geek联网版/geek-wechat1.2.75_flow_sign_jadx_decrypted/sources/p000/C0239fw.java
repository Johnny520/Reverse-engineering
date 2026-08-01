package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: fw */
/* JADX INFO: loaded from: classes.dex */
public final class C0239fw {

    /* JADX INFO: renamed from: a */
    public Method f1840a;

    /* JADX INFO: renamed from: b */
    public Method f1841b;

    /* JADX INFO: renamed from: c */
    public Method f1842c;

    public C0239fw(Method method, Method method2, Method method3) {
        this.f1840a = method;
        this.f1841b = method2;
        this.f1842c = method3;
    }

    /* JADX INFO: renamed from: a */
    public static void m1115a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
