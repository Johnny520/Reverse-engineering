package p375;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.p014io.filefilter.AndFileFilter;
import org.apache.commons.p014io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9741 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ String f25449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ File f25450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25451;

    public /* synthetic */ C9741(String str, File file, int i) {
        this.f25451 = i;
        this.f25450 = file;
        this.f25449 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25451) {
            case 0:
                return AndFileFilter.lambda$accept$1(this.f25450, this.f25449, (InterfaceC9740) obj);
            default:
                return OrFileFilter.lambda$accept$1(this.f25450, this.f25449, (InterfaceC9740) obj);
        }
    }
}
