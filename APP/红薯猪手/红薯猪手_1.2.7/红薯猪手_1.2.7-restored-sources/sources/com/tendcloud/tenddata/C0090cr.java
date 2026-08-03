package com.tendcloud.tenddata;

import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cr */
/* JADX INFO: loaded from: classes.dex */
public class C0090cr {

    /* JADX INFO: renamed from: a */
    private static final int f414a = 25;

    /* JADX INFO: renamed from: b */
    private static C0090cr f415b;

    /* JADX INFO: renamed from: c */
    private ExecutorService f416c;

    /* JADX INFO: renamed from: d */
    private HashMap<Integer, TreeSet<C0089cq>> f417d;

    /* JADX INFO: renamed from: e */
    private CRC32 f418e;

    /* JADX INFO: renamed from: f */
    private Map<Integer, RandomAccessFile> f419f;

    /* JADX INFO: renamed from: g */
    private Map<Integer, FileLock> f420g;

    /* JADX INFO: renamed from: h */
    private Lock f421h = new ReentrantLock();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cr$a */
    public class a implements Runnable {
        private final String mFolderPath;
        private final String mNewFolder;
        private final TreeSet<C0089cq> mQueue;

        private a(AbstractC0018a abstractC0018a) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0020ab.f132g.getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append(abstractC0018a.getDataFolder());
            this.mFolderPath = sb.toString();
            this.mNewFolder = C0020ab.f132g.getFilesDir() + str + abstractC0018a.getRootFolder() + str + abstractC0018a.getDataFolder();
            this.mQueue = (TreeSet) C0090cr.this.f417d.get(Integer.valueOf(abstractC0018a.index()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private void deleteFile(String str, C0089cq c0089cq) {
            StringBuilder sbM1039 = C0167c4.m1039(str);
            sbM1039.append(File.separator);
            sbM1039.append(c0089cq.m448b());
            File file = new File(sbM1039.toString());
            if (file.exists()) {
                file.delete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TreeSet<C0089cq> treeSet = this.mQueue;
                if (treeSet != null) {
                    treeSet.isEmpty();
                    while (!this.mQueue.isEmpty()) {
                        C0089cq c0089cqPollFirst = this.mQueue.pollFirst();
                        if (c0089cqPollFirst != null) {
                            File file = new File(this.mFolderPath);
                            if (file.exists()) {
                                deleteFile(file.getAbsolutePath(), c0089cqPollFirst);
                            }
                            File file2 = new File(this.mNewFolder);
                            if (file2.exists()) {
                                deleteFile(file2.getAbsolutePath(), c0089cqPollFirst);
                            }
                        }
                    }
                    this.mQueue.clear();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cr$b */
    public class b implements Runnable {
        private final String mFolderPath;
        private final C0089cq mOperation;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private b(C0089cq c0089cq, AbstractC0018a abstractC0018a, String str) {
            String absolutePath = C0020ab.f132g.getFilesDir().getAbsolutePath();
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbM1039 = C0167c4.m1039(absolutePath);
                sbM1039.append(File.separator);
                sbM1039.append(str);
                absolutePath = sbM1039.toString();
            }
            StringBuilder sbM10392 = C0167c4.m1039(absolutePath);
            sbM10392.append(File.separator);
            sbM10392.append(abstractC0018a.getDataFolder());
            this.mFolderPath = sbM10392.toString();
            this.mOperation = c0089cq;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(this.mFolderPath + File.separator + this.mOperation.m448b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cr$c */
    public class c implements Runnable {
        private InterfaceC0091cs callback;
        private AbstractC0018a features;
        private String mFolderPath;
        private final C0089cq mOperation;
        private final C0090cr opm;

        private c(C0089cq c0089cq, C0067bv c0067bv, C0090cr c0090cr) {
            File filesDir = C0020ab.f132g.getFilesDir();
            this.opm = c0090cr;
            StringBuilder sb = new StringBuilder();
            sb.append(filesDir.toString());
            String str = File.separator;
            sb.append(str);
            sb.append(c0067bv.f352a.getDataFolder());
            this.mFolderPath = sb.toString();
            this.mFolderPath = filesDir.toString() + str + c0067bv.f352a.getRootFolder() + str + c0067bv.f352a.getDataFolder();
            this.mOperation = c0089cq;
            this.callback = c0067bv.f357f;
            this.features = c0067bv.f352a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (r3 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        
            r3.release();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            r2.close();
            r0 = r7.callback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        
            if (r0 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            RandomAccessFile randomAccessFile;
            FileLock fileLock;
            FileLock fileLockLock;
            try {
                try {
                    synchronized (this.opm) {
                        try {
                            File file = new File(this.mFolderPath);
                            if (!file.exists() && !file.isDirectory() && !file.mkdirs()) {
                                return;
                            }
                            C0090cr.this.m459a(file, this.features);
                            File file2 = new File(this.mFolderPath + File.separator + this.mOperation.m448b());
                            if (!file2.exists() && !file2.createNewFile()) {
                                return;
                            }
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                            try {
                                fileLockLock = randomAccessFile2.getChannel().lock();
                            } catch (Throwable th) {
                                fileLock = null;
                                randomAccessFile = randomAccessFile2;
                                th = th;
                            }
                            try {
                                randomAccessFile2.seek(1L);
                                randomAccessFile2.writeInt(this.mOperation.m452d());
                                randomAccessFile2.writeInt(this.mOperation.m453e());
                                randomAccessFile2.write(this.mOperation.m450c());
                                randomAccessFile2.getFD().sync();
                            } catch (Throwable th2) {
                                randomAccessFile = randomAccessFile2;
                                th = th2;
                                fileLock = fileLockLock;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            randomAccessFile = null;
                            fileLock = null;
                        }
                    }
                    try {
                        break;
                        throw th;
                    } catch (Throwable unused) {
                        try {
                            InterfaceC0091cs interfaceC0091cs = this.callback;
                            if (interfaceC0091cs != null) {
                                interfaceC0091cs.onStoreFailed();
                                this.callback = null;
                            }
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                InterfaceC0091cs interfaceC0091cs2 = this.callback;
                                if (interfaceC0091cs2 == null) {
                                    return;
                                }
                                interfaceC0091cs2.onStoreSuccess();
                            }
                        } catch (Throwable th5) {
                            if (fileLock != null) {
                                try {
                                    fileLock.release();
                                } catch (Throwable unused2) {
                                    throw th5;
                                }
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                InterfaceC0091cs interfaceC0091cs3 = this.callback;
                                if (interfaceC0091cs3 != null) {
                                    interfaceC0091cs3.onStoreSuccess();
                                }
                            }
                            throw th5;
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
                randomAccessFile = null;
                fileLock = null;
            }
        }
    }

    private C0090cr() {
        m462c();
        this.f417d = new HashMap<>();
        for (AbstractC0018a abstractC0018a : AbstractC0018a.values()) {
            this.f417d.put(Integer.valueOf(abstractC0018a.index()), new TreeSet<>());
        }
        this.f416c = Executors.newSingleThreadExecutor();
        this.f418e = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public static C0090cr m454a() {
        synchronized (C0090cr.class) {
            if (f415b == null) {
                f415b = new C0090cr();
            }
        }
        return f415b;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m456a(C0089cq c0089cq, AbstractC0018a abstractC0018a) {
        if (abstractC0018a != null && c0089cq != null) {
            try {
                this.f417d.get(Integer.valueOf(abstractC0018a.index())).add(c0089cq);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m458a(File file) {
        try {
            if (file.isDirectory()) {
                m458a(m461c(file).get(0));
            } else {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m459a(File file, AbstractC0018a abstractC0018a) {
        try {
            int fileLimitType = abstractC0018a.getFileLimitType();
            if (fileLimitType != 1) {
                if (fileLimitType != 2) {
                    if (fileLimitType != 3) {
                        return;
                    }
                } else if (file.listFiles().length < 10) {
                    return;
                }
            } else if (m460b(file) <= f414a) {
                return;
            }
            m458a(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private int m460b(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return 0;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                long length = 0;
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        length += file2.length();
                    }
                }
                return (int) (length / 1048576);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private List<File> m461c(File file) {
        List<File> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        try {
            arrayList = Arrays.asList(fileArrListFiles);
            Collections.sort(arrayList, new Comparator<File>() { // from class: com.tendcloud.tenddata.cr.1
                /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    return file2.getName().compareTo(file3.getName());
                }
            });
            return arrayList;
        } catch (Throwable unused) {
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m462c() {
        this.f419f = new HashMap();
        this.f420g = new HashMap();
        try {
            for (AbstractC0018a abstractC0018a : AbstractC0018a.values()) {
                File file = new File(C0020ab.f132g.getFilesDir(), abstractC0018a.getRootFolder());
                File file2 = new File(file, abstractC0018a.getDataFolder());
                if (!file2.exists() && !file2.mkdirs()) {
                    return;
                }
                this.f419f.put(Integer.valueOf(abstractC0018a.index()), new RandomAccessFile(new File(file, "Lock" + abstractC0018a.index()), "rw"));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #9 {all -> 0x011e, blocks: (B:21:0x0067, B:23:0x006d), top: B:100:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d A[Catch: all -> 0x0118, TRY_ENTER, TryCatch #6 {all -> 0x0118, blocks: (B:31:0x008e, B:32:0x0092, B:44:0x00e5, B:53:0x010d, B:55:0x0113), top: B:94:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[Catch: all -> 0x0118, TRY_LEAVE, TryCatch #6 {all -> 0x0118, blocks: (B:31:0x008e, B:32:0x0092, B:44:0x00e5, B:53:0x010d, B:55:0x0113), top: B:94:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized TreeSet<C0089cq> m463a(AbstractC0018a abstractC0018a, int i, String str) {
        FileLock fileLockTryLock;
        RandomAccessFile randomAccessFile;
        C0089cq c0089cq;
        File file;
        File filesDir = C0020ab.f132g.getFilesDir();
        if (str != null) {
            filesDir = new File(filesDir, str);
        }
        File file2 = new File(filesDir, abstractC0018a.getDataFolder());
        if (file2.exists()) {
            String[] list = file2.list();
            if (list != null && list.length > 0) {
                int iMin = Math.min(list.length, i);
                FileLock fileLock = null;
                RandomAccessFile randomAccessFile2 = null;
                C0089cq c0089cq2 = null;
                for (int i2 = 0; i2 < iMin; i2++) {
                    try {
                        file = new File(file2, list[i2]);
                    } catch (Throwable unused) {
                        fileLockTryLock = fileLock;
                        randomAccessFile = randomAccessFile2;
                        c0089cq = c0089cq2;
                    }
                    if (file.length() == 0) {
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                                fileLock = null;
                                if (randomAccessFile2 == null) {
                                    randomAccessFile2.close();
                                }
                            } catch (Throwable unused2) {
                            }
                        } else if (randomAccessFile2 == null) {
                        }
                    } else {
                        c0089cq = new C0089cq(list[i2]);
                        try {
                            randomAccessFile = new RandomAccessFile(file, "rw");
                            try {
                                fileLockTryLock = randomAccessFile.getChannel().tryLock();
                                if (fileLockTryLock == null) {
                                    try {
                                        randomAccessFile.close();
                                        if (fileLockTryLock != null) {
                                            try {
                                                fileLockTryLock.release();
                                                fileLockTryLock = null;
                                            } catch (Throwable unused3) {
                                                c0089cq2 = c0089cq;
                                                randomAccessFile2 = randomAccessFile;
                                                fileLock = fileLockTryLock;
                                            }
                                        }
                                        randomAccessFile.close();
                                        c0089cq2 = c0089cq;
                                        fileLock = fileLockTryLock;
                                    } catch (Throwable unused4) {
                                        try {
                                            this.f416c.execute(new b(c0089cq, abstractC0018a, str));
                                            if (fileLockTryLock != null) {
                                            }
                                            if (randomAccessFile == null) {
                                            }
                                            c0089cq2 = c0089cq;
                                            fileLock = fileLockTryLock;
                                        } catch (Throwable th) {
                                            if (fileLockTryLock != null) {
                                                try {
                                                    fileLockTryLock.release();
                                                } catch (Throwable unused5) {
                                                    throw th;
                                                }
                                            }
                                            if (randomAccessFile != null) {
                                                randomAccessFile.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    randomAccessFile.seek(1L);
                                    int i3 = randomAccessFile.readInt();
                                    byte[] bArr = new byte[randomAccessFile.readInt()];
                                    randomAccessFile.readFully(bArr);
                                    this.f418e.reset();
                                    this.f418e.update(bArr);
                                    if (i3 == ((int) this.f418e.getValue())) {
                                        try {
                                            c0089cq.writeData(bArr);
                                            m456a(c0089cq, abstractC0018a);
                                        } catch (Throwable unused6) {
                                            this.f416c.execute(new b(c0089cq, abstractC0018a, str));
                                            if (fileLockTryLock != null) {
                                                fileLockTryLock.release();
                                                fileLockTryLock = null;
                                            }
                                            if (randomAccessFile == null) {
                                                randomAccessFile.close();
                                                randomAccessFile2 = null;
                                            } else {
                                                randomAccessFile2 = randomAccessFile;
                                            }
                                            c0089cq2 = c0089cq;
                                            fileLock = fileLockTryLock;
                                        }
                                    } else {
                                        this.f416c.execute(new b(c0089cq, abstractC0018a, str));
                                    }
                                    fileLockTryLock.release();
                                    try {
                                        randomAccessFile.close();
                                        c0089cq2 = c0089cq;
                                        fileLock = null;
                                    } catch (Throwable unused7) {
                                        fileLockTryLock = null;
                                        c0089cq2 = c0089cq;
                                        randomAccessFile2 = randomAccessFile;
                                        fileLock = fileLockTryLock;
                                    }
                                }
                            } catch (Throwable unused8) {
                                fileLockTryLock = fileLock;
                            }
                        } catch (Throwable unused9) {
                            fileLockTryLock = fileLock;
                            randomAccessFile = randomAccessFile2;
                        }
                    }
                    randomAccessFile2 = null;
                }
            }
        } else {
            C0115h.iForInternal("operationFolder is not exists: " + file2);
        }
        HashMap<Integer, TreeSet<C0089cq>> map = this.f417d;
        if (map == null) {
            return null;
        }
        return map.get(Integer.valueOf(abstractC0018a.index()));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m464a(C0089cq c0089cq, C0067bv c0067bv) {
        this.f416c.execute(new c(c0089cq, c0067bv, this));
    }

    /* JADX INFO: renamed from: b */
    public void m465b() {
        File filesDir = C0020ab.f132g.getFilesDir();
        try {
            int i = 0;
            for (AbstractC0018a abstractC0018a : AbstractC0018a.values()) {
                File file = new File(filesDir, abstractC0018a.getDataFolder());
                if (file.exists()) {
                    Iterator<File> it = m461c(file).iterator();
                    while (it.hasNext()) {
                        it.next().delete();
                    }
                }
            }
            AbstractC0018a[] abstractC0018aArrValues = AbstractC0018a.values();
            int length = abstractC0018aArrValues.length;
            while (i < length) {
                AbstractC0018a abstractC0018a2 = abstractC0018aArrValues[i];
                File file2 = new File(filesDir, abstractC0018a2.getRootFolder());
                File file3 = new File(file2, abstractC0018a2.getDataFolder());
                if (file3.exists()) {
                    Iterator<File> it2 = m461c(file3).iterator();
                    while (it2.hasNext()) {
                        it2.next().delete();
                    }
                }
                i++;
                filesDir = file2;
            }
        } catch (Throwable unused) {
        }
    }

    public void clearDataCache(AbstractC0018a abstractC0018a) {
        try {
            this.f417d.get(Integer.valueOf(abstractC0018a.index())).clear();
        } catch (Throwable unused) {
        }
    }

    public void confirmRead(AbstractC0018a abstractC0018a) {
        new a(abstractC0018a).run();
    }

    public void getFileLock(AbstractC0018a abstractC0018a) {
        try {
            this.f421h.lock();
            this.f420g.put(Integer.valueOf(abstractC0018a.index()), this.f419f.get(Integer.valueOf(abstractC0018a.index())).getChannel().lock());
        } catch (Throwable unused) {
        }
    }

    public void releaseFileLock(AbstractC0018a abstractC0018a) {
        try {
            if (this.f420g.get(Integer.valueOf(abstractC0018a.index())) != null) {
                this.f420g.get(Integer.valueOf(abstractC0018a.index())).release();
                this.f421h.unlock();
            }
        } catch (Throwable unused) {
        }
    }
}
