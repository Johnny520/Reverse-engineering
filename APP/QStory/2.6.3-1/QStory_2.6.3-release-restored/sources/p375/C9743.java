package p375;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;
import org.apache.commons.p014io.filefilter.AndFileFilter;
import org.apache.commons.p014io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9743 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ BasicFileAttributes f25454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Path f25455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25456;

    public /* synthetic */ C9743(Path path, BasicFileAttributes basicFileAttributes, int i) {
        this.f25456 = i;
        this.f25455 = path;
        this.f25454 = basicFileAttributes;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25456) {
            case 0:
                return AndFileFilter.lambda$accept$2(this.f25455, this.f25454, (InterfaceC9740) obj);
            default:
                return OrFileFilter.lambda$accept$2(this.f25455, this.f25454, (InterfaceC9740) obj);
        }
    }
}
