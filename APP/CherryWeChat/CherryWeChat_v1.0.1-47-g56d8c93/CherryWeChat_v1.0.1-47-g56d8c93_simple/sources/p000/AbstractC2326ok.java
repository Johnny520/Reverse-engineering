package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2326ok {
    private static volatile Choreographer choreographer;

    static {
        Object r0 = new C2283nk(m4727a(Looper.getMainLooper()), false);     // Catch: Throwable -> L4
    L7:
        if ((r0 instanceof C0297Gw) == false) goto L9;
        r0 = null;
    L9:
        C2283nk r02 = (C2283nk) r0;
        return;
    L4:
        th = move-exception;
        r0 = new C0297Gw(th);
        goto L7
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m4727a(Looper r3) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{r3});
    }
}
