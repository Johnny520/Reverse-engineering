package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ko */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0418ko {
    private static volatile Choreographer choreographer;

    static {
        Object objM812f;
        try {
            objM812f = new C0381jo(m1704a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objM812f = AbstractC0126ct.m812f(th);
        }
        if (objM812f instanceof e10) {
            objM812f = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m1704a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.os.Handler", objInvoke);
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
