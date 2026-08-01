package p375;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.p014io.filefilter.AndFileFilter;
import org.apache.commons.p014io.filefilter.OrFileFilter;
import org.apache.commons.p014io.filefilter.WildcardFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9742 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ File f25452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25453;

    public /* synthetic */ C9742(File file, int i) {
        this.f25453 = i;
        this.f25452 = file;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f25453;
        File file = this.f25452;
        switch (i) {
            case 0:
                return AndFileFilter.lambda$accept$0(file, (InterfaceC9740) obj);
            case 1:
                return OrFileFilter.lambda$accept$0(file, (InterfaceC9740) obj);
            default:
                return WildcardFilter.lambda$accept$0(file, (String) obj);
        }
    }
}
