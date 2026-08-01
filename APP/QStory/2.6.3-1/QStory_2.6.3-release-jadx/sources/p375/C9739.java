package p375;

import java.util.function.Predicate;
import org.apache.commons.p014io.filefilter.NameFileFilter;
import org.apache.commons.p014io.filefilter.PrefixFileFilter;
import org.apache.commons.p014io.filefilter.SuffixFileFilter;
import org.apache.commons.p014io.filefilter.WildcardFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9739 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9744 f25445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f25446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25447;

    public /* synthetic */ C9739(AbstractC9744 abstractC9744, String str, int i) {
        this.f25447 = i;
        this.f25445 = abstractC9744;
        this.f25446 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f25447;
        String str = this.f25446;
        AbstractC9744 abstractC9744 = this.f25445;
        switch (i) {
            case 0:
                return ((NameFileFilter) abstractC9744).lambda$acceptBaseName$0(str, (String) obj);
            case 1:
                return ((PrefixFileFilter) abstractC9744).lambda$accept$0(str, (String) obj);
            case 2:
                return ((SuffixFileFilter) abstractC9744).lambda$accept$0(str, (String) obj);
            default:
                return ((WildcardFileFilter) abstractC9744).lambda$accept$0(str, (String) obj);
        }
    }
}
