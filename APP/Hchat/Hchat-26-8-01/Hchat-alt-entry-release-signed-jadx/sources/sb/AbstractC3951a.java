package sb;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileLock;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p099h.Hchat.utils.KavaReflector;

/* JADX INFO: renamed from: sb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3951a {

    /* JADX INFO: renamed from: a */
    public static final Object f12956a = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m8173a(File file, File file2, String str) {
        String strConcat = str.endsWith(".so") ? str.substring(0, str.length() - 3).concat("-") : str.concat("-");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file3 : fileArrListFiles) {
            if (file3 != null && !file3.equals(file2)) {
                String name = file3.getName();
                if (name.equals(str) || (name.startsWith(strConcat) && name.endsWith(".so"))) {
                    file3.delete();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8174b(ZipFile zipFile, ZipEntry zipEntry, File file, String str, File file2) {
        FileOutputStream fileOutputStream;
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, ".tmp-");
        sbM1025n.append(Process.myPid());
        sbM1025n.append("-");
        sbM1025n.append(Thread.currentThread().getId());
        File file3 = new File(file, sbM1025n.toString());
        try {
            CRC32 crc32 = new CRC32();
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(file3, false);
            } finally {
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i9 = inputStream.read(bArr);
                    if (i9 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i9);
                    crc32.update(bArr, 0, i9);
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                inputStream.close();
                if (zipEntry.getCrc() >= 0 && crc32.getValue() != zipEntry.getCrc()) {
                    throw new IllegalStateException("Native 缓存 CRC 校验失败: " + str);
                }
                try {
                    Files.move(file3.toPath(), file2.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                } catch (AtomicMoveNotSupportedException unused) {
                    Files.move(file3.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } finally {
            }
        } finally {
            file3.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static File m8175c(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.isFile() || file2.length() <= 0) {
            file2 = null;
        }
        if (str.endsWith(".so")) {
            str = str.substring(0, str.length() - 3);
        }
        String strConcat = str.concat("-");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return file2;
        }
        for (File file3 : fileArrListFiles) {
            if (file3 != null && file3.isFile() && file3.length() > 0) {
                String name = file3.getName();
                if (name.startsWith(strConcat) && name.endsWith(".so") && (file2 == null || file3.lastModified() > file2.lastModified())) {
                    file2 = file3;
                }
            }
        }
        return file2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d9 A[Catch: all -> 0x00fc, TryCatch #12 {all -> 0x00fc, blocks: (B:50:0x00e1, B:53:0x00e9, B:57:0x00f7, B:125:0x01d2, B:124:0x01cf, B:126:0x01d3, B:128:0x01d9, B:129:0x01e1, B:121:0x01ca, B:54:0x00ee, B:56:0x00f4, B:63:0x0103, B:64:0x0115, B:120:0x01c9), top: B:164:0x00e1, inners: #5, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e1 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #12 {all -> 0x00fc, blocks: (B:50:0x00e1, B:53:0x00e9, B:57:0x00f7, B:125:0x01d2, B:124:0x01cf, B:126:0x01d3, B:128:0x01d9, B:129:0x01e1, B:121:0x01ca, B:54:0x00ee, B:56:0x00f4, B:63:0x0103, B:64:0x0115, B:120:0x01c9), top: B:164:0x00e1, inners: #5, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8176d(Context context, ClassLoader classLoader, String str, String str2, boolean z9) {
        String absolutePath;
        File[] fileArrListFiles;
        Class<?> superclass;
        File fileM8175c;
        String string;
        int iIndexOf;
        try {
            string = classLoader.toString();
            iIndexOf = string.indexOf("module=");
        } catch (Throwable unused) {
        }
        if (iIndexOf < 0) {
            try {
                superclass = classLoader.getClass();
            } catch (Throwable unused2) {
            }
            loop0: while (true) {
                if (superclass != null) {
                    Iterator<Field> it = KavaReflector.declaredFields(superclass).iterator();
                    while (it.hasNext()) {
                        Object field = KavaReflector.readField(it.next(), classLoader);
                        if (field instanceof String) {
                            String str3 = (String) field;
                            if (str3.endsWith(".apk") && str3.contains("h.Hchat") && new File(str3).exists()) {
                                absolutePath = str3;
                                break loop0;
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                } else {
                    try {
                        fileArrListFiles = new File("/data/app").listFiles();
                    } catch (Throwable unused3) {
                    }
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (file != null && file.isDirectory() && file.getName().contains("h.Hchat")) {
                                File file2 = new File(file, "base.apk");
                                if (file2.exists()) {
                                    absolutePath = file2.getAbsolutePath();
                                    break;
                                }
                                absolutePath = null;
                            }
                        }
                        absolutePath = null;
                    } else {
                        absolutePath = null;
                    }
                }
            }
        } else {
            int i9 = iIndexOf + 7;
            int iIndexOf2 = string.indexOf(",", i9);
            if (iIndexOf2 < 0) {
                iIndexOf2 = string.indexOf("]", i9);
            }
            if (iIndexOf2 > i9) {
                absolutePath = string.substring(i9, iIndexOf2).trim();
                if (!new File(absolutePath).exists()) {
                }
            }
        }
        String str4 = Process.is64Bit() ? "arm64-v8a" : "armeabi-v7a";
        String strM1021j = AbstractC0255e.m1021j("lib/", str4, "/", str);
        File file3 = new File(new File(context.getCacheDir(), "Hchat_native"), str4);
        if (absolutePath != null) {
            try {
                if (absolutePath.length() == 0) {
                    fileM8175c = m8175c(file3, str);
                    if (fileM8175c == null) {
                        System.load(fileM8175c.getAbsolutePath());
                    } else {
                        System.loadLibrary(str2);
                    }
                } else {
                    ZipFile zipFile = new ZipFile(absolutePath);
                    try {
                        ZipEntry entry = zipFile.getEntry(strM1021j);
                        if (entry == null) {
                            System.loadLibrary(str2);
                        } else {
                            file3.mkdirs();
                            String strM8177e = m8177e(entry.getCrc(), str);
                            File file4 = new File(file3, strM8177e);
                            synchronized (f12956a) {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file3, strM8177e + ".lock"), "rw");
                                try {
                                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                                    try {
                                        long size = entry.getSize();
                                        boolean z10 = file4.isFile() && file4.length() > 0 && (size < 0 || file4.length() == size);
                                        if (!z10) {
                                            m8174b(zipFile, entry, file3, strM8177e, file4);
                                        }
                                        try {
                                            System.load(file4.getAbsolutePath());
                                        } catch (UnsatisfiedLinkError e6) {
                                            if (!z10) {
                                                throw e6;
                                            }
                                            if (!file4.delete()) {
                                                throw new IllegalStateException("无法删除损坏的 Native 缓存: " + file4, e6);
                                            }
                                            m8174b(zipFile, entry, file3, strM8177e, file4);
                                            try {
                                                System.load(file4.getAbsolutePath());
                                            } finally {
                                                th.addSuppressed(e6);
                                            }
                                        }
                                        m8173a(file3, file4, str);
                                        if (fileLockLock != null) {
                                            fileLockLock.close();
                                        }
                                        randomAccessFile.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        }
                        zipFile.close();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                AbstractC0255e.m1030s(th2, AbstractC0255e.m1026o("[Hchat:NativeLoader] ", str, " 加载失败: "), th2);
                try {
                    System.loadLibrary(str2);
                } catch (Throwable th3) {
                    AbstractC0255e.m1030s(th3, AbstractC0255e.m1026o("[Hchat:NativeLoader] ", str2, " loadLibrary 也失败: "), th3);
                    if (z9) {
                        return false;
                    }
                    C0086a.m457p("无法加载 ".concat(str), th3);
                    return false;
                }
            }
        } else {
            fileM8175c = m8175c(file3, str);
            if (fileM8175c == null) {
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m8177e(long j3, String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String str2 = "-" + Long.toHexString(j3);
        if (iLastIndexOf <= 0) {
            return str.concat(str2);
        }
        return str.substring(0, iLastIndexOf) + str2 + str.substring(iLastIndexOf);
    }
}
