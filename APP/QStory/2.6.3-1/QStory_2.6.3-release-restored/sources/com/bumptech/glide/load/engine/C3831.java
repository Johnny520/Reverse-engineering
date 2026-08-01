package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.C3902;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3880;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p209.C8657;
import p234.C8799;
import p234.InterfaceC8801;
import p238.AbstractC8818;
import p245.ExecutorServiceC8872;
import p321.C9452;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3831 implements InterfaceC8801 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C9452 f9842 = new C9452(14);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public DataSource f9843;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC3821 f9844;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f9845;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f9846;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C3830 f9847;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public volatile boolean f9849;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public RunnableC3847 f9850;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C3834 f9851;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f9852;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public GlideException f9853;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f9854;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC3019 f9856;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ExecutorServiceC8872 f9857;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ExecutorServiceC8872 f9858;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3840 f9859;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ExecutorServiceC8872 f9860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3840 f9862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3839 f9863 = new C3839(new ArrayList(2));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8799 f9861 = new C8799();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f9848 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C9452 f9855 = f9842;

    public C3831(ExecutorServiceC8872 executorServiceC8872, ExecutorServiceC8872 executorServiceC88722, ExecutorServiceC8872 executorServiceC88723, ExecutorServiceC8872 executorServiceC88724, C3840 c3840, C3840 c38402, C8657 c8657) {
        this.f9860 = executorServiceC8872;
        this.f9857 = executorServiceC88722;
        this.f9858 = executorServiceC88724;
        this.f9859 = c3840;
        this.f9862 = c38402;
        this.f9856 = c8657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized void m7037() {
        boolean zM7071;
        if (this.f9847 == null) {
            throw new IllegalArgumentException();
        }
        this.f9863.f9887.clear();
        this.f9847 = null;
        this.f9851 = null;
        this.f9844 = null;
        this.f9852 = false;
        this.f9849 = false;
        this.f9854 = false;
        RunnableC3847 runnableC3847 = this.f9850;
        C3846 c3846 = runnableC3847.f9962;
        synchronized (c3846) {
            c3846.f9931 = true;
            zM7071 = c3846.m7071();
        }
        if (zM7071) {
            runnableC3847.m7075();
        }
        this.f9850 = null;
        this.f9853 = null;
        this.f9843 = null;
        this.f9856.mo4549(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7038() {
        return this.f9852 || this.f9854 || this.f9849;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m7039(int i) {
        C3834 c3834;
        AbstractC8818.m14030("Not yet complete!", m7038());
        if (this.f9848.getAndAdd(i) == 0 && (c3834 = this.f9851) != null) {
            c3834.m7045();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7040() {
        C3834 c3834;
        synchronized (this) {
            try {
                this.f9861.m14019();
                AbstractC8818.m14030("Not yet complete!", m7038());
                int iDecrementAndGet = this.f9848.decrementAndGet();
                AbstractC8818.m14030("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3834 = this.f9851;
                    m7037();
                } else {
                    c3834 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3834 != null) {
            c3834.m7044();
        }
    }

    @Override // p234.InterfaceC8801
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8799 mo7033() {
        return this.f9861;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m7041(C3880 c3880, Executor executor) {
        try {
            this.f9861.m14019();
            this.f9863.f9887.add(new C3838(c3880, executor));
            int i = 1;
            if (this.f9854) {
                m7039(1);
                executor.execute(new RunnableC3841(this, c3880, i));
            } else if (this.f9852) {
                m7039(1);
                executor.execute(new RunnableC3841(this, c3880, 0));
            } else {
                AbstractC8818.m14030("Cannot add callbacks to a cancelled EngineJob", !this.f9849);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m7042(C3880 c3880) {
        try {
            this.f9861.m14019();
            this.f9863.f9887.remove(new C3838(c3880, AbstractC8818.f22412));
            if (this.f9863.f9887.isEmpty()) {
                if (!m7038()) {
                    this.f9849 = true;
                    RunnableC3847 runnableC3847 = this.f9850;
                    runnableC3847.f9933 = true;
                    InterfaceC3824 interfaceC3824 = runnableC3847.f9938;
                    if (interfaceC3824 != null) {
                        interfaceC3824.cancel();
                    }
                    C3840 c3840 = this.f9859;
                    C3830 c3830 = this.f9847;
                    synchronized (c3840) {
                        C3902 c3902 = c3840.f9894;
                        c3902.getClass();
                        HashMap map = c3902.f10171;
                        if (this == map.get(c3830)) {
                            map.remove(c3830);
                        }
                    }
                }
                if (this.f9854 || this.f9852) {
                    if (this.f9848.get() == 0) {
                        m7037();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
