package Yue;

import Yue.C5369;
import Yue.C7060;
import Yue.C7731;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class C5355 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0720 f13036 = new C0720(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f13037 = 16777216;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7403 f13038;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f13039 = 1;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f13040 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f13041 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final int f13042 = 1000000000;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f13043;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC5356 f13044;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<Integer, C5371> f13045;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f13046;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f13047;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f13048;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f13049;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7733 f13050;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7731 f13051;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7731 f13052;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7731 f13053;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC6842 f13054;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public long f13055;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public long f13056;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public long f13057;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public long f13058;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public long f13059;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public long f13060;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public long f13061;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7403 f13062;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @InterfaceC6399
    public C7403 f13063;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public long f13064;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public long f13065;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public long f13066;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public long f13067;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final Socket f13068;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5374 f13069;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5357 f13070;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Set<Integer> f13071;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ */
    public static final class C0719 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f1451;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final C7733 f1452;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Socket f13072;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public String f13073;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public InterfaceC3604 f13074;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public InterfaceC3603 f13075;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public AbstractC5356 f13076;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6399
        public InterfaceC6842 f13077;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f13078;

        public C0719(boolean z, @InterfaceC6399 C7733 c7733) {
            C5499.m17103(c7733, "taskRunner");
            this.f1451 = z;
            this.f1452 = c7733;
            this.f13076 = AbstractC5356.f1454;
            this.f13077 = InterfaceC6842.f2344;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ C0719 m16557(C0719 c0719, Socket socket, String str, InterfaceC3604 interfaceC3604, InterfaceC3603 interfaceC3603, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = C8158.m26874(socket);
            }
            if ((i & 4) != 0) {
                interfaceC3604 = C6542.m20831(C6542.m20848(socket));
            }
            if ((i & 8) != 0) {
                interfaceC3603 = C6542.m20830(C6542.m20843(socket));
            }
            return c0719.m16580(socket, str, interfaceC3604, interfaceC3603);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5355 m2118() {
            return new C5355(this);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m2119() {
            return this.f1451;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String m16558() {
            String str = this.f13073;
            if (str != null) {
                return str;
            }
            C5499.m17132("connectionName");
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final AbstractC5356 m16559() {
            return this.f13076;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int m16560() {
            return this.f13078;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final InterfaceC6842 m16561() {
            return this.f13077;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final InterfaceC3603 m16562() {
            InterfaceC3603 interfaceC3603 = this.f13075;
            if (interfaceC3603 != null) {
                return interfaceC3603;
            }
            C5499.m17132("sink");
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Socket m16563() {
            Socket socket = this.f13072;
            if (socket != null) {
                return socket;
            }
            C5499.m17132("socket");
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final InterfaceC3604 m16564() {
            InterfaceC3604 interfaceC3604 = this.f13074;
            if (interfaceC3604 != null) {
                return interfaceC3604;
            }
            C5499.m17132("source");
            return null;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C7733 m16565() {
            return this.f1452;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final C0719 m16566(@InterfaceC6399 AbstractC5356 abstractC5356) {
            C5499.m17103(abstractC5356, "listener");
            this.f13076 = abstractC5356;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C0719 m16567(int i) {
            this.f13078 = i;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C0719 m16568(@InterfaceC6399 InterfaceC6842 interfaceC6842) {
            C5499.m17103(interfaceC6842, "pushObserver");
            this.f13077 = interfaceC6842;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m16569(boolean z) {
            this.f1451 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16570(@InterfaceC6399 String str) {
            C5499.m17103(str, "<set-?>");
            this.f13073 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m16571(@InterfaceC6399 AbstractC5356 abstractC5356) {
            C5499.m17103(abstractC5356, "<set-?>");
            this.f13076 = abstractC5356;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m16572(int i) {
            this.f13078 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m16573(@InterfaceC6399 InterfaceC6842 interfaceC6842) {
            C5499.m17103(interfaceC6842, "<set-?>");
            this.f13077 = interfaceC6842;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m16574(@InterfaceC6399 InterfaceC3603 interfaceC3603) {
            C5499.m17103(interfaceC3603, "<set-?>");
            this.f13075 = interfaceC3603;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final void m16575(@InterfaceC6399 Socket socket) {
            C5499.m17103(socket, "<set-?>");
            this.f13072 = socket;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final void m16576(@InterfaceC6399 InterfaceC3604 interfaceC3604) {
            C5499.m17103(interfaceC3604, "<set-?>");
            this.f13074 = interfaceC3604;
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final C0719 m16577(@InterfaceC6399 Socket socket) throws IOException {
            C5499.m17103(socket, "socket");
            return m16557(this, socket, null, null, null, 14, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final C0719 m16578(@InterfaceC6399 Socket socket, @InterfaceC6399 String str) throws IOException {
            C5499.m17103(socket, "socket");
            C5499.m17103(str, "peerName");
            return m16557(this, socket, str, null, null, 12, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final C0719 m16579(@InterfaceC6399 Socket socket, @InterfaceC6399 String str, @InterfaceC6399 InterfaceC3604 interfaceC3604) throws IOException {
            C5499.m17103(socket, "socket");
            C5499.m17103(str, "peerName");
            C5499.m17103(interfaceC3604, "source");
            return m16557(this, socket, str, interfaceC3604, null, 8, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final C0719 m16580(@InterfaceC6399 Socket socket, @InterfaceC6399 String str, @InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 InterfaceC3603 interfaceC3603) throws IOException {
            String str2;
            C5499.m17103(socket, "socket");
            C5499.m17103(str, "peerName");
            C5499.m17103(interfaceC3604, "source");
            C5499.m17103(interfaceC3603, "sink");
            m16575(socket);
            if (this.f1451) {
                str2 = C8158.f24183 + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m16570(str2);
            m16576(interfaceC3604);
            m16574(interfaceC3603);
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟ */
    public static final class C0720 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۧۦ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0720(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C7403 m2120() {
            return C5355.f13038;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0720() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC5356 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0722 f1453 = new C0722(null);

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public static final AbstractC5356 f1454 = new C0721();

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟$ۥ */
        public static final class C0721 extends AbstractC5356 {
            @Override // Yue.C5355.AbstractC5356
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public void mo16582(@InterfaceC6399 C5371 c5371) throws IOException {
                C5499.m17103(c5371, "stream");
                c5371.m16623(EnumC4660.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟ */
        public static final class C0722 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۧۦ.ۥ۟۟.ۥ۟.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0722(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0722() {
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo16581(@InterfaceC6399 C5355 c5355, @InterfaceC6399 C7403 c7403) {
            C5499.m17103(c5355, C5368.f13116);
            C5499.m17103(c7403, "settings");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public abstract void mo16582(@InterfaceC6399 C5371 c5371) throws IOException;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class C5357 implements C5369.InterfaceC5370, InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5369 f13079;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13080;

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ */
        @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n759#2,2:219\n*E\n"})
        public static final class C0723 extends AbstractC7724 {

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ C5355 f13081;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066 f13082;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0723(String str, boolean z, C5355 c5355, C7060.C7066 c7066) {
                super(str, z);
                this.f13081 = c5355;
                this.f13082 = c7066;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Yue.AbstractC7724
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public long mo12822() {
                this.f13081.m16515().mo16581(this.f13081, (C7403) this.f13082.f21353);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟ */
        @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"})
        public static final class C0724 extends AbstractC7724 {

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ C5355 f13083;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C5371 f13084;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0724(String str, boolean z, C5355 c5355, C5371 c5371) {
                super(str, z);
                this.f13083 = c5355;
                this.f13084 = c5371;
            }

            @Override // Yue.AbstractC7724
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public long mo12822() {
                try {
                    this.f13083.m16515().mo16582(this.f13084);
                    return -1L;
                } catch (IOException e) {
                    C6668.f2226.m21321().m21315("Http2Connection.Listener failure for " + this.f13083.m16513(), 4, e);
                    try {
                        this.f13084.m16623(EnumC4660.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n807#2,2:219\n*E\n"})
        public static final class C5358 extends AbstractC7724 {

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ C5355 f13085;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ int f13086;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public final /* synthetic */ int f13087;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5358(String str, boolean z, C5355 c5355, int i, int i2) {
                super(str, z);
                this.f13085 = c5355;
                this.f13086 = i;
                this.f13087 = i2;
            }

            @Override // Yue.AbstractC7724
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public long mo12822() {
                this.f13085.m16552(true, this.f13086, this.f13087);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n716#2,2:219\n*E\n"})
        public static final class C5359 extends AbstractC7724 {

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ C5357 f13088;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ boolean f13089;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public final /* synthetic */ C7403 f13090;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5359(String str, boolean z, C5357 c5357, boolean z2, C7403 c7403) {
                super(str, z);
                this.f13088 = c5357;
                this.f13089 = z2;
                this.f13090 = c7403;
            }

            @Override // Yue.AbstractC7724
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public long mo12822() {
                this.f13088.m16594(this.f13089, this.f13090);
                return -1L;
            }
        }

        public C5357(@InterfaceC6399 C5355 c5355, C5369 c5369) {
            C5499.m17103(c5369, "reader");
            this.f13080 = c5355;
            this.f13079 = c5369;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() throws Throwable {
            m16596();
            return C8107.f3222;
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo16583() {
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo16584(int i, @InterfaceC6399 EnumC4660 enumC4660) {
            C5499.m17103(enumC4660, "errorCode");
            if (this.f13080.m16537(i)) {
                this.f13080.m16535(i, enumC4660);
                return;
            }
            C5371 c5371M16538 = this.f13080.m16538(i);
            if (c5371M16538 != null) {
                c5371M16538.m16646(enumC4660);
            }
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo16585(boolean z, int i, int i2, @InterfaceC6399 List<C5255> list) {
            C5499.m17103(list, "headerBlock");
            if (this.f13080.m16537(i)) {
                this.f13080.m16533(i, list, z);
                return;
            }
            C5355 c5355 = this.f13080;
            synchronized (c5355) {
                C5371 c5371M16523 = c5355.m16523(i);
                if (c5371M16523 != null) {
                    C8107 c8107 = C8107.f3222;
                    c5371M16523.m16645(C8158.m26884(list), z);
                    return;
                }
                if (c5355.f13049) {
                    return;
                }
                if (i <= c5355.m16514()) {
                    return;
                }
                if (i % 2 == c5355.m16516() % 2) {
                    return;
                }
                C5371 c5371 = new C5371(i, c5355, false, z, C8158.m26884(list));
                c5355.m16540(i);
                c5355.m16524().put(Integer.valueOf(i), c5371);
                c5355.f13050.m24605().m24590(new C0724(c5355.m16513() + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] onStream", true, c5355, c5371), 0L);
            }
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo16586(int i, long j) {
            if (i == 0) {
                C5355 c5355 = this.f13080;
                synchronized (c5355) {
                    c5355.f13067 = c5355.m16525() + j;
                    C5499.m17101(c5355, "null cannot be cast to non-null type java.lang.Object");
                    c5355.notifyAll();
                    C8107 c8107 = C8107.f3222;
                }
                return;
            }
            C5371 c5371M16523 = this.f13080.m16523(i);
            if (c5371M16523 != null) {
                synchronized (c5371M16523) {
                    c5371M16523.m2127(j);
                    C8107 c81072 = C8107.f3222;
                }
            }
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo16587(boolean z, @InterfaceC6399 C7403 c7403) {
            C5499.m17103(c7403, "settings");
            this.f13080.f13051.m24590(new C5359(this.f13080.m16513() + " applyAndAckSettings", true, this, z, c7403), 0L);
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo16588(boolean z, int i, int i2) {
            if (!z) {
                this.f13080.f13051.m24590(new C5358(this.f13080.m16513() + " ping", true, this.f13080, i, i2), 0L);
                return;
            }
            C5355 c5355 = this.f13080;
            synchronized (c5355) {
                try {
                    if (i == 1) {
                        c5355.f13056++;
                    } else if (i != 2) {
                        if (i == 3) {
                            c5355.f13060++;
                            C5499.m17101(c5355, "null cannot be cast to non-null type java.lang.Object");
                            c5355.notifyAll();
                        }
                        C8107 c8107 = C8107.f3222;
                    } else {
                        c5355.f13058++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo16589(int i, int i2, int i3, boolean z) {
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void mo16590(boolean z, int i, @InterfaceC6399 InterfaceC3604 interfaceC3604, int i2) throws IOException {
            C5499.m17103(interfaceC3604, "source");
            if (this.f13080.m16537(i)) {
                this.f13080.m16532(i, interfaceC3604, i2, z);
                return;
            }
            C5371 c5371M16523 = this.f13080.m16523(i);
            if (c5371M16523 == null) {
                this.f13080.m16555(i, EnumC4660.PROTOCOL_ERROR);
                long j = i2;
                this.f13080.m16548(j);
                interfaceC3604.skip(j);
                return;
            }
            c5371M16523.m16644(interfaceC3604, i2);
            if (z) {
                c5371M16523.m16645(C8158.f3266, true);
            }
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void mo16591(int i, @InterfaceC6399 String str, @InterfaceC6399 C3630 c3630, @InterfaceC6399 String str2, int i2, long j) {
            C5499.m17103(str, "origin");
            C5499.m17103(c3630, "protocol");
            C5499.m17103(str2, C5368.f13117);
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void mo16592(int i, int i2, @InterfaceC6399 List<C5255> list) {
            C5499.m17103(list, "requestHeaders");
            this.f13080.m16534(i2, list);
        }

        @Override // Yue.C5369.InterfaceC5370
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void mo16593(int i, @InterfaceC6399 EnumC4660 enumC4660, @InterfaceC6399 C3630 c3630) {
            int i2;
            Object[] array;
            C5499.m17103(enumC4660, "errorCode");
            C5499.m17103(c3630, "debugData");
            c3630.m9852();
            C5355 c5355 = this.f13080;
            synchronized (c5355) {
                array = c5355.m16524().values().toArray(new C5371[0]);
                c5355.f13049 = true;
                C8107 c8107 = C8107.f3222;
            }
            for (C5371 c5371 : (C5371[]) array) {
                if (c5371.m16630() > i && c5371.m16641()) {
                    c5371.m16646(EnumC4660.REFUSED_STREAM);
                    this.f13080.m16538(c5371.m16630());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, Yue.ۥۡۨۥۦ] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final void m16594(boolean z, @InterfaceC6399 C7403 c7403) {
            ?? r13;
            long jM23176;
            int i;
            C5371[] c5371Arr;
            C5499.m17103(c7403, "settings");
            C7060.C7066 c7066 = new C7060.C7066();
            C5374 c5374M16527 = this.f13080.m16527();
            C5355 c5355 = this.f13080;
            synchronized (c5374M16527) {
                synchronized (c5355) {
                    try {
                        C7403 c7403M16518 = c5355.m16518();
                        if (z) {
                            r13 = c7403;
                        } else {
                            C7403 c74032 = new C7403();
                            c74032.m23181(c7403M16518);
                            c74032.m23181(c7403);
                            r13 = c74032;
                        }
                        c7066.f21353 = r13;
                        jM23176 = ((long) r13.m23176()) - ((long) c7403M16518.m23176());
                        c5371Arr = (jM23176 == 0 || c5355.m16524().isEmpty()) ? null : (C5371[]) c5355.m16524().values().toArray(new C5371[0]);
                        c5355.m16542((C7403) c7066.f21353);
                        c5355.f13053.m24590(new C0723(c5355.m16513() + " onSettings", true, c5355, c7066), 0L);
                        C8107 c8107 = C8107.f3222;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c5355.m16527().m2131((C7403) c7066.f21353);
                } catch (IOException e) {
                    c5355.m16511(e);
                }
                C8107 c81072 = C8107.f3222;
            }
            if (c5371Arr != null) {
                for (C5371 c5371 : c5371Arr) {
                    synchronized (c5371) {
                        c5371.m2127(jM23176);
                        C8107 c81073 = C8107.f3222;
                    }
                }
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final C5369 m16595() {
            return this.f13079;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0020 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0003 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Yue.ۥ۠ۡ۠ۢ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [Yue.ۥ۠ۡ۠ۢ] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [Yue.ۥ۠ۤۧۨ, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m16596() throws Throwable {
            EnumC4660 enumC4660;
            EnumC4660 enumC46602 = EnumC4660.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f13079.m16600(this);
                    while (this.f13079.m16599(false, this)) {
                    }
                    EnumC4660 enumC46603 = EnumC4660.NO_ERROR;
                    try {
                        this.f13080.m16510(enumC46603, EnumC4660.CANCEL, null);
                        enumC4660 = enumC46603;
                    } catch (IOException e2) {
                        e = e2;
                        EnumC4660 enumC46604 = EnumC4660.PROTOCOL_ERROR;
                        C5355 c5355 = this.f13080;
                        c5355.m16510(enumC46604, enumC46604, e);
                        enumC4660 = c5355;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f13080.m16510(enumC4660, enumC46602, e);
                    C8158.m26844(this.f13079);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                enumC4660 = enumC46602;
                this.f13080.m16510(enumC4660, enumC46602, e);
                C8158.m26844(this.f13079);
                throw th;
            }
            enumC46602 = this.f13079;
            C8158.m26844(enumC46602);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n939#2:219\n940#2,8:222\n948#2:233\n402#3,2:220\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n939#1:220,2\n939#1:230,3\n*E\n"})
    public static final class C5360 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13091;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13092;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ C3600 f13093;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ int f13094;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f13095;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5360(String str, boolean z, C5355 c5355, int i, C3600 c3600, int i2, boolean z2) {
            super(str, z);
            this.f13091 = c5355;
            this.f13092 = i;
            this.f13093 = c3600;
            this.f13094 = i2;
            this.f13095 = z2;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            try {
                boolean zMo3289 = this.f13091.f13054.mo3289(this.f13092, this.f13093, this.f13094, this.f13095);
                if (zMo3289) {
                    this.f13091.m16527().m16684(this.f13092, EnumC4660.CANCEL);
                }
                if (!zMo3289 && !this.f13095) {
                    return -1L;
                }
                synchronized (this.f13091) {
                    this.f13091.f13071.remove(Integer.valueOf(this.f13092));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n912#2,2:219\n914#2,7:223\n921#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n913#1:221,2\n913#1:230,3\n*E\n"})
    public static final class C5361 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13096;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13097;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ List f13098;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ boolean f13099;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5361(String str, boolean z, C5355 c5355, int i, List list, boolean z2) {
            super(str, z);
            this.f13096 = c5355;
            this.f13097 = i;
            this.f13098 = list;
            this.f13099 = z2;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            boolean zMo21585 = this.f13096.f13054.mo21585(this.f13097, this.f13098, this.f13099);
            if (zMo21585) {
                try {
                    this.f13096.m16527().m16684(this.f13097, EnumC4660.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zMo21585 && !this.f13099) {
                return -1L;
            }
            synchronized (this.f13096) {
                this.f13096.f13071.remove(Integer.valueOf(this.f13097));
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"})
    public static final class C5362 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13100;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13101;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ List f13102;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5362(String str, boolean z, C5355 c5355, int i, List list) {
            super(str, z);
            this.f13100 = c5355;
            this.f13101 = i;
            this.f13102 = list;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            if (!this.f13100.f13054.mo3288(this.f13101, this.f13102)) {
                return -1L;
            }
            try {
                this.f13100.m16527().m16684(this.f13101, EnumC4660.CANCEL);
                synchronized (this.f13100) {
                    this.f13100.f13071.remove(Integer.valueOf(this.f13101));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n953#2,5:219\n*E\n"})
    public static final class C5363 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13103;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13104;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ EnumC4660 f13105;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5363(String str, boolean z, C5355 c5355, int i, EnumC4660 enumC4660) {
            super(str, z);
            this.f13103 = c5355;
            this.f13104 = i;
            this.f13105 = enumC4660;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f13103.f13054.mo21586(this.f13104, this.f13105);
            synchronized (this.f13103) {
                this.f13103.f13071.remove(Integer.valueOf(this.f13104));
                C8107 c8107 = C8107.f3222;
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n555#2,2:219\n*E\n"})
    public static final class C5364 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13106;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5364(String str, boolean z, C5355 c5355) {
            super(str, z);
            this.f13106 = c5355;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            this.f13106.m16552(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"})
    public static final class C5365 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13107;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ long f13108;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5365(String str, C5355 c5355, long j) {
            super(str, false, 2, null);
            this.f13107 = c5355;
            this.f13108 = j;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            boolean z;
            synchronized (this.f13107) {
                if (this.f13107.f13056 < this.f13107.f13055) {
                    z = true;
                } else {
                    this.f13107.f13055++;
                    z = false;
                }
            }
            if (z) {
                this.f13107.m16511(null);
                return -1L;
            }
            this.f13107.m16552(false, 1, 0);
            return this.f13108;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n341#2,6:219\n*E\n"})
    public static final class C5366 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13109;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13110;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ EnumC4660 f13111;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5366(String str, boolean z, C5355 c5355, int i, EnumC4660 enumC4660) {
            super(str, z);
            this.f13109 = c5355;
            this.f13110 = i;
            this.f13111 = enumC4660;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            try {
                this.f13109.m16554(this.f13110, this.f13111);
                return -1L;
            } catch (IOException e) {
                this.f13109.m16511(e);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"})
    public static final class C5367 extends AbstractC7724 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5355 f13112;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f13113;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ long f13114;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5367(String str, boolean z, C5355 c5355, int i, long j) {
            super(str, z);
            this.f13112 = c5355;
            this.f13113 = i;
            this.f13114 = j;
        }

        @Override // Yue.AbstractC7724
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo12822() {
            try {
                this.f13112.m16527().m16686(this.f13113, this.f13114);
                return -1L;
            } catch (IOException e) {
                this.f13112.m16511(e);
                return -1L;
            }
        }
    }

    static {
        C7403 c7403 = new C7403();
        c7403.m23182(7, 65535);
        c7403.m23182(5, 16384);
        f13038 = c7403;
    }

    public C5355(@InterfaceC6399 C0719 c0719) {
        C5499.m17103(c0719, "builder");
        boolean zM2119 = c0719.m2119();
        this.f13043 = zM2119;
        this.f13044 = c0719.m16559();
        this.f13045 = new LinkedHashMap();
        String strM16558 = c0719.m16558();
        this.f13046 = strM16558;
        this.f13048 = c0719.m2119() ? 3 : 2;
        C7733 c7733M16565 = c0719.m16565();
        this.f13050 = c7733M16565;
        C7731 c7731M24605 = c7733M16565.m24605();
        this.f13051 = c7731M24605;
        this.f13052 = c7733M16565.m24605();
        this.f13053 = c7733M16565.m24605();
        this.f13054 = c0719.m16561();
        C7403 c7403 = new C7403();
        if (c0719.m2119()) {
            c7403.m23182(7, 16777216);
        }
        this.f13062 = c7403;
        this.f13063 = f13038;
        this.f13067 = r2.m23176();
        this.f13068 = c0719.m16563();
        this.f13069 = new C5374(c0719.m16562(), zM2119);
        this.f13070 = new C5357(this, new C5369(c0719.m16564(), zM2119));
        this.f13071 = new LinkedHashSet();
        if (c0719.m16560() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(c0719.m16560());
            c7731M24605.m24590(new C5365(strM16558 + " ping", this, nanos), nanos);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m16508(C5355 c5355, boolean z, C7733 c7733, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            c7733 = C7733.f23262;
        }
        c5355.m16547(z, c7733);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m16510(EnumC4660.NO_ERROR, EnumC4660.CANCEL, null);
    }

    public final void flush() throws IOException {
        this.f13069.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final synchronized void m16509() throws InterruptedException {
        while (this.f13060 < this.f13059) {
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m16510(@InterfaceC6399 EnumC4660 enumC4660, @InterfaceC6399 EnumC4660 enumC46602, @InterfaceC6489 IOException iOException) {
        int i;
        Object[] array;
        C5499.m17103(enumC4660, "connectionCode");
        C5499.m17103(enumC46602, "streamCode");
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m16544(enumC4660);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f13045.isEmpty()) {
                    array = this.f13045.values().toArray(new C5371[0]);
                    this.f13045.clear();
                } else {
                    array = null;
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        C5371[] c5371Arr = (C5371[]) array;
        if (c5371Arr != null) {
            for (C5371 c5371 : c5371Arr) {
                try {
                    c5371.m16623(enumC46602, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f13069.close();
        } catch (IOException unused3) {
        }
        try {
            this.f13068.close();
        } catch (IOException unused4) {
        }
        this.f13051.m24596();
        this.f13052.m24596();
        this.f13053.m24596();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m16511(IOException iOException) {
        EnumC4660 enumC4660 = EnumC4660.PROTOCOL_ERROR;
        m16510(enumC4660, enumC4660, iOException);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m16512() {
        return this.f13043;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final String m16513() {
        return this.f13046;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final int m16514() {
        return this.f13047;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final AbstractC5356 m16515() {
        return this.f13044;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final int m16516() {
        return this.f13048;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final C7403 m16517() {
        return this.f13062;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final C7403 m16518() {
        return this.f13063;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final long m16519() {
        return this.f13065;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final long m16520() {
        return this.f13064;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final C5357 m16521() {
        return this.f13070;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final Socket m16522() {
        return this.f13068;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final synchronized C5371 m16523(int i) {
        return this.f13045.get(Integer.valueOf(i));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Map<Integer, C5371> m16524() {
        return this.f13045;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final long m16525() {
        return this.f13067;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final long m16526() {
        return this.f13066;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final C5374 m16527() {
        return this.f13069;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final synchronized boolean m16528(long j) {
        if (this.f13049) {
            return false;
        }
        if (this.f13058 < this.f13057) {
            if (j >= this.f13061) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final C5371 m16529(int i, List<C5255> list, boolean z) throws IOException {
        int i2;
        C5371 c5371;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f13069) {
            try {
                synchronized (this) {
                    try {
                        if (this.f13048 > 1073741823) {
                            m16544(EnumC4660.REFUSED_STREAM);
                        }
                        if (this.f13049) {
                            throw new C4109();
                        }
                        i2 = this.f13048;
                        this.f13048 = i2 + 2;
                        c5371 = new C5371(i2, this, z3, false, null);
                        z2 = !z || this.f13066 >= this.f13067 || c5371.m16639() >= c5371.m16638();
                        if (c5371.m16642()) {
                            this.f13045.put(Integer.valueOf(i2), c5371);
                        }
                        C8107 c8107 = C8107.f3222;
                    } finally {
                    }
                }
                if (i == 0) {
                    this.f13069.m16680(z3, i2, list);
                } else {
                    if (!(true ^ this.f13043)) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    this.f13069.m16683(i, i2, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.f13069.flush();
        }
        return c5371;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public final C5371 m16530(@InterfaceC6399 List<C5255> list, boolean z) throws IOException {
        C5499.m17103(list, "requestHeaders");
        return m16529(0, list, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public final synchronized int m16531() {
        return this.f13045.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public final void m16532(int i, @InterfaceC6399 InterfaceC3604 interfaceC3604, int i2, boolean z) throws IOException {
        C5499.m17103(interfaceC3604, "source");
        C3600 c3600 = new C3600();
        long j = i2;
        interfaceC3604.mo9670(j);
        interfaceC3604.mo9103(c3600, j);
        this.f13052.m24590(new C5360(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] onData", true, this, i, c3600, i2, z), 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final void m16533(int i, @InterfaceC6399 List<C5255> list, boolean z) {
        C5499.m17103(list, "requestHeaders");
        this.f13052.m24590(new C5361(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] onHeaders", true, this, i, list, z), 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final void m16534(int i, @InterfaceC6399 List<C5255> list) {
        C5499.m17103(list, "requestHeaders");
        synchronized (this) {
            if (this.f13071.contains(Integer.valueOf(i))) {
                m16555(i, EnumC4660.PROTOCOL_ERROR);
                return;
            }
            this.f13071.add(Integer.valueOf(i));
            this.f13052.m24590(new C5362(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] onRequest", true, this, i, list), 0L);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public final void m16535(int i, @InterfaceC6399 EnumC4660 enumC4660) {
        C5499.m17103(enumC4660, "errorCode");
        this.f13052.m24590(new C5363(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] onReset", true, this, i, enumC4660), 0L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public final C5371 m16536(int i, @InterfaceC6399 List<C5255> list, boolean z) throws IOException {
        C5499.m17103(list, "requestHeaders");
        if (!this.f13043) {
            return m16529(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public final boolean m16537(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final synchronized C5371 m16538(int i) {
        C5371 c5371Remove;
        c5371Remove = this.f13045.remove(Integer.valueOf(i));
        C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c5371Remove;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public final void m16539() {
        synchronized (this) {
            long j = this.f13058;
            long j2 = this.f13057;
            if (j < j2) {
                return;
            }
            this.f13057 = j2 + 1;
            this.f13061 = System.nanoTime() + ((long) f13042);
            C8107 c8107 = C8107.f3222;
            this.f13051.m24590(new C5364(this.f13046 + " ping", true, this), 0L);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public final void m16540(int i) {
        this.f13047 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final void m16541(int i) {
        this.f13048 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public final void m16542(@InterfaceC6399 C7403 c7403) {
        C5499.m17103(c7403, "<set-?>");
        this.f13063 = c7403;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final void m16543(@InterfaceC6399 C7403 c7403) throws IOException {
        C5499.m17103(c7403, "settings");
        synchronized (this.f13069) {
            synchronized (this) {
                if (this.f13049) {
                    throw new C4109();
                }
                this.f13062.m23181(c7403);
                C8107 c8107 = C8107.f3222;
            }
            this.f13069.m16685(c7403);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m16544(@InterfaceC6399 EnumC4660 enumC4660) throws IOException {
        C5499.m17103(enumC4660, "statusCode");
        synchronized (this.f13069) {
            C7060.C7064 c7064 = new C7060.C7064();
            synchronized (this) {
                if (this.f13049) {
                    return;
                }
                this.f13049 = true;
                int i = this.f13047;
                c7064.f21351 = i;
                C8107 c8107 = C8107.f3222;
                this.f13069.m16679(i, enumC4660, C8158.f3265);
            }
        }
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public final void m16545() throws IOException {
        m16508(this, false, null, 3, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public final void m16546(boolean z) throws IOException {
        m16508(this, z, null, 2, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public final void m16547(boolean z, @InterfaceC6399 C7733 c7733) throws IOException {
        C5499.m17103(c7733, "taskRunner");
        if (z) {
            this.f13069.m16674();
            this.f13069.m16685(this.f13062);
            if (this.f13062.m23176() != 65535) {
                this.f13069.m16686(0, r5 - 65535);
            }
        }
        c7733.m24605().m24590(new C7731.C1337(this.f13046, true, this.f13070), 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final synchronized void m16548(long j) {
        long j2 = this.f13064 + j;
        this.f13064 = j2;
        long j3 = j2 - this.f13065;
        if (j3 >= this.f13062.m23176() / 2) {
            m16556(0, j3);
            this.f13065 += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f13069.m16681());
        r6 = r2;
        r8.f13066 += r6;
        r4 = Yue.C8107.f3222;
     */
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m16549(int i, boolean z, @InterfaceC6489 C3600 c3600, long j) throws IOException {
        int iMin;
        long j2;
        if (j == 0) {
            this.f13069.m16675(z, i, c3600, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f13066;
                            long j4 = this.f13067;
                            if (j3 < j4) {
                                break;
                            }
                            if (!this.f13045.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            }
            j -= j2;
            this.f13069.m16675(z && j == 0, i, c3600, iMin);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public final void m16550(int i, boolean z, @InterfaceC6399 List<C5255> list) throws IOException {
        C5499.m17103(list, "alternating");
        this.f13069.m16680(z, i, list);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public final void m16551() throws InterruptedException {
        synchronized (this) {
            this.f13059++;
        }
        m16552(false, 3, 1330343787);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final void m16552(boolean z, int i, int i2) {
        try {
            this.f13069.m16682(z, i, i2);
        } catch (IOException e) {
            m16511(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final void m16553() throws InterruptedException {
        m16551();
        m16509();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public final void m16554(int i, @InterfaceC6399 EnumC4660 enumC4660) throws IOException {
        C5499.m17103(enumC4660, "statusCode");
        this.f13069.m16684(i, enumC4660);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public final void m16555(int i, @InterfaceC6399 EnumC4660 enumC4660) {
        C5499.m17103(enumC4660, "errorCode");
        this.f13051.m24590(new C5366(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] writeSynReset", true, this, i, enumC4660), 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public final void m16556(int i, long j) {
        this.f13051.m24590(new C5367(this.f13046 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] windowUpdate", true, this, i, j), 0L);
    }
}
