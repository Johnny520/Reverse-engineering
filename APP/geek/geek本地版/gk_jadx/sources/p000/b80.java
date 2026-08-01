package p000;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0126ct f779a;

    /* JADX INFO: renamed from: b */
    public static final C0161ds f780b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f779a = new e80();
        } else if (i >= 28) {
            f779a = new d80();
        } else {
            f779a = new c80();
        }
        f780b = new C0161ds(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m541a(android.content.Context r12, p000.InterfaceC0108cl r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, p000.AbstractC0979zt r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b80.m541a(android.content.Context, cl, android.content.res.Resources, int, java.lang.String, int, int, zt, boolean):android.graphics.Typeface");
    }

    /* JADX INFO: renamed from: b */
    public static String m542b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
