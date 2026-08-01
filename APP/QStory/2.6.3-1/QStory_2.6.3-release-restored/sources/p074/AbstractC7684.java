package p074;

import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.collections.AbstractC5162;
import kotlin.collections.C5165;
import kotlin.text.AbstractC5964;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import kotlinx.p010io.InterfaceC6313;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7684 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6309 f18641 = new C6309();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12636(InterfaceC6313 interfaceC6313, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = AbstractC5964.f15033;
        }
        interfaceC6313.getClass();
        charset.getClass();
        return charset.equals(AbstractC5964.f15033) ? AbstractC6310.m11189(interfaceC6313) : AbstractC3898.m7423(charset.newDecoder(), interfaceC6313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m12637(InterfaceC6313 interfaceC6313, InterfaceC7387 interfaceC7387) throws EOFException {
        interfaceC6313.getClass();
        interfaceC7387.getClass();
        C6309 c6309Mo11162 = interfaceC6313.mo11162();
        if (c6309Mo11162.mo11163()) {
            C6755.m11869("Buffer is empty");
            return;
        }
        C6311 c6311 = c6309Mo11162.f15488;
        c6311.getClass();
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, c6311.f15493 - i);
        byteBufferWrap.getClass();
        interfaceC7387.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition != 0) {
            if (iPosition < 0) {
                C6755.m11870("Returned negative read bytes count");
            } else if (iPosition <= c6311.m11196()) {
                c6309Mo11162.skip(iPosition);
            } else {
                C6755.m11870("Returned too many bytes");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m12638(InterfaceC6313 interfaceC6313) {
        interfaceC6313.getClass();
        return interfaceC6313.mo11162().f15487;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m12639(InterfaceC6313 interfaceC6313, long j) throws EOFException {
        interfaceC6313.getClass();
        interfaceC6313.mo11161(j);
        long jMin = Math.min(j, interfaceC6313.mo11162().f15487);
        interfaceC6313.mo11162().skip(jMin);
        return jMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6309 m12640(InterfaceC6313 interfaceC6313) {
        interfaceC6313.getClass();
        C6309 c6309Mo11162 = interfaceC6313.mo11162();
        C6309 c6309 = new C6309();
        if (c6309Mo11162.f15487 == 0) {
            return c6309;
        }
        C6311 c6311 = c6309Mo11162.f15488;
        c6311.getClass();
        C6311 c6311M11193 = c6311.m11193();
        c6309.f15488 = c6311M11193;
        c6309.f15486 = c6311M11193;
        for (C6311 c63112 = c6311.f15490; c63112 != null; c63112 = c63112.f15490) {
            C6311 c63113 = c6309.f15486;
            c63113.getClass();
            C6311 c6311M111932 = c63112.m11193();
            c63113.m11194(c6311M111932);
            c6309.f15486 = c6311M111932;
        }
        c6309.f15487 = c6309Mo11162.f15487;
        return c6309;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12641(C6309 c6309, CharSequence charSequence) {
        int length = charSequence.length();
        charSequence.getClass();
        m12645(c6309, charSequence, length, 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m12642(InterfaceC6316 interfaceC6316, byte[] bArr, int i, int i2) {
        interfaceC6316.getClass();
        bArr.getClass();
        ((C6309) interfaceC6316).write(bArr, i, i2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] m12643(String str, Charset charset) throws CharacterCodingException {
        str.getClass();
        charset.getClass();
        Charset charset2 = AbstractC5964.f15033;
        if (!charset.equals(charset2)) {
            return AbstractC3887.m7222(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        C5165 c5165 = AbstractC5162.Companion;
        int length2 = str.length();
        c5165.getClass();
        C5165.m9324(0, length, length2);
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
    public static final void m12644(InterfaceC6316 interfaceC6316, InterfaceC6313 interfaceC6313) {
        interfaceC6316.getClass();
        interfaceC6313.getClass();
        ((C6309) interfaceC6316).m11172(interfaceC6313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12645(C6309 c6309, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = AbstractC5964.f15033;
        c6309.getClass();
        charSequence.getClass();
        charset.getClass();
        AbstractC6310.m11185(c6309, charSequence.toString(), 0, i);
    }
}
