package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class yv {
    public Method a;
    public Method b;
    public Method c;

    public yv(Method r1, Method r2, Method r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        return;
    L6:
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
