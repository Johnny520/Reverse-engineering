package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.C1062t0;
import p036c9.InterfaceC1400a;
import p172l8.C4711r;
import p172l8.InterfaceC4691e;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C9994h0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 52\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000265B\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00067"}, m16758d2 = {"Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "Ll8/r;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", _UrlKt.FRAGMENT_ENCODE_SET, "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", _UrlKt.FRAGMENT_ENCODE_SET, "names", "()Ljava/util/Set;", _UrlKt.FRAGMENT_ENCODE_SET, "values", "(Ljava/lang/String;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "()J", _UrlKt.FRAGMENT_ENCODE_SET, "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "getNamesAndValues$okhttp", "()[Ljava/lang/String;", "Companion", "Builder", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Headers implements Iterable<C4711r>, InterfaceC1400a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Headers EMPTY = new Headers(new String[0]);
    private final String[] namesAndValues;

    public Headers(String[] strArr) {
        strArr.getClass();
        this.namesAndValues = strArr;
    }

    /* JADX INFO: renamed from: of */
    public static final Headers m23247of(Map<String, String> map) {
        return INSTANCE.m23249of(map);
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m38922deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return _HeadersCommonKt.commonEquals(this, other);
    }

    public final String get(String name) {
        name.getClass();
        return _HeadersCommonKt.commonHeadersGet(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        name.getClass();
        String str = get(name);
        if (str != null) {
            return DateFormattingKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        name.getClass();
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    /* JADX INFO: renamed from: getNamesAndValues$okhttp, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    public int hashCode() {
        return _HeadersCommonKt.commonHashCode(this);
    }

    @Override // java.lang.Iterable
    public Iterator<C4711r> iterator() {
        return _HeadersCommonKt.commonIterator(this);
    }

    public final String name(int index) {
        return _HeadersCommonKt.commonName(this, index);
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(AbstractC8611a0.m33062G(C1062t0.f3215a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        return _HeadersCommonKt.commonNewBuilder(this);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(AbstractC8611a0.m33062G(C1062t0.f3215a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strName.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    public String toString() {
        return _HeadersCommonKt.commonToString(this);
    }

    public final String value(int index) {
        return _HeadersCommonKt.commonValue(this, index);
    }

    public final List<String> values(String name) {
        name.getClass();
        return _HeadersCommonKt.commonValues(this, name);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\nJ!\u0010\n\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\fR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m16758d2 = {"Lokhttp3/Headers$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "EMPTY", "Lokhttp3/Headers;", "headersOf", "namesAndValues", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "toHeaders", _UrlKt.FRAGMENT_ENCODE_SET, "headers", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m38924deprecated_of(String... namesAndValues) {
            namesAndValues.getClass();
            return m23250of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        /* JADX INFO: renamed from: of */
        public final Headers m23250of(String... namesAndValues) {
            namesAndValues.getClass();
            return _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private Companion() {
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m38923deprecated_of(Map<String, String> headers) {
            headers.getClass();
            return m23249of(headers);
        }

        /* JADX INFO: renamed from: of */
        public final Headers m23249of(Map<String, String> map) {
            map.getClass();
            return _HeadersCommonKt.commonToHeaders(map);
        }
    }

    /* JADX INFO: renamed from: of */
    public static final Headers m23248of(String... strArr) {
        return INSTANCE.m23250of(strArr);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0007J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\u0002J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0087\u0002J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002J\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m16758d2 = {"Lokhttp3/Headers$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "namesAndValues", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "getNamesAndValues$okhttp", "()Ljava/util/List;", "addLenient", "line", "addLenient$okhttp", "add", "name", "value", "addUnsafeNonAscii", "addAll", "headers", "Lokhttp3/Headers;", "Ljava/util/Date;", "Ljava/time/Instant;", "set", "removeAll", "get", "build", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            line.getClass();
            int iM33150m0 = AbstractC8621f0.m33150m0(line, ':', 0, false, 6, null);
            if (iM33150m0 != -1) {
                add(AbstractC8621f0.m33161r1(line.substring(0, iM33150m0)).toString(), line.substring(iM33150m0 + 1));
                return this;
            }
            C9994h0.m38667a("Unexpected header: ", line);
            return null;
        }

        public final Builder addAll(Headers headers) {
            headers.getClass();
            return _HeadersCommonKt.commonAddAll(this, headers);
        }

        public final Builder addLenient$okhttp(String line) {
            line.getClass();
            int iM33150m0 = AbstractC8621f0.m33150m0(line, ':', 1, false, 4, null);
            if (iM33150m0 != -1) {
                addLenient$okhttp(line.substring(0, iM33150m0), line.substring(iM33150m0 + 1));
                return this;
            }
            if (line.charAt(0) == ':') {
                addLenient$okhttp(_UrlKt.FRAGMENT_ENCODE_SET, line.substring(1));
                return this;
            }
            addLenient$okhttp(_UrlKt.FRAGMENT_ENCODE_SET, line);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            name.getClass();
            value.getClass();
            _HeadersCommonKt.headersCheckName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return _HeadersCommonKt.commonBuild(this);
        }

        public final String get(String name) {
            name.getClass();
            return _HeadersCommonKt.commonGet(this, name);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            name.getClass();
            return _HeadersCommonKt.commonRemoveAll(this, name);
        }

        public final Builder set(String name, Instant value) {
            name.getClass();
            value.getClass();
            Date dateFrom = Date.from(value);
            dateFrom.getClass();
            return set(name, dateFrom);
        }

        public final Builder set(String name, Date value) {
            name.getClass();
            value.getClass();
            return set(name, DateFormattingKt.toHttpDateString(value));
        }

        public final Builder set(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonSet(this, name, value);
        }

        public final Builder add(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonAdd(this, name, value);
        }

        public final Builder add(String name, Date value) {
            name.getClass();
            value.getClass();
            return add(name, DateFormattingKt.toHttpDateString(value));
        }

        public final Builder add(String name, Instant value) {
            name.getClass();
            value.getClass();
            Date dateFrom = Date.from(value);
            dateFrom.getClass();
            return add(name, dateFrom);
        }

        public final Builder addLenient$okhttp(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonAddLenient(this, name, value);
        }
    }
}
