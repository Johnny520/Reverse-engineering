package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko {
    private static volatile Choreographer choreographer;

    static {
        Object r0 = new jo(a(Looper.getMainLooper()), false);     // Catch: Throwable -> L4
    L7:
        if ((r0 instanceof e10) == false) goto L9;
        r0 = null;
    L9:
        jo r02 = (jo) r0;
        return;
    L4:
        th = move-exception;
        r0 = ct.f(th);
        goto L7
    }

    public static final Handler a(Looper r5) {
        if (Build.VERSION.SDK_INT < 28) goto L11;
        Object r52 = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{r5});
        ip.m("null cannot be cast to non-null type android.os.Handler", r52);
        return (Handler) r52;
    L11:
        Constructor r0 = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});     // Catch: NoSuchMethodException -> L9
        return (Handler) r0.newInstance(new Object[]{r5, null, Boolean.TRUE});
    L10:
        return new Handler(r5);
    }
}
