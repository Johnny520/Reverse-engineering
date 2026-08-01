package p359;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8924 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ BasicFileAttributes f25120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Path f25121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25122;

    public /* synthetic */ C8924(Path path, BasicFileAttributes basicFileAttributes, int i) {
        this.f25122 = i;
        this.f25121 = path;
        this.f25120 = basicFileAttributes;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25122) {
            case 0:
                return AndFileFilter.lambda$accept$2(this.f25121, this.f25120, (InterfaceC8921) obj);
            default:
                return OrFileFilter.lambda$accept$2(this.f25121, this.f25120, (InterfaceC8921) obj);
        }
    }
}
