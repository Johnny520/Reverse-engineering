package p359;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8921 extends FileFilter, FilenameFilter, PathMatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String[] f25114 = new String[0];

    FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes);

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    InterfaceC8921 and(InterfaceC8921 interfaceC8921);

    default boolean matches(Path path) {
        return accept(path, (BasicFileAttributes) null) != FileVisitResult.TERMINATE;
    }

    InterfaceC8921 negate();
}
