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
import p336.C8800;
import p359.InterfaceC8911;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8922 extends SimpleFileVisitor implements FileVisitor {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25119 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final UnaryOperator f25120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8911 f25121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8924 f25122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final SymbolicLinkFileFilter f25123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8800 f25124 = new C8800(this);

    public C8922(C8923 c8923) {
        this.f25122 = c8923.f25126;
        this.f25123 = c8923.f25125;
        this.f25121 = c8923.f25127;
        this.f25120 = c8923.f25128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8922) {
            return Objects.equals(this.f25122, ((C8922) obj).f25122);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f25122);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        this.f25122.f25130.f25132++;
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResultAccept = this.f25121.accept((Path) obj, basicFileAttributes);
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResultAccept != fileVisitResult ? FileVisitResult.SKIP_SUBTREE : fileVisitResult;
    }

    public final String toString() {
        return this.f25122.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        if (Files.exists(path, new LinkOption[0]) && this.f25123.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE) {
            C8924 c8924 = this.f25122;
            c8924.f25129.f25132++;
            c8924.f25131.f25132 += basicFileAttributes.size();
        }
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return super.visitFileFailed((Path) obj, iOException);
    }
}
