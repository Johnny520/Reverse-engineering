package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2606;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f5202 = 0;

    static {
        LookaheadScopeKt$defaultPlacementApproachInProgress$1 lookaheadScopeKt$defaultPlacementApproachInProgress$1 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
            @Override // p068.InterfaceC7383
            public final Boolean invoke(AbstractC2543 abstractC2543, InterfaceC2530 interfaceC2530) {
                return Boolean.FALSE;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3620(final InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(441837433);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(interfaceC7380) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            Object objM2905 = c2159.m2905();
            Object obj = C2204.f4319;
            Object obj2 = objM2905;
            if (objM2905 == obj) {
                C2495 c2495 = new C2495();
                c2495.f5203 = null;
                c2159.m2946(c2495);
                obj2 = c2495;
            }
            Object obj3 = (C2495) obj2;
            Object objM29052 = c2159.m2905();
            if (objM29052 == obj) {
                objM29052 = new InterfaceC7372() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // p068.InterfaceC7372
                    public final C2583 invoke() {
                        return new C2583(2);
                    }
                };
                c2159.m2946(objM29052);
            }
            InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM29052;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3050(c2159, new InterfaceC7387() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((C2583) obj4);
                    return C6008.f15084;
                }

                public final void invoke(C2583 c2583) {
                    c2583.f5464 = true;
                }
            });
            AbstractC2202.m3032(c2159, obj3, new InterfaceC7383() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((C2583) obj4, (C2495) obj5);
                    return C6008.f15084;
                }

                public final void invoke(final C2583 c2583, C2495 c24952) {
                    c24952.f5203 = new InterfaceC7372() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // p068.InterfaceC7372
                        public final InterfaceC2530 invoke() {
                            C2583 c2583M3816 = c2583.m3816();
                            c2583M3816.getClass();
                            C2606 c2606 = c2583M3816.f5439.f5631;
                            c2606.getClass();
                            return c2606;
                        }
                    };
                }
            });
            interfaceC7380.invoke(obj3, c2159, Integer.valueOf((i2 << 3) & 112));
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((InterfaceC2208) obj4, ((Number) obj5).intValue());
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    AbstractC2491.m3620(interfaceC7380, interfaceC22082, AbstractC2202.m3031(i | 1));
                }
            };
        }
    }
}
