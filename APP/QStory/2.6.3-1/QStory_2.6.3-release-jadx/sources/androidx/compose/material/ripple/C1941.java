package androidx.compose.material.ripple;

import androidx.compose.p001ui.node.AbstractC2620;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 extends AbstractC1943 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1949 f3577;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1936 f3578;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C1936 c1936 = this.f3578;
        if (c1936 != null) {
            this.f3577 = null;
            AbstractC2620.m3911(this);
            C1946 c1946 = c1936.f3573;
            C1949 c1949 = (C1949) c1946.f3600.get(this);
            if (c1949 != null) {
                c1949.m2569();
                LinkedHashMap linkedHashMap = c1946.f3600;
                C1949 c19492 = (C1949) linkedHashMap.get(this);
                if (c19492 != null) {
                }
                linkedHashMap.remove(this);
                c1936.f3575.add(c1949);
            }
        }
    }
}
