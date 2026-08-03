package bf;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/* JADX INFO: renamed from: bf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0309a extends SimpleFileVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f882b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0309a(ArrayList arrayList, ArrayList arrayList2) {
        this.f881a = arrayList;
        this.f882b = arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        this.f882b.add((Path) obj);
        return FileVisitResult.CONTINUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        this.f881a.add((Path) obj);
        return FileVisitResult.CONTINUE;
    }
}
