package Yue;

import Yue.C3644;
import Yue.C5256;
import Yue.C7141;
import Yue.InterfaceC5491;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3642 implements InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0204 f6435 = new C0204(null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final C3633 f434;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠$ۥ */
    public static final class C0204 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۦ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0204(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5256 m9964(C5256 c5256, C5256 c52562) {
            C5256.C0687 c0687 = new C5256.C0687();
            int size = c5256.size();
            for (int i = 0; i < size; i++) {
                String strM16114 = c5256.m16114(i);
                String strM16118 = c5256.m16118(i);
                if ((!C7627.m23974("Warning", strM16114, true) || !C7627.m24008(strM16118, "1", false, 2, null)) && (m9965(strM16114) || !m9966(strM16114) || c52562.m16111(strM16114) == null)) {
                    c0687.m16124(strM16114, strM16118);
                }
            }
            int size2 = c52562.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strM161142 = c52562.m16114(i2);
                if (!m9965(strM161142) && m9966(strM161142)) {
                    c0687.m16124(strM161142, c52562.m16118(i2));
                }
            }
            return c0687.m16126();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m9965(String str) {
            return C7627.m23974("Content-Length", str, true) || C7627.m23974(C5375.f13179, str, true) || C7627.m23974(C5375.f13182, str, true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m9966(String str) {
            return (C7627.m23974(C4515.f9612, str, true) || C7627.m23974("Keep-Alive", str, true) || C7627.m23974("Proxy-Authenticate", str, true) || C7627.m23974("Proxy-Authorization", str, true) || C7627.m23974("TE", str, true) || C7627.m23974("Trailers", str, true) || C7627.m23974("Transfer-Encoding", str, true) || C7627.m23974(C4515.f9611, str, true)) ? false : true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C7141 m9967(C7141 c7141) {
            return (c7141 != null ? c7141.m22311() : null) != null ? c7141.m22326().m3432(null).m22334() : c7141;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0204() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠$ۥ۟ */
    public static final class C0205 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f6436;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3604 f6437;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3643 f6438;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3603 f6439;

        public C0205(InterfaceC3604 interfaceC3604, InterfaceC3643 interfaceC3643, InterfaceC3603 interfaceC3603) {
            this.f6437 = interfaceC3604;
            this.f6438 = interfaceC3643;
            this.f6439 = interfaceC3603;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f6436 && !C8158.m26852(this, 100, TimeUnit.MILLISECONDS)) {
                this.f6436 = true;
                this.f6438.mo9923();
            }
            this.f6437.close();
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f6437.mo518();
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            try {
                long jMo9103 = this.f6437.mo9103(c3600, j);
                if (jMo9103 != -1) {
                    c3600.m9620(this.f6439.mo9605(), c3600.m9684() - jMo9103, jMo9103);
                    this.f6439.mo9632();
                    return jMo9103;
                }
                if (!this.f6436) {
                    this.f6436 = true;
                    this.f6439.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.f6436) {
                    this.f6436 = true;
                    this.f6438.mo9923();
                }
                throw e;
            }
        }
    }

    public C3642(@InterfaceC6489 C3633 c3633) {
        this.f434 = c3633;
    }

    @Override // Yue.InterfaceC5491
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) throws IOException {
        AbstractC4712 abstractC4712M21826;
        AbstractC7142 abstractC7142M22311;
        AbstractC7142 abstractC7142M223112;
        C5499.m17103(interfaceC0776, "chain");
        InterfaceC3645 interfaceC3645Call = interfaceC0776.call();
        C3633 c3633 = this.f434;
        C7141 c7141M9896 = c3633 != null ? c3633.m9896(interfaceC0776.mo2248()) : null;
        C3644 c3644M710 = new C3644.C0207(System.currentTimeMillis(), interfaceC0776.mo2248(), c7141M9896).m710();
        C7101 c7101M707 = c3644M710.m707();
        C7141 c7141M706 = c3644M710.m706();
        C3633 c36332 = this.f434;
        if (c36332 != null) {
            c36332.m9912(c3644M710);
        }
        C7024 c7024 = interfaceC3645Call instanceof C7024 ? (C7024) interfaceC3645Call : null;
        if (c7024 == null || (abstractC4712M21826 = c7024.m21826()) == null) {
            abstractC4712M21826 = AbstractC4712.f1070;
        }
        if (c7141M9896 != null && c7141M706 == null && (abstractC7142M223112 = c7141M9896.m22311()) != null) {
            C8158.m26844(abstractC7142M223112);
        }
        if (c7101M707 == null && c7141M706 == null) {
            C7141 c7141M22334 = new C7141.C1185().m22362(interfaceC0776.mo2248()).m22359(EnumC6835.HTTP_1_1).m22338(504).m22356("Unsatisfiable Request (only-if-cached)").m3432(C8158.f24177).m22363(-1L).m22360(System.currentTimeMillis()).m22334();
            abstractC4712M21826.mo14073(interfaceC3645Call, c7141M22334);
            return c7141M22334;
        }
        if (c7101M707 == null) {
            C5499.m17100(c7141M706);
            C7141 c7141M223342 = c7141M706.m22326().m22335(f6435.m9967(c7141M706)).m22334();
            abstractC4712M21826.mo1625(interfaceC3645Call, c7141M223342);
            return c7141M223342;
        }
        if (c7141M706 != null) {
            abstractC4712M21826.mo1624(interfaceC3645Call, c7141M706);
        } else if (this.f434 != null) {
            abstractC4712M21826.mo14049(interfaceC3645Call);
        }
        try {
            C7141 c7141Mo17083 = interfaceC0776.mo17083(c7101M707);
            if (c7141Mo17083 == null && c7141M9896 != null && abstractC7142M22311 != null) {
            }
            if (c7141M706 != null) {
                if (c7141Mo17083 != null && c7141Mo17083.m22315() == 304) {
                    C7141.C1185 c1185M22326 = c7141M706.m22326();
                    C0204 c0204 = f6435;
                    C7141 c7141M223343 = c1185M22326.m22354(c0204.m9964(c7141M706.m22320(), c7141Mo17083.m22320())).m22363(c7141Mo17083.m22332()).m22360(c7141Mo17083.m22330()).m22335(c0204.m9967(c7141M706)).m22357(c0204.m9967(c7141Mo17083)).m22334();
                    AbstractC7142 abstractC7142M223113 = c7141Mo17083.m22311();
                    C5499.m17100(abstractC7142M223113);
                    abstractC7142M223113.close();
                    C3633 c36333 = this.f434;
                    C5499.m17100(c36333);
                    c36333.m9911();
                    this.f434.m9913(c7141M706, c7141M223343);
                    abstractC4712M21826.mo1625(interfaceC3645Call, c7141M223343);
                    return c7141M223343;
                }
                AbstractC7142 abstractC7142M223114 = c7141M706.m22311();
                if (abstractC7142M223114 != null) {
                    C8158.m26844(abstractC7142M223114);
                }
            }
            C5499.m17100(c7141Mo17083);
            C7141.C1185 c1185M223262 = c7141Mo17083.m22326();
            C0204 c02042 = f6435;
            C7141 c7141M223344 = c1185M223262.m22335(c02042.m9967(c7141M706)).m22357(c02042.m9967(c7141Mo17083)).m22334();
            if (this.f434 != null) {
                if (C5379.m16726(c7141M223344) && C3644.f6440.m708(c7141M223344, c7101M707)) {
                    C7141 c7141M703 = m703(this.f434.m9905(c7141M223344), c7141M223344);
                    if (c7141M706 != null) {
                        abstractC4712M21826.mo14049(interfaceC3645Call);
                    }
                    return c7141M703;
                }
                if (C5383.f1469.m2139(c7101M707.m22156())) {
                    try {
                        this.f434.m9906(c7101M707);
                    } catch (IOException unused) {
                    }
                }
            }
            return c7141M223344;
        } finally {
            if (c7141M9896 != null && (abstractC7142M22311 = c7141M9896.m22311()) != null) {
                C8158.m26844(abstractC7142M22311);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final C7141 m703(InterfaceC3643 interfaceC3643, C7141 c7141) throws IOException {
        if (interfaceC3643 == null) {
            return c7141;
        }
        InterfaceC7472 interfaceC7472Mo9922 = interfaceC3643.mo9922();
        AbstractC7142 abstractC7142M22311 = c7141.m22311();
        C5499.m17100(abstractC7142M22311);
        C0205 c0205 = new C0205(abstractC7142M22311.mo9919(), interfaceC3643, C6542.m20830(interfaceC7472Mo9922));
        return c7141.m22326().m3432(new C7032(C7141.m22298(c7141, C5375.f13182, null, 2, null), c7141.m22311().mo9917(), C6542.m20831(c0205))).m22334();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3633 m9963() {
        return this.f434;
    }
}
