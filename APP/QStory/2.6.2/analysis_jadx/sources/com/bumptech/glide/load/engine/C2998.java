package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.C3069;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3047;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p193.C7827;
import p218.C7969;
import p218.InterfaceC7971;
import p222.AbstractC7988;
import p229.ExecutorServiceC8042;
import p305.C8631;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2998 implements InterfaceC7971 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C8631 f9495 = new C8631(14);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public DataSource f9496;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC2988 f9497;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f9498;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f9499;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2997 f9500;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile boolean f9502;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public RunnableC3014 f9503;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C3001 f9504;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f9505;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public GlideException f9506;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f9507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2186 f9509;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ExecutorServiceC8042 f9510;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ExecutorServiceC8042 f9511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3007 f9512;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ExecutorServiceC8042 f9513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3007 f9515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3006 f9516 = new C3006(new ArrayList(2));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7969 f9514 = new C7969();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f9501 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8631 f9508 = f9495;

    public C2998(ExecutorServiceC8042 executorServiceC8042, ExecutorServiceC8042 executorServiceC80422, ExecutorServiceC8042 executorServiceC80423, ExecutorServiceC8042 executorServiceC80424, C3007 c3007, C3007 c30072, C7827 c7827) {
        this.f9513 = executorServiceC8042;
        this.f9510 = executorServiceC80422;
        this.f9511 = executorServiceC80424;
        this.f9512 = c3007;
        this.f9515 = c30072;
        this.f9509 = c7827;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m6419() {
        boolean zM6451;
        if (this.f9500 == null) {
            throw new IllegalArgumentException();
        }
        this.f9516.f9540.clear();
        this.f9500 = null;
        this.f9504 = null;
        this.f9497 = null;
        this.f9505 = false;
        this.f9502 = false;
        this.f9507 = false;
        RunnableC3014 runnableC3014 = this.f9503;
        C3013 c3013 = runnableC3014.f9615;
        synchronized (c3013) {
            c3013.f9584 = true;
            zM6451 = c3013.m6451();
        }
        if (zM6451) {
            runnableC3014.m6455();
        }
        this.f9503 = null;
        this.f9506 = null;
        this.f9496 = null;
        this.f9509.mo3979(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m6420() {
        return this.f9505 || this.f9507 || this.f9502;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6421(int i) {
        C3001 c3001;
        AbstractC7988.m13443("Not yet complete!", m6420());
        if (this.f9501.getAndAdd(i) == 0 && (c3001 = this.f9504) != null) {
            c3001.m6427();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6422() {
        C3001 c3001;
        synchronized (this) {
            try {
                this.f9514.m13432();
                AbstractC7988.m13443("Not yet complete!", m6420());
                int iDecrementAndGet = this.f9501.decrementAndGet();
                AbstractC7988.m13443("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3001 = this.f9504;
                    m6419();
                } else {
                    c3001 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3001 != null) {
            c3001.m6426();
        }
    }

    @Override // p218.InterfaceC7971
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7969 mo6415() {
        return this.f9514;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m6423(C3047 c3047, Executor executor) {
        try {
            this.f9514.m13432();
            this.f9516.f9540.add(new C3005(c3047, executor));
            int i = 1;
            if (this.f9507) {
                m6421(1);
                executor.execute(new RunnableC3008(this, c3047, i));
            } else if (this.f9505) {
                m6421(1);
                executor.execute(new RunnableC3008(this, c3047, 0));
            } else {
                AbstractC7988.m13443("Cannot add callbacks to a cancelled EngineJob", !this.f9502);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m6424(C3047 c3047) {
        try {
            this.f9514.m13432();
            this.f9516.f9540.remove(new C3005(c3047, AbstractC7988.f22070));
            if (this.f9516.f9540.isEmpty()) {
                if (!m6420()) {
                    this.f9502 = true;
                    RunnableC3014 runnableC3014 = this.f9503;
                    runnableC3014.f9586 = true;
                    InterfaceC2991 interfaceC2991 = runnableC3014.f9591;
                    if (interfaceC2991 != null) {
                        interfaceC2991.cancel();
                    }
                    C3007 c3007 = this.f9512;
                    C2997 c2997 = this.f9500;
                    synchronized (c3007) {
                        C3069 c3069 = c3007.f9547;
                        c3069.getClass();
                        HashMap map = c3069.f9821;
                        if (this == map.get(c2997)) {
                            map.remove(c2997);
                        }
                    }
                }
                if (this.f9507 || this.f9505) {
                    if (this.f9501.get() == 0) {
                        m6419();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
