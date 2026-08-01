package p003;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import kotlin.text.AbstractC5144;
import org.slf4j.Marker;
import p004.C6092;
import p013.AbstractC6225;

/* JADX INFO: renamed from: 飘花落叶言世兰哲楪苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f16642 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11445(int i, int i2, String str, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C6092 c6092 = new C6092();
                c6092.m11492(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM11685 = AbstractC6225.m11685(str.charAt(iCharCount + 1));
                        int iM116852 = AbstractC6225.m11685(str.charAt(i4));
                        if (iM11685 == -1 || iM116852 == -1) {
                            c6092.m11488(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c6092.m11470((iM11685 << 4) + iM116852);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c6092.m11470(32);
                        iCharCount++;
                    } else {
                        c6092.m11488(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c6092.m11480();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m11446(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC6225.m11685(str.charAt(i + 1)) != -1 && AbstractC6225.m11685(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m11447(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) throws EOFException {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || AbstractC5144.m10163(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m11446(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                C6092 c6092 = new C6092();
                c6092.m11492(i4, iCharCount, str);
                C6092 c60922 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        String str3 = Marker.ANY_NON_NULL_MARKER;
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c6092.m11491(Marker.ANY_NON_NULL_MARKER);
                        } else if (iCodePointAt2 == 43 && z3) {
                            if (!z5) {
                                str3 = "%2B";
                            }
                            c6092.m11491(str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || AbstractC5144.m10163(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !m11446(iCharCount, length, str)))))) {
                            if (c60922 == null) {
                                c60922 = new C6092();
                            }
                            c60922.m11488(iCodePointAt2);
                            while (!c60922.m11478()) {
                                byte b = c60922.readByte();
                                int i6 = b & DefaultClassResolver.NAME;
                                c6092.m11470(37);
                                char[] cArr = f16642;
                                c6092.m11470(cArr[(i6 >> 4) & 15]);
                                c6092.m11470(cArr[b & 15]);
                            }
                        } else {
                            c6092.m11488(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return c6092.m11480();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11448(int i, int i2, String str, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return m11447(str, i4, i5, str2, z, z2, z3, z4, 128);
    }
}
