package okhttp3;

import bsh.C0353j;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.InterfaceC3954a;
import p332wb.AbstractC4855en;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Cookie(String str, String str2, long j3, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j3;
        this.domain = str3;
        this.path = str4;
        this.secure = z9;
        this.httpOnly = z10;
        this.persistent = z11;
        this.hostOnly = z12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final String m10957deprecated_domain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m10958deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m10959deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m10960deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final String m10961deprecated_name() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final String m10962deprecated_path() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m10963deprecated_persistent() {
        return this.persistent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m10964deprecated_secure() {
        return this.secure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final String m10965deprecated_value() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String domain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return AbstractC1416l.m3825a(cookie.name, this.name) && AbstractC1416l.m3825a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && AbstractC1416l.m3825a(cookie.domain, this.domain) && AbstractC1416l.m3825a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long expiresAt() {
        return this.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(527, 31, this.name), 31, this.value), 31, this.expiresAt), 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean matches(HttpUrl httpUrl) {
        httpUrl.getClass();
        if ((this.hostOnly ? AbstractC1416l.m3825a(httpUrl.host(), this.domain) : Companion.domainMatch(httpUrl.host(), this.domain)) && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String name() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String path() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean persistent() {
        return this.persistent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean secure() {
        return this.secure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return toString$okhttp(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString$okhttp(boolean z9) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (z9) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String value() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.Cookie.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int dateCharacterOffset(String str, int i9, int i10, boolean z9) {
            while (i9 < i10) {
                char cCharAt = str.charAt(i9);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z9)) {
                    return i9;
                }
                i9++;
            }
            return i10;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            return AbstractC1416l.m3825a(str, str2) || (AbstractC3156t.m6733W(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final String parseDomain(String str) {
            if (AbstractC3156t.m6733W(str, ".", false)) {
                C2104o.m5294t("Failed requirement.");
                return null;
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(AbstractC3149m.m6686A0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            C2104o.m5289o();
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final long parseExpires(String str, int i9, int i10) {
            int iDateCharacterOffset = dateCharacterOffset(str, i9, i10, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iM6719r0 = -1;
            int i14 = -1;
            int i15 = -1;
            while (iDateCharacterOffset < i10) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i10, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i12 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    strGroup4.getClass();
                    i13 = Integer.parseInt(strGroup4);
                } else if (iM6719r0 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, strGroup5, locale);
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    strPattern.getClass();
                    iM6719r0 = AbstractC3149m.m6719r0(strPattern, strM5165l, 0, false, 6) / 4;
                } else if (i11 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i11 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            if (iM6719r0 == -1) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            if (1 > i13 || i13 >= 32) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            if (i12 < 0 || i12 >= 24) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            if (i14 < 0 || i14 >= 60) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            if (i15 < 0 || i15 >= 60) {
                C2104o.m5294t("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iM6719r0 - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final long parseMaxAge(String str) {
            try {
                long j3 = Long.parseLong(str);
                if (j3 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j3;
            } catch (NumberFormatException e6) {
                Pattern patternCompile = Pattern.compile("-?\\d+");
                patternCompile.getClass();
                str.getClass();
                if (patternCompile.matcher(str).matches()) {
                    return AbstractC3156t.m6740d0(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e6;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (AbstractC1416l.m3825a(strEncodedPath, str)) {
                return true;
            }
            return AbstractC3156t.m6740d0(strEncodedPath, str, false) && (AbstractC3156t.m6733W(str, "/", false) || strEncodedPath.charAt(str.length()) == '/');
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Cookie parse(HttpUrl httpUrl, String str) {
            httpUrl.getClass();
            str.getClass();
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Cookie parse$okhttp(long j3, HttpUrl httpUrl, String str) {
            long j4;
            String str2;
            httpUrl.getClass();
            str.getClass();
            int iDelimiterOffset$default = Util.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(str, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            String strSubstring = null;
            if (iDelimiterOffset$default2 != iDelimiterOffset$default) {
                String strTrimSubstring$default = Util.trimSubstring$default(str, 0, iDelimiterOffset$default2, 1, null);
                if (strTrimSubstring$default.length() != 0 && Util.indexOfControlOrNonAscii(strTrimSubstring$default) == -1) {
                    String strTrimSubstring = Util.trimSubstring(str, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
                    if (Util.indexOfControlOrNonAscii(strTrimSubstring) == -1) {
                        int i9 = iDelimiterOffset$default + 1;
                        int length = str.length();
                        String domain = null;
                        boolean z9 = false;
                        boolean z10 = false;
                        boolean z11 = false;
                        boolean z12 = true;
                        long expires = 253402300799999L;
                        long maxAge = -1;
                        while (i9 < length) {
                            int iDelimiterOffset = Util.delimiterOffset(str, ';', i9, length);
                            int iDelimiterOffset2 = Util.delimiterOffset(str, '=', i9, iDelimiterOffset);
                            String strTrimSubstring2 = Util.trimSubstring(str, i9, iDelimiterOffset2);
                            String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset) : HttpUrl.FRAGMENT_ENCODE_SET;
                            if (AbstractC3156t.m6734X(strTrimSubstring2, "expires")) {
                                try {
                                    expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                                    z10 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (AbstractC3156t.m6734X(strTrimSubstring2, "max-age")) {
                                maxAge = parseMaxAge(strTrimSubstring3);
                                z10 = true;
                            } else if (AbstractC3156t.m6734X(strTrimSubstring2, "domain")) {
                                domain = parseDomain(strTrimSubstring3);
                                z12 = false;
                            } else if (AbstractC3156t.m6734X(strTrimSubstring2, "path")) {
                                strSubstring = strTrimSubstring3;
                            } else if (AbstractC3156t.m6734X(strTrimSubstring2, "secure")) {
                                z11 = true;
                            } else if (AbstractC3156t.m6734X(strTrimSubstring2, "httponly")) {
                                z9 = true;
                            }
                            i9 = iDelimiterOffset + 1;
                        }
                        if (maxAge == Long.MIN_VALUE) {
                            j4 = Long.MIN_VALUE;
                        } else if (maxAge != -1) {
                            long j5 = j3 + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                            j4 = (j5 < j3 || j5 > DatesKt.MAX_DATE) ? 253402300799999L : j5;
                        } else {
                            j4 = expires;
                        }
                        String strHost = httpUrl.host();
                        if (domain == null) {
                            str2 = strHost;
                        } else {
                            if (!domainMatch(strHost, domain)) {
                                return null;
                            }
                            str2 = domain;
                        }
                        if (strHost.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                            return null;
                        }
                        if (strSubstring == null || !AbstractC3156t.m6740d0(strSubstring, "/", false)) {
                            String strEncodedPath = httpUrl.encodedPath();
                            int iM6724w0 = AbstractC3149m.m6724w0(strEncodedPath, '/', 0, 6);
                            strSubstring = iM6724w0 != 0 ? strEncodedPath.substring(0, iM6724w0) : "/";
                        }
                        return new Cookie(strTrimSubstring$default, strTrimSubstring, j4, str2, strSubstring, z11, z9, z10, z12, null);
                    }
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            httpUrl.getClass();
            headers.getClass();
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i9 = 0; i9 < size; i9++) {
                Cookie cookie = parse(httpUrl, listValues.get(i9));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return C4173t.f13710g;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Builder domain(String str, boolean z9) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                C2104o.m5294t(AbstractC4855en.m9263g("unexpected domain: ", str));
                return null;
            }
            this.domain = canonicalHost;
            this.hostOnly = z9;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                C0353j.m1305c("builder.name == null");
                return null;
            }
            String str2 = this.value;
            if (str2 == null) {
                C0353j.m1305c("builder.value == null");
                return null;
            }
            long j3 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j3, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            C0353j.m1305c("builder.domain == null");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder expiresAt(long j3) {
            if (j3 <= 0) {
                j3 = Long.MIN_VALUE;
            }
            if (j3 > DatesKt.MAX_DATE) {
                j3 = 253402300799999L;
            }
            this.expiresAt = j3;
            this.persistent = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder hostOnlyDomain(String str) {
            str.getClass();
            return domain(str, true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder name(String str) {
            str.getClass();
            if (AbstractC1416l.m3825a(AbstractC3149m.m6703R0(str).toString(), str)) {
                this.name = str;
                return this;
            }
            C2104o.m5294t("name is not trimmed");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder path(String str) {
            str.getClass();
            if (AbstractC3156t.m6740d0(str, "/", false)) {
                this.path = str;
                return this;
            }
            C2104o.m5294t("path must start with '/'");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder value(String str) {
            str.getClass();
            if (AbstractC1416l.m3825a(AbstractC3149m.m6703R0(str).toString(), str)) {
                this.value = str;
                return this;
            }
            C2104o.m5294t("value is not trimmed");
            return null;
        }

        public final Builder domain(String str) {
            str.getClass();
            return domain(str, false);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 long)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 boolean)
  (r8v0 boolean)
  (r9v0 boolean)
  (r10v0 boolean)
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void (m)] (LINE:23) call: okhttp3.Cookie.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ Cookie(String str, String str2, long j3, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12, AbstractC1411g abstractC1411g) {
        this(str, str2, j3, str3, str4, z9, z10, z11, z12);
    }
}
