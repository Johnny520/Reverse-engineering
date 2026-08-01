package androidx.compose.ui.semantics;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.appcompat.app.C0113;
import androidx.collection.AbstractC0273;
import androidx.collection.C0236;
import androidx.collection.C0246;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1771;
import androidx.compose.ui.node.InterfaceC1787;
import java.util.List;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7328;
import p205.C7905;
import p316.C8667;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7328 f5780 = new C7328(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m3673(C1956 c1956, C1947 c1947) {
        SemanticsConfigurationKt$getOrNull$1 semanticsConfigurationKt$getOrNull$1 = new InterfaceC6543() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                return null;
            }
        };
        Object objM757 = c1956.f5779.m757(c1947);
        return objM757 == null ? semanticsConfigurationKt$getOrNull$1.invoke() : objM757;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3674(androidx.appcompat.app.C0113 r17, androidx.appcompat.app.C0113 r18, androidx.collection.C0246 r19, androidx.compose.ui.semantics.C1953 r20, androidx.compose.ui.semantics.C1953 r21, p052.InterfaceC6558 r22) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3674(androidx.appcompat.app.飘花落叶言子苏楪哲兰世, androidx.appcompat.app.飘花落叶言子苏楪哲兰世, androidx.collection.飘花落叶言子世楪兰苏哲, androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m3675(C0246 c0246, C1953 c1953, C1953 c19532) {
        C1748 c1748;
        C1953 c1953M3668 = c19532.m3668();
        C7328 c7328M3666 = (c1953M3668 == null || (c1748 = c1953M3668.f5770) == null || !c1748.m3242()) ? f5780 : c1953M3668.m3666();
        int i = c19532.f5767;
        if (i == c1953.f5767) {
            i = -1;
        }
        c0246.m790(i, new C1950(c19532, C8667.m14363(c7328M3666)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3676(C0113 c0113, C0113 c01132, C0246 c0246, C1953 c1953, C1953 c19532, InterfaceC6558 interfaceC6558) {
        C0113 c01133 = c0113;
        Region region = (Region) c01133.f357;
        C0113 c01134 = c01132;
        Region region2 = (Region) c01134.f357;
        C1748 c1748 = c19532.f5770;
        C1748 c17482 = c19532.f5770;
        if (!c1748.m3242() || !c17482.m3243() || region2.isEmpty()) {
            if (c19532.m3659()) {
                m3675(c0246, c1953, c19532);
                return;
            }
            return;
        }
        C7328 c7328M3660 = c19532.m3660();
        if (c7328M3660.m12516()) {
            InterfaceC1787 interfaceC1787M3653 = c19532.m3653();
            if (interfaceC1787M3653 == null) {
                C1771 c1771 = c17482.f5094.f5286;
                c7328M3660 = AbstractC1670.m3113(c1771).mo3089(c1771, false);
            } else {
                c7328M3660 = AbstractC1785.m3360(((AbstractC2128) interfaceC1787M3653).f6292, m3673(c19532.f5769, AbstractC1959.f5792) != null, false);
            }
        }
        C7905 c7905M14363 = C8667.m14363(c7328M3660);
        c01133.m432(c7905M14363);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = c19532.f5767;
            C1953 c19533 = c1953;
            if (i == c19533.f5767) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            C1950 c1950 = new C1950(c19532, new C7905(bounds.left, bounds.top, bounds.right, bounds.bottom));
            C0246 c02462 = c0246;
            c02462.m790(i, c1950);
            List listM3652 = C1953.m3652(4, c19532);
            int size = listM3652.size() - 1;
            while (-1 < size) {
                if (!((Boolean) interfaceC6558.invoke(listM3652.get(size))).booleanValue()) {
                    m3676(c01133, c01134, c02462, c19533, (C1953) listM3652.get(size), interfaceC6558);
                }
                size--;
                c01133 = c0113;
                c01134 = c01132;
                c02462 = c0246;
                c19533 = c1953;
            }
            if (m3679(c19532)) {
                region2.op(c7905M14363.f21878, c7905M14363.f21877, c7905M14363.f21876, c7905M14363.f21875, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0246 m3677(C1951 c1951, InterfaceC6558 interfaceC6558) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C1953 c1953M3651 = c1951.m3651();
            C1748 c1748 = c1953M3651.f5770;
            if (c1748.m3242() && c1748.m3243()) {
                C7328 c7328M3666 = c1953M3651.m3666();
                C0246 c0246 = new C0246(48);
                C0113 c0113 = new C0113(26);
                c0113.m432(C8667.m14363(c7328M3666));
                m3674(new C0113(26), c0113, c0246, c1953M3651, c1953M3651, interfaceC6558);
                return c0246;
            }
            C0246 c02462 = AbstractC0273.f978;
            c02462.getClass();
            return c02462;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:4:0x000b->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0062], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.semantics.C1953 m3678(androidx.compose.ui.node.C1748 r9, boolean r10) {
        /*
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r0 = r9.f5094
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f5283
            int r1 = r0.f6285
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
        Lb:
            if (r0 == 0) goto L65
            int r1 = r0.f6291
            r1 = r1 & 8
            if (r1 == 0) goto L5c
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5c
            boolean r4 = r1 instanceof androidx.compose.ui.node.InterfaceC1761
            if (r4 == 0) goto L1d
            r2 = r1
            goto L65
        L1d:
            int r4 = r1.f6291
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof androidx.compose.ui.node.AbstractC1788
            if (r4 == 0) goto L57
            r4 = r1
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r4 = (androidx.compose.ui.node.AbstractC1788) r4
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = r4.f5226
            r5 = 0
            r6 = r5
        L2e:
            r7 = 1
            if (r4 == 0) goto L54
            int r8 = r4.f6291
            r8 = r8 & 8
            if (r8 == 0) goto L51
            int r6 = r6 + 1
            if (r6 != r7) goto L3d
            r1 = r4
            goto L51
        L3d:
            if (r3 != 0) goto L48
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r3 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            r7 = 16
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r7 = new androidx.compose.ui.AbstractC2128[r7]
            r3.<init>(r5, r7)
        L48:
            if (r1 == 0) goto L4e
            r3.m2047(r1)
            r1 = r2
        L4e:
            r3.m2047(r4)
        L51:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = r4.f6288
            goto L2e
        L54:
            if (r6 != r7) goto L57
            goto L15
        L57:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r1 = androidx.compose.ui.node.AbstractC1785.m3339(r3)
            goto L15
        L5c:
            int r1 = r0.f6285
            r1 = r1 & 8
            if (r1 == 0) goto L65
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f6288
            goto Lb
        L65:
            r2.getClass()
            androidx.compose.ui.node.飘花落叶言子哲楪世苏兰 r2 = (androidx.compose.ui.node.InterfaceC1761) r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r2 = (androidx.compose.ui.AbstractC2128) r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r2.f6292
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r1 = r9.m3254()
            if (r1 != 0) goto L79
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r1 = new androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲
            r1.<init>()
        L79:
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r2 = new androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3678(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, boolean):androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m3679(androidx.compose.ui.semantics.C1953 r14) {
        /*
            boolean r0 = m3680(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r14 = r14.f5769
            boolean r0 = r14.f5778
            if (r0 != 0) goto L59
            androidx.collection.飘花落叶言子世兰楪苏哲 r14 = r14.f5779
            java.lang.Object[] r0 = r14.f880
            java.lang.Object[] r2 = r14.f879
            long[] r14 = r14.f881
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            androidx.compose.ui.semantics.飘花落叶言子楪兰苏哲世 r11 = (androidx.compose.ui.semantics.C1947) r11
            boolean r10 = r11.f5756
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3679(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m3680(C1953 c1953) {
        AbstractC1794 abstractC1794M3655 = c1953.m3655();
        C0236 c0236 = c1953.f5769.f5779;
        return (abstractC1794M3655 != null ? abstractC1794M3655.m3384() : false) || c0236.m752(AbstractC1943.f5743) || c0236.m752(AbstractC1943.f5746);
    }
}
