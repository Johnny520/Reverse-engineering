package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi0 extends AbstractC0738tl {
    /* JADX INFO: renamed from: e0 */
    public static byte[] m5899e0(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    qh0 qh0Var = new qh0(8193);
                    qh0Var.write(i5);
                    p40.m3731n(fileInputStream, qh0Var);
                    int size = qh0Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM4187b = qh0Var.m4187b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC0460mg.m3085Z(bArrM4187b, bArrCopyOf, i, 0, qh0Var.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pp0.m3916n(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static String m5900f0(File file) throws IOException {
        Charset charset = AbstractC0856wq.f12612a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            string.getClass();
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static File m5901g0(File file, String str) {
        int length;
        int iM4003p0;
        file.getClass();
        str.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int iM4003p02 = pv2.m4003p0(path, c, 0, 4);
        if (iM4003p02 != 0) {
            length = (iM4003p02 <= 0 || path.charAt(iM4003p02 + (-1)) != ':') ? (iM4003p02 == -1 && pv2.m4000m0(path, ':')) ? path.length() : 0 : iM4003p02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iM4003p0 = pv2.m4003p0(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM4003p03 = pv2.m4003p0(path, c, iM4003p0 + 1, 4);
            length = iM4003p03 >= 0 ? iM4003p03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if ((string.length() == 0) || pv2.m4000m0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m5902h0(File file, String str) throws IOException {
        Charset charset = AbstractC0856wq.f12612a;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m5903i0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m5903i0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                C0676s.m4653l("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
