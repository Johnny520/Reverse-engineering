package kotlin.p008io.path;

import com.bumptech.glide.AbstractC3887;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements InterfaceC7383 {
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ InterfaceC7380 $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(InterfaceC7380 interfaceC7380, Path path, Path path2, Path path3) {
        super(2, AbstractC5214.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.$onError = interfaceC7380;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
    }

    @Override // p068.InterfaceC7383
    public final FileVisitResult invoke(Path path, Exception exc) {
        path.getClass();
        exc.getClass();
        return AbstractC3887.m7221(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
    }
}
