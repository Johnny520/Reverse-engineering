package p375;

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
public interface InterfaceC9740 extends FileFilter, FilenameFilter, PathMatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String[] f25448 = new String[0];

    FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes);

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    InterfaceC9740 and(InterfaceC9740 interfaceC9740);

    default boolean matches(Path path) {
        return accept(path, (BasicFileAttributes) null) != FileVisitResult.TERMINATE;
    }

    InterfaceC9740 negate();
}
