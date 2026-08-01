package okhttp3.internal;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.C5792j;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1057r;
import p024b9.AbstractC1061t;
import p024b9.C1062t0;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p185m8.AbstractC5101q0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p299ub.AbstractC8621f0;
import p299ub.C8614c;
import p314vb.C8895b;
import p376zd.C9995i;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000Ä\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010'\u001a\u00020\u0002*\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010/\u001a\u00020\u0002*\u00020-2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u0010/\u001a\u000201*\u00020\u0010H\u0000¢\u0006\u0004\b/\u00102\u001a#\u00104\u001a\u00020\u0002*\u00020-2\u0006\u00103\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u00100\u001a\u001b\u00107\u001a\u00020\u0002*\u0002052\u0006\u00106\u001a\u00020\u0010H\u0000¢\u0006\u0004\b7\u00108\u001a)\u0010;\u001a\u0002012\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010:\u001a\b\u0012\u0004\u0012\u00020109H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020\u0015*\u00020=H\u0000¢\u0006\u0004\b>\u0010?\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\b¢\u0006\u0004\bA\u0010B\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000CH\u0080\b¢\u0006\u0004\bA\u0010D\u001a8\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0080\b¢\u0006\u0004\bA\u0010H\u001a%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\bI\u0010B\u001a/\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@2\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\bK\u0010L\u001a)\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\bI\u0010L\u001a\u0013\u0010M\u001a\u000201*\u000205H\u0000¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010M\u001a\u000201*\u00020OH\u0000¢\u0006\u0004\bM\u0010P\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0015H\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0019H\u0000¢\u0006\u0004\bQ\u0010S\u001a5\u0010X\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010@2\u0006\u0010T\u001a\u00020\r2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000U2\u0006\u0010W\u001a\u00020\u0000H\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0013\u0010[\u001a\u000201*\u00020ZH\u0000¢\u0006\u0004\b[\u0010\\\"\u0014\u0010^\u001a\u00020]8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u0014\u0010`\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, m16758d2 = {_UrlKt.FRAGMENT_ENCODE_SET, "name", _UrlKt.FRAGMENT_ENCODE_SET, "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "format", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lzd/k;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lzd/k;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", _UrlKt.FRAGMENT_ENCODE_SET, "duration", "Ljava/util/concurrent/TimeUnit;", "unit", _UrlKt.FRAGMENT_ENCODE_SET, "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "Lvb/b;", "checkDuration-HG0u8IE", "(Ljava/lang/String;J)I", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "other", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "Lzd/w0;", "timeUnit", "skipAll", "(Lzd/w0;ILjava/util/concurrent/TimeUnit;)Z", "Ll8/i0;", "(Lzd/k;)V", "timeout", "discard", "Ljava/net/Socket;", "source", "isHealthy", "(Ljava/net/Socket;Lzd/k;)Z", "Lkotlin/Function0;", "block", "threadName", "(Ljava/lang/String;La9/a;)V", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "T", "unmodifiable", "(Ljava/util/List;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/util/Set;)Ljava/util/Set;", "K", "V", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)Ljava/util/Map;", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "closeQuietly", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/Dispatcher;", "assertLockNotHeld", "(Lokhttp3/Dispatcher;)V", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _UtilJvmKt {
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        UTC = timeZone;
        assertionsEnabled = false;
        okHttpName = AbstractC8621f0.m33103J0(AbstractC8621f0.m33102I0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: a */
    public static Thread m23258a(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        eventListener.getClass();
        return new EventListener.Factory() { // from class: okhttp3.internal.d
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return _UtilJvmKt.m23259b(eventListener, call);
            }
        };
    }

    public static final void assertLockNotHeld(Dispatcher dispatcher) {
        dispatcher.getClass();
        if (assertionsEnabled && Thread.holdsLock(dispatcher)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST NOT hold lock on ", dispatcher);
        }
    }

    /* JADX INFO: renamed from: b */
    public static EventListener m23259b(EventListener eventListener, Call call) {
        call.getClass();
        return eventListener;
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return AbstractC1061t.m3842c(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && AbstractC1061t.m3842c(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j10, TimeUnit timeUnit) {
        str.getClass();
        timeUnit.getClass();
        if (j10 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            C5792j.m23284a(str, " too large");
            return 0;
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        C5792j.m23284a(str, " too small");
        return 0;
    }

    /* JADX INFO: renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m39014checkDurationHG0u8IE(String str, long j10) {
        str.getClass();
        if (C8895b.m34099M(j10)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long jM34123y = C8895b.m34123y(j10);
        if (jM34123y > 2147483647L) {
            C5792j.m23284a(str, " too large");
            return 0;
        }
        if (jM34123y != 0 || !C8895b.m34100N(j10)) {
            return (int) jM34123y;
        }
        C5792j.m23284a(str, " too small");
        return 0;
    }

    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC1061t.m3842c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean discard(InterfaceC10024w0 interfaceC10024w0, int i10, TimeUnit timeUnit) {
        interfaceC10024w0.getClass();
        timeUnit.getClass();
        try {
            return skipAll(interfaceC10024w0, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String format(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        C1062t0 c1062t0 = C1062t0.f3215a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long headersContentLength(Response response) {
        response.getClass();
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return _UtilCommonKt.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        tArr.getClass();
        return toImmutableList(tArr);
    }

    public static final boolean isHealthy(Socket socket, InterfaceC9999k interfaceC9999k) {
        socket.getClass();
        interfaceC9999k.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC9999k.mo38707g();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset readBomAsCharset(InterfaceC9999k interfaceC9999k, Charset charset) {
        interfaceC9999k.getClass();
        charset.getClass();
        int iMo38687O = interfaceC9999k.mo38687O(_UtilCommonKt.getUNICODE_BOMS());
        if (iMo38687O == -1) {
            return charset;
        }
        if (iMo38687O == 0) {
            return C8614c.f28652b;
        }
        if (iMo38687O == 1) {
            return C8614c.f28654d;
        }
        if (iMo38687O == 2) {
            return C8614c.f28651a.m33084b();
        }
        if (iMo38687O == 3) {
            return C8614c.f28655e;
        }
        if (iMo38687O == 4) {
            return C8614c.f28651a.m33083a();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T tCast;
        Object fieldOrNull;
        obj.getClass();
        cls.getClass();
        str.getClass();
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (AbstractC1061t.m3842c(superclass, Object.class)) {
                if (AbstractC1061t.m3842c(str, "delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                tCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
        }
        return tCast;
    }

    public static final boolean skipAll(InterfaceC10024w0 interfaceC10024w0, int i10, TimeUnit timeUnit) {
        interfaceC10024w0.getClass();
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = interfaceC10024w0.timeout().hasDeadline() ? interfaceC10024w0.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        interfaceC10024w0.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C9995i c9995i = new C9995i();
            while (interfaceC10024w0.read(c9995i, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1) {
                c9995i.m38701c();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC10024w0.timeout().clearDeadline();
                return true;
            }
            interfaceC10024w0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC10024w0.timeout().clearDeadline();
                return false;
            }
            interfaceC10024w0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC10024w0.timeout().clearDeadline();
            } else {
                interfaceC10024w0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z10) {
        str.getClass();
        return new ThreadFactory() { // from class: okhttp3.internal.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return _UtilJvmKt.m23258a(str, z10, runnable);
            }
        };
    }

    public static final void threadName(String str, InterfaceC0173a interfaceC0173a) {
        str.getClass();
        interfaceC0173a.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            interfaceC0173a.invoke();
        } finally {
            AbstractC1057r.m3834b(1);
            threadCurrentThread.setName(name);
            AbstractC1057r.m3833a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        headers.getClass();
        C2363j c2363jM8592s = AbstractC2368o.m8592s(0, headers.size());
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c2363jM8592s, 10));
        Iterator it = c2363jM8592s.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC5101q0) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().m38770M(), header.getValue().m38770M());
        }
        return builder.build();
    }

    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        hexString.getClass();
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z10) {
        String strHost;
        httpUrl.getClass();
        if (AbstractC8621f0.m33126a0(httpUrl.host(), ":", false, 2, null)) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z10 && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(AbstractC5102r.m20652d(array));
        listUnmodifiableList.getClass();
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final <T> List<T> unmodifiable(List<? extends T> list) {
        list.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        hexString.getClass();
        return hexString;
    }

    public static final <T> Set<T> unmodifiable(Set<? extends T> set) {
        set.getClass();
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> unmodifiable(Map<K, ? extends V> map) {
        map.getClass();
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        serverSocket.getClass();
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final <T> List<T> toImmutableList(T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            if (tArr.length == 1) {
                List<T> listSingletonList = Collections.singletonList(tArr[0]);
                listSingletonList.getClass();
                return listSingletonList;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(AbstractC5102r.m20652d((Object[]) tArr.clone()));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }
        return AbstractC5114x.m20800o();
    }

    public static final void skipAll(InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        while (!interfaceC9999k.mo38707g()) {
            interfaceC9999k.skip(interfaceC9999k.mo38699b().size());
        }
    }
}
