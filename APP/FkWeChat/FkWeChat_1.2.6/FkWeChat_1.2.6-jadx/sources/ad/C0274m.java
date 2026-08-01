package ad;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: ad.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0274m {

    /* JADX INFO: renamed from: a */
    public final InputStream f669a;

    /* JADX INFO: renamed from: b */
    public final Charset f670b;

    /* JADX INFO: renamed from: c */
    public final CharsetDecoder f671c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f672d;

    /* JADX INFO: renamed from: e */
    public boolean f673e;

    /* JADX INFO: renamed from: f */
    public char f674f;

    public C0274m(InputStream inputStream, Charset charset) {
        inputStream.getClass();
        charset.getClass();
        this.f669a = inputStream;
        this.f670b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        charsetDecoderOnUnmappableCharacter.getClass();
        this.f671c = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C0260h.f640c.m760b());
        byteBufferWrap.getClass();
        this.f672d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX INFO: renamed from: a */
    public final int m806a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f671c.decode(this.f672d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (m807b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f672d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f671c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f671c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    /* JADX INFO: renamed from: b */
    public final int m807b() {
        this.f672d.compact();
        try {
            int iLimit = this.f672d.limit();
            int iPosition = this.f672d.position();
            int i10 = this.f669a.read(this.f672d.array(), this.f672d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            ByteBuffer byteBuffer = this.f672d;
            if (i10 < 0) {
                byteBuffer.flip();
                return i10;
            }
            byteBuffer.getClass();
            byteBuffer.position(iPosition + i10);
            this.f672d.flip();
            return this.f672d.remaining();
        } catch (Throwable th) {
            this.f672d.flip();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m808c() {
        if (this.f673e) {
            this.f673e = false;
            return this.f674f;
        }
        char[] cArr = new char[2];
        int iM809d = m809d(cArr, 0, 2);
        if (iM809d == -1) {
            return -1;
        }
        if (iM809d == 1) {
            return cArr[0];
        }
        if (iM809d == 2) {
            this.f674f = cArr[1];
            this.f673e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iM809d).toString());
    }

    /* JADX INFO: renamed from: d */
    public final int m809d(char[] cArr, int i10, int i11) {
        cArr.getClass();
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= cArr.length || i11 < 0 || i10 + i11 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + cArr.length).toString());
        }
        if (this.f673e) {
            cArr[i10] = this.f674f;
            i10++;
            i11--;
            this.f673e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return m806a(cArr, i10, i11) + i12;
        }
        int iM808c = m808c();
        if (iM808c != -1) {
            cArr[i10] = (char) iM808c;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }
}
