package kotlin.io.path;

import com.bumptech.glide.AbstractC3055;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements InterfaceC6554 {
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC6551 $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(InterfaceC6551 interfaceC6551, Path path, Path path2, Path path3) {
        super(2, AbstractC4382.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.$onError = interfaceC6551;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
    }

    @Override // p052.InterfaceC6554
    public final FileVisitResult invoke(Path path, Exception exc) {
        path.getClass();
        exc.getClass();
        return AbstractC3055.m6661(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
    }
}
