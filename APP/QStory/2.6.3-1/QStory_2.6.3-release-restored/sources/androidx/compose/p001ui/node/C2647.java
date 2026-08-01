package androidx.compose.p001ui.node;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.runtime.collection.C2059;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2647 implements InterfaceC2645 {
    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo3977(C2583 c2583) {
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
    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo3978(AbstractC2961 abstractC2961) {
        ?? c2059 = 0;
        while (abstractC2961 != 0) {
            if (abstractC2961 instanceof InterfaceC2631) {
                ((InterfaceC2631) abstractC2961).mo3876();
            } else if ((abstractC2961.f6636 & 16) != 0 && (abstractC2961 instanceof AbstractC2623)) {
                AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961).f5571;
                int i = 0;
                c2059 = c2059;
                abstractC2961 = abstractC2961;
                while (abstractC29612 != null) {
                    if ((abstractC29612.f6636 & 16) != 0) {
                        i++;
                        c2059 = c2059;
                        if (i == 1) {
                            abstractC2961 = abstractC29612;
                        } else {
                            if (c2059 == 0) {
                                c2059 = new C2059(0, new AbstractC2961[16]);
                            }
                            if (abstractC2961 != 0) {
                                c2059.m2607(abstractC2961);
                                abstractC2961 = 0;
                            }
                            c2059.m2607(abstractC29612);
                        }
                    }
                    abstractC29612 = abstractC29612.f6633;
                    c2059 = c2059;
                    abstractC2961 = abstractC2961;
                }
                if (i == 1) {
                }
            }
            abstractC2961 = AbstractC2620.m3899(c2059);
        }
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo3979(C2583 c2583, long j, C2615 c2615, int i, boolean z) {
        c2583.m3798(j, c2615, i, z);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo3980() {
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
    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo3981(C2615 c2615, C2583 c2583) {
        AbstractC2629 abstractC2629 = c2583.f5439.f5630;
        abstractC2629.getClass();
        AbstractC2961 abstractC2961M3953 = abstractC2629.m3953(AbstractC2628.m3938(16));
        if (abstractC2961M3953 != null && abstractC2961M3953.f6624) {
            if (!abstractC2961M3953.f6637.f6624) {
                AbstractC8765.m13982("visitLocalDescendants called on an unattached node");
            }
            AbstractC2961 abstractC2961 = abstractC2961M3953.f6637;
            if ((abstractC2961.f6630 & 16) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 16) != 0) {
                        ?? M3899 = abstractC2961;
                        ?? c2059 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2631) {
                                if (((InterfaceC2631) M3899).mo3879()) {
                                    c2615.f5565 = c2615.f5566.f1349 - 1;
                                    return true;
                                }
                            } else if ((M3899.f6636 & 16) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                                int i = 0;
                                M3899 = M3899;
                                c2059 = c2059;
                                while (abstractC29612 != null) {
                                    if ((abstractC29612.f6636 & 16) != 0) {
                                        i++;
                                        c2059 = c2059;
                                        if (i == 1) {
                                            M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == 0) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c2059.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                    abstractC29612 = abstractC29612.f6633;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                }
                                if (i == 1) {
                                }
                            }
                            M3899 = AbstractC2620.m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6633;
                }
            }
        }
        return false;
    }
}
