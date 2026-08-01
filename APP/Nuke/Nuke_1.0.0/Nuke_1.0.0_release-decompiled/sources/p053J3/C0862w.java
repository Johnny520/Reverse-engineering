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
import p236s3.C3191g;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0862w {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String author;

    /* JADX INFO: renamed from: id */
    private final int f2699id;
    private final boolean isAlwaysShow;
    private final String message;

    /* JADX INFO: renamed from: J3.w$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.Notice", aVar, 4);
            c3196l.m5464l("message", false);
            c3196l.m5464l("author", false);
            c3196l.m5464l("id", false);
            c3196l.m5464l("isAlwaysShow", false);
            descriptor = c3196l;
        }

        private a() {
        }

        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            return new InterfaceC2798a[]{c3201q, c3201q, C3191g.f9946a, C3187c.f9939a};
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
        public final C0862w mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            int iM5591j = 0;
            boolean zM5589h = false;
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
                    strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 1);
                    i5 |= 2;
                } else if (iM5590i == 2) {
                    iM5591j = c3343gMo5422a.m5591j(interfaceC2933d, 2);
                    i5 |= 4;
                } else {
                    if (iM5590i != 3) {
                        throw new C2801d(iM5590i);
                    }
                    zM5589h = c3343gMo5422a.m5589h(interfaceC2933d, 3);
                    i5 |= 8;
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0862w(i5, strM5595n, strM5595n2, iM5591j, zM5589h, null);
        }

        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0862w c0862w) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0862w, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0862w.m1853k(c0862w, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.w$b */
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

    public /* synthetic */ C0862w(int i5, String str, String str2, int i6, boolean z5, AbstractC3200p abstractC3200p) {
        if (15 != (i5 & 15)) {
            AbstractC3194j.m5462d(i5, 15, a.INSTANCE.mo1486e());
            throw null;
        }
        this.message = str;
        this.author = str2;
        this.f2699id = i6;
        this.isAlwaysShow = z5;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0862w m1852f(C0862w c0862w, String str, String str2, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = c0862w.message;
        }
        if ((i6 & 2) != 0) {
            str2 = c0862w.author;
        }
        if ((i6 & 4) != 0) {
            i5 = c0862w.f2699id;
        }
        if ((i6 & 8) != 0) {
            z5 = c0862w.isAlwaysShow;
        }
        return c0862w.m1858e(str, str2, i5, z5);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m1853k(C0862w c0862w, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0862w.message);
        c2981c0.m5193s(interfaceC2933d, 1, c0862w.author);
        c2981c0.m5190p(2, c0862w.f2699id, interfaceC2933d);
        c2981c0.m5188n(interfaceC2933d, 3, c0862w.isAlwaysShow);
    }

    /* JADX INFO: renamed from: a */
    public final String m1854a() {
        return this.message;
    }

    /* JADX INFO: renamed from: b */
    public final String m1855b() {
        return this.author;
    }

    /* JADX INFO: renamed from: c */
    public final int m1856c() {
        return this.f2699id;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1857d() {
        return this.isAlwaysShow;
    }

    /* JADX INFO: renamed from: e */
    public final C0862w m1858e(String str, String str2, int i5, boolean z5) {
        AbstractC1665j.m2985e(str, "message");
        AbstractC1665j.m2985e(str2, "author");
        return new C0862w(str, str2, i5, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0862w)) {
            return false;
        }
        C0862w c0862w = (C0862w) obj;
        return AbstractC1665j.m2981a(this.message, c0862w.message) && AbstractC1665j.m2981a(this.author, c0862w.author) && this.f2699id == c0862w.f2699id && this.isAlwaysShow == c0862w.isAlwaysShow;
    }

    /* JADX INFO: renamed from: g */
    public final String m1859g() {
        return this.author;
    }

    /* JADX INFO: renamed from: h */
    public final int m1860h() {
        return this.f2699id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAlwaysShow) + AbstractC0231b.m391b(this.f2699id, AbstractC0231b.m394e(this.message.hashCode() * 31, 31, this.author), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m1861i() {
        return this.message;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1862j() {
        return this.isAlwaysShow;
    }

    public String toString() {
        String str = this.message;
        String str2 = this.author;
        int i5 = this.f2699id;
        boolean z5 = this.isAlwaysShow;
        StringBuilder sbM405p = AbstractC0231b.m405p("Notice(message=", str, ", author=", str2, ", id=");
        sbM405p.append(i5);
        sbM405p.append(", isAlwaysShow=");
        sbM405p.append(z5);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    public C0862w(String str, String str2, int i5, boolean z5) {
        AbstractC1665j.m2985e(str, "message");
        AbstractC1665j.m2985e(str2, "author");
        this.message = str;
        this.author = str2;
        this.f2699id = i5;
        this.isAlwaysShow = z5;
    }
}
