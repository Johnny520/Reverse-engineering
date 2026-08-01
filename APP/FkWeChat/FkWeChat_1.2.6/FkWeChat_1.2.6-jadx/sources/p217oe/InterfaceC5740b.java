package p217oe;

import be.AbstractC1113a;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: oe.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5740b {

    /* JADX INFO: renamed from: oe.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        PROPAGATE,
        CANCEL
    }

    /* JADX INFO: renamed from: a */
    c mo23222a(C5164c.a aVar, InterfaceC5590b interfaceC5590b);

    /* JADX INFO: renamed from: b */
    boolean mo12775b();

    /* JADX INFO: renamed from: c */
    boolean mo12776c(C5164c.a aVar);

    /* JADX INFO: renamed from: d */
    InterfaceC5590b mo23223d();

    /* JADX INFO: renamed from: e */
    int mo23224e(C5164c.a aVar);

    /* JADX INFO: renamed from: f */
    boolean mo23225f(a aVar);

    /* JADX INFO: renamed from: oe.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: d */
        public static final a f18100d = new a(null);

        /* JADX INFO: renamed from: e */
        public static final c f18101e;

        /* JADX INFO: renamed from: f */
        public static final c f18102f;

        /* JADX INFO: renamed from: g */
        public static final c f18103g;

        /* JADX INFO: renamed from: a */
        public final a f18104a;

        /* JADX INFO: renamed from: b */
        public final a f18105b;

        /* JADX INFO: renamed from: c */
        public final b f18106c;

        static {
            a aVar = a.f18095t;
            b bVar = b.PROPAGATE;
            f18101e = new c(aVar, aVar, bVar);
            f18102f = new c(aVar, aVar, b.CANCEL);
            f18103g = new c(a.f18094s, a.f18092q, bVar);
        }

        public c(a aVar, a aVar2, b bVar) {
            aVar.getClass();
            aVar2.getClass();
            bVar.getClass();
            this.f18104a = aVar;
            this.f18105b = aVar2;
            this.f18106c = bVar;
        }

        /* JADX INFO: renamed from: d */
        public final a m23232d() {
            return this.f18104a;
        }

        /* JADX INFO: renamed from: e */
        public final b m23233e() {
            return this.f18106c;
        }

        /* JADX INFO: renamed from: f */
        public final a m23234f() {
            return this.f18105b;
        }

        /* JADX INFO: renamed from: oe.b$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final c m23235a() {
                return c.f18102f;
            }

            /* JADX INFO: renamed from: b */
            public final c m23236b() {
                return c.f18103g;
            }

            /* JADX INFO: renamed from: c */
            public final c m23237c() {
                return c.f18101e;
            }

            public a() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oe.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f18092q = new b("DONE", 0);

        /* JADX INFO: renamed from: r */
        public static final a f18093r = new c("DROP", 1);

        /* JADX INFO: renamed from: s */
        public static final a f18094s = new C10171a("DEFAULT", 2);

        /* JADX INFO: renamed from: t */
        public static final a f18095t = new d("NOTHING", 3);

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ a[] f18096u = m23226a();

        /* JADX INFO: renamed from: oe.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10171a extends a {
            public C10171a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p217oe.InterfaceC5740b.a
            /* JADX INFO: renamed from: c */
            public void mo23227c(C5168g.a aVar, AbstractC1113a abstractC1113a) {
                aVar.getClass();
                abstractC1113a.getClass();
                throw new UnsupportedOperationException("Should not be invoked");
            }
        }

        /* JADX INFO: renamed from: oe.b$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p217oe.InterfaceC5740b.a
            /* JADX INFO: renamed from: c */
            public void mo23227c(C5168g.a aVar, AbstractC1113a abstractC1113a) {
                aVar.getClass();
                abstractC1113a.getClass();
                aVar.m21227a(abstractC1113a);
            }
        }

        /* JADX INFO: renamed from: oe.b$a$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends a {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p217oe.InterfaceC5740b.a
            /* JADX INFO: renamed from: c */
            public void mo23227c(C5168g.a aVar, AbstractC1113a abstractC1113a) {
                aVar.getClass();
                abstractC1113a.getClass();
            }
        }

        /* JADX INFO: renamed from: oe.b$a$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends a {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p217oe.InterfaceC5740b.a
            /* JADX INFO: renamed from: c */
            public void mo23227c(C5168g.a aVar, AbstractC1113a abstractC1113a) {
                aVar.getClass();
                abstractC1113a.getClass();
            }
        }

        public /* synthetic */ a(String str, int i10, AbstractC1043k abstractC1043k) {
            this(str, i10);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m23226a() {
            return new a[]{f18092q, f18093r, f18094s, f18095t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18096u.clone();
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo23227c(C5168g.a aVar, AbstractC1113a abstractC1113a);

        public a(String str, int i10) {
        }
    }
}
