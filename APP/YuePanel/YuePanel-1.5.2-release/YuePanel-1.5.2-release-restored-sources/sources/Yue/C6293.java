package Yue;

import Yue.AbstractC7103;
import Yue.C5256;
import Yue.C6149;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6293 extends AbstractC7103 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0956 f15866 = new C0956(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6149 f15867;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6149 f15868;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6149 f15869;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6149 f15870;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C6149 f15871;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f15872;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f15873;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f15874;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C3630 f1987;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C6149 f15875;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C6294> f15876;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C6149 f15877;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public long f15878;

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۣ$ۥ */
    @InterfaceC7507({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class C0955 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final C3630 f1988;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public C6149 f1989;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<C6294> f15879;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC5573
        public C0955() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0955 m2765(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            m19589(C6294.f15880.m19599(str, str2));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0955 m2766(@InterfaceC6399 String str, @InterfaceC6489 String str2, @InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(str, "name");
            C5499.m17103(abstractC7103, C5905.f14739);
            m19589(C6294.f15880.m19600(str, str2, abstractC7103));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0955 m19588(@InterfaceC6489 C5256 c5256, @InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(abstractC7103, C5905.f14739);
            m19589(C6294.f15880.m2770(c5256, abstractC7103));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0955 m19589(@InterfaceC6399 C6294 c6294) {
            C5499.m17103(c6294, "part");
            this.f15879.add(c6294);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0955 m19590(@InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(abstractC7103, C5905.f14739);
            m19589(C6294.f15880.m2771(abstractC7103));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C6293 m19591() {
            if (!this.f15879.isEmpty()) {
                return new C6293(this.f1988, this.f1989, C8158.m26889(this.f15879));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C0955 m19592(@InterfaceC6399 C6149 c6149) {
            C5499.m17103(c6149, "type");
            if (C5499.m17094(c6149.m18954(), "multipart")) {
                this.f1989 = c6149;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + c6149).toString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        public C0955(@InterfaceC6399 String str) {
            C5499.m17103(str, "boundary");
            this.f1988 = C3630.f6370.m9876(str);
            this.f1989 = C6293.f15867;
            this.f15879 = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C0955(String str, int i, C4335 c4335) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                C5499.m17102(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۣ$ۥ۟ */
    public static final class C0956 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۡۦۣ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0956(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m2767(@InterfaceC6399 StringBuilder sb, @InterfaceC6399 String str) {
            C5499.m17103(sb, "<this>");
            C5499.m17103(str, C6659.f17103);
            sb.append(C8039.f3212);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append(C8039.f3212);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0956() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۣ$ۥ۟۟, reason: contains not printable characters */
    public static final class C6294 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final C0957 f15880 = new C0957(null);

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public final C5256 f1990;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final AbstractC7103 f1991;

        /* JADX INFO: renamed from: Yue.ۥۡۡۦۣ$ۥ۟۟$ۥ */
        @InterfaceC7507({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class C0957 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۡۦۣ.ۥ۟۟.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0957(C4335 c4335) {
                this();
            }

            @InterfaceC6399
            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ */
            public final C6294 m2770(@InterfaceC6489 C5256 c5256, @InterfaceC6399 AbstractC7103 abstractC7103) {
                C5499.m17103(abstractC7103, C5905.f14739);
                C4335 c4335 = null;
                if ((c5256 != null ? c5256.m16111(C5375.f13182) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((c5256 != null ? c5256.m16111("Content-Length") : null) == null) {
                    return new C6294(c5256, abstractC7103, c4335);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @InterfaceC6399
            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ۟ */
            public final C6294 m2771(@InterfaceC6399 AbstractC7103 abstractC7103) {
                C5499.m17103(abstractC7103, C5905.f14739);
                return m2770(null, abstractC7103);
            }

            @InterfaceC6399
            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final C6294 m19599(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
                C5499.m17103(str, "name");
                C5499.m17103(str2, "value");
                return m19600(str, null, AbstractC7103.C1167.m22211(AbstractC7103.f2683, str2, null, 1, null));
            }

            @InterfaceC6399
            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final C6294 m19600(@InterfaceC6399 String str, @InterfaceC6489 String str2, @InterfaceC6399 AbstractC7103 abstractC7103) {
                C5499.m17103(str, "name");
                C5499.m17103(abstractC7103, C5905.f14739);
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                C0956 c0956 = C6293.f15866;
                c0956.m2767(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    c0956.m2767(sb, str2);
                }
                String string = sb.toString();
                C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
                return m2770(new C5256.C0687().m16125("Content-Disposition", string).m16126(), abstractC7103);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0957() {
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥ۠ۤۢۢ), (r2v0 Yue.ۥۡۦۥ) A[MD:(Yue.ۥ۠ۤۢۢ, Yue.ۥۡۦۥ):void (m)] (LINE:1) call: Yue.ۥۡۡۦۣ.ۥ۟۟.<init>(Yue.ۥ۠ۤۢۢ, Yue.ۥۡۦۥ):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C6294(C5256 c5256, AbstractC7103 abstractC7103, C4335 c4335) {
            this(c5256, abstractC7103);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final C6294 m19593(@InterfaceC6489 C5256 c5256, @InterfaceC6399 AbstractC7103 abstractC7103) {
            return f15880.m2770(c5256, abstractC7103);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final C6294 m19594(@InterfaceC6399 AbstractC7103 abstractC7103) {
            return f15880.m2771(abstractC7103);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final C6294 m19595(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            return f15880.m19599(str, str2);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final C6294 m19596(@InterfaceC6399 String str, @InterfaceC6489 String str2, @InterfaceC6399 AbstractC7103 abstractC7103) {
            return f15880.m19600(str, str2, abstractC7103);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = C5905.f14739, imports = {}))
        @InterfaceC5572(name = "-deprecated_body")
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC7103 m2768() {
            return this.f1991;
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "headers", imports = {}))
        @InterfaceC5572(name = "-deprecated_headers")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5256 m2769() {
            return this.f1990;
        }

        @InterfaceC6399
        @InterfaceC5572(name = C5905.f14739)
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC7103 m19597() {
            return this.f1991;
        }

        @InterfaceC5572(name = "headers")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C5256 m19598() {
            return this.f1990;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6294(C5256 c5256, AbstractC7103 abstractC7103) {
            this.f1990 = c5256;
            this.f1991 = abstractC7103;
        }
    }

    static {
        C6149.C0916 c0916 = C6149.f15045;
        f15867 = c0916.m18955("multipart/mixed");
        f15868 = c0916.m18955("multipart/alternative");
        f15869 = c0916.m18955("multipart/digest");
        f15870 = c0916.m18955("multipart/parallel");
        f15871 = c0916.m18955(C5375.f13183);
        f15872 = new byte[]{58, 32};
        f15873 = new byte[]{13, 10};
        f15874 = new byte[]{45, 45};
    }

    public C6293(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C6149 c6149, @InterfaceC6399 List<C6294> list) {
        C5499.m17103(c3630, "boundaryByteString");
        C5499.m17103(c6149, "type");
        C5499.m17103(list, "parts");
        this.f1987 = c3630;
        this.f15875 = c6149;
        this.f15876 = list;
        this.f15877 = C6149.f15045.m18955(c6149 + "; boundary=" + m19583());
        this.f15878 = -1L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۣ۟ۢۨ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Yue.ۥۣ۟ۢۨ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Yue.ۥۣ۟ۢۨ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    private final long m19578(InterfaceC3603 interfaceC3603, boolean z) throws IOException {
        C3600 c3600;
        if (z) {
            interfaceC3603 = new C3600();
            c3600 = interfaceC3603;
        } else {
            c3600 = 0;
        }
        int size = this.f15876.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C6294 c6294 = this.f15876.get(i);
            C5256 c5256M19598 = c6294.m19598();
            AbstractC7103 abstractC7103M19597 = c6294.m19597();
            C5499.m17100(interfaceC3603);
            interfaceC3603.write(f15874);
            interfaceC3603.mo9668(this.f1987);
            interfaceC3603.write(f15873);
            if (c5256M19598 != null) {
                int size2 = c5256M19598.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC3603.mo9638(c5256M19598.m16114(i2)).write(f15872).mo9638(c5256M19598.m16118(i2)).write(f15873);
                }
            }
            C6149 c6149Mo1885 = abstractC7103M19597.mo1885();
            if (c6149Mo1885 != null) {
                interfaceC3603.mo9638("Content-Type: ").mo9638(c6149Mo1885.toString()).write(f15873);
            }
            long jMo1884 = abstractC7103M19597.mo1884();
            if (jMo1884 != -1) {
                interfaceC3603.mo9638("Content-Length: ").mo9671(jMo1884).write(f15873);
            } else if (z) {
                C5499.m17100(c3600);
                c3600.m9603();
                return -1L;
            }
            byte[] bArr = f15873;
            interfaceC3603.write(bArr);
            if (z) {
                j += jMo1884;
            } else {
                abstractC7103M19597.mo15588(interfaceC3603);
            }
            interfaceC3603.write(bArr);
        }
        C5499.m17100(interfaceC3603);
        byte[] bArr2 = f15874;
        interfaceC3603.write(bArr2);
        interfaceC3603.mo9668(this.f1987);
        interfaceC3603.write(bArr2);
        interfaceC3603.write(f15873);
        if (!z) {
            return j;
        }
        C5499.m17100(c3600);
        long jM9684 = j + c3600.m9684();
        c3600.m9603();
        return jM9684;
    }

    @Override // Yue.AbstractC7103
    /* JADX INFO: renamed from: ۥ */
    public long mo1884() throws IOException {
        long j = this.f15878;
        if (j != -1) {
            return j;
        }
        long jM19578 = m19578(null, true);
        this.f15878 = jM19578;
        return jM19578;
    }

    @Override // Yue.AbstractC7103
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C6149 mo1885() {
        return this.f15877;
    }

    @Override // Yue.AbstractC7103
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo15588(@InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
        C5499.m17103(interfaceC3603, "sink");
        m19578(interfaceC3603, false);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "boundary", imports = {}))
    @InterfaceC5572(name = "-deprecated_boundary")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final String m19579() {
        return m19583();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "parts", imports = {}))
    @InterfaceC5572(name = "-deprecated_parts")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final List<C6294> m19580() {
        return this.f15876;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "size", imports = {}))
    @InterfaceC5572(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m19581() {
        return m19586();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "type", imports = {}))
    @InterfaceC5572(name = "-deprecated_type")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C6149 m19582() {
        return this.f15875;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "boundary")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final String m19583() {
        return this.f1987.m9862();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final C6294 m19584(int i) {
        return this.f15876.get(i);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "parts")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final List<C6294> m19585() {
        return this.f15876;
    }

    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m19586() {
        return this.f15876.size();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "type")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final C6149 m19587() {
        return this.f15875;
    }
}
