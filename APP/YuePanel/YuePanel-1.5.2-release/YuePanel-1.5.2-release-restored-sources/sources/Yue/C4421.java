package Yue;

import Yue.C7024;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class C4421 {

    /* JADX INFO: renamed from: ۥ */
    public int f883;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f884;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Runnable f9152;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public ExecutorService f9153;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<C7024.RunnableC1140> f9154;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<C7024.RunnableC1140> f9155;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<C7024> f9156;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4421() {
        this.f883 = 64;
        this.f884 = 5;
        this.f9154 = new ArrayDeque<>();
        this.f9155 = new ArrayDeque<>();
        this.f9156 = new ArrayDeque<>();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "executorService", imports = {}))
    @InterfaceC5572(name = "-deprecated_executorService")
    /* JADX INFO: renamed from: ۥ */
    public final ExecutorService m1369() {
        return m12854();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final synchronized void m1370() {
        try {
            Iterator<C7024.RunnableC1140> it = this.f9154.iterator();
            while (it.hasNext()) {
                it.next().m3321().cancel();
            }
            Iterator<C7024.RunnableC1140> it2 = this.f9155.iterator();
            while (it2.hasNext()) {
                it2.next().m3321().cancel();
            }
            Iterator<C7024> it3 = this.f9156.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12852(@InterfaceC6399 C7024.RunnableC1140 runnableC1140) {
        C7024.RunnableC1140 runnableC1140M12855;
        C5499.m17103(runnableC1140, C6411.f16272);
        synchronized (this) {
            try {
                this.f9154.add(runnableC1140);
                if (!runnableC1140.m3321().m21827() && (runnableC1140M12855 = m12855(runnableC1140.m21843())) != null) {
                    runnableC1140.m21845(runnableC1140M12855);
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        m12862();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final synchronized void m12853(@InterfaceC6399 C7024 c7024) {
        C5499.m17103(c7024, C6411.f16272);
        this.f9156.add(c7024);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "executorService")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final synchronized ExecutorService m12854() {
        ExecutorService executorService;
        try {
            if (this.f9153 == null) {
                this.f9153 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C8158.m26880(C8158.f24183 + " Dispatcher", false));
            }
            executorService = this.f9153;
            C5499.m17100(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C7024.RunnableC1140 m12855(String str) {
        for (C7024.RunnableC1140 runnableC1140 : this.f9155) {
            if (C5499.m17094(runnableC1140.m21843(), str)) {
                return runnableC1140;
            }
        }
        for (C7024.RunnableC1140 runnableC11402 : this.f9154) {
            if (C5499.m17094(runnableC11402.m21843(), str)) {
                return runnableC11402;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <T> void m12856(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f9152;
            C8107 c8107 = C8107.f3222;
        }
        if (m12862() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m12857(@InterfaceC6399 C7024.RunnableC1140 runnableC1140) {
        C5499.m17103(runnableC1140, C6411.f16272);
        runnableC1140.m21842().decrementAndGet();
        m12856(this.f9155, runnableC1140);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m12858(@InterfaceC6399 C7024 c7024) {
        C5499.m17103(c7024, C6411.f16272);
        m12856(this.f9156, c7024);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final synchronized Runnable m12859() {
        return this.f9152;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final synchronized int m12860() {
        return this.f883;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final synchronized int m12861() {
        return this.f884;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m12862() {
        int i;
        boolean z;
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C7024.RunnableC1140> it = this.f9154.iterator();
                C5499.m17102(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C7024.RunnableC1140 next = it.next();
                    if (this.f9155.size() >= this.f883) {
                        break;
                    }
                    if (next.m21842().get() < this.f884) {
                        it.remove();
                        next.m21842().incrementAndGet();
                        C5499.m17102(next, "asyncCall");
                        arrayList.add(next);
                        this.f9155.add(next);
                    }
                }
                z = m12866() > 0;
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C7024.RunnableC1140) arrayList.get(i)).m3320(m12854());
        }
        return z;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final synchronized List<InterfaceC3645> m12863() {
        List<InterfaceC3645> listUnmodifiableList;
        try {
            ArrayDeque<C7024.RunnableC1140> arrayDeque = this.f9154;
            ArrayList arrayList = new ArrayList(C3881.m10756(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7024.RunnableC1140) it.next()).m3321());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            C5499.m17102(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized int m12864() {
        return this.f9154.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final synchronized List<InterfaceC3645> m12865() {
        List<InterfaceC3645> listUnmodifiableList;
        try {
            ArrayDeque<C7024> arrayDeque = this.f9156;
            ArrayDeque<C7024.RunnableC1140> arrayDeque2 = this.f9155;
            ArrayList arrayList = new ArrayList(C3881.m10756(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7024.RunnableC1140) it.next()).m3321());
            }
            listUnmodifiableList = Collections.unmodifiableList(C3888.m10993(arrayDeque, arrayList));
            C5499.m17102(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final synchronized int m12866() {
        return this.f9155.size() + this.f9156.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final synchronized void m12867(@InterfaceC6489 Runnable runnable) {
        this.f9152 = runnable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m12868(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.f883 = i;
            C8107 c8107 = C8107.f3222;
        }
        m12862();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m12869(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.f884 = i;
            C8107 c8107 = C8107.f3222;
        }
        m12862();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4421(@InterfaceC6399 ExecutorService executorService) {
        this();
        C5499.m17103(executorService, "executorService");
        this.f9153 = executorService;
    }
}
