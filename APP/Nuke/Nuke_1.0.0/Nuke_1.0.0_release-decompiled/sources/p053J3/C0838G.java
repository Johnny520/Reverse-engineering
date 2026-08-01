package p053J3;

import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p053J3.C0855p;
import p053J3.C0860u;
import p053J3.C0865z;
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
import p236s3.C3192h;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p237s4.AbstractC3202a;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0838G {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String avatarFilePath;
    private final String config;
    private final String cookies;
    private final C0855p deviceInfo;
    private final C0860u hostInfo;
    private final long lastLoginTime;
    private final String loginUin;
    private final String nickname;
    private final C0865z premium;

    /* JADX INFO: renamed from: J3.G$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.User", aVar, 9);
            c3196l.m5464l("premium", false);
            c3196l.m5464l("deviceInfo", false);
            c3196l.m5464l("hostInfo", false);
            c3196l.m5464l("loginUin", false);
            c3196l.m5464l("nickname", false);
            c3196l.m5464l("lastLoginTime", false);
            c3196l.m5464l("config", true);
            c3196l.m5464l("cookies", true);
            c3196l.m5464l("avatarFilePath", true);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            return new InterfaceC2798a[]{C0865z.a.INSTANCE, C0855p.a.INSTANCE, C0860u.a.INSTANCE, c3201q, c3201q, C3192h.f9948a, c3201q, c3201q, c3201q};
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
        public final C0838G mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            C0865z c0865z = null;
            C0855p c0855p = null;
            C0860u c0860u = null;
            String strM5595n = null;
            String strM5595n2 = null;
            String strM5595n3 = null;
            String strM5595n4 = null;
            String strM5595n5 = null;
            long jM5592k = 0;
            boolean z5 = true;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                switch (iM5590i) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        c0865z = (C0865z) c3343gMo5422a.m5594m(interfaceC2933d, 0, C0865z.a.INSTANCE, c0865z);
                        i5 |= 1;
                        break;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        c0855p = (C0855p) c3343gMo5422a.m5594m(interfaceC2933d, 1, C0855p.a.INSTANCE, c0855p);
                        i5 |= 2;
                        break;
                    case 2:
                        c0860u = (C0860u) c3343gMo5422a.m5594m(interfaceC2933d, 2, C0860u.a.INSTANCE, c0860u);
                        i5 |= 4;
                        break;
                    case 3:
                        strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        jM5592k = c3343gMo5422a.m5592k(interfaceC2933d, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        strM5595n3 = c3343gMo5422a.m5595n(interfaceC2933d, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        strM5595n4 = c3343gMo5422a.m5595n(interfaceC2933d, 7);
                        i5 |= 128;
                        break;
                    case 8:
                        strM5595n5 = c3343gMo5422a.m5595n(interfaceC2933d, 8);
                        i5 |= 256;
                        break;
                    default:
                        throw new C2801d(iM5590i);
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0838G(i5, c0865z, c0855p, c0860u, strM5595n, strM5595n2, jM5592k, strM5595n3, strM5595n4, strM5595n5, (AbstractC3200p) null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0838G c0838g) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0838g, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0838G.m1535u(c0838g, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.G$b */
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

    public /* synthetic */ C0838G(int i5, C0865z c0865z, C0855p c0855p, C0860u c0860u, String str, String str2, long j5, String str3, String str4, String str5, AbstractC3200p abstractC3200p) {
        if (63 != (i5 & 63)) {
            AbstractC3194j.m5462d(i5, 63, a.INSTANCE.mo1486e());
            throw null;
        }
        this.premium = c0865z;
        this.deviceInfo = c0855p;
        this.hostInfo = c0860u;
        this.loginUin = str;
        this.nickname = str2;
        this.lastLoginTime = j5;
        if ((i5 & 64) == 0) {
            this.config = "";
        } else {
            this.config = str3;
        }
        if ((i5 & 128) == 0) {
            this.cookies = "";
        } else {
            this.cookies = str4;
        }
        if ((i5 & 256) == 0) {
            this.avatarFilePath = "";
        } else {
            this.avatarFilePath = str5;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0838G m1534k(C0838G c0838g, C0865z c0865z, C0855p c0855p, C0860u c0860u, String str, String str2, long j5, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            c0865z = c0838g.premium;
        }
        if ((i5 & 2) != 0) {
            c0855p = c0838g.deviceInfo;
        }
        if ((i5 & 4) != 0) {
            c0860u = c0838g.hostInfo;
        }
        if ((i5 & 8) != 0) {
            str = c0838g.loginUin;
        }
        if ((i5 & 16) != 0) {
            str2 = c0838g.nickname;
        }
        if ((i5 & 32) != 0) {
            j5 = c0838g.lastLoginTime;
        }
        if ((i5 & 64) != 0) {
            str3 = c0838g.config;
        }
        if ((i5 & 128) != 0) {
            str4 = c0838g.cookies;
        }
        if ((i5 & 256) != 0) {
            str5 = c0838g.avatarFilePath;
        }
        String str6 = str5;
        String str7 = str3;
        long j6 = j5;
        String str8 = str;
        String str9 = str2;
        C0860u c0860u2 = c0860u;
        return c0838g.m1545j(c0865z, c0855p, c0860u2, str8, str9, j6, str7, str4, str6);
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ void m1535u(C0838G c0838g, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5192r(interfaceC2933d, 0, C0865z.a.INSTANCE, c0838g.premium);
        c2981c0.m5192r(interfaceC2933d, 1, C0855p.a.INSTANCE, c0838g.deviceInfo);
        c2981c0.m5192r(interfaceC2933d, 2, C0860u.a.INSTANCE, c0838g.hostInfo);
        c2981c0.m5193s(interfaceC2933d, 3, c0838g.loginUin);
        c2981c0.m5193s(interfaceC2933d, 4, c0838g.nickname);
        c2981c0.m5191q(interfaceC2933d, 5, c0838g.lastLoginTime);
        if (c2981c0.mo5180d(interfaceC2933d) || !AbstractC1665j.m2981a(c0838g.config, "")) {
            c2981c0.m5193s(interfaceC2933d, 6, c0838g.config);
        }
        if (c2981c0.mo5180d(interfaceC2933d) || !AbstractC1665j.m2981a(c0838g.cookies, "")) {
            c2981c0.m5193s(interfaceC2933d, 7, c0838g.cookies);
        }
        if (!c2981c0.mo5180d(interfaceC2933d) && AbstractC1665j.m2981a(c0838g.avatarFilePath, "")) {
            return;
        }
        c2981c0.m5193s(interfaceC2933d, 8, c0838g.avatarFilePath);
    }

    /* JADX INFO: renamed from: a */
    public final C0865z m1536a() {
        return this.premium;
    }

    /* JADX INFO: renamed from: b */
    public final C0855p m1537b() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: c */
    public final C0860u m1538c() {
        return this.hostInfo;
    }

    /* JADX INFO: renamed from: d */
    public final String m1539d() {
        return this.loginUin;
    }

    /* JADX INFO: renamed from: e */
    public final String m1540e() {
        return this.nickname;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838G)) {
            return false;
        }
        C0838G c0838g = (C0838G) obj;
        return AbstractC1665j.m2981a(this.premium, c0838g.premium) && AbstractC1665j.m2981a(this.deviceInfo, c0838g.deviceInfo) && AbstractC1665j.m2981a(this.hostInfo, c0838g.hostInfo) && AbstractC1665j.m2981a(this.loginUin, c0838g.loginUin) && AbstractC1665j.m2981a(this.nickname, c0838g.nickname) && this.lastLoginTime == c0838g.lastLoginTime && AbstractC1665j.m2981a(this.config, c0838g.config) && AbstractC1665j.m2981a(this.cookies, c0838g.cookies) && AbstractC1665j.m2981a(this.avatarFilePath, c0838g.avatarFilePath);
    }

    /* JADX INFO: renamed from: f */
    public final long m1541f() {
        return this.lastLoginTime;
    }

    /* JADX INFO: renamed from: g */
    public final String m1542g() {
        return this.config;
    }

    /* JADX INFO: renamed from: h */
    public final String m1543h() {
        return this.cookies;
    }

    public int hashCode() {
        return this.avatarFilePath.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m392c(AbstractC0231b.m394e(AbstractC0231b.m394e((this.hostInfo.hashCode() + ((this.deviceInfo.hashCode() + (this.premium.hashCode() * 31)) * 31)) * 31, 31, this.loginUin), 31, this.nickname), 31, this.lastLoginTime), 31, this.config), 31, this.cookies);
    }

    /* JADX INFO: renamed from: i */
    public final String m1544i() {
        return this.avatarFilePath;
    }

    /* JADX INFO: renamed from: j */
    public final C0838G m1545j(C0865z c0865z, C0855p c0855p, C0860u c0860u, String str, String str2, long j5, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(c0865z, "premium");
        AbstractC1665j.m2985e(c0855p, "deviceInfo");
        AbstractC1665j.m2985e(c0860u, "hostInfo");
        AbstractC1665j.m2985e(str, "loginUin");
        AbstractC1665j.m2985e(str2, "nickname");
        AbstractC1665j.m2985e(str3, "config");
        AbstractC1665j.m2985e(str4, "cookies");
        AbstractC1665j.m2985e(str5, "avatarFilePath");
        return new C0838G(c0865z, c0855p, c0860u, str, str2, j5, str3, str4, str5);
    }

    /* JADX INFO: renamed from: l */
    public final String m1546l() {
        return this.avatarFilePath;
    }

    /* JADX INFO: renamed from: m */
    public final String m1547m() {
        return this.config;
    }

    /* JADX INFO: renamed from: n */
    public final String m1548n() {
        return this.cookies;
    }

    /* JADX INFO: renamed from: o */
    public final C0855p m1549o() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: p */
    public final C0860u m1550p() {
        return this.hostInfo;
    }

    /* JADX INFO: renamed from: q */
    public final long m1551q() {
        return this.lastLoginTime;
    }

    /* JADX INFO: renamed from: r */
    public final String m1552r() {
        return this.loginUin;
    }

    /* JADX INFO: renamed from: s */
    public final String m1553s() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: t */
    public final C0865z m1554t() {
        return this.premium;
    }

    public String toString() {
        C0865z c0865z = this.premium;
        C0855p c0855p = this.deviceInfo;
        C0860u c0860u = this.hostInfo;
        String str = this.loginUin;
        String str2 = this.nickname;
        long j5 = this.lastLoginTime;
        String str3 = this.config;
        String str4 = this.cookies;
        String str5 = this.avatarFilePath;
        StringBuilder sb = new StringBuilder("User(premium=");
        sb.append(c0865z);
        sb.append(", deviceInfo=");
        sb.append(c0855p);
        sb.append(", hostInfo=");
        sb.append(c0860u);
        sb.append(", loginUin=");
        sb.append(str);
        sb.append(", nickname=");
        sb.append(str2);
        sb.append(", lastLoginTime=");
        sb.append(j5);
        AbstractC3202a.m5468c(sb, ", config=", str3, ", cookies=", str4);
        sb.append(", avatarFilePath=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public C0838G(C0865z c0865z, C0855p c0855p, C0860u c0860u, String str, String str2, long j5, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(c0865z, "premium");
        AbstractC1665j.m2985e(c0855p, "deviceInfo");
        AbstractC1665j.m2985e(c0860u, "hostInfo");
        AbstractC1665j.m2985e(str, "loginUin");
        AbstractC1665j.m2985e(str2, "nickname");
        AbstractC1665j.m2985e(str3, "config");
        AbstractC1665j.m2985e(str4, "cookies");
        AbstractC1665j.m2985e(str5, "avatarFilePath");
        this.premium = c0865z;
        this.deviceInfo = c0855p;
        this.hostInfo = c0860u;
        this.loginUin = str;
        this.nickname = str2;
        this.lastLoginTime = j5;
        this.config = str3;
        this.cookies = str4;
        this.avatarFilePath = str5;
    }

    public /* synthetic */ C0838G(C0865z c0865z, C0855p c0855p, C0860u c0860u, String str, String str2, long j5, String str3, String str4, String str5, int i5, AbstractC1661f abstractC1661f) {
        this(c0865z, c0855p, c0860u, str, str2, j5, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? "" : str4, (i5 & 256) != 0 ? "" : str5);
    }
}
