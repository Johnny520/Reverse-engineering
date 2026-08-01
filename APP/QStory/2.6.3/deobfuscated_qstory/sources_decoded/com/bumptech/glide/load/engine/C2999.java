package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.C3070;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3048;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p193.C7828;
import p218.C7970;
import p218.InterfaceC7972;
import p222.AbstractC7989;
import p229.ExecutorServiceC8043;
import p305.C8623;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2999 implements InterfaceC7972 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C8623 f9497 = new C8623(14);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public DataSource f9498;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC2989 f9499;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f9500;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f9501;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2998 f9502;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile boolean f9504;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public RunnableC3015 f9505;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C3002 f9506;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f9507;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public GlideException f9508;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f9509;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2186 f9511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ExecutorServiceC8043 f9512;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ExecutorServiceC8043 f9513;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3008 f9514;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ExecutorServiceC8043 f9515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3008 f9517;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3007 f9518 = new C3007(new ArrayList(2));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7970 f9516 = new C7970();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f9503 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8623 f9510 = f9497;

    public C2999(ExecutorServiceC8043 executorServiceC8043, ExecutorServiceC8043 executorServiceC80432, ExecutorServiceC8043 executorServiceC80433, ExecutorServiceC8043 executorServiceC80434, C3008 c3008, C3008 c30082, C7828 c7828) {
        this.f9515 = executorServiceC8043;
        this.f9512 = executorServiceC80432;
        this.f9513 = executorServiceC80434;
        this.f9514 = c3008;
        this.f9517 = c30082;
        this.f9511 = c7828;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m6477() {
        boolean zM6511;
        if (this.f9502 == null) {
            throw new IllegalArgumentException();
        }
        this.f9518.f9542.clear();
        this.f9502 = null;
        this.f9506 = null;
        this.f9499 = null;
        this.f9507 = false;
        this.f9504 = false;
        this.f9509 = false;
        RunnableC3015 runnableC3015 = this.f9505;
        C3014 c3014 = runnableC3015.f9617;
        synchronized (c3014) {
            c3014.f9586 = true;
            zM6511 = c3014.m6511();
        }
        if (zM6511) {
            runnableC3015.m6515();
        }
        this.f9505 = null;
        this.f9508 = null;
        this.f9498 = null;
        this.f9511.mo3989(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m6478() {
        return this.f9507 || this.f9509 || this.f9504;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6479(int i) {
        C3002 c3002;
        AbstractC7989.m13471("Not yet complete!", m6478());
        if (this.f9503.getAndAdd(i) == 0 && (c3002 = this.f9506) != null) {
            c3002.m6485();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6480() {
        C3002 c3002;
        synchronized (this) {
            try {
                this.f9516.m13460();
                AbstractC7989.m13471("Not yet complete!", m6478());
                int iDecrementAndGet = this.f9503.decrementAndGet();
                AbstractC7989.m13471("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3002 = this.f9506;
                    m6477();
                } else {
                    c3002 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3002 != null) {
            c3002.m6484();
        }
    }

    @Override // p218.InterfaceC7972
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7970 mo6473() {
        return this.f9516;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m6481(C3048 c3048, Executor executor) {
        try {
            this.f9516.m13460();
            this.f9518.f9542.add(new C3006(c3048, executor));
            int i = 1;
            if (this.f9509) {
                m6479(1);
                executor.execute(new RunnableC3009(this, c3048, i));
            } else if (this.f9507) {
                m6479(1);
                executor.execute(new RunnableC3009(this, c3048, 0));
            } else {
                AbstractC7989.m13471("Cannot add callbacks to a cancelled EngineJob", !this.f9504);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m6482(C3048 c3048) {
        try {
            this.f9516.m13460();
            this.f9518.f9542.remove(new C3006(c3048, AbstractC7989.f22067));
            if (this.f9518.f9542.isEmpty()) {
                if (!m6478()) {
                    this.f9504 = true;
                    RunnableC3015 runnableC3015 = this.f9505;
                    runnableC3015.f9588 = true;
                    InterfaceC2992 interfaceC2992 = runnableC3015.f9593;
                    if (interfaceC2992 != null) {
                        interfaceC2992.cancel();
                    }
                    C3008 c3008 = this.f9514;
                    C2998 c2998 = this.f9502;
                    synchronized (c3008) {
                        C3070 c3070 = c3008.f9549;
                        c3070.getClass();
                        HashMap map = c3070.f9826;
                        if (this == map.get(c2998)) {
                            map.remove(c2998);
                        }
                    }
                }
                if (this.f9509 || this.f9507) {
                    if (this.f9503.get() == 0) {
                        m6477();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
