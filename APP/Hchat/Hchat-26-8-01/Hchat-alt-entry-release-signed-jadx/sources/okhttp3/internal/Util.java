package okhttp3.internal;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1406b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import ke.C2399h;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.p220io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p172lg.C2563c;
import p172lg.C2564d;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p259r9.AbstractC3754e0;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.m6803of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final C3147k VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, byte[], okhttp3.MediaType, int, int, int, java.lang.Object):okhttp3.RequestBody */
    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody$Companion, byte[], okhttp3.MediaType, int, java.lang.Object):okhttp3.ResponseBody */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.m6813of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new C3147k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <E> void addIfAbsent(List<E> list, E e6) {
        list.getClass();
        if (list.contains(e6)) {
            return;
        }
        list.add(e6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long and(int i9, long j3) {
        return ((long) i9) & j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final EventListener.Factory asFactory(EventListener eventListener) {
        eventListener.getClass();
        return new C2399h(eventListener, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        eventListener.getClass();
        call.getClass();
        return eventListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void assertThreadDoesntHoldLock(Object obj) {
        obj.getClass();
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void assertThreadHoldsLock(Object obj) {
        obj.getClass();
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return VERIFY_AS_IP_ADDRESS.m6683d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return AbstractC1416l.m3825a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && AbstractC1416l.m3825a(httpUrl.scheme(), httpUrl2.scheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int checkDuration(String str, long j3, TimeUnit timeUnit) {
        str.getClass();
        if (j3 < 0) {
            C0086a.m449h(str.concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            C2104o.m5276A("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j3);
        if (millis > 2147483647L) {
            C2104o.m5291q(str.concat(" too large."));
            return 0;
        }
        if (millis != 0 || j3 <= 0) {
            return (int) millis;
        }
        C2104o.m5291q(str.concat(" too small."));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void checkOffsetAndCount(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (!AbstractC1416l.m3825a(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] concat(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int delimiterOffset(String str, String str2, int i9, int i10) {
        str.getClass();
        str2.getClass();
        while (i9 < i10) {
            if (AbstractC3149m.m6710i0(str2, str.charAt(i9))) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, str2, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean discard(Source source, int i9, TimeUnit timeUnit) {
        source.getClass();
        timeUnit.getClass();
        try {
            return skipAll(source, i9, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> List<T> filterList(Iterable<? extends T> iterable, InterfaceC1231l interfaceC1231l) {
        iterable.getClass();
        interfaceC1231l.getClass();
        ArrayList arrayList = C4173t.f13710g;
        for (T t9 : iterable) {
            if (((Boolean) interfaceC1231l.invoke(t9)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC1428x.m3836a(arrayList).add(t9);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String format(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C1406b c1406b = new C1406b(strArr2);
                while (c1406b.hasNext()) {
                    if (comparator.compare(str, (String) c1406b.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long headersContentLength(Response response) {
        response.getClass();
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void ignoreIoExceptions(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        try {
            interfaceC1220a.invoke();
        } catch (IOException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        tArr.getClass();
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(AbstractC0000a.m101y0(Arrays.copyOf(objArr, objArr.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        strArr.getClass();
        str.getClass();
        comparator.getClass();
        int length = strArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (comparator.compare(strArr[i9], str) == 0) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int indexOfControlOrNonAscii(String str) {
        str.getClass();
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (AbstractC1416l.m3827c(cCharAt, 31) <= 0 || AbstractC1416l.m3827c(cCharAt, 127) >= 0) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int indexOfFirstNonAsciiWhitespace(String str, int i9, int i10) {
        str.getClass();
        while (i9 < i10) {
            char cCharAt = str.charAt(i9);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int indexOfLastNonAsciiWhitespace(String str, int i9, int i10) {
        str.getClass();
        int i11 = i10 - 1;
        if (i9 <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i9) {
                    break;
                }
                i11--;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int indexOfNonWhitespace(String str, int i9) {
        str.getClass();
        int length = str.length();
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i9;
            }
            i9++;
        }
        return str.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        return indexOfNonWhitespace(str, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i9]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i9++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        fileSystem.getClass();
        file.getClass();
        Sink sink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            AbstractC2043a.m5035i(sink, null);
            return true;
        } catch (IOException unused) {
            AbstractC2043a.m5035i(sink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(sink, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isHealthy(Socket socket, BufferedSource bufferedSource) {
        socket.getClass();
        bufferedSource.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !bufferedSource.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void notify(Object obj) {
        obj.getClass();
        obj.notify();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void notifyAll(Object obj) {
        obj.getClass();
        obj.notifyAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String peerName(Socket socket) {
        socket.getClass();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        hostName.getClass();
        return hostName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) {
        bufferedSource.getClass();
        charset.getClass();
        int iSelect = bufferedSource.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iSelect == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iSelect == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iSelect == 3) {
            Charset charset5 = AbstractC3137a.f10177a;
            Charset charset6 = AbstractC3137a.f10180d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            AbstractC3137a.f10180d = charsetForName;
            return charsetForName;
        }
        if (iSelect != 4) {
            throw new AssertionError();
        }
        Charset charset7 = AbstractC3137a.f10177a;
        Charset charset8 = AbstractC3137a.f10179c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        AbstractC3137a.f10179c = charsetForName2;
        return charsetForName2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T tCast;
        Object fieldOrNull;
        obj.getClass();
        cls.getClass();
        str.getClass();
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int readMedium(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean skipAll(Source source, int i9, TimeUnit timeUnit) {
        source.getClass();
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i9)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ThreadFactory threadFactory(final String str, final boolean z9) {
        str.getClass();
        return new ThreadFactory() { // from class: ah.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.threadFactory$lambda$1(str, z9, runnable);
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z9, Runnable runnable) {
        str.getClass();
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z9);
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void threadName(String str, InterfaceC1220a interfaceC1220a) {
        str.getClass();
        interfaceC1220a.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            interfaceC1220a.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List<Header> toHeaderList(Headers headers) {
        headers.getClass();
        C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, headers.size());
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c2564dM7910r0));
        Iterator it = c2564dM7910r0.iterator();
        while (true) {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                return arrayList;
            }
            int iNextInt = c2563c.nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Headers toHeaders(List<Header> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String toHexString(long j3) {
        String hexString = Long.toHexString(j3);
        hexString.getClass();
        return hexString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String toHostHeader(HttpUrl httpUrl, boolean z9) {
        String strHost;
        httpUrl.getClass();
        if (AbstractC3149m.m6709h0(httpUrl.host(), ":", false)) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z9 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ':' + httpUrl.port();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        return toHostHeader(httpUrl, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        list.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        map.getClass();
        if (map.isEmpty()) {
            return C4174u.f13711g;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long toLongOrDefault(String str, long j3) {
        str.getClass();
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int toNonNegativeInt(String str, int i9) {
        if (str != null) {
            try {
                long j3 = Long.parseLong(str);
                if (j3 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j3 < 0) {
                    return 0;
                }
                return (int) j3;
            } catch (NumberFormatException unused) {
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String trimSubstring(String str, int i9, int i10) {
        str.getClass();
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i9, i10);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String trimSubstring$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return trimSubstring(str, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void wait(Object obj) throws InterruptedException {
        obj.getClass();
        obj.wait();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        exc.getClass();
        list.getClass();
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0063p.m412e(exc, it.next());
        }
        return exc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void writeMedium(BufferedSink bufferedSink, int i9) {
        bufferedSink.getClass();
        bufferedSink.writeByte((i9 >>> 16) & 255);
        bufferedSink.writeByte((i9 >>> 8) & 255);
        bufferedSink.writeByte(i9 & 255);
    }

    public static final int and(short s10, int i9) {
        return s10 & i9;
    }

    public static final int and(byte b10, int i9) {
        return b10 & i9;
    }

    public static final String toHexString(int i9) {
        String hexString = Integer.toHexString(i9);
        hexString.getClass();
        return hexString;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return delimiterOffset(str, c10, i9, i10);
    }

    public static final int delimiterOffset(String str, char c10, int i9, int i10) {
        str.getClass();
        while (i9 < i10) {
            if (str.charAt(i9) == c10) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        serverSocket.getClass();
        try {
            serverSocket.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(Buffer buffer, byte b10) throws EOFException {
        buffer.getClass();
        int i9 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i9++;
            buffer.readByte();
        }
        return i9;
    }
}
