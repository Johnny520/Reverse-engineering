package org.luckypray.dexkit;

import af.C0333f;
import af.C0335h;
import af.C0338k;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.C5823a;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p024b9.C1055q;
import p055e.AbstractC1960a;
import p069ef.C2216a;
import p069ef.C2217b;
import p069ef.C2218c;
import p163l.AbstractC4284d1;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p302ue.C8677a;
import p302ue.C8678b;
import p302ue.C8680d;
import p302ue.C8681e;
import p331we.AbstractC9231a;
import p376zd.C10010p0;
import ve.C8928a;
import ve.C8929b;
import ve.C8930c;

/* JADX INFO: renamed from: org.luckypray.dexkit.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5823a {

    /* JADX INFO: renamed from: a */
    public static final C5823a f18201a = new C5823a();

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f18202b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public static final ScheduledThreadPoolExecutor f18203c;

    /* JADX INFO: renamed from: d */
    public static final ReentrantReadWriteLock f18204d;

    /* JADX INFO: renamed from: e */
    public static final CopyOnWriteArraySet f18205e;

    /* JADX INFO: renamed from: f */
    public static long f18206f;

    /* JADX INFO: renamed from: g */
    public static c f18207g;

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        List mo5936a(String str, List list);

        /* JADX INFO: renamed from: b */
        void mo5937b(String str, List list);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        NONE,
        QUERY_ONLY,
        ALL
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum d {
        METHOD_SINGLE,
        CLASS_SINGLE,
        FIELD_SINGLE,
        METHOD_LIST,
        CLASS_LIST,
        FIELD_LIST,
        METHOD_BATCH,
        CLASS_BATCH
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum f {
        CACHE,
        QUERY
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f18246r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ String f18247s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(0);
            this.f18246r = str;
            this.f18247s = str2;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return e.f18223v.m23457a(this.f18246r, this.f18247s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: te.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C5823a.m23426a(runnable);
            }
        });
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        f18203c = scheduledThreadPoolExecutor;
        f18204d = new ReentrantReadWriteLock();
        f18205e = new CopyOnWriteArraySet();
        f18206f = 5000L;
        f18207g = new c(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static Thread m23426a(Runnable runnable) {
        Thread thread = new Thread(runnable, "DexKit-Reaper");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: f */
    public static final e m23431f(String str, String str2) {
        str.getClass();
        str2.getClass();
        f18201a.m23436g();
        return C8678b.f28775a.m33334b(str, new g(str, str2));
    }

    /* JADX INFO: renamed from: h */
    public static final c m23432h() {
        return f18207g;
    }

    /* JADX INFO: renamed from: i */
    public static final long m23433i() {
        return f18206f;
    }

    /* JADX INFO: renamed from: j */
    public static final void m23434j(a aVar) {
        aVar.getClass();
        if (AbstractC4284d1.m16830a(f18202b, null, aVar)) {
            return;
        }
        C10010p0.m38820a("DexKitCacheBridge.init(cache) can only be called once");
    }

    /* JADX INFO: renamed from: k */
    public static final void m23435k(long j10) {
        f18206f = j10;
    }

    /* JADX INFO: renamed from: g */
    public final a m23436g() {
        a aVar = (a) f18202b.get();
        if (aVar != null) {
            return aVar;
        }
        C10010p0.m38820a("Wrapper must be init(cache) first");
        return null;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements Closeable {

        /* JADX INFO: renamed from: v */
        public static final a f18223v = new a(null);

        /* JADX INFO: renamed from: q */
        public final String f18224q;

        /* JADX INFO: renamed from: r */
        public final String f18225r;

        /* JADX INFO: renamed from: s */
        public final byte[][] f18226s;

        /* JADX INFO: renamed from: t */
        public final ClassLoader f18227t;

        /* JADX INFO: renamed from: u */
        public final InterfaceC4705l f18228u;

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C8928a f18229r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C8928a c8928a) {
                super(0);
                this.f18229r = c8928a;
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8928a invoke() {
                return this.f18229r;
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public static final c f18230r = new c();

            public c() {
                super(2);
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(DexKitBridge dexKitBridge, C8928a c8928a) {
                dexKitBridge.getClass();
                c8928a.getClass();
                return dexKitBridge.m23351X(c8928a);
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final d f18231r = new d();

            public d() {
                super(1);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2216a mo27m(C0333f c0333f) {
                c0333f.getClass();
                return c0333f.m1026n();
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$e, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10172e extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C8929b f18232r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10172e(C8929b c8929b) {
                super(0);
                this.f18232r = c8929b;
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8929b invoke() {
                return this.f18232r;
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$f */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class f extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public static final f f18233r = new f();

            public f() {
                super(2);
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(DexKitBridge dexKitBridge, C8929b c8929b) {
                dexKitBridge.getClass();
                c8929b.getClass();
                return dexKitBridge.m23353c0(c8929b);
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$g */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class g extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final g f18234r = new g();

            public g() {
                super(1);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2217b mo27m(C0335h c0335h) {
                c0335h.getClass();
                return c0335h.m1048l();
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$h */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class h extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public static final h f18235r = new h();

            public h() {
                super(2);
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(DexKitBridge dexKitBridge, C8930c c8930c) {
                dexKitBridge.getClass();
                c8930c.getClass();
                return dexKitBridge.m23355j0(c8930c);
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$i */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class i extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final i f18236r = new i();

            public i() {
                super(1);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2218c mo27m(C0338k c0338k) {
                c0338k.getClass();
                return c0338k.m1072n();
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$j */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class j extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C8930c f18237r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(C8930c c8930c) {
                super(0);
                this.f18237r = c8930c;
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8930c invoke() {
                return this.f18237r;
            }
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class k extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k$a */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class a extends AbstractC1067w implements InterfaceC0173a {

                /* JADX INFO: renamed from: r */
                public static final a f18239r = new a();

                public a() {
                    super(0);
                }

                @Override // p010a9.InterfaceC0173a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke() {
                    return Long.valueOf(C5823a.m23433i());
                }
            }

            /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k$b */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public /* synthetic */ class b extends C1055q implements InterfaceC0173a {
                public b(Object obj) {
                    super(0, obj, e.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;", 0);
                }

                @Override // p010a9.InterfaceC0173a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public final DexKitBridge invoke() {
                    return ((e) this.f3190r).m23448h();
                }
            }

            /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k$c */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class c extends AbstractC1067w implements InterfaceC0173a {

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ e f18240r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(e eVar) {
                    super(0);
                    this.f18240r = eVar;
                }

                /* JADX INFO: renamed from: a */
                public final void m23470a() {
                    C5823a c5823a = C5823a.f18201a;
                    Iterator it = C5823a.f18205e.iterator();
                    while (it.hasNext()) {
                        AbstractC1960a.m7104a(it.next());
                        C5823a c5823a2 = C5823a.f18201a;
                        try {
                            C4712s.a aVar = C4712s.f13928r;
                            throw null;
                        } catch (Throwable th) {
                            C4712s.a aVar2 = C4712s.f13928r;
                            C4712s.m18798b(AbstractC4713t.m18807a(th));
                        }
                    }
                }

                @Override // p010a9.InterfaceC0173a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m23470a();
                    return C4700i0.f13910a;
                }
            }

            /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k$d */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class d extends AbstractC1067w implements InterfaceC0173a {

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ e f18241r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(e eVar) {
                    super(0);
                    this.f18241r = eVar;
                }

                /* JADX INFO: renamed from: a */
                public final void m23471a() {
                    C5823a c5823a = C5823a.f18201a;
                    Iterator it = C5823a.f18205e.iterator();
                    while (it.hasNext()) {
                        AbstractC1960a.m7104a(it.next());
                        C5823a c5823a2 = C5823a.f18201a;
                        try {
                            C4712s.a aVar = C4712s.f13928r;
                            throw null;
                        } catch (Throwable th) {
                            C4712s.a aVar2 = C4712s.f13928r;
                            C4712s.m18798b(AbstractC4713t.m18807a(th));
                        }
                    }
                }

                @Override // p010a9.InterfaceC0173a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m23471a();
                    return C4700i0.f13910a;
                }
            }

            /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$k$e, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10173e extends AbstractC1067w implements InterfaceC0173a {

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ e f18242r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10173e(e eVar) {
                    super(0);
                    this.f18242r = eVar;
                }

                /* JADX INFO: renamed from: a */
                public final void m23472a() {
                    C5823a c5823a = C5823a.f18201a;
                    Iterator it = C5823a.f18205e.iterator();
                    while (it.hasNext()) {
                        AbstractC1960a.m7104a(it.next());
                        C5823a c5823a2 = C5823a.f18201a;
                        try {
                            C4712s.a aVar = C4712s.f13928r;
                            throw null;
                        } catch (Throwable th) {
                            C4712s.a aVar2 = C4712s.f13928r;
                            C4712s.m18798b(AbstractC4713t.m18807a(th));
                        }
                    }
                }

                @Override // p010a9.InterfaceC0173a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m23472a();
                    return C4700i0.f13910a;
                }
            }

            public k() {
                super(0);
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8680d invoke() {
                return new C8680d(e.this.f18224q, e.this, C5823a.f18203c, a.f18239r, new b(e.this), new c(e.this), new d(e.this), new C10173e(e.this));
            }
        }

        public e(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
            this.f18224q = str;
            this.f18225r = str2;
            this.f18226s = bArr;
            this.f18227t = classLoader;
            this.f18228u = AbstractC4706m.m18788b(EnumC4708o.f13923s, new k());
        }

        /* JADX INFO: renamed from: F */
        public final List m23444F(String str, boolean z10, C8928a c8928a) throws Throwable {
            d dVar = d.METHOD_SINGLE;
            b bVar = c8928a != null ? new b(c8928a) : null;
            c cVar = c.f18230r;
            d dVar2 = d.f18231r;
            AbstractC9231a abstractC9231a = bVar != null ? (AbstractC9231a) bVar.invoke() : null;
            C8681e.a aVarM33357a = C8681e.f28797a.m33357a(C5823a.f18201a.m23436g(), C5823a.f18204d, C5823a.m23432h(), C8677a.f28773a.m33329a(this.f18224q, "l", str, abstractC9231a), z10, new C5824b(this), abstractC9231a != null ? new C5825c(this, cVar, abstractC9231a, dVar2) : null);
            aVarM33357a.m33359b();
            Object objM33358a = aVarM33357a.m33358a();
            if (C4712s.m18801e(objM33358a) == null) {
                Iterator it = C5823a.f18205e.iterator();
                while (it.hasNext()) {
                    AbstractC1960a.m7104a(it.next());
                    C5823a c5823a = C5823a.f18201a;
                    try {
                        C4712s.a aVar = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th) {
                        C4712s.a aVar2 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th));
                    }
                }
            } else {
                Iterator it2 = C5823a.f18205e.iterator();
                while (it2.hasNext()) {
                    AbstractC1960a.m7104a(it2.next());
                    C5823a c5823a2 = C5823a.f18201a;
                    try {
                        C4712s.a aVar3 = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th2) {
                        C4712s.a aVar4 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th2));
                    }
                }
            }
            AbstractC4713t.m18808b(objM33358a);
            return (List) objM33358a;
        }

        /* JADX INFO: renamed from: G */
        public final List m23445G(String str, boolean z10, C8929b c8929b) throws Throwable {
            d dVar = d.METHOD_SINGLE;
            C10172e c10172e = c8929b != null ? new C10172e(c8929b) : null;
            f fVar = f.f18233r;
            g gVar = g.f18234r;
            AbstractC9231a abstractC9231a = c10172e != null ? (AbstractC9231a) c10172e.invoke() : null;
            C8681e.a aVarM33357a = C8681e.f28797a.m33357a(C5823a.f18201a.m23436g(), C5823a.f18204d, C5823a.m23432h(), C8677a.f28773a.m33329a(this.f18224q, "l", str, abstractC9231a), z10, new C5824b(this), abstractC9231a != null ? new C5825c(this, fVar, abstractC9231a, gVar) : null);
            aVarM33357a.m33359b();
            Object objM33358a = aVarM33357a.m33358a();
            if (C4712s.m18801e(objM33358a) == null) {
                Iterator it = C5823a.f18205e.iterator();
                while (it.hasNext()) {
                    AbstractC1960a.m7104a(it.next());
                    C5823a c5823a = C5823a.f18201a;
                    try {
                        C4712s.a aVar = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th) {
                        C4712s.a aVar2 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th));
                    }
                }
            } else {
                Iterator it2 = C5823a.f18205e.iterator();
                while (it2.hasNext()) {
                    AbstractC1960a.m7104a(it2.next());
                    C5823a c5823a2 = C5823a.f18201a;
                    try {
                        C4712s.a aVar3 = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th2) {
                        C4712s.a aVar4 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th2));
                    }
                }
            }
            AbstractC4713t.m18808b(objM33358a);
            return (List) objM33358a;
        }

        /* JADX INFO: renamed from: K */
        public final List m23446K(String str, boolean z10, C8930c c8930c) throws Throwable {
            j jVar = c8930c != null ? new j(c8930c) : null;
            d dVar = d.METHOD_SINGLE;
            h hVar = h.f18235r;
            i iVar = i.f18236r;
            AbstractC9231a abstractC9231a = jVar != null ? (AbstractC9231a) jVar.invoke() : null;
            C8681e.a aVarM33357a = C8681e.f28797a.m33357a(C5823a.f18201a.m23436g(), C5823a.f18204d, C5823a.m23432h(), C8677a.f28773a.m33329a(this.f18224q, "l", str, abstractC9231a), z10, new C5824b(this), abstractC9231a != null ? new C5825c(this, hVar, abstractC9231a, iVar) : null);
            aVarM33357a.m33359b();
            Object objM33358a = aVarM33357a.m33358a();
            if (C4712s.m18801e(objM33358a) == null) {
                Iterator it = C5823a.f18205e.iterator();
                while (it.hasNext()) {
                    AbstractC1960a.m7104a(it.next());
                    C5823a c5823a = C5823a.f18201a;
                    try {
                        C4712s.a aVar = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th) {
                        C4712s.a aVar2 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th));
                    }
                }
            } else {
                Iterator it2 = C5823a.f18205e.iterator();
                while (it2.hasNext()) {
                    AbstractC1960a.m7104a(it2.next());
                    C5823a c5823a2 = C5823a.f18201a;
                    try {
                        C4712s.a aVar3 = C4712s.f13928r;
                        throw null;
                    } catch (Throwable th2) {
                        C4712s.a aVar4 = C4712s.f13928r;
                        C4712s.m18798b(AbstractC4713t.m18807a(th2));
                    }
                }
            }
            AbstractC4713t.m18808b(objM33358a);
            return (List) objM33358a;
        }

        /* JADX INFO: renamed from: L */
        public final boolean m23447L() {
            return m23456x().m33352m();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m23456x().m33349j();
        }

        /* JADX INFO: renamed from: h */
        public final DexKitBridge m23448h() {
            String str = this.f18225r;
            if (str != null) {
                return DexKitBridge.INSTANCE.m23405x(str);
            }
            byte[][] bArr = this.f18226s;
            if (bArr != null) {
                return DexKitBridge.INSTANCE.m23406y(bArr);
            }
            ClassLoader classLoader = this.f18227t;
            if (classLoader != null) {
                return DexKitBridge.INSTANCE.m23404w(classLoader, true);
            }
            C10010p0.m38820a("init fail");
            return null;
        }

        /* JADX INFO: renamed from: j */
        public final void m23449j() {
            m23456x().m33351l();
        }

        /* JADX INFO: renamed from: k */
        public final List m23450k(String str, C8928a c8928a) {
            str.getClass();
            c8928a.getClass();
            return m23444F(str, false, c8928a);
        }

        /* JADX INFO: renamed from: l */
        public final List m23451l(C8928a c8928a) {
            c8928a.getClass();
            return m23444F(null, false, c8928a);
        }

        /* JADX INFO: renamed from: m */
        public final List m23452m(String str, C8929b c8929b) {
            str.getClass();
            c8929b.getClass();
            return m23445G(str, false, c8929b);
        }

        /* JADX INFO: renamed from: n */
        public final List m23453n(C8929b c8929b) {
            c8929b.getClass();
            return m23445G(null, false, c8929b);
        }

        /* JADX INFO: renamed from: q */
        public final List m23454q(String str, C8930c c8930c) {
            str.getClass();
            c8930c.getClass();
            return m23446K(str, false, c8930c);
        }

        /* JADX INFO: renamed from: t */
        public final List m23455t(C8930c c8930c) {
            c8930c.getClass();
            return m23446K(null, false, c8930c);
        }

        /* JADX INFO: renamed from: x */
        public final C8680d m23456x() {
            return (C8680d) this.f18228u.getValue();
        }

        /* JADX INFO: renamed from: org.luckypray.dexkit.a$e$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ e m23457a(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new e(str, str2, null, null, null);
            }

            public a() {
            }
        }

        public /* synthetic */ e(String str, String str2, byte[][] bArr, ClassLoader classLoader, AbstractC1043k abstractC1043k) {
            this(str, str2, bArr, classLoader);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final boolean f18212a;

        /* JADX INFO: renamed from: b */
        public final b f18213b;

        public /* synthetic */ c(boolean z10, b bVar, int i10, AbstractC1043k abstractC1043k) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? b.NONE : bVar);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23438a() {
            return this.f18212a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f18212a == cVar.f18212a && this.f18213b == cVar.f18213b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f18212a) * 31) + this.f18213b.hashCode();
        }

        public String toString() {
            return "CachePolicy(cacheSuccess=" + this.f18212a + ", failurePolicy=" + this.f18213b + ")";
        }

        public c(boolean z10, b bVar) {
            bVar.getClass();
            this.f18212a = z10;
            this.f18213b = bVar;
        }
    }
}
