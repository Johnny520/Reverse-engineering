package Yue;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5234 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1358 = "HandlerCompat";

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ$ۥ */
    @InterfaceC7113(28)
    public static class C0673 {
        /* JADX INFO: renamed from: ۥ */
        public static Handler m1999(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static Handler m2000(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m16035(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0674 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2001(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Handler m1997(@InterfaceC6391 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0673.m1999(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Handler m1998(@InterfaceC6391 Looper looper, @InterfaceC6391 Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0673.m2000(looper, callback);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w(f1358, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m16033(@InterfaceC6391 Handler handler, @InterfaceC6391 Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0674.m2001(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e) {
            e = e;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e3) {
            e = e3;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m16034(@InterfaceC6391 Handler handler, @InterfaceC6391 Runnable runnable, @InterfaceC6490 Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0673.m16035(handler, runnable, obj, j);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }
}
