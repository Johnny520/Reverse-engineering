package Yue;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class C4405 extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: ۥ */
    public final boolean f872;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public C6624 f873;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public C3383<C6624> f9080 = new C3383<>();

    public C4405(boolean z) {
        this.f872 = z;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m1354() {
        return this.f872;
    }

    /* JADX DEBUG: Method merged with bridge method: preVisitDirectory(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) throws IOException {
        C5499.m17103(path, "dir");
        C5499.m17103(basicFileAttributes, "attrs");
        this.f9080.add(new C6624(path, basicFileAttributes.fileKey(), this.f873));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        C5499.m17102(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<C6624> m12756(@InterfaceC6399 C6624 c6624) throws IOException {
        C5499.m17103(c6624, "directoryNode");
        this.f873 = c6624;
        Files.walkFileTree(c6624.m21063(), C5716.f1632.m2397(this.f872), 1, this);
        this.f9080.removeFirst();
        C3383<C6624> c3383 = this.f9080;
        this.f9080 = new C3383<>();
        return c3383;
    }

    /* JADX DEBUG: Method merged with bridge method: visitFile(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult; */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) throws IOException {
        C5499.m17103(path, "file");
        C5499.m17103(basicFileAttributes, "attrs");
        this.f9080.add(new C6624(path, null, this.f873));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        C5499.m17102(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }
}
