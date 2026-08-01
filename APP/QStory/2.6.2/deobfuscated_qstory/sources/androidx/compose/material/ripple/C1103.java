package androidx.compose.material.ripple;

import androidx.compose.ui.node.AbstractC1785;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1103 extends AbstractC1105 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1111 f3231;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1098 f3232;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C1098 c1098 = this.f3232;
        if (c1098 != null) {
            this.f3231 = null;
            AbstractC1785.m3341(this);
            C1108 c1108 = c1098.f3227;
            C1111 c1111 = (C1111) c1108.f3254.get(this);
            if (c1111 != null) {
                c1111.m1999();
                LinkedHashMap linkedHashMap = c1108.f3254;
                C1111 c11112 = (C1111) linkedHashMap.get(this);
                if (c11112 != null) {
                }
                linkedHashMap.remove(this);
                c1098.f3229.add(c1111);
            }
        }
    }
}
