package Yue;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3693 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f468;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final Map<String, String> f469;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3693(@InterfaceC6399 String str, @InterfaceC6399 Map<String, String> map) {
        String lowerCase;
        C5499.m17103(str, "scheme");
        C5499.m17103(map, "authParams");
        this.f468 = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                C5499.m17102(locale, "US");
                lowerCase = key.toLowerCase(locale);
                C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C5499.m17102(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f469 = mapUnmodifiableMap;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3693) {
            C3693 c3693 = (C3693) obj;
            if (C5499.m17094(c3693.f468, this.f468) && C5499.m17094(c3693.f469, this.f469)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f468.hashCode()) * 31) + this.f469.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return this.f468 + " authParams=" + this.f469;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "authParams", imports = {}))
    @InterfaceC5572(name = "-deprecated_authParams")
    /* JADX INFO: renamed from: ۥ */
    public final Map<String, String> m768() {
        return this.f469;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "charset", imports = {}))
    @InterfaceC5572(name = "-deprecated_charset")
    /* JADX INFO: renamed from: ۥ۟ */
    public final Charset m769() {
        return m10142();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "realm", imports = {}))
    @InterfaceC5572(name = "-deprecated_realm")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m10139() {
        return m10143();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "scheme", imports = {}))
    @InterfaceC5572(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m10140() {
        return this.f468;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "authParams")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Map<String, String> m10141() {
        return this.f469;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "charset")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Charset m10142() {
        String str = this.f469.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                C5499.m17102(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C5499.m17102(charset, "ISO_8859_1");
        return charset;
    }

    @InterfaceC5572(name = "realm")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final String m10143() {
        return this.f469.get("realm");
    }

    @InterfaceC6399
    @InterfaceC5572(name = "scheme")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m10144() {
        return this.f468;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C3693 m10145(@InterfaceC6399 Charset charset) {
        C5499.m17103(charset, "charset");
        Map mapM18646 = C5943.m18646(this.f469);
        String strName = charset.name();
        C5499.m17102(strName, "charset.name()");
        mapM18646.put("charset", strName);
        return new C3693(this.f468, (Map<String, String>) mapM18646);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3693(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "scheme");
        C5499.m17103(str2, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        C5499.m17102(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
