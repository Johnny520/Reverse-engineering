package io.github.cherrywechat.lua.dev;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.C2155a;
import kotlinx.serialization.json.C2157c;
import p000.AbstractC0042Az;
import p000.AbstractC0085Bz;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;
import p000.AbstractC2508sm;
import p000.AbstractC2564tz;
import p000.AbstractC2607uz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.AbstractC2809zm;
import p000.C0029Am;
import p000.C0072Bm;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0382Iv;
import p000.C0829TC;
import p000.C2488s8;
import p000.C2637vm;
import p000.RunnableC0562N2;
import p000.RunnableC2260n3;
import p000.RunnableC2445r8;
import p000.RunnableC2531t8;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryDevServer {
    private static final int DEFAULT_PORT = 9527;
    public static final CherryDevServer INSTANCE = null;
    private static final String TAG = null;
    private static Context context;
    private static final ExecutorService executor = null;
    private static final List<LogListener> logListeners = null;
    private static final Handler mainHandler = null;
    private static int port;
    private static final AtomicBoolean running = null;
    private static ServerSocket serverSocket;
    private static final ConcurrentHashMap<String, WebSocketConnection> wsConnections = null;

    public static final class HttpRequest {
        private final String body;
        private final Map<String, String> headers;
        private final String method;
        private final String path;

        public HttpRequest(String r3, String r4, Map<String, String> r5, String r6) {
            AbstractC0295Gu.m625r(-345951025756213L);
            AbstractC0295Gu.m625r(-345981090527285L);
            AbstractC0295Gu.m625r(-346002565363765L);
            AbstractC0295Gu.m625r(-346036925102133L);
            this.method = r3;
            this.path = r4;
            this.headers = r5;
            this.body = r6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HttpRequest copy$default(HttpRequest r0, String r1, String r2, Map r3, String r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.method;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.path;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.headers;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.body;
        L15:
            return r0.copy(r1, r2, r3, r4);
        }

        public final String component1() {
            return this.method;
        }

        public final String component2() {
            return this.path;
        }

        public final Map<String, String> component3() {
            return this.headers;
        }

        public final String component4() {
            return this.body;
        }

        public final HttpRequest copy(String r3, String r4, Map<String, String> r5, String r6) {
            AbstractC0295Gu.m625r(-346058399938613L);
            AbstractC0295Gu.m625r(-344439197268021L);
            AbstractC0295Gu.m625r(-344460672104501L);
            AbstractC0295Gu.m625r(-344495031842869L);
            return new HttpRequest(r3, r4, r5, r6);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof HttpRequest) == true) goto L8;
            return false;
        L8:
            HttpRequest r52 = (HttpRequest) r5;
            if (AbstractC0585Nj.m1134a(this.method, r52.method) == true) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.path, r52.path) == true) goto L15;
            return false;
        L15:
            if (AbstractC0585Nj.m1134a(this.headers, r52.headers) == true) goto L18;
            return false;
        L18:
            if (AbstractC0585Nj.m1134a(this.body, r52.body) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public final String getBody() {
            return this.body;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int r0 = this.method.hashCode() * 31;
            int r02 = AbstractC2374ph.m4810g(this.path, r0, 31);
            int r2 = (this.headers.hashCode() + r02) * 31;
            return this.body.hashCode() + r2;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-344516506679349L));
            AbstractC2374ph.m4817n(r0, this.method, -344602406025269L);
            AbstractC2374ph.m4817n(r0, this.path, -344636765763637L);
            r0.append(this.headers);
            r0.append(AbstractC0295Gu.m625r(-344684010403893L));
            return AbstractC2374ph.m4815l(r0, this.body, ')');
        }
    }

    public static final class HttpResponse {
        private final String body;
        private final int code;
        private final String status;

        public HttpResponse(int r3, String r4, String r5) {
            AbstractC0295Gu.m625r(-344168614328373L);
            AbstractC0295Gu.m625r(-344198679099445L);
            this.code = r3;
            this.status = r4;
            this.body = r5;
        }

        public static /* synthetic */ HttpResponse copy$default(HttpResponse r0, int r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.code;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.status;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.body;
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.status;
        }

        public final String component3() {
            return this.body;
        }

        public final HttpResponse copy(int r3, String r4, String r5) {
            AbstractC0295Gu.m625r(-344220153935925L);
            AbstractC0295Gu.m625r(-344250218706997L);
            return new HttpResponse(r3, r4, r5);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof HttpResponse) == true) goto L8;
            return false;
        L8:
            HttpResponse r52 = (HttpResponse) r5;
            if (this.code == r52.code) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.status, r52.status) == true) goto L15;
            return false;
        L15:
            if (AbstractC0585Nj.m1134a(this.body, r52.body) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public final String getBody() {
            return this.body;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int r0 = Integer.hashCode(this.code) * 31;
            int r02 = AbstractC2374ph.m4810g(this.status, r0, 31);
            return this.body.hashCode() + r02;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-344271693543477L));
            AbstractC0213Ey.m418p(r0, this.code, -344353297922101L);
            AbstractC2374ph.m4817n(r0, this.status, -344396247595061L);
            return AbstractC2374ph.m4815l(r0, this.body, ')');
        }
    }

    public interface LogListener {
        void onLog(String r1, String r2, String r3);
    }

    public static final class WebSocketConnection {

        /* JADX INFO: renamed from: id */
        private final String f5561id;
        private final BufferedInputStream input;
        private final BufferedOutputStream output;
        private final Socket socket;

        public WebSocketConnection(String r3, Socket r4, BufferedInputStream r5, BufferedOutputStream r6) {
            AbstractC0295Gu.m625r(-344980363147317L);
            AbstractC0295Gu.m625r(-344993248049205L);
            AbstractC0295Gu.m625r(-345023312820277L);
            AbstractC0295Gu.m625r(-345049082624053L);
            this.f5561id = r3;
            this.socket = r4;
            this.input = r5;
            this.output = r6;
        }

        public final void close() {
            this.socket.close();     // Catch: Exception -> L4
            return;
        }

        public final String getId() {
            return this.f5561id;
        }

        public final synchronized void send(byte[] r3) {
            monitor-enter(this);
            AbstractC0295Gu.m625r(-345079147395125L);     // Catch: Throwable -> L7
            this.output.write(r3);     // Catch: Throwable -> L7 Exception -> L9
            this.output.flush();     // Catch: Throwable -> L7 Exception -> L9
        L11:
            monitor-exit(this);
            return;
        L10:
            AbstractC0295Gu.m625r(-345100622231605L);     // Catch: Throwable -> L7
            AbstractC0295Gu.m625r(-345169341708341L);     // Catch: Throwable -> L7
        L7:
            th = move-exception;
            throw th;
        }
    }

    public static final class WebSocketFrame {
        private final int opcode;
        private final byte[] payload;

        public WebSocketFrame(int r3, byte[] r4) {
            AbstractC0295Gu.m625r(-344709780207669L);
            this.opcode = r3;
            this.payload = r4;
        }

        public static /* synthetic */ WebSocketFrame copy$default(WebSocketFrame r0, int r1, byte[] r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.opcode;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.payload;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.opcode;
        }

        public final byte[] component2() {
            return this.payload;
        }

        public final WebSocketFrame copy(int r3, byte[] r4) {
            AbstractC0295Gu.m625r(-344744139946037L);
            return new WebSocketFrame(r3, r4);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof WebSocketFrame) == true) goto L8;
            return false;
        L8:
            WebSocketFrame r52 = (WebSocketFrame) r5;
            if (this.opcode == r52.opcode) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.payload, r52.payload) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public final int getOpcode() {
            return this.opcode;
        }

        public final byte[] getPayload() {
            return this.payload;
        }

        public int hashCode() {
            int r0 = Integer.hashCode(this.opcode) * 31;
            return Arrays.hashCode(this.payload) + r0;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-344778499684405L));
            AbstractC0213Ey.m418p(r0, this.opcode, -344877283932213L);
            r0.append(Arrays.toString(this.payload));
            r0.append(')');
            return r0.toString();
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-330695301920821L);
        INSTANCE = new CherryDevServer();
        executor = Executors.newCachedThreadPool();
        mainHandler = new Handler(Looper.getMainLooper());
        running = new AtomicBoolean(false);
        port = DEFAULT_PORT;
        wsConnections = new ConcurrentHashMap();
        logListeners = new ArrayList();
    }

    private CherryDevServer() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3518a(byte[] r0) {
        broadcastLog$lambda$4(r0);
    }

    private final void acceptConnections() {
    L3:
        if (running.get() == false) goto L26;
        ServerSocket r0 = serverSocket;     // Catch: Exception -> L11
        if (r0 == null) goto L27;
        Socket r02 = r0.accept();     // Catch: Exception -> L11
        if (r02 == null) goto L14;
        executor.execute(new RunnableC0562N2(3, r02));     // Catch: Exception -> L11
        goto L3
    L14:
        return;
    L27:
        return;
    L12:
        if (running.get() == false) goto L3;
        AbstractC0295Gu.m625r(-343794952173621L);
        AbstractC0295Gu.m625r(-343863671650357L);
        goto L3
    }

    private static final void acceptConnections$lambda$5(Socket r1) {
        INSTANCE.handleConnection(r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0829TC m3519b(String r0, C0340Hw r1) {
        return handleScriptUpload$lambda$16$lambda$15(r0, r1);
    }

    private static final void broadcastLog$lambda$4(byte[] r6) {
        Collection<WebSocketConnection> r0 = wsConnections.values();
        AbstractC0295Gu.m625r(-331438331263029L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        ((WebSocketConnection) r02.next()).send(r6);     // Catch: Exception -> L8
    L8:
        e = move-exception;
        AbstractC0213Ey.m411i(-330965884860469L, -331034604337205L, e);
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3520c(Socket r0) {
        acceptConnections$lambda$5(r0);
    }

    private final byte[] createWebSocketFrame(int r5, byte[] r6) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(r5 | 128);
        if (r6.length >= 126) goto L6;
        r0.write(r6.length);
    L12:
        r0.write(r6);
        byte[] r52 = r0.toByteArray();
        AbstractC0295Gu.m625r(-332954454718517L);
        return r52;
    L6:
        if (r6.length >= 65536) goto L8;
        r0.write(126);
        r0.write(r6.length >> 8);
        r0.write(r6.length & 255);
        goto L12
    L8:
        r0.write(127);
        int r53 = 7;
    L10:
        if ((-1) >= r53) goto L12;
        r0.write(((int) (((long) r6.length) >> (r53 * 8))) & 255);
        r53 = r53 - 1;
        goto L10
    }

    private final byte[] createWebSocketTextFrame(String r3) {
        byte[] r32 = r3.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-332894325176373L);
        return createWebSocketFrame(1, r32);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3521d(String r0, C0382Iv r1, CountDownLatch r2) {
        handleScriptExecute$lambda$20(r0, r1, r2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3522e(WebSocketConnection r0, byte[] r1) {
        handleWebSocketMessage$lambda$24$lambda$23(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3523f(Context r0, File r1, String r2) {
        handleScriptUpload$lambda$16(r0, r1, r2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3524g() {
        start$lambda$0();
    }

    private final String generateWebSocketAcceptKey(String r5) {
        String r0 = AbstractC0295Gu.m625r(-332563612694581L);
        MessageDigest r1 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-332172770670645L));
        byte[] r52 = AbstractC0213Ey.m407e(r5, r0).getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-332198540474421L);
        byte[] r53 = r1.digest(r52);
        String r54 = Base64.getEncoder().encodeToString(r53);
        AbstractC0295Gu.m625r(-332258670016565L);
        return r54;
    }

    private final String getLocalIpAddress() {
        Enumeration<NetworkInterface> r0 = NetworkInterface.getNetworkInterfaces();     // Catch: Exception -> L16
    L4:
        if (r0.hasMoreElements() == false) goto L18;
        Enumeration<InetAddress> r1 = r0.nextElement().getInetAddresses();     // Catch: Exception -> L16
    L7:
        if (r1.hasMoreElements() == false) goto L4;
        InetAddress r2 = r1.nextElement();     // Catch: Exception -> L16
        if (r2.isLoopbackAddress() == true) goto L7;
        if ((r2 instanceof Inet4Address) == false) goto L7;
        String r02 = ((Inet4Address) r2).getHostAddress();     // Catch: Exception -> L16
        if (r02 != null) goto L28;
        return AbstractC0295Gu.m625r(-332675281844277L);
    L28:
        return r02;
    L18:
        return AbstractC0295Gu.m625r(-332859965438005L);
    L16:
        AbstractC0295Gu.m625r(-332718231517237L);
        AbstractC0295Gu.m625r(-332786950993973L);
        goto L18
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3525h(String r0, WebSocketConnection r1) {
        handleWebSocketMessage$lambda$24(r0, r1);
    }

    private final void handleConnection(Socket r5) {
        r5.setSoTimeout(30000);     // Catch: Exception -> L13
        BufferedInputStream r0 = new BufferedInputStream(r5.getInputStream());     // Catch: Exception -> L13
        BufferedOutputStream r1 = new BufferedOutputStream(r5.getOutputStream());     // Catch: Exception -> L13
        HttpRequest r2 = parseHttpRequest(r0);     // Catch: Exception -> L13
        if (r2 != null) goto L8;
        r5.close();     // Catch: Exception -> L13
        return;
    L8:
        if (isWebSocketUpgrade(r2) == false) goto L11;
        handleWebSocketUpgrade(r5, r0, r1, r2);     // Catch: Exception -> L13
        return;
    L11:
        handleHttpRequest(r5, r1, r2);     // Catch: Exception -> L13
        return;
    L13:
        AbstractC0295Gu.m625r(-324678052739125L);
        AbstractC0295Gu.m625r(-324746772215861L);
        r5.close();     // Catch: Exception -> L16
        return;
    }

    private final void handleHttpRequest(Socket r4, BufferedOutputStream r5, HttpRequest r6) {
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-324819786659893L)) == false) goto L8;
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-324871326267445L)) == false) goto L8;
        HttpResponse r62 = handleStatus();
    L33:
        sendHttpResponse(r5, r62);
        r4.close();
        return;
    L8:
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-324888506136629L)) == false) goto L13;
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-324411764766773L)) == false) goto L13;
        r62 = handleScriptList();
    L13:
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-324428944635957L)) == false) goto L18;
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-324510549014581L)) == false) goto L18;
        r62 = handleScriptUpload(r6);
    L18:
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-324532023851061L)) == false) goto L23;
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-324617923196981L)) == false) goto L23;
        r62 = handleScriptExecute(r6);
    L23:
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-325189153847349L)) == false) goto L28;
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-325270758225973L)) == false) goto L28;
        r62 = handleScriptReload(r6);
    L28:
        if (AbstractC0585Nj.m1134a(r6.getPath(), AbstractC0295Gu.m625r(-325292233062453L)) == true) goto L30;
    L32:
        r62 = new HttpResponse(404, AbstractC0295Gu.m625r(-325395312277557L), AbstractC0295Gu.m625r(-325438261950517L));
        goto L33
    L30:
        if (AbstractC0585Nj.m1134a(r6.getMethod(), AbstractC0295Gu.m625r(-325373837441077L)) == false) goto L32;
        r62 = handleScriptDelete(r6);
        goto L33
    }

    private final HttpResponse handleScriptDelete(HttpRequest r7) {
        C2157c r72 = parseRequestBody(r7.getBody());     // Catch: Exception -> L7
        if (r72 == null) goto L6;
        AbstractC2156b r1 = (AbstractC2156b) r72.get(AbstractC0295Gu.m625r(-320572064004149L));     // Catch: Exception -> L7
        if (r1 == null) goto L13;
        String r12 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r1));     // Catch: Exception -> L7
        if (r12 == null) goto L13;
    L14:
        AbstractC2156b r73 = (AbstractC2156b) r72.get(AbstractC0295Gu.m625r(-320589243873333L));     // Catch: Exception -> L7
        if (r73 == null) goto L18;
        String r74 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r73));     // Catch: Exception -> L7
        if (r74 == null) goto L18;
    L20:
        if (r12.length() <= 0) goto L23;
        ScriptManager.INSTANCE.unloadScript(r12);     // Catch: Exception -> L7
    L23:
        if (r74.length() <= 0) goto L26;
        new File(r74).delete();     // Catch: Exception -> L7
    L26:
        return new HttpResponse(200, AbstractC0295Gu.m625r(-320615013677109L), AbstractC0295Gu.m625r(-320627898578997L));
    L18:
        r74 = AbstractC0295Gu.m625r(-320610718709813L);     // Catch: Exception -> L7
    L13:
        r12 = AbstractC0295Gu.m625r(-320584948906037L);     // Catch: Exception -> L7
        goto L14
    L6:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-320958611060789L), AbstractC0295Gu.m625r(-321010150668341L));
    L7:
        e = move-exception;
        return new HttpResponse(400, AbstractC0295Gu.m625r(-320705207990325L), AbstractC0295Gu.m625r(-320756747597877L) + e.getMessage() + AbstractC0295Gu.m625r(-319159019763765L));
    }

    private final HttpResponse handleScriptExecute(HttpRequest r7) {
        C2157c r72 = parseRequestBody(r7.getBody());     // Catch: Exception -> L7
        if (r72 == null) goto L6;
        AbstractC2156b r73 = (AbstractC2156b) r72.get(AbstractC0295Gu.m625r(-322930001049653L));     // Catch: Exception -> L7
        if (r73 == null) goto L20;
        String r74 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r73));     // Catch: Exception -> L7
        if (r74 == null) goto L20;
        C0382Iv r1 = new C0382Iv();     // Catch: Exception -> L7
        CountDownLatch r2 = new CountDownLatch(1);     // Catch: Exception -> L7
        mainHandler.post(new RunnableC2445r8(r74, r1, r2));     // Catch: Exception -> L7
        r2.await(10, TimeUnit.SECONDS);     // Catch: Exception -> L7
        String r22 = AbstractC0295Gu.m625r(-321465417201717L);     // Catch: Exception -> L7
        String r12 = (String) r1.f1315a;     // Catch: Exception -> L7
        if (r12 != null) goto L18;
        r12 = AbstractC0295Gu.m625r(-321478302103605L);     // Catch: Exception -> L7
    L18:
        return new HttpResponse(200, r22, r12);
    L20:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-322951475886133L), AbstractC0295Gu.m625r(-321353748052021L));
    L6:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-322766792292405L), AbstractC0295Gu.m625r(-322818331899957L));
    L7:
        e = move-exception;
        return new HttpResponse(400, AbstractC0295Gu.m625r(-321568496416821L), AbstractC0295Gu.m625r(-321070280210485L) + e.getMessage() + AbstractC0295Gu.m625r(-321121819818037L));
    }

    private static final void handleScriptExecute$lambda$20(String r6, C0382Iv r7, CountDownLatch r8) {
        Object r62 = LuaEngine.INSTANCE.m5465executeIoAF18A(r6);     // Catch: Exception -> L10
        LinkedHashMap r1 = new LinkedHashMap();     // Catch: Exception -> L10
        String r2 = AbstractC0295Gu.m625r(-330244330354741L);     // Catch: Exception -> L10
        Boolean r3 = Boolean.valueOf(!(r62 instanceof C0297Gw));     // Catch: Exception -> L10
        int r4 = AbstractC2508sm.f8796a;     // Catch: Exception -> L10
        AbstractC2156b r22 = (AbstractC2156b) r1.put(r2, new C0072Bm(r3, false));     // Catch: Exception -> L10
        String r32 = null;
        if ((r62 instanceof C0297Gw) == true) goto L13;
        String r23 = AbstractC0295Gu.m625r(-330278690093109L);     // Catch: Exception -> L10
        if ((r62 instanceof C0297Gw) == false) goto L8;
        r62 = null;
    L8:
        if (r62 == null) goto L12;
        r32 = r62.toString();     // Catch: Exception -> L10
    L12:
        AbstractC2156b r63 = (AbstractC2156b) r1.put(r23, AbstractC2508sm.m4986a(r32));     // Catch: Exception -> L10
    L17:
        r7.f1315a = new C2157c(r1).toString();     // Catch: Exception -> L10
    L20:
        r8.countDown();
        return;
    L13:
        String r24 = AbstractC0295Gu.m625r(-330308754864181L);     // Catch: Exception -> L10
        Throwable r64 = C0340Hw.m726a(r62);     // Catch: Exception -> L10
        if (r64 == null) goto L16;
        r32 = r64.getMessage();     // Catch: Exception -> L10
    L16:
        AbstractC2156b r65 = (AbstractC2156b) r1.put(r24, AbstractC2508sm.m4986a(r32));     // Catch: Exception -> L10
    L10:
        e = move-exception;
        LinkedHashMap r12 = new LinkedHashMap();
        String r25 = AbstractC0295Gu.m625r(-330334524667957L);
        Boolean r33 = Boolean.FALSE;
        int r42 = AbstractC2508sm.f8796a;
        AbstractC2156b r0 = (AbstractC2156b) r12.put(r25, new C0072Bm(r33, false));
        AbstractC2156b r66 = (AbstractC2156b) r12.put(AbstractC0295Gu.m625r(-330368884406325L), AbstractC2508sm.m4986a(e.getMessage()));
        r7.f1315a = new C2157c(r12).toString();
        goto L20
    }

    private final HttpResponse handleScriptList() {
        List<LoadedScript> r0 = ScriptManager.INSTANCE.getLoadedScripts();
        ArrayList r1 = new ArrayList();
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        LoadedScript r2 = (LoadedScript) r02.next();
        LinkedHashMap r3 = new LinkedHashMap();
        AbstractC2156b r4 = (AbstractC2156b) r3.put(AbstractC0295Gu.m625r(-323552771307573L), AbstractC2508sm.m4986a(r2.getId()));
        AbstractC2156b r42 = (AbstractC2156b) r3.put(AbstractC0295Gu.m625r(-323565656209461L), AbstractC2508sm.m4986a(r2.getName()));
        AbstractC2156b r43 = (AbstractC2156b) r3.put(AbstractC0295Gu.m625r(-323587131045941L), AbstractC2508sm.m4986a(r2.getState().name()));
        AbstractC2156b r22 = (AbstractC2156b) r3.put(AbstractC0295Gu.m625r(-323612900849717L), AbstractC2508sm.m4986a(r2.getFilePath()));
        r1.add(new C2157c(r3));
        goto L4
    L6:
        C2155a r03 = new C2155a(r1);
        LinkedHashMap r12 = new LinkedHashMap();
        AbstractC2156b r04 = (AbstractC2156b) r12.put(AbstractC0295Gu.m625r(-323634375686197L), r03);
        C2157c r05 = new C2157c(r12);
        return new HttpResponse(200, AbstractC0295Gu.m625r(-323668735424565L), r05.toString());
    }

    private final HttpResponse handleScriptReload(HttpRequest r13) {
        C2157c r132 = parseRequestBody(r13.getBody());     // Catch: Exception -> L7
        if (r132 == null) goto L6;
        AbstractC2156b r0 = (AbstractC2156b) r132.get(AbstractC0295Gu.m625r(-321297913477173L));     // Catch: Exception -> L7
        if (r0 == null) goto L13;
        String r02 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r0));     // Catch: Exception -> L7
        if (r02 == null) goto L13;
    L14:
        AbstractC2156b r133 = (AbstractC2156b) r132.get(AbstractC0295Gu.m625r(-321323683280949L));     // Catch: Exception -> L7
        if (r133 == null) goto L18;
        String r134 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r133));     // Catch: Exception -> L7
        if (r134 == null) goto L18;
    L20:
        if (r134.length() <= 0) goto L30;
        ScriptManager r5 = ScriptManager.INSTANCE;     // Catch: Exception -> L7
        LoadedScript r03 = r5.getScript(r134);     // Catch: Exception -> L7
        if (r03 == null) goto L40;
        r5.unloadScript(r134);     // Catch: Exception -> L7
        Context r6 = context;     // Catch: Exception -> L7
        if (r6 == null) goto L26;
        ScriptManager.loadAndExecute$default(r5, r6, new File(r03.getFilePath()), false, null, 12, null);     // Catch: Exception -> L7
        broadcastLog(AbstractC0295Gu.m625r(-322019467982901L), AbstractC0295Gu.m625r(-322040942819381L), AbstractC0295Gu.m625r(-322109662296117L) + r03.getName());     // Catch: Exception -> L7
        return new HttpResponse(200, AbstractC0295Gu.m625r(-321637215893557L), AbstractC0295Gu.m625r(-321650100795445L));
    L26:
        return new HttpResponse(500, AbstractC0295Gu.m625r(-321890618964021L), AbstractC0295Gu.m625r(-321916388767797L));
    L40:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-320112502503477L), AbstractC0295Gu.m625r(-320164042111029L));
    L30:
        if (r02.length() <= 0) goto L40;
        File r7 = new File(r02);     // Catch: Exception -> L7
        if (r7.exists() == false) goto L40;
        Context r62 = context;     // Catch: Exception -> L7
        if (r62 == null) goto L36;
        ScriptManager.loadAndExecute$default(ScriptManager.INSTANCE, r62, r7, false, null, 12, null);     // Catch: Exception -> L7
        broadcastLog(AbstractC0295Gu.m625r(-320305776031797L), AbstractC0295Gu.m625r(-320327250868277L), AbstractC0295Gu.m625r(-320395970345013L) + r7.getName());     // Catch: Exception -> L7
        return new HttpResponse(200, AbstractC0295Gu.m625r(-320473279756341L), AbstractC0295Gu.m625r(-320486164658229L));
    L36:
        return new HttpResponse(500, AbstractC0295Gu.m625r(-321826194454581L), AbstractC0295Gu.m625r(-321851964258357L));
    L18:
        r134 = AbstractC0295Gu.m625r(-321886323996725L);     // Catch: Exception -> L7
    L13:
        r02 = AbstractC0295Gu.m625r(-321319388313653L);     // Catch: Exception -> L7
        goto L14
    L6:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-321134704719925L), AbstractC0295Gu.m625r(-321186244327477L));
    L7:
        e = move-exception;
        return new HttpResponse(400, AbstractC0295Gu.m625r(-320842646943797L), AbstractC0295Gu.m625r(-320894186551349L) + e.getMessage() + AbstractC0295Gu.m625r(-320945726158901L));
    }

    private final HttpResponse handleScriptUpload(HttpRequest r11) {
        C2157c r112 = parseRequestBody(r11.getBody());     // Catch: Exception -> L7
        if (r112 == null) goto L6;
        AbstractC2156b r1 = (AbstractC2156b) r112.get(AbstractC0295Gu.m625r(-323295073269813L));     // Catch: Exception -> L7
        if (r1 == null) goto L61;
        String r12 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r1));     // Catch: Exception -> L7
        if (r12 == null) goto L61;
        AbstractC2156b r2 = (AbstractC2156b) r112.get(AbstractC0295Gu.m625r(-323514116601909L));     // Catch: Exception -> L7
        if (r2 == null) goto L59;
        String r22 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r2));     // Catch: Exception -> L7
        if (r22 == null) goto L59;
        AbstractC2156b r113 = (AbstractC2156b) r112.get(AbstractC0295Gu.m625r(-324274325813301L));     // Catch: Exception -> L7
        Object r3 = null;
        if (r113 == null) goto L32;
        String r114 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r113));     // Catch: Exception -> L7
        if (r114 == null) goto L32;
        if (r114.equals("true") == false) goto L27;
        Boolean r115 = Boolean.TRUE;     // Catch: Exception -> L7
    L30:
        if (r115 == null) goto L32;
        boolean r116 = r115.booleanValue();     // Catch: Exception -> L7
    L33:
        Context r4 = context;     // Catch: Exception -> L7
        if (r4 == null) goto L36;
        File r5 = new File(r4.getFilesDir(), AbstractC0295Gu.m625r(-323904958625845L));     // Catch: Exception -> L7
        if (r5.exists() == true) goto L40;
        r5.mkdirs();     // Catch: Exception -> L7
    L40:
        File r6 = new File(r5, r12);     // Catch: Exception -> L7
        AbstractC2675wh.m5246i0(r6, r22);     // Catch: Exception -> L7
        Iterator<T> r23 = ScriptManager.INSTANCE.getLoadedScripts().iterator();     // Catch: Exception -> L7
    L42:
        if (r23.hasNext() == false) goto L46;
        Object r52 = r23.next();     // Catch: Exception -> L7
        if (AbstractC0585Nj.m1134a(((LoadedScript) r52).getFilePath(), r6.getAbsolutePath()) == false) goto L42;
        r3 = r52;
    L46:
        LoadedScript r32 = (LoadedScript) r3;     // Catch: Exception -> L7
        if (r32 == null) goto L49;
        ScriptManager.INSTANCE.unloadScript(r32.getId());     // Catch: Exception -> L7
        broadcastLog(AbstractC0295Gu.m625r(-323956498233397L), AbstractC0295Gu.m625r(-323977973069877L), AbstractC0295Gu.m625r(-324046692546613L) + r12);     // Catch: Exception -> L7
    L49:
        broadcastLog(AbstractC0295Gu.m625r(-322513389221941L), AbstractC0295Gu.m625r(-322534864058421L), AbstractC0295Gu.m625r(-322603583535157L) + r12 + AbstractC0295Gu.m625r(-322680892946485L) + r116 + ')');     // Catch: Exception -> L7
        int r24 = 0;
        if (r116 == false) goto L52;
        broadcastLog(AbstractC0295Gu.m625r(-322195561642037L), AbstractC0295Gu.m625r(-322221331445813L), AbstractC0295Gu.m625r(-322290050922549L) + r12);     // Catch: Exception -> L7
        mainHandler.post(new RunnableC2445r8(r4, r6, r12, r24));     // Catch: Exception -> L7
    L52:
        LinkedHashMap r13 = new LinkedHashMap();     // Catch: Exception -> L7
        String r33 = AbstractC0295Gu.m625r(-322410310006837L);     // Catch: Exception -> L7
        Boolean r42 = Boolean.TRUE;     // Catch: Exception -> L7
        int r53 = AbstractC2508sm.f8796a;     // Catch: Exception -> L7
        AbstractC2156b r25 = (AbstractC2156b) r13.put(r33, new C0072Bm(r42, false));     // Catch: Exception -> L7
        AbstractC2156b r26 = (AbstractC2156b) r13.put(AbstractC0295Gu.m625r(-322994425559093L), AbstractC2508sm.m4986a(r6.getAbsolutePath()));     // Catch: Exception -> L7
        String r27 = AbstractC0295Gu.m625r(-323015900395573L);     // Catch: Exception -> L7
        StringBuilder r34 = new StringBuilder();     // Catch: Exception -> L7
        r34.append(AbstractC0295Gu.m625r(-323050260133941L));     // Catch: Exception -> L7
        if (r116 == false) goto L55;
        String r117 = AbstractC0295Gu.m625r(-323118979610677L);     // Catch: Exception -> L7
    L56:
        r34.append(r117);     // Catch: Exception -> L7
        AbstractC2156b r118 = (AbstractC2156b) r13.put(r27, AbstractC2508sm.m4986a(r34.toString()));     // Catch: Exception -> L7
        return new HttpResponse(200, AbstractC0295Gu.m625r(-323187699087413L), new C2157c(r13).toString());
    L55:
        r117 = AbstractC0295Gu.m625r(-323183404120117L);     // Catch: Exception -> L7
        goto L56
    L36:
        return new HttpResponse(500, AbstractC0295Gu.m625r(-324325865420853L), AbstractC0295Gu.m625r(-324351635224629L));
    L27:
        if (r114.equals("false") == false) goto L29;
        r115 = Boolean.FALSE;     // Catch: Exception -> L7
        goto L30
    L29:
        r115 = null;
    L32:
        r116 = true;
    L59:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-324098232154165L), AbstractC0295Gu.m625r(-324149771761717L));
    L61:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-323333727975477L), AbstractC0295Gu.m625r(-323385267583029L));
    L6:
        return new HttpResponse(400, AbstractC0295Gu.m625r(-323681620326453L), AbstractC0295Gu.m625r(-323733159934005L));
    L7:
        e = move-exception;
        return new HttpResponse(400, AbstractC0295Gu.m625r(-323200583989301L), AbstractC0295Gu.m625r(-323252123596853L) + e.getMessage() + AbstractC0295Gu.m625r(-322753907390517L));
    }

    private static final void handleScriptUpload$lambda$16(Context r4, File r5, String r6) {
        if (ScriptManager.INSTANCE.loadAndExecute(r4, r5, false, new C2488s8(r6, 0)) != null) goto L6;
        INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331696029300789L), AbstractC0295Gu.m625r(-331721799104565L), AbstractC0295Gu.m625r(-330141251139637L) + r6);
        return;
    }

    private static final C0829TC handleScriptUpload$lambda$16$lambda$15(String r7, C0340Hw r8) {
        Object r82 = r8.f1148a;
        if ((r82 instanceof C0297Gw) == true) goto L14;
        if (r82 == null) goto L12;
        String r0 = r82.toString();
        if (r0 == null) goto L12;
        int r1 = r0.length();
        if (100 > r1) goto L11;
        r1 = 100;
    L11:
        String r02 = r0.substring(0, r1);
    L13:
        INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331159158388789L), AbstractC0295Gu.m625r(-331180633225269L), AbstractC0295Gu.m625r(-331799108515893L) + r7 + AbstractC0295Gu.m625r(-331876417927221L) + r02);
    L12:
        r02 = AbstractC0295Gu.m625r(-331133388585013L);
    L14:
        Throwable r83 = C0340Hw.m726a(r82);
        if (r83 == null) goto L18;
        INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331897892763701L), AbstractC0295Gu.m625r(-331923662567477L), AbstractC0295Gu.m625r(-331992382044213L) + r7 + AbstractC0295Gu.m625r(-331511345707061L) + r83.getMessage());
        AbstractC0295Gu.m625r(-331528525576245L);
        AbstractC0295Gu.m625r(-331597245052981L);
    L18:
        return C0829TC.f2620a;
    }

    private final HttpResponse handleStatus() {
        LinkedHashMap r0 = new LinkedHashMap();
        AbstractC2156b r1 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-324987290384437L), AbstractC2508sm.m4986a(AbstractC0295Gu.m625r(-325017355155509L)));
        String r12 = AbstractC0295Gu.m625r(-325030240057397L);
        Boolean r2 = Boolean.valueOf(LuaEngine.INSTANCE.isInitialized());
        int r3 = AbstractC2508sm.f8796a;
        AbstractC2156b r13 = (AbstractC2156b) r0.put(r12, new C0072Bm(r2, false));
        String r14 = AbstractC0295Gu.m625r(-325060304828469L);
        Integer r22 = Integer.valueOf(ScriptManager.INSTANCE.getLoadedScripts().size());
        int r32 = AbstractC2508sm.f8796a;
        AbstractC2156b r15 = (AbstractC2156b) r0.put(r14, new C0072Bm(r22, false));
        String r16 = AbstractC0295Gu.m625r(-325094664566837L);
        Integer r23 = Integer.valueOf(wsConnections.size());
        int r33 = AbstractC2508sm.f8796a;
        AbstractC2156b r17 = (AbstractC2156b) r0.put(r16, new C0072Bm(r23, false));
        String r18 = AbstractC0295Gu.m625r(-325146204174389L);
        Long r24 = Long.valueOf(System.currentTimeMillis());
        int r34 = AbstractC2508sm.f8796a;
        AbstractC2156b r19 = (AbstractC2156b) r0.put(r18, new C0072Bm(r24, false));
        C2157c r110 = new C2157c(r0);
        return new HttpResponse(200, AbstractC0295Gu.m625r(-323539886405685L), r110.toString());
    }

    private final void handleWebSocketMessage(WebSocketConnection r4, String r5) {
        C2157c r52 = parseRequestBody(r5);     // Catch: Exception -> L22
        if (r52 == null) goto L25;
        AbstractC2156b r0 = (AbstractC2156b) r52.get(AbstractC0295Gu.m625r(-317183334807605L));     // Catch: Exception -> L22
        if (r0 == null) goto L8;
        String r02 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r0));     // Catch: Exception -> L22
    L10:
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-317204809644085L)) == false) goto L14;
        r4.send(createWebSocketTextFrame(AbstractC0295Gu.m625r(-316676528666677L)));     // Catch: Exception -> L22
        return;
    L14:
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-316749543110709L)) == false) goto L26;
        AbstractC2156b r53 = (AbstractC2156b) r52.get(AbstractC0295Gu.m625r(-316783902849077L));     // Catch: Exception -> L22
        if (r53 == null) goto L19;
        String r54 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r53));     // Catch: Exception -> L22
        if (r54 == null) goto L19;
    L20:
        mainHandler.post(new RunnableC2260n3(3, r54, r4));     // Catch: Exception -> L22
        return;
    L19:
        r54 = AbstractC0295Gu.m625r(-316805377685557L);     // Catch: Exception -> L22
        goto L20
    L26:
        return;
    L8:
        r02 = null;
        goto L10
    L25:
        return;
    L22:
        AbstractC0295Gu.m625r(-316809672652853L);
        AbstractC0295Gu.m625r(-316878392129589L);
    }

    private static final void handleWebSocketMessage$lambda$24(String r6, WebSocketConnection r7) {
        Object r62 = LuaEngine.INSTANCE.m5465executeIoAF18A(r6);
        LinkedHashMap r0 = new LinkedHashMap();
        AbstractC2156b r1 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-330012402120757L), AbstractC2508sm.m4986a(AbstractC0295Gu.m625r(-330033876957237L)));
        String r12 = AbstractC0295Gu.m625r(-330063941728309L);
        boolean r2 = r62 instanceof C0297Gw;
        Boolean r3 = Boolean.valueOf(!r2);
        int r4 = AbstractC2508sm.f8796a;
        AbstractC2156b r13 = (AbstractC2156b) r0.put(r12, new C0072Bm(r3, false));
        String r14 = AbstractC0295Gu.m625r(-330098301466677L);
        String r32 = null;
        if (r2 == false) goto L5;
        Object r22 = null;
    L6:
        if (r22 == null) goto L8;
        String r23 = r22.toString();
    L9:
        AbstractC2156b r15 = (AbstractC2156b) r0.put(r14, AbstractC2508sm.m4986a(r23));
        String r16 = AbstractC0295Gu.m625r(-330119776303157L);
        Throwable r63 = C0340Hw.m726a(r62);
        if (r63 == null) goto L12;
        r32 = r63.getMessage();
    L12:
        AbstractC2156b r64 = (AbstractC2156b) r0.put(r16, AbstractC2508sm.m4986a(r32));
        executor.execute(new RunnableC2260n3(4, r7, INSTANCE.createWebSocketTextFrame(new C2157c(r0).toString())));
        return;
    L8:
        r23 = null;
        goto L9
    L5:
        r22 = r62;
        goto L6
    }

    private static final void handleWebSocketMessage$lambda$24$lambda$23(WebSocketConnection r4, byte[] r5) {
        r4.send(r5);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        AbstractC0213Ey.m411i(-330394654210101L, -329913617872949L, e);
    }

    private final void handleWebSocketUpgrade(Socket r6, BufferedInputStream r7, BufferedOutputStream r8, HttpRequest r9) {
        String r92 = r9.getHeaders().get(AbstractC0295Gu.m625r(-318927091529781L));
        if (r92 != null) goto L5;
        return;
    L5:
        byte[] r93 = AbstractC0085Bz.m133K(AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-319004400941109L) + generateWebSocketAcceptKey(r92) + AbstractC0295Gu.m625r(-319622876231733L)), AbstractC0295Gu.m625r(-319670120871989L), AbstractC0295Gu.m625r(-319678710806581L)).concat(AbstractC0295Gu.m625r(-318042328266805L)).getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-318055213168693L);
        r8.write(r93);
        r8.flush();
        StringBuilder r94 = new StringBuilder();
        r94.append(r6.getInetAddress());
        r94.append(':');
        r94.append(r6.getPort());
        String r95 = r94.toString();
        WebSocketConnection r0 = new WebSocketConnection(r95, r6, r7, r8);
        wsConnections.put(r95, r0);
        AbstractC0295Gu.m625r(-318115342710837L);
        AbstractC0295Gu.m625r(-318184062187573L);
        broadcastLog(AbstractC0295Gu.m625r(-318278551468085L), AbstractC0295Gu.m625r(-318300026304565L), AbstractC0295Gu.m625r(-317818989967413L) + r95);
        LinkedHashMap r82 = new LinkedHashMap();
        AbstractC2156b r1 = (AbstractC2156b) r82.put(AbstractC0295Gu.m625r(-317900594346037L), AbstractC2508sm.m4986a(AbstractC0295Gu.m625r(-317922069182517L)));
        AbstractC2156b r12 = (AbstractC2156b) r82.put(AbstractC0295Gu.m625r(-317965018855477L), AbstractC2508sm.m4986a(AbstractC0295Gu.m625r(-317999378593845L)));
        AbstractC2156b r13 = (AbstractC2156b) r82.put(AbstractC0295Gu.m625r(-318665098524725L), new C0072Bm(Long.valueOf(System.currentTimeMillis()), false));
        r0.send(createWebSocketTextFrame(new C2157c(r82).toString()));
    L35:
        if (running.get() == false) goto L27;
        if (r6.isClosed() == true) goto L27;
        WebSocketFrame r83 = readWebSocketFrame(r7);     // Catch: Throwable -> L21 Exception -> L23
        if (r83 == null) goto L27;
        int r14 = r83.getOpcode();     // Catch: Throwable -> L21 Exception -> L23
        if (r14 != 1) goto L16;
        handleWebSocketMessage(r0, new String(r83.getPayload(), AbstractC2659w7.f9201a));     // Catch: Throwable -> L21 Exception -> L23
        goto L35
    L16:
        if (r14 == 8) goto L27;
        if (r14 != 9) goto L35;
        r0.send(createWebSocketFrame(10, r83.getPayload()));     // Catch: Throwable -> L21 Exception -> L23
    L27:
        wsConnections.remove(r95);
        r0.close();
        AbstractC0295Gu.m625r(-318708048197685L);
        long r62 = -318776767674421L;
    L28:
        AbstractC0295Gu.m625r(r62);
        return;
    L23:
        e = move-exception;
        AbstractC0295Gu.m625r(-318334386042933L);     // Catch: Throwable -> L21
        AbstractC0295Gu.m625r(-318403105519669L);     // Catch: Throwable -> L21
        e.getMessage();     // Catch: Throwable -> L21
        wsConnections.remove(r95);
        r0.close();
        AbstractC0295Gu.m625r(-318480414930997L);
        r62 = -318549134407733L;
    L21:
        th = move-exception;
        wsConnections.remove(r95);
        r0.close();
        AbstractC0295Gu.m625r(-317007241148469L);
        AbstractC0295Gu.m625r(-317075960625205L);
        throw th;
    }

    private final boolean isWebSocketUpgrade(HttpRequest r5) {
        String r0 = r5.getHeaders().get(AbstractC0295Gu.m625r(-319171904665653L));
        if (r0 == null) goto L5;
        String r02 = r0.toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-319206264404021L);
    L7:
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-319279278848053L)) == false) goto L13;
        String r52 = r5.getHeaders().get(AbstractC0295Gu.m625r(-319322228521013L));
        if (r52 == null) goto L13;
        String r53 = r52.toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-319369473161269L);
        if (AbstractC2564tz.m5051L(r53, AbstractC0295Gu.m625r(-318892731791413L), false) != true) goto L13;
        return true;
    L13:
        return false;
    L5:
        r02 = null;
        goto L7
    }

    private final HttpRequest parseHttpRequest(BufferedInputStream r11) {
        String r0 = readLine(r11);
        if (r0 != null) goto L6;
        return null;
    L6:
        if (AbstractC2564tz.m5059T(r0) == true) goto L41;
        List r02 = AbstractC2564tz.m5065Z(r0, new String[]{AbstractC0295Gu.m625r(-317531227158581L)}, 6);
        if (r02.size() < 2) goto L42;
        int r1 = 0;
        String r3 = (String) r02.get(0);
        String r03 = (String) AbstractC2564tz.m5065Z((CharSequence) r02.get(1), new String[]{AbstractC0295Gu.m625r(-317539817093173L)}, 6).get(0);
        LinkedHashMap r4 = new LinkedHashMap();
    L12:
        String r5 = readLine(r11);
        if (r5 == null) goto L43;
        if (r5.length() == 0) goto L17;
        int r6 = AbstractC2564tz.m5056Q(r5, ':', 0, 6);
        if (r6 <= 0) goto L12;
        String r7 = r5.substring(0, r6);
        AbstractC0295Gu.m625r(-317548407027765L);
        String r72 = AbstractC2564tz.m5070e0(r7).toString().toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-317612831537205L);
        String r52 = r5.substring(r6 + 1);
        AbstractC0295Gu.m625r(-317685845981237L);
        r4.put(r72, AbstractC2564tz.m5070e0(r52).toString());
        goto L12
    L17:
        String r2 = (String) r4.get(AbstractC0295Gu.m625r(-317750270490677L));
        if (r2 == null) goto L22;
        Integer r22 = AbstractC0042Az.m61H(r2);
        if (r22 == null) goto L22;
        r1 = r22.intValue();
    L22:
        if (r1 <= 0) goto L28;
        byte[] r23 = new byte[r1];
        if (readFully(r11, r23, r1) == true) goto L27;
        return null;
    L27:
        String r112 = new String(r23, AbstractC2659w7.f9201a);
    L30:
        return new HttpRequest(r3, r03, r4, r112);
    L28:
        r112 = AbstractC0295Gu.m625r(-317264939186229L);
        goto L30
    L43:
        return null;
    L42:
        return null;
    L41:
        return null;
    }

    private final C2157c parseRequestBody(String r4) {
        Object r0 = null;
        C0029Am r1 = AbstractC2809zm.f9524a;     // Catch: Throwable -> L11
        r1.getClass();     // Catch: Throwable -> L11
        AbstractC2156b r42 = (AbstractC2156b) r1.m4550a(C2637vm.f9146a, r4);     // Catch: Throwable -> L11
        int r12 = AbstractC2508sm.f8796a;     // Catch: Throwable -> L11
        if ((r42 instanceof C2157c) == false) goto L6;
        Object r13 = (C2157c) r42;     // Catch: Throwable -> L11
    L7:
        if (r13 != null) goto L14;
        AbstractC2508sm.m4987b(r42, "JsonObject");     // Catch: Throwable -> L11
        throw null;     // Catch: Throwable -> L11
    L14:
        if ((r13 instanceof C0297Gw) == true) goto L18;
        r0 = r13;
    L18:
        return (C2157c) r0;
    L6:
        r13 = null;
    L11:
        th = move-exception;
        r13 = new C0297Gw(th);
        goto L14
    }

    private final Integer readByte(BufferedInputStream r2) {
        int r22 = r2.read();
        if (r22 != (-1)) goto L7;
        return null;
    L7:
        return Integer.valueOf(r22);
    }

    private final boolean readFully(BufferedInputStream r5, byte[] r6, int r7) {
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L8;
        int r2 = r5.read(r6, r1, r7 - r1);
        if (r2 == (-1)) goto L6;
        r1 = r1 + r2;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    private final String readLine(BufferedInputStream r4) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
    L3:
        int r1 = r4.read();
        if (r1 == (-1)) goto L6;
        if (r1 == 10) goto L14;
        if (r1 == 13) goto L3;
        r0.write(r1);
        goto L3
    L14:
        return r0.toString(AbstractC2659w7.f9201a.name());
    L6:
        if (r0.size() != 0) goto L10;
        return null;
    L10:
        return r0.toString(AbstractC2659w7.f9201a.name());
    }

    private final WebSocketFrame readWebSocketFrame(BufferedInputStream r13) {
        Integer r0 = readByte(r13);
        if (r0 == null) goto L42;
        int r02 = r0.intValue();
        Integer r2 = readByte(r13);
        if (r2 == null) goto L42;
        int r22 = r2.intValue();
        int r03 = r02 & 15;
        int r4 = 0;
        if ((r22 & 128) == 0) goto L9;
        boolean r3 = true;
    L10:
        long r6 = r22 & 127;
        int r23 = (int) r6;
        if (r23 == 126) goto L20;
        if (r23 != 127) goto L26;
        int r24 = 0;
        r6 = 0;
    L15:
        if (r24 >= 8) goto L26;
        Integer r5 = readByte(r13);
        if (r5 == null) goto L19;
        r6 = (r6 << 8) | ((long) r5.intValue());
        r24 = r24 + 1;
        goto L15
    L19:
        return null;
    L26:
        if (r6 <= 2147483647L) goto L29;
        AbstractC0295Gu.m625r(-333027469162549L);
        AbstractC0295Gu.m625r(-333096188639285L);
        return null;
    L29:
        if (r3 == false) goto L33;
        byte[] r32 = new byte[4];
        if (INSTANCE.readFully(r13, r32, 4) == true) goto L34;
        return null;
    L34:
        int r25 = (int) r6;
        byte[] r52 = new byte[r25];
        if (readFully(r13, r52, r25) == true) goto L37;
        return null;
    L37:
        if (r32 == null) goto L41;
    L38:
        if (r4 >= r25) goto L41;
        r52[r4] = (byte) (r52[r4] ^ r32[r4 % 4]);
        r4 = r4 + 1;
    L41:
        return new WebSocketFrame(r03, r52);
    L33:
        r32 = null;
        goto L34
    L20:
        Integer r26 = readByte(r13);
        if (r26 == null) goto L42;
        int r27 = r26.intValue();
        Integer r53 = readByte(r13);
        if (r53 == null) goto L42;
        r6 = (r27 << 8) | r53.intValue();
        goto L26
    L9:
        r3 = false;
    L42:
        return null;
    }

    private final void sendHttpResponse(BufferedOutputStream r6, HttpResponse r7) {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-317269234153525L));
        r0.append(r7.getCode());
        r0.append(' ');
        AbstractC2374ph.m4817n(r0, r7.getStatus(), -317368018401333L);
        String r1 = r7.getBody();
        Charset r2 = AbstractC2659w7.f9201a;
        byte[] r12 = r1.getBytes(r2);
        AbstractC0295Gu.m625r(-333688894126133L);
        r0.append(r12.length);
        r0.append(AbstractC0295Gu.m625r(-333199267854389L));
        byte[] r02 = AbstractC0085Bz.m133K(AbstractC2607uz.m5118D(r0.toString()), AbstractC0295Gu.m625r(-332408993871925L), AbstractC0295Gu.m625r(-332417583806517L)).concat(AbstractC0295Gu.m625r(-332430468708405L)).getBytes(r2);
        AbstractC0295Gu.m625r(-332443353610293L);
        r6.write(r02);
        byte[] r72 = r7.getBody().getBytes(r2);
        AbstractC0295Gu.m625r(-332503483152437L);
        r6.write(r72);
        r6.flush();
    }

    public static /* synthetic */ boolean start$default(CherryDevServer r0, Context r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = DEFAULT_PORT;
    L6:
        return r0.start(r1, r2);
    }

    private static final void start$lambda$0() {
        AbstractC0295Gu.m625r(-331253647669301L);
        AbstractC0295Gu.m625r(-331322367146037L);
        INSTANCE.acceptConnections();
    }

    public final void broadcastLog(String r5, String r6, String r7) {
        AbstractC0295Gu.m625r(-344074125047861L);
        AbstractC0295Gu.m625r(-344099894851637L);
        AbstractC0295Gu.m625r(-344117074720821L);
        if (wsConnections.isEmpty() == false) goto L5;
        return;
    L5:
        LinkedHashMap r0 = new LinkedHashMap();
        AbstractC2156b r1 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-343601678645301L), AbstractC2508sm.m4986a(AbstractC0295Gu.m625r(-343623153481781L)));
        AbstractC2156b r52 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-343640333350965L), AbstractC2508sm.m4986a(r5));
        AbstractC2156b r53 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-343666103154741L), AbstractC2508sm.m4986a(r6));
        AbstractC2156b r54 = (AbstractC2156b) r0.put(AbstractC0295Gu.m625r(-343683283023925L), AbstractC2508sm.m4986a(r7));
        String r55 = AbstractC0295Gu.m625r(-343717642762293L);
        Long r62 = Long.valueOf(System.currentTimeMillis());
        int r72 = AbstractC2508sm.f8796a;
        AbstractC2156b r56 = (AbstractC2156b) r0.put(r55, new C0072Bm(r62, false));
        byte[] r57 = createWebSocketTextFrame(new C2157c(r0).toString());
        executor.execute(new RunnableC0562N2(2, r57));
    }

    public final int getConnectionCount() {
        return wsConnections.size();
    }

    public final int getPort() {
        return port;
    }

    public final String getServerUrl() {
        if (running.get() == true) goto L7;
        return null;
    L7:
        return AbstractC0295Gu.m625r(-343760592435253L) + getLocalIpAddress() + ':' + port;
    }

    public final boolean isRunning() {
        return running.get();
    }

    public final boolean start(Context r4, int r5) {
        AbstractC0295Gu.m625r(-344924528572469L);
        AtomicBoolean r0 = running;
        if (r0.get() == false) goto L6;
        AbstractC0295Gu.m625r(-344941708441653L);
        AbstractC0295Gu.m625r(-343361160476725L);
        return true;
    L6:
        context = r4.getApplicationContext();
        port = r5;
        serverSocket = new ServerSocket(port);     // Catch: Exception -> L9
        r0.set(true);     // Catch: Exception -> L9
        executor.execute(new RunnableC2531t8(0));     // Catch: Exception -> L9
        LogInterceptor.INSTANCE.register(this);     // Catch: Exception -> L9
        return true;
    L9:
        AbstractC0295Gu.m625r(-343511484332085L);
        AbstractC0295Gu.m625r(-343580203808821L);
        return false;
    }

    public final void stop() {
        AtomicBoolean r0 = running;
        if (r0.get() == true) goto L5;
        return;
    L5:
        r0.set(false);
        LogInterceptor.INSTANCE.unregister();
        Collection<WebSocketConnection> r02 = wsConnections.values();
        AbstractC0295Gu.m625r(-343142117144629L);
        Iterator<T> r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L9;
        ((WebSocketConnection) r03.next()).close();
        goto L7
    L9:
        wsConnections.clear();
        ServerSocket r04 = serverSocket;     // Catch: Exception -> L14
        if (r04 == null) goto L15;
        r04.close();     // Catch: Exception -> L14
    L15:
        serverSocket = null;
        AbstractC0295Gu.m625r(-343928096159797L);
        AbstractC0295Gu.m625r(-343996815636533L);
        return;
    L14:
        AbstractC0295Gu.m625r(-343219426555957L);
        AbstractC0295Gu.m625r(-343288146032693L);
        goto L15
    }
}
