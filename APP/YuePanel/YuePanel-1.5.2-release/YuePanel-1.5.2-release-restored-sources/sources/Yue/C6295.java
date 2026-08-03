package Yue;

import Yue.C3630;
import Yue.C6582;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class C6295 implements Closeable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0958 f15881 = new C0958(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6582 f15882;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f15883;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f15884;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3630 f15885;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3630 f15886;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f15887;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f15888;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f15889;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6489
    public C6296 f15890;

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ */
    public static final class C0958 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۡۦۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0958(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C6582 m2773() {
            return C6295.f15882;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0958() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ۟ */
    public static final class C0959 implements Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5256 f15891;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f15892;

        public C0959(@InterfaceC6399 C5256 c5256, @InterfaceC6399 InterfaceC3604 interfaceC3604) {
            C5499.m17103(c5256, "headers");
            C5499.m17103(interfaceC3604, C5905.f14739);
            this.f15891 = c5256;
            this.f15892 = interfaceC3604;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f15892.close();
        }

        @InterfaceC6399
        @InterfaceC5572(name = C5905.f14739)
        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC3604 m2774() {
            return this.f15892;
        }

        @InterfaceC6399
        @InterfaceC5572(name = "headers")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5256 m19608() {
            return this.f15891;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    public final class C6296 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C7827 f15893 = new C7827();

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C6296() {
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C5499.m17094(C6295.this.f15890, this)) {
                C6295.this.f15890 = null;
            }
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f15893;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) {
            C5499.m17103(c3600, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!C5499.m17094(C6295.this.f15890, this)) {
                throw new IllegalStateException("closed".toString());
            }
            C7827 c7827Mo518 = C6295.this.f15883.mo518();
            C7827 c7827 = this.f15893;
            C6295 c6295 = C6295.this;
            long jMo15623 = c7827Mo518.mo15623();
            long jM3922 = C7827.f23433.m3922(c7827.mo15623(), c7827Mo518.mo15623());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            c7827Mo518.mo15622(jM3922, timeUnit);
            if (!c7827Mo518.mo15620()) {
                if (c7827.mo15620()) {
                    c7827Mo518.mo15619(c7827.mo15618());
                }
                try {
                    long jM19606 = c6295.m19606(j);
                    long jMo9103 = jM19606 == 0 ? -1L : c6295.f15883.mo9103(c3600, jM19606);
                    c7827Mo518.mo15622(jMo15623, timeUnit);
                    if (c7827.mo15620()) {
                        c7827Mo518.mo1893();
                    }
                    return jMo9103;
                } catch (Throwable th) {
                    c7827Mo518.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                    if (c7827.mo15620()) {
                        c7827Mo518.mo1893();
                    }
                    throw th;
                }
            }
            long jMo15618 = c7827Mo518.mo15618();
            if (c7827.mo15620()) {
                c7827Mo518.mo15619(Math.min(c7827Mo518.mo15618(), c7827.mo15618()));
            }
            try {
                long jM196062 = c6295.m19606(j);
                long jMo91032 = jM196062 == 0 ? -1L : c6295.f15883.mo9103(c3600, jM196062);
                c7827Mo518.mo15622(jMo15623, timeUnit);
                if (c7827.mo15620()) {
                    c7827Mo518.mo15619(jMo15618);
                }
                return jMo91032;
            } catch (Throwable th2) {
                c7827Mo518.mo15622(jMo15623, TimeUnit.NANOSECONDS);
                if (c7827.mo15620()) {
                    c7827Mo518.mo15619(jMo15618);
                }
                throw th2;
            }
        }
    }

    static {
        C6582.C1017 c1017 = C6582.f16900;
        C3630.C0198 c0198 = C3630.f6370;
        f15882 = c1017.m20908(c0198.m9876("\r\n"), c0198.m9876("--"), c0198.m9876(" "), c0198.m9876("\t"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6295(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 String str) throws IOException {
        C5499.m17103(interfaceC3604, "source");
        C5499.m17103(str, "boundary");
        this.f15883 = interfaceC3604;
        this.f15884 = str;
        this.f15885 = new C3600().mo9638("--").mo9638(str).mo9648();
        this.f15886 = new C3600().mo9638("\r\n--").mo9638(str).mo9648();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15888) {
            return;
        }
        this.f15888 = true;
        this.f15890 = null;
        this.f15883.close();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "boundary")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final String m19605() {
        return this.f15884;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final long m19606(long j) throws IOException {
        this.f15883.mo9670(this.f15886.m9852());
        long jMo9663 = this.f15883.mo9605().mo9663(this.f15886);
        return jMo9663 == -1 ? Math.min(j, (this.f15883.mo9605().m9684() - ((long) this.f15886.m9852())) + 1) : Math.min(j, jMo9663);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C0959 m19607() throws IOException {
        if (!(!this.f15888)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f15889) {
            return null;
        }
        if (this.f15887 == 0 && this.f15883.mo9647(0L, this.f15885)) {
            this.f15883.skip(this.f15885.m9852());
        } else {
            while (true) {
                long jM19606 = m19606(8192L);
                if (jM19606 == 0) {
                    break;
                }
                this.f15883.skip(jM19606);
            }
            this.f15883.skip(this.f15886.m9852());
        }
        boolean z = false;
        while (true) {
            int iMo9643 = this.f15883.mo9643(f15882);
            if (iMo9643 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iMo9643 == 0) {
                this.f15887++;
                C5256 c5256M2026 = new C5257(this.f15883).m2026();
                C6296 c6296 = new C6296();
                this.f15890 = c6296;
                return new C0959(c5256M2026, C6542.m20831(c6296));
            }
            if (iMo9643 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f15887 == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.f15889 = true;
                return null;
            }
            if (iMo9643 == 2 || iMo9643 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6295(@InterfaceC6399 AbstractC7142 abstractC7142) throws IOException {
        String strM18952;
        C5499.m17103(abstractC7142, "response");
        InterfaceC3604 interfaceC3604Mo9919 = abstractC7142.mo9919();
        C6149 c6149Mo9918 = abstractC7142.mo9918();
        if (c6149Mo9918 != null && (strM18952 = c6149Mo9918.m18952("boundary")) != null) {
            this(interfaceC3604Mo9919, strM18952);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
