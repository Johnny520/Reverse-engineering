package androidx.compose.p001ui.input.pointer;

import androidx.appcompat.app.C0954;
import androidx.collection.C1091;
import androidx.collection.C1110;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.runtime.collection.C2059;
import java.util.ArrayList;
import java.util.List;
import p128.C8158;
import p248.C8894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2482 extends C2486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC2629 f5172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1110 f5173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0954 f5174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2961 f5175;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5176;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2487 f5177;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f5178;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f5179;

    public C2482(AbstractC2961 abstractC2961) {
        this.f5175 = abstractC2961;
        C0954 c0954 = new C0954((byte) 0, 10);
        c0954.f660 = new long[2];
        this.f5174 = c0954;
        this.f5173 = new C1110(2);
        this.f5178 = true;
        this.f5179 = true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f5175 + ", children=" + this.f5191 + ", pointerIds=" + this.f5174 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3595(long j, C1091 c1091) {
        C0954 c0954 = this.f5174;
        if (c0954.m899(j) && c1091.m1440(this) < 0) {
            c0954.m909(j);
            this.f5173.m1382(j);
        }
        C2059 c2059 = this.f5191;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2482) objArr[i2]).m3595(j, c1091);
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
    public final boolean m3596(C8894 c8894, boolean z) {
        C2583 c2583;
        if (this.f5173.m1388() == 0) {
            return false;
        }
        ?? M3899 = this.f5175;
        if (M3899.f6624) {
            AbstractC2629 abstractC2629 = M3899.f6631;
            if ((abstractC2629 == null || (c2583 = abstractC2629.f5604) == null) ? false : c2583.m3802()) {
                C2487 c2487 = this.f5177;
                c2487.getClass();
                AbstractC2629 abstractC26292 = this.f5172;
                abstractC26292.getClass();
                long j = abstractC26292.f5343;
                ?? M38992 = M3899;
                ?? c2059 = 0;
                while (M38992 != 0) {
                    if (M38992 instanceof InterfaceC2631) {
                        ((InterfaceC2631) M38992).mo1851(c2487, PointerEventPass.Initial, j);
                    } else if ((M38992.f6636 & 16) != 0 && (M38992 instanceof AbstractC2623)) {
                        AbstractC2961 abstractC2961 = ((AbstractC2623) M38992).f5571;
                        int i = 0;
                        M38992 = M38992;
                        c2059 = c2059;
                        while (abstractC2961 != null) {
                            if ((abstractC2961.f6636 & 16) != 0) {
                                i++;
                                c2059 = c2059;
                                if (i == 1) {
                                    M38992 = abstractC2961;
                                } else {
                                    if (c2059 == 0) {
                                        c2059 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (M38992 != 0) {
                                        c2059.m2607(M38992);
                                        M38992 = 0;
                                    }
                                    c2059.m2607(abstractC2961);
                                }
                            }
                            abstractC2961 = abstractC2961.f6633;
                            M38992 = M38992;
                            c2059 = c2059;
                        }
                        if (i == 1) {
                        }
                    }
                    M38992 = AbstractC2620.m3899(c2059);
                }
                if (M3899.f6624) {
                    C2059 c20592 = this.f5191;
                    Object[] objArr = c20592.f3866;
                    int i2 = c20592.f3865;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C2482 c2482 = (C2482) objArr[i3];
                        this.f5172.getClass();
                        c2482.m3596(c8894, z);
                    }
                }
                if (M3899.f6624) {
                    ?? c20593 = 0;
                    while (M3899 != 0) {
                        if (M3899 instanceof InterfaceC2631) {
                            ((InterfaceC2631) M3899).mo1851(c2487, PointerEventPass.Main, j);
                        } else if ((M3899.f6636 & 16) != 0 && (M3899 instanceof AbstractC2623)) {
                            AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                            int i4 = 0;
                            M3899 = M3899;
                            c20593 = c20593;
                            while (abstractC29612 != null) {
                                if ((abstractC29612.f6636 & 16) != 0) {
                                    i4++;
                                    c20593 = c20593;
                                    if (i4 == 1) {
                                        M3899 = abstractC29612;
                                    } else {
                                        if (c20593 == 0) {
                                            c20593 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (M3899 != 0) {
                                            c20593.m2607(M3899);
                                            M3899 = 0;
                                        }
                                        c20593.m2607(abstractC29612);
                                    }
                                }
                                abstractC29612 = abstractC29612.f6633;
                                M3899 = M3899;
                                c20593 = c20593;
                            }
                            if (i4 == 1) {
                            }
                        }
                        M3899 = AbstractC2620.m3899(c20593);
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
    public final boolean m3597(C8894 c8894) {
        C2583 c2583;
        C1110 c1110 = this.f5173;
        boolean z = false;
        z = false;
        z = false;
        if (c1110.m1388() != 0) {
            AbstractC2961 abstractC2961 = this.f5175;
            if (abstractC2961.f6624) {
                AbstractC2629 abstractC2629 = abstractC2961.f6631;
                if ((abstractC2629 == null || (c2583 = abstractC2629.f5604) == null) ? false : c2583.m3802()) {
                    C2487 c2487 = this.f5177;
                    c2487.getClass();
                    AbstractC2629 abstractC26292 = this.f5172;
                    abstractC26292.getClass();
                    long j = abstractC26292.f5343;
                    ?? M3899 = abstractC2961;
                    ?? c2059 = 0;
                    while (M3899 != 0) {
                        if (M3899 instanceof InterfaceC2631) {
                            ((InterfaceC2631) M3899).mo1851(c2487, PointerEventPass.Final, j);
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
                    if (abstractC2961.f6624) {
                        C2059 c20592 = this.f5191;
                        Object[] objArr = c20592.f3866;
                        int i2 = c20592.f3865;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C2482) objArr[i3]).m3597(c8894);
                        }
                    }
                    z = true;
                }
            }
        }
        mo3599(c8894);
        c1110.m1387();
        this.f5172 = null;
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
    public final void m3598() {
        C2059 c2059 = this.f5191;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2482) objArr[i2]).m3598();
        }
        ?? M3899 = this.f5175;
        ?? c20592 = 0;
        while (M3899 != 0) {
            if (M3899 instanceof InterfaceC2631) {
                ((InterfaceC2631) M3899).mo1784();
            } else if ((M3899.f6636 & 16) != 0 && (M3899 instanceof AbstractC2623)) {
                AbstractC2961 abstractC2961 = ((AbstractC2623) M3899).f5571;
                int i3 = 0;
                c20592 = c20592;
                M3899 = M3899;
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 16) != 0) {
                        i3++;
                        c20592 = c20592;
                        if (i3 == 1) {
                            M3899 = abstractC2961;
                        } else {
                            if (c20592 == 0) {
                                c20592 = new C2059(0, new AbstractC2961[16]);
                            }
                            if (M3899 != 0) {
                                c20592.m2607(M3899);
                                M3899 = 0;
                            }
                            c20592.m2607(abstractC2961);
                        }
                    }
                    abstractC2961 = abstractC2961.f6633;
                    c20592 = c20592;
                    M3899 = M3899;
                }
                if (i3 == 1) {
                }
            }
            M3899 = AbstractC2620.m3899(c20592);
        }
    }

    @Override // androidx.compose.p001ui.input.pointer.C2486
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo3599(C8894 c8894) {
        super.mo3599(c8894);
        C2487 c2487 = this.f5177;
        if (c2487 == null) {
            return;
        }
        this.f5176 = this.f5178;
        List list = c2487.f5197;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2478 c2478 = (C2478) list.get(i);
            boolean z = c2478.f5151;
            long j = c2478.f5154;
            boolean zM14110 = c8894.m14110(j);
            boolean z2 = this.f5178;
            if ((!z && !zM14110) || (!z && !z2)) {
                this.f5174.m909(j);
            }
        }
        this.f5178 = false;
        this.f5179 = c2487.f5192 == 5;
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
    @Override // androidx.compose.p001ui.input.pointer.C2486
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3600(C1110 c1110, InterfaceC2530 interfaceC2530, C8894 c8894, boolean z) {
        C0954 c0954;
        C1110 c11102;
        Object obj;
        boolean z2;
        boolean z3;
        C2487 c2487;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        C2478 c2478;
        InterfaceC2530 interfaceC25302 = interfaceC2530;
        boolean zMo3600 = super.mo3600(c1110, interfaceC2530, c8894, z);
        ?? M3899 = this.f5175;
        boolean z6 = true;
        if (M3899.f6624) {
            ?? c2059 = 0;
            while (M3899 != 0) {
                if (M3899 instanceof InterfaceC2631) {
                    this.f5172 = AbstractC2620.m3908((InterfaceC2631) M3899, 16);
                } else if ((M3899.f6636 & 16) != 0 && (M3899 instanceof AbstractC2623)) {
                    AbstractC2961 abstractC2961 = ((AbstractC2623) M3899).f5571;
                    int i6 = 0;
                    M3899 = M3899;
                    c2059 = c2059;
                    while (abstractC2961 != null) {
                        if ((abstractC2961.f6636 & 16) != 0) {
                            i6++;
                            c2059 = c2059;
                            if (i6 == 1) {
                                M3899 = abstractC2961;
                            } else {
                                if (c2059 == 0) {
                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                }
                                if (M3899 != 0) {
                                    c2059.m2607(M3899);
                                    M3899 = 0;
                                }
                                c2059.m2607(abstractC2961);
                            }
                        }
                        abstractC2961 = abstractC2961.f6633;
                        M3899 = M3899;
                        c2059 = c2059;
                    }
                    if (i6 == 1) {
                    }
                }
                M3899 = AbstractC2620.m3899(c2059);
            }
            if (this.f5172 != null) {
                int iM1388 = c1110.m1388();
                int i7 = 0;
                while (true) {
                    c0954 = this.f5174;
                    c11102 = this.f5173;
                    if (i7 >= iM1388) {
                        break;
                    }
                    long jM1384 = c1110.m1384(i7);
                    C2478 c24782 = (C2478) c1110.m1389(i7);
                    if (c0954.m899(jM1384)) {
                        boolean z7 = z6;
                        long j = c24782.f5161;
                        long j2 = c24782.f5152;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            z4 = zMo3600;
                            ArrayList arrayList = new ArrayList(c24782.m3583().size());
                            List listM3583 = c24782.m3583();
                            i3 = iM1388;
                            int size = listM3583.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list = listM3583;
                                C2467 c2467 = (C2467) listM3583.get(i8);
                                C1110 c11103 = c11102;
                                long j3 = jM1384;
                                long j4 = c2467.f5122;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    c2478 = c24782;
                                    long j5 = c2467.f5123;
                                    i5 = size;
                                    AbstractC2629 abstractC2629 = this.f5172;
                                    abstractC2629.getClass();
                                    arrayList.add(new C2467(j5, abstractC2629.mo3645(interfaceC25302, j4), c2467.f5121, c2467.f5120, c2467.f5119));
                                } else {
                                    i5 = size;
                                    c2478 = c24782;
                                }
                                i8++;
                                size = i5;
                                listM3583 = list;
                                c11102 = c11103;
                                jM1384 = j3;
                                c24782 = c2478;
                            }
                            C1110 c11104 = c11102;
                            long j6 = jM1384;
                            AbstractC2629 abstractC26292 = this.f5172;
                            abstractC26292.getClass();
                            long jMo3645 = abstractC26292.mo3645(interfaceC25302, j);
                            AbstractC2629 abstractC26293 = this.f5172;
                            abstractC26293.getClass();
                            C2478 c24783 = new C2478(c24782.f5154, c24782.f5153, abstractC26293.mo3645(interfaceC25302, j2), c24782.f5151, c24782.f5150, c24782.f5149, jMo3645, c24782.f5160, c24782.f5164, arrayList, c24782.f5165, c24782.f5162, c24782.f5163, c24782.f5155);
                            C2478 c24784 = c24782.f5157;
                            if (c24784 == null) {
                                c24784 = c24782;
                            }
                            c24783.f5157 = c24784;
                            C2478 c24785 = c24782.f5157;
                            if (c24785 != null) {
                                c24782 = c24785;
                            }
                            c24783.f5157 = c24782;
                            c11104.m1383(c24783, j6);
                        } else {
                            z4 = zMo3600;
                            i3 = iM1388;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zMo3600;
                        i3 = iM1388;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    interfaceC25302 = interfaceC2530;
                    z6 = z5;
                    iM1388 = i3;
                    zMo3600 = z4;
                }
                boolean z8 = zMo3600;
                boolean z9 = z6;
                if (c11102.m1388() == 0) {
                    c0954.f659 = 0;
                    this.f5191.m2612();
                    return z9;
                }
                int i9 = c0954.f659;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    if (c1110.m1385(((long[]) c0954.f660)[i9]) < 0 && i9 < (i2 = c0954.f659)) {
                        int i10 = i2 - 1;
                        int i11 = i9;
                        while (i11 < i10) {
                            long[] jArr = (long[]) c0954.f660;
                            int i12 = i11 + 1;
                            jArr[i11] = jArr[i12];
                            i11 = i12;
                        }
                        c0954.f659--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c11102.m1388());
                int iM13882 = c11102.m1388();
                for (int i13 = 0; i13 < iM13882; i13++) {
                    arrayList2.add(c11102.m1389(i13));
                }
                C2487 c24872 = new C2487(arrayList2, c8894);
                int size2 = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i14);
                    if (c8894.m14110(((C2478) obj).f5154)) {
                        break;
                    }
                    i14++;
                }
                C2478 c24786 = (C2478) obj;
                if (c24786 != null) {
                    boolean z10 = c24786.f5151;
                    if (z) {
                        z2 = false;
                        if (!this.f5178 && (z10 || c24786.f5160)) {
                            AbstractC2629 abstractC26294 = this.f5172;
                            abstractC26294.getClass();
                            long j7 = abstractC26294.f5343;
                            long j8 = c24786.f5152;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i15 = (int) (j7 >> 32);
                            this.f5178 = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat > ((float) i15) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.f5178 = false;
                    }
                    boolean z11 = this.f5178;
                    boolean z12 = this.f5176;
                    if (z11 == z12 || !((i = c24872.f5192) == 3 || i == 4 || i == 5)) {
                        int i16 = c24872.f5192;
                        if (i16 == 4 && z12 && !this.f5179) {
                            c24872.f5192 = 3;
                        } else if (i16 == 5 && z11 && z10) {
                            c24872.f5192 = 3;
                        }
                    } else {
                        c24872.f5192 = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || c24872.f5192 != 3 || (c2487 = this.f5177) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = c2487.f5197;
                int size3 = r1.size();
                ?? r5 = c24872.f5197;
                if (size3 == r5.size()) {
                    int size4 = r5.size();
                    for (?? r6 = z2; r6 < size4; r6++) {
                        if (!C8158.m13087(((C2478) r1.get(r6)).f5152, ((C2478) r5.get(r6)).f5152)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.f5177 = c24872;
                return z3;
            }
        }
        return true;
    }
}
