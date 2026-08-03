package okhttp3;

import gg.AbstractC1411g;
import gg.C1406b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p114hg.InterfaceC1711a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p276sf.C3958e;
import p276sf.InterfaceC3954a;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable<C3958e>, InterfaceC1711a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static final Headers m6800of(Map<String, String> map) {
        return Companion.m6802of(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m10975deprecated_size() {
        return size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i9 = 0; i9 < length2; i9++) {
            length += (long) this.namesAndValues[i9].length();
        }
        return length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String get(String str) {
        str.getClass();
        return Companion.get(this.namesAndValues, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Date getDate(String str) {
        str.getClass();
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Instant getInstant(String str) {
        str.getClass();
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public Iterator<C3958e> iterator() {
        int size = size();
        C3958e[] c3958eArr = new C3958e[size];
        for (int i9 = 0; i9 < size; i9++) {
            c3958eArr[i9] = new C3958e(name(i9), value(i9));
        }
        return new C1406b(c3958eArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String name(int i9) {
        return this.namesAndValues[i9 * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            treeSet.add(name(i9));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Builder newBuilder() {
        Builder builder = new Builder();
        List<String> namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] strArr = this.namesAndValues;
        namesAndValues$okhttp.getClass();
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        namesAndValues$okhttp.addAll(listAsList);
        return builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = name(i9);
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, strName, locale);
            List arrayList = (List) treeMap.get(strM5165l);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strM5165l, arrayList);
            }
            arrayList.add(value(i9));
        }
        return treeMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = name(i9);
            String strValue = value(i9);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String value(int i9) {
        return this.namesAndValues[(i9 * 2) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> values(String str) {
        str.getClass();
        int size = size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if (str.equalsIgnoreCase(name(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i9));
            }
        }
        if (arrayList == null) {
            return C4173t.f13710g;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.Headers.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                C2104o.m5294t("name is empty");
                return;
            }
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if ('!' > cCharAt || cCharAt >= 127) {
                    C2104o.m5291q(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i9), str));
                    return;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i9), str2));
                    sb2.append(Util.isSensitiveHeader(str2) ? HttpUrl.FRAGMENT_ENCODE_SET : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM6749A = AbstractC3165h.m6749A(length, 0, -2);
            if (iM6749A > length) {
                return null;
            }
            while (!AbstractC3156t.m6734X(str, strArr[length])) {
                if (length == iM6749A) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m10977deprecated_of(String... strArr) {
            strArr.getClass();
            return m6803of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public final Headers m6803of(String... strArr) {
            strArr.getClass();
            if (strArr.length % 2 != 0) {
                C2104o.m5294t("Expected alternating header names and values");
                return null;
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr2[i10];
                if (str == null) {
                    C2104o.m5294t("Headers cannot be null");
                    return null;
                }
                strArr2[i10] = AbstractC3149m.m6703R0(str).toString();
            }
            int iM6749A = AbstractC3165h.m6749A(0, strArr2.length - 1, 2);
            if (iM6749A >= 0) {
                while (true) {
                    String str2 = strArr2[i9];
                    String str3 = strArr2[i9 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i9 == iM6749A) {
                        break;
                    }
                    i9 += 2;
                }
            }
            return new Headers(strArr2, null);
        }

        private Companion() {
        }

        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m10976deprecated_of(Map<String, String> map) {
            map.getClass();
            return m6802of(map);
        }

        /* JADX INFO: renamed from: of */
        public final Headers m6802of(Map<String, String> map) {
            map.getClass();
            String[] strArr = new String[map.size() * 2];
            int i9 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = AbstractC3149m.m6703R0(key).toString();
                String string2 = AbstractC3149m.m6703R0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i9] = string;
                strArr[i9 + 1] = string2;
                i9 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String[]) A[MD:(java.lang.String[]):void (m)] (LINE:7) call: okhttp3.Headers.<init>(java.lang.String[]):void type: THIS */
    public /* synthetic */ Headers(String[] strArr, AbstractC1411g abstractC1411g) {
        this(strArr);
    }

    /* JADX INFO: renamed from: of */
    public static final Headers m6801of(String... strArr) {
        return Companion.m6803of(strArr);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder add(String str) {
            str.getClass();
            int iM6718q0 = AbstractC3149m.m6718q0(str, ':', 0, 6);
            if (iM6718q0 != -1) {
                add(AbstractC3149m.m6703R0(str.substring(0, iM6718q0)).toString(), str.substring(iM6718q0 + 1));
                return this;
            }
            C2104o.m5291q("Unexpected header: ".concat(str));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addAll(Headers headers) {
            headers.getClass();
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                addLenient$okhttp(headers.name(i9), headers.value(i9));
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addLenient$okhttp(String str) {
            str.getClass();
            int iM6718q0 = AbstractC3149m.m6718q0(str, ':', 1, 4);
            if (iM6718q0 != -1) {
                addLenient$okhttp(str.substring(0, iM6718q0), str.substring(iM6718q0 + 1));
                return this;
            }
            if (str.charAt(0) == ':') {
                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, str.substring(1));
                return this;
            }
            addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, str);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addUnsafeNonAscii(String str, String str2) {
            str.getClass();
            str2.getClass();
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String get(String str) {
            str.getClass();
            int size = this.namesAndValues.size() - 2;
            int iM6749A = AbstractC3165h.m6749A(size, 0, -2);
            if (iM6749A > size) {
                return null;
            }
            while (!str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iM6749A) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder removeAll(String str) {
            str.getClass();
            int i9 = 0;
            while (i9 < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i9))) {
                    this.namesAndValues.remove(i9);
                    this.namesAndValues.remove(i9);
                    i9 -= 2;
                }
                i9 += 2;
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder set(String str, String str2) {
            str.getClass();
            str2.getClass();
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder set(String str, Instant instant) {
            str.getClass();
            instant.getClass();
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, Date date) {
            str.getClass();
            date.getClass();
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder add(String str, String str2) {
            str.getClass();
            str2.getClass();
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.namesAndValues.add(str);
            this.namesAndValues.add(AbstractC3149m.m6703R0(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            str.getClass();
            date.getClass();
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder add(String str, Instant instant) {
            str.getClass();
            instant.getClass();
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }
}
