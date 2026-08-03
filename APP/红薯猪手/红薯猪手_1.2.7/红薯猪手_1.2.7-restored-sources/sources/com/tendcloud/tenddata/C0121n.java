package com.tendcloud.tenddata;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.n */
/* JADX INFO: loaded from: classes.dex */
public class C0121n {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, a> f556a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.n$a */
    public static class a {
        private FileLock fileLock;
        private RandomAccessFile randomAccessFile;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.n$b */
    public enum b {
        Custom_Device_Id_Lock_File("Custom_Device_Id_Lock_File"),
        Cloud_Control_Lock_File("Cloud_Control_Cache_Param"),
        App_Lock_File("__App_Synchronous_Lock__"),
        Tracking_Lock_File("__Tracking_Synchronous_Lock__"),
        Env_Lock_File("__Env_Synchronous_Lock__"),
        Game_Lock_File("__Game_Synchronous_Lock__"),
        Push_Lock_File("__Push_Synchronous_Lock__"),
        EAuth_Lock_File("__EAuth_Synchronous_Lock__"),
        App_SQL_Lock_File("__AppSQL_Synchronous_Lock__"),
        BG_Lock_File("__BG_Synchronous_Lock__"),
        Universal_Lock_File("__SDK_Synchronous_Lock__"),
        AES_DATA_LOCK("_AES_DATA_LOCK"),
        AES_DATA_ENTRYCP_LOCK("_AES_DATA_ENTCRYPT_LOCK"),
        AES_SALT_LOCK("_AES_SALT_LOCK"),
        AES_IV_LOCK("_AES_IV_LOCK");

        private final String filePath;

        b(String str) {
            this.filePath = new File(C0020ab.f132g.getFilesDir(), C0020ab.f144s + str).getAbsolutePath();
        }

        public static String getFeatureLockFileName(int i) {
            b bVar;
            if (i == 0) {
                bVar = App_Lock_File;
            } else if (i == 1) {
                bVar = Tracking_Lock_File;
            } else if (i == 2) {
                bVar = Env_Lock_File;
            } else if (i == 3) {
                bVar = Game_Lock_File;
            } else if (i == 4) {
                bVar = Push_Lock_File;
            } else if (i == 6) {
                bVar = EAuth_Lock_File;
            } else if (i == 7) {
                bVar = App_SQL_Lock_File;
            } else if (i == 8) {
                bVar = BG_Lock_File;
            } else {
                if (i != 99) {
                    return null;
                }
                bVar = Universal_Lock_File;
            }
            return bVar.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.filePath;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m660a(String str) {
        a aVar;
        RandomAccessFile randomAccessFile;
        try {
            if (C0131y.m767b(str)) {
                throw new RuntimeException("LockManager Error: filePath can not be null!");
            }
            File file = new File(str);
            if (f556a.containsKey(str)) {
                aVar = f556a.get(str);
                randomAccessFile = aVar.randomAccessFile;
            } else {
                a aVar2 = new a();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                aVar2.randomAccessFile = randomAccessFile2;
                f556a.put(str, aVar2);
                aVar = aVar2;
                randomAccessFile = randomAccessFile2;
            }
            aVar.fileLock = randomAccessFile.getChannel().tryLock();
            return aVar.fileLock != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static RandomAccessFile m661b(String str) {
        try {
            if (C0131y.m767b(str)) {
                throw new RuntimeException("LockManager Error: filePath can not be null!");
            }
            File file = new File(str);
            if (f556a.containsKey(str)) {
                return f556a.get(str).randomAccessFile;
            }
            a aVar = new a();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            aVar.randomAccessFile = randomAccessFile;
            f556a.put(str, aVar);
            return randomAccessFile;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void getFileLock(String str) {
        a aVar;
        RandomAccessFile randomAccessFile;
        try {
            if (C0131y.m767b(str)) {
                throw new RuntimeException("LockManager Error: filePath can not be null!");
            }
            File file = new File(str);
            if (f556a.containsKey(str)) {
                aVar = f556a.get(str);
                randomAccessFile = aVar.randomAccessFile;
            } else {
                a aVar2 = new a();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                aVar2.randomAccessFile = randomAccessFile2;
                f556a.put(str, aVar2);
                aVar = aVar2;
                randomAccessFile = randomAccessFile2;
            }
            aVar.fileLock = randomAccessFile.getChannel().lock();
        } catch (Throwable unused) {
        }
    }

    public static void releaseFileLock(String str) {
        try {
            if (C0131y.m767b(str)) {
                throw new RuntimeException("LockManager Error: filePath can not be null!");
            }
            if (!f556a.containsKey(str)) {
                throw new RuntimeException("LockManager Error: there is no information about this file in the cache!");
            }
            a aVar = f556a.get(str);
            if (aVar.fileLock != null) {
                aVar.fileLock.release();
            }
        } catch (Throwable unused) {
        }
    }
}
