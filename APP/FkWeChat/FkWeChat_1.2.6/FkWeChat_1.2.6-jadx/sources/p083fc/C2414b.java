package p083fc;

import android.os.Build;
import ec.InterfaceC2153l0;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p228p8.AbstractC5971a;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: fc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2414b extends AbstractC5971a implements InterfaceC2153l0 {
    private volatile Object _preHandler;

    public C2414b() {
        super(InterfaceC2153l0.f5982f);
        this._preHandler = this;
    }

    @Override // ec.InterfaceC2153l0
    /* JADX INFO: renamed from: j0 */
    public void mo167j0(InterfaceC5980j interfaceC5980j, Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodM8707x = m8707x();
            Object objInvoke = methodM8707x != null ? methodM8707x.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final Method m8707x() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
