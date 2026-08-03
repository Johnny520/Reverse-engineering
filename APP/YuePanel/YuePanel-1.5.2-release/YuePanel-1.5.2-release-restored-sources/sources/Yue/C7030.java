package Yue;

import Yue.C7024;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class C7030 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1144 f21217 = new C1144(null);

    /* JADX INFO: renamed from: ۥ */
    public final int f2635;

    /* JADX INFO: renamed from: ۥ۟ */
    public final long f2636;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7731 f21218;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C1145 f21219;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final ConcurrentLinkedQueue<C7026> f21220;

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ$ۥ */
    public static final class C1144 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦ۠ۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1144(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C7030 m3326(@InterfaceC6399 C4108 c4108) {
            C5499.m17103(c4108, "connectionPool");
            return c4108.m11697();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1144() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ$ۥ۟ */
    public static final class C1145 extends AbstractC7724 {
        public C1145(String str) {
            super(str, false, 2, null);
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            return C7030.this.m3325(System.nanoTime());
        }
    }

    public C7030(@InterfaceC6399 C7733 c7733, int i, long j, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(c7733, "taskRunner");
        C5499.m17103(timeUnit, "timeUnit");
        this.f2635 = i;
        this.f2636 = timeUnit.toNanos(j);
        this.f21218 = c7733.m24605();
        this.f21219 = new C1145(C8158.f24183 + " ConnectionPool");
        this.f21220 = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3324(@InterfaceC6399 C3175 c3175, @InterfaceC6399 C7024 c7024, @InterfaceC6489 List<C7184> list, boolean z) {
        C5499.m17103(c3175, "address");
        C5499.m17103(c7024, C6411.f16272);
        for (C7026 c7026 : this.f21220) {
            C5499.m17102(c7026, C5368.f13116);
            synchronized (c7026) {
                if (z) {
                    try {
                        if (c7026.m21866()) {
                            if (c7026.m21864(c3175, list)) {
                                c7024.m21816(c7026);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (c7026.m21864(c3175, list)) {
                }
                C8107 c8107 = C8107.f3222;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final long m3325(long j) {
        int i = 0;
        long j2 = Long.MIN_VALUE;
        C7026 c7026 = null;
        int i2 = 0;
        for (C7026 c70262 : this.f21220) {
            C5499.m17102(c70262, C5368.f13116);
            synchronized (c70262) {
                if (m21882(c70262, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long jM21860 = j - c70262.m21860();
                    if (jM21860 > j2) {
                        c7026 = c70262;
                        j2 = jM21860;
                    }
                    C8107 c8107 = C8107.f3222;
                }
            }
        }
        long j3 = this.f2636;
        if (j2 < j3 && i <= this.f2635) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        C5499.m17100(c7026);
        synchronized (c7026) {
            if (!c7026.m21858().isEmpty()) {
                return 0L;
            }
            if (c7026.m21860() + j2 != j) {
                return 0L;
            }
            c7026.m21873(true);
            this.f21220.remove(c7026);
            C8158.m26846(c7026.mo11696());
            if (this.f21220.isEmpty()) {
                this.f21218.m3825();
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m21878(@InterfaceC6399 C7026 c7026) {
        C5499.m17103(c7026, C5368.f13116);
        if (C8158.f24182 && !Thread.holdsLock(c7026)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7026);
        }
        if (!c7026.m21861() && this.f2635 != 0) {
            C7731.m24579(this.f21218, this.f21219, 0L, 2, null);
            return false;
        }
        c7026.m21873(true);
        this.f21220.remove(c7026);
        if (this.f21220.isEmpty()) {
            this.f21218.m3825();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m21879() {
        return this.f21220.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21880() {
        Socket socketMo11696;
        Iterator<C7026> it = this.f21220.iterator();
        C5499.m17102(it, "connections.iterator()");
        while (it.hasNext()) {
            C7026 next = it.next();
            C5499.m17102(next, C5368.f13116);
            synchronized (next) {
                if (next.m21858().isEmpty()) {
                    it.remove();
                    next.m21873(true);
                    socketMo11696 = next.mo11696();
                } else {
                    socketMo11696 = null;
                }
            }
            if (socketMo11696 != null) {
                C8158.m26846(socketMo11696);
            }
        }
        if (this.f21220.isEmpty()) {
            this.f21218.m3825();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m21881() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<C7026> concurrentLinkedQueue = this.f21220;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (C7026 c7026 : concurrentLinkedQueue) {
                C5499.m17102(c7026, "it");
                synchronized (c7026) {
                    zIsEmpty = c7026.m21858().isEmpty();
                }
                if (zIsEmpty && (i = i + 1) < 0) {
                    C3880.m10752();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m21882(C7026 c7026, long j) {
        if (C8158.f24182 && !Thread.holdsLock(c7026)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7026);
        }
        List<Reference<C7024>> listM21858 = c7026.m21858();
        int i = 0;
        while (i < listM21858.size()) {
            Reference<C7024> reference = listM21858.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C5499.m17101(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                C6668.f2226.m21321().mo6577("A connection to " + c7026.mo1066().m22504().m6514() + " was leaked. Did you forget to close a response body?", ((C7024.C1141) reference).m3322());
                listM21858.remove(i);
                c7026.m21873(true);
                if (listM21858.isEmpty()) {
                    c7026.m21872(j - this.f2636);
                    return 0;
                }
            }
        }
        return listM21858.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m21883(@InterfaceC6399 C7026 c7026) {
        C5499.m17103(c7026, C5368.f13116);
        if (!C8158.f24182 || Thread.holdsLock(c7026)) {
            this.f21220.add(c7026);
            C7731.m24579(this.f21218, this.f21219, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7026);
    }
}
