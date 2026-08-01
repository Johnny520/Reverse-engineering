package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class w70 {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean c = false;

    static {
        int r0 = Build.VERSION.SDK_INT;
        boolean r1 = true;
        a = true;
        b = true;
        if (r0 >= 28) goto L6;
        r1 = false;
    L6:
        c = r1;
    }
}
