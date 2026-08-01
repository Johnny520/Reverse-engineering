package p166g3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p056K2.C0884j;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: g3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2188e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7154a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM3229o;
        try {
            objM3229o = new C2187d(m4010a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m4010a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC1665j.m2983c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
