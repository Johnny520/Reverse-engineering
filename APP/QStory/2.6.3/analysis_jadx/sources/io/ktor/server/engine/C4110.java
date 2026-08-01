package io.ktor.server.engine;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4110 extends SimpleFileVisitor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ HashSet f12489;

    public C4110(HashSet hashSet) {
        this.f12489 = hashSet;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        path.getClass();
        basicFileAttributes.getClass();
        this.f12489.add(path);
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        path.getClass();
        basicFileAttributes.getClass();
        Path parent = path.getParent();
        if (parent != null) {
            this.f12489.add(parent);
        }
        return FileVisitResult.CONTINUE;
    }
}
