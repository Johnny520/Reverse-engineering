package p359;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8912 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ String f25104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ File f25105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25106;

    public /* synthetic */ C8912(String str, File file, int i) {
        this.f25106 = i;
        this.f25105 = file;
        this.f25104 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25106) {
            case 0:
                return AndFileFilter.lambda$accept$1(this.f25105, this.f25104, (InterfaceC8911) obj);
            default:
                return OrFileFilter.lambda$accept$1(this.f25105, this.f25104, (InterfaceC8911) obj);
        }
    }
}
