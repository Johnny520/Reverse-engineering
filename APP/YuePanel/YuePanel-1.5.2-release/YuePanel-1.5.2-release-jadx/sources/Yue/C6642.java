package Yue;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
public class C6642 extends C6635 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final Path m21163(String str) {
        C5499.m17103(str, "path");
        Path path = Paths.get(str, new String[0]);
        C5499.m17102(path, "get(path)");
        return path;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final Path m21164(String str, String... strArr) {
        C5499.m17103(str, "base");
        C5499.m17103(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        C5499.m17102(path, "get(base, *subpaths)");
        return path;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final Path m21165(Path path) {
        C5499.m17103(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        C5499.m17102(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String m21166(Path path) {
        C5499.m17103(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final Path m21167(Path path, Path path2, boolean z) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final Path m21168(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        C5499.m17103(copyOptionArr, "options");
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ Path m21169(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final Path m21170(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateDirectories, "createDirectories(this, *attributes)");
        return pathCreateDirectories;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final Path m21171(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateDirectory, "createDirectory(this, *attributes)");
        return pathCreateDirectory;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final Path m21172(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateFile, "createFile(this, *attributes)");
        return pathCreateFile;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final Path m21173(Path path, Path path2) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        Path pathCreateLink = Files.createLink(path, path2);
        C5499.m17102(pathCreateLink, "createLink(this, target)");
        return pathCreateLink;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final Path m21174(@InterfaceC6399 Path path, @InterfaceC6399 FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileAttributeArr, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                C5499.m17102(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length)), "createDirectories(this, *attributes)");
            } catch (FileAlreadyExistsException e) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e;
                }
            }
        }
        return path;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final Path m21175(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return pathCreateSymbolicLink;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final Path m21176(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final Path m21177(@InterfaceC6489 Path path, @InterfaceC6489 String str, @InterfaceC6399 FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(fileAttributeArr, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            C5499.m17102(pathCreateTempDirectory, "createTempDirectory(dire…ory, prefix, *attributes)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempDirectory2, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static /* synthetic */ Path m21178(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ Path m21179(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return m21177(path, str, fileAttributeArr);
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final Path m21180(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final Path m21181(@InterfaceC6489 Path path, @InterfaceC6489 String str, @InterfaceC6489 String str2, @InterfaceC6399 FileAttribute<?>... fileAttributeArr) throws IOException {
        C5499.m17103(fileAttributeArr, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            C5499.m17102(pathCreateTempFile, "createTempFile(directory…fix, suffix, *attributes)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempFile2, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ Path m21182(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        C5499.m17103(fileAttributeArr, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C5499.m17102(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static /* synthetic */ Path m21183(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return m21181(path, str, str2, fileAttributeArr);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final void m21184(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        Files.delete(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final boolean m21185(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final Path m21186(Path path, String str) {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "other");
        Path pathResolve = path.resolve(str);
        C5499.m17102(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final Path m21187(Path path, Path path2) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "other");
        Path pathResolve = path.resolve(path2);
        C5499.m17102(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final boolean m21188(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final Void m21189(@InterfaceC6399 Path path, @InterfaceC6399 Class<?> cls) {
        C5499.m17103(path, "path");
        C5499.m17103(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ <V extends FileAttributeView> V m21190(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        C5499.m17112(4, C4750.f10496);
        V v = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v != null) {
            return v;
        }
        C5499.m17112(4, C4750.f10496);
        m21189(path, FileAttributeView.class);
        throw new C5667();
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final /* synthetic */ <V extends FileAttributeView> V m21191(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        C5499.m17112(4, C4750.f10496);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final long m21192(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        return Files.size(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final FileStore m21193(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        C5499.m17102(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.7")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final FileVisitor<Path> m21194(@InterfaceC6399 InterfaceC5124<? super InterfaceC4831, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        C4832 c4832 = new C4832();
        interfaceC5124.invoke(c4832);
        return c4832.m14702();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final void m21195(Path path, String str, InterfaceC5124<? super Path, C8107> interfaceC5124) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "glob");
        C5499.m17103(interfaceC5124, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            C5499.m17102(directoryStreamNewDirectoryStream, "it");
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                interfaceC5124.invoke(it.next());
            }
            C8107 c8107 = C8107.f3222;
            C5437.m16930(1);
            C3849.m904(directoryStreamNewDirectoryStream, null);
            C5437.m16929(1);
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static /* synthetic */ void m21196(Path path, String str, InterfaceC5124 interfaceC5124, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = InterfaceC5949.f14892;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "glob");
        C5499.m17103(interfaceC5124, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            C5499.m17102(directoryStreamNewDirectoryStream, "it");
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                interfaceC5124.invoke(it.next());
            }
            C8107 c8107 = C8107.f3222;
            C5437.m16930(1);
            C3849.m904(directoryStreamNewDirectoryStream, null);
            C5437.m16929(1);
        } finally {
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final Object m21197(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "attribute");
        C5499.m17103(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final String m21198(@InterfaceC6399 Path path) {
        String string;
        String strM24160;
        C5499.m17103(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strM24160 = C7628.m24160(string, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "")) == null) ? "" : strM24160;
    }

    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ void m21199(Path path) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String m21200(Path path) {
        C5499.m17103(path, "<this>");
        return m21202(path);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @InterfaceC7097(expression = "invariantSeparatorsPathString", imports = {}))
    @InterfaceC7470(version = "1.4")
    @InterfaceC5438
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m21201(Path path) {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final String m21202(@InterfaceC6399 Path path) {
        C5499.m17103(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (C5499.m17094(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        C5499.m17102(separator, "separator");
        return C7627.m23998(string, separator, "/", false, 4, null);
    }

    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ void m21203(Path path) {
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final FileTime m21204(Path path, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C5499.m17102(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final String m21205(@InterfaceC6399 Path path) {
        C5499.m17103(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m21206(Path path) {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final String m21207(@InterfaceC6399 Path path) {
        String string;
        String strM24171;
        C5499.m17103(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strM24171 = C7628.m24171(string, ".", null, 2, null)) == null) ? "" : strM24171;
    }

    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static /* synthetic */ void m21208(Path path) {
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final UserPrincipal m21209(Path path, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final String m21210(Path path) {
        C5499.m17103(path, "<this>");
        return path.toString();
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static /* synthetic */ void m21211(Path path) {
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final Set<PosixFilePermission> m21212(Path path, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C5499.m17102(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final boolean m21213(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final boolean m21214(Path path) {
        C5499.m17103(path, "<this>");
        return Files.isExecutable(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final boolean m21215(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        return Files.isHidden(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final boolean m21216(Path path) {
        C5499.m17103(path, "<this>");
        return Files.isReadable(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final boolean m21217(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final boolean m21218(Path path, Path path2) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final boolean m21219(Path path) {
        C5499.m17103(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final boolean m21220(Path path) {
        C5499.m17103(path, "<this>");
        return Files.isWritable(path);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final List<Path> m21221(@InterfaceC6399 Path path, @InterfaceC6399 String str) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            C5499.m17102(directoryStreamNewDirectoryStream, "it");
            List<Path> listM11062 = C3888.m11062(directoryStreamNewDirectoryStream);
            C3849.m904(directoryStreamNewDirectoryStream, null);
            return listM11062;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static /* synthetic */ List m21222(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = InterfaceC5949.f14892;
        }
        return m21221(path, str);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final Path m21223(Path path, Path path2, boolean z) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final Path m21224(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        C5499.m17103(copyOptionArr, "options");
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static /* synthetic */ Path m21225(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C5499.m17102(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final boolean m21226(Path path, LinkOption... linkOptionArr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <A extends BasicFileAttributes> A m21227(Path path, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(linkOptionArr, "options");
        C5499.m17112(4, C4750.f10495);
        A a = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C5499.m17102(a, "readAttributes(this, A::class.java, *options)");
        return a;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final Map<String, Object> m21228(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "attributes");
        C5499.m17103(linkOptionArr, "options");
        Map<String, Object> attributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C5499.m17102(attributes, "readAttributes(this, attributes, *options)");
        return attributes;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final Path m21229(Path path) throws IOException {
        C5499.m17103(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        C5499.m17102(symbolicLink, "readSymbolicLink(this)");
        return symbolicLink;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final Path m21230(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "base");
        try {
            return C6627.f2193.m3107(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final Path m21231(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "base");
        try {
            return C6627.f2193.m3107(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final Path m21232(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "base");
        Path pathM21231 = m21231(path, path2);
        return pathM21231 == null ? path : pathM21231;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final Path m21233(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "attribute");
        C5499.m17103(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C5499.m17102(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final Path m21234(Path path, FileTime fileTime) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        C5499.m17102(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final Path m21235(Path path, UserPrincipal userPrincipal) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        C5499.m17102(owner, "setOwner(this, value)");
        return owner;
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final Path m21236(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        C5499.m17102(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final Path m21237(URI uri) {
        C5499.m17103(uri, "<this>");
        Path path = Paths.get(uri);
        C5499.m17102(path, "get(this)");
        return path;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC7470(version = "1.5")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4771.class})
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <T> T m21238(Path path, String str, InterfaceC5124<? super InterfaceC7326<? extends Path>, ? extends T> interfaceC5124) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "glob");
        C5499.m17103(interfaceC5124, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            C5499.m17102(directoryStreamNewDirectoryStream, "it");
            T tInvoke = interfaceC5124.invoke(C3888.m10833(directoryStreamNewDirectoryStream));
            C5437.m16930(1);
            C3849.m904(directoryStreamNewDirectoryStream, null);
            C5437.m16929(1);
            return tInvoke;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ Object m21239(Path path, String str, InterfaceC5124 interfaceC5124, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = InterfaceC5949.f14892;
        }
        C5499.m17103(path, "<this>");
        C5499.m17103(str, "glob");
        C5499.m17103(interfaceC5124, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            C5499.m17102(directoryStreamNewDirectoryStream, "it");
            Object objInvoke = interfaceC5124.invoke(C3888.m10833(directoryStreamNewDirectoryStream));
            C5437.m16930(1);
            C3849.m904(directoryStreamNewDirectoryStream, null);
            C5437.m16929(1);
            return objInvoke;
        } finally {
        }
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final void m21240(@InterfaceC6399 Path path, int i, boolean z, @InterfaceC6399 InterfaceC5124<? super InterfaceC4831, C8107> interfaceC5124) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(interfaceC5124, "builderAction");
        m21241(path, m21194(interfaceC5124), i, z);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final void m21241(@InterfaceC6399 Path path, @InterfaceC6399 FileVisitor<Path> fileVisitor, int i, boolean z) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(fileVisitor, "visitor");
        Files.walkFileTree(path, z ? C7386.m23120(FileVisitOption.FOLLOW_LINKS) : C7387.m23125(), i, fileVisitor);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m21242(Path path, int i, boolean z, InterfaceC5124 interfaceC5124, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        m21240(path, i, z, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m21243(Path path, FileVisitor fileVisitor, int i, boolean z, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        m21241(path, fileVisitor, i, z);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.7")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final InterfaceC7326<Path> m21244(@InterfaceC6399 Path path, @InterfaceC6399 EnumC6632... enumC6632Arr) {
        C5499.m17103(path, "<this>");
        C5499.m17103(enumC6632Arr, "options");
        return new C6629(path, enumC6632Arr);
    }
}
