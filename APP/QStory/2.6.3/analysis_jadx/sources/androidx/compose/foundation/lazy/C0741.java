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
import com.bumptech.glide.AbstractC3057;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6558;
import p116.AbstractC7347;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4871 f2103 = AbstractC7347.m12540(new C0753(0), new C0016(21));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0748 f2105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f2106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0757 f2107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f2108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0747 f2109;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0699 f2111;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC1395 f2112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0686 f2113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC1395 f2114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1395 f2115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0703 f2116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0751 f2117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0696 f2118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0113 f2119;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0712 f2120;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0541 f2121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f2122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0573 f2123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f2124;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1748 f2125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0477 f2127;

    public C0741(int i, int i2) {
        C0747 c0747 = new C0747();
        c0747.f2151 = -1;
        c0747.f2148 = -1;
        this.f2109 = c0747;
        C0748 c0748 = new C0748();
        c0748.f2155 = AbstractC1367.m2477(i);
        c0748.f2154 = AbstractC1367.m2477(i2);
        c0748.f2152 = new C0690(i, 30, 100);
        this.f2105 = c0748;
        this.f2104 = AbstractC1367.m2475(AbstractC0739.f2100, C1353.f3920);
        this.f2123 = new C0573();
        this.f2127 = new C0477(new C1067(this, 3));
        this.f2124 = true;
        this.f2117 = new C0751(this);
        this.f2116 = new C0703();
        this.f2120 = new C0712();
        this.f2121 = new C0541(1);
        this.f2118 = new C0696(new C0750(this, i));
        this.f2119 = new C0113(this, 11);
        this.f2111 = new C0699();
        this.f2110 = AbstractC0722.m1523();
        Boolean bool = Boolean.FALSE;
        this.f2114 = AbstractC1367.m2474(bool);
        this.f2115 = AbstractC1367.m2474(bool);
        this.f2112 = AbstractC0722.m1523();
        this.f2113 = new C0686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m1549(C0741 c0741, int i, SuspendLambda suspendLambda) {
        c0741.getClass();
        Object objMo1249 = c0741.mo1249(MutatePriority.Default, new LazyListState$scrollToItem$2(c0741, i, 0, null), suspendLambda);
        return objMo1249 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1249 : C5176.f14739;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1550(int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
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
            kotlin.AbstractC5185.m10210(r8)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            kotlin.AbstractC5185.m10210(r8)
            r6.f2126 = r5     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2 r8 = new androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2     // Catch: java.lang.Throwable -> L29
            r8.<init>(r6, r7, r4, r3)     // Catch: java.lang.Throwable -> L29
            r0.label = r5     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.MutatePriority r7 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.mo1249(r7, r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L46
            return r1
        L46:
            r6.f2126 = r4
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L4b:
            r6.f2126 = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0741.m1550(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1248(float f) {
        return this.f2127.mo1248(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1287() {
        return ((Boolean) ((AbstractC1347) this.f2114).getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1288() {
        return ((Boolean) ((AbstractC1347) this.f2115).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6.f2127.mo1249(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1249(androidx.compose.foundation.MutatePriority r7, p052.InterfaceC6554 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            kotlin.AbstractC5185.m10210(r9)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6554) r8
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            kotlin.AbstractC5185.m10210(r9)
            goto L5c
        L3e:
            kotlin.AbstractC5185.m10210(r9)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r9 = r6.f2104
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r9 = (androidx.compose.runtime.AbstractC1347) r9
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.lazy.飘花落叶言子楪哲兰苏世 r2 = androidx.compose.foundation.lazy.AbstractC0739.f2100
            if (r9 != r2) goto L5c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世兰苏哲 r9 = r6.f2116
            java.lang.Object r9 = r9.m1501(r0)
            if (r9 != r1) goto L5c
            goto L6a
        L5c:
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲 r6 = r6.f2127
            java.lang.Object r6 = r6.mo1249(r7, r8, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0741.mo1249(androidx.compose.foundation.MutatePriority, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1250() {
        return this.f2127.mo1250();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0757 m1551() {
        return (C0757) ((AbstractC1347) this.f2104).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1552(C0757 c0757, boolean z, boolean z2) {
        float f;
        long j;
        List list = c0757.f2213;
        int i = c0757.f2206;
        int i2 = c0757.f2204;
        C0749 c0749 = c0757.f2205;
        this.f2118.f1957 = list.size();
        C0686 c0686 = this.f2113;
        C0748 c0748 = this.f2105;
        if (!z && this.f2108) {
            this.f2107 = c0757;
            AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
            InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
            AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
            try {
                if (!(((Number) ((AbstractC1347) c0686.f1917.f1199).getValue()).floatValue() == 0.0f) && c0749 != null && c0749.f2162 == c0748.m1560() && i2 == c0748.m1558()) {
                    c0686.m1487();
                }
                return;
            } finally {
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            }
        }
        if (z) {
            this.f2108 = true;
        }
        ((AbstractC1347) this.f2115).setValue(Boolean.valueOf(((c0749 != null ? c0749.f2162 : 0) == 0 && i2 == 0) ? false : true));
        ((AbstractC1347) this.f2114).setValue(Boolean.valueOf(c0757.f2203));
        this.f2122 -= c0757.f2202;
        ((AbstractC1347) this.f2104).setValue(c0757);
        if (z2) {
            c0748.getClass();
            if (i2 < 0.0f) {
                AbstractC7741.m13095("scrollOffset should be non-negative");
            }
            ((AbstractC1346) ((InterfaceC1398) c0748.f2154)).m2433(i2);
        } else {
            C0749 c07492 = (C0749) AbstractC4344.m8815(list);
            C0749 c07493 = (C0749) AbstractC4344.m8812(list);
            if (c07492 != null) {
                f = 0.0f;
                j = c07492.f2162;
            } else {
                f = 0.0f;
                j = -1;
            }
            AbstractC3057.m6733(j, "firstVisibleItem:index");
            AbstractC3057.m6733(c07493 != null ? c07493.f2162 : -1L, "lastVisibleItem:index");
            c0748.getClass();
            c0748.f2153 = c0749 != null ? c0749.f2168 : null;
            if (c0748.f2156 || i > 0) {
                c0748.f2156 = true;
                if (i2 < f) {
                    AbstractC7741.m13095("scrollOffset should be non-negative");
                }
                c0748.m1556(c0749 != null ? c0749.f2162 : 0, i2);
            }
            if (this.f2124) {
                C0747 c0747 = this.f2109;
                int i3 = c0747.f2151;
                boolean z3 = c0747.f2149;
                if (i3 != -1 && !list.isEmpty() && i3 != C0747.m1555(c0757, z3)) {
                    c0747.f2151 = -1;
                    InterfaceC0697 interfaceC0697 = c0747.f2150;
                    if (interfaceC0697 != null) {
                        interfaceC0697.cancel();
                    }
                    c0747.f2150 = null;
                }
                int i4 = c0747.f2148;
                if (i4 != -1 && c0747.f2147 != f && i4 != i && !list.isEmpty()) {
                    int iM1555 = C0747.m1555(c0757, c0747.f2147 < f);
                    if (iM1555 >= 0 && iM1555 < i) {
                        c0747.f2151 = iM1555;
                        c0747.f2150 = C0113.m425(this.f2119, iM1555);
                    }
                }
                c0747.f2148 = i;
            }
        }
        if (z) {
            c0686.m1486(c0757.f2200, c0757.f2215, c0757.f2211);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1553(int i, int i2) {
        C0748 c0748 = this.f2105;
        if (c0748.m1560() != i || c0748.m1558() != i2) {
            C0712 c0712 = this.f2120;
            c0712.m1510();
            c0712.f2011 = null;
        }
        c0748.m1556(i, i2);
        c0748.f2153 = null;
        C1748 c1748 = this.f2125;
        if (c1748 != null) {
            c1748.m3265();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1554(float f, C0757 c0757) {
        InterfaceC0697 interfaceC0697;
        InterfaceC0697 interfaceC06972;
        if (this.f2124) {
            boolean zIsEmpty = c0757.f2213.isEmpty();
            C0747 c0747 = this.f2109;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM1555 = C0747.m1555(c0757, z);
                if (iM1555 >= 0 && iM1555 < c0757.f2206) {
                    if (iM1555 != c0747.f2151) {
                        if (c0747.f2149 != z) {
                            c0747.f2151 = -1;
                            InterfaceC0697 interfaceC06973 = c0747.f2150;
                            if (interfaceC06973 != null) {
                                interfaceC06973.cancel();
                            }
                            c0747.f2150 = null;
                        }
                        c0747.f2149 = z;
                        c0747.f2151 = iM1555;
                        c0747.f2150 = C0113.m425(this.f2119, iM1555);
                    }
                    List list = c0757.f2213;
                    if (z) {
                        C0749 c0749 = (C0749) AbstractC4344.m8808(list);
                        if (((c0749.f2172 + c0749.f2169) + c0757.f2208) - c0757.f2207 < (-f) && (interfaceC06972 = c0747.f2150) != null) {
                            interfaceC06972.mo1498();
                        }
                    } else if (c0757.f2214 - ((C0749) AbstractC4344.m8820(list)).f2172 < f && (interfaceC0697 = c0747.f2150) != null) {
                        interfaceC0697.mo1498();
                    }
                }
            }
            c0747.f2147 = f;
        }
    }
}
