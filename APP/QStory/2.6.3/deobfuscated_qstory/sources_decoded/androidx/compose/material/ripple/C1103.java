package androidx.compose.material.ripple;

import androidx.compose.ui.node.AbstractC1785;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1103 extends AbstractC1105 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1111 f3232;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1098 f3233;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C1098 c1098 = this.f3233;
        if (c1098 != null) {
            this.f3232 = null;
            AbstractC1785.m3351(this);
            C1108 c1108 = c1098.f3228;
            C1111 c1111 = (C1111) c1108.f3255.get(this);
            if (c1111 != null) {
                c1111.m2009();
                LinkedHashMap linkedHashMap = c1108.f3255;
                C1111 c11112 = (C1111) linkedHashMap.get(this);
                if (c11112 != null) {
                }
                linkedHashMap.remove(this);
                c1098.f3230.add(c1111);
            }
        }
    }
}
