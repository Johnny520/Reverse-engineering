package Yue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
public final class C6667 {

    /* JADX INFO: renamed from: ۥ */
    public final long f2224;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C3600 f2225 = new C3600();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f17123;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f17124;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f17125;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC7472 f17126;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f17127;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final Condition f17128;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7472 f17129;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7506 f17130;

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۡ$ۥ */
    @InterfaceC7507({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
    public static final class C1052 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C7827 f17131 = new C7827();

        public C1052() {
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockM21302 = C6667.this.m21302();
            C6667 c6667 = C6667.this;
            reentrantLockM21302.lock();
            try {
                if (c6667.m21304()) {
                    reentrantLockM21302.unlock();
                    return;
                }
                InterfaceC7472 interfaceC7472M21301 = c6667.m21301();
                if (interfaceC7472M21301 == null) {
                    if (c6667.m21305() && c6667.m21298().m9684() > 0) {
                        throw new IOException("source is closed");
                    }
                    c6667.m21308(true);
                    c6667.m21300().signalAll();
                    interfaceC7472M21301 = null;
                }
                C8107 c8107 = C8107.f3222;
                reentrantLockM21302.unlock();
                if (interfaceC7472M21301 != null) {
                    C6667 c66672 = C6667.this;
                    C7827 c7827Mo516 = interfaceC7472M21301.mo516();
                    C7827 c7827Mo5162 = c66672.m21310().mo516();
                    long jMo15623 = c7827Mo516.mo15623();
                    long jM3922 = C7827.f23433.m3922(c7827Mo5162.mo15623(), c7827Mo516.mo15623());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    c7827Mo516.mo15622(jM3922, timeUnit);
                    if (!c7827Mo516.mo15620()) {
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(c7827Mo5162.mo15618());
                        }
                        try {
                            interfaceC7472M21301.close();
                            c7827Mo516.mo15622(jMo15623, timeUnit);
                            if (c7827Mo5162.mo15620()) {
                                c7827Mo516.mo1893();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                            if (c7827Mo5162.mo15620()) {
                                c7827Mo516.mo1893();
                            }
                            throw th;
                        }
                    }
                    long jMo15618 = c7827Mo516.mo15618();
                    if (c7827Mo5162.mo15620()) {
                        c7827Mo516.mo15619(Math.min(c7827Mo516.mo15618(), c7827Mo5162.mo15618()));
                    }
                    try {
                        interfaceC7472M21301.close();
                        c7827Mo516.mo15622(jMo15623, timeUnit);
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(jMo15618);
                        }
                    } catch (Throwable th2) {
                        c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(jMo15618);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                reentrantLockM21302.unlock();
                throw th3;
            }
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public void flush() {
            ReentrantLock reentrantLockM21302 = C6667.this.m21302();
            C6667 c6667 = C6667.this;
            reentrantLockM21302.lock();
            try {
                if (!(!c6667.m21304())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (c6667.m21299()) {
                    throw new IOException("canceled");
                }
                InterfaceC7472 interfaceC7472M21301 = c6667.m21301();
                if (interfaceC7472M21301 == null) {
                    if (c6667.m21305() && c6667.m21298().m9684() > 0) {
                        throw new IOException("source is closed");
                    }
                    interfaceC7472M21301 = null;
                }
                C8107 c8107 = C8107.f3222;
                reentrantLockM21302.unlock();
                if (interfaceC7472M21301 != null) {
                    C6667 c66672 = C6667.this;
                    C7827 c7827Mo516 = interfaceC7472M21301.mo516();
                    C7827 c7827Mo5162 = c66672.m21310().mo516();
                    long jMo15623 = c7827Mo516.mo15623();
                    long jM3922 = C7827.f23433.m3922(c7827Mo5162.mo15623(), c7827Mo516.mo15623());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    c7827Mo516.mo15622(jM3922, timeUnit);
                    if (!c7827Mo516.mo15620()) {
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(c7827Mo5162.mo15618());
                        }
                        try {
                            interfaceC7472M21301.flush();
                            c7827Mo516.mo15622(jMo15623, timeUnit);
                            if (c7827Mo5162.mo15620()) {
                                c7827Mo516.mo1893();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                            if (c7827Mo5162.mo15620()) {
                                c7827Mo516.mo1893();
                            }
                            throw th;
                        }
                    }
                    long jMo15618 = c7827Mo516.mo15618();
                    if (c7827Mo5162.mo15620()) {
                        c7827Mo516.mo15619(Math.min(c7827Mo516.mo15618(), c7827Mo5162.mo15618()));
                    }
                    try {
                        interfaceC7472M21301.flush();
                        c7827Mo516.mo15622(jMo15623, timeUnit);
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(jMo15618);
                        }
                    } catch (Throwable th2) {
                        c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                        if (c7827Mo5162.mo15620()) {
                            c7827Mo516.mo15619(jMo15618);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                reentrantLockM21302.unlock();
                throw th3;
            }
        }

        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo516() {
            return this.f17131;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        
            r1 = Yue.C8107.f3222;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        
            if (r2 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        
            r0 = r12.f17132;
            r1 = r2.mo516();
            r0 = r0.m21310().mo516();
            r3 = r1.mo15623();
            r5 = Yue.C7827.f23433.m3922(r0.mo15623(), r1.mo15623());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.mo15622(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        
            if (r1.mo15620() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
        
            r5 = r1.mo15618();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        
            if (r0.mo15620() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        
            r1.mo15619(java.lang.Math.min(r1.mo15618(), r0.mo15618()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
        
            r2.mo9102(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
        
            r1.mo15622(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        
            if (r0.mo15620() == false) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
        
            r1.mo15619(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            r1.mo15622(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        
            if (r0.mo15620() != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
        
            r1.mo15619(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
        
            if (r0.mo15620() == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
        
            r1.mo15619(r0.mo15618());
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
        
            r2.mo9102(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
        
            r1.mo15622(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
        
            if (r0.mo15620() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        
            r1.mo1893();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
        
            r1.mo15622(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
        
            if (r0.mo15620() != false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
        
            r1.mo1893();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return;
         */
        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) {
            InterfaceC7472 interfaceC7472M21301;
            C5499.m17103(c3600, "source");
            ReentrantLock reentrantLockM21302 = C6667.this.m21302();
            C6667 c6667 = C6667.this;
            reentrantLockM21302.lock();
            try {
                if (!(!c6667.m21304())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (!c6667.m21299()) {
                    while (true) {
                        if (j <= 0) {
                            interfaceC7472M21301 = null;
                            break;
                        }
                        interfaceC7472M21301 = c6667.m21301();
                        if (interfaceC7472M21301 != null) {
                            break;
                        }
                        if (c6667.m21305()) {
                            throw new IOException("source is closed");
                        }
                        long jM21303 = c6667.m21303() - c6667.m21298().m9684();
                        if (jM21303 == 0) {
                            this.f17131.m3921(c6667.m21300());
                            if (c6667.m21299()) {
                                throw new IOException("canceled");
                            }
                        } else {
                            long jMin = Math.min(jM21303, j);
                            c6667.m21298().mo9102(c3600, jMin);
                            j -= jMin;
                            c6667.m21300().signalAll();
                        }
                    }
                } else {
                    throw new IOException("canceled");
                }
            } catch (Throwable th) {
                reentrantLockM21302.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۡ$ۥ۟ */
    @InterfaceC7507({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public static final class C1053 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C7827 f17133 = new C7827();

        public C1053() {
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockM21302 = C6667.this.m21302();
            C6667 c6667 = C6667.this;
            reentrantLockM21302.lock();
            try {
                c6667.m21309(true);
                c6667.m21300().signalAll();
                C8107 c8107 = C8107.f3222;
            } finally {
                reentrantLockM21302.unlock();
            }
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f17133;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) {
            C5499.m17103(c3600, "sink");
            ReentrantLock reentrantLockM21302 = C6667.this.m21302();
            C6667 c6667 = C6667.this;
            reentrantLockM21302.lock();
            try {
                if (!(!c6667.m21305())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (c6667.m21299()) {
                    throw new IOException("canceled");
                }
                while (c6667.m21298().m9684() == 0) {
                    if (c6667.m21304()) {
                        reentrantLockM21302.unlock();
                        return -1L;
                    }
                    this.f17133.m3921(c6667.m21300());
                    if (c6667.m21299()) {
                        throw new IOException("canceled");
                    }
                }
                long jMo9103 = c6667.m21298().mo9103(c3600, j);
                c6667.m21300().signalAll();
                reentrantLockM21302.unlock();
                return jMo9103;
            } catch (Throwable th) {
                reentrantLockM21302.unlock();
                throw th;
            }
        }
    }

    public C6667(long j) {
        this.f2224 = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f17127 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        C5499.m17102(conditionNewCondition, "newCondition(...)");
        this.f17128 = conditionNewCondition;
        if (j >= 1) {
            this.f17129 = new C1052();
            this.f17130 = new C1053();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
        }
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "sink", imports = {}))
    @InterfaceC5572(name = "-deprecated_sink")
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC7472 m3156() {
        return this.f17129;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "source", imports = {}))
    @InterfaceC5572(name = "-deprecated_source")
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC7506 m3157() {
        return this.f17130;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m21295() {
        ReentrantLock reentrantLock = this.f17127;
        reentrantLock.lock();
        try {
            this.f17123 = true;
            this.f2225.m9603();
            this.f17128.signalAll();
            C8107 c8107 = C8107.f3222;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m21296(@InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        C5499.m17103(interfaceC7472, "sink");
        while (true) {
            this.f17127.lock();
            try {
                if (this.f17126 != null) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.f17123) {
                    this.f17126 = interfaceC7472;
                    throw new IOException("canceled");
                }
                if (this.f2225.mo9622()) {
                    this.f17125 = true;
                    this.f17126 = interfaceC7472;
                    return;
                }
                boolean z = this.f17124;
                C3600 c3600 = new C3600();
                C3600 c36002 = this.f2225;
                c3600.mo9102(c36002, c36002.m9684());
                this.f17128.signalAll();
                C8107 c8107 = C8107.f3222;
                try {
                    interfaceC7472.mo9102(c3600, c3600.m9684());
                    if (z) {
                        interfaceC7472.close();
                    } else {
                        interfaceC7472.flush();
                    }
                } catch (Throwable th) {
                    this.f17127.lock();
                    try {
                        this.f17125 = true;
                        this.f17128.signalAll();
                        C8107 c81072 = C8107.f3222;
                        throw th;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21297(InterfaceC7472 interfaceC7472, InterfaceC5124<? super InterfaceC7472, C8107> interfaceC5124) {
        C7827 c7827Mo516 = interfaceC7472.mo516();
        C7827 c7827Mo5162 = m21310().mo516();
        long jMo15623 = c7827Mo516.mo15623();
        long jM3922 = C7827.f23433.m3922(c7827Mo5162.mo15623(), c7827Mo516.mo15623());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        c7827Mo516.mo15622(jM3922, timeUnit);
        if (!c7827Mo516.mo15620()) {
            if (c7827Mo5162.mo15620()) {
                c7827Mo516.mo15619(c7827Mo5162.mo15618());
            }
            try {
                interfaceC5124.invoke(interfaceC7472);
                C8107 c8107 = C8107.f3222;
                C5437.m16930(1);
                c7827Mo516.mo15622(jMo15623, timeUnit);
                if (c7827Mo5162.mo15620()) {
                    c7827Mo516.mo1893();
                }
                C5437.m16929(1);
                return;
            } catch (Throwable th) {
                C5437.m16930(1);
                c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                if (c7827Mo5162.mo15620()) {
                    c7827Mo516.mo1893();
                }
                C5437.m16929(1);
                throw th;
            }
        }
        long jMo15618 = c7827Mo516.mo15618();
        if (c7827Mo5162.mo15620()) {
            c7827Mo516.mo15619(Math.min(c7827Mo516.mo15618(), c7827Mo5162.mo15618()));
        }
        try {
            interfaceC5124.invoke(interfaceC7472);
            C8107 c81072 = C8107.f3222;
            C5437.m16930(1);
            c7827Mo516.mo15622(jMo15623, timeUnit);
            if (c7827Mo5162.mo15620()) {
                c7827Mo516.mo15619(jMo15618);
            }
            C5437.m16929(1);
        } catch (Throwable th2) {
            C5437.m16930(1);
            c7827Mo516.mo15622(jMo15623, TimeUnit.NANOSECONDS);
            if (c7827Mo5162.mo15620()) {
                c7827Mo516.mo15619(jMo15618);
            }
            C5437.m16929(1);
            throw th2;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C3600 m21298() {
        return this.f2225;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m21299() {
        return this.f17123;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Condition m21300() {
        return this.f17128;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC7472 m21301() {
        return this.f17126;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final ReentrantLock m21302() {
        return this.f17127;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final long m21303() {
        return this.f2224;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m21304() {
        return this.f17124;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m21305() {
        return this.f17125;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m21306(boolean z) {
        this.f17123 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m21307(@InterfaceC6489 InterfaceC7472 interfaceC7472) {
        this.f17126 = interfaceC7472;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m21308(boolean z) {
        this.f17124 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m21309(boolean z) {
        this.f17125 = z;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "sink")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final InterfaceC7472 m21310() {
        return this.f17129;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "source")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final InterfaceC7506 m21311() {
        return this.f17130;
    }
}
