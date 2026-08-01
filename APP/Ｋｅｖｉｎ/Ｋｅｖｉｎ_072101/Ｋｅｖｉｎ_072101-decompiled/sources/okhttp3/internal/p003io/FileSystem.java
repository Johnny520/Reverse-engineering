package okhttp3.internal.p003io;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, m115d2 = {"Lokhttp3/internal/io/FileSystem;", "", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", "", "deleteContents", "directory", "exists", "", "rename", "from", "to", "sink", "size", "", "source", "Lokio/Source;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public interface FileSystem {
    public static final okhttp3.internal.io.FileSystem.Companion Companion = null;
    public static final okhttp3.internal.p003io.FileSystem SYSTEM = null;

    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m115d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.io.FileSystem.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: FileSystem.kt */
        @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m115d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", "", "deleteContents", "directory", "exists", "", "rename", "from", "to", "sink", "size", "", "source", "Lokio/Source;", "toString", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
        private static final class SystemFileSystem implements okhttp3.internal.p003io.FileSystem {
            public SystemFileSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public okio.Sink appendingSink(java.io.File r3) throws java.io.FileNotFoundException {
                    r2 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    okio.Sink r0 = okio.Okio.appendingSink(r3)     // Catch: java.io.FileNotFoundException -> Lb
                    goto L18
                Lb:
                    r0 = move-exception
                    java.io.File r1 = r3.getParentFile()
                    r1.mkdirs()
                    okio.Sink r1 = okio.Okio.appendingSink(r3)
                    r0 = r1
                L18:
                    return r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public void delete(java.io.File r4) throws java.io.IOException {
                    r3 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    boolean r0 = r4.delete()
                    if (r0 != 0) goto L2b
                    boolean r0 = r4.exists()
                    if (r0 != 0) goto L12
                    goto L2b
                L12:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "failed to delete "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L2b:
                    return
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public void deleteContents(java.io.File r6) throws java.io.IOException {
                    r5 = this;
                    java.lang.String r0 = "directory"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    java.io.File[] r0 = r6.listFiles()
                    if (r0 == 0) goto L42
                    int r1 = r0.length
                    r2 = 0
                Ld:
                    if (r2 >= r1) goto L41
                    r3 = r0[r2]
                    boolean r4 = r3.isDirectory()
                    if (r4 == 0) goto L1f
                    java.lang.String r4 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                    r5.deleteContents(r3)
                L1f:
                    boolean r4 = r3.delete()
                    if (r4 == 0) goto L28
                    int r2 = r2 + 1
                    goto Ld
                L28:
                    java.io.IOException r1 = new java.io.IOException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "failed to delete "
                    java.lang.StringBuilder r2 = r2.append(r4)
                    java.lang.StringBuilder r2 = r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
                L41:
                    return
                L42:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "not a readable directory: "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public boolean exists(java.io.File r2) {
                    r1 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r2.exists()
                    return r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public void rename(java.io.File r4, java.io.File r5) throws java.io.IOException {
                    r3 = this;
                    java.lang.String r0 = "from"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "to"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    r3.delete(r5)
                    boolean r0 = r4.renameTo(r5)
                    if (r0 == 0) goto L14
                    return
                L14:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "failed to rename "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r2 = " to "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r5)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public okio.Sink sink(java.io.File r6) throws java.io.FileNotFoundException {
                    r5 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    okio.Sink r0 = okio.Okio.sink$default(r6, r2, r1, r0)     // Catch: java.io.FileNotFoundException -> Le
                    goto L1a
                Le:
                    r3 = move-exception
                    java.io.File r4 = r6.getParentFile()
                    r4.mkdirs()
                    okio.Sink r0 = okio.Okio.sink$default(r6, r2, r1, r0)
                L1a:
                    return r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public long size(java.io.File r3) {
                    r2 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    long r0 = r3.length()
                    return r0
            }

            @Override // okhttp3.internal.p003io.FileSystem
            public okio.Source source(java.io.File r2) throws java.io.FileNotFoundException {
                    r1 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    okio.Source r0 = okio.Okio.source(r2)
                    return r0
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
            okhttp3.internal.p003io.FileSystem.Companion = r0
            okhttp3.internal.io.FileSystem$Companion$SystemFileSystem r0 = new okhttp3.internal.io.FileSystem$Companion$SystemFileSystem
            r0.<init>()
            okhttp3.internal.io.FileSystem r0 = (okhttp3.internal.p003io.FileSystem) r0
            okhttp3.internal.p003io.FileSystem.SYSTEM = r0
            return
    }

    okio.Sink appendingSink(java.io.File r1) throws java.io.FileNotFoundException;

    void delete(java.io.File r1) throws java.io.IOException;

    void deleteContents(java.io.File r1) throws java.io.IOException;

    boolean exists(java.io.File r1);

    void rename(java.io.File r1, java.io.File r2) throws java.io.IOException;

    okio.Sink sink(java.io.File r1) throws java.io.FileNotFoundException;

    long size(java.io.File r1);

    okio.Source source(java.io.File r1) throws java.io.FileNotFoundException;
}
