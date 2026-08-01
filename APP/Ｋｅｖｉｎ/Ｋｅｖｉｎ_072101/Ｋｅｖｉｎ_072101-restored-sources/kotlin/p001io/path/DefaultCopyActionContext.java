package kotlin.p001io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m115d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
final class DefaultCopyActionContext implements kotlin.p001io.path.CopyActionContext {
    public static final kotlin.p001io.path.DefaultCopyActionContext INSTANCE = null;

    static {
            kotlin.io.path.DefaultCopyActionContext r0 = new kotlin.io.path.DefaultCopyActionContext
            r0.<init>()
            kotlin.p001io.path.DefaultCopyActionContext.INSTANCE = r0
            return
    }

    private DefaultCopyActionContext() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.p001io.path.CopyActionContext
    public kotlin.p001io.path.CopyActionResult copyToIgnoringExistingDirectory(java.nio.file.Path r4, java.nio.file.Path r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.p001io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r6)
            int r1 = r0.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r4, r1)
            if (r1 == 0) goto L37
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r5, r1)
            if (r1 != 0) goto L4e
        L37:
            int r1 = r0.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.CopyOption[] r1 = (java.nio.file.CopyOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.CopyOption[] r1 = (java.nio.file.CopyOption[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.copy(r4, r5, r1)
            java.lang.String r2 = "copy(this, target, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L4e:
            kotlin.io.path.CopyActionResult r1 = kotlin.p001io.path.CopyActionResult.CONTINUE
            return r1
    }
}
