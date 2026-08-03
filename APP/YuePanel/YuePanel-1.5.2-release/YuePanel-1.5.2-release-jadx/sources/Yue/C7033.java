package Yue;

import Yue.C3630;
import Yue.C8418;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class C7033 implements InterfaceC8408, C8418.InterfaceC1524 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1147 f21232 = new C1147(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<EnumC6835> f21233 = C3879.m10715(EnumC6835.HTTP_1_1);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long f21234 = 16777216;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long f21235 = 60000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final long f21236 = 1024;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7101 f2639;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final AbstractC8416 f2640;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Random f21237;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long f21238;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public C8412 f21239;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public long f21240;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f21241;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC3645 f21242;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public AbstractC7724 f21243;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public C8418 f21244;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public C8422 f21245;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public C7731 f21246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public String f21247;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6489
    public AbstractC7035 f21248;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<C3630> f21249;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayDeque<Object> f21250;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public long f21251;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f21252;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f21253;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public String f21254;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f21255;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f21256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f21257;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f21258;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f21259;

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ */
    public static final class C1146 {

        /* JADX INFO: renamed from: ۥ */
        public final int f2641;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public final C3630 f2642;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f21260;

        public C1146(int i, @InterfaceC6489 C3630 c3630, long j) {
            this.f2641 = i;
            this.f2642 = c3630;
            this.f21260 = j;
        }

        /* JADX INFO: renamed from: ۥ */
        public final long m3329() {
            return this.f21260;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m3330() {
            return this.f2641;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3630 m21923() {
            return this.f2642;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟ */
    public static final class C1147 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۡ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1147(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1147() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7034 {

        /* JADX INFO: renamed from: ۥ */
        public final int f2643;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final C3630 f2644;

        public C7034(int i, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(c3630, "data");
            this.f2643 = i;
            this.f2644 = c3630;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3630 m3331() {
            return this.f2644;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m3332() {
            return this.f2643;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7035 implements Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final boolean f21261;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f21262;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3603 f21263;

        public AbstractC7035(boolean z, @InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 InterfaceC3603 interfaceC3603) {
            C5499.m17103(interfaceC3604, "source");
            C5499.m17103(interfaceC3603, "sink");
            this.f21261 = z;
            this.f21262 = interfaceC3604;
            this.f21263 = interfaceC3603;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m3333() {
            return this.f21261;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final InterfaceC3603 m21924() {
            return this.f21263;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final InterfaceC3604 m21925() {
            return this.f21262;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public final class C7036 extends AbstractC7724 {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C7036() {
            super(C7033.this.f21247 + " writer", false, 2, null);
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            try {
                return C7033.this.m21921() ? 0L : -1L;
            } catch (IOException e) {
                C7033.this.m21908(e, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7037 implements InterfaceC3649 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ C7101 f2646;

        public C7037(C7101 c7101) {
            this.f2646 = c7101;
        }

        @Override // Yue.InterfaceC3649
        /* JADX INFO: renamed from: ۥ */
        public void mo716(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 IOException iOException) {
            C5499.m17103(interfaceC3645, C6411.f16272);
            C5499.m17103(iOException, "e");
            C7033.this.m21908(iOException, null);
        }

        @Override // Yue.InterfaceC3649
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo717(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7141 c7141) throws IOException {
            C5499.m17103(interfaceC3645, C6411.f16272);
            C5499.m17103(c7141, "response");
            C4742 c4742M22316 = c7141.m22316();
            try {
                C7033.this.m21905(c7141, c4742M22316);
                C5499.m17100(c4742M22316);
                AbstractC7035 abstractC7035M14282 = c4742M22316.m14282();
                C8412 c8412M4392 = C8412.f25125.m4392(c7141.m22320());
                C7033.this.f21239 = c8412M4392;
                if (!C7033.this.m21911(c8412M4392)) {
                    C7033 c7033 = C7033.this;
                    synchronized (c7033) {
                        c7033.f21250.clear();
                        c7033.mo21896(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C7033.this.m21910(C8158.f24183 + " WebSocket " + this.f2646.m22160().m16787(), abstractC7035M14282);
                    C7033.this.m21909().m28117(C7033.this, c7141);
                    C7033.this.m21912();
                } catch (Exception e) {
                    C7033.this.m21908(e, null);
                }
            } catch (IOException e2) {
                C7033.this.m21908(e2, c7141);
                C8158.m26844(c7141);
                if (c4742M22316 != null) {
                    c4742M22316.m14291();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n270#2,2:219\n*E\n"})
    public static final class C7038 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C7033 f21265;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ long f21266;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7038(String str, C7033 c7033, long j) {
            super(str, false, 2, null);
            this.f21265 = c7033;
            this.f21266 = j;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f21265.m21922();
            return this.f21266;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n513#2,2:219\n*E\n"})
    public static final class C7039 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C7033 f21267;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7039(String str, boolean z, C7033 c7033) {
            super(str, z);
            this.f21267 = c7033;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f21267.cancel();
            return -1L;
        }
    }

    public C7033(@InterfaceC6399 C7733 c7733, @InterfaceC6399 C7101 c7101, @InterfaceC6399 AbstractC8416 abstractC8416, @InterfaceC6399 Random random, long j, @InterfaceC6489 C8412 c8412, long j2) {
        C5499.m17103(c7733, "taskRunner");
        C5499.m17103(c7101, "originalRequest");
        C5499.m17103(abstractC8416, "listener");
        C5499.m17103(random, "random");
        this.f2639 = c7101;
        this.f2640 = abstractC8416;
        this.f21237 = random;
        this.f21238 = j;
        this.f21239 = c8412;
        this.f21240 = j2;
        this.f21246 = c7733.m24605();
        this.f21249 = new ArrayDeque<>();
        this.f21250 = new ArrayDeque<>();
        this.f21253 = -1;
        if (!C5499.m17094("GET", c7101.m22156())) {
            throw new IllegalArgumentException(("Request must be GET: " + c7101.m22156()).toString());
        }
        C3630.C0198 c0198 = C3630.f6370;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C8107 c8107 = C8107.f3222;
        this.f21241 = C3630.C0198.m9867(c0198, bArr, 0, 0, 3, null).mo9816();
    }

    @Override // Yue.InterfaceC8408
    public void cancel() {
        InterfaceC3645 interfaceC3645 = this.f21242;
        C5499.m17100(interfaceC3645);
        interfaceC3645.cancel();
    }

    @Override // Yue.InterfaceC8408
    /* JADX INFO: renamed from: ۥ */
    public boolean mo3327(@InterfaceC6399 String str) {
        C5499.m17103(str, "text");
        return m21918(C3630.f6370.m9876(str), 1);
    }

    @Override // Yue.InterfaceC8408
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C7101 mo3328() {
        return this.f2639;
    }

    @Override // Yue.InterfaceC8408
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo21896(int i, @InterfaceC6489 String str) {
        return m21906(i, str, f21235);
    }

    @Override // Yue.C8418.InterfaceC1524
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo21897(@InterfaceC6399 String str) throws IOException {
        C5499.m17103(str, "text");
        this.f2640.m28116(this, str);
    }

    @Override // Yue.InterfaceC8408
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo21898(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "bytes");
        return m21918(c3630, 2);
    }

    @Override // Yue.C8418.InterfaceC1524
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo21899(@InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "bytes");
        this.f2640.m28115(this, c3630);
    }

    @Override // Yue.C8418.InterfaceC1524
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public synchronized void mo21900(@InterfaceC6399 C3630 c3630) {
        try {
            C5499.m17103(c3630, "payload");
            if (!this.f21255 && (!this.f21252 || !this.f21250.isEmpty())) {
                this.f21249.add(c3630);
                m21917();
                this.f21257++;
            }
        } finally {
        }
    }

    @Override // Yue.InterfaceC8408
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public synchronized long mo21901() {
        return this.f21251;
    }

    @Override // Yue.C8418.InterfaceC1524
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public synchronized void mo21902(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "payload");
        this.f21258++;
        this.f21259 = false;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, IF, INVOKE, IF, IF, INVOKE, IF] complete} */
    @Override // Yue.C8418.InterfaceC1524
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo21903(int i, @InterfaceC6399 String str) {
        AbstractC7035 abstractC7035;
        C8418 c8418;
        C8422 c8422;
        C5499.m17103(str, "reason");
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.f21253 != -1) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f21253 = i;
                this.f21254 = str;
                abstractC7035 = null;
                if (this.f21252 && this.f21250.isEmpty()) {
                    AbstractC7035 abstractC70352 = this.f21248;
                    this.f21248 = null;
                    c8418 = this.f21244;
                    this.f21244 = null;
                    c8422 = this.f21245;
                    this.f21245 = null;
                    this.f21246.m24596();
                    abstractC7035 = abstractC70352;
                } else {
                    c8418 = null;
                    c8422 = null;
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f2640.m4394(this, i, str);
            if (abstractC7035 != null) {
                this.f2640.m4393(this, i, str);
            }
        } finally {
            if (abstractC7035 != null) {
                C8158.m26844(abstractC7035);
            }
            if (c8418 != null) {
                C8158.m26844(c8418);
            }
            if (c8422 != null) {
                C8158.m26844(c8422);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m21904(long j, @InterfaceC6399 TimeUnit timeUnit) throws InterruptedException {
        C5499.m17103(timeUnit, "timeUnit");
        this.f21246.m24589().await(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m21905(@InterfaceC6399 C7141 c7141, @InterfaceC6489 C4742 c4742) throws IOException {
        C5499.m17103(c7141, "response");
        if (c7141.m22315() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c7141.m22315() + ' ' + c7141.m22324() + '\'');
        }
        String strM22298 = C7141.m22298(c7141, C4515.f9612, null, 2, null);
        if (!C7627.m23974(C4515.f9611, strM22298, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strM22298 + '\'');
        }
        String strM222982 = C7141.m22298(c7141, C4515.f9611, null, 2, null);
        if (!C7627.m23974("websocket", strM222982, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strM222982 + '\'');
        }
        String strM222983 = C7141.m22298(c7141, C4515.f9610, null, 2, null);
        String strMo9816 = C3630.f6370.m9876(this.f21241 + C8417.f3481).m9849().mo9816();
        if (C5499.m17094(strMo9816, strM222983)) {
            if (c4742 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo9816 + "' but was '" + strM222983 + '\'');
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final synchronized boolean m21906(int i, @InterfaceC6489 String str, long j) {
        C3630 c3630M9876;
        try {
            C8417.f3480.m28119(i);
            if (str != null) {
                c3630M9876 = C3630.f6370.m9876(str);
                if (c3630M9876.m9852() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c3630M9876 = null;
            }
            if (!this.f21255 && !this.f21252) {
                this.f21252 = true;
                this.f21250.add(new C1146(i, c3630M9876, j));
                m21917();
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m21907(@InterfaceC6399 C6504 c6504) {
        C5499.m17103(c6504, "client");
        if (this.f2639.m22152("Sec-WebSocket-Extensions") != null) {
            m21908(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        C6504 c6504M20666 = c6504.m20650().m20678(AbstractC4712.f1070).m20718(f21233).m20666();
        C7101 c7101M3393 = this.f2639.m22157().m22172(C4515.f9611, "websocket").m22172(C4515.f9612, C4515.f9611).m22172(C4515.f9607, this.f21241).m22172("Sec-WebSocket-Version", "13").m22172("Sec-WebSocket-Extensions", C6652.f17086).m3393();
        C7024 c7024 = new C7024(c6504M20666, c7101M3393, true);
        this.f21242 = c7024;
        C5499.m17100(c7024);
        c7024.mo9977(new C7037(c7101M3393));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m21908(@InterfaceC6399 Exception exc, @InterfaceC6489 C7141 c7141) {
        C5499.m17103(exc, "e");
        synchronized (this) {
            if (this.f21255) {
                return;
            }
            this.f21255 = true;
            AbstractC7035 abstractC7035 = this.f21248;
            this.f21248 = null;
            C8418 c8418 = this.f21244;
            this.f21244 = null;
            C8422 c8422 = this.f21245;
            this.f21245 = null;
            this.f21246.m24596();
            C8107 c8107 = C8107.f3222;
            try {
                this.f2640.m28114(this, exc, c7141);
            } finally {
                if (abstractC7035 != null) {
                    C8158.m26844(abstractC7035);
                }
                if (c8418 != null) {
                    C8158.m26844(c8418);
                }
                if (c8422 != null) {
                    C8158.m26844(c8422);
                }
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final AbstractC8416 m21909() {
        return this.f2640;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m21910(@InterfaceC6399 String str, @InterfaceC6399 AbstractC7035 abstractC7035) throws IOException {
        C5499.m17103(str, "name");
        C5499.m17103(abstractC7035, "streams");
        C8412 c8412 = this.f21239;
        C5499.m17100(c8412);
        synchronized (this) {
            try {
                this.f21247 = str;
                this.f21248 = abstractC7035;
                this.f21245 = new C8422(abstractC7035.m3333(), abstractC7035.m21924(), this.f21237, c8412.f3478, c8412.m28086(abstractC7035.m3333()), this.f21240);
                this.f21243 = new C7036();
                long j = this.f21238;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.f21246.m24590(new C7038(str + " ping", this, nanos), nanos);
                }
                if (!this.f21250.isEmpty()) {
                    m21917();
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21244 = new C8418(abstractC7035.m3333(), abstractC7035.m21925(), this, c8412.f3478, c8412.m28086(!abstractC7035.m3333()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m21911(C8412 c8412) {
        if (!c8412.f25130 && c8412.f3479 == null) {
            return c8412.f25128 == null || new C5458(8, 15).m16971(c8412.f25128.intValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m21912() throws IOException {
        while (this.f21253 == -1) {
            C8418 c8418 = this.f21244;
            C5499.m17100(c8418);
            c8418.m28120();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final synchronized boolean m21913(@InterfaceC6399 C3630 c3630) {
        try {
            C5499.m17103(c3630, "payload");
            if (!this.f21255 && (!this.f21252 || !this.f21250.isEmpty())) {
                this.f21249.add(c3630);
                m21917();
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m21914() throws IOException {
        try {
            C8418 c8418 = this.f21244;
            C5499.m17100(c8418);
            c8418.m28120();
            return this.f21253 == -1;
        } catch (Exception e) {
            m21908(e, null);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final synchronized int m21915() {
        return this.f21257;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final synchronized int m21916() {
        return this.f21258;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m21917() {
        if (!C8158.f24182 || Thread.holdsLock(this)) {
            AbstractC7724 abstractC7724 = this.f21243;
            if (abstractC7724 != null) {
                C7731.m24579(this.f21246, abstractC7724, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final synchronized boolean m21918(C3630 c3630, int i) {
        if (!this.f21255 && !this.f21252) {
            if (this.f21251 + ((long) c3630.m9852()) > f21234) {
                mo21896(1001, null);
                return false;
            }
            this.f21251 += (long) c3630.m9852();
            this.f21250.add(new C7034(i, c3630));
            m21917();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final synchronized int m21919() {
        return this.f21256;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m21920() throws InterruptedException {
        this.f21246.m24596();
        this.f21246.m24589().await(10L, TimeUnit.SECONDS);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE, IF, INVOKE, IF, IF, INVOKE, IF, IF] complete} */
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final boolean m21921() throws IOException {
        String str;
        C8418 c8418;
        C8422 c8422;
        int i;
        AbstractC7035 abstractC7035;
        synchronized (this) {
            try {
                if (this.f21255) {
                    return false;
                }
                C8422 c84222 = this.f21245;
                C3630 c3630Poll = this.f21249.poll();
                Object obj = null;
                if (c3630Poll == null) {
                    Object objPoll = this.f21250.poll();
                    if (objPoll instanceof C1146) {
                        i = this.f21253;
                        str = this.f21254;
                        if (i != -1) {
                            abstractC7035 = this.f21248;
                            this.f21248 = null;
                            c8418 = this.f21244;
                            this.f21244 = null;
                            c8422 = this.f21245;
                            this.f21245 = null;
                            this.f21246.m24596();
                        } else {
                            long jM3329 = ((C1146) objPoll).m3329();
                            this.f21246.m24590(new C7039(this.f21247 + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(jM3329));
                            abstractC7035 = null;
                            c8418 = null;
                            c8422 = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        c8418 = null;
                        c8422 = null;
                        i = -1;
                        abstractC7035 = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    c8418 = null;
                    c8422 = null;
                    i = -1;
                    abstractC7035 = null;
                }
                C8107 c8107 = C8107.f3222;
                try {
                    if (c3630Poll != null) {
                        C5499.m17100(c84222);
                        c84222.m28180(c3630Poll);
                    } else if (obj instanceof C7034) {
                        C7034 c7034 = (C7034) obj;
                        C5499.m17100(c84222);
                        c84222.m28178(c7034.m3332(), c7034.m3331());
                        synchronized (this) {
                            this.f21251 -= (long) c7034.m3331().m9852();
                        }
                    } else {
                        if (!(obj instanceof C1146)) {
                            throw new AssertionError();
                        }
                        C1146 c1146 = (C1146) obj;
                        C5499.m17100(c84222);
                        c84222.m28176(c1146.m3330(), c1146.m21923());
                        if (abstractC7035 != null) {
                            AbstractC8416 abstractC8416 = this.f2640;
                            C5499.m17100(str);
                            abstractC8416.m4393(this, i, str);
                        }
                    }
                    return true;
                } finally {
                    if (abstractC7035 != null) {
                        C8158.m26844(abstractC7035);
                    }
                    if (c8418 != null) {
                        C8158.m26844(c8418);
                    }
                    if (c8422 != null) {
                        C8158.m26844(c8422);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m21922() {
        synchronized (this) {
            try {
                if (this.f21255) {
                    return;
                }
                C8422 c8422 = this.f21245;
                if (c8422 == null) {
                    return;
                }
                int i = this.f21259 ? this.f21256 : -1;
                this.f21256++;
                this.f21259 = true;
                C8107 c8107 = C8107.f3222;
                if (i == -1) {
                    try {
                        c8422.m28179(C3630.f6372);
                        return;
                    } catch (IOException e) {
                        m21908(e, null);
                        return;
                    }
                }
                m21908(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f21238 + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
