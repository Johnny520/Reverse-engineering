package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3901;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C3831;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p025.AbstractC7012;
import p234.C8799;
import p238.AbstractC8815;
import p238.AbstractC8818;
import p238.ExecutorC8809;
import p240.C8826;
import p241.InterfaceC8828;
import p358.C9647;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3880 implements InterfaceC3883 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final boolean f10042 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RuntimeException f10043;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10044;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f10045;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f10046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3901 f10047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context f10048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3882 f10049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f10050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8799 f10051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f10052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C3840 f10053;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f10054;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f10055;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f10056;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public SingleRequest$Status f10057;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f10058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final List f10059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC8828 f10060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC3821 f10061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0955 f10062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C8826 f10063;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorC8809 f10064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class f10065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f10066;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f10067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Priority f10068;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC3885 f10069;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f10070;

    public C3880(Context context, C3901 c3901, Object obj, Object obj2, Class cls, AbstractC3885 abstractC3885, int i, int i2, Priority priority, InterfaceC8828 interfaceC8828, ArrayList arrayList, InterfaceC3882 interfaceC3882, C3840 c3840, C8826 c8826) {
        ExecutorC8809 executorC8809 = AbstractC8818.f22413;
        this.f10052 = f10042 ? String.valueOf(hashCode()) : null;
        this.f10051 = new C8799();
        this.f10050 = obj;
        this.f10048 = context;
        this.f10047 = c3901;
        this.f10066 = obj2;
        this.f10065 = cls;
        this.f10069 = abstractC3885;
        this.f10070 = i;
        this.f10067 = i2;
        this.f10068 = priority;
        this.f10060 = interfaceC8828;
        this.f10059 = arrayList;
        this.f10049 = interfaceC3882;
        this.f10053 = c3840;
        this.f10063 = c8826;
        this.f10064 = executorC8809;
        this.f10057 = SingleRequest$Status.PENDING;
        if (this.f10043 == null && ((Map) c3901.f10167.f6882).containsKey(AbstractC3888.class)) {
            this.f10043 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    public final void clear() {
        synchronized (this.f10050) {
            try {
                if (this.f10044) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f10051.m14019();
                SingleRequest$Status singleRequest$Status = this.f10057;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.CLEARED;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                m7156();
                InterfaceC3821 interfaceC3821 = this.f10061;
                if (interfaceC3821 != null) {
                    this.f10061 = null;
                } else {
                    interfaceC3821 = null;
                }
                InterfaceC3882 interfaceC3882 = this.f10049;
                if (interfaceC3882 == null || interfaceC3882.mo7168(this)) {
                    this.f10060.mo7340(m7152());
                }
                this.f10057 = singleRequest$Status2;
                if (interfaceC3821 != null) {
                    this.f10053.getClass();
                    C3840.m7056(interfaceC3821);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f10050) {
            try {
                SingleRequest$Status singleRequest$Status = this.f10057;
                z = singleRequest$Status == SingleRequest$Status.RUNNING || singleRequest$Status == SingleRequest$Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f10050) {
            obj = this.f10066;
            cls = this.f10065;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Drawable m7152() {
        if (this.f10055 == null) {
            AbstractC3885 abstractC3885 = this.f10069;
            abstractC3885.getClass();
            this.f10055 = null;
            int i = abstractC3885.f10087;
            if (i > 0) {
                Resources.Theme theme = abstractC3885.f10086;
                Context context = this.f10048;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f10055 = AbstractC5754.m10443(context, context, i, theme);
            }
        }
        return this.f10055;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7153() {
        boolean z;
        synchronized (this.f10050) {
            z = this.f10057 == SingleRequest$Status.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo7154() {
        synchronized (this.f10050) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7155(InterfaceC3883 interfaceC3883) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC3885 abstractC3885;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC3885 abstractC38852;
        Priority priority2;
        int size2;
        if (!(interfaceC3883 instanceof C3880)) {
            return false;
        }
        synchronized (this.f10050) {
            try {
                i = this.f10070;
                i2 = this.f10067;
                obj = this.f10066;
                cls = this.f10065;
                abstractC3885 = this.f10069;
                priority = this.f10068;
                List list = this.f10059;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C3880 c3880 = (C3880) interfaceC3883;
        synchronized (c3880.f10050) {
            try {
                i3 = c3880.f10070;
                i4 = c3880.f10067;
                obj2 = c3880.f10066;
                cls2 = c3880.f10065;
                abstractC38852 = c3880.f10069;
                priority2 = c3880.f10068;
                List list2 = c3880.f10059;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC3885 == null ? abstractC38852 == null : abstractC3885.m7191(abstractC38852)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7156() {
        if (this.f10044) {
            C6755.m11870("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f10051.m14019();
        this.f10060.mo7334(this);
        C0955 c0955 = this.f10062;
        if (c0955 != null) {
            synchronized (((C3840) c0955.f663)) {
                ((C3831) c0955.f664).m7042((C3880) c0955.f665);
            }
            this.f10062 = null;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo7157() {
        boolean z;
        synchronized (this.f10050) {
            z = this.f10057 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7158(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f10051.m14019();
        Object obj2 = this.f10050;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f10042;
                    if (z) {
                        m7160("Got onSizeReady in " + AbstractC8815.m14026(this.f10054));
                    }
                    if (this.f10057 != SingleRequest$Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    SingleRequest$Status singleRequest$Status = SingleRequest$Status.RUNNING;
                    this.f10057 = singleRequest$Status;
                    this.f10069.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f10046 = iRound;
                    this.f10045 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m7160("finished setup for calling load in " + AbstractC8815.m14026(this.f10054));
                    }
                    C3840 c3840 = this.f10053;
                    C3901 c3901 = this.f10047;
                    Object obj3 = this.f10066;
                    AbstractC3885 abstractC3885 = this.f10069;
                    try {
                        try {
                            try {
                                try {
                                    this.f10062 = c3840.m7061(c3901, obj3, abstractC3885.f10090, this.f10046, this.f10045, abstractC3885.f10078, this.f10065, this.f10068, abstractC3885.f10093, abstractC3885.f10079, abstractC3885.f10082, abstractC3885.f10084, abstractC3885.f10080, abstractC3885.f10091, abstractC3885.f10083, this, this.f10064);
                                    if (this.f10057 != singleRequest$Status) {
                                        this.f10062 = null;
                                    }
                                    if (z) {
                                        m7160("finished onSizeReady in " + AbstractC8815.m14026(this.f10054));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7159() {
        synchronized (this.f10050) {
            try {
                if (this.f10044) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f10051.m14019();
                int i = AbstractC8815.f22409;
                this.f10054 = SystemClock.elapsedRealtimeNanos();
                if (this.f10066 == null) {
                    if (AbstractC8818.m14036(this.f10070, this.f10067)) {
                        this.f10046 = this.f10070;
                        this.f10045 = this.f10067;
                    }
                    if (this.f10056 == null) {
                        this.f10069.getClass();
                        this.f10056 = null;
                    }
                    m7163(new GlideException("Received null model"), this.f10056 == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.f10057;
                if (singleRequest$Status == SingleRequest$Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.COMPLETE) {
                    m7161(this.f10061, DataSource.MEMORY_CACHE);
                    return;
                }
                List<C9647> list = this.f10059;
                if (list != null) {
                    for (C9647 c9647 : list) {
                    }
                }
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.WAITING_FOR_SIZE;
                this.f10057 = singleRequest$Status2;
                if (AbstractC8818.m14036(this.f10070, this.f10067)) {
                    m7158(this.f10070, this.f10067);
                } else {
                    this.f10060.mo7338(this);
                }
                SingleRequest$Status singleRequest$Status3 = this.f10057;
                if (singleRequest$Status3 == SingleRequest$Status.RUNNING || singleRequest$Status3 == singleRequest$Status2) {
                    InterfaceC3882 interfaceC3882 = this.f10049;
                    if (interfaceC3882 == null || interfaceC3882.mo7165(this)) {
                        this.f10060.mo7342(m7152());
                    }
                }
                if (f10042) {
                    m7160("finished run method in " + AbstractC8815.m14026(this.f10054));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7160(String str) {
        StringBuilder sbM12143 = AbstractC7012.m12143(str, " this: ");
        sbM12143.append(this.f10052);
        Log.v("GlideRequest", sbM12143.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7161(InterfaceC3821 interfaceC3821, DataSource dataSource) {
        this.f10051.m14019();
        InterfaceC3821 interfaceC38212 = null;
        try {
            synchronized (this.f10050) {
                try {
                    this.f10062 = null;
                    if (interfaceC3821 == null) {
                        m7163(new GlideException("Expected to receive a Resource<R> with an object of " + this.f10065 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC3821.get();
                    try {
                        if (obj == null || !this.f10065.isAssignableFrom(obj.getClass())) {
                            this.f10061 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f10065);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC3821);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m7163(new GlideException(sb.toString()), 5);
                        } else {
                            InterfaceC3882 interfaceC3882 = this.f10049;
                            if (interfaceC3882 == null || interfaceC3882.mo7167(this)) {
                                m7162(interfaceC3821, obj, dataSource);
                                return;
                            } else {
                                this.f10061 = null;
                                this.f10057 = SingleRequest$Status.COMPLETE;
                            }
                        }
                        this.f10053.getClass();
                        C3840.m7056(interfaceC3821);
                    } catch (Throwable th) {
                        interfaceC38212 = interfaceC3821;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC38212 != null) {
                this.f10053.getClass();
                C3840.m7056(interfaceC38212);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7162(InterfaceC3821 interfaceC3821, Object obj, DataSource dataSource) {
        InterfaceC3882 interfaceC3882 = this.f10049;
        if (interfaceC3882 != null) {
            interfaceC3882.getRoot().mo7157();
        }
        this.f10057 = SingleRequest$Status.COMPLETE;
        this.f10061 = interfaceC3821;
        int i = this.f10047.f10169;
        Object obj2 = this.f10066;
        if (i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + obj2 + " with size [" + this.f10046 + "x" + this.f10045 + "] in " + AbstractC8815.m14026(this.f10054) + " ms");
        }
        if (interfaceC3882 != null) {
            interfaceC3882.mo7169(this);
        }
        this.f10044 = true;
        try {
            List<C9647> list = this.f10059;
            if (list != null) {
                for (C9647 c9647 : list) {
                    c9647.getClass();
                    obj2.getClass();
                    dataSource.getClass();
                    c9647.f25166.setVisibility(8);
                }
            }
            this.f10063.getClass();
            this.f10060.mo7333(obj);
            this.f10044 = false;
        } catch (Throwable th) {
            this.f10044 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7163(GlideException glideException, int i) {
        Drawable drawableM7152;
        this.f10051.m14019();
        synchronized (this.f10050) {
            try {
                glideException.setOrigin(this.f10043);
                int i2 = this.f10047.f10169;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f10066 + "] with dimensions [" + this.f10046 + "x" + this.f10045 + "]", glideException);
                    if (i2 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f10062 = null;
                this.f10057 = SingleRequest$Status.FAILED;
                InterfaceC3882 interfaceC3882 = this.f10049;
                if (interfaceC3882 != null) {
                    interfaceC3882.mo7166(this);
                }
                boolean z = true;
                this.f10044 = true;
                try {
                    List<C9647> list = this.f10059;
                    if (list != null) {
                        for (C9647 c9647 : list) {
                            InterfaceC8828 interfaceC8828 = this.f10060;
                            InterfaceC3882 interfaceC38822 = this.f10049;
                            if (interfaceC38822 != null) {
                                interfaceC38822.getRoot().mo7157();
                            }
                            c9647.getClass();
                            interfaceC8828.getClass();
                            c9647.f25166.setVisibility(8);
                        }
                    }
                    InterfaceC3882 interfaceC38823 = this.f10049;
                    if (interfaceC38823 != null && !interfaceC38823.mo7165(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f10066 == null) {
                            if (this.f10056 == null) {
                                this.f10069.getClass();
                                this.f10056 = null;
                            }
                            drawableM7152 = this.f10056;
                        } else {
                            drawableM7152 = null;
                        }
                        if (drawableM7152 == null) {
                            if (this.f10058 == null) {
                                AbstractC3885 abstractC3885 = this.f10069;
                                abstractC3885.getClass();
                                this.f10058 = null;
                                int i3 = abstractC3885.f10088;
                                if (i3 > 0) {
                                    Context context = this.f10048;
                                    Resources.Theme theme = this.f10069.f10086;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f10058 = AbstractC5754.m10443(context, context, i3, theme);
                                }
                            }
                            drawableM7152 = this.f10058;
                        }
                        if (drawableM7152 == null) {
                            drawableM7152 = m7152();
                        }
                        this.f10060.mo7341(drawableM7152);
                    }
                } finally {
                    this.f10044 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo7164() {
        boolean z;
        synchronized (this.f10050) {
            z = this.f10057 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }
}
