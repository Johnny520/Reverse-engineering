package Yue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4216 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0353 f8555 = new C0353(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Pattern f8556 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Pattern f8557 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Pattern f8558 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Pattern f8559 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f740;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final String f741;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f8560;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f8561;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f8562;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean f8563;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean f8564;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean f8565;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean f8566;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۥۨ$ۥ */
    @InterfaceC7507({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class C0352 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public String f742;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public String f743;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String f8568;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f8570;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f8571;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f8572;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f8573;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long f8567 = C4305.f805;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public String f8569 = "/";

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C4216 m1176() {
            String str = this.f742;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f743;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.f8567;
            String str3 = this.f8568;
            if (str3 != null) {
                return new C4216(str, str2, j, str3, this.f8569, this.f8570, this.f8571, this.f8572, this.f8573, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0352 m1177(@InterfaceC6399 String str) {
            C5499.m17103(str, "domain");
            return m12136(str, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0352 m12136(String str, boolean z) {
            String strM16319 = C5317.m16319(str);
            if (strM16319 != null) {
                this.f8568 = strM16319;
                this.f8573 = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0352 m12137(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > C4305.f805) {
                j = 253402300799999L;
            }
            this.f8567 = j;
            this.f8572 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0352 m12138(@InterfaceC6399 String str) {
            C5499.m17103(str, "domain");
            return m12136(str, true);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C0352 m12139() {
            this.f8571 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C0352 m12140(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            if (!C5499.m17094(C7628.m24174(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.f742 = str;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C0352 m12141(@InterfaceC6399 String str) {
            C5499.m17103(str, "path");
            if (!C7627.m24008(str, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.f8569 = str;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C0352 m12142() {
            this.f8570 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C0352 m12143(@InterfaceC6399 String str) {
            C5499.m17103(str, "value");
            if (!C5499.m17094(C7628.m24174(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.f743 = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۥۨ$ۥ۟ */
    public static final class C0353 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۧۥۨ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0353(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m12144(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m12145(String str, String str2) {
            if (C5499.m17094(str, str2)) {
                return true;
            }
            return C7627.m23973(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C8158.m26840(str);
        }

        @InterfaceC5578
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C4216 m12146(@InterfaceC6399 C5385 c5385, @InterfaceC6399 String str) {
            C5499.m17103(c5385, "url");
            C5499.m17103(str, "setCookie");
            return m12147(System.currentTimeMillis(), c5385, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r1
  0x00d7: PHI (r1v23 long) = (r1v7 long), (r1v11 long) binds: [B:42:0x00d5, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C4216 m12147(long j, @InterfaceC6399 C5385 c5385, @InterfaceC6399 String str) {
            long j2;
            long j3;
            C4216 c4216;
            String str2;
            String str3;
            C5499.m17103(c5385, "url");
            C5499.m17103(str, "setCookie");
            int iM26850 = C8158.m26850(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, 0, 0, 6, null);
            int iM268502 = C8158.m26850(str, SignatureVisitor.INSTANCEOF, 0, iM26850, 2, null);
            if (iM268502 == iM26850) {
                return null;
            }
            String strM26894 = C8158.m26894(str, 0, iM268502, 1, null);
            if (strM26894.length() == 0 || C8158.m26860(strM26894) != -1) {
                return null;
            }
            String strM26893 = C8158.m26893(str, iM268502 + 1, iM26850);
            if (C8158.m26860(strM26893) != -1) {
                return null;
            }
            int i = iM26850 + 1;
            int length = str.length();
            String strM12149 = null;
            String str4 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long jM12151 = -1;
            long jM12150 = C4305.f805;
            while (i < length) {
                int iM26848 = C8158.m26848(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i, length);
                int iM268482 = C8158.m26848(str, SignatureVisitor.INSTANCEOF, i, iM26848);
                String strM268932 = C8158.m26893(str, i, iM268482);
                String strM268933 = iM268482 < iM26848 ? C8158.m26893(str, iM268482 + 1, iM26848) : "";
                if (C7627.m23974(strM268932, "expires", true)) {
                    try {
                        jM12150 = m12150(strM268933, 0, strM268933.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (C7627.m23974(strM268932, "max-age", true)) {
                    jM12151 = m12151(strM268933);
                    z3 = true;
                } else if (C7627.m23974(strM268932, "domain", true)) {
                    strM12149 = m12149(strM268933);
                    z4 = false;
                } else if (C7627.m23974(strM268932, "path", true)) {
                    str4 = strM268933;
                } else if (C7627.m23974(strM268932, "secure", true)) {
                    z = true;
                } else if (C7627.m23974(strM268932, "httponly", true)) {
                    z2 = true;
                }
                i = iM26848 + 1;
            }
            long j4 = Long.MIN_VALUE;
            if (jM12151 != Long.MIN_VALUE) {
                if (jM12151 != -1) {
                    j4 = j + (jM12151 <= 9223372036854775L ? jM12151 * ((long) 1000) : Long.MAX_VALUE);
                    if (j4 >= j) {
                        j3 = C4305.f805;
                        if (j4 <= C4305.f805) {
                            j2 = j4;
                        }
                    } else {
                        j3 = C4305.f805;
                    }
                    j2 = j3;
                } else {
                    j2 = jM12150;
                }
            }
            String strM16772 = c5385.m16772();
            if (strM12149 == null) {
                str2 = strM16772;
                c4216 = null;
            } else {
                if (!m12145(strM16772, strM12149)) {
                    return null;
                }
                c4216 = null;
                str2 = strM12149;
            }
            if (strM16772.length() != str2.length() && PublicSuffixDatabase.INSTANCE.m31139().m31134(str2) == null) {
                return c4216;
            }
            String strSubstring = "/";
            String str5 = str4;
            if (str5 == null || !C7627.m24008(str5, "/", false, 2, c4216)) {
                String strM16767 = c5385.m16767();
                int iM24070 = C7628.m24070(strM16767, '/', 0, false, 6, null);
                if (iM24070 != 0) {
                    strSubstring = strM16767.substring(0, iM24070);
                    C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str3 = strSubstring;
            } else {
                str3 = str5;
            }
            return new C4216(strM26894, strM26893, j2, str2, str3, z, z2, z3, z4, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final List<C4216> m12148(@InterfaceC6399 C5385 c5385, @InterfaceC6399 C5256 c5256) {
            C5499.m17103(c5385, "url");
            C5499.m17103(c5256, "headers");
            List<String> listM16119 = c5256.m16119("Set-Cookie");
            int size = listM16119.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C4216 c4216M12146 = m12146(c5385, listM16119.get(i));
                if (c4216M12146 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c4216M12146);
                }
            }
            if (arrayList == null) {
                return C3880.m10735();
            }
            List<C4216> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            C5499.m17102(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final String m12149(String str) {
            if (!(!C7627.m23973(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strM16319 = C5317.m16319(C7628.m24094(str, "."));
            if (strM16319 != null) {
                return strM16319;
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final long m12150(String str, int i, int i2) {
            int iM12144 = m12144(str, i, i2, false);
            Matcher matcher = C4216.f8559.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int iM24057 = -1;
            int i6 = -1;
            int i7 = -1;
            while (iM12144 < i2) {
                int iM121442 = m12144(str, iM12144 + 1, i2, true);
                matcher.region(iM12144, iM121442);
                if (i4 == -1 && matcher.usePattern(C4216.f8559).matches()) {
                    String strGroup = matcher.group(1);
                    C5499.m17102(strGroup, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    C5499.m17102(strGroup2, "matcher.group(2)");
                    i6 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    C5499.m17102(strGroup3, "matcher.group(3)");
                    i7 = Integer.parseInt(strGroup3);
                } else if (i5 == -1 && matcher.usePattern(C4216.f8558).matches()) {
                    String strGroup4 = matcher.group(1);
                    C5499.m17102(strGroup4, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup4);
                } else if (iM24057 == -1 && matcher.usePattern(C4216.f8557).matches()) {
                    String strGroup5 = matcher.group(1);
                    C5499.m17102(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C5499.m17102(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = C4216.f8557.pattern();
                    C5499.m17102(strPattern, "MONTH_PATTERN.pattern()");
                    iM24057 = C7628.m24057(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(C4216.f8556).matches()) {
                    String strGroup6 = matcher.group(1);
                    C5499.m17102(strGroup6, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup6);
                }
                iM12144 = m12144(str, iM121442 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (iM24057 == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i5 || i5 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i4 < 0 || i4 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i6 < 0 || i6 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C8158.f24180);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iM24057 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final long m12151(String str) {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new C7075("-?\\d+").m22055(str)) {
                    return C7627.m24008(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m12152(C5385 c5385, String str) {
            String strM16767 = c5385.m16767();
            if (C5499.m17094(strM16767, str)) {
                return true;
            }
            return C7627.m24008(strM16767, str, false, 2, null) && (C7627.m23973(str, "/", false, 2, null) || strM16767.charAt(str.length()) == '/');
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0353() {
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
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void (m)] (LINE:1) call: Yue.ۥ۟ۧۥۨ.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4216(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C4335 c4335) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    @InterfaceC5578
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final C4216 m12116(@InterfaceC6399 C5385 c5385, @InterfaceC6399 String str) {
        return f8555.m12146(c5385, str);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final List<C4216> m12117(@InterfaceC6399 C5385 c5385, @InterfaceC6399 C5256 c5256) {
        return f8555.m12148(c5385, c5256);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C4216) {
            C4216 c4216 = (C4216) obj;
            if (C5499.m17094(c4216.f740, this.f740) && C5499.m17094(c4216.f741, this.f741) && c4216.f8560 == this.f8560 && C5499.m17094(c4216.f8561, this.f8561) && C5499.m17094(c4216.f8562, this.f8562) && c4216.f8563 == this.f8563 && c4216.f8564 == this.f8564 && c4216.f8565 == this.f8565 && c4216.f8566 == this.f8566) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f740.hashCode()) * 31) + this.f741.hashCode()) * 31) + Long.hashCode(this.f8560)) * 31) + this.f8561.hashCode()) * 31) + this.f8562.hashCode()) * 31) + Boolean.hashCode(this.f8563)) * 31) + Boolean.hashCode(this.f8564)) * 31) + Boolean.hashCode(this.f8565)) * 31) + Boolean.hashCode(this.f8566);
    }

    @InterfaceC6399
    public String toString() {
        return m12134(false);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "domain", imports = {}))
    @InterfaceC5572(name = "-deprecated_domain")
    /* JADX INFO: renamed from: ۥ */
    public final String m1174() {
        return this.f8561;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "expiresAt", imports = {}))
    @InterfaceC5572(name = "-deprecated_expiresAt")
    /* JADX INFO: renamed from: ۥ۟ */
    public final long m1175() {
        return this.f8560;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "hostOnly", imports = {}))
    @InterfaceC5572(name = "-deprecated_hostOnly")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m12118() {
        return this.f8566;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "httpOnly", imports = {}))
    @InterfaceC5572(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m12119() {
        return this.f8564;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "name", imports = {}))
    @InterfaceC5572(name = "-deprecated_name")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final String m12120() {
        return this.f740;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "path", imports = {}))
    @InterfaceC5572(name = "-deprecated_path")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m12121() {
        return this.f8562;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "persistent", imports = {}))
    @InterfaceC5572(name = "-deprecated_persistent")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m12122() {
        return this.f8565;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "secure", imports = {}))
    @InterfaceC5572(name = "-deprecated_secure")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m12123() {
        return this.f8563;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "value", imports = {}))
    @InterfaceC5572(name = "-deprecated_value")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m12124() {
        return this.f741;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "domain")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final String m12125() {
        return this.f8561;
    }

    @InterfaceC5572(name = "expiresAt")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final long m12126() {
        return this.f8560;
    }

    @InterfaceC5572(name = "hostOnly")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m12127() {
        return this.f8566;
    }

    @InterfaceC5572(name = "httpOnly")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m12128() {
        return this.f8564;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m12129(@InterfaceC6399 C5385 c5385) {
        C5499.m17103(c5385, "url");
        if ((this.f8566 ? C5499.m17094(c5385.m16772(), this.f8561) : f8555.m12145(c5385.m16772(), this.f8561)) && f8555.m12152(c5385, this.f8562)) {
            return !this.f8563 || c5385.m16773();
        }
        return false;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "name")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final String m12130() {
        return this.f740;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "path")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String m12131() {
        return this.f8562;
    }

    @InterfaceC5572(name = "persistent")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m12132() {
        return this.f8565;
    }

    @InterfaceC5572(name = "secure")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m12133() {
        return this.f8563;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final String m12134(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f740);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f741);
        if (this.f8565) {
            if (this.f8560 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C4305.m1260(new Date(this.f8560)));
            }
        }
        if (!this.f8566) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f8561);
        }
        sb.append("; path=");
        sb.append(this.f8562);
        if (this.f8563) {
            sb.append("; secure");
        }
        if (this.f8564) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        C5499.m17102(string, "toString()");
        return string;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "value")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final String m12135() {
        return this.f741;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4216(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f740 = str;
        this.f741 = str2;
        this.f8560 = j;
        this.f8561 = str3;
        this.f8562 = str4;
        this.f8563 = z;
        this.f8564 = z2;
        this.f8565 = z3;
        this.f8566 = z4;
    }
}
