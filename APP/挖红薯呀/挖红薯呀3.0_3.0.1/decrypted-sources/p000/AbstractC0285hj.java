package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: hj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0285hj {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Handler m1325a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
