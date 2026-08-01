package okhttp3;

import ae.C0307f;
import bsh.C1259t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.InterfaceC4691e;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8632n;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0002)*B[\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001eJ\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001fJ\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b J\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b#J\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b$J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0006\u0010'\u001a\u00020(R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011¨\u0006+"}, m16758d2 = {"Lokhttp3/Cookie;", _UrlKt.FRAGMENT_ENCODE_SET, "name", _UrlKt.FRAGMENT_ENCODE_SET, "value", "expiresAt", _UrlKt.FRAGMENT_ENCODE_SET, "domain", "path", "secure", _UrlKt.FRAGMENT_ENCODE_SET, "httpOnly", "persistent", "hostOnly", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "()Ljava/lang/String;", "()J", "()Z", "matches", "url", "Lokhttp3/HttpUrl;", "equals", "other", "hashCode", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "-deprecated_name", "-deprecated_value", "-deprecated_persistent", "-deprecated_expiresAt", "-deprecated_hostOnly", "-deprecated_domain", "-deprecated_path", "-deprecated_httpOnly", "-deprecated_secure", "forObsoleteRfc2965", "toString$okhttp", "newBuilder", "Lokhttp3/Cookie$Builder;", "Builder", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final String sameSite;
    private final boolean secure;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
        this.sameSite = str5;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return AbstractC1061t.m3842c(cookie.name, this.name) && AbstractC1061t.m3842c(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && AbstractC1061t.m3842c(cookie.domain, this.domain) && AbstractC1061t.m3842c(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && AbstractC1061t.m3842c(cookie.sameSite, this.sameSite);
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly)) * 31;
        String str = this.sameSite;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        url.getClass();
        if ((this.hostOnly ? AbstractC1061t.m3842c(url.host(), this.domain) : INSTANCE.domainMatch(url.host(), this.domain)) && INSTANCE.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    /* JADX INFO: renamed from: sameSite, reason: from getter */
    public final String getSameSite() {
        return this.sameSite;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DateFormattingKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
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
        if (this.sameSite != null) {
            sb2.append("; samesite=");
            sb2.append(this.sameSite);
        }
        return sb2.toString();
    }

    public final String value() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0007J'\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0018J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m16758d2 = {"Lokhttp3/Cookie$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "domainMatch", _UrlKt.FRAGMENT_ENCODE_SET, "urlHost", _UrlKt.FRAGMENT_ENCODE_SET, "domain", "pathMatch", "url", "Lokhttp3/HttpUrl;", "path", "parse", "Lokhttp3/Cookie;", "setCookie", "currentTimeMillis", _UrlKt.FRAGMENT_ENCODE_SET, "parse$okhttp", "parseExpires", "s", "pos", _UrlKt.FRAGMENT_ENCODE_SET, "limit", "dateCharacterOffset", "input", "invert", "parseMaxAge", "parseDomain", "parseAll", _UrlKt.FRAGMENT_ENCODE_SET, "headers", "Lokhttp3/Headers;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String urlHost, String domain) {
            if (AbstractC1061t.m3842c(urlHost, domain)) {
                return true;
            }
            return AbstractC8611a0.m33060E(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(urlHost);
        }

        private final String parseDomain(String s10) {
            if (AbstractC8611a0.m33060E(s10, ".", false, 2, null)) {
                C9987e.m38645a("Failed requirement.");
                return null;
            }
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(AbstractC8621f0.m33102I0(s10, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String s10, int pos, int limit) {
            int iDateCharacterOffset = dateCharacterOffset(s10, pos, limit, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s10);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iM33152n0 = -1;
            int i13 = -1;
            int i14 = -1;
            while (iDateCharacterOffset < limit) {
                int iDateCharacterOffset2 = dateCharacterOffset(s10, iDateCharacterOffset + 1, limit, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i11 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    i11 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    i13 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    i14 = Integer.parseInt(strGroup3);
                } else if (i12 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    strGroup4.getClass();
                    i12 = Integer.parseInt(strGroup4);
                } else if (iM33152n0 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    strPattern.getClass();
                    iM33152n0 = AbstractC8621f0.m33152n0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i10 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i10 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(s10, iDateCharacterOffset2 + 1, limit, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            if (iM33152n0 == -1) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            if (1 > i12 || i12 >= 32) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            if (i11 < 0 || i11 >= 24) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            if (i13 < 0 || i13 >= 60) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            if (i14 < 0 || i14 >= 60) {
                C9987e.m38645a("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, iM33152n0 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String s10) {
            try {
                long j10 = Long.parseLong(s10);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new C8632n("-?\\d+").m33217i(s10)) {
                    return AbstractC8611a0.m33075T(s10, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl url, String path) {
            String strEncodedPath = url.encodedPath();
            if (AbstractC1061t.m3842c(strEncodedPath, path)) {
                return true;
            }
            return AbstractC8611a0.m33075T(strEncodedPath, path, false, 2, null) && (AbstractC8611a0.m33060E(path, "/", false, 2, null) || strEncodedPath.charAt(path.length()) == '/');
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            url.getClass();
            setCookie.getClass();
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long currentTimeMillis, HttpUrl url, String setCookie) {
            long j10;
            url.getClass();
            setCookie.getClass();
            int iDelimiterOffset$default = _UtilCommonKt.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            Cookie cookie = null;
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = _UtilCommonKt.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || _UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = _UtilCommonKt.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (_UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String strSubstring = null;
            String domain = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long maxAge = -1;
            long expires = DateFormattingKt.MAX_DATE;
            while (i10 < length) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(setCookie, ';', i10, length);
                int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(setCookie, '=', i10, iDelimiterOffset);
                String strTrimSubstring2 = _UtilCommonKt.trimSubstring(setCookie, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? _UtilCommonKt.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : _UrlKt.FRAGMENT_ENCODE_SET;
                Cookie cookie2 = cookie;
                if (AbstractC8611a0.m33061F(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z11 = true;
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "domain", true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z13 = false;
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "path", true)) {
                    strSubstring = strTrimSubstring3;
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "secure", true)) {
                    z12 = true;
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "httponly", true)) {
                    z10 = true;
                } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "samesite", true)) {
                    str = strTrimSubstring3;
                }
                i10 = iDelimiterOffset + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (maxAge == Long.MIN_VALUE) {
                j10 = Long.MIN_VALUE;
            } else if (maxAge != -1) {
                long j11 = currentTimeMillis + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                j10 = (j11 < currentTimeMillis || j11 > DateFormattingKt.MAX_DATE) ? 253402300799999L : j11;
            } else {
                j10 = expires;
            }
            String strHost = url.host();
            if (domain == null) {
                domain = strHost;
            } else if (!domainMatch(strHost, domain)) {
                return cookie3;
            }
            if (strHost.length() != domain.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(domain) == null) {
                return cookie3;
            }
            if (strSubstring == null || !AbstractC8611a0.m33075T(strSubstring, "/", false, 2, cookie3)) {
                String strEncodedPath = url.encodedPath();
                int iM33164t0 = AbstractC8621f0.m33164t0(strEncodedPath, '/', 0, false, 6, null);
                strSubstring = iM33164t0 != 0 ? strEncodedPath.substring(0, iM33164t0) : "/";
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j10, domain, strSubstring, z12, z10, z11, z13, str, null);
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            url.getClass();
            headers.getClass();
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            List<Cookie> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                Cookie cookie = parse(url, listValues.get(i10));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                listUnmodifiableList.getClass();
            }
            return listUnmodifiableList == null ? AbstractC5114x.m20800o() : listUnmodifiableList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m16758d2 = {"Lokhttp3/Cookie$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "cookie", "Lokhttp3/Cookie;", "(Lokhttp3/Cookie;)V", "name", _UrlKt.FRAGMENT_ENCODE_SET, "value", "expiresAt", _UrlKt.FRAGMENT_ENCODE_SET, "domain", "path", "secure", _UrlKt.FRAGMENT_ENCODE_SET, "httpOnly", "persistent", "hostOnly", "sameSite", "hostOnlyDomain", "build", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Builder {
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path;
        private boolean persistent;
        private String sameSite;
        private boolean secure;
        private String value;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Cookie cookie) {
            this();
            cookie.getClass();
            this.name = cookie.name();
            this.value = cookie.value();
            this.expiresAt = cookie.expiresAt();
            this.domain = cookie.domain();
            this.path = cookie.path();
            this.secure = cookie.secure();
            this.httpOnly = cookie.httpOnly();
            this.persistent = cookie.persistent();
            this.hostOnly = cookie.hostOnly();
            this.sameSite = cookie.getSameSite();
        }

        private final Builder domain(String domain, boolean hostOnly) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                C0307f.m923a("unexpected domain: ", domain);
                return null;
            }
            this.domain = canonicalHost;
            this.hostOnly = hostOnly;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                C1259t2.m5095a("builder.name == null");
                return null;
            }
            String str2 = this.value;
            if (str2 == null) {
                C1259t2.m5095a("builder.value == null");
                return null;
            }
            long j10 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j10, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, this.sameSite, null);
            }
            C1259t2.m5095a("builder.domain == null");
            return null;
        }

        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DateFormattingKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            domain.getClass();
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            name.getClass();
            if (AbstractC1061t.m3842c(AbstractC8621f0.m33161r1(name).toString(), name)) {
                this.name = name;
                return this;
            }
            C9987e.m38645a("name is not trimmed");
            return null;
        }

        public final Builder path(String path) {
            path.getClass();
            if (AbstractC8611a0.m33075T(path, "/", false, 2, null)) {
                this.path = path;
                return this;
            }
            C9987e.m38645a("path must start with '/'");
            return null;
        }

        public final Builder sameSite(String sameSite) {
            sameSite.getClass();
            if (AbstractC1061t.m3842c(AbstractC8621f0.m33161r1(sameSite).toString(), sameSite)) {
                this.sameSite = sameSite;
                return this;
            }
            C9987e.m38645a("sameSite is not trimmed");
            return null;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            value.getClass();
            if (AbstractC1061t.m3842c(AbstractC8621f0.m33161r1(value).toString(), value)) {
                this.value = value;
                return this;
            }
            C9987e.m38645a("value is not trimmed");
            return null;
        }

        public final Builder domain(String domain) {
            domain.getClass();
            return domain(domain, false);
        }

        public Builder() {
            this.expiresAt = DateFormattingKt.MAX_DATE;
            this.path = "/";
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, AbstractC1043k abstractC1043k) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }
}
