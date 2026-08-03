package Yue;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6149 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f15046 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f15047 = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f1857;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final String f1858;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f15050;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String[] f15051;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0916 f15045 = new C0916(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Pattern f15048 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Pattern f15049 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۨ$ۥ */
    @InterfaceC7507({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class C0916 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡ۠ۥۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0916(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @InterfaceC5572(name = "-deprecated_get")
        /* JADX INFO: renamed from: ۥ */
        public final C6149 m2649(@InterfaceC6399 String str) {
            C5499.m17103(str, "mediaType");
            return m18955(str);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @InterfaceC5572(name = "-deprecated_parse")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final C6149 m2650(@InterfaceC6399 String str) {
            C5499.m17103(str, "mediaType");
            return m18956(str);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "get")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C6149 m18955(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            Matcher matcher = C6149.f15048.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + C8039.f3212).toString());
            }
            String strGroup = matcher.group(1);
            C5499.m17102(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            C5499.m17102(locale, "US");
            String lowerCase = strGroup.toLowerCase(locale);
            C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            C5499.m17102(strGroup2, "typeSubtype.group(2)");
            C5499.m17102(locale, "US");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            C5499.m17102(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C6149.f15049.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(C8039.f3212);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (C7627.m24008(strGroup4, "'", false, 2, null) && C7627.m23973(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        C5499.m17102(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new C6149(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        @InterfaceC5578
        @InterfaceC5572(name = "parse")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C6149 m18956(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            try {
                return m18955(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0916() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.String), (r4v0 java.lang.String[]) A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void (m)] (LINE:1) call: Yue.ۥۡ۠ۥۨ.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6149(String str, String str2, String str3, String[] strArr, C4335 c4335) {
        this(str, str2, str3, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Charset m18947(C6149 c6149, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return c6149.m18951(charset);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "get")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C6149 m18948(@InterfaceC6399 String str) {
        return f15045.m18955(str);
    }

    @InterfaceC5578
    @InterfaceC5572(name = "parse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C6149 m18949(@InterfaceC6399 String str) {
        return f15045.m18956(str);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C6149) && C5499.m17094(((C6149) obj).f1857, this.f1857);
    }

    public int hashCode() {
        return this.f1857.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return this.f1857;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "subtype", imports = {}))
    @InterfaceC5572(name = "-deprecated_subtype")
    /* JADX INFO: renamed from: ۥ */
    public final String m2647() {
        return this.f15050;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "type", imports = {}))
    @InterfaceC5572(name = "-deprecated_type")
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2648() {
        return this.f1858;
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Charset m18950() {
        return m18947(this, null, 1, null);
    }

    @InterfaceC5573
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Charset m18951(@InterfaceC6489 Charset charset) {
        String strM18952 = m18952("charset");
        if (strM18952 == null) {
            return charset;
        }
        try {
            return Charset.forName(strM18952);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m18952(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        int i = 0;
        int iM21576 = C6823.m21576(0, this.f15051.length - 1, 2);
        if (iM21576 < 0) {
            return null;
        }
        while (!C7627.m23974(this.f15051[i], str, true)) {
            if (i == iM21576) {
                return null;
            }
            i += 2;
        }
        return this.f15051[i + 1];
    }

    @InterfaceC6399
    @InterfaceC5572(name = "subtype")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final String m18953() {
        return this.f15050;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "type")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final String m18954() {
        return this.f1858;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6149(String str, String str2, String str3, String[] strArr) {
        this.f1857 = str;
        this.f1858 = str2;
        this.f15050 = str3;
        this.f15051 = strArr;
    }
}
