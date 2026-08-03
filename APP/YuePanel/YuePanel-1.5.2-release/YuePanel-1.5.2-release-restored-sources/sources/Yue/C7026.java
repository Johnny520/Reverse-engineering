package Yue;

import Yue.C5241;
import Yue.C5355;
import Yue.C7033;
import Yue.C7101;
import Yue.C7141;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class C7026 extends C5355.AbstractC5356 implements InterfaceC4107 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1142 f21191 = new C1142(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f21192 = "throw with null exception";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f21193 = 21;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f21194 = 10000000000L;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7030 f21195;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7184 f21196;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Socket f21197;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public Socket f21198;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C5241 f21199;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public EnumC6835 f21200;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public C5355 f21201;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC3604 f21202;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC3603 f21203;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f21204;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f21205;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f21206;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f21207;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f21208;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f21209;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<Reference<C7024>> f21210;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public long f21211;

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ$ۥ */
    public static final class C1142 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦ۠ۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1142(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C7026 m3323(@InterfaceC6399 C7030 c7030, @InterfaceC6399 C7184 c7184, @InterfaceC6399 Socket socket, long j) {
            C5499.m17103(c7030, "connectionPool");
            C5499.m17103(c7184, "route");
            C5499.m17103(socket, "socket");
            C7026 c7026 = new C7026(c7030, c7184);
            c7026.f21198 = socket;
            c7026.m21872(j);
            return c7026;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1142() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ$ۥ۟ */
    public /* synthetic */ class C1143 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2634;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2634 = iArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7027 extends AbstractC5673 implements InterfaceC5122<List<? extends Certificate>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3686 f21212;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C5241 f21213;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C3175 f21214;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7027(C3686 c3686, C5241 c5241, C3175 c3175) {
            super(0);
            this.f21212 = c3686;
            this.f21213 = c5241;
            this.f21214 = c3175;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.Certificate>' to match base method */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final List<? extends Certificate> invoke() {
            AbstractC3685 abstractC3685M10109 = this.f21212.m10109();
            C5499.m17100(abstractC3685M10109);
            return abstractC3685M10109.mo283(this.f21213.m16066(), this.f21214.m6514().m16772());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
    public static final class C7028 extends AbstractC5673 implements InterfaceC5122<List<? extends X509Certificate>> {
        public C7028() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.X509Certificate>' to match base method */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final List<? extends X509Certificate> invoke() {
            C5241 c5241 = C7026.this.f21199;
            C5499.m17100(c5241);
            List<Certificate> listM16066 = c5241.m16066();
            ArrayList arrayList = new ArrayList(C3881.m10756(listM16066, 10));
            for (Certificate certificate : listM16066) {
                C5499.m17101(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7029 extends C7033.AbstractC7035 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C4742 f21216;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7029(InterfaceC3604 interfaceC3604, InterfaceC3603 interfaceC3603, C4742 c4742) {
            super(true, interfaceC3604, interfaceC3603);
            this.f21216 = c4742;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21216.m1658(-1L, true, true, null);
        }
    }

    public C7026(@InterfaceC6399 C7030 c7030, @InterfaceC6399 C7184 c7184) {
        C5499.m17103(c7030, "connectionPool");
        C5499.m17103(c7184, "route");
        this.f21195 = c7030;
        this.f21196 = c7184;
        this.f21209 = 1;
        this.f21210 = new ArrayList();
        this.f21211 = Long.MAX_VALUE;
    }

    @InterfaceC6399
    public String toString() {
        Object objM16062;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f21196.m22504().m6514().m16772());
        sb.append(':');
        sb.append(this.f21196.m22504().m6514().m16779());
        sb.append(", proxy=");
        sb.append(this.f21196.m22505());
        sb.append(" hostAddress=");
        sb.append(this.f21196.m22507());
        sb.append(" cipherSuite=");
        C5241 c5241 = this.f21199;
        if (c5241 == null || (objM16062 = c5241.m16062()) == null) {
            objM16062 = "none";
        }
        sb.append(objM16062);
        sb.append(" protocol=");
        sb.append(this.f21200);
        sb.append(C6193.f1885);
        return sb.toString();
    }

    @Override // Yue.InterfaceC4107
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public EnumC6835 mo1065() {
        EnumC6835 enumC6835 = this.f21200;
        C5499.m17100(enumC6835);
        return enumC6835;
    }

    @Override // Yue.InterfaceC4107
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C7184 mo1066() {
        return this.f21196;
    }

    @Override // Yue.InterfaceC4107
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public C5241 mo11695() {
        return this.f21199;
    }

    @Override // Yue.InterfaceC4107
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Socket mo11696() {
        Socket socket = this.f21198;
        C5499.m17100(socket);
        return socket;
    }

    @Override // Yue.C5355.AbstractC5356
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public synchronized void mo16581(@InterfaceC6399 C5355 c5355, @InterfaceC6399 C7403 c7403) {
        C5499.m17103(c5355, C5368.f13116);
        C5499.m17103(c7403, "settings");
        this.f21209 = c7403.m23177();
    }

    @Override // Yue.C5355.AbstractC5356
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo16582(@InterfaceC6399 C5371 c5371) throws IOException {
        C5499.m17103(c5371, "stream");
        c5371.m16623(EnumC4660.REFUSED_STREAM, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m21848() {
        Socket socket = this.f21197;
        if (socket != null) {
            C8158.m26846(socket);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m21849(C5385 c5385, C5241 c5241) {
        List<Certificate> listM16066 = c5241.m16066();
        if (!listM16066.isEmpty()) {
            C6502 c6502 = C6502.f2116;
            String strM16772 = c5385.m16772();
            Certificate certificate = listM16066.get(0);
            C5499.m17101(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c6502.m20597(strM16772, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21850(int i, int i2, int i3, int i4, boolean z, @InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 AbstractC4712 abstractC4712) throws Throwable {
        Socket socket;
        Socket socket2;
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(abstractC4712, "eventListener");
        if (this.f21200 != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List<C4110> listM6504 = this.f21196.m22504().m6504();
        C4111 c4111 = new C4111(listM6504);
        if (this.f21196.m22504().m6513() == null) {
            if (!listM6504.contains(C4110.f8206)) {
                throw new C7186(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM16772 = this.f21196.m22504().m6514().m16772();
            if (!C6668.f2226.m21321().mo6563(strM16772)) {
                throw new C7186(new UnknownServiceException("CLEARTEXT communication to " + strM16772 + " not permitted by network security policy"));
            }
        } else if (this.f21196.m22504().m6508().contains(EnumC6835.H2_PRIOR_KNOWLEDGE)) {
            throw new C7186(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C7186 c7186 = null;
        do {
            try {
            } catch (IOException e) {
                e = e;
            }
            try {
                if (this.f21196.m22506()) {
                    m21854(i, i2, i3, interfaceC3645, abstractC4712);
                    if (this.f21197 == null) {
                        if (!this.f21196.m22506() && this.f21197 == null) {
                            throw new C7186(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f21211 = System.nanoTime();
                        return;
                    }
                } else {
                    try {
                        m21852(i, i2, interfaceC3645, abstractC4712);
                    } catch (IOException e2) {
                        e = e2;
                        socket = this.f21198;
                        if (socket != null) {
                            C8158.m26846(socket);
                        }
                        socket2 = this.f21197;
                        if (socket2 != null) {
                            C8158.m26846(socket2);
                        }
                        this.f21198 = null;
                        this.f21197 = null;
                        this.f21202 = null;
                        this.f21203 = null;
                        this.f21199 = null;
                        this.f21200 = null;
                        this.f21201 = null;
                        this.f21209 = 1;
                        abstractC4712.mo14055(interfaceC3645, this.f21196.m22507(), this.f21196.m22505(), null, e);
                        if (c7186 != null) {
                            c7186 = new C7186(e);
                        } else {
                            c7186.m3472(e);
                        }
                        if (z) {
                            throw c7186;
                        }
                    }
                }
                m21857(c4111, i4, interfaceC3645, abstractC4712);
                abstractC4712.mo14054(interfaceC3645, this.f21196.m22507(), this.f21196.m22505(), this.f21200);
                if (!this.f21196.m22506()) {
                }
                this.f21211 = System.nanoTime();
                return;
            } catch (IOException e3) {
                e = e3;
                socket = this.f21198;
                if (socket != null) {
                }
                socket2 = this.f21197;
                if (socket2 != null) {
                }
                this.f21198 = null;
                this.f21197 = null;
                this.f21202 = null;
                this.f21203 = null;
                this.f21199 = null;
                this.f21200 = null;
                this.f21201 = null;
                this.f21209 = 1;
                abstractC4712.mo14055(interfaceC3645, this.f21196.m22507(), this.f21196.m22505(), null, e);
                if (c7186 != null) {
                }
                if (z) {
                }
            }
        } while (c4111.m1074(e));
        throw c7186;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m21851(@InterfaceC6399 C6504 c6504, @InterfaceC6399 C7184 c7184, @InterfaceC6399 IOException iOException) {
        C5499.m17103(c6504, "client");
        C5499.m17103(c7184, "failedRoute");
        C5499.m17103(iOException, "failure");
        if (c7184.m22505().type() != Proxy.Type.DIRECT) {
            C3175 c3175M22504 = c7184.m22504();
            c3175M22504.m6511().connectFailed(c3175M22504.m6514().m16791(), c7184.m22505().address(), iOException);
        }
        c6504.m20645().m3471(c7184);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m21852(int i, int i2, InterfaceC3645 interfaceC3645, AbstractC4712 abstractC4712) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM22505 = this.f21196.m22505();
        C3175 c3175M22504 = this.f21196.m22504();
        Proxy.Type type = proxyM22505.type();
        int i3 = type == null ? -1 : C1143.f2634[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c3175M22504.m6512().createSocket();
            C5499.m17100(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM22505);
        }
        this.f21197 = socketCreateSocket;
        abstractC4712.mo14056(interfaceC3645, this.f21196.m22507(), proxyM22505);
        socketCreateSocket.setSoTimeout(i2);
        try {
            C6668.f2226.m21321().mo6575(socketCreateSocket, this.f21196.m22507(), i);
            try {
                this.f21202 = C6542.m20831(C6542.m20848(socketCreateSocket));
                this.f21203 = C6542.m20830(C6542.m20843(socketCreateSocket));
            } catch (NullPointerException e) {
                if (C5499.m17094(e.getMessage(), f21192)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f21196.m22507());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢ۠ۡۨ.ۥ۟۟۠ۡ(java.lang.String, java.lang.String, int, java.lang.Object):java.lang.String */
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
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m21853(C4111 c4111) throws Throwable {
        SSLSocket sSLSocket;
        C3175 c3175M22504 = this.f21196.m22504();
        SSLSocketFactory sSLSocketFactoryM6513 = c3175M22504.m6513();
        SSLSocket sSLSocket2 = null;
        try {
            C5499.m17100(sSLSocketFactoryM6513);
            Socket socketCreateSocket = sSLSocketFactoryM6513.createSocket(this.f21197, c3175M22504.m6514().m16772(), c3175M22504.m6514().m16779(), true);
            C5499.m17101(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C4110 c4110M1073 = c4111.m1073(sSLSocket);
            if (c4110M1073.m11707()) {
                C6668.f2226.m21321().mo6561(sSLSocket, c3175M22504.m6514().m16772(), c3175M22504.m6508());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C5241.C0680 c0680 = C5241.f12481;
            C5499.m17102(session, "sslSocketSession");
            C5241 c5241M16069 = c0680.m16069(session);
            HostnameVerifier hostnameVerifierM6507 = c3175M22504.m6507();
            C5499.m17100(hostnameVerifierM6507);
            if (hostnameVerifierM6507.verify(c3175M22504.m6514().m16772(), session)) {
                C3686 c3686M6503 = c3175M22504.m6503();
                C5499.m17100(c3686M6503);
                this.f21199 = new C5241(c5241M16069.m16068(), c5241M16069.m16062(), c5241M16069.m16064(), new C7027(c3686M6503, c5241M16069, c3175M22504));
                c3686M6503.m10107(c3175M22504.m6514().m16772(), new C7028());
                String strMo6562 = c4110M1073.m11707() ? C6668.f2226.m21321().mo6562(sSLSocket) : null;
                this.f21198 = sSLSocket;
                this.f21202 = C6542.m20831(C6542.m20848(sSLSocket));
                this.f21203 = C6542.m20830(C6542.m20843(sSLSocket));
                this.f21200 = strMo6562 != null ? EnumC6835.f17734.m3287(strMo6562) : EnumC6835.HTTP_1_1;
                C6668.f2226.m21321().mo17153(sSLSocket);
                return;
            }
            List<Certificate> listM16066 = c5241M16069.m16066();
            if (!(!listM16066.isEmpty())) {
                throw new SSLPeerUnverifiedException("Hostname " + c3175M22504.m6514().m16772() + " not verified (no certificates)");
            }
            Certificate certificate = listM16066.get(0);
            C5499.m17101(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(C7619.m23848("\n              |Hostname " + c3175M22504.m6514().m16772() + " not verified:\n              |    certificate: " + C3686.f6502.m759(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C6502.f2116.m2997(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C6668.f2226.m21321().mo17153(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                C8158.m26846(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m21854(int i, int i2, int i3, InterfaceC3645 interfaceC3645, AbstractC4712 abstractC4712) throws IOException {
        C7101 c7101M21856 = m21856();
        C5385 c5385M22160 = c7101M21856.m22160();
        for (int i4 = 0; i4 < 21; i4++) {
            m21852(i, i2, interfaceC3645, abstractC4712);
            c7101M21856 = m21855(i2, i3, c7101M21856, c5385M22160);
            if (c7101M21856 == null) {
                return;
            }
            Socket socket = this.f21197;
            if (socket != null) {
                C8158.m26846(socket);
            }
            this.f21197 = null;
            this.f21203 = null;
            this.f21202 = null;
            abstractC4712.mo14054(interfaceC3645, this.f21196.m22507(), this.f21196.m22505(), null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C7101 m21855(int i, int i2, C7101 c7101, C5385 c5385) throws IOException {
        String str = "CONNECT " + C8158.m26887(c5385, true) + " HTTP/1.1";
        while (true) {
            InterfaceC3604 interfaceC3604 = this.f21202;
            C5499.m17100(interfaceC3604);
            InterfaceC3603 interfaceC3603 = this.f21203;
            C5499.m17100(interfaceC3603);
            C5348 c5348 = new C5348(null, this, interfaceC3604, interfaceC3603);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC3604.mo518().mo15622(i, timeUnit);
            interfaceC3603.mo516().mo15622(i2, timeUnit);
            c5348.m16485(c7101.m22153(), str);
            c5348.mo14295();
            C7141.C1185 c1185Mo14297 = c5348.mo14297(false);
            C5499.m17100(c1185Mo14297);
            C7141 c7141M22334 = c1185Mo14297.m22362(c7101).m22334();
            c5348.m16484(c7141M22334);
            int iM22315 = c7141M22334.m22315();
            if (iM22315 == 200) {
                if (interfaceC3604.mo9605().mo9622() && interfaceC3603.mo9605().mo9622()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM22315 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c7141M22334.m22315());
            }
            C7101 c7101Mo542 = this.f21196.m22504().m6510().mo542(this.f21196, c7141M22334);
            if (c7101Mo542 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (C7627.m23974("close", C7141.m22298(c7141M22334, C4515.f9612, null, 2, null), true)) {
                return c7101Mo542;
            }
            c7101 = c7101Mo542;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final C7101 m21856() throws IOException {
        C7101 c7101M3393 = new C7101.C1165().m22186(this.f21196.m22504().m6514()).m22174("CONNECT", null).m22172("Host", C8158.m26887(this.f21196.m22504().m6514(), true)).m22172("Proxy-Connection", "Keep-Alive").m22172(C5375.f13181, C8158.f24184).m3393();
        C7101 c7101Mo542 = this.f21196.m22504().m6510().mo542(this.f21196, new C7141.C1185().m22362(c7101M3393).m22359(EnumC6835.HTTP_1_1).m22338(407).m22356("Preemptive Authenticate").m3432(C8158.f24177).m22363(-1L).m22360(-1L).m22353("Proxy-Authenticate", "OkHttp-Preemptive").m22334());
        return c7101Mo542 == null ? c7101M3393 : c7101Mo542;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m21857(C4111 c4111, int i, InterfaceC3645 interfaceC3645, AbstractC4712 abstractC4712) throws Throwable {
        if (this.f21196.m22504().m6513() != null) {
            abstractC4712.mo14075(interfaceC3645);
            m21853(c4111);
            abstractC4712.mo14074(interfaceC3645, this.f21199);
            if (this.f21200 == EnumC6835.HTTP_2) {
                m21875(i);
                return;
            }
            return;
        }
        List<EnumC6835> listM6508 = this.f21196.m22504().m6508();
        EnumC6835 enumC6835 = EnumC6835.H2_PRIOR_KNOWLEDGE;
        if (!listM6508.contains(enumC6835)) {
            this.f21198 = this.f21197;
            this.f21200 = EnumC6835.HTTP_1_1;
        } else {
            this.f21198 = this.f21197;
            this.f21200 = enumC6835;
            m21875(i);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final List<Reference<C7024>> m21858() {
        return this.f21210;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C7030 m21859() {
        return this.f21195;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long m21860() {
        return this.f21211;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m21861() {
        return this.f21204;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m21862() {
        return this.f21206;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final synchronized void m21863() {
        this.f21207++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m21864(@InterfaceC6399 C3175 c3175, @InterfaceC6489 List<C7184> list) {
        C5499.m17103(c3175, "address");
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f21210.size() >= this.f21209 || this.f21204 || !this.f21196.m22504().m6506(c3175)) {
            return false;
        }
        if (C5499.m17094(c3175.m6514().m16772(), mo1066().m22504().m6514().m16772())) {
            return true;
        }
        if (this.f21201 == null || list == null || !m21871(list) || c3175.m6507() != C6502.f2116 || !m21876(c3175.m6514())) {
            return false;
        }
        try {
            C3686 c3686M6503 = c3175.m6503();
            C5499.m17100(c3686M6503);
            String strM16772 = c3175.m6514().m16772();
            C5241 c5241Mo11695 = mo11695();
            C5499.m17100(c5241Mo11695);
            c3686M6503.m755(strM16772, c5241Mo11695.m16066());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m21865(boolean z) {
        long j;
        if (C8158.f24182 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f21197;
        C5499.m17100(socket);
        Socket socket2 = this.f21198;
        C5499.m17100(socket2);
        InterfaceC3604 interfaceC3604 = this.f21202;
        C5499.m17100(interfaceC3604);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C5355 c5355 = this.f21201;
        if (c5355 != null) {
            return c5355.m16528(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f21211;
        }
        if (j < f21194 || !z) {
            return true;
        }
        return C8158.m26869(socket2, interfaceC3604);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m21866() {
        return this.f21201 != null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final InterfaceC4743 m21867(@InterfaceC6399 C6504 c6504, @InterfaceC6399 C7031 c7031) throws SocketException {
        C5499.m17103(c6504, "client");
        C5499.m17103(c7031, "chain");
        Socket socket = this.f21198;
        C5499.m17100(socket);
        InterfaceC3604 interfaceC3604 = this.f21202;
        C5499.m17100(interfaceC3604);
        InterfaceC3603 interfaceC3603 = this.f21203;
        C5499.m17100(interfaceC3603);
        C5355 c5355 = this.f21201;
        if (c5355 != null) {
            return new C5368(c6504, this, c7031, c5355);
        }
        socket.setSoTimeout(c7031.mo17077());
        C7827 c7827Mo518 = interfaceC3604.mo518();
        long jM21889 = c7031.m21889();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7827Mo518.mo15622(jM21889, timeUnit);
        interfaceC3603.mo516().mo15622(c7031.m21891(), timeUnit);
        return new C5348(c6504, this, interfaceC3604, interfaceC3603);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final C7033.AbstractC7035 m21868(@InterfaceC6399 C4742 c4742) throws SocketException {
        C5499.m17103(c4742, "exchange");
        Socket socket = this.f21198;
        C5499.m17100(socket);
        InterfaceC3604 interfaceC3604 = this.f21202;
        C5499.m17100(interfaceC3604);
        InterfaceC3603 interfaceC3603 = this.f21203;
        C5499.m17100(interfaceC3603);
        socket.setSoTimeout(0);
        m21870();
        return new C7029(interfaceC3604, interfaceC3603, c4742);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final synchronized void m21869() {
        this.f21205 = true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final synchronized void m21870() {
        this.f21204 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final boolean m21871(List<C7184> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C7184 c7184 : list) {
            Proxy.Type type = c7184.m22505().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f21196.m22505().type() == type2 && C5499.m17094(this.f21196.m22507(), c7184.m22507())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m21872(long j) {
        this.f21211 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m21873(boolean z) {
        this.f21204 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m21874(int i) {
        this.f21206 = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠ۤۧۦ.ۥ۟۠۟ۡ(Yue.ۥ۠ۤۧۦ, boolean, Yue.ۥۢۡ۟ۢ, int, java.lang.Object):void */
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m21875(int i) throws IOException {
        Socket socket = this.f21198;
        C5499.m17100(socket);
        InterfaceC3604 interfaceC3604 = this.f21202;
        C5499.m17100(interfaceC3604);
        InterfaceC3603 interfaceC3603 = this.f21203;
        C5499.m17100(interfaceC3603);
        socket.setSoTimeout(0);
        C5355 c5355M2118 = new C5355.C0719(true, C7733.f23262).m16580(socket, this.f21196.m22504().m6514().m16772(), interfaceC3604, interfaceC3603).m16566(this).m16567(i).m2118();
        this.f21201 = c5355M2118;
        this.f21209 = C5355.f13036.m2120().m23177();
        C5355.m16508(c5355M2118, false, null, 3, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m21876(C5385 c5385) {
        C5241 c5241;
        if (C8158.f24182 && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C5385 c5385M6514 = this.f21196.m22504().m6514();
        if (c5385.m16779() != c5385M6514.m16779()) {
            return false;
        }
        if (C5499.m17094(c5385.m16772(), c5385M6514.m16772())) {
            return true;
        }
        if (this.f21205 || (c5241 = this.f21199) == null) {
            return false;
        }
        C5499.m17100(c5241);
        return m21849(c5385, c5241);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final synchronized void m21877(@InterfaceC6399 C7024 c7024, @InterfaceC6489 IOException iOException) {
        try {
            C5499.m17103(c7024, C6411.f16272);
            if (iOException instanceof C7604) {
                if (((C7604) iOException).f23014 == EnumC4660.REFUSED_STREAM) {
                    int i = this.f21208 + 1;
                    this.f21208 = i;
                    if (i > 1) {
                        this.f21204 = true;
                        this.f21206++;
                    }
                } else if (((C7604) iOException).f23014 != EnumC4660.CANCEL || !c7024.mo9975()) {
                    this.f21204 = true;
                    this.f21206++;
                }
            } else if (!m21866() || (iOException instanceof C4109)) {
                this.f21204 = true;
                if (this.f21207 == 0) {
                    if (iOException != null) {
                        m21851(c7024.m21823(), this.f21196, iOException);
                    }
                    this.f21206++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
