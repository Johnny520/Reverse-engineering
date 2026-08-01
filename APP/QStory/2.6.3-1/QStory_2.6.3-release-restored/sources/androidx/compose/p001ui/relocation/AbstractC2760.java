package androidx.compose.p001ui.relocation;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.runtime.collection.C2059;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p128.C8157;
import p191.AbstractC8568;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.relocation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2760 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m4195(InterfaceC2622 interfaceC2622, final InterfaceC7372 interfaceC7372, ContinuationImpl continuationImpl) {
        Object obj;
        final AbstractC2629 abstractC2629M3909;
        Object objMo2135;
        C2646 c2646;
        if (((AbstractC2961) interfaceC2622).f6637.f6624) {
            AbstractC2961 abstractC2961 = (AbstractC2961) interfaceC2622;
            if (!abstractC2961.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC29612 = abstractC2961.f6637.f6629;
            C2583 c2583M3906 = AbstractC2620.m3906(interfaceC2622);
            loop0: while (true) {
                obj = null;
                if (c2583M3906 == null) {
                    break;
                }
                if ((c2583M3906.f5439.f5628.f6630 & Opcodes.ASM8) != 0) {
                    while (abstractC29612 != null) {
                        if ((abstractC29612.f6636 & Opcodes.ASM8) != 0) {
                            AbstractC2961 abstractC2961M3899 = abstractC29612;
                            C2059 c2059 = null;
                            while (abstractC2961M3899 != null) {
                                if (abstractC2961M3899 instanceof InterfaceC2761) {
                                    obj = abstractC2961M3899;
                                    break loop0;
                                }
                                if ((abstractC2961M3899.f6636 & Opcodes.ASM8) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                    int i = 0;
                                    for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                        if ((abstractC29613.f6636 & Opcodes.ASM8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC2961M3899 = abstractC29613;
                                            } else {
                                                if (c2059 == null) {
                                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (abstractC2961M3899 != null) {
                                                    c2059.m2607(abstractC2961M3899);
                                                    abstractC2961M3899 = null;
                                                }
                                                c2059.m2607(abstractC29613);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2961M3899 = AbstractC2620.m3899(c2059);
                            }
                        }
                        abstractC29612 = abstractC29612.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC29612 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
            }
            InterfaceC2761 interfaceC2761 = (InterfaceC2761) obj;
            if (interfaceC2761 != null && (objMo2135 = interfaceC2761.mo2135((abstractC2629M3909 = AbstractC2620.m3909(interfaceC2622)), new InterfaceC7372() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final C8157 invoke() {
                    C8157 c8157;
                    InterfaceC7372 interfaceC73722 = interfaceC7372;
                    if (interfaceC73722 != null && (c8157 = (C8157) interfaceC73722.invoke()) != null) {
                        return c8157;
                    }
                    InterfaceC2530 interfaceC2530 = abstractC2629M3909;
                    if (!interfaceC2530.mo3646()) {
                        interfaceC2530 = null;
                    }
                    if (interfaceC2530 != null) {
                        return AbstractC8568.m13629(0L, AbstractC1298.m1700(interfaceC2530.mo3648()));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objMo2135;
            }
        }
        return C6008.f15084;
    }
}
