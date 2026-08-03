package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
class ArchivePathElement implements com.android.multidex.ClassPathElement {
    private final java.util.zip.ZipFile archive;


    public static class DirectoryEntryException extends java.io.IOException {
        public DirectoryEntryException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ArchivePathElement(java.util.zip.ZipFile r1) {
            r0 = this;
            r0.<init>()
            r0.archive = r1
            return
    }

    public static /* synthetic */ java.util.zip.ZipFile access$000(com.android.multidex.ArchivePathElement r0) {
            java.util.zip.ZipFile r0 = r0.archive
            return r0
    }

    @Override // com.android.multidex.ClassPathElement
    public void close() throws java.io.IOException {
            r1 = this;
            java.util.zip.ZipFile r0 = r1.archive
            r0.close()
            return
    }

    @Override // com.android.multidex.ClassPathElement
    public java.lang.Iterable<java.lang.String> list() {
            r1 = this;
            com.android.multidex.ArchivePathElement$1 r0 = new com.android.multidex.ArchivePathElement$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.multidex.ClassPathElement
    public java.io.InputStream open(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.util.zip.ZipFile r0 = r3.archive
            java.util.zip.ZipEntry r0 = r0.getEntry(r4)
            if (r0 == 0) goto L1b
            boolean r4 = r0.isDirectory()
            if (r4 != 0) goto L15
            java.util.zip.ZipFile r4 = r3.archive
            java.io.InputStream r4 = r4.getInputStream(r0)
            return r4
        L15:
            com.android.multidex.ArchivePathElement$DirectoryEntryException r4 = new com.android.multidex.ArchivePathElement$DirectoryEntryException
            r4.<init>()
            throw r4
        L1b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\" not found"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
