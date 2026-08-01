package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.C1087;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830 implements InterfaceC0834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1242 f2361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1087 f2360 = new C1087();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f2359 = AbstractC1367.m2465(null);

    public C0830(C1242 c1242) {
        this.f2361 = c1242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1637(final InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, final int i) {
        final InterfaceC6542 interfaceC65422;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(723898654);
        int i2 = (c1324.m2350(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            C0831 c0831 = (C0831) ((AbstractC1347) this.f2359).getValue();
            if (c0831 == null) {
                C1389 c1389M2365 = c1324.m2365();
                if (c1389M2365 != null) {
                    c1389M2365.f4033 = new InterfaceC6553(this, interfaceC6542, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C0830 f2364;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC6542 f2365;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ int f2366;

                        {
                            this.f2366 = i3;
                            this.f2364 = this;
                        }

                        @Override // p052.InterfaceC6553
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f2366;
                            C5175 c5175 = C5175.f14739;
                            InterfaceC6542 interfaceC65423 = this.f2365;
                            C0830 c0830 = this.f2364;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0830.m1637(interfaceC65423, interfaceC13732, AbstractC1367.m2460(7));
                                    break;
                                default:
                                    c0830.m1637(interfaceC65423, interfaceC13732, AbstractC1367.m2460(7));
                                    break;
                            }
                            return c5175;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC65422 = interfaceC6542;
            this.f2361.invoke(c0831, c0831.f2363, interfaceC65422, c1324, 384);
        } else {
            interfaceC65422 = interfaceC6542;
            c1324.m2329();
        }
        C1389 c1389M23652 = c1324.m2365();
        if (c1389M23652 != null) {
            c1389M23652.f4033 = new InterfaceC6553(this, interfaceC65422, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世苏哲兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C0830 f2364;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6542 f2365;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ int f2366;

                {
                    this.f2366 = i4;
                    this.f2364 = this;
                }

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f2366;
                    C5175 c5175 = C5175.f14739;
                    InterfaceC6542 interfaceC65423 = this.f2365;
                    C0830 c0830 = this.f2364;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0830.m1637(interfaceC65423, interfaceC13732, AbstractC1367.m2460(7));
                            break;
                        default:
                            c0830.m1637(interfaceC65423, interfaceC13732, AbstractC1367.m2460(7));
                            break;
                    }
                    return c5175;
                }
            };
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo1626(InterfaceC0827 interfaceC0827, SuspendLambda suspendLambda) {
        Object objM1991 = C1087.m1991(this.f2360, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new C0831(interfaceC0827), null), suspendLambda);
        return objM1991 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1991 : C5175.f14739;
    }
}
