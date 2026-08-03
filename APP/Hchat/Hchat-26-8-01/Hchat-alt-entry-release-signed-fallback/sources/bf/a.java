package bf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.nio.file.SimpleFileVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f856b;

    public a(java.util.ArrayList r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f855a = r1
            r0.f856b = r2
            r0.<init>()
            return
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.util.ArrayList r2 = r0.f856b
            r2.add(r1)
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final java.nio.file.FileVisitResult visitFile(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.util.ArrayList r2 = r0.f855a
            r2.add(r1)
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            return r1
    }
}
