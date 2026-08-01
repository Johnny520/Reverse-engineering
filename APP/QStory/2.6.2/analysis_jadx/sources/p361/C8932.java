package p361;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.UnaryOperator;
import org.apache.commons.io.filefilter.SymbolicLinkFileFilter;
import p330.C8791;
import p359.InterfaceC8921;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8932 extends SimpleFileVisitor implements FileVisitor {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25130 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final UnaryOperator f25131;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8921 f25132;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8934 f25133;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final SymbolicLinkFileFilter f25134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8791 f25135 = new C8791(this);

    public C8932(C8933 c8933) {
        this.f25133 = c8933.f25138;
        this.f25134 = c8933.f25139;
        this.f25132 = c8933.f25137;
        this.f25131 = c8933.f25136;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8932) {
            return Objects.equals(this.f25133, ((C8932) obj).f25133);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f25133);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        this.f25133.f25141.f25143++;
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResultAccept = this.f25132.accept((Path) obj, basicFileAttributes);
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResultAccept != fileVisitResult ? FileVisitResult.SKIP_SUBTREE : fileVisitResult;
    }

    public final String toString() {
        return this.f25133.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        if (Files.exists(path, new LinkOption[0]) && this.f25134.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE) {
            C8934 c8934 = this.f25133;
            c8934.f25140.f25143++;
            c8934.f25142.f25143 += basicFileAttributes.size();
        }
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return super.visitFileFailed((Path) obj, iOException);
    }
}
