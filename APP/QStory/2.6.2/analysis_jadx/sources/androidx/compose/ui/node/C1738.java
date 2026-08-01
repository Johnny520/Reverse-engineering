package androidx.compose.ui.node;

import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;
import p205.C7905;
import p205.C7907;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1738 extends AbstractC1724 implements InterfaceC1655, InterfaceC1769, InterfaceC1737 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC6557 f5011;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f5015;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f5016;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f5017;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5020;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f5023;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC6557 f5024;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5027;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5028;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5029;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5030;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5031;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5032;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Object f5033;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1756 f5037;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5038;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f5040;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f5041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5035 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5036 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5026 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f5025 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f5034 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C1759 f5019 = new C1759(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1224 f5022 = new C1224(0, new C1738[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f5021 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public long f5018 = AbstractC7896.m13296(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f5014 = new InterfaceC6542() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3147invoke() {
            this.this$0.f5037.m3291().mo3045(this.this$0.f5018);
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3147invoke();
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC6542 f5013 = new InterfaceC6542() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3146invoke() {
            C1756 c1756 = this.this$0.f5037;
            c1756.f5171 = 0;
            C1224 c1224M3229 = c1756.f5161.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1738 c1738 = ((C1748) objArr[i2]).f5131.f5166;
                c1738.f5035 = c1738.f5036;
                c1738.f5036 = Integer.MAX_VALUE;
                c1738.f5031 = false;
                if (c1738.f5026 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c1738.f5026 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3163().getClass();
                }
            });
            if (this.this$0.mo3162().f5146) {
                C0242 c0242 = (C0242) this.this$0.f5037.f5161.m3247();
                int i3 = ((C1224) c0242.f894).f3519;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((C1748) c0242.get(i4)).f5093.f5284.f5146 = true;
                }
            }
            this.this$0.mo3162().mo3191().mo1461();
            if (this.this$0.mo3162().f5146) {
                C0242 c02422 = (C0242) this.this$0.f5037.f5161.m3247();
                int i5 = ((C1224) c02422.f894).f3519;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C1748) c02422.get(i6)).f5093.f5284.f5146 = false;
                }
            }
            C1748 c1748 = this.this$0.f5037.f5161;
            C1224 c1224M32292 = c1748.m3229();
            Object[] objArr2 = c1224M32292.f3520;
            int i7 = c1224M32292.f3519;
            for (int i8 = 0; i8 < i7; i8++) {
                C1748 c17482 = (C1748) objArr2[i8];
                C1756 c17562 = c17482.f5131;
                if (c17562.f5166.f5035 != c17482.m3243()) {
                    c1748.m3220();
                    c1748.m3226();
                    if (c17482.m3243() == Integer.MAX_VALUE) {
                        if (c17562.f5159 || AbstractC1785.m3335(c17482)) {
                            C1747 c1747 = c17562.f5164;
                            c1747.getClass();
                            c1747.m3209(false);
                        }
                        c17562.f5166.m3168();
                    }
                }
            }
            this.this$0.mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
                public final void invoke(InterfaceC1769 interfaceC1769) {
                    AbstractC1770 abstractC1770Mo3163 = interfaceC1769.mo3163();
                    interfaceC1769.mo3163().getClass();
                    abstractC1770Mo3163.f5196 = false;
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5175.f14739;
                }
            });
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3146invoke();
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public long f5012 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final InterfaceC6542 f5039 = new InterfaceC6542() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3148invoke() {
            AbstractC1708 placementScope;
            AbstractC1794 abstractC1794 = this.this$0.f5037.m3291().f5255;
            if (abstractC1794 == null || (placementScope = abstractC1794.f5145) == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.this$0.f5037.f5161)).getPlacementScope();
            }
            C1738 c1738 = this.this$0;
            InterfaceC6557 interfaceC6557 = c1738.f5011;
            C1756 c1756 = c1738.f5037;
            if (interfaceC6557 == null) {
                AbstractC1794 abstractC1794M3291 = c1756.m3291();
                long j = c1738.f5012;
                float f = c1738.f5040;
                placementScope.getClass();
                AbstractC1708.m3119(placementScope, abstractC1794M3291);
                abstractC1794M3291.mo3118(C7907.m13334(j, abstractC1794M3291.f4994), f, null);
                return;
            }
            AbstractC1794 abstractC1794M32912 = c1756.m3291();
            long j2 = c1738.f5012;
            float f2 = c1738.f5040;
            placementScope.getClass();
            AbstractC1708.m3119(placementScope, abstractC1794M32912);
            abstractC1794M32912.mo3118(C7907.m13334(j2, abstractC1794M32912.f4994), f2, interfaceC6557);
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3148invoke();
            return C5175.f14739;
        }
    };

    public C1738(C1756 c1756) {
        this.f5037 = c1756;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    public final void requestLayout() {
        C1748 c1748 = this.f5037.f5161;
        C1751 c1751 = C1748.f5088;
        c1748.m3215(false);
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3128() {
        return this.f5037.m3291().mo3128();
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3129() {
        return this.f5037.m3291().mo3129();
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo3155() {
        C1748.m3214(this.f5037.f5161, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3044(int i) {
        C1756 c1756 = this.f5037;
        if (!AbstractC1785.m3335(c1756.f5161)) {
            m3167();
            return c1756.m3291().mo3044(i);
        }
        C1747 c1747 = c1756.f5164;
        c1747.getClass();
        return c1747.mo3044(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3156(InterfaceC6557 interfaceC6557) {
        C1224 c1224M3229 = this.f5037.f5161.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC6557.invoke(((C1748) objArr[i2]).f5131.f5166);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3045(long j) throws Throwable {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = c1748.f5097;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = LayoutNode$UsageByParent.NotUsed;
        if (layoutNode$UsageByParent2 == layoutNode$UsageByParent3) {
            c1748.m3238();
        }
        if (AbstractC1785.m3335(c17482)) {
            C1747 c1747 = c1756.f5164;
            c1747.getClass();
            c1747.f5077 = layoutNode$UsageByParent3;
            c1747.mo3045(j);
        }
        C1748 c1748M3246 = c17482.m3246();
        if (c1748M3246 != null) {
            C1756 c17562 = c1748M3246.f5131;
            if (this.f5026 != layoutNode$UsageByParent3 && !c17482.f5092) {
                AbstractC7935.m13395("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = AbstractC1739.f5043[c17562.f5158.ordinal()];
            if (i == 1) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    C4210.m8615(c17562.f5158, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f5026 = layoutNode$UsageByParent;
        } else {
            this.f5026 = layoutNode$UsageByParent3;
        }
        m3160(j);
        return this;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo3157() {
        boolean zM3160;
        this.f5017 = true;
        C1759 c1759 = this.f5019;
        c1759.m3315();
        boolean z = this.f5029;
        C1756 c1756 = this.f5037;
        if (z) {
            C1224 c1224M3229 = c1756.f5161.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c1748 = (C1748) objArr[i2];
                boolean zM3249 = c1748.m3249();
                C1756 c17562 = c1748.f5131;
                if (zM3249 && c1748.m3250() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C1738 c1738 = c17562.f5166;
                    C7897 c7897 = c1738.f5028 ? new C7897(c1738.f4995) : null;
                    if (c7897 != null) {
                        if (c1748.f5097 == LayoutNode$UsageByParent.NotUsed) {
                            c1748.m3238();
                        }
                        zM3160 = c17562.f5166.m3160(c7897.f21868);
                    } else {
                        zM3160 = false;
                    }
                    if (zM3160) {
                        C1748.m3214(c1756.f5161, false, 7);
                    }
                }
            }
        }
        if (this.f5020 || (!mo3162().f5146 && this.f5029)) {
            this.f5029 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5158;
            c1756.f5158 = LayoutNode$LayoutState.LayingOut;
            c1756.m3293(false);
            C1748 c17482 = c1756.f5161;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c17482)).getSnapshotObserver();
            snapshotObserver.f5273.m2236(c17482, snapshotObserver.f5269, this.f5013);
            c1756.f5158 = layoutNode$LayoutState;
            this.f5020 = false;
        }
        if (c1759.f5197 && c1759.m3311()) {
            c1759.m3313();
        }
        this.f5017 = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1737
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3154(boolean z) {
        C1756 c1756 = this.f5037;
        if (z != c1756.m3291().f5149) {
            c1756.m3291().f5149 = z;
            this.f5041 = true;
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3046() {
        return this.f5033;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3158(long j, float f, InterfaceC6557 interfaceC6557) {
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        if (c1748.f5125) {
            AbstractC7935.m13397("place is called on a deactivated node");
        }
        c1756.f5158 = LayoutNode$LayoutState.LayingOut;
        this.f5025 = j;
        this.f5023 = f;
        this.f5024 = interfaceC6557;
        this.f5015 = false;
        InterfaceC1801 interfaceC1801M3296 = AbstractC1757.m3296(c17482);
        if (this.f5029 || !this.f5032) {
            this.f5019.f5194 = false;
            c1756.m3286(false);
            this.f5011 = interfaceC6557;
            this.f5012 = j;
            this.f5040 = f;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3296).getSnapshotObserver();
            snapshotObserver.f5273.m2236(c17482, snapshotObserver.f5268, this.f5039);
        } else {
            AbstractC1794 abstractC1794M3291 = c1756.m3291();
            abstractC1794M3291.m3385(C7907.m13334(j, abstractC1794M3291.f4994), f, interfaceC6557);
            m3159();
        }
        c1756.f5158 = LayoutNode$LayoutState.Idle;
        if (c1756.m3291().f5146 && (c1756.f5169 || c1756.f5172)) {
            requestLayout();
        }
        this.f5027 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3159() {
        this.f5015 = true;
        C1756 c1756 = this.f5037;
        C1748 c1748M3246 = c1756.f5161.m3246();
        float f = mo3162().f5243;
        C1748 c1748 = c1756.f5161;
        C1811 c1811 = c1748.f5093;
        AbstractC1794 abstractC1794 = c1811.f5284;
        C1771 c1771 = c1811.f5285;
        while (abstractC1794 != c1771) {
            abstractC1794.getClass();
            C1753 c1753 = (C1753) abstractC1794;
            f += c1753.f5243;
            abstractC1794 = c1753.f5256;
        }
        if (f != this.f5016) {
            this.f5016 = f;
            if (c1748M3246 != null) {
                c1748M3246.m3220();
            }
            if (c1748M3246 != null) {
                c1748M3246.m3226();
            }
        }
        if (!mo3162().f5146) {
            boolean z = this.f5032;
            if (!z || this.f5019.m3312()) {
                m3169();
            }
            if (z) {
                c1748.f5093.f5285.m3371();
            } else {
                if (c1748M3246 != null) {
                    c1748M3246.m3226();
                }
                if (this.f5038 && c1748M3246 != null) {
                    c1748M3246.m3215(false);
                }
            }
        }
        if (c1748M3246 != null) {
            C1756 c17562 = c1748M3246.f5131;
            if (!this.f5038 && c17562.f5158 == LayoutNode$LayoutState.LayingOut) {
                if (this.f5036 != Integer.MAX_VALUE) {
                    AbstractC7935.m13395("Place was called on a node which was placed already");
                }
                int i = c17562.f5171;
                this.f5036 = i;
                c17562.f5171 = i + 1;
            }
        } else {
            this.f5036 = 0;
        }
        mo3157();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m3160(long j) throws Throwable {
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        try {
            if (c1748.f5125) {
                AbstractC7935.m13397("measure is called on a deactivated node");
            }
            InterfaceC1801 interfaceC1801M3296 = AbstractC1757.m3296(c17482);
            C1748 c1748M3246 = c17482.m3246();
            boolean z = true;
            c17482.f5092 = c17482.f5092 || (c1748M3246 != null && c1748M3246.f5092);
            if (!c17482.m3249() && C7897.m13307(this.f4995, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3296).m3537(c17482, false);
                c17482.m3266();
                return false;
            }
            this.f5019.f5195 = false;
            mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3163().getClass();
                }
            });
            this.f5028 = true;
            long j2 = c1756.m3291().f4997;
            m3130(j);
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5158;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Idle;
            if (layoutNode$LayoutState != layoutNode$LayoutState2) {
                AbstractC7935.m13395("layout state is not idle before measure starts");
            }
            this.f5018 = j;
            LayoutNode$LayoutState layoutNode$LayoutState3 = LayoutNode$LayoutState.Measuring;
            c1756.f5158 = layoutNode$LayoutState3;
            this.f5030 = false;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c17482)).getSnapshotObserver();
            snapshotObserver.f5273.m2236(c17482, snapshotObserver.f5271, this.f5014);
            if (c1756.f5158 == layoutNode$LayoutState3) {
                this.f5029 = true;
                this.f5020 = true;
                c1756.f5158 = layoutNode$LayoutState2;
            }
            if (C7905.m13329(c1756.m3291().f4997, j2) && c1756.m3291().f4998 == this.f4998 && c1756.m3291().f4996 == this.f4996) {
                z = false;
            }
            m3131((((long) c1756.m3291().f4996) & 4294967295L) | (((long) c1756.m3291().f4998) << 32));
            return z;
        } catch (Throwable th) {
            c1748.m3267(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void m3161() {
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        if (!c1748.m3232() || c1756.f5170 <= 0) {
            return;
        }
        C1756 c17562 = c17482.f5131;
        if ((c17562.f5172 || c17562.f5169) && !c17562.f5166.f5029) {
            c17482.m3215(false);
        }
        C1224 c1224M3229 = c17482.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1748) objArr[i2]).f5131.f5166.m3161();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1771 mo3162() {
        return this.f5037.f5161.f5093.f5285;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1770 mo3163() {
        return this.f5019;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3047(int i) {
        C1756 c1756 = this.f5037;
        if (!AbstractC1785.m3335(c1756.f5161)) {
            m3167();
            return c1756.m3291().mo3047(i);
        }
        C1747 c1747 = c1756.f5164;
        c1747.getClass();
        return c1747.mo3047(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo3164() {
        return this.f5036;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3048(int i) {
        C1756 c1756 = this.f5037;
        if (!AbstractC1785.m3335(c1756.f5161)) {
            m3167();
            return c1756.m3291().mo3048(i);
        }
        C1747 c1747 = c1756.f5164;
        c1747.getClass();
        return c1747.mo3048(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1769 mo3165() {
        C1756 c1756;
        C1748 c1748M3246 = this.f5037.f5161.m3246();
        if (c1748M3246 == null || (c1756 = c1748M3246.f5131) == null) {
            return null;
        }
        return c1756.f5166;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3049(int i) {
        C1756 c1756 = this.f5037;
        if (!AbstractC1785.m3335(c1756.f5161)) {
            m3167();
            return c1756.m3291().mo3049(i);
        }
        C1747 c1747 = c1756.f5164;
        c1747.getClass();
        return c1747.mo3049(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final List m3166() {
        C1756 c1756 = this.f5037;
        c1756.f5161.m3258();
        boolean z = this.f5021;
        C1224 c1224 = this.f5022;
        if (!z) {
            return c1224.m2033();
        }
        C1748 c1748 = c1756.f5161;
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c1224.f3519 <= i2) {
                c1224.m2037(c17482.f5131.f5166);
            } else {
                C1738 c1738 = c17482.f5131.f5166;
                Object[] objArr2 = c1224.f3520;
                Object obj = objArr2[i2];
                objArr2[i2] = c1738;
            }
        }
        c1224.m2040(((C1224) ((C0242) c1748.m3247()).f894).f3519, c1224.f3519);
        this.f5021 = false;
        return c1224.m2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3167() {
        C1756 c1756 = this.f5037;
        C1748.m3214(c1756.f5161, false, 7);
        C1748 c1748 = c1756.f5161;
        C1748 c1748M3246 = c1748.m3246();
        if (c1748M3246 == null || c1748.f5097 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC1739.f5043[c1748M3246.f5131.f5158.ordinal()];
        c1748.f5097 = i != 1 ? i != 2 ? c1748M3246.f5097 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3168() {
        if (this.f5032) {
            this.f5032 = false;
            C1756 c1756 = this.f5037;
            C1748 c1748 = c1756.f5161;
            C1748 c17482 = c1756.f5161;
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getRectManager().m3680(c17482);
            C1811 c1811 = c17482.f5093;
            AbstractC1794 abstractC1794 = c1811.f5285.f5256;
            for (AbstractC1794 abstractC17942 = c1811.f5284; !AbstractC4394.m8917(abstractC17942, abstractC1794) && abstractC17942 != null; abstractC17942 = abstractC17942.f5256) {
                abstractC17942.m3388();
                abstractC17942.m3386();
            }
            C1224 c1224M3229 = c17482.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                ((C1748) objArr[i2]).f5131.f5166.m3168();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3169() {
        boolean z = this.f5032;
        this.f5032 = true;
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1811 c1811 = c1748.f5093;
        if (!z) {
            c1811.f5285.m3371();
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getRectManager().m3676(c1756.f5161);
            if (c1748.m3249()) {
                C1748.m3214(c1748, true, 6);
            } else if (c1748.f5131.f5157) {
                C1748.m3210(c1748, true, 6);
            }
        }
        AbstractC1794 abstractC1794 = c1811.f5285.f5256;
        for (AbstractC1794 abstractC17942 = c1811.f5284; !AbstractC4394.m8917(abstractC17942, abstractC1794) && abstractC17942 != null; abstractC17942 = abstractC17942.f5256) {
            if (abstractC17942.f5263) {
                abstractC17942.m3372();
            }
        }
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3243() != Integer.MAX_VALUE) {
                c17482.f5131.f5166.m3169();
                C1748.m3213(c17482);
            }
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3118(long j, float f, InterfaceC6557 interfaceC6557) throws Throwable {
        AbstractC1708 placementScope;
        C1756 c1756 = this.f5037;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        try {
            this.f5031 = true;
            if (!C7907.m13336(j, this.f5025) || interfaceC6557 != this.f5024 || this.f5041) {
                if (c1756.f5169 || c1756.f5172 || this.f5041) {
                    this.f5029 = true;
                    this.f5041 = false;
                }
            }
            C1747 c1747 = c1756.f5164;
            if (c1747 != null) {
                C1756 c17562 = c1747.f5086;
                if (c1747.f5083 == LookaheadPassDelegate$PlacedState.IsNotPlaced && !AbstractC1785.m3335(c17562.f5161)) {
                    c17562.f5159 = true;
                }
            }
            C1747 c17472 = c1756.f5164;
            if (c17472 != null && c17472.m3206()) {
                AbstractC1794 abstractC1794 = c1756.m3291().f5255;
                if (abstractC1794 == null || (placementScope = abstractC1794.f5145) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c17482)).getPlacementScope();
                }
                C1747 c17473 = c1756.f5164;
                c17473.getClass();
                C1748 c1748M3246 = c17482.m3246();
                if (c1748M3246 != null) {
                    c1748M3246.f5131.f5167 = 0;
                }
                c17473.f5085 = Integer.MAX_VALUE;
                placementScope.m3125(c17473, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            C1747 c17474 = c1756.f5164;
            if (c17474 != null && !c17474.f5076) {
                AbstractC7935.m13395("Error: Placement happened before lookahead.");
            }
            m3158(j, f, interfaceC6557);
        } catch (Throwable th) {
            c1748.m3267(th);
            throw null;
        }
    }
}
