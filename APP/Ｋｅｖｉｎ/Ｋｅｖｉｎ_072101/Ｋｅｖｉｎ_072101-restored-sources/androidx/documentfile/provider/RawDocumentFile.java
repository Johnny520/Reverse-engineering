package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes2.dex */
class RawDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private java.io.File mFile;

    RawDocumentFile(androidx.documentfile.provider.DocumentFile r1, java.io.File r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mFile = r2
            return
    }

    private static boolean deleteContents(java.io.File r7) {
            java.io.File[] r0 = r7.listFiles()
            r1 = 1
            if (r0 == 0) goto L3a
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L3a
            r4 = r0[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L18
            boolean r5 = deleteContents(r4)
            r1 = r1 & r5
        L18:
            boolean r5 = r4.delete()
            if (r5 != 0) goto L37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to delete "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DocumentFile"
            android.util.Log.w(r6, r5)
            r1 = 0
        L37:
            int r3 = r3 + 1
            goto L9
        L3a:
            return r1
    }

    private static java.lang.String getTypeForName(java.lang.String r3) {
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 < 0) goto L1d
            int r1 = r0 + 1
            java.lang.String r1 = r3.substring(r1)
            java.lang.String r1 = r1.toLowerCase()
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r2.getMimeTypeFromExtension(r1)
            if (r2 == 0) goto L1d
            return r2
        L1d:
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.canRead()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.canWrite()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.mFile
            r0.<init>(r1, r3)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L16
            boolean r1 = r0.mkdir()
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            return r1
        L16:
            androidx.documentfile.provider.RawDocumentFile r1 = new androidx.documentfile.provider.RawDocumentFile
            r1.<init>(r2, r0)
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getExtensionFromMimeType(r6)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r7 = r1.toString()
        L21:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.mFile
            r1.<init>(r2, r7)
            r1.createNewFile()     // Catch: java.io.IOException -> L31
            androidx.documentfile.provider.RawDocumentFile r2 = new androidx.documentfile.provider.RawDocumentFile     // Catch: java.io.IOException -> L31
            r2.<init>(r5, r1)     // Catch: java.io.IOException -> L31
            return r2
        L31:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to createFile: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DocumentFile"
            android.util.Log.w(r4, r3)
            r3 = 0
            return r3
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r1 = this;
            java.io.File r0 = r1.mFile
            deleteContents(r0)
            java.io.File r0 = r1.mFile
            boolean r0 = r0.delete()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.exists()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
            r1 = this;
            java.io.File r0 = r1.mFile
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.io.File r0 = r1.mFile
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getTypeForName(r0)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            java.io.File r0 = r1.mFile
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isDirectory()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isFile()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            java.io.File r0 = r2.mFile
            long r0 = r0.lastModified()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            java.io.File r0 = r2.mFile
            long r0 = r0.length()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r6.mFile
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L1e
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            androidx.documentfile.provider.RawDocumentFile r5 = new androidx.documentfile.provider.RawDocumentFile
            r5.<init>(r6, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L1e:
            int r2 = r0.size()
            androidx.documentfile.provider.DocumentFile[] r2 = new androidx.documentfile.provider.DocumentFile[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            androidx.documentfile.provider.DocumentFile[] r2 = (androidx.documentfile.provider.DocumentFile[]) r2
            return r2
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.mFile
            java.io.File r1 = r1.getParentFile()
            r0.<init>(r1, r3)
            java.io.File r1 = r2.mFile
            boolean r1 = r1.renameTo(r0)
            if (r1 == 0) goto L17
            r2.mFile = r0
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }
}
