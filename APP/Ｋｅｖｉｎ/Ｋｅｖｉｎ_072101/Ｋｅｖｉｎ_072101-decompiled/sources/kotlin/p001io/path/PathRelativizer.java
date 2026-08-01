package kotlin.p001io.path;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m115d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
final class PathRelativizer {
    public static final kotlin.p001io.path.PathRelativizer INSTANCE = null;
    private static final java.nio.file.Path emptyPath = null;
    private static final java.nio.file.Path parentPath = null;

    static {
            kotlin.io.path.PathRelativizer r0 = new kotlin.io.path.PathRelativizer
            r0.<init>()
            kotlin.p001io.path.PathRelativizer.INSTANCE = r0
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = ""
            java.nio.file.Path r1 = java.nio.file.Paths.get(r2, r1)
            kotlin.p001io.path.PathRelativizer.emptyPath = r1
            java.lang.String r1 = ".."
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r1, r0)
            kotlin.p001io.path.PathRelativizer.parentPath = r0
            return
    }

    private PathRelativizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.nio.file.Path tryRelativeTo(java.nio.file.Path r9, java.nio.file.Path r10) {
            r8 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.nio.file.Path r0 = r10.normalize()
            java.nio.file.Path r1 = r9.normalize()
            java.nio.file.Path r2 = r0.relativize(r1)
            r3 = 0
            int r4 = r0.getNameCount()
            int r5 = r1.getNameCount()
            int r4 = java.lang.Math.min(r4, r5)
        L23:
            if (r3 >= r4) goto L48
            java.nio.file.Path r5 = r0.getName(r3)
            java.nio.file.Path r6 = kotlin.p001io.path.PathRelativizer.parentPath
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L48
            java.nio.file.Path r5 = r1.getName(r3)
            java.nio.file.Path r6 = kotlin.p001io.path.PathRelativizer.parentPath
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L40
            int r3 = r3 + 1
            goto L23
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Unable to compute relative path"
            r4.<init>(r5)
            throw r4
        L48:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r3 != 0) goto L58
            java.nio.file.Path r3 = kotlin.p001io.path.PathRelativizer.emptyPath
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L58
            r4 = r1
            goto L8e
        L58:
            java.lang.String r3 = r2.toString()
            java.nio.file.FileSystem r4 = r2.getFileSystem()
            java.lang.String r4 = r4.getSeparator()
            java.lang.String r5 = "rn.fileSystem.separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = 2
            r6 = 0
            r7 = 0
            boolean r4 = kotlin.text.StringsKt.endsWith$default(r3, r4, r7, r5, r6)
            if (r4 == 0) goto L8d
            java.nio.file.FileSystem r4 = r2.getFileSystem()
            java.nio.file.FileSystem r5 = r2.getFileSystem()
            java.lang.String r5 = r5.getSeparator()
            int r5 = r5.length()
            java.lang.String r5 = kotlin.text.StringsKt.dropLast(r3, r5)
            java.lang.String[] r6 = new java.lang.String[r7]
            java.nio.file.Path r4 = r4.getPath(r5, r6)
            goto L8e
        L8d:
            r4 = r2
        L8e:
            r3 = r4
            java.lang.String r4 = "r"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }
}
