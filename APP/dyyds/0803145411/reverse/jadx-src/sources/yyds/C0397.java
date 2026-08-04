package yyds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛲᛷᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397 implements InterfaceC1823 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static final boolean f2040 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final List f2041;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Class f2042;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final InterfaceC2156 f2043;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final RuntimeException f2044;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AbstractC0793 f2045;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Context f2046;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f2047;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f2048;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public volatile C2620 f2049;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final C0469 f2050;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public C0644 f2051;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1202 f2052;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f2053;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public Drawable f2054;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public InterfaceC2162 f2055;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f2056;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public Drawable f2057;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public Drawable f2058;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int f2059;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final EnumC0296 f2060;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public int f2061;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int f2062;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public long f2063;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f2064;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final ExecutorC1267 f2065;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2572 f2066;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0131 f2067;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int f2068;

    public C0397(Context context, C2572 c2572, Object obj, Object obj2, Class cls, AbstractC0793 abstractC0793, int i, int i2, EnumC0296 enumC0296, InterfaceC2156 interfaceC2156, ArrayList arrayList, InterfaceC0131 interfaceC0131, C2620 c2620) {
        C0469 c0469 = C1948.f9800;
        ExecutorC1267 executorC1267 = AbstractC0319.f1691;
        this.f2048 = f2040 ? String.valueOf(System.identityHashCode(this)) : null;
        this.f2052 = new C1202();
        this.f2064 = obj;
        this.f2046 = context;
        this.f2066 = c2572;
        this.f2056 = obj2;
        this.f2042 = cls;
        this.f2045 = abstractC0793;
        this.f2062 = i;
        this.f2059 = i2;
        this.f2060 = enumC0296;
        this.f2043 = interfaceC2156;
        this.f2041 = arrayList;
        this.f2067 = interfaceC0131;
        this.f2049 = c2620;
        this.f2050 = c0469;
        this.f2065 = executorC1267;
        this.f2061 = 1;
        if (this.f2044 == null && ((Map) c2572.f12666.f551).containsKey(AbstractC2328.class)) {
            this.f2044 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // yyds.InterfaceC1823
    public final void clear() {
        synchronized (this.f2064) {
            try {
                if (this.f2053) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2052.m2395();
                if (this.f2061 == 6) {
                    return;
                }
                m1150();
                InterfaceC2162 interfaceC2162 = this.f2055;
                if (interfaceC2162 != null) {
                    this.f2055 = null;
                } else {
                    interfaceC2162 = null;
                }
                InterfaceC0131 interfaceC0131 = this.f2067;
                if (interfaceC0131 == null || interfaceC0131.mo456(this)) {
                    this.f2043.mo2328(m1154());
                }
                this.f2061 = 6;
                if (interfaceC2162 != null) {
                    this.f2049.getClass();
                    C2620.m4726(interfaceC2162);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1823
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f2064) {
            int i = this.f2061;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f2064) {
            obj = this.f2056;
            cls = this.f2042;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo449(InterfaceC1823 interfaceC1823) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0793 abstractC0793;
        EnumC0296 enumC0296;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0793 abstractC07932;
        EnumC0296 enumC02962;
        int size2;
        if (!(interfaceC1823 instanceof C0397)) {
            return false;
        }
        synchronized (this.f2064) {
            try {
                i = this.f2062;
                i2 = this.f2059;
                obj = this.f2056;
                cls = this.f2042;
                abstractC0793 = this.f2045;
                enumC0296 = this.f2060;
                List list = this.f2041;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C0397 c0397 = (C0397) interfaceC1823;
        synchronized (c0397.f2064) {
            try {
                i3 = c0397.f2062;
                i4 = c0397.f2059;
                obj2 = c0397.f2056;
                cls2 = c0397.f2042;
                abstractC07932 = c0397.f2045;
                enumC02962 = c0397.f2060;
                List list2 = c0397.f2041;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC0793 == null ? abstractC07932 == null : abstractC0793.m1792(abstractC07932)) && enumC0296 == enumC02962 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m1148(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f2052.m2395();
        Object obj2 = this.f2064;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f2040;
                    if (z) {
                        m1149("Got onSizeReady in " + AbstractC1382.m2794(this.f2063));
                    }
                    if (this.f2061 != 3) {
                        return;
                    }
                    this.f2061 = 2;
                    this.f2045.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f2047 = iRound;
                    this.f2068 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m1149("finished setup for calling load in " + AbstractC1382.m2794(this.f2063));
                    }
                    C2620 c2620 = this.f2049;
                    C2572 c2572 = this.f2066;
                    Object obj3 = this.f2056;
                    AbstractC0793 abstractC0793 = this.f2045;
                    try {
                        try {
                            try {
                                try {
                                    this.f2051 = c2620.m4731(c2572, obj3, abstractC0793.f3640, this.f2047, this.f2068, abstractC0793.f3636, this.f2042, this.f2060, abstractC0793.f3647, abstractC0793.f3631, abstractC0793.f3641, abstractC0793.f3637, abstractC0793.f3633, abstractC0793.f3632, abstractC0793.f3643, this, this.f2065);
                                    if (this.f2061 != 2) {
                                        this.f2051 = null;
                                    }
                                    if (z) {
                                        m1149("finished onSizeReady in " + AbstractC1382.m2794(this.f2063));
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

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo450() {
        boolean z;
        synchronized (this.f2064) {
            z = this.f2061 == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m1149(String str) {
        Log.v("GlideRequest", str + " this: " + this.f2048);
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo452() {
        boolean z;
        synchronized (this.f2064) {
            z = this.f2061 == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1150() {
        if (this.f2053) {
            C0188.m800("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f2052.m2395();
        this.f2043.mo1206(this);
        C0644 c0644 = this.f2051;
        if (c0644 != null) {
            synchronized (((C2620) c0644.f3101)) {
                ((C2028) c0644.f3099).m3907((C0397) c0644.f3102);
            }
            this.f2051 = null;
        }
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo454() {
        synchronized (this.f2064) {
            try {
                if (this.f2053) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2052.m2395();
                int i = AbstractC1382.f6429;
                this.f2063 = SystemClock.elapsedRealtimeNanos();
                if (this.f2056 == null) {
                    if (AbstractC0181.m751(this.f2062, this.f2059)) {
                        this.f2047 = this.f2062;
                        this.f2068 = this.f2059;
                    }
                    Drawable drawable = this.f2054;
                    if (drawable == null) {
                        this.f2045.getClass();
                        drawable = null;
                        this.f2054 = null;
                    }
                    m1153(new C0975("Received null model"), drawable == null ? 5 : 3);
                    return;
                }
                int i2 = this.f2061;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m1151(this.f2055, 5);
                    return;
                }
                List<InterfaceC0609> list = this.f2041;
                if (list != null) {
                    for (InterfaceC0609 interfaceC0609 : list) {
                    }
                }
                this.f2061 = 3;
                if (AbstractC0181.m751(this.f2062, this.f2059)) {
                    m1148(this.f2062, this.f2059);
                } else {
                    this.f2043.mo1199(this);
                }
                int i3 = this.f2061;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC0131 interfaceC0131 = this.f2067;
                    if (interfaceC0131 == null || interfaceC0131.mo459(this)) {
                        this.f2043.mo1205(m1154());
                    }
                }
                if (f2040) {
                    m1149("finished run method in " + AbstractC1382.m2794(this.f2063));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m1151(InterfaceC2162 interfaceC2162, int i) {
        this.f2052.m2395();
        InterfaceC2162 interfaceC21622 = null;
        try {
            synchronized (this.f2064) {
                try {
                    this.f2051 = null;
                    if (interfaceC2162 == null) {
                        m1153(new C0975("Expected to receive a Resource<R> with an object of " + this.f2042 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2162.get();
                    try {
                        if (obj == null || !this.f2042.isAssignableFrom(obj.getClass())) {
                            this.f2055 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f2042);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2162);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m1153(new C0975(sb.toString()), 5);
                        } else {
                            InterfaceC0131 interfaceC0131 = this.f2067;
                            if (interfaceC0131 == null || interfaceC0131.mo455(this)) {
                                m1152(interfaceC2162, obj, i);
                                return;
                            } else {
                                this.f2055 = null;
                                this.f2061 = 4;
                            }
                        }
                        this.f2049.getClass();
                        C2620.m4726(interfaceC2162);
                    } catch (Throwable th) {
                        interfaceC21622 = interfaceC2162;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC21622 != null) {
                this.f2049.getClass();
                C2620.m4726(interfaceC21622);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m1152(InterfaceC2162 interfaceC2162, Object obj, int i) {
        boolean zMo1494;
        InterfaceC0131 interfaceC0131 = this.f2067;
        if (interfaceC0131 != null) {
            interfaceC0131.getRoot().mo452();
        }
        this.f2061 = 4;
        this.f2055 = interfaceC2162;
        this.f2066.getClass();
        if (interfaceC0131 != null) {
            interfaceC0131.mo453(this);
        }
        this.f2053 = true;
        try {
            List list = this.f2041;
            if (list != null) {
                Iterator it = list.iterator();
                zMo1494 = false;
                while (it.hasNext()) {
                    zMo1494 |= ((InterfaceC0609) it.next()).mo1494(obj);
                }
            } else {
                zMo1494 = false;
            }
            if (!zMo1494) {
                this.f2050.getClass();
                this.f2043.mo2329(obj);
            }
            this.f2053 = false;
        } catch (Throwable th) {
            this.f2053 = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:14:0x0059, B:16:0x005d, B:17:0x0061, B:19:0x0067, B:21:0x0071, B:22:0x0079, B:25:0x007f, B:27:0x0083, B:33:0x008e, B:35:0x0092, B:37:0x0096, B:40:0x00a0, B:42:0x00a4, B:44:0x00af, B:48:0x00c5, B:49:0x00c9), top: B:58:0x0059, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:14:0x0059, B:16:0x005d, B:17:0x0061, B:19:0x0067, B:21:0x0071, B:22:0x0079, B:25:0x007f, B:27:0x0083, B:33:0x008e, B:35:0x0092, B:37:0x0096, B:40:0x00a0, B:42:0x00a4, B:44:0x00af, B:48:0x00c5, B:49:0x00c9), top: B:58:0x0059, outer: #0 }] */
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1153(C0975 c0975, int i) {
        Drawable drawableM1154;
        this.f2052.m2395();
        synchronized (this.f2064) {
            try {
                c0975.getClass();
                this.f2066.getClass();
                if (4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f2056 + "] with dimensions [" + this.f2047 + "x" + this.f2068 + "]", c0975);
                    c0975.m2122();
                }
                Drawable drawableM3184 = null;
                this.f2051 = null;
                this.f2061 = 5;
                InterfaceC0131 interfaceC0131 = this.f2067;
                if (interfaceC0131 != null) {
                    interfaceC0131.mo451(this);
                }
                boolean z = true;
                this.f2053 = true;
                try {
                    List<InterfaceC0609> list = this.f2041;
                    if (list != null) {
                        for (InterfaceC0609 interfaceC0609 : list) {
                            InterfaceC0131 interfaceC01312 = this.f2067;
                            if (interfaceC01312 != null) {
                                interfaceC01312.getRoot().mo452();
                            }
                            interfaceC0609.mo1495(c0975);
                        }
                    }
                    InterfaceC0131 interfaceC01313 = this.f2067;
                    if (interfaceC01313 != null && !interfaceC01313.mo459(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f2056 != null) {
                            drawableM1154 = null;
                            if (drawableM1154 == null) {
                                Drawable drawable = this.f2058;
                                if (drawable == null) {
                                    AbstractC0793 abstractC0793 = this.f2045;
                                    abstractC0793.getClass();
                                    this.f2058 = null;
                                    int i2 = abstractC0793.f3646;
                                    if (i2 > 0) {
                                        Context context = this.f2046;
                                        this.f2045.getClass();
                                        drawableM3184 = AbstractC1544.m3184(context, context, i2, context.getTheme());
                                        this.f2058 = drawableM3184;
                                    }
                                } else {
                                    drawableM3184 = drawable;
                                }
                                drawableM1154 = drawableM3184;
                            }
                            if (drawableM1154 == null) {
                                drawableM1154 = m1154();
                            }
                            this.f2043.mo1200(drawableM1154);
                        } else {
                            drawableM1154 = this.f2054;
                            if (drawableM1154 == null) {
                                this.f2045.getClass();
                                this.f2054 = null;
                                drawableM1154 = null;
                            }
                            if (drawableM1154 == null) {
                            }
                            if (drawableM1154 == null) {
                            }
                            this.f2043.mo1200(drawableM1154);
                        }
                    }
                } finally {
                    this.f2053 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo457() {
        boolean z;
        synchronized (this.f2064) {
            z = this.f2061 == 6;
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo458() {
        synchronized (this.f2064) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Drawable m1154() {
        Drawable drawable = this.f2057;
        if (drawable != null) {
            return drawable;
        }
        AbstractC0793 abstractC0793 = this.f2045;
        abstractC0793.getClass();
        this.f2057 = null;
        int i = abstractC0793.f3639;
        if (i <= 0) {
            return null;
        }
        abstractC0793.getClass();
        Context context = this.f2046;
        Drawable drawableM3184 = AbstractC1544.m3184(context, context, i, context.getTheme());
        this.f2057 = drawableM3184;
        return drawableM3184;
    }
}
