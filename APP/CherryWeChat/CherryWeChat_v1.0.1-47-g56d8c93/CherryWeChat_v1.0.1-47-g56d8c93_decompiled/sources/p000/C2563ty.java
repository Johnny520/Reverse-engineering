package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ty */
/* JADX INFO: loaded from: classes.dex */
public final class C2563ty implements InterfaceC1026Xv, InterfaceC0041Ay {

    /* JADX INFO: renamed from: A */
    public static final boolean f8883A = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: a */
    public final C1432fz f8884a;

    /* JADX INFO: renamed from: b */
    public final Object f8885b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1237bw f8886c;

    /* JADX INFO: renamed from: d */
    public final Context f8887d;

    /* JADX INFO: renamed from: e */
    public final C0756Rj f8888e;

    /* JADX INFO: renamed from: f */
    public final Object f8889f;

    /* JADX INFO: renamed from: g */
    public final Class f8890g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2743y5 f8891h;

    /* JADX INFO: renamed from: i */
    public final int f8892i;

    /* JADX INFO: renamed from: j */
    public final int f8893j;

    /* JADX INFO: renamed from: k */
    public final EnumC2688wu f8894k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1444gA f8895l;

    /* JADX INFO: renamed from: m */
    public final List f8896m;

    /* JADX INFO: renamed from: n */
    public final C0668Pg f8897n;

    /* JADX INFO: renamed from: o */
    public final ExecutorC2346p3 f8898o;

    /* JADX INFO: renamed from: p */
    public InterfaceC2389pw f8899p;

    /* JADX INFO: renamed from: q */
    public C2656w4 f8900q;

    /* JADX INFO: renamed from: r */
    public volatile C1264cg f8901r;

    /* JADX INFO: renamed from: s */
    public Drawable f8902s;

    /* JADX INFO: renamed from: t */
    public Drawable f8903t;

    /* JADX INFO: renamed from: u */
    public Drawable f8904u;

    /* JADX INFO: renamed from: v */
    public int f8905v;

    /* JADX INFO: renamed from: w */
    public int f8906w;

    /* JADX INFO: renamed from: x */
    public boolean f8907x;

    /* JADX INFO: renamed from: y */
    public final RuntimeException f8908y;

    /* JADX INFO: renamed from: z */
    public int f8909z;

