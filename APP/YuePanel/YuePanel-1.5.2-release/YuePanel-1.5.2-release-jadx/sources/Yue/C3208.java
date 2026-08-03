package Yue;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3208 extends AbstractC2981 implements InterfaceC4234 {

    @InterfaceC6489
    private volatile Object _preHandler;

    public C3208() {
        super(InterfaceC4234.f8587);
        this._preHandler = this;
    }

    @Override // Yue.InterfaceC4234
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void mo6569(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodM6570 = m6570();
            Object objInvoke = methodM6570 != null ? methodM6570.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final Method m6570() {
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
