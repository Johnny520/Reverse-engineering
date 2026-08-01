package androidx.compose.ui.node;

import android.os.Trace;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0113;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.C7898;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5052;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7898 f5055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1778 f5051 = new C1778();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0076 f5048 = new C0076(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1224 f5047 = new C1224(0, new InterfaceC1802[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f5054 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1224 f5053 = new C1224(0, new C1746[16]);

    public C1743(C1748 c1748) {
        this.f5052 = c1748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m3180(C1748 c1748, C7898 c7898) throws Throwable {
        boolean zM3221;
        if (c7898 != null) {
            if (c1748.f5098 == LayoutNode$UsageByParent.NotUsed) {
                c1748.m3248();
            }
            zM3221 = c1748.f5132.f5167.m3170(c7898.f21865);
        } else {
            zM3221 = C1748.m3221(c1748);
        }
        C1748 c1748M3256 = c1748.m3256();
        if (zM3221 && c1748M3256 != null) {
            if (c1748.m3260() == LayoutNode$UsageByParent.InMeasureBlock) {
                C1748.m3224(c1748M3256, false, 3);
                return zM3221;
            }
            if (c1748.m3260() == LayoutNode$UsageByParent.InLayoutBlock) {
                c1748M3256.m3225(false);
            }
        }
        return zM3221;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3181(androidx.compose.ui.node.C1748 r5, p205.C7898 r6) throws java.lang.Throwable {
        /*
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r5.f5120
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r5.f5132
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r1.f5165
            r0.getClass()
            long r3 = r6.f21865
            boolean r6 = r0.m3215(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r6 = r1.f5165
            if (r6 == 0) goto L21
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰 r1 = r6.f5075
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.f21865
            boolean r6 = r6.m3215(r0)
        L2f:
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r5.m3256()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5120
            r3 = 3
            if (r1 != 0) goto L40
            androidx.compose.ui.node.C1748.m3224(r0, r2, r3)
            return r6
        L40:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r5.m3252()
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode$UsageByParent.InMeasureBlock
            if (r1 != r4) goto L4c
            androidx.compose.ui.node.C1748.m3220(r0, r2, r3)
            return r6
        L4c:
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r5.m3252()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.InLayoutBlock
            if (r5 != r1) goto L57
            r0.m3228(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1743.m3181(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3182(C1743 c1743, C1748 c1748, boolean z) {
        C7898 c7898;
        AbstractC1708 placementScope;
        C1771 c1771;
        C1748 c1748M3256;
        C1748 c17482 = c1743.f5052;
        boolean z2 = c1748.f5126;
        C1756 c1756 = c1748.f5132;
        if (!z2 && m3183(c1748)) {
            if (c1748 == c17482) {
                c7898 = c1743.f5055;
                c7898.getClass();
            } else {
                c7898 = null;
            }
            if (z) {
                zM3181 = c1756.f5158 ? m3181(c1748, c7898) : false;
                if ((zM3181 || c1756.f5157) && AbstractC4395.m8907(c1748.m3241(), Boolean.TRUE)) {
                    c1748.m3232();
                }
            } else {
                boolean zM3180 = c1748.m3259() ? m3180(c1748, c7898) : false;
                if (c1748.m3262() && (c1748 == c17482 || ((c1748M3256 = c1748.m3256()) != null && c1748M3256.m3242() && c1756.f5167.f5032))) {
                    if (c1748 == c17482) {
                        if (c1748.f5098 == LayoutNode$UsageByParent.NotUsed) {
                            c1748.m3247();
                        }
                        C1748 c1748M32562 = c1748.m3256();
                        if (c1748M32562 == null || (c1771 = c1748M32562.f5094.f5286) == null || (placementScope = c1771.f5146) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getPlacementScope();
                        }
                        AbstractC1708.m3132(placementScope, c1756.f5167, 0, 0);
                    } else {
                        c1748.m3229();
                    }
                    C0076 c0076 = c1743.f5048;
                    c0076.getClass();
                    if (c1748.f5127 > 0) {
                        ((C1224) c0076.f227).m2047(c1748);
                        c1748.f5128 = true;
                    }
                }
                zM3181 = zM3180;
            }
            c1743.m3187();
        }
        return zM3181;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m3183(C1748 c1748) {
        C1747 c1747;
        C1759 c1759;
        C1756 c1756 = c1748.f5132;
        return c1748.m3242() || c1756.f5167.f5032 || m3185(c1748) || AbstractC4395.m8907(c1748.m3241(), Boolean.TRUE) || m3184(c1748) || c1756.f5167.f5020.m3321() || !((c1747 = c1756.f5165) == null || (c1759 = c1747.f5083) == null || !c1759.m3321());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m3184(C1748 c1748) {
        C1747 c1747;
        C1759 c1759;
        if (c1748.f5132.f5158) {
            return (c1748.m3252() == LayoutNode$UsageByParent.NotUsed && ((c1747 = c1748.f5132.f5165) == null || (c1759 = c1747.f5083) == null || !c1759.m3321())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m3185(C1748 c1748) {
        if (!c1748.m3259()) {
            return false;
        }
        do {
            if (c1748.m3260() == LayoutNode$UsageByParent.NotUsed && !c1748.f5132.f5167.f5020.m3321()) {
                C1748 c1748M3256 = c1748.m3256();
                if ((c1748M3256 != null ? c1748M3256.f5132.f5159 : null) != LayoutNode$LayoutState.Measuring) {
                    return false;
                }
            }
            c1748 = c1748.m3256();
            if (c1748 == null) {
                return false;
            }
        } while (!c1748.m3242());
        return true;
    }

    public final void registerOnLayoutCompletedListener(InterfaceC1802 interfaceC1802) {
        this.f5047.m2047(interfaceC1802);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3186(C1748 c1748) {
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (AbstractC4395.m8907(c17482.m3241(), Boolean.TRUE) && !c17482.f5126) {
                if (this.f5051.m3330(c17482)) {
                    c17482.m3232();
                }
                m3186(c17482);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3187() {
        C1224 c1224 = this.f5053;
        int i = c1224.f3520;
        if (i != 0) {
            Object[] objArr = c1224.f3521;
            for (int i2 = 0; i2 < i; i2++) {
                C1746 c1746 = (C1746) objArr[i2];
                if (c1746.f5066.m3243()) {
                    boolean z = c1746.f5065;
                    C1748 c1748 = c1746.f5066;
                    boolean z2 = c1746.f5064;
                    if (z) {
                        C1748.m3220(c1748, z2, 2);
                    } else {
                        C1748.m3224(c1748, z2, 2);
                    }
                }
            }
            c1224.m2052();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3188(boolean z) {
        C0076 c0076 = this.f5048;
        if (z) {
            C1224 c1224 = (C1224) c0076.f227;
            C1748 c1748 = this.f5052;
            if (c1748.f5127 > 0) {
                c1224.m2052();
                c1224.m2047(c1748);
                c1748.f5128 = true;
            }
        }
        if (((C1224) c0076.f227).f3520 != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c0076.m270();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m3189(long j) {
        C7898 c7898 = this.f5055;
        if (c7898 == null ? false : C7898.m13335(c7898.f21865, j)) {
            return;
        }
        if (this.f5050) {
            AbstractC7936.m13425("updateRootConstraints called while measuring");
        }
        this.f5055 = new C7898(j);
        C1748 c1748 = this.f5052;
        C1748 c17482 = c1748.f5120;
        C1756 c1756 = c1748.f5132;
        if (c17482 != null) {
            c1756.f5158 = true;
        }
        c1756.f5167.f5031 = true;
        this.f5051.m3328(c1748, c17482 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3190() {
        C1778 c1778 = this.f5051;
        if (c1778.m3329()) {
            C1748 c1748 = this.f5052;
            if (!c1748.m3243()) {
                AbstractC7936.m13425("performMeasureAndLayout called with unattached root");
            }
            if (!c1748.m3242()) {
                AbstractC7936.m13425("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5050) {
                AbstractC7936.m13425("performMeasureAndLayout called during measure layout");
            }
            if (this.f5055 != null) {
                this.f5050 = true;
                this.f5049 = false;
                try {
                    if ((((SortedSet) ((C0113) c1778.f5214).f357).isEmpty() || ((SortedSet) ((C0113) c1778.f5215).f357).isEmpty()) ? false : true) {
                        if (c1748.f5120 != null) {
                            m3192(c1748, true);
                        } else {
                            m3195(c1748);
                        }
                    }
                    m3192(c1748, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f5050 = false;
                        this.f5049 = false;
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
    public final void m3191(C1748 c1748, long j) {
        AbstractC2128 abstractC2128;
        boolean z = c1748.f5126;
        C1756 c1756 = c1748.f5132;
        if (z) {
            return;
        }
        C1748 c17482 = this.f5052;
        if (c1748 == c17482) {
            AbstractC7936.m13425("measureAndLayout called on root");
        }
        if (!c17482.m3243()) {
            AbstractC7936.m13425("performMeasureAndLayout called with unattached root");
        }
        if (!c17482.m3242()) {
            AbstractC7936.m13425("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5050) {
            AbstractC7936.m13425("performMeasureAndLayout called during measure layout");
        }
        if (this.f5055 != null) {
            this.f5050 = true;
            this.f5049 = false;
            try {
                C1778 c1778 = this.f5051;
                ((C0113) c1778.f5215).m435(c1748);
                ((C0113) c1778.f5213).m435(c1748);
                ((C0113) c1778.f5214).m435(c1748);
                if (m3181(c1748, new C7898(j)) || c1756.f5157) {
                    if (AbstractC4395.m8907(c1748.m3241(), Boolean.TRUE)) {
                        c1748.m3232();
                    }
                }
                m3186(c1748);
                if (c1748.f5098 == LayoutNode$UsageByParent.NotUsed) {
                    c1748.m3248();
                }
                boolean zM3170 = c1756.f5167.m3170(j);
                C1748 c1748M3256 = c1748.m3256();
                if (zM3170 && c1748M3256 != null) {
                    if (c1748.m3260() == LayoutNode$UsageByParent.InMeasureBlock) {
                        C1748.m3224(c1748M3256, false, 3);
                    } else if (c1748.m3260() == LayoutNode$UsageByParent.InLayoutBlock) {
                        c1748M3256.m3225(false);
                    }
                }
                if (c1748.m3262() && c1748.m3242()) {
                    c1748.m3229();
                    C0076 c0076 = this.f5048;
                    c0076.getClass();
                    if (c1748.f5127 > 0) {
                        ((C1224) c0076.f227).m2047(c1748);
                        c1748.f5128 = true;
                    }
                }
                m3187();
            } finally {
            }
        }
        C1224 c1224 = this.f5047;
        Object[] objArr = c1224.f3521;
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1811 c1811 = ((C1748) ((InterfaceC1802) objArr[i2])).f5094;
            C1771 c1771 = c1811.f5286;
            boolean zM3378 = AbstractC1793.m3378(4194304);
            if (zM3378) {
                abstractC2128 = c1771.f5203;
            } else {
                abstractC2128 = c1771.f5203.f6284;
                if (abstractC2128 == null) {
                }
            }
            InterfaceC6558 interfaceC6558 = AbstractC1794.f5239;
            for (AbstractC2128 abstractC2128M3393 = c1771.m3393(zM3378); abstractC2128M3393 != null && (abstractC2128M3393.f6285 & 4194304) != 0; abstractC2128M3393 = abstractC2128M3393.f6288) {
                if ((abstractC2128M3393.f6291 & 4194304) != 0) {
                    ?? M3339 = abstractC2128M3393;
                    ?? c12242 = 0;
                    while (M3339 != 0) {
                        if (M3339 instanceof InterfaceC1776) {
                            ((InterfaceC1776) M3339).mo1576(c1811.f5286);
                        } else if ((M3339.f6291 & 4194304) != 0 && (M3339 instanceof AbstractC1788)) {
                            AbstractC2128 abstractC21282 = ((AbstractC1788) M3339).f5226;
                            int i3 = 0;
                            M3339 = M3339;
                            c12242 = c12242;
                            while (abstractC21282 != null) {
                                if ((abstractC21282.f6291 & 4194304) != 0) {
                                    i3++;
                                    c12242 = c12242;
                                    if (i3 == 1) {
                                        M3339 = abstractC21282;
                                    } else {
                                        if (c12242 == 0) {
                                            c12242 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (M3339 != 0) {
                                            c12242.m2047(M3339);
                                            M3339 = 0;
                                        }
                                        c12242.m2047(abstractC21282);
                                    }
                                }
                                abstractC21282 = abstractC21282.f6288;
                                M3339 = M3339;
                                c12242 = c12242;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M3339 = AbstractC1785.m3339(c12242);
                    }
                }
                if (abstractC2128M3393 != abstractC2128) {
                }
            }
        }
        c1224.m2052();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3192(C1748 c1748, boolean z) throws Throwable {
        C7898 c7898;
        if (c1748.f5126) {
            return;
        }
        if (c1748 == this.f5052) {
            c7898 = this.f5055;
            c7898.getClass();
        } else {
            c7898 = null;
        }
        if (z) {
            m3181(c1748, c7898);
        } else {
            m3180(c1748, c7898);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3193(C1748 c1748, boolean z) {
        int i = AbstractC1742.f5046[c1748.f5132.f5159.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f5053.m2047(new C1746(c1748, false, z));
            } else {
                if (i != 5) {
                    C4211.m8611();
                    return false;
                }
                if (!c1748.m3259() || z) {
                    c1748.f5132.f5167.f5031 = true;
                    if (!c1748.f5126 && (c1748.m3242() || m3185(c1748))) {
                        C1748 c1748M3256 = c1748.m3256();
                        if (c1748M3256 == null || !c1748M3256.m3259()) {
                            this.f5051.m3328(c1748, Invalidation.Measurement);
                        }
                        if (!this.f5049) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m3194(C1748 c1748, boolean z) throws Throwable {
        C7898 c7898;
        boolean zM3180 = false;
        if (!c1748.f5126 && m3183(c1748)) {
            if (c1748 == this.f5052) {
                c7898 = this.f5055;
                c7898.getClass();
            } else {
                c7898 = null;
            }
            if (z) {
                if (c1748.f5132.f5158) {
                    zM3180 = m3181(c1748, c7898);
                }
            } else if (c1748.m3259()) {
                zM3180 = m3180(c1748, c7898);
            }
            m3187();
        }
        return zM3180;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3195(C1748 c1748) throws Throwable {
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3260() == LayoutNode$UsageByParent.InMeasureBlock || c17482.f5132.f5167.f5020.m3321()) {
                if (AbstractC1785.m3345(c17482)) {
                    m3192(c17482, true);
                } else {
                    m3195(c17482);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3196(C1748 c1748, boolean z) throws Throwable {
        C1747 c1747;
        C1759 c1759;
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if ((!z && (c17482.m3260() == LayoutNode$UsageByParent.InMeasureBlock || c17482.f5132.f5167.f5020.m3321())) || (z && (c17482.m3252() == LayoutNode$UsageByParent.InMeasureBlock || ((c1747 = c17482.f5132.f5165) != null && (c1759 = c1747.f5083) != null && c1759.m3321())))) {
                boolean zM3345 = AbstractC1785.m3345(c17482);
                C1756 c1756 = c17482.f5132;
                if (zM3345 && !z) {
                    if (c1756.f5158 && this.f5051.m3330(c17482)) {
                        m3194(c17482, true);
                    } else {
                        m3197(c17482, true);
                    }
                }
                if (z ? c1756.f5158 : c17482.m3259()) {
                    m3194(c17482, z);
                }
                if (!(z ? c1756.f5158 : c17482.m3259())) {
                    m3196(c17482, z);
                }
            }
        }
        if (z ? c1748.f5132.f5158 : c1748.m3259()) {
            m3194(c1748, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3197(C1748 c1748, boolean z) {
        if (!this.f5050) {
            AbstractC7936.m13423("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c1748.f5132.f5158 : c1748.m3259()) {
            AbstractC7936.m13425("node not yet measured");
        }
        m3196(c1748, z);
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
    public final boolean m3198(InterfaceC6543 interfaceC6543) {
        boolean z;
        AbstractC2128 abstractC2128;
        ?? c1224;
        ?? M3339;
        int i;
        boolean z2;
        C1748 c1748;
        boolean z3;
        boolean zM3194;
        C1778 c1778 = this.f5051;
        C1748 c17482 = this.f5052;
        if (!c17482.m3243()) {
            AbstractC7936.m13425("performMeasureAndLayout called with unattached root");
        }
        if (!c17482.m3242()) {
            AbstractC7936.m13425("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5050) {
            AbstractC7936.m13425("performMeasureAndLayout called during measure layout");
        }
        if (this.f5055 != null) {
            this.f5050 = true;
            this.f5049 = true;
            try {
                boolean zM3329 = c1778.m3329();
                C0113 c0113 = (C0113) c1778.f5215;
                if (zM3329) {
                    z = false;
                    while (true) {
                        C0113 c01132 = (C0113) c1778.f5214;
                        C0113 c01133 = (C0113) c1778.f5213;
                        if (!((SortedSet) c0113.f357).isEmpty()) {
                            c1748 = (C1748) ((SortedSet) c0113.f357).first();
                            c0113.m435(c1748);
                            z3 = c1748.f5120 != null;
                            z2 = false;
                        } else if (!((SortedSet) c01133.f357).isEmpty()) {
                            c1748 = (C1748) ((SortedSet) c01133.f357).first();
                            c01133.m435(c1748);
                            z3 = c1748.f5120 != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) c01132.f357).isEmpty()) {
                                break;
                            }
                            C1748 c17483 = (C1748) ((SortedSet) c01132.f357).first();
                            c01132.m435(c17483);
                            z2 = true;
                            c1748 = c17483;
                            z3 = false;
                        }
                        if (z2) {
                            zM3194 = m3182(this, c1748, z3);
                        } else {
                            zM3194 = m3194(c1748, z3);
                            if (c1748.f5132.f5157) {
                                c1778.m3328(c1748, Invalidation.LookaheadPlacement);
                            }
                            if (c1748.m3262()) {
                                c1778.m3328(c1748, Invalidation.Placement);
                            }
                        }
                        if (c1748 == c17482 && zM3194) {
                            z = true;
                        }
                    }
                    if (interfaceC6543 != null) {
                        interfaceC6543.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        C1224 c12242 = this.f5047;
        Object[] objArr = c12242.f3521;
        int i2 = c12242.f3520;
        for (int i3 = 0; i3 < i2; i3++) {
            C1811 c1811 = ((C1748) ((InterfaceC1802) objArr[i3])).f5094;
            C1771 c1771 = c1811.f5286;
            int i4 = 4194304;
            boolean zM3378 = AbstractC1793.m3378(4194304);
            if (zM3378) {
                abstractC2128 = c1771.f5203;
            } else {
                abstractC2128 = c1771.f5203.f6284;
                if (abstractC2128 == null) {
                }
            }
            InterfaceC6558 interfaceC6558 = AbstractC1794.f5239;
            AbstractC2128 abstractC2128M3393 = c1771.m3393(zM3378);
            while (abstractC2128M3393 != null && (abstractC2128M3393.f6285 & i4) != 0) {
                if ((abstractC2128M3393.f6291 & i4) != 0) {
                    ?? r12 = abstractC2128M3393;
                    ?? r13 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC1776) {
                            ((InterfaceC1776) r12).mo1576(c1811.f5286);
                        } else {
                            if ((r12.f6291 & i4) != 0 && (r12 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) r12).f5226;
                                int i5 = 0;
                                M3339 = r12;
                                c1224 = r13;
                                while (abstractC21282 != null) {
                                    int i6 = i4;
                                    if ((abstractC21282.f6291 & i6) != 0) {
                                        i5++;
                                        c1224 = c1224;
                                        if (i5 == 1) {
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
                                    i4 = i6;
                                    M3339 = M3339;
                                    c1224 = c1224;
                                }
                                i = i4;
                                c1224 = c1224;
                                if (i5 == 1) {
                                }
                                i4 = i;
                                r12 = M3339;
                                r13 = c1224;
                            }
                            M3339 = AbstractC1785.m3339(c1224);
                            i4 = i;
                            r12 = M3339;
                            r13 = c1224;
                        }
                        i = i4;
                        c1224 = r13;
                        M3339 = AbstractC1785.m3339(c1224);
                        i4 = i;
                        r12 = M3339;
                        r13 = c1224;
                    }
                }
                int i7 = i4;
                if (abstractC2128M3393 != abstractC2128) {
                    abstractC2128M3393 = abstractC2128M3393.f6288;
                    i4 = i7;
                }
            }
        }
        c12242.m2052();
        return z;
    }
}
