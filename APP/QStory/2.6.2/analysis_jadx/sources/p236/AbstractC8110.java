package p236;

import androidx.activity.compose.C0003;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5138;
import kotlinx.io.C5476;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p048.C6515;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f22406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f22407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f22408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f22410;

    static {
        Character chValueOf = Character.valueOf(SignatureVisitor.INSTANCEOF);
        Character chValueOf2 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        Character chValueOf3 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH);
        Character chValueOf4 = Character.valueOf(SignatureVisitor.EXTENDS);
        Character chValueOf5 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        Character chValueOf6 = Character.valueOf(SignatureVisitor.SUPER);
        ArrayList arrayListM8825 = AbstractC4343.m8825(new C6515('0', '9'), AbstractC4343.m8808(new C6515('a', 'z'), new C6515('A', 'Z')));
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayListM8825, 10));
        Iterator it = arrayListM8825.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f22410 = AbstractC4343.m8800(arrayList);
        f22409 = AbstractC4343.m8800(AbstractC4343.m8825(new C6515('0', '9'), AbstractC4343.m8808(new C6515('a', 'z'), new C6515('A', 'Z'))));
        AbstractC4343.m8800(AbstractC4343.m8825(new C6515('0', '9'), AbstractC4343.m8808(new C6515('a', 'f'), new C6515('A', 'F'))));
        Set setM8852 = AbstractC4346.m8852(new Character[]{':', '/', '?', '#', Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH), ']', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~', chValueOf4});
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(setM8852, 10));
        Iterator it2 = setM8852.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f22408 = arrayList2;
        f22407 = AbstractC4346.m8852(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, chValueOf4, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~'});
        AbstractC0455.m1156(f22409, AbstractC4346.m8852(new Character[]{'!', '#', '$', '&', chValueOf4, chValueOf6, chValueOf5, '^', '_', '`', '|', '~'}));
        List listM13659 = AbstractC8189.m13659(chValueOf6, chValueOf5, '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(listM13659, 10));
        Iterator it3 = listM13659.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f22406 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13546(C5476 c5476, InterfaceC6557 interfaceC6557) {
        while (!c5476.mo10601()) {
            while (!c5476.mo10601()) {
                interfaceC6557.invoke(Byte.valueOf(c5476.readByte()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m13547(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = AbstractC5131.f14688.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str.length();
        C5476 c5476 = new C5476();
        AbstractC8189.m13689(charsetEncoderNewEncoder, c5476, str, 0, length);
        m13546(c5476, new C0003(sb, 1, z));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13548(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = AbstractC5131.f14688;
        str.getClass();
        charset.getClass();
        return m13550(str, i, i2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13549(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        Charset charset = AbstractC5131.f14688;
        str.getClass();
        charset.getClass();
        return m13550(str, i, i2, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m13550(String str, int i, int i2, boolean z) throws URLDecodeException {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((Object) str) + " at " + i3);
                            }
                            int i7 = i3 + 1;
                            int iM13551 = m13551(str.charAt(i7));
                            int iM135512 = m13551(str.charAt(i6));
                            if (iM13551 == -1 || iM135512 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iM13551 * 16) + iM135512);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(AbstractC5138.m10134(0, bArr, i5));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m13551(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String m13552(byte b) {
        int i = (b & DefaultClassResolver.NAME) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
