package p324;

import java.io.File;
import java.util.Comparator;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8739 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ File f24640;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24641;

    public /* synthetic */ C8739(File file, int i) {
        this.f24641 = i;
        this.f24640 = file;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f24641;
        File file = this.f24640;
        switch (i) {
            case 0:
                return AbstractC7738.m13040(Long.valueOf(new File(file, (String) obj).lastModified()), Long.valueOf(new File(file, (String) obj2).lastModified()));
            default:
                return AbstractC7738.m13040(Long.valueOf(new File(file, (String) obj2).lastModified()), Long.valueOf(new File(file, (String) obj).lastModified()));
        }
    }
}
