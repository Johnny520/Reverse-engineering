package p000;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class h80 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0387ju f2140a;

    /* JADX INFO: renamed from: b */
    public static final C0309hs f2141b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f2140a = new k80();
        } else if (i >= 28) {
            f2140a = new j80();
        } else {
            f2140a = new i80();
        }
        f2141b = new C0309hs(16);
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
    public static android.graphics.Typeface m1361a(android.content.Context r12, p000.InterfaceC0191el r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, p000.AbstractC0498mu r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h80.m1361a(android.content.Context, el, android.content.res.Resources, int, java.lang.String, int, int, mu, boolean):android.graphics.Typeface");
    }

    /* JADX INFO: renamed from: b */
    public static String m1362b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
