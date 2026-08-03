package okio;

import ac.AbstractC0063p;
import gg.AbstractC1411g;
import java.util.List;
import ng.InterfaceC3012j;
import okio.Path;
import okio.internal.ResourceFileSystem;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m11074write$default(FileSystem fileSystem, Path path, boolean z9, InterfaceC1231l interfaceC1231l, int i9, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        path.getClass();
        interfaceC1231l.getClass();
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z9));
        Throwable th2 = null;
        try {
            objInvoke = interfaceC1231l.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    AbstractC0063p.m412e(th4, th5);
                }
            }
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return fileSystem.appendingSink(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        fileSystem.createDirectories(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        fileSystem.createDirectory(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        fileSystem.delete(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        fileSystem.deleteRecursively(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InterfaceC3012j listRecursively$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return fileSystem.listRecursively(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z9, boolean z10, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        if ((i9 & 4) != 0) {
            z10 = false;
        }
        return fileSystem.openReadWrite(path, z9, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return fileSystem.sink(path, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m11075read(Path path, InterfaceC1231l interfaceC1231l) throws Throwable {
        T t9;
        path.getClass();
        interfaceC1231l.getClass();
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(path));
        Throwable th2 = null;
        try {
            t9 = (T) interfaceC1231l.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    AbstractC0063p.m412e(th4, th5);
                }
            }
            th2 = th4;
            t9 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        t9.getClass();
        return t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m11076write(Path path, boolean z9, InterfaceC1231l interfaceC1231l) throws Throwable {
        T t9;
        path.getClass();
        interfaceC1231l.getClass();
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(path, z9));
        Throwable th2 = null;
        try {
            t9 = (T) interfaceC1231l.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    AbstractC0063p.m412e(th4, th5);
                }
            }
            t9 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        t9.getClass();
        return t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink appendingSink(Path path) {
        path.getClass();
        return appendingSink(path, false);
    }

    public abstract Sink appendingSink(Path path, boolean z9);

    public abstract void atomicMove(Path path, Path path2);

    public abstract Path canonicalize(Path path);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void copy(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        okio.internal.FileSystem.commonCopy(this, path, path2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void createDirectories(Path path) {
        path.getClass();
        createDirectories(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void createDirectory(Path path) {
        path.getClass();
        createDirectory(path, false);
    }

    public abstract void createDirectory(Path path, boolean z9);

    public abstract void createSymlink(Path path, Path path2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void delete(Path path) {
        path.getClass();
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void deleteRecursively(Path path) {
        path.getClass();
        deleteRecursively(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean exists(Path path) {
        path.getClass();
        return okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path);

    public abstract List<Path> listOrNull(Path path);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC3012j listRecursively(Path path) {
        path.getClass();
        return listRecursively(path, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileMetadata metadata(Path path) {
        path.getClass();
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path);

    public abstract FileHandle openReadOnly(Path path);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileHandle openReadWrite(Path path) {
        path.getClass();
        return openReadWrite(path, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z9, boolean z10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink sink(Path path) {
        path.getClass();
        return sink(path, false);
    }

    public abstract Sink sink(Path path, boolean z9);

    public abstract Source source(Path path);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.FileSystem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            fileSystem.getClass();
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    public final void createDirectories(Path path, boolean z9) {
        path.getClass();
        okio.internal.FileSystem.commonCreateDirectories(this, path, z9);
    }

    public void deleteRecursively(Path path, boolean z9) {
        path.getClass();
        okio.internal.FileSystem.commonDeleteRecursively(this, path, z9);
    }

    public InterfaceC3012j listRecursively(Path path, boolean z9) {
        path.getClass();
        return okio.internal.FileSystem.commonListRecursively(this, path, z9);
    }
}
