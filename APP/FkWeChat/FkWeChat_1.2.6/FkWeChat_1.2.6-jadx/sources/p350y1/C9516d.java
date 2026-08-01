package p350y1;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p120i2.AbstractC3167a;
import p121i3.C3179i;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7168z0;
import p265s1.C7128q1;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9516d {

    /* JADX INFO: renamed from: k */
    public static final b f32347k;

    /* JADX INFO: renamed from: l */
    public static int f32348l;

    /* JADX INFO: renamed from: m */
    public static final Object f32349m;

    /* JADX INFO: renamed from: a */
    public final String f32350a;

    /* JADX INFO: renamed from: b */
    public final float f32351b;

    /* JADX INFO: renamed from: c */
    public final float f32352c;

    /* JADX INFO: renamed from: d */
    public final float f32353d;

    /* JADX INFO: renamed from: e */
    public final float f32354e;

    /* JADX INFO: renamed from: f */
    public final C9526n f32355f;

    /* JADX INFO: renamed from: g */
    public final long f32356g;

    /* JADX INFO: renamed from: h */
    public final int f32357h;

    /* JADX INFO: renamed from: i */
    public final boolean f32358i;

    /* JADX INFO: renamed from: j */
    public final int f32359j;

    static {
        b bVar = new b(null);
        f32347k = bVar;
        f32349m = bVar;
    }

    public /* synthetic */ C9516d(String str, float f10, float f11, float f12, float f13, C9526n c9526n, long j10, int i10, boolean z10, int i11, int i12, AbstractC1043k abstractC1043k) {
        this(str, f10, f11, f12, f13, c9526n, j10, i10, z10, (i12 & 512) != 0 ? f32347k.m37138a() : i11, null);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37109d() {
        return this.f32358i;
    }

    /* JADX INFO: renamed from: e */
    public final float m37110e() {
        return this.f32352c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9516d)) {
            return false;
        }
        C9516d c9516d = (C9516d) obj;
        return AbstractC1061t.m3842c(this.f32350a, c9516d.f32350a) && C3179i.m12005m(this.f32351b, c9516d.f32351b) && C3179i.m12005m(this.f32352c, c9516d.f32352c) && this.f32353d == c9516d.f32353d && this.f32354e == c9516d.f32354e && AbstractC1061t.m3842c(this.f32355f, c9516d.f32355f) && C7128q1.m28131q(this.f32356g, c9516d.f32356g) && AbstractC7168z0.m28276E(this.f32357h, c9516d.f32357h) && this.f32358i == c9516d.f32358i;
    }

    /* JADX INFO: renamed from: f */
    public final float m37111f() {
        return this.f32351b;
    }

    /* JADX INFO: renamed from: g */
    public final int m37112g() {
        return this.f32359j;
    }

    /* JADX INFO: renamed from: h */
    public final String m37113h() {
        return this.f32350a;
    }

    public int hashCode() {
        return (((((((((((((((this.f32350a.hashCode() * 31) + C3179i.m12006n(this.f32351b)) * 31) + C3179i.m12006n(this.f32352c)) * 31) + Float.hashCode(this.f32353d)) * 31) + Float.hashCode(this.f32354e)) * 31) + this.f32355f.hashCode()) * 31) + C7128q1.m28137w(this.f32356g)) * 31) + AbstractC7168z0.m28277F(this.f32357h)) * 31) + Boolean.hashCode(this.f32358i);
    }

    /* JADX INFO: renamed from: i */
    public final C9526n m37114i() {
        return this.f32355f;
    }

    /* JADX INFO: renamed from: j */
    public final int m37115j() {
        return this.f32357h;
    }

    /* JADX INFO: renamed from: k */
    public final long m37116k() {
        return this.f32356g;
    }

    /* JADX INFO: renamed from: l */
    public final float m37117l() {
        return this.f32354e;
    }

    /* JADX INFO: renamed from: m */
    public final float m37118m() {
        return this.f32353d;
    }

    /* JADX INFO: renamed from: y1.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m37138a() {
            int i10;
            synchronized (C9516d.f32349m) {
                i10 = C9516d.f32348l;
                C9516d.f32348l = i10 + 1;
            }
            return i10;
        }

        public b() {
        }
    }

    public C9516d(String str, float f10, float f11, float f12, float f13, C9526n c9526n, long j10, int i10, boolean z10, int i11) {
        this.f32350a = str;
        this.f32351b = f10;
        this.f32352c = f11;
        this.f32353d = f12;
        this.f32354e = f13;
        this.f32355f = c9526n;
        this.f32356g = j10;
        this.f32357h = i10;
        this.f32358i = z10;
        this.f32359j = i11;
    }

    public /* synthetic */ C9516d(String str, float f10, float f11, float f12, float f13, C9526n c9526n, long j10, int i10, boolean z10, int i11, AbstractC1043k abstractC1043k) {
        this(str, f10, f11, f12, f13, c9526n, j10, i10, z10, i11);
    }

    /* JADX INFO: renamed from: y1.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f32360a;

        /* JADX INFO: renamed from: b */
        public final float f32361b;

        /* JADX INFO: renamed from: c */
        public final float f32362c;

        /* JADX INFO: renamed from: d */
        public final float f32363d;

        /* JADX INFO: renamed from: e */
        public final float f32364e;

        /* JADX INFO: renamed from: f */
        public final long f32365f;

        /* JADX INFO: renamed from: g */
        public final int f32366g;

        /* JADX INFO: renamed from: h */
        public final boolean f32367h;

        /* JADX INFO: renamed from: i */
        public final ArrayList f32368i;

        /* JADX INFO: renamed from: j */
        public C10257a f32369j;

        /* JADX INFO: renamed from: k */
        public boolean f32370k;

        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f32360a = str;
            this.f32361b = f10;
            this.f32362c = f11;
            this.f32363d = f12;
            this.f32364e = f13;
            this.f32365f = j10;
            this.f32366g = i10;
            this.f32367h = z10;
            ArrayList arrayList = new ArrayList();
            this.f32368i = arrayList;
            C10257a c10257a = new C10257a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f32369j = c10257a;
            AbstractC9517e.m37144f(arrayList, c10257a);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m37119b(a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 16) != 0) {
                f13 = 1.0f;
            }
            if ((i10 & 32) != 0) {
                f14 = 1.0f;
            }
            if ((i10 & 64) != 0) {
                f15 = 0.0f;
            }
            if ((i10 & 128) != 0) {
                f16 = 0.0f;
            }
            if ((i10 & 256) != 0) {
                list = AbstractC9527o.m37282d();
            }
            float f17 = f16;
            List list2 = list;
            float f18 = f15;
            float f19 = f13;
            return aVar.m37121a(str, f10, f11, f12, f19, f14, f18, f17, list2);
        }

        /* JADX INFO: renamed from: a */
        public final a m37121a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list) {
            m37126h();
            AbstractC9517e.m37144f(this.f32368i, new C10257a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m37122c(List list, int i10, String str, AbstractC7078g1 abstractC7078g1, float f10, AbstractC7078g1 abstractC7078g12, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            m37126h();
            m37127i().m37128a().add(new C9531s(str, list, i10, abstractC7078g1, f10, abstractC7078g12, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final C9526n m37123e(C10257a c10257a) {
            return new C9526n(c10257a.m37130c(), c10257a.m37133f(), c10257a.m37131d(), c10257a.m37132e(), c10257a.m37134g(), c10257a.m37135h(), c10257a.m37136i(), c10257a.m37137j(), c10257a.m37129b(), c10257a.m37128a());
        }

        /* JADX INFO: renamed from: f */
        public final C9516d m37124f() {
            m37126h();
            while (this.f32368i.size() > 1) {
                m37125g();
            }
            C9516d c9516d = new C9516d(this.f32360a, this.f32361b, this.f32362c, this.f32363d, this.f32364e, m37123e(this.f32369j), this.f32365f, this.f32366g, this.f32367h, 0, 512, null);
            this.f32370k = true;
            return c9516d;
        }

        /* JADX INFO: renamed from: g */
        public final a m37125g() {
            m37126h();
            m37127i().m37128a().add(m37123e((C10257a) AbstractC9517e.m37143e(this.f32368i)));
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m37126h() {
            if (this.f32370k) {
                AbstractC3167a.m11956b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        /* JADX INFO: renamed from: i */
        public final C10257a m37127i() {
            return (C10257a) AbstractC9517e.m37142d(this.f32368i);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, AbstractC1043k abstractC1043k) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, AbstractC1043k abstractC1043k) {
            this((i11 & 1) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str, f10, f11, f12, f13, (i11 & 32) != 0 ? C7128q1.f23644b.m28147h() : j10, (i11 & 64) != 0 ? AbstractC7168z0.f23700a.m28333z() : i10, (i11 & 128) != 0 ? false : z10, null);
        }

        /* JADX INFO: renamed from: y1.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10257a {

            /* JADX INFO: renamed from: a */
            public String f32371a;

            /* JADX INFO: renamed from: b */
            public float f32372b;

            /* JADX INFO: renamed from: c */
            public float f32373c;

            /* JADX INFO: renamed from: d */
            public float f32374d;

            /* JADX INFO: renamed from: e */
            public float f32375e;

            /* JADX INFO: renamed from: f */
            public float f32376f;

            /* JADX INFO: renamed from: g */
            public float f32377g;

            /* JADX INFO: renamed from: h */
            public float f32378h;

            /* JADX INFO: renamed from: i */
            public List f32379i;

            /* JADX INFO: renamed from: j */
            public List f32380j;

            public /* synthetic */ C10257a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, AbstractC1043k abstractC1043k) {
                this((i10 & 1) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? AbstractC9527o.m37282d() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }

            /* JADX INFO: renamed from: a */
            public final List m37128a() {
                return this.f32380j;
            }

            /* JADX INFO: renamed from: b */
            public final List m37129b() {
                return this.f32379i;
            }

            /* JADX INFO: renamed from: c */
            public final String m37130c() {
                return this.f32371a;
            }

            /* JADX INFO: renamed from: d */
            public final float m37131d() {
                return this.f32373c;
            }

            /* JADX INFO: renamed from: e */
            public final float m37132e() {
                return this.f32374d;
            }

            /* JADX INFO: renamed from: f */
            public final float m37133f() {
                return this.f32372b;
            }

            /* JADX INFO: renamed from: g */
            public final float m37134g() {
                return this.f32375e;
            }

            /* JADX INFO: renamed from: h */
            public final float m37135h() {
                return this.f32376f;
            }

            /* JADX INFO: renamed from: i */
            public final float m37136i() {
                return this.f32377g;
            }

            /* JADX INFO: renamed from: j */
            public final float m37137j() {
                return this.f32378h;
            }

            public C10257a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
                this.f32371a = str;
                this.f32372b = f10;
                this.f32373c = f11;
                this.f32374d = f12;
                this.f32375e = f13;
                this.f32376f = f14;
                this.f32377g = f15;
                this.f32378h = f16;
                this.f32379i = list;
                this.f32380j = list2;
            }
        }
    }
}
