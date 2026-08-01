package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p052.InterfaceC6550;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6550 $copyAction;
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC6550 $onError;
    final /* synthetic */ ArrayList<Path> $stack;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(ArrayList<Path> arrayList, InterfaceC6550 interfaceC6550, Path path, Path path2, Path path3, InterfaceC6550 interfaceC65502) {
        super(2, AbstractC4381.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.$stack = arrayList;
        this.$copyAction = interfaceC6550;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
        this.$onError = interfaceC65502;
    }

    @Override // p052.InterfaceC6553
    public final FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
        path.getClass();
        basicFileAttributes.getClass();
        ArrayList<Path> arrayList = this.$stack;
        InterfaceC6550 interfaceC6550 = this.$copyAction;
        Path path2 = this.$this_copyToRecursively;
        Path path3 = this.$target;
        Path path4 = this.$normalizedTarget;
        InterfaceC6550 interfaceC65502 = this.$onError;
        try {
            if (!arrayList.isEmpty()) {
                AbstractC5061.m10051(path);
                Object objM8811 = AbstractC4343.m8811(arrayList);
                objM8811.getClass();
                Path path5 = (Path) objM8811;
                if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path5)) {
                    throw new FileSystemLoopException(path.toString());
                }
            }
            int i = AbstractC4365.f12937[((CopyActionResult) interfaceC6550.invoke(C4370.f12940, path, AbstractC5061.m10049(path2, path3, path4, path))).ordinal()];
            if (i == 1) {
                return FileVisitResult.CONTINUE;
            }
            if (i == 2) {
                return FileVisitResult.TERMINATE;
            }
            if (i == 3) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            return AbstractC5061.m10043(interfaceC65502, path2, path3, path4, path, e);
        }
    }
}
