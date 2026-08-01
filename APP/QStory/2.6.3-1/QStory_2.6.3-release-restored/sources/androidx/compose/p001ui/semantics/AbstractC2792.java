package androidx.compose.p001ui.semantics;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1120;
import androidx.collection.C1083;
import androidx.collection.C1093;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2606;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8157;
import p191.AbstractC8568;
import p221.C8734;
import p332.C9496;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2792 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8157 f6125 = new C8157(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m4233(C2791 c2791, C2782 c2782) {
        SemanticsConfigurationKt$getOrNull$1 semanticsConfigurationKt$getOrNull$1 = new InterfaceC7372() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                return null;
            }
        };
        Object objM1317 = c2791.f6124.m1317(c2782);
        return objM1317 == null ? semanticsConfigurationKt$getOrNull$1.invoke() : objM1317;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4234(C0960 c0960, C0960 c09602, C1093 c1093, C2788 c2788, C2788 c27882, InterfaceC7387 interfaceC7387) {
        AbstractC2629 abstractC2629;
        boolean z;
        C8157 c8157M3920;
        AbstractC2629 abstractC2629M4215;
        C1093 c10932 = c1093;
        C2788 c27883 = c2788;
        InterfaceC7387 interfaceC73872 = interfaceC7387;
        int i = c27883.f6112;
        Region region = (Region) c0960.f702;
        C0960 c09603 = c09602;
        Region region2 = (Region) c09603.f702;
        C2583 c2583 = c27882.f6115;
        C2791 c2791 = c27882.f6114;
        C2583 c25832 = c27882.f6115;
        int i2 = c27882.f6112;
        boolean z2 = (c2583.m3802() && c25832.m3803()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || c27882.m4219()) {
                C8734 c8734M14922 = C9496.m14922(c27882.m4220());
                c0960.m992(c8734M14922);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c27882.m4219()) {
                        m4235(c1093, c2788, c27882);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            c10932.m1350(i2, new C2785(c27882, new C8734(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c10932.m1350(i2, new C2785(c27882, new C8734(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM4212 = C2788.m4212(4, c27882);
                if (c2791.f6123) {
                    C2788 c2788M4228 = c27882.m4228();
                    while (true) {
                        abstractC2629 = null;
                        abstractC2629 = null;
                        if (c2788M4228 == null) {
                            c2788M4228 = null;
                            break;
                        }
                        C1083 c1083 = c2788M4228.f6114.f6124;
                        if (c1083.m1312(AbstractC2778.f6082) || c1083.m1312(AbstractC2778.f6085)) {
                            break;
                        } else {
                            c2788M4228 = c2788M4228.m4228();
                        }
                    }
                    if (c2788M4228 == null) {
                        z = false;
                        if (z) {
                            C0960 c09604 = new C0960(26);
                            InterfaceC2596 interfaceC2596M4213 = c27882.m4213();
                            if (interfaceC2596M4213 == null) {
                                C2606 c2606 = c25832.f5439.f5631;
                                c8157M3920 = AbstractC2505.m3673(c2606).mo3649(c2606, false);
                            } else {
                                c8157M3920 = AbstractC2620.m3920(((AbstractC2961) interfaceC2596M4213).f6637, m4233(c2791, AbstractC2794.f6137) != null, false);
                            }
                            c09604.m992(C9496.m14922(c8157M3920));
                            int size = listM4212.size() - 1;
                            while (-1 < size) {
                                if (!((Boolean) interfaceC73872.invoke(listM4212.get(size))).booleanValue()) {
                                    m4236(new C0960(26), c09604, c10932, c27883, (C2788) listM4212.get(size), interfaceC73872);
                                }
                                size--;
                                c10932 = c1093;
                                c27883 = c2788;
                            }
                        } else {
                            int size2 = listM4212.size() - 1;
                            while (-1 < size2) {
                                if (!((Boolean) interfaceC73872.invoke(listM4212.get(size2))).booleanValue()) {
                                    m4234(c0960, c09603, c1093, c2788, (C2788) listM4212.get(size2), interfaceC73872);
                                }
                                size2--;
                                c09603 = c09602;
                                interfaceC73872 = interfaceC7387;
                            }
                        }
                    } else {
                        AbstractC2629 abstractC2629M42152 = c27882.m4215();
                        if (abstractC2629M42152 == null) {
                            abstractC2629M42152 = null;
                            abstractC2629M4215 = c2788M4228.m4215();
                            if (abstractC2629M4215 != null) {
                                if (!abstractC2629M4215.mo3842().f6624) {
                                    abstractC2629M4215 = null;
                                }
                                if (abstractC2629M4215 != null) {
                                    abstractC2629 = abstractC2629M4215;
                                }
                            }
                            if (abstractC2629M42152 == null && abstractC2629 != null) {
                                C8157 c8157Mo3649 = abstractC2629.mo3649(abstractC2629M42152, false);
                                z = !c8157Mo3649.equals(c8157Mo3649.m13076(AbstractC8568.m13629(0L, AbstractC1298.m1700(abstractC2629.f5343))));
                            }
                            if (z) {
                            }
                        } else {
                            if (!abstractC2629M42152.mo3842().f6624) {
                                abstractC2629M42152 = null;
                            }
                            if (abstractC2629M42152 == null) {
                            }
                            abstractC2629M4215 = c2788M4228.m4215();
                            if (abstractC2629M4215 != null) {
                            }
                            if (abstractC2629M42152 == null) {
                                z = false;
                                if (z) {
                                }
                            }
                        }
                    }
                }
                if (m4239(c27882)) {
                    region2.op(c8734M14922.f22223, c8734M14922.f22222, c8734M14922.f22221, c8734M14922.f22220, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m4235(C1093 c1093, C2788 c2788, C2788 c27882) {
        C2583 c2583;
        C2788 c2788M4228 = c27882.m4228();
        C8157 c8157M4226 = (c2788M4228 == null || (c2583 = c2788M4228.f6115) == null || !c2583.m3802()) ? f6125 : c2788M4228.m4226();
        int i = c27882.f6112;
        if (i == c2788.f6112) {
            i = -1;
        }
        c1093.m1350(i, new C2785(c27882, C9496.m14922(c8157M4226)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m4236(C0960 c0960, C0960 c09602, C1093 c1093, C2788 c2788, C2788 c27882, InterfaceC7387 interfaceC7387) {
        C0960 c09603 = c0960;
        Region region = (Region) c09603.f702;
        C0960 c09604 = c09602;
        Region region2 = (Region) c09604.f702;
        C2583 c2583 = c27882.f6115;
        C2583 c25832 = c27882.f6115;
        if (!c2583.m3802() || !c25832.m3803() || region2.isEmpty()) {
            if (c27882.m4219()) {
                m4235(c1093, c2788, c27882);
                return;
            }
            return;
        }
        C8157 c8157M4220 = c27882.m4220();
        if (c8157M4220.m13075()) {
            InterfaceC2622 interfaceC2622M4213 = c27882.m4213();
            if (interfaceC2622M4213 == null) {
                C2606 c2606 = c25832.f5439.f5631;
                c8157M4220 = AbstractC2505.m3673(c2606).mo3649(c2606, false);
            } else {
                c8157M4220 = AbstractC2620.m3920(((AbstractC2961) interfaceC2622M4213).f6637, m4233(c27882.f6114, AbstractC2794.f6137) != null, false);
            }
        }
        C8734 c8734M14922 = C9496.m14922(c8157M4220);
        c09603.m992(c8734M14922);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = c27882.f6112;
            C2788 c27883 = c2788;
            if (i == c27883.f6112) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            C2785 c2785 = new C2785(c27882, new C8734(bounds.left, bounds.top, bounds.right, bounds.bottom));
            C1093 c10932 = c1093;
            c10932.m1350(i, c2785);
            List listM4212 = C2788.m4212(4, c27882);
            int size = listM4212.size() - 1;
            while (-1 < size) {
                if (!((Boolean) interfaceC7387.invoke(listM4212.get(size))).booleanValue()) {
                    m4236(c09603, c09604, c10932, c27883, (C2788) listM4212.get(size), interfaceC7387);
                }
                size--;
                c09603 = c0960;
                c09604 = c09602;
                c10932 = c1093;
                c27883 = c2788;
            }
            if (m4239(c27882)) {
                region2.op(c8734M14922.f22223, c8734M14922.f22222, c8734M14922.f22221, c8734M14922.f22220, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1093 m4237(C2786 c2786, InterfaceC7387 interfaceC7387) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C2788 c2788M4211 = c2786.m4211();
            C2583 c2583 = c2788M4211.f6115;
            if (c2583.m3802() && c2583.m3803()) {
                C8157 c8157M4226 = c2788M4211.m4226();
                C1093 c1093 = new C1093(48);
                C0960 c0960 = new C0960(26);
                c0960.m992(C9496.m14922(c8157M4226));
                m4234(new C0960(26), c0960, c1093, c2788M4211, c2788M4211, interfaceC7387);
                return c1093;
            }
            C1093 c10932 = AbstractC1120.f1323;
            c10932.getClass();
            return c10932;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:4:0x000b->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0062], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2788 m4238(C2583 c2583, boolean z) {
        AbstractC2961 abstractC2961 = c2583.f5439.f5628;
        InterfaceC2622 interfaceC2622 = null;
        if ((abstractC2961.f6630 & 8) != 0) {
            loop0: while (true) {
                if (abstractC2961 == null) {
                    break;
                }
                if ((abstractC2961.f6636 & 8) != 0) {
                    AbstractC2961 abstractC2961M3899 = abstractC2961;
                    C2059 c2059 = null;
                    while (abstractC2961M3899 != null) {
                        if (abstractC2961M3899 instanceof InterfaceC2596) {
                            interfaceC2622 = abstractC2961M3899;
                            break loop0;
                        }
                        if ((abstractC2961M3899.f6636 & 8) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
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
                    if ((abstractC2961.f6630 & 8) != 0) {
                        break;
                    }
                    abstractC2961 = abstractC2961.f6633;
                } else if ((abstractC2961.f6630 & 8) != 0) {
                }
            }
        }
        interfaceC2622.getClass();
        AbstractC2961 abstractC29613 = ((AbstractC2961) ((InterfaceC2596) interfaceC2622)).f6637;
        C2791 c2791M3814 = c2583.m3814();
        if (c2791M3814 == null) {
            c2791M3814 = new C2791();
        }
        return new C2788(abstractC29613, z, c2583, c2791M3814);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4239(C2788 c2788) {
        if (!m4240(c2788)) {
            C2791 c2791 = c2788.f6114;
            if (c2791.f6123) {
                return true;
            }
            C1083 c1083 = c2791.f6124;
            Object[] objArr = c1083.f1225;
            Object[] objArr2 = c1083.f1224;
            long[] jArr = c1083.f1226;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((C2782) obj).f6101) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m4240(C2788 c2788) {
        AbstractC2629 abstractC2629M4215 = c2788.m4215();
        C1083 c1083 = c2788.f6114.f6124;
        return (abstractC2629M4215 != null ? abstractC2629M4215.m3944() : false) || c1083.m1312(AbstractC2778.f6088) || c1083.m1312(AbstractC2778.f6091);
    }
}
