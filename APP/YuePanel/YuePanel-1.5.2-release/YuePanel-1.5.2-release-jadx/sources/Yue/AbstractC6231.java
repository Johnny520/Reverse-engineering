package Yue;

import Yue.InterfaceC7144;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۡۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6231<Params, Progress, Result> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f15397 = "AsyncTask";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f15398 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f15399 = 128;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f15400 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final ThreadFactory f15401;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final BlockingQueue<Runnable> f15402;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Executor f15403;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f15404 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f15405 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static HandlerC6235 f15406;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile Executor f15407;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final AbstractCallableC6237<Params, Result> f15408;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final FutureTask<Result> f15409;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public volatile EnumC6236 f15410 = EnumC6236.PENDING;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final AtomicBoolean f15411 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final AtomicBoolean f15412 = new AtomicBoolean();

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ */
    public static class ThreadFactoryC0946 implements ThreadFactory {

        /* JADX INFO: renamed from: ۥ */
        public final AtomicInteger f1931 = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f1931.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟ */
    public class C0947 extends AbstractCallableC6237<Params, Result> {
        public C0947() {
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC6231.this.f15412.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC6231.this.mo513(this.f1936);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟, reason: contains not printable characters */
    public class C6232 extends FutureTask<Result> {
        public C6232(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC6231.this.m19260(get());
            } catch (InterruptedException e) {
                Log.w(AbstractC6231.f15397, e);
            } catch (CancellationException unused) {
                AbstractC6231.this.m19260(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ class C6233 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1933;

        static {
            int[] iArr = new int[EnumC6236.values().length];
            f1933 = iArr;
            try {
                iArr[EnumC6236.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1933[EnumC6236.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C6234<Data> {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC6231 f1934;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Data[] f1935;

        public C6234(AbstractC6231 abstractC6231, Data... dataArr) {
            this.f1934 = abstractC6231;
            this.f1935 = dataArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class HandlerC6235 extends Handler {
        public HandlerC6235() {
            super(Looper.getMainLooper());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Yue.ۥۡۡۢ۠ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C6234 c6234 = (C6234) message.obj;
            int i = message.what;
            if (i == 1) {
                c6234.f1934.m19251(c6234.f1935[0]);
            } else {
                if (i != 2) {
                    return;
                }
                c6234.f1934.m19258(c6234.f1935);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public enum EnumC6236 {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractCallableC6237<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: ۥ */
        public Params[] f1936;
    }

    static {
        ThreadFactoryC0946 threadFactoryC0946 = new ThreadFactoryC0946();
        f15401 = threadFactoryC0946;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f15402 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC0946);
        f15403 = threadPoolExecutor;
        f15407 = threadPoolExecutor;
    }

    public AbstractC6231() {
        C0947 c0947 = new C0947();
        this.f15408 = c0947;
        this.f15409 = new C6232(c0947);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m19246(Runnable runnable) {
        f15407.execute(runnable);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Handler m19247() {
        HandlerC6235 handlerC6235;
        synchronized (AbstractC6231.class) {
            try {
                if (f15406 == null) {
                    f15406 = new HandlerC6235();
                }
                handlerC6235 = f15406;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC6235;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m19248(Executor executor) {
        f15407 = executor;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m2725(boolean z) {
        this.f15411.set(true);
        return this.f15409.cancel(z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract Result mo513(Params... paramsArr);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractC6231<Params, Progress, Result> m19249(Params... paramsArr) {
        return m19250(f15407, paramsArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC6231<Params, Progress, Result> m19250(Executor executor, Params... paramsArr) {
        if (this.f15410 == EnumC6236.PENDING) {
            this.f15410 = EnumC6236.RUNNING;
            m19257();
            this.f15408.f1936 = paramsArr;
            executor.execute(this.f15409);
            return this;
        }
        int i = C6233.f1933[this.f15410.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m19251(Result result) {
        if (m19255()) {
            mo9072(result);
        } else {
            mo9073(result);
        }
        this.f15410 = EnumC6236.FINISHED;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Result m19252() throws ExecutionException, InterruptedException {
        return this.f15409.get();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Result m19253(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f15409.get(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final EnumC6236 m19254() {
        return this.f15410;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m19255() {
        return this.f15411.get();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m19256() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo9072(Result result) {
        m19256();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo9073(Result result) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m19257() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m19258(Progress... progressArr) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Result m19259(Result result) {
        m19247().obtainMessage(1, new C6234(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m19260(Result result) {
        if (this.f15412.get()) {
            return;
        }
        m19259(result);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m19261(Progress... progressArr) {
        if (m19255()) {
            return;
        }
        m19247().obtainMessage(2, new C6234(this, progressArr)).sendToTarget();
    }
}
