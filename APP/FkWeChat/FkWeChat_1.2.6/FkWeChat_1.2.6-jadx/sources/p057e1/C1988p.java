package p057e1;

import androidx.compose.runtime.AbstractC0524k0;
import androidx.compose.runtime.AbstractC0566q0;
import androidx.compose.runtime.InterfaceC0457a3;
import androidx.compose.runtime.InterfaceC0610v5;
import p016b1.C0908d;
import p016b1.C0910f;
import p016b1.C0924t;
import p024b9.AbstractC1043k;
import p041d1.C1855e;

/* JADX INFO: renamed from: e1.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1988p extends C0908d implements InterfaceC0457a3 {

    /* JADX INFO: renamed from: w */
    public static final b f5522w = new b(null);

    /* JADX INFO: renamed from: x */
    public static final int f5523x = 8;

    /* JADX INFO: renamed from: y */
    public static final C1988p f5524y;

    /* JADX INFO: renamed from: e1.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C0910f implements InterfaceC0457a3.a {

        /* JADX INFO: renamed from: w */
        public C1988p f5525w;

        public a(C1988p c1988p) {
            super(c1988p);
            this.f5525w = c1988p;
        }

        @Override // p016b1.C0910f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC0524k0) {
                return m7178t((AbstractC0524k0) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof InterfaceC0610v5) {
                return m7179u((InterfaceC0610v5) obj);
            }
            return false;
        }

        @Override // p016b1.C0910f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC0524k0) {
                return m7180v((AbstractC0524k0) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC0524k0) ? obj2 : m7181w((AbstractC0524k0) obj, (InterfaceC0610v5) obj2);
        }

        @Override // p016b1.C0910f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC0524k0) {
                return m7182x((AbstractC0524k0) obj);
            }
            return null;
        }

        @Override // p016b1.C0910f
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C1988p build() {
            C1988p c1988p;
            if (m3340m() == this.f5525w.m3327t()) {
                c1988p = this.f5525w;
            } else {
                m3344q(new C1855e());
                c1988p = new C1988p(m3340m(), size());
            }
            this.f5525w = c1988p;
            return c1988p;
        }

        /* JADX INFO: renamed from: t */
        public /* bridge */ boolean m7178t(AbstractC0524k0 abstractC0524k0) {
            return super.containsKey(abstractC0524k0);
        }

        /* JADX INFO: renamed from: u */
        public /* bridge */ boolean m7179u(InterfaceC0610v5 interfaceC0610v5) {
            return super.containsValue(interfaceC0610v5);
        }

        /* JADX INFO: renamed from: v */
        public /* bridge */ InterfaceC0610v5 m7180v(AbstractC0524k0 abstractC0524k0) {
            return (InterfaceC0610v5) super.get(abstractC0524k0);
        }

        /* JADX INFO: renamed from: w */
        public /* bridge */ InterfaceC0610v5 m7181w(AbstractC0524k0 abstractC0524k0, InterfaceC0610v5 interfaceC0610v5) {
            return (InterfaceC0610v5) super.getOrDefault(abstractC0524k0, interfaceC0610v5);
        }

        /* JADX INFO: renamed from: x */
        public /* bridge */ InterfaceC0610v5 m7182x(AbstractC0524k0 abstractC0524k0) {
            return (InterfaceC0610v5) super.remove(abstractC0524k0);
        }
    }

    static {
        C0924t c0924tM3403a = C0924t.f2881e.m3403a();
        c0924tM3403a.getClass();
        f5524y = new C1988p(c0924tM3403a, 0);
    }

    public C1988p(C0924t c0924t, int i10) {
        super(c0924t, i10);
    }

    /* JADX INFO: renamed from: A */
    public /* bridge */ boolean m7172A(InterfaceC0610v5 interfaceC0610v5) {
        return super.containsValue(interfaceC0610v5);
    }

    /* JADX INFO: renamed from: B */
    public /* bridge */ InterfaceC0610v5 m7173B(AbstractC0524k0 abstractC0524k0) {
        return (InterfaceC0610v5) super.get(abstractC0524k0);
    }

    /* JADX INFO: renamed from: C */
    public /* bridge */ InterfaceC0610v5 m7174C(AbstractC0524k0 abstractC0524k0, InterfaceC0610v5 interfaceC0610v5) {
        return (InterfaceC0610v5) super.getOrDefault(abstractC0524k0, interfaceC0610v5);
    }

    @Override // androidx.compose.runtime.InterfaceC0559p0
    /* JADX INFO: renamed from: a */
    public Object mo2121a(AbstractC0524k0 abstractC0524k0) {
        return AbstractC0566q0.m2137b(this, abstractC0524k0);
    }

    @Override // p016b1.C0908d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0524k0) {
            return m7176z((AbstractC0524k0) obj);
        }
        return false;
    }

    @Override // p185m8.AbstractC5082h, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC0610v5) {
            return m7172A((InterfaceC0610v5) obj);
        }
        return false;
    }

    @Override // p016b1.C0908d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC0524k0) {
            return m7173B((AbstractC0524k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0524k0) ? obj2 : m7174C((AbstractC0524k0) obj, (InterfaceC0610v5) obj2);
    }

    @Override // androidx.compose.runtime.InterfaceC0457a3
    /* JADX INFO: renamed from: h */
    public InterfaceC0457a3 mo1517h(AbstractC0524k0 abstractC0524k0, InterfaceC0610v5 interfaceC0610v5) {
        C0924t.b bVarM3370P = m3327t().m3370P(abstractC0524k0.hashCode(), abstractC0524k0, interfaceC0610v5, 0);
        return bVarM3370P == null ? this : new C1988p(bVarM3370P.m3404a(), size() + bVarM3370P.m3405b());
    }

    @Override // p016b1.C0908d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    /* JADX INFO: renamed from: z */
    public /* bridge */ boolean m7176z(AbstractC0524k0 abstractC0524k0) {
        return super.containsKey(abstractC0524k0);
    }

    /* JADX INFO: renamed from: e1.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1988p m7183a() {
            return C1988p.f5524y;
        }

        public b() {
        }
    }
}
