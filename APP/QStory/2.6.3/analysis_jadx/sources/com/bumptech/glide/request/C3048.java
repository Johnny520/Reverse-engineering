package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2999;
import com.bumptech.glide.load.engine.C3008;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p009.AbstractC6183;
import p218.C7970;
import p222.AbstractC7986;
import p222.AbstractC7989;
import p222.ExecutorC7980;
import p224.C7997;
import p225.InterfaceC7999;
import p342.C8818;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3048 implements InterfaceC3051 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final boolean f9697 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RuntimeException f9698;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f9699;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f9700;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3069 f9702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context f9703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3050 f9704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7970 f9706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C3008 f9708;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f9709;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f9710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f9711;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public SingleRequest$Status f9712;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f9713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final List f9714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC7999 f9715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2989 f9716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0108 f9717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7997 f9718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorC7980 f9719;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class f9720;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f9721;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f9722;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Priority f9723;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC3053 f9724;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f9725;

    public C3048(Context context, C3069 c3069, Object obj, Object obj2, Class cls, AbstractC3053 abstractC3053, int i, int i2, Priority priority, InterfaceC7999 interfaceC7999, ArrayList arrayList, InterfaceC3050 interfaceC3050, C3008 c3008, C7997 c7997) {
        ExecutorC7980 executorC7980 = AbstractC7989.f22068;
        this.f9707 = f9697 ? String.valueOf(hashCode()) : null;
        this.f9706 = new C7970();
        this.f9705 = obj;
        this.f9703 = context;
        this.f9702 = c3069;
        this.f9721 = obj2;
        this.f9720 = cls;
        this.f9724 = abstractC3053;
        this.f9725 = i;
        this.f9722 = i2;
        this.f9723 = priority;
        this.f9715 = interfaceC7999;
        this.f9714 = arrayList;
        this.f9704 = interfaceC3050;
        this.f9708 = c3008;
        this.f9718 = c7997;
        this.f9719 = executorC7980;
        this.f9712 = SingleRequest$Status.PENDING;
        if (this.f9698 == null && ((Map) c3069.f9822.f6537).containsKey(AbstractC3056.class)) {
            this.f9698 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    public final void clear() {
        synchronized (this.f9705) {
            try {
                if (this.f9699) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9706.m13460();
                SingleRequest$Status singleRequest$Status = this.f9712;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.CLEARED;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                m6596();
                InterfaceC2989 interfaceC2989 = this.f9716;
                if (interfaceC2989 != null) {
                    this.f9716 = null;
                } else {
                    interfaceC2989 = null;
                }
                InterfaceC3050 interfaceC3050 = this.f9704;
                if (interfaceC3050 == null || interfaceC3050.mo6608(this)) {
                    this.f9715.mo6780(m6592());
                }
                this.f9712 = singleRequest$Status2;
                if (interfaceC2989 != null) {
                    this.f9708.getClass();
                    C3008.m6496(interfaceC2989);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9705) {
            try {
                SingleRequest$Status singleRequest$Status = this.f9712;
                z = singleRequest$Status == SingleRequest$Status.RUNNING || singleRequest$Status == SingleRequest$Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f9705) {
            obj = this.f9721;
            cls = this.f9720;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Drawable m6592() {
        if (this.f9710 == null) {
            AbstractC3053 abstractC3053 = this.f9724;
            abstractC3053.getClass();
            this.f9710 = null;
            int i = abstractC3053.f9742;
            if (i > 0) {
                Resources.Theme theme = abstractC3053.f9741;
                Context context = this.f9703;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f9710 = AbstractC4922.m9884(context, context, i, theme);
            }
        }
        return this.f9710;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo6593() {
        boolean z;
        synchronized (this.f9705) {
            z = this.f9712 == SingleRequest$Status.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo6594() {
        synchronized (this.f9705) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo6595(InterfaceC3051 interfaceC3051) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC3053 abstractC3053;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC3053 abstractC30532;
        Priority priority2;
        int size2;
        if (!(interfaceC3051 instanceof C3048)) {
            return false;
        }
        synchronized (this.f9705) {
            try {
                i = this.f9725;
                i2 = this.f9722;
                obj = this.f9721;
                cls = this.f9720;
                abstractC3053 = this.f9724;
                priority = this.f9723;
                List list = this.f9714;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C3048 c3048 = (C3048) interfaceC3051;
        synchronized (c3048.f9705) {
            try {
                i3 = c3048.f9725;
                i4 = c3048.f9722;
                obj2 = c3048.f9721;
                cls2 = c3048.f9720;
                abstractC30532 = c3048.f9724;
                priority2 = c3048.f9723;
                List list2 = c3048.f9714;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC3053 == null ? abstractC30532 == null : abstractC3053.m6631(abstractC30532)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6596() {
        if (this.f9699) {
            C5925.m11311("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f9706.m13460();
        this.f9715.mo6774(this);
        C0108 c0108 = this.f9717;
        if (c0108 != null) {
            synchronized (((C3008) c0108.f318)) {
                ((C2999) c0108.f319).m6482((C3048) c0108.f320);
            }
            this.f9717 = null;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo6597() {
        boolean z;
        synchronized (this.f9705) {
            z = this.f9712 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6598(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f9706.m13460();
        Object obj2 = this.f9705;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f9697;
                    if (z) {
                        m6600("Got onSizeReady in " + AbstractC7986.m13467(this.f9709));
                    }
                    if (this.f9712 != SingleRequest$Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    SingleRequest$Status singleRequest$Status = SingleRequest$Status.RUNNING;
                    this.f9712 = singleRequest$Status;
                    this.f9724.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f9701 = iRound;
                    this.f9700 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m6600("finished setup for calling load in " + AbstractC7986.m13467(this.f9709));
                    }
                    C3008 c3008 = this.f9708;
                    C3069 c3069 = this.f9702;
                    Object obj3 = this.f9721;
                    AbstractC3053 abstractC3053 = this.f9724;
                    try {
                        try {
                            try {
                                try {
                                    this.f9717 = c3008.m6501(c3069, obj3, abstractC3053.f9745, this.f9701, this.f9700, abstractC3053.f9733, this.f9720, this.f9723, abstractC3053.f9748, abstractC3053.f9734, abstractC3053.f9737, abstractC3053.f9739, abstractC3053.f9735, abstractC3053.f9746, abstractC3053.f9738, this, this.f9719);
                                    if (this.f9712 != singleRequest$Status) {
                                        this.f9717 = null;
                                    }
                                    if (z) {
                                        m6600("finished onSizeReady in " + AbstractC7986.m13467(this.f9709));
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

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo6599() {
        synchronized (this.f9705) {
            try {
                if (this.f9699) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9706.m13460();
                int i = AbstractC7986.f22064;
                this.f9709 = SystemClock.elapsedRealtimeNanos();
                if (this.f9721 == null) {
                    if (AbstractC7989.m13477(this.f9725, this.f9722)) {
                        this.f9701 = this.f9725;
                        this.f9700 = this.f9722;
                    }
                    if (this.f9711 == null) {
                        this.f9724.getClass();
                        this.f9711 = null;
                    }
                    m6603(new GlideException("Received null model"), this.f9711 == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.f9712;
                if (singleRequest$Status == SingleRequest$Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.COMPLETE) {
                    m6601(this.f9716, DataSource.MEMORY_CACHE);
                    return;
                }
                List<C8818> list = this.f9714;
                if (list != null) {
                    for (C8818 c8818 : list) {
                    }
                }
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.WAITING_FOR_SIZE;
                this.f9712 = singleRequest$Status2;
                if (AbstractC7989.m13477(this.f9725, this.f9722)) {
                    m6598(this.f9725, this.f9722);
                } else {
                    this.f9715.mo6778(this);
                }
                SingleRequest$Status singleRequest$Status3 = this.f9712;
                if (singleRequest$Status3 == SingleRequest$Status.RUNNING || singleRequest$Status3 == singleRequest$Status2) {
                    InterfaceC3050 interfaceC3050 = this.f9704;
                    if (interfaceC3050 == null || interfaceC3050.mo6605(this)) {
                        this.f9715.mo6782(m6592());
                    }
                }
                if (f9697) {
                    m6600("finished run method in " + AbstractC7986.m13467(this.f9709));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m6600(String str) {
        StringBuilder sbM11584 = AbstractC6183.m11584(str, " this: ");
        sbM11584.append(this.f9707);
        Log.v("GlideRequest", sbM11584.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m6601(InterfaceC2989 interfaceC2989, DataSource dataSource) {
        this.f9706.m13460();
        InterfaceC2989 interfaceC29892 = null;
        try {
            synchronized (this.f9705) {
                try {
                    this.f9717 = null;
                    if (interfaceC2989 == null) {
                        m6603(new GlideException("Expected to receive a Resource<R> with an object of " + this.f9720 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2989.get();
                    try {
                        if (obj == null || !this.f9720.isAssignableFrom(obj.getClass())) {
                            this.f9716 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f9720);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2989);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m6603(new GlideException(sb.toString()), 5);
                        } else {
                            InterfaceC3050 interfaceC3050 = this.f9704;
                            if (interfaceC3050 == null || interfaceC3050.mo6607(this)) {
                                m6602(interfaceC2989, obj, dataSource);
                                return;
                            } else {
                                this.f9716 = null;
                                this.f9712 = SingleRequest$Status.COMPLETE;
                            }
                        }
                        this.f9708.getClass();
                        C3008.m6496(interfaceC2989);
                    } catch (Throwable th) {
                        interfaceC29892 = interfaceC2989;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC29892 != null) {
                this.f9708.getClass();
                C3008.m6496(interfaceC29892);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6602(InterfaceC2989 interfaceC2989, Object obj, DataSource dataSource) {
        InterfaceC3050 interfaceC3050 = this.f9704;
        if (interfaceC3050 != null) {
            interfaceC3050.getRoot().mo6597();
        }
        this.f9712 = SingleRequest$Status.COMPLETE;
        this.f9716 = interfaceC2989;
        int i = this.f9702.f9824;
        Object obj2 = this.f9721;
        if (i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + obj2 + " with size [" + this.f9701 + "x" + this.f9700 + "] in " + AbstractC7986.m13467(this.f9709) + " ms");
        }
        if (interfaceC3050 != null) {
            interfaceC3050.mo6609(this);
        }
        this.f9699 = true;
        try {
            List<C8818> list = this.f9714;
            if (list != null) {
                for (C8818 c8818 : list) {
                    c8818.getClass();
                    obj2.getClass();
                    dataSource.getClass();
                    c8818.f24821.setVisibility(8);
                }
            }
            this.f9718.getClass();
            this.f9715.mo6773(obj);
            this.f9699 = false;
        } catch (Throwable th) {
            this.f9699 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6603(GlideException glideException, int i) {
        Drawable drawableM6592;
        this.f9706.m13460();
        synchronized (this.f9705) {
            try {
                glideException.setOrigin(this.f9698);
                int i2 = this.f9702.f9824;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f9721 + "] with dimensions [" + this.f9701 + "x" + this.f9700 + "]", glideException);
                    if (i2 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f9717 = null;
                this.f9712 = SingleRequest$Status.FAILED;
                InterfaceC3050 interfaceC3050 = this.f9704;
                if (interfaceC3050 != null) {
                    interfaceC3050.mo6606(this);
                }
                boolean z = true;
                this.f9699 = true;
                try {
                    List<C8818> list = this.f9714;
                    if (list != null) {
                        for (C8818 c8818 : list) {
                            InterfaceC7999 interfaceC7999 = this.f9715;
                            InterfaceC3050 interfaceC30502 = this.f9704;
                            if (interfaceC30502 != null) {
                                interfaceC30502.getRoot().mo6597();
                            }
                            c8818.getClass();
                            interfaceC7999.getClass();
                            c8818.f24821.setVisibility(8);
                        }
                    }
                    InterfaceC3050 interfaceC30503 = this.f9704;
                    if (interfaceC30503 != null && !interfaceC30503.mo6605(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f9721 == null) {
                            if (this.f9711 == null) {
                                this.f9724.getClass();
                                this.f9711 = null;
                            }
                            drawableM6592 = this.f9711;
                        } else {
                            drawableM6592 = null;
                        }
                        if (drawableM6592 == null) {
                            if (this.f9713 == null) {
                                AbstractC3053 abstractC3053 = this.f9724;
                                abstractC3053.getClass();
                                this.f9713 = null;
                                int i3 = abstractC3053.f9743;
                                if (i3 > 0) {
                                    Context context = this.f9703;
                                    Resources.Theme theme = this.f9724.f9741;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f9713 = AbstractC4922.m9884(context, context, i3, theme);
                                }
                            }
                            drawableM6592 = this.f9713;
                        }
                        if (drawableM6592 == null) {
                            drawableM6592 = m6592();
                        }
                        this.f9715.mo6781(drawableM6592);
                    }
                } finally {
                    this.f9699 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo6604() {
        boolean z;
        synchronized (this.f9705) {
            z = this.f9712 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }
}
