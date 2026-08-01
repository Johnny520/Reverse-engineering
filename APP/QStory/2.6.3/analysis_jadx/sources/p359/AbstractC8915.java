package p359;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import p358.InterfaceC8905;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8915 implements InterfaceC8911, FileVisitor {
    private final FileVisitResult onAccept;
    private final FileVisitResult onReject;

    public AbstractC8915() {
        this(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    public static FileVisitResult toDefaultFileVisitResult(boolean z) {
        return z ? FileVisitResult.CONTINUE : FileVisitResult.TERMINATE;
    }

    @Override // p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    public void append(List<?> list, StringBuilder sb) {
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
    }

    public FileVisitResult get(InterfaceC8905 interfaceC8905) {
        try {
            return (FileVisitResult) interfaceC8905.get();
        } catch (IOException e) {
            return handle(e);
        }
    }

    public FileVisitResult handle(Throwable th) {
        return FileVisitResult.TERMINATE;
    }

    public boolean isDirectory(File file) {
        return file != null && file.isDirectory();
    }

    public boolean isFile(File file) {
        return file != null && file.isFile();
    }

    public FileVisitResult toFileVisitResult(boolean z) {
        return z ? this.onAccept : this.onReject;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(Path path, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }

    public AbstractC8915(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.onAccept = fileVisitResult;
        this.onReject = fileVisitResult2;
    }

    @Override // p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    public void append(Object[] objArr, StringBuilder sb) {
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(objArr[i]);
        }
    }
}
