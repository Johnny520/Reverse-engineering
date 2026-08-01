package defpackage;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends h implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public i2() {
        super(vh.c);
        this._preHandler = this;
    }

    public final void d(Throwable r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L26;
        Object r0 = this._preHandler;
        Thread.UncaughtExceptionHandler r1 = null;
        if (r0 == this) goto L24;
        Method r02 = (Method) r0;
    L14:
        if (r02 == null) goto L16;
        Object r03 = r02.invoke(null, null);
    L18:
        if ((r03 instanceof Thread.UncaughtExceptionHandler) == false) goto L20;
        r1 = (Thread.UncaughtExceptionHandler) r03;
    L20:
        if (r1 == null) goto L27;
        r1.uncaughtException(Thread.currentThread(), r4);
        return;
    L27:
        return;
    L16:
        r03 = null;
        goto L18
    L24:
        r02 = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);     // Catch: Throwable -> L23
        if (Modifier.isPublic(r02.getModifiers()) == false) goto L12;
        if (Modifier.isStatic(r02.getModifiers()) == false) goto L12;
    L13:
        this._preHandler = r02;
    L12:
        r02 = null;
        goto L13
    }
}
