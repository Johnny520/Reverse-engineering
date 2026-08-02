package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yq2 implements l82 {

    /* JADX INFO: renamed from: C */
    public static final boolean f13566C = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    public final RuntimeException f13567A;

    /* JADX INFO: renamed from: B */
    public int f13568B;

    /* JADX INFO: renamed from: a */
    public final String f13569a;

    /* JADX INFO: renamed from: b */
    public final su2 f13570b;

    /* JADX INFO: renamed from: c */
    public final Object f13571c;

    /* JADX INFO: renamed from: d */
    public final t82 f13572d;

    /* JADX INFO: renamed from: e */
    public final Context f13573e;

    /* JADX INFO: renamed from: f */
    public final vp0 f13574f;

    /* JADX INFO: renamed from: g */
    public final Object f13575g;

    /* JADX INFO: renamed from: h */
    public final Class f13576h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0849wj f13577i;

    /* JADX INFO: renamed from: j */
    public final int f13578j;

    /* JADX INFO: renamed from: k */
    public final int f13579k;

    /* JADX INFO: renamed from: l */
    public final i32 f13580l;

    /* JADX INFO: renamed from: m */
    public final by2 f13581m;

    /* JADX INFO: renamed from: n */
    public final List f13582n;

    /* JADX INFO: renamed from: o */
    public final i51 f13583o;

    /* JADX INFO: renamed from: p */
    public final dh0 f13584p;

    /* JADX INFO: renamed from: q */
    public d92 f13585q;

    /* JADX INFO: renamed from: r */
    public C0043b5 f13586r;

    /* JADX INFO: renamed from: s */
    public long f13587s;

    /* JADX INFO: renamed from: t */
    public volatile bf0 f13588t;

    /* JADX INFO: renamed from: u */
    public Drawable f13589u;

    /* JADX INFO: renamed from: v */
    public Drawable f13590v;

    /* JADX INFO: renamed from: w */
    public Drawable f13591w;

    /* JADX INFO: renamed from: x */
    public int f13592x;

    /* JADX INFO: renamed from: y */
    public int f13593y;

    /* JADX INFO: renamed from: z */
    public boolean f13594z;

    public yq2(Context context, vp0 vp0Var, Object obj, Object obj2, Class cls, AbstractC0849wj abstractC0849wj, int i, int i2, i32 i32Var, by2 by2Var, ArrayList arrayList, t82 t82Var, bf0 bf0Var, i51 i51Var) {
        dh0 dh0Var = up0.f11395c;
        this.f13569a = f13566C ? String.valueOf(System.identityHashCode(this)) : null;
        this.f13570b = new su2();
        this.f13571c = obj;
        this.f13573e = context;
        this.f13574f = vp0Var;
        this.f13575g = obj2;
        this.f13576h = cls;
        this.f13577i = abstractC0849wj;
        this.f13578j = i;
        this.f13579k = i2;
        this.f13580l = i32Var;
        this.f13581m = by2Var;
        this.f13582n = arrayList;
        this.f13572d = t82Var;
        this.f13588t = bf0Var;
        this.f13583o = i51Var;
        this.f13584p = dh0Var;
        this.f13568B = 1;
        if (this.f13567A == null && ((Map) vp0Var.f12106h.f6983i).containsKey(qp0.class)) {
            this.f13567A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: a */
    public final boolean mo1018a() {
        boolean z;
        synchronized (this.f13571c) {
            z = this.f13568B == 4;
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: b */
    public final boolean mo1019b(l82 l82Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0849wj abstractC0849wj;
        i32 i32Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0849wj abstractC0849wj2;
        i32 i32Var2;
        int size2;
        if (!(l82Var instanceof yq2)) {
            return false;
        }
        synchronized (this.f13571c) {
            try {
                i = this.f13578j;
                i2 = this.f13579k;
                obj = this.f13575g;
                cls = this.f13576h;
                abstractC0849wj = this.f13577i;
                i32Var = this.f13580l;
                List list = this.f13582n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        yq2 yq2Var = (yq2) l82Var;
        synchronized (yq2Var.f13571c) {
            try {
                i3 = yq2Var.f13578j;
                i4 = yq2Var.f13579k;
                obj2 = yq2Var.f13575g;
                cls2 = yq2Var.f13576h;
                abstractC0849wj2 = yq2Var.f13577i;
                i32Var2 = yq2Var.f13580l;
                List list2 = yq2Var.f13582n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = b93.f747a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC0849wj == null ? abstractC0849wj2 == null : abstractC0849wj.m5909j(abstractC0849wj2)) && i32Var == i32Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m6305c() {
        if (this.f13594z) {
            C0676s.m4653l("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f13570b.m5003a();
        this.f13581m.mo600g(this);
        C0043b5 c0043b5 = this.f13586r;
        if (c0043b5 != null) {
            synchronized (((bf0) c0043b5.f564k)) {
                ((ff0) c0043b5.f562i).m1606g((yq2) c0043b5.f563j);
            }
            this.f13586r = null;
        }
    }

    @Override // p000.l82
    public final void clear() {
        synchronized (this.f13571c) {
            try {
                if (this.f13594z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f13570b.m5003a();
                if (this.f13568B == 6) {
                    return;
                }
                m6305c();
                d92 d92Var = this.f13585q;
                if (d92Var != null) {
                    this.f13585q = null;
                } else {
                    d92Var = null;
                }
                t82 t82Var = this.f13572d;
                if (t82Var == null || t82Var.mo1020c(this)) {
                    this.f13581m.mo605v(m6306d());
                }
                this.f13568B = 6;
                if (d92Var != null) {
                    this.f13588t.getClass();
                    bf0.m523g(d92Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m6306d() {
        if (this.f13590v == null) {
            AbstractC0849wj abstractC0849wj = this.f13577i;
            abstractC0849wj.getClass();
            this.f13590v = null;
            int i = abstractC0849wj.f12526l;
            if (i > 0) {
                abstractC0849wj.getClass();
                Context context = this.f13573e;
                this.f13590v = sc0.m4790a(context, context, i, context.getTheme());
            }
        }
        return this.f13590v;
    }

    /* JADX INFO: renamed from: e */
    public final void m6307e(String str) {
        Log.v("GlideRequest", str + " this: " + this.f13569a);
    }

    /* JADX INFO: renamed from: f */
    public final void m6308f(xp0 xp0Var, int i) {
        Drawable drawableM6306d;
        this.f13570b.m5003a();
        synchronized (this.f13571c) {
            try {
                xp0Var.getClass();
                int i2 = this.f13574f.f12107i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f13575g + "] with dimensions [" + this.f13592x + "x" + this.f13593y + "]", xp0Var);
                    if (i2 <= 4) {
                        xp0Var.m6168d();
                    }
                }
                this.f13586r = null;
                this.f13568B = 5;
                t82 t82Var = this.f13572d;
                if (t82Var != null) {
                    t82Var.mo1022e(this);
                }
                boolean z = true;
                this.f13594z = true;
                try {
                    List list = this.f13582n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            t82 t82Var2 = this.f13572d;
                            if (t82Var2 == null) {
                                throw null;
                            }
                            t82Var2.getRoot().mo1018a();
                            throw null;
                        }
                    }
                    t82 t82Var3 = this.f13572d;
                    if (t82Var3 != null && !t82Var3.mo1021d(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f13575g == null) {
                            if (this.f13591w == null) {
                                this.f13577i.getClass();
                                this.f13591w = null;
                            }
                            drawableM6306d = this.f13591w;
                        } else {
                            drawableM6306d = null;
                        }
                        if (drawableM6306d == null) {
                            if (this.f13589u == null) {
                                AbstractC0849wj abstractC0849wj = this.f13577i;
                                abstractC0849wj.getClass();
                                this.f13589u = null;
                                int i3 = abstractC0849wj.f12525k;
                                if (i3 > 0) {
                                    Context context = this.f13573e;
                                    this.f13577i.getClass();
                                    this.f13589u = sc0.m4790a(context, context, i3, context.getTheme());
                                }
                            }
                            drawableM6306d = this.f13589u;
                        }
                        if (drawableM6306d == null) {
                            drawableM6306d = m6306d();
                        }
                        this.f13581m.mo599f(drawableM6306d);
                    }
                } finally {
                    this.f13594z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6309g(d92 d92Var, int i) {
        this.f13570b.m5003a();
        d92 d92Var2 = null;
        try {
            synchronized (this.f13571c) {
                try {
                    this.f13586r = null;
                    if (d92Var == null) {
                        m6308f(new xp0("Expected to receive a Resource<R> with an object of " + this.f13576h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = d92Var.get();
                    try {
                        if (obj == null || !this.f13576h.isAssignableFrom(obj.getClass())) {
                            this.f13585q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f13576h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(d92Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m6308f(new xp0(sb.toString()), 5);
                        } else {
                            t82 t82Var = this.f13572d;
                            if (t82Var == null || t82Var.mo1023f(this)) {
                                m6310k(d92Var, obj, i);
                                return;
                            } else {
                                this.f13585q = null;
                                this.f13568B = 4;
                            }
                        }
                        this.f13588t.getClass();
                        bf0.m523g(d92Var);
                    } catch (Throwable th) {
                        d92Var2 = d92Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (d92Var2 != null) {
                this.f13588t.getClass();
                bf0.m523g(d92Var2);
            }
            throw th3;
        }
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: h */
    public final boolean mo1025h() {
        boolean z;
        synchronized (this.f13571c) {
            z = this.f13568B == 6;
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: i */
    public final void mo1026i() {
        synchronized (this.f13571c) {
            try {
                if (this.f13594z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f13570b.m5003a();
                int i = tc1.f10678b;
                this.f13587s = SystemClock.elapsedRealtimeNanos();
                if (this.f13575g == null) {
                    if (b93.m502i(this.f13578j, this.f13579k)) {
                        this.f13592x = this.f13578j;
                        this.f13593y = this.f13579k;
                    }
                    if (this.f13591w == null) {
                        this.f13577i.getClass();
                        this.f13591w = null;
                    }
                    m6308f(new xp0("Received null model"), this.f13591w == null ? 5 : 3);
                    return;
                }
                int i2 = this.f13568B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m6309g(this.f13585q, 5);
                    return;
                }
                List list = this.f13582n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f13568B = 3;
                if (b93.m502i(this.f13578j, this.f13579k)) {
                    m6311l(this.f13578j, this.f13579k);
                } else {
                    this.f13581m.mo601m(this);
                }
                int i3 = this.f13568B;
                if (i3 == 2 || i3 == 3) {
                    t82 t82Var = this.f13572d;
                    if (t82Var == null || t82Var.mo1021d(this)) {
                        this.f13581m.mo603p(m6306d());
                    }
                }
                if (f13566C) {
                    m6307e("finished run method in " + tc1.m5161a(this.f13587s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13571c) {
            int i = this.f13568B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // p000.l82
    /* JADX INFO: renamed from: j */
    public final boolean mo1027j() {
        boolean z;
        synchronized (this.f13571c) {
            z = this.f13568B == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m6310k(d92 d92Var, Object obj, int i) {
        t82 t82Var = this.f13572d;
        if (t82Var != null) {
            t82Var.getRoot().mo1018a();
        }
        this.f13568B = 4;
        this.f13585q = d92Var;
        if (this.f13574f.f12107i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + vi0.m5703v(i) + " for " + this.f13575g + " with size [" + this.f13592x + "x" + this.f13593y + "] in " + tc1.m5161a(this.f13587s) + " ms");
        }
        if (t82Var != null) {
            t82Var.mo1024g(this);
        }
        this.f13594z = true;
        try {
            List list = this.f13582n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f13583o.getClass();
            this.f13581m.mo606w(obj);
            this.f13594z = false;
        } catch (Throwable th) {
            this.f13594z = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6311l(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f13570b.m5003a();
        Object obj2 = this.f13571c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f13566C;
                    if (z) {
                        m6307e("Got onSizeReady in " + tc1.m5161a(this.f13587s));
                    }
                    if (this.f13568B != 3) {
                        return;
                    }
                    this.f13568B = 2;
                    this.f13577i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.f13592x = iRound;
                    this.f13593y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        m6307e("finished setup for calling load in " + tc1.m5161a(this.f13587s));
                    }
                    bf0 bf0Var = this.f13588t;
                    vp0 vp0Var = this.f13574f;
                    Object obj3 = this.f13575g;
                    AbstractC0849wj abstractC0849wj = this.f13577i;
                    try {
                        try {
                            try {
                                try {
                                    this.f13586r = bf0Var.m524a(vp0Var, obj3, abstractC0849wj.f12530p, this.f13592x, this.f13593y, abstractC0849wj.f12534t, this.f13576h, this.f13580l, abstractC0849wj.f12523i, abstractC0849wj.f12533s, abstractC0849wj.f12531q, abstractC0849wj.f12537w, abstractC0849wj.f12532r, abstractC0849wj.f12527m, abstractC0849wj.f12538x, this, this.f13584p);
                                    if (this.f13568B != 2) {
                                        this.f13586r = null;
                                    }
                                    if (z) {
                                        m6307e("finished onSizeReady in " + tc1.m5161a(this.f13587s));
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

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f13571c) {
            obj = this.f13575g;
            cls = this.f13576h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
