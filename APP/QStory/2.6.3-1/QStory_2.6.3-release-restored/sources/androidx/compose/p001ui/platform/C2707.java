package androidx.compose.p001ui.platform;

import androidx.collection.AbstractC1116;
import androidx.collection.C1092;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2791;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1092 f5723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2791 f5724;

    public C2707(C2788 c2788, AbstractC1116 abstractC1116) {
        this.f5724 = c2788.f6114;
        List listM4212 = C2788.m4212(4, c2788);
        this.f5723 = new C1092(listM4212.size());
        int size = listM4212.size();
        for (int i = 0; i < size; i++) {
            C2788 c27882 = (C2788) listM4212.get(i);
            if (abstractC1116.m1394(c27882.f6112)) {
                this.f5723.m1345(c27882.f6112);
            }
        }
    }
}
