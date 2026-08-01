package androidx.compose.p001ui.node;

import androidx.collection.C1089;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8727;
import p221.C8735;
import p221.C8737;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2573 extends AbstractC2559 implements InterfaceC2490, InterfaceC2604, InterfaceC2572 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC7387 f5357;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f5361;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f5362;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f5363;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f5366;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f5369;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC7387 f5370;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5373;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5374;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f5375;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5376;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5377;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5378;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Object f5379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2591 f5383;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5384;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f5386;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f5387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f5381 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f5382 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutNode$UsageByParent f5372 = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f5371 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f5380 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C2594 f5365 = new C2594(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C2059 f5368 = new C2059(0, new C2573[16]);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f5367 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public long f5364 = AbstractC8726.m13883(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f5360 = new InterfaceC7372() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3717invoke() {
            this.this$0.f5383.m3861().mo3615(this.this$0.f5364);
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3717invoke();
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC7372 f5359 = new InterfaceC7372() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3716invoke() {
            C2591 c2591 = this.this$0.f5383;
            c2591.f5517 = 0;
            C2059 c2059M3799 = c2591.f5507.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2573 c2573 = ((C2583) objArr[i2]).f5477.f5512;
                c2573.f5381 = c2573.f5382;
                c2573.f5382 = Integer.MAX_VALUE;
                c2573.f5377 = false;
                if (c2573.f5372 == LayoutNode$UsageByParent.InLayoutBlock) {
                    c2573.f5372 = LayoutNode$UsageByParent.NotUsed;
                }
            }
            this.this$0.mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2604) obj);
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2604 interfaceC2604) {
                    interfaceC2604.mo3733().getClass();
                }
            });
            if (this.this$0.mo3732().f5492) {
                C1089 c1089 = (C1089) this.this$0.f5383.f5507.m3817();
                int i3 = ((C2059) c1089.f1239).f3865;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((C2583) c1089.get(i4)).f5439.f5630.f5492 = true;
                }
            }
            this.this$0.mo3732().mo3761().mo2031();
            if (this.this$0.mo3732().f5492) {
                C1089 c10892 = (C1089) this.this$0.f5383.f5507.m3817();
                int i5 = ((C2059) c10892.f1239).f3865;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C2583) c10892.get(i6)).f5439.f5630.f5492 = false;
                }
            }
            C2583 c2583 = this.this$0.f5383.f5507;
            C2059 c2059M37992 = c2583.m3799();
            Object[] objArr2 = c2059M37992.f3866;
            int i7 = c2059M37992.f3865;
            for (int i8 = 0; i8 < i7; i8++) {
                C2583 c25832 = (C2583) objArr2[i8];
                C2591 c25912 = c25832.f5477;
                if (c25912.f5512.f5381 != c25832.m3813()) {
                    c2583.m3790();
                    c2583.m3796();
                    if (c25832.m3813() == Integer.MAX_VALUE) {
                        if (c25912.f5505 || AbstractC2620.m3905(c25832)) {
                            C2582 c2582 = c25912.f5510;
                            c2582.getClass();
                            c2582.m3779(false);
                        }
                        c25912.f5512.m3738();
                    }
                }
            }
            this.this$0.mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
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
            m3716invoke();
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public long f5358 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final InterfaceC7372 f5385 = new InterfaceC7372() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3718invoke() {
            AbstractC2543 placementScope;
            AbstractC2629 abstractC2629 = this.this$0.f5383.m3861().f5601;
            if (abstractC2629 == null || (placementScope = abstractC2629.f5491) == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.this$0.f5383.f5507)).getPlacementScope();
            }
            C2573 c2573 = this.this$0;
            InterfaceC7387 interfaceC7387 = c2573.f5357;
            C2591 c2591 = c2573.f5383;
            if (interfaceC7387 == null) {
                AbstractC2629 abstractC2629M3861 = c2591.m3861();
                long j = c2573.f5358;
                float f = c2573.f5386;
                placementScope.getClass();
                AbstractC2543.m3689(placementScope, abstractC2629M3861);
                abstractC2629M3861.mo3688(C8737.m13921(j, abstractC2629M3861.f5340), f, null);
                return;
            }
            AbstractC2629 abstractC2629M38612 = c2591.m3861();
            long j2 = c2573.f5358;
            float f2 = c2573.f5386;
            placementScope.getClass();
            AbstractC2543.m3689(placementScope, abstractC2629M38612);
            abstractC2629M38612.mo3688(C8737.m13921(j2, abstractC2629M38612.f5340), f2, interfaceC7387);
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3718invoke();
            return C6008.f15084;
        }
    };

    public C2573(C2591 c2591) {
        this.f5383 = c2591;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    public final void requestLayout() {
        C2583 c2583 = this.f5383.f5507;
        C2586 c2586 = C2583.f5434;
        c2583.m3785(false);
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final int mo3698() {
        return this.f5383.m3861().mo3698();
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final int mo3699() {
        return this.f5383.m3861().mo3699();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo3725() {
        C2583.m3784(this.f5383.f5507, false, 7);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        C2591 c2591 = this.f5383;
        if (!AbstractC2620.m3905(c2591.f5507)) {
            m3737();
            return c2591.m3861().mo3614(i);
        }
        C2582 c2582 = c2591.f5510;
        c2582.getClass();
        return c2582.mo3614(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3726(InterfaceC7387 interfaceC7387) {
        C2059 c2059M3799 = this.f5383.f5507.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7387.invoke(((C2583) objArr[i2]).f5477.f5512);
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC2559 mo3615(long j) throws Throwable {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = c2583.f5443;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = LayoutNode$UsageByParent.NotUsed;
        if (layoutNode$UsageByParent2 == layoutNode$UsageByParent3) {
            c2583.m3808();
        }
        if (AbstractC2620.m3905(c25832)) {
            C2582 c2582 = c2591.f5510;
            c2582.getClass();
            c2582.f5423 = layoutNode$UsageByParent3;
            c2582.mo3615(j);
        }
        C2583 c2583M3816 = c25832.m3816();
        if (c2583M3816 != null) {
            C2591 c25912 = c2583M3816.f5477;
            if (this.f5372 != layoutNode$UsageByParent3 && !c25832.f5438) {
                AbstractC8765.m13982("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = AbstractC2574.f5389[c25912.f5504.ordinal()];
            if (i == 1) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    C5043.m9164(c25912.f5504, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f5372 = layoutNode$UsageByParent;
        } else {
            this.f5372 = layoutNode$UsageByParent3;
        }
        m3730(j);
        return this;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo3727() {
        boolean zM3730;
        this.f5363 = true;
        C2594 c2594 = this.f5365;
        c2594.m3885();
        boolean z = this.f5375;
        C2591 c2591 = this.f5383;
        if (z) {
            C2059 c2059M3799 = c2591.f5507.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2583 c2583 = (C2583) objArr[i2];
                boolean zM3819 = c2583.m3819();
                C2591 c25912 = c2583.f5477;
                if (zM3819 && c2583.m3820() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C2573 c2573 = c25912.f5512;
                    C8727 c8727 = c2573.f5374 ? new C8727(c2573.f5341) : null;
                    if (c8727 != null) {
                        if (c2583.f5443 == LayoutNode$UsageByParent.NotUsed) {
                            c2583.m3808();
                        }
                        zM3730 = c25912.f5512.m3730(c8727.f22210);
                    } else {
                        zM3730 = false;
                    }
                    if (zM3730) {
                        C2583.m3784(c2591.f5507, false, 7);
                    }
                }
            }
        }
        if (this.f5366 || (!mo3732().f5492 && this.f5375)) {
            this.f5375 = false;
            LayoutNode$LayoutState layoutNode$LayoutState = c2591.f5504;
            c2591.f5504 = LayoutNode$LayoutState.LayingOut;
            c2591.m3863(false);
            C2583 c25832 = c2591.f5507;
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c25832)).getSnapshotObserver();
            snapshotObserver.f5619.m2806(c25832, snapshotObserver.f5615, this.f5359);
            c2591.f5504 = layoutNode$LayoutState;
            this.f5366 = false;
        }
        if (c2594.f5543 && c2594.m3881()) {
            c2594.m3883();
        }
        this.f5363 = false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2572
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3724(boolean z) {
        C2591 c2591 = this.f5383;
        if (z != c2591.m3861().f5495) {
            c2591.m3861().f5495 = z;
            this.f5387 = true;
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559, androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3616() {
        return this.f5379;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final void m3728(long j, float f, InterfaceC7387 interfaceC7387) {
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        if (c2583.f5471) {
            AbstractC8765.m13984("place is called on a deactivated node");
        }
        c2591.f5504 = LayoutNode$LayoutState.LayingOut;
        this.f5371 = j;
        this.f5369 = f;
        this.f5370 = interfaceC7387;
        this.f5361 = false;
        InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(c25832);
        if (this.f5375 || !this.f5378) {
            this.f5365.f5540 = false;
            c2591.m3856(false);
            this.f5357 = interfaceC7387;
            this.f5358 = j;
            this.f5386 = f;
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866).getSnapshotObserver();
            snapshotObserver.f5619.m2806(c25832, snapshotObserver.f5614, this.f5385);
        } else {
            AbstractC2629 abstractC2629M3861 = c2591.m3861();
            abstractC2629M3861.m3955(C8737.m13921(j, abstractC2629M3861.f5340), f, interfaceC7387);
            m3729();
        }
        c2591.f5504 = LayoutNode$LayoutState.Idle;
        if (c2591.m3861().f5492 && (c2591.f5515 || c2591.f5518)) {
            requestLayout();
        }
        this.f5373 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void m3729() {
        this.f5361 = true;
        C2591 c2591 = this.f5383;
        C2583 c2583M3816 = c2591.f5507.m3816();
        float f = mo3732().f5589;
        C2583 c2583 = c2591.f5507;
        C2646 c2646 = c2583.f5439;
        AbstractC2629 abstractC2629 = c2646.f5630;
        C2606 c2606 = c2646.f5631;
        while (abstractC2629 != c2606) {
            abstractC2629.getClass();
            C2588 c2588 = (C2588) abstractC2629;
            f += c2588.f5589;
            abstractC2629 = c2588.f5602;
        }
        if (f != this.f5362) {
            this.f5362 = f;
            if (c2583M3816 != null) {
                c2583M3816.m3790();
            }
            if (c2583M3816 != null) {
                c2583M3816.m3796();
            }
        }
        if (!mo3732().f5492) {
            boolean z = this.f5378;
            if (!z || this.f5365.m3882()) {
                m3739();
            }
            if (z) {
                c2583.f5439.f5631.m3941();
            } else {
                if (c2583M3816 != null) {
                    c2583M3816.m3796();
                }
                if (this.f5384 && c2583M3816 != null) {
                    c2583M3816.m3785(false);
                }
            }
        }
        if (c2583M3816 != null) {
            C2591 c25912 = c2583M3816.f5477;
            if (!this.f5384 && c25912.f5504 == LayoutNode$LayoutState.LayingOut) {
                if (this.f5382 != Integer.MAX_VALUE) {
                    AbstractC8765.m13982("Place was called on a node which was placed already");
                }
                int i = c25912.f5517;
                this.f5382 = i;
                c25912.f5517 = i + 1;
            }
        } else {
            this.f5382 = 0;
        }
        mo3727();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m3730(long j) throws Throwable {
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        try {
            if (c2583.f5471) {
                AbstractC8765.m13984("measure is called on a deactivated node");
            }
            InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(c25832);
            C2583 c2583M3816 = c25832.m3816();
            boolean z = true;
            c25832.f5438 = c25832.f5438 || (c2583M3816 != null && c2583M3816.f5438);
            if (!c25832.m3819() && C8727.m13894(this.f5341, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866).m4107(c25832, false);
                c25832.m3836();
                return false;
            }
            this.f5365.f5541 = false;
            mo3726(new InterfaceC7387() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC2604) obj);
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2604 interfaceC2604) {
                    interfaceC2604.mo3733().getClass();
                }
            });
            this.f5374 = true;
            long j2 = c2591.m3861().f5343;
            m3700(j);
            LayoutNode$LayoutState layoutNode$LayoutState = c2591.f5504;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Idle;
            if (layoutNode$LayoutState != layoutNode$LayoutState2) {
                AbstractC8765.m13982("layout state is not idle before measure starts");
            }
            this.f5364 = j;
            LayoutNode$LayoutState layoutNode$LayoutState3 = LayoutNode$LayoutState.Measuring;
            c2591.f5504 = layoutNode$LayoutState3;
            this.f5376 = false;
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c25832)).getSnapshotObserver();
            snapshotObserver.f5619.m2806(c25832, snapshotObserver.f5617, this.f5360);
            if (c2591.f5504 == layoutNode$LayoutState3) {
                this.f5375 = true;
                this.f5366 = true;
                c2591.f5504 = layoutNode$LayoutState2;
            }
            if (C8735.m13916(c2591.m3861().f5343, j2) && c2591.m3861().f5344 == this.f5344 && c2591.m3861().f5342 == this.f5342) {
                z = false;
            }
            m3701((((long) c2591.m3861().f5342) & 4294967295L) | (((long) c2591.m3861().f5344) << 32));
            return z;
        } catch (Throwable th) {
            c2583.m3837(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void m3731() {
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        if (!c2583.m3802() || c2591.f5516 <= 0) {
            return;
        }
        C2591 c25912 = c25832.f5477;
        if ((c25912.f5518 || c25912.f5515) && !c25912.f5512.f5375) {
            c25832.m3785(false);
        }
        C2059 c2059M3799 = c25832.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2583) objArr[i2]).f5477.f5512.m3731();
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2606 mo3732() {
        return this.f5383.f5507.f5439.f5631;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2605 mo3733() {
        return this.f5365;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        C2591 c2591 = this.f5383;
        if (!AbstractC2620.m3905(c2591.f5507)) {
            m3737();
            return c2591.m3861().mo3617(i);
        }
        C2582 c2582 = c2591.f5510;
        c2582.getClass();
        return c2582.mo3617(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo3734() {
        return this.f5382;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        C2591 c2591 = this.f5383;
        if (!AbstractC2620.m3905(c2591.f5507)) {
            m3737();
            return c2591.m3861().mo3618(i);
        }
        C2582 c2582 = c2591.f5510;
        c2582.getClass();
        return c2582.mo3618(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2604
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2604 mo3735() {
        C2591 c2591;
        C2583 c2583M3816 = this.f5383.f5507.m3816();
        if (c2583M3816 == null || (c2591 = c2583M3816.f5477) == null) {
            return null;
        }
        return c2591.f5512;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        C2591 c2591 = this.f5383;
        if (!AbstractC2620.m3905(c2591.f5507)) {
            m3737();
            return c2591.m3861().mo3619(i);
        }
        C2582 c2582 = c2591.f5510;
        c2582.getClass();
        return c2582.mo3619(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final List m3736() {
        C2591 c2591 = this.f5383;
        c2591.f5507.m3828();
        boolean z = this.f5367;
        C2059 c2059 = this.f5368;
        if (!z) {
            return c2059.m2603();
        }
        C2583 c2583 = c2591.f5507;
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (c2059.f3865 <= i2) {
                c2059.m2607(c25832.f5477.f5512);
            } else {
                C2573 c2573 = c25832.f5477.f5512;
                Object[] objArr2 = c2059.f3866;
                Object obj = objArr2[i2];
                objArr2[i2] = c2573;
            }
        }
        c2059.m2610(((C2059) ((C1089) c2583.m3817()).f1239).f3865, c2059.f3865);
        this.f5367 = false;
        return c2059.m2603();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m3737() {
        C2591 c2591 = this.f5383;
        C2583.m3784(c2591.f5507, false, 7);
        C2583 c2583 = c2591.f5507;
        C2583 c2583M3816 = c2583.m3816();
        if (c2583M3816 == null || c2583.f5443 != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = AbstractC2574.f5389[c2583M3816.f5477.f5504.ordinal()];
        c2583.f5443 = i != 1 ? i != 2 ? c2583M3816.f5443 : LayoutNode$UsageByParent.InLayoutBlock : LayoutNode$UsageByParent.InMeasureBlock;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3738() {
        if (this.f5378) {
            this.f5378 = false;
            C2591 c2591 = this.f5383;
            C2583 c2583 = c2591.f5507;
            C2583 c25832 = c2591.f5507;
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getRectManager().m4250(c25832);
            C2646 c2646 = c25832.f5439;
            AbstractC2629 abstractC2629 = c2646.f5631.f5602;
            for (AbstractC2629 abstractC26292 = c2646.f5630; !AbstractC5227.m9466(abstractC26292, abstractC2629) && abstractC26292 != null; abstractC26292 = abstractC26292.f5602) {
                abstractC26292.m3958();
                abstractC26292.m3956();
            }
            C2059 c2059M3799 = c25832.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i = c2059M3799.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                ((C2583) objArr[i2]).f5477.f5512.m3738();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m3739() {
        boolean z = this.f5378;
        this.f5378 = true;
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2646 c2646 = c2583.f5439;
        if (!z) {
            c2646.f5631.m3941();
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getRectManager().m4246(c2591.f5507);
            if (c2583.m3819()) {
                C2583.m3784(c2583, true, 6);
            } else if (c2583.f5477.f5503) {
                C2583.m3780(c2583, true, 6);
            }
        }
        AbstractC2629 abstractC2629 = c2646.f5631.f5602;
        for (AbstractC2629 abstractC26292 = c2646.f5630; !AbstractC5227.m9466(abstractC26292, abstractC2629) && abstractC26292 != null; abstractC26292 = abstractC26292.f5602) {
            if (abstractC26292.f5609) {
                abstractC26292.m3942();
            }
        }
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (c25832.m3813() != Integer.MAX_VALUE) {
                c25832.f5477.f5512.m3739();
                C2583.m3783(c25832);
            }
        }
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3688(long j, float f, InterfaceC7387 interfaceC7387) throws Throwable {
        AbstractC2543 placementScope;
        C2591 c2591 = this.f5383;
        C2583 c2583 = c2591.f5507;
        C2583 c25832 = c2591.f5507;
        try {
            this.f5377 = true;
            if (!C8737.m13923(j, this.f5371) || interfaceC7387 != this.f5370 || this.f5387) {
                if (c2591.f5515 || c2591.f5518 || this.f5387) {
                    this.f5375 = true;
                    this.f5387 = false;
                }
            }
            C2582 c2582 = c2591.f5510;
            if (c2582 != null) {
                C2591 c25912 = c2582.f5432;
                if (c2582.f5429 == LookaheadPassDelegate$PlacedState.IsNotPlaced && !AbstractC2620.m3905(c25912.f5507)) {
                    c25912.f5505 = true;
                }
            }
            C2582 c25822 = c2591.f5510;
            if (c25822 != null && c25822.m3776()) {
                AbstractC2629 abstractC2629 = c2591.m3861().f5601;
                if (abstractC2629 == null || (placementScope = abstractC2629.f5491) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c25832)).getPlacementScope();
                }
                C2582 c25823 = c2591.f5510;
                c25823.getClass();
                C2583 c2583M3816 = c25832.m3816();
                if (c2583M3816 != null) {
                    c2583M3816.f5477.f5513 = 0;
                }
                c25823.f5431 = Integer.MAX_VALUE;
                placementScope.m3695(c25823, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            C2582 c25824 = c2591.f5510;
            if (c25824 != null && !c25824.f5422) {
                AbstractC8765.m13982("Error: Placement happened before lookahead.");
            }
            m3728(j, f, interfaceC7387);
        } catch (Throwable th) {
            c2583.m3837(th);
            throw null;
        }
    }
}
