package p058;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.collections.AbstractC4330;
import kotlin.collections.C4333;
import kotlin.text.AbstractC5132;
import kotlinx.io.AbstractC5478;
import kotlinx.io.C5477;
import kotlinx.io.C5479;
import kotlinx.io.InterfaceC5481;
import kotlinx.io.InterfaceC5484;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6855 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5477 f18296 = new C5477();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12077(InterfaceC5481 interfaceC5481, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = AbstractC5132.f14688;
        }
        interfaceC5481.getClass();
        charset.getClass();
        return charset.equals(AbstractC5132.f14688) ? AbstractC5478.m10630(interfaceC5481) : AbstractC3066.m6863(charset.newDecoder(), interfaceC5481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m12078(InterfaceC5481 interfaceC5481, InterfaceC6558 interfaceC6558) throws EOFException {
        interfaceC5481.getClass();
        interfaceC6558.getClass();
        C5477 c5477Mo10603 = interfaceC5481.mo10603();
        if (c5477Mo10603.mo10604()) {
            C5925.m11310("Buffer is empty");
            return;
        }
        C5479 c5479 = c5477Mo10603.f15143;
        c5479.getClass();
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, c5479.f15148 - i);
        byteBufferWrap.getClass();
        interfaceC6558.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition != 0) {
            if (iPosition < 0) {
                C5925.m11311("Returned negative read bytes count");
            } else if (iPosition <= c5479.m10637()) {
                c5477Mo10603.skip(iPosition);
            } else {
                C5925.m11311("Returned too many bytes");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m12079(InterfaceC5481 interfaceC5481) {
        interfaceC5481.getClass();
        return interfaceC5481.mo10603().f15142;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m12080(InterfaceC5481 interfaceC5481, long j) throws EOFException {
        interfaceC5481.getClass();
        interfaceC5481.mo10602(j);
        long jMin = Math.min(j, interfaceC5481.mo10603().f15142);
        interfaceC5481.mo10603().skip(jMin);
        return jMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5477 m12081(InterfaceC5481 interfaceC5481) {
        interfaceC5481.getClass();
        C5477 c5477Mo10603 = interfaceC5481.mo10603();
        C5477 c5477 = new C5477();
        if (c5477Mo10603.f15142 == 0) {
            return c5477;
        }
        C5479 c5479 = c5477Mo10603.f15143;
        c5479.getClass();
        C5479 c5479M10634 = c5479.m10634();
        c5477.f15143 = c5479M10634;
        c5477.f15141 = c5479M10634;
        for (C5479 c54792 = c5479.f15145; c54792 != null; c54792 = c54792.f15145) {
            C5479 c54793 = c5477.f15141;
            c54793.getClass();
            C5479 c5479M106342 = c54792.m10634();
            c54793.m10635(c5479M106342);
            c5477.f15141 = c5479M106342;
        }
        c5477.f15142 = c5477Mo10603.f15142;
        return c5477;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12082(C5477 c5477, CharSequence charSequence) {
        int length = charSequence.length();
        charSequence.getClass();
        m12086(c5477, charSequence, length, 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m12083(InterfaceC5484 interfaceC5484, byte[] bArr, int i, int i2) {
        interfaceC5484.getClass();
        bArr.getClass();
        ((C5477) interfaceC5484).write(bArr, i, i2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] m12084(String str, Charset charset) throws CharacterCodingException {
        str.getClass();
        charset.getClass();
        Charset charset2 = AbstractC5132.f14688;
        if (!charset.equals(charset2)) {
            return AbstractC3055.m6662(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        C4333 c4333 = AbstractC4330.Companion;
        int length2 = str.length();
        c4333.getClass();
        C4333.m8765(0, length, length2);
        CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            bArrArray.getClass();
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                bArrArray2.getClass();
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m12085(InterfaceC5484 interfaceC5484, InterfaceC5481 interfaceC5481) {
        interfaceC5484.getClass();
        interfaceC5481.getClass();
        ((C5477) interfaceC5484).m10613(interfaceC5481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12086(C5477 c5477, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = AbstractC5132.f14688;
        c5477.getClass();
        charSequence.getClass();
        charset.getClass();
        AbstractC5478.m10626(c5477, charSequence.toString(), 0, i);
    }
}
