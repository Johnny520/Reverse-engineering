package defpackage;

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
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;
    public final String a;
    public final su2 b;
    public final Object c;
    public final t82 d;
    public final Context e;
    public final vp0 f;
    public final Object g;
    public final Class h;
    public final wj i;
    public final int j;
    public final int k;
    public final i32 l;
    public final by2 m;
    public final List n;
    public final i51 o;
    public final dh0 p;
    public d92 q;
    public b5 r;
    public long s;
    public volatile bf0 t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yq2(Context context, vp0 vp0Var, Object obj, Object obj2, Class cls, wj wjVar, int i, int i2, i32 i32Var, by2 by2Var, ArrayList arrayList, t82 t82Var, bf0 bf0Var, i51 i51Var) {
        dh0 dh0Var = up0.c;
        this.a = C ? String.valueOf(System.identityHashCode(this)) : null;
        this.b = new su2();
        this.c = obj;
        this.e = context;
        this.f = vp0Var;
        this.g = obj2;
        this.h = cls;
        this.i = wjVar;
        this.j = i;
        this.k = i2;
        this.l = i32Var;
        this.m = by2Var;
        this.n = arrayList;
        this.d = t82Var;
        this.t = bf0Var;
        this.o = i51Var;
        this.p = dh0Var;
        this.B = 1;
        if (this.A == null && ((Map) vp0Var.h.i).containsKey(qp0.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean b(l82 l82Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        wj wjVar;
        i32 i32Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        wj wjVar2;
        i32 i32Var2;
        int size2;
        if (!(l82Var instanceof yq2)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                wjVar = this.i;
                i32Var = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        yq2 yq2Var = (yq2) l82Var;
        synchronized (yq2Var.c) {
            try {
                i3 = yq2Var.j;
                i4 = yq2Var.k;
                obj2 = yq2Var.g;
                cls2 = yq2Var.h;
                wjVar2 = yq2Var.i;
                i32Var2 = yq2Var.l;
                List list2 = yq2Var.n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = b93.a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((wjVar == null ? wjVar2 == null : wjVar.j(wjVar2)) && i32Var == i32Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.z) {
            s.l("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.m.g(this);
        b5 b5Var = this.r;
        if (b5Var != null) {
            synchronized (((bf0) b5Var.k)) {
                ((ff0) b5Var.i).g((yq2) b5Var.j);
            }
            this.r = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                if (this.B == 6) {
                    return;
                }
                c();
                d92 d92Var = this.q;
                if (d92Var != null) {
                    this.q = null;
                } else {
                    d92Var = null;
                }
                t82 t82Var = this.d;
                if (t82Var == null || t82Var.c(this)) {
                    this.m.v(d());
                }
                this.B = 6;
                if (d92Var != null) {
                    this.t.getClass();
                    bf0.g(d92Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Drawable d() {
        if (this.v == null) {
            wj wjVar = this.i;
            wjVar.getClass();
            this.v = null;
            int i = wjVar.l;
            if (i > 0) {
                wjVar.getClass();
                Context context = this.e;
                this.v = sc0.a(context, context, i, context.getTheme());
            }
        }
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String str) {
        Log.v("GlideRequest", str + " this: " + this.a);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, IPUT] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(xp0 xp0Var, int i) {
        Drawable drawableD;
        this.b.a();
        synchronized (this.c) {
            try {
                xp0Var.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", xp0Var);
                    if (i2 <= 4) {
                        xp0Var.d();
                    }
                }
                this.r = null;
                this.B = 5;
                t82 t82Var = this.d;
                if (t82Var != null) {
                    t82Var.e(this);
                }
                boolean z = true;
                this.z = true;
                try {
                    List list = this.n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            t82 t82Var2 = this.d;
                            if (t82Var2 == null) {
                                throw null;
                            }
                            t82Var2.getRoot().a();
                            throw null;
                        }
                    }
                    t82 t82Var3 = this.d;
                    if (t82Var3 != null && !t82Var3.d(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.g == null) {
                            if (this.w == null) {
                                this.i.getClass();
                                this.w = null;
                            }
                            drawableD = this.w;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.u == null) {
                                wj wjVar = this.i;
                                wjVar.getClass();
                                this.u = null;
                                int i3 = wjVar.k;
                                if (i3 > 0) {
                                    Context context = this.e;
                                    this.i.getClass();
                                    this.u = sc0.a(context, context, i3, context.getTheme());
                                }
                            }
                            drawableD = this.u;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.m.f(drawableD);
                    }
                } finally {
                    this.z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(d92 d92Var, int i) {
        this.b.a();
        d92 d92Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (d92Var == null) {
                        f(new xp0("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = d92Var.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(d92Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            f(new xp0(sb.toString()), 5);
                        } else {
                            t82 t82Var = this.d;
                            if (t82Var == null || t82Var.f(this)) {
                                k(d92Var, obj, i);
                                return;
                            } else {
                                this.q = null;
                                this.B = 4;
                            }
                        }
                        this.t.getClass();
                        bf0.g(d92Var);
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
                this.t.getClass();
                bf0.g(d92Var2);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean h() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final void i() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = tc1.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (b93.i(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.i.getClass();
                        this.w = null;
                    }
                    f(new xp0("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i2 = this.B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    g(this.q, 5);
                    return;
                }
                List list = this.n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.B = 3;
                if (b93.i(this.j, this.k)) {
                    l(this.j, this.k);
                } else {
                    this.m.m(this);
                }
                int i3 = this.B;
                if (i3 == 2 || i3 == 3) {
                    t82 t82Var = this.d;
                    if (t82Var == null || t82Var.d(this)) {
                        this.m.p(d());
                    }
                }
                if (C) {
                    e("finished run method in " + tc1.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l82
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(d92 d92Var, Object obj, int i) {
        t82 t82Var = this.d;
        if (t82Var != null) {
            t82Var.getRoot().a();
        }
        this.B = 4;
        this.q = d92Var;
        if (this.f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + vi0.v(i) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + tc1.a(this.s) + " ms");
        }
        if (t82Var != null) {
            t82Var.g(this);
        }
        this.z = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.o.getClass();
            this.m.w(obj);
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        e("Got onSizeReady in " + tc1.a(this.s));
                    }
                    if (this.B != 3) {
                        return;
                    }
                    this.B = 2;
                    this.i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.x = iRound;
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        e("finished setup for calling load in " + tc1.a(this.s));
                    }
                    bf0 bf0Var = this.t;
                    vp0 vp0Var = this.f;
                    Object obj3 = this.g;
                    wj wjVar = this.i;
                    try {
                        try {
                            try {
                                try {
                                    this.r = bf0Var.a(vp0Var, obj3, wjVar.p, this.x, this.y, wjVar.t, this.h, this.l, wjVar.i, wjVar.s, wjVar.q, wjVar.w, wjVar.r, wjVar.m, wjVar.x, this, this.p);
                                    if (this.B != 2) {
                                        this.r = null;
                                    }
                                    if (z) {
                                        e("finished onSizeReady in " + tc1.a(this.s));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