    public C2563ty(Context context, C0756Rj c0756Rj, Object obj, Object obj2, Class cls, AbstractC2743y5 abstractC2743y5, int i, int i2, EnumC2688wu enumC2688wu, InterfaceC1444gA interfaceC1444gA, ArrayList arrayList, InterfaceC1237bw interfaceC1237bw, C1264cg c1264cg, C0668Pg c0668Pg) {
        ExecutorC2346p3 executorC2346p3 = AbstractC0671Pj.f2139b;
        if (f8883A) {
            String.valueOf(hashCode());
        }
        this.f8884a = new C1432fz();
        this.f8885b = obj;
        this.f8887d = context;
        this.f8888e = c0756Rj;
        this.f8889f = obj2;
        this.f8890g = cls;
        this.f8891h = abstractC2743y5;
        this.f8892i = i;
        this.f8893j = i2;
        this.f8894k = enumC2688wu;
        this.f8895l = interfaceC1444gA;
        this.f8896m = arrayList;
        this.f8886c = interfaceC1237bw;
        this.f8901r = c1264cg;
        this.f8897n = c0668Pg;
        this.f8898o = executorC2346p3;
        this.f8909z = 1;
        if (this.f8908y == null && ((Map) c0756Rj.f2403h.f328b).containsKey(AbstractC0628Oj.class)) {
            this.f8908y = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5045a() {
        if (this.f8907x) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f8884a.m2744a();
        this.f8895l.mo395e(this);
        C2656w4 c2656w4 = this.f8900q;
        if (c2656w4 != null) {
            synchronized (((C1264cg) c2656w4.f9198d)) {
                ((C1544ig) c2656w4.f9196b).m2963h((C2563ty) c2656w4.f9197c);
            }
            this.f8900q = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m5046b() {
        if (this.f8903t == null) {
            AbstractC2743y5 abstractC2743y5 = this.f8891h;
            abstractC2743y5.getClass();
            this.f8903t = null;
            int i = abstractC2743y5.f9356e;
            if (i > 0) {
                abstractC2743y5.getClass();
                Context context = this.f8887d;
                this.f8903t = AbstractC0148Dc.m277k(context, context, i, context.getTheme());
            }
        }
        return this.f8903t;
    }

    /* JADX INFO: renamed from: c */
    public final void m5047c(C0842Tj c0842Tj, int i) {
        Drawable drawableM5046b;
        this.f8884a.m2744a();
        synchronized (this.f8885b) {
            try {
                c0842Tj.getClass();
                int i2 = this.f8888e.f2404i;
                if (i2 <= i) {
                    Objects.toString(this.f8889f);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C0842Tj.m1666a(c0842Tj, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.f8900q = null;
                this.f8909z = 5;
                InterfaceC1237bw interfaceC1237bw = this.f8886c;
                if (interfaceC1237bw != null) {
                    interfaceC1237bw.mo2358c(this);
                }
                boolean z = true;
                this.f8907x = true;
                try {
                    List<C1461gk> list = this.f8896m;
                    if (list != null) {
                        for (C1461gk c1461gk : list) {
                            InterfaceC1237bw interfaceC1237bw2 = this.f8886c;
                            if (interfaceC1237bw2 != null) {
                                interfaceC1237bw2.getRoot().mo1938e();
                            }
                            switch (c1461gk.f5179a) {
                                case 0:
                                    AbstractC0295Gu.m625r(-71786083383349L);
                                    break;
                                case 1:
                                    ((ProgressBar) c1461gk.f5180b).setVisibility(8);
                                    break;
                                default:
                                    ((C0441KA) c1461gk.f5180b).itemView.requestLayout();
                                    break;
                            }
                        }
                    }
                    InterfaceC1237bw interfaceC1237bw3 = this.f8886c;
                    if (interfaceC1237bw3 != null && !interfaceC1237bw3.mo2357b(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f8889f == null) {
                            if (this.f8904u == null) {
                                this.f8891h.getClass();
                                this.f8904u = null;
                            }
                            drawableM5046b = this.f8904u;
                        } else {
                            drawableM5046b = null;
                        }
                        if (drawableM5046b == null) {
                            if (this.f8902s == null) {
                                AbstractC2743y5 abstractC2743y5 = this.f8891h;
                                abstractC2743y5.getClass();
                                this.f8902s = null;
                                int i5 = abstractC2743y5.f9355d;
                                if (i5 > 0) {
                                    Context context = this.f8887d;
                                    this.f8891h.getClass();
                                    this.f8902s = AbstractC0148Dc.m277k(context, context, i5, context.getTheme());
                                }
                            }
                            drawableM5046b = this.f8902s;
                        }
                        if (drawableM5046b == null) {
                            drawableM5046b = m5046b();
                        }
                        this.f8895l.mo393c(drawableM5046b);
                    }
                } finally {
                    this.f8907x = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    public final void clear() {
        synchronized (this.f8885b) {
            try {
                if (this.f8907x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8884a.m2744a();
                if (this.f8909z == 6) {
                    return;
                }
                m5045a();
                InterfaceC2389pw interfaceC2389pw = this.f8899p;
                if (interfaceC2389pw != null) {
                    this.f8899p = null;
                } else {
                    interfaceC2389pw = null;
                }
                InterfaceC1237bw interfaceC1237bw = this.f8886c;
                if (interfaceC1237bw == null || interfaceC1237bw.mo2356a(this)) {
                    this.f8895l.mo399i(m5046b());
                }
                this.f8909z = 6;
                if (interfaceC2389pw != null) {
                    this.f8901r.getClass();
                    C1264cg.m2400e(interfaceC2389pw);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: d */
    public final void mo1937d() {
        synchronized (this.f8885b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: e */
    public final boolean mo1938e() {
        boolean z;
        synchronized (this.f8885b) {
            z = this.f8909z == 4;
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: f */
    public final boolean mo1939f(InterfaceC1026Xv interfaceC1026Xv) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC2743y5 abstractC2743y5;
        EnumC2688wu enumC2688wu;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC2743y5 abstractC2743y52;
        EnumC2688wu enumC2688wu2;
        int size2;
        if (!(interfaceC1026Xv instanceof C2563ty)) {
            return false;
        }
        synchronized (this.f8885b) {
            try {
                i = this.f8892i;
                i2 = this.f8893j;
                obj = this.f8889f;
                cls = this.f8890g;
                abstractC2743y5 = this.f8891h;
                enumC2688wu = this.f8894k;
                List list = this.f8896m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C2563ty c2563ty = (C2563ty) interfaceC1026Xv;
        synchronized (c2563ty.f8885b) {
            try {
                i3 = c2563ty.f8892i;
                i4 = c2563ty.f8893j;
                obj2 = c2563ty.f8889f;
                cls2 = c2563ty.f8890g;
                abstractC2743y52 = c2563ty.f8891h;
                enumC2688wu2 = c2563ty.f8894k;
                List list2 = c2563ty.f8896m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC2622vD.f9104a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC2743y5 == null ? abstractC2743y52 == null : abstractC2743y5.m5313g(abstractC2743y52)) && enumC2688wu == enumC2688wu2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m5048g(InterfaceC2389pw interfaceC2389pw, int i, boolean z) {
        this.f8884a.m2744a();
        InterfaceC2389pw interfaceC2389pw2 = null;
        try {
            synchronized (this.f8885b) {
                try {
                    this.f8900q = null;
                    if (interfaceC2389pw == null) {
                        m5047c(new C0842Tj("Expected to receive a Resource<R> with an object of " + this.f8890g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2389pw.get();
                    try {
                        if (obj == null || !this.f8890g.isAssignableFrom(obj.getClass())) {
                            this.f8899p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f8890g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2389pw);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m5047c(new C0842Tj(sb.toString()), 5);
                        } else {
                            InterfaceC1237bw interfaceC1237bw = this.f8886c;
                            if (interfaceC1237bw == null || interfaceC1237bw.mo2359g(this)) {
                                m5049h(interfaceC2389pw, obj, i);
                                return;
                            } else {
                                this.f8899p = null;
                                this.f8909z = 4;
                            }
                        }
                        this.f8901r.getClass();
                        C1264cg.m2400e(interfaceC2389pw);
                    } catch (Throwable th) {
                        interfaceC2389pw2 = interfaceC2389pw;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC2389pw2 != null) {
                this.f8901r.getClass();
                C1264cg.m2400e(interfaceC2389pw2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5049h(InterfaceC2389pw interfaceC2389pw, Object obj, int i) {
        InterfaceC1237bw interfaceC1237bw = this.f8886c;
        if (interfaceC1237bw != null) {
            interfaceC1237bw.getRoot().mo1938e();
        }
        this.f8909z = 4;
        this.f8899p = interfaceC2389pw;
        if (this.f8888e.f2404i <= 3) {
            Objects.toString(this.f8889f);
            int i2 = AbstractC1510hp.f5351a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (interfaceC1237bw != null) {
            interfaceC1237bw.mo2360h(this);
        }
        this.f8907x = true;
        try {
            List list = this.f8896m;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C1461gk) it.next()).m2815a(obj);
                }
            }
            this.f8897n.getClass();
            this.f8895l.mo400j(obj);
            this.f8907x = false;
        } catch (Throwable th) {
            this.f8907x = false;
            throw th;
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: i */
    public final boolean mo1940i() {
        boolean z;
        synchronized (this.f8885b) {
            z = this.f8909z == 6;
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f8885b) {
            int i = this.f8909z;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: j */
    public final void mo1941j() {
        synchronized (this.f8885b) {
            try {
                if (this.f8907x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8884a.m2744a();
                int i = AbstractC1510hp.f5351a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f8889f == null) {
                    if (AbstractC2622vD.m5138i(this.f8892i, this.f8893j)) {
                        this.f8905v = this.f8892i;
                        this.f8906w = this.f8893j;
                    }
                    if (this.f8904u == null) {
                        this.f8891h.getClass();
                        this.f8904u = null;
                    }
                    m5047c(new C0842Tj("Received null model"), this.f8904u == null ? 5 : 3);
                    return;
                }
                int i2 = this.f8909z;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m5048g(this.f8899p, 5, false);
                    return;
                }
                List<C1461gk> list = this.f8896m;
                if (list != null) {
                    for (C1461gk c1461gk : list) {
                    }
                }
                this.f8909z = 3;
                if (AbstractC2622vD.m5138i(this.f8892i, this.f8893j)) {
                    m5050l(this.f8892i, this.f8893j);
                } else {
                    this.f8895l.mo396f(this);
                }
                int i3 = this.f8909z;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC1237bw interfaceC1237bw = this.f8886c;
                    if (interfaceC1237bw == null || interfaceC1237bw.mo2357b(this)) {
                        this.f8895l.mo398h(m5046b());
                    }
                }
                if (f8883A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1026Xv
    /* JADX INFO: renamed from: k */
    public final boolean mo1942k() {
        boolean z;
        synchronized (this.f8885b) {
            z = this.f8909z == 4;
        }
        return z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final void m5050l(int i, int i2) {
        Object obj;
        C2563ty c2563ty = this;
        int iRound = i;
        c2563ty.f8884a.m2744a();
        Object obj2 = c2563ty.f8885b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f8883A;
                    if (z) {
                        int i3 = AbstractC1510hp.f5351a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (c2563ty.f8909z == 3) {
                        c2563ty.f8909z = 2;
                        c2563ty.f8891h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c2563ty.f8905v = iRound;
                        c2563ty.f8906w = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            int i4 = AbstractC1510hp.f5351a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        C1264cg c1264cg = c2563ty.f8901r;
                        try {
                            C0756Rj c0756Rj = c2563ty.f8888e;
                            Object obj3 = c2563ty.f8889f;
                            AbstractC2743y5 abstractC2743y5 = c2563ty.f8891h;
                            try {
                                InterfaceC0802Sm interfaceC0802Sm = abstractC2743y5.f9360i;
                                int i5 = c2563ty.f8905v;
                                try {
                                    int i6 = c2563ty.f8906w;
                                    Class cls = abstractC2743y5.f9364m;
                                    try {
                                        Class cls2 = c2563ty.f8890g;
                                        EnumC2688wu enumC2688wu = c2563ty.f8894k;
                                        try {
                                            C0922Vd c0922Vd = abstractC2743y5.f9353b;
                                            C0007A6 c0007a6 = abstractC2743y5.f9363l;
                                            try {
                                                boolean z2 = abstractC2743y5.f9361j;
                                                boolean z3 = abstractC2743y5.f9367p;
                                                try {
                                                    C2644vt c2644vt = abstractC2743y5.f9362k;
                                                    boolean z4 = abstractC2743y5.f9357f;
                                                    boolean z5 = abstractC2743y5.f9368q;
                                                    ExecutorC2346p3 executorC2346p3 = c2563ty.f8898o;
                                                    Object obj4 = obj2;
                                                    try {
                                                        c2563ty.f8900q = c1264cg.m2401a(c0756Rj, obj3, interfaceC0802Sm, i5, i6, cls, cls2, enumC2688wu, c0922Vd, c0007a6, z2, z3, c2644vt, z4, z5, c2563ty, executorC2346p3);
                                                        if (c2563ty.f8909z != 2) {
                                                            c2563ty.f8900q = null;
                                                        }
                                                        if (z) {
                                                            int i7 = AbstractC1510hp.f5351a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = obj4;
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
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = c2563ty;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f8885b) {
            obj = this.f8889f;
            cls = this.f8890g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
