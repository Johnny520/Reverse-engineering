package p351xe;

import java.util.function.IntConsumer;
import java.util.regex.Pattern;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p068eh.AbstractC0921a;
import p157kd.AbstractC2390d;
import p157kd.C2389c;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: xe.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5796q {

    /* JADX INFO: renamed from: b */
    public static final C5796q f23542b = new C5796q(new C0257g());

    /* JADX INFO: renamed from: a */
    public final int f23543a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5796q(C0257g c0257g) {
        c0257g.getClass();
        this.f23543a = c0257g.f736V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10497a(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == ' ' || cCharAt == '$') {
                sb2.append('_');
            } else if (cCharAt != '*') {
                if (cCharAt != ',') {
                    if (cCharAt == '[') {
                        sb2.append('A');
                    } else if (cCharAt != ']') {
                        if (cCharAt != '.' && cCharAt != '/' && cCharAt != ';' && cCharAt != '<') {
                            if (cCharAt != '>' && cCharAt != '?') {
                                sb2.append(cCharAt);
                            }
                        }
                    }
                }
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m10498b(double d10) {
        return Double.isNaN(d10) ? "Double.NaN" : d10 == Double.NEGATIVE_INFINITY ? "Double.NEGATIVE_INFINITY" : d10 == Double.POSITIVE_INFINITY ? "Double.POSITIVE_INFINITY" : d10 == Double.MIN_VALUE ? "Double.MIN_VALUE" : d10 == Double.MAX_VALUE ? "Double.MAX_VALUE" : d10 == Double.MIN_NORMAL ? "Double.MIN_NORMAL" : AbstractC0255e.m1020i(Double.toString(d10), "d");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m10499c(float f3) {
        return Float.isNaN(f3) ? "Float.NaN" : f3 == Float.NEGATIVE_INFINITY ? "Float.NEGATIVE_INFINITY" : f3 == Float.POSITIVE_INFINITY ? "Float.POSITIVE_INFINITY" : f3 == Float.MIN_VALUE ? "Float.MIN_VALUE" : f3 == Float.MAX_VALUE ? "Float.MAX_VALUE" : f3 == Float.MIN_NORMAL ? "Float.MIN_NORMAL" : AbstractC0255e.m1020i(Float.toString(f3), "f");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m10500f(int i9) {
        if (i9 == 12) {
            return "\\f";
        }
        if (i9 == 13) {
            return "\\r";
        }
        if (i9 == 34) {
            return "\\\"";
        }
        if (i9 == 39) {
            return "'";
        }
        if (i9 == 92) {
            return "\\\\";
        }
        switch (i9) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m10501g(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m10502h(char c10, boolean z9) {
        if (c10 == '\'') {
            return "'\\''";
        }
        String strM10500f = m10500f(c10);
        if (strM10500f != null) {
            return AbstractC0921a.m2251n("'", strM10500f, "'");
        }
        Pattern pattern = AbstractC2390d.f7853a;
        if (' ' > c10 || c10 > '~') {
            String string = Integer.toString(c10);
            return z9 ? AbstractC4855en.m9263g("(char) ", string) : string;
        }
        return "'" + c10 + "'";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m10503j(String str, IntConsumer intConsumer) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            intConsumer.accept(iCodePointAt);
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m10504d(long j3, boolean z9) {
        if (this.f23543a == 1) {
            if (j3 == Long.MAX_VALUE) {
                return "Long.MAX_VALUE";
            }
            if (j3 == Long.MIN_VALUE) {
                return "Long.MIN_VALUE";
            }
        }
        return m10505e(8, j3, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m10505e(int i9, long j3, boolean z9) {
        String string;
        String str;
        int i10 = this.f23543a;
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 3) {
            String hexString = Long.toHexString(j3);
            if (j3 < 0) {
                int length = hexString.length();
                string = "0x".concat(hexString.substring(length - (i9 * 2), length));
                z9 = true;
            } else {
                string = AbstractC4855en.m9263g("0x", hexString);
            }
        } else {
            string = Long.toString(j3);
        }
        if (i9 == 8 && (j3 == Long.MIN_VALUE || Math.abs(j3) >= 2147483647L)) {
            z9 = true;
        }
        if (!z9) {
            return string;
        }
        if (i9 == 8) {
            return AbstractC0255e.m1020i(string, "L");
        }
        if (i9 == 1) {
            str = "(byte) ";
        } else if (i9 == 2) {
            str = "(short) ";
        } else if (i9 == 4) {
            str = "(int) ";
        } else {
            if (i9 != 8) {
                C0086a.m452k(AbstractC0921a.m2249l(i9, "Unexpected number type length: "));
                return null;
            }
            str = "(long) ";
        }
        return AbstractC0255e.m1020i(str, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m10506i(String str) {
        if (str.length() == 0) {
            return "\"\"";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        m10503j(str, new C2389c(this, sb2));
        sb2.append('\"');
        return sb2.toString();
    }
}
