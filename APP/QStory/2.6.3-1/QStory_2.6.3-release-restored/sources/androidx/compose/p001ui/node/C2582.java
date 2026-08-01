package androidx.compose.p001ui.node;

import androidx.collection.C1089;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8727;
import p221.C8737;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2582 extends AbstractC2559 implements InterfaceC2490, InterfaceC2604, InterfaceC2572 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f5413;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Object f5414;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f5418;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C8727 f5420;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f5421;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5422;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2591 f5432;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5430 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5431 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5423 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f5419 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public LookaheadPassDelegate$PlacedState f5429 = LookaheadPassDelegate$PlacedState.IsNotPlaced;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2594 f5428 = new C2594(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C2059 f5427 = new C2059(0, new C2582[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5426 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC7372 f5424 = new InterfaceC7372() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3713invoke() {
            C2591 c2591 = this.this$0.f5432;
            c2591.f5513 = 0;
            C2059 c2059M3799 = c2591.f5507.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2582 c2582 = ((C2583) objArr[i2]).f5477.f5510;
                c2582.getClass();
                c2582.f5430 = c2582.f5431;
                c2582.f5431 = Integer.MAX_VALUE;
                if (c2582.f5423 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c2582.f5423 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2604) obj);
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2604 interfaceC2604) {
                    interfaceC2604.mo3733().getClass();
                }
            });
            C2607 c2607 = this.this$0.mo3732().f5547;
            if (c2607 != null) {
                boolean z = c2607.f5492;
                C1089 c1089 = (C1089) this.this$0.f5432.f5507.m3817();
                int i3 = ((C2059) c1089.f1239).f3865;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC2580 abstractC2580Mo3845 = ((C2583) c1089.get(i4)).f5439.f5630.mo3845();
                    if (abstractC2580Mo3845 != null) {
                        abstractC2580Mo3845.f5492 = z;
                    }
                }
            }
            C2607 c26072 = this.this$0.mo3732().f5547;
            c26072.getClass();
            c26072.mo3761().mo2031();
            if (this.this$0.mo3732().f5547 != null) {
                C1089 c10892 = (C1089) this.this$0.f5432.f5507.m3817();
                int i5 = ((C2059) c10892.f1239).f3865;
                for (int i6 = 0; i6 < i5; i6++) {
                    AbstractC2580 abstractC2580Mo38452 = ((C2583) c10892.get(i6)).f5439.f5630.mo3845();
                    if (abstractC2580Mo38452 != null) {
                        abstractC2580Mo38452.f5492 = false;
                    }
                }
            }
            C2059 c2059M37992 = this.this$0.f5432.f5507.m3799();
            Object[] objArr2 = c2059M37992.f3866;
            int i7 = c2059M37992.f3865;
            for (int i8 = 0; i8 < i7; i8++) {
                C2582 c25822 = ((C2583) objArr2[i8]).f5477.f5510;
                c25822.getClass();
                int i9 = c25822.f5430;
                int i10 = c25822.f5431;
                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                    c25822.m3779(true);
                }
            }
            this.this$0.mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
                public final void invoke(InterfaceC2604 interfaceC2604) {
                    AbstractC2605 abstractC2605Mo3733 = interfaceC2604.mo3733();
                    interfaceC2604.mo3733().getClass();
                    abstractC2605Mo3733.f5542 = false;
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2604) obj);
                    return C6008.f15084;
                }
            });
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3713invoke();
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5415 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f5417 = AbstractC8726.m13883(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC7372 f5416 = new InterfaceC7372() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3715invoke() {
            AbstractC2580 abstractC2580Mo3845 = this.this$0.f5432.m3861().mo3845();
            abstractC2580Mo3845.getClass();
            abstractC2580Mo3845.mo3615(this.this$0.f5417);
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3715invoke();
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC7372 f5412 = new InterfaceC7372() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m3714invoke() {
            AbstractC2580 abstractC2580Mo3845;
            AbstractC2543 placementScope = null;
            if (!AbstractC2620.m3905(this.this$0.f5432.f5507)) {
                C2591 c2591 = this.this$0.f5432;
                if (c2591.f5505) {
                    AbstractC2629 abstractC2629 = this.this$0.f5432.m3861().f5601;
                    if (abstractC2629 != null) {
                        placementScope = abstractC2629.f5491;
                    }
                } else {
                    AbstractC2629 abstractC26292 = c2591.m3861().f5601;
                    if (abstractC26292 != null && (abstractC2580Mo3845 = abstractC26292.mo3845()) != null) {
                        placementScope = abstractC2580Mo3845.f5491;
                    }
                }
            }
            if (placementScope == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.this$0.f5432.f5507)).getPlacementScope();
            }
            C2582 c2582 = this.this$0;
            AbstractC2580 abstractC2580Mo38452 = c2582.f5432.m3861().mo3845();
            abstractC2580Mo38452.getClass();
            AbstractC2543.m3694(placementScope, abstractC2580Mo38452, c2582.f5419);
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3714invoke();
            return C6008.f15084;
        }
    };

    public C2582(C2591 c2591) {
        this.f5432 = c2591;
        this.f5414 = c2591.f5512.f5379;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    public final void requestLayout() {
        C2583 c2583 = this.f5432.f5507;
        C2586 c2586 = C2583.f5434;
        c2583.m3788(false);
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3698() {
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3698();
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3699() {
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3699();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3725() {
        C2583.m3780(this.f5432.f5507, false, 7);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        m3773();
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3614(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo3726(InterfaceC7387 interfaceC7387) {
        C2059 c2059M3799 = this.f5432.f5507.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2582 c2582 = ((C2583) objArr[i2]).f5477.f5510;
            c2582.getClass();
            interfaceC7387.invoke(c2582);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2559 mo3615(long j) {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        C2591 c2591 = this.f5432;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        C2583 c2583M3816 = c2583.m3816();
        if ((c2583M3816 != null ? c2583M3816.f5477.f5504 : null) == LayoutNode$LayoutState.LookaheadMeasuring) {
            c2591.f5506 = false;
        } else {
            C2583 c2583M38162 = c25832.m3816();
            if ((c2583M38162 != null ? c2583M38162.f5477.f5504 : null) == LayoutNode$LayoutState.LookaheadLayingOut) {
            }
        }
        C2583 c2583M38163 = c25832.m3816();
        if (c2583M38163 != null) {
            C2591 c25912 = c2583M38163.f5477;
            if (this.f5423 != LayoutNode$UsageByParent.NotUsed && !c25832.f5438) {
                AbstractC8765.m13982("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = AbstractC2579.f5402[c25912.f5504.ordinal()];
            if (i == 1 || i == 2) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    C5043.m9164(c25912.f5504, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f5423 = layoutNode$UsageByParent;
        } else {
            this.f5423 = LayoutNode$UsageByParent.NotUsed;
        }
        if (c25832.f5443 == LayoutNode$UsageByParent.NotUsed) {
            c25832.m3808();
        }
        m3775(j);
        return this;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final void mo3727() {
        this.f5425 = true;
        C2594 c2594 = this.f5428;
        c2594.m3885();
        C2591 c2591 = this.f5432;
        boolean z = c2591.f5502;
        C2583 c2583 = c2591.f5507;
        if (z) {
            C2059 c2059M3799 = c2583.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2583 c25832 = (C2583) objArr[i2];
                C2591 c25912 = c25832.f5477;
                if (c25912.f5503 && c25832.m3812() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C2582 c2582 = c25912.f5510;
                    c2582.getClass();
                    C2582 c25822 = c25912.f5510;
                    C8727 c8727 = c25822 != null ? c25822.f5420 : null;
                    c8727.getClass();
                    if (c2582.m3775(c8727.f22210)) {
                        C2583.m3780(c2583, false, 7);
                    }
                }
            }
        }
        C2607 c2607 = mo3732().f5547;
        c2607.getClass();
        if (c2591.f5514 || (!c2607.f5492 && c2591.f5502)) {
            c2591.f5502 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c2591.f5504;
            c2591.f5504 = LayoutNode$LayoutState.LookaheadLayingOut;
            c2591.m3864(false);
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getSnapshotObserver();
            snapshotObserver.f5619.m2806(c2583, snapshotObserver.f5620, this.f5424);
            c2591.f5504 = layoutNode$LayoutState;
            if (c2591.f5509 && c2607.f5492) {
                requestLayout();
            }
            c2591.f5514 = false;
        }
        if (c2594.f5543 && c2594.m3881()) {
            c2594.m3883();
        }
        this.f5425 = false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2572
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3724(boolean z) {
        AbstractC2580 abstractC2580Mo3845;
        C2591 c2591 = this.f5432;
        AbstractC2580 abstractC2580Mo38452 = c2591.m3861().mo3845();
        if (Boolean.valueOf(z).equals(abstractC2580Mo38452 != null ? Boolean.valueOf(abstractC2580Mo38452.f5495) : null) || (abstractC2580Mo3845 = c2591.m3861().mo3845()) == null) {
            return;
        }
        abstractC2580Mo3845.f5495 = z;
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559, androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3616() {
        return this.f5414;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3772() {
        LayoutNode$LayoutState layoutNode$LayoutState;
        this.f5413 = true;
        C2591 c2591 = this.f5432;
        C2583 c2583M3816 = c2591.f5507.m3816();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5429;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && !c2591.f5505) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInApproach && c2591.f5505)) {
            m3778();
            if (this.f5433 && c2583M3816 != null) {
                c2583M3816.m3788(false);
            }
        }
        if (c2583M3816 != null) {
            C2591 c25912 = c2583M3816.f5477;
            if (!this.f5433 && ((layoutNode$LayoutState = c25912.f5504) == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut)) {
                if (this.f5431 != Integer.MAX_VALUE) {
                    AbstractC8765.m13982("Place was called on a node which was placed already");
                }
                int i = c25912.f5513;
                this.f5431 = i;
                c25912.f5513 = i + 1;
            }
        } else {
            this.f5431 = 0;
        }
        mo3727();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3773() {
        C2591 c2591 = this.f5432;
        C2583.m3780(c2591.f5507, false, 7);
        C2583 c2583 = c2591.f5507;
        C2583 c2583M3816 = c2583.m3816();
        if (c2583M3816 == null || c2583.f5443 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC2579.f5402[c2583M3816.f5477.f5504.ordinal()];
        c2583.f5443 = i != 2 ? i != 3 ? c2583M3816.f5443 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3774(long j, InterfaceC7387 interfaceC7387) throws Throwable {
        C2591 c2591 = this.f5432;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        try {
            C2583 c2583M3816 = c2583.m3816();
            LayoutNode$LayoutState layoutNode$LayoutState = c2583M3816 != null ? c2583M3816.f5477.f5504 : null;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadLayingOut;
            if (layoutNode$LayoutState == layoutNode$LayoutState2) {
                c2591.f5505 = false;
            }
            if (c25832.f5471) {
                AbstractC8765.m13984("place is called on a deactivated node");
            }
            c2591.f5504 = layoutNode$LayoutState2;
            boolean z = true;
            this.f5422 = true;
            this.f5413 = false;
            if (!C8737.m13923(j, this.f5419)) {
                if (c2591.f5508 || c2591.f5509) {
                    c2591.f5502 = true;
                }
                m3777();
            }
            InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(c25832);
            this.f5419 = j;
            if (c2591.f5502) {
                c2591.m3862(false);
                this.f5428.f5540 = false;
                C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866).getSnapshotObserver();
                snapshotObserver.f5619.m2806(c25832, snapshotObserver.f5621, this.f5412);
            } else {
                if (this.f5429 == LookaheadPassDelegate$PlacedState.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    AbstractC2580 abstractC2580Mo3845 = c2591.m3861().mo3845();
                    abstractC2580Mo3845.getClass();
                    abstractC2580Mo3845.m3770(C8737.m13921(j, abstractC2580Mo3845.f5340));
                    m3772();
                }
            }
            this.f5418 = interfaceC7387;
            c2591.f5504 = LayoutNode$LayoutState.Idle;
        } catch (Throwable th) {
            c2583.m3837(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m3775(long j) throws Throwable {
        C2591 c2591 = this.f5432;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        try {
            if (c2583.f5471) {
                AbstractC8765.m13984("measure is called on a deactivated node");
            }
            C2583 c2583M3816 = c25832.m3816();
            c25832.f5438 = c25832.f5438 || (c2583M3816 != null && c2583M3816.f5438);
            if (!c25832.f5477.f5503) {
                C8727 c8727 = this.f5420;
                if (c8727 == null ? false : C8727.m13894(c8727.f22210, j)) {
                    InterfaceC2636 interfaceC2636 = c25832.f5450;
                    if (interfaceC2636 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4107(c25832, true);
                    }
                    c25832.m3836();
                    return false;
                }
            }
            this.f5420 = new C8727(j);
            m3700(j);
            this.f5428.f5541 = false;
            mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2604) obj);
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2604 interfaceC2604) {
                    interfaceC2604.mo3733().getClass();
                }
            });
            long j2 = this.f5421 ? this.f5343 : -9223372034707292160L;
            this.f5421 = true;
            AbstractC2580 abstractC2580Mo3845 = c2591.m3861().mo3845();
            if (abstractC2580Mo3845 == null) {
                AbstractC8765.m13982("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c2591.m3859(j);
            m3701((((long) abstractC2580Mo3845.f5344) << 32) | (((long) abstractC2580Mo3845.f5342) & 4294967295L));
            return (((int) (j2 >> 32)) == abstractC2580Mo3845.f5344 && ((int) (j2 & 4294967295L)) == abstractC2580Mo3845.f5342) ? false : true;
        } catch (Throwable th) {
            c2583.m3837(th);
            throw null;
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C2606 mo3732() {
        return this.f5432.f5507.f5439.f5631;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC2605 mo3733() {
        return this.f5428;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        m3773();
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3617(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo3734() {
        return this.f5431;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        m3773();
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3618(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC2604 mo3735() {
        C2591 c2591;
        C2583 c2583M3816 = this.f5432.f5507.m3816();
        if (c2583M3816 == null || (c2591 = c2583M3816.f5477) == null) {
            return null;
        }
        return c2591.f5510;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        m3773();
        AbstractC2580 abstractC2580Mo3845 = this.f5432.m3861().mo3845();
        abstractC2580Mo3845.getClass();
        return abstractC2580Mo3845.mo3619(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m3776() {
        C2591 c2591 = this.f5432;
        return AbstractC2620.m3905(c2591.f5507) || c2591.f5505;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3777() {
        C2591 c2591 = this.f5432;
        if (c2591.f5511 > 0) {
            C2059 c2059M3799 = c2591.f5507.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2583 c2583 = (C2583) objArr[i2];
                C2591 c25912 = c2583.f5477;
                if ((c25912.f5509 || c25912.f5508) && !c25912.f5502) {
                    c2583.m3788(false);
                }
                C2582 c2582 = c25912.f5510;
                if (c2582 != null) {
                    c2582.m3777();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3778() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f5429;
        C2591 c2591 = this.f5432;
        boolean z = c2591.f5505;
        C2583 c2583 = c2591.f5507;
        if (z) {
            this.f5429 = LookaheadPassDelegate$PlacedState.IsPlacedInApproach;
        } else {
            this.f5429 = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && c2591.f5503) {
            C2583.m3780(c2583, true, 6);
        }
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            C2582 c2582 = c25832.f5477.f5510;
            if (c2582 == null) {
                C6755.m11869("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c2582.f5431 != Integer.MAX_VALUE) {
                c2582.m3778();
                C2583.m3783(c25832);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3779(boolean z) {
        if (z && m3776()) {
            return;
        }
        if (z || m3776()) {
            this.f5429 = LookaheadPassDelegate$PlacedState.IsNotPlaced;
            C2059 c2059M3799 = this.f5432.f5507.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2582 c2582 = ((C2583) objArr[i2]).f5477.f5510;
                c2582.getClass();
                c2582.m3779(true);
            }
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3688(long j, float f, InterfaceC7387 interfaceC7387) throws Throwable {
        m3774(j, interfaceC7387);
    }
}
