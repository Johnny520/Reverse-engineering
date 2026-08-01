package androidx.compose.ui.platform;

import androidx.collection.AbstractC0269;
import androidx.collection.C0245;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0245 f5377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1956 f5378;

    public C1872(C1953 c1953, AbstractC0269 abstractC0269) {
        this.f5378 = c1953.f5768;
        List listM3642 = C1953.m3642(4, c1953);
        this.f5377 = new C0245(listM3642.size());
        int size = listM3642.size();
        for (int i = 0; i < size; i++) {
            C1953 c19532 = (C1953) listM3642.get(i);
            if (abstractC0269.m833(c19532.f5766)) {
                this.f5377.m784(c19532.f5766);
            }
        }
    }
}
