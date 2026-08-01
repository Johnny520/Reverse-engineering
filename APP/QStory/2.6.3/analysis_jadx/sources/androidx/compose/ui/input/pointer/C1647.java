package androidx.compose.ui.input.pointer;

import androidx.appcompat.app.C0107;
import androidx.collection.C0244;
import androidx.collection.C0263;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.InterfaceC1796;
import java.util.List;
import p232.C8065;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1647 extends C1651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC1794 f4827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0263 f4828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0107 f4829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2128 f4830;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4831;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1652 f4832;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f4833;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f4834;

    public C1647(AbstractC2128 abstractC2128) {
        this.f4830 = abstractC2128;
        C0107 c0107 = new C0107((byte) 0, 10);
        c0107.f315 = new long[2];
        this.f4829 = c0107;
        this.f4828 = new C0263(2);
        this.f4833 = true;
        this.f4834 = true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f4830 + ", children=" + this.f4846 + ", pointerIds=" + this.f4829 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3035(long j, C0244 c0244) {
        C0107 c0107 = this.f4829;
        if (c0107.m339(j) && c0244.m880(this) < 0) {
            c0107.m349(j);
            this.f4828.m822(j);
        }
        C1224 c1224 = this.f4846;
        Object[] objArr = c1224.f3521;
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1647) objArr[i2]).m3035(j, c0244);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3036(C8065 c8065, boolean z) {
        C1748 c1748;
        if (this.f4828.m828() == 0) {
            return false;
        }
        ?? M3339 = this.f4830;
        if (M3339.f6279) {
            AbstractC1794 abstractC1794 = M3339.f6286;
            if ((abstractC1794 == null || (c1748 = abstractC1794.f5259) == null) ? false : c1748.m3242()) {
                C1652 c1652 = this.f4832;
                c1652.getClass();
                AbstractC1794 abstractC17942 = this.f4827;
                abstractC17942.getClass();
                long j = abstractC17942.f4998;
                ?? M33392 = M3339;
                ?? c1224 = 0;
                while (M33392 != 0) {
                    if (M33392 instanceof InterfaceC1796) {
                        ((InterfaceC1796) M33392).mo1291(c1652, PointerEventPass.Initial, j);
                    } else if ((M33392.f6291 & 16) != 0 && (M33392 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC2128 = ((AbstractC1788) M33392).f5226;
                        int i = 0;
                        M33392 = M33392;
                        c1224 = c1224;
                        while (abstractC2128 != null) {
                            if ((abstractC2128.f6291 & 16) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M33392 = abstractC2128;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M33392 != 0) {
                                        c1224.m2047(M33392);
                                        M33392 = 0;
                                    }
                                    c1224.m2047(abstractC2128);
                                }
                            }
                            abstractC2128 = abstractC2128.f6288;
                            M33392 = M33392;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M33392 = AbstractC1785.m3339(c1224);
                }
                if (M3339.f6279) {
                    C1224 c12242 = this.f4846;
                    Object[] objArr = c12242.f3521;
                    int i2 = c12242.f3520;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C1647 c1647 = (C1647) objArr[i3];
                        this.f4827.getClass();
                        c1647.m3036(c8065, z);
                    }
                }
                if (M3339.f6279) {
                    ?? c12243 = 0;
                    while (M3339 != 0) {
                        if (M3339 instanceof InterfaceC1796) {
                            ((InterfaceC1796) M3339).mo1291(c1652, PointerEventPass.Main, j);
                        } else if ((M3339.f6291 & 16) != 0 && (M3339 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC21282 = ((AbstractC1788) M3339).f5226;
                            int i4 = 0;
                            M3339 = M3339;
                            c12243 = c12243;
                            while (abstractC21282 != null) {
                                if ((abstractC21282.f6291 & 16) != 0) {
                                    i4++;
                                    c12243 = c12243;
                                    if (i4 == 1) {
                                        M3339 = abstractC21282;
                                    } else {
                                        if (c12243 == 0) {
                                            c12243 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3339 != 0) {
                                            c12243.m2047(M3339);
                                            M3339 = 0;
                                        }
                                        c12243.m2047(abstractC21282);
                                    }
                                }
                                abstractC21282 = abstractC21282.f6288;
                                M3339 = M3339;
                                c12243 = c12243;
                            }
                            if (i4 == 1) {
                            }
                        }
                        M3339 = AbstractC1785.m3339(c12243);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3037(C8065 c8065) {
        C1748 c1748;
        C0263 c0263 = this.f4828;
        boolean z = false;
        z = false;
        z = false;
        if (c0263.m828() != 0) {
            AbstractC2128 abstractC2128 = this.f4830;
            if (abstractC2128.f6279) {
                AbstractC1794 abstractC1794 = abstractC2128.f6286;
                if ((abstractC1794 == null || (c1748 = abstractC1794.f5259) == null) ? false : c1748.m3242()) {
                    C1652 c1652 = this.f4832;
                    c1652.getClass();
                    AbstractC1794 abstractC17942 = this.f4827;
                    abstractC17942.getClass();
                    long j = abstractC17942.f4998;
                    ?? M3339 = abstractC2128;
                    ?? c1224 = 0;
                    while (M3339 != 0) {
                        if (M3339 instanceof InterfaceC1796) {
                            ((InterfaceC1796) M3339).mo1291(c1652, PointerEventPass.Final, j);
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
                    if (abstractC2128.f6279) {
                        C1224 c12242 = this.f4846;
                        Object[] objArr = c12242.f3521;
                        int i2 = c12242.f3520;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C1647) objArr[i3]).m3037(c8065);
                        }
                    }
                    z = true;
                }
            }
        }
        mo3039(c8065);
        c0263.m827();
        this.f4827 = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3038() {
        C1224 c1224 = this.f4846;
        Object[] objArr = c1224.f3521;
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1647) objArr[i2]).m3038();
        }
        ?? M3339 = this.f4830;
        ?? c12242 = 0;
        while (M3339 != 0) {
            if (M3339 instanceof InterfaceC1796) {
                ((InterfaceC1796) M3339).mo1224();
            } else if ((M3339.f6291 & 16) != 0 && (M3339 instanceof AbstractC1788)) {
                AbstractC2128 abstractC2128 = ((AbstractC1788) M3339).f5226;
                int i3 = 0;
                c12242 = c12242;
                M3339 = M3339;
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 16) != 0) {
                        i3++;
                        c12242 = c12242;
                        if (i3 == 1) {
                            M3339 = abstractC2128;
                        } else {
                            if (c12242 == 0) {
                                c12242 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (M3339 != 0) {
                                c12242.m2047(M3339);
                                M3339 = 0;
                            }
                            c12242.m2047(abstractC2128);
                        }
                    }
                    abstractC2128 = abstractC2128.f6288;
                    c12242 = c12242;
                    M3339 = M3339;
                }
                if (i3 == 1) {
                }
            }
            M3339 = AbstractC1785.m3339(c12242);
        }
    }

    @Override // androidx.compose.ui.input.pointer.C1651
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo3039(C8065 c8065) {
        super.mo3039(c8065);
        C1652 c1652 = this.f4832;
        if (c1652 == null) {
            return;
        }
        this.f4831 = this.f4833;
        List list = c1652.f4852;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1643 c1643 = (C1643) list.get(i);
            boolean z = c1643.f4806;
            long j = c1643.f4809;
            boolean zM13551 = c8065.m13551(j);
            boolean z2 = this.f4833;
            if ((!z && !zM13551) || (!z && !z2)) {
                this.f4829.m349(j);
            }
        }
        this.f4833 = false;
        this.f4834 = c1652.f4847 == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // androidx.compose.ui.input.pointer.C1651
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3040(androidx.collection.C0263 r56, androidx.compose.ui.layout.InterfaceC1695 r57, p232.C8065 r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1647.mo3040(androidx.collection.飘花落叶言子楪兰世哲苏, androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世, 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏, boolean):boolean");
    }
}
