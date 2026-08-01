package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0539o6 extends ThreadLocal {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            C0641q6 c0641q6 = new C0641q6(choreographer, Handler.createAsync(looperMyLooper));
            return pf1.m3034J(c0641q6, c0641q6.f5055o);
        }
        C0921xc.m5134o("no Looper on this thread");
        return null;
    }
}
