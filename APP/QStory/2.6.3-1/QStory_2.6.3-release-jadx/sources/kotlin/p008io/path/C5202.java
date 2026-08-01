package kotlin.p008io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: kotlin.io.path.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5202 extends SimpleFileVisitor {
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        ((Path) obj).getClass();
        basicFileAttributes.getClass();
        basicFileAttributes.fileKey();
        throw null;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        ((Path) obj).getClass();
        basicFileAttributes.getClass();
        throw null;
    }
}
