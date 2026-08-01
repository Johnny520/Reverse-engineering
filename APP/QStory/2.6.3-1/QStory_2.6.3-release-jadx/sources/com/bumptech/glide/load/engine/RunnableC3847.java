package com.bumptech.glide.load.engine;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0955;
import androidx.core.util.InterfaceC3019;
import androidx.core.view.C3075;
import com.bumptech.glide.AbstractC3898;
import com.bumptech.glide.C3901;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3792;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.resource.bitmap.C3872;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Supplier;
import p025.AbstractC7012;
import p209.C8657;
import p234.C8799;
import p234.InterfaceC8801;
import p238.AbstractC8815;
import p238.C8812;
import p302.C9226;
import p302.C9227;
import p302.InterfaceC9222;
import p302.InterfaceC9230;
import p321.C9452;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3847 implements InterfaceC3825, Runnable, Comparable, InterfaceC8801 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final C9227 f9932 = new C9227("glide_thread_priority_override", null, C9227.f23618);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public volatile boolean f9933;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f9934;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public InterfaceC3794 f9935;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DataSource f9936;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public volatile boolean f9937;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public volatile InterfaceC3824 f9938;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC9222 f9939;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object f9940;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Supplier f9941;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C3075 f9942;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC9222 f9943;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Thread f9944;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C9226 f9945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C3845 f9946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f9947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9948;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C3830 f9949;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Priority f9950;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f9952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public DecodeJob$RunReason f9953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public DecodeJob$Stage f9954;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9955;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C3831 f9956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC3019 f9957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3836 f9958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3901 f9959;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC9222 f9960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3843 f9965 = new C3843();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f9963 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8799 f9964 = new C8799();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0955 f9961 = new C0955(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3846 f9962 = new C3846();

    public RunnableC3847(C3836 c3836, C8657 c8657) {
        this.f9958 = c3836;
        this.f9957 = c8657;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3847 runnableC3847 = (RunnableC3847) obj;
        int iOrdinal = this.f9950.ordinal() - runnableC3847.f9950.ordinal();
        return iOrdinal == 0 ? this.f9955 - runnableC3847.f9955 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3794 interfaceC3794 = this.f9935;
        try {
            try {
                try {
                    if (this.f9933) {
                        m7076();
                        if (interfaceC3794 != null) {
                            interfaceC3794.mo6992();
                            return;
                        }
                        return;
                    }
                    m7077();
                    if (interfaceC3794 != null) {
                        interfaceC3794.mo6992();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9933 + ", stage: " + this.f9954, th);
                    }
                    if (this.f9954 != DecodeJob$Stage.ENCODE) {
                        this.f9963.add(th);
                        m7076();
                    }
                    if (!this.f9933) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC3794 != null) {
                interfaceC3794.mo6992();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7072() {
        InterfaceC3821 interfaceC3821M7074;
        boolean zM7071;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m7082("Retrieved data", "data: " + this.f9940 + ", cache key: " + this.f9943 + ", fetcher: " + this.f9935, this.f9952);
        }
        C3822 c3822 = null;
        if (((Map) this.f9942.f6882).containsKey(AbstractC3898.class) && (supplier = this.f9941) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f9941.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f9941 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC3821M7074 = m7074(this.f9935, this.f9940, this.f9936);
        } catch (GlideException e2) {
            e2.setLoggingDetails(this.f9939, this.f9936);
            this.f9963.add(e2);
            interfaceC3821M7074 = null;
        }
        if (interfaceC3821M7074 == null) {
            m7080();
            return;
        }
        DataSource dataSource = this.f9936;
        if (interfaceC3821M7074 instanceof InterfaceC3832) {
            ((InterfaceC3832) interfaceC3821M7074).initialize();
        }
        if (((C3822) this.f9961.f663) != null) {
            c3822 = (C3822) C3822.f9806.acquire();
            c3822.f9807 = false;
            c3822.f9809 = true;
            c3822.f9808 = interfaceC3821M7074;
            interfaceC3821M7074 = c3822;
        }
        if (((Map) this.f9942.f6882).containsKey(AbstractC3898.class)) {
            m7079();
        }
        m7078();
        C3831 c3831 = this.f9956;
        synchronized (c3831) {
            c3831.f9844 = interfaceC3821M7074;
            c3831.f9843 = dataSource;
        }
        synchronized (c3831) {
            try {
                c3831.f9861.m14019();
                if (c3831.f9849) {
                    c3831.f9844.recycle();
                    c3831.m7037();
                } else {
                    if (c3831.f9863.f9887.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c3831.f9854) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C9452 c9452 = c3831.f9855;
                    InterfaceC3821 interfaceC3821 = c3831.f9844;
                    boolean z = c3831.f9846;
                    C3830 c3830 = c3831.f9847;
                    C3840 c3840 = c3831.f9862;
                    c9452.getClass();
                    c3831.f9851 = new C3834(interfaceC3821, z, true, c3830, c3840);
                    c3831.f9854 = true;
                    C3839 c3839 = c3831.f9863;
                    c3839.getClass();
                    ArrayList<C3838> arrayList = new ArrayList(c3839.f9887);
                    c3831.m7039(arrayList.size() + 1);
                    c3831.f9859.m7059(c3831, c3831.f9847, c3831.f9851);
                    for (C3838 c3838 : arrayList) {
                        c3838.f9885.execute(new RunnableC3841(c3831, c3838.f9886, 1));
                    }
                    c3831.m7040();
                }
            } finally {
            }
        }
        this.f9954 = DecodeJob$Stage.ENCODE;
        try {
            C0955 c0955 = this.f9961;
            if (((C3822) c0955.f663) != null) {
                try {
                    this.f9958.m7046().mo12215((InterfaceC9222) c0955.f664, new C0955((InterfaceC9230) c0955.f665, (C3822) c0955.f663, this.f9945, 8));
                    ((C3822) c0955.f663).m7032();
                } catch (Throwable th) {
                    ((C3822) c0955.f663).m7032();
                    throw th;
                }
            }
            if (c3822 != null) {
                c3822.m7032();
            }
            C3846 c3846 = this.f9962;
            synchronized (c3846) {
                c3846.f9930 = true;
                zM7071 = c3846.m7071();
            }
            if (zM7071) {
                m7075();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3821 m7073(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        C3843 c3843 = this.f9965;
        C3833 c3833M7065 = c3843.m7065(cls);
        C9226 c9226 = this.f9945;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || c3843.f9911;
        C9227 c9227 = C3872.f10026;
        Boolean bool = (Boolean) c9226.m14523(c9227);
        if (bool == null || (bool.booleanValue() && !z)) {
            c9226 = new C9226();
            C8812 c8812 = this.f9945.f23617;
            C8812 c88122 = c9226.f23617;
            c88122.mo1429(c8812);
            c88122.put(c9227, Boolean.valueOf(z));
        }
        C9226 c92262 = c9226;
        InterfaceC3792 interfaceC3792M7442 = this.f9959.m7444().m7442(obj);
        try {
            return c3833M7065.m7043(this.f9948, this.f9947, interfaceC3792M7442, new C3817(this, dataSource), c92262);
        } finally {
            interfaceC3792M7442.mo6987();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3821 m7074(InterfaceC3794 interfaceC3794, Object obj, DataSource dataSource) {
        if (obj == null) {
            return null;
        }
        try {
            int i = AbstractC8815.f22409;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC3821 interfaceC3821M7073 = m7073(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m7082("Decoded result " + interfaceC3821M7073, null, jElapsedRealtimeNanos);
            }
            return interfaceC3821M7073;
        } finally {
            interfaceC3794.mo6992();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3825
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7035(InterfaceC9222 interfaceC9222, Object obj, InterfaceC3794 interfaceC3794, DataSource dataSource, InterfaceC9222 interfaceC92222) {
        this.f9943 = interfaceC9222;
        this.f9940 = obj;
        this.f9935 = interfaceC3794;
        this.f9936 = dataSource;
        this.f9939 = interfaceC92222;
        this.f9934 = interfaceC9222 != this.f9965.m7067().get(0);
        if (Thread.currentThread() == this.f9944) {
            m7072();
            return;
        }
        this.f9953 = DecodeJob$RunReason.DECODE_DATA;
        C3831 c3831 = this.f9956;
        (c3831.f9845 ? c3831.f9858 : c3831.f9857).execute(this);
    }

    @Override // p234.InterfaceC8801
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8799 mo7033() {
        return this.f9964;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3825
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7036(InterfaceC9222 interfaceC9222, Exception exc, InterfaceC3794 interfaceC3794, DataSource dataSource) {
        interfaceC3794.mo6992();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(interfaceC9222, dataSource, interfaceC3794.mo6993());
        this.f9963.add(glideException);
        if (Thread.currentThread() == this.f9944) {
            m7080();
            return;
        }
        this.f9953 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C3831 c3831 = this.f9956;
        (c3831.f9845 ? c3831.f9858 : c3831.f9857).execute(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7075() {
        C3846 c3846 = this.f9962;
        synchronized (c3846) {
            c3846.f9930 = false;
            c3846.f9931 = false;
            c3846.f9929 = false;
        }
        C0955 c0955 = this.f9961;
        c0955.f664 = null;
        c0955.f665 = null;
        c0955.f663 = null;
        C3843 c3843 = this.f9965;
        c3843.f9905 = null;
        c3843.f9904 = null;
        c3843.f9908 = null;
        c3843.f9915 = null;
        c3843.f9916 = null;
        c3843.f9918 = null;
        c3843.f9912 = null;
        c3843.f9919 = null;
        c3843.f9913 = null;
        c3843.f9907.clear();
        c3843.f9917 = false;
        c3843.f9906.clear();
        c3843.f9909 = false;
        this.f9937 = false;
        this.f9959 = null;
        this.f9960 = null;
        this.f9945 = null;
        this.f9950 = null;
        this.f9949 = null;
        this.f9956 = null;
        this.f9954 = null;
        this.f9938 = null;
        this.f9944 = null;
        this.f9943 = null;
        this.f9940 = null;
        this.f9936 = null;
        this.f9935 = null;
        this.f9952 = 0L;
        this.f9933 = false;
        this.f9951 = null;
        this.f9963.clear();
        this.f9957.mo4549(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7076() {
        boolean zM7071;
        if (((Map) this.f9942.f6882).containsKey(AbstractC3898.class)) {
            m7079();
        }
        m7078();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f9963));
        C3831 c3831 = this.f9956;
        synchronized (c3831) {
            c3831.f9853 = glideException;
        }
        synchronized (c3831) {
            try {
                c3831.f9861.m14019();
                if (c3831.f9849) {
                    c3831.m7037();
                } else {
                    if (c3831.f9863.f9887.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c3831.f9852) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c3831.f9852 = true;
                    C3830 c3830 = c3831.f9847;
                    C3839 c3839 = c3831.f9863;
                    c3839.getClass();
                    ArrayList<C3838> arrayList = new ArrayList(c3839.f9887);
                    c3831.m7039(arrayList.size() + 1);
                    c3831.f9859.m7059(c3831, c3830, null);
                    for (C3838 c3838 : arrayList) {
                        c3838.f9885.execute(new RunnableC3841(c3831, c3838.f9886, 0));
                    }
                    c3831.m7040();
                }
            } finally {
            }
        }
        C3846 c3846 = this.f9962;
        synchronized (c3846) {
            c3846.f9929 = true;
            zM7071 = c3846.m7071();
        }
        if (zM7071) {
            m7075();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7077() {
        int i = AbstractC3842.f9901[this.f9953.ordinal()];
        if (i == 1) {
            this.f9954 = m7083(DecodeJob$Stage.INITIALIZE);
            this.f9938 = m7081();
            m7080();
        } else if (i == 2) {
            m7080();
        } else if (i == 3) {
            m7072();
        } else {
            C5043.m9164(this.f9953, "Unrecognized run reason: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7078() {
        this.f9964.m14019();
        if (this.f9937) {
            C9620.m15032("Already notified", this.f9963.isEmpty() ? null : (Throwable) AbstractC7012.m12145(1, this.f9963));
        } else {
            this.f9937 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7079() {
        if (!((Map) this.f9942.f6882).containsKey(AbstractC3898.class)) {
            C6755.m11870("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f9941;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f9941 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7080() {
        this.f9944 = Thread.currentThread();
        int i = AbstractC8815.f22409;
        this.f9952 = SystemClock.elapsedRealtimeNanos();
        boolean zMo7029 = false;
        while (!this.f9933 && this.f9938 != null && !(zMo7029 = this.f9938.mo7029())) {
            this.f9954 = m7083(this.f9954);
            this.f9938 = m7081();
            if (this.f9954 == DecodeJob$Stage.SOURCE) {
                this.f9953 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
                C3831 c3831 = this.f9956;
                (c3831.f9845 ? c3831.f9858 : c3831.f9857).execute(this);
                return;
            }
        }
        if ((this.f9954 == DecodeJob$Stage.FINISHED || this.f9933) && !zMo7029) {
            m7076();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC3824 m7081() {
        int i = AbstractC3842.f9900[this.f9954.ordinal()];
        C3843 c3843 = this.f9965;
        if (i == 1) {
            return new C3820(c3843, this);
        }
        if (i == 2) {
            return new C3827(c3843.m7067(), c3843, this);
        }
        if (i == 3) {
            return new C3823(c3843, this);
        }
        if (i == 4) {
            return null;
        }
        C5043.m9164(this.f9954, "Unrecognized stage: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7082(String str, String str2, long j) {
        StringBuilder sbM12143 = AbstractC7012.m12143(str, " in ");
        sbM12143.append(AbstractC8815.m14026(j));
        sbM12143.append(", load key: ");
        sbM12143.append(this.f9949);
        sbM12143.append(str2 != null ? ", ".concat(str2) : "");
        sbM12143.append(", thread: ");
        sbM12143.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM12143.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DecodeJob$Stage m7083(DecodeJob$Stage decodeJob$Stage) {
        boolean z;
        boolean z2;
        int i = AbstractC3842.f9900[decodeJob$Stage.ordinal()];
        if (i == 1) {
            switch (this.f9946.f9928) {
                case 0:
                    z = false;
                    break;
                case 1:
                default:
                    z = true;
                    break;
            }
            return z ? DecodeJob$Stage.DATA_CACHE : m7083(DecodeJob$Stage.DATA_CACHE);
        }
        if (i == 2) {
            return DecodeJob$Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return DecodeJob$Stage.FINISHED;
        }
        if (i != 5) {
            C5043.m9163(decodeJob$Stage, "Unrecognized stage: ");
            return null;
        }
        switch (this.f9946.f9928) {
            case 0:
            case 1:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        return z2 ? DecodeJob$Stage.RESOURCE_CACHE : m7083(DecodeJob$Stage.RESOURCE_CACHE);
    }
}
