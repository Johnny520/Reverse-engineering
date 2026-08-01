package androidx.compose.foundation.lazy;

import androidx.activity.C0016;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.lazy.layout.AbstractC0722;
import androidx.compose.foundation.lazy.layout.C0686;
import androidx.compose.foundation.lazy.layout.C0690;
import androidx.compose.foundation.lazy.layout.C0696;
import androidx.compose.foundation.lazy.layout.C0699;
import androidx.compose.foundation.lazy.layout.C0703;
import androidx.compose.foundation.lazy.layout.C0712;
import androidx.compose.foundation.lazy.layout.InterfaceC0697;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.node.C1748;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6557;
import p116.AbstractC7346;
import p176.AbstractC7740;
import p316.C8675;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4870 f2102 = AbstractC7346.m12513(new C0753(0), new C0016(21));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0748 f2104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f2105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0757 f2106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f2107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0747 f2108;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2109;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0699 f2110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC1395 f2111;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0686 f2112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC1395 f2113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1395 f2114;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0703 f2115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0751 f2116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0696 f2117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0113 f2118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0712 f2119;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0541 f2120;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f2121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0573 f2122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f2123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1748 f2124;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0477 f2126;

    public C0741(int i, int i2) {
        C0747 c0747 = new C0747();
        c0747.f2150 = -1;
        c0747.f2147 = -1;
        this.f2108 = c0747;
        C0748 c0748 = new C0748();
        c0748.f2154 = AbstractC1367.m2468(i);
        c0748.f2153 = AbstractC1367.m2468(i2);
        c0748.f2151 = new C0690(i, 30, 100);
        this.f2104 = c0748;
        this.f2103 = AbstractC1367.m2466(AbstractC0739.f2099, C1353.f3919);
        this.f2122 = new C0573();
        this.f2126 = new C0477(new C1067(this, 3));
        this.f2123 = true;
        this.f2116 = new C0751(this);
        this.f2115 = new C0703();
        this.f2119 = new C0712();
        this.f2120 = new C0541(1);
        this.f2117 = new C0696(new C0750(this, i));
        this.f2118 = new C0113(this, 11);
        this.f2110 = new C0699();
        this.f2109 = AbstractC0722.m1513();
        Boolean bool = Boolean.FALSE;
        this.f2113 = AbstractC1367.m2465(bool);
        this.f2114 = AbstractC1367.m2465(bool);
        this.f2111 = AbstractC0722.m1513();
        this.f2112 = new C0686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m1539(C0741 c0741, int i, SuspendLambda suspendLambda) {
        c0741.getClass();
        Object objMo1239 = c0741.mo1239(MutatePriority.Default, new LazyListState$scrollToItem$2(c0741, i, 0, null), suspendLambda);
        return objMo1239 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1239 : C5175.f14739;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1540(int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$1 r0 = (androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$1 r0 = new androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L2b
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            kotlin.AbstractC5184.m10206(r8)
            r6.f2125 = r5     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2 r8 = new androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2     // Catch: java.lang.Throwable -> L29
            r8.<init>(r6, r7, r4, r3)     // Catch: java.lang.Throwable -> L29
            r0.label = r5     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.MutatePriority r7 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.mo1239(r7, r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L46
            return r1
        L46:
            r6.f2125 = r4
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L4b:
            r6.f2125 = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0741.m1540(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1238(float f) {
        return this.f2126.mo1238(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1277() {
        return ((Boolean) ((AbstractC1347) this.f2113).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1278() {
        return ((Boolean) ((AbstractC1347) this.f2114).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f2126.mo1239(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1239(androidx.compose.foundation.MutatePriority r7, p052.InterfaceC6553 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5184.m10206(r9)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6553) r8
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            kotlin.AbstractC5184.m10206(r9)
            goto L5c
        L3e:
            kotlin.AbstractC5184.m10206(r9)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r9 = r6.f2103
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r9 = (androidx.compose.runtime.AbstractC1347) r9
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.lazy.飘花落叶言子楪哲兰苏世 r2 = androidx.compose.foundation.lazy.AbstractC0739.f2099
            if (r9 != r2) goto L5c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲 r9 = r6.f2115
            java.lang.Object r9 = r9.m1491(r0)
            if (r9 != r1) goto L5c
            goto L6a
        L5c:
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲 r6 = r6.f2126
            java.lang.Object r6 = r6.mo1239(r7, r8, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0741.mo1239(androidx.compose.foundation.MutatePriority, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1240() {
        return this.f2126.mo1240();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0757 m1541() {
        return (C0757) ((AbstractC1347) this.f2103).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1542(C0757 c0757, boolean z, boolean z2) {
        float f;
        long j;
        List list = c0757.f2212;
        int i = c0757.f2205;
        int i2 = c0757.f2203;
        C0749 c0749 = c0757.f2204;
        this.f2117.f1956 = list.size();
        C0686 c0686 = this.f2112;
        C0748 c0748 = this.f2104;
        if (!z && this.f2107) {
            this.f2106 = c0757;
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                if (!(((Number) ((AbstractC1347) c0686.f1916.f1199).getValue()).floatValue() == 0.0f) && c0749 != null && c0749.f2161 == c0748.m1550() && i2 == c0748.m1548()) {
                    c0686.m1477();
                }
                return;
            } finally {
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            }
        }
        if (z) {
            this.f2107 = true;
        }
        ((AbstractC1347) this.f2114).setValue(Boolean.valueOf(((c0749 != null ? c0749.f2161 : 0) == 0 && i2 == 0) ? false : true));
        ((AbstractC1347) this.f2113).setValue(Boolean.valueOf(c0757.f2202));
        this.f2121 -= c0757.f2201;
        ((AbstractC1347) this.f2103).setValue(c0757);
        if (z2) {
            c0748.getClass();
            if (i2 < 0.0f) {
                AbstractC7740.m13067("scrollOffset should be non-negative");
            }
            ((AbstractC1346) ((InterfaceC1398) c0748.f2153)).m2423(i2);
        } else {
            C0749 c07492 = (C0749) AbstractC4343.m8830(list);
            C0749 c07493 = (C0749) AbstractC4343.m8810(list);
            if (c07492 != null) {
                f = 0.0f;
                j = c07492.f2161;
            } else {
                f = 0.0f;
                j = -1;
            }
            C8675.m14343(j, "firstVisibleItem:index");
            C8675.m14343(c07493 != null ? c07493.f2161 : -1L, "lastVisibleItem:index");
            c0748.getClass();
            c0748.f2152 = c0749 != null ? c0749.f2167 : null;
            if (c0748.f2155 || i > 0) {
                c0748.f2155 = true;
                if (i2 < f) {
                    AbstractC7740.m13067("scrollOffset should be non-negative");
                }
                c0748.m1546(c0749 != null ? c0749.f2161 : 0, i2);
            }
            if (this.f2123) {
                C0747 c0747 = this.f2108;
                int i3 = c0747.f2150;
                boolean z3 = c0747.f2148;
                if (i3 != -1 && !list.isEmpty() && i3 != C0747.m1545(c0757, z3)) {
                    c0747.f2150 = -1;
                    InterfaceC0697 interfaceC0697 = c0747.f2149;
                    if (interfaceC0697 != null) {
                        interfaceC0697.cancel();
                    }
                    c0747.f2149 = null;
                }
                int i4 = c0747.f2147;
                if (i4 != -1 && c0747.f2146 != f && i4 != i && !list.isEmpty()) {
                    int iM1545 = C0747.m1545(c0757, c0747.f2146 < f);
                    if (iM1545 >= 0 && iM1545 < i) {
                        c0747.f2150 = iM1545;
                        c0747.f2149 = C0113.m424(this.f2118, iM1545);
                    }
                }
                c0747.f2147 = i;
            }
        }
        if (z) {
            c0686.m1476(c0757.f2199, c0757.f2214, c0757.f2210);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1543(int i, int i2) {
        C0748 c0748 = this.f2104;
        if (c0748.m1550() != i || c0748.m1548() != i2) {
            C0712 c0712 = this.f2119;
            c0712.m1500();
            c0712.f2010 = null;
        }
        c0748.m1546(i, i2);
        c0748.f2152 = null;
        C1748 c1748 = this.f2124;
        if (c1748 != null) {
            c1748.m3255();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1544(float f, C0757 c0757) {
        InterfaceC0697 interfaceC0697;
        InterfaceC0697 interfaceC06972;
        if (this.f2123) {
            boolean zIsEmpty = c0757.f2212.isEmpty();
            C0747 c0747 = this.f2108;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM1545 = C0747.m1545(c0757, z);
                if (iM1545 >= 0 && iM1545 < c0757.f2205) {
                    if (iM1545 != c0747.f2150) {
                        if (c0747.f2148 != z) {
                            c0747.f2150 = -1;
                            InterfaceC0697 interfaceC06973 = c0747.f2149;
                            if (interfaceC06973 != null) {
                                interfaceC06973.cancel();
                            }
                            c0747.f2149 = null;
                        }
                        c0747.f2148 = z;
                        c0747.f2150 = iM1545;
                        c0747.f2149 = C0113.m424(this.f2118, iM1545);
                    }
                    List list = c0757.f2212;
                    if (z) {
                        C0749 c0749 = (C0749) AbstractC4343.m8811(list);
                        if (((c0749.f2171 + c0749.f2168) + c0757.f2207) - c0757.f2206 < (-f) && (interfaceC06972 = c0747.f2149) != null) {
                            interfaceC06972.mo1488();
                        }
                    } else if (c0757.f2213 - ((C0749) AbstractC4343.m8827(list)).f2171 < f && (interfaceC0697 = c0747.f2149) != null) {
                        interfaceC0697.mo1488();
                    }
                }
            }
            c0747.f2146 = f;
        }
    }
}
