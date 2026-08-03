package Yue;

import Yue.C7141;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class C5348 implements InterfaceC4743 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5350 f12981 = new C5350(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long f12982 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f12983 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f12984 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f12985 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f12986 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f12987 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f12988 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f12989 = 6;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C6504 f12990;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7026 f12991;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f12992;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3603 f12993;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f12994;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5257 f12995;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public C5256 f12996;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ */
    public abstract class AbstractC0717 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5069 f12997;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f12998;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AbstractC0717() {
            this.f12997 = new C5069(C5348.this.f12992.mo518());
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return this.f12997;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m2114() {
            return this.f12998;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5069 m16486() {
            return this.f12997;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16487() {
            if (C5348.this.f12994 == 6) {
                return;
            }
            if (C5348.this.f12994 == 5) {
                C5348.this.m16475(this.f12997);
                C5348.this.f12994 = 6;
            } else {
                throw new IllegalStateException("state: " + C5348.this.f12994);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m16488(boolean z) {
            this.f12998 = z;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            try {
                return C5348.this.f12992.mo9103(c3600, j);
            } catch (IOException e) {
                C5348.this.mo14298().m21870();
                m16487();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟ */
    @InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class C0718 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5069 f13000;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f13001;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0718() {
            this.f13000 = new C5069(C5348.this.f12993.mo516());
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f13001) {
                return;
            }
            this.f13001 = true;
            C5348.this.f12993.mo9638("0\r\n\r\n");
            C5348.this.m16475(this.f13000);
            C5348.this.f12994 = 3;
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public synchronized void flush() {
            if (this.f13001) {
                return;
            }
            C5348.this.f12993.flush();
        }

        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo516() {
            return this.f13000;
        }

        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            if (!(!this.f13001)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            C5348.this.f12993.mo9646(j);
            C5348.this.f12993.mo9638("\r\n");
            C5348.this.f12993.mo9102(c3600, j);
            C5348.this.f12993.mo9638("\r\n");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class C5349 extends AbstractC0717 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public final C5385 f13003;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public long f13004;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f13005;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ C5348 f13006;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5349(@InterfaceC6399 C5348 c5348, C5385 c5385) {
            super();
            C5499.m17103(c5385, "url");
            this.f13006 = c5348;
            this.f13003 = c5385;
            this.f13004 = -1L;
            this.f13005 = true;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m2114()) {
                return;
            }
            if (this.f13005 && !C8158.m26852(this, 100, TimeUnit.MILLISECONDS)) {
                this.f13006.mo14298().m21870();
                m16487();
            }
            m16488(true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m16489() throws IOException {
            if (this.f13004 != -1) {
                this.f13006.f12992.mo9655();
            }
            try {
                this.f13004 = this.f13006.f12992.mo9674();
                String string = C7628.m24174(this.f13006.f12992.mo9655()).toString();
                if (this.f13004 < 0 || (string.length() > 0 && !C7627.m24008(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f13004 + string + C8039.f3212);
                }
                if (this.f13004 == 0) {
                    this.f13005 = false;
                    C5348 c5348 = this.f13006;
                    c5348.f12996 = c5348.f12995.m2026();
                    C6504 c6504 = this.f13006.f12990;
                    C5499.m17100(c6504);
                    InterfaceC4217 interfaceC4217M20639 = c6504.m20639();
                    C5385 c5385 = this.f13003;
                    C5256 c5256 = this.f13006.f12996;
                    C5499.m17100(c5256);
                    C5379.m16730(interfaceC4217M20639, c5385, c5256);
                    m16487();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // Yue.C5348.AbstractC0717, Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m2114())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f13005) {
                return -1L;
            }
            long j2 = this.f13004;
            if (j2 == 0 || j2 == -1) {
                m16489();
                if (!this.f13005) {
                    return -1L;
                }
            }
            long jMo9103 = super.mo9103(c3600, Math.min(j, this.f13004));
            if (jMo9103 != -1) {
                this.f13004 -= jMo9103;
                return jMo9103;
            }
            this.f13006.mo14298().m21870();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m16487();
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5350 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۧۤ.ۥ۟۟۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C5350(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5350() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class C5351 extends AbstractC0717 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public long f13007;

        public C5351(long j) {
            super();
            this.f13007 = j;
            if (j == 0) {
                m16487();
            }
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m2114()) {
                return;
            }
            if (this.f13007 != 0 && !C8158.m26852(this, 100, TimeUnit.MILLISECONDS)) {
                C5348.this.mo14298().m21870();
                m16487();
            }
            m16488(true);
        }

        @Override // Yue.C5348.AbstractC0717, Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m2114())) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f13007;
            if (j2 == 0) {
                return -1L;
            }
            long jMo9103 = super.mo9103(c3600, Math.min(j2, j));
            if (jMo9103 == -1) {
                C5348.this.mo14298().m21870();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m16487();
                throw protocolException;
            }
            long j3 = this.f13007 - jMo9103;
            this.f13007 = j3;
            if (j3 == 0) {
                m16487();
            }
            return jMo9103;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class C5352 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5069 f13009;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f13010;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5352() {
            this.f13009 = new C5069(C5348.this.f12993.mo516());
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f13010) {
                return;
            }
            this.f13010 = true;
            C5348.this.m16475(this.f13009);
            C5348.this.f12994 = 3;
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public void flush() throws IOException {
            if (this.f13010) {
                return;
            }
            C5348.this.f12993.flush();
        }

        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo516() {
            return this.f13009;
        }

        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            if (!(!this.f13010)) {
                throw new IllegalStateException("closed".toString());
            }
            C8158.m26843(c3600.m9684(), 0L, j);
            C5348.this.f12993.mo9102(c3600, j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class C5353 extends AbstractC0717 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f13012;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5353() {
            super();
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m2114()) {
                return;
            }
            if (!this.f13012) {
                m16487();
            }
            m16488(true);
        }

        @Override // Yue.C5348.AbstractC0717, Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m2114())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f13012) {
                return -1L;
            }
            long jMo9103 = super.mo9103(c3600, j);
            if (jMo9103 != -1) {
                return jMo9103;
            }
            this.f13012 = true;
            m16487();
            return -1L;
        }
    }

    public C5348(@InterfaceC6489 C6504 c6504, @InterfaceC6399 C7026 c7026, @InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 InterfaceC3603 interfaceC3603) {
        C5499.m17103(c7026, C5368.f13116);
        C5499.m17103(interfaceC3604, "source");
        C5499.m17103(interfaceC3603, "sink");
        this.f12990 = c6504;
        this.f12991 = c7026;
        this.f12992 = interfaceC3604;
        this.f12993 = interfaceC3603;
        this.f12995 = new C5257(interfaceC3604);
    }

    @Override // Yue.InterfaceC4743
    public void cancel() {
        mo14298().m21848();
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ */
    public long mo1660(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        if (!C5379.m16726(c7141)) {
            return 0L;
        }
        if (m16477(c7141)) {
            return -1L;
        }
        return C8158.m26856(c7141);
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7472 mo1661(@InterfaceC6399 C7101 c7101, long j) throws ProtocolException {
        C5499.m17103(c7101, "request");
        if (c7101.m22149() != null && c7101.m22149().m22206()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m16476(c7101)) {
            return m16479();
        }
        if (j != -1) {
            return m16482();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo14295() {
        this.f12993.flush();
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo14296(@InterfaceC6399 C7101 c7101) {
        C5499.m17103(c7101, "request");
        C7110 c7110 = C7110.f2689;
        Proxy.Type type = mo14298().mo1066().m22505().type();
        C5499.m17102(type, "connection.route().proxy.type()");
        m16485(c7101.m22153(), c7110.m3401(c7101, type));
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public C7141.C1185 mo14297(boolean z) {
        int i = this.f12994;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f12994).toString());
        }
        try {
            C7597 c7597M3757 = C7597.f22994.m3757(this.f12995.m16141());
            C7141.C1185 c1185M22354 = new C7141.C1185().m22359(c7597M3757.f2959).m22338(c7597M3757.f2960).m22356(c7597M3757.f22999).m22354(this.f12995.m2026());
            if (z && c7597M3757.f2960 == 100) {
                return null;
            }
            int i2 = c7597M3757.f2960;
            if (i2 == 100) {
                this.f12994 = 3;
                return c1185M22354;
            }
            if (102 > i2 || i2 >= 200) {
                this.f12994 = 4;
                return c1185M22354;
            }
            this.f12994 = 3;
            return c1185M22354;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on " + mo14298().mo1066().m22504().m6514().m16787(), e);
        }
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public C7026 mo14298() {
        return this.f12991;
    }

    @Override // Yue.InterfaceC4743
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14299() throws IOException {
        this.f12993.flush();
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C5256 mo14300() {
        if (this.f12994 != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        C5256 c5256 = this.f12996;
        return c5256 == null ? C8158.f3266 : c5256;
    }

    @Override // Yue.InterfaceC4743
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC7506 mo14301(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        if (!C5379.m16726(c7141)) {
            return m16481(0L);
        }
        if (m16477(c7141)) {
            return m16480(c7141.m22331().m22160());
        }
        long jM26856 = C8158.m26856(c7141);
        return jM26856 != -1 ? m16481(jM26856) : m16483();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m16475(C5069 c5069) {
        C7827 c7827M15624 = c5069.m15624();
        c5069.m15625(C7827.f23434);
        c7827M15624.mo1893();
        c7827M15624.mo15617();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m16476(C7101 c7101) {
        return C7627.m23974("chunked", c7101.m22152("Transfer-Encoding"), true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m16477(C7141 c7141) {
        return C7627.m23974("chunked", C7141.m22298(c7141, "Transfer-Encoding", null, 2, null), true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m16478() {
        return this.f12994 == 6;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final InterfaceC7472 m16479() {
        if (this.f12994 == 1) {
            this.f12994 = 2;
            return new C0718();
        }
        throw new IllegalStateException(("state: " + this.f12994).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final InterfaceC7506 m16480(C5385 c5385) {
        if (this.f12994 == 4) {
            this.f12994 = 5;
            return new C5349(this, c5385);
        }
        throw new IllegalStateException(("state: " + this.f12994).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final InterfaceC7506 m16481(long j) {
        if (this.f12994 == 4) {
            this.f12994 = 5;
            return new C5351(j);
        }
        throw new IllegalStateException(("state: " + this.f12994).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC7472 m16482() {
        if (this.f12994 == 1) {
            this.f12994 = 2;
            return new C5352();
        }
        throw new IllegalStateException(("state: " + this.f12994).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final InterfaceC7506 m16483() {
        if (this.f12994 == 4) {
            this.f12994 = 5;
            mo14298().m21870();
            return new C5353();
        }
        throw new IllegalStateException(("state: " + this.f12994).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m16484(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        long jM26856 = C8158.m26856(c7141);
        if (jM26856 == -1) {
            return;
        }
        InterfaceC7506 interfaceC7506M16481 = m16481(jM26856);
        C8158.m26879(interfaceC7506M16481, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        interfaceC7506M16481.close();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m16485(@InterfaceC6399 C5256 c5256, @InterfaceC6399 String str) {
        C5499.m17103(c5256, "headers");
        C5499.m17103(str, "requestLine");
        if (this.f12994 != 0) {
            throw new IllegalStateException(("state: " + this.f12994).toString());
        }
        this.f12993.mo9638(str).mo9638("\r\n");
        int size = c5256.size();
        for (int i = 0; i < size; i++) {
            this.f12993.mo9638(c5256.m16114(i)).mo9638(": ").mo9638(c5256.m16118(i)).mo9638("\r\n");
        }
        this.f12993.mo9638("\r\n");
        this.f12994 = 1;
    }
}
