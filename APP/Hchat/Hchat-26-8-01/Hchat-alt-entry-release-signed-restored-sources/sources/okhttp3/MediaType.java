package okhttp3;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p276sf.InterfaceC3954a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m11001deprecated_subtype() {
        return this.subtype;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final String m11002deprecated_type() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && AbstractC1416l.m3825a(((MediaType) obj).mediaType, this.mediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.mediaType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String parameter(String str) {
        str.getClass();
        int i9 = 0;
        int iM6749A = AbstractC3165h.m6749A(0, this.parameterNamesAndValues.length - 1, 2);
        if (iM6749A < 0) {
            return null;
        }
        while (!AbstractC3156t.m6734X(this.parameterNamesAndValues[i9], str)) {
            if (i9 == iM6749A) {
                return null;
            }
            i9 += 2;
        }
        return this.parameterNamesAndValues[i9 + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String subtype() {
        return this.subtype;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.mediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String type() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.MediaType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m11003deprecated_get(String str) {
            str.getClass();
            return get(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m11004deprecated_parse(String str) {
            str.getClass();
            return parse(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MediaType get(String str) {
            str.getClass();
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                C2104o.m5292r(str, "No subtype found for: \"");
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, strGroup, locale);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            String lowerCase = strGroup2.toLowerCase(locale);
            lowerCase.getClass();
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (AbstractC3156t.m6740d0(strGroup4, "'", false) && AbstractC3156t.m6733W(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = AbstractC4855en.m9262f(1, 1, strGroup4);
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, strM5165l, lowerCase, (String[]) arrayList.toArray(new String[0]), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MediaType parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.String), (r4v0 java.lang.String[]) A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void (m)] (LINE:13) call: okhttp3.MediaType.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void type: THIS */
    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, AbstractC1411g abstractC1411g) {
        this(str, str2, str3, strArr);
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }
}
