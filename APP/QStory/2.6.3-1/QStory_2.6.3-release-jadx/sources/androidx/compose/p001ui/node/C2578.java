package androidx.compose.p001ui.node;

import android.os.Trace;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.C8727;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5394;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5395;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2583 f5397;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8727 f5400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2613 f5396 = new C2613();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0923 f5393 = new C0923(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2059 f5392 = new C2059(0, new InterfaceC2637[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f5399 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2059 f5398 = new C2059(0, new C2581[16]);

    public C2578(C2583 c2583) {
        this.f5397 = c2583;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m3740(C2583 c2583, C8727 c8727) throws Throwable {
        boolean zM3781;
        if (c8727 != null) {
            if (c2583.f5443 == LayoutNode$UsageByParent.NotUsed) {
                c2583.m3808();
            }
            zM3781 = c2583.f5477.f5512.m3730(c8727.f22210);
        } else {
            zM3781 = C2583.m3781(c2583);
        }
        C2583 c2583M3816 = c2583.m3816();
        if (zM3781 && c2583M3816 != null) {
            if (c2583.m3820() == LayoutNode$UsageByParent.InMeasureBlock) {
                C2583.m3784(c2583M3816, false, 3);
                return zM3781;
            }
            if (c2583.m3820() == LayoutNode$UsageByParent.InLayoutBlock) {
                c2583M3816.m3785(false);
            }
        }
        return zM3781;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3741(C2583 c2583, C8727 c8727) throws Throwable {
        boolean zM3775;
        C2583 c25832 = c2583.f5465;
        C2591 c2591 = c2583.f5477;
        if (c25832 == null) {
            return false;
        }
        if (c8727 == null) {
            C2582 c2582 = c2591.f5510;
            C8727 c87272 = c2582 != null ? c2582.f5420 : null;
            if (c87272 != null && c25832 != null) {
                c2582.getClass();
                zM3775 = c2582.m3775(c87272.f22210);
            }
        } else if (c25832 != null) {
            C2582 c25822 = c2591.f5510;
            c25822.getClass();
            zM3775 = c25822.m3775(c8727.f22210);
        } else {
            zM3775 = false;
        }
        C2583 c2583M3816 = c2583.m3816();
        if (zM3775 && c2583M3816 != null) {
            if (c2583M3816.f5465 == null) {
                C2583.m3784(c2583M3816, false, 3);
                return zM3775;
            }
            if (c2583.m3812() == LayoutNode$UsageByParent.InMeasureBlock) {
                C2583.m3780(c2583M3816, false, 3);
                return zM3775;
            }
            if (c2583.m3812() == LayoutNode$UsageByParent.InLayoutBlock) {
                c2583M3816.m3788(false);
            }
        }
        return zM3775;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3742(C2578 c2578, C2583 c2583, boolean z) {
        C8727 c8727;
        AbstractC2543 placementScope;
        C2606 c2606;
        C2583 c2583M3816;
        C2583 c25832 = c2578.f5397;
        boolean z2 = c2583.f5471;
        C2591 c2591 = c2583.f5477;
        if (!z2 && m3743(c2583)) {
            if (c2583 == c25832) {
                c8727 = c2578.f5400;
                c8727.getClass();
            } else {
                c8727 = null;
            }
            if (z) {
                zM3741 = c2591.f5503 ? m3741(c2583, c8727) : false;
                if ((zM3741 || c2591.f5502) && AbstractC5227.m9466(c2583.m3801(), Boolean.TRUE)) {
                    c2583.m3792();
                }
            } else {
                boolean zM3740 = c2583.m3819() ? m3740(c2583, c8727) : false;
                if (c2583.m3822() && (c2583 == c25832 || ((c2583M3816 = c2583.m3816()) != null && c2583M3816.m3802() && c2591.f5512.f5377))) {
                    if (c2583 == c25832) {
                        if (c2583.f5443 == LayoutNode$UsageByParent.NotUsed) {
                            c2583.m3807();
                        }
                        C2583 c2583M38162 = c2583.m3816();
                        if (c2583M38162 == null || (c2606 = c2583M38162.f5439.f5631) == null || (placementScope = c2606.f5491) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getPlacementScope();
                        }
                        AbstractC2543.m3692(placementScope, c2591.f5512, 0, 0);
                    } else {
                        c2583.m3789();
                    }
                    C0923 c0923 = c2578.f5393;
                    c0923.getClass();
                    if (c2583.f5472 > 0) {
                        ((C2059) c0923.f572).m2607(c2583);
                        c2583.f5473 = true;
                    }
                }
                zM3741 = zM3740;
            }
            c2578.m3747();
        }
        return zM3741;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m3743(C2583 c2583) {
        C2582 c2582;
        C2594 c2594;
        C2591 c2591 = c2583.f5477;
        return c2583.m3802() || c2591.f5512.f5377 || m3745(c2583) || AbstractC5227.m9466(c2583.m3801(), Boolean.TRUE) || m3744(c2583) || c2591.f5512.f5365.m3881() || !((c2582 = c2591.f5510) == null || (c2594 = c2582.f5428) == null || !c2594.m3881());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m3744(C2583 c2583) {
        C2582 c2582;
        C2594 c2594;
        if (c2583.f5477.f5503) {
            return (c2583.m3812() == LayoutNode$UsageByParent.NotUsed && ((c2582 = c2583.f5477.f5510) == null || (c2594 = c2582.f5428) == null || !c2594.m3881())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m3745(C2583 c2583) {
        if (!c2583.m3819()) {
            return false;
        }
        do {
            if (c2583.m3820() == LayoutNode$UsageByParent.NotUsed && !c2583.f5477.f5512.f5365.m3881()) {
                C2583 c2583M3816 = c2583.m3816();
                if ((c2583M3816 != null ? c2583M3816.f5477.f5504 : null) != LayoutNode$LayoutState.Measuring) {
                    return false;
                }
            }
            c2583 = c2583.m3816();
            if (c2583 == null) {
                return false;
            }
        } while (!c2583.m3802());
        return true;
    }

    public final void registerOnLayoutCompletedListener(InterfaceC2637 interfaceC2637) {
        this.f5392.m2607(interfaceC2637);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3746(C2583 c2583) {
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (AbstractC5227.m9466(c25832.m3801(), Boolean.TRUE) && !c25832.f5471) {
                if (this.f5396.m3890(c25832)) {
                    c25832.m3792();
                }
                m3746(c25832);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3747() {
        C2059 c2059 = this.f5398;
        int i = c2059.f3865;
        if (i != 0) {
            Object[] objArr = c2059.f3866;
            for (int i2 = 0; i2 < i; i2++) {
                C2581 c2581 = (C2581) objArr[i2];
                if (c2581.f5411.m3803()) {
                    boolean z = c2581.f5410;
                    C2583 c2583 = c2581.f5411;
                    boolean z2 = c2581.f5409;
                    if (z) {
                        C2583.m3780(c2583, z2, 2);
                    } else {
                        C2583.m3784(c2583, z2, 2);
                    }
                }
            }
            c2059.m2612();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3748(boolean z) {
        C0923 c0923 = this.f5393;
        if (z) {
            C2059 c2059 = (C2059) c0923.f572;
            C2583 c2583 = this.f5397;
            if (c2583.f5472 > 0) {
                c2059.m2612();
                c2059.m2607(c2583);
                c2583.f5473 = true;
            }
        }
        if (((C2059) c0923.f572).f3865 != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c0923.m830();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m3749(long j) {
        C8727 c8727 = this.f5400;
        if (c8727 == null ? false : C8727.m13894(c8727.f22210, j)) {
            return;
        }
        if (this.f5395) {
            AbstractC8765.m13984("updateRootConstraints called while measuring");
        }
        this.f5400 = new C8727(j);
        C2583 c2583 = this.f5397;
        C2583 c25832 = c2583.f5465;
        C2591 c2591 = c2583.f5477;
        if (c25832 != null) {
            c2591.f5503 = true;
        }
        c2591.f5512.f5376 = true;
        this.f5396.m3888(c2583, c25832 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3750() {
        C2613 c2613 = this.f5396;
        if (c2613.m3889()) {
            C2583 c2583 = this.f5397;
            if (!c2583.m3803()) {
                AbstractC8765.m13984("performMeasureAndLayout called with unattached root");
            }
            if (!c2583.m3802()) {
                AbstractC8765.m13984("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5395) {
                AbstractC8765.m13984("performMeasureAndLayout called during measure layout");
            }
            if (this.f5400 != null) {
                this.f5395 = true;
                this.f5394 = false;
                try {
                    if ((((SortedSet) ((C0960) c2613.f5559).f702).isEmpty() || ((SortedSet) ((C0960) c2613.f5560).f702).isEmpty()) ? false : true) {
                        if (c2583.f5465 != null) {
                            m3752(c2583, true);
                        } else {
                            m3755(c2583);
                        }
                    }
                    m3752(c2583, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f5395 = false;
                        this.f5394 = false;
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
    public final void m3751(C2583 c2583, long j) {
        AbstractC2961 abstractC2961;
        boolean z = c2583.f5471;
        C2591 c2591 = c2583.f5477;
        if (z) {
            return;
        }
        C2583 c25832 = this.f5397;
        if (c2583 == c25832) {
            AbstractC8765.m13984("measureAndLayout called on root");
        }
        if (!c25832.m3803()) {
            AbstractC8765.m13984("performMeasureAndLayout called with unattached root");
        }
        if (!c25832.m3802()) {
            AbstractC8765.m13984("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5395) {
            AbstractC8765.m13984("performMeasureAndLayout called during measure layout");
        }
        if (this.f5400 != null) {
            this.f5395 = true;
            this.f5394 = false;
            try {
                C2613 c2613 = this.f5396;
                ((C0960) c2613.f5560).m995(c2583);
                ((C0960) c2613.f5558).m995(c2583);
                ((C0960) c2613.f5559).m995(c2583);
                if (m3741(c2583, new C8727(j)) || c2591.f5502) {
                    if (AbstractC5227.m9466(c2583.m3801(), Boolean.TRUE)) {
                        c2583.m3792();
                    }
                }
                m3746(c2583);
                if (c2583.f5443 == LayoutNode$UsageByParent.NotUsed) {
                    c2583.m3808();
                }
                boolean zM3730 = c2591.f5512.m3730(j);
                C2583 c2583M3816 = c2583.m3816();
                if (zM3730 && c2583M3816 != null) {
                    if (c2583.m3820() == LayoutNode$UsageByParent.InMeasureBlock) {
                        C2583.m3784(c2583M3816, false, 3);
                    } else if (c2583.m3820() == LayoutNode$UsageByParent.InLayoutBlock) {
                        c2583M3816.m3785(false);
                    }
                }
                if (c2583.m3822() && c2583.m3802()) {
                    c2583.m3789();
                    C0923 c0923 = this.f5393;
                    c0923.getClass();
                    if (c2583.f5472 > 0) {
                        ((C2059) c0923.f572).m2607(c2583);
                        c2583.f5473 = true;
                    }
                }
                m3747();
            } finally {
            }
        }
        C2059 c2059 = this.f5392;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2646 c2646 = ((C2583) ((InterfaceC2637) objArr[i2])).f5439;
            C2606 c2606 = c2646.f5631;
            boolean zM3938 = AbstractC2628.m3938(4194304);
            if (zM3938) {
                abstractC2961 = c2606.f5548;
            } else {
                abstractC2961 = c2606.f5548.f6629;
                if (abstractC2961 == null) {
                }
            }
            InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
            for (AbstractC2961 abstractC2961M3953 = c2606.m3953(zM3938); abstractC2961M3953 != null && (abstractC2961M3953.f6630 & 4194304) != 0; abstractC2961M3953 = abstractC2961M3953.f6633) {
                if ((abstractC2961M3953.f6636 & 4194304) != 0) {
                    ?? M3899 = abstractC2961M3953;
                    ?? c20592 = 0;
                    while (M3899 != 0) {
                        if (M3899 instanceof InterfaceC2611) {
                            ((InterfaceC2611) M3899).mo2136(c2646.f5631);
                        } else if ((M3899.f6636 & 4194304) != 0 && (M3899 instanceof AbstractC2623)) {
                            AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                            int i3 = 0;
                            M3899 = M3899;
                            c20592 = c20592;
                            while (abstractC29612 != null) {
                                if ((abstractC29612.f6636 & 4194304) != 0) {
                                    i3++;
                                    c20592 = c20592;
                                    if (i3 == 1) {
                                        M3899 = abstractC29612;
                                    } else {
                                        if (c20592 == 0) {
                                            c20592 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (M3899 != 0) {
                                            c20592.m2607(M3899);
                                            M3899 = 0;
                                        }
                                        c20592.m2607(abstractC29612);
                                    }
                                }
                                abstractC29612 = abstractC29612.f6633;
                                M3899 = M3899;
                                c20592 = c20592;
                            }
                            if (i3 == 1) {
                            }
                        }
                        M3899 = AbstractC2620.m3899(c20592);
                    }
                }
                if (abstractC2961M3953 != abstractC2961) {
                }
            }
        }
        c2059.m2612();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3752(C2583 c2583, boolean z) throws Throwable {
        C8727 c8727;
        if (c2583.f5471) {
            return;
        }
        if (c2583 == this.f5397) {
            c8727 = this.f5400;
            c8727.getClass();
        } else {
            c8727 = null;
        }
        if (z) {
            m3741(c2583, c8727);
        } else {
            m3740(c2583, c8727);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3753(C2583 c2583, boolean z) {
        int i = AbstractC2577.f5391[c2583.f5477.f5504.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f5398.m2607(new C2581(c2583, false, z));
            } else {
                if (i != 5) {
                    C5043.m9170();
                    return false;
                }
                if (!c2583.m3819() || z) {
                    c2583.f5477.f5512.f5376 = true;
                    if (!c2583.f5471 && (c2583.m3802() || m3745(c2583))) {
                        C2583 c2583M3816 = c2583.m3816();
                        if (c2583M3816 == null || !c2583M3816.m3819()) {
                            this.f5396.m3888(c2583, Invalidation.Measurement);
                        }
                        if (!this.f5394) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m3754(C2583 c2583, boolean z) throws Throwable {
        C8727 c8727;
        boolean zM3740 = false;
        if (!c2583.f5471 && m3743(c2583)) {
            if (c2583 == this.f5397) {
                c8727 = this.f5400;
                c8727.getClass();
            } else {
                c8727 = null;
            }
            if (z) {
                if (c2583.f5477.f5503) {
                    zM3740 = m3741(c2583, c8727);
                }
            } else if (c2583.m3819()) {
                zM3740 = m3740(c2583, c8727);
            }
            m3747();
        }
        return zM3740;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3755(C2583 c2583) throws Throwable {
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (c25832.m3820() == LayoutNode$UsageByParent.InMeasureBlock || c25832.f5477.f5512.f5365.m3881()) {
                if (AbstractC2620.m3905(c25832)) {
                    m3752(c25832, true);
                } else {
                    m3755(c25832);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3756(C2583 c2583, boolean z) throws Throwable {
        C2582 c2582;
        C2594 c2594;
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if ((!z && (c25832.m3820() == LayoutNode$UsageByParent.InMeasureBlock || c25832.f5477.f5512.f5365.m3881())) || (z && (c25832.m3812() == LayoutNode$UsageByParent.InMeasureBlock || ((c2582 = c25832.f5477.f5510) != null && (c2594 = c2582.f5428) != null && c2594.m3881())))) {
                boolean zM3905 = AbstractC2620.m3905(c25832);
                C2591 c2591 = c25832.f5477;
                if (zM3905 && !z) {
                    if (c2591.f5503 && this.f5396.m3890(c25832)) {
                        m3754(c25832, true);
                    } else {
                        m3757(c25832, true);
                    }
                }
                if (z ? c2591.f5503 : c25832.m3819()) {
                    m3754(c25832, z);
                }
                if (!(z ? c2591.f5503 : c25832.m3819())) {
                    m3756(c25832, z);
                }
            }
        }
        if (z ? c2583.f5477.f5503 : c2583.m3819()) {
            m3754(c2583, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3757(C2583 c2583, boolean z) {
        if (!this.f5395) {
            AbstractC8765.m13982("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c2583.f5477.f5503 : c2583.m3819()) {
            AbstractC8765.m13984("node not yet measured");
        }
        m3756(c2583, z);
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
    public final boolean m3758(InterfaceC7372 interfaceC7372) {
        boolean z;
        AbstractC2961 abstractC2961;
        ?? c2059;
        ?? M3899;
        int i;
        boolean z2;
        C2583 c2583;
        boolean z3;
        boolean zM3754;
        C2613 c2613 = this.f5396;
        C2583 c25832 = this.f5397;
        if (!c25832.m3803()) {
            AbstractC8765.m13984("performMeasureAndLayout called with unattached root");
        }
        if (!c25832.m3802()) {
            AbstractC8765.m13984("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5395) {
            AbstractC8765.m13984("performMeasureAndLayout called during measure layout");
        }
        if (this.f5400 != null) {
            this.f5395 = true;
            this.f5394 = true;
            try {
                boolean zM3889 = c2613.m3889();
                C0960 c0960 = (C0960) c2613.f5560;
                if (zM3889) {
                    z = false;
                    while (true) {
                        C0960 c09602 = (C0960) c2613.f5559;
                        C0960 c09603 = (C0960) c2613.f5558;
                        if (!((SortedSet) c0960.f702).isEmpty()) {
                            c2583 = (C2583) ((SortedSet) c0960.f702).first();
                            c0960.m995(c2583);
                            z3 = c2583.f5465 != null;
                            z2 = false;
                        } else if (!((SortedSet) c09603.f702).isEmpty()) {
                            c2583 = (C2583) ((SortedSet) c09603.f702).first();
                            c09603.m995(c2583);
                            z3 = c2583.f5465 != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) c09602.f702).isEmpty()) {
                                break;
                            }
                            C2583 c25833 = (C2583) ((SortedSet) c09602.f702).first();
                            c09602.m995(c25833);
                            z2 = true;
                            c2583 = c25833;
                            z3 = false;
                        }
                        if (z2) {
                            zM3754 = m3742(this, c2583, z3);
                        } else {
                            zM3754 = m3754(c2583, z3);
                            if (c2583.f5477.f5502) {
                                c2613.m3888(c2583, Invalidation.LookaheadPlacement);
                            }
                            if (c2583.m3822()) {
                                c2613.m3888(c2583, Invalidation.Placement);
                            }
                        }
                        if (c2583 == c25832 && zM3754) {
                            z = true;
                        }
                    }
                    if (interfaceC7372 != null) {
                        interfaceC7372.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        C2059 c20592 = this.f5392;
        Object[] objArr = c20592.f3866;
        int i2 = c20592.f3865;
        for (int i3 = 0; i3 < i2; i3++) {
            C2646 c2646 = ((C2583) ((InterfaceC2637) objArr[i3])).f5439;
            C2606 c2606 = c2646.f5631;
            int i4 = 4194304;
            boolean zM3938 = AbstractC2628.m3938(4194304);
            if (zM3938) {
                abstractC2961 = c2606.f5548;
            } else {
                abstractC2961 = c2606.f5548.f6629;
                if (abstractC2961 == null) {
                }
            }
            InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
            AbstractC2961 abstractC2961M3953 = c2606.m3953(zM3938);
            while (abstractC2961M3953 != null && (abstractC2961M3953.f6630 & i4) != 0) {
                if ((abstractC2961M3953.f6636 & i4) != 0) {
                    ?? r12 = abstractC2961M3953;
                    ?? r13 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC2611) {
                            ((InterfaceC2611) r12).mo2136(c2646.f5631);
                        } else {
                            if ((r12.f6636 & i4) != 0 && (r12 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29612 = ((AbstractC2623) r12).f5571;
                                int i5 = 0;
                                M3899 = r12;
                                c2059 = r13;
                                while (abstractC29612 != null) {
                                    int i6 = i4;
                                    if ((abstractC29612.f6636 & i6) != 0) {
                                        i5++;
                                        c2059 = c2059;
                                        if (i5 == 1) {
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
                                    i4 = i6;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                }
                                i = i4;
                                c2059 = c2059;
                                if (i5 == 1) {
                                }
                                i4 = i;
                                r12 = M3899;
                                r13 = c2059;
                            }
                            M3899 = AbstractC2620.m3899(c2059);
                            i4 = i;
                            r12 = M3899;
                            r13 = c2059;
                        }
                        i = i4;
                        c2059 = r13;
                        M3899 = AbstractC2620.m3899(c2059);
                        i4 = i;
                        r12 = M3899;
                        r13 = c2059;
                    }
                }
                int i7 = i4;
                if (abstractC2961M3953 != abstractC2961) {
                    abstractC2961M3953 = abstractC2961M3953.f6633;
                    i4 = i7;
                }
            }
        }
        c20592.m2612();
        return z;
    }
}
