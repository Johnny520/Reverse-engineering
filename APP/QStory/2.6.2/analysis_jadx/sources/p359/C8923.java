package p359;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.apache.commons.io.filefilter.WildcardFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8923 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ File f25118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25119;

    public /* synthetic */ C8923(File file, int i) {
        this.f25119 = i;
        this.f25118 = file;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f25119;
        File file = this.f25118;
        switch (i) {
            case 0:
                return AndFileFilter.lambda$accept$0(file, (InterfaceC8921) obj);
            case 1:
                return OrFileFilter.lambda$accept$0(file, (InterfaceC8921) obj);
            default:
                return WildcardFilter.lambda$accept$0(file, (String) obj);
        }
    }
}
