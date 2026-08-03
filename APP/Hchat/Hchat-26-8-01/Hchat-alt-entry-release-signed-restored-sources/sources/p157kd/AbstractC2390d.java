package p157kd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import p351xe.C5796q;

/* JADX INFO: renamed from: kd.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2390d {

    /* JADX INFO: renamed from: a */
    public static final Pattern f7853a;

    /* JADX INFO: renamed from: b */
    public static final Pattern f7854b;

    /* JADX INFO: renamed from: c */
    public static final HashSet f7855c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Pattern patternCompile = Pattern.compile("\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*");
        f7853a = patternCompile;
        f7854b = Pattern.compile("(" + String.valueOf(patternCompile) + "\\.)*" + String.valueOf(patternCompile));
        f7855c = new HashSet(Arrays.asList("_", "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m5712a(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!m5713b(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m5713b(int i9) {
        return 32 <= i9 && i9 <= 126;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m5714c(String str) {
        return m5715d(str) && m5712a(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m5715d(String str) {
        C5796q c5796q = C5796q.f23542b;
        return (str == null || str.isEmpty() || f7855c.contains(str) || !f7853a.matcher(str).matches()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m5716e(String str) {
        if (m5715d(str) && m5712a(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        C5796q.m10503j(str, new C2389c(sb2, 1));
        return sb2.toString();
    }
}
