package p058;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.collections.AbstractC4329;
import kotlin.collections.C4332;
import kotlin.text.AbstractC5131;
import kotlinx.io.AbstractC5477;
import kotlinx.io.C5476;
import kotlinx.io.C5478;
import kotlinx.io.InterfaceC5480;
import kotlinx.io.InterfaceC5483;
import p052.InterfaceC6557;
import p251.AbstractC8174;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5476 f18301 = new C5476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12049(InterfaceC5480 interfaceC5480, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = AbstractC5131.f14688;
        }
        interfaceC5480.getClass();
        charset.getClass();
        return charset.equals(AbstractC5131.f14688) ? AbstractC5477.m10626(interfaceC5480) : AbstractC8189.m13684(charset.newDecoder(), interfaceC5480);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m12050(InterfaceC5480 interfaceC5480, InterfaceC6557 interfaceC6557) throws EOFException {
        interfaceC5480.getClass();
        interfaceC6557.getClass();
        C5476 c5476Mo10600 = interfaceC5480.mo10600();
        if (c5476Mo10600.mo10601()) {
            C5919.m11249("Buffer is empty");
            return;
        }
        C5478 c5478 = c5476Mo10600.f15143;
        c5478.getClass();
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, c5478.f15148 - i);
        byteBufferWrap.getClass();
        interfaceC6557.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition != 0) {
            if (iPosition < 0) {
                C5919.m11250("Returned negative read bytes count");
            } else if (iPosition <= c5478.m10633()) {
                c5476Mo10600.skip(iPosition);
            } else {
                C5919.m11250("Returned too many bytes");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m12051(InterfaceC5480 interfaceC5480) {
        interfaceC5480.getClass();
        return interfaceC5480.mo10600().f15142;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m12052(InterfaceC5480 interfaceC5480, long j) throws EOFException {
        interfaceC5480.getClass();
        interfaceC5480.mo10599(j);
        long jMin = Math.min(j, interfaceC5480.mo10600().f15142);
        interfaceC5480.mo10600().skip(jMin);
        return jMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5476 m12053(InterfaceC5480 interfaceC5480) {
        interfaceC5480.getClass();
        C5476 c5476Mo10600 = interfaceC5480.mo10600();
        C5476 c5476 = new C5476();
        if (c5476Mo10600.f15142 == 0) {
            return c5476;
        }
        C5478 c5478 = c5476Mo10600.f15143;
        c5478.getClass();
        C5478 c5478M10630 = c5478.m10630();
        c5476.f15143 = c5478M10630;
        c5476.f15141 = c5478M10630;
        for (C5478 c54782 = c5478.f15145; c54782 != null; c54782 = c54782.f15145) {
            C5478 c54783 = c5476.f15141;
            c54783.getClass();
            C5478 c5478M106302 = c54782.m10630();
            c54783.m10631(c5478M106302);
            c5476.f15141 = c5478M106302;
        }
        c5476.f15142 = c5476Mo10600.f15142;
        return c5476;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12054(C5476 c5476, CharSequence charSequence) {
        int length = charSequence.length();
        charSequence.getClass();
        m12058(c5476, charSequence, length, 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m12055(InterfaceC5483 interfaceC5483, byte[] bArr, int i, int i2) {
        interfaceC5483.getClass();
        bArr.getClass();
        ((C5476) interfaceC5483).write(bArr, i, i2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] m12056(String str, Charset charset) throws CharacterCodingException {
        str.getClass();
        charset.getClass();
        Charset charset2 = AbstractC5131.f14688;
        if (!charset.equals(charset2)) {
            return AbstractC8174.m13624(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        C4332 c4332 = AbstractC4329.Companion;
        int length2 = str.length();
        c4332.getClass();
        C4332.m8775(0, length, length2);
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
    public static final void m12057(InterfaceC5483 interfaceC5483, InterfaceC5480 interfaceC5480) {
        interfaceC5483.getClass();
        interfaceC5480.getClass();
        ((C5476) interfaceC5483).m10609(interfaceC5480);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12058(C5476 c5476, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = AbstractC5131.f14688;
        c5476.getClass();
        charSequence.getClass();
        charset.getClass();
        AbstractC5477.m10622(c5476, charSequence.toString(), 0, i);
    }
}
