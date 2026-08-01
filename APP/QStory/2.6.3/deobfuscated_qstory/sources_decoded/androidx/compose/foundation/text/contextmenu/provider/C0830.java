package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.C1087;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830 implements InterfaceC0834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1242 f2362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1087 f2361 = new C1087();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f2360 = AbstractC1367.m2474(null);

    public C0830(C1242 c1242) {
        this.f2362 = c1242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1647(final InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, final int i) {
        final InterfaceC6543 interfaceC65432;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(723898654);
        int i2 = (c1324.m2360(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            C0831 c0831 = (C0831) ((AbstractC1347) this.f2360).getValue();
            if (c0831 == null) {
                C1389 c1389M2375 = c1324.m2375();
                if (c1389M2375 != null) {
                    c1389M2375.f4034 = new InterfaceC6554(this, interfaceC6543, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C0830 f2365;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC6543 f2366;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2367;

                        {
                            this.f2367 = i3;
                            this.f2365 = this;
                        }

                        @Override // p052.InterfaceC6554
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2367;
                            C5176 c5176 = C5176.f14739;
                            InterfaceC6543 interfaceC65433 = this.f2366;
                            C0830 c0830 = this.f2365;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0830.m1647(interfaceC65433, interfaceC13732, AbstractC1367.m2471(7));
                                    break;
                                default:
                                    c0830.m1647(interfaceC65433, interfaceC13732, AbstractC1367.m2471(7));
                                    break;
                            }
                            return c5176;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC65432 = interfaceC6543;
            this.f2362.invoke(c0831, c0831.f2364, interfaceC65432, c1324, 384);
        } else {
            interfaceC65432 = interfaceC6543;
            c1324.m2339();
        }
        C1389 c1389M23752 = c1324.m2375();
        if (c1389M23752 != null) {
            c1389M23752.f4034 = new InterfaceC6554(this, interfaceC65432, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C0830 f2365;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6543 f2366;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2367;

                {
                    this.f2367 = i4;
                    this.f2365 = this;
                }

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2367;
                    C5176 c5176 = C5176.f14739;
                    InterfaceC6543 interfaceC65433 = this.f2366;
                    C0830 c0830 = this.f2365;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0830.m1647(interfaceC65433, interfaceC13732, AbstractC1367.m2471(7));
                            break;
                        default:
                            c0830.m1647(interfaceC65433, interfaceC13732, AbstractC1367.m2471(7));
                            break;
                    }
                    return c5176;
                }
            };
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo1636(InterfaceC0827 interfaceC0827, SuspendLambda suspendLambda) {
        Object objM2001 = C1087.m2001(this.f2361, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new C0831(interfaceC0827), null), suspendLambda);
        return objM2001 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2001 : C5176.f14739;
    }
}
