package p359;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8914 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ BasicFileAttributes f25109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Path f25110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25111;

    public /* synthetic */ C8914(Path path, BasicFileAttributes basicFileAttributes, int i) {
        this.f25111 = i;
        this.f25110 = path;
        this.f25109 = basicFileAttributes;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25111) {
            case 0:
                return AndFileFilter.lambda$accept$2(this.f25110, this.f25109, (InterfaceC8911) obj);
            default:
                return OrFileFilter.lambda$accept$2(this.f25110, this.f25109, (InterfaceC8911) obj);
        }
    }
}
