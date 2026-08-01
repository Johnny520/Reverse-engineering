package com.bumptech.glide.load.engine;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import androidx.core.util.InterfaceC2186;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3066;
import com.bumptech.glide.C3069;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2960;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.resource.bitmap.C3040;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Supplier;
import p009.AbstractC6183;
import p193.C7828;
import p218.C7970;
import p218.InterfaceC7972;
import p222.AbstractC7986;
import p222.C7983;
import p286.C8397;
import p286.C8398;
import p286.InterfaceC8393;
import p286.InterfaceC8401;
import p305.C8623;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3015 implements InterfaceC2993, Runnable, Comparable, InterfaceC7972 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final C8398 f9587 = new C8398("glide_thread_priority_override", null, C8398.f23273);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public volatile boolean f9588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f9589;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public InterfaceC2962 f9590;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DataSource f9591;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public volatile boolean f9592;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public volatile InterfaceC2992 f9593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC8393 f9594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object f9595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Supplier f9596;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C2242 f9597;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC8393 f9598;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Thread f9599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8397 f9600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C3013 f9601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f9602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9603;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2998 f9604;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Priority f9605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f9607;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public DecodeJob$RunReason f9608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public DecodeJob$Stage f9609;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9610;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2999 f9611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2186 f9612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3004 f9613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3069 f9614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC8393 f9615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3011 f9620 = new C3011();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f9618 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7970 f9619 = new C7970();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0108 f9616 = new C0108(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3014 f9617 = new C3014();

    public RunnableC3015(C3004 c3004, C7828 c7828) {
        this.f9613 = c3004;
        this.f9612 = c7828;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3015 runnableC3015 = (RunnableC3015) obj;
        int iOrdinal = this.f9605.ordinal() - runnableC3015.f9605.ordinal();
        return iOrdinal == 0 ? this.f9610 - runnableC3015.f9610 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2962 interfaceC2962 = this.f9590;
        try {
            try {
                try {
                    if (this.f9588) {
                        m6516();
                        if (interfaceC2962 != null) {
                            interfaceC2962.mo6432();
                            return;
                        }
                        return;
                    }
                    m6517();
                    if (interfaceC2962 != null) {
                        interfaceC2962.mo6432();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9588 + ", stage: " + this.f9609, th);
                    }
                    if (this.f9609 != DecodeJob$Stage.ENCODE) {
                        this.f9618.add(th);
                        m6516();
                    }
                    if (!this.f9588) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC2962 != null) {
                interfaceC2962.mo6432();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6512() {
        InterfaceC2989 interfaceC2989M6514;
        boolean zM6511;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m6522("Retrieved data", "data: " + this.f9595 + ", cache key: " + this.f9598 + ", fetcher: " + this.f9590, this.f9607);
        }
        C2990 c2990 = null;
        if (((Map) this.f9597.f6537).containsKey(AbstractC3066.class) && (supplier = this.f9596) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f9596.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f9596 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC2989M6514 = m6514(this.f9590, this.f9595, this.f9591);
        } catch (GlideException e2) {
            e2.setLoggingDetails(this.f9594, this.f9591);
            this.f9618.add(e2);
            interfaceC2989M6514 = null;
        }
        if (interfaceC2989M6514 == null) {
            m6520();
            return;
        }
        DataSource dataSource = this.f9591;
        if (interfaceC2989M6514 instanceof InterfaceC3000) {
            ((InterfaceC3000) interfaceC2989M6514).initialize();
        }
        if (((C2990) this.f9616.f318) != null) {
            c2990 = (C2990) C2990.f9461.acquire();
            c2990.f9462 = false;
            c2990.f9464 = true;
            c2990.f9463 = interfaceC2989M6514;
            interfaceC2989M6514 = c2990;
        }
        if (((Map) this.f9597.f6537).containsKey(AbstractC3066.class)) {
            m6519();
        }
        m6518();
        C2999 c2999 = this.f9611;
        synchronized (c2999) {
            c2999.f9499 = interfaceC2989M6514;
            c2999.f9498 = dataSource;
        }
        synchronized (c2999) {
            try {
                c2999.f9516.m13460();
                if (c2999.f9504) {
                    c2999.f9499.recycle();
                    c2999.m6477();
                } else {
                    if (c2999.f9518.f9542.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c2999.f9509) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C8623 c8623 = c2999.f9510;
                    InterfaceC2989 interfaceC2989 = c2999.f9499;
                    boolean z = c2999.f9501;
                    C2998 c2998 = c2999.f9502;
                    C3008 c3008 = c2999.f9517;
                    c8623.getClass();
                    c2999.f9506 = new C3002(interfaceC2989, z, true, c2998, c3008);
                    c2999.f9509 = true;
                    C3007 c3007 = c2999.f9518;
                    c3007.getClass();
                    ArrayList<C3006> arrayList = new ArrayList(c3007.f9542);
                    c2999.m6479(arrayList.size() + 1);
                    c2999.f9514.m6499(c2999, c2999.f9502, c2999.f9506);
                    for (C3006 c3006 : arrayList) {
                        c3006.f9540.execute(new RunnableC3009(c2999, c3006.f9541, 1));
                    }
                    c2999.m6480();
                }
            } finally {
            }
        }
        this.f9609 = DecodeJob$Stage.ENCODE;
        try {
            C0108 c0108 = this.f9616;
            if (((C2990) c0108.f318) != null) {
                try {
                    this.f9613.m6486().mo11656((InterfaceC8393) c0108.f319, new C0108((InterfaceC8401) c0108.f320, (C2990) c0108.f318, this.f9600, 8));
                    ((C2990) c0108.f318).m6472();
                } catch (Throwable th) {
                    ((C2990) c0108.f318).m6472();
                    throw th;
                }
            }
            if (c2990 != null) {
                c2990.m6472();
            }
            C3014 c3014 = this.f9617;
            synchronized (c3014) {
                c3014.f9585 = true;
                zM6511 = c3014.m6511();
            }
            if (zM6511) {
                m6515();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2989 m6513(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        C3011 c3011 = this.f9620;
        C3001 c3001M6505 = c3011.m6505(cls);
        C8397 c8397 = this.f9600;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || c3011.f9566;
        C8398 c8398 = C3040.f9681;
        Boolean bool = (Boolean) c8397.m13964(c8398);
        if (bool == null || (bool.booleanValue() && !z)) {
            c8397 = new C8397();
            C7983 c7983 = this.f9600.f23272;
            C7983 c79832 = c8397.f23272;
            c79832.mo869(c7983);
            c79832.put(c8398, Boolean.valueOf(z));
        }
        C8397 c83972 = c8397;
        InterfaceC2960 interfaceC2960M6882 = this.f9614.m6884().m6882(obj);
        try {
            return c3001M6505.m6483(this.f9603, this.f9602, interfaceC2960M6882, new C2985(this, dataSource), c83972);
        } finally {
            interfaceC2960M6882.mo6427();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2989 m6514(InterfaceC2962 interfaceC2962, Object obj, DataSource dataSource) {
        if (obj == null) {
            return null;
        }
        try {
            int i = AbstractC7986.f22064;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC2989 interfaceC2989M6513 = m6513(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m6522("Decoded result " + interfaceC2989M6513, null, jElapsedRealtimeNanos);
            }
            return interfaceC2989M6513;
        } finally {
            interfaceC2962.mo6432();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2993
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6475(InterfaceC8393 interfaceC8393, Object obj, InterfaceC2962 interfaceC2962, DataSource dataSource, InterfaceC8393 interfaceC83932) {
        this.f9598 = interfaceC8393;
        this.f9595 = obj;
        this.f9590 = interfaceC2962;
        this.f9591 = dataSource;
        this.f9594 = interfaceC83932;
        this.f9589 = interfaceC8393 != this.f9620.m6507().get(0);
        if (Thread.currentThread() == this.f9599) {
            m6512();
            return;
        }
        this.f9608 = DecodeJob$RunReason.DECODE_DATA;
        C2999 c2999 = this.f9611;
        (c2999.f9500 ? c2999.f9513 : c2999.f9512).execute(this);
    }

    @Override // p218.InterfaceC7972
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7970 mo6473() {
        return this.f9619;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2993
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6476(InterfaceC8393 interfaceC8393, Exception exc, InterfaceC2962 interfaceC2962, DataSource dataSource) {
        interfaceC2962.mo6432();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(interfaceC8393, dataSource, interfaceC2962.mo6433());
        this.f9618.add(glideException);
        if (Thread.currentThread() == this.f9599) {
            m6520();
            return;
        }
        this.f9608 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C2999 c2999 = this.f9611;
        (c2999.f9500 ? c2999.f9513 : c2999.f9512).execute(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m6515() {
        C3014 c3014 = this.f9617;
        synchronized (c3014) {
            c3014.f9585 = false;
            c3014.f9586 = false;
            c3014.f9584 = false;
        }
        C0108 c0108 = this.f9616;
        c0108.f319 = null;
        c0108.f320 = null;
        c0108.f318 = null;
        C3011 c3011 = this.f9620;
        c3011.f9560 = null;
        c3011.f9559 = null;
        c3011.f9563 = null;
        c3011.f9570 = null;
        c3011.f9571 = null;
        c3011.f9573 = null;
        c3011.f9567 = null;
        c3011.f9574 = null;
        c3011.f9568 = null;
        c3011.f9562.clear();
        c3011.f9572 = false;
        c3011.f9561.clear();
        c3011.f9564 = false;
        this.f9592 = false;
        this.f9614 = null;
        this.f9615 = null;
        this.f9600 = null;
        this.f9605 = null;
        this.f9604 = null;
        this.f9611 = null;
        this.f9609 = null;
        this.f9593 = null;
        this.f9599 = null;
        this.f9598 = null;
        this.f9595 = null;
        this.f9591 = null;
        this.f9590 = null;
        this.f9607 = 0L;
        this.f9588 = false;
        this.f9606 = null;
        this.f9618.clear();
        this.f9612.mo3989(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6516() {
        boolean zM6511;
        if (((Map) this.f9597.f6537).containsKey(AbstractC3066.class)) {
            m6519();
        }
        m6518();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f9618));
        C2999 c2999 = this.f9611;
        synchronized (c2999) {
            c2999.f9508 = glideException;
        }
        synchronized (c2999) {
            try {
                c2999.f9516.m13460();
                if (c2999.f9504) {
                    c2999.m6477();
                } else {
                    if (c2999.f9518.f9542.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c2999.f9507) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c2999.f9507 = true;
                    C2998 c2998 = c2999.f9502;
                    C3007 c3007 = c2999.f9518;
                    c3007.getClass();
                    ArrayList<C3006> arrayList = new ArrayList(c3007.f9542);
                    c2999.m6479(arrayList.size() + 1);
                    c2999.f9514.m6499(c2999, c2998, null);
                    for (C3006 c3006 : arrayList) {
                        c3006.f9540.execute(new RunnableC3009(c2999, c3006.f9541, 0));
                    }
                    c2999.m6480();
                }
            } finally {
            }
        }
        C3014 c3014 = this.f9617;
        synchronized (c3014) {
            c3014.f9584 = true;
            zM6511 = c3014.m6511();
        }
        if (zM6511) {
            m6515();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m6517() {
        int i = AbstractC3010.f9556[this.f9608.ordinal()];
        if (i == 1) {
            this.f9609 = m6523(DecodeJob$Stage.INITIALIZE);
            this.f9593 = m6521();
            m6520();
        } else if (i == 2) {
            m6520();
        } else if (i == 3) {
            m6512();
        } else {
            C4211.m8605(this.f9608, "Unrecognized run reason: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m6518() {
        this.f9619.m13460();
        if (this.f9592) {
            C8791.m14473("Already notified", this.f9618.isEmpty() ? null : (Throwable) AbstractC6183.m11586(1, this.f9618));
        } else {
            this.f9592 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6519() {
        if (!((Map) this.f9597.f6537).containsKey(AbstractC3066.class)) {
            C5925.m11311("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f9596;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f9596 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m6520() {
        this.f9599 = Thread.currentThread();
        int i = AbstractC7986.f22064;
        this.f9607 = SystemClock.elapsedRealtimeNanos();
        boolean zMo6469 = false;
        while (!this.f9588 && this.f9593 != null && !(zMo6469 = this.f9593.mo6469())) {
            this.f9609 = m6523(this.f9609);
            this.f9593 = m6521();
            if (this.f9609 == DecodeJob$Stage.SOURCE) {
                this.f9608 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
                C2999 c2999 = this.f9611;
                (c2999.f9500 ? c2999.f9513 : c2999.f9512).execute(this);
                return;
            }
        }
        if ((this.f9609 == DecodeJob$Stage.FINISHED || this.f9588) && !zMo6469) {
            m6516();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2992 m6521() {
        int i = AbstractC3010.f9555[this.f9609.ordinal()];
        C3011 c3011 = this.f9620;
        if (i == 1) {
            return new C2988(c3011, this);
        }
        if (i == 2) {
            return new C2995(c3011.m6507(), c3011, this);
        }
        if (i == 3) {
            return new C2991(c3011, this);
        }
        if (i == 4) {
            return null;
        }
        C4211.m8605(this.f9609, "Unrecognized stage: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6522(String str, String str2, long j) {
        StringBuilder sbM11584 = AbstractC6183.m11584(str, " in ");
        sbM11584.append(AbstractC7986.m13467(j));
        sbM11584.append(", load key: ");
        sbM11584.append(this.f9604);
        sbM11584.append(str2 != null ? ", ".concat(str2) : "");
        sbM11584.append(", thread: ");
        sbM11584.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM11584.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DecodeJob$Stage m6523(DecodeJob$Stage decodeJob$Stage) {
        boolean z;
        boolean z2;
        int i = AbstractC3010.f9555[decodeJob$Stage.ordinal()];
        if (i == 1) {
            switch (this.f9601.f9583) {
                case 0:
                    z = false;
                    break;
                case 1:
                default:
                    z = true;
                    break;
            }
            return z ? DecodeJob$Stage.DATA_CACHE : m6523(DecodeJob$Stage.DATA_CACHE);
        }
        if (i == 2) {
            return DecodeJob$Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return DecodeJob$Stage.FINISHED;
        }
        if (i != 5) {
            C4211.m8604(decodeJob$Stage, "Unrecognized stage: ");
            return null;
        }
        switch (this.f9601.f9583) {
            case 0:
            case 1:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        return z2 ? DecodeJob$Stage.RESOURCE_CACHE : m6523(DecodeJob$Stage.RESOURCE_CACHE);
    }
}
