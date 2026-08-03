package Yue;

import com.android.dex.DexFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class C7733 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1339 f23261 = new C1339(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7733 f23262 = new C7733(new C7734(C8158.m26880(C8158.f24183 + " TaskRunner", true)));

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Logger f23263;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC1338 f3049;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3050;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f23264;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f23265;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C7731> f23266;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C7731> f23267;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final Runnable f23268;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ */
    public interface InterfaceC1338 {
        void execute(@InterfaceC6399 Runnable runnable);

        /* JADX INFO: renamed from: ۥ */
        void mo3829(@InterfaceC6399 C7733 c7733, long j);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo3830(@InterfaceC6399 C7733 c7733);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        long mo24607();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        void mo24608(@InterfaceC6399 C7733 c7733);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟ */
    public static final class C1339 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۡ۟ۢ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1339(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Logger m3831() {
            return C7733.f23263;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1339() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class C7734 implements InterfaceC1338 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final ThreadPoolExecutor f3051;

        public C7734(@InterfaceC6399 ThreadFactory threadFactory) {
            C5499.m17103(threadFactory, "threadFactory");
            this.f3051 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // Yue.C7733.InterfaceC1338
        public void execute(@InterfaceC6399 Runnable runnable) {
            C5499.m17103(runnable, "runnable");
            this.f3051.execute(runnable);
        }

        @Override // Yue.C7733.InterfaceC1338
        /* JADX INFO: renamed from: ۥ */
        public void mo3829(@InterfaceC6399 C7733 c7733, long j) throws InterruptedException {
            C5499.m17103(c7733, "taskRunner");
            long j2 = j / C4720.f10089;
            long j3 = j - (C4720.f10089 * j2);
            if (j2 > 0 || j > 0) {
                c7733.wait(j2, (int) j3);
            }
        }

        @Override // Yue.C7733.InterfaceC1338
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo3830(@InterfaceC6399 C7733 c7733) {
            C5499.m17103(c7733, "taskRunner");
            c7733.notify();
        }

        @Override // Yue.C7733.InterfaceC1338
        /* JADX INFO: renamed from: ۥ۟۟ */
        public long mo24607() {
            return System.nanoTime();
        }

        @Override // Yue.C7733.InterfaceC1338
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo24608(@InterfaceC6399 C7733 c7733) {
            C5499.m17103(c7733, "taskRunner");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m24609() {
            this.f3051.shutdown();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n+ 2 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n*L\n1#1,314:1\n35#2,19:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n*L\n62#1:315,19\n*E\n"})
    public static final class RunnableC7735 implements Runnable {
        public RunnableC7735() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7724 abstractC7724M24600;
            long jMo24607;
            while (true) {
                C7733 c7733 = C7733.this;
                synchronized (c7733) {
                    abstractC7724M24600 = c7733.m24600();
                }
                if (abstractC7724M24600 == null) {
                    return;
                }
                C7731 c7731M24571 = abstractC7724M24600.m24571();
                C5499.m17100(c7731M24571);
                C7733 c77332 = C7733.this;
                boolean zIsLoggable = C7733.f23261.m3831().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo24607 = c7731M24571.m24588().m24603().mo24607();
                    C7730.m24575(abstractC7724M24600, c7731M24571, "starting");
                } else {
                    jMo24607 = -1;
                }
                try {
                    try {
                        c77332.m24606(abstractC7724M24600);
                        C8107 c8107 = C8107.f3222;
                        if (zIsLoggable) {
                            C7730.m24575(abstractC7724M24600, c7731M24571, "finished run in " + C7730.m3824(c7731M24571.m24588().m24603().mo24607() - jMo24607));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        C7730.m24575(abstractC7724M24600, c7731M24571, "failed a run in " + C7730.m3824(c7731M24571.m24588().m24603().mo24607() - jMo24607));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C7733.class.getName());
        C5499.m17102(logger, "getLogger(TaskRunner::class.java.name)");
        f23263 = logger;
    }

    public C7733(@InterfaceC6399 InterfaceC1338 interfaceC1338) {
        C5499.m17103(interfaceC1338, "backend");
        this.f3049 = interfaceC1338;
        this.f3050 = DexFormat.API_SPACES_IN_SIMPLE_NAME;
        this.f23266 = new ArrayList();
        this.f23267 = new ArrayList();
        this.f23268 = new RunnableC7735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<C7731> m24598() {
        List<C7731> listM10993;
        synchronized (this) {
            listM10993 = C3888.m10993(this.f23266, this.f23267);
        }
        return listM10993;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m24599(AbstractC7724 abstractC7724, long j) {
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C7731 c7731M24571 = abstractC7724.m24571();
        C5499.m17100(c7731M24571);
        if (c7731M24571.m24582() != abstractC7724) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zM24583 = c7731M24571.m24583();
        c7731M24571.m24594(false);
        c7731M24571.m24593(null);
        this.f23266.remove(c7731M24571);
        if (j != -1 && !zM24583 && !c7731M24571.m24587()) {
            c7731M24571.m24592(abstractC7724, j, true);
        }
        if (!c7731M24571.m24584().isEmpty()) {
            this.f23267.add(c7731M24571);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC7724 m24600() {
        boolean z;
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f23267.isEmpty()) {
            long jMo24607 = this.f3049.mo24607();
            Iterator<C7731> it = this.f23267.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC7724 abstractC7724 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC7724 abstractC77242 = it.next().m24584().get(0);
                long jMax = Math.max(0L, abstractC77242.m24570() - jMo24607);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC7724 != null) {
                        z = true;
                        break;
                    }
                    abstractC7724 = abstractC77242;
                }
            }
            if (abstractC7724 != null) {
                m24601(abstractC7724);
                if (z || (!this.f23264 && (!this.f23267.isEmpty()))) {
                    this.f3049.execute(this.f23268);
                }
                return abstractC7724;
            }
            if (this.f23264) {
                if (jMin < this.f23265 - jMo24607) {
                    this.f3049.mo3830(this);
                }
                return null;
            }
            this.f23264 = true;
            this.f23265 = jMo24607 + jMin;
            try {
                try {
                    this.f3049.mo3829(this, jMin);
                } catch (InterruptedException unused) {
                    m24602();
                }
            } finally {
                this.f23264 = false;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m24601(AbstractC7724 abstractC7724) {
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC7724.m24573(-1L);
        C7731 c7731M24571 = abstractC7724.m24571();
        C5499.m17100(c7731M24571);
        c7731M24571.m24584().remove(abstractC7724);
        this.f23267.remove(c7731M24571);
        c7731M24571.m24593(abstractC7724);
        this.f23266.add(c7731M24571);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m24602() {
        int size = this.f23266.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.f23266.get(size).m3826();
            }
        }
        for (int size2 = this.f23267.size() - 1; -1 < size2; size2--) {
            C7731 c7731 = this.f23267.get(size2);
            c7731.m3826();
            if (c7731.m24584().isEmpty()) {
                this.f23267.remove(size2);
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final InterfaceC1338 m24603() {
        return this.f3049;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m24604(@InterfaceC6399 C7731 c7731) {
        C5499.m17103(c7731, "taskQueue");
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (c7731.m24582() == null) {
            if (!c7731.m24584().isEmpty()) {
                C8158.m26832(this.f23267, c7731);
            } else {
                this.f23267.remove(c7731);
            }
        }
        if (this.f23264) {
            this.f3049.mo3830(this);
        } else {
            this.f3049.execute(this.f23268);
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 81, r0v1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C7731 m24605() {
        int i;
        synchronized (this) {
            i = this.f3050;
            this.f3050 = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C7731(this, sb.toString());
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m24606(AbstractC7724 abstractC7724) {
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC7724.m3820());
        try {
            long jMo12822 = abstractC7724.mo12822();
            synchronized (this) {
                m24599(abstractC7724, jMo12822);
                C8107 c8107 = C8107.f3222;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m24599(abstractC7724, -1L);
                C8107 c81072 = C8107.f3222;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }
}
