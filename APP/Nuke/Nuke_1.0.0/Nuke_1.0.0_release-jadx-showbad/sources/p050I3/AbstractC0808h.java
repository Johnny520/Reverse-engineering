package p050I3;

import android.os.Looper;
import com.bumptech.glide.AbstractC1925g;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p000A.C0065i;
import p011B4.AbstractC0231b;
import p021D3.RunnableC0270g;
import p021D3.ThreadFactoryC0268e;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I3.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0808h {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2594a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f2595b = ThreadLocal.withInitial(new C0806f());

    /* JADX INFO: renamed from: c */
    public static final Object f2596c = new Object();

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f2597d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f2598e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0268e(1));
        AbstractC1665j.m2984d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f2597d = executorServiceNewSingleThreadExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1407a(final String str, final InterfaceC1599a interfaceC1599a) throws Throwable {
        if (AbstractC1665j.m2981a(f2595b.get(), Boolean.TRUE)) {
            m1408b();
            return m1410d(str, interfaceC1599a);
        }
        if (AbstractC1665j.m2981a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException(AbstractC0231b.m400k("Native call '", str, "' attempted on main thread").toString());
        }
        try {
            return f2597d.submit(new Callable() { // from class: I3.g
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str2 = str;
                    InterfaceC1599a interfaceC1599a2 = interfaceC1599a;
                    AbstractC0808h.f2594a.set(true);
                    ThreadLocal threadLocal = AbstractC0808h.f2595b;
                    threadLocal.set(Boolean.TRUE);
                    try {
                        AbstractC0808h.m1408b();
                        return AbstractC0808h.m1410d(str2, interfaceC1599a2);
                    } finally {
                        threadLocal.set(Boolean.FALSE);
                    }
                }
            }).get();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(AbstractC0231b.m400k("Native call '", str, "' interrupted"), e5);
        } catch (ExecutionException e6) {
            e = e6;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            if ((e instanceof RuntimeException) || (e instanceof Error)) {
                throw e;
            }
            throw new IllegalStateException(AbstractC0231b.m400k("Native call '", str, "' failed"), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1408b() {
        if (f2598e) {
            return;
        }
        synchronized (f2596c) {
            try {
                if (f2598e) {
                    return;
                }
                m1410d("load", new C0065i(15));
                if (!((Boolean) m1410d("attest", new C0065i(16))).booleanValue()) {
                    AbstractC1925g.m3537n("NukeNativePerf", "native module attest failed");
                }
                f2598e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1409c(String str, InterfaceC1599a interfaceC1599a) {
        AbstractC1665j.m2984d(f2597d.submit(new RunnableC0270g(4, str, interfaceC1599a)), "submit(...)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m1410d(String str, InterfaceC1599a interfaceC1599a) {
        AtomicBoolean atomicBoolean = f2594a;
        String str2 = "";
        long jNanoTime = System.nanoTime();
        try {
            Object objMo6a = interfaceC1599a.mo6a();
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            if (str.equals("sign") && (objMo6a instanceof String)) {
                str2 = " hex=" + objMo6a;
            }
            AbstractC1925g.m3544u("NukeNativePerf", str + "=" + jNanoTime2 + "ms worker=" + atomicBoolean.get() + str2);
            return objMo6a;
        } catch (Throwable th) {
            AbstractC1925g.m3544u("NukeNativePerf", str + "=" + ((System.nanoTime() - jNanoTime) / 1000000) + "ms worker=" + atomicBoolean.get() + "");
            throw th;
        }
    }
}
