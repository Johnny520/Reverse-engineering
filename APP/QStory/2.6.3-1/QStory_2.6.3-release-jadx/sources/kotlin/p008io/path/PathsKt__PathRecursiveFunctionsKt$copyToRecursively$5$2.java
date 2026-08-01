package kotlin.p008io.path;

import com.bumptech.glide.AbstractC3887;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $copyAction;
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC7380 $onError;
    final /* synthetic */ ArrayList<Path> $stack;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(ArrayList<Path> arrayList, InterfaceC7380 interfaceC7380, Path path, Path path2, Path path3, InterfaceC7380 interfaceC73802) {
        super(2, AbstractC5214.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.$stack = arrayList;
        this.$copyAction = interfaceC7380;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
        this.$onError = interfaceC73802;
    }

    @Override // p068.InterfaceC7383
    public final FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
        path.getClass();
        basicFileAttributes.getClass();
        ArrayList<Path> arrayList = this.$stack;
        InterfaceC7380 interfaceC7380 = this.$copyAction;
        Path path2 = this.$this_copyToRecursively;
        Path path3 = this.$target;
        Path path4 = this.$normalizedTarget;
        InterfaceC7380 interfaceC73802 = this.$onError;
        try {
            if (!arrayList.isEmpty()) {
                AbstractC3887.m7206(path);
                Object objM9367 = AbstractC5176.m9367(arrayList);
                objM9367.getClass();
                Path path5 = (Path) objM9367;
                if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path5)) {
                    throw new FileSystemLoopException(path.toString());
                }
            }
            int i = AbstractC5198.f13286[((CopyActionResult) interfaceC7380.invoke(C5203.f13289, path, AbstractC3887.m7224(path2, path3, path4, path))).ordinal()];
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
            return AbstractC3887.m7221(interfaceC73802, path2, path3, path4, path, e);
        }
    }
}
