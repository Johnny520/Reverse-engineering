package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.compose.animation.core.C0325;
import com.bumptech.glide.C3069;
import com.bumptech.glide.C3070;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3048;
import io.ktor.client.plugins.api.C3886;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p009.AbstractC6183;
import p193.C7828;
import p222.AbstractC7986;
import p222.C7983;
import p222.C7990;
import p222.ExecutorC7980;
import p229.ExecutorServiceC8043;
import p230.C8048;
import p230.C8049;
import p286.C8397;
import p286.InterfaceC8393;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3008 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f9543 = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0137 f9544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0064 f9545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3005 f9546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8048 f9547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3886 f9548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3070 f9549;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0325 f9550;

    public C3008(C8048 c8048, C8049 c8049, ExecutorServiceC8043 executorServiceC8043, ExecutorServiceC8043 executorServiceC80432, ExecutorServiceC8043 executorServiceC80433, ExecutorServiceC8043 executorServiceC80434) throws Throwable {
        this.f9547 = c8048;
        C3004 c3004 = new C3004(c8049);
        C0325 c0325 = new C0325(5);
        this.f9550 = c0325;
        synchronized (this) {
            try {
                try {
                    synchronized (c0325) {
                        try {
                            c0325.f1093 = this;
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
                    this.f9548 = new C3886(15);
                    this.f9549 = new C3070(1);
                    this.f9546 = new C3005(executorServiceC8043, executorServiceC80432, executorServiceC80433, executorServiceC80434, this, this);
                    this.f9544 = new C0137(c3004);
                    this.f9545 = new C0064(1);
                    c8048.f22217 = this;
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
    public static void m6496(InterfaceC2989 interfaceC2989) {
        if (interfaceC2989 instanceof C3002) {
            ((C3002) interfaceC2989).m6484();
        } else {
            C5925.m11310("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m6497(String str, long j, C2998 c2998) {
        StringBuilder sbM11584 = AbstractC6183.m11584(str, " in ");
        sbM11584.append(AbstractC7986.m13467(j));
        sbM11584.append("ms, key: ");
        sbM11584.append(c2998);
        Log.v("Engine", sbM11584.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6498(InterfaceC8393 interfaceC8393, C3002 c3002) {
        C0325 c0325 = this.f9550;
        synchronized (c0325) {
            C2996 c2996 = (C2996) ((HashMap) c0325.f1096).remove(interfaceC8393);
            if (c2996 != null) {
                c2996.f9484 = null;
                c2996.clear();
            }
        }
        if (c3002.f9528) {
        } else {
            this.f9545.m196(c3002, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6499(C2999 c2999, C2998 c2998, C3002 c3002) {
        if (c3002 != null) {
            try {
                if (c3002.f9528) {
                    this.f9550.m973(c2998, c3002);
                }
            } finally {
            }
        }
        C3070 c3070 = this.f9549;
        c3070.getClass();
        c2999.getClass();
        HashMap map = c3070.f9826;
        if (c2999 == map.get(c2998)) {
            map.remove(c2998);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3002 m6500(C2998 c2998, boolean z, long j) {
        C3002 c3002;
        Object obj;
        C3008 c3008;
        C2998 c29982;
        C3002 c30022;
        if (z) {
            C0325 c0325 = this.f9550;
            synchronized (c0325) {
                C2996 c2996 = (C2996) ((HashMap) c0325.f1096).get(c2998);
                if (c2996 == null) {
                    c3002 = null;
                } else {
                    c3002 = (C3002) c2996.get();
                    if (c3002 == null) {
                        c0325.m969(c2996);
                    }
                }
            }
            if (c3002 != null) {
                c3002.m6485();
            }
            if (c3002 != null) {
                if (f9543) {
                    m6497("Loaded resource from active resources", j, c2998);
                }
                return c3002;
            }
            C8048 c8048 = this.f9547;
            synchronized (c8048) {
                C7990 c7990 = (C7990) ((LinkedHashMap) c8048.f9276).remove(c2998);
                if (c7990 == null) {
                    obj = null;
                } else {
                    c8048.f9277 -= (long) c7990.f22072;
                    obj = c7990.f22073;
                }
            }
            InterfaceC2989 interfaceC2989 = (InterfaceC2989) obj;
            if (interfaceC2989 == null) {
                c3008 = this;
                c29982 = c2998;
                c30022 = null;
            } else if (interfaceC2989 instanceof C3002) {
                c30022 = (C3002) interfaceC2989;
                c3008 = this;
                c29982 = c2998;
            } else {
                c3008 = this;
                c29982 = c2998;
                c30022 = new C3002(interfaceC2989, true, true, c29982, c3008);
            }
            if (c30022 != null) {
                c30022.m6485();
                c3008.f9550.m973(c29982, c30022);
            }
            if (c30022 != null) {
                if (f9543) {
                    m6497("Loaded resource from cache", j, c29982);
                }
                return c30022;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0108 m6501(C3069 c3069, Object obj, InterfaceC8393 interfaceC8393, int i, int i2, Class cls, Class cls2, Priority priority, C3013 c3013, C7983 c7983, boolean z, boolean z2, C8397 c8397, boolean z3, boolean z4, C3048 c3048, ExecutorC7980 executorC7980) {
        long jElapsedRealtimeNanos;
        if (f9543) {
            int i3 = AbstractC7986.f22064;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f9548.getClass();
        C2998 c2998 = new C2998(obj, interfaceC8393, i, i2, c7983, cls, cls2, c8397);
        synchronized (this) {
            try {
                C3002 c3002M6500 = m6500(c2998, z3, jElapsedRealtimeNanos);
                if (c3002M6500 == null) {
                    return m6502(c3069, obj, interfaceC8393, i, i2, cls, cls2, priority, c3013, c7983, z, z2, c8397, z3, z4, c3048, executorC7980, c2998, jElapsedRealtimeNanos);
                }
                c3048.m6601(c3002M6500, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0108 m6502(C3069 c3069, Object obj, InterfaceC8393 interfaceC8393, int i, int i2, Class cls, Class cls2, Priority priority, C3013 c3013, Map map, boolean z, boolean z2, C8397 c8397, boolean z3, boolean z4, C3048 c3048, Executor executor, C2998 c2998, long j) {
        C2999 c2999 = (C2999) this.f9549.f9826.get(c2998);
        if (c2999 != null) {
            c2999.m6481(c3048, executor);
            if (f9543) {
                m6497("Added to existing load", j, c2998);
            }
            return new C0108(this, c3048, c2999);
        }
        C2999 c29992 = (C2999) ((C7828) this.f9546.f9536).acquire();
        synchronized (c29992) {
            c29992.f9502 = c2998;
            c29992.f9501 = z3;
            c29992.f9500 = z4;
        }
        C0137 c0137 = this.f9544;
        RunnableC3015 runnableC3015 = (RunnableC3015) ((C7828) c0137.f594).acquire();
        int i3 = c0137.f596;
        c0137.f596 = i3 + 1;
        C3011 c3011 = runnableC3015.f9620;
        C3004 c3004 = runnableC3015.f9613;
        c3011.f9560 = c3069;
        c3011.f9559 = obj;
        c3011.f9563 = interfaceC8393;
        c3011.f9558 = i;
        c3011.f9557 = i2;
        c3011.f9568 = c3013;
        c3011.f9570 = cls;
        c3011.f9569 = c3004;
        c3011.f9571 = cls2;
        c3011.f9567 = priority;
        c3011.f9573 = c8397;
        c3011.f9574 = map;
        c3011.f9565 = z;
        c3011.f9566 = z2;
        runnableC3015.f9614 = c3069;
        runnableC3015.f9615 = interfaceC8393;
        runnableC3015.f9605 = priority;
        runnableC3015.f9604 = c2998;
        runnableC3015.f9603 = i;
        runnableC3015.f9602 = i2;
        runnableC3015.f9601 = c3013;
        runnableC3015.f9600 = c8397;
        runnableC3015.f9611 = c29992;
        runnableC3015.f9610 = i3;
        runnableC3015.f9608 = DecodeJob$RunReason.INITIALIZE;
        runnableC3015.f9606 = obj;
        runnableC3015.f9597 = c3069.f9822;
        runnableC3015.f9596 = (Supplier) c8397.m13964(RunnableC3015.f9587);
        C3070 c3070 = this.f9549;
        c3070.getClass();
        c3070.f9826.put(c2998, c29992);
        c29992.m6481(c3048, executor);
        synchronized (c29992) {
            c29992.f9505 = runnableC3015;
            DecodeJob$Stage decodeJob$StageM6523 = runnableC3015.m6523(DecodeJob$Stage.INITIALIZE);
            ((decodeJob$StageM6523 == DecodeJob$Stage.RESOURCE_CACHE || decodeJob$StageM6523 == DecodeJob$Stage.DATA_CACHE) ? c29992.f9515 : c29992.f9500 ? c29992.f9513 : c29992.f9512).execute(runnableC3015);
        }
        if (f9543) {
            m6497("Started new load", j, c2998);
        }
        return new C0108(this, c3048, c29992);
    }
}
