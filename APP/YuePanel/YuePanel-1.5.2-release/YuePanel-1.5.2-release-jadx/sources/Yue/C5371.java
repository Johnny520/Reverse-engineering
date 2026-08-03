package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class C5371 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0728 f13144 = new C0728(null);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long f13145 = 16384;

    /* JADX INFO: renamed from: ۥ */
    public final int f1455;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C5355 f1456;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f13146;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f13147;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long f13148;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public long f13149;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<C5256> f13150;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f13151;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C5372 f13152;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C0729 f13153;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5373 f13154;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5373 f13155;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public EnumC4660 f13156;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6489
    public IOException f13157;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ$ۥ */
    public static final class C0728 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0728(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0728() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class C5372 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long f13163;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f13164;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final C3600 f13165 = new C3600();

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public final C3600 f13166 = new C3600();

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6489
        public C5256 f13167;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f13168;

        public C5372(long j, boolean z) {
            this.f13163 = j;
            this.f13164 = z;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long jM9684;
            C5371 c5371 = C5371.this;
            synchronized (c5371) {
                this.f13168 = true;
                jM9684 = this.f13166.m9684();
                this.f13166.m9603();
                C5499.m17101(c5371, "null cannot be cast to non-null type java.lang.Object");
                c5371.notifyAll();
                C8107 c8107 = C8107.f3222;
            }
            if (jM9684 > 0) {
                m16672(jM9684);
            }
            C5371.this.m2128();
        }

        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo518() {
            return C5371.this.m16633();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m2130() {
            return this.f13168;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m16664() {
            return this.f13164;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C3600 m16665() {
            return this.f13166;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C3600 m16666() {
            return this.f13165;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C5256 m16667() {
            return this.f13167;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m16668(@InterfaceC6399 InterfaceC3604 interfaceC3604, long j) throws IOException {
            boolean z;
            boolean z2;
            C5499.m17103(interfaceC3604, "source");
            C5371 c5371 = C5371.this;
            if (C8158.f24182 && Thread.holdsLock(c5371)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c5371);
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (C5371.this) {
                    z = this.f13164;
                    z2 = this.f13166.m9684() + j2 > this.f13163;
                    C8107 c8107 = C8107.f3222;
                }
                if (z2) {
                    interfaceC3604.skip(j2);
                    C5371.this.m16625(EnumC4660.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    interfaceC3604.skip(j2);
                    return;
                }
                long jMo9103 = interfaceC3604.mo9103(this.f13165, j2);
                if (jMo9103 == -1) {
                    throw new EOFException();
                }
                j2 -= jMo9103;
                C5371 c53712 = C5371.this;
                synchronized (c53712) {
                    try {
                        if (this.f13168) {
                            this.f13165.m9603();
                        } else {
                            boolean z3 = this.f13166.m9684() == 0;
                            this.f13166.mo9610(this.f13165);
                            if (z3) {
                                C5499.m17101(c53712, "null cannot be cast to non-null type java.lang.Object");
                                c53712.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m16672(j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m16669(boolean z) {
            this.f13168 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16670(boolean z) {
            this.f13164 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m16671(@InterfaceC6489 C5256 c5256) {
            this.f13167 = c5256;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final void m16672(long j) {
            C5371 c5371 = C5371.this;
            if (!C8158.f24182 || !Thread.holdsLock(c5371)) {
                C5371.this.m16627().m16548(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c5371);
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            IOException iOExceptionM16629;
            boolean z;
            long jMo9103;
            C5499.m17103(c3600, "sink");
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                C5371 c5371 = C5371.this;
                synchronized (c5371) {
                    c5371.m16633().m9089();
                    try {
                        if (c5371.m16628() == null || this.f13164) {
                            iOExceptionM16629 = null;
                        } else {
                            iOExceptionM16629 = c5371.m16629();
                            if (iOExceptionM16629 == null) {
                                EnumC4660 enumC4660M16628 = c5371.m16628();
                                C5499.m17100(enumC4660M16628);
                                iOExceptionM16629 = new C7604(enumC4660M16628);
                            }
                        }
                        if (this.f13168) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (this.f13166.m9684() > j2) {
                            C3600 c36002 = this.f13166;
                            jMo9103 = c36002.mo9103(c3600, Math.min(j, c36002.m9684()));
                            c5371.m16650(c5371.m16632() + jMo9103);
                            long jM16632 = c5371.m16632() - c5371.m16631();
                            if (iOExceptionM16629 == null && jM16632 >= c5371.m16627().m16517().m23176() / 2) {
                                c5371.m16627().m16556(c5371.m16630(), jM16632);
                                c5371.m16649(c5371.m16632());
                            }
                        } else {
                            if (!this.f13164 && iOExceptionM16629 == null) {
                                c5371.m16655();
                                z = true;
                            }
                            jMo9103 = -1;
                        }
                        c5371.m16633().m16673();
                        C8107 c8107 = C8107.f3222;
                    } finally {
                    }
                }
                if (!z) {
                    if (jMo9103 != -1) {
                        return jMo9103;
                    }
                    if (iOExceptionM16629 == null) {
                        return -1L;
                    }
                    throw iOExceptionM16629;
                }
                j2 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C5373 extends C3443 {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5373() {
        }

        @Override // Yue.C3443
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public IOException mo9091(@InterfaceC6489 IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // Yue.C3443
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public void mo9095() {
            C5371.this.m16625(EnumC4660.CANCEL);
            C5371.this.m16627().m16539();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final void m16673() throws IOException {
            if (m9090()) {
                throw mo9091(null);
            }
        }
    }

    public C5371(int i, @InterfaceC6399 C5355 c5355, boolean z, boolean z2, @InterfaceC6489 C5256 c5256) {
        C5499.m17103(c5355, C5368.f13116);
        this.f1455 = i;
        this.f1456 = c5355;
        this.f13149 = c5355.m16518().m23176();
        ArrayDeque<C5256> arrayDeque = new ArrayDeque<>();
        this.f13150 = arrayDeque;
        this.f13152 = new C5372(c5355.m16517().m23176(), z2);
        this.f13153 = new C0729(z);
        this.f13154 = new C5373();
        this.f13155 = new C5373();
        if (c5256 == null) {
            if (!m16641()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m16641())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c5256);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m2127(long j) {
        this.f13149 += j;
        if (j > 0) {
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2128() throws IOException {
        boolean z;
        boolean zM16642;
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z = !this.f13152.m16664() && this.f13152.m2130() && (this.f13153.m16659() || this.f13153.m16658());
                zM16642 = m16642();
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m16623(EnumC4660.CANCEL, null);
        } else {
            if (zM16642) {
                return;
            }
            this.f1456.m16538(this.f1455);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m16622() throws IOException {
        if (this.f13153.m16658()) {
            throw new IOException("stream closed");
        }
        if (this.f13153.m16659()) {
            throw new IOException("stream finished");
        }
        if (this.f13156 != null) {
            IOException iOException = this.f13157;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4660 enumC4660 = this.f13156;
            C5499.m17100(enumC4660);
            throw new C7604(enumC4660);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m16623(@InterfaceC6399 EnumC4660 enumC4660, @InterfaceC6489 IOException iOException) throws IOException {
        C5499.m17103(enumC4660, "rstStatusCode");
        if (m16624(enumC4660, iOException)) {
            this.f1456.m16554(this.f1455, enumC4660);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m16624(EnumC4660 enumC4660, IOException iOException) {
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f13156 != null) {
                return false;
            }
            this.f13156 = enumC4660;
            this.f13157 = iOException;
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f13152.m16664() && this.f13153.m16659()) {
                return false;
            }
            C8107 c8107 = C8107.f3222;
            this.f1456.m16538(this.f1455);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m16625(@InterfaceC6399 EnumC4660 enumC4660) {
        C5499.m17103(enumC4660, "errorCode");
        if (m16624(enumC4660, null)) {
            this.f1456.m16555(this.f1455, enumC4660);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m16626(@InterfaceC6399 C5256 c5256) {
        C5499.m17103(c5256, "trailers");
        synchronized (this) {
            if (!(!this.f13153.m16659())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (c5256.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.f13153.m16663(c5256);
            C8107 c8107 = C8107.f3222;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C5355 m16627() {
        return this.f1456;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final synchronized EnumC4660 m16628() {
        return this.f13156;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final IOException m16629() {
        return this.f13157;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m16630() {
        return this.f1455;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final long m16631() {
        return this.f13147;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final long m16632() {
        return this.f13146;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C5373 m16633() {
        return this.f13154;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final InterfaceC7472 m16634() {
        synchronized (this) {
            try {
                if (!this.f13151 && !m16641()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f13153;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C0729 m16635() {
        return this.f13153;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final InterfaceC7506 m16636() {
        return this.f13152;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final C5372 m16637() {
        return this.f13152;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final long m16638() {
        return this.f13149;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long m16639() {
        return this.f13148;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final C5373 m16640() {
        return this.f13155;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m16641() {
        return this.f1456.m16512() == ((this.f1455 & 1) == 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final synchronized boolean m16642() {
        try {
            if (this.f13156 != null) {
                return false;
            }
            if (this.f13152.m16664() || this.f13152.m2130()) {
                if (this.f13153.m16659() || this.f13153.m16658()) {
                    if (this.f13151) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final C7827 m16643() {
        return this.f13154;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m16644(@InterfaceC6399 InterfaceC3604 interfaceC3604, int i) throws IOException {
        C5499.m17103(interfaceC3604, "source");
        if (!C8158.f24182 || !Thread.holdsLock(this)) {
            this.f13152.m16668(interfaceC3604, i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m16645(@InterfaceC6399 C5256 c5256, boolean z) {
        boolean zM16642;
        C5499.m17103(c5256, "headers");
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f13151 && z) {
                    this.f13152.m16671(c5256);
                } else {
                    this.f13151 = true;
                    this.f13150.add(c5256);
                }
                if (z) {
                    this.f13152.m16670(true);
                }
                zM16642 = m16642();
                C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM16642) {
            return;
        }
        this.f1456.m16538(this.f1455);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final synchronized void m16646(@InterfaceC6399 EnumC4660 enumC4660) {
        C5499.m17103(enumC4660, "errorCode");
        if (this.f13156 == null) {
            this.f13156 = enumC4660;
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m16647(@InterfaceC6489 EnumC4660 enumC4660) {
        this.f13156 = enumC4660;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m16648(@InterfaceC6489 IOException iOException) {
        this.f13157 = iOException;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m16649(long j) {
        this.f13147 = j;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m16650(long j) {
        this.f13146 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m16651(long j) {
        this.f13149 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m16652(long j) {
        this.f13148 = j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final synchronized C5256 m16653() throws IOException {
        C5256 c5256RemoveFirst;
        this.f13154.m9089();
        while (this.f13150.isEmpty() && this.f13156 == null) {
            try {
                m16655();
            } catch (Throwable th) {
                this.f13154.m16673();
                throw th;
            }
        }
        this.f13154.m16673();
        if (!(!this.f13150.isEmpty())) {
            IOException iOException = this.f13157;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4660 enumC4660 = this.f13156;
            C5499.m17100(enumC4660);
            throw new C7604(enumC4660);
        }
        c5256RemoveFirst = this.f13150.removeFirst();
        C5499.m17102(c5256RemoveFirst, "headersQueue.removeFirst()");
        return c5256RemoveFirst;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final synchronized C5256 m16654() throws IOException {
        C5256 c5256M16667;
        if (!this.f13152.m16664() || !this.f13152.m16666().mo9622() || !this.f13152.m16665().mo9622()) {
            if (this.f13156 == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f13157;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4660 enumC4660 = this.f13156;
            C5499.m17100(enumC4660);
            throw new C7604(enumC4660);
        }
        c5256M16667 = this.f13152.m16667();
        if (c5256M16667 == null) {
            c5256M16667 = C8158.f3266;
        }
        return c5256M16667;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m16655() throws InterruptedIOException {
        try {
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m16656(@InterfaceC6399 List<C5255> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        C5499.m17103(list, "responseHeaders");
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                this.f13151 = true;
                if (z) {
                    this.f13153.m16662(true);
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            synchronized (this.f1456) {
                z3 = this.f1456.m16526() >= this.f1456.m16525();
            }
            z2 = z3;
        }
        this.f1456.m16550(this.f1455, z, list);
        if (z2) {
            this.f1456.flush();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final C7827 m16657() {
        return this.f13155;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ$ۥ۟ */
    @InterfaceC7507({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class C0729 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f13158;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final C3600 f13159;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public C5256 f13160;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f13161;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0729(boolean z) {
            this.f13158 = z;
            this.f13159 = new C3600();
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C5371 c5371 = C5371.this;
            if (C8158.f24182 && Thread.holdsLock(c5371)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c5371);
            }
            C5371 c53712 = C5371.this;
            synchronized (c53712) {
                if (this.f13161) {
                    return;
                }
                boolean z = c53712.m16628() == null;
                C8107 c8107 = C8107.f3222;
                if (!C5371.this.m16635().f13158) {
                    boolean z2 = this.f13159.m9684() > 0;
                    if (this.f13160 != null) {
                        while (this.f13159.m9684() > 0) {
                            m2129(false);
                        }
                        C5355 c5355M16627 = C5371.this.m16627();
                        int iM16630 = C5371.this.m16630();
                        C5256 c5256 = this.f13160;
                        C5499.m17100(c5256);
                        c5355M16627.m16550(iM16630, z, C8158.m26883(c5256));
                    } else if (z2) {
                        while (this.f13159.m9684() > 0) {
                            m2129(true);
                        }
                    } else if (z) {
                        C5371.this.m16627().m16549(C5371.this.m16630(), true, null, 0L);
                    }
                }
                synchronized (C5371.this) {
                    this.f13161 = true;
                    C8107 c81072 = C8107.f3222;
                }
                C5371.this.m16627().flush();
                C5371.this.m2128();
            }
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public void flush() throws IOException {
            C5371 c5371 = C5371.this;
            if (C8158.f24182 && Thread.holdsLock(c5371)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c5371);
            }
            C5371 c53712 = C5371.this;
            synchronized (c53712) {
                c53712.m16622();
                C8107 c8107 = C8107.f3222;
            }
            while (this.f13159.m9684() > 0) {
                m2129(false);
                C5371.this.m16627().flush();
            }
        }

        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C7827 mo516() {
            return C5371.this.m16640();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2129(boolean z) throws IOException {
            long jMin;
            boolean z2;
            C5371 c5371 = C5371.this;
            synchronized (c5371) {
                try {
                    c5371.m16640().m9089();
                    while (c5371.m16639() >= c5371.m16638() && !this.f13158 && !this.f13161 && c5371.m16628() == null) {
                        try {
                            c5371.m16655();
                        } finally {
                            c5371.m16640().m16673();
                        }
                    }
                    c5371.m16640().m16673();
                    c5371.m16622();
                    jMin = Math.min(c5371.m16638() - c5371.m16639(), this.f13159.m9684());
                    c5371.m16652(c5371.m16639() + jMin);
                    z2 = z && jMin == this.f13159.m9684();
                    C8107 c8107 = C8107.f3222;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C5371.this.m16640().m9089();
            try {
                C5371.this.m16627().m16549(C5371.this.m16630(), z2, this.f13159, jMin);
            } finally {
                c5371 = C5371.this;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m16658() {
            return this.f13161;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m16659() {
            return this.f13158;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5256 m16660() {
            return this.f13160;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m16661(boolean z) {
            this.f13161 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m16662(boolean z) {
            this.f13158 = z;
        }

        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            C5371 c5371 = C5371.this;
            if (!C8158.f24182 || !Thread.holdsLock(c5371)) {
                this.f13159.mo9102(c3600, j);
                while (this.f13159.m9684() >= C5371.f13145) {
                    m2129(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c5371);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m16663(@InterfaceC6489 C5256 c5256) {
            this.f13160 = c5256;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 Yue.ۥ۠ۤۨ)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(Yue.ۥ۠ۤۨ, boolean):void (m)] (LINE:4) call: Yue.ۥ۠ۤۨ.ۥ۟.<init>(Yue.ۥ۠ۤۨ, boolean):void type: THIS */
        public /* synthetic */ C0729(C5371 c5371, boolean z, int i, C4335 c4335) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
