package p274t;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: t.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7835g0 {

    /* JADX INFO: renamed from: a */
    public static final b f26136a = new b(null);

    /* JADX INFO: renamed from: b */
    public static final AbstractC7835g0 f26137b = a.f26140e;

    /* JADX INFO: renamed from: c */
    public static final AbstractC7835g0 f26138c = e.f26143e;

    /* JADX INFO: renamed from: d */
    public static final AbstractC7835g0 f26139d = c.f26141e;

    /* JADX INFO: renamed from: t.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC7835g0 {

        /* JADX INFO: renamed from: e */
        public static final a f26140e = new a();

        public a() {
            super(null);
        }

        @Override // p274t.AbstractC7835g0
        /* JADX INFO: renamed from: a */
        public int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11) {
            return i10 / 2;
        }
    }

    /* JADX INFO: renamed from: t.g0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC7835g0 {

        /* JADX INFO: renamed from: e */
        public static final c f26141e = new c();

        public c() {
            super(null);
        }

        @Override // p274t.AbstractC7835g0
        /* JADX INFO: renamed from: a */
        public int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11) {
            if (enumC3191u == EnumC3191u.f8484q) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: t.g0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC7835g0 {

        /* JADX INFO: renamed from: e */
        public final InterfaceC4499e.b f26142e;

        public d(InterfaceC4499e.b bVar) {
            super(null);
            this.f26142e = bVar;
        }

        @Override // p274t.AbstractC7835g0
        /* JADX INFO: renamed from: a */
        public int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11) {
            return this.f26142e.mo17427a(0, i10, enumC3191u);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC1061t.m3842c(this.f26142e, ((d) obj).f26142e);
        }

        public int hashCode() {
            return this.f26142e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f26142e + ')';
        }
    }

    /* JADX INFO: renamed from: t.g0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC7835g0 {

        /* JADX INFO: renamed from: e */
        public static final e f26143e = new e();

        public e() {
            super(null);
        }

        @Override // p274t.AbstractC7835g0
        /* JADX INFO: renamed from: a */
        public int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11) {
            if (enumC3191u == EnumC3191u.f8484q) {
                return 0;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: t.g0$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC7835g0 {

        /* JADX INFO: renamed from: e */
        public final InterfaceC4499e.c f26144e;

        public f(InterfaceC4499e.c cVar) {
            super(null);
            this.f26144e = cVar;
        }

        @Override // p274t.AbstractC7835g0
        /* JADX INFO: renamed from: a */
        public int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11) {
            return this.f26144e.mo17428a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && AbstractC1061t.m3842c(this.f26144e, ((f) obj).f26144e);
        }

        public int hashCode() {
            return this.f26144e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f26144e + ')';
        }
    }

    public /* synthetic */ AbstractC7835g0(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo30361a(int i10, EnumC3191u enumC3191u, AbstractC3545l1 abstractC3545l1, int i11);

    /* JADX INFO: renamed from: b */
    public Integer m30362b(AbstractC3545l1 abstractC3545l1) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m30363c() {
        return false;
    }

    /* JADX INFO: renamed from: t.g0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC7835g0 m30364a(InterfaceC4499e.b bVar) {
            return new d(bVar);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC7835g0 m30365b(InterfaceC4499e.c cVar) {
            return new f(cVar);
        }

        public b() {
        }
    }

    public AbstractC7835g0() {
    }
}
