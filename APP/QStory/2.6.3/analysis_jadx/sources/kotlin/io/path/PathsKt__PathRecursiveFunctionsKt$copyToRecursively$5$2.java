package kotlin.io.path;

import com.bumptech.glide.AbstractC3055;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $copyAction;
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC6551 $onError;
    final /* synthetic */ ArrayList<Path> $stack;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(ArrayList<Path> arrayList, InterfaceC6551 interfaceC6551, Path path, Path path2, Path path3, InterfaceC6551 interfaceC65512) {
        super(2, AbstractC4382.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.$stack = arrayList;
        this.$copyAction = interfaceC6551;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
        this.$onError = interfaceC65512;
    }

    @Override // p052.InterfaceC6554
    public final FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
        path.getClass();
        basicFileAttributes.getClass();
        ArrayList<Path> arrayList = this.$stack;
        InterfaceC6551 interfaceC6551 = this.$copyAction;
        Path path2 = this.$this_copyToRecursively;
        Path path3 = this.$target;
        Path path4 = this.$normalizedTarget;
        InterfaceC6551 interfaceC65512 = this.$onError;
        try {
            if (!arrayList.isEmpty()) {
                AbstractC3055.m6646(path);
                Object objM8808 = AbstractC4344.m8808(arrayList);
                objM8808.getClass();
                Path path5 = (Path) objM8808;
                if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path5)) {
                    throw new FileSystemLoopException(path.toString());
                }
            }
            int i = AbstractC4366.f12941[((CopyActionResult) interfaceC6551.invoke(C4371.f12944, path, AbstractC3055.m6664(path2, path3, path4, path))).ordinal()];
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
            return AbstractC3055.m6661(interfaceC65512, path2, path3, path4, path, e);
        }
    }
}
