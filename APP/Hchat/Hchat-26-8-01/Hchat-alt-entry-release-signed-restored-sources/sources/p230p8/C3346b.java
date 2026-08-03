package p230p8;

import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p136j8.AbstractC2091b;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: p8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3346b {

    /* JADX INFO: renamed from: a */
    public static final C3346b f10765a = new C3346b();

    /* JADX INFO: renamed from: b */
    public static final Charset f10766b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c */
    public static final List f10767c = AbstractC0000a.m101y0(new C3147k("(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)\\s*=\\s*[\"'](\\d+)[\"']"), new C3147k("<(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)>\\s*(\\d+)\\s*</"), new C3147k("(?:Item|GContainerItem):Length\\s*=\\s*[\"'](\\d+)[\"'][^>]{0,1024}(?:Item|GContainerItem):Semantic\\s*=\\s*[\"'](?:MotionPhoto|MicroVideo)[\"']", 0), new C3147k("(?:Item|GContainerItem):Semantic\\s*=\\s*[\"'](?:MotionPhoto|MicroVideo)[\"'][^>]{0,1024}(?:Item|GContainerItem):Length\\s*=\\s*[\"'](\\d+)[\"']", 0));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m7059a(File file, C3344a c3344a) {
        Object c3959f;
        String absolutePath = file.getAbsolutePath();
        long length = file.length();
        long jLastModified = file.lastModified();
        long j3 = c3344a.f10761a;
        long j4 = c3344a.f10762b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        sb2.append("|");
        sb2.append(length);
        sb2.append("|");
        sb2.append(jLastModified);
        AbstractC2091b.m5172s(sb2, "|", j3, "|");
        sb2.append(j4);
        String string = sb2.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = string.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            int i9 = 0;
            for (byte b10 : bArrDigest) {
                i9++;
                if (i9 > 1) {
                    sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                }
                sb3.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            }
            sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            c3959f = AbstractC3149m.m6701P0(24, sb3.toString());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objValueOf = String.valueOf(string.hashCode());
        if (c3959f instanceof C3959f) {
            c3959f = objValueOf;
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m7060b(File file) {
        String lowerCase = AbstractC0793l.m2023c0(file).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 111145:
                return !lowerCase.equals("png") ? "jpg" : lowerCase;
            case 3006482:
                if (lowerCase.equals("avif")) {
                    return lowerCase;
                }
                break;
            case 3198679:
                if (lowerCase.equals("heic")) {
                    return lowerCase;
                }
                break;
            case 3198682:
                if (lowerCase.equals("heif")) {
                    return lowerCase;
                }
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    return lowerCase;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7061c(File file) {
        Object c3959f;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                c3959f = Boolean.valueOf(randomAccessFile.readUnsignedByte() == 255 && randomAccessFile.readUnsignedByte() == 216);
                randomAccessFile.close();
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r20 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r3 != r15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r24 = r27 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r3 != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if ((r8 + 16) > r27) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r24 = r26.readLong();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r3 != 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r20 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r24 < r20) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r24 <= (r27 - r8)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r3 = p230p8.C3346b.f10766b;
        r3.getClass();
        r4 = new java.lang.String(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if (r8 != r29) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r4.equals("ftyp") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        r3 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        if (r3 == 3154021) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        if (r3 == 3346442) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (r3 == 3357449) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        if (r4.equals("moov") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c2, code lost:
    
        if (r4.equals("mdat") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:
    
        if (r4.equals("ftyp") != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cf, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d1, code lost:
    
        r8 = r8 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d3, code lost:
    
        if (r3 != r15) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
    
        r10 = r14;
        r3 = r15;
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3344a m7062d(RandomAccessFile randomAccessFile, long j3, long j4) throws IOException {
        long j5 = 0;
        if (j4 < 0) {
            return null;
        }
        if (j4 + 8 > j3) {
            return null;
        }
        long j10 = j4;
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        loop0: for (long j11 = 8; j10 + j11 <= j3; j11 = 8) {
            int i10 = i9 + 1;
            if (i9 >= 10000) {
                break;
            }
            randomAccessFile.seek(j10);
            long j12 = j5;
            long j13 = ((long) randomAccessFile.readInt()) & 4294967295L;
            int i11 = 4;
            byte[] bArr = new byte[4];
            randomAccessFile.readFully(bArr);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int i13 = bArr[i12] & 255;
                if (!(32 <= i13 && i13 < 127)) {
                    break loop0;
                }
                i12++;
                i11 = 4;
            }
        }
        if (z9 && z10 && z11 && j10 > j4) {
            return new C3344a(j4, j10);
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m7063e(File file, File file2, long j3, long j4) {
        Object c3959f;
        if (j4 <= 0) {
            return false;
        }
        if (file2.isFile() && file2.length() == j4) {
            return true;
        }
        File file3 = new File(file2.getParentFile(), AbstractC0255e.m1020i(file2.getName(), ".tmp"));
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.seek(j3);
                FileOutputStream fileOutputStream = new FileOutputStream(file3, false);
                try {
                    byte[] bArr = new byte[Opcodes.ASM4];
                    while (j4 > 0) {
                        int i9 = randomAccessFile.read(bArr, 0, (int) Math.min(Opcodes.ASM4, j4));
                        if (i9 <= 0) {
                            throw new IllegalStateException("unexpected end of source");
                        }
                        fileOutputStream.write(bArr, 0, i9);
                        j4 -= (long) i9;
                    }
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    randomAccessFile.close();
                    if (file2.exists() && !file2.delete()) {
                        throw new IllegalStateException("cannot replace cache file");
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!file3.renameTo(file2)) {
            throw new IllegalStateException("cannot finalize cache file");
        }
        c3959f = Boolean.TRUE;
        if (C3960g.m8182b(c3959f) != null) {
            file3.delete();
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }
}
