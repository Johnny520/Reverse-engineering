package p325w8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import p172l8.C4700i0;
import p299ub.C8614c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: w8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9204d extends AbstractC9203c {
    /* JADX INFO: renamed from: a */
    public static final ByteBuffer m35831a(int i10, CharsetEncoder charsetEncoder) {
        charsetEncoder.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: b */
    public static final CharsetEncoder m35832b(Charset charset) {
        charset.getClass();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    /* JADX INFO: renamed from: c */
    public static String m35833c(File file, Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM35840c = AbstractC9205e.m35840c(inputStreamReader);
            AbstractC9202b.m35830a(inputStreamReader, null);
            return strM35840c;
        } finally {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m35834d(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C8614c.f28652b;
        }
        return m35833c(file, charset);
    }

    /* JADX INFO: renamed from: e */
    public static void m35835e(File file, String str, Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m35837g(fileOutputStream, str, charset);
            C4700i0 c4700i0 = C4700i0.f13910a;
            AbstractC9202b.m35830a(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m35836f(File file, String str, Charset charset, int i10, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i10 & 2) != 0) {
            charset = C8614c.f28652b;
        }
        m35835e(file, str, charset);
    }

    /* JADX INFO: renamed from: g */
    public static final void m35837g(OutputStream outputStream, String str, Charset charset) throws IOException {
        outputStream.getClass();
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderM35832b = m35832b(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderM35832b.getClass();
        ByteBuffer byteBufferM35831a = m35831a(8192, charsetEncoderM35832b);
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int iMin = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderM35832b.encode(charBufferAllocate, byteBufferM35831a, i12 == str.length()).isUnderflow()) {
                C10010p0.m38820a("Check failed.");
                return;
            }
            outputStream.write(byteBufferM35831a.array(), 0, byteBufferM35831a.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferM35831a.clear();
            i10 = i12;
        }
    }
}
