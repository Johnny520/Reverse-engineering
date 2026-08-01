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
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7327;
import p205.C7904;
import p251.AbstractC8174;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7327 f5779 = new C7327(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m3663(C1956 c1956, C1947 c1947) {
        SemanticsConfigurationKt$getOrNull$1 semanticsConfigurationKt$getOrNull$1 = new InterfaceC6542() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                return null;
            }
        };
        Object objM756 = c1956.f5778.m756(c1947);
        return objM756 == null ? semanticsConfigurationKt$getOrNull$1.invoke() : objM756;
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
    public static final void m3664(androidx.appcompat.app.C0113 r17, androidx.appcompat.app.C0113 r18, androidx.collection.C0246 r19, androidx.compose.ui.semantics.C1953 r20, androidx.compose.ui.semantics.C1953 r21, p052.InterfaceC6557 r22) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3664(androidx.appcompat.app.飘花落叶言子苏楪哲兰世, androidx.appcompat.app.飘花落叶言子苏楪哲兰世, androidx.collection.飘花落叶言子世楪兰苏哲, androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m3665(C0246 c0246, C1953 c1953, C1953 c19532) {
        C1748 c1748;
        C1953 c1953M3658 = c19532.m3658();
        C7327 c7327M3656 = (c1953M3658 == null || (c1748 = c1953M3658.f5769) == null || !c1748.m3232()) ? f5779 : c1953M3658.m3656();
        int i = c19532.f5766;
        if (i == c1953.f5766) {
            i = -1;
        }
        c0246.m789(i, new C1950(c19532, AbstractC8174.m13602(c7327M3656)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3666(C0113 c0113, C0113 c01132, C0246 c0246, C1953 c1953, C1953 c19532, InterfaceC6557 interfaceC6557) {
        C0113 c01133 = c0113;
        Region region = (Region) c01133.f357;
        C0113 c01134 = c01132;
        Region region2 = (Region) c01134.f357;
        C1748 c1748 = c19532.f5769;
        C1748 c17482 = c19532.f5769;
        if (!c1748.m3232() || !c17482.m3233() || region2.isEmpty()) {
            if (c19532.m3649()) {
                m3665(c0246, c1953, c19532);
                return;
            }
            return;
        }
        C7327 c7327M3650 = c19532.m3650();
        if (c7327M3650.m12489()) {
            InterfaceC1787 interfaceC1787M3643 = c19532.m3643();
            if (interfaceC1787M3643 == null) {
                C1771 c1771 = c17482.f5093.f5285;
                c7327M3650 = AbstractC1670.m3103(c1771).mo3079(c1771, false);
            } else {
                c7327M3650 = AbstractC1785.m3350(((AbstractC2128) interfaceC1787M3643).f6291, m3663(c19532.f5768, AbstractC1959.f5791) != null, false);
            }
        }
        C7904 c7904M13602 = AbstractC8174.m13602(c7327M3650);
        c01133.m431(c7904M13602);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = c19532.f5766;
            C1953 c19533 = c1953;
            if (i == c19533.f5766) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            C1950 c1950 = new C1950(c19532, new C7904(bounds.left, bounds.top, bounds.right, bounds.bottom));
            C0246 c02462 = c0246;
            c02462.m789(i, c1950);
            List listM3642 = C1953.m3642(4, c19532);
            int size = listM3642.size() - 1;
            while (-1 < size) {
                if (!((Boolean) interfaceC6557.invoke(listM3642.get(size))).booleanValue()) {
                    m3666(c01133, c01134, c02462, c19533, (C1953) listM3642.get(size), interfaceC6557);
                }
                size--;
                c01133 = c0113;
                c01134 = c01132;
                c02462 = c0246;
                c19533 = c1953;
            }
            if (m3669(c19532)) {
                region2.op(c7904M13602.f21881, c7904M13602.f21880, c7904M13602.f21879, c7904M13602.f21878, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0246 m3667(C1951 c1951, InterfaceC6557 interfaceC6557) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C1953 c1953M3641 = c1951.m3641();
            C1748 c1748 = c1953M3641.f5769;
            if (c1748.m3232() && c1748.m3233()) {
                C7327 c7327M3656 = c1953M3641.m3656();
                C0246 c0246 = new C0246(48);
                C0113 c0113 = new C0113(26);
                c0113.m431(AbstractC8174.m13602(c7327M3656));
                m3664(new C0113(26), c0113, c0246, c1953M3641, c1953M3641, interfaceC6557);
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
    public static final androidx.compose.ui.semantics.C1953 m3668(androidx.compose.ui.node.C1748 r9, boolean r10) {
        /*
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r0 = r9.f5093
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f5282
            int r1 = r0.f6284
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
        Lb:
            if (r0 == 0) goto L65
            int r1 = r0.f6290
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
            int r4 = r1.f6290
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof androidx.compose.ui.node.AbstractC1788
            if (r4 == 0) goto L57
            r4 = r1
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r4 = (androidx.compose.ui.node.AbstractC1788) r4
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = r4.f5225
            r5 = 0
            r6 = r5
        L2e:
            r7 = 1
            if (r4 == 0) goto L54
            int r8 = r4.f6290
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
            r3.m2037(r1)
            r1 = r2
        L4e:
            r3.m2037(r4)
        L51:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = r4.f6287
            goto L2e
        L54:
            if (r6 != r7) goto L57
            goto L15
        L57:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r1 = androidx.compose.ui.node.AbstractC1785.m3329(r3)
            goto L15
        L5c:
            int r1 = r0.f6284
            r1 = r1 & 8
            if (r1 == 0) goto L65
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f6287
            goto Lb
        L65:
            r2.getClass()
            androidx.compose.ui.node.飘花落叶言子哲楪世苏兰 r2 = (androidx.compose.ui.node.InterfaceC1761) r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r2 = (androidx.compose.ui.AbstractC2128) r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r2.f6291
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r1 = r9.m3244()
            if (r1 != 0) goto L79
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r1 = new androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲
            r1.<init>()
        L79:
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r2 = new androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3668(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, boolean):androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m3669(androidx.compose.ui.semantics.C1953 r14) {
        /*
            boolean r0 = m3670(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲 r14 = r14.f5768
            boolean r0 = r14.f5777
            if (r0 != 0) goto L59
            androidx.collection.飘花落叶言子世兰楪苏哲 r14 = r14.f5778
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
            boolean r10 = r11.f5755
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.AbstractC1957.m3669(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m3670(C1953 c1953) {
        AbstractC1794 abstractC1794M3645 = c1953.m3645();
        C0236 c0236 = c1953.f5768.f5778;
        return (abstractC1794M3645 != null ? abstractC1794M3645.m3374() : false) || c0236.m751(AbstractC1943.f5742) || c0236.m751(AbstractC1943.f5745);
    }
}
