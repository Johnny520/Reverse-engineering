package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes2.dex */
class TreeDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    TreeDocumentFile(androidx.documentfile.provider.DocumentFile r1, android.content.Context r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r2
            r0.mUri = r3
            return
    }

    private static void closeQuietly(java.lang.AutoCloseable r1) {
            if (r1 == 0) goto La
            r1.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L8
            goto La
        L6:
            r0 = move-exception
            goto La
        L8:
            r0 = move-exception
            throw r0
        La:
            return
    }

    private static android.net.Uri createFile(android.content.Context r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch: java.lang.Exception -> L9
            android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r3, r4, r5)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            r1 = 0
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canRead(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canWrite(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.net.Uri r1 = r3.mUri
            java.lang.String r2 = "vnd.android.document/directory"
            android.net.Uri r0 = createFile(r0, r1, r2, r4)
            if (r0 == 0) goto L14
            androidx.documentfile.provider.TreeDocumentFile r1 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r2 = r3.mContext
            r1.<init>(r3, r2, r0)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.net.Uri r1 = r3.mUri
            android.net.Uri r0 = createFile(r0, r1, r4, r5)
            if (r0 == 0) goto L12
            androidx.documentfile.provider.TreeDocumentFile r1 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r2 = r3.mContext
            r1.<init>(r3, r2, r0)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.mUri     // Catch: java.lang.Exception -> Ld
            boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.exists(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getName(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getType(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isDirectory(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isFile(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isVirtual(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.lastModified(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.length(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r10 = this;
            android.content.Context r0 = r10.mContext
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = r10.mUri
            android.net.Uri r2 = r10.mUri
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r2)
            android.net.Uri r7 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
            r9 = 0
            java.lang.String r1 = "document_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r0
            r2 = r7
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r9 = r1
        L29:
            boolean r1 = r9.moveToNext()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r1 == 0) goto L3f
            r1 = 0
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.net.Uri r2 = r10.mUri     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r8.add(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            goto L29
        L3f:
        L40:
            closeQuietly(r9)
            goto L61
        L44:
            r1 = move-exception
            goto L83
        L46:
            r1 = move-exception
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Failed query: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L44
            goto L40
        L61:
            int r1 = r8.size()
            android.net.Uri[] r1 = new android.net.Uri[r1]
            java.lang.Object[] r1 = r8.toArray(r1)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
            int r2 = r1.length
            androidx.documentfile.provider.DocumentFile[] r2 = new androidx.documentfile.provider.DocumentFile[r2]
            r3 = 0
        L71:
            int r4 = r1.length
            if (r3 >= r4) goto L82
            androidx.documentfile.provider.TreeDocumentFile r4 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r5 = r10.mContext
            r6 = r1[r3]
            r4.<init>(r10, r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L71
        L82:
            return r2
        L83:
            closeQuietly(r9)
            throw r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Exception -> L14
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L14
            android.net.Uri r2 = r3.mUri     // Catch: java.lang.Exception -> L14
            android.net.Uri r1 = android.provider.DocumentsContract.renameDocument(r1, r2, r4)     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L13
            r3.mUri = r1     // Catch: java.lang.Exception -> L14
            r0 = 1
            return r0
        L13:
            return r0
        L14:
            r1 = move-exception
            return r0
    }
}
