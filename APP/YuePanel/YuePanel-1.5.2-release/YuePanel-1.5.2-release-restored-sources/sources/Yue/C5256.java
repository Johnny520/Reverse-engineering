package Yue;

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
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256 implements Iterable<C6599<? extends String, ? extends String>>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0688 f12534 = new C0688(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final String[] f12535;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ$ۥ */
    @InterfaceC7507({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class C0687 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final List<String> f1371 = new ArrayList(20);

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0687 m2021(@InterfaceC6399 String str) {
            C5499.m17103(str, "line");
            int iM24056 = C7628.m24056(str, ':', 0, false, 6, null);
            if (iM24056 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String strSubstring = str.substring(0, iM24056);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = C7628.m24174(strSubstring).toString();
            String strSubstring2 = str.substring(iM24056 + 1);
            C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
            m2022(string, strSubstring2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0687 m2022(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            C0688 c0688 = C5256.f12534;
            c0688.m16136(str);
            c0688.m16137(str2, str);
            m16124(str, str2);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0687 m16120(@InterfaceC6399 String str, @InterfaceC6399 Instant instant) {
            C5499.m17103(str, "name");
            C5499.m17103(instant, "value");
            m16121(str, new Date(instant.toEpochMilli()));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0687 m16121(@InterfaceC6399 String str, @InterfaceC6399 Date date) {
            C5499.m17103(str, "name");
            C5499.m17103(date, "value");
            m2022(str, C4305.m1260(date));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0687 m16122(@InterfaceC6399 C5256 c5256) {
            C5499.m17103(c5256, "headers");
            int size = c5256.size();
            for (int i = 0; i < size; i++) {
                m16124(c5256.m16114(i), c5256.m16118(i));
            }
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C0687 m16123(@InterfaceC6399 String str) {
            C5499.m17103(str, "line");
            int iM24056 = C7628.m24056(str, ':', 1, false, 4, null);
            if (iM24056 != -1) {
                String strSubstring = str.substring(0, iM24056);
                C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iM24056 + 1);
                C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m16124(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                C5499.m17102(strSubstring3, "this as java.lang.String).substring(startIndex)");
                m16124("", strSubstring3);
            } else {
                m16124("", str);
            }
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C0687 m16124(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            this.f1371.add(str);
            this.f1371.add(C7628.m24174(str2).toString());
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C0687 m16125(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            C5256.f12534.m16136(str);
            m16124(str, str2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C5256 m16126() {
            return new C5256((String[]) this.f1371.toArray(new String[0]), null);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final String m16127(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            int size = this.f1371.size() - 2;
            int iM21576 = C6823.m21576(size, 0, -2);
            if (iM21576 > size) {
                return null;
            }
            while (!C7627.m23974(str, this.f1371.get(size), true)) {
                if (size == iM21576) {
                    return null;
                }
                size -= 2;
            }
            return this.f1371.get(size + 1);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final List<String> m16128() {
            return this.f1371;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C0687 m16129(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            int i = 0;
            while (i < this.f1371.size()) {
                if (C7627.m23974(str, this.f1371.get(i), true)) {
                    this.f1371.remove(i);
                    this.f1371.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C0687 m16130(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            C0688 c0688 = C5256.f12534;
            c0688.m16136(str);
            c0688.m16137(str2, str);
            m16129(str);
            m16124(str, str2);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final C0687 m16131(@InterfaceC6399 String str, @InterfaceC6399 Instant instant) {
            C5499.m17103(str, "name");
            C5499.m17103(instant, "value");
            return m16132(str, new Date(instant.toEpochMilli()));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C0687 m16132(@InterfaceC6399 String str, @InterfaceC6399 Date date) {
            C5499.m17103(str, "name");
            C5499.m17103(date, "value");
            m16130(str, C4305.m1260(date));
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ$ۥ۟ */
    @InterfaceC7507({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class C0688 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۢۢ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0688(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "function moved to extension", replaceWith = @InterfaceC7097(expression = "headers.toHeaders()", imports = {}))
        @InterfaceC5572(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ */
        public final C5256 m2023(@InterfaceC6399 Map<String, String> map) {
            C5499.m17103(map, "headers");
            return m16139(map);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "function name changed", replaceWith = @InterfaceC7097(expression = "headersOf(*namesAndValues)", imports = {}))
        @InterfaceC5572(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5256 m2024(@InterfaceC6399 String... strArr) {
            C5499.m17103(strArr, "namesAndValues");
            return m16140((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m16136(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(C8158.m26854("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m16137(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C8158.m26854("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(C8158.m26870(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final String m16138(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM21576 = C6823.m21576(length, 0, -2);
            if (iM21576 > length) {
                return null;
            }
            while (!C7627.m23974(str, strArr[length], true)) {
                if (length == iM21576) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "of")
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C5256 m16139(@InterfaceC6399 Map<String, String> map) {
            C5499.m17103(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = C7628.m24174(key).toString();
                String string2 = C7628.m24174(value).toString();
                m16136(string);
                m16137(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new C5256(strArr, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "of")
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C5256 m16140(@InterfaceC6399 String... strArr) {
            C5499.m17103(strArr, "namesAndValues");
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i2] = C7628.m24174(str).toString();
            }
            int iM21576 = C6823.m21576(0, strArr2.length - 1, 2);
            if (iM21576 >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    m16136(str2);
                    m16137(str3, str2);
                    if (i == iM21576) {
                        break;
                    }
                    i += 2;
                }
            }
            return new C5256(strArr2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0688() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String[]) A[MD:(java.lang.String[]):void (m)] (LINE:1) call: Yue.ۥ۠ۤۢۢ.<init>(java.lang.String[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5256(String[] strArr, C4335 c4335) {
        this(strArr);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "of")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5256 m16109(@InterfaceC6399 Map<String, String> map) {
        return f12534.m16139(map);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "of")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C5256 m16110(@InterfaceC6399 String... strArr) {
        return f12534.m16140(strArr);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C5256) && Arrays.equals(this.f12535, ((C5256) obj).f12535);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12535);
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator<Yue.ۥۣۡۦ۠<java.lang.String, java.lang.String>>' to match base method */
    @Override // java.lang.Iterable
    @InterfaceC6399
    public Iterator<C6599<? extends String, ? extends String>> iterator() {
        int size = size();
        C6599[] c6599Arr = new C6599[size];
        for (int i = 0; i < size; i++) {
            c6599Arr[i] = C8003.m4014(m16114(i), m16118(i));
        }
        return C3390.m474(c6599Arr);
    }

    @InterfaceC5572(name = "size")
    public final int size() {
        return this.f12535.length / 2;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM16114 = m16114(i);
            String strM16118 = m16118(i);
            sb.append(strM16114);
            sb.append(": ");
            if (C8158.m26870(strM16114)) {
                strM16118 = "██";
            }
            sb.append(strM16118);
            sb.append("\n");
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "size", imports = {}))
    @InterfaceC5572(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ */
    public final int m2019() {
        return size();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final long m2020() {
        String[] strArr = this.f12535;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f12535[i].length();
        }
        return length;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m16111(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return f12534.m16138(this.f12535, str);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Date m16112(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        String strM16111 = m16111(str);
        if (strM16111 != null) {
            return C4305.m1259(strM16111);
        }
        return null;
    }

    @InterfaceC6489
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Instant m16113(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        Date dateM16112 = m16112(str);
        if (dateM16112 != null) {
            return dateM16112.toInstant();
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m16114(int i) {
        return this.f12535[i * 2];
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Set<String> m16115() {
        TreeSet treeSet = new TreeSet(C7627.m23980(C7610.f2968));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(m16114(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        C5499.m17102(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C0687 m16116() {
        C0687 c0687 = new C0687();
        C3885.m10773(c0687.m16128(), this.f12535);
        return c0687;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Map<String, List<String>> m16117() {
        TreeMap treeMap = new TreeMap(C7627.m23980(C7610.f2968));
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM16114 = m16114(i);
            Locale locale = Locale.US;
            C5499.m17102(locale, "US");
            String lowerCase = strM16114.toLowerCase(locale);
            C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m16118(i));
        }
        return treeMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m16118(int i) {
        return this.f12535[(i * 2) + 1];
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final List<String> m16119(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C7627.m23974(str, m16114(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m16118(i));
            }
        }
        if (arrayList == null) {
            return C3880.m10735();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C5499.m17102(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5256(String[] strArr) {
        this.f12535 = strArr;
    }
}
