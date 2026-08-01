package androidx.compose.ui.platform;

import androidx.collection.AbstractC0269;
import androidx.collection.C0245;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0245 f5378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1956 f5379;

    public C1872(C1953 c1953, AbstractC0269 abstractC0269) {
        this.f5379 = c1953.f5769;
        List listM3652 = C1953.m3652(4, c1953);
        this.f5378 = new C0245(listM3652.size());
        int size = listM3652.size();
        for (int i = 0; i < size; i++) {
            C1953 c19532 = (C1953) listM3652.get(i);
            if (abstractC0269.m834(c19532.f5767)) {
                this.f5378.m785(c19532.f5767);
            }
        }
    }
}
