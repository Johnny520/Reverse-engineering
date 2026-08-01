package p125i7;

import ec.AbstractC2144j;
import ec.AbstractC2148k;
import ec.AbstractC2169p0;
import ec.AbstractC2199w2;
import ec.InterfaceC2165o0;
import io.ktor.utils.p131io.InterfaceC3468g;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p023b8.AbstractC1011d;
import p024b9.AbstractC1034f0;
import p024b9.C1055q;
import p034c7.AbstractC1365g;
import p034c7.AbstractC1367h;
import p034c7.AbstractC1396x;
import p034c7.C1353a;
import p034c7.C1354a0;
import p034c7.C1388r0;
import p034c7.InterfaceC1359d;
import p034c7.InterfaceC1360d0;
import p034c7.InterfaceC1363f;
import p086ff.InterfaceC2436d;
import p108h7.InterfaceC2891b;
import p125i7.InterfaceC3200a;
import p140j7.AbstractC3615f;
import p140j7.AbstractC3616g;
import p140j7.AbstractC3617h;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4713t;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.C4711r;
import p172l8.C4712s;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p270s6.C7191a;
import p270s6.C7193c;
import p281t6.C8173z;
import p282t7.InterfaceC8176b;
import p299ub.AbstractC8611a0;
import p376zd.C10010p0;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: i7.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3205c0 {

    /* JADX INFO: renamed from: a */
    public final C1388r0 f8529a;

    /* JADX INFO: renamed from: b */
    public final C7193c f8530b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1359d f8531c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3200a.a f8532d;

    /* JADX INFO: renamed from: e */
    public final ReentrantReadWriteLock f8533e;

    /* JADX INFO: renamed from: f */
    public boolean f8534f;

    /* JADX INFO: renamed from: g */
    public ClassLoader f8535g;

    /* JADX INFO: renamed from: h */
    public List f8536h;

    /* JADX INFO: renamed from: i */
    public final List f8537i;

    /* JADX INFO: renamed from: j */
    public final List f8538j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4705l f8539k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4705l f8540l;

    /* JADX INFO: renamed from: m */
    public C1353a f8541m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3200a f8542n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4705l f8543o;

    /* JADX INFO: renamed from: i7.c0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f8544q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f8545r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f8545r = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new b(this.f8545r, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8544q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC0184l interfaceC0184l = this.f8545r;
                this.f8544q = 1;
                if (interfaceC0184l.mo27m(this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: i7.c0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f8546q;

        /* JADX INFO: renamed from: r */
        public Object f8547r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f8548s;

        /* JADX INFO: renamed from: u */
        public int f8550u;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f8548s = obj;
            this.f8550u |= Integer.MIN_VALUE;
            return C3205c0.this.m12182k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i7.c0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f8551q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C1353a f8553s;

        /* JADX INFO: renamed from: i7.c0$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f8554q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C1353a f8555r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1353a c1353a, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f8555r = c1353a;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new a(this.f8555r, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f8554q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    C1353a c1353a = this.f8555r;
                    this.f8554q = 1;
                    if (c1353a.m5362T(this) == objM24992g) {
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                }
                return C4700i0.f13910a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1353a c1353a, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f8553s = c1353a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C3205c0.this.new d(this.f8553s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8551q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                long jM12158c = C3205c0.this.m12192u().m12158c();
                a aVar = new a(this.f8553s, null);
                this.f8551q = 1;
                if (AbstractC2199w2.m7927c(jM12158c, aVar, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: i7.c0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f8556q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f8557r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f8558s;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f8560u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f8560u = str;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8556q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C1353a c1353a = (C1353a) this.f8557r;
                ClassLoader classLoader = (ClassLoader) this.f8558s;
                C3205c0 c3205c0 = C3205c0.this;
                String str = this.f8560u;
                this.f8557r = null;
                this.f8556q = 1;
                if (c3205c0.m12173C(str, classLoader, c1353a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C1353a c1353a, ClassLoader classLoader, InterfaceC5976f interfaceC5976f) {
            e eVar = C3205c0.this.new e(this.f8560u, interfaceC5976f);
            eVar.f8557r = c1353a;
            eVar.f8558s = classLoader;
            return eVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i7.c0$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class f extends C1055q implements InterfaceC0173a {
        public f(Object obj) {
            super(0, obj, C3205c0.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C1353a invoke() {
            return ((C3205c0) this.f3190r).m12186o();
        }
    }

    /* JADX INFO: renamed from: i7.c0$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f8561q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C1353a f8563s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ ClassLoader f8564t;

        /* JADX INFO: renamed from: i7.c0$g$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f8565q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C3205c0 f8566r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C1353a f8567s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ ClassLoader f8568t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3205c0 c3205c0, C1353a c1353a, ClassLoader classLoader, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f8566r = c3205c0;
                this.f8567s = c1353a;
                this.f8568t = classLoader;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new a(this.f8566r, this.f8567s, this.f8568t, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f8565q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    InterfaceC1363f interfaceC1363fM5400a = AbstractC1367h.m5400a(this.f8566r.m12193v());
                    C1353a c1353a = this.f8567s;
                    ClassLoader classLoader = this.f8568t;
                    List listM12196y = this.f8566r.m12196y();
                    this.f8565q = 1;
                    if (interfaceC1363fM5400a.mo5392a(c1353a, classLoader, listM12196y, this) == objM24992g) {
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                }
                return C4700i0.f13910a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1353a c1353a, ClassLoader classLoader, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f8563s = c1353a;
            this.f8564t = classLoader;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C3205c0.this.new g(this.f8563s, this.f8564t, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8561q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                long jM5397c = AbstractC1365g.m5397c(C3205c0.this.m12193v());
                a aVar = new a(C3205c0.this, this.f8563s, this.f8564t, null);
                this.f8561q = 1;
                if (AbstractC2199w2.m7928d(jM5397c, aVar, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((g) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i7.c0$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f8569q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ ClassLoader f8570r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ String f8571s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C1353a f8572t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3205c0 f8573u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ClassLoader classLoader, String str, C1353a c1353a, C3205c0 c3205c0, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f8570r = classLoader;
            this.f8571s = str;
            this.f8572t = c1353a;
            this.f8573u = c3205c0;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return new i(this.f8570r, this.f8571s, this.f8572t, this.f8573u, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8569q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                ClassLoader classLoader = this.f8570r;
                String str = this.f8571s;
                C1353a c1353a = this.f8572t;
                InterfaceC1360d0 interfaceC1360d0M12195x = this.f8573u.m12195x();
                this.f8569q = 1;
                if (AbstractC3616g.m13546d(classLoader, str, c1353a, interfaceC1360d0M12195x, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((i) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i7.c0$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class j extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f8574q;

        public j(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C3205c0.this.new j(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((j) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8574q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC3200a interfaceC3200aM12191t = C3205c0.this.m12191t();
                this.f8574q = 1;
                obj = interfaceC3200aM12191t.mo12155b(this);
                if (obj == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            C3205c0 c3205c0 = C3205c0.this;
            for (InterfaceC3219j0 interfaceC3219j0 : (Iterable) obj) {
                String strM13547a = AbstractC3617h.m13547a(interfaceC3219j0.mo12227b());
                InterfaceC2436d interfaceC2436dMo5387c = c3205c0.m12193v().mo5387c();
                StringBuilder sb2 = new StringBuilder("Responding at ");
                String lowerCase = interfaceC3219j0.getType().m12287c().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                sb2.append(lowerCase);
                sb2.append("://");
                sb2.append(strM13547a);
                sb2.append(':');
                sb2.append(interfaceC3219j0.mo12226a());
                interfaceC2436dMo5387c.mo8826x(sb2.toString());
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: i7.c0$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class k extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f8576q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f8577r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f8578s;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f8580u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0188p f8581v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f8580u = str;
            this.f8581v = interfaceC0188p;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            if (r4.m12173C(r5, r7, r1, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r7.invoke(r1, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        
            return r0;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r6.f8576q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                p172l8.AbstractC4713t.m18808b(r7)
                goto L76
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r7)
                r7 = 0
                return r7
            L19:
                java.lang.Object r1 = r6.f8578s
                c7.a r1 = (p034c7.C1353a) r1
                java.lang.Object r3 = r6.f8577r
                c7.a r3 = (p034c7.C1353a) r3
                p172l8.AbstractC4713t.m18808b(r7)     // Catch: p140j7.C3619j -> L25
                goto L76
            L25:
                r7 = move-exception
                goto L46
            L27:
                p172l8.AbstractC4713t.m18808b(r7)
                java.lang.Object r7 = r6.f8577r
                r1 = r7
                c7.a r1 = (p034c7.C1353a) r1
                java.lang.Object r7 = r6.f8578s
                java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7
                i7.c0 r4 = p125i7.C3205c0.this     // Catch: p140j7.C3619j -> L44
                java.lang.String r5 = r6.f8580u     // Catch: p140j7.C3619j -> L44
                r6.f8577r = r1     // Catch: p140j7.C3619j -> L44
                r6.f8578s = r1     // Catch: p140j7.C3619j -> L44
                r6.f8576q = r3     // Catch: p140j7.C3619j -> L44
                java.lang.Object r7 = p125i7.C3205c0.m12170i(r4, r5, r7, r1, r6)     // Catch: p140j7.C3619j -> L44
                if (r7 != r0) goto L76
                goto L75
            L44:
                r7 = move-exception
                r3 = r1
            L46:
                c7.d r3 = r3.m5377Q()
                ff.d r3 = r3.mo5387c()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Failed to load module '"
                r4.<init>(r5)
                java.lang.String r5 = r6.f8580u
                r4.append(r5)
                java.lang.String r5 = "' by classpath reference, falling back to currently loaded value"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.mo8825w(r4, r7)
                a9.p r7 = r6.f8581v
                r3 = 0
                r6.f8577r = r3
                r6.f8578s = r3
                r6.f8576q = r2
                java.lang.Object r7 = r7.invoke(r1, r6)
                if (r7 != r0) goto L76
            L75:
                return r0
            L76:
                l8.i0 r7 = p172l8.C4700i0.f13910a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p125i7.C3205c0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C1353a c1353a, ClassLoader classLoader, InterfaceC5976f interfaceC5976f) {
            k kVar = C3205c0.this.new k(this.f8580u, this.f8581v, interfaceC5976f);
            kVar.f8577r = c1353a;
            kVar.f8578s = classLoader;
            return kVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i7.c0$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class l extends SimpleFileVisitor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashSet f8582a;

        public l(HashSet hashSet) {
            this.f8582a = hashSet;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
            path.getClass();
            basicFileAttributes.getClass();
            this.f8582a.add(path);
            return FileVisitResult.CONTINUE;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
            path.getClass();
            basicFileAttributes.getClass();
            Path parent = path.getParent();
            if (parent != null) {
                this.f8582a.add(parent);
            }
            return FileVisitResult.CONTINUE;
        }
    }

    /* JADX INFO: renamed from: i7.c0$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class m extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f8583q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f8584r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f8585s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f8585s = interfaceC0188p;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8583q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C1353a c1353a = (C1353a) this.f8584r;
                InterfaceC0188p interfaceC0188p = this.f8585s;
                this.f8583q = 1;
                if (interfaceC0188p.invoke(c1353a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C1353a c1353a, ClassLoader classLoader, InterfaceC5976f interfaceC5976f) {
            m mVar = new m(this.f8585s, interfaceC5976f);
            mVar.f8584r = c1353a;
            return mVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3205c0(C1388r0 c1388r0, InterfaceC3202b interfaceC3202b, InterfaceC0184l interfaceC0184l) {
        c1388r0.getClass();
        interfaceC3202b.getClass();
        interfaceC0184l.getClass();
        this.f8529a = c1388r0;
        C7193c c7193cMo5386b = c1388r0.m5451b().mo5386b();
        this.f8530b = c7193cMo5386b;
        InterfaceC1359d interfaceC1359dM5451b = c1388r0.m5451b();
        this.f8531c = interfaceC1359dM5451b;
        InterfaceC3200a.a aVarMo7311b = interfaceC3202b.mo7311b(interfaceC0184l);
        this.f8532d = aVarMo7311b;
        this.f8533e = new ReentrantReadWriteLock();
        this.f8536h = AbstractC5114x.m20800o();
        InterfaceC2891b interfaceC2891bMo10537a = interfaceC1359dM5451b.mo5385a().mo10537a("ktor.deployment.watch");
        List listMo10538b = interfaceC2891bMo10537a != null ? interfaceC2891bMo10537a.mo10538b() : null;
        listMo10538b = listMo10538b == null ? AbstractC5114x.m20800o() : listMo10538b;
        this.f8537i = listMo10538b;
        this.f8538j = AbstractC5081g0.m20533E0(listMo10538b, c1388r0.m5455f());
        this.f8539k = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: i7.y
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3205c0.m12165d();
            }
        });
        this.f8540l = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: i7.z
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3205c0.m12163b(this.f8768q);
            }
        });
        this.f8541m = new C1353a(interfaceC1359dM5451b, c1388r0.m5450a(), c1388r0.m5454e(), c7193cMo5386b, c1388r0.m5453d(), new AbstractC1034f0(this) { // from class: i7.c0.a
            @Override // p098g9.InterfaceC2558l
            public Object get() {
                return ((C3205c0) this.f3190r).m12191t();
            }
        });
        this.f8542n = interfaceC3202b.mo7310a(interfaceC1359dM5451b, c7193cMo5386b, c1388r0.m5450a(), aVarMo7311b, new f(this));
        this.f8543o = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: i7.a0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3205c0.m12164c();
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m12161H(C3205c0 c3205c0, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c3205c0.f8532d.m12157b();
        }
        if ((i10 & 2) != 0) {
            j11 = c3205c0.f8532d.m12157b();
        }
        c3205c0.m12176F(j10, j11);
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m12162a(C3205c0 c3205c0) {
        m12161H(c3205c0, 0L, 0L, 3, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static List m12163b(C3205c0 c3205c0) {
        List listM5395a = AbstractC1365g.m5395a(c3205c0.f8531c);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM5395a, 10));
        Iterator it = listM5395a.iterator();
        while (it.hasNext()) {
            arrayList.add(c3205c0.m12189r((String) it.next()));
        }
        List<InterfaceC0188p> listM5452c = c3205c0.f8529a.m5452c();
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listM5452c, 10));
        for (InterfaceC0188p interfaceC0188p : listM5452c) {
            C1354a0 c1354a0M12178I = c3205c0.m12178I(interfaceC0188p);
            if (c1354a0M12178I == null) {
                c1354a0M12178I = c3205c0.m12180K(interfaceC0188p);
            }
            arrayList2.add(c1354a0M12178I);
        }
        return AbstractC5081g0.m20533E0(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public static WatchService m12164c() {
        try {
            return FileSystems.getDefault().newWatchService();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1360d0 m12165d() {
        Iterator it = ServiceLoader.load(InterfaceC1360d0.class, InterfaceC1360d0.class.getClassLoader()).iterator();
        it.getClass();
        InterfaceC1360d0 interfaceC1360d0 = (InterfaceC1360d0) AbstractC7294t.m28895C(AbstractC7291q.m28879g(it));
        return interfaceC1360d0 == null ? InterfaceC1360d0.f4022a.m5389a() : interfaceC1360d0;
    }

    /* JADX INFO: renamed from: A */
    public final WatchService m12171A() {
        return (WatchService) this.f8543o.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final C1353a m12172B(ClassLoader classLoader) throws Throwable {
        C1353a c1353a;
        if (this.f8534f || (c1353a = this.f8541m) == null) {
            c1353a = new C1353a(this.f8531c, this.f8529a.m5450a(), this.f8529a.m5454e(), this.f8530b, this.f8529a.m5453d(), new AbstractC1034f0(this) { // from class: i7.c0.h
                @Override // p098g9.InterfaceC2558l
                public Object get() {
                    return ((C3205c0) this.f3190r).m12191t();
                }
            });
        } else {
            this.f8534f = true;
            c1353a.getClass();
        }
        m12174D(AbstractC1396x.m5476d(), c1353a);
        m12181j(new g(c1353a, classLoader, null));
        this.f8530b.m28425b(AbstractC1396x.m5473a(), c1353a);
        this.f8530b.m28425b(AbstractC1396x.m5475c(), c1353a);
        return c1353a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m12173C(String str, ClassLoader classLoader, C1353a c1353a, InterfaceC5976f interfaceC5976f) throws Throwable {
        Object objM12182k = m12182k(str, new i(classLoader, str, c1353a, this, null), interfaceC5976f);
        return objM12182k == AbstractC6325c.m24992g() ? objM12182k : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: D */
    public final void m12174D(C7191a c7191a, C1353a c1353a) {
        try {
            this.f8530b.m28425b(c7191a, c1353a);
        } catch (Throwable th) {
            this.f8531c.mo5387c().mo8825w("One or more of the handlers thrown an exception", th);
        }
    }

    /* JADX INFO: renamed from: E */
    public final C3205c0 m12175E(boolean z10) {
        AbstractC3247x0.m12336b(this, new InterfaceC0173a() { // from class: i7.b0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3205c0.m12162a(this.f8525q);
            }
        });
        ReentrantReadWriteLock reentrantReadWriteLock = this.f8533e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                C4711r c4711rM12184m = m12184m();
                C1353a c1353a = (C1353a) c4711rM12184m.m18792a();
                ClassLoader classLoader = (ClassLoader) c4711rM12184m.m18793b();
                this.f8541m = c1353a;
                this.f8535g = classLoader;
                C4700i0 c4700i0 = C4700i0.f13910a;
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
                AbstractC2148k.m7817d(AbstractC2169p0.m7878a(m12190s().getCoroutineContext()), null, null, new j(null), 3, null);
                this.f8542n.mo7331a(z10);
                return this;
            } finally {
            }
        } catch (Throwable th) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m12176F(long j10, long j11) {
        m12177G(j10, j11, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: G */
    public final void m12177G(long j10, long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            this.f8542n.mo7332c(timeUnit.toMillis(j10), timeUnit.toMillis(j11));
        } catch (Exception e10) {
            this.f8531c.mo5387c().mo8822t("Exception occurred during engine shutdown", e10);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f8533e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            m12187p();
            C4700i0 c4700i0 = C4700i0.f13910a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            if (this.f8538j.isEmpty()) {
                return;
            }
            m12183l();
        } catch (Throwable th) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    public final C1354a0 m12178I(InterfaceC0188p interfaceC0188p) {
        Object objM18798b;
        if (!this.f8529a.m5450a()) {
            return null;
        }
        try {
            C4712s.a aVar = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC3231p0.m12280a(interfaceC0188p));
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        Throwable thM18801e = C4712s.m18801e(objM18798b);
        if (thM18801e != null) {
            this.f8531c.mo5387c().mo8825w("Module can't be loaded dynamically, auto-reloading won't work for this module", thM18801e);
        }
        if (C4712s.m18801e(objM18798b) != null) {
            return null;
        }
        String str = (String) objM18798b;
        return new C1354a0(str, new k(str, interfaceC0188p, null));
    }

    /* JADX INFO: renamed from: J */
    public final void m12179J(List list) throws IOException {
        Object objM18798b;
        HashSet<Path> hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String path = ((URL) it.next()).getPath();
            if (path != null) {
                String strDecode = URLDecoder.decode(path, "utf-8");
                try {
                    C4712s.a aVar = C4712s.f13928r;
                    objM18798b = C4712s.m18798b(new File(strDecode).toPath());
                } catch (Throwable th) {
                    C4712s.a aVar2 = C4712s.f13928r;
                    objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
                }
                Path path2 = (Path) (C4712s.m18803g(objM18798b) ? null : objM18798b);
                if (path2 != null && Files.exists(path2, new LinkOption[0])) {
                    l lVar = new l(hashSet);
                    if (Files.isDirectory(path2, new LinkOption[0])) {
                        Files.walkFileTree(path2, lVar);
                    }
                }
            }
        }
        for (Path path3 : hashSet) {
            this.f8531c.mo5387c().mo8815m("Watching " + path3 + " for changes.");
        }
        WatchEvent.Modifier modifierM13536g = AbstractC3615f.m13536g();
        WatchEvent.Modifier[] modifierArr = modifierM13536g != null ? new WatchEvent.Modifier[]{modifierM13536g} : new WatchEvent.Modifier[0];
        ArrayList arrayList = new ArrayList();
        for (Path path4 : hashSet) {
            WatchService watchServiceM12171A = m12171A();
            WatchKey watchKeyRegister = watchServiceM12171A != null ? path4.register(watchServiceM12171A, new WatchEvent.Kind[]{StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY}, (WatchEvent.Modifier[]) Arrays.copyOf(modifierArr, modifierArr.length)) : null;
            if (watchKeyRegister != null) {
                arrayList.add(watchKeyRegister);
            }
        }
        this.f8536h = arrayList;
    }

    /* JADX INFO: renamed from: K */
    public final C1354a0 m12180K(InterfaceC0188p interfaceC0188p) {
        return new C1354a0(null, new m(interfaceC0188p, null), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m12181j(InterfaceC0184l interfaceC0184l) {
        try {
            AbstractC2144j.m7786b(null, new b(interfaceC0184l, null), 1, null);
        } finally {
            List list = (List) AbstractC3615f.m13535f().get();
            if (list != null && list.isEmpty()) {
                AbstractC3615f.m13535f().remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12182k(java.lang.String r6, p010a9.InterfaceC0184l r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p125i7.C3205c0.c
            if (r0 == 0) goto L13
            r0 = r8
            i7.c0$c r0 = (p125i7.C3205c0.c) r0
            int r1 = r0.f8550u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8550u = r1
            goto L18
        L13:
            i7.c0$c r0 = new i7.c0$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8548s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f8550u
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f8547r
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f8546q
            java.lang.String r7 = (java.lang.String) r7
            p172l8.AbstractC4713t.m18808b(r8)     // Catch: java.lang.Throwable -> L31
            goto L6a
        L31:
            r8 = move-exception
            goto L75
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L3a:
            p172l8.AbstractC4713t.m18808b(r8)
            java.lang.ThreadLocal r8 = p140j7.AbstractC3615f.m13535f()
            java.lang.Object r2 = r8.get()
            if (r2 != 0) goto L4f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r8.set(r2)
        L4f:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.contains(r6)
            if (r2 != 0) goto L79
            r8.add(r6)
            r0.f8546q = r6     // Catch: java.lang.Throwable -> L70
            r0.f8547r = r8     // Catch: java.lang.Throwable -> L70
            r0.f8550u = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r7 = r7.mo27m(r0)     // Catch: java.lang.Throwable -> L70
            if (r7 != r1) goto L68
            return r1
        L68:
            r7 = r6
            r6 = r8
        L6a:
            r6.remove(r7)
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L70:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L75:
            r6.remove(r7)
            throw r8
        L79:
            java.lang.String r7 = "Module startup is already in progress for function "
            java.lang.String r8 = " (recursive module startup from module main?)"
            androidx.lifecycle.C0678p.m2660a(r7, r6, r8)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p125i7.C3205c0.m12182k(java.lang.String, a9.l, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    public final void m12183l() {
        C4700i0 c4700i0;
        try {
            C4712s.a aVar = C4712s.f13928r;
            WatchService watchServiceM12171A = m12171A();
            if (watchServiceM12171A != null) {
                watchServiceM12171A.close();
                c4700i0 = C4700i0.f13910a;
            } else {
                c4700i0 = null;
            }
            C4712s.m18798b(c4700i0);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
    }

    /* JADX INFO: renamed from: m */
    public final C4711r m12184m() throws IOException {
        ClassLoader classLoaderM12185n = m12185n();
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        threadCurrentThread.setContextClassLoader(classLoaderM12185n);
        try {
            return AbstractC4717x.m18815a(m12172B(classLoaderM12185n), classLoaderM12185n);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: n */
    public final ClassLoader m12185n() throws IOException {
        ClassLoader classLoader = this.f8531c.getClassLoader();
        if (!this.f8529a.m5450a()) {
            this.f8531c.mo5387c().mo8826x("Autoreload is disabled because the development mode is off.");
            return classLoader;
        }
        List list = this.f8538j;
        if (list.isEmpty()) {
            this.f8531c.mo5387c().mo8826x("No ktor.deployment.watch patterns specified, automatic reload is not active.");
            return classLoader;
        }
        Set setM12281a = AbstractC3232q.m12281a(classLoader);
        String parent = new File(System.getProperty("java.home")).getParent();
        Set set = setM12281a;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((URL) it.next()).getFile());
        }
        this.f8531c.mo5387c().mo8815m("Java Home: " + parent);
        InterfaceC2436d interfaceC2436dMo5387c = this.f8531c.mo5387c();
        StringBuilder sb2 = new StringBuilder("Class Loader: ");
        sb2.append(classLoader);
        sb2.append(": ");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String string = ((String) obj).toString();
            parent.getClass();
            if (!AbstractC8611a0.m33075T(string, parent, false, 2, null)) {
                arrayList2.add(obj);
            }
        }
        sb2.append(arrayList2);
        interfaceC2436dMo5387c.mo8815m(sb2.toString());
        List listM20803r = AbstractC5114x.m20803r(InterfaceC1359d.class, AbstractC1011d.class, C8173z.class, InterfaceC0184l.class, InterfaceC2436d.class, InterfaceC3468g.class, InterfaceC5728w.class, InterfaceC8176b.class);
        HashSet hashSet = new HashSet();
        Iterator it2 = listM20803r.iterator();
        while (it2.hasNext()) {
            URL location = ((Class) it2.next()).getProtectionDomain().getCodeSource().getLocation();
            if (location != null) {
                hashSet.add(location);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : set) {
            URL url = (URL) obj2;
            if (!hashSet.contains(url) && !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (AbstractC3207d0.m12207a(url, (String) it3.next())) {
                        String path = url.getPath();
                        if (path == null) {
                            path = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        parent.getClass();
                        if (!AbstractC8611a0.m33075T(path, parent, false, 2, null)) {
                            arrayList3.add(obj2);
                        }
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            this.f8531c.mo5387c().mo8826x("No ktor.deployment.watch patterns match classpath entries, automatic reload is not active");
            return classLoader;
        }
        m12179J(arrayList3);
        return new C3227n0(arrayList3, classLoader);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public final C1353a m12186o() {
        List listM12194w;
        ReentrantReadWriteLock.ReadLock lock = this.f8533e.readLock();
        lock.lock();
        try {
            C1353a c1353a = this.f8541m;
            if (c1353a == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.f8529a.m5450a() && (listM12194w = m12194w()) != null && !listM12194w.isEmpty()) {
                ReentrantReadWriteLock reentrantReadWriteLock = this.f8533e;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int i10 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    m12187p();
                    C4711r c4711rM12184m = m12184m();
                    C1353a c1353a2 = (C1353a) c4711rM12184m.m18792a();
                    ClassLoader classLoader = (ClassLoader) c4711rM12184m.m18793b();
                    this.f8541m = c1353a2;
                    this.f8535g = classLoader;
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                    c1353a = this.f8541m;
                    if (c1353a == null) {
                        throw new IllegalStateException("EmbeddedServer was stopped");
                    }
                } catch (Throwable th) {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            lock.unlock();
            return c1353a;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m12187p() {
        C1353a c1353a = this.f8541m;
        ClassLoader classLoader = this.f8535g;
        this.f8541m = null;
        this.f8535g = null;
        if (c1353a != null) {
            m12174D(AbstractC1396x.m5479g(), c1353a);
            try {
                m12188q(c1353a, classLoader);
            } catch (Throwable th) {
                this.f8531c.mo5387c().mo8808f("Failed to destroy application instance.", th);
            }
            m12174D(AbstractC1396x.m5478f(), c1353a);
        }
        Iterator it = this.f8536h.iterator();
        while (it.hasNext()) {
            ((WatchKey) it.next()).cancel();
        }
        this.f8536h = new ArrayList();
    }

    /* JADX INFO: renamed from: q */
    public final void m12188q(C1353a c1353a, ClassLoader classLoader) throws IOException {
        try {
            AbstractC2144j.m7786b(null, new d(c1353a, null), 1, null);
        } finally {
            c3227n0 = classLoader instanceof C3227n0 ? (C3227n0) classLoader : null;
            if (c3227n0 != null) {
                c3227n0.close();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final C1354a0 m12189r(String str) {
        return new C1354a0(str, new e(str, null));
    }

    /* JADX INFO: renamed from: s */
    public final C1353a m12190s() {
        return m12186o();
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC3200a m12191t() {
        return this.f8542n;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3200a.a m12192u() {
        return this.f8532d;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC1359d m12193v() {
        return this.f8531c;
    }

    /* JADX INFO: renamed from: w */
    public final List m12194w() {
        InterfaceC1359d interfaceC1359d;
        try {
            List list = this.f8536h;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<WatchEvent<?>> listPollEvents = ((WatchKey) it.next()).pollEvents();
                listPollEvents.getClass();
                AbstractC5070c0.m20492E(arrayList, listPollEvents);
            }
            if (!arrayList.isEmpty()) {
                this.f8531c.mo5387c().mo8826x("Changes in application detected.");
                int size = arrayList.size();
                while (true) {
                    Thread.sleep(200L);
                    List list2 = this.f8536h;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<WatchEvent<?>> listPollEvents2 = ((WatchKey) it2.next()).pollEvents();
                        listPollEvents2.getClass();
                        AbstractC5070c0.m20492E(arrayList2, listPollEvents2);
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    interfaceC1359d = this.f8531c;
                    if (zIsEmpty) {
                        break;
                    }
                    interfaceC1359d.mo5387c().mo8815m("Waiting for more changes.");
                    size += arrayList2.size();
                }
                interfaceC1359d.mo5387c().mo8815m("Changes to " + size + " files caused application restart.");
                Iterator it3 = AbstractC5081g0.m20544P0(arrayList, 5).iterator();
                while (it3.hasNext()) {
                    this.f8531c.mo5387c().mo8820r("...  {}", ((WatchEvent) it3.next()).context());
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            this.f8531c.mo5387c().mo8825w("Watch service was interrupted", e10);
            return null;
        } catch (ClosedWatchServiceException e11) {
            this.f8531c.mo5387c().mo8825w("Watch service was closed", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC1360d0 m12195x() {
        return (InterfaceC1360d0) this.f8539k.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final List m12196y() {
        return (List) this.f8540l.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final C7193c m12197z() {
        return this.f8530b;
    }
}
