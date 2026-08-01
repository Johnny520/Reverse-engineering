package p093;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.activity.AbstractC0053;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;

/* JADX INFO: renamed from: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7199 {
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f19217 = 0;

    static {
        Object objM162;
        try {
            objM162 = Result.m8755constructorimpl(new C7200(m12411(Looper.getMainLooper())));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8761isFailureimpl(objM162)) {
            objM162 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Handler m12411(Looper looper) throws IllegalAccessException, InvocationTargetException {
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
}
