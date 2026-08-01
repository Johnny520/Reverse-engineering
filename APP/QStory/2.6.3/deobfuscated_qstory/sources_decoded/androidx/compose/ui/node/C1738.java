package androidx.compose.ui.node;

import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.AbstractC7897;
import p205.C7898;
import p205.C7906;
import p205.C7908;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1738 extends AbstractC1724 implements InterfaceC1655, InterfaceC1769, InterfaceC1737 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC6558 f5012;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f5016;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f5017;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f5018;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5021;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f5024;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC6558 f5025;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5028;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5029;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5030;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5031;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5032;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5033;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Object f5034;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1756 f5038;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5039;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f5041;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f5042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5036 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5037 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5027 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f5026 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f5035 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C1759 f5020 = new C1759(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1224 f5023 = new C1224(0, new C1738[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f5022 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public long f5019 = AbstractC7897.m13324(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f5015 = new InterfaceC6543() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3157invoke() {
            this.this$0.f5038.m3301().mo3055(this.this$0.f5019);
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3157invoke();
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC6543 f5014 = new InterfaceC6543() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3156invoke() {
            C1756 c1756 = this.this$0.f5038;
            c1756.f5172 = 0;
            C1224 c1224M3239 = c1756.f5162.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1738 c1738 = ((C1748) objArr[i2]).f5132.f5167;
                c1738.f5036 = c1738.f5037;
                c1738.f5037 = Integer.MAX_VALUE;
                c1738.f5032 = false;
                if (c1738.f5027 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c1738.f5027 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3173().getClass();
                }
            });
            if (this.this$0.mo3172().f5147) {
                C0242 c0242 = (C0242) this.this$0.f5038.f5162.m3257();
                int i3 = ((C1224) c0242.f894).f3520;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((C1748) c0242.get(i4)).f5094.f5285.f5147 = true;
                }
            }
            this.this$0.mo3172().mo3201().mo1471();
            if (this.this$0.mo3172().f5147) {
                C0242 c02422 = (C0242) this.this$0.f5038.f5162.m3257();
                int i5 = ((C1224) c02422.f894).f3520;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C1748) c02422.get(i6)).f5094.f5285.f5147 = false;
                }
            }
            C1748 c1748 = this.this$0.f5038.f5162;
            C1224 c1224M32392 = c1748.m3239();
            Object[] objArr2 = c1224M32392.f3521;
            int i7 = c1224M32392.f3520;
            for (int i8 = 0; i8 < i7; i8++) {
                C1748 c17482 = (C1748) objArr2[i8];
                C1756 c17562 = c17482.f5132;
                if (c17562.f5167.f5036 != c17482.m3253()) {
                    c1748.m3230();
                    c1748.m3236();
                    if (c17482.m3253() == Integer.MAX_VALUE) {
                        if (c17562.f5160 || AbstractC1785.m3345(c17482)) {
                            C1747 c1747 = c17562.f5165;
                            c1747.getClass();
                            c1747.m3219(false);
                        }
                        c17562.f5167.m3178();
                    }
                }
            }
            this.this$0.mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
                public final void invoke(InterfaceC1769 interfaceC1769) {
                    AbstractC1770 abstractC1770Mo3173 = interfaceC1769.mo3173();
                    interfaceC1769.mo3173().getClass();
                    abstractC1770Mo3173.f5197 = false;
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5176.f14739;
                }
            });
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3156invoke();
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public long f5013 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final InterfaceC6543 f5040 = new InterfaceC6543() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3158invoke() {
            AbstractC1708 placementScope;
            AbstractC1794 abstractC1794 = this.this$0.f5038.m3301().f5256;
            if (abstractC1794 == null || (placementScope = abstractC1794.f5146) == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.this$0.f5038.f5162)).getPlacementScope();
            }
            C1738 c1738 = this.this$0;
            InterfaceC6558 interfaceC6558 = c1738.f5012;
            C1756 c1756 = c1738.f5038;
            if (interfaceC6558 == null) {
                AbstractC1794 abstractC1794M3301 = c1756.m3301();
                long j = c1738.f5013;
                float f = c1738.f5041;
                placementScope.getClass();
                AbstractC1708.m3129(placementScope, abstractC1794M3301);
                abstractC1794M3301.mo3128(C7908.m13362(j, abstractC1794M3301.f4995), f, null);
                return;
            }
            AbstractC1794 abstractC1794M33012 = c1756.m3301();
            long j2 = c1738.f5013;
            float f2 = c1738.f5041;
            placementScope.getClass();
            AbstractC1708.m3129(placementScope, abstractC1794M33012);
            abstractC1794M33012.mo3128(C7908.m13362(j2, abstractC1794M33012.f4995), f2, interfaceC6558);
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3158invoke();
            return C5176.f14739;
        }
    };

    public C1738(C1756 c1756) {
        this.f5038 = c1756;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    public final void requestLayout() {
        C1748 c1748 = this.f5038.f5162;
        C1751 c1751 = C1748.f5089;
        c1748.m3225(false);
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3138() {
        return this.f5038.m3301().mo3138();
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3139() {
        return this.f5038.m3301().mo3139();
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo3165() {
        C1748.m3224(this.f5038.f5162, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        C1756 c1756 = this.f5038;
        if (!AbstractC1785.m3345(c1756.f5162)) {
            m3177();
            return c1756.m3301().mo3054(i);
        }
        C1747 c1747 = c1756.f5165;
        c1747.getClass();
        return c1747.mo3054(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3166(InterfaceC6558 interfaceC6558) {
        C1224 c1224M3239 = this.f5038.f5162.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC6558.invoke(((C1748) objArr[i2]).f5132.f5167);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3055(long j) throws Throwable {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = c1748.f5098;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = LayoutNode$UsageByParent.NotUsed;
        if (layoutNode$UsageByParent2 == layoutNode$UsageByParent3) {
            c1748.m3248();
        }
        if (AbstractC1785.m3345(c17482)) {
            C1747 c1747 = c1756.f5165;
            c1747.getClass();
            c1747.f5078 = layoutNode$UsageByParent3;
            c1747.mo3055(j);
        }
        C1748 c1748M3256 = c17482.m3256();
        if (c1748M3256 != null) {
            C1756 c17562 = c1748M3256.f5132;
            if (this.f5027 != layoutNode$UsageByParent3 && !c17482.f5093) {
                AbstractC7936.m13423("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = AbstractC1739.f5044[c17562.f5159.ordinal()];
            if (i == 1) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    C4211.m8605(c17562.f5159, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f5027 = layoutNode$UsageByParent;
        } else {
            this.f5027 = layoutNode$UsageByParent3;
        }
        m3170(j);
        return this;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo3167() {
        boolean zM3170;
        this.f5018 = true;
        C1759 c1759 = this.f5020;
        c1759.m3325();
        boolean z = this.f5030;
        C1756 c1756 = this.f5038;
        if (z) {
            C1224 c1224M3239 = c1756.f5162.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c1748 = (C1748) objArr[i2];
                boolean zM3259 = c1748.m3259();
                C1756 c17562 = c1748.f5132;
                if (zM3259 && c1748.m3260() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C1738 c1738 = c17562.f5167;
                    C7898 c7898 = c1738.f5029 ? new C7898(c1738.f4996) : null;
                    if (c7898 != null) {
                        if (c1748.f5098 == LayoutNode$UsageByParent.NotUsed) {
                            c1748.m3248();
                        }
                        zM3170 = c17562.f5167.m3170(c7898.f21865);
                    } else {
                        zM3170 = false;
                    }
                    if (zM3170) {
                        C1748.m3224(c1756.f5162, false, 7);
                    }
                }
            }
        }
        if (this.f5021 || (!mo3172().f5147 && this.f5030)) {
            this.f5030 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5159;
            c1756.f5159 = LayoutNode$LayoutState.LayingOut;
            c1756.m3303(false);
            C1748 c17482 = c1756.f5162;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c17482)).getSnapshotObserver();
            snapshotObserver.f5274.m2246(c17482, snapshotObserver.f5270, this.f5014);
            c1756.f5159 = layoutNode$LayoutState;
            this.f5021 = false;
        }
        if (c1759.f5198 && c1759.m3321()) {
            c1759.m3323();
        }
        this.f5018 = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1737
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3164(boolean z) {
        C1756 c1756 = this.f5038;
        if (z != c1756.m3301().f5150) {
            c1756.m3301().f5150 = z;
            this.f5042 = true;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3056() {
        return this.f5034;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3168(long j, float f, InterfaceC6558 interfaceC6558) {
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        if (c1748.f5126) {
            AbstractC7936.m13425("place is called on a deactivated node");
        }
        c1756.f5159 = LayoutNode$LayoutState.LayingOut;
        this.f5026 = j;
        this.f5024 = f;
        this.f5025 = interfaceC6558;
        this.f5016 = false;
        InterfaceC1801 interfaceC1801M3306 = AbstractC1757.m3306(c17482);
        if (this.f5030 || !this.f5033) {
            this.f5020.f5195 = false;
            c1756.m3296(false);
            this.f5012 = interfaceC6558;
            this.f5013 = j;
            this.f5041 = f;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3306).getSnapshotObserver();
            snapshotObserver.f5274.m2246(c17482, snapshotObserver.f5269, this.f5040);
        } else {
            AbstractC1794 abstractC1794M3301 = c1756.m3301();
            abstractC1794M3301.m3395(C7908.m13362(j, abstractC1794M3301.f4995), f, interfaceC6558);
            m3169();
        }
        c1756.f5159 = LayoutNode$LayoutState.Idle;
        if (c1756.m3301().f5147 && (c1756.f5170 || c1756.f5173)) {
            requestLayout();
        }
        this.f5028 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3169() {
        this.f5016 = true;
        C1756 c1756 = this.f5038;
        C1748 c1748M3256 = c1756.f5162.m3256();
        float f = mo3172().f5244;
        C1748 c1748 = c1756.f5162;
        C1811 c1811 = c1748.f5094;
        AbstractC1794 abstractC1794 = c1811.f5285;
        C1771 c1771 = c1811.f5286;
        while (abstractC1794 != c1771) {
            abstractC1794.getClass();
            C1753 c1753 = (C1753) abstractC1794;
            f += c1753.f5244;
            abstractC1794 = c1753.f5257;
        }
        if (f != this.f5017) {
            this.f5017 = f;
            if (c1748M3256 != null) {
                c1748M3256.m3230();
            }
            if (c1748M3256 != null) {
                c1748M3256.m3236();
            }
        }
        if (!mo3172().f5147) {
            boolean z = this.f5033;
            if (!z || this.f5020.m3322()) {
                m3179();
            }
            if (z) {
                c1748.f5094.f5286.m3381();
            } else {
                if (c1748M3256 != null) {
                    c1748M3256.m3236();
                }
                if (this.f5039 && c1748M3256 != null) {
                    c1748M3256.m3225(false);
                }
            }
        }
        if (c1748M3256 != null) {
            C1756 c17562 = c1748M3256.f5132;
            if (!this.f5039 && c17562.f5159 == LayoutNode$LayoutState.LayingOut) {
                if (this.f5037 != Integer.MAX_VALUE) {
                    AbstractC7936.m13423("Place was called on a node which was placed already");
                }
                int i = c17562.f5172;
                this.f5037 = i;
                c17562.f5172 = i + 1;
            }
        } else {
            this.f5037 = 0;
        }
        mo3167();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m3170(long j) throws Throwable {
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        try {
            if (c1748.f5126) {
                AbstractC7936.m13425("measure is called on a deactivated node");
            }
            InterfaceC1801 interfaceC1801M3306 = AbstractC1757.m3306(c17482);
            C1748 c1748M3256 = c17482.m3256();
            boolean z = true;
            c17482.f5093 = c17482.f5093 || (c1748M3256 != null && c1748M3256.f5093);
            if (!c17482.m3259() && C7898.m13335(this.f4996, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3306).m3547(c17482, false);
                c17482.m3276();
                return false;
            }
            this.f5020.f5196 = false;
            mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3173().getClass();
                }
            });
            this.f5029 = true;
            long j2 = c1756.m3301().f4998;
            m3140(j);
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5159;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Idle;
            if (layoutNode$LayoutState != layoutNode$LayoutState2) {
                AbstractC7936.m13423("layout state is not idle before measure starts");
            }
            this.f5019 = j;
            LayoutNode$LayoutState layoutNode$LayoutState3 = LayoutNode$LayoutState.Measuring;
            c1756.f5159 = layoutNode$LayoutState3;
            this.f5031 = false;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c17482)).getSnapshotObserver();
            snapshotObserver.f5274.m2246(c17482, snapshotObserver.f5272, this.f5015);
            if (c1756.f5159 == layoutNode$LayoutState3) {
                this.f5030 = true;
                this.f5021 = true;
                c1756.f5159 = layoutNode$LayoutState2;
            }
            if (C7906.m13357(c1756.m3301().f4998, j2) && c1756.m3301().f4999 == this.f4999 && c1756.m3301().f4997 == this.f4997) {
                z = false;
            }
            m3141((((long) c1756.m3301().f4997) & 4294967295L) | (((long) c1756.m3301().f4999) << 32));
            return z;
        } catch (Throwable th) {
            c1748.m3277(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void m3171() {
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        if (!c1748.m3242() || c1756.f5171 <= 0) {
            return;
        }
        C1756 c17562 = c17482.f5132;
        if ((c17562.f5173 || c17562.f5170) && !c17562.f5167.f5030) {
            c17482.m3225(false);
        }
        C1224 c1224M3239 = c17482.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1748) objArr[i2]).f5132.f5167.m3171();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1771 mo3172() {
        return this.f5038.f5162.f5094.f5286;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1770 mo3173() {
        return this.f5020;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        C1756 c1756 = this.f5038;
        if (!AbstractC1785.m3345(c1756.f5162)) {
            m3177();
            return c1756.m3301().mo3057(i);
        }
        C1747 c1747 = c1756.f5165;
        c1747.getClass();
        return c1747.mo3057(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo3174() {
        return this.f5037;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        C1756 c1756 = this.f5038;
        if (!AbstractC1785.m3345(c1756.f5162)) {
            m3177();
            return c1756.m3301().mo3058(i);
        }
        C1747 c1747 = c1756.f5165;
        c1747.getClass();
        return c1747.mo3058(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1769 mo3175() {
        C1756 c1756;
        C1748 c1748M3256 = this.f5038.f5162.m3256();
        if (c1748M3256 == null || (c1756 = c1748M3256.f5132) == null) {
            return null;
        }
        return c1756.f5167;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        C1756 c1756 = this.f5038;
        if (!AbstractC1785.m3345(c1756.f5162)) {
            m3177();
            return c1756.m3301().mo3059(i);
        }
        C1747 c1747 = c1756.f5165;
        c1747.getClass();
        return c1747.mo3059(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final List m3176() {
        C1756 c1756 = this.f5038;
        c1756.f5162.m3268();
        boolean z = this.f5022;
        C1224 c1224 = this.f5023;
        if (!z) {
            return c1224.m2043();
        }
        C1748 c1748 = c1756.f5162;
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c1224.f3520 <= i2) {
                c1224.m2047(c17482.f5132.f5167);
            } else {
                C1738 c1738 = c17482.f5132.f5167;
                Object[] objArr2 = c1224.f3521;
                Object obj = objArr2[i2];
                objArr2[i2] = c1738;
            }
        }
        c1224.m2050(((C1224) ((C0242) c1748.m3257()).f894).f3520, c1224.f3520);
        this.f5022 = false;
        return c1224.m2043();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3177() {
        C1756 c1756 = this.f5038;
        C1748.m3224(c1756.f5162, false, 7);
        C1748 c1748 = c1756.f5162;
        C1748 c1748M3256 = c1748.m3256();
        if (c1748M3256 == null || c1748.f5098 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC1739.f5044[c1748M3256.f5132.f5159.ordinal()];
        c1748.f5098 = i != 1 ? i != 2 ? c1748M3256.f5098 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3178() {
        if (this.f5033) {
            this.f5033 = false;
            C1756 c1756 = this.f5038;
            C1748 c1748 = c1756.f5162;
            C1748 c17482 = c1756.f5162;
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getRectManager().m3690(c17482);
            C1811 c1811 = c17482.f5094;
            AbstractC1794 abstractC1794 = c1811.f5286.f5257;
            for (AbstractC1794 abstractC17942 = c1811.f5285; !AbstractC4395.m8907(abstractC17942, abstractC1794) && abstractC17942 != null; abstractC17942 = abstractC17942.f5257) {
                abstractC17942.m3398();
                abstractC17942.m3396();
            }
            C1224 c1224M3239 = c17482.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                ((C1748) objArr[i2]).f5132.f5167.m3178();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3179() {
        boolean z = this.f5033;
        this.f5033 = true;
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1811 c1811 = c1748.f5094;
        if (!z) {
            c1811.f5286.m3381();
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getRectManager().m3686(c1756.f5162);
            if (c1748.m3259()) {
                C1748.m3224(c1748, true, 6);
            } else if (c1748.f5132.f5158) {
                C1748.m3220(c1748, true, 6);
            }
        }
        AbstractC1794 abstractC1794 = c1811.f5286.f5257;
        for (AbstractC1794 abstractC17942 = c1811.f5285; !AbstractC4395.m8907(abstractC17942, abstractC1794) && abstractC17942 != null; abstractC17942 = abstractC17942.f5257) {
            if (abstractC17942.f5264) {
                abstractC17942.m3382();
            }
        }
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3253() != Integer.MAX_VALUE) {
                c17482.f5132.f5167.m3179();
                C1748.m3223(c17482);
            }
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3128(long j, float f, InterfaceC6558 interfaceC6558) throws Throwable {
        AbstractC1708 placementScope;
        C1756 c1756 = this.f5038;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        try {
            this.f5032 = true;
            if (!C7908.m13364(j, this.f5026) || interfaceC6558 != this.f5025 || this.f5042) {
                if (c1756.f5170 || c1756.f5173 || this.f5042) {
                    this.f5030 = true;
                    this.f5042 = false;
                }
            }
            C1747 c1747 = c1756.f5165;
            if (c1747 != null) {
                C1756 c17562 = c1747.f5087;
                if (c1747.f5084 == LookaheadPassDelegate$PlacedState.IsNotPlaced && !AbstractC1785.m3345(c17562.f5162)) {
                    c17562.f5160 = true;
                }
            }
            C1747 c17472 = c1756.f5165;
            if (c17472 != null && c17472.m3216()) {
                AbstractC1794 abstractC1794 = c1756.m3301().f5256;
                if (abstractC1794 == null || (placementScope = abstractC1794.f5146) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c17482)).getPlacementScope();
                }
                C1747 c17473 = c1756.f5165;
                c17473.getClass();
                C1748 c1748M3256 = c17482.m3256();
                if (c1748M3256 != null) {
                    c1748M3256.f5132.f5168 = 0;
                }
                c17473.f5086 = Integer.MAX_VALUE;
                placementScope.m3135(c17473, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            C1747 c17474 = c1756.f5165;
            if (c17474 != null && !c17474.f5077) {
                AbstractC7936.m13423("Error: Placement happened before lookahead.");
            }
            m3168(j, f, interfaceC6558);
        } catch (Throwable th) {
            c1748.m3277(th);
            throw null;
        }
    }
}
