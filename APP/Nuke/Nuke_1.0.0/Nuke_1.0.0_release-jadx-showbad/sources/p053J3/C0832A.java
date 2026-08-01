package p053J3;

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
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0832A {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String challenge;
    private final String message;

    /* JADX INFO: renamed from: J3.A$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.SignedData", aVar, 2);
            c3196l.m5464l("challenge", false);
            c3196l.m5464l("message", false);
            descriptor = c3196l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            return new InterfaceC2798a[]{c3201q, c3201q};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: d */
        public /* bridge */ InterfaceC2798a[] mo1485d() {
            return AbstractC3194j.f9953b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: e */
        public final InterfaceC2933d mo1486e() {
            return descriptor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: b(Lr3/b;)Ljava/lang/Object; */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C0832A mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            AbstractC3200p abstractC3200p = null;
            boolean z5 = true;
            int i5 = 0;
            String strM5595n = null;
            String strM5595n2 = null;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                if (iM5590i == -1) {
                    z5 = false;
                } else if (iM5590i == 0) {
                    strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 0);
                    i5 |= 1;
                } else {
                    if (iM5590i != 1) {
                        throw new C2801d(iM5590i);
                    }
                    strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 1);
                    i5 |= 2;
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0832A(i5, strM5595n, strM5595n2, abstractC3200p);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: c(Lr3/c;Ljava/lang/Object;)V */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0832A c0832a) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0832a, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0832A.m1476g(c0832a, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.A$b */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: J3.A.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(AbstractC1661f abstractC1661f) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final InterfaceC2798a serializer() {
            return a.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private b() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0832A(int i5, String str, String str2, AbstractC3200p abstractC3200p) {
        if (3 != (i5 & 3)) {
            AbstractC3194j.m5462d(i5, 3, a.INSTANCE.mo1486e());
            throw null;
        }
        this.challenge = str;
        this.message = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0832A m1475d(C0832A c0832a, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0832a.challenge;
        }
        if ((i5 & 2) != 0) {
            str2 = c0832a.message;
        }
        return c0832a.m1479c(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m1476g(C0832A c0832a, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0832a.challenge);
        c2981c0.m5193s(interfaceC2933d, 1, c0832a.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1477a() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1478b() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0832A m1479c(String str, String str2) {
        AbstractC1665j.m2985e(str, "challenge");
        AbstractC1665j.m2985e(str2, "message");
        return new C0832A(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1480e() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0832A)) {
            return false;
        }
        C0832A c0832a = (C0832A) obj;
        return AbstractC1665j.m2981a(this.challenge, c0832a.challenge) && AbstractC1665j.m2981a(this.message, c0832a.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1481f() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.message.hashCode() + (this.challenge.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "SignedData(challenge=" + this.challenge + ", message=" + this.message + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0832A(String str, String str2) {
        AbstractC1665j.m2985e(str, "challenge");
        AbstractC1665j.m2985e(str2, "message");
        this.challenge = str;
        this.message = str2;
    }
}
