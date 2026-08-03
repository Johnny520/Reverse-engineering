package p057g;

import android.os.Build;

/* JADX INFO: renamed from: g.Q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881Q0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f3149a = false;

    static {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        boolean r02 = true;
    L6:
        f3149a = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }
}
