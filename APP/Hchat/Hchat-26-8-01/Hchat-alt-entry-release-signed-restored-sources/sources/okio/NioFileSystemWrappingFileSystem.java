package okio;

import gg.AbstractC1426v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okio.Path;
import p000a.AbstractC0000a;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.AbstractC4170q;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem fileSystem) {
        fileSystem.getClass();
        this.nioFileSystem = fileSystem;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final List<Path> list(Path path, boolean z9) throws IOException {
        java.nio.file.Path pathResolve = resolve(path);
        try {
            pathResolve.getClass();
            DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(pathResolve, "*");
            try {
                directoryStreamNewDirectoryStream.getClass();
                List listM8407P1 = AbstractC4166m.m8407P1(directoryStreamNewDirectoryStream);
                AbstractC2043a.m5035i(directoryStreamNewDirectoryStream, null);
                ArrayList arrayList = new ArrayList();
                Iterator it = listM8407P1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Path.Companion.get$default(Path.Companion, (java.nio.file.Path) it.next(), false, 1, (Object) null));
                }
                AbstractC4170q.m8430f1(arrayList);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            if (!z9) {
                return null;
            }
            if (!Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
            }
            C2104o.m5299y(AbstractC2091b.m5166m(path, "failed to list "));
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final java.nio.file.Path resolve(Path path) {
        java.nio.file.Path path2 = this.nioFileSystem.getPath(path.toString(), new String[0]);
        path2.getClass();
        return path2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public Sink appendingSink(Path path, boolean z9) throws IOException {
        path.getClass();
        C4329c c4329cM7E = AbstractC0000a.m7E();
        c4329cM7E.add(StandardOpenOption.APPEND);
        if (!z9) {
            c4329cM7E.add(StandardOpenOption.CREATE);
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        java.nio.file.Path pathResolve = resolve(path);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) c4329cM90t.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return Okio.sink(outputStreamNewOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        try {
            Files.move(resolve(path), resolve(path2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            C2104o.m5299y("atomic move not supported");
        } catch (NoSuchFileException e6) {
            throw new FileNotFoundException(e6.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        path.getClass();
        try {
            Path.Companion companion = Path.Companion;
            java.nio.file.Path realPath = resolve(path).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return Path.Companion.get$default(companion, realPath, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createDirectory(Path path, boolean z9) throws IOException {
        boolean z10;
        path.getClass();
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            z10 = fileMetadataMetadataOrNull.isDirectory();
        }
        if (z10 && z9) {
            C2104o.m5283h(path, " already exists.");
            return;
        }
        try {
            Files.createDirectory(resolve(path), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
        } catch (IOException e6) {
            if (!z10) {
                throw new IOException(AbstractC2091b.m5166m(path, "failed to create directory: "), e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        Files.createSymbolicLink(resolve(path), resolve(path2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(Path path, boolean z9) throws IOException {
        path.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        java.nio.file.Path pathResolve = resolve(path);
        try {
            Files.delete(pathResolve);
        } catch (NoSuchFileException unused) {
            if (z9) {
                throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                C2104o.m5299y(AbstractC2091b.m5166m(path, "failed to delete "));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public List<Path> listOrNull(Path path) {
        path.getClass();
        return list(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        path.getClass();
        return metadataOrNull(resolve(path));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public FileHandle openReadOnly(Path path) throws IOException {
        path.getClass();
        try {
            FileChannel fileChannelOpen = FileChannel.open(resolve(path), StandardOpenOption.READ);
            fileChannelOpen.getClass();
            return new NioFileSystemFileHandle(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z9, boolean z10) throws IOException {
        path.getClass();
        if (z9 && z10) {
            C2104o.m5294t("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        c4329cM7E.add(StandardOpenOption.READ);
        c4329cM7E.add(StandardOpenOption.WRITE);
        if (z9) {
            c4329cM7E.add(StandardOpenOption.CREATE_NEW);
        } else if (!z10) {
            c4329cM7E.add(StandardOpenOption.CREATE);
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        try {
            java.nio.file.Path pathResolve = resolve(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) c4329cM90t.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathResolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            fileChannelOpen.getClass();
            return new NioFileSystemFileHandle(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public Sink sink(Path path, boolean z9) throws IOException {
        path.getClass();
        C4329c c4329cM7E = AbstractC0000a.m7E();
        if (z9) {
            c4329cM7E.add(StandardOpenOption.CREATE_NEW);
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        try {
            java.nio.file.Path pathResolve = resolve(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) c4329cM90t.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            outputStreamNewOutputStream.getClass();
            return Okio.sink(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public Source source(Path path) throws IOException {
        path.getClass();
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(resolve(path), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            inputStreamNewInputStream.getClass();
            return Okio.source(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public String toString() {
        String strM3820c = AbstractC1426v.m3834a(this.nioFileSystem.getClass()).m3820c();
        strM3820c.getClass();
        return strM3820c;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        path.getClass();
        List<Path> list = list(path, true);
        list.getClass();
        return list;
    }
}
