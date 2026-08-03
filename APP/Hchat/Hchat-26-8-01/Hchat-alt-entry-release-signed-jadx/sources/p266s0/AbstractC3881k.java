package p266s0;

import android.os.Looper;

/* JADX INFO: renamed from: s0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3881k {

    /* JADX INFO: renamed from: a */
    public static final long f12739a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f12739a = id2;
    }
}
