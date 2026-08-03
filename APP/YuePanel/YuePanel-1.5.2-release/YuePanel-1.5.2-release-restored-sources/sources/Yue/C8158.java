package Yue;

import Yue.AbstractC4712;
import Yue.AbstractC7103;
import Yue.AbstractC7142;
import Yue.C3630;
import Yue.C5256;
import Yue.C6582;
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
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۣۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
@InterfaceC5572(name = "Util")
public final class C8158 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public static final byte[] f3265;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C5256 f3266 = C5256.f12534.m16140(new String[0]);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final AbstractC7142 f24177;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final AbstractC7103 f24178;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6582 f24179;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final TimeZone f24180;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C7075 f24181;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC5568
    public static final boolean f24182;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f24183;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f24184 = "okhttp/4.12.0";

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۦۥ.ۥ.ۥ۟۟۠ۡ(Yue.ۥۡۦۥ$ۥ, byte[], Yue.ۥۡ۠ۥۨ, int, int, int, java.lang.Object):Yue.ۥۡۦۥ */
    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۦۧ۟.ۥ۟.ۥ۟۟۟ۦ(Yue.ۥۡۦۧ۟$ۥ۟, byte[], Yue.ۥۡ۠ۥۨ, int, java.lang.Object):Yue.ۥۡۦۧ۟ */
    static {
        byte[] bArr = new byte[0];
        f3265 = bArr;
        f24177 = AbstractC7142.C1187.m22394(AbstractC7142.f21543, bArr, null, 1, null);
        f24178 = AbstractC7103.C1167.m22212(AbstractC7103.f2683, bArr, null, 0, 0, 7, null);
        C6582.C1017 c1017 = C6582.f16900;
        C3630.C0198 c0198 = C3630.f6370;
        f24179 = c1017.m20908(c0198.m9874("efbbbf"), c0198.m9874("feff"), c0198.m9874("fffe"), c0198.m9874("0000ffff"), c0198.m9874("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C5499.m17100(timeZone);
        f24180 = timeZone;
        f24181 = new C7075("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f24182 = false;
        String name = C6504.class.getName();
        C5499.m17102(name, "OkHttpClient::class.java.name");
        f24183 = C7628.m24100(C7628.m24094(name, "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> void m26832(@InterfaceC6399 List<E> list, E e) {
        C5499.m17103(list, "<this>");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26833(byte b, int i) {
        return b & i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26834(short s, int i) {
        return s & i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m26835(int i, long j) {
        return ((long) i) & j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC4712.InterfaceC4713 m26836(@InterfaceC6399 final AbstractC4712 abstractC4712) {
        C5499.m17103(abstractC4712, "<this>");
        return new AbstractC4712.InterfaceC4713() { // from class: Yue.ۥۣۢۤۧ
            @Override // Yue.AbstractC4712.InterfaceC4713
            /* JADX INFO: renamed from: ۥ */
            public final AbstractC4712 mo1626(InterfaceC3645 interfaceC3645) {
                return C8158.m26837(abstractC4712, interfaceC3645);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final AbstractC4712 m26837(AbstractC4712 abstractC4712, InterfaceC3645 interfaceC3645) {
        C5499.m17103(abstractC4712, "$this_asFactory");
        C5499.m17103(interfaceC3645, "it");
        return abstractC4712;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m26838(@InterfaceC6399 Object obj) {
        C5499.m17103(obj, "<this>");
        if (f24182 && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m26839(@InterfaceC6399 Object obj) {
        C5499.m17103(obj, "<this>");
        if (!f24182 || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m26840(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return f24181.m22055(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m26841(@InterfaceC6399 C5385 c5385, @InterfaceC6399 C5385 c53852) {
        C5499.m17103(c5385, "<this>");
        C5499.m17103(c53852, "other");
        return C5499.m17094(c5385.m16772(), c53852.m16772()) && c5385.m16779() == c53852.m16779() && C5499.m17094(c5385.m16789(), c53852.m16789());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m26842(@InterfaceC6399 String str, long j, @InterfaceC6489 TimeUnit timeUnit) {
        C5499.m17103(str, "name");
        if (j < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m26843(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m26844(@InterfaceC6399 Closeable closeable) {
        C5499.m17103(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final void m26845(@InterfaceC6399 ServerSocket serverSocket) {
        C5499.m17103(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m26846(@InterfaceC6399 Socket socket) {
        C5499.m17103(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C5499.m17094(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final String[] m26847(@InterfaceC6399 String[] strArr, @InterfaceC6399 String str) {
        C5499.m17103(strArr, "<this>");
        C5499.m17103(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C5499.m17102(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[C3411.m7876(strArr2)] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int m26848(@InterfaceC6399 String str, char c, int i, int i2) {
        C5499.m17103(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26849(@InterfaceC6399 String str, @InterfaceC6399 String str2, int i, int i2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiters");
        while (i < i2) {
            if (C7628.m24034(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ int m26850(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m26848(str, c, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m26851(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m26849(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean m26852(@InterfaceC6399 InterfaceC7506 interfaceC7506, int i, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(timeUnit, "timeUnit");
        try {
            return m26879(interfaceC7506, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T> List<T> m26853(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        List<T> listM10735 = C3880.m10735();
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                if (listM10735.isEmpty()) {
                    listM10735 = new ArrayList<>();
                }
                C5499.m17101(listM10735, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                C8012.m25255(listM10735).add(t);
            }
        }
        return listM10735;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String m26854(@InterfaceC6399 String str, @InterfaceC6399 Object... objArr) {
        C5499.m17103(str, "format");
        C5499.m17103(objArr, "args");
        C7610 c7610 = C7610.f2968;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C5499.m17102(str2, "format(locale, format, *args)");
        return str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m26855(@InterfaceC6399 String[] strArr, @InterfaceC6489 String[] strArr2, @InterfaceC6399 Comparator<? super String> comparator) {
        C5499.m17103(strArr, "<this>");
        C5499.m17103(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itM474 = C3390.m474(strArr2);
                while (itM474.hasNext()) {
                    if (comparator.compare(str, (String) itM474.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final long m26856(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "<this>");
        String strM16111 = c7141.m22320().m16111("Content-Length");
        if (strM16111 != null) {
            return m26891(strM16111, -1L);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final void m26857(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        try {
            interfaceC5122.invoke();
        } catch (IOException unused) {
        }
    }

    @InterfaceC6399
    @SafeVarargs
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> List<T> m26858(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C3880.m10742(Arrays.copyOf(objArr, objArr.length)));
        C5499.m17102(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m26859(@InterfaceC6399 String[] strArr, @InterfaceC6399 String str, @InterfaceC6399 Comparator<String> comparator) {
        C5499.m17103(strArr, "<this>");
        C5499.m17103(str, "value");
        C5499.m17103(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26860(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (C5499.m17107(cCharAt, 31) <= 0 || C5499.m17107(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int m26861(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ int m26862(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m26861(str, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m26863(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ int m26864(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m26863(str, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int m26865(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m26866(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m26865(str, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final String[] m26867(@InterfaceC6399 String[] strArr, @InterfaceC6399 String[] strArr2, @InterfaceC6399 Comparator<? super String> comparator) {
        C5499.m17103(strArr, "<this>");
        C5499.m17103(strArr2, "other");
        C5499.m17103(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final boolean m26868(@InterfaceC6399 InterfaceC4817 interfaceC4817, @InterfaceC6399 File file) throws IOException {
        C5499.m17103(interfaceC4817, "<this>");
        C5499.m17103(file, "file");
        InterfaceC7472 interfaceC7472Mo1730 = interfaceC4817.mo1730(file);
        try {
            try {
                interfaceC4817.mo14624(file);
                C3849.m904(interfaceC7472Mo1730, null);
                return true;
            } catch (IOException unused) {
                C8107 c8107 = C8107.f3222;
                C3849.m904(interfaceC7472Mo1730, null);
                interfaceC4817.mo14624(file);
                return false;
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final boolean m26869(@InterfaceC6399 Socket socket, @InterfaceC6399 InterfaceC3604 interfaceC3604) {
        C5499.m17103(socket, "<this>");
        C5499.m17103(interfaceC3604, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !interfaceC3604.mo9622();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final boolean m26870(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return C7627.m23974(str, "Authorization", true) || C7627.m23974(str, C4219.f8574, true) || C7627.m23974(str, "Proxy-Authorization", true) || C7627.m23974(str, "Set-Cookie", true);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final void m26871(@InterfaceC6399 Object obj) {
        C5499.m17103(obj, "<this>");
        obj.notify();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final void m26872(@InterfaceC6399 Object obj) {
        C5499.m17103(obj, "<this>");
        obj.notifyAll();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int m26873(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String m26874(@InterfaceC6399 Socket socket) {
        C5499.m17103(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C5499.m17102(hostName, "address.hostName");
        return hostName;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final Charset m26875(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 Charset charset) throws IOException {
        C5499.m17103(interfaceC3604, "<this>");
        C5499.m17103(charset, "default");
        int iMo9643 = interfaceC3604.mo9643(f24179);
        if (iMo9643 == -1) {
            return charset;
        }
        if (iMo9643 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C5499.m17102(charset2, "UTF_8");
            return charset2;
        }
        if (iMo9643 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C5499.m17102(charset3, "UTF_16BE");
            return charset3;
        }
        if (iMo9643 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C5499.m17102(charset4, "UTF_16LE");
            return charset4;
        }
        if (iMo9643 == 3) {
            return C3794.f504.m841();
        }
        if (iMo9643 == 4) {
            return C3794.f504.m10494();
        }
        throw new AssertionError();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <T> T m26876(@InterfaceC6399 Object obj, @InterfaceC6399 Class<T> cls, @InterfaceC6399 String str) throws IllegalAccessException {
        T tCast;
        Object objM26876;
        C5499.m17103(obj, "instance");
        C5499.m17103(cls, "fieldType");
        C5499.m17103(str, "fieldName");
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (C5499.m17094(superclass, Object.class)) {
                if (C5499.m17094(str, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX) || (objM26876 = m26876(obj, Object.class, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)) == null) {
                    return null;
                }
                return (T) m26876(objM26876, cls, str);
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
                C5499.m17102(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int m26877(@InterfaceC6399 InterfaceC3604 interfaceC3604) throws IOException {
        C5499.m17103(interfaceC3604, "<this>");
        return m26833(interfaceC3604.readByte(), 255) | (m26833(interfaceC3604.readByte(), 255) << 16) | (m26833(interfaceC3604.readByte(), 255) << 8);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26878(@InterfaceC6399 C3600 c3600, byte b) throws EOFException {
        C5499.m17103(c3600, "<this>");
        int i = 0;
        while (!c3600.mo9622() && c3600.m9650(0L) == b) {
            i++;
            c3600.readByte();
        }
        return i;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CMP_L]}, finally: {[CMP_L, INVOKE, INVOKE, INVOKE, ARITH, INVOKE, IF] complete} */
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m26879(@InterfaceC6399 InterfaceC7506 interfaceC7506, int i, @InterfaceC6399 TimeUnit timeUnit) throws IOException {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo15618 = interfaceC7506.mo518().mo15620() ? interfaceC7506.mo518().mo15618() - jNanoTime : Long.MAX_VALUE;
        interfaceC7506.mo518().mo15619(Math.min(jMo15618, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C3600 c3600 = new C3600();
            while (interfaceC7506.mo9103(c3600, 8192L) != -1) {
                c3600.m9603();
            }
            if (jMo15618 == Long.MAX_VALUE) {
                interfaceC7506.mo518().mo1893();
            } else {
                interfaceC7506.mo518().mo15619(jNanoTime + jMo15618);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo15618 == Long.MAX_VALUE) {
                interfaceC7506.mo518().mo1893();
            } else {
                interfaceC7506.mo518().mo15619(jNanoTime + jMo15618);
            }
            return false;
        } catch (Throwable th) {
            if (jMo15618 == Long.MAX_VALUE) {
                interfaceC7506.mo518().mo1893();
            } else {
                interfaceC7506.mo518().mo15619(jNanoTime + jMo15618);
            }
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final ThreadFactory m26880(@InterfaceC6399 final String str, final boolean z) {
        C5499.m17103(str, "name");
        return new ThreadFactory() { // from class: Yue.ۥۣۢۤۨ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C8158.m26881(str, z, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Thread m26881(String str, boolean z, Runnable runnable) {
        C5499.m17103(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final void m26882(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(str, "name");
        C5499.m17103(interfaceC5122, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            threadCurrentThread.setName(name);
            C5437.m16929(1);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final List<C5255> m26883(@InterfaceC6399 C5256 c5256) {
        C5499.m17103(c5256, "<this>");
        C5458 c5458M21793 = C7007.m21793(0, c5256.size());
        ArrayList arrayList = new ArrayList(C3881.m10756(c5458M21793, 10));
        Iterator<Integer> it = c5458M21793.iterator();
        while (it.hasNext()) {
            int iMo471 = ((AbstractC5455) it).mo471();
            arrayList.add(new C5255(c5256.m16114(iMo471), c5256.m16118(iMo471)));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final C5256 m26884(@InterfaceC6399 List<C5255> list) {
        C5499.m17103(list, "<this>");
        C5256.C0687 c0687 = new C5256.C0687();
        for (C5255 c5255 : list) {
            c0687.m16124(c5255.m2017().m9862(), c5255.m2018().m9862());
        }
        return c0687.m16126();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final String m26885(int i) {
        String hexString = Integer.toHexString(i);
        C5499.m17102(hexString, "toHexString(this)");
        return hexString;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String m26886(long j) {
        String hexString = Long.toHexString(j);
        C5499.m17102(hexString, "toHexString(this)");
        return hexString;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final String m26887(@InterfaceC6399 C5385 c5385, boolean z) {
        String strM16772;
        C5499.m17103(c5385, "<this>");
        if (C7628.m24035(c5385.m16772(), ":", false, 2, null)) {
            strM16772 = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + c5385.m16772() + ']';
        } else {
            strM16772 = c5385.m16772();
        }
        if (!z && c5385.m16779() == C5385.f13231.m16854(c5385.m16789())) {
            return strM16772;
        }
        return strM16772 + ':' + c5385.m16779();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ String m26888(C5385 c5385, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m26887(c5385, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final <T> List<T> m26889(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(C3888.m11065(list));
        C5499.m17102(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m26890(@InterfaceC6399 Map<K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        if (map.isEmpty()) {
            return C5943.m18584();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C5499.m17102(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final long m26891(@InterfaceC6399 String str, long j) {
        C5499.m17103(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int m26892(@InterfaceC6489 String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final String m26893(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        int iM26861 = m26861(str, i, i2);
        String strSubstring = str.substring(iM26861, m26863(str, iM26861, i2));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static /* synthetic */ String m26894(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m26893(str, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final void m26895(@InterfaceC6399 Object obj) throws InterruptedException {
        C5499.m17103(obj, "<this>");
        obj.wait();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final Throwable m26896(@InterfaceC6399 Exception exc, @InterfaceC6399 List<? extends Exception> list) {
        C5499.m17103(exc, "<this>");
        C5499.m17103(list, "suppressed");
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            C4741.m1656(exc, it.next());
        }
        return exc;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final void m26897(@InterfaceC6399 InterfaceC3603 interfaceC3603, int i) throws IOException {
        C5499.m17103(interfaceC3603, "<this>");
        interfaceC3603.writeByte((i >>> 16) & 255);
        interfaceC3603.writeByte((i >>> 8) & 255);
        interfaceC3603.writeByte(i & 255);
    }
}
