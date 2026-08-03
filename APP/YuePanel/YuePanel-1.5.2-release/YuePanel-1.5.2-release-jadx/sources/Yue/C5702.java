package Yue;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class C5702 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5702 f1623 = new C5702();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1624 = 32;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static CharsetDecoder f14077;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean f14078;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f14079;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final char[] f14080;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final ByteBuffer f14081;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final CharBuffer f14082;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final StringBuilder f14083;

    static {
        byte[] bArr = new byte[32];
        f14079 = bArr;
        char[] cArr = new char[32];
        f14080 = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C5499.m17102(byteBufferWrap, "wrap(bytes)");
        f14081 = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        C5499.m17102(charBufferWrap, "wrap(chars)");
        f14082 = charBufferWrap;
        f14083 = new StringBuilder();
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m2380() {
        ByteBuffer byteBuffer = f14081;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m2381(boolean z) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f14077;
            if (charsetDecoder == null) {
                C5499.m17132("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f14081;
            CharBuffer charBuffer = f14082;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            C5499.m17102(coderResultDecode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (coderResultDecode.isError()) {
                m17614();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb = f14083;
            char[] cArr = f14080;
            int i = iPosition - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m17612(int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer = f14081;
        byteBuffer.limit(i);
        f14082.position(i2);
        int iM2381 = m2381(true);
        CharsetDecoder charsetDecoder = f14077;
        if (charsetDecoder == null) {
            C5499.m17132("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iM2381;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r10 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r0 = Yue.C5702.f14080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r0[r10 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r1 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r0[r10 - 2] != '\r') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r0 = Yue.C5702.f14083;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        return new java.lang.String(Yue.C5702.f14080, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r0.append(Yue.C5702.f14080, 0, r10);
        r10 = r0.toString();
        Yue.C5499.m17102(r10, "sb.toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r0.length() <= 32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        m17615();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0001, B:6:0x0012, B:9:0x001c, B:13:0x002c, B:15:0x0037, B:21:0x0045, B:35:0x007a, B:37:0x0082, B:39:0x0086, B:41:0x008e, B:43:0x0092, B:45:0x009a, B:48:0x00a3, B:50:0x00b7, B:51:0x00ba, B:22:0x004a, B:25:0x0055, B:29:0x005c, B:31:0x006c, B:33:0x0074, B:54:0x00bf, B:11:0x0026), top: B:57:0x0001 }] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String m17613(@InterfaceC6399 InputStream inputStream, @InterfaceC6399 Charset charset) {
        int iM17612;
        try {
            C5499.m17103(inputStream, "inputStream");
            C5499.m17103(charset, "charset");
            CharsetDecoder charsetDecoder = f14077;
            if (charsetDecoder == null) {
                m17616(charset);
            } else {
                if (charsetDecoder == null) {
                    C5499.m17132("decoder");
                    charsetDecoder = null;
                }
                if (!C5499.m17094(charsetDecoder.charset(), charset)) {
                }
            }
            int iM2380 = 0;
            int iM2381 = 0;
            while (true) {
                int i = inputStream.read();
                if (i != -1) {
                    int i2 = iM2380 + 1;
                    f14079[iM2380] = (byte) i;
                    if (i == 10 || i2 == 32 || !f14078) {
                        ByteBuffer byteBuffer = f14081;
                        byteBuffer.limit(i2);
                        f14082.position(iM2381);
                        iM2381 = m2381(false);
                        if (iM2381 > 0 && f14080[iM2381 - 1] == '\n') {
                            byteBuffer.position(0);
                            iM17612 = iM2381;
                            break;
                        }
                        iM2380 = m2380();
                    } else {
                        iM2380 = i2;
                    }
                } else {
                    if (f14083.length() == 0 && iM2380 == 0 && iM2381 == 0) {
                        return null;
                    }
                    iM17612 = m17612(iM2380, iM2381);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m17614() {
        CharsetDecoder charsetDecoder = f14077;
        if (charsetDecoder == null) {
            C5499.m17132("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f14081.position(0);
        f14083.setLength(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m17615() {
        StringBuilder sb = f14083;
        sb.setLength(32);
        sb.trimToSize();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m17616(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        C5499.m17102(charsetDecoderNewDecoder, "charset.newDecoder()");
        f14077 = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f14081;
        byteBuffer.clear();
        CharBuffer charBuffer = f14082;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f14077;
        if (charsetDecoder == null) {
            C5499.m17132("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        f14078 = z;
        m17614();
    }
}
