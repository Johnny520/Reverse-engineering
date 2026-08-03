package okio.internal;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.C3962i;
import p276sf.InterfaceC3956c;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final InterfaceC3956c roots$delegate;
    private final FileSystem systemFileSystem;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ResourceFileSystem(ClassLoader classLoader, boolean z9, FileSystem fileSystem) {
        classLoader.getClass();
        fileSystem.getClass();
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots$delegate = new C3962i(new ResourceFileSystem$roots$2(this));
        if (z9) {
            getRoots().size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<C3958e> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final List<C3958e> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources(HttpUrl.FRAGMENT_ENCODE_SET);
        resources.getClass();
        ArrayList<URL> list = Collections.list(resources);
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            url.getClass();
            C3958e fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        resources2.getClass();
        ArrayList<URL> list2 = Collections.list(resources2);
        list2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            url2.getClass();
            C3958e jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return AbstractC4166m.m8397F1(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C3958e toFileRoot(URL url) {
        if (AbstractC1416l.m3825a(url.getProtocol(), "file")) {
            return new C3958e(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C3958e toJarRoot(URL url) {
        int iM6723v0;
        String string = url.toString();
        string.getClass();
        if (AbstractC3156t.m6740d0(string, "jar:file:", false) && (iM6723v0 = AbstractC3149m.m6723v0(6, string, "!")) != -1) {
            return new C3958e(ZipFilesKt.openZip(Path.Companion.get$default(Path.Companion, new File(URI.create(string.substring(4, iM6723v0))), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        path.getClass();
        return canonicalizeInternal(path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public void delete(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> list(Path path) throws FileNotFoundException {
        path.getClass();
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z9 = false;
        for (C3958e c3958e : getRoots()) {
            FileSystem fileSystem = (FileSystem) c3958e.f12961g;
            Path path2 = (Path) c3958e.f12962h;
            try {
                List<Path> list = fileSystem.list(path2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path2));
                }
                AbstractC4171r.m8432h1(linkedHashSet, arrayList2);
                z9 = true;
            } catch (IOException unused) {
            }
        }
        if (z9) {
            return AbstractC4166m.m8407P1(linkedHashSet);
        }
        throw new FileNotFoundException(AbstractC2091b.m5166m(path, "file not found: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        path.getClass();
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C3958e> it = getRoots().iterator();
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C3958e next = it.next();
            FileSystem fileSystem = (FileSystem) next.f12961g;
            Path path2 = (Path) next.f12962h;
            List<Path> listListOrNull = fileSystem.listOrNull(path2.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                AbstractC4171r.m8432h1(linkedHashSet, arrayList);
                z9 = true;
            }
        }
        if (z9) {
            return AbstractC4166m.m8407P1(linkedHashSet);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        path.getClass();
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (C3958e c3958e : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) c3958e.f12961g).metadataOrNull(((Path) c3958e.f12962h).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) throws FileNotFoundException {
        path.getClass();
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "file not found: "));
        }
        String relativePath = toRelativePath(path);
        for (C3958e c3958e : getRoots()) {
            try {
                return ((FileSystem) c3958e.f12961g).openReadOnly(((Path) c3958e.f12962h).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(AbstractC2091b.m5166m(path, "file not found: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z9, boolean z10) throws IOException {
        path.getClass();
        throw new IOException("resources are not writable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z9) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileSystem
    public Source source(Path path) throws FileNotFoundException {
        Source source;
        path.getClass();
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "file not found: "));
        }
        Path path2 = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path2, path, false, 2, (Object) null).relativeTo(path2).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(AbstractC2091b.m5166m(path, "file not found: "));
        }
        return source;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.internal.ResourceFileSystem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !AbstractC3156t.m6733W(path.name(), ".class", true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Path removeBase(Path path, Path path2) {
            path.getClass();
            path2.getClass();
            String string = path2.toString();
            Path root = getROOT();
            String strReplace = AbstractC3149m.m6686A0(path.toString(), string).replace('\\', '/');
            strReplace.getClass();
            return root.resolve(strReplace);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.ClassLoader)
  (r2v0 boolean)
  (wrap:okio.FileSystem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:okio.FileSystem:0x0004: SGET  A[WRAPPED] (LINE:36) okio.FileSystem.SYSTEM okio.FileSystem) : (r3v0 okio.FileSystem))
 A[MD:(java.lang.ClassLoader, boolean, okio.FileSystem):void (m)] (LINE:37) call: okio.internal.ResourceFileSystem.<init>(java.lang.ClassLoader, boolean, okio.FileSystem):void type: THIS */
    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z9, FileSystem fileSystem, int i9, AbstractC1411g abstractC1411g) {
        this(classLoader, z9, (i9 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }
}
