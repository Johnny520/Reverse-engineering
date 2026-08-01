package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: oo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0566oo {
    private static volatile Choreographer choreographer;

    static {
        Object objM1311e;
        try {
            objM1311e = new C0529no(m2051a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objM1311e = AbstractC0274gu.m1311e(th);
        }
        if (objM1311e instanceof l10) {
            objM1311e = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m2051a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC0493mp.m1855e("null cannot be cast to non-null type android.os.Handler", objInvoke);
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
