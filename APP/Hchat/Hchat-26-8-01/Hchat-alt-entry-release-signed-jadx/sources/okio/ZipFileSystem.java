package okio;

import ac.AbstractC0063p;
import gg.AbstractC1411g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import tf.AbstractC4166m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map<Path, ZipEntry> entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZipFileSystem(Path path, FileSystem fileSystem, Map<Path, ZipEntry> map, String str) {
        path.getClass();
        fileSystem.getClass();
        map.getClass();
        this.zipPath = path;
        this.fileSystem = fileSystem;
        this.entries = map;
        this.comment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<Path> list(Path path, boolean z9) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return AbstractC4166m.m8407P1(zipEntry.getChildren());
        }
        if (!z9) {
            return null;
        }
        C2104o.m5299y(AbstractC2091b.m5166m(path, "not a directory: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws FileNotFoundException {
        path.getClass();
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void delete(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        path.getClass();
        return list(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0051, B:33:0x0081, B:39:0x008d, B:28:0x0076, B:24:0x0070, B:14:0x005d), top: B:58:0x0051, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0051, B:33:0x0081, B:39:0x008d, B:28:0x0076, B:24:0x0070, B:14:0x005d), top: B:58:0x0051, inners: #1, #5 }] */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileMetadata metadataOrNull(Path path) throws Throwable {
        FileMetadata localHeader;
        Throwable th2;
        path.getClass();
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        Throwable th3 = null;
        if (zipEntry == null) {
            return null;
        }
        FileMetadata fileMetadata = new FileMetadata(!zipEntry.isDirectory(), zipEntry.isDirectory(), null, zipEntry.isDirectory() ? null : Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
        if (zipEntry.getOffset() == -1) {
            return fileMetadata;
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            try {
                localHeader = ZipFilesKt.readLocalHeader(bufferedSourceBuffer, fileMetadata);
            } catch (Throwable th4) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th5) {
                        AbstractC0063p.m412e(th4, th5);
                    }
                }
                th2 = th4;
                localHeader = null;
            }
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                    th2 = null;
                } catch (Throwable th6) {
                    th2 = th6;
                }
                if (th2 == null) {
                    throw th2;
                }
                localHeader.getClass();
                if (fileHandleOpenReadOnly != null) {
                    try {
                        fileHandleOpenReadOnly.close();
                    } catch (Throwable th7) {
                        th3 = th7;
                    }
                }
            } else {
                th2 = null;
                if (th2 == null) {
                }
            }
        } catch (Throwable th8) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th9) {
                    AbstractC0063p.m412e(th8, th9);
                }
            }
            localHeader = null;
            th3 = th8;
        }
        if (th3 != null) {
            throw th3;
        }
        localHeader.getClass();
        return localHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) {
        path.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z9, boolean z10) throws IOException {
        path.getClass();
        throw new IOException("zip entries are not writable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Source source(Path path) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        path.getClass();
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry == null) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th2 = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    AbstractC0063p.m412e(th4, th5);
                }
            }
            bufferedSourceBuffer = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        bufferedSourceBuffer.getClass();
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.ZipFileSystem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }

        private Companion() {
        }
    }

    @Override // okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        path.getClass();
        List<Path> list = list(path, true);
        list.getClass();
        return list;
    }
}
