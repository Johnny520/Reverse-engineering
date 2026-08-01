package androidx.compose.ui.node;

import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.AbstractC7897;
import p205.C7898;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1747 extends AbstractC1724 implements InterfaceC1655, InterfaceC1769, InterfaceC1737 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f5068;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Object f5069;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f5073;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7898 f5075;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f5076;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5077;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1756 f5087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5088;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5085 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5086 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5078 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f5074 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public LookaheadPassDelegate$PlacedState f5084 = LookaheadPassDelegate$PlacedState.IsNotPlaced;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1759 f5083 = new C1759(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1224 f5082 = new C1224(0, new C1747[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5081 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC6543 f5079 = new InterfaceC6543() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3153invoke() {
            C1756 c1756 = this.this$0.f5087;
            c1756.f5168 = 0;
            C1224 c1224M3239 = c1756.f5162.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1747 c1747 = ((C1748) objArr[i2]).f5132.f5165;
                c1747.getClass();
                c1747.f5085 = c1747.f5086;
                c1747.f5086 = Integer.MAX_VALUE;
                if (c1747.f5078 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c1747.f5078 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3173().getClass();
                }
            });
            C1772 c1772 = this.this$0.mo3172().f5202;
            if (c1772 != null) {
                boolean z = c1772.f5147;
                C0242 c0242 = (C0242) this.this$0.f5087.f5162.m3257();
                int i3 = ((C1224) c0242.f894).f3520;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC1745 abstractC1745Mo3285 = ((C1748) c0242.get(i4)).f5094.f5285.mo3285();
                    if (abstractC1745Mo3285 != null) {
                        abstractC1745Mo3285.f5147 = z;
                    }
                }
            }
            C1772 c17722 = this.this$0.mo3172().f5202;
            c17722.getClass();
            c17722.mo3201().mo1471();
            if (this.this$0.mo3172().f5202 != null) {
                C0242 c02422 = (C0242) this.this$0.f5087.f5162.m3257();
                int i5 = ((C1224) c02422.f894).f3520;
                for (int i6 = 0; i6 < i5; i6++) {
                    AbstractC1745 abstractC1745Mo32852 = ((C1748) c02422.get(i6)).f5094.f5285.mo3285();
                    if (abstractC1745Mo32852 != null) {
                        abstractC1745Mo32852.f5147 = false;
                    }
                }
            }
            C1224 c1224M32392 = this.this$0.f5087.f5162.m3239();
            Object[] objArr2 = c1224M32392.f3521;
            int i7 = c1224M32392.f3520;
            for (int i8 = 0; i8 < i7; i8++) {
                C1747 c17472 = ((C1748) objArr2[i8]).f5132.f5165;
                c17472.getClass();
                int i9 = c17472.f5085;
                int i10 = c17472.f5086;
                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                    c17472.m3219(true);
                }
            }
            this.this$0.mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
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
            m3153invoke();
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5070 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f5072 = AbstractC7897.m13324(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC6543 f5071 = new InterfaceC6543() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3155invoke() {
            AbstractC1745 abstractC1745Mo3285 = this.this$0.f5087.m3301().mo3285();
            abstractC1745Mo3285.getClass();
            abstractC1745Mo3285.mo3055(this.this$0.f5072);
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3155invoke();
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC6543 f5067 = new InterfaceC6543() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m3154invoke() {
            /*
                r4 = this;
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5087
                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r0.f5162
                boolean r0 = androidx.compose.ui.node.AbstractC1785.m3345(r0)
                r1 = 0
                if (r0 != 0) goto L26
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5087
                boolean r2 = r0.f5160
                if (r2 != 0) goto L26
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3301()
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.f5256
                if (r0 == 0) goto L34
                androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r0 = r0.mo3285()
                if (r0 == 0) goto L34
                androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰 r1 = r0.f5146
                goto L34
            L26:
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5087
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3301()
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.f5256
                if (r0 == 0) goto L34
                androidx.compose.ui.layout.飘花落叶言子世哲苏楪兰 r1 = r0.f5146
            L34:
                if (r1 != 0) goto L46
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r0 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5087
                androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r0.f5162
                androidx.compose.ui.node.飘花落叶言子苏哲世兰楪 r0 = androidx.compose.ui.node.AbstractC1757.m3306(r0)
                androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r0 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r0
                androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪 r1 = r0.getPlacementScope()
            L46:
                androidx.compose.ui.node.飘花落叶言子世哲苏楪兰 r4 = r4.this$0
                androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r4.f5087
                androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r0 = r0.m3301()
                androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r0 = r0.mo3285()
                r0.getClass()
                long r2 = r4.f5074
                androidx.compose.ui.layout.AbstractC1708.m3134(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1.m3154invoke():void");
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3154invoke();
            return C5176.f14739;
        }
    };

    public C1747(C1756 c1756) {
        this.f5087 = c1756;
        this.f5069 = c1756.f5167.f5034;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    public final void requestLayout() {
        C1748 c1748 = this.f5087.f5162;
        C1751 c1751 = C1748.f5089;
        c1748.m3228(false);
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3138() {
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3138();
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3139() {
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3139();
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3165() {
        C1748.m3220(this.f5087.f5162, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        m3213();
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3054(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo3166(InterfaceC6558 interfaceC6558) {
        C1224 c1224M3239 = this.f5087.f5162.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1747 c1747 = ((C1748) objArr[i2]).f5132.f5165;
            c1747.getClass();
            interfaceC6558.invoke(c1747);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.AbstractC1724 mo3055(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r5.f5087
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5162
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.f5162
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r1.m3256()
            r3 = 0
            if (r1 == 0) goto L12
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r1.f5132
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f5159
            goto L13
        L12:
            r1 = r3
        L13:
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadMeasuring
            if (r1 == r4) goto L27
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r2.m3256()
            if (r1 == 0) goto L22
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r1 = r1.f5132
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f5159
            goto L23
        L22:
            r1 = r3
        L23:
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadLayingOut
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.f5161 = r1
        L2a:
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r2.m3256()
            if (r0 == 0) goto L69
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r0.f5132
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r5.f5078
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            if (r1 == r4) goto L42
            boolean r1 = r2.f5093
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            p210.AbstractC7936.m13423(r1)
        L42:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.f5159
            int[] r4 = androidx.compose.ui.node.AbstractC1744.f5057
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
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = r0.f5159
            io.ktor.util.C4211.m8605(r6, r5)
            return r3
        L61:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.InLayoutBlock
            goto L66
        L64:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.InMeasureBlock
        L66:
            r5.f5078 = r0
            goto L6d
        L69:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            r5.f5078 = r0
        L6d:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r2.f5098
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.NotUsed
            if (r0 != r1) goto L76
            r2.m3248()
        L76:
            r5.m3215(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1747.mo3055(long):androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰");
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo3167() {
        this.f5080 = true;
        C1759 c1759 = this.f5083;
        c1759.m3325();
        C1756 c1756 = this.f5087;
        boolean z = c1756.f5157;
        C1748 c1748 = c1756.f5162;
        if (z) {
            C1224 c1224M3239 = c1748.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c17482 = (C1748) objArr[i2];
                C1756 c17562 = c17482.f5132;
                if (c17562.f5158 && c17482.m3252() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C1747 c1747 = c17562.f5165;
                    c1747.getClass();
                    C1747 c17472 = c17562.f5165;
                    C7898 c7898 = c17472 != null ? c17472.f5075 : null;
                    c7898.getClass();
                    if (c1747.m3215(c7898.f21865)) {
                        C1748.m3220(c1748, false, 7);
                    }
                }
            }
        }
        C1772 c1772 = mo3172().f5202;
        c1772.getClass();
        if (c1756.f5169 || (!c1772.f5147 && c1756.f5157)) {
            c1756.f5157 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5159;
            c1756.f5159 = LayoutNode$LayoutState.LookaheadLayingOut;
            c1756.m3304(false);
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getSnapshotObserver();
            snapshotObserver.f5274.m2246(c1748, snapshotObserver.f5275, this.f5079);
            c1756.f5159 = layoutNode$LayoutState;
            if (c1756.f5164 && c1772.f5147) {
                requestLayout();
            }
            c1756.f5169 = false;
        }
        if (c1759.f5198 && c1759.m3321()) {
            c1759.m3323();
        }
        this.f5080 = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1737
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3164(boolean z) {
        AbstractC1745 abstractC1745Mo3285;
        C1756 c1756 = this.f5087;
        AbstractC1745 abstractC1745Mo32852 = c1756.m3301().mo3285();
        if (Boolean.valueOf(z).equals(abstractC1745Mo32852 != null ? Boolean.valueOf(abstractC1745Mo32852.f5150) : null) || (abstractC1745Mo3285 = c1756.m3301().mo3285()) == null) {
            return;
        }
        abstractC1745Mo3285.f5150 = z;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3056() {
        return this.f5069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3212() {
        LayoutNode$LayoutState layoutNode$LayoutState;
        this.f5068 = true;
        C1756 c1756 = this.f5087;
        C1748 c1748M3256 = c1756.f5162.m3256();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5084;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && !c1756.f5160) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInApproach && c1756.f5160)) {
            m3218();
            if (this.f5088 && c1748M3256 != null) {
                c1748M3256.m3228(false);
            }
        }
        if (c1748M3256 != null) {
            C1756 c17562 = c1748M3256.f5132;
            if (!this.f5088 && ((layoutNode$LayoutState = c17562.f5159) == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut)) {
                if (this.f5086 != Integer.MAX_VALUE) {
                    AbstractC7936.m13423("Place was called on a node which was placed already");
                }
                int i = c17562.f5168;
                this.f5086 = i;
                c17562.f5168 = i + 1;
            }
        } else {
            this.f5086 = 0;
        }
        mo3167();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3213() {
        C1756 c1756 = this.f5087;
        C1748.m3220(c1756.f5162, false, 7);
        C1748 c1748 = c1756.f5162;
        C1748 c1748M3256 = c1748.m3256();
        if (c1748M3256 == null || c1748.f5098 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC1744.f5057[c1748M3256.f5132.f5159.ordinal()];
        c1748.f5098 = i != 2 ? i != 3 ? c1748M3256.f5098 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3214(long r10, p052.InterfaceC6558 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r0 = r9.f5087
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f5162
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.f5162
            r3 = 0
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r4 = r1.m3256()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            androidx.compose.ui.node.飘花落叶言子世苏哲兰楪 r4 = r4.f5132     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = r4.f5159     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            androidx.compose.ui.node.LayoutNode$LayoutState r5 = androidx.compose.ui.node.LayoutNode$LayoutState.LookaheadLayingOut     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.f5160 = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r9 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.f5126     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            p210.AbstractC7936.m13425(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.f5159 = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.f5077 = r4     // Catch: java.lang.Throwable -> L1b
            r9.f5068 = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f5074     // Catch: java.lang.Throwable -> L1b
            boolean r5 = p205.C7908.m13364(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.f5163     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.f5164     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f5157 = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.m3217()     // Catch: java.lang.Throwable -> L1b
        L42:
            androidx.compose.ui.node.飘花落叶言子苏哲世兰楪 r5 = androidx.compose.ui.node.AbstractC1757.m3306(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f5074 = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f5157     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r7 = r9.f5084     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r8 = androidx.compose.ui.node.LookaheadPassDelegate$PlacedState.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r2 = r0.m3301()     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r2 = r2.mo3285()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f4995     // Catch: java.lang.Throwable -> L1b
            long r10 = p205.C7908.m13362(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.m3210(r10)     // Catch: java.lang.Throwable -> L1b
            r9.m3212()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.m3302(r6)     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子世苏楪哲兰 r10 = r9.f5083     // Catch: java.lang.Throwable -> L1b
            r10.f5195 = r6     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r5 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r5     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.飘花落叶言子苏哲兰世楪 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r11 = r9.f5067     // Catch: java.lang.Throwable -> L1b
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r10.f5276     // Catch: java.lang.Throwable -> L1b
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏 r10 = r10.f5274     // Catch: java.lang.Throwable -> L1b
            r10.m2246(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.f5073 = r12     // Catch: java.lang.Throwable -> L1b
            androidx.compose.ui.node.LayoutNode$LayoutState r9 = androidx.compose.ui.node.LayoutNode$LayoutState.Idle     // Catch: java.lang.Throwable -> L1b
            r0.f5159 = r9     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.m3277(r9)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1747.m3214(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m3215(long j) throws Throwable {
        C1756 c1756 = this.f5087;
        C1748 c1748 = c1756.f5162;
        C1748 c17482 = c1756.f5162;
        try {
            if (c1748.f5126) {
                AbstractC7936.m13425("measure is called on a deactivated node");
            }
            C1748 c1748M3256 = c17482.m3256();
            c17482.f5093 = c17482.f5093 || (c1748M3256 != null && c1748M3256.f5093);
            if (!c17482.f5132.f5158) {
                C7898 c7898 = this.f5075;
                if (c7898 == null ? false : C7898.m13335(c7898.f21865, j)) {
                    InterfaceC1801 interfaceC1801 = c17482.f5105;
                    if (interfaceC1801 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3547(c17482, true);
                    }
                    c17482.m3276();
                    return false;
                }
            }
            this.f5075 = new C7898(j);
            m3140(j);
            this.f5083.f5196 = false;
            mo3166(new InterfaceC6558() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC1769) obj);
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1769 interfaceC1769) {
                    interfaceC1769.mo3173().getClass();
                }
            });
            long j2 = this.f5076 ? this.f4998 : -9223372034707292160L;
            this.f5076 = true;
            AbstractC1745 abstractC1745Mo3285 = c1756.m3301().mo3285();
            if (abstractC1745Mo3285 == null) {
                AbstractC7936.m13423("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c1756.m3299(j);
            m3141((((long) abstractC1745Mo3285.f4999) << 32) | (((long) abstractC1745Mo3285.f4997) & 4294967295L));
            return (((int) (j2 >> 32)) == abstractC1745Mo3285.f4999 && ((int) (j2 & 4294967295L)) == abstractC1745Mo3285.f4997) ? false : true;
        } catch (Throwable th) {
            c1748.m3277(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1771 mo3172() {
        return this.f5087.f5162.f5094.f5286;
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1770 mo3173() {
        return this.f5083;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        m3213();
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3057(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo3174() {
        return this.f5086;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        m3213();
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3058(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1769
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC1769 mo3175() {
        C1756 c1756;
        C1748 c1748M3256 = this.f5087.f5162.m3256();
        if (c1748M3256 == null || (c1756 = c1748M3256.f5132) == null) {
            return null;
        }
        return c1756.f5165;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        m3213();
        AbstractC1745 abstractC1745Mo3285 = this.f5087.m3301().mo3285();
        abstractC1745Mo3285.getClass();
        return abstractC1745Mo3285.mo3059(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m3216() {
        C1756 c1756 = this.f5087;
        return AbstractC1785.m3345(c1756.f5162) || c1756.f5160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3217() {
        C1756 c1756 = this.f5087;
        if (c1756.f5166 > 0) {
            C1224 c1224M3239 = c1756.f5162.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1748 c1748 = (C1748) objArr[i2];
                C1756 c17562 = c1748.f5132;
                if ((c17562.f5164 || c17562.f5163) && !c17562.f5157) {
                    c1748.m3228(false);
                }
                C1747 c1747 = c17562.f5165;
                if (c1747 != null) {
                    c1747.m3217();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3218() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5084;
        C1756 c1756 = this.f5087;
        boolean z = c1756.f5160;
        C1748 c1748 = c1756.f5162;
        if (z) {
            this.f5084 = LookaheadPassDelegate$PlacedState.IsPlacedInApproach;
        } else {
            this.f5084 = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && c1756.f5158) {
            C1748.m3220(c1748, true, 6);
        }
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            C1747 c1747 = c17482.f5132.f5165;
            if (c1747 == null) {
                C5925.m11310("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c1747.f5086 != Integer.MAX_VALUE) {
                c1747.m3218();
                C1748.m3223(c17482);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3219(boolean z) {
        if (z && m3216()) {
            return;
        }
        if (z || m3216()) {
            this.f5084 = LookaheadPassDelegate$PlacedState.IsNotPlaced;
            C1224 c1224M3239 = this.f5087.f5162.m3239();
            Object[] objArr = c1224M3239.f3521;
            int i = c1224M3239.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1747 c1747 = ((C1748) objArr[i2]).f5132.f5165;
                c1747.getClass();
                c1747.m3219(true);
            }
        }
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3128(long j, float f, InterfaceC6558 interfaceC6558) throws Throwable {
        m3214(j, interfaceC6558);
    }
}
