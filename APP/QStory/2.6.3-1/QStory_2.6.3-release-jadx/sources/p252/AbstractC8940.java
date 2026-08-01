package p252;

import androidx.activity.compose.C0850;
import com.bumptech.glide.AbstractC3898;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5971;
import kotlinx.p010io.C6309;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p064.C7345;
import p068.InterfaceC7387;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f22749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f22750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f22751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f22753;

    static {
        Character chValueOf = Character.valueOf(SignatureVisitor.INSTANCEOF);
        Character chValueOf2 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        Character chValueOf3 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH);
        Character chValueOf4 = Character.valueOf(SignatureVisitor.EXTENDS);
        Character chValueOf5 = Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        Character chValueOf6 = Character.valueOf(SignatureVisitor.SUPER);
        ArrayList arrayListM9352 = AbstractC5176.m9352(new C7345('0', '9'), AbstractC5176.m9349(new C7345('a', 'z'), new C7345('A', 'Z')));
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM9352, 10));
        Iterator it = arrayListM9352.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f22753 = AbstractC5176.m9347(arrayList);
        f22752 = AbstractC5176.m9347(AbstractC5176.m9352(new C7345('0', '9'), AbstractC5176.m9349(new C7345('a', 'z'), new C7345('A', 'Z'))));
        AbstractC5176.m9347(AbstractC5176.m9352(new C7345('0', '9'), AbstractC5176.m9349(new C7345('a', 'f'), new C7345('A', 'F'))));
        Set setM9404 = AbstractC5179.m9404(new Character[]{':', '/', '?', '#', Character.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH), ']', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~', chValueOf4});
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(setM9404, 10));
        Iterator it2 = setM9404.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f22751 = arrayList2;
        f22750 = AbstractC5179.m9404(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', chValueOf3, chValueOf4, ',', chValueOf2, chValueOf, chValueOf6, chValueOf5, '_', '~'});
        AbstractC8568.m13613(f22752, AbstractC5179.m9404(new Character[]{'!', '#', '$', '&', chValueOf4, chValueOf6, chValueOf5, '^', '_', '`', '|', '~'}));
        List listM12490 = AbstractC7176.m12490(chValueOf6, chValueOf5, '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listM12490, 10));
        Iterator it3 = listM12490.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f22749 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m14134(C6309 c6309, InterfaceC7387 interfaceC7387) {
        while (!c6309.mo11163()) {
            while (!c6309.mo11163()) {
                interfaceC7387.invoke(Byte.valueOf(c6309.readByte()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m14135(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = AbstractC5964.f15033.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str.length();
        C6309 c6309 = new C6309();
        AbstractC3898.m7425(charsetEncoderNewEncoder, c6309, str, 0, length);
        m14134(c6309, new C0850(sb, 1, z));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m14136(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = AbstractC5964.f15033;
        str.getClass();
        charset.getClass();
        return m14138(str, i, i2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14137(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        Charset charset = AbstractC5964.f15033;
        str.getClass();
        charset.getClass();
        return m14138(str, i, i2, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m14138(String str, int i, int i2, boolean z) throws URLDecodeException {
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
                            int iM14139 = m14139(str.charAt(i7));
                            int iM141392 = m14139(str.charAt(i6));
                            if (iM14139 == -1 || iM141392 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iM14139 * 16) + iM141392);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(AbstractC5971.m10694(0, bArr, i5));
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
    public static final int m14139(char c) {
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
    public static final String m14140(byte b) {
        int i = (b & DefaultClassResolver.NAME) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
