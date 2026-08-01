package p236;

import androidx.activity.compose.C0003;
import com.bumptech.glide.AbstractC3066;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5139;
import kotlinx.io.C5477;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p048.C6516;
import p052.InterfaceC6558;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f22404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f22405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f22406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f22408;

    static {
        Character chValueOf = Character.valueOf(SignatureVisitor.INSTANCEOF);
        Character chValueOf2 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        Character chValueOf3 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH);
        Character chValueOf4 = Character.valueOf(SignatureVisitor.EXTENDS);
        Character chValueOf5 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        Character chValueOf6 = Character.valueOf(SignatureVisitor.SUPER);
        ArrayList arrayListM8793 = AbstractC4344.m8793(new C6516('0', '9'), AbstractC4344.m8790(new C6516('a', 'z'), new C6516('A', 'Z')));
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayListM8793, 10));
        Iterator it = arrayListM8793.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f22408 = AbstractC4344.m8788(arrayList);
        f22407 = AbstractC4344.m8788(AbstractC4344.m8793(new C6516('0', '9'), AbstractC4344.m8790(new C6516('a', 'z'), new C6516('A', 'Z'))));
        AbstractC4344.m8788(AbstractC4344.m8793(new C6516('0', '9'), AbstractC4344.m8790(new C6516('a', 'f'), new C6516('A', 'F'))));
        Set setM8845 = AbstractC4347.m8845(new Character[]{':', '/', '?', '#', Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH), ']', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~', chValueOf4});
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(setM8845, 10));
        Iterator it2 = setM8845.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f22406 = arrayList2;
        f22405 = AbstractC4347.m8845(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, chValueOf4, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~'});
        AbstractC7739.m13054(f22407, AbstractC4347.m8845(new Character[]{'!', '#', '$', '&', chValueOf4, chValueOf6, chValueOf5, '^', '_', '`', '|', '~'}));
        List listM11931 = AbstractC6347.m11931(chValueOf6, chValueOf5, '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(listM11931, 10));
        Iterator it3 = listM11931.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f22404 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13575(C5477 c5477, InterfaceC6558 interfaceC6558) {
        while (!c5477.mo10604()) {
            while (!c5477.mo10604()) {
                interfaceC6558.invoke(Byte.valueOf(c5477.readByte()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m13576(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = AbstractC5132.f14688.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str.length();
        C5477 c5477 = new C5477();
        AbstractC3066.m6865(charsetEncoderNewEncoder, c5477, str, 0, length);
        m13575(c5477, new C0003(sb, 1, z));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13577(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = AbstractC5132.f14688;
        str.getClass();
        charset.getClass();
        return m13579(str, i, i2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13578(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        Charset charset = AbstractC5132.f14688;
        str.getClass();
        charset.getClass();
        return m13579(str, i, i2, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m13579(String str, int i, int i2, boolean z) throws URLDecodeException {
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
                            int iM13580 = m13580(str.charAt(i7));
                            int iM135802 = m13580(str.charAt(i6));
                            if (iM13580 == -1 || iM135802 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iM13580 * 16) + iM135802);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(AbstractC5139.m10135(0, bArr, i5));
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
    public static final int m13580(char c) {
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
    public static final String m13581(byte b) {
        int i = (b & DefaultClassResolver.NAME) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
