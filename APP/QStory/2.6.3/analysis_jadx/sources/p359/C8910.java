package p359;

import java.util.function.Predicate;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8910 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8915 f25100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f25101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25102;

    public /* synthetic */ C8910(AbstractC8915 abstractC8915, String str, int i) {
        this.f25102 = i;
        this.f25100 = abstractC8915;
        this.f25101 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f25102;
        String str = this.f25101;
        AbstractC8915 abstractC8915 = this.f25100;
        switch (i) {
            case 0:
                return ((NameFileFilter) abstractC8915).lambda$acceptBaseName$0(str, (String) obj);
            case 1:
                return ((PrefixFileFilter) abstractC8915).lambda$accept$0(str, (String) obj);
            case 2:
                return ((SuffixFileFilter) abstractC8915).lambda$accept$0(str, (String) obj);
            default:
                return ((WildcardFileFilter) abstractC8915).lambda$accept$0(str, (String) obj);
        }
    }
}
