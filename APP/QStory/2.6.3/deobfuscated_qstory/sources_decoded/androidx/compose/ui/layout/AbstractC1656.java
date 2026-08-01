package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1771;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1656 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f4857 = 0;

    static {
        LookaheadScopeKt$defaultPlacementApproachInProgress$1 lookaheadScopeKt$defaultPlacementApproachInProgress$1 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
            @Override // p052.InterfaceC6554
            public final Boolean invoke(AbstractC1708 abstractC1708, InterfaceC1695 interfaceC1695) {
                return Boolean.FALSE;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3060(final InterfaceC6551 interfaceC6551, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(441837433);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(interfaceC6551) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            Object objM2345 = c1324.m2345();
            Object obj = C1369.f3974;
            Object obj2 = objM2345;
            if (objM2345 == obj) {
                C1660 c1660 = new C1660();
                c1660.f4858 = null;
                c1324.m2386(c1660);
                obj2 = c1660;
            }
            Object obj3 = (C1660) obj2;
            Object objM23452 = c1324.m2345();
            if (objM23452 == obj) {
                objM23452 = new InterfaceC6543() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // p052.InterfaceC6543
                    public final C1748 invoke() {
                        return new C1748(2);
                    }
                };
                c1324.m2386(objM23452);
            }
            InterfaceC6543 interfaceC6543 = (InterfaceC6543) objM23452;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2490(c1324, new InterfaceC6558() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((C1748) obj4);
                    return C5176.f14739;
                }

                public final void invoke(C1748 c1748) {
                    c1748.f5119 = true;
                }
            });
            AbstractC1367.m2472(c1324, obj3, new InterfaceC6554() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((C1748) obj4, (C1660) obj5);
                    return C5176.f14739;
                }

                public final void invoke(final C1748 c1748, C1660 c16602) {
                    c16602.f4858 = new InterfaceC6543() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // p052.InterfaceC6543
                        public final InterfaceC1695 invoke() {
                            C1748 c1748M3256 = c1748.m3256();
                            c1748M3256.getClass();
                            C1771 c1771 = c1748M3256.f5094.f5286;
                            c1771.getClass();
                            return c1771;
                        }
                    };
                }
            });
            interfaceC6551.invoke(obj3, c1324, Integer.valueOf((i2 << 3) & 112));
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((InterfaceC1373) obj4, ((Number) obj5).intValue());
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    AbstractC1656.m3060(interfaceC6551, interfaceC13732, AbstractC1367.m2471(i | 1));
                }
            };
        }
    }
}
