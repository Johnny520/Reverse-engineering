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
import p236s3.C3187c;
import p236s3.C3192h;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0865z {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final long applyTime;
    private final long deadline;
    private final boolean isPremium;
    private final String premiumKey;

    /* JADX INFO: renamed from: J3.z$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.Premium", aVar, 4);
            c3196l.m5464l("isPremium", false);
            c3196l.m5464l("premiumKey", false);
            c3196l.m5464l("deadline", false);
            c3196l.m5464l("applyTime", false);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3192h c3192h = C3192h.f9948a;
            return new InterfaceC2798a[]{C3187c.f9939a, C3201q.f9974a, c3192h, c3192h};
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
        public final C0865z mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            boolean zM5589h = false;
            String strM5595n = null;
            long jM5592k = 0;
            long jM5592k2 = 0;
            boolean z5 = true;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                if (iM5590i == -1) {
                    z5 = false;
                } else if (iM5590i == 0) {
                    zM5589h = c3343gMo5422a.m5589h(interfaceC2933d, 0);
                    i5 |= 1;
                } else if (iM5590i == 1) {
                    strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 1);
                    i5 |= 2;
                } else if (iM5590i == 2) {
                    jM5592k = c3343gMo5422a.m5592k(interfaceC2933d, 2);
                    i5 |= 4;
                } else {
                    if (iM5590i != 3) {
                        throw new C2801d(iM5590i);
                    }
                    jM5592k2 = c3343gMo5422a.m5592k(interfaceC2933d, 3);
                    i5 |= 8;
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0865z(i5, zM5589h, strM5595n, jM5592k, jM5592k2, null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0865z c0865z) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0865z, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0865z.m1880k(c0865z, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.z$b */
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

    public /* synthetic */ C0865z(int i5, boolean z5, String str, long j5, long j6, AbstractC3200p abstractC3200p) {
        if (15 != (i5 & 15)) {
            AbstractC3194j.m5462d(i5, 15, a.INSTANCE.mo1486e());
            throw null;
        }
        this.isPremium = z5;
        this.premiumKey = str;
        this.deadline = j5;
        this.applyTime = j6;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0865z m1879f(C0865z c0865z, boolean z5, String str, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = c0865z.isPremium;
        }
        if ((i5 & 2) != 0) {
            str = c0865z.premiumKey;
        }
        if ((i5 & 4) != 0) {
            j5 = c0865z.deadline;
        }
        if ((i5 & 8) != 0) {
            j6 = c0865z.applyTime;
        }
        long j7 = j6;
        return c0865z.m1885e(z5, str, j5, j7);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m1880k(C0865z c0865z, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5188n(interfaceC2933d, 0, c0865z.isPremium);
        c2981c0.m5193s(interfaceC2933d, 1, c0865z.premiumKey);
        c2981c0.m5191q(interfaceC2933d, 2, c0865z.deadline);
        c2981c0.m5191q(interfaceC2933d, 3, c0865z.applyTime);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1881a() {
        return this.isPremium;
    }

    /* JADX INFO: renamed from: b */
    public final String m1882b() {
        return this.premiumKey;
    }

    /* JADX INFO: renamed from: c */
    public final long m1883c() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: d */
    public final long m1884d() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: e */
    public final C0865z m1885e(boolean z5, String str, long j5, long j6) {
        AbstractC1665j.m2985e(str, "premiumKey");
        return new C0865z(z5, str, j5, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0865z)) {
            return false;
        }
        C0865z c0865z = (C0865z) obj;
        return this.isPremium == c0865z.isPremium && AbstractC1665j.m2981a(this.premiumKey, c0865z.premiumKey) && this.deadline == c0865z.deadline && this.applyTime == c0865z.applyTime;
    }

    /* JADX INFO: renamed from: g */
    public final long m1886g() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: h */
    public final long m1887h() {
        return this.deadline;
    }

    public int hashCode() {
        return Long.hashCode(this.applyTime) + AbstractC0231b.m392c(AbstractC0231b.m394e(Boolean.hashCode(this.isPremium) * 31, 31, this.premiumKey), 31, this.deadline);
    }

    /* JADX INFO: renamed from: i */
    public final String m1888i() {
        return this.premiumKey;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1889j() {
        return this.isPremium;
    }

    public String toString() {
        return "Premium(isPremium=" + this.isPremium + ", premiumKey=" + this.premiumKey + ", deadline=" + this.deadline + ", applyTime=" + this.applyTime + ")";
    }

    public C0865z(boolean z5, String str, long j5, long j6) {
        AbstractC1665j.m2985e(str, "premiumKey");
        this.isPremium = z5;
        this.premiumKey = str;
        this.deadline = j5;
        this.applyTime = j6;
    }
}
