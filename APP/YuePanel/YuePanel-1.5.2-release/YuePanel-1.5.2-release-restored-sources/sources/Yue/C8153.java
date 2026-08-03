package Yue;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8153 extends AbstractC8148 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final ThreadLocal<C1443> f3257 = ThreadLocal.withInitial(new Supplier() { // from class: Yue.ۥۣۢۤۤ
        @Override // java.util.function.Supplier
        public final Object get() {
            return C8153.m26820();
        }
    });

    /* JADX INFO: renamed from: Yue.ۥۣۢۤۥ$ۥ */
    public static class C1443 {

        /* JADX INFO: renamed from: ۥ */
        public final CharsetEncoder f3258;

        /* JADX INFO: renamed from: ۥ۟ */
        public final CharsetDecoder f3259;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public CharSequence f24175 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ByteBuffer f24176 = null;

        public C1443() {
            Charset charset = StandardCharsets.UTF_8;
            this.f3258 = charset.newEncoder();
            this.f3259 = charset.newDecoder();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ C1443 m26820() {
        return new C1443();
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ */
    public String mo4175(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f3257.get().f3259;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4176(CharSequence charSequence, ByteBuffer byteBuffer) {
        C1443 c1443 = f3257.get();
        if (c1443.f24175 != charSequence) {
            mo26799(charSequence);
        }
        byteBuffer.put(c1443.f24176);
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo26799(CharSequence charSequence) {
        C1443 c1443 = f3257.get();
        int length = (int) (charSequence.length() * c1443.f3258.maxBytesPerChar());
        ByteBuffer byteBuffer = c1443.f24176;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c1443.f24176 = ByteBuffer.allocate(Math.max(128, length));
        }
        c1443.f24176.clear();
        c1443.f24175 = charSequence;
        CoderResult coderResultEncode = c1443.f3258.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), c1443.f24176, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        c1443.f24176.flip();
        return c1443.f24176.remaining();
    }
}
