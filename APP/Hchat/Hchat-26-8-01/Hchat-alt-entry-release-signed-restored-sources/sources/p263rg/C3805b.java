package p263rg;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p249qg.C3593q;
import p249qg.InterfaceC3595r;
import wf.AbstractC5555a;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: rg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3805b extends AbstractC5555a implements InterfaceC3595r {
    private volatile Object _preHandler;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3805b() {
        super(C3593q.f11606g);
        this._preHandler = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // p249qg.InterfaceC3595r
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4455m(Throwable th2, InterfaceC5561g interfaceC5561g) {
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
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
