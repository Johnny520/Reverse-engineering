package androidx.compose.ui.node;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1812 implements InterfaceC1810 {
    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo3417(C1748 c1748) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo3418(AbstractC2128 abstractC2128) {
        ?? c1224 = 0;
        while (abstractC2128 != 0) {
            if (abstractC2128 instanceof InterfaceC1796) {
                ((InterfaceC1796) abstractC2128).mo3316();
            } else if ((abstractC2128.f6291 & 16) != 0 && (abstractC2128 instanceof AbstractC1788)) {
                AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128).f5226;
                int i = 0;
                c1224 = c1224;
                abstractC2128 = abstractC2128;
                while (abstractC21282 != null) {
                    if ((abstractC21282.f6291 & 16) != 0) {
                        i++;
                        c1224 = c1224;
                        if (i == 1) {
                            abstractC2128 = abstractC21282;
                        } else {
                            if (c1224 == 0) {
                                c1224 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (abstractC2128 != 0) {
                                c1224.m2047(abstractC2128);
                                abstractC2128 = 0;
                            }
                            c1224.m2047(abstractC21282);
                        }
                    }
                    abstractC21282 = abstractC21282.f6288;
                    c1224 = c1224;
                    abstractC2128 = abstractC2128;
                }
                if (i == 1) {
                }
            }
            abstractC2128 = AbstractC1785.m3339(c1224);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo3419(C1748 c1748, long j, C1780 c1780, int i, boolean z) {
        c1748.m3238(j, c1780, i, z);
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo3420() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo3421(C1780 c1780, C1748 c1748) {
        AbstractC1794 abstractC1794 = c1748.f5094.f5285;
        abstractC1794.getClass();
        AbstractC2128 abstractC2128M3393 = abstractC1794.m3393(AbstractC1793.m3378(16));
        if (abstractC2128M3393 != null && abstractC2128M3393.f6279) {
            if (!abstractC2128M3393.f6292.f6279) {
                AbstractC7936.m13423("visitLocalDescendants called on an unattached node");
            }
            AbstractC2128 abstractC2128 = abstractC2128M3393.f6292;
            if ((abstractC2128.f6285 & 16) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 16) != 0) {
                        ?? M3339 = abstractC2128;
                        ?? c1224 = 0;
                        while (M3339 != 0) {
                            if (M3339 instanceof InterfaceC1796) {
                                if (((InterfaceC1796) M3339).mo3319()) {
                                    c1780.f5220 = c1780.f5221.f1004 - 1;
                                    return true;
                                }
                            } else if ((M3339.f6291 & 16) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) M3339).f5226;
                                int i = 0;
                                M3339 = M3339;
                                c1224 = c1224;
                                while (abstractC21282 != null) {
                                    if ((abstractC21282.f6291 & 16) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3339 = abstractC21282;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c1224.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c1224.m2047(abstractC21282);
                                        }
                                    }
                                    abstractC21282 = abstractC21282.f6288;
                                    M3339 = M3339;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3339 = AbstractC1785.m3339(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6288;
                }
            }
        }
        return false;
    }
}
