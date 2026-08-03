package p043Y;

import android.os.Build;

/* JADX INFO: renamed from: Y.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0461t {

    /* JADX INFO: renamed from: a */
    public static final boolean f1040a = false;

    static {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        boolean r02 = true;
    L6:
        f1040a = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }
}
