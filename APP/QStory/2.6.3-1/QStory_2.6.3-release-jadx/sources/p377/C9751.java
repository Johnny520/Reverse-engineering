package p377;

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
import org.apache.commons.p014io.filefilter.SymbolicLinkFileFilter;
import p352.C9629;
import p375.InterfaceC9740;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9751 extends SimpleFileVisitor implements FileVisitor {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25464 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final UnaryOperator f25465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC9740 f25466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9753 f25467;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final SymbolicLinkFileFilter f25468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9629 f25469 = new C9629(this);

    public C9751(C9752 c9752) {
        this.f25467 = c9752.f25471;
        this.f25468 = c9752.f25470;
        this.f25466 = c9752.f25472;
        this.f25465 = c9752.f25473;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9751) {
            return Objects.equals(this.f25467, ((C9751) obj).f25467);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f25467);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        this.f25467.f25475.f25477++;
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResultAccept = this.f25466.accept((Path) obj, basicFileAttributes);
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResultAccept != fileVisitResult ? FileVisitResult.SKIP_SUBTREE : fileVisitResult;
    }

    public final String toString() {
        return this.f25467.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        if (Files.exists(path, new LinkOption[0]) && this.f25468.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE) {
            C9753 c9753 = this.f25467;
            c9753.f25474.f25477++;
            c9753.f25476.f25477 += basicFileAttributes.size();
        }
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return super.visitFileFailed((Path) obj, iOException);
    }
}
