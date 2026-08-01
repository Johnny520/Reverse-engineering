package androidx.compose.ui.relocation;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p112.C7328;
import p175.AbstractC7739;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.relocation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1925 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m3635(InterfaceC1787 interfaceC1787, final InterfaceC6543 interfaceC6543, ContinuationImpl continuationImpl) {
        Object obj;
        final AbstractC1794 abstractC1794M3349;
        Object objMo1575;
        C1811 c1811;
        if (((AbstractC2128) interfaceC1787).f6292.f6279) {
            AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1787;
            if (!abstractC2128.f6292.f6279) {
                AbstractC7936.m13423("visitAncestors called on an unattached node");
            }
            AbstractC2128 abstractC21282 = abstractC2128.f6292.f6284;
            C1748 c1748M3346 = AbstractC1785.m3346(interfaceC1787);
            loop0: while (true) {
                obj = null;
                if (c1748M3346 == null) {
                    break;
                }
                if ((c1748M3346.f5094.f5283.f6285 & Opcodes.ASM8) != 0) {
                    while (abstractC21282 != null) {
                        if ((abstractC21282.f6291 & Opcodes.ASM8) != 0) {
                            AbstractC2128 abstractC2128M3339 = abstractC21282;
                            C1224 c1224 = null;
                            while (abstractC2128M3339 != null) {
                                if (abstractC2128M3339 instanceof InterfaceC1926) {
                                    obj = abstractC2128M3339;
                                    break loop0;
                                }
                                if ((abstractC2128M3339.f6291 & Opcodes.ASM8) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                    int i = 0;
                                    for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                        if ((abstractC21283.f6291 & Opcodes.ASM8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC2128M3339 = abstractC21283;
                                            } else {
                                                if (c1224 == null) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (abstractC2128M3339 != null) {
                                                    c1224.m2047(abstractC2128M3339);
                                                    abstractC2128M3339 = null;
                                                }
                                                c1224.m2047(abstractC21283);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2128M3339 = AbstractC1785.m3339(c1224);
                            }
                        }
                        abstractC21282 = abstractC21282.f6284;
                    }
                }
                c1748M3346 = c1748M3346.m3256();
                abstractC21282 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
            }
            InterfaceC1926 interfaceC1926 = (InterfaceC1926) obj;
            if (interfaceC1926 != null && (objMo1575 = interfaceC1926.mo1575((abstractC1794M3349 = AbstractC1785.m3349(interfaceC1787)), new InterfaceC6543() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final C7328 invoke() {
                    C7328 c7328;
                    InterfaceC6543 interfaceC65432 = interfaceC6543;
                    if (interfaceC65432 != null && (c7328 = (C7328) interfaceC65432.invoke()) != null) {
                        return c7328;
                    }
                    InterfaceC1695 interfaceC1695 = abstractC1794M3349;
                    if (!interfaceC1695.mo3086()) {
                        interfaceC1695 = null;
                    }
                    if (interfaceC1695 != null) {
                        return AbstractC7739.m13070(0L, AbstractC0455.m1140(interfaceC1695.mo3088()));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objMo1575;
            }
        }
        return C5176.f14739;
    }
}
