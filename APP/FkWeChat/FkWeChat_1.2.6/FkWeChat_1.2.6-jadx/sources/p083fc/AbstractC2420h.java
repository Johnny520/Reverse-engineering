package p083fc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p172l8.AbstractC4713t;
import p172l8.C4712s;

/* JADX INFO: renamed from: fc.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2420h {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2419g f6555a;
    private static volatile Choreographer choreographer;

    static {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            objM18798b = C4712s.m18798b(new C2418f(m8714a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        f6555a = (AbstractC2419g) (C4712s.m18803g(objM18798b) ? null : objM18798b);
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m8714a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2419g m8715b(Handler handler, String str) {
        return new C2418f(handler, str);
    }
}
