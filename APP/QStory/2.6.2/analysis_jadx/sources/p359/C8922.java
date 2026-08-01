package p359;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;

/* JADX INFO: renamed from: 飘花落叶言苏子世哲兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8922 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ String f25115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ File f25116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25117;

    public /* synthetic */ C8922(String str, File file, int i) {
        this.f25117 = i;
        this.f25116 = file;
        this.f25115 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25117) {
            case 0:
                return AndFileFilter.lambda$accept$1(this.f25116, this.f25115, (InterfaceC8921) obj);
            default:
                return OrFileFilter.lambda$accept$1(this.f25116, this.f25115, (InterfaceC8921) obj);
        }
    }
}
