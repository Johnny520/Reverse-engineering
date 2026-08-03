package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public class ClassPathOpener {
    public static final com.android.dx.cf.direct.ClassPathOpener.FileNameFilter acceptAll = null;
    private final com.android.dx.cf.direct.ClassPathOpener.Consumer consumer;
    private com.android.dx.cf.direct.ClassPathOpener.FileNameFilter filter;
    private final java.lang.String pathname;
    private final boolean sort;




    public interface Consumer {
        void onException(java.lang.Exception r1);

        void onProcessArchiveStart(java.io.File r1);

        boolean processFileBytes(java.lang.String r1, long r2, byte[] r4);
    }

    public interface FileNameFilter {
        boolean accept(java.lang.String r1);
    }

    static {
            com.android.dx.cf.direct.ClassPathOpener$1 r0 = new com.android.dx.cf.direct.ClassPathOpener$1
            r0.<init>()
            com.android.dx.cf.direct.ClassPathOpener.acceptAll = r0
            return
    }

    public ClassPathOpener(java.lang.String r2, boolean r3, com.android.dx.cf.direct.ClassPathOpener.Consumer r4) {
            r1 = this;
            com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r0 = com.android.dx.cf.direct.ClassPathOpener.acceptAll
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public ClassPathOpener(java.lang.String r1, boolean r2, com.android.dx.cf.direct.ClassPathOpener.FileNameFilter r3, com.android.dx.cf.direct.ClassPathOpener.Consumer r4) {
            r0 = this;
            r0.<init>()
            r0.pathname = r1
            r0.sort = r2
            r0.consumer = r4
            r0.filter = r3
            return
    }

    public static /* synthetic */ int access$000(java.lang.String r0, java.lang.String r1) {
            int r0 = compareClassNames(r0, r1)
            return r0
    }

    private static int compareClassNames(java.lang.String r2, java.lang.String r3) {
            r0 = 36
            r1 = 48
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "package-info"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r3 = r3.replace(r0, r1)
            int r2 = r2.compareTo(r3)
            return r2
    }

    private boolean processArchive(java.io.File r12) throws java.io.IOException {
            r11 = this;
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r12)
            java.util.Enumeration r1 = r0.entries()
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            boolean r2 = r11.sort
            if (r2 == 0) goto L19
            com.android.dx.cf.direct.ClassPathOpener$3 r2 = new com.android.dx.cf.direct.ClassPathOpener$3
            r2.<init>(r11)
            java.util.Collections.sort(r1, r2)
        L19:
            com.android.dx.cf.direct.ClassPathOpener$Consumer r2 = r11.consumer
            r2.onProcessArchiveStart(r12)
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream
            r2 = 40000(0x9c40, float:5.6052E-41)
            r12.<init>(r2)
            r2 = 20000(0x4e20, float:2.8026E-41)
            byte[] r2 = new byte[r2]
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L30:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r1.next()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            boolean r6 = r5.isDirectory()
            java.lang.String r7 = r5.getName()
            com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r8 = r11.filter
            boolean r8 = r8.accept(r7)
            if (r8 == 0) goto L30
            if (r6 != 0) goto L68
            java.io.InputStream r6 = r0.getInputStream(r5)
            r12.reset()
        L55:
            int r8 = r6.read(r2)
            r9 = -1
            if (r8 == r9) goto L60
            r12.write(r2, r3, r8)
            goto L55
        L60:
            r6.close()
            byte[] r6 = r12.toByteArray()
            goto L6a
        L68:
            byte[] r6 = new byte[r3]
        L6a:
            com.android.dx.cf.direct.ClassPathOpener$Consumer r8 = r11.consumer
            long r9 = r5.getTime()
            boolean r5 = r8.processFileBytes(r7, r9, r6)
            r4 = r4 | r5
            goto L30
        L76:
            r0.close()
            return r4
    }

    private boolean processDirectory(java.io.File r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto La
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "."
            r6.<init>(r5, r0)
            r5 = r6
        La:
            java.io.File[] r5 = r5.listFiles()
            int r6 = r5.length
            boolean r0 = r4.sort
            if (r0 == 0) goto L1b
            com.android.dx.cf.direct.ClassPathOpener$2 r0 = new com.android.dx.cf.direct.ClassPathOpener$2
            r0.<init>(r4)
            java.util.Arrays.sort(r5, r0)
        L1b:
            r0 = 0
            r1 = r0
            r2 = r1
        L1e:
            if (r1 >= r6) goto L2a
            r3 = r5[r1]
            boolean r3 = r4.processOne(r3, r0)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L1e
        L2a:
            return r2
    }

    private boolean processOne(java.io.File r6, boolean r7) {
            r5 = this;
            r0 = 0
            boolean r1 = r6.isDirectory()     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto Le
            boolean r6 = r5.processDirectory(r6, r7)     // Catch: java.lang.Exception -> Lc
            return r6
        Lc:
            r6 = move-exception
            goto L48
        Le:
            java.lang.String r7 = r6.getPath()     // Catch: java.lang.Exception -> Lc
            java.lang.String r1 = ".zip"
            boolean r1 = r7.endsWith(r1)     // Catch: java.lang.Exception -> Lc
            if (r1 != 0) goto L43
            java.lang.String r1 = ".jar"
            boolean r1 = r7.endsWith(r1)     // Catch: java.lang.Exception -> Lc
            if (r1 != 0) goto L43
            java.lang.String r1 = ".apk"
            boolean r1 = r7.endsWith(r1)     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L2b
            goto L43
        L2b:
            com.android.dx.cf.direct.ClassPathOpener$FileNameFilter r1 = r5.filter     // Catch: java.lang.Exception -> Lc
            boolean r1 = r1.accept(r7)     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L42
            byte[] r1 = com.android.dex.util.FileUtils.readFile(r6)     // Catch: java.lang.Exception -> Lc
            com.android.dx.cf.direct.ClassPathOpener$Consumer r2 = r5.consumer     // Catch: java.lang.Exception -> Lc
            long r3 = r6.lastModified()     // Catch: java.lang.Exception -> Lc
            boolean r6 = r2.processFileBytes(r7, r3, r1)     // Catch: java.lang.Exception -> Lc
            return r6
        L42:
            return r0
        L43:
            boolean r6 = r5.processArchive(r6)     // Catch: java.lang.Exception -> Lc
            return r6
        L48:
            com.android.dx.cf.direct.ClassPathOpener$Consumer r7 = r5.consumer
            r7.onException(r6)
            return r0
    }

    public boolean process() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.pathname
            r0.<init>(r1)
            r1 = 1
            boolean r0 = r2.processOne(r0, r1)
            return r0
    }
}
