package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.Path;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import tf.AbstractC4170q;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JvmSystemFileSystem extends FileSystem {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<Path> list(Path path, boolean z9) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z9) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
            }
            C2104o.m5299y(AbstractC2091b.m5166m(path, "failed to list "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(path.resolve(str));
        }
        AbstractC4170q.m8430f1(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void requireCreate(Path path) throws IOException {
        if (exists(path)) {
            C2104o.m5283h(path, " already exists.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void requireExist(Path path) throws IOException {
        if (exists(path)) {
            return;
        }
        C2104o.m5283h(path, " doesn't exist.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z9) throws IOException {
        path.getClass();
        if (z9) {
            requireExist(path);
        }
        return Okio.sink(path.toFile(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        path.getClass();
        File canonicalFile = path.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            return Path.Companion.get$default(Path.Companion, canonicalFile, false, 1, (Object) null);
        }
        throw new FileNotFoundException("no such file");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z9) throws IOException {
        path.getClass();
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(path);
        if (fileMetadataMetadataOrNull == null || !fileMetadataMetadataOrNull.isDirectory()) {
            C2104o.m5299y(AbstractC2091b.m5166m(path, "failed to create directory: "));
        } else if (z9) {
            C2104o.m5283h(path, " already exists.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void delete(Path path, boolean z9) throws IOException {
        path.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            C2104o.m5299y(AbstractC2091b.m5166m(path, "failed to delete "));
        } else if (z9) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        path.getClass();
        return list(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        path.getClass();
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) {
        path.getClass();
        return new JvmFileHandle(false, new RandomAccessFile(path.toFile(), "r"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z9, boolean z10) throws IOException {
        path.getClass();
        if (z9 && z10) {
            C2104o.m5294t("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        if (z9) {
            requireCreate(path);
        }
        if (z10) {
            requireExist(path);
        }
        return new JvmFileHandle(true, new RandomAccessFile(path.toFile(), "rw"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z9) throws IOException {
        path.getClass();
        if (z9) {
            requireCreate(path);
        }
        return Okio__JvmOkioKt.sink$default(path.toFile(), false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Source source(Path path) {
        path.getClass();
        return Okio.source(path.toFile());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        path.getClass();
        List<Path> list = list(path, true);
        list.getClass();
        return list;
    }
}
