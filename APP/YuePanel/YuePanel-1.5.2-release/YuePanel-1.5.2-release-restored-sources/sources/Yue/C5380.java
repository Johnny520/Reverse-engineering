package Yue;

import Yue.InterfaceC5491;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5380 implements InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC0734 f1465;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public volatile Set<String> f13222;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public volatile EnumC0733 f13223;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۢ$ۥ */
    public enum EnumC0733 {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۢ$ۥ۟ */
    public interface InterfaceC0734 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C5381 f1466 = C5381.f1468;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public static final InterfaceC0734 f1467 = new C5381.C5382();

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C5381 {

            /* JADX INFO: renamed from: ۥ */
            public static final /* synthetic */ C5381 f1468 = new C5381();

            /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۢ$ۥ۟$ۥ$ۥ, reason: contains not printable characters */
            public static final class C5382 implements InterfaceC0734 {
                @Override // Yue.C5380.InterfaceC0734
                /* JADX INFO: renamed from: ۥ */
                public void mo2137(@InterfaceC6399 String str) {
                    C5499.m17103(str, "message");
                    C6668.m21313(C6668.f2226.m21321(), str, 0, null, 6, null);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        void mo2137(@InterfaceC6399 String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public C5380() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 32, (wrap:Yue.ۥۡۥۣۧ:INVOKE) */
    @Override // Yue.InterfaceC5491
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) throws Exception {
        String string;
        String str;
        char c;
        String string2;
        Charset charsetM18951;
        Charset charsetM189512;
        C5499.m17103(interfaceC0776, "chain");
        EnumC0733 enumC0733 = this.f13223;
        C7101 c7101Mo2248 = interfaceC0776.mo2248();
        if (enumC0733 == EnumC0733.NONE) {
            return interfaceC0776.mo17083(c7101Mo2248);
        }
        boolean z = enumC0733 == EnumC0733.BODY;
        boolean z2 = z || enumC0733 == EnumC0733.HEADERS;
        AbstractC7103 abstractC7103M22149 = c7101Mo2248.m22149();
        InterfaceC4107 interfaceC4107Mo17080 = interfaceC0776.mo17080();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(c7101Mo2248.m22156());
        sb.append(' ');
        sb.append(c7101Mo2248.m22160());
        if (interfaceC4107Mo17080 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(interfaceC4107Mo17080.mo1065());
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string3 = sb.toString();
        if (!z2 && abstractC7103M22149 != null) {
            string3 = string3 + " (" + abstractC7103M22149.mo1884() + "-byte body)";
        }
        this.f1465.mo2137(string3);
        if (z2) {
            C5256 c5256M22153 = c7101Mo2248.m22153();
            if (abstractC7103M22149 != null) {
                C6149 c6149Mo1885 = abstractC7103M22149.mo1885();
                if (c6149Mo1885 != null && c5256M22153.m16111(C5375.f13182) == null) {
                    this.f1465.mo2137("Content-Type: " + c6149Mo1885);
                }
                if (abstractC7103M22149.mo1884() != -1 && c5256M22153.m16111("Content-Length") == null) {
                    this.f1465.mo2137("Content-Length: " + abstractC7103M22149.mo1884());
                }
            }
            int size = c5256M22153.size();
            for (int i = 0; i < size; i++) {
                m16736(c5256M22153, i);
            }
            if (!z || abstractC7103M22149 == null) {
                this.f1465.mo2137("--> END " + c7101Mo2248.m22156());
            } else if (m16733(c7101Mo2248.m22153())) {
                this.f1465.mo2137("--> END " + c7101Mo2248.m22156() + " (encoded body omitted)");
            } else if (abstractC7103M22149.m22206()) {
                this.f1465.mo2137("--> END " + c7101Mo2248.m22156() + " (duplex request body omitted)");
            } else if (abstractC7103M22149.m22207()) {
                this.f1465.mo2137("--> END " + c7101Mo2248.m22156() + " (one-shot body omitted)");
            } else {
                C3600 c3600 = new C3600();
                abstractC7103M22149.mo15588(c3600);
                C6149 c6149Mo18852 = abstractC7103M22149.mo1885();
                if (c6149Mo18852 == null || (charsetM189512 = c6149Mo18852.m18951(StandardCharsets.UTF_8)) == null) {
                    charsetM189512 = StandardCharsets.UTF_8;
                    C5499.m17102(charsetM189512, "UTF_8");
                }
                this.f1465.mo2137("");
                if (C8150.m4181(c3600)) {
                    this.f1465.mo2137(c3600.mo9642(charsetM189512));
                    this.f1465.mo2137("--> END " + c7101Mo2248.m22156() + " (" + abstractC7103M22149.mo1884() + "-byte body)");
                } else {
                    this.f1465.mo2137("--> END " + c7101Mo2248.m22156() + " (binary " + abstractC7103M22149.mo1884() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            C7141 c7141Mo17083 = interfaceC0776.mo17083(c7101Mo2248);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            AbstractC7142 abstractC7142M22311 = c7141Mo17083.m22311();
            C5499.m17100(abstractC7142M22311);
            long jMo9917 = abstractC7142M22311.mo9917();
            String str2 = jMo9917 != -1 ? jMo9917 + "-byte" : "unknown-length";
            InterfaceC0734 interfaceC0734 = this.f1465;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<-- ");
            sb3.append(c7141Mo17083.m22315());
            if (c7141Mo17083.m22324().length() == 0) {
                str = "-byte body omitted)";
                string2 = "";
                c = ' ';
            } else {
                String strM22324 = c7141Mo17083.m22324();
                StringBuilder sb4 = new StringBuilder();
                str = "-byte body omitted)";
                c = ' ';
                sb4.append(' ');
                sb4.append(strM22324);
                string2 = sb4.toString();
            }
            sb3.append(string2);
            sb3.append(c);
            sb3.append(c7141Mo17083.m22331().m22160());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(z2 ? "" : ", " + str2 + " body");
            sb3.append(')');
            interfaceC0734.mo2137(sb3.toString());
            if (z2) {
                C5256 c5256M22320 = c7141Mo17083.m22320();
                int size2 = c5256M22320.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m16736(c5256M22320, i2);
                }
                if (!z || !C5379.m16726(c7141Mo17083)) {
                    this.f1465.mo2137("<-- END HTTP");
                } else if (m16733(c7141Mo17083.m22320())) {
                    this.f1465.mo2137("<-- END HTTP (encoded body omitted)");
                } else {
                    InterfaceC3604 interfaceC3604Mo9919 = abstractC7142M22311.mo9919();
                    interfaceC3604Mo9919.mo9651(Long.MAX_VALUE);
                    C3600 c3600Mo9605 = interfaceC3604Mo9919.mo9605();
                    Long l = null;
                    if (C7627.m23974("gzip", c5256M22320.m16111(C5375.f13179), true)) {
                        Long lValueOf = Long.valueOf(c3600Mo9605.m9684());
                        C5230 c5230 = new C5230(c3600Mo9605.clone());
                        try {
                            c3600Mo9605 = new C3600();
                            c3600Mo9605.mo9610(c5230);
                            C3849.m904(c5230, null);
                            l = lValueOf;
                        } finally {
                        }
                    }
                    C6149 c6149Mo9918 = abstractC7142M22311.mo9918();
                    if (c6149Mo9918 == null || (charsetM18951 = c6149Mo9918.m18951(StandardCharsets.UTF_8)) == null) {
                        charsetM18951 = StandardCharsets.UTF_8;
                        C5499.m17102(charsetM18951, "UTF_8");
                    }
                    if (!C8150.m4181(c3600Mo9605)) {
                        this.f1465.mo2137("");
                        this.f1465.mo2137("<-- END HTTP (binary " + c3600Mo9605.m9684() + str);
                        return c7141Mo17083;
                    }
                    if (jMo9917 != 0) {
                        this.f1465.mo2137("");
                        this.f1465.mo2137(c3600Mo9605.clone().mo9642(charsetM18951));
                    }
                    if (l != null) {
                        this.f1465.mo2137("<-- END HTTP (" + c3600Mo9605.m9684() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.f1465.mo2137("<-- END HTTP (" + c3600Mo9605.m9684() + "-byte body)");
                    }
                }
            }
            return c7141Mo17083;
        } catch (Exception e) {
            this.f1465.mo2137("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to var", replaceWith = @InterfaceC7097(expression = "level", imports = {}))
    @InterfaceC5572(name = "-deprecated_level")
    /* JADX INFO: renamed from: ۥ۟ */
    public final EnumC0733 m2135() {
        return this.f13223;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m16733(C5256 c5256) {
        String strM16111 = c5256.m16111(C5375.f13179);
        return (strM16111 == null || C7627.m23974(strM16111, "identity", true) || C7627.m23974(strM16111, "gzip", true)) ? false : true;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final EnumC0733 m16734() {
        return this.f13223;
    }

    @InterfaceC5572(name = "level")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m16735(@InterfaceC6399 EnumC0733 enumC0733) {
        C5499.m17103(enumC0733, "<set-?>");
        this.f13223 = enumC0733;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m16736(C5256 c5256, int i) {
        String strM16118 = this.f13222.contains(c5256.m16114(i)) ? "██" : c5256.m16118(i);
        this.f1465.mo2137(c5256.m16114(i) + ": " + strM16118);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m16737(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        TreeSet treeSet = new TreeSet(C7627.m23980(C7610.f2968));
        C3885.m10772(treeSet, this.f13222);
        treeSet.add(str);
        this.f13222 = treeSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C5380 m16738(@InterfaceC6399 EnumC0733 enumC0733) {
        C5499.m17103(enumC0733, "level");
        this.f13223 = enumC0733;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC5573
    public C5380(@InterfaceC6399 InterfaceC0734 interfaceC0734) {
        C5499.m17103(interfaceC0734, "logger");
        this.f1465 = interfaceC0734;
        this.f13222 = C7387.m23125();
        this.f13223 = EnumC0733.NONE;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:Yue.ۥ۠ۤۨۢ$ۥ۟:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠ۤۨۢ$ۥ۟:0x0004: SGET  A[WRAPPED] (LINE:6) Yue.ۥ۠ۤۨۢ.ۥ۟.ۥ۟ Yue.ۥ۠ۤۨۢ$ۥ۟) : (r1v0 Yue.ۥ۠ۤۨۢ$ۥ۟))
 A[MD:(Yue.ۥ۠ۤۨۢ$ۥ۟):void (m)] (LINE:7) call: Yue.ۥ۠ۤۨۢ.<init>(Yue.ۥ۠ۤۨۢ$ۥ۟):void type: THIS */
    public /* synthetic */ C5380(InterfaceC0734 interfaceC0734, int i, C4335 c4335) {
        this((i & 1) != 0 ? InterfaceC0734.f1467 : interfaceC0734);
    }
}
