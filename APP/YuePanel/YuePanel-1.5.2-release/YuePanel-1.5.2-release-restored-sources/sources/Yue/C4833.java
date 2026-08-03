package Yue;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4833 extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> f1152;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> f1153;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5138<Path, IOException, FileVisitResult> f10895;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5138<Path, IOException, FileVisitResult> f10896;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4833(@InterfaceC6489 InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5138, @InterfaceC6489 InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC51382, @InterfaceC6489 InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC51383, @InterfaceC6489 InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC51384) {
        this.f1152 = interfaceC5138;
        this.f1153 = interfaceC51382;
        this.f10895 = interfaceC51383;
        this.f10896 = interfaceC51384;
    }

    /* JADX DEBUG: Method merged with bridge method: postVisitDirectory(Ljava/lang/Object;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@InterfaceC6399 Path path, @InterfaceC6489 IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        C5499.m17103(path, "dir");
        InterfaceC5138<Path, IOException, FileVisitResult> interfaceC5138 = this.f10896;
        if (interfaceC5138 != null && (fileVisitResultInvoke = interfaceC5138.invoke(path, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(path, iOException);
        C5499.m17102(fileVisitResultPostVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return fileVisitResultPostVisitDirectory;
    }

    /* JADX DEBUG: Method merged with bridge method: preVisitDirectory(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        C5499.m17103(path, "dir");
        C5499.m17103(basicFileAttributes, "attrs");
        InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> interfaceC5138 = this.f1152;
        if (interfaceC5138 != null && (fileVisitResultInvoke = interfaceC5138.invoke(path, basicFileAttributes)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        C5499.m17102(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    /* JADX DEBUG: Method merged with bridge method: visitFile(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        C5499.m17103(path, "file");
        C5499.m17103(basicFileAttributes, "attrs");
        InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> interfaceC5138 = this.f1153;
        if (interfaceC5138 != null && (fileVisitResultInvoke = interfaceC5138.invoke(path, basicFileAttributes)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        C5499.m17102(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }

    /* JADX DEBUG: Method merged with bridge method: visitFileFailed(Ljava/lang/Object;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@InterfaceC6399 Path path, @InterfaceC6399 IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        C5499.m17103(path, "file");
        C5499.m17103(iOException, "exc");
        InterfaceC5138<Path, IOException, FileVisitResult> interfaceC5138 = this.f10895;
        if (interfaceC5138 != null && (fileVisitResultInvoke = interfaceC5138.invoke(path, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(path, iOException);
        C5499.m17102(fileVisitResultVisitFileFailed, "super.visitFileFailed(file, exc)");
        return fileVisitResultVisitFileFailed;
    }
}
