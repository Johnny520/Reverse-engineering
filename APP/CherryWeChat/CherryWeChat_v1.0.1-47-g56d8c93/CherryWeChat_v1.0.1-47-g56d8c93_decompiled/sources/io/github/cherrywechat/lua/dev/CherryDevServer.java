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
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    private static Context context;
    private static ServerSocket serverSocket;
    private static final String TAG = AbstractC0295Gu.m625r(-330695301920821L);
    public static final CherryDevServer INSTANCE = new CherryDevServer();
    private static final ExecutorService executor = Executors.newCachedThreadPool();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final AtomicBoolean running = new AtomicBoolean(false);
    private static final int DEFAULT_PORT = 9527;
    private static int port = DEFAULT_PORT;
    private static final ConcurrentHashMap<String, WebSocketConnection> wsConnections = new ConcurrentHashMap<>();
    private static final List<LogListener> logListeners = new ArrayList();

    public static final class HttpRequest {
        private final String body;
        private final Map<String, String> headers;
        private final String method;
        private final String path;

        public HttpRequest(String str, String str2, Map<String, String> map, String str3) {
            AbstractC0295Gu.m625r(-345951025756213L);
            AbstractC0295Gu.m625r(-345981090527285L);
            AbstractC0295Gu.m625r(-346002565363765L);
            AbstractC0295Gu.m625r(-346036925102133L);
            this.method = str;
            this.path = str2;
            this.headers = map;
            this.body = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, Map map, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = httpRequest.method;
            }
            if ((i & 2) != 0) {
                str2 = httpRequest.path;
            }
            if ((i & 4) != 0) {
                map = httpRequest.headers;
            }
            if ((i & 8) != 0) {
                str3 = httpRequest.body;
            }
            return httpRequest.copy(str, str2, map, str3);
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

        public final HttpRequest copy(String str, String str2, Map<String, String> map, String str3) {
            AbstractC0295Gu.m625r(-346058399938613L);
            AbstractC0295Gu.m625r(-344439197268021L);
            AbstractC0295Gu.m625r(-344460672104501L);
            AbstractC0295Gu.m625r(-344495031842869L);
            return new HttpRequest(str, str2, map, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HttpRequest)) {
                return false;
            }
            HttpRequest httpRequest = (HttpRequest) obj;
            return AbstractC0585Nj.m1134a(this.method, httpRequest.method) && AbstractC0585Nj.m1134a(this.path, httpRequest.path) && AbstractC0585Nj.m1134a(this.headers, httpRequest.headers) && AbstractC0585Nj.m1134a(this.body, httpRequest.body);
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
            return this.body.hashCode() + ((this.headers.hashCode() + AbstractC2374ph.m4810g(this.path, this.method.hashCode() * 31, 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-344516506679349L));
            AbstractC2374ph.m4817n(sb, this.method, -344602406025269L);
            AbstractC2374ph.m4817n(sb, this.path, -344636765763637L);
            sb.append(this.headers);
            sb.append(AbstractC0295Gu.m625r(-344684010403893L));
            return AbstractC2374ph.m4815l(sb, this.body, ')');
        }
    }

    public static final class HttpResponse {
        private final String body;
        private final int code;
        private final String status;

        public HttpResponse(int i, String str, String str2) {
            AbstractC0295Gu.m625r(-344168614328373L);
            AbstractC0295Gu.m625r(-344198679099445L);
            this.code = i;
            this.status = str;
            this.body = str2;
        }

        public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = httpResponse.code;
            }
            if ((i2 & 2) != 0) {
                str = httpResponse.status;
            }
            if ((i2 & 4) != 0) {
                str2 = httpResponse.body;
            }
            return httpResponse.copy(i, str, str2);
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

        public final HttpResponse copy(int i, String str, String str2) {
            AbstractC0295Gu.m625r(-344220153935925L);
            AbstractC0295Gu.m625r(-344250218706997L);
            return new HttpResponse(i, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HttpResponse)) {
                return false;
            }
            HttpResponse httpResponse = (HttpResponse) obj;
            return this.code == httpResponse.code && AbstractC0585Nj.m1134a(this.status, httpResponse.status) && AbstractC0585Nj.m1134a(this.body, httpResponse.body);
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
            return this.body.hashCode() + AbstractC2374ph.m4810g(this.status, Integer.hashCode(this.code) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-344271693543477L));
            AbstractC0213Ey.m418p(sb, this.code, -344353297922101L);
            AbstractC2374ph.m4817n(sb, this.status, -344396247595061L);
            return AbstractC2374ph.m4815l(sb, this.body, ')');
        }
    }

    public interface LogListener {
        void onLog(String str, String str2, String str3);
    }

    public static final class WebSocketConnection {

        /* JADX INFO: renamed from: id */
        private final String f5561id;
        private final BufferedInputStream input;
        private final BufferedOutputStream output;
        private final Socket socket;

        public WebSocketConnection(String str, Socket socket, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
            AbstractC0295Gu.m625r(-344980363147317L);
            AbstractC0295Gu.m625r(-344993248049205L);
            AbstractC0295Gu.m625r(-345023312820277L);
            AbstractC0295Gu.m625r(-345049082624053L);
            this.f5561id = str;
            this.socket = socket;
            this.input = bufferedInputStream;
            this.output = bufferedOutputStream;
        }

        public final void close() {
            try {
                this.socket.close();
            } catch (Exception unused) {
            }
        }

        public final String getId() {
            return this.f5561id;
        }

        public final synchronized void send(byte[] bArr) {
            AbstractC0295Gu.m625r(-345079147395125L);
            try {
                this.output.write(bArr);
                this.output.flush();
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-345100622231605L);
                AbstractC0295Gu.m625r(-345169341708341L);
            }
        }
    }

    public static final class WebSocketFrame {
        private final int opcode;
        private final byte[] payload;

        public WebSocketFrame(int i, byte[] bArr) {
            AbstractC0295Gu.m625r(-344709780207669L);
            this.opcode = i;
            this.payload = bArr;
        }

        public static /* synthetic */ WebSocketFrame copy$default(WebSocketFrame webSocketFrame, int i, byte[] bArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = webSocketFrame.opcode;
            }
            if ((i2 & 2) != 0) {
                bArr = webSocketFrame.payload;
            }
            return webSocketFrame.copy(i, bArr);
        }

        public final int component1() {
            return this.opcode;
        }

        public final byte[] component2() {
            return this.payload;
        }

        public final WebSocketFrame copy(int i, byte[] bArr) {
            AbstractC0295Gu.m625r(-344744139946037L);
            return new WebSocketFrame(i, bArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebSocketFrame)) {
                return false;
            }
            WebSocketFrame webSocketFrame = (WebSocketFrame) obj;
            return this.opcode == webSocketFrame.opcode && AbstractC0585Nj.m1134a(this.payload, webSocketFrame.payload);
        }

        public final int getOpcode() {
            return this.opcode;
        }

        public final byte[] getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return Arrays.hashCode(this.payload) + (Integer.hashCode(this.opcode) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-344778499684405L));
            AbstractC0213Ey.m418p(sb, this.opcode, -344877283932213L);
            sb.append(Arrays.toString(this.payload));
            sb.append(')');
            return sb.toString();
        }
    }

    private CherryDevServer() {
    }

    private final void acceptConnections() {
        ServerSocket serverSocket2;
        Socket socketAccept;
        while (running.get()) {
            try {
                serverSocket2 = serverSocket;
            } catch (Exception unused) {
                if (running.get()) {
                    AbstractC0295Gu.m625r(-343794952173621L);
                    AbstractC0295Gu.m625r(-343863671650357L);
                }
            }
            if (serverSocket2 != null && (socketAccept = serverSocket2.accept()) != null) {
                executor.execute(new RunnableC0562N2(3, socketAccept));
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptConnections$lambda$5(Socket socket) {
        INSTANCE.handleConnection(socket);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void broadcastLog$lambda$4(byte[] bArr) {
        Collection<WebSocketConnection> collectionValues = wsConnections.values();
        AbstractC0295Gu.m625r(-331438331263029L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            try {
                ((WebSocketConnection) it.next()).send(bArr);
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-330965884860469L, -331034604337205L, e);
            }
        }
    }

    private final byte[] createWebSocketFrame(int i, byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i | 128);
        if (bArr.length < 126) {
            byteArrayOutputStream.write(bArr.length);
        } else if (bArr.length < 65536) {
            byteArrayOutputStream.write(126);
            byteArrayOutputStream.write(bArr.length >> 8);
            byteArrayOutputStream.write(bArr.length & 255);
        } else {
            byteArrayOutputStream.write(127);
            for (int i2 = 7; -1 < i2; i2--) {
                byteArrayOutputStream.write(((int) (((long) bArr.length) >> (i2 * 8))) & 255);
            }
        }
        byteArrayOutputStream.write(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC0295Gu.m625r(-332954454718517L);
        return byteArray;
    }

    private final byte[] createWebSocketTextFrame(String str) {
        byte[] bytes = str.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-332894325176373L);
        return createWebSocketFrame(1, bytes);
    }

    private final String generateWebSocketAcceptKey(String str) throws NoSuchAlgorithmException {
        String strM625r = AbstractC0295Gu.m625r(-332563612694581L);
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-332172770670645L));
        byte[] bytes = AbstractC0213Ey.m407e(str, strM625r).getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-332198540474421L);
        String strEncodeToString = Base64.getEncoder().encodeToString(messageDigest.digest(bytes));
        AbstractC0295Gu.m625r(-332258670016565L);
        return strEncodeToString;
    }

    private final String getLocalIpAddress() {
        Enumeration<NetworkInterface> networkInterfaces;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-332718231517237L);
            AbstractC0295Gu.m625r(-332786950993973L);
        }
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                    String hostAddress = ((Inet4Address) inetAddressNextElement).getHostAddress();
                    return hostAddress == null ? AbstractC0295Gu.m625r(-332675281844277L) : hostAddress;
                }
                return AbstractC0295Gu.m625r(-332859965438005L);
            }
        }
        return AbstractC0295Gu.m625r(-332859965438005L);
    }

    private final void handleConnection(Socket socket) {
        try {
            socket.setSoTimeout(30000);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            HttpRequest httpRequest = parseHttpRequest(bufferedInputStream);
            if (httpRequest == null) {
                socket.close();
            } else if (isWebSocketUpgrade(httpRequest)) {
                handleWebSocketUpgrade(socket, bufferedInputStream, bufferedOutputStream, httpRequest);
            } else {
                handleHttpRequest(socket, bufferedOutputStream, httpRequest);
            }
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-324678052739125L);
            AbstractC0295Gu.m625r(-324746772215861L);
            try {
                socket.close();
            } catch (Exception unused2) {
            }
        }
    }

    private final void handleHttpRequest(Socket socket, BufferedOutputStream bufferedOutputStream, HttpRequest httpRequest) throws IOException {
        sendHttpResponse(bufferedOutputStream, (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-324819786659893L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-324871326267445L))) ? handleStatus() : (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-324888506136629L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-324411764766773L))) ? handleScriptList() : (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-324428944635957L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-324510549014581L))) ? handleScriptUpload(httpRequest) : (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-324532023851061L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-324617923196981L))) ? handleScriptExecute(httpRequest) : (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-325189153847349L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-325270758225973L))) ? handleScriptReload(httpRequest) : (AbstractC0585Nj.m1134a(httpRequest.getPath(), AbstractC0295Gu.m625r(-325292233062453L)) && AbstractC0585Nj.m1134a(httpRequest.getMethod(), AbstractC0295Gu.m625r(-325373837441077L))) ? handleScriptDelete(httpRequest) : new HttpResponse(404, AbstractC0295Gu.m625r(-325395312277557L), AbstractC0295Gu.m625r(-325438261950517L)));
        socket.close();
    }

    private final HttpResponse handleScriptDelete(HttpRequest httpRequest) {
        String strM625r;
        String strM625r2;
        try {
            C2157c requestBody = parseRequestBody(httpRequest.getBody());
            if (requestBody == null) {
                return new HttpResponse(400, AbstractC0295Gu.m625r(-320958611060789L), AbstractC0295Gu.m625r(-321010150668341L));
            }
            AbstractC2156b abstractC2156b = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-320572064004149L));
            if (abstractC2156b == null || (strM625r = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b))) == null) {
                strM625r = AbstractC0295Gu.m625r(-320584948906037L);
            }
            AbstractC2156b abstractC2156b2 = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-320589243873333L));
            if (abstractC2156b2 == null || (strM625r2 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b2))) == null) {
                strM625r2 = AbstractC0295Gu.m625r(-320610718709813L);
            }
            if (strM625r.length() > 0) {
                ScriptManager.INSTANCE.unloadScript(strM625r);
            }
            if (strM625r2.length() > 0) {
                new File(strM625r2).delete();
            }
            return new HttpResponse(200, AbstractC0295Gu.m625r(-320615013677109L), AbstractC0295Gu.m625r(-320627898578997L));
        } catch (Exception e) {
            return new HttpResponse(400, AbstractC0295Gu.m625r(-320705207990325L), AbstractC0295Gu.m625r(-320756747597877L) + e.getMessage() + AbstractC0295Gu.m625r(-319159019763765L));
        }
    }

    private final HttpResponse handleScriptExecute(HttpRequest httpRequest) {
        String strM4988c;
        try {
            C2157c requestBody = parseRequestBody(httpRequest.getBody());
            if (requestBody == null) {
                return new HttpResponse(400, AbstractC0295Gu.m625r(-322766792292405L), AbstractC0295Gu.m625r(-322818331899957L));
            }
            AbstractC2156b abstractC2156b = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-322930001049653L));
            if (abstractC2156b != null && (strM4988c = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b))) != null) {
                C0382Iv c0382Iv = new C0382Iv();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                mainHandler.post(new RunnableC2445r8(strM4988c, c0382Iv, countDownLatch));
                countDownLatch.await(10L, TimeUnit.SECONDS);
                String strM625r = AbstractC0295Gu.m625r(-321465417201717L);
                String strM625r2 = (String) c0382Iv.f1315a;
                if (strM625r2 == null) {
                    strM625r2 = AbstractC0295Gu.m625r(-321478302103605L);
                }
                return new HttpResponse(200, strM625r, strM625r2);
            }
            return new HttpResponse(400, AbstractC0295Gu.m625r(-322951475886133L), AbstractC0295Gu.m625r(-321353748052021L));
        } catch (Exception e) {
            return new HttpResponse(400, AbstractC0295Gu.m625r(-321568496416821L), AbstractC0295Gu.m625r(-321070280210485L) + e.getMessage() + AbstractC0295Gu.m625r(-321121819818037L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScriptExecute$lambda$20(String str, C0382Iv c0382Iv, CountDownLatch countDownLatch) {
        try {
            Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strM625r = AbstractC0295Gu.m625r(-330244330354741L);
            Boolean boolValueOf = Boolean.valueOf(!(objM5465executeIoAF18A instanceof C0297Gw));
            int i = AbstractC2508sm.f8796a;
            if (objM5465executeIoAF18A instanceof C0297Gw) {
                String strM625r2 = AbstractC0295Gu.m625r(-330308754864181L);
                Throwable thM726a = C0340Hw.m726a(objM5465executeIoAF18A);
            } else {
                String strM625r3 = AbstractC0295Gu.m625r(-330278690093109L);
                if (objM5465executeIoAF18A instanceof C0297Gw) {
                    objM5465executeIoAF18A = null;
                }
            }
            c0382Iv.f1315a = new C2157c(linkedHashMap).toString();
        } catch (Exception e) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String strM625r4 = AbstractC0295Gu.m625r(-330334524667957L);
            Boolean bool = Boolean.FALSE;
            int i2 = AbstractC2508sm.f8796a;
            c0382Iv.f1315a = new C2157c(linkedHashMap2).toString();
        }
        countDownLatch.countDown();
    }

    private final HttpResponse handleScriptList() {
        List<LoadedScript> loadedScripts = ScriptManager.INSTANCE.getLoadedScripts();
        ArrayList arrayList = new ArrayList();
        for (LoadedScript loadedScript : loadedScripts) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            arrayList.add(new C2157c(linkedHashMap));
        }
        C2155a c2155a = new C2155a(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        return new HttpResponse(200, AbstractC0295Gu.m625r(-323668735424565L), new C2157c(linkedHashMap2).toString());
    }

    private final HttpResponse handleScriptReload(HttpRequest httpRequest) {
        String strM625r;
        String strM625r2;
        try {
            C2157c requestBody = parseRequestBody(httpRequest.getBody());
            if (requestBody == null) {
                return new HttpResponse(400, AbstractC0295Gu.m625r(-321134704719925L), AbstractC0295Gu.m625r(-321186244327477L));
            }
            AbstractC2156b abstractC2156b = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-321297913477173L));
            if (abstractC2156b == null || (strM625r = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b))) == null) {
                strM625r = AbstractC0295Gu.m625r(-321319388313653L);
            }
            AbstractC2156b abstractC2156b2 = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-321323683280949L));
            if (abstractC2156b2 == null || (strM625r2 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b2))) == null) {
                strM625r2 = AbstractC0295Gu.m625r(-321886323996725L);
            }
            if (strM625r2.length() > 0) {
                ScriptManager scriptManager = ScriptManager.INSTANCE;
                LoadedScript script = scriptManager.getScript(strM625r2);
                if (script != null) {
                    scriptManager.unloadScript(strM625r2);
                    Context context2 = context;
                    if (context2 == null) {
                        return new HttpResponse(500, AbstractC0295Gu.m625r(-321890618964021L), AbstractC0295Gu.m625r(-321916388767797L));
                    }
                    ScriptManager.loadAndExecute$default(scriptManager, context2, new File(script.getFilePath()), false, null, 12, null);
                    broadcastLog(AbstractC0295Gu.m625r(-322019467982901L), AbstractC0295Gu.m625r(-322040942819381L), AbstractC0295Gu.m625r(-322109662296117L) + script.getName());
                    return new HttpResponse(200, AbstractC0295Gu.m625r(-321637215893557L), AbstractC0295Gu.m625r(-321650100795445L));
                }
            } else if (strM625r.length() > 0) {
                File file = new File(strM625r);
                if (file.exists()) {
                    Context context3 = context;
                    if (context3 == null) {
                        return new HttpResponse(500, AbstractC0295Gu.m625r(-321826194454581L), AbstractC0295Gu.m625r(-321851964258357L));
                    }
                    ScriptManager.loadAndExecute$default(ScriptManager.INSTANCE, context3, file, false, null, 12, null);
                    broadcastLog(AbstractC0295Gu.m625r(-320305776031797L), AbstractC0295Gu.m625r(-320327250868277L), AbstractC0295Gu.m625r(-320395970345013L) + file.getName());
                    return new HttpResponse(200, AbstractC0295Gu.m625r(-320473279756341L), AbstractC0295Gu.m625r(-320486164658229L));
                }
            }
            return new HttpResponse(400, AbstractC0295Gu.m625r(-320112502503477L), AbstractC0295Gu.m625r(-320164042111029L));
        } catch (Exception e) {
            return new HttpResponse(400, AbstractC0295Gu.m625r(-320842646943797L), AbstractC0295Gu.m625r(-320894186551349L) + e.getMessage() + AbstractC0295Gu.m625r(-320945726158901L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpResponse handleScriptUpload(HttpRequest httpRequest) {
        String strM4988c;
        String strM4988c2;
        boolean zBooleanValue;
        String strM4988c3;
        try {
            C2157c requestBody = parseRequestBody(httpRequest.getBody());
            if (requestBody == null) {
                return new HttpResponse(400, AbstractC0295Gu.m625r(-323681620326453L), AbstractC0295Gu.m625r(-323733159934005L));
            }
            AbstractC2156b abstractC2156b = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-323295073269813L));
            if (abstractC2156b != null && (strM4988c = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b))) != null) {
                AbstractC2156b abstractC2156b2 = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-323514116601909L));
                if (abstractC2156b2 != null && (strM4988c2 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b2))) != null) {
                    AbstractC2156b abstractC2156b3 = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-324274325813301L));
                    Object obj = null;
                    if (abstractC2156b3 == null || (strM4988c3 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b3))) == null) {
                        zBooleanValue = true;
                    } else {
                        Boolean bool = strM4988c3.equals("true") ? Boolean.TRUE : strM4988c3.equals("false") ? Boolean.FALSE : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                    }
                    Context context2 = context;
                    if (context2 == null) {
                        return new HttpResponse(500, AbstractC0295Gu.m625r(-324325865420853L), AbstractC0295Gu.m625r(-324351635224629L));
                    }
                    File file = new File(context2.getFilesDir(), AbstractC0295Gu.m625r(-323904958625845L));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, strM4988c);
                    AbstractC2675wh.m5246i0(file2, strM4988c2);
                    Iterator<T> it = ScriptManager.INSTANCE.getLoadedScripts().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (AbstractC0585Nj.m1134a(((LoadedScript) next).getFilePath(), file2.getAbsolutePath())) {
                            obj = next;
                            break;
                        }
                    }
                    LoadedScript loadedScript = (LoadedScript) obj;
                    if (loadedScript != null) {
                        ScriptManager.INSTANCE.unloadScript(loadedScript.getId());
                        broadcastLog(AbstractC0295Gu.m625r(-323956498233397L), AbstractC0295Gu.m625r(-323977973069877L), AbstractC0295Gu.m625r(-324046692546613L) + strM4988c);
                    }
                    broadcastLog(AbstractC0295Gu.m625r(-322513389221941L), AbstractC0295Gu.m625r(-322534864058421L), AbstractC0295Gu.m625r(-322603583535157L) + strM4988c + AbstractC0295Gu.m625r(-322680892946485L) + zBooleanValue + ')');
                    int i = 0;
                    if (zBooleanValue) {
                        broadcastLog(AbstractC0295Gu.m625r(-322195561642037L), AbstractC0295Gu.m625r(-322221331445813L), AbstractC0295Gu.m625r(-322290050922549L) + strM4988c);
                        mainHandler.post(new RunnableC2445r8(context2, file2, strM4988c, i));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strM625r = AbstractC0295Gu.m625r(-322410310006837L);
                    Boolean bool2 = Boolean.TRUE;
                    int i2 = AbstractC2508sm.f8796a;
                    String strM625r2 = AbstractC0295Gu.m625r(-323015900395573L);
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC0295Gu.m625r(-323050260133941L));
                    sb.append(zBooleanValue ? AbstractC0295Gu.m625r(-323118979610677L) : AbstractC0295Gu.m625r(-323183404120117L));
                    return new HttpResponse(200, AbstractC0295Gu.m625r(-323187699087413L), new C2157c(linkedHashMap).toString());
                }
                return new HttpResponse(400, AbstractC0295Gu.m625r(-324098232154165L), AbstractC0295Gu.m625r(-324149771761717L));
            }
            return new HttpResponse(400, AbstractC0295Gu.m625r(-323333727975477L), AbstractC0295Gu.m625r(-323385267583029L));
        } catch (Exception e) {
            return new HttpResponse(400, AbstractC0295Gu.m625r(-323200583989301L), AbstractC0295Gu.m625r(-323252123596853L) + e.getMessage() + AbstractC0295Gu.m625r(-322753907390517L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScriptUpload$lambda$16(Context context2, File file, String str) {
        if (ScriptManager.INSTANCE.loadAndExecute(context2, file, false, new C2488s8(str, 0)) == null) {
            INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331696029300789L), AbstractC0295Gu.m625r(-331721799104565L), AbstractC0295Gu.m625r(-330141251139637L) + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC handleScriptUpload$lambda$16$lambda$15(String str, C0340Hw c0340Hw) {
        String strM625r;
        String string;
        Object obj = c0340Hw.f1148a;
        if (!(obj instanceof C0297Gw)) {
            if (obj == null || (string = obj.toString()) == null) {
                strM625r = AbstractC0295Gu.m625r(-331133388585013L);
            } else {
                int length = string.length();
                if (100 <= length) {
                    length = 100;
                }
                strM625r = string.substring(0, length);
            }
            INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331159158388789L), AbstractC0295Gu.m625r(-331180633225269L), AbstractC0295Gu.m625r(-331799108515893L) + str + AbstractC0295Gu.m625r(-331876417927221L) + strM625r);
        }
        Throwable thM726a = C0340Hw.m726a(obj);
        if (thM726a != null) {
            INSTANCE.broadcastLog(AbstractC0295Gu.m625r(-331897892763701L), AbstractC0295Gu.m625r(-331923662567477L), AbstractC0295Gu.m625r(-331992382044213L) + str + AbstractC0295Gu.m625r(-331511345707061L) + thM726a.getMessage());
            AbstractC0295Gu.m625r(-331528525576245L);
            AbstractC0295Gu.m625r(-331597245052981L);
        }
        return C0829TC.f2620a;
    }

    private final HttpResponse handleStatus() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM625r = AbstractC0295Gu.m625r(-325030240057397L);
        Boolean boolValueOf = Boolean.valueOf(LuaEngine.INSTANCE.isInitialized());
        int i = AbstractC2508sm.f8796a;
        String strM625r2 = AbstractC0295Gu.m625r(-325060304828469L);
        Integer numValueOf = Integer.valueOf(ScriptManager.INSTANCE.getLoadedScripts().size());
        int i2 = AbstractC2508sm.f8796a;
        String strM625r3 = AbstractC0295Gu.m625r(-325094664566837L);
        Integer numValueOf2 = Integer.valueOf(wsConnections.size());
        int i3 = AbstractC2508sm.f8796a;
        String strM625r4 = AbstractC0295Gu.m625r(-325146204174389L);
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        int i4 = AbstractC2508sm.f8796a;
        return new HttpResponse(200, AbstractC0295Gu.m625r(-323539886405685L), new C2157c(linkedHashMap).toString());
    }

    private final void handleWebSocketMessage(WebSocketConnection webSocketConnection, String str) {
        String strM625r;
        try {
            C2157c requestBody = parseRequestBody(str);
            if (requestBody == null) {
                return;
            }
            AbstractC2156b abstractC2156b = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-317183334807605L));
            String strM4988c = abstractC2156b != null ? AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b)) : null;
            if (AbstractC0585Nj.m1134a(strM4988c, AbstractC0295Gu.m625r(-317204809644085L))) {
                webSocketConnection.send(createWebSocketTextFrame(AbstractC0295Gu.m625r(-316676528666677L)));
                return;
            }
            if (AbstractC0585Nj.m1134a(strM4988c, AbstractC0295Gu.m625r(-316749543110709L))) {
                AbstractC2156b abstractC2156b2 = (AbstractC2156b) requestBody.get(AbstractC0295Gu.m625r(-316783902849077L));
                if (abstractC2156b2 == null || (strM625r = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(abstractC2156b2))) == null) {
                    strM625r = AbstractC0295Gu.m625r(-316805377685557L);
                }
                mainHandler.post(new RunnableC2260n3(3, strM625r, webSocketConnection));
            }
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-316809672652853L);
            AbstractC0295Gu.m625r(-316878392129589L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleWebSocketMessage$lambda$24(String str, WebSocketConnection webSocketConnection) {
        Object objM5465executeIoAF18A = LuaEngine.INSTANCE.m5465executeIoAF18A(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM625r = AbstractC0295Gu.m625r(-330063941728309L);
        boolean z = objM5465executeIoAF18A instanceof C0297Gw;
        Boolean boolValueOf = Boolean.valueOf(!z);
        int i = AbstractC2508sm.f8796a;
        String strM625r2 = AbstractC0295Gu.m625r(-330098301466677L);
        Object obj = z ? null : objM5465executeIoAF18A;
        String strM625r3 = AbstractC0295Gu.m625r(-330119776303157L);
        Throwable thM726a = C0340Hw.m726a(objM5465executeIoAF18A);
        executor.execute(new RunnableC2260n3(4, webSocketConnection, INSTANCE.createWebSocketTextFrame(new C2157c(linkedHashMap).toString())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleWebSocketMessage$lambda$24$lambda$23(WebSocketConnection webSocketConnection, byte[] bArr) {
        try {
            webSocketConnection.send(bArr);
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-330394654210101L, -329913617872949L, e);
        }
    }

    private final void handleWebSocketUpgrade(Socket socket, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, HttpRequest httpRequest) throws NoSuchAlgorithmException, IOException {
        long j;
        WebSocketFrame webSocketFrame;
        String str = httpRequest.getHeaders().get(AbstractC0295Gu.m625r(-318927091529781L));
        if (str == null) {
            return;
        }
        byte[] bytes = AbstractC0085Bz.m133K(AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-319004400941109L) + generateWebSocketAcceptKey(str) + AbstractC0295Gu.m625r(-319622876231733L)), AbstractC0295Gu.m625r(-319670120871989L), AbstractC0295Gu.m625r(-319678710806581L)).concat(AbstractC0295Gu.m625r(-318042328266805L)).getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-318055213168693L);
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        StringBuilder sb = new StringBuilder();
        sb.append(socket.getInetAddress());
        sb.append(':');
        sb.append(socket.getPort());
        String string = sb.toString();
        WebSocketConnection webSocketConnection = new WebSocketConnection(string, socket, bufferedInputStream, bufferedOutputStream);
        wsConnections.put(string, webSocketConnection);
        AbstractC0295Gu.m625r(-318115342710837L);
        AbstractC0295Gu.m625r(-318184062187573L);
        broadcastLog(AbstractC0295Gu.m625r(-318278551468085L), AbstractC0295Gu.m625r(-318300026304565L), AbstractC0295Gu.m625r(-317818989967413L) + string);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        webSocketConnection.send(createWebSocketTextFrame(new C2157c(linkedHashMap).toString()));
        while (running.get() && !socket.isClosed() && (webSocketFrame = readWebSocketFrame(bufferedInputStream)) != null) {
            try {
                try {
                    int opcode = webSocketFrame.getOpcode();
                    if (opcode == 1) {
                        handleWebSocketMessage(webSocketConnection, new String(webSocketFrame.getPayload(), AbstractC2659w7.f9201a));
                    } else if (opcode == 8) {
                        break;
                    } else if (opcode == 9) {
                        webSocketConnection.send(createWebSocketFrame(10, webSocketFrame.getPayload()));
                    }
                } catch (Exception e) {
                    AbstractC0295Gu.m625r(-318334386042933L);
                    AbstractC0295Gu.m625r(-318403105519669L);
                    e.getMessage();
                    wsConnections.remove(string);
                    webSocketConnection.close();
                    AbstractC0295Gu.m625r(-318480414930997L);
                    j = -318549134407733L;
                }
            } catch (Throwable th) {
                wsConnections.remove(string);
                webSocketConnection.close();
                AbstractC0295Gu.m625r(-317007241148469L);
                AbstractC0295Gu.m625r(-317075960625205L);
                throw th;
            }
        }
        wsConnections.remove(string);
        webSocketConnection.close();
        AbstractC0295Gu.m625r(-318708048197685L);
        j = -318776767674421L;
        AbstractC0295Gu.m625r(j);
    }

    private final boolean isWebSocketUpgrade(HttpRequest httpRequest) {
        String lowerCase;
        String str;
        String str2 = httpRequest.getHeaders().get(AbstractC0295Gu.m625r(-319171904665653L));
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
            AbstractC0295Gu.m625r(-319206264404021L);
        } else {
            lowerCase = null;
        }
        if (AbstractC0585Nj.m1134a(lowerCase, AbstractC0295Gu.m625r(-319279278848053L)) && (str = httpRequest.getHeaders().get(AbstractC0295Gu.m625r(-319322228521013L))) != null) {
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            AbstractC0295Gu.m625r(-319369473161269L);
            if (AbstractC2564tz.m5051L(lowerCase2, AbstractC0295Gu.m625r(-318892731791413L), false)) {
                return true;
            }
        }
        return false;
    }

    private final HttpRequest parseHttpRequest(BufferedInputStream bufferedInputStream) throws IOException {
        String strM625r;
        Integer numM61H;
        String line = readLine(bufferedInputStream);
        if (line == null || AbstractC2564tz.m5059T(line)) {
            return null;
        }
        List listM5065Z = AbstractC2564tz.m5065Z(line, new String[]{AbstractC0295Gu.m625r(-317531227158581L)}, 6);
        if (listM5065Z.size() < 2) {
            return null;
        }
        int iIntValue = 0;
        String str = (String) listM5065Z.get(0);
        String str2 = (String) AbstractC2564tz.m5065Z((CharSequence) listM5065Z.get(1), new String[]{AbstractC0295Gu.m625r(-317539817093173L)}, 6).get(0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            String line2 = readLine(bufferedInputStream);
            if (line2 == null) {
                return null;
            }
            if (line2.length() == 0) {
                String str3 = (String) linkedHashMap.get(AbstractC0295Gu.m625r(-317750270490677L));
                if (str3 != null && (numM61H = AbstractC0042Az.m61H(str3)) != null) {
                    iIntValue = numM61H.intValue();
                }
                if (iIntValue > 0) {
                    byte[] bArr = new byte[iIntValue];
                    if (!readFully(bufferedInputStream, bArr, iIntValue)) {
                        return null;
                    }
                    strM625r = new String(bArr, AbstractC2659w7.f9201a);
                } else {
                    strM625r = AbstractC0295Gu.m625r(-317264939186229L);
                }
                return new HttpRequest(str, str2, linkedHashMap, strM625r);
            }
            int iM5056Q = AbstractC2564tz.m5056Q(line2, ':', 0, 6);
            if (iM5056Q > 0) {
                String strSubstring = line2.substring(0, iM5056Q);
                AbstractC0295Gu.m625r(-317548407027765L);
                String lowerCase = AbstractC2564tz.m5070e0(strSubstring).toString().toLowerCase(Locale.ROOT);
                AbstractC0295Gu.m625r(-317612831537205L);
                String strSubstring2 = line2.substring(iM5056Q + 1);
                AbstractC0295Gu.m625r(-317685845981237L);
                linkedHashMap.put(lowerCase, AbstractC2564tz.m5070e0(strSubstring2).toString());
            }
        }
    }

    private final C2157c parseRequestBody(String str) {
        Object c0297Gw;
        try {
            C0029Am c0029Am = AbstractC2809zm.f9524a;
            c0029Am.getClass();
            AbstractC2156b abstractC2156b = (AbstractC2156b) c0029Am.m4550a(C2637vm.f9146a, str);
            int i = AbstractC2508sm.f8796a;
            c0297Gw = abstractC2156b instanceof C2157c ? (C2157c) abstractC2156b : null;
            if (c0297Gw == null) {
                AbstractC2508sm.m4987b(abstractC2156b, "JsonObject");
                throw null;
            }
        } catch (Throwable th) {
            c0297Gw = new C0297Gw(th);
        }
        return (C2157c) (c0297Gw instanceof C0297Gw ? null : c0297Gw);
    }

    private final Integer readByte(BufferedInputStream bufferedInputStream) throws IOException {
        int i = bufferedInputStream.read();
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    private final boolean readFully(BufferedInputStream bufferedInputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = bufferedInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                return false;
            }
            i2 += i3;
        }
        return true;
    }

    private final String readLine(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = bufferedInputStream.read();
            if (i == -1) {
                if (byteArrayOutputStream.size() == 0) {
                    return null;
                }
                return byteArrayOutputStream.toString(AbstractC2659w7.f9201a.name());
            }
            if (i == 10) {
                return byteArrayOutputStream.toString(AbstractC2659w7.f9201a.name());
            }
            if (i != 13) {
                byteArrayOutputStream.write(i);
            }
        }
    }

    private final WebSocketFrame readWebSocketFrame(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr;
        Integer num = readByte(bufferedInputStream);
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = readByte(bufferedInputStream);
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                int i = iIntValue & 15;
                boolean z = (iIntValue2 & 128) != 0;
                long jIntValue = iIntValue2 & 127;
                int i2 = (int) jIntValue;
                if (i2 == 126) {
                    Integer num3 = readByte(bufferedInputStream);
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        Integer num4 = readByte(bufferedInputStream);
                        if (num4 != null) {
                            jIntValue = (iIntValue3 << 8) | num4.intValue();
                        }
                    }
                } else if (i2 == 127) {
                    jIntValue = 0;
                    for (int i3 = 0; i3 < 8; i3++) {
                        Integer num5 = readByte(bufferedInputStream);
                        if (num5 == null) {
                            return null;
                        }
                        jIntValue = (jIntValue << 8) | ((long) num5.intValue());
                    }
                }
                if (jIntValue > 2147483647L) {
                    AbstractC0295Gu.m625r(-333027469162549L);
                    AbstractC0295Gu.m625r(-333096188639285L);
                    return null;
                }
                if (z) {
                    bArr = new byte[4];
                    if (!INSTANCE.readFully(bufferedInputStream, bArr, 4)) {
                        return null;
                    }
                } else {
                    bArr = null;
                }
                int i4 = (int) jIntValue;
                byte[] bArr2 = new byte[i4];
                if (!readFully(bufferedInputStream, bArr2, i4)) {
                    return null;
                }
                if (bArr != null) {
                    for (int i5 = 0; i5 < i4; i5++) {
                        bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i5 % 4]);
                    }
                }
                return new WebSocketFrame(i, bArr2);
            }
        }
        return null;
    }

    private final void sendHttpResponse(BufferedOutputStream bufferedOutputStream, HttpResponse httpResponse) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-317269234153525L));
        sb.append(httpResponse.getCode());
        sb.append(' ');
        AbstractC2374ph.m4817n(sb, httpResponse.getStatus(), -317368018401333L);
        String body = httpResponse.getBody();
        Charset charset = AbstractC2659w7.f9201a;
        byte[] bytes = body.getBytes(charset);
        AbstractC0295Gu.m625r(-333688894126133L);
        sb.append(bytes.length);
        sb.append(AbstractC0295Gu.m625r(-333199267854389L));
        byte[] bytes2 = AbstractC0085Bz.m133K(AbstractC2607uz.m5118D(sb.toString()), AbstractC0295Gu.m625r(-332408993871925L), AbstractC0295Gu.m625r(-332417583806517L)).concat(AbstractC0295Gu.m625r(-332430468708405L)).getBytes(charset);
        AbstractC0295Gu.m625r(-332443353610293L);
        bufferedOutputStream.write(bytes2);
        byte[] bytes3 = httpResponse.getBody().getBytes(charset);
        AbstractC0295Gu.m625r(-332503483152437L);
        bufferedOutputStream.write(bytes3);
        bufferedOutputStream.flush();
    }

    public static /* synthetic */ boolean start$default(CherryDevServer cherryDevServer, Context context2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = DEFAULT_PORT;
        }
        return cherryDevServer.start(context2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0() {
        AbstractC0295Gu.m625r(-331253647669301L);
        AbstractC0295Gu.m625r(-331322367146037L);
        INSTANCE.acceptConnections();
    }

    public final void broadcastLog(String str, String str2, String str3) {
        AbstractC0295Gu.m625r(-344074125047861L);
        AbstractC0295Gu.m625r(-344099894851637L);
        AbstractC0295Gu.m625r(-344117074720821L);
        if (wsConnections.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM625r = AbstractC0295Gu.m625r(-343717642762293L);
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        int i = AbstractC2508sm.f8796a;
        executor.execute(new RunnableC0562N2(2, createWebSocketTextFrame(new C2157c(linkedHashMap).toString())));
    }

    public final int getConnectionCount() {
        return wsConnections.size();
    }

    public final int getPort() {
        return port;
    }

    public final String getServerUrl() {
        if (!running.get()) {
            return null;
        }
        return AbstractC0295Gu.m625r(-343760592435253L) + getLocalIpAddress() + ':' + port;
    }

    public final boolean isRunning() {
        return running.get();
    }

    public final boolean start(Context context2, int i) {
        AbstractC0295Gu.m625r(-344924528572469L);
        AtomicBoolean atomicBoolean = running;
        if (atomicBoolean.get()) {
            AbstractC0295Gu.m625r(-344941708441653L);
            AbstractC0295Gu.m625r(-343361160476725L);
            return true;
        }
        context = context2.getApplicationContext();
        port = i;
        try {
            serverSocket = new ServerSocket(port);
            atomicBoolean.set(true);
            executor.execute(new RunnableC2531t8(0));
            LogInterceptor.INSTANCE.register(this);
            return true;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-343511484332085L);
            AbstractC0295Gu.m625r(-343580203808821L);
            return false;
        }
    }

    public final void stop() {
        AtomicBoolean atomicBoolean = running;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            LogInterceptor.INSTANCE.unregister();
            Collection<WebSocketConnection> collectionValues = wsConnections.values();
            AbstractC0295Gu.m625r(-343142117144629L);
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((WebSocketConnection) it.next()).close();
            }
            wsConnections.clear();
            try {
                ServerSocket serverSocket2 = serverSocket;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                }
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-343219426555957L);
                AbstractC0295Gu.m625r(-343288146032693L);
            }
            serverSocket = null;
            AbstractC0295Gu.m625r(-343928096159797L);
            AbstractC0295Gu.m625r(-343996815636533L);
        }
    }
}
