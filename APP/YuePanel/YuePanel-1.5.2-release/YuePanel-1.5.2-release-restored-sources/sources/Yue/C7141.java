package Yue;

import Yue.C5256;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class C7141 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7101 f21518;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final EnumC6835 f21519;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f21520;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f21521;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public final C5241 f21522;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5256 f21523;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final AbstractC7142 f21524;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C7141 f21525;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6489
    public final C7141 f21526;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final C7141 f21527;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final long f21528;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final long f21529;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final C4742 f21530;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @InterfaceC6489
    public C3641 f21531;

    public C7141(@InterfaceC6399 C7101 c7101, @InterfaceC6399 EnumC6835 enumC6835, @InterfaceC6399 String str, int i, @InterfaceC6489 C5241 c5241, @InterfaceC6399 C5256 c5256, @InterfaceC6489 AbstractC7142 abstractC7142, @InterfaceC6489 C7141 c7141, @InterfaceC6489 C7141 c71412, @InterfaceC6489 C7141 c71413, long j, long j2, @InterfaceC6489 C4742 c4742) {
        C5499.m17103(c7101, "request");
        C5499.m17103(enumC6835, "protocol");
        C5499.m17103(str, "message");
        C5499.m17103(c5256, "headers");
        this.f21518 = c7101;
        this.f21519 = enumC6835;
        this.f21520 = str;
        this.f21521 = i;
        this.f21522 = c5241;
        this.f21523 = c5256;
        this.f21524 = abstractC7142;
        this.f21525 = c7141;
        this.f21526 = c71412;
        this.f21527 = c71413;
        this.f21528 = j;
        this.f21529 = j2;
        this.f21530 = c4742;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ String m22298(C7141 c7141, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c7141.m22319(str, str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC7142 abstractC7142 = this.f21524;
        if (abstractC7142 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC7142.close();
    }

    @InterfaceC6399
    public String toString() {
        return "Response{protocol=" + this.f21519 + ", code=" + this.f21521 + ", message=" + this.f21520 + ", url=" + this.f21518.m22160() + C6193.f1885;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = C5905.f14739, imports = {}))
    @InterfaceC5572(name = "-deprecated_body")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC7142 m3430() {
        return this.f21524;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cacheControl", imports = {}))
    @InterfaceC5572(name = "-deprecated_cacheControl")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3641 m22299() {
        return m22312();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cacheResponse", imports = {}))
    @InterfaceC5572(name = "-deprecated_cacheResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7141 m22300() {
        return this.f21526;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "code", imports = {}))
    @InterfaceC5572(name = "-deprecated_code")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m22301() {
        return this.f21521;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "handshake", imports = {}))
    @InterfaceC5572(name = "-deprecated_handshake")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C5241 m22302() {
        return this.f21522;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "headers", imports = {}))
    @InterfaceC5572(name = "-deprecated_headers")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C5256 m22303() {
        return this.f21523;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "message", imports = {}))
    @InterfaceC5572(name = "-deprecated_message")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final String m22304() {
        return this.f21520;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "networkResponse", imports = {}))
    @InterfaceC5572(name = "-deprecated_networkResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C7141 m22305() {
        return this.f21525;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "priorResponse", imports = {}))
    @InterfaceC5572(name = "-deprecated_priorResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final C7141 m22306() {
        return this.f21527;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "protocol", imports = {}))
    @InterfaceC5572(name = "-deprecated_protocol")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final EnumC6835 m22307() {
        return this.f21519;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "receivedResponseAtMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_receivedResponseAtMillis")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final long m22308() {
        return this.f21529;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "request", imports = {}))
    @InterfaceC5572(name = "-deprecated_request")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final C7101 m22309() {
        return this.f21518;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "sentRequestAtMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_sentRequestAtMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final long m22310() {
        return this.f21528;
    }

    @InterfaceC5572(name = C5905.f14739)
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final AbstractC7142 m22311() {
        return this.f21524;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "cacheControl")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final C3641 m22312() {
        C3641 c3641 = this.f21531;
        if (c3641 != null) {
            return c3641;
        }
        C3641 c3641M9962 = C3641.f6415.m9962(this.f21523);
        this.f21531 = c3641M9962;
        return c3641M9962;
    }

    @InterfaceC5572(name = "cacheResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final C7141 m22313() {
        return this.f21526;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final List<C3693> m22314() {
        String str;
        C5256 c5256 = this.f21523;
        int i = this.f21521;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return C3880.m10735();
            }
            str = "Proxy-Authenticate";
        }
        return C5379.m2134(c5256, str);
    }

    @InterfaceC5572(name = "code")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final int m22315() {
        return this.f21521;
    }

    @InterfaceC5572(name = "exchange")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final C4742 m22316() {
        return this.f21530;
    }

    @InterfaceC5572(name = "handshake")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final C5241 m22317() {
        return this.f21522;
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final String m22318(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return m22298(this, str, null, 2, null);
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String m22319(@InterfaceC6399 String str, @InterfaceC6489 String str2) {
        C5499.m17103(str, "name");
        String strM16111 = this.f21523.m16111(str);
        return strM16111 == null ? str2 : strM16111;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "headers")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final C5256 m22320() {
        return this.f21523;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final List<String> m22321(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return this.f21523.m16119(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final boolean m22322() {
        int i = this.f21521;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final boolean m22323() {
        int i = this.f21521;
        return 200 <= i && i < 300;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "message")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final String m22324() {
        return this.f21520;
    }

    @InterfaceC5572(name = "networkResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final C7141 m22325() {
        return this.f21525;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final C1185 m22326() {
        return new C1185(this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final AbstractC7142 m22327(long j) throws IOException {
        AbstractC7142 abstractC7142 = this.f21524;
        C5499.m17100(abstractC7142);
        InterfaceC3604 interfaceC3604Peek = abstractC7142.mo9919().peek();
        C3600 c3600 = new C3600();
        interfaceC3604Peek.mo9651(j);
        c3600.mo9613(interfaceC3604Peek, Math.min(j, interfaceC3604Peek.mo9605().m9684()));
        return AbstractC7142.f21543.m3434(c3600, this.f21524.mo9918(), c3600.m9684());
    }

    @InterfaceC5572(name = "priorResponse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final C7141 m22328() {
        return this.f21527;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "protocol")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final EnumC6835 m22329() {
        return this.f21519;
    }

    @InterfaceC5572(name = "receivedResponseAtMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final long m22330() {
        return this.f21529;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "request")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final C7101 m22331() {
        return this.f21518;
    }

    @InterfaceC5572(name = "sentRequestAtMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final long m22332() {
        return this.f21528;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final C5256 m22333() throws IOException {
        C4742 c4742 = this.f21530;
        if (c4742 != null) {
            return c4742.m14290();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ$ۥ */
    @InterfaceC7507({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class C1185 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public C7101 f2705;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public EnumC6835 f2706;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f21532;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String f21533;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public C5241 f21534;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public C5256.C0687 f21535;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6489
        public AbstractC7142 f21536;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6489
        public C7141 f21537;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public C7141 f21538;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC6489
        public C7141 f21539;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public long f21540;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public long f21541;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        @InterfaceC6489
        public C4742 f21542;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1185() {
            this.f21532 = -1;
            this.f21535 = new C5256.C0687();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C1185 m3431(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            this.f21535.m2022(str, str2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public C1185 m3432(@InterfaceC6489 AbstractC7142 abstractC7142) {
            this.f21536 = abstractC7142;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7141 m22334() {
            int i = this.f21532;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.f21532).toString());
            }
            C7101 c7101 = this.f2705;
            if (c7101 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            EnumC6835 enumC6835 = this.f2706;
            if (enumC6835 == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f21533;
            if (str != null) {
                return new C7141(c7101, enumC6835, str, i, this.f21534, this.f21535.m16126(), this.f21536, this.f21537, this.f21538, this.f21539, this.f21540, this.f21541, this.f21542);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C1185 m22335(@InterfaceC6489 C7141 c7141) {
            m22337("cacheResponse", c7141);
            this.f21538 = c7141;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m22336(C7141 c7141) {
            if (c7141 != null && c7141.m22311() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m22337(String str, C7141 c7141) {
            if (c7141 != null) {
                if (c7141.m22311() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (c7141.m22325() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c7141.m22313() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c7141.m22328() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C1185 m22338(int i) {
            this.f21532 = i;
            return this;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final AbstractC7142 m22339() {
            return this.f21536;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C7141 m22340() {
            return this.f21538;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int m22341() {
            return this.f21532;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final C4742 m22342() {
            return this.f21542;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C5241 m22343() {
            return this.f21534;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C5256.C0687 m22344() {
            return this.f21535;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final String m22345() {
            return this.f21533;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C7141 m22346() {
            return this.f21537;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final C7141 m22347() {
            return this.f21539;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final EnumC6835 m22348() {
            return this.f2706;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final long m22349() {
            return this.f21541;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final C7101 m22350() {
            return this.f2705;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long m22351() {
            return this.f21540;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C1185 m22352(@InterfaceC6489 C5241 c5241) {
            this.f21534 = c5241;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C1185 m22353(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            this.f21535.m16130(str, str2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C1185 m22354(@InterfaceC6399 C5256 c5256) {
            C5499.m17103(c5256, "headers");
            this.f21535 = c5256.m16116();
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final void m22355(@InterfaceC6399 C4742 c4742) {
            C5499.m17103(c4742, "deferredTrailers");
            this.f21542 = c4742;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public C1185 m22356(@InterfaceC6399 String str) {
            C5499.m17103(str, "message");
            this.f21533 = str;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public C1185 m22357(@InterfaceC6489 C7141 c7141) {
            m22337("networkResponse", c7141);
            this.f21537 = c7141;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C1185 m22358(@InterfaceC6489 C7141 c7141) {
            m22336(c7141);
            this.f21539 = c7141;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C1185 m22359(@InterfaceC6399 EnumC6835 enumC6835) {
            C5499.m17103(enumC6835, "protocol");
            this.f2706 = enumC6835;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C1185 m22360(long j) {
            this.f21541 = j;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C1185 m22361(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            this.f21535.m16129(str);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C1185 m22362(@InterfaceC6399 C7101 c7101) {
            C5499.m17103(c7101, "request");
            this.f2705 = c7101;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public C1185 m22363(long j) {
            this.f21540 = j;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final void m22364(@InterfaceC6489 AbstractC7142 abstractC7142) {
            this.f21536 = abstractC7142;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final void m22365(@InterfaceC6489 C7141 c7141) {
            this.f21538 = c7141;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final void m22366(int i) {
            this.f21532 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final void m22367(@InterfaceC6489 C4742 c4742) {
            this.f21542 = c4742;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public final void m22368(@InterfaceC6489 C5241 c5241) {
            this.f21534 = c5241;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final void m22369(@InterfaceC6399 C5256.C0687 c0687) {
            C5499.m17103(c0687, "<set-?>");
            this.f21535 = c0687;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public final void m22370(@InterfaceC6489 String str) {
            this.f21533 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final void m22371(@InterfaceC6489 C7141 c7141) {
            this.f21537 = c7141;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final void m22372(@InterfaceC6489 C7141 c7141) {
            this.f21539 = c7141;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final void m22373(@InterfaceC6489 EnumC6835 enumC6835) {
            this.f2706 = enumC6835;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public final void m22374(long j) {
            this.f21541 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public final void m22375(@InterfaceC6489 C7101 c7101) {
            this.f2705 = c7101;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public final void m22376(long j) {
            this.f21540 = j;
        }

        public C1185(@InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7141, "response");
            this.f21532 = -1;
            this.f2705 = c7141.m22331();
            this.f2706 = c7141.m22329();
            this.f21532 = c7141.m22315();
            this.f21533 = c7141.m22324();
            this.f21534 = c7141.m22317();
            this.f21535 = c7141.m22320().m16116();
            this.f21536 = c7141.m22311();
            this.f21537 = c7141.m22325();
            this.f21538 = c7141.m22313();
            this.f21539 = c7141.m22328();
            this.f21540 = c7141.m22332();
            this.f21541 = c7141.m22330();
            this.f21542 = c7141.m22316();
        }
    }
}
