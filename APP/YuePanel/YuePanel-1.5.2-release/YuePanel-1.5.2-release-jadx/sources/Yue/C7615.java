package Yue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7615 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f2969 = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Pattern f2970 = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Pattern f23015 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Pattern f23016 = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final ThreadLocal<Stack<StringBuilder>> f23017 = ThreadLocal.withInitial(new Supplier() { // from class: Yue.ۥۣۢ۠ۡ
        @Override // java.util.function.Supplier
        public final Object get() {
            return new Stack();
        }
    });

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f23018 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23019 = 8;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۡۤ$ۥ */
    public static class C1307 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f2972;

        /* JADX INFO: renamed from: ۥ */
        public StringBuilder f2971 = C7615.m3765();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f23020 = true;

        public C1307(String str) {
            this.f2972 = str;
        }

        /* JADX INFO: renamed from: ۥ */
        public C1307 m3766(Object obj) {
            C8159.m26910(this.f2971);
            if (!this.f23020) {
                this.f2971.append(this.f2972);
            }
            this.f2971.append(obj);
            this.f23020 = false;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C1307 m3767(Object obj) {
            C8159.m26910(this.f2971);
            this.f2971.append(obj);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public String m23830() {
            String strM23825 = C7615.m23825(this.f2971);
            this.f2971 = null;
            return strM23825;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3764(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (m23813(iCodePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!m23816(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
                z3 = false;
                z2 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static StringBuilder m3765() {
        Stack<StringBuilder> stack = f23017.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m23811(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m23812(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m23813(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m23814(String str) {
        C8159.m26910(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m23815(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m23818(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m23816(int i) {
        return i == 8203 || i == 173;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m23817(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m23818(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static String m23819(Collection<?> collection, String str) {
        return m23820(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m23820(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        C1307 c1307 = new C1307(str);
        c1307.m3766(string);
        while (it.hasNext()) {
            c1307.m3766(it.next());
        }
        return c1307.m23830();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m23821(String[] strArr, String str) {
        return m23819(Arrays.asList(strArr), str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static String m23822(String str) {
        StringBuilder sbM3765 = m3765();
        m3764(sbM3765, str, false);
        return m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m23823(int i) {
        return m23824(i, 30);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m23824(int i, int i2) {
        C8159.m26904(i >= 0, "width must be >= 0");
        C8159.m26903(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = f2969;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static String m23825(StringBuilder sb) {
        C8159.m26910(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f23017.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static String m23826(String str, String str2) {
        String strM23829 = m23829(str);
        String strM238292 = m23829(str2);
        try {
            try {
                return m23827(new URL(strM23829), strM238292).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strM238292).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f23015.matcher(strM238292).find() ? strM238292 : "";
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static URL m23827(URL url, String str) throws MalformedURLException {
        String strM23829 = m23829(str);
        if (strM23829.startsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
            strM23829 = url.getPath() + strM23829;
        }
        URL url2 = new URL(url, strM23829);
        String strReplaceFirst = f2970.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m23828(String str) {
        return (str == null || str.length() == 0 || str.charAt(0) != '\n') ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static String m23829(String str) {
        return f23016.matcher(str).replaceAll("");
    }
}
