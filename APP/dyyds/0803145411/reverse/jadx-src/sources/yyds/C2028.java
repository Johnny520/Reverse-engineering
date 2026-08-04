package yyds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᲀᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2028 implements InterfaceC2054 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f10107;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final ExecutorServiceC1555 f10108;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f10109;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ExecutorServiceC1555 f10110;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2620 f10111;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C2061 f10112;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public InterfaceC2162 f10113;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public C0975 f10114;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f10115;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2620 f10116;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public volatile boolean f10117;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public RunnableC1650 f10118;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C1876 f10120;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final ExecutorServiceC1555 f10121;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f10122;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f10124;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC0942 f10125;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2262 f10123 = new C2262(new ArrayList(2));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1202 f10126 = new C1202();

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AtomicInteger f10119 = new AtomicInteger();

    public C2028(ExecutorServiceC1555 executorServiceC1555, ExecutorServiceC1555 executorServiceC15552, ExecutorServiceC1555 executorServiceC15553, ExecutorServiceC1555 executorServiceC15554, C2620 c2620, C2620 c26202, C0644 c0644) {
        this.f10108 = executorServiceC1555;
        this.f10110 = executorServiceC15552;
        this.f10121 = executorServiceC15554;
        this.f10116 = c2620;
        this.f10111 = c26202;
        this.f10125 = c0644;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m3904() {
        return this.f10122 || this.f10115 || this.f10117;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final synchronized void m3905(C0397 c0397, Executor executor) {
        try {
            this.f10126.m2395();
            this.f10123.f11163.add(new C0792(c0397, executor));
            int i = 1;
            if (this.f10115) {
                m3909(1);
                executor.execute(new RunnableC2588(this, c0397, i));
            } else if (this.f10122) {
                m3909(1);
                executor.execute(new RunnableC2588(this, c0397, 0));
            } else {
                AbstractC0319.m985("Cannot add callbacks to a cancelled EngineJob", !this.f10117);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3906() {
        C2061 c2061;
        synchronized (this) {
            try {
                this.f10126.m2395();
                AbstractC0319.m985("Not yet complete!", m3904());
                int iDecrementAndGet = this.f10119.decrementAndGet();
                AbstractC0319.m985("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c2061 = this.f10112;
                    m3908();
                } else {
                    c2061 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2061 != null) {
            c2061.m3919();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final synchronized void m3907(C0397 c0397) {
        try {
            this.f10126.m2395();
            this.f10123.f11163.remove(new C0792(c0397, AbstractC0319.f1692));
            if (this.f10123.f11163.isEmpty()) {
                if (!m3904()) {
                    this.f10117 = true;
                    RunnableC1650 runnableC1650 = this.f10118;
                    runnableC1650.f8425 = true;
                    InterfaceC2633 interfaceC2633 = runnableC1650.f8401;
                    if (interfaceC2633 != null) {
                        interfaceC2633.cancel();
                    }
                    C2620 c2620 = this.f10116;
                    C1876 c1876 = this.f10120;
                    synchronized (c2620) {
                        C2794 c2794 = c2620.f12887;
                        c2794.getClass();
                        HashMap map = c2794.f13658;
                        if (this == map.get(c1876)) {
                            map.remove(c1876);
                        }
                    }
                }
                if (this.f10115 || this.f10122) {
                    if (this.f10119.get() == 0) {
                        m3908();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // yyds.InterfaceC2054
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C1202 mo2540() {
        return this.f10126;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final synchronized void m3908() {
        boolean zM372;
        if (this.f10120 == null) {
            throw new IllegalArgumentException();
        }
        this.f10123.f11163.clear();
        this.f10120 = null;
        this.f10112 = null;
        this.f10113 = null;
        this.f10122 = false;
        this.f10117 = false;
        this.f10115 = false;
        RunnableC1650 runnableC1650 = this.f10118;
        C0047 c0047 = runnableC1650.f8406;
        synchronized (c0047) {
            c0047.f542 = true;
            zM372 = c0047.m372();
        }
        if (zM372) {
            runnableC1650.m3370();
        }
        this.f10118 = null;
        this.f10114 = null;
        this.f10124 = 0;
        this.f10125.mo1557(this);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final synchronized void m3909(int i) {
        C2061 c2061;
        AbstractC0319.m985("Not yet complete!", m3904());
        if (this.f10119.getAndAdd(i) == 0 && (c2061 = this.f10112) != null) {
            c2061.m3918();
        }
    }
}
