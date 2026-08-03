package okhttp3;

import gg.AbstractC1416l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Challenge(String str, Map<String, String> map) {
        String strM5165l;
        str.getClass();
        map.getClass();
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                strM5165l = AbstractC2091b.m5165l(locale, key, locale);
            } else {
                strM5165l = null;
            }
            linkedHashMap.put(strM5165l, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        this.authParams = mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m10949deprecated_authParams() {
        return this.authParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m10950deprecated_charset() {
        return charset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m10951deprecated_realm() {
        return realm();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m10952deprecated_scheme() {
        return this.scheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                charsetForName.getClass();
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        charset.getClass();
        return charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return AbstractC1416l.m3825a(challenge.scheme, this.scheme) && AbstractC1416l.m3825a(challenge.authParams, this.authParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.authParams.hashCode() + AbstractC0921a.m2244g(899, 31, this.scheme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String realm() {
        return this.authParams.get("realm");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String scheme() {
        return this.scheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Challenge withCharset(Charset charset) {
        charset.getClass();
        Map<String, String> map = this.authParams;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        String strName = charset.name();
        strName.getClass();
        linkedHashMap.put("charset", strName);
        return new Challenge(this.scheme, linkedHashMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        str.getClass();
        str2.getClass();
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        mapSingletonMap.getClass();
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
