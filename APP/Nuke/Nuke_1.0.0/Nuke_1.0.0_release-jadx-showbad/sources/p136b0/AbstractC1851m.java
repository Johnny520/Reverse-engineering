package p136b0;

import android.os.Looper;

/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1851m {

    /* JADX INFO: renamed from: a */
    public static final long f6272a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f6272a = id;
    }
}
