package p053J3;

import me.dartcv.nuke.BuildConfig;
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

/* JADX INFO: renamed from: J3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0833B {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String downloadUrl;
    private final boolean isFocusUpdate;
    private final String lastVersion;
    private final String limitVersion;
    private final String message;
    private final long updateTime;

    /* JADX INFO: renamed from: J3.B$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.Update", aVar, 6);
            c3196l.m5464l("lastVersion", false);
            c3196l.m5464l("limitVersion", false);
            c3196l.m5464l("updateTime", false);
            c3196l.m5464l("message", false);
            c3196l.m5464l("downloadUrl", false);
            c3196l.m5464l("isFocusUpdate", false);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            return new InterfaceC2798a[]{c3201q, c3201q, C3192h.f9948a, c3201q, c3201q, C3187c.f9939a};
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
        public final C0833B mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            boolean zM5589h = false;
            String strM5595n = null;
            String strM5595n2 = null;
            String strM5595n3 = null;
            String strM5595n4 = null;
            long jM5592k = 0;
            boolean z5 = true;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                switch (iM5590i) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 0);
                        i5 |= 1;
                        break;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        jM5592k = c3343gMo5422a.m5592k(interfaceC2933d, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        strM5595n3 = c3343gMo5422a.m5595n(interfaceC2933d, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        strM5595n4 = c3343gMo5422a.m5595n(interfaceC2933d, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        zM5589h = c3343gMo5422a.m5589h(interfaceC2933d, 5);
                        i5 |= 32;
                        break;
                    default:
                        throw new C2801d(iM5590i);
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0833B(i5, strM5595n, strM5595n2, jM5592k, strM5595n3, strM5595n4, zM5589h, null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0833B c0833b) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0833b, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0833B.m1490o(c0833b, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.B$b */
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

    public /* synthetic */ C0833B(int i5, String str, String str2, long j5, String str3, String str4, boolean z5, AbstractC3200p abstractC3200p) {
        if (63 != (i5 & 63)) {
            AbstractC3194j.m5462d(i5, 63, a.INSTANCE.mo1486e());
            throw null;
        }
        this.lastVersion = str;
        this.limitVersion = str2;
        this.updateTime = j5;
        this.message = str3;
        this.downloadUrl = str4;
        this.isFocusUpdate = z5;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0833B m1489h(C0833B c0833b, String str, String str2, long j5, String str3, String str4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0833b.lastVersion;
        }
        if ((i5 & 2) != 0) {
            str2 = c0833b.limitVersion;
        }
        if ((i5 & 4) != 0) {
            j5 = c0833b.updateTime;
        }
        if ((i5 & 8) != 0) {
            str3 = c0833b.message;
        }
        if ((i5 & 16) != 0) {
            str4 = c0833b.downloadUrl;
        }
        if ((i5 & 32) != 0) {
            z5 = c0833b.isFocusUpdate;
        }
        boolean z6 = z5;
        String str5 = str3;
        long j6 = j5;
        return c0833b.m1497g(str, str2, j6, str5, str4, z6);
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m1490o(C0833B c0833b, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0833b.lastVersion);
        c2981c0.m5193s(interfaceC2933d, 1, c0833b.limitVersion);
        c2981c0.m5191q(interfaceC2933d, 2, c0833b.updateTime);
        c2981c0.m5193s(interfaceC2933d, 3, c0833b.message);
        c2981c0.m5193s(interfaceC2933d, 4, c0833b.downloadUrl);
        c2981c0.m5188n(interfaceC2933d, 5, c0833b.isFocusUpdate);
    }

    /* JADX INFO: renamed from: a */
    public final String m1491a() {
        return this.lastVersion;
    }

    /* JADX INFO: renamed from: b */
    public final String m1492b() {
        return this.limitVersion;
    }

    /* JADX INFO: renamed from: c */
    public final long m1493c() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: d */
    public final String m1494d() {
        return this.message;
    }

    /* JADX INFO: renamed from: e */
    public final String m1495e() {
        return this.downloadUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0833B)) {
            return false;
        }
        C0833B c0833b = (C0833B) obj;
        return AbstractC1665j.m2981a(this.lastVersion, c0833b.lastVersion) && AbstractC1665j.m2981a(this.limitVersion, c0833b.limitVersion) && this.updateTime == c0833b.updateTime && AbstractC1665j.m2981a(this.message, c0833b.message) && AbstractC1665j.m2981a(this.downloadUrl, c0833b.downloadUrl) && this.isFocusUpdate == c0833b.isFocusUpdate;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1496f() {
        return this.isFocusUpdate;
    }

    /* JADX INFO: renamed from: g */
    public final C0833B m1497g(String str, String str2, long j5, String str3, String str4, boolean z5) {
        AbstractC1665j.m2985e(str, "lastVersion");
        AbstractC1665j.m2985e(str2, "limitVersion");
        AbstractC1665j.m2985e(str3, "message");
        AbstractC1665j.m2985e(str4, "downloadUrl");
        return new C0833B(str, str2, j5, str3, str4, z5);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFocusUpdate) + AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m392c(AbstractC0231b.m394e(this.lastVersion.hashCode() * 31, 31, this.limitVersion), 31, this.updateTime), 31, this.message), 31, this.downloadUrl);
    }

    /* JADX INFO: renamed from: i */
    public final String m1498i() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: j */
    public final String m1499j() {
        return this.lastVersion;
    }

    /* JADX INFO: renamed from: k */
    public final String m1500k() {
        return this.limitVersion;
    }

    /* JADX INFO: renamed from: l */
    public final String m1501l() {
        return this.message;
    }

    /* JADX INFO: renamed from: m */
    public final long m1502m() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1503n() {
        return this.isFocusUpdate;
    }

    public String toString() {
        String str = this.lastVersion;
        String str2 = this.limitVersion;
        long j5 = this.updateTime;
        String str3 = this.message;
        String str4 = this.downloadUrl;
        boolean z5 = this.isFocusUpdate;
        StringBuilder sbM405p = AbstractC0231b.m405p("Update(lastVersion=", str, ", limitVersion=", str2, ", updateTime=");
        sbM405p.append(j5);
        sbM405p.append(", message=");
        sbM405p.append(str3);
        sbM405p.append(", downloadUrl=");
        sbM405p.append(str4);
        sbM405p.append(", isFocusUpdate=");
        sbM405p.append(z5);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    public C0833B(String str, String str2, long j5, String str3, String str4, boolean z5) {
        AbstractC1665j.m2985e(str, "lastVersion");
        AbstractC1665j.m2985e(str2, "limitVersion");
        AbstractC1665j.m2985e(str3, "message");
        AbstractC1665j.m2985e(str4, "downloadUrl");
        this.lastVersion = str;
        this.limitVersion = str2;
        this.updateTime = j5;
        this.message = str3;
        this.downloadUrl = str4;
        this.isFocusUpdate = z5;
    }
}
