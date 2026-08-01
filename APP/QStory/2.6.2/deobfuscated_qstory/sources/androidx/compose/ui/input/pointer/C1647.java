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
import p232.C8064;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1647 extends C1651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC1794 f4826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0263 f4827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0107 f4828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2128 f4829;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4830;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1652 f4831;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f4832;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f4833;

    public C1647(AbstractC2128 abstractC2128) {
        this.f4829 = abstractC2128;
        C0107 c0107 = new C0107((byte) 0, 10);
        c0107.f315 = new long[2];
        this.f4828 = c0107;
        this.f4827 = new C0263(2);
        this.f4832 = true;
        this.f4833 = true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f4829 + ", children=" + this.f4845 + ", pointerIds=" + this.f4828 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3025(long j, C0244 c0244) {
        C0107 c0107 = this.f4828;
        if (c0107.m338(j) && c0244.m879(this) < 0) {
            c0107.m348(j);
            this.f4827.m821(j);
        }
        C1224 c1224 = this.f4845;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1647) objArr[i2]).m3025(j, c0244);
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
    public final boolean m3026(C8064 c8064, boolean z) {
        C1748 c1748;
        if (this.f4827.m827() == 0) {
            return false;
        }
        ?? M3329 = this.f4829;
        if (M3329.f6278) {
            AbstractC1794 abstractC1794 = M3329.f6285;
            if ((abstractC1794 == null || (c1748 = abstractC1794.f5258) == null) ? false : c1748.m3232()) {
                C1652 c1652 = this.f4831;
                c1652.getClass();
                AbstractC1794 abstractC17942 = this.f4826;
                abstractC17942.getClass();
                long j = abstractC17942.f4997;
                ?? M33292 = M3329;
                ?? c1224 = 0;
                while (M33292 != 0) {
                    if (M33292 instanceof InterfaceC1796) {
                        ((InterfaceC1796) M33292).mo1281(c1652, PointerEventPass.Initial, j);
                    } else if ((M33292.f6290 & 16) != 0 && (M33292 instanceof AbstractC1788)) {
                        AbstractC2128 abstractC2128 = ((AbstractC1788) M33292).f5225;
                        int i = 0;
                        M33292 = M33292;
                        c1224 = c1224;
                        while (abstractC2128 != null) {
                            if ((abstractC2128.f6290 & 16) != 0) {
                                i++;
                                c1224 = c1224;
                                if (i == 1) {
                                    M33292 = abstractC2128;
                                } else {
                                    if (c1224 == 0) {
                                        c1224 = new C1224(0, new AbstractC2128[16]);
                                    }
                                    if (M33292 != 0) {
                                        c1224.m2037(M33292);
                                        M33292 = 0;
                                    }
                                    c1224.m2037(abstractC2128);
                                }
                            }
                            abstractC2128 = abstractC2128.f6287;
                            M33292 = M33292;
                            c1224 = c1224;
                        }
                        if (i == 1) {
                        }
                    }
                    M33292 = AbstractC1785.m3329(c1224);
                }
                if (M3329.f6278) {
                    C1224 c12242 = this.f4845;
                    Object[] objArr = c12242.f3520;
                    int i2 = c12242.f3519;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C1647 c1647 = (C1647) objArr[i3];
                        this.f4826.getClass();
                        c1647.m3026(c8064, z);
                    }
                }
                if (M3329.f6278) {
                    ?? c12243 = 0;
                    while (M3329 != 0) {
                        if (M3329 instanceof InterfaceC1796) {
                            ((InterfaceC1796) M3329).mo1281(c1652, PointerEventPass.Main, j);
                        } else if ((M3329.f6290 & 16) != 0 && (M3329 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC21282 = ((AbstractC1788) M3329).f5225;
                            int i4 = 0;
                            M3329 = M3329;
                            c12243 = c12243;
                            while (abstractC21282 != null) {
                                if ((abstractC21282.f6290 & 16) != 0) {
                                    i4++;
                                    c12243 = c12243;
                                    if (i4 == 1) {
                                        M3329 = abstractC21282;
                                    } else {
                                        if (c12243 == 0) {
                                            c12243 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3329 != 0) {
                                            c12243.m2037(M3329);
                                            M3329 = 0;
                                        }
                                        c12243.m2037(abstractC21282);
                                    }
                                }
                                abstractC21282 = abstractC21282.f6287;
                                M3329 = M3329;
                                c12243 = c12243;
                            }
                            if (i4 == 1) {
                            }
                        }
                        M3329 = AbstractC1785.m3329(c12243);
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
    public final boolean m3027(C8064 c8064) {
        C1748 c1748;
        C0263 c0263 = this.f4827;
        boolean z = false;
        z = false;
        z = false;
        if (c0263.m827() != 0) {
            AbstractC2128 abstractC2128 = this.f4829;
            if (abstractC2128.f6278) {
                AbstractC1794 abstractC1794 = abstractC2128.f6285;
                if ((abstractC1794 == null || (c1748 = abstractC1794.f5258) == null) ? false : c1748.m3232()) {
                    C1652 c1652 = this.f4831;
                    c1652.getClass();
                    AbstractC1794 abstractC17942 = this.f4826;
                    abstractC17942.getClass();
                    long j = abstractC17942.f4997;
                    ?? M3329 = abstractC2128;
                    ?? c1224 = 0;
                    while (M3329 != 0) {
                        if (M3329 instanceof InterfaceC1796) {
                            ((InterfaceC1796) M3329).mo1281(c1652, PointerEventPass.Final, j);
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
                    if (abstractC2128.f6278) {
                        C1224 c12242 = this.f4845;
                        Object[] objArr = c12242.f3520;
                        int i2 = c12242.f3519;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C1647) objArr[i3]).m3027(c8064);
                        }
                    }
                    z = true;
                }
            }
        }
        mo3029(c8064);
        c0263.m826();
        this.f4826 = null;
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
    public final void m3028() {
        C1224 c1224 = this.f4845;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1647) objArr[i2]).m3028();
        }
        ?? M3329 = this.f4829;
        ?? c12242 = 0;
        while (M3329 != 0) {
            if (M3329 instanceof InterfaceC1796) {
                ((InterfaceC1796) M3329).mo1214();
            } else if ((M3329.f6290 & 16) != 0 && (M3329 instanceof AbstractC1788)) {
                AbstractC2128 abstractC2128 = ((AbstractC1788) M3329).f5225;
                int i3 = 0;
                c12242 = c12242;
                M3329 = M3329;
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 16) != 0) {
                        i3++;
                        c12242 = c12242;
                        if (i3 == 1) {
                            M3329 = abstractC2128;
                        } else {
                            if (c12242 == 0) {
                                c12242 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (M3329 != 0) {
                                c12242.m2037(M3329);
                                M3329 = 0;
                            }
                            c12242.m2037(abstractC2128);
                        }
                    }
                    abstractC2128 = abstractC2128.f6287;
                    c12242 = c12242;
                    M3329 = M3329;
                }
                if (i3 == 1) {
                }
            }
            M3329 = AbstractC1785.m3329(c12242);
        }
    }

    @Override // androidx.compose.ui.input.pointer.C1651
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo3029(C8064 c8064) {
        super.mo3029(c8064);
        C1652 c1652 = this.f4831;
        if (c1652 == null) {
            return;
        }
        this.f4830 = this.f4832;
        List list = c1652.f4851;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1643 c1643 = (C1643) list.get(i);
            boolean z = c1643.f4805;
            long j = c1643.f4808;
            boolean zM13522 = c8064.m13522(j);
            boolean z2 = this.f4832;
            if ((!z && !zM13522) || (!z && !z2)) {
                this.f4828.m348(j);
            }
        }
        this.f4832 = false;
        this.f4833 = c1652.f4846 == 5;
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
    public final boolean mo3030(androidx.collection.C0263 r56, androidx.compose.ui.layout.InterfaceC1695 r57, p232.C8064 r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1647.mo3030(androidx.collection.飘花落叶言子楪兰世哲苏, androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世, 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏, boolean):boolean");
    }
}
