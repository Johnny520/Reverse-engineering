package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.io.ByteArrayOutputStream baos;
    private final java.lang.String definition;
    java.util.List<com.android.multidex.ClassPathElement> elements;
    private final byte[] readBuffer;

    static {
            return
    }

    public Path(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.elements = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 40960(0xa000, float:5.7397E-41)
            r0.<init>(r1)
            r4.baos = r0
            r0 = 20480(0x5000, float:2.8699E-41)
            byte[] r0 = new byte[r0]
            r4.readBuffer = r0
            r4.definition = r5
            java.lang.String r0 = java.io.File.pathSeparator
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L28:
            if (r1 >= r0) goto L57
            r2 = r5[r1]
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L3b
            r3.<init>(r2)     // Catch: java.io.IOException -> L3b
            com.android.multidex.ClassPathElement r2 = getClassPathElement(r3)     // Catch: java.io.IOException -> L3b
            r4.addElement(r2)     // Catch: java.io.IOException -> L3b
            int r1 = r1 + 1
            goto L28
        L3b:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong classpath: "
            r1.append(r2)
            java.lang.String r2 = r5.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r5)
            throw r0
        L57:
            return
    }

    private void addElement(com.android.multidex.ClassPathElement r2) {
            r1 = this;
            java.util.List<com.android.multidex.ClassPathElement> r0 = r1.elements
            r0.add(r2)
            return
    }

    public static com.android.multidex.ClassPathElement getClassPathElement(java.io.File r3) throws java.util.zip.ZipException, java.io.IOException {
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Lc
            com.android.multidex.FolderPathElement r0 = new com.android.multidex.FolderPathElement
            r0.<init>(r3)
            return r0
        Lc:
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L1d
            com.android.multidex.ArchivePathElement r0 = new com.android.multidex.ArchivePathElement
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
        L1d:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L43
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r3 = r3.getPath()
            r1.append(r3)
            java.lang.String r3 = "\" is not a directory neither a zip file"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L43:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File \""
            r1.append(r2)
            java.lang.String r3 = r3.getPath()
            r1.append(r3)
            java.lang.String r3 = "\" not found"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static byte[] readStream(java.io.InputStream r2, java.io.ByteArrayOutputStream r3, byte[] r4) throws java.io.IOException {
        L0:
            int r0 = r2.read(r4)     // Catch: java.lang.Throwable -> L13
            if (r0 >= 0) goto Le
            r2.close()
            byte[] r2 = r3.toByteArray()
            return r2
        Le:
            r1 = 0
            r3.write(r4, r1, r0)     // Catch: java.lang.Throwable -> L13
            goto L0
        L13:
            r3 = move-exception
            r2.close()
            throw r3
    }

    public synchronized com.android.dx.cf.direct.DirectClassFile getClass(java.lang.String r7) throws java.io.FileNotFoundException {
            r6 = this;
            monitor-enter(r6)
            java.util.List<com.android.multidex.ClassPathElement> r0 = r6.elements     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L35
            r1 = 0
        L8:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L35
            com.android.multidex.ClassPathElement r2 = (com.android.multidex.ClassPathElement) r2     // Catch: java.lang.Throwable -> L35
            java.io.InputStream r2 = r2.open(r7)     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L35
            java.io.ByteArrayOutputStream r3 = r6.baos     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = r6.readBuffer     // Catch: java.lang.Throwable -> L3b
            byte[] r3 = readStream(r2, r3, r4)     // Catch: java.lang.Throwable -> L3b
            java.io.ByteArrayOutputStream r4 = r6.baos     // Catch: java.lang.Throwable -> L3b
            r4.reset()     // Catch: java.lang.Throwable -> L3b
            com.android.dx.cf.direct.DirectClassFile r4 = new com.android.dx.cf.direct.DirectClassFile     // Catch: java.lang.Throwable -> L3b
            r5 = 0
            r4.<init>(r3, r7, r5)     // Catch: java.lang.Throwable -> L3b
            com.android.dx.cf.direct.StdAttributeFactory r1 = com.android.dx.cf.direct.StdAttributeFactory.THE_ONE     // Catch: java.lang.Throwable -> L39
            r4.setAttributeFactory(r1)     // Catch: java.lang.Throwable -> L39
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            r1 = r4
            goto L42
        L35:
            r7 = move-exception
            goto L62
        L37:
            r1 = r4
            goto L8
        L39:
            r1 = move-exception
            goto L3e
        L3b:
            r3 = move-exception
            r4 = r1
            r1 = r3
        L3e:
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            throw r1     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        L42:
            if (r1 == 0) goto L46
            monitor-exit(r6)
            return r1
        L46:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "File \""
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            r1.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "\" not found"
            r1.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L35
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L62:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L35
            throw r7
    }

    public java.lang.Iterable<com.android.multidex.ClassPathElement> getElements() {
            r1 = this;
            java.util.List<com.android.multidex.ClassPathElement> r0 = r1.elements
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.definition
            return r0
    }
}
