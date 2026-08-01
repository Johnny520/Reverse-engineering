package p053J3;

import p011B4.AbstractC0231b;
import p056K2.InterfaceC0875a;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p214o3.C2801d;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p227r.C2981c0;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p236s3.AbstractC3194j;
import p236s3.AbstractC3200p;
import p236s3.C3191g;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0860u {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final int hostType;
    private final String patchId;
    private final String version;
    private final int versionCode;

    /* JADX INFO: renamed from: J3.u$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.HostInfo", aVar, 4);
            c3196l.m5464l("version", false);
            c3196l.m5464l("versionCode", false);
            c3196l.m5464l("patchId", false);
            c3196l.m5464l("hostType", false);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            C3191g c3191g = C3191g.f9946a;
            return new InterfaceC2798a[]{c3201q, c3191g, c3201q, c3191g};
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: d */
        public /* bridge */ InterfaceC2798a[] mo1485d() {
            return AbstractC3194j.f9953b;
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: e */
        public final InterfaceC2933d mo1486e() {
            return descriptor;
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C0860u mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            int iM5591j = 0;
            int iM5591j2 = 0;
            String strM5595n = null;
            String strM5595n2 = null;
            boolean z5 = true;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                if (iM5590i == -1) {
                    z5 = false;
                } else if (iM5590i == 0) {
                    strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 0);
                    i5 |= 1;
                } else if (iM5590i == 1) {
                    iM5591j = c3343gMo5422a.m5591j(interfaceC2933d, 1);
                    i5 |= 2;
                } else if (iM5590i == 2) {
                    strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 2);
                    i5 |= 4;
                } else {
                    if (iM5590i != 3) {
                        throw new C2801d(iM5590i);
                    }
                    iM5591j2 = c3343gMo5422a.m5591j(interfaceC2933d, 3);
                    i5 |= 8;
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0860u(i5, strM5595n, iM5591j, strM5595n2, iM5591j2, null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0860u c0860u) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0860u, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0860u.m1840k(c0860u, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.u$b */
    public static final class b {
        public /* synthetic */ b(AbstractC1661f abstractC1661f) {
            this();
        }

        public final InterfaceC2798a serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public /* synthetic */ C0860u(int i5, String str, int i6, String str2, int i7, AbstractC3200p abstractC3200p) {
        if (15 != (i5 & 15)) {
            AbstractC3194j.m5462d(i5, 15, a.INSTANCE.mo1486e());
            throw null;
        }
        this.version = str;
        this.versionCode = i6;
        this.patchId = str2;
        this.hostType = i7;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0860u m1839f(C0860u c0860u, String str, int i5, String str2, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = c0860u.version;
        }
        if ((i7 & 2) != 0) {
            i5 = c0860u.versionCode;
        }
        if ((i7 & 4) != 0) {
            str2 = c0860u.patchId;
        }
        if ((i7 & 8) != 0) {
            i6 = c0860u.hostType;
        }
        return c0860u.m1845e(str, i5, str2, i6);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m1840k(C0860u c0860u, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0860u.version);
        c2981c0.m5190p(1, c0860u.versionCode, interfaceC2933d);
        c2981c0.m5193s(interfaceC2933d, 2, c0860u.patchId);
        c2981c0.m5190p(3, c0860u.hostType, interfaceC2933d);
    }

    /* JADX INFO: renamed from: a */
    public final String m1841a() {
        return this.version;
    }

    /* JADX INFO: renamed from: b */
    public final int m1842b() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: c */
    public final String m1843c() {
        return this.patchId;
    }

    /* JADX INFO: renamed from: d */
    public final int m1844d() {
        return this.hostType;
    }

    /* JADX INFO: renamed from: e */
    public final C0860u m1845e(String str, int i5, String str2, int i6) {
        AbstractC1665j.m2985e(str, "version");
        AbstractC1665j.m2985e(str2, "patchId");
        return new C0860u(str, i5, str2, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0860u)) {
            return false;
        }
        C0860u c0860u = (C0860u) obj;
        return AbstractC1665j.m2981a(this.version, c0860u.version) && this.versionCode == c0860u.versionCode && AbstractC1665j.m2981a(this.patchId, c0860u.patchId) && this.hostType == c0860u.hostType;
    }

    /* JADX INFO: renamed from: g */
    public final int m1846g() {
        return this.hostType;
    }

    /* JADX INFO: renamed from: h */
    public final String m1847h() {
        return this.patchId;
    }

    public int hashCode() {
        return Integer.hashCode(this.hostType) + AbstractC0231b.m394e(AbstractC0231b.m391b(this.versionCode, this.version.hashCode() * 31, 31), 31, this.patchId);
    }

    /* JADX INFO: renamed from: i */
    public final String m1848i() {
        return this.version;
    }

    /* JADX INFO: renamed from: j */
    public final int m1849j() {
        return this.versionCode;
    }

    public String toString() {
        return "HostInfo(version=" + this.version + ", versionCode=" + this.versionCode + ", patchId=" + this.patchId + ", hostType=" + this.hostType + ")";
    }

    public C0860u(String str, int i5, String str2, int i6) {
        AbstractC1665j.m2985e(str, "version");
        AbstractC1665j.m2985e(str2, "patchId");
        this.version = str;
        this.versionCode = i5;
        this.patchId = str2;
        this.hostType = i6;
    }
}
