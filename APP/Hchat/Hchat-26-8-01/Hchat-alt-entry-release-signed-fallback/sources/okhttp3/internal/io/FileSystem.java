package okhttp3.internal.io;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    public static final okhttp3.internal.io.FileSystem.Companion Companion = null;
    public static final okhttp3.internal.io.FileSystem SYSTEM = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.io.FileSystem.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class SystemFileSystem implements okhttp3.internal.io.FileSystem {
            public SystemFileSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Sink appendingSink(java.io.File r2) {
                    r1 = this;
                    r2.getClass()
                    okio.Sink r2 = okio.Okio.appendingSink(r2)     // Catch: java.io.FileNotFoundException -> L8
                    return r2
                L8:
                    java.io.File r0 = r2.getParentFile()
                    r0.mkdirs()
                    okio.Sink r2 = okio.Okio.appendingSink(r2)
                    return r2
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(java.io.File r2) {
                    r1 = this;
                    r2.getClass()
                    boolean r0 = r2.delete()
                    if (r0 != 0) goto L15
                    boolean r0 = r2.exists()
                    if (r0 != 0) goto L10
                    goto L15
                L10:
                    java.lang.String r0 = "failed to delete "
                    j8.o.j(r2, r0)
                L15:
                    return
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(java.io.File r5) {
                    r4 = this;
                    r5.getClass()
                    java.io.File[] r0 = r5.listFiles()
                    if (r0 == 0) goto L27
                    int r5 = r0.length
                    r1 = 0
                Lb:
                    if (r1 >= r5) goto L26
                    r2 = r0[r1]
                    boolean r3 = r2.isDirectory()
                    if (r3 == 0) goto L18
                    r4.deleteContents(r2)
                L18:
                    boolean r3 = r2.delete()
                    if (r3 == 0) goto L21
                    int r1 = r1 + 1
                    goto Lb
                L21:
                    java.lang.String r5 = "failed to delete "
                    j8.o.j(r2, r5)
                L26:
                    return
                L27:
                    java.lang.String r0 = "not a readable directory: "
                    j8.o.j(r5, r0)
                    return
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(java.io.File r1) {
                    r0 = this;
                    r1.getClass()
                    boolean r1 = r1.exists()
                    return r1
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(java.io.File r4, java.io.File r5) {
                    r3 = this;
                    r4.getClass()
                    r5.getClass()
                    r3.delete(r5)
                    boolean r0 = r4.renameTo(r5)
                    if (r0 == 0) goto L10
                    return
                L10:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "failed to rename "
                    r1.<init>(r2)
                    r1.append(r4)
                    java.lang.String r4 = " to "
                    r1.append(r4)
                    r1.append(r5)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Sink sink(java.io.File r5) {
                    r4 = this;
                    r5.getClass()
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    okio.Sink r5 = okio.Okio.sink$default(r5, r2, r1, r0)     // Catch: java.io.FileNotFoundException -> Lb
                    return r5
                Lb:
                    java.io.File r3 = r5.getParentFile()
                    r3.mkdirs()
                    okio.Sink r5 = okio.Okio.sink$default(r5, r2, r1, r0)
                    return r5
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(java.io.File r3) {
                    r2 = this;
                    r3.getClass()
                    long r0 = r3.length()
                    return r0
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Source source(java.io.File r1) {
                    r0 = this;
                    r1.getClass()
                    okio.Source r1 = okio.Okio.source(r1)
                    return r1
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "FileSystem.SYSTEM"
                    return r0
            }
        }

        static {
                okhttp3.internal.io.FileSystem$Companion r0 = new okhttp3.internal.io.FileSystem$Companion
                r0.<init>()
                okhttp3.internal.io.FileSystem.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.io.FileSystem$Companion r0 = okhttp3.internal.io.FileSystem.Companion.$$INSTANCE
            okhttp3.internal.io.FileSystem.Companion = r0
            okhttp3.internal.io.FileSystem$Companion$SystemFileSystem r0 = new okhttp3.internal.io.FileSystem$Companion$SystemFileSystem
            r0.<init>()
            okhttp3.internal.io.FileSystem.SYSTEM = r0
            return
    }

    okio.Sink appendingSink(java.io.File r1);

    void delete(java.io.File r1);

    void deleteContents(java.io.File r1);

    boolean exists(java.io.File r1);

    void rename(java.io.File r1, java.io.File r2);

    okio.Sink sink(java.io.File r1);

    long size(java.io.File r1);

    okio.Source source(java.io.File r1);
}
