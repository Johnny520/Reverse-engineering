package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.compose.animation.core.C0325;
import com.bumptech.glide.C3068;
import com.bumptech.glide.C3069;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3047;
import io.ktor.client.plugins.api.C3885;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p007.AbstractC6136;
import p193.C7827;
import p222.AbstractC7985;
import p222.C7982;
import p222.C7989;
import p222.ExecutorC7979;
import p229.ExecutorServiceC8042;
import p230.C8047;
import p230.C8048;
import p286.C8396;
import p286.InterfaceC8392;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3007 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f9541 = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0137 f9542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0064 f9543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3004 f9544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8047 f9545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3885 f9546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3069 f9547;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0325 f9548;

    public C3007(C8047 c8047, C8048 c8048, ExecutorServiceC8042 executorServiceC8042, ExecutorServiceC8042 executorServiceC80422, ExecutorServiceC8042 executorServiceC80423, ExecutorServiceC8042 executorServiceC80424) throws Throwable {
        this.f9545 = c8047;
        C3003 c3003 = new C3003(c8048);
        C0325 c0325 = new C0325(5);
        this.f9548 = c0325;
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
                    this.f9546 = new C3885(15);
                    this.f9547 = new C3069(1);
                    this.f9544 = new C3004(executorServiceC8042, executorServiceC80422, executorServiceC80423, executorServiceC80424, this, this);
                    this.f9542 = new C0137(c3003);
                    this.f9543 = new C0064(1);
                    c8047.f22220 = this;
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
    public static void m6436(InterfaceC2988 interfaceC2988) {
        if (interfaceC2988 instanceof C3001) {
            ((C3001) interfaceC2988).m6426();
        } else {
            C5919.m11249("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m6437(String str, long j, C2997 c2997) {
        StringBuilder sbM11553 = AbstractC6136.m11553(str, " in ");
        sbM11553.append(AbstractC7985.m13439(j));
        sbM11553.append("ms, key: ");
        sbM11553.append(c2997);
        Log.v("Engine", sbM11553.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6438(InterfaceC8392 interfaceC8392, C3001 c3001) {
        C0325 c0325 = this.f9548;
        synchronized (c0325) {
            C2995 c2995 = (C2995) ((HashMap) c0325.f1096).remove(interfaceC8392);
            if (c2995 != null) {
                c2995.f9482 = null;
                c2995.clear();
            }
        }
        if (c3001.f9526) {
        } else {
            this.f9543.m195(c3001, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6439(C2998 c2998, C2997 c2997, C3001 c3001) {
        if (c3001 != null) {
            try {
                if (c3001.f9526) {
                    this.f9548.m982(c2997, c3001);
                }
            } finally {
            }
        }
        C3069 c3069 = this.f9547;
        c3069.getClass();
        c2998.getClass();
        HashMap map = c3069.f9821;
        if (c2998 == map.get(c2997)) {
            map.remove(c2997);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3001 m6440(C2997 c2997, boolean z, long j) {
        C3001 c3001;
        Object obj;
        C3007 c3007;
        C2997 c29972;
        C3001 c30012;
        if (z) {
            C0325 c0325 = this.f9548;
            synchronized (c0325) {
                C2995 c2995 = (C2995) ((HashMap) c0325.f1096).get(c2997);
                if (c2995 == null) {
                    c3001 = null;
                } else {
                    c3001 = (C3001) c2995.get();
                    if (c3001 == null) {
                        c0325.m969(c2995);
                    }
                }
            }
            if (c3001 != null) {
                c3001.m6427();
            }
            if (c3001 != null) {
                if (f9541) {
                    m6437("Loaded resource from active resources", j, c2997);
                }
                return c3001;
            }
            C8047 c8047 = this.f9545;
            synchronized (c8047) {
                C7989 c7989 = (C7989) ((LinkedHashMap) c8047.f9274).remove(c2997);
                if (c7989 == null) {
                    obj = null;
                } else {
                    c8047.f9275 -= (long) c7989.f22075;
                    obj = c7989.f22076;
                }
            }
            InterfaceC2988 interfaceC2988 = (InterfaceC2988) obj;
            if (interfaceC2988 == null) {
                c3007 = this;
                c29972 = c2997;
                c30012 = null;
            } else if (interfaceC2988 instanceof C3001) {
                c30012 = (C3001) interfaceC2988;
                c3007 = this;
                c29972 = c2997;
            } else {
                c3007 = this;
                c29972 = c2997;
                c30012 = new C3001(interfaceC2988, true, true, c29972, c3007);
            }
            if (c30012 != null) {
                c30012.m6427();
                c3007.f9548.m982(c29972, c30012);
            }
            if (c30012 != null) {
                if (f9541) {
                    m6437("Loaded resource from cache", j, c29972);
                }
                return c30012;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0108 m6441(C3068 c3068, Object obj, InterfaceC8392 interfaceC8392, int i, int i2, Class cls, Class cls2, Priority priority, C3012 c3012, C7982 c7982, boolean z, boolean z2, C8396 c8396, boolean z3, boolean z4, C3047 c3047, ExecutorC7979 executorC7979) {
        long jElapsedRealtimeNanos;
        if (f9541) {
            int i3 = AbstractC7985.f22067;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f9546.getClass();
        C2997 c2997 = new C2997(obj, interfaceC8392, i, i2, c7982, cls, cls2, c8396);
        synchronized (this) {
            try {
                C3001 c3001M6440 = m6440(c2997, z3, jElapsedRealtimeNanos);
                if (c3001M6440 == null) {
                    return m6442(c3068, obj, interfaceC8392, i, i2, cls, cls2, priority, c3012, c7982, z, z2, c8396, z3, z4, c3047, executorC7979, c2997, jElapsedRealtimeNanos);
                }
                c3047.m6541(c3001M6440, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0108 m6442(C3068 c3068, Object obj, InterfaceC8392 interfaceC8392, int i, int i2, Class cls, Class cls2, Priority priority, C3012 c3012, Map map, boolean z, boolean z2, C8396 c8396, boolean z3, boolean z4, C3047 c3047, Executor executor, C2997 c2997, long j) {
        C2998 c2998 = (C2998) this.f9547.f9821.get(c2997);
        if (c2998 != null) {
            c2998.m6423(c3047, executor);
            if (f9541) {
                m6437("Added to existing load", j, c2997);
            }
            return new C0108(this, c3047, c2998);
        }
        C2998 c29982 = (C2998) ((C7827) this.f9544.f9534).acquire();
        synchronized (c29982) {
            c29982.f9500 = c2997;
            c29982.f9499 = z3;
            c29982.f9498 = z4;
        }
        C0137 c0137 = this.f9542;
        RunnableC3014 runnableC3014 = (RunnableC3014) ((C7827) c0137.f594).acquire();
        int i3 = c0137.f596;
        c0137.f596 = i3 + 1;
        C3010 c3010 = runnableC3014.f9618;
        C3003 c3003 = runnableC3014.f9611;
        c3010.f9558 = c3068;
        c3010.f9557 = obj;
        c3010.f9561 = interfaceC8392;
        c3010.f9556 = i;
        c3010.f9555 = i2;
        c3010.f9566 = c3012;
        c3010.f9568 = cls;
        c3010.f9567 = c3003;
        c3010.f9569 = cls2;
        c3010.f9565 = priority;
        c3010.f9571 = c8396;
        c3010.f9572 = map;
        c3010.f9563 = z;
        c3010.f9564 = z2;
        runnableC3014.f9612 = c3068;
        runnableC3014.f9613 = interfaceC8392;
        runnableC3014.f9603 = priority;
        runnableC3014.f9602 = c2997;
        runnableC3014.f9601 = i;
        runnableC3014.f9600 = i2;
        runnableC3014.f9599 = c3012;
        runnableC3014.f9598 = c8396;
        runnableC3014.f9609 = c29982;
        runnableC3014.f9608 = i3;
        runnableC3014.f9606 = DecodeJob$RunReason.INITIALIZE;
        runnableC3014.f9604 = obj;
        runnableC3014.f9595 = c3068.f9817;
        runnableC3014.f9594 = (Supplier) c8396.m13947(RunnableC3014.f9585);
        C3069 c3069 = this.f9547;
        c3069.getClass();
        c3069.f9821.put(c2997, c29982);
        c29982.m6423(c3047, executor);
        synchronized (c29982) {
            c29982.f9503 = runnableC3014;
            DecodeJob$Stage decodeJob$StageM6463 = runnableC3014.m6463(DecodeJob$Stage.INITIALIZE);
            ((decodeJob$StageM6463 == DecodeJob$Stage.RESOURCE_CACHE || decodeJob$StageM6463 == DecodeJob$Stage.DATA_CACHE) ? c29982.f9513 : c29982.f9498 ? c29982.f9511 : c29982.f9510).execute(runnableC3014);
        }
        if (f9541) {
            m6437("Started new load", j, c2997);
        }
        return new C0108(this, c3047, c29982);
    }
}
