package Yue;

import Yue.C5256;
import Yue.C7141;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5368 implements InterfaceC4743 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7026 f13126;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7031 f13127;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C5355 f13128;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public volatile C5371 f13129;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final EnumC6835 f13130;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public volatile boolean f13131;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0725 f13115 = new C0725(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13116 = "connection";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13117 = "host";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13118 = "keep-alive";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13119 = "proxy-connection";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13121 = "te";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13120 = "transfer-encoding";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13122 = "encoding";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13123 = "upgrade";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<String> f13124 = C8158.m26858(f13116, f13117, f13118, f13119, f13121, f13120, f13122, f13123, C5255.f12524, C5255.f12525, C5255.f12526, C5255.f12527);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<String> f13125 = C8158.m26858(f13116, f13117, f13118, f13119, f13121, f13120, f13122, f13123);

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۧ$ۥ */
    public static final class C0725 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۧۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0725(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final List<C5255> m2121(@InterfaceC6399 C7101 c7101) {
            C5499.m17103(c7101, "request");
            C5256 c5256M22153 = c7101.m22153();
            ArrayList arrayList = new ArrayList(c5256M22153.size() + 4);
            arrayList.add(new C5255(C5255.f12529, c7101.m22156()));
            arrayList.add(new C5255(C5255.f12530, C7110.f2689.m22226(c7101.m22160())));
            String strM22152 = c7101.m22152("Host");
            if (strM22152 != null) {
                arrayList.add(new C5255(C5255.f12532, strM22152));
            }
            arrayList.add(new C5255(C5255.f12531, c7101.m22160().m16789()));
            int size = c5256M22153.size();
            for (int i = 0; i < size; i++) {
                String strM16114 = c5256M22153.m16114(i);
                Locale locale = Locale.US;
                C5499.m17102(locale, "US");
                String lowerCase = strM16114.toLowerCase(locale);
                C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C5368.f13124.contains(lowerCase) || (C5499.m17094(lowerCase, C5368.f13121) && C5499.m17094(c5256M22153.m16118(i), "trailers"))) {
                    arrayList.add(new C5255(lowerCase, c5256M22153.m16118(i)));
                }
            }
            return arrayList;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C7141.C1185 m2122(@InterfaceC6399 C5256 c5256, @InterfaceC6399 EnumC6835 enumC6835) throws IOException {
            C5499.m17103(c5256, "headerBlock");
            C5499.m17103(enumC6835, "protocol");
            C5256.C0687 c0687 = new C5256.C0687();
            int size = c5256.size();
            C7597 c7597M3757 = null;
            for (int i = 0; i < size; i++) {
                String strM16114 = c5256.m16114(i);
                String strM16118 = c5256.m16118(i);
                if (C5499.m17094(strM16114, C5255.f12523)) {
                    c7597M3757 = C7597.f22994.m3757("HTTP/1.1 " + strM16118);
                } else if (!C5368.f13125.contains(strM16114)) {
                    c0687.m16124(strM16114, strM16118);
                }
            }
            if (c7597M3757 != null) {
                return new C7141.C1185().m22359(enumC6835).m22338(c7597M3757.f2960).m22356(c7597M3757.f22999).m22354(c0687.m16126());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0725() {
        }
    }

    public C5368(@InterfaceC6399 C6504 c6504, @InterfaceC6399 C7026 c7026, @InterfaceC6399 C7031 c7031, @InterfaceC6399 C5355 c5355) {
        C5499.m17103(c6504, "client");
        C5499.m17103(c7026, f13116);
        C5499.m17103(c7031, "chain");
        C5499.m17103(c5355, "http2Connection");
        this.f13126 = c7026;
        this.f13127 = c7031;
        this.f13128 = c5355;
        List<EnumC6835> listM20652 = c6504.m20652();
        EnumC6835 enumC6835 = EnumC6835.H2_PRIOR_KNOWLEDGE;
        this.f13130 = listM20652.contains(enumC6835) ? enumC6835 : EnumC6835.HTTP_2;
    }

    @Override // Yue.InterfaceC4743
    public void cancel() {
        this.f13131 = true;
        C5371 c5371 = this.f13129;
        if (c5371 != null) {
            c5371.m16625(EnumC4660.CANCEL);
        }
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ */
    public long mo1660(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        if (C5379.m16726(c7141)) {
            return C8158.m26856(c7141);
        }
        return 0L;
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7472 mo1661(@InterfaceC6399 C7101 c7101, long j) {
        C5499.m17103(c7101, "request");
        C5371 c5371 = this.f13129;
        C5499.m17100(c5371);
        return c5371.m16634();
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo14295() throws IOException {
        C5371 c5371 = this.f13129;
        C5499.m17100(c5371);
        c5371.m16634().close();
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo14296(@InterfaceC6399 C7101 c7101) throws IOException {
        C5499.m17103(c7101, "request");
        if (this.f13129 != null) {
            return;
        }
        this.f13129 = this.f13128.m16530(f13115.m2121(c7101), c7101.m22149() != null);
        if (this.f13131) {
            C5371 c5371 = this.f13129;
            C5499.m17100(c5371);
            c5371.m16625(EnumC4660.CANCEL);
            throw new IOException("Canceled");
        }
        C5371 c53712 = this.f13129;
        C5499.m17100(c53712);
        C7827 c7827M16643 = c53712.m16643();
        long jM21889 = this.f13127.m21889();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7827M16643.mo15622(jM21889, timeUnit);
        C5371 c53713 = this.f13129;
        C5499.m17100(c53713);
        c53713.m16657().mo15622(this.f13127.m21891(), timeUnit);
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public C7141.C1185 mo14297(boolean z) throws IOException {
        C5371 c5371 = this.f13129;
        if (c5371 == null) {
            throw new IOException("stream wasn't created");
        }
        C7141.C1185 c1185M2122 = f13115.m2122(c5371.m16653(), this.f13130);
        if (z && c1185M2122.m22341() == 100) {
            return null;
        }
        return c1185M2122;
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public C7026 mo14298() {
        return this.f13126;
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14299() throws IOException {
        this.f13128.flush();
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C5256 mo14300() {
        C5371 c5371 = this.f13129;
        C5499.m17100(c5371);
        return c5371.m16654();
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC7506 mo14301(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        C5371 c5371 = this.f13129;
        C5499.m17100(c5371);
        return c5371.m16637();
    }
}
