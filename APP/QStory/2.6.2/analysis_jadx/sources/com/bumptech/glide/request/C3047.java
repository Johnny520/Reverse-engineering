package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.C3068;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2998;
import com.bumptech.glide.load.engine.C3007;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.InterfaceC2988;
import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p007.AbstractC6136;
import p218.C7969;
import p222.AbstractC7985;
import p222.AbstractC7988;
import p222.ExecutorC7979;
import p224.C7996;
import p225.InterfaceC7998;
import p343.C8832;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3047 implements InterfaceC3050 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final boolean f9695 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final RuntimeException f9696;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f9697;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f9698;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3068 f9700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context f9701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3049 f9702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7969 f9704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile C3007 f9706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f9707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f9708;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f9709;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public SingleRequest$Status f9710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f9711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final List f9712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC7998 f9713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2988 f9714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0108 f9715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7996 f9716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorC7979 f9717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class f9718;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f9719;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f9720;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Priority f9721;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC3052 f9722;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f9723;

    public C3047(Context context, C3068 c3068, Object obj, Object obj2, Class cls, AbstractC3052 abstractC3052, int i, int i2, Priority priority, InterfaceC7998 interfaceC7998, ArrayList arrayList, InterfaceC3049 interfaceC3049, C3007 c3007, C7996 c7996) {
        ExecutorC7979 executorC7979 = AbstractC7988.f22071;
        this.f9705 = f9695 ? String.valueOf(hashCode()) : null;
        this.f9704 = new C7969();
        this.f9703 = obj;
        this.f9701 = context;
        this.f9700 = c3068;
        this.f9719 = obj2;
        this.f9718 = cls;
        this.f9722 = abstractC3052;
        this.f9723 = i;
        this.f9720 = i2;
        this.f9721 = priority;
        this.f9713 = interfaceC7998;
        this.f9712 = arrayList;
        this.f9702 = interfaceC3049;
        this.f9706 = c3007;
        this.f9716 = c7996;
        this.f9717 = executorC7979;
        this.f9710 = SingleRequest$Status.PENDING;
        if (this.f9696 == null && ((Map) c3068.f9817.f6536).containsKey(AbstractC3055.class)) {
            this.f9696 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    public final void clear() {
        synchronized (this.f9703) {
            try {
                if (this.f9697) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9704.m13432();
                SingleRequest$Status singleRequest$Status = this.f9710;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.CLEARED;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                m6536();
                InterfaceC2988 interfaceC2988 = this.f9714;
                if (interfaceC2988 != null) {
                    this.f9714 = null;
                } else {
                    interfaceC2988 = null;
                }
                InterfaceC3049 interfaceC3049 = this.f9702;
                if (interfaceC3049 == null || interfaceC3049.mo6548(this)) {
                    this.f9713.mo6735(m6532());
                }
                this.f9710 = singleRequest$Status2;
                if (interfaceC2988 != null) {
                    this.f9706.getClass();
                    C3007.m6436(interfaceC2988);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9703) {
            try {
                SingleRequest$Status singleRequest$Status = this.f9710;
                z = singleRequest$Status == SingleRequest$Status.RUNNING || singleRequest$Status == SingleRequest$Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f9703) {
            obj = this.f9719;
            cls = this.f9718;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Drawable m6532() {
        if (this.f9708 == null) {
            AbstractC3052 abstractC3052 = this.f9722;
            abstractC3052.getClass();
            this.f9708 = null;
            int i = abstractC3052.f9740;
            if (i > 0) {
                Resources.Theme theme = abstractC3052.f9739;
                Context context = this.f9701;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f9708 = AbstractC3932.m8320(context, context, i, theme);
            }
        }
        return this.f9708;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo6533() {
        boolean z;
        synchronized (this.f9703) {
            z = this.f9710 == SingleRequest$Status.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo6534() {
        synchronized (this.f9703) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo6535(InterfaceC3050 interfaceC3050) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC3052 abstractC3052;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC3052 abstractC30522;
        Priority priority2;
        int size2;
        if (!(interfaceC3050 instanceof C3047)) {
            return false;
        }
        synchronized (this.f9703) {
            try {
                i = this.f9723;
                i2 = this.f9720;
                obj = this.f9719;
                cls = this.f9718;
                abstractC3052 = this.f9722;
                priority = this.f9721;
                List list = this.f9712;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C3047 c3047 = (C3047) interfaceC3050;
        synchronized (c3047.f9703) {
            try {
                i3 = c3047.f9723;
                i4 = c3047.f9720;
                obj2 = c3047.f9719;
                cls2 = c3047.f9718;
                abstractC30522 = c3047.f9722;
                priority2 = c3047.f9721;
                List list2 = c3047.f9712;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC3052 == null ? abstractC30522 == null : abstractC3052.m6571(abstractC30522)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6536() {
        if (this.f9697) {
            C5919.m11250("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f9704.m13432();
        this.f9713.mo6729(this);
        C0108 c0108 = this.f9715;
        if (c0108 != null) {
            synchronized (((C3007) c0108.f318)) {
                ((C2998) c0108.f319).m6424((C3047) c0108.f320);
            }
            this.f9715 = null;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo6537() {
        boolean z;
        synchronized (this.f9703) {
            z = this.f9710 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6538(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f9704.m13432();
        Object obj2 = this.f9703;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f9695;
                    if (z) {
                        m6540("Got onSizeReady in " + AbstractC7985.m13439(this.f9707));
                    }
                    if (this.f9710 != SingleRequest$Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    SingleRequest$Status singleRequest$Status = SingleRequest$Status.RUNNING;
                    this.f9710 = singleRequest$Status;
                    this.f9722.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f9699 = iRound;
                    this.f9698 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m6540("finished setup for calling load in " + AbstractC7985.m13439(this.f9707));
                    }
                    C3007 c3007 = this.f9706;
                    C3068 c3068 = this.f9700;
                    Object obj3 = this.f9719;
                    AbstractC3052 abstractC3052 = this.f9722;
                    try {
                        try {
                            try {
                                try {
                                    this.f9715 = c3007.m6441(c3068, obj3, abstractC3052.f9743, this.f9699, this.f9698, abstractC3052.f9731, this.f9718, this.f9721, abstractC3052.f9746, abstractC3052.f9732, abstractC3052.f9735, abstractC3052.f9737, abstractC3052.f9733, abstractC3052.f9744, abstractC3052.f9736, this, this.f9717);
                                    if (this.f9710 != singleRequest$Status) {
                                        this.f9715 = null;
                                    }
                                    if (z) {
                                        m6540("finished onSizeReady in " + AbstractC7985.m13439(this.f9707));
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

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo6539() {
        synchronized (this.f9703) {
            try {
                if (this.f9697) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9704.m13432();
                int i = AbstractC7985.f22067;
                this.f9707 = SystemClock.elapsedRealtimeNanos();
                if (this.f9719 == null) {
                    if (AbstractC7988.m13449(this.f9723, this.f9720)) {
                        this.f9699 = this.f9723;
                        this.f9698 = this.f9720;
                    }
                    if (this.f9709 == null) {
                        this.f9722.getClass();
                        this.f9709 = null;
                    }
                    m6543(new GlideException("Received null model"), this.f9709 == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.f9710;
                if (singleRequest$Status == SingleRequest$Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.COMPLETE) {
                    m6541(this.f9714, DataSource.MEMORY_CACHE);
                    return;
                }
                List<C8832> list = this.f9712;
                if (list != null) {
                    for (C8832 c8832 : list) {
                    }
                }
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.WAITING_FOR_SIZE;
                this.f9710 = singleRequest$Status2;
                if (AbstractC7988.m13449(this.f9723, this.f9720)) {
                    m6538(this.f9723, this.f9720);
                } else {
                    this.f9713.mo6733(this);
                }
                SingleRequest$Status singleRequest$Status3 = this.f9710;
                if (singleRequest$Status3 == SingleRequest$Status.RUNNING || singleRequest$Status3 == singleRequest$Status2) {
                    InterfaceC3049 interfaceC3049 = this.f9702;
                    if (interfaceC3049 == null || interfaceC3049.mo6545(this)) {
                        this.f9713.mo6737(m6532());
                    }
                }
                if (f9695) {
                    m6540("finished run method in " + AbstractC7985.m13439(this.f9707));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m6540(String str) {
        StringBuilder sbM11553 = AbstractC6136.m11553(str, " this: ");
        sbM11553.append(this.f9705);
        Log.v("GlideRequest", sbM11553.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m6541(InterfaceC2988 interfaceC2988, DataSource dataSource) {
        this.f9704.m13432();
        InterfaceC2988 interfaceC29882 = null;
        try {
            synchronized (this.f9703) {
                try {
                    this.f9715 = null;
                    if (interfaceC2988 == null) {
                        m6543(new GlideException("Expected to receive a Resource<R> with an object of " + this.f9718 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2988.get();
                    try {
                        if (obj == null || !this.f9718.isAssignableFrom(obj.getClass())) {
                            this.f9714 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f9718);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2988);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m6543(new GlideException(sb.toString()), 5);
                        } else {
                            InterfaceC3049 interfaceC3049 = this.f9702;
                            if (interfaceC3049 == null || interfaceC3049.mo6547(this)) {
                                m6542(interfaceC2988, obj, dataSource);
                                return;
                            } else {
                                this.f9714 = null;
                                this.f9710 = SingleRequest$Status.COMPLETE;
                            }
                        }
                        this.f9706.getClass();
                        C3007.m6436(interfaceC2988);
                    } catch (Throwable th) {
                        interfaceC29882 = interfaceC2988;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC29882 != null) {
                this.f9706.getClass();
                C3007.m6436(interfaceC29882);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6542(InterfaceC2988 interfaceC2988, Object obj, DataSource dataSource) {
        InterfaceC3049 interfaceC3049 = this.f9702;
        if (interfaceC3049 != null) {
            interfaceC3049.getRoot().mo6537();
        }
        this.f9710 = SingleRequest$Status.COMPLETE;
        this.f9714 = interfaceC2988;
        int i = this.f9700.f9819;
        Object obj2 = this.f9719;
        if (i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + obj2 + " with size [" + this.f9699 + "x" + this.f9698 + "] in " + AbstractC7985.m13439(this.f9707) + " ms");
        }
        if (interfaceC3049 != null) {
            interfaceC3049.mo6549(this);
        }
        this.f9697 = true;
        try {
            List<C8832> list = this.f9712;
            if (list != null) {
                for (C8832 c8832 : list) {
                    c8832.getClass();
                    obj2.getClass();
                    dataSource.getClass();
                    c8832.f24840.setVisibility(8);
                }
            }
            this.f9716.getClass();
            this.f9713.mo6728(obj);
            this.f9697 = false;
        } catch (Throwable th) {
            this.f9697 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6543(GlideException glideException, int i) {
        Drawable drawableM6532;
        this.f9704.m13432();
        synchronized (this.f9703) {
            try {
                glideException.setOrigin(this.f9696);
                int i2 = this.f9700.f9819;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f9719 + "] with dimensions [" + this.f9699 + "x" + this.f9698 + "]", glideException);
                    if (i2 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f9715 = null;
                this.f9710 = SingleRequest$Status.FAILED;
                InterfaceC3049 interfaceC3049 = this.f9702;
                if (interfaceC3049 != null) {
                    interfaceC3049.mo6546(this);
                }
                boolean z = true;
                this.f9697 = true;
                try {
                    List<C8832> list = this.f9712;
                    if (list != null) {
                        for (C8832 c8832 : list) {
                            InterfaceC7998 interfaceC7998 = this.f9713;
                            InterfaceC3049 interfaceC30492 = this.f9702;
                            if (interfaceC30492 != null) {
                                interfaceC30492.getRoot().mo6537();
                            }
                            c8832.getClass();
                            interfaceC7998.getClass();
                            c8832.f24840.setVisibility(8);
                        }
                    }
                    InterfaceC3049 interfaceC30493 = this.f9702;
                    if (interfaceC30493 != null && !interfaceC30493.mo6545(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f9719 == null) {
                            if (this.f9709 == null) {
                                this.f9722.getClass();
                                this.f9709 = null;
                            }
                            drawableM6532 = this.f9709;
                        } else {
                            drawableM6532 = null;
                        }
                        if (drawableM6532 == null) {
                            if (this.f9711 == null) {
                                AbstractC3052 abstractC3052 = this.f9722;
                                abstractC3052.getClass();
                                this.f9711 = null;
                                int i3 = abstractC3052.f9741;
                                if (i3 > 0) {
                                    Context context = this.f9701;
                                    Resources.Theme theme = this.f9722.f9739;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f9711 = AbstractC3932.m8320(context, context, i3, theme);
                                }
                            }
                            drawableM6532 = this.f9711;
                        }
                        if (drawableM6532 == null) {
                            drawableM6532 = m6532();
                        }
                        this.f9713.mo6736(drawableM6532);
                    }
                } finally {
                    this.f9697 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo6544() {
        boolean z;
        synchronized (this.f9703) {
            z = this.f9710 == SingleRequest$Status.COMPLETE;
        }
        return z;
    }
}
