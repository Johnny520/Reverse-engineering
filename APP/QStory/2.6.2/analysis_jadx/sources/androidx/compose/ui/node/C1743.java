package androidx.compose.ui.node;

import android.os.Trace;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0113;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.C7897;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5051;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7897 f5054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1778 f5050 = new C1778();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0076 f5047 = new C0076(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1224 f5046 = new C1224(0, new InterfaceC1802[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f5053 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1224 f5052 = new C1224(0, new C1746[16]);

    public C1743(C1748 c1748) {
        this.f5051 = c1748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m3170(C1748 c1748, C7897 c7897) throws Throwable {
        boolean zM3211;
        if (c7897 != null) {
            if (c1748.f5097 == LayoutNode$UsageByParent.NotUsed) {
                c1748.m3238();
            }
            zM3211 = c1748.f5131.f5166.m3160(c7897.f21868);
        } else {
            zM3211 = C1748.m3211(c1748);
        }
        C1748 c1748M3246 = c1748.m3246();
        if (zM3211 && c1748M3246 != null) {
            if (c1748.m3250() == LayoutNode$UsageByParent.InMeasureBlock) {
                C1748.m3214(c1748M3246, false, 3);
                return zM3211;
            }
            if (c1748.m3250() == LayoutNode$UsageByParent.InLayoutBlock) {
                c1748M3246.m3215(false);
            }
        }
        return zM3211;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3171(androidx.compose.ui.node.C1748 r5, p205.C7897 r6) throws java.lang.Throwable {
        /*
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r5.f5119
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r5.f5131
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r1.f5164
            r0.getClass()
            long r3 = r6.f21868
            boolean r6 = r0.m3205(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r6 = r1.f5164
            if (r6 == 0) goto L21
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰 r1 = r6.f5074
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.f21868
            boolean r6 = r6.m3205(r0)
        L2f:
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r5.m3246()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5119
            r3 = 3
            if (r1 != 0) goto L40
            androidx.compose.ui.node.C1748.m3214(r0, r2, r3)
            return r6
        L40:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r5.m3242()
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode$UsageByParent.InMeasureBlock
            if (r1 != r4) goto L4c
            androidx.compose.ui.node.C1748.m3210(r0, r2, r3)
            return r6
        L4c:
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r5.m3242()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.InLayoutBlock
            if (r5 != r1) goto L57
            r0.m3218(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1743.m3171(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3172(C1743 c1743, C1748 c1748, boolean z) {
        C7897 c7897;
        AbstractC1708 placementScope;
        C1771 c1771;
        C1748 c1748M3246;
        C1748 c17482 = c1743.f5051;
        boolean z2 = c1748.f5125;
        C1756 c1756 = c1748.f5131;
        if (!z2 && m3173(c1748)) {
            if (c1748 == c17482) {
                c7897 = c1743.f5054;
                c7897.getClass();
            } else {
                c7897 = null;
            }
            if (z) {
                zM3171 = c1756.f5157 ? m3171(c1748, c7897) : false;
                if ((zM3171 || c1756.f5156) && AbstractC4394.m8917(c1748.m3231(), Boolean.TRUE)) {
                    c1748.m3222();
                }
            } else {
                boolean zM3170 = c1748.m3249() ? m3170(c1748, c7897) : false;
                if (c1748.m3252() && (c1748 == c17482 || ((c1748M3246 = c1748.m3246()) != null && c1748M3246.m3232() && c1756.f5166.f5031))) {
                    if (c1748 == c17482) {
                        if (c1748.f5097 == LayoutNode$UsageByParent.NotUsed) {
                            c1748.m3237();
                        }
                        C1748 c1748M32462 = c1748.m3246();
                        if (c1748M32462 == null || (c1771 = c1748M32462.f5093.f5285) == null || (placementScope = c1771.f5145) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getPlacementScope();
                        }
                        AbstractC1708.m3122(placementScope, c1756.f5166, 0, 0);
                    } else {
                        c1748.m3219();
                    }
                    C0076 c0076 = c1743.f5047;
                    c0076.getClass();
                    if (c1748.f5126 > 0) {
                        ((C1224) c0076.f227).m2037(c1748);
                        c1748.f5127 = true;
                    }
                }
                zM3171 = zM3170;
            }
            c1743.m3177();
        }
        return zM3171;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m3173(C1748 c1748) {
        C1747 c1747;
        C1759 c1759;
        C1756 c1756 = c1748.f5131;
        return c1748.m3232() || c1756.f5166.f5031 || m3175(c1748) || AbstractC4394.m8917(c1748.m3231(), Boolean.TRUE) || m3174(c1748) || c1756.f5166.f5019.m3311() || !((c1747 = c1756.f5164) == null || (c1759 = c1747.f5082) == null || !c1759.m3311());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m3174(C1748 c1748) {
        C1747 c1747;
        C1759 c1759;
        if (c1748.f5131.f5157) {
            return (c1748.m3242() == LayoutNode$UsageByParent.NotUsed && ((c1747 = c1748.f5131.f5164) == null || (c1759 = c1747.f5082) == null || !c1759.m3311())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m3175(C1748 c1748) {
        if (!c1748.m3249()) {
            return false;
        }
        do {
            if (c1748.m3250() == LayoutNode$UsageByParent.NotUsed && !c1748.f5131.f5166.f5019.m3311()) {
                C1748 c1748M3246 = c1748.m3246();
                if ((c1748M3246 != null ? c1748M3246.f5131.f5158 : null) != LayoutNode$LayoutState.Measuring) {
                    return false;
                }
            }
            c1748 = c1748.m3246();
            if (c1748 == null) {
                return false;
            }
        } while (!c1748.m3232());
        return true;
    }

    public final void registerOnLayoutCompletedListener(InterfaceC1802 interfaceC1802) {
        this.f5046.m2037(interfaceC1802);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3176(C1748 c1748) {
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (AbstractC4394.m8917(c17482.m3231(), Boolean.TRUE) && !c17482.f5125) {
                if (this.f5050.m3320(c17482)) {
                    c17482.m3222();
                }
                m3176(c17482);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3177() {
        C1224 c1224 = this.f5052;
        int i = c1224.f3519;
        if (i != 0) {
            Object[] objArr = c1224.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1746 c1746 = (C1746) objArr[i2];
                if (c1746.f5065.m3233()) {
                    boolean z = c1746.f5064;
                    C1748 c1748 = c1746.f5065;
                    boolean z2 = c1746.f5063;
                    if (z) {
                        C1748.m3210(c1748, z2, 2);
                    } else {
                        C1748.m3214(c1748, z2, 2);
                    }
                }
            }
            c1224.m2042();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3178(boolean z) {
        C0076 c0076 = this.f5047;
        if (z) {
            C1224 c1224 = (C1224) c0076.f227;
            C1748 c1748 = this.f5051;
            if (c1748.f5126 > 0) {
                c1224.m2042();
                c1224.m2037(c1748);
                c1748.f5127 = true;
            }
        }
        if (((C1224) c0076.f227).f3519 != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c0076.m269();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m3179(long j) {
        C7897 c7897 = this.f5054;
        if (c7897 == null ? false : C7897.m13307(c7897.f21868, j)) {
            return;
        }
        if (this.f5049) {
            AbstractC7935.m13397("updateRootConstraints called while measuring");
        }
        this.f5054 = new C7897(j);
        C1748 c1748 = this.f5051;
        C1748 c17482 = c1748.f5119;
        C1756 c1756 = c1748.f5131;
        if (c17482 != null) {
            c1756.f5157 = true;
        }
        c1756.f5166.f5030 = true;
        this.f5050.m3318(c1748, c17482 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3180() {
        C1778 c1778 = this.f5050;
        if (c1778.m3319()) {
            C1748 c1748 = this.f5051;
            if (!c1748.m3233()) {
                AbstractC7935.m13397("performMeasureAndLayout called with unattached root");
            }
            if (!c1748.m3232()) {
                AbstractC7935.m13397("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5049) {
                AbstractC7935.m13397("performMeasureAndLayout called during measure layout");
            }
            if (this.f5054 != null) {
                this.f5049 = true;
                this.f5048 = false;
                try {
                    if ((((SortedSet) ((C0113) c1778.f5213).f357).isEmpty() || ((SortedSet) ((C0113) c1778.f5214).f357).isEmpty()) ? false : true) {
                        if (c1748.f5119 != null) {
                            m3182(c1748, true);
                        } else {
                            m3185(c1748);
                        }
                    }
                    m3182(c1748, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f5049 = false;
                        this.f5048 = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3181(C1748 c1748, long j) {
        AbstractC2128 abstractC2128;
        boolean z = c1748.f5125;
        C1756 c1756 = c1748.f5131;
        if (z) {
            return;
        }
        C1748 c17482 = this.f5051;
        if (c1748 == c17482) {
            AbstractC7935.m13397("measureAndLayout called on root");
        }
        if (!c17482.m3233()) {
            AbstractC7935.m13397("performMeasureAndLayout called with unattached root");
        }
        if (!c17482.m3232()) {
            AbstractC7935.m13397("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5049) {
            AbstractC7935.m13397("performMeasureAndLayout called during measure layout");
        }
        if (this.f5054 != null) {
            this.f5049 = true;
            this.f5048 = false;
            try {
                C1778 c1778 = this.f5050;
                ((C0113) c1778.f5214).m434(c1748);
                ((C0113) c1778.f5212).m434(c1748);
                ((C0113) c1778.f5213).m434(c1748);
                if (m3171(c1748, new C7897(j)) || c1756.f5156) {
                    if (AbstractC4394.m8917(c1748.m3231(), Boolean.TRUE)) {
                        c1748.m3222();
                    }
                }
                m3176(c1748);
                if (c1748.f5097 == LayoutNode$UsageByParent.NotUsed) {
                    c1748.m3238();
                }
                boolean zM3160 = c1756.f5166.m3160(j);
                C1748 c1748M3246 = c1748.m3246();
                if (zM3160 && c1748M3246 != null) {
                    if (c1748.m3250() == LayoutNode$UsageByParent.InMeasureBlock) {
                        C1748.m3214(c1748M3246, false, 3);
                    } else if (c1748.m3250() == LayoutNode$UsageByParent.InLayoutBlock) {
                        c1748M3246.m3215(false);
                    }
                }
                if (c1748.m3252() && c1748.m3232()) {
                    c1748.m3219();
                    C0076 c0076 = this.f5047;
                    c0076.getClass();
                    if (c1748.f5126 > 0) {
                        ((C1224) c0076.f227).m2037(c1748);
                        c1748.f5127 = true;
                    }
                }
                m3177();
            } finally {
            }
        }
        C1224 c1224 = this.f5046;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1811 c1811 = ((C1748) ((InterfaceC1802) objArr[i2])).f5093;
            C1771 c1771 = c1811.f5285;
            boolean zM3368 = AbstractC1793.m3368(4194304);
            if (zM3368) {
                abstractC2128 = c1771.f5202;
            } else {
                abstractC2128 = c1771.f5202.f6283;
                if (abstractC2128 == null) {
                }
            }
            InterfaceC6557 interfaceC6557 = AbstractC1794.f5238;
            for (AbstractC2128 abstractC2128M3383 = c1771.m3383(zM3368); abstractC2128M3383 != null && (abstractC2128M3383.f6284 & 4194304) != 0; abstractC2128M3383 = abstractC2128M3383.f6287) {
                if ((abstractC2128M3383.f6290 & 4194304) != 0) {
                    ?? M3329 = abstractC2128M3383;
                    ?? c12242 = 0;
                    while (M3329 != 0) {
                        if (M3329 instanceof InterfaceC1776) {
                            ((InterfaceC1776) M3329).mo1566(c1811.f5285);
                        } else if ((M3329.f6290 & 4194304) != 0 && (M3329 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC21282 = ((AbstractC1788) M3329).f5225;
                            int i3 = 0;
                            M3329 = M3329;
                            c12242 = c12242;
                            while (abstractC21282 != null) {
                                if ((abstractC21282.f6290 & 4194304) != 0) {
                                    i3++;
                                    c12242 = c12242;
                                    if (i3 == 1) {
                                        M3329 = abstractC21282;
                                    } else {
                                        if (c12242 == 0) {
                                            c12242 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3329 != 0) {
                                            c12242.m2037(M3329);
                                            M3329 = 0;
                                        }
                                        c12242.m2037(abstractC21282);
                                    }
                                }
                                abstractC21282 = abstractC21282.f6287;
                                M3329 = M3329;
                                c12242 = c12242;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M3329 = AbstractC1785.m3329(c12242);
                    }
                }
                if (abstractC2128M3383 != abstractC2128) {
                }
            }
        }
        c1224.m2042();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3182(C1748 c1748, boolean z) throws Throwable {
        C7897 c7897;
        if (c1748.f5125) {
            return;
        }
        if (c1748 == this.f5051) {
            c7897 = this.f5054;
            c7897.getClass();
        } else {
            c7897 = null;
        }
        if (z) {
            m3171(c1748, c7897);
        } else {
            m3170(c1748, c7897);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3183(C1748 c1748, boolean z) {
        int i = AbstractC1742.f5045[c1748.f5131.f5158.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f5052.m2037(new C1746(c1748, false, z));
            } else {
                if (i != 5) {
                    C4210.m8621();
                    return false;
                }
                if (!c1748.m3249() || z) {
                    c1748.f5131.f5166.f5030 = true;
                    if (!c1748.f5125 && (c1748.m3232() || m3175(c1748))) {
                        C1748 c1748M3246 = c1748.m3246();
                        if (c1748M3246 == null || !c1748M3246.m3249()) {
                            this.f5050.m3318(c1748, Invalidation.Measurement);
                        }
                        if (!this.f5048) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m3184(C1748 c1748, boolean z) throws Throwable {
        C7897 c7897;
        boolean zM3170 = false;
        if (!c1748.f5125 && m3173(c1748)) {
            if (c1748 == this.f5051) {
                c7897 = this.f5054;
                c7897.getClass();
            } else {
                c7897 = null;
            }
            if (z) {
                if (c1748.f5131.f5157) {
                    zM3170 = m3171(c1748, c7897);
                }
            } else if (c1748.m3249()) {
                zM3170 = m3170(c1748, c7897);
            }
            m3177();
        }
        return zM3170;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3185(C1748 c1748) throws Throwable {
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3250() == LayoutNode$UsageByParent.InMeasureBlock || c17482.f5131.f5166.f5019.m3311()) {
                if (AbstractC1785.m3335(c17482)) {
                    m3182(c17482, true);
                } else {
                    m3185(c17482);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3186(C1748 c1748, boolean z) throws Throwable {
        C1747 c1747;
        C1759 c1759;
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if ((!z && (c17482.m3250() == LayoutNode$UsageByParent.InMeasureBlock || c17482.f5131.f5166.f5019.m3311())) || (z && (c17482.m3242() == LayoutNode$UsageByParent.InMeasureBlock || ((c1747 = c17482.f5131.f5164) != null && (c1759 = c1747.f5082) != null && c1759.m3311())))) {
                boolean zM3335 = AbstractC1785.m3335(c17482);
                C1756 c1756 = c17482.f5131;
                if (zM3335 && !z) {
                    if (c1756.f5157 && this.f5050.m3320(c17482)) {
                        m3184(c17482, true);
                    } else {
                        m3187(c17482, true);
                    }
                }
                if (z ? c1756.f5157 : c17482.m3249()) {
                    m3184(c17482, z);
                }
                if (!(z ? c1756.f5157 : c17482.m3249())) {
                    m3186(c17482, z);
                }
            }
        }
        if (z ? c1748.f5131.f5157 : c1748.m3249()) {
            m3184(c1748, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3187(C1748 c1748, boolean z) {
        if (!this.f5049) {
            AbstractC7935.m13395("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c1748.f5131.f5157 : c1748.m3249()) {
            AbstractC7935.m13397("node not yet measured");
        }
        m3186(c1748, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m3188(InterfaceC6542 interfaceC6542) {
        boolean z;
        AbstractC2128 abstractC2128;
        ?? c1224;
        ?? M3329;
        int i;
        boolean z2;
        C1748 c1748;
        boolean z3;
        boolean zM3184;
        C1778 c1778 = this.f5050;
        C1748 c17482 = this.f5051;
        if (!c17482.m3233()) {
            AbstractC7935.m13397("performMeasureAndLayout called with unattached root");
        }
        if (!c17482.m3232()) {
            AbstractC7935.m13397("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5049) {
            AbstractC7935.m13397("performMeasureAndLayout called during measure layout");
        }
        if (this.f5054 != null) {
            this.f5049 = true;
            this.f5048 = true;
            try {
                boolean zM3319 = c1778.m3319();
                C0113 c0113 = (C0113) c1778.f5214;
                if (zM3319) {
                    z = false;
                    while (true) {
                        C0113 c01132 = (C0113) c1778.f5213;
                        C0113 c01133 = (C0113) c1778.f5212;
                        if (!((SortedSet) c0113.f357).isEmpty()) {
                            c1748 = (C1748) ((SortedSet) c0113.f357).first();
                            c0113.m434(c1748);
                            z3 = c1748.f5119 != null;
                            z2 = false;
                        } else if (!((SortedSet) c01133.f357).isEmpty()) {
                            c1748 = (C1748) ((SortedSet) c01133.f357).first();
                            c01133.m434(c1748);
                            z3 = c1748.f5119 != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) c01132.f357).isEmpty()) {
                                break;
                            }
                            C1748 c17483 = (C1748) ((SortedSet) c01132.f357).first();
                            c01132.m434(c17483);
                            z2 = true;
                            c1748 = c17483;
                            z3 = false;
                        }
                        if (z2) {
                            zM3184 = m3172(this, c1748, z3);
                        } else {
                            zM3184 = m3184(c1748, z3);
                            if (c1748.f5131.f5156) {
                                c1778.m3318(c1748, Invalidation.LookaheadPlacement);
                            }
                            if (c1748.m3252()) {
                                c1778.m3318(c1748, Invalidation.Placement);
                            }
                        }
                        if (c1748 == c17482 && zM3184) {
                            z = true;
                        }
                    }
                    if (interfaceC6542 != null) {
                        interfaceC6542.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        C1224 c12242 = this.f5046;
        Object[] objArr = c12242.f3520;
        int i2 = c12242.f3519;
        for (int i3 = 0; i3 < i2; i3++) {
            C1811 c1811 = ((C1748) ((InterfaceC1802) objArr[i3])).f5093;
            C1771 c1771 = c1811.f5285;
            int i4 = 4194304;
            boolean zM3368 = AbstractC1793.m3368(4194304);
            if (zM3368) {
                abstractC2128 = c1771.f5202;
            } else {
                abstractC2128 = c1771.f5202.f6283;
                if (abstractC2128 == null) {
                }
            }
            InterfaceC6557 interfaceC6557 = AbstractC1794.f5238;
            AbstractC2128 abstractC2128M3383 = c1771.m3383(zM3368);
            while (abstractC2128M3383 != null && (abstractC2128M3383.f6284 & i4) != 0) {
                if ((abstractC2128M3383.f6290 & i4) != 0) {
                    ?? r12 = abstractC2128M3383;
                    ?? r13 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC1776) {
                            ((InterfaceC1776) r12).mo1566(c1811.f5285);
                        } else {
                            if ((r12.f6290 & i4) != 0 && (r12 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) r12).f5225;
                                int i5 = 0;
                                M3329 = r12;
                                c1224 = r13;
                                while (abstractC21282 != null) {
                                    int i6 = i4;
                                    if ((abstractC21282.f6290 & i6) != 0) {
                                        i5++;
                                        c1224 = c1224;
                                        if (i5 == 1) {
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
                                    i4 = i6;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                }
                                i = i4;
                                c1224 = c1224;
                                if (i5 == 1) {
                                }
                                i4 = i;
                                r12 = M3329;
                                r13 = c1224;
                            }
                            M3329 = AbstractC1785.m3329(c1224);
                            i4 = i;
                            r12 = M3329;
                            r13 = c1224;
                        }
                        i = i4;
                        c1224 = r13;
                        M3329 = AbstractC1785.m3329(c1224);
                        i4 = i;
                        r12 = M3329;
                        r13 = c1224;
                    }
                }
                int i7 = i4;
                if (abstractC2128M3383 != abstractC2128) {
                    abstractC2128M3383 = abstractC2128M3383.f6287;
                    i4 = i7;
                }
            }
        }
        c12242.m2042();
        return z;
    }
}
