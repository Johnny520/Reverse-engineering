package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1771;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1656 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f4856 = 0;

    static {
        LookaheadScopeKt$defaultPlacementApproachInProgress$1 lookaheadScopeKt$defaultPlacementApproachInProgress$1 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
            @Override // p052.InterfaceC6553
            public final Boolean invoke(AbstractC1708 abstractC1708, InterfaceC1695 interfaceC1695) {
                return Boolean.FALSE;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3050(final InterfaceC6550 interfaceC6550, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(441837433);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(interfaceC6550) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            Object objM2335 = c1324.m2335();
            Object obj = C1369.f3973;
            Object obj2 = objM2335;
            if (objM2335 == obj) {
                C1660 c1660 = new C1660();
                c1660.f4857 = null;
                c1324.m2376(c1660);
                obj2 = c1660;
            }
            Object obj3 = (C1660) obj2;
            Object objM23352 = c1324.m2335();
            if (objM23352 == obj) {
                objM23352 = new InterfaceC6542() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // p052.InterfaceC6542
                    public final C1748 invoke() {
                        return new C1748(2);
                    }
                };
                c1324.m2376(objM23352);
            }
            InterfaceC6542 interfaceC6542 = (InterfaceC6542) objM23352;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2481(c1324, new InterfaceC6557() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((C1748) obj4);
                    return C5175.f14739;
                }

                public final void invoke(C1748 c1748) {
                    c1748.f5118 = true;
                }
            });
            AbstractC1367.m2464(c1324, obj3, new InterfaceC6553() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((C1748) obj4, (C1660) obj5);
                    return C5175.f14739;
                }

                public final void invoke(final C1748 c1748, C1660 c16602) {
                    c16602.f4857 = new InterfaceC6542() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // p052.InterfaceC6542
                        public final InterfaceC1695 invoke() {
                            C1748 c1748M3246 = c1748.m3246();
                            c1748M3246.getClass();
                            C1771 c1771 = c1748M3246.f5093.f5285;
                            c1771.getClass();
                            return c1771;
                        }
                    };
                }
            });
            interfaceC6550.invoke(obj3, c1324, Integer.valueOf((i2 << 3) & 112));
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((InterfaceC1373) obj4, ((Number) obj5).intValue());
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    AbstractC1656.m3050(interfaceC6550, interfaceC13732, AbstractC1367.m2460(i | 1));
                }
            };
        }
    }
}
