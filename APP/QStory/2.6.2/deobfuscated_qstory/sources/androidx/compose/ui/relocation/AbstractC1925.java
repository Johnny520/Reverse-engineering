package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.AbstractC5061;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6542;
import p112.C7327;
import p210.AbstractC7935;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.relocation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1925 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m3625(InterfaceC1787 interfaceC1787, final InterfaceC6542 interfaceC6542, ContinuationImpl continuationImpl) {
        Object obj;
        final AbstractC1794 abstractC1794M3339;
        Object objMo1565;
        C1811 c1811;
        if (((AbstractC2128) interfaceC1787).f6291.f6278) {
            AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1787;
            if (!abstractC2128.f6291.f6278) {
                AbstractC7935.m13395("visitAncestors called on an unattached node");
            }
            AbstractC2128 abstractC21282 = abstractC2128.f6291.f6283;
            C1748 c1748M3336 = AbstractC1785.m3336(interfaceC1787);
            loop0: while (true) {
                obj = null;
                if (c1748M3336 == null) {
                    break;
                }
                if ((c1748M3336.f5093.f5282.f6284 & Opcodes.ASM8) != 0) {
                    while (abstractC21282 != null) {
                        if ((abstractC21282.f6290 & Opcodes.ASM8) != 0) {
                            AbstractC2128 abstractC2128M3329 = abstractC21282;
                            C1224 c1224 = null;
                            while (abstractC2128M3329 != null) {
                                if (abstractC2128M3329 instanceof InterfaceC1926) {
                                    obj = abstractC2128M3329;
                                    break loop0;
                                }
                                if ((abstractC2128M3329.f6290 & Opcodes.ASM8) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                    int i = 0;
                                    for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                        if ((abstractC21283.f6290 & Opcodes.ASM8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC2128M3329 = abstractC21283;
                                            } else {
                                                if (c1224 == null) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (abstractC2128M3329 != null) {
                                                    c1224.m2037(abstractC2128M3329);
                                                    abstractC2128M3329 = null;
                                                }
                                                c1224.m2037(abstractC21283);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2128M3329 = AbstractC1785.m3329(c1224);
                            }
                        }
                        abstractC21282 = abstractC21282.f6283;
                    }
                }
                c1748M3336 = c1748M3336.m3246();
                abstractC21282 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
            }
            InterfaceC1926 interfaceC1926 = (InterfaceC1926) obj;
            if (interfaceC1926 != null && (objMo1565 = interfaceC1926.mo1565((abstractC1794M3339 = AbstractC1785.m3339(interfaceC1787)), new InterfaceC6542() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p052.InterfaceC6542
                public final C7327 invoke() {
                    C7327 c7327;
                    InterfaceC6542 interfaceC65422 = interfaceC6542;
                    if (interfaceC65422 != null && (c7327 = (C7327) interfaceC65422.invoke()) != null) {
                        return c7327;
                    }
                    InterfaceC1695 interfaceC1695 = abstractC1794M3339;
                    if (!interfaceC1695.mo3076()) {
                        interfaceC1695 = null;
                    }
                    if (interfaceC1695 != null) {
                        return AbstractC5061.m10034(0L, AbstractC8189.m13654(interfaceC1695.mo3078()));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objMo1565;
            }
        }
        return C5175.f14739;
    }
}
