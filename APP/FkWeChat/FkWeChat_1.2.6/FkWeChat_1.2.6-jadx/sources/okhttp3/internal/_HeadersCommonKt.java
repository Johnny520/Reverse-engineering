package okhttp3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1027c;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p283t8.AbstractC8205c;
import p299ub.AbstractC8610a;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010!\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010!\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0000*\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0003*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u00002\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003H\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00109\u001a\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000308H\u0000¢\u0006\u0004\b9\u0010:¨\u0006;"}, m16758d2 = {"Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "index", _UrlKt.FRAGMENT_ENCODE_SET, "commonName", "(Lokhttp3/Headers;I)Ljava/lang/String;", "commonValue", "name", _UrlKt.FRAGMENT_ENCODE_SET, "commonValues", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "Ll8/r;", "commonIterator", "(Lokhttp3/Headers;)Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "commonNewBuilder", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "commonEquals", "(Lokhttp3/Headers;Ljava/lang/Object;)Z", "commonHashCode", "(Lokhttp3/Headers;)I", "commonToString", "(Lokhttp3/Headers;)Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "namesAndValues", "commonHeadersGet", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "commonAdd", "(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "headers", "commonAddAll", "(Lokhttp3/Headers$Builder;Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "commonAddLenient", "commonRemoveAll", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "commonSet", "commonGet", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Ljava/lang/String;", "commonBuild", "(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;", "Ll8/i0;", "headersCheckName", "(Ljava/lang/String;)V", "headersCheckValue", "(Ljava/lang/String;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "charCode", "(C)Ljava/lang/String;", "inputNamesAndValues", "commonHeadersOf", "([Ljava/lang/String;)Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "commonToHeaders", "(Ljava/util/Map;)Lokhttp3/Headers;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _HeadersCommonKt {
    private static final String charCode(char c10) {
        String string = Integer.toString(c10, AbstractC8610a.m33053a(16));
        string.getClass();
        return string.length() < 2 ? "0".concat(string) : string;
    }

    public static final Headers.Builder commonAdd(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers.Builder commonAddAll(Headers.Builder builder, Headers headers) {
        builder.getClass();
        headers.getClass();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            commonAddLenient(builder, headers.name(i10), headers.value(i10));
        }
        return builder;
    }

    public static final Headers.Builder commonAddLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        builder.getNamesAndValues$okhttp().add(str);
        builder.getNamesAndValues$okhttp().add(AbstractC8621f0.m33161r1(str2).toString());
        return builder;
    }

    public static final Headers commonBuild(Headers.Builder builder) {
        builder.getClass();
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(Headers headers, Object obj) {
        headers.getClass();
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues(), ((Headers) obj).getNamesAndValues());
    }

    public static final String commonGet(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int iM31894c = AbstractC8205c.m31894c(size, 0, -2);
        if (iM31894c > size) {
            return null;
        }
        while (!AbstractC8611a0.m33061F(str, builder.getNamesAndValues$okhttp().get(size), true)) {
            if (size == iM31894c) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final int commonHashCode(Headers headers) {
        headers.getClass();
        return Arrays.hashCode(headers.getNamesAndValues());
    }

    public static final String commonHeadersGet(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        int length = strArr.length - 2;
        int iM31894c = AbstractC8205c.m31894c(length, 0, -2);
        if (iM31894c > length) {
            return null;
        }
        while (!AbstractC8611a0.m33061F(str, strArr[length], true)) {
            if (length == iM31894c) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final Headers commonHeadersOf(String... strArr) {
        strArr.getClass();
        if (strArr.length % 2 != 0) {
            C9987e.m38645a("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr2[i11] == null) {
                C9987e.m38645a("Headers cannot be null");
                return null;
            }
            strArr2[i11] = AbstractC8621f0.m33161r1(strArr[i11]).toString();
        }
        int iM31894c = AbstractC8205c.m31894c(0, strArr2.length - 1, 2);
        if (iM31894c >= 0) {
            while (true) {
                String str = strArr2[i10];
                String str2 = strArr2[i10 + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i10 == iM31894c) {
                    break;
                }
                i10 += 2;
            }
        }
        return new Headers(strArr2);
    }

    public static final Iterator<C4711r> commonIterator(Headers headers) {
        headers.getClass();
        int size = headers.size();
        C4711r[] c4711rArr = new C4711r[size];
        for (int i10 = 0; i10 < size; i10++) {
            c4711rArr[i10] = AbstractC4717x.m18815a(headers.name(i10), headers.value(i10));
        }
        return AbstractC1027c.m3774a(c4711rArr);
    }

    public static final String commonName(Headers headers, int i10) {
        headers.getClass();
        String str = (String) AbstractC5106t.m20736h0(headers.getNamesAndValues(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final Headers.Builder commonNewBuilder(Headers headers) {
        headers.getClass();
        Headers.Builder builder = new Headers.Builder();
        AbstractC5070c0.m20493F(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues());
        return builder;
    }

    public static final Headers.Builder commonRemoveAll(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int i10 = 0;
        while (i10 < builder.getNamesAndValues$okhttp().size()) {
            if (AbstractC8611a0.m33061F(str, builder.getNamesAndValues$okhttp().get(i10), true)) {
                builder.getNamesAndValues$okhttp().remove(i10);
                builder.getNamesAndValues$okhttp().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return builder;
    }

    public static final Headers.Builder commonSet(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        builder.removeAll(str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers commonToHeaders(Map<String, String> map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = AbstractC8621f0.m33161r1(key).toString();
            String string2 = AbstractC8621f0.m33161r1(value).toString();
            headersCheckName(string);
            headersCheckValue(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        return new Headers(strArr);
    }

    public static final String commonToString(Headers headers) {
        headers.getClass();
        StringBuilder sb2 = new StringBuilder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = headers.name(i10);
            String strValue = headers.value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final String commonValue(Headers headers, int i10) {
        headers.getClass();
        String str = (String) AbstractC5106t.m20736h0(headers.getNamesAndValues(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List<String> commonValues(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        int size = headers.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC8611a0.m33061F(str, headers.name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? AbstractC5114x.m20800o() : listUnmodifiableList;
    }

    public static final void headersCheckName(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C9987e.m38645a("name is empty");
            return;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + charCode(cCharAt) + " at " + i10 + " in header name: " + str).toString());
            }
        }
    }

    public static final void headersCheckValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                sb2.append(charCode(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                sb2.append(_UtilCommonKt.isSensitiveHeader(str2) ? _UrlKt.FRAGMENT_ENCODE_SET : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
