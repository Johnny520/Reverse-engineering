package Yue;

import com.android.p001dx.p004io.Opcodes;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5385 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0736 f13231 = new C0736(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final char[] f13232 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13233 = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13234 = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13235 = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13236 = "[]";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13237 = " \"'<>#";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13238 = " \"'<>#&=";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13239 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13240 = "\\^`{|}";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13241 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13242 = "";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f13243 = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final String f1470;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final String f1471;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f13244;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f13245;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f13246;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<String> f13247;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final List<String> f13248;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f13249;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final String f13250;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean f13251;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۥ$ۥ */
    @InterfaceC7507({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class C0735 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final C5386 f13252 = new C5386(null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f13253 = "Invalid URL host";

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public String f1472;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String f13255;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final List<String> f13257;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6489
        public List<String> f13258;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6489
        public String f13259;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public String f1473 = "";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public String f13254 = "";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f13256 = -1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۥ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C5386 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۨۥ.ۥ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C5386(C4335 c4335) {
                this();
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final int m16845(String str, int i, int i2) {
                try {
                    int i3 = Integer.parseInt(C0736.m16849(C5385.f13231, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 > i3 || i3 >= 65536) {
                        return -1;
                    }
                    return i3;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final int m16846(String str, int i, int i2) {
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public final int m16847(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((C5499.m17107(cCharAt, 97) < 0 || C5499.m17107(cCharAt, 122) > 0) && (C5499.m17107(cCharAt, 65) < 0 || C5499.m17107(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public final int m16848(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C5386() {
            }
        }

        public C0735() {
            ArrayList arrayList = new ArrayList();
            this.f13257 = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        @InterfaceC6399
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f1472;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f1473.length() > 0 || this.f13254.length() > 0) {
                sb.append(this.f1473);
                if (this.f13254.length() > 0) {
                    sb.append(':');
                    sb.append(this.f13254);
                }
                sb.append('@');
            }
            String str2 = this.f13255;
            if (str2 != null) {
                C5499.m17100(str2);
                if (C7628.m24034(str2, ':', false, 2, null)) {
                    sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                    sb.append(this.f13255);
                    sb.append(']');
                } else {
                    sb.append(this.f13255);
                }
            }
            if (this.f13256 != -1 || this.f1472 != null) {
                int iM16800 = m16800();
                String str3 = this.f1472;
                if (str3 != null) {
                    C0736 c0736 = C5385.f13231;
                    C5499.m17100(str3);
                    if (iM16800 != c0736.m16854(str3)) {
                        sb.append(':');
                        sb.append(iM16800);
                    }
                }
            }
            C0736 c07362 = C5385.f13231;
            c07362.m16861(this.f13257, sb);
            if (this.f13258 != null) {
                sb.append('?');
                List<String> list = this.f13258;
                C5499.m17100(list);
                c07362.m16863(list, sb);
            }
            if (this.f13259 != null) {
                sb.append('#');
                sb.append(this.f13259);
            }
            String string = sb.toString();
            C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0735 m2144(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedPathSegment");
            m16822(str, 0, str.length(), false, true);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0735 m2145(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedPathSegments");
            return m16797(str, true);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0735 m16794(@InterfaceC6399 String str, @InterfaceC6489 String str2) {
            C5499.m17103(str, "encodedName");
            if (this.f13258 == null) {
                this.f13258 = new ArrayList();
            }
            List<String> list = this.f13258;
            C5499.m17100(list);
            C0736 c0736 = C5385.f13231;
            list.add(C0736.m16849(c0736, str, 0, 0, C5385.f13238, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null));
            List<String> list2 = this.f13258;
            C5499.m17100(list2);
            list2.add(str2 != null ? C0736.m16849(c0736, str2, 0, 0, C5385.f13238, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null) : null);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0735 m16795(@InterfaceC6399 String str) {
            C5499.m17103(str, "pathSegment");
            m16822(str, 0, str.length(), false, false);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0735 m16796(@InterfaceC6399 String str) {
            C5499.m17103(str, "pathSegments");
            return m16797(str, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C0735 m16797(String str, boolean z) {
            int i = 0;
            do {
                int iM26849 = C8158.m26849(str, "/\\", i, str.length());
                m16822(str, i, iM26849, iM26849 < str.length(), z);
                i = iM26849 + 1;
            } while (i <= str.length());
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C0735 m16798(@InterfaceC6399 String str, @InterfaceC6489 String str2) {
            C5499.m17103(str, "name");
            if (this.f13258 == null) {
                this.f13258 = new ArrayList();
            }
            List<String> list = this.f13258;
            C5499.m17100(list);
            C0736 c0736 = C5385.f13231;
            list.add(C0736.m16849(c0736, str, 0, 0, C5385.f13239, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null));
            List<String> list2 = this.f13258;
            C5499.m17100(list2);
            list2.add(str2 != null ? C0736.m16849(c0736, str2, 0, 0, C5385.f13239, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null) : null);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C5385 m16799() {
            ArrayList arrayList;
            String str = this.f1472;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            C0736 c0736 = C5385.f13231;
            String strM16850 = C0736.m16850(c0736, this.f1473, 0, 0, false, 7, null);
            String strM168502 = C0736.m16850(c0736, this.f13254, 0, 0, false, 7, null);
            String str2 = this.f13255;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM16800 = m16800();
            List<String> list = this.f13257;
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C0736.m16850(C5385.f13231, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f13258;
            if (list2 != null) {
                arrayList = new ArrayList(C3881.m10756(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? C0736.m16850(C5385.f13231, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f13259;
            return new C5385(str, strM16850, strM168502, str2, iM16800, arrayList2, arrayList, str4 != null ? C0736.m16850(C5385.f13231, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m16800() {
            int i = this.f13256;
            if (i != -1) {
                return i;
            }
            C0736 c0736 = C5385.f13231;
            String str = this.f1472;
            C5499.m17100(str);
            return c0736.m16854(str);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C0735 m16801(@InterfaceC6489 String str) {
            this.f13259 = str != null ? C0736.m16849(C5385.f13231, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final C0735 m16802(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedPassword");
            this.f13254 = C0736.m16849(C5385.f13231, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C0735 m16803(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedPath");
            if (C7627.m24008(str, "/", false, 2, null)) {
                m16829(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0735 m16804(@InterfaceC6489 String str) {
            List<String> listM16862;
            if (str != null) {
                C0736 c0736 = C5385.f13231;
                String strM16849 = C0736.m16849(c0736, str, 0, 0, C5385.f13237, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null);
                listM16862 = strM16849 != null ? c0736.m16862(strM16849) : null;
            }
            this.f13258 = listM16862;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final C0735 m16805(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedUsername");
            this.f1473 = C0736.m16849(C5385.f13231, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C0735 m16806(@InterfaceC6489 String str) {
            this.f13259 = str != null ? C0736.m16849(C5385.f13231, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final String m16807() {
            return this.f13259;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final String m16808() {
            return this.f13254;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final List<String> m16809() {
            return this.f13257;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final List<String> m16810() {
            return this.f13258;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final String m16811() {
            return this.f1473;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final String m16812() {
            return this.f13255;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final int m16813() {
            return this.f13256;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final String m16814() {
            return this.f1472;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final C0735 m16815(@InterfaceC6399 String str) {
            C5499.m17103(str, C5368.f13117);
            String strM16319 = C5317.m16319(C0736.m16850(C5385.f13231, str, 0, 0, false, 7, null));
            if (strM16319 != null) {
                this.f13255 = strM16319;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final boolean m16816(String str) {
            return C5499.m17094(str, ".") || C7627.m23974(str, "%2e", true);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final boolean m16817(String str) {
            return C5499.m17094(str, "..") || C7627.m23974(str, "%2e.", true) || C7627.m23974(str, ".%2e", true) || C7627.m23974(str, "%2e%2e", true);
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۣۢۥ۟.ۥ۟۟ۡۥ(java.lang.String, int, int, int, java.lang.Object):int */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final C0735 m16818(@InterfaceC6489 C5385 c5385, @InterfaceC6399 String str) {
            int iM26849;
            int i;
            int i2;
            boolean z;
            int i3;
            boolean z2;
            String str2 = str;
            C5499.m17103(str2, "input");
            int iM26862 = C8158.m26862(str2, 0, 0, 3, null);
            int iM26864 = C8158.m26864(str2, iM26862, 0, 2, null);
            C5386 c5386 = f13252;
            int iM16847 = c5386.m16847(str2, iM26862, iM26864);
            boolean z3 = true;
            byte b = -1;
            if (iM16847 != -1) {
                if (C7627.m24005(str2, "https:", iM26862, true)) {
                    this.f1472 = "https";
                    iM26862 += 6;
                } else {
                    if (!C7627.m24005(str2, "http:", iM26862, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str2.substring(0, iM16847);
                        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f1472 = "http";
                    iM26862 += 5;
                }
            } else {
                if (c5385 == null) {
                    if (str.length() > 6) {
                        str2 = C7633.m24353(str2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f1472 = c5385.m16789();
            }
            int iM16848 = c5386.m16848(str2, iM26862, iM26864);
            byte b2 = C8149.f3255;
            byte b3 = 35;
            if (iM16848 >= 2 || c5385 == null || !C5499.m17094(c5385.m16789(), this.f1472)) {
                boolean z4 = false;
                boolean z5 = false;
                int i4 = iM26862 + iM16848;
                while (true) {
                    iM26849 = C8158.m26849(str2, "@/\\?#", i4, iM26864);
                    byte bCharAt = iM26849 != iM26864 ? str2.charAt(iM26849) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z4) {
                            i2 = iM26849;
                            z = z3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f13254);
                            sb2.append("%40");
                            i3 = iM26864;
                            sb2.append(C0736.m16849(C5385.f13231, str, i4, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, C3464.f305, null));
                            this.f13254 = sb2.toString();
                        } else {
                            int iM26848 = C8158.m26848(str2, ':', i4, iM26849);
                            C0736 c0736 = C5385.f13231;
                            z = z3;
                            String strM16849 = C0736.m16849(c0736, str, i4, iM26848, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, C3464.f305, null);
                            if (z5) {
                                strM16849 = this.f1473 + "%40" + strM16849;
                            }
                            this.f1473 = strM16849;
                            if (iM26848 != iM26849) {
                                i2 = iM26849;
                                this.f13254 = C0736.m16849(c0736, str, iM26848 + 1, iM26849, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, C3464.f305, null);
                                z2 = z;
                            } else {
                                i2 = iM26849;
                                z2 = z4;
                            }
                            z4 = z2;
                            i3 = iM26864;
                            z5 = z;
                        }
                        i4 = i2 + 1;
                        z3 = z;
                        iM26864 = i3;
                        b3 = 35;
                        b2 = C8149.f3255;
                        b = -1;
                    }
                }
                i = iM26864;
                C5386 c53862 = f13252;
                int iM16846 = c53862.m16846(str2, i4, iM26849);
                int i5 = iM16846 + 1;
                if (i5 < iM26849) {
                    this.f13255 = C5317.m16319(C0736.m16850(C5385.f13231, str, i4, iM16846, false, 4, null));
                    int iM16845 = c53862.m16845(str2, i5, iM26849);
                    this.f13256 = iM16845;
                    if (iM16845 == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = str2.substring(i5, iM26849);
                        C5499.m17102(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append(C8039.f3212);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    C0736 c07362 = C5385.f13231;
                    this.f13255 = C5317.m16319(C0736.m16850(c07362, str, i4, iM16846, false, 4, null));
                    String str3 = this.f1472;
                    C5499.m17100(str3);
                    this.f13256 = c07362.m16854(str3);
                }
                if (this.f13255 == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = str2.substring(i4, iM16846);
                    C5499.m17102(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append(C8039.f3212);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM26862 = iM26849;
            } else {
                this.f1473 = c5385.m16770();
                this.f13254 = c5385.m16766();
                this.f13255 = c5385.m16772();
                this.f13256 = c5385.m16779();
                this.f13257.clear();
                this.f13257.addAll(c5385.m16768());
                if (iM26862 == iM26864 || str2.charAt(iM26862) == '#') {
                    m16804(c5385.m16769());
                }
                i = iM26864;
            }
            int i6 = i;
            int iM268492 = C8158.m26849(str2, "?#", iM26862, i6);
            m16829(str2, iM26862, iM268492);
            if (iM268492 < i6 && str2.charAt(iM268492) == '?') {
                int iM268482 = C8158.m26848(str2, '#', iM268492, i6);
                C0736 c07363 = C5385.f13231;
                this.f13258 = c07363.m16862(C0736.m16849(c07363, str, iM268492 + 1, iM268482, C5385.f13237, true, false, true, false, null, Opcodes.ADD_INT_LIT16, null));
                iM268492 = iM268482;
            }
            if (iM268492 < i6 && str2.charAt(iM268492) == '#') {
                this.f13259 = C0736.m16849(C5385.f13231, str, iM268492 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final C0735 m16819(@InterfaceC6399 String str) {
            C5499.m17103(str, "password");
            this.f13254 = C0736.m16849(C5385.f13231, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m16820() {
            if (this.f13257.remove(r0.size() - 1).length() != 0 || !(!this.f13257.isEmpty())) {
                this.f13257.add("");
            } else {
                this.f13257.set(r0.size() - 1, "");
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final C0735 m16821(int i) {
            if (1 <= i && i < 65536) {
                this.f13256 = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final void m16822(String str, int i, int i2, boolean z, boolean z2) {
            String strM16849 = C0736.m16849(C5385.f13231, str, i, i2, C5385.f13235, z2, false, false, false, null, C3464.f305, null);
            if (m16816(strM16849)) {
                return;
            }
            if (m16817(strM16849)) {
                m16820();
                return;
            }
            if (this.f13257.get(r2.size() - 1).length() == 0) {
                this.f13257.set(r2.size() - 1, strM16849);
            } else {
                this.f13257.add(strM16849);
            }
            if (z) {
                this.f13257.add("");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0735 m16823(@InterfaceC6489 String str) {
            List<String> listM16862;
            if (str != null) {
                C0736 c0736 = C5385.f13231;
                String strM16849 = C0736.m16849(c0736, str, 0, 0, C5385.f13237, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null);
                listM16862 = strM16849 != null ? c0736.m16862(strM16849) : null;
            }
            this.f13258 = listM16862;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final C0735 m16824() {
            String str = this.f13255;
            this.f13255 = str != null ? new C7075("[\"<>^`{|}]").m22058(str, "") : null;
            int size = this.f13257.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f13257;
                list.set(i, C0736.m16849(C5385.f13231, list.get(i), 0, 0, C5385.f13236, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f13258;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? C0736.m16849(C5385.f13231, str2, 0, 0, C5385.f13240, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f13259;
            this.f13259 = str3 != null ? C0736.m16849(C5385.f13231, str3, 0, 0, C5385.f13243, true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final void m16825(String str) {
            List<String> list = this.f13258;
            C5499.m17100(list);
            int size = list.size() - 2;
            int iM21576 = C6823.m21576(size, 0, -2);
            if (iM21576 > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.f13258;
                C5499.m17100(list2);
                if (C5499.m17094(str, list2.get(size))) {
                    List<String> list3 = this.f13258;
                    C5499.m17100(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.f13258;
                    C5499.m17100(list4);
                    list4.remove(size);
                    List<String> list5 = this.f13258;
                    C5499.m17100(list5);
                    if (list5.isEmpty()) {
                        this.f13258 = null;
                        return;
                    }
                }
                if (size == iM21576) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final C0735 m16826(@InterfaceC6399 String str) {
            C5499.m17103(str, "encodedName");
            if (this.f13258 == null) {
                return this;
            }
            m16825(C0736.m16849(C5385.f13231, str, 0, 0, C5385.f13238, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final C0735 m16827(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            if (this.f13258 == null) {
                return this;
            }
            m16825(C0736.m16849(C5385.f13231, str, 0, 0, C5385.f13239, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null));
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public final C0735 m16828(int i) {
            this.f13257.remove(i);
            if (this.f13257.isEmpty()) {
                this.f13257.add("");
            }
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final void m16829(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f13257.clear();
                this.f13257.add("");
                i++;
            } else {
                List<String> list = this.f13257;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = C8158.m26849(str, "/\\", i3, i2);
                    boolean z = i < i2;
                    m16822(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public final C0735 m16830(@InterfaceC6399 String str) {
            C5499.m17103(str, "scheme");
            if (C7627.m23974(str, "http", true)) {
                this.f1472 = "http";
            } else {
                if (!C7627.m23974(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f1472 = "https";
            }
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final void m16831(@InterfaceC6489 String str) {
            this.f13259 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final void m16832(@InterfaceC6399 String str) {
            C5499.m17103(str, "<set-?>");
            this.f13254 = str;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final C0735 m16833(int i, @InterfaceC6399 String str) {
            C5499.m17103(str, "encodedPathSegment");
            String strM16849 = C0736.m16849(C5385.f13231, str, 0, 0, C5385.f13235, true, false, false, false, null, 243, null);
            this.f13257.set(i, strM16849);
            if (!m16816(strM16849) && !m16817(strM16849)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public final void m16834(@InterfaceC6489 List<String> list) {
            this.f13258 = list;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public final C0735 m16835(@InterfaceC6399 String str, @InterfaceC6489 String str2) {
            C5499.m17103(str, "encodedName");
            m16826(str);
            m16794(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public final void m16836(@InterfaceC6399 String str) {
            C5499.m17103(str, "<set-?>");
            this.f1473 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public final void m16837(@InterfaceC6489 String str) {
            this.f13255 = str;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public final C0735 m16838(int i, @InterfaceC6399 String str) {
            C5499.m17103(str, "pathSegment");
            String strM16849 = C0736.m16849(C5385.f13231, str, 0, 0, C5385.f13235, false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            if (!m16816(strM16849) && !m16817(strM16849)) {
                this.f13257.set(i, strM16849);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public final void m16839(int i) {
            this.f13256 = i;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C0735 m16840(@InterfaceC6399 String str, @InterfaceC6489 String str2) {
            C5499.m17103(str, "name");
            m16827(str);
            m16798(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final void m16841(@InterfaceC6489 String str) {
            this.f1472 = str;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final C0735 m16842(@InterfaceC6399 String str) {
            C5499.m17103(str, "username");
            this.f1473 = C0736.m16849(C5385.f13231, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۥ$ۥ۟ */
    public static final class C0736 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۨۥ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0736(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ String m16849(C0736 c0736, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return c0736.m16853(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static /* synthetic */ String m16850(C0736 c0736, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return c0736.m16860(str, i, i2, z);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @InterfaceC5572(name = "-deprecated_get")
        /* JADX INFO: renamed from: ۥ */
        public final C5385 m2148(@InterfaceC6399 String str) {
            C5499.m17103(str, "url");
            return m16855(str);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC5572(name = "-deprecated_get")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5385 m2149(@InterfaceC6399 URI uri) {
            C5499.m17103(uri, "uri");
            return m16856(uri);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC5572(name = "-deprecated_get")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5385 m16851(@InterfaceC6399 URL url) {
            C5499.m17103(url, "url");
            return m16857(url);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC5572(name = "-deprecated_parse")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C5385 m16852(@InterfaceC6399 String str) {
            C5499.m17103(str, "url");
            return m16859(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m16853(@InterfaceC6399 String str, int i, int i2, @InterfaceC6399 String str2, boolean z, boolean z2, boolean z3, boolean z4, @InterfaceC6489 Charset charset) throws EOFException {
            C5499.m17103(str, "<this>");
            C5499.m17103(str2, "encodeSet");
            int iCharCount = i;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z4) && !C7628.m24034(str2, (char) iCodePointAt, false, 2, null))) {
                    if (iCodePointAt != 37) {
                        if (iCodePointAt == 43 || !z3) {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    } else if (z) {
                        if (z2) {
                            if (m16858(str, iCharCount, i2)) {
                            }
                        }
                        if (iCodePointAt == 43) {
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    C3600 c3600 = new C3600();
                    c3600.mo9645(str, i, iCharCount);
                    m16864(c3600, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                    return c3600.mo9662();
                }
                C3600 c36002 = new C3600();
                c36002.mo9645(str, i, iCharCount);
                m16864(c36002, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return c36002.mo9662();
            }
            String strSubstring = str.substring(i, i2);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m16854(@InterfaceC6399 String str) {
            C5499.m17103(str, "scheme");
            if (C5499.m17094(str, "http")) {
                return 80;
            }
            if (C5499.m17094(str, "https")) {
                return C8414.f25132;
            }
            return -1;
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "get")
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C5385 m16855(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            return new C0735().m16818(null, str).m16799();
        }

        @InterfaceC5578
        @InterfaceC5572(name = "get")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C5385 m16856(@InterfaceC6399 URI uri) {
            C5499.m17103(uri, "<this>");
            String string = uri.toString();
            C5499.m17102(string, "toString()");
            return m16859(string);
        }

        @InterfaceC5578
        @InterfaceC5572(name = "get")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C5385 m16857(@InterfaceC6399 URL url) {
            C5499.m17103(url, "<this>");
            String string = url.toString();
            C5499.m17102(string, "toString()");
            return m16859(string);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m16858(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C8158.m26873(str.charAt(i + 1)) != -1 && C8158.m26873(str.charAt(i3)) != -1;
        }

        @InterfaceC5578
        @InterfaceC5572(name = "parse")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C5385 m16859(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            try {
                return m16855(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final String m16860(@InterfaceC6399 String str, int i, int i2, boolean z) {
            C5499.m17103(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    C3600 c3600 = new C3600();
                    c3600.mo9645(str, i, i3);
                    m16865(c3600, str, i3, i2, z);
                    return c3600.mo9662();
                }
            }
            String strSubstring = str.substring(i, i2);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16861(@InterfaceC6399 List<String> list, @InterfaceC6399 StringBuilder sb) {
            C5499.m17103(list, "<this>");
            C5499.m17103(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final List<String> m16862(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iM24056 = C7628.m24056(str, C8039.f23874, i, false, 4, null);
                if (iM24056 == -1) {
                    iM24056 = str.length();
                }
                int i2 = iM24056;
                int iM240562 = C7628.m24056(str, SignatureVisitor.INSTANCEOF, i, false, 4, null);
                if (iM240562 == -1 || iM240562 > i2) {
                    String strSubstring = str.substring(i, i2);
                    C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iM240562);
                    C5499.m17102(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM240562 + 1, i2);
                    C5499.m17102(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m16863(@InterfaceC6399 List<String> list, @InterfaceC6399 StringBuilder sb) {
            C5499.m17103(list, "<this>");
            C5499.m17103(sb, "out");
            C5456 c5456M21772 = C7007.m21772(C7007.m21793(0, list.size()), 2);
            int iM16964 = c5456M21772.m16964();
            int iM16965 = c5456M21772.m16965();
            int iM16966 = c5456M21772.m16966();
            if ((iM16966 <= 0 || iM16964 > iM16965) && (iM16966 >= 0 || iM16965 > iM16964)) {
                return;
            }
            while (true) {
                String str = list.get(iM16964);
                String str2 = list.get(iM16964 + 1);
                if (iM16964 > 0) {
                    sb.append(C8039.f23874);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append(SignatureVisitor.INSTANCEOF);
                    sb.append(str2);
                }
                if (iM16964 == iM16965) {
                    return;
                } else {
                    iM16964 += iM16966;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0093 A[LOOP:1: B:50:0x008d->B:52:0x0093, LOOP_END] */
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m16864(C3600 c3600, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            int iCharCount = i;
            C3600 c36002 = null;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        c3600.mo9638(z ? InterfaceC5949.f14893 : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || C7628.m24034(str2, (char) iCodePointAt, false, 2, null))) {
                        if (c36002 == null) {
                            c36002 = new C3600();
                        }
                        if (charset != null || C5499.m17094(charset, StandardCharsets.UTF_8)) {
                            c36002.mo9615(iCodePointAt);
                        } else {
                            c36002.mo9669(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c36002.mo9622()) {
                            byte b = c36002.readByte();
                            c3600.writeByte(37);
                            c3600.writeByte(C5385.f13232[((b & 255) >> 4) & 15]);
                            c3600.writeByte(C5385.f13232[b & 15]);
                        }
                    } else if (iCodePointAt != 37) {
                        c3600.mo9615(iCodePointAt);
                    } else {
                        if (z) {
                            if (z2) {
                                if (!m16858(str, iCharCount, i2)) {
                                }
                            }
                            c3600.mo9615(iCodePointAt);
                        }
                        if (c36002 == null) {
                        }
                        if (charset != null) {
                            c36002.mo9615(iCodePointAt);
                            while (!c36002.mo9622()) {
                            }
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m16865(C3600 c3600, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int iM26873 = C8158.m26873(str.charAt(i + 1));
                    int iM268732 = C8158.m26873(str.charAt(i3));
                    if (iM26873 == -1 || iM268732 == -1) {
                        c3600.mo9615(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        c3600.writeByte((iM26873 << 4) + iM268732);
                        i = Character.charCount(iCodePointAt) + i3;
                    }
                } else if (iCodePointAt == 43 && z) {
                    c3600.writeByte(32);
                    i++;
                } else {
                    c3600.mo9615(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0736() {
        }
    }

    public C5385(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, @InterfaceC6399 String str4, int i, @InterfaceC6399 List<String> list, @InterfaceC6489 List<String> list2, @InterfaceC6489 String str5, @InterfaceC6399 String str6) {
        C5499.m17103(str, "scheme");
        C5499.m17103(str2, "username");
        C5499.m17103(str3, "password");
        C5499.m17103(str4, C5368.f13117);
        C5499.m17103(list, "pathSegments");
        C5499.m17103(str6, "url");
        this.f1470 = str;
        this.f1471 = str2;
        this.f13244 = str3;
        this.f13245 = str4;
        this.f13246 = i;
        this.f13247 = list;
        this.f13248 = list2;
        this.f13249 = str5;
        this.f13250 = str6;
        this.f13251 = C5499.m17094(str, "https");
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int m16743(@InterfaceC6399 String str) {
        return f13231.m16854(str);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "get")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final C5385 m16744(@InterfaceC6399 String str) {
        return f13231.m16855(str);
    }

    @InterfaceC5578
    @InterfaceC5572(name = "get")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final C5385 m16745(@InterfaceC6399 URI uri) {
        return f13231.m16856(uri);
    }

    @InterfaceC5578
    @InterfaceC5572(name = "get")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final C5385 m16746(@InterfaceC6399 URL url) {
        return f13231.m16857(url);
    }

    @InterfaceC5578
    @InterfaceC5572(name = "parse")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final C5385 m16747(@InterfaceC6399 String str) {
        return f13231.m16859(str);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C5385) && C5499.m17094(((C5385) obj).f13250, this.f13250);
    }

    public int hashCode() {
        return this.f13250.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return this.f13250;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedFragment", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedFragment")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final String m2142() {
        return m16765();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedPassword", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedPassword")
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2143() {
        return m16766();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedPath", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedPath")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m16748() {
        return m16767();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedPathSegments", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedPathSegments")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<String> m16749() {
        return m16768();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedQuery", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedQuery")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final String m16750() {
        return m16769();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "encodedUsername", imports = {}))
    @InterfaceC5572(name = "-deprecated_encodedUsername")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m16751() {
        return m16770();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "fragment", imports = {}))
    @InterfaceC5572(name = "-deprecated_fragment")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final String m16752() {
        return this.f13249;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = C5368.f13117, imports = {}))
    @InterfaceC5572(name = "-deprecated_host")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m16753() {
        return this.f13245;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "password", imports = {}))
    @InterfaceC5572(name = "-deprecated_password")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m16754() {
        return this.f13244;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "pathSegments", imports = {}))
    @InterfaceC5572(name = "-deprecated_pathSegments")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final List<String> m16755() {
        return this.f13247;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "pathSize", imports = {}))
    @InterfaceC5572(name = "-deprecated_pathSize")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m16756() {
        return m16778();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "port", imports = {}))
    @InterfaceC5572(name = "-deprecated_port")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m16757() {
        return this.f13246;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "query", imports = {}))
    @InterfaceC5572(name = "-deprecated_query")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m16758() {
        return m16780();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "queryParameterNames", imports = {}))
    @InterfaceC5572(name = "-deprecated_queryParameterNames")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Set<String> m16759() {
        return m16783();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "querySize", imports = {}))
    @InterfaceC5572(name = "-deprecated_querySize")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m16760() {
        return m16786();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "scheme", imports = {}))
    @InterfaceC5572(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final String m16761() {
        return this.f1470;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to toUri()", replaceWith = @InterfaceC7097(expression = "toUri()", imports = {}))
    @InterfaceC5572(name = "-deprecated_uri")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final URI m16762() {
        return m16791();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to toUrl()", replaceWith = @InterfaceC7097(expression = "toUrl()", imports = {}))
    @InterfaceC5572(name = "-deprecated_url")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final URL m16763() {
        return m16792();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "username", imports = {}))
    @InterfaceC5572(name = "-deprecated_username")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final String m16764() {
        return this.f1471;
    }

    @InterfaceC5572(name = "encodedFragment")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String m16765() {
        if (this.f13249 == null) {
            return null;
        }
        String strSubstring = this.f13250.substring(C7628.m24056(this.f13250, '#', 0, false, 6, null) + 1);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "encodedPassword")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final String m16766() {
        if (this.f13244.length() == 0) {
            return "";
        }
        String strSubstring = this.f13250.substring(C7628.m24056(this.f13250, ':', this.f1470.length() + 3, false, 4, null) + 1, C7628.m24056(this.f13250, '@', 0, false, 6, null));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "encodedPath")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final String m16767() {
        int iM24056 = C7628.m24056(this.f13250, '/', this.f1470.length() + 3, false, 4, null);
        String str = this.f13250;
        String strSubstring = this.f13250.substring(iM24056, C8158.m26849(str, "?#", iM24056, str.length()));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "encodedPathSegments")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final List<String> m16768() {
        int iM24056 = C7628.m24056(this.f13250, '/', this.f1470.length() + 3, false, 4, null);
        String str = this.f13250;
        int iM26849 = C8158.m26849(str, "?#", iM24056, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM24056 < iM26849) {
            int i = iM24056 + 1;
            int iM26848 = C8158.m26848(this.f13250, '/', i, iM26849);
            String strSubstring = this.f13250.substring(i, iM26848);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM24056 = iM26848;
        }
        return arrayList;
    }

    @InterfaceC5572(name = "encodedQuery")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final String m16769() {
        if (this.f13248 == null) {
            return null;
        }
        int iM24056 = C7628.m24056(this.f13250, '?', 0, false, 6, null) + 1;
        String str = this.f13250;
        String strSubstring = this.f13250.substring(iM24056, C8158.m26848(str, '#', iM24056, str.length()));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "encodedUsername")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final String m16770() {
        if (this.f1471.length() == 0) {
            return "";
        }
        int length = this.f1470.length() + 3;
        String str = this.f13250;
        String strSubstring = this.f13250.substring(length, C8158.m26849(str, ":@", length, str.length()));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC5572(name = "fragment")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final String m16771() {
        return this.f13249;
    }

    @InterfaceC6399
    @InterfaceC5572(name = C5368.f13117)
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final String m16772() {
        return this.f13245;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean m16773() {
        return this.f13251;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final C0735 m16774() {
        C0735 c0735 = new C0735();
        c0735.m16841(this.f1470);
        c0735.m16836(m16770());
        c0735.m16832(m16766());
        c0735.m16837(this.f13245);
        c0735.m16839(this.f13246 != f13231.m16854(this.f1470) ? this.f13246 : -1);
        c0735.m16809().clear();
        c0735.m16809().addAll(m16768());
        c0735.m16804(m16769());
        c0735.m16831(m16765());
        return c0735;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final C0735 m16775(@InterfaceC6399 String str) {
        C5499.m17103(str, "link");
        try {
            return new C0735().m16818(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "password")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final String m16776() {
        return this.f13244;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "pathSegments")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final List<String> m16777() {
        return this.f13247;
    }

    @InterfaceC5572(name = "pathSize")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final int m16778() {
        return this.f13247.size();
    }

    @InterfaceC5572(name = "port")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final int m16779() {
        return this.f13246;
    }

    @InterfaceC5572(name = "query")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final String m16780() {
        if (this.f13248 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f13231.m16863(this.f13248, sb);
        return sb.toString();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final String m16781(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        List<String> list = this.f13248;
        if (list == null) {
            return null;
        }
        C5456 c5456M21772 = C7007.m21772(C7007.m21793(0, list.size()), 2);
        int iM16964 = c5456M21772.m16964();
        int iM16965 = c5456M21772.m16965();
        int iM16966 = c5456M21772.m16966();
        if ((iM16966 > 0 && iM16964 <= iM16965) || (iM16966 < 0 && iM16965 <= iM16964)) {
            while (!C5499.m17094(str, this.f13248.get(iM16964))) {
                if (iM16964 != iM16965) {
                    iM16964 += iM16966;
                }
            }
            return this.f13248.get(iM16964 + 1);
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final String m16782(int i) {
        List<String> list = this.f13248;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        C5499.m17100(str);
        return str;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "queryParameterNames")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final Set<String> m16783() {
        if (this.f13248 == null) {
            return C7387.m23125();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5456 c5456M21772 = C7007.m21772(C7007.m21793(0, this.f13248.size()), 2);
        int iM16964 = c5456M21772.m16964();
        int iM16965 = c5456M21772.m16965();
        int iM16966 = c5456M21772.m16966();
        if ((iM16966 > 0 && iM16964 <= iM16965) || (iM16966 < 0 && iM16965 <= iM16964)) {
            while (true) {
                String str = this.f13248.get(iM16964);
                C5499.m17100(str);
                linkedHashSet.add(str);
                if (iM16964 == iM16965) {
                    break;
                }
                iM16964 += iM16966;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C5499.m17102(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final String m16784(int i) {
        List<String> list = this.f13248;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final List<String> m16785(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        if (this.f13248 == null) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList();
        C5456 c5456M21772 = C7007.m21772(C7007.m21793(0, this.f13248.size()), 2);
        int iM16964 = c5456M21772.m16964();
        int iM16965 = c5456M21772.m16965();
        int iM16966 = c5456M21772.m16966();
        if ((iM16966 > 0 && iM16964 <= iM16965) || (iM16966 < 0 && iM16965 <= iM16964)) {
            while (true) {
                if (C5499.m17094(str, this.f13248.get(iM16964))) {
                    arrayList.add(this.f13248.get(iM16964 + 1));
                }
                if (iM16964 == iM16965) {
                    break;
                }
                iM16964 += iM16966;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C5499.m17102(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @InterfaceC5572(name = "querySize")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final int m16786() {
        List<String> list = this.f13248;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final String m16787() {
        C0735 c0735M16775 = m16775("/...");
        C5499.m17100(c0735M16775);
        return c0735M16775.m16842("").m16819("").m16799().toString();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C5385 m16788(@InterfaceC6399 String str) {
        C5499.m17103(str, "link");
        C0735 c0735M16775 = m16775(str);
        if (c0735M16775 != null) {
            return c0735M16775.m16799();
        }
        return null;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "scheme")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String m16789() {
        return this.f1470;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final String m16790() {
        if (C8158.m26840(this.f13245)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.m31139().m31134(this.f13245);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "uri")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final URI m16791() {
        String string = m16774().m16824().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new C7075("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m22058(string, ""));
                C5499.m17102(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "url")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final URL m16792() {
        try {
            return new URL(this.f13250);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "username")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final String m16793() {
        return this.f1471;
    }
}
