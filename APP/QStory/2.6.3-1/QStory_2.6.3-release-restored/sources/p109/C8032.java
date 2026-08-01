package p109;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;

/* JADX INFO: renamed from: 飘花落叶言世苏哲子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8032 extends AbstractC5191 implements InterfaceC6236 {
    private volatile Object _preHandler;

    public C8032() {
        super(C6265.f15427);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // kotlinx.coroutines.InterfaceC6236
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) {
        Method declaredMethod;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                declaredMethod = (Method) obj;
            } else {
                try {
                    declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                } catch (Throwable unused) {
                }
                if (Modifier.isPublic(declaredMethod.getModifiers())) {
                    if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                        declaredMethod = null;
                    }
                    this._preHandler = declaredMethod;
                }
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
