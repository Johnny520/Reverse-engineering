package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class C7731 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7733 f3047;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final String f3048;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f23254;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public AbstractC7724 f23255;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<AbstractC7724> f23256;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f23257;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ */
    public static final class C1336 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final CountDownLatch f23258;

        public C1336() {
            super(C8158.f24183 + " awaitIdle", false);
            this.f23258 = new CountDownLatch(1);
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f23258.countDown();
            return -1L;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final CountDownLatch m24597() {
            return this.f23258;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ۟ */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class C1337 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f23259;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1337(String str, boolean z, InterfaceC5122<C8107> interfaceC5122) {
            super(str, z);
            this.f23259 = interfaceC5122;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f23259.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    public static final class C7732 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<Long> f23260;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7732(String str, InterfaceC5122<Long> interfaceC5122) {
            super(str, false, 2, null);
            this.f23260 = interfaceC5122;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            return this.f23260.invoke().longValue();
        }
    }

    public C7731(@InterfaceC6399 C7733 c7733, @InterfaceC6399 String str) {
        C5499.m17103(c7733, "taskRunner");
        C5499.m17103(str, "name");
        this.f3047 = c7733;
        this.f3048 = str;
        this.f23256 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m24578(C7731 c7731, String str, long j, boolean z, InterfaceC5122 interfaceC5122, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        C5499.m17103(str, "name");
        C5499.m17103(interfaceC5122, "block");
        c7731.m24590(new C1337(str, z, interfaceC5122), j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m24579(C7731 c7731, AbstractC7724 abstractC7724, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c7731.m24590(abstractC7724, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m24580(C7731 c7731, String str, long j, InterfaceC5122 interfaceC5122, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        C5499.m17103(str, "name");
        C5499.m17103(interfaceC5122, "block");
        c7731.m24590(new C7732(str, interfaceC5122), j);
    }

    @InterfaceC6399
    public String toString() {
        return this.f3048;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3825() {
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f3047) {
            try {
                if (m3826()) {
                    this.f3047.m24604(this);
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3826() {
        AbstractC7724 abstractC7724 = this.f23255;
        if (abstractC7724 != null) {
            C5499.m17100(abstractC7724);
            if (abstractC7724.m3819()) {
                this.f23257 = true;
            }
        }
        boolean z = false;
        for (int size = this.f23256.size() - 1; -1 < size; size--) {
            if (this.f23256.get(size).m3819()) {
                AbstractC7724 abstractC77242 = this.f23256.get(size);
                if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
                    C7730.m24575(abstractC77242, this, "canceled");
                }
                this.f23256.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24581(@InterfaceC6399 String str, long j, boolean z, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(str, "name");
        C5499.m17103(interfaceC5122, "block");
        m24590(new C1337(str, z, interfaceC5122), j);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC7724 m24582() {
        return this.f23255;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m24583() {
        return this.f23257;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<AbstractC7724> m24584() {
        return this.f23256;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m24585() {
        return this.f3048;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final List<AbstractC7724> m24586() {
        List<AbstractC7724> listM11062;
        synchronized (this.f3047) {
            listM11062 = C3888.m11062(this.f23256);
        }
        return listM11062;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m24587() {
        return this.f23254;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C7733 m24588() {
        return this.f3047;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final CountDownLatch m24589() {
        synchronized (this.f3047) {
            if (this.f23255 == null && this.f23256.isEmpty()) {
                return new CountDownLatch(0);
            }
            AbstractC7724 abstractC7724 = this.f23255;
            if (abstractC7724 instanceof C1336) {
                return ((C1336) abstractC7724).m24597();
            }
            for (AbstractC7724 abstractC77242 : this.f23256) {
                if (abstractC77242 instanceof C1336) {
                    return ((C1336) abstractC77242).m24597();
                }
            }
            C1336 c1336 = new C1336();
            if (m24592(c1336, 0L, false)) {
                this.f3047.m24604(this);
            }
            return c1336.m24597();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m24590(@InterfaceC6399 AbstractC7724 abstractC7724, long j) {
        C5499.m17103(abstractC7724, "task");
        synchronized (this.f3047) {
            if (!this.f23254) {
                if (m24592(abstractC7724, j, false)) {
                    this.f3047.m24604(this);
                }
                C8107 c8107 = C8107.f3222;
            } else if (abstractC7724.m3819()) {
                if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
                    C7730.m24575(abstractC7724, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
                    C7730.m24575(abstractC7724, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m24591(@InterfaceC6399 String str, long j, @InterfaceC6399 InterfaceC5122<Long> interfaceC5122) {
        C5499.m17103(str, "name");
        C5499.m17103(interfaceC5122, "block");
        m24590(new C7732(str, interfaceC5122), j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m24592(@InterfaceC6399 AbstractC7724 abstractC7724, long j, boolean z) {
        String str;
        C5499.m17103(abstractC7724, "task");
        abstractC7724.m24572(this);
        long jMo24607 = this.f3047.m24603().mo24607();
        long j2 = jMo24607 + j;
        int iIndexOf = this.f23256.indexOf(abstractC7724);
        if (iIndexOf != -1) {
            if (abstractC7724.m24570() <= j2) {
                if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
                    C7730.m24575(abstractC7724, this, "already scheduled");
                }
                return false;
            }
            this.f23256.remove(iIndexOf);
        }
        abstractC7724.m24573(j2);
        if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + C7730.m3824(j2 - jMo24607);
            } else {
                str = "scheduled after " + C7730.m3824(j2 - jMo24607);
            }
            C7730.m24575(abstractC7724, this, str);
        }
        Iterator<AbstractC7724> it = this.f23256.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().m24570() - jMo24607 > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f23256.size();
        }
        this.f23256.add(size, abstractC7724);
        return size == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m24593(@InterfaceC6489 AbstractC7724 abstractC7724) {
        this.f23255 = abstractC7724;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m24594(boolean z) {
        this.f23257 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m24595(boolean z) {
        this.f23254 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m24596() {
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f3047) {
            try {
                this.f23254 = true;
                if (m3826()) {
                    this.f3047.m24604(this);
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
