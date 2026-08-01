package okhttp3.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import okio.AbstractC5795a;
import okio.C5799e;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p172l8.AbstractC4693f;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C10003m;
import p376zd.C9995i;
import p376zd.C9996i0;
import p376zd.InterfaceC9997j;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000º\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010'\u001a\u00020\f*\u00020%2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\f*\u00020)2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010*\u001a\u001c\u0010'\u001a\u00020+*\u00020\f2\u0006\u0010&\u001a\u00020+H\u0080\u0004¢\u0006\u0004\b'\u0010,\u001a\u001b\u00100\u001a\u00020/*\u00020-2\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\f*\u000202H\u0000¢\u0006\u0004\b3\u00104\u001a!\u00107\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/05H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u00020\f*\u0002092\u0006\u0010:\u001a\u00020%H\u0000¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010=\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010@\u001a\u00020+*\u00020\u00012\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\fH\u0000¢\u0006\u0004\bB\u0010>\u001a\u0015\u0010E\u001a\u00020/*\u00060Cj\u0002`D¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010J\u001a\u00020\b*\u00020G2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010M\u001a\u00020/*\u00020G2\u0006\u0010L\u001a\u00020HH\u0000¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010P\u001a\u00020/*\u00020G2\u0006\u0010O\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010N\u001a'\u0010T\u001a\u00020/\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010S\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010U\u001a)\u0010[\u001a\u00020Z*\u00060Vj\u0002`W2\u0010\u0010Y\u001a\f\u0012\b\u0012\u00060Vj\u0002`W0XH\u0000¢\u0006\u0004\b[\u0010\\\u001a=\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]*\b\u0012\u0004\u0012\u00028\u00000^2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0_H\u0080\bø\u0001\u0000¢\u0006\u0004\ba\u0010b\u001a'\u0010f\u001a\u00020/2\u0006\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020+2\u0006\u0010e\u001a\u00020+H\u0000¢\u0006\u0004\bf\u0010g\u001a7\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]2\f\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000^2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0000¢\u0006\u0004\bi\u0010j\"\u0014\u0010l\u001a\u00020k8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bl\u0010m\"\u001a\u0010o\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0014\u0010s\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\bs\u0010t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006u"}, m16758d2 = {_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", _UrlKt.FRAGMENT_ENCODE_SET, "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", _UrlKt.FRAGMENT_ENCODE_SET, "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "name", "isSensitiveHeader", "(Ljava/lang/String;)Z", "parseHexDigit", "(C)I", _UrlKt.FRAGMENT_ENCODE_SET, "mask", "and", "(BI)I", _UrlKt.FRAGMENT_ENCODE_SET, "(SI)I", _UrlKt.FRAGMENT_ENCODE_SET, "(IJ)J", "Lzd/j;", "medium", "Ll8/i0;", "writeMedium", "(Lzd/j;I)V", "Lzd/k;", "readMedium", "(Lzd/k;)I", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(La9/a;)V", "Lzd/i;", "b", "skipAll", "(Lzd/i;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "Ljava/io/Closeable;", "Lokio/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "Lokio/a;", "Lokio/e;", "file", "isCivilized", "(Lokio/a;Lokio/e;)Z", "path", "deleteIfExists", "(Lokio/a;Lokio/e;)V", "directory", "deleteContents", "E", _UrlKt.FRAGMENT_ENCODE_SET, "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", _UrlKt.FRAGMENT_ENCODE_SET, "suppressed", _UrlKt.FRAGMENT_ENCODE_SET, "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "T", _UrlKt.FRAGMENT_ENCODE_SET, "Lkotlin/Function1;", "predicate", "filterList", "(Ljava/lang/Iterable;La9/l;)Ljava/util/List;", "arrayLength", "offset", "count", "checkOffsetAndCount", "(JJJ)V", "a", "interleave", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "EMPTY_BYTE_ARRAY", "[B", "Lzd/i0;", "UNICODE_BOMS", "Lzd/i0;", "getUNICODE_BOMS", "()Lzd/i0;", "USER_AGENT", "Ljava/lang/String;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final C9996i0 UNICODE_BOMS;
    public static final String USER_AGENT = "okhttp/5.3.2";

    static {
        C9996i0.a aVar = C9996i0.f33571t;
        C10003m.a aVar2 = C10003m.f33582t;
        UNICODE_BOMS = aVar.m38753d(aVar2.m38792b("efbbbf"), aVar2.m38792b("feff"), aVar2.m38792b("fffe0000"), aVar2.m38792b("fffe"), aVar2.m38792b("0000feff"));
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        list.getClass();
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[AbstractC5106t.m20732f0(strArr2)] = str;
        return strArr2;
    }

    public static final void deleteContents(AbstractC5795a abstractC5795a, C5799e c5799e) throws IOException {
        abstractC5795a.getClass();
        c5799e.getClass();
        try {
            IOException iOException = null;
            for (C5799e c5799e2 : abstractC5795a.list(c5799e)) {
                try {
                    if (abstractC5795a.metadata(c5799e2).m38819e()) {
                        deleteContents(abstractC5795a, c5799e2);
                    }
                    abstractC5795a.delete(c5799e2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(AbstractC5795a abstractC5795a, C5799e c5799e) {
        abstractC5795a.getClass();
        c5799e.getClass();
        try {
            abstractC5795a.delete(c5799e);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(String str, String str2, int i10, int i11) {
        str.getClass();
        str2.getClass();
        while (i10 < i11) {
            if (AbstractC8621f0.m33124Z(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        interfaceC0184l.getClass();
        List<T> listM20800o = AbstractC5114x.m20800o();
        for (T t10 : iterable) {
            if (((Boolean) interfaceC0184l.mo27m(t10)).booleanValue()) {
                if (listM20800o.isEmpty()) {
                    listM20800o = new ArrayList<>();
                }
                AbstractC1064u0.m3855c(listM20800o).add(t10);
            }
        }
        return listM20800o;
    }

    public static final C9996i0 getUNICODE_BOMS() {
        return UNICODE_BOMS;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void ignoreIoExceptions(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        try {
            interfaceC0173a.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        strArr.getClass();
        str.getClass();
        comparator.getClass();
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        str.getClass();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC1061t.m3843d(cCharAt, 31) <= 0 || AbstractC1061t.m3843d(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i10, int i11) {
        str.getClass();
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i10, int i11) {
        str.getClass();
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(String str, int i10) {
        str.getClass();
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    public static final <T> List<T> interleave(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        List listM20787c = AbstractC5112w.m20787c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return AbstractC5112w.m20785a(listM20787c);
            }
            if (it.hasNext()) {
                listM20787c.add(it.next());
            }
            if (it2.hasNext()) {
                listM20787c.add(it2.next());
            }
        }
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isCivilized(okio.AbstractC5795a r2, okio.C5799e r3) throws java.lang.Throwable {
        /*
            r2.getClass()
            r3.getClass()
            zd.u0 r0 = r2.sink(r3)
            r2.delete(r3)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r2 = 1
            if (r0 == 0) goto L13
            r0.close()     // Catch: java.lang.Throwable -> L13
        L13:
            return r2
        L14:
            r1 = move-exception
            goto L22
        L16:
            l8.i0 r1 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L20
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L2d
        L20:
            r0 = 0
            goto L2d
        L22:
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            p172l8.AbstractC4693f.m18753a(r1, r0)
        L2c:
            r0 = r1
        L2d:
            if (r0 != 0) goto L34
            r2.delete(r3)
            r2 = 0
            return r2
        L34:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._UtilCommonKt.isCivilized(okio.a, okio.e):boolean");
    }

    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return AbstractC8611a0.m33061F(str, "Authorization", true) || AbstractC8611a0.m33061F(str, "Cookie", true) || AbstractC8611a0.m33061F(str, "Proxy-Authorization", true) || AbstractC8611a0.m33061F(str, "Set-Cookie", true);
    }

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

    public static final int readMedium(InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        return and(interfaceC9999k.readByte(), 255) | (and(interfaceC9999k.readByte(), 255) << 16) | (and(interfaceC9999k.readByte(), 255) << 8);
    }

    public static final int skipAll(C9995i c9995i, byte b10) throws EOFException {
        c9995i.getClass();
        int i10 = 0;
        while (!c9995i.mo38707g() && c9995i.m38716l(0L) == b10) {
            i10++;
            c9995i.readByte();
        }
        return i10;
    }

    public static final long toLongOrDefault(String str, long j10) {
        str.getClass();
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String trimSubstring(String str, int i10, int i11) {
        str.getClass();
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i11));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) throws IllegalAccessException, InvocationTargetException {
        exc.getClass();
        list.getClass();
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            AbstractC4693f.m18753a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(InterfaceC9997j interfaceC9997j, int i10) {
        interfaceC9997j.getClass();
        interfaceC9997j.writeByte((i10 >>> 16) & 255);
        interfaceC9997j.writeByte((i10 >>> 8) & 255);
        interfaceC9997j.writeByte(i10 & 255);
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    public static final int delimiterOffset(String str, char c10, int i10, int i11) {
        str.getClass();
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
