package p054dg;

import gg.AbstractC1416l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p034c7.C0407c;
import p036c9.C0499x;
import p092g4.AbstractC1341a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p259r9.AbstractC3754e0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: dg.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0793l extends AbstractC3165h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: Z */
    public static void m2020Z(File file, String str) throws IOException {
        Charset charset = AbstractC3137a.f10177a;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            m2030j0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m2021a0(File file, File file2) {
        file.getClass();
        if (!file.exists()) {
            throw new C0783b(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new C0783b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C0407c(file, file2, "Failed to create target directory.");
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
                AbstractC1341a.m3594j(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static void m2022b0(File file) {
        C0789h c0789h = new C0789h(new C0791j(file, EnumC0792k.f2376h, (C0499x) null));
        while (true) {
            boolean z9 = true;
            while (c0789h.hasNext()) {
                File file2 = (File) c0789h.next();
                if (!file2.delete() && file2.exists()) {
                    z9 = false;
                } else if (z9) {
                    break;
                } else {
                    z9 = false;
                }
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m2023c0(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return AbstractC3149m.m6697L0(name, '.', HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m2024d0(File file) {
        char c10 = File.separatorChar;
        String path = file.getPath();
        path.getClass();
        if (c10 == '/') {
            return path;
        }
        String strReplace = path.replace(c10, '/');
        strReplace.getClass();
        return strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m2025e0(File file) {
        String name = file.getName();
        name.getClass();
        int iM6723v0 = AbstractC3149m.m6723v0(6, name, ".");
        return iM6723v0 == -1 ? name : name.substring(0, iM6723v0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f0 */
    public static final C0784c m2026f0(C0784c c0784c) {
        File file = c0784c.f2356a;
        ?? r62 = c0784c.f2357b;
        ArrayList arrayList = new ArrayList(r62.size());
        for (File file2 : r62) {
            String name = file2.getName();
            if (!AbstractC1416l.m3825a(name, ".")) {
                if (!AbstractC1416l.m3825a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || AbstractC1416l.m3825a(((File) AbstractC4166m.m8393B1(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new C0784c(file, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: g0 */
    public static byte[] m2027g0(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i9 = (int) length;
            byte[] bArrCopyOf = new byte[i9];
            int i10 = i9;
            int i11 = 0;
            while (i10 > 0) {
                int i12 = fileInputStream.read(bArrCopyOf, i11, i10);
                if (i12 < 0) {
                    break;
                }
                i10 -= i12;
                i11 += i12;
            }
            if (i10 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
            } else {
                int i13 = fileInputStream.read();
                if (i13 != -1) {
                    C0782a c0782a = new C0782a(8193);
                    c0782a.write(i13);
                    AbstractC1341a.m3594j(fileInputStream, c0782a);
                    int size = c0782a.size() + i9;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM2016a = c0782a.m2016a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC4165l.m8380o0(bArrM2016a, i9, 0, bArrCopyOf, c0782a.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(fileInputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: h0 */
    public static String m2028h0(File file, Charset charset) throws IOException {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM7887e0 = AbstractC3754e0.m7887e0(inputStreamReader);
            inputStreamReader.close();
            return strM7887e0;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m2029i0(File file, File file2) {
        file.getClass();
        file2.getClass();
        C0784c c0784cM2026f0 = m2026f0(AbstractC3165h.m6770V(file));
        ?? r2 = c0784cM2026f0.f2357b;
        C0784c c0784cM2026f02 = m2026f0(AbstractC3165h.m6770V(file2));
        ?? r42 = c0784cM2026f02.f2357b;
        boolean zEquals = c0784cM2026f0.f2356a.equals(c0784cM2026f02.f2356a);
        String string = null;
        if (zEquals) {
            int size = r42.size();
            int size2 = r2.size();
            int iMin = Math.min(size2, size);
            int i9 = 0;
            while (i9 < iMin && AbstractC1416l.m3825a(r2.get(i9), r42.get(i9))) {
                i9++;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = size - 1;
            if (i9 <= i10) {
                while (!AbstractC1416l.m3825a(((File) r42.get(i10)).getName(), "..")) {
                    sb2.append("..");
                    if (i10 != i9) {
                        sb2.append(File.separatorChar);
                    }
                    if (i10 != i9) {
                        i10--;
                    } else {
                        if (i9 < size2) {
                            if (i9 < size) {
                                sb2.append(File.separatorChar);
                            }
                            List listM8419q1 = AbstractC4166m.m8419q1(i9, r2);
                            String str = File.separator;
                            str.getClass();
                            AbstractC4166m.m8428z1(listM8419q1, sb2, str, null, 124);
                        }
                        string = sb2.toString();
                    }
                }
            } else {
                if (i9 < size2) {
                }
                string = sb2.toString();
            }
        }
        if (string != null) {
            return new File(string);
        }
        C0086a.m451j(file, "this and base files have different roots: ", " and ", file2, 46);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static final void m2030j0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
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
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int iMin = Math.min(8192 - i10, str.length() - i9);
            int i11 = i9 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i9, i11, cArrArray, i10);
            charBufferAllocate.limit(iMin + i10);
            i10 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i11 == str.length()).isUnderflow()) {
                C2104o.m5276A("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i10 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i9 = i11;
        }
    }
}
