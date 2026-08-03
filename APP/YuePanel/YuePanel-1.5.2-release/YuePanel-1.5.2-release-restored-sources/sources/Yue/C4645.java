package Yue;

import Yue.C4483;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4645 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1030 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1031 = "";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9961 = 36;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final char[] f9962 = {',', TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final HashMap<String, String> f9963 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C4483.C0414 f9964;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۟۟$ۥ */
    public static /* synthetic */ class C0461 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1032;

        static {
            int[] iArr = new int[EnumC0462.values().length];
            f1032 = iArr;
            try {
                iArr[EnumC0462.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1032[EnumC0462.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۟۟$ۥ۟ */
    public enum EnumC0462 {
        ascii,
        utf,
        fallback;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static EnumC0462 m13976(String str) {
            return str.equals(C3510.f5906) ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۟۟$ۥ۟۟, reason: contains not printable characters */
    public enum EnumC4646 {
        xhtml(C4647.f1033, 4),
        base(C4647.f1034, 106),
        extended(C4647.f9977, 2125);


        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public String[] f9973;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int[] f9974;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int[] f9975;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public String[] f9976;

        EnumC4646(String str, int i) {
            C4645.m13973(this, str, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m13985(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f9973, str);
            if (iBinarySearch >= 0) {
                return this.f9974[iBinarySearch];
            }
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public String m13986(int i) {
            int iBinarySearch = Arrays.binarySearch(this.f9975, i);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.f9976;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (this.f9975[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[iBinarySearch];
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final int m13987() {
            return this.f9973.length;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1602(Appendable appendable, EnumC4646 enumC4646, int i) throws IOException {
        String strM13986 = enumC4646.m13986(i);
        if ("".equals(strM13986)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        } else {
            appendable.append(C8039.f23874).append(strM13986).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m13965(EnumC0462 enumC0462, char c, CharsetEncoder charsetEncoder) {
        int i = C0461.f1032[enumC0462.ordinal()];
        if (i == 1) {
            return c < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m13966(String str, int[] iArr) {
        String str2 = f9963.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM13985 = EnumC4646.extended.m13985(str);
        if (iM13985 == -1) {
            return 0;
        }
        iArr[0] = iM13985;
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m13967(String str) {
        if (f9964 == null) {
            f9964 = new C4483.C0414();
        }
        return m13968(str, f9964);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m13968(String str, C4483.C0414 c0414) {
        if (str == null) {
            return "";
        }
        StringBuilder sbM3765 = C7615.m3765();
        try {
            m13969(sbM3765, str, c0414, false, false, false, false);
            return C7615.m23825(sbM3765);
        } catch (IOException e) {
            throw new C7370(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m13969(Appendable appendable, String str, C4483.C0414 c0414, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        EnumC4646 enumC4646M13018 = c0414.m13018();
        CharsetEncoder charsetEncoderM13016 = c0414.m13016();
        EnumC0462 enumC0462 = c0414.f9421;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (z2) {
                if (!C7615.m23818(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    z6 = true;
                    if (iCodePointAt >= 65536) {
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt >= 65536) {
                char c = (char) iCodePointAt;
                if (c == '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ' || !m13965(enumC0462, c, charsetEncoderM13016)) {
                                    m1602(appendable, enumC4646M13018, iCodePointAt);
                                } else {
                                    appendable.append(c);
                                }
                            } else if (enumC4646M13018 != EnumC4646.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (z) {
                            appendable.append(c);
                        } else {
                            appendable.append("&gt;");
                        }
                    } else if (!z || enumC4646M13018 == EnumC4646.xhtml || c0414.m13028() == C4483.C0414.EnumC4484.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                String str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM13016.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m1602(appendable, enumC4646M13018, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m13970(String str) {
        String str2 = f9963.get(str);
        if (str2 != null) {
            return str2;
        }
        int iM13985 = EnumC4646.extended.m13985(str);
        return iM13985 != -1 ? new String(new int[]{iM13985}, 0, 1) : "";
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m13971(String str) {
        return EnumC4646.base.m13985(str) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m13972(String str) {
        return EnumC4646.extended.m13985(str) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m13973(EnumC4646 enumC4646, String str, int i) {
        int i2;
        enumC4646.f9973 = new String[i];
        enumC4646.f9974 = new int[i];
        enumC4646.f9975 = new int[i];
        enumC4646.f9976 = new String[i];
        C3787 c3787 = new C3787(str);
        int i3 = 0;
        while (!c3787.m10413()) {
            try {
                String strM10406 = c3787.m10406(SignatureVisitor.INSTANCEOF);
                c3787.m834();
                int i4 = Integer.parseInt(c3787.m10408(f9962), 36);
                char cM10412 = c3787.m10412();
                c3787.m834();
                if (cM10412 == ',') {
                    i2 = Integer.parseInt(c3787.m10406(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER), 36);
                    c3787.m834();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c3787.m10406(C8039.f23874), 36);
                c3787.m834();
                enumC4646.f9973[i3] = strM10406;
                enumC4646.f9974[i3] = i4;
                enumC4646.f9975[i5] = i4;
                enumC4646.f9976[i5] = strM10406;
                if (i2 != -1) {
                    f9963.put(strM10406, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c3787.m10394();
                throw th;
            }
        }
        C8159.m26904(i3 == i, "Unexpected count of entities loaded");
        c3787.m10394();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m13974(String str) {
        return m13975(str, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m13975(String str, boolean z) {
        return C6617.m21001(str, z);
    }
}
