package okio;

import gg.AbstractC1417m;
import gg.AbstractC1426v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC3015m;
import ng.InterfaceC3012j;
import p085fg.InterfaceC1231l;
import tf.AbstractC4170q;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* JADX INFO: renamed from: okio.ForwardingFileSystem$listRecursively$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31861 extends AbstractC1417m implements InterfaceC1231l {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31861() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1231l
        public final Path invoke(Path path) {
            path.getClass();
            return ForwardingFileSystem.this.onPathResult(path, "listRecursively");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ForwardingFileSystem(FileSystem fileSystem) {
        fileSystem.getClass();
        this.delegate = fileSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z9) {
        path.getClass();
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", "file"), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", "target"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        path.getClass();
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z9) {
        path.getClass();
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", "target"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileSystem delegate() {
        return this.delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void delete(Path path, boolean z9) {
        path.getClass();
        this.delegate.delete(onPathParameter(path, "delete", "path"), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> list(Path path) {
        path.getClass();
        List<Path> list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        AbstractC4170q.m8430f1(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        path.getClass();
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        AbstractC4170q.m8430f1(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public InterfaceC3012j listRecursively(Path path, boolean z9) {
        path.getClass();
        return AbstractC3015m.m6413W(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z9), new C31861());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        path.getClass();
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path onPathParameter(Path path, String str, String str2) {
        path.getClass();
        str.getClass();
        str2.getClass();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path onPathResult(Path path, String str) {
        path.getClass();
        str.getClass();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) {
        path.getClass();
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", "file"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z9, boolean z10) {
        path.getClass();
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", "file"), z9, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z9) {
        path.getClass();
        return this.delegate.sink(onPathParameter(path, "sink", "file"), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Source source(Path path) {
        path.getClass();
        return this.delegate.source(onPathParameter(path, "source", "file"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return AbstractC1426v.m3834a(getClass()).m3820c() + '(' + this.delegate + ')';
    }
}
