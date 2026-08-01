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

/* JADX INFO: renamed from: J3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0855p {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String abi;
    private final String brand;
    private final String model;
    private final int release;
    private final int sdk;

    /* JADX INFO: renamed from: J3.p$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.DeviceInfo", aVar, 5);
            c3196l.m5464l("abi", false);
            c3196l.m5464l("sdk", false);
            c3196l.m5464l("release", false);
            c3196l.m5464l("brand", false);
            c3196l.m5464l("model", false);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            C3191g c3191g = C3191g.f9946a;
            return new InterfaceC2798a[]{c3201q, c3191g, c3191g, c3201q, c3201q};
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
        public final C0855p mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            int iM5591j = 0;
            int iM5591j2 = 0;
            String strM5595n = null;
            String strM5595n2 = null;
            String strM5595n3 = null;
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
                    iM5591j2 = c3343gMo5422a.m5591j(interfaceC2933d, 2);
                    i5 |= 4;
                } else if (iM5590i == 3) {
                    strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 3);
                    i5 |= 8;
                } else {
                    if (iM5590i != 4) {
                        throw new C2801d(iM5590i);
                    }
                    strM5595n3 = c3343gMo5422a.m5595n(interfaceC2933d, 4);
                    i5 |= 16;
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0855p(i5, strM5595n, iM5591j, iM5591j2, strM5595n2, strM5595n3, null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0855p c0855p) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0855p, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0855p.m1784m(c0855p, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.p$b */
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

    public /* synthetic */ C0855p(int i5, String str, int i6, int i7, String str2, String str3, AbstractC3200p abstractC3200p) {
        if (31 != (i5 & 31)) {
            AbstractC3194j.m5462d(i5, 31, a.INSTANCE.mo1486e());
            throw null;
        }
        this.abi = str;
        this.sdk = i6;
        this.release = i7;
        this.brand = str2;
        this.model = str3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0855p m1783g(C0855p c0855p, String str, int i5, int i6, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = c0855p.abi;
        }
        if ((i7 & 2) != 0) {
            i5 = c0855p.sdk;
        }
        if ((i7 & 4) != 0) {
            i6 = c0855p.release;
        }
        if ((i7 & 8) != 0) {
            str2 = c0855p.brand;
        }
        if ((i7 & 16) != 0) {
            str3 = c0855p.model;
        }
        String str4 = str3;
        int i8 = i6;
        return c0855p.m1790f(str, i5, i8, str2, str4);
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ void m1784m(C0855p c0855p, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0855p.abi);
        c2981c0.m5190p(1, c0855p.sdk, interfaceC2933d);
        c2981c0.m5190p(2, c0855p.release, interfaceC2933d);
        c2981c0.m5193s(interfaceC2933d, 3, c0855p.brand);
        c2981c0.m5193s(interfaceC2933d, 4, c0855p.model);
    }

    /* JADX INFO: renamed from: a */
    public final String m1785a() {
        return this.abi;
    }

    /* JADX INFO: renamed from: b */
    public final int m1786b() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: c */
    public final int m1787c() {
        return this.release;
    }

    /* JADX INFO: renamed from: d */
    public final String m1788d() {
        return this.brand;
    }

    /* JADX INFO: renamed from: e */
    public final String m1789e() {
        return this.model;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0855p)) {
            return false;
        }
        C0855p c0855p = (C0855p) obj;
        return AbstractC1665j.m2981a(this.abi, c0855p.abi) && this.sdk == c0855p.sdk && this.release == c0855p.release && AbstractC1665j.m2981a(this.brand, c0855p.brand) && AbstractC1665j.m2981a(this.model, c0855p.model);
    }

    /* JADX INFO: renamed from: f */
    public final C0855p m1790f(String str, int i5, int i6, String str2, String str3) {
        AbstractC1665j.m2985e(str, "abi");
        AbstractC1665j.m2985e(str2, "brand");
        AbstractC1665j.m2985e(str3, "model");
        return new C0855p(str, i5, i6, str2, str3);
    }

    /* JADX INFO: renamed from: h */
    public final String m1791h() {
        return this.abi;
    }

    public int hashCode() {
        return this.model.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m391b(this.release, AbstractC0231b.m391b(this.sdk, this.abi.hashCode() * 31, 31), 31), 31, this.brand);
    }

    /* JADX INFO: renamed from: i */
    public final String m1792i() {
        return this.brand;
    }

    /* JADX INFO: renamed from: j */
    public final String m1793j() {
        return this.model;
    }

    /* JADX INFO: renamed from: k */
    public final int m1794k() {
        return this.release;
    }

    /* JADX INFO: renamed from: l */
    public final int m1795l() {
        return this.sdk;
    }

    public String toString() {
        String str = this.abi;
        int i5 = this.sdk;
        int i6 = this.release;
        String str2 = this.brand;
        String str3 = this.model;
        StringBuilder sb = new StringBuilder("DeviceInfo(abi=");
        sb.append(str);
        sb.append(", sdk=");
        sb.append(i5);
        sb.append(", release=");
        sb.append(i6);
        sb.append(", brand=");
        sb.append(str2);
        sb.append(", model=");
        return AbstractC0231b.m403n(sb, str3, ")");
    }

    public C0855p(String str, int i5, int i6, String str2, String str3) {
        AbstractC1665j.m2985e(str, "abi");
        AbstractC1665j.m2985e(str2, "brand");
        AbstractC1665j.m2985e(str3, "model");
        this.abi = str;
        this.sdk = i5;
        this.release = i6;
        this.brand = str2;
        this.model = str3;
    }
}
