package p000;

import java.io.BufferedReader;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2675wh extends AbstractC0628Oj {
    /* JADX INFO: renamed from: Z */
    public static void m5237Z(File file, File file2) {
        if (!file.exists()) {
            throw new C0516M(file, 2);
        }
        C2589uh c2589uh = new C2589uh(new C2499sd(file, 1, new C0309H7(10), 1));
        while (c2589uh.hasNext()) {
            File file3 = (File) c2589uh.next();
            if (!file3.exists()) {
                throw new C0516M(file3, 2);
            }
            File file4 = new File(file2, m5245h0(file3, file));
            if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                if (file4.isDirectory()) {
                    if (!m5239b0(file4)) {
                        throw new C0516M(file3, file4, "The destination file already exists.");
                    }
                } else if (!file4.delete()) {
                    throw new C0516M(file3, file4, "The destination file already exists.");
                }
            }
            if (file3.isDirectory()) {
                file4.mkdirs();
            } else {
                m5238a0(file3, file4);
                if (file4.length() != file3.length()) {
                    throw new IOException("Source file wasn't copied completely, length of destination file differs.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m5238a0(File file, File file2) {
        if (!file.exists()) {
            throw new C0516M(file, 2);
        }
        if (file2.exists() && !file2.delete()) {
            throw new C0516M(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C2273na(file, file2, "Failed to create target directory.");
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
                AbstractC1293cr.m2555p(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m5239b0(File file) {
        C2589uh c2589uh = new C2589uh(new C2499sd(file, 2, null, 1));
        while (true) {
            boolean z = true;
            while (c2589uh.hasNext()) {
                File file2 = (File) c2589uh.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static String m5240c0(File file) {
        String name = file.getName();
        int iM5060U = AbstractC2564tz.m5060U(6, name, ".");
        return iM5060U == -1 ? name : name.substring(0, iM5060U);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d0 */
    public static final C2323oh m5241d0(C2323oh c2323oh) {
        File file = c2323oh.f8169a;
        ?? r6 = c2323oh.f8170b;
        ArrayList arrayList = new ArrayList(r6.size());
        for (File file2 : r6) {
            String name = file2.getName();
            if (!AbstractC0585Nj.m1134a(name, ".")) {
                if (!AbstractC0585Nj.m1134a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || AbstractC0585Nj.m1134a(((File) AbstractC2453ra.m4902l0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new C2323oh(file, arrayList);
    }

    /* JADX INFO: renamed from: e0 */
    public static byte[] m5242e0(File file) throws IOException {
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
                    C0753Rg c0753Rg = new C0753Rg(8193);
                    c0753Rg.write(i5);
                    AbstractC1293cr.m2555p(fileInputStream, c0753Rg);
                    int size = c0753Rg.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM1543f = c0753Rg.m1543f();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrM1543f, 0, bArrCopyOf, i, c0753Rg.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0585Nj.m1138f(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m5243f0(File file) {
        Charset charset = AbstractC2659w7.f9201a;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new C1216bb(new C2381po(0, bufferedReader)).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static String m5244g0(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), AbstractC2659w7.f9201a);
        try {
            String strM2708h0 = AbstractC1406fG.m2708h0(inputStreamReader);
            inputStreamReader.close();
            return strM2708h0;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m5245h0(File file, File file2) {
        List listSingletonList;
        C2323oh c2323ohM5241d0 = m5241d0(AbstractC0628Oj.m1234V(file));
        ?? r1 = c2323ohM5241d0.f8170b;
        C2323oh c2323ohM5241d02 = m5241d0(AbstractC0628Oj.m1234V(file2));
        ?? r3 = c2323ohM5241d02.f8170b;
        boolean zEquals = c2323ohM5241d0.f8169a.equals(c2323ohM5241d02.f8169a);
        String string = null;
        if (zEquals) {
            int size = r3.size();
            int size2 = r1.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && AbstractC0585Nj.m1134a(r1.get(i), r3.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!AbstractC0585Nj.m1134a(((File) r3.get(i2)).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    } else {
                        if (i < size2) {
                            if (i < size) {
                                sb.append(File.separatorChar);
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Requested element count ", " is less than zero.").toString());
                            }
                            if (i == 0) {
                                listSingletonList = AbstractC2453ra.m4908r0(r1);
                            } else {
                                int size3 = r1.size() - i;
                                if (size3 <= 0) {
                                    listSingletonList = C0452Kf.f1484a;
                                } else if (size3 == 1) {
                                    listSingletonList = Collections.singletonList(AbstractC2453ra.m4902l0(r1));
                                } else {
                                    ArrayList arrayList = new ArrayList(size3);
                                    int size4 = r1.size();
                                    while (i < size4) {
                                        arrayList.add(r1.get(i));
                                        i++;
                                    }
                                    listSingletonList = arrayList;
                                }
                            }
                            AbstractC2453ra.m4899i0(listSingletonList, sb, File.separator, "", "", null);
                        }
                        string = sb.toString();
                    }
                }
            } else {
                if (i < size2) {
                }
                string = sb.toString();
            }
        }
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* JADX INFO: renamed from: i0 */
    public static void m5246i0(File file, String str) {
        Charset charset = AbstractC2659w7.f9201a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m5247j0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m5247j0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
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
