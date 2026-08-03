package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2326ok {
    private static volatile Choreographer choreographer;

    static {
        Object c0297Gw;
        try {
            c0297Gw = new C2283nk(m4727a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            c0297Gw = new C0297Gw(th);
        }
        if (c0297Gw instanceof C0297Gw) {
            c0297Gw = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m4727a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
    }
}
