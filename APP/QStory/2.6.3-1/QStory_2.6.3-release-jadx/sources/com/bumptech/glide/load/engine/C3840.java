package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C0984;
import androidx.compose.animation.core.C1171;
import com.bumptech.glide.C3901;
import com.bumptech.glide.C3902;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3880;
import io.ktor.client.plugins.api.C4718;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p025.AbstractC7012;
import p209.C8657;
import p238.AbstractC8815;
import p238.C8812;
import p238.C8819;
import p238.ExecutorC8809;
import p245.ExecutorServiceC8872;
import p246.C8877;
import p246.C8878;
import p302.C9226;
import p302.InterfaceC9222;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3840 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f9888 = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0984 f9889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0911 f9890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3837 f9891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8877 f9892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4718 f9893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3902 f9894;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1171 f9895;

    public C3840(C8877 c8877, C8878 c8878, ExecutorServiceC8872 executorServiceC8872, ExecutorServiceC8872 executorServiceC88722, ExecutorServiceC8872 executorServiceC88723, ExecutorServiceC8872 executorServiceC88724) throws Throwable {
        this.f9892 = c8877;
        C3836 c3836 = new C3836(c8878);
        C1171 c1171 = new C1171(5);
        this.f9895 = c1171;
        synchronized (this) {
            try {
                try {
                    synchronized (c1171) {
                        try {
                            c1171.f1438 = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.f9893 = new C4718(15);
                    this.f9894 = new C3902(1);
                    this.f9891 = new C3837(executorServiceC8872, executorServiceC88722, executorServiceC88723, executorServiceC88724, this, this);
                    this.f9889 = new C0984(c3836);
                    this.f9890 = new C0911(1);
                    c8877.f22562 = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m7056(InterfaceC3821 interfaceC3821) {
        if (interfaceC3821 instanceof C3834) {
            ((C3834) interfaceC3821).m7044();
        } else {
            C6755.m11869("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7057(String str, long j, C3830 c3830) {
        StringBuilder sbM12143 = AbstractC7012.m12143(str, " in ");
        sbM12143.append(AbstractC8815.m14026(j));
        sbM12143.append("ms, key: ");
        sbM12143.append(c3830);
        Log.v("Engine", sbM12143.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7058(InterfaceC9222 interfaceC9222, C3834 c3834) {
        C1171 c1171 = this.f9895;
        synchronized (c1171) {
            C3828 c3828 = (C3828) ((HashMap) c1171.f1441).remove(interfaceC9222);
            if (c3828 != null) {
                c3828.f9829 = null;
                c3828.clear();
            }
        }
        if (c3834.f9873) {
        } else {
            this.f9890.m756(c3834, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m7059(C3831 c3831, C3830 c3830, C3834 c3834) {
        if (c3834 != null) {
            try {
                if (c3834.f9873) {
                    this.f9895.m1533(c3830, c3834);
                }
            } finally {
            }
        }
        C3902 c3902 = this.f9894;
        c3902.getClass();
        c3831.getClass();
        HashMap map = c3902.f10171;
        if (c3831 == map.get(c3830)) {
            map.remove(c3830);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3834 m7060(C3830 c3830, boolean z, long j) {
        C3834 c3834;
        Object obj;
        C3840 c3840;
        C3830 c38302;
        C3834 c38342;
        if (z) {
            C1171 c1171 = this.f9895;
            synchronized (c1171) {
                C3828 c3828 = (C3828) ((HashMap) c1171.f1441).get(c3830);
                if (c3828 == null) {
                    c3834 = null;
                } else {
                    c3834 = (C3834) c3828.get();
                    if (c3834 == null) {
                        c1171.m1529(c3828);
                    }
                }
            }
            if (c3834 != null) {
                c3834.m7045();
            }
            if (c3834 != null) {
                if (f9888) {
                    m7057("Loaded resource from active resources", j, c3830);
                }
                return c3834;
            }
            C8877 c8877 = this.f9892;
            synchronized (c8877) {
                C8819 c8819 = (C8819) ((LinkedHashMap) c8877.f9621).remove(c3830);
                if (c8819 == null) {
                    obj = null;
                } else {
                    c8877.f9622 -= (long) c8819.f22417;
                    obj = c8819.f22418;
                }
            }
            InterfaceC3821 interfaceC3821 = (InterfaceC3821) obj;
            if (interfaceC3821 == null) {
                c3840 = this;
                c38302 = c3830;
                c38342 = null;
            } else if (interfaceC3821 instanceof C3834) {
                c38342 = (C3834) interfaceC3821;
                c3840 = this;
                c38302 = c3830;
            } else {
                c3840 = this;
                c38302 = c3830;
                c38342 = new C3834(interfaceC3821, true, true, c38302, c3840);
            }
            if (c38342 != null) {
                c38342.m7045();
                c3840.f9895.m1533(c38302, c38342);
            }
            if (c38342 != null) {
                if (f9888) {
                    m7057("Loaded resource from cache", j, c38302);
                }
                return c38342;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0955 m7061(C3901 c3901, Object obj, InterfaceC9222 interfaceC9222, int i, int i2, Class cls, Class cls2, Priority priority, C3845 c3845, C8812 c8812, boolean z, boolean z2, C9226 c9226, boolean z3, boolean z4, C3880 c3880, ExecutorC8809 executorC8809) {
        long jElapsedRealtimeNanos;
        if (f9888) {
            int i3 = AbstractC8815.f22409;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f9893.getClass();
        C3830 c3830 = new C3830(obj, interfaceC9222, i, i2, c8812, cls, cls2, c9226);
        synchronized (this) {
            try {
                C3834 c3834M7060 = m7060(c3830, z3, jElapsedRealtimeNanos);
                if (c3834M7060 == null) {
                    return m7062(c3901, obj, interfaceC9222, i, i2, cls, cls2, priority, c3845, c8812, z, z2, c9226, z3, z4, c3880, executorC8809, c3830, jElapsedRealtimeNanos);
                }
                c3880.m7161(c3834M7060, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0955 m7062(C3901 c3901, Object obj, InterfaceC9222 interfaceC9222, int i, int i2, Class cls, Class cls2, Priority priority, C3845 c3845, Map map, boolean z, boolean z2, C9226 c9226, boolean z3, boolean z4, C3880 c3880, Executor executor, C3830 c3830, long j) {
        C3831 c3831 = (C3831) this.f9894.f10171.get(c3830);
        if (c3831 != null) {
            c3831.m7041(c3880, executor);
            if (f9888) {
                m7057("Added to existing load", j, c3830);
            }
            return new C0955(this, c3880, c3831);
        }
        C3831 c38312 = (C3831) ((C8657) this.f9891.f9881).acquire();
        synchronized (c38312) {
            c38312.f9847 = c3830;
            c38312.f9846 = z3;
            c38312.f9845 = z4;
        }
        C0984 c0984 = this.f9889;
        RunnableC3847 runnableC3847 = (RunnableC3847) ((C8657) c0984.f939).acquire();
        int i3 = c0984.f941;
        c0984.f941 = i3 + 1;
        C3843 c3843 = runnableC3847.f9965;
        C3836 c3836 = runnableC3847.f9958;
        c3843.f9905 = c3901;
        c3843.f9904 = obj;
        c3843.f9908 = interfaceC9222;
        c3843.f9903 = i;
        c3843.f9902 = i2;
        c3843.f9913 = c3845;
        c3843.f9915 = cls;
        c3843.f9914 = c3836;
        c3843.f9916 = cls2;
        c3843.f9912 = priority;
        c3843.f9918 = c9226;
        c3843.f9919 = map;
        c3843.f9910 = z;
        c3843.f9911 = z2;
        runnableC3847.f9959 = c3901;
        runnableC3847.f9960 = interfaceC9222;
        runnableC3847.f9950 = priority;
        runnableC3847.f9949 = c3830;
        runnableC3847.f9948 = i;
        runnableC3847.f9947 = i2;
        runnableC3847.f9946 = c3845;
        runnableC3847.f9945 = c9226;
        runnableC3847.f9956 = c38312;
        runnableC3847.f9955 = i3;
        runnableC3847.f9953 = DecodeJob$RunReason.INITIALIZE;
        runnableC3847.f9951 = obj;
        runnableC3847.f9942 = c3901.f10167;
        runnableC3847.f9941 = (Supplier) c9226.m14523(RunnableC3847.f9932);
        C3902 c3902 = this.f9894;
        c3902.getClass();
        c3902.f10171.put(c3830, c38312);
        c38312.m7041(c3880, executor);
        synchronized (c38312) {
            c38312.f9850 = runnableC3847;
            DecodeJob$Stage decodeJob$StageM7083 = runnableC3847.m7083(DecodeJob$Stage.INITIALIZE);
            ((decodeJob$StageM7083 == DecodeJob$Stage.RESOURCE_CACHE || decodeJob$StageM7083 == DecodeJob$Stage.DATA_CACHE) ? c38312.f9860 : c38312.f9845 ? c38312.f9858 : c38312.f9857).execute(runnableC3847);
        }
        if (f9888) {
            m7057("Started new load", j, c3830);
        }
        return new C0955(this, c3880, c38312);
    }
}
