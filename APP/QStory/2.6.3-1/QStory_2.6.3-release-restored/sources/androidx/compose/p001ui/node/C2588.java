package androidx.compose.p001ui.node;

import androidx.collection.C1099;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2519;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2522;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import p068.InterfaceC7387;
import p221.C8735;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2588 extends AbstractC2629 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static final C2444 f5484;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C2609 f5485;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public InterfaceC2608 f5486;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C2519 f5487;

    static {
        C2444 c2444M3456 = AbstractC2416.m3456();
        int i = C2434.f5044;
        c2444M3456.m3529(C2434.f5037);
        c2444M3456.m3527(1.0f);
        c2444M3456.m3528(1);
        f5484 = c2444M3456;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2588(C2583 c2583, InterfaceC2608 interfaceC2608) {
        super(c2583);
        this.f5486 = interfaceC2608;
        this.f5485 = c2583.f5465 != null ? new C2609(this) : null;
        this.f5487 = (((AbstractC2961) interfaceC2608).f6637.f6636 & 512) != 0 ? new C2519(this, (InterfaceC2522) interfaceC2608) : null;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        if (this.f5487 != null) {
            this.f5602.getClass();
            throw null;
        }
        InterfaceC2608 interfaceC2608 = this.f5486;
        AbstractC2629 abstractC2629 = this.f5602;
        abstractC2629.getClass();
        return interfaceC2608.mo1636(this, abstractC2629, i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC2559 mo3615(long j) {
        m3700(j);
        C2519 c2519 = this.f5487;
        if (c2519 == null) {
            InterfaceC2608 interfaceC2608 = this.f5486;
            AbstractC2629 abstractC2629 = this.f5602;
            abstractC2629.getClass();
            m3946(interfaceC2608.mo1662(this, abstractC2629, j));
            m3940();
            return this;
        }
        C2609 c2609 = c2519.f5288.f5485;
        c2609.getClass();
        InterfaceC2492 interfaceC2492Mo3761 = c2609.mo3761();
        interfaceC2492Mo3761.mo2033();
        interfaceC2492Mo3761.mo2034();
        throw null;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final AbstractC2961 mo3842() {
        return ((AbstractC2961) this.f5486).f6637;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void mo3843(InterfaceC2436 interfaceC2436, C2351 c2351) {
        AbstractC2629 abstractC2629;
        AbstractC2629 abstractC26292 = this.f5602;
        abstractC26292.getClass();
        abstractC26292.m3966(interfaceC2436, c2351);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5604)).getShowLayoutBounds() || (abstractC2629 = this.f5602) == null) {
            return;
        }
        if (C8735.m13916(this.f5343, abstractC2629.f5343) && C8737.m13923(abstractC2629.f5590, 0L)) {
            return;
        }
        long j = this.f5343;
        interfaceC2436.mo3252(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5484);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo3844() {
        if (this.f5485 == null) {
            this.f5485 = new C2609(this);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final AbstractC2580 mo3845() {
        return this.f5485;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        if (this.f5487 != null) {
            this.f5602.getClass();
            throw null;
        }
        InterfaceC2608 interfaceC2608 = this.f5486;
        AbstractC2629 abstractC2629 = this.f5602;
        abstractC2629.getClass();
        return interfaceC2608.mo1634(this, abstractC2629, i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        if (this.f5487 != null) {
            this.f5602.getClass();
            throw null;
        }
        InterfaceC2608 interfaceC2608 = this.f5486;
        AbstractC2629 abstractC2629 = this.f5602;
        abstractC2629.getClass();
        return interfaceC2608.mo1635(this, abstractC2629, i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        if (this.f5487 != null) {
            this.f5602.getClass();
            throw null;
        }
        InterfaceC2608 interfaceC2608 = this.f5486;
        AbstractC2629 abstractC2629 = this.f5602;
        abstractC2629.getClass();
        return interfaceC2608.mo1637(this, abstractC2629, i);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final int mo3846(AbstractC2524 abstractC2524) {
        C2609 c2609 = this.f5485;
        if (c2609 == null) {
            return AbstractC2620.m3901(this, abstractC2524);
        }
        C1099 c1099 = c2609.f5403;
        int iM1364 = c1099.m1364(abstractC2524);
        if (iM1364 >= 0) {
            return c1099.f1261[iM1364];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3688(long j, float f, InterfaceC7387 interfaceC7387) {
        if (this.f5603) {
            AbstractC2580 abstractC2580Mo3845 = mo3845();
            abstractC2580Mo3845.getClass();
            m3955(abstractC2580Mo3845.f5407, f, interfaceC7387);
        } else {
            m3955(j, f, interfaceC7387);
        }
        if (this.f5493) {
            return;
        }
        m3941();
        AbstractC2629 abstractC2629 = this.f5602;
        abstractC2629.getClass();
        if (this.f5487 != null) {
            this.f5485.getClass();
            long j2 = this.f5343;
            C2609 c2609 = this.f5485;
            if (C8735.m13917(c2609 != null ? new C8735(c2609.m3768()) : null, j2)) {
                long j3 = abstractC2629.f5343;
                AbstractC2580 abstractC2580Mo38452 = abstractC2629.mo3845();
                boolean z = C8735.m13917(abstractC2580Mo38452 != null ? new C8735(abstractC2580Mo38452.m3768()) : null, j3);
                abstractC2629.f5603 = z;
            }
        }
        abstractC2629.f5492 = this.f5492;
        mo3761().mo2031();
        abstractC2629.f5492 = false;
        abstractC2629.f5603 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m3847(InterfaceC2608 interfaceC2608) {
        if (!interfaceC2608.equals(this.f5486)) {
            if ((((AbstractC2961) interfaceC2608).f6637.f6636 & 512) != 0) {
                InterfaceC2522 interfaceC2522 = (InterfaceC2522) interfaceC2608;
                C2519 c2519 = this.f5487;
                if (c2519 == null) {
                    c2519 = new C2519(this, interfaceC2522);
                }
                this.f5487 = c2519;
            } else {
                this.f5487 = null;
            }
        }
        this.f5486 = interfaceC2608;
    }
}
