package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p052.InterfaceC6550;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements InterfaceC6553 {
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC6550 $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(InterfaceC6550 interfaceC6550, Path path, Path path2, Path path3) {
        super(2, AbstractC4381.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.$onError = interfaceC6550;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
    }

    @Override // p052.InterfaceC6553
    public final FileVisitResult invoke(Path path, Exception exc) {
        path.getClass();
        exc.getClass();
        return AbstractC5061.m10043(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
    }
}
