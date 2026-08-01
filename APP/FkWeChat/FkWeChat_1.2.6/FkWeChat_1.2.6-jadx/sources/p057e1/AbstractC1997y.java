package p057e1;

import android.os.Looper;

/* JADX INFO: renamed from: e1.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1997y {

    /* JADX INFO: renamed from: a */
    public static final long f5545a;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f5545a = id2;
    }

    /* JADX INFO: renamed from: a */
    public static final long m7205a() {
        return f5545a;
    }
}
