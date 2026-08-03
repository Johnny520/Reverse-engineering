package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
class FolderPathElement implements com.android.multidex.ClassPathElement {
    private final java.io.File baseFolder;

    public FolderPathElement(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.baseFolder = r1
            return
    }

    private void collect(java.io.File r6, java.lang.String r7, java.util.ArrayList<java.lang.String> r8) {
            r5 = this;
            java.io.File[] r6 = r6.listFiles()
            int r0 = r6.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L48
            r2 = r6[r1]
            boolean r3 = r2.isDirectory()
            r4 = 47
            if (r3 == 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r4)
            java.lang.String r4 = r2.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.collect(r2, r3, r8)
            goto L45
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r4)
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r8.add(r2)
        L45:
            int r1 = r1 + 1
            goto L6
        L48:
            return
    }

    @Override // com.android.multidex.ClassPathElement
    public void close() {
            r0 = this;
            return
    }

    @Override // com.android.multidex.ClassPathElement
    public java.lang.Iterable<java.lang.String> list() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r3.baseFolder
            java.lang.String r2 = ""
            r3.collect(r1, r2, r0)
            return r0
    }

    @Override // com.android.multidex.ClassPathElement
    public java.io.InputStream open(java.lang.String r6) throws java.io.FileNotFoundException {
            r5 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.baseFolder
            r3 = 47
            char r4 = java.io.File.separatorChar
            java.lang.String r6 = r6.replace(r3, r4)
            r1.<init>(r2, r6)
            r0.<init>(r1)
            return r0
    }
}
