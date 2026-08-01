package p171h2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.C1927i;
import com.bumptech.glide.EnumC1928j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000A.C0072l0;
import p011B4.AbstractC0231b;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p088R1.C1211l;
import p088R1.C1214o;
import p088R1.C1218s;
import p088R1.C1224y;
import p088R1.InterfaceC1194D;
import p177i2.InterfaceC2312b;
import p177i2.InterfaceC2313c;
import p183j2.C2380a;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2505i;
import p195l2.AbstractC2511o;
import p195l2.C2499c;
import p195l2.ExecutorC2502f;
import p200m2.C2603d;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2239f implements InterfaceC2236c, InterfaceC2312b {

    /* JADX INFO: renamed from: B */
    public static final boolean f7316B = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    public int f7317A;

    /* JADX INFO: renamed from: a */
    public final String f7318a;

    /* JADX INFO: renamed from: b */
    public final C2603d f7319b;

    /* JADX INFO: renamed from: c */
    public final Object f7320c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2237d f7321d;

    /* JADX INFO: renamed from: e */
    public final C1927i f7322e;

    /* JADX INFO: renamed from: f */
    public final Object f7323f;

    /* JADX INFO: renamed from: g */
    public final Class f7324g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2234a f7325h;

    /* JADX INFO: renamed from: i */
    public final int f7326i;

    /* JADX INFO: renamed from: j */
    public final int f7327j;

    /* JADX INFO: renamed from: k */
    public final EnumC1928j f7328k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2313c f7329l;

    /* JADX INFO: renamed from: m */
    public final List f7330m;

    /* JADX INFO: renamed from: n */
    public final C2380a f7331n;

    /* JADX INFO: renamed from: o */
    public final ExecutorC2502f f7332o;

    /* JADX INFO: renamed from: p */
    public InterfaceC1194D f7333p;

    /* JADX INFO: renamed from: q */
    public C0072l0 f7334q;

    /* JADX INFO: renamed from: r */
    public long f7335r;

    /* JADX INFO: renamed from: s */
    public volatile C1214o f7336s;

    /* JADX INFO: renamed from: t */
    public Drawable f7337t;

    /* JADX INFO: renamed from: u */
    public Drawable f7338u;

    /* JADX INFO: renamed from: v */
    public Drawable f7339v;

    /* JADX INFO: renamed from: w */
    public int f7340w;

    /* JADX INFO: renamed from: x */
    public int f7341x;

    /* JADX INFO: renamed from: y */
    public boolean f7342y;

    /* JADX INFO: renamed from: z */
    public final RuntimeException f7343z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2239f(Context context, C1927i c1927i, Object obj, Object obj2, Class cls, AbstractC2234a abstractC2234a, int i5, int i6, EnumC1928j enumC1928j, InterfaceC2313c interfaceC2313c, ArrayList arrayList, InterfaceC2237d interfaceC2237d, C1214o c1214o, C2380a c2380a) {
        ExecutorC2502f executorC2502f = AbstractC2503g.f8015a;
        this.f7318a = f7316B ? String.valueOf(hashCode()) : null;
        this.f7319b = new C2603d();
        this.f7320c = obj;
        this.f7322e = c1927i;
        this.f7323f = obj2;
        this.f7324g = cls;
        this.f7325h = abstractC2234a;
        this.f7326i = i5;
        this.f7327j = i6;
        this.f7328k = enumC1928j;
        this.f7329l = interfaceC2313c;
        this.f7330m = arrayList;
        this.f7321d = interfaceC2237d;
        this.f7336s = c1214o;
        this.f7331n = c2380a;
        this.f7332o = executorC2502f;
        this.f7317A = 1;
        if (this.f7343z == null && ((Map) c1927i.f6544h.f6028e).containsKey(AbstractC1923e.class)) {
            this.f7343z = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: a */
    public final boolean mo4051a() {
        boolean z5;
        synchronized (this.f7320c) {
            z5 = this.f7317A == 4;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: b */
    public final boolean mo4052b() {
        boolean z5;
        synchronized (this.f7320c) {
            z5 = this.f7317A == 4;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4061c() {
        if (this.f7342y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f7319b.m4548a();
        this.f7329l.mo3383v(this);
        C0072l0 c0072l0 = this.f7334q;
        if (c0072l0 != null) {
            synchronized (((C1214o) c0072l0.f309g)) {
                ((C1218s) c0072l0.f307e).m2302h((C2239f) c0072l0.f308f);
            }
            this.f7334q = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    public final void clear() {
        synchronized (this.f7320c) {
            try {
                if (this.f7342y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f7319b.m4548a();
                if (this.f7317A == 6) {
                    return;
                }
                m4061c();
                InterfaceC1194D interfaceC1194D = this.f7333p;
                if (interfaceC1194D != null) {
                    this.f7333p = null;
                } else {
                    interfaceC1194D = null;
                }
                InterfaceC2237d interfaceC2237d = this.f7321d;
                if (interfaceC2237d == null || interfaceC2237d.mo4057g(this)) {
                    this.f7329l.mo3382u(m4062d());
                }
                this.f7317A = 6;
                if (interfaceC1194D != null) {
                    this.f7336s.getClass();
                    C1214o.m2290f(interfaceC1194D);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Drawable m4062d() {
        if (this.f7338u == null) {
            this.f7325h.getClass();
            this.f7338u = null;
        }
        return this.f7338u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: e */
    public final boolean mo4055e() {
        boolean z5;
        synchronized (this.f7320c) {
            z5 = this.f7317A == 6;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4063f(String str) {
        Log.v("GlideRequest", str + " this: " + this.f7318a);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, IPUT] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4064g(C1224y c1224y, int i5) {
        Drawable drawableM4062d;
        this.f7319b.m4548a();
        synchronized (this.f7320c) {
            try {
                c1224y.getClass();
                int i6 = this.f7322e.f6545i;
                if (i6 <= i5) {
                    Log.w("Glide", "Load failed for [" + this.f7323f + "] with dimensions [" + this.f7340w + "x" + this.f7341x + "]", c1224y);
                    if (i6 <= 4) {
                        c1224y.m2308d();
                    }
                }
                this.f7334q = null;
                this.f7317A = 5;
                InterfaceC2237d interfaceC2237d = this.f7321d;
                if (interfaceC2237d != null) {
                    interfaceC2237d.mo4056f(this);
                }
                boolean z5 = true;
                this.f7342y = true;
                try {
                    List list = this.f7330m;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            InterfaceC2237d interfaceC2237d2 = this.f7321d;
                            if (interfaceC2237d2 == null) {
                                throw null;
                            }
                            interfaceC2237d2.getRoot().mo4051a();
                            throw null;
                        }
                    }
                    InterfaceC2237d interfaceC2237d3 = this.f7321d;
                    if (interfaceC2237d3 != null && !interfaceC2237d3.mo4060j(this)) {
                        z5 = false;
                    }
                    if (z5) {
                        if (this.f7323f == null) {
                            if (this.f7339v == null) {
                                this.f7325h.getClass();
                                this.f7339v = null;
                            }
                            drawableM4062d = this.f7339v;
                        } else {
                            drawableM4062d = null;
                        }
                        if (drawableM4062d == null) {
                            if (this.f7337t == null) {
                                this.f7325h.getClass();
                                this.f7337t = null;
                            }
                            drawableM4062d = this.f7337t;
                        }
                        if (drawableM4062d == null) {
                            drawableM4062d = m4062d();
                        }
                        this.f7329l.mo3378f(drawableM4062d);
                    }
                } finally {
                    this.f7342y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: h */
    public final void mo4058h() {
        synchronized (this.f7320c) {
            try {
                if (this.f7342y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f7319b.m4548a();
                int i5 = AbstractC2505i.f8018b;
                this.f7335r = SystemClock.elapsedRealtimeNanos();
                if (this.f7323f == null) {
                    if (AbstractC2511o.m4460i(this.f7326i, this.f7327j)) {
                        this.f7340w = this.f7326i;
                        this.f7341x = this.f7327j;
                    }
                    if (this.f7339v == null) {
                        this.f7325h.getClass();
                        this.f7339v = null;
                    }
                    m4064g(new C1224y("Received null model"), this.f7339v == null ? 5 : 3);
                    return;
                }
                int i6 = this.f7317A;
                if (i6 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i6 == 4) {
                    m4065j(this.f7333p, 5, false);
                    return;
                }
                List list = this.f7330m;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f7317A = 3;
                if (AbstractC2511o.m4460i(this.f7326i, this.f7327j)) {
                    m4067l(this.f7326i, this.f7327j);
                } else {
                    this.f7329l.mo3379j(this);
                }
                int i7 = this.f7317A;
                if (i7 == 2 || i7 == 3) {
                    InterfaceC2237d interfaceC2237d = this.f7321d;
                    if (interfaceC2237d == null || interfaceC2237d.mo4060j(this)) {
                        this.f7329l.mo3380p(m4062d());
                    }
                }
                if (f7316B) {
                    m4063f("finished run method in " + AbstractC2505i.m4446a(this.f7335r));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    /* JADX INFO: renamed from: i */
    public final boolean mo4059i(InterfaceC2236c interfaceC2236c) {
        int i5;
        int i6;
        Object obj;
        Class cls;
        AbstractC2234a abstractC2234a;
        EnumC1928j enumC1928j;
        int size;
        int i7;
        int i8;
        Object obj2;
        Class cls2;
        AbstractC2234a abstractC2234a2;
        EnumC1928j enumC1928j2;
        int size2;
        if (!(interfaceC2236c instanceof C2239f)) {
            return false;
        }
        synchronized (this.f7320c) {
            try {
                i5 = this.f7326i;
                i6 = this.f7327j;
                obj = this.f7323f;
                cls = this.f7324g;
                abstractC2234a = this.f7325h;
                enumC1928j = this.f7328k;
                List list = this.f7330m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C2239f c2239f = (C2239f) interfaceC2236c;
        synchronized (c2239f.f7320c) {
            try {
                i7 = c2239f.f7326i;
                i8 = c2239f.f7327j;
                obj2 = c2239f.f7323f;
                cls2 = c2239f.f7324g;
                abstractC2234a2 = c2239f.f7325h;
                enumC1928j2 = c2239f.f7328k;
                List list2 = c2239f.f7330m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i5 == i7 && i6 == i8) {
            char[] cArr = AbstractC2511o.f8029a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC2234a == null ? abstractC2234a2 == null : abstractC2234a.m4039i(abstractC2234a2)) && enumC1928j == enumC1928j2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p171h2.InterfaceC2236c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f7320c) {
            int i5 = this.f7317A;
            z5 = i5 == 2 || i5 == 3;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4065j(InterfaceC1194D interfaceC1194D, int i5, boolean z5) {
        this.f7319b.m4548a();
        InterfaceC1194D interfaceC1194D2 = null;
        try {
            synchronized (this.f7320c) {
                try {
                    this.f7334q = null;
                    if (interfaceC1194D == null) {
                        m4064g(new C1224y("Expected to receive a Resource<R> with an object of " + this.f7324g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC1194D.get();
                    try {
                        if (obj == null || !this.f7324g.isAssignableFrom(obj.getClass())) {
                            this.f7333p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f7324g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC1194D);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m4064g(new C1224y(sb.toString()), 5);
                        } else {
                            InterfaceC2237d interfaceC2237d = this.f7321d;
                            if (interfaceC2237d == null || interfaceC2237d.mo4054d(this)) {
                                m4066k(interfaceC1194D, obj, i5);
                                return;
                            } else {
                                this.f7333p = null;
                                this.f7317A = 4;
                            }
                        }
                        this.f7336s.getClass();
                        C1214o.m2290f(interfaceC1194D);
                    } catch (Throwable th) {
                        interfaceC1194D2 = interfaceC1194D;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC1194D2 != null) {
                this.f7336s.getClass();
                C1214o.m2290f(interfaceC1194D2);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4066k(InterfaceC1194D interfaceC1194D, Object obj, int i5) {
        InterfaceC2237d interfaceC2237d = this.f7321d;
        if (interfaceC2237d != null) {
            interfaceC2237d.getRoot().mo4051a();
        }
        this.f7317A = 4;
        this.f7333p = interfaceC1194D;
        if (this.f7322e.f6545i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC0231b.m410u(i5) + " for " + this.f7323f + " with size [" + this.f7340w + "x" + this.f7341x + "] in " + AbstractC2505i.m4446a(this.f7335r) + " ms");
        }
        if (interfaceC2237d != null) {
            interfaceC2237d.mo4053c(this);
        }
        this.f7342y = true;
        try {
            List list = this.f7330m;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f7331n.getClass();
            this.f7329l.mo3384w(obj);
            this.f7342y = false;
        } catch (Throwable th) {
            this.f7342y = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final void m4067l(int i5, int i6) throws Throwable {
        Object obj;
        C2239f c2239f = this;
        int iRound = i5;
        c2239f.f7319b.m4548a();
        Object obj2 = c2239f.f7320c;
        synchronized (obj2) {
            try {
                try {
                    boolean z5 = f7316B;
                    if (z5) {
                        c2239f.m4063f("Got onSizeReady in " + AbstractC2505i.m4446a(c2239f.f7335r));
                    }
                    if (c2239f.f7317A == 3) {
                        c2239f.f7317A = 2;
                        c2239f.f7325h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c2239f.f7340w = iRound;
                        c2239f.f7341x = i6 == Integer.MIN_VALUE ? i6 : Math.round(1.0f * i6);
                        if (z5) {
                            c2239f.m4063f("finished setup for calling load in " + AbstractC2505i.m4446a(c2239f.f7335r));
                        }
                        C1214o c1214o = c2239f.f7336s;
                        C1927i c1927i = c2239f.f7322e;
                        Object obj3 = c2239f.f7323f;
                        AbstractC2234a abstractC2234a = c2239f.f7325h;
                        InterfaceC1144f interfaceC1144f = abstractC2234a.f7301j;
                        try {
                            int i7 = c2239f.f7340w;
                            int i8 = c2239f.f7341x;
                            Class cls = abstractC2234a.f7305n;
                            try {
                                Class cls2 = c2239f.f7324g;
                                EnumC1928j enumC1928j = c2239f.f7328k;
                                C1211l c1211l = abstractC2234a.f7296e;
                                try {
                                    C2499c c2499c = abstractC2234a.f7304m;
                                    boolean z6 = abstractC2234a.f7302k;
                                    boolean z7 = abstractC2234a.f7308q;
                                    try {
                                        C1147i c1147i = abstractC2234a.f7303l;
                                        boolean z8 = abstractC2234a.f7298g;
                                        boolean z9 = abstractC2234a.f7309r;
                                        ExecutorC2502f executorC2502f = c2239f.f7332o;
                                        Object obj4 = obj2;
                                        try {
                                            c2239f.f7334q = c1214o.m2291a(c1927i, obj3, interfaceC1144f, i7, i8, cls, cls2, enumC1928j, c1211l, c2499c, z6, z7, c1147i, z8, z9, c2239f, executorC2502f);
                                            if (c2239f.f7317A != 2) {
                                                c2239f.f7334q = null;
                                            }
                                            if (z5) {
                                                c2239f.m4063f("finished onSizeReady in " + AbstractC2505i.m4446a(c2239f.f7335r));
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
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = c2239f;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f7320c) {
            obj = this.f7323f;
            cls = this.f7324g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
