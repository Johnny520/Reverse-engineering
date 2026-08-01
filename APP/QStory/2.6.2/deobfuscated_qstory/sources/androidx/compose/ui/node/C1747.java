package androidx.compose.ui.node;

import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1747 extends AbstractC1724 implements InterfaceC1655, InterfaceC1769, InterfaceC1737 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f5067;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Object f5068;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f5072;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7897 f5074;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f5075;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5076;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1756 f5086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5084 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5085 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5077 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f5073 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public LookaheadPassDelegate$PlacedState f5083 = LookaheadPassDelegate$PlacedState.IsNotPlaced;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1759 f5082 = new C1759(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1224 f5081 = new C1224(0, new C1747[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5080 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC6542 f5078 = new InterfaceC6542() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3143invoke() {
            C1756 c1756 = this.this$0.f5086;
            c1756.f5167 = 0;
            C1224 c1224M3229 = c1756.f5161.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1747 c1747 = ((C1748) objArr[i2]).f5131.f5164;
                c1747.getClass();
                c1747.f5084 = c1747.f5085;
                c1747.f5085 = Integer.MAX_VALUE;
                if (c1747.f5077 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c1747.f5077 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3163().getClass();
                }
            });
            C1772 c1772 = this.this$0.mo3162().f5201;
            if (c1772 != null) {
                boolean z = c1772.f5146;
                C0242 c0242 = (C0242) this.this$0.f5086.f5161.m3247();
                int i3 = ((C1224) c0242.f894).f3519;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC1745 abstractC1745Mo3275 = ((C1748) c0242.get(i4)).f5093.f5284.mo3275();
                    if (abstractC1745Mo3275 != null) {
                        abstractC1745Mo3275.f5146 = z;
                    }
                }
            }
            C1772 c17722 = this.this$0.mo3162().f5201;
            c17722.getClass();
            c17722.mo3191().mo1461();
            if (this.this$0.mo3162().f5201 != null) {
                C0242 c02422 = (C0242) this.this$0.f5086.f5161.m3247();
                int i5 = ((C1224) c02422.f894).f3519;
                for (int i6 = 0; i6 < i5; i6++) {
                    AbstractC1745 abstractC1745Mo32752 = ((C1748) c02422.get(i6)).f5093.f5284.mo3275();
                    if (abstractC1745Mo32752 != null) {
                        abstractC1745Mo32752.f5146 = false;
                    }
                }
            }
            C1224 c1224M32292 = this.this$0.f5086.f5161.m3229();
            Object[] objArr2 = c1224M32292.f3520;
            int i7 = c1224M32292.f3519;
            for (int i8 = 0; i8 < i7; i8++) {
                C1747 c17472 = ((C1748) objArr2[i8]).f5131.f5164;
                c17472.getClass();
                int i9 = c17472.f5084;
                int i10 = c17472.f5085;
                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                    c17472.m3209(true);
                }
            }
            this.this$0.mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
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
            m3143invoke();
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5069 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f5071 = AbstractC7896.m13296(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC6542 f5070 = new InterfaceC6542() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3145invoke() {
            AbstractC1745 abstractC1745Mo3275 = this.this$0.f5086.m3291().mo3275();
            abstractC1745Mo3275.getClass();
            abstractC1745Mo3275.mo3045(this.this$0.f5071);
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3145invoke();
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC6542 f5066 = new InterfaceC6542() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m3144invoke() {
            /*
                r4 = this;
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5086
                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r0.f5161
                boolean r0 = androidx.compose.ui.node.AbstractC1785.m3335(r0)
                r1 = 0
                if (r0 != 0) goto L26
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5086
                boolean r2 = r0.f5159
                if (r2 != 0) goto L26
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3291()
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.f5255
                if (r0 == 0) goto L34
                androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r0 = r0.mo3275()
                if (r0 == 0) goto L34
                androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰 r1 = r0.f5145
                goto L34
            L26:
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5086
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3291()
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.f5255
                if (r0 == 0) goto L34
                androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰 r1 = r0.f5145
            L34:
                if (r1 != 0) goto L46
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5086
                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r0.f5161
                androidx.compose.ui.node.飘花落叶言子苏哲世兰楪 r0 = androidx.compose.ui.node.AbstractC1757.m3296(r0)
                androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r0 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r0
                androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪 r1 = r0.getPlacementScope()
            L46:
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r4 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r4.f5086
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3291()
                androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r0 = r0.mo3275()
                r0.getClass()
                long r2 = r4.f5073
                androidx.compose.ui.layout.AbstractC1708.m3124(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1.m3144invoke():void");
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3144invoke();
            return C5175.f14739;
        }
    };

    public C1747(C1756 c1756) {
        this.f5086 = c1756;
        this.f5068 = c1756.f5166.f5033;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    public final void requestLayout() {
        C1748 c1748 = this.f5086.f5161;
        C1751 c1751 = C1748.f5088;
        c1748.m3218(false);
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3128() {
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3128();
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3129() {
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3129();
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3155() {
        C1748.m3210(this.f5086.f5161, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3044(int i) {
        m3203();
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3044(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo3156(InterfaceC6557 interfaceC6557) {
        C1224 c1224M3229 = this.f5086.f5161.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1747 c1747 = ((C1748) objArr[i2]).f5131.f5164;
            c1747.getClass();
            interfaceC6557.invoke(c1747);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.AbstractC1724 mo3045(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r5.f5086
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5161
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.f5161
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r1.m3246()
            r3 = 0
            if (r1 == 0) goto L12
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r1.f5131
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f5158
            goto L13
        L12:
            r1 = r3
        L13:
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadMeasuring
            if (r1 == r4) goto L27
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r2.m3246()
            if (r1 == 0) goto L22
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r1.f5131
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f5158
            goto L23
        L22:
            r1 = r3
        L23:
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadLayingOut
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.f5160 = r1
        L2a:
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r2.m3246()
            if (r0 == 0) goto L69
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5131
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r5.f5077
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            if (r1 == r4) goto L42
            boolean r1 = r2.f5092
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            p210.AbstractC7935.m13395(r1)
        L42:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.f5158
            int[] r4 = androidx.compose.ui.node.AbstractC1744.f5056
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L64
            r4 = 2
            if (r1 == r4) goto L64
            r4 = 3
            if (r1 == r4) goto L61
            r4 = 4
            if (r1 != r4) goto L59
            goto L61
        L59:
            java.lang.String r5 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = r0.f5158
            io.ktor.util.C4210.m8615(r6, r5)
            return r3
        L61:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.InLayoutBlock
            goto L66
        L64:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.InMeasureBlock
        L66:
            r5.f5077 = r0
            goto L6d
        L69:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            r5.f5077 = r0
        L6d:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r2.f5097
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            if (r0 != r1) goto L76
            r2.m3238()
        L76:
            r5.m3205(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1747.mo3045(long):androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰");
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo3157() {
        this.f5079 = true;
        C1759 c1759 = this.f5082;
        c1759.m3315();
        C1756 c1756 = this.f5086;
        boolean z = c1756.f5156;
        C1748 c1748 = c1756.f5161;
        if (z) {
            C1224 c1224M3229 = c1748.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c17482 = (C1748) objArr[i2];
                C1756 c17562 = c17482.f5131;
                if (c17562.f5157 && c17482.m3242() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C1747 c1747 = c17562.f5164;
                    c1747.getClass();
                    C1747 c17472 = c17562.f5164;
                    C7897 c7897 = c17472 != null ? c17472.f5074 : null;
                    c7897.getClass();
                    if (c1747.m3205(c7897.f21868)) {
                        C1748.m3210(c1748, false, 7);
                    }
                }
            }
        }
        C1772 c1772 = mo3162().f5201;
        c1772.getClass();
        if (c1756.f5168 || (!c1772.f5146 && c1756.f5156)) {
            c1756.f5156 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5158;
            c1756.f5158 = LayoutNode$LayoutState.LookaheadLayingOut;
            c1756.m3294(false);
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getSnapshotObserver();
            snapshotObserver.f5273.m2236(c1748, snapshotObserver.f5274, this.f5078);
            c1756.f5158 = layoutNode$LayoutState;
            if (c1756.f5163 && c1772.f5146) {
                requestLayout();
            }
            c1756.f5168 = false;
        }
        if (c1759.f5197 && c1759.m3311()) {
            c1759.m3313();
        }
        this.f5079 = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1737
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3154(boolean z) {
        AbstractC1745 abstractC1745Mo3275;
        C1756 c1756 = this.f5086;
        AbstractC1745 abstractC1745Mo32752 = c1756.m3291().mo3275();
        if (Boolean.valueOf(z).equals(abstractC1745Mo32752 != null ? Boolean.valueOf(abstractC1745Mo32752.f5149) : null) || (abstractC1745Mo3275 = c1756.m3291().mo3275()) == null) {
            return;
        }
        abstractC1745Mo3275.f5149 = z;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3046() {
        return this.f5068;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3202() {
        LayoutNode$LayoutState layoutNode$LayoutState;
        this.f5067 = true;
        C1756 c1756 = this.f5086;
        C1748 c1748M3246 = c1756.f5161.m3246();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5083;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && !c1756.f5159) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInApproach && c1756.f5159)) {
            m3208();
            if (this.f5087 && c1748M3246 != null) {
                c1748M3246.m3218(false);
            }
        }
        if (c1748M3246 != null) {
            C1756 c17562 = c1748M3246.f5131;
            if (!this.f5087 && ((layoutNode$LayoutState = c17562.f5158) == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut)) {
                if (this.f5085 != Integer.MAX_VALUE) {
                    AbstractC7935.m13395("Place was called on a node which was placed already");
                }
                int i = c17562.f5167;
                this.f5085 = i;
                c17562.f5167 = i + 1;
            }
        } else {
            this.f5085 = 0;
        }
        mo3157();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3203() {
        C1756 c1756 = this.f5086;
        C1748.m3210(c1756.f5161, false, 7);
        C1748 c1748 = c1756.f5161;
        C1748 c1748M3246 = c1748.m3246();
        if (c1748M3246 == null || c1748.f5097 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC1744.f5056[c1748M3246.f5131.f5158.ordinal()];
        c1748.f5097 = i != 2 ? i != 3 ? c1748M3246.f5097 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3204(long r10, p052.InterfaceC6557 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r9.f5086
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5161
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.f5161
            r3 = 0
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r4 = r1.m3246()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r4 = r4.f5131     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = r4.f5158     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            androidx.compose.ui.node.LayoutNode$LayoutState r5 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadLayingOut     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.f5159 = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r9 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.f5125     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            p210.AbstractC7935.m13397(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.f5158 = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.f5076 = r4     // Catch: java.lang.Throwable -> L1b
            r9.f5067 = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f5073     // Catch: java.lang.Throwable -> L1b
            boolean r5 = p205.C7907.m13336(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.f5162     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.f5163     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f5156 = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.m3207()     // Catch: java.lang.Throwable -> L1b
        L42:
            androidx.compose.ui.node.飘花落叶言子苏哲世兰楪 r5 = androidx.compose.ui.node.AbstractC1757.m3296(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f5073 = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f5156     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r7 = r9.f5083     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r8 = androidx.compose.ui.node.LookaheadPassDelegate$PlacedState.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r2 = r0.m3291()     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r2 = r2.mo3275()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f4994     // Catch: java.lang.Throwable -> L1b
            long r10 = p205.C7907.m13334(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.m3200(r10)     // Catch: java.lang.Throwable -> L1b
            r9.m3202()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.m3292(r6)     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子世苏楪哲兰 r10 = r9.f5082     // Catch: java.lang.Throwable -> L1b
            r10.f5194 = r6     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r5 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r5     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子苏哲兰世楪 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r11 = r9.f5066     // Catch: java.lang.Throwable -> L1b
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r10.f5275     // Catch: java.lang.Throwable -> L1b
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏 r10 = r10.f5273     // Catch: java.lang.Throwable -> L1b
            r10.m2236(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.f5072 = r12     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LayoutNode$LayoutState r9 = androidx.compose.ui.node.LayoutNode$LayoutState.Idle     // Catch: java.lang.Throwable -> L1b
            r0.f5158 = r9     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.m3267(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1747.m3204(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m3205(long j) throws Throwable {
        C1756 c1756 = this.f5086;
        C1748 c1748 = c1756.f5161;
        C1748 c17482 = c1756.f5161;
        try {
            if (c1748.f5125) {
                AbstractC7935.m13397("measure is called on a deactivated node");
            }
            C1748 c1748M3246 = c17482.m3246();
            c17482.f5092 = c17482.f5092 || (c1748M3246 != null && c1748M3246.f5092);
            if (!c17482.f5131.f5157) {
                C7897 c7897 = this.f5074;
                if (c7897 == null ? false : C7897.m13307(c7897.f21868, j)) {
                    InterfaceC1801 interfaceC1801 = c17482.f5104;
                    if (interfaceC1801 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3537(c17482, true);
                    }
                    c17482.m3266();
                    return false;
                }
            }
            this.f5074 = new C7897(j);
            m3130(j);
            this.f5082.f5195 = false;
            mo3156(new InterfaceC6557() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3163().getClass();
                }
            });
            long j2 = this.f5075 ? this.f4997 : -9223372034707292160L;
            this.f5075 = true;
            AbstractC1745 abstractC1745Mo3275 = c1756.m3291().mo3275();
            if (abstractC1745Mo3275 == null) {
                AbstractC7935.m13395("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c1756.m3289(j);
            m3131((((long) abstractC1745Mo3275.f4998) << 32) | (((long) abstractC1745Mo3275.f4996) & 4294967295L));
            return (((int) (j2 >> 32)) == abstractC1745Mo3275.f4998 && ((int) (j2 & 4294967295L)) == abstractC1745Mo3275.f4996) ? false : true;
        } catch (Throwable th) {
            c1748.m3267(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1771 mo3162() {
        return this.f5086.f5161.f5093.f5285;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1770 mo3163() {
        return this.f5082;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3047(int i) {
        m3203();
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3047(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo3164() {
        return this.f5085;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3048(int i) {
        m3203();
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3048(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC1769 mo3165() {
        C1756 c1756;
        C1748 c1748M3246 = this.f5086.f5161.m3246();
        if (c1748M3246 == null || (c1756 = c1748M3246.f5131) == null) {
            return null;
        }
        return c1756.f5164;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3049(int i) {
        m3203();
        AbstractC1745 abstractC1745Mo3275 = this.f5086.m3291().mo3275();
        abstractC1745Mo3275.getClass();
        return abstractC1745Mo3275.mo3049(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m3206() {
        C1756 c1756 = this.f5086;
        return AbstractC1785.m3335(c1756.f5161) || c1756.f5159;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3207() {
        C1756 c1756 = this.f5086;
        if (c1756.f5165 > 0) {
            C1224 c1224M3229 = c1756.f5161.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c1748 = (C1748) objArr[i2];
                C1756 c17562 = c1748.f5131;
                if ((c17562.f5163 || c17562.f5162) && !c17562.f5156) {
                    c1748.m3218(false);
                }
                C1747 c1747 = c17562.f5164;
                if (c1747 != null) {
                    c1747.m3207();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3208() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5083;
        C1756 c1756 = this.f5086;
        boolean z = c1756.f5159;
        C1748 c1748 = c1756.f5161;
        if (z) {
            this.f5083 = LookaheadPassDelegate$PlacedState.IsPlacedInApproach;
        } else {
            this.f5083 = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && c1756.f5157) {
            C1748.m3210(c1748, true, 6);
        }
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            C1747 c1747 = c17482.f5131.f5164;
            if (c1747 == null) {
                C5919.m11249("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c1747.f5085 != Integer.MAX_VALUE) {
                c1747.m3208();
                C1748.m3213(c17482);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3209(boolean z) {
        if (z && m3206()) {
            return;
        }
        if (z || m3206()) {
            this.f5083 = LookaheadPassDelegate$PlacedState.IsNotPlaced;
            C1224 c1224M3229 = this.f5086.f5161.m3229();
            Object[] objArr = c1224M3229.f3520;
            int i = c1224M3229.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1747 c1747 = ((C1748) objArr[i2]).f5131.f5164;
                c1747.getClass();
                c1747.m3209(true);
            }
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3118(long j, float f, InterfaceC6557 interfaceC6557) throws Throwable {
        m3204(j, interfaceC6557);
    }
}
