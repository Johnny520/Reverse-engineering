package p321;

import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8689 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ File f24507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24508;

    public /* synthetic */ C8689(File file, int i) {
        this.f24508 = i;
        this.f24507 = file;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f24508;
        File file = this.f24507;
        switch (i) {
            case 0:
                return AbstractC3056.m6717(Long.valueOf(new File(file, (String) obj).lastModified()), Long.valueOf(new File(file, (String) obj2).lastModified()));
            default:
                return AbstractC3056.m6717(Long.valueOf(new File(file, (String) obj2).lastModified()), Long.valueOf(new File(file, (String) obj).lastModified()));
        }
    }
}
