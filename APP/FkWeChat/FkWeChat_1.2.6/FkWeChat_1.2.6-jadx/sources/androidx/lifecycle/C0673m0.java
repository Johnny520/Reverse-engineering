package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import p024b9.AbstractC1043k;
import p098g9.InterfaceC2549c;
import p137j4.AbstractC3594a;
import p137j4.C3597d;
import p153k4.C3952b;
import p153k4.C3953c;
import p153k4.C3959i;
import p181m4.C4965b;
import p215oc.C5725t;
import p372z8.AbstractC9886a;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.lifecycle.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0673m0 {

    /* JADX INFO: renamed from: b */
    public static final b f1978b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final AbstractC3594a.c f1979c;

    /* JADX INFO: renamed from: a */
    public final C3597d f1980a;

    /* JADX INFO: renamed from: androidx.lifecycle.m0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final a f1985a = a.f1986a;

        /* JADX INFO: renamed from: androidx.lifecycle.m0$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ a f1986a = new a();
        }

        /* JADX INFO: renamed from: a */
        default AbstractC0671l0 mo2616a(Class cls) {
            cls.getClass();
            return C3959i.f11426a.m15677d();
        }

        /* JADX INFO: renamed from: b */
        AbstractC0671l0 mo2607b(InterfaceC2549c interfaceC2549c, AbstractC3594a abstractC3594a);

        /* JADX INFO: renamed from: c */
        default AbstractC0671l0 mo2617c(Class cls, AbstractC3594a abstractC3594a) {
            cls.getClass();
            abstractC3594a.getClass();
            return mo2616a(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e {
        /* JADX INFO: renamed from: d */
        public abstract void mo2618d(AbstractC0671l0 abstractC0671l0);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m0$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f implements AbstractC3594a.c {
    }

    static {
        AbstractC3594a.a aVar = AbstractC3594a.f9989b;
        f1979c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0673m0(C0675n0 c0675n0, c cVar, AbstractC3594a abstractC3594a) {
        this(new C3597d(c0675n0, cVar, abstractC3594a));
        c0675n0.getClass();
        cVar.getClass();
        abstractC3594a.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0671l0 m2642a(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return C3597d.m13454e(this.f1980a, interfaceC2549c, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0671l0 m2643b(String str, InterfaceC2549c interfaceC2549c) {
        str.getClass();
        interfaceC2549c.getClass();
        return this.f1980a.m13455d(interfaceC2549c, str);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends d {

        /* JADX INFO: renamed from: f */
        public static final C10056a f1981f = new C10056a(null);

        /* JADX INFO: renamed from: g */
        public static a f1982g;

        /* JADX INFO: renamed from: h */
        public static final AbstractC3594a.c f1983h;

        /* JADX INFO: renamed from: e */
        public final Application f1984e;

        /* JADX INFO: renamed from: androidx.lifecycle.m0$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b implements AbstractC3594a.c {
        }

        static {
            AbstractC3594a.a aVar = AbstractC3594a.f9989b;
            f1983h = new b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            application.getClass();
        }

        @Override // androidx.lifecycle.C0673m0.d, androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: a */
        public AbstractC0671l0 mo2616a(Class cls) {
            cls.getClass();
            Application application = this.f1984e;
            if (application != null) {
                return m2646h(cls, application);
            }
            C5725t.m23179a("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }

        @Override // androidx.lifecycle.C0673m0.d, androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: c */
        public AbstractC0671l0 mo2617c(Class cls, AbstractC3594a abstractC3594a) {
            cls.getClass();
            abstractC3594a.getClass();
            if (this.f1984e != null) {
                return mo2616a(cls);
            }
            Application application = (Application) abstractC3594a.mo13448a(f1983h);
            if (application != null) {
                return m2646h(cls, application);
            }
            if (!AbstractC0648a.class.isAssignableFrom(cls)) {
                return super.mo2616a(cls);
            }
            C9987e.m38645a("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final AbstractC0671l0 m2646h(Class cls, Application application) {
            if (!AbstractC0648a.class.isAssignableFrom(cls)) {
                return super.mo2616a(cls);
            }
            try {
                AbstractC0671l0 abstractC0671l0 = (AbstractC0671l0) cls.getConstructor(Application.class).newInstance(application);
                abstractC0671l0.getClass();
                return abstractC0671l0;
            } catch (IllegalAccessException e10) {
                C4965b.m20055a("Cannot create an instance of ", cls, e10);
                return null;
            } catch (InstantiationException e11) {
                C4965b.m20055a("Cannot create an instance of ", cls, e11);
                return null;
            } catch (NoSuchMethodException e12) {
                C4965b.m20055a("Cannot create an instance of ", cls, e12);
                return null;
            } catch (InvocationTargetException e13) {
                C4965b.m20055a("Cannot create an instance of ", cls, e13);
                return null;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10056a {
            public /* synthetic */ C10056a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m2647a(Application application) {
                application.getClass();
                if (a.f1982g == null) {
                    a.f1982g = new a(application);
                }
                a aVar = a.f1982g;
                aVar.getClass();
                return aVar;
            }

            public C10056a() {
            }
        }

        public a() {
            this(null, 0);
        }

        public a(Application application, int i10) {
            this.f1984e = application;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d implements c {

        /* JADX INFO: renamed from: c */
        public static d f1988c;

        /* JADX INFO: renamed from: b */
        public static final a f1987b = new a(null);

        /* JADX INFO: renamed from: d */
        public static final AbstractC3594a.c f1989d = C0673m0.f1979c;

        @Override // androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: a */
        public AbstractC0671l0 mo2616a(Class cls) {
            cls.getClass();
            return C3953c.f11421a.m15663a(cls);
        }

        @Override // androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: b */
        public AbstractC0671l0 mo2607b(InterfaceC2549c interfaceC2549c, AbstractC3594a abstractC3594a) {
            interfaceC2549c.getClass();
            abstractC3594a.getClass();
            return mo2617c(AbstractC9886a.m38367b(interfaceC2549c), abstractC3594a);
        }

        @Override // androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: c */
        public AbstractC0671l0 mo2617c(Class cls, AbstractC3594a abstractC3594a) {
            cls.getClass();
            abstractC3594a.getClass();
            return mo2616a(cls);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.m0$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final d m2654a() {
                if (d.f1988c == null) {
                    d.f1988c = new d();
                }
                d dVar = d.f1988c;
                dVar.getClass();
                return dVar;
            }

            public a() {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ C0673m0 m2648c(b bVar, C0675n0 c0675n0, c cVar, AbstractC3594a abstractC3594a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = C3952b.f11420b;
            }
            if ((i10 & 4) != 0) {
                abstractC3594a = AbstractC3594a.b.f9991c;
            }
            return bVar.m2650a(c0675n0, cVar, abstractC3594a);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C0673m0 m2649d(b bVar, InterfaceC0677o0 interfaceC0677o0, c cVar, AbstractC3594a abstractC3594a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = C3959i.f11426a.m15675b(interfaceC0677o0);
            }
            if ((i10 & 4) != 0) {
                abstractC3594a = C3959i.f11426a.m15674a(interfaceC0677o0);
            }
            return bVar.m2651b(interfaceC0677o0, cVar, abstractC3594a);
        }

        /* JADX INFO: renamed from: a */
        public final C0673m0 m2650a(C0675n0 c0675n0, c cVar, AbstractC3594a abstractC3594a) {
            c0675n0.getClass();
            cVar.getClass();
            abstractC3594a.getClass();
            return new C0673m0(c0675n0, cVar, abstractC3594a);
        }

        /* JADX INFO: renamed from: b */
        public final C0673m0 m2651b(InterfaceC0677o0 interfaceC0677o0, c cVar, AbstractC3594a abstractC3594a) {
            interfaceC0677o0.getClass();
            cVar.getClass();
            abstractC3594a.getClass();
            return new C0673m0(interfaceC0677o0.mo2659c(), cVar, abstractC3594a);
        }

        public b() {
        }
    }

    public C0673m0(C3597d c3597d) {
        this.f1980a = c3597d;
    }
}
