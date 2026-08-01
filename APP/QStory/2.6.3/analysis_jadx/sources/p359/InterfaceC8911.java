package p359;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8911 extends FileFilter, FilenameFilter, PathMatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String[] f25103 = new String[0];

    FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes);

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    InterfaceC8911 and(InterfaceC8911 interfaceC8911);

    default boolean matches(Path path) {
        return accept(path, (BasicFileAttributes) null) != FileVisitResult.TERMINATE;
    }

    InterfaceC8911 negate();
}
