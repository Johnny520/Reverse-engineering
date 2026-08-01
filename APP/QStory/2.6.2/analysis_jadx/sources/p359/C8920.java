package p359;

import java.util.function.Predicate;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8920 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8925 f25111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f25112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25113;

    public /* synthetic */ C8920(AbstractC8925 abstractC8925, String str, int i) {
        this.f25113 = i;
        this.f25111 = abstractC8925;
        this.f25112 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f25113;
        String str = this.f25112;
        AbstractC8925 abstractC8925 = this.f25111;
        switch (i) {
            case 0:
                return ((NameFileFilter) abstractC8925).lambda$acceptBaseName$0(str, (String) obj);
            case 1:
                return ((PrefixFileFilter) abstractC8925).lambda$accept$0(str, (String) obj);
            case 2:
                return ((SuffixFileFilter) abstractC8925).lambda$accept$0(str, (String) obj);
            default:
                return ((WildcardFileFilter) abstractC8925).lambda$accept$0(str, (String) obj);
        }
    }
}
