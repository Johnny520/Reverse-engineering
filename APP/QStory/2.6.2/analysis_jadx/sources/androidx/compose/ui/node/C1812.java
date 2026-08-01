package androidx.compose.ui.node;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1812 implements InterfaceC1810 {
    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo3407(C1748 c1748) {
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
    public final boolean mo3408(AbstractC2128 abstractC2128) {
        ?? c1224 = 0;
        while (abstractC2128 != 0) {
            if (abstractC2128 instanceof InterfaceC1796) {
                ((InterfaceC1796) abstractC2128).mo3306();
            } else if ((abstractC2128.f6290 & 16) != 0 && (abstractC2128 instanceof AbstractC1788)) {
                AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128).f5225;
                int i = 0;
                c1224 = c1224;
                abstractC2128 = abstractC2128;
                while (abstractC21282 != null) {
                    if ((abstractC21282.f6290 & 16) != 0) {
                        i++;
                        c1224 = c1224;
                        if (i == 1) {
                            abstractC2128 = abstractC21282;
                        } else {
                            if (c1224 == 0) {
                                c1224 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (abstractC2128 != 0) {
                                c1224.m2037(abstractC2128);
                                abstractC2128 = 0;
                            }
                            c1224.m2037(abstractC21282);
                        }
                    }
                    abstractC21282 = abstractC21282.f6287;
                    c1224 = c1224;
                    abstractC2128 = abstractC2128;
                }
                if (i == 1) {
                }
            }
            abstractC2128 = AbstractC1785.m3329(c1224);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo3409(C1748 c1748, long j, C1780 c1780, int i, boolean z) {
        c1748.m3228(j, c1780, i, z);
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo3410() {
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
    public final boolean mo3411(C1780 c1780, C1748 c1748) {
        AbstractC1794 abstractC1794 = c1748.f5093.f5284;
        abstractC1794.getClass();
        AbstractC2128 abstractC2128M3383 = abstractC1794.m3383(AbstractC1793.m3368(16));
        if (abstractC2128M3383 != null && abstractC2128M3383.f6278) {
            if (!abstractC2128M3383.f6291.f6278) {
                AbstractC7935.m13395("visitLocalDescendants called on an unattached node");
            }
            AbstractC2128 abstractC2128 = abstractC2128M3383.f6291;
            if ((abstractC2128.f6284 & 16) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 16) != 0) {
                        ?? M3329 = abstractC2128;
                        ?? c1224 = 0;
                        while (M3329 != 0) {
                            if (M3329 instanceof InterfaceC1796) {
                                if (((InterfaceC1796) M3329).mo3309()) {
                                    c1780.f5219 = c1780.f5220.f1004 - 1;
                                    return true;
                                }
                            } else if ((M3329.f6290 & 16) != 0 && (M3329 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) M3329).f5225;
                                int i = 0;
                                M3329 = M3329;
                                c1224 = c1224;
                                while (abstractC21282 != null) {
                                    if ((abstractC21282.f6290 & 16) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3329 = abstractC21282;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3329 != 0) {
                                                c1224.m2037(M3329);
                                                M3329 = 0;
                                            }
                                            c1224.m2037(abstractC21282);
                                        }
                                    }
                                    abstractC21282 = abstractC21282.f6287;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3329 = AbstractC1785.m3329(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6287;
                }
            }
        }
        return false;
    }
}
