package com.bumptech.glide.load.engine;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import androidx.core.util.InterfaceC2186;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3068;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2959;
import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.resource.bitmap.C3039;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Supplier;
import p007.AbstractC6136;
import p193.C7827;
import p218.C7969;
import p218.InterfaceC7971;
import p222.AbstractC7985;
import p222.C7982;
import p286.C8396;
import p286.C8397;
import p286.InterfaceC8392;
import p286.InterfaceC8400;
import p305.C8631;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3014 implements InterfaceC2992, Runnable, Comparable, InterfaceC7971 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final C8397 f9585 = new C8397("glide_thread_priority_override", null, C8397.f23274);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public volatile boolean f9586;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f9587;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public InterfaceC2961 f9588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DataSource f9589;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public volatile boolean f9590;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public volatile InterfaceC2991 f9591;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC8392 f9592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object f9593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Supplier f9594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C2242 f9595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC8392 f9596;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Thread f9597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8396 f9598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C3012 f9599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f9600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2997 f9602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Priority f9603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f9605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public DecodeJob$RunReason f9606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public DecodeJob$Stage f9607;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2998 f9609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2186 f9610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3003 f9611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3068 f9612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC8392 f9613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3010 f9618 = new C3010();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f9616 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7969 f9617 = new C7969();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0108 f9614 = new C0108(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3013 f9615 = new C3013();

    public RunnableC3014(C3003 c3003, C7827 c7827) {
        this.f9611 = c3003;
        this.f9610 = c7827;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3014 runnableC3014 = (RunnableC3014) obj;
        int iOrdinal = this.f9603.ordinal() - runnableC3014.f9603.ordinal();
        return iOrdinal == 0 ? this.f9608 - runnableC3014.f9608 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2961 interfaceC2961 = this.f9588;
        try {
            try {
                try {
                    if (this.f9586) {
                        m6456();
                        if (interfaceC2961 != null) {
                            interfaceC2961.mo6374();
                            return;
                        }
                        return;
                    }
                    m6457();
                    if (interfaceC2961 != null) {
                        interfaceC2961.mo6374();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9586 + ", stage: " + this.f9607, th);
                    }
                    if (this.f9607 != DecodeJob$Stage.ENCODE) {
                        this.f9616.add(th);
                        m6456();
                    }
                    if (!this.f9586) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC2961 != null) {
                interfaceC2961.mo6374();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6452() {
        InterfaceC2988 interfaceC2988M6454;
        boolean zM6451;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m6462("Retrieved data", "data: " + this.f9593 + ", cache key: " + this.f9596 + ", fetcher: " + this.f9588, this.f9605);
        }
        C2989 c2989 = null;
        if (((Map) this.f9595.f6536).containsKey(AbstractC3065.class) && (supplier = this.f9594) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f9594.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f9594 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC2988M6454 = m6454(this.f9588, this.f9593, this.f9589);
        } catch (GlideException e2) {
            e2.setLoggingDetails(this.f9592, this.f9589);
            this.f9616.add(e2);
            interfaceC2988M6454 = null;
        }
        if (interfaceC2988M6454 == null) {
            m6460();
            return;
        }
        DataSource dataSource = this.f9589;
        if (interfaceC2988M6454 instanceof InterfaceC2999) {
            ((InterfaceC2999) interfaceC2988M6454).initialize();
        }
        if (((C2989) this.f9614.f318) != null) {
            c2989 = (C2989) C2989.f9459.acquire();
            c2989.f9460 = false;
            c2989.f9462 = true;
            c2989.f9461 = interfaceC2988M6454;
            interfaceC2988M6454 = c2989;
        }
        if (((Map) this.f9595.f6536).containsKey(AbstractC3065.class)) {
            m6459();
        }
        m6458();
        C2998 c2998 = this.f9609;
        synchronized (c2998) {
            c2998.f9497 = interfaceC2988M6454;
            c2998.f9496 = dataSource;
        }
        synchronized (c2998) {
            try {
                c2998.f9514.m13432();
                if (c2998.f9502) {
                    c2998.f9497.recycle();
                    c2998.m6419();
                } else {
                    if (c2998.f9516.f9540.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c2998.f9507) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C8631 c8631 = c2998.f9508;
                    InterfaceC2988 interfaceC2988 = c2998.f9497;
                    boolean z = c2998.f9499;
                    C2997 c2997 = c2998.f9500;
                    C3007 c3007 = c2998.f9515;
                    c8631.getClass();
                    c2998.f9504 = new C3001(interfaceC2988, z, true, c2997, c3007);
                    c2998.f9507 = true;
                    C3006 c3006 = c2998.f9516;
                    c3006.getClass();
                    ArrayList<C3005> arrayList = new ArrayList(c3006.f9540);
                    c2998.m6421(arrayList.size() + 1);
                    c2998.f9512.m6439(c2998, c2998.f9500, c2998.f9504);
                    for (C3005 c3005 : arrayList) {
                        c3005.f9538.execute(new RunnableC3008(c2998, c3005.f9539, 1));
                    }
                    c2998.m6422();
                }
            } finally {
            }
        }
        this.f9607 = DecodeJob$Stage.ENCODE;
        try {
            C0108 c0108 = this.f9614;
            if (((C2989) c0108.f318) != null) {
                try {
                    this.f9611.m6428().mo11635((InterfaceC8392) c0108.f319, new C0108((InterfaceC8400) c0108.f320, (C2989) c0108.f318, this.f9598, 8));
                    ((C2989) c0108.f318).m6414();
                } catch (Throwable th) {
                    ((C2989) c0108.f318).m6414();
                    throw th;
                }
            }
            if (c2989 != null) {
                c2989.m6414();
            }
            C3013 c3013 = this.f9615;
            synchronized (c3013) {
                c3013.f9583 = true;
                zM6451 = c3013.m6451();
            }
            if (zM6451) {
                m6455();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2988 m6453(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        C3010 c3010 = this.f9618;
        C3000 c3000M6445 = c3010.m6445(cls);
        C8396 c8396 = this.f9598;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || c3010.f9564;
        C8397 c8397 = C3039.f9679;
        Boolean bool = (Boolean) c8396.m13947(c8397);
        if (bool == null || (bool.booleanValue() && !z)) {
            c8396 = new C8396();
            C7982 c7982 = this.f9598.f23273;
            C7982 c79822 = c8396.f23273;
            c79822.mo868(c7982);
            c79822.put(c8397, Boolean.valueOf(z));
        }
        C8396 c83962 = c8396;
        InterfaceC2959 interfaceC2959M6895 = this.f9612.m6897().m6895(obj);
        try {
            return c3000M6445.m6425(this.f9601, this.f9600, interfaceC2959M6895, new C2984(this, dataSource), c83962);
        } finally {
            interfaceC2959M6895.mo6369();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2988 m6454(InterfaceC2961 interfaceC2961, Object obj, DataSource dataSource) {
        if (obj == null) {
            return null;
        }
        try {
            int i = AbstractC7985.f22067;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC2988 interfaceC2988M6453 = m6453(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m6462("Decoded result " + interfaceC2988M6453, null, jElapsedRealtimeNanos);
            }
            return interfaceC2988M6453;
        } finally {
            interfaceC2961.mo6374();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6417(InterfaceC8392 interfaceC8392, Object obj, InterfaceC2961 interfaceC2961, DataSource dataSource, InterfaceC8392 interfaceC83922) {
        this.f9596 = interfaceC8392;
        this.f9593 = obj;
        this.f9588 = interfaceC2961;
        this.f9589 = dataSource;
        this.f9592 = interfaceC83922;
        this.f9587 = interfaceC8392 != this.f9618.m6447().get(0);
        if (Thread.currentThread() == this.f9597) {
            m6452();
            return;
        }
        this.f9606 = DecodeJob$RunReason.DECODE_DATA;
        C2998 c2998 = this.f9609;
        (c2998.f9498 ? c2998.f9511 : c2998.f9510).execute(this);
    }

    @Override // p218.InterfaceC7971
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7969 mo6415() {
        return this.f9617;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6418(InterfaceC8392 interfaceC8392, Exception exc, InterfaceC2961 interfaceC2961, DataSource dataSource) {
        interfaceC2961.mo6374();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(interfaceC8392, dataSource, interfaceC2961.mo6375());
        this.f9616.add(glideException);
        if (Thread.currentThread() == this.f9597) {
            m6460();
            return;
        }
        this.f9606 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C2998 c2998 = this.f9609;
        (c2998.f9498 ? c2998.f9511 : c2998.f9510).execute(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m6455() {
        C3013 c3013 = this.f9615;
        synchronized (c3013) {
            c3013.f9583 = false;
            c3013.f9584 = false;
            c3013.f9582 = false;
        }
        C0108 c0108 = this.f9614;
        c0108.f319 = null;
        c0108.f320 = null;
        c0108.f318 = null;
        C3010 c3010 = this.f9618;
        c3010.f9558 = null;
        c3010.f9557 = null;
        c3010.f9561 = null;
        c3010.f9568 = null;
        c3010.f9569 = null;
        c3010.f9571 = null;
        c3010.f9565 = null;
        c3010.f9572 = null;
        c3010.f9566 = null;
        c3010.f9560.clear();
        c3010.f9570 = false;
        c3010.f9559.clear();
        c3010.f9562 = false;
        this.f9590 = false;
        this.f9612 = null;
        this.f9613 = null;
        this.f9598 = null;
        this.f9603 = null;
        this.f9602 = null;
        this.f9609 = null;
        this.f9607 = null;
        this.f9591 = null;
        this.f9597 = null;
        this.f9596 = null;
        this.f9593 = null;
        this.f9589 = null;
        this.f9588 = null;
        this.f9605 = 0L;
        this.f9586 = false;
        this.f9604 = null;
        this.f9616.clear();
        this.f9610.mo3979(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6456() {
        boolean zM6451;
        if (((Map) this.f9595.f6536).containsKey(AbstractC3065.class)) {
            m6459();
        }
        m6458();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f9616));
        C2998 c2998 = this.f9609;
        synchronized (c2998) {
            c2998.f9506 = glideException;
        }
        synchronized (c2998) {
            try {
                c2998.f9514.m13432();
                if (c2998.f9502) {
                    c2998.m6419();
                } else {
                    if (c2998.f9516.f9540.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c2998.f9505) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c2998.f9505 = true;
                    C2997 c2997 = c2998.f9500;
                    C3006 c3006 = c2998.f9516;
                    c3006.getClass();
                    ArrayList<C3005> arrayList = new ArrayList(c3006.f9540);
                    c2998.m6421(arrayList.size() + 1);
                    c2998.f9512.m6439(c2998, c2997, null);
                    for (C3005 c3005 : arrayList) {
                        c3005.f9538.execute(new RunnableC3008(c2998, c3005.f9539, 0));
                    }
                    c2998.m6422();
                }
            } finally {
            }
        }
        C3013 c3013 = this.f9615;
        synchronized (c3013) {
            c3013.f9582 = true;
            zM6451 = c3013.m6451();
        }
        if (zM6451) {
            m6455();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m6457() {
        int i = AbstractC3009.f9554[this.f9606.ordinal()];
        if (i == 1) {
            this.f9607 = m6463(DecodeJob$Stage.INITIALIZE);
            this.f9591 = m6461();
            m6460();
        } else if (i == 2) {
            m6460();
        } else if (i == 3) {
            m6452();
        } else {
            C4210.m8615(this.f9606, "Unrecognized run reason: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m6458() {
        this.f9617.m13432();
        if (this.f9590) {
            C8796.m14449("Already notified", this.f9616.isEmpty() ? null : (Throwable) AbstractC6136.m11555(1, this.f9616));
        } else {
            this.f9590 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6459() {
        if (!((Map) this.f9595.f6536).containsKey(AbstractC3065.class)) {
            C5919.m11250("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f9594;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f9594 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m6460() {
        this.f9597 = Thread.currentThread();
        int i = AbstractC7985.f22067;
        this.f9605 = SystemClock.elapsedRealtimeNanos();
        boolean zMo6411 = false;
        while (!this.f9586 && this.f9591 != null && !(zMo6411 = this.f9591.mo6411())) {
            this.f9607 = m6463(this.f9607);
            this.f9591 = m6461();
            if (this.f9607 == DecodeJob$Stage.SOURCE) {
                this.f9606 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
                C2998 c2998 = this.f9609;
                (c2998.f9498 ? c2998.f9511 : c2998.f9510).execute(this);
                return;
            }
        }
        if ((this.f9607 == DecodeJob$Stage.FINISHED || this.f9586) && !zMo6411) {
            m6456();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2991 m6461() {
        int i = AbstractC3009.f9553[this.f9607.ordinal()];
        C3010 c3010 = this.f9618;
        if (i == 1) {
            return new C2987(c3010, this);
        }
        if (i == 2) {
            return new C2994(c3010.m6447(), c3010, this);
        }
        if (i == 3) {
            return new C2990(c3010, this);
        }
        if (i == 4) {
            return null;
        }
        C4210.m8615(this.f9607, "Unrecognized stage: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6462(String str, String str2, long j) {
        StringBuilder sbM11553 = AbstractC6136.m11553(str, " in ");
        sbM11553.append(AbstractC7985.m13439(j));
        sbM11553.append(", load key: ");
        sbM11553.append(this.f9602);
        sbM11553.append(str2 != null ? ", ".concat(str2) : "");
        sbM11553.append(", thread: ");
        sbM11553.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM11553.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DecodeJob$Stage m6463(DecodeJob$Stage decodeJob$Stage) {
        boolean z;
        boolean z2;
        int i = AbstractC3009.f9553[decodeJob$Stage.ordinal()];
        if (i == 1) {
            switch (this.f9599.f9581) {
                case 0:
                    z = false;
                    break;
                case 1:
                default:
                    z = true;
                    break;
            }
            return z ? DecodeJob$Stage.DATA_CACHE : m6463(DecodeJob$Stage.DATA_CACHE);
        }
        if (i == 2) {
            return DecodeJob$Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return DecodeJob$Stage.FINISHED;
        }
        if (i != 5) {
            C4210.m8614(decodeJob$Stage, "Unrecognized stage: ");
            return null;
        }
        switch (this.f9599.f9581) {
            case 0:
            case 1:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        return z2 ? DecodeJob$Stage.RESOURCE_CACHE : m6463(DecodeJob$Stage.RESOURCE_CACHE);
    }
}
