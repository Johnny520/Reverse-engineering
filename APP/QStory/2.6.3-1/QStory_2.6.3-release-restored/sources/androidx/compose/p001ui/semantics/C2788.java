package androidx.compose.p001ui.semantics;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.runtime.collection.C2059;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5920;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2788 f6113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2791 f6114;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2583 f6115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f6116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2961 f6117;

    public C2788(AbstractC2961 abstractC2961, boolean z, C2583 c2583, C2791 c2791) {
        this.f6117 = abstractC2961;
        this.f6116 = z;
        this.f6115 = c2583;
        this.f6114 = c2791;
        this.f6112 = c2583.f5468;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ List m4212(int i, C2788 c2788) {
        return c2788.m4229((i & 1) != 0 ? !c2788.f6116 : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2596 m4213() {
        ?? M3899;
        boolean z;
        boolean z2 = this.f6114.f6123;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        C2583 c2583 = this.f6115;
        if (z2) {
            AbstractC2961 abstractC2961 = c2583.f5439.f5628;
            if ((abstractC2961.f6630 & 8) != 0) {
                M3899 = 0;
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 8) != 0) {
                        AbstractC2961 abstractC2961M3899 = abstractC2961;
                        C2059 c2059 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof InterfaceC2596) {
                                InterfaceC2596 interfaceC2596 = (InterfaceC2596) abstractC2961M3899;
                                ?? r0 = M3899;
                                if (interfaceC2596.mo2534()) {
                                    r0 = M3899;
                                    if (interfaceC2596.mo2256()) {
                                        return interfaceC2596;
                                    }
                                    if (M3899 == 0) {
                                        r0 = interfaceC2596;
                                    }
                                }
                                z = false;
                                M3899 = r0;
                            } else {
                                z = true;
                                M3899 = M3899;
                            }
                            if (z && (abstractC2961M3899.f6636 & 8) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i = 0;
                                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                    if ((abstractC29612.f6636 & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC2961M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == null) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c2059.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c2059);
                        }
                    }
                    if ((abstractC2961.f6630 & 8) == 0) {
                        break;
                    }
                    abstractC2961 = abstractC2961.f6633;
                    M3899 = M3899;
                }
                r4 = M3899;
            }
        } else {
            AbstractC2961 abstractC29613 = c2583.f5439.f5628;
            if ((abstractC29613.f6630 & 8) != 0) {
                loop3: while (abstractC29613 != null) {
                    if ((abstractC29613.f6636 & 8) != 0) {
                        M3899 = abstractC29613;
                        ?? c20592 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2596) {
                                if (((InterfaceC2596) M3899).mo2534()) {
                                    r4 = M3899;
                                }
                            } else if ((M3899.f6636 & 8) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29614 = ((AbstractC2623) M3899).f5571;
                                int i2 = 0;
                                M3899 = M3899;
                                c20592 = c20592;
                                while (abstractC29614 != null) {
                                    if ((abstractC29614.f6636 & 8) != 0) {
                                        i2++;
                                        c20592 = c20592;
                                        if (i2 == 1) {
                                            M3899 = abstractC29614;
                                        } else {
                                            if (c20592 == 0) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c20592.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c20592.m2607(abstractC29614);
                                        }
                                    }
                                    abstractC29614 = abstractC29614.f6633;
                                    M3899 = M3899;
                                    c20592 = c20592;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3899 = AbstractC2620.m3899(c20592);
                        }
                    }
                    if ((abstractC29613.f6630 & 8) == 0) {
                        break;
                    }
                    abstractC29613 = abstractC29613.f6633;
                }
            }
        }
        return (InterfaceC2596) r4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4214(ArrayList arrayList, ArrayList arrayList2) {
        m4222(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C2788 c2788 = (C2788) arrayList.get(size2);
            if (c2788.m4223()) {
                arrayList2.add(c2788);
            } else if (!c2788.f6114.f6121) {
                c2788.m4214(arrayList, arrayList2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2629 m4215() {
        if (!m4219()) {
            InterfaceC2596 interfaceC2596M4213 = m4213();
            return interfaceC2596M4213 != null ? AbstractC2620.m3908(interfaceC2596M4213, 8) : this.f6115.f5439.f5631;
        }
        C2788 c2788M4228 = m4228();
        if (c2788M4228 != null) {
            return c2788M4228.m4215();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4216(C2583 c2583, ArrayList arrayList) {
        C2059 c2059M3800 = c2583.m3800();
        Object[] objArr = c2059M3800.f3866;
        int i = c2059M3800.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (c25832.m3803() && !c25832.f5471) {
                if (c25832.f5439.m3988(8)) {
                    arrayList.add(AbstractC2792.m4238(c25832, this.f6116));
                } else {
                    m4216(c25832, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2788 m4217(C2789 c2789, InterfaceC7387 interfaceC7387) {
        C2791 c2791 = new C2791();
        c2791.f6123 = false;
        c2791.f6121 = false;
        interfaceC7387.invoke(c2791);
        C2788 c2788 = new C2788(new C2787(interfaceC7387), false, new C2583(true, this.f6112 + (c2789 != null ? 1000000000 : 2000000000)), c2791);
        c2788.f6113 = this;
        return c2788;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8157 m4218(AbstractC2629 abstractC2629) {
        ?? M3899;
        C2788 c2788M4228 = m4228();
        if (c2788M4228 == null) {
            return C8157.f19881;
        }
        AbstractC2961 abstractC2961 = c2788M4228.f6115.f5439.f5628;
        if ((abstractC2961.f6630 & 8) != 0) {
            loop0: while (abstractC2961 != null) {
                if ((abstractC2961.f6636 & 8) != 0) {
                    M3899 = abstractC2961;
                    ?? c2059 = 0;
                    while (M3899 != 0) {
                        if (M3899 instanceof InterfaceC2596) {
                            if (((InterfaceC2596) M3899).mo2534()) {
                                break loop0;
                            }
                        } else if ((M3899.f6636 & 8) != 0 && (M3899 instanceof AbstractC2623)) {
                            AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                            int i = 0;
                            M3899 = M3899;
                            c2059 = c2059;
                            while (abstractC29612 != null) {
                                if ((abstractC29612.f6636 & 8) != 0) {
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
                if ((abstractC2961.f6630 & 8) == 0) {
                    break;
                }
                abstractC2961 = abstractC2961.f6633;
            }
            M3899 = 0;
        } else {
            M3899 = 0;
        }
        InterfaceC2596 interfaceC2596 = (InterfaceC2596) M3899;
        AbstractC2629 abstractC2629M3908 = interfaceC2596 != null ? AbstractC2620.m3908(interfaceC2596, 8) : null;
        return abstractC2629M3908 == null ? c2788M4228.m4218(abstractC2629) : abstractC2629M3908.mo3649(abstractC2629, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m4219() {
        return this.f6113 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8157 m4220() {
        InterfaceC2622 interfaceC2622M4213 = m4213();
        if (interfaceC2622M4213 == null) {
            return this.f6115.f5439.f5631.m3945();
        }
        return AbstractC2620.m3920(((AbstractC2961) interfaceC2622M4213).f6637, AbstractC2792.m4233(this.f6114, AbstractC2794.f6137) != null, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4221(ArrayList arrayList, C2791 c2791) {
        if (this.f6114.f6121) {
            return;
        }
        m4222(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C2788 c2788 = (C2788) arrayList.get(size2);
            if (!c2788.m4223()) {
                c2791.m4230(c2788.f6114);
                c2788.m4221(arrayList, c2791);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List m4222(ArrayList arrayList, boolean z) {
        if (m4219()) {
            return EmptyList.INSTANCE;
        }
        m4216(this.f6115, arrayList);
        if (z) {
            C2782 c2782 = AbstractC2778.f6066;
            C2791 c2791 = this.f6114;
            final C2789 c2789 = (C2789) AbstractC2792.m4233(c2791, c2782);
            if (c2789 != null && c2791.f6123 && !arrayList.isEmpty()) {
                arrayList.add(m4217(c2789, new InterfaceC7387() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((InterfaceC2779) obj);
                        return C6008.f15084;
                    }

                    public final void invoke(InterfaceC2779 interfaceC2779) {
                        AbstractC2781.m4205(interfaceC2779, c2789.f6118);
                    }
                }));
            }
            C2782 c27822 = AbstractC2778.f6079;
            if (c2791.f6124.m1312(c27822) && !arrayList.isEmpty() && c2791.f6123) {
                List list = (List) AbstractC2792.m4233(c2791, c27822);
                final String str = list != null ? (String) AbstractC5176.m9374(list) : null;
                if (str != null) {
                    arrayList.add(0, m4217(null, new InterfaceC7387() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void invoke(InterfaceC2779 interfaceC2779) {
                            String str2 = str;
                            InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
                            interfaceC2779.mo4150(AbstractC2778.f6079, AbstractC7176.m12487(str2));
                        }

                        @Override // p068.InterfaceC7387
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((InterfaceC2779) obj);
                            return C6008.f15084;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m4223() {
        return this.f6116 && this.f6114.f6123;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m4224() {
        if (m4219() || !m4212(4, this).isEmpty()) {
            return false;
        }
        C2583 c2583M3816 = this.f6115.m3816();
        while (true) {
            if (c2583M3816 == null) {
                c2583M3816 = null;
                break;
            }
            C2791 c2791M3814 = c2583M3816.m3814();
            if (c2791M3814 != null && c2791M3814.f6123) {
                break;
            }
            c2583M3816 = c2583M3816.m3816();
        }
        return c2583M3816 == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8157 m4225() {
        AbstractC2629 abstractC2629M4215 = m4215();
        if (abstractC2629M4215 != null) {
            if (!abstractC2629M4215.mo3842().f6624) {
                abstractC2629M4215 = null;
            }
            if (abstractC2629M4215 != null) {
                return AbstractC2505.m3659(abstractC2629M4215, true);
            }
        }
        return C8157.f19881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8157 m4226() {
        AbstractC2629 abstractC2629M4215 = m4215();
        if (abstractC2629M4215 != null) {
            if (!abstractC2629M4215.mo3842().f6624) {
                abstractC2629M4215 = null;
            }
            if (abstractC2629M4215 != null) {
                return AbstractC2505.m3673(abstractC2629M4215).mo3649(abstractC2629M4215, true);
            }
        }
        return C8157.f19881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2791 m4227() {
        boolean zM4223 = m4223();
        C2791 c2791 = this.f6114;
        if (!zM4223) {
            return c2791;
        }
        C2791 c2791M4232 = c2791.m4232();
        m4221(new ArrayList(), c2791M4232);
        return c2791M4232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2788 m4228() {
        C2583 c2583M3816;
        C2788 c2788 = this.f6113;
        if (c2788 != null) {
            return c2788;
        }
        C2583 c2583 = this.f6115;
        boolean z = this.f6116;
        if (z) {
            c2583M3816 = c2583.m3816();
            while (c2583M3816 != null) {
                C2791 c2791M3814 = c2583M3816.m3814();
                if (c2791M3814 != null && c2791M3814.f6123) {
                    break;
                }
                c2583M3816 = c2583M3816.m3816();
            }
            c2583M3816 = null;
        } else {
            c2583M3816 = null;
        }
        if (c2583M3816 == null) {
            C2583 c2583M38162 = c2583.m3816();
            while (true) {
                if (c2583M38162 == null) {
                    c2583M3816 = null;
                    break;
                }
                if (c2583M38162.f5439.m3988(8)) {
                    c2583M3816 = c2583M38162;
                    break;
                }
                c2583M38162 = c2583M38162.m3816();
            }
        }
        if (c2583M3816 == null) {
            return null;
        }
        return AbstractC2792.m4238(c2583M3816, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List m4229(boolean z, boolean z2) {
        if (!z && this.f6114.f6121) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (!m4223()) {
            return m4222(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m4214(arrayList, arrayList2);
        return arrayList2;
    }
}
