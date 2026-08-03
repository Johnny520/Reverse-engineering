package p162l3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l3.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2448b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Handler m5844a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
