package p022L;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: L.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Handler m384a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
