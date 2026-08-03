package p026N0;

import java.io.BufferedReader;
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
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.AbstractC0040p;
import p009E0.C0170a;
import p009E0.C0180k;
import p031Q0.AbstractC0307g;
import p040V0.C0398a;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: N0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270k extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static void m690g0(File file, File file2) throws C0261b {
        if (!file.exists()) {
            throw new C0260a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            throw new C0260a(file, file2, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C0261b(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC0040p.m115t(fileInputStream, fileOutputStream, 8192);
                AbstractC0040p.m108m(fileOutputStream, null);
                AbstractC0040p.m108m(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0040p.m108m(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static ArrayList m691h0(File file, Charset charset) {
        AbstractC0307g.m703e(charset, "charset");
        ArrayList arrayList = new ArrayList();
        C0170a c0170a = new C0170a(1, arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            InterfaceC0405h c0180k = new C0180k(3, bufferedReader);
            if (!(c0180k instanceof C0398a)) {
                c0180k = new C0398a(c0180k);
            }
            Iterator it = ((C0398a) c0180k).iterator();
            while (it.hasNext()) {
                c0170a.invoke(it.next());
            }
            AbstractC0040p.m108m(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static String m692i0(File file, Charset charset) {
        AbstractC0307g.m703e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i2 = inputStreamReader.read(cArr); i2 >= 0; i2 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i2);
            }
            String string = stringWriter.toString();
            AbstractC0307g.m702d(string, "toString(...)");
            AbstractC0040p.m108m(inputStreamReader, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m693j0(File file, String str, Charset charset) {
        AbstractC0307g.m703e(file, "<this>");
        AbstractC0307g.m703e(str, "text");
        AbstractC0307g.m703e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m695l0(fileOutputStream, str, charset);
            AbstractC0040p.m108m(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m695l0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        AbstractC0307g.m703e(str, "text");
        AbstractC0307g.m703e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            AbstractC0307g.m702d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC0307g.m700b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC0307g.m702d(byteBufferAllocate, "allocate(...)");
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int iMin = Math.min(8192 - i3, str.length() - i2);
            int i4 = i2 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC0307g.m702d(cArrArray, "array(...)");
            str.getChars(i2, i4, cArrArray, i3);
            charBufferAllocate.limit(iMin + i3);
            i3 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i4 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i3 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i2 = i4;
        }
    }
}
