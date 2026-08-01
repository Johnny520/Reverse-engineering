package io.ktor.server.engine;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4109 extends SimpleFileVisitor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ HashSet f12485;

    public C4109(HashSet hashSet) {
        this.f12485 = hashSet;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        path.getClass();
        basicFileAttributes.getClass();
        this.f12485.add(path);
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        path.getClass();
        basicFileAttributes.getClass();
        Path parent = path.getParent();
        if (parent != null) {
            this.f12485.add(parent);
        }
        return FileVisitResult.CONTINUE;
    }
}
