package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.C5757c;
import okhttp3.internal.Tags;
import okhttp3.internal.TagsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p172l8.C4700i0;
import p185m8.AbstractC5070c0;
import p372z8.AbstractC9886a;
import p376zd.C10010p0;
import p376zd.C10023w;
import p376zd.C10026x0;
import p376zd.C9981c;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001k\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008f\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\u001f\u0010\"J5\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b\u001f\u0010%J5\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b\u001f\u0010&J\u000f\u0010'\u001a\u00020\u0001H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u000eJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010-J\u000f\u00107\u001a\u00020.H\u0000¢\u0006\u0004\b6\u00100J%\u0010;\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00062\u0006\u00108\u001a\u00020\b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010@\u001a\u00020=2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJK\u0010L\u001a\u0004\u0018\u00010\u000f2\u0006\u0010E\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020\b2\b\b\u0002\u0010G\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\bJ\u0010KJ\u001b\u0010N\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\bM\u0010\u0012J\u0011\u0010R\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0004\bP\u0010QJ\r\u0010S\u001a\u00020\f¢\u0006\u0004\bS\u0010\u000eJ\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u000eJ\u0017\u0010X\u001a\u00020\f2\u0006\u0010U\u001a\u00020\bH\u0000¢\u0006\u0004\bV\u0010WJ\r\u0010Y\u001a\u00020\b¢\u0006\u0004\bY\u0010-J\u000f\u0010[\u001a\u00020\u0015H\u0000¢\u0006\u0004\bZ\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u0010-R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010g\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u0019\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010u\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010S\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010aR(\u0010y\u001a\u0004\u0018\u00010=2\b\u0010u\u001a\u0004\u0018\u00010=8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010aR\u0016\u0010~\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010aR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010aR\u0018\u0010\u0080\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010aR\u0018\u0010\u0081\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010aR\u0018\u0010\u0082\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010aR\u0018\u0010E\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010zR'\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u008c\u0001\u001a\u0014\u0012\u000f\u0012\r \u008b\u0001*\u0005\u0018\u00010\u008a\u00010\u008a\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0090\u0001"}, m16758d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", _UrlKt.FRAGMENT_ENCODE_SET, "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "Ll8/i0;", "callStart", "()V", "Ljava/io/IOException;", "e", "callDone", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "timeoutExit", _UrlKt.FRAGMENT_ENCODE_SET, "toLoggableString", "()Ljava/lang/String;", "Lzd/x0;", "timeout", "()Lzd/x0;", _UrlKt.FRAGMENT_ENCODE_SET, "T", "Lg9/c;", "type", "tag", "(Lg9/c;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lg9/c;La9/a;)Ljava/lang/Object;", "(Ljava/lang/Class;La9/a;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "request", "()Lokhttp3/Request;", "cancel", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "newRoutePlanner", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;ZLokhttp3/internal/http/RealInterceptorChain;)V", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "socketSourceDone", "socketSinkDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "upgradeToSocket", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "redactedUrl$okhttp", "redactedUrl", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "getOriginalRequest", "Z", "getForWebSocket", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "value", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "socketSinkOpen", "socketSourceOpen", "expectMoreExchanges", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plansToCancel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlansToCancel$okhttp", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "kotlin.jvm.PlatformType", "tags", "Ljava/util/concurrent/atomic/AtomicReference;", "AsyncCall", "CallReference", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class RealCall implements Call, Cloneable, Lockable {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;
    private final AtomicReference<Tags> tags;
    private final C57661 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m16758d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "Ll8/i0;", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "failRejected$okhttp", "(Ljava/util/concurrent/RejectedExecutionException;)V", "failRejected", "run", "()V", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", _UrlKt.FRAGMENT_ENCODE_SET, "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void failRejected$okhttp$default(AsyncCall asyncCall, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void executeOn(ExecutorService executorService) {
            executorService.getClass();
            _UtilJvmKt.assertLockNotHeld(this.this$0.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    failRejected$okhttp(e10);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final void failRejected$okhttp(RejectedExecutionException e10) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e10);
            this.this$0.noMoreExchanges$okhttp(interruptedIOException);
            this.responseCallback.onFailure(this.this$0, interruptedIOException);
        }

        /* JADX INFO: renamed from: getCall, reason: from getter */
        public final RealCall getThis$0() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall other) {
            other.getClass();
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            OkHttpClient client;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.timeout.enter();
                boolean z10 = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            client = realCall.getClient();
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (z10) {
                                Platform.INSTANCE.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            client = realCall.getClient();
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            realCall.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            client = realCall.getClient();
                        }
                    } catch (Throwable th2) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m16758d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            realCall.getClass();
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.connection.RealCall$timeout$1, zd.x0] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z10;
        this.connectionPool = okHttpClient.connectionPool().getDelegate();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r52 = new C9981c() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // p376zd.C9981c
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r52.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r52;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.tags = new AtomicReference<>(request.getTags());
    }

    private final IOException callDone(IOException e10) {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z10 = _UtilJvmKt.assertionsEnabled;
        if (z10 && Thread.holdsLock(this)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return null;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                C5757c.m23260a(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
                return null;
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
                realConnection.getConnectionListener().connectionReleased(realConnection, this);
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    realConnection.getConnectionListener().connectionClosed(realConnection);
                }
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                C10010p0.m38820a("Check failed.");
                return null;
            }
        }
        IOException iOExceptionTimeoutExit = timeoutExit(e10);
        EventListener eventListener = this.eventListener;
        if (e10 == null) {
            eventListener.callEnd(this);
            return iOExceptionTimeoutExit;
        }
        iOExceptionTimeoutExit.getClass();
        eventListener.callFailed(this, iOExceptionTimeoutExit);
        return iOExceptionTimeoutExit;
    }

    private final void callStart() {
        this.callStackTrace = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(RealCall realCall, Exchange exchange, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        return realCall.messageDone$okhttp(exchange, z10, z11, z12, z13, iOException);
    }

    private final IOException timeoutExit(IOException cause) {
        if (this.timeoutEarlyExit || !exit()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(redactedUrl$okhttp());
        return sb2.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection connection) {
        connection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", connection);
        } else if (this.connection != null) {
            C10010p0.m38820a("Check failed.");
        } else {
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
        }
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        Iterator<RoutePlanner.Plan> it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().mo39015cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public Call clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback responseCallback) {
        responseCallback.getClass();
        if (!this.executed.compareAndSet(false, true)) {
            C10010p0.m38820a("Already Executed");
        } else {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
        }
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean newRoutePlanner, RealInterceptorChain chain) {
        request.getClass();
        chain.getClass();
        if (this.interceptorScopedExchange != null) {
            C10010p0.m38820a("Check failed.");
            return;
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        if (newRoutePlanner) {
            RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client.getTaskRunner(), this.connectionPool, this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), this.client.pingIntervalMillis(), this.client.retryOnConnectionFailure(), this.client.getFastFallback(), this.client.address(request.url()), this.client.getRouteDatabase(), this, request);
            this.exchangeFinder = this.client.getFastFallback() ? new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner()) : new SequentialExchangeFinder(realRoutePlanner);
        }
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            C10010p0.m38820a("Already Executed");
            return null;
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }

    public final Response getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        AbstractC5070c0.m20492E(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            AbstractC5070c0.m20492E(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(CallServerInterceptor.INSTANCE);
        try {
            try {
                Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (getCanceled()) {
                    _UtilCommonKt.closeQuietly(responseProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (IOException e10) {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e10);
                iOExceptionNoMoreExchanges$okhttp.getClass();
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain chain) throws IOException {
        chain.getClass();
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        C10023w.m38841a("Canceled");
        return null;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    public final IOException messageDone$okhttp(Exchange exchange, boolean requestDone, boolean responseDone, boolean socketSourceDone, boolean socketSinkDone, IOException e10) {
        boolean z10;
        boolean z11;
        exchange.getClass();
        if (AbstractC1061t.m3842c(exchange, this.exchange)) {
            synchronized (this) {
                z10 = false;
                if (requestDone) {
                    try {
                        if (!this.requestBodyOpen) {
                            if ((responseDone || !this.responseBodyOpen) && ((!socketSinkDone || !this.socketSinkOpen) && (!socketSourceDone || !this.socketSourceOpen))) {
                                z11 = false;
                            }
                            C4700i0 c4700i0 = C4700i0.f13910a;
                        }
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        if (socketSinkDone) {
                            this.socketSinkOpen = false;
                        }
                        if (socketSourceDone) {
                            this.socketSourceOpen = false;
                        }
                        boolean z12 = (this.requestBodyOpen || this.responseBodyOpen || this.socketSinkOpen || this.socketSourceOpen) ? false : true;
                        if (z12 && !this.expectMoreExchanges) {
                            z10 = true;
                        }
                        boolean z13 = z12;
                        z11 = z10;
                        z10 = z13;
                        C4700i0 c4700i02 = C4700i0.f13910a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (responseDone) {
                    z11 = false;
                    C4700i0 c4700i022 = C4700i0.f13910a;
                } else {
                    z11 = false;
                    C4700i0 c4700i0222 = C4700i0.f13910a;
                }
            }
            if (z10) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z11) {
                return callDone(e10);
            }
        }
        return e10;
    }

    public final IOException noMoreExchanges$okhttp(IOException e10) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen && !this.socketSourceOpen) {
                        z10 = true;
                    }
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? callDone(e10) : e10;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return null;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC1061t.m3842c(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            C10010p0.m38820a("Check failed.");
            return null;
        }
        calls.remove(i10);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.getJavaNetSocket();
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        Exchange exchange = this.exchange;
        if (exchange == null || !exchange.getHasFailure()) {
            return false;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        Exchange exchange2 = this.exchange;
        return routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null);
    }

    @Override // okhttp3.Call
    public <T> T tag(InterfaceC2549c type) {
        type.getClass();
        return (T) AbstractC9886a.m38367b(type).cast(this.tags.get().get(type));
    }

    @Override // okhttp3.Call
    public C10026x0 timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            C10010p0.m38820a("Check failed.");
        } else {
            this.timeoutEarlyExit = true;
            exit();
        }
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.exchange == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.socketSinkOpen || this.socketSourceOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            this.responseBodyOpen = false;
            this.socketSinkOpen = true;
            this.socketSourceOpen = true;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(AbstractC9886a.m38370e(type));
    }

    @Override // okhttp3.Call
    public <T> T tag(InterfaceC2549c type, InterfaceC0173a computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, type, computeIfAbsent);
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<T> type, InterfaceC0173a computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, AbstractC9886a.m38370e(type), computeIfAbsent);
    }
}
