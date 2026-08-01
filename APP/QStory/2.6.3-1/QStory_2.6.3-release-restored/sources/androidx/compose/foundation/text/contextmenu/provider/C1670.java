package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.C1925;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1670 implements InterfaceC1674 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2077 f2707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1925 f2706 = new C1925();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f2705 = AbstractC2202.m3034(null);

    public C1670(C2077 c2077) {
        this.f2707 = c2077;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2207(final InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, final int i) {
        final InterfaceC7372 interfaceC73722;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(723898654);
        int i2 = (c2159.m2920(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            C1671 c1671 = (C1671) ((AbstractC2182) this.f2705).getValue();
            if (c1671 == null) {
                C2224 c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                    c2224M2935.f4379 = new InterfaceC7383(this, interfaceC7372, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C1670 f2710;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC7372 f2711;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2712;

                        {
                            this.f2712 = i3;
                            this.f2710 = this;
                        }

                        @Override // p068.InterfaceC7383
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2712;
                            C6008 c6008 = C6008.f15084;
                            InterfaceC7372 interfaceC73723 = this.f2711;
                            C1670 c1670 = this.f2710;
                            InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c1670.m2207(interfaceC73723, interfaceC22082, AbstractC2202.m3031(7));
                                    break;
                                default:
                                    c1670.m2207(interfaceC73723, interfaceC22082, AbstractC2202.m3031(7));
                                    break;
                            }
                            return c6008;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC73722 = interfaceC7372;
            this.f2707.invoke(c1671, c1671.f2709, interfaceC73722, c2159, 384);
        } else {
            interfaceC73722 = interfaceC7372;
            c2159.m2899();
        }
        C2224 c2224M29352 = c2159.m2935();
        if (c2224M29352 != null) {
            c2224M29352.f4379 = new InterfaceC7383(this, interfaceC73722, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C1670 f2710;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7372 f2711;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2712;

                {
                    this.f2712 = i4;
                    this.f2710 = this;
                }

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2712;
                    C6008 c6008 = C6008.f15084;
                    InterfaceC7372 interfaceC73723 = this.f2711;
                    C1670 c1670 = this.f2710;
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c1670.m2207(interfaceC73723, interfaceC22082, AbstractC2202.m3031(7));
                            break;
                        default:
                            c1670.m2207(interfaceC73723, interfaceC22082, AbstractC2202.m3031(7));
                            break;
                    }
                    return c6008;
                }
            };
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2196(InterfaceC1667 interfaceC1667, SuspendLambda suspendLambda) {
        Object objM2561 = C1925.m2561(this.f2706, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new C1671(interfaceC1667), null), suspendLambda);
        return objM2561 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2561 : C6008.f15084;
    }
}
