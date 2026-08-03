package Yue;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4076 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public static final Method f650;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f650 = method;
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m1030() {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> Set<E> m1031(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m11510(@InterfaceC6399 Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f650) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> List<E> m11511() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m11512(@InterfaceC6399 ReentrantLock reentrantLock, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        reentrantLock.lock();
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            reentrantLock.unlock();
            C5437.m16929(1);
        }
    }
}
