package androidx.compose.p001ui.node;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.collection.C1089;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.C2532;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.C2088;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8157;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2624 f5568 = new C2624(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.ui.node.飘花落叶言子哲楪苏兰世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m3893(InterfaceC2599 interfaceC2599, InterfaceC7387 interfaceC7387) {
        AbstractC2961 abstractC2961 = (AbstractC2961) interfaceC2599;
        if (!abstractC2961.f6637.f6624) {
            AbstractC8765.m13982("visitSubtreeIf called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC29612 = abstractC2961.f6637;
        AbstractC2961 abstractC29613 = abstractC29612.f6633;
        if (abstractC29613 == null) {
            m3902(c2059, abstractC29612);
        } else {
            c2059.m2607(abstractC29613);
        }
        while (true) {
            int i = c2059.f3865;
            if (i == 0) {
                return;
            }
            AbstractC2961 abstractC29614 = (AbstractC2961) c2059.m2613(i - 1);
            if ((abstractC29614.f6630 & 262144) != 0) {
                for (AbstractC2961 abstractC29615 = abstractC29614; abstractC29615 != null && abstractC29615.f6624; abstractC29615 = abstractC29615.f6633) {
                    if ((abstractC29615.f6636 & 262144) != 0) {
                        ?? M3899 = abstractC29615;
                        ?? c20592 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC25992 = (InterfaceC2599) M3899;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (AbstractC5227.m9466(interfaceC2599.mo1919(), interfaceC25992.mo1919()) && interfaceC2599.getClass() == interfaceC25992.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC7387.invoke(interfaceC25992) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3899.f6636 & 262144) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29616 = ((AbstractC2623) M3899).f5571;
                                int i2 = 0;
                                M3899 = M3899;
                                c20592 = c20592;
                                while (abstractC29616 != null) {
                                    if ((abstractC29616.f6636 & 262144) != 0) {
                                        i2++;
                                        c20592 = c20592;
                                        if (i2 == 1) {
                                            M3899 = abstractC29616;
                                        } else {
                                            if (c20592 == 0) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c20592.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c20592.m2607(abstractC29616);
                                        }
                                    }
                                    abstractC29616 = abstractC29616.f6633;
                                    M3899 = M3899;
                                    c20592 = c20592;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3899 = m3899(c20592);
                        }
                    }
                }
            }
            m3902(c2059, abstractC29614);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final void m3894(AbstractC2961 abstractC2961, String str, InterfaceC7387 interfaceC7387) {
        if (!abstractC2961.f6637.f6624) {
            AbstractC8765.m13982("visitSubtreeIf called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC29612 = abstractC2961.f6637;
        AbstractC2961 abstractC29613 = abstractC29612.f6633;
        if (abstractC29613 == null) {
            m3902(c2059, abstractC29612);
        } else {
            c2059.m2607(abstractC29613);
        }
        while (true) {
            int i = c2059.f3865;
            if (i == 0) {
                return;
            }
            AbstractC2961 abstractC29614 = (AbstractC2961) c2059.m2613(i - 1);
            if ((abstractC29614.f6630 & 262144) != 0) {
                for (AbstractC2961 abstractC29615 = abstractC29614; abstractC29615 != null && abstractC29615.f6624; abstractC29615 = abstractC29615.f6633) {
                    if ((abstractC29615.f6636 & 262144) != 0) {
                        ?? M3899 = abstractC29615;
                        ?? c20592 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC2599 = (InterfaceC2599) M3899;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(interfaceC2599.mo1919()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC7387.invoke(interfaceC2599) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3899.f6636 & 262144) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29616 = ((AbstractC2623) M3899).f5571;
                                int i2 = 0;
                                M3899 = M3899;
                                c20592 = c20592;
                                while (abstractC29616 != null) {
                                    if ((abstractC29616.f6636 & 262144) != 0) {
                                        i2++;
                                        c20592 = c20592;
                                        if (i2 == 1) {
                                            M3899 = abstractC29616;
                                        } else {
                                            if (c20592 == 0) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c20592.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c20592.m2607(abstractC29616);
                                        }
                                    }
                                    abstractC29616 = abstractC29616.f6633;
                                    M3899 = M3899;
                                    c20592 = c20592;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3899 = m3899(c20592);
                        }
                    }
                }
            }
            m3902(c2059, abstractC29614);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.飘花落叶言子哲楪苏兰世, androidx.compose.ui.node.飘花落叶言子楪苏哲世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m3895(InterfaceC2599 interfaceC2599, InterfaceC7387 interfaceC7387) {
        C2646 c2646;
        AbstractC2961 abstractC2961 = (AbstractC2961) interfaceC2599;
        if (!abstractC2961.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC29612 = abstractC2961.f6637.f6629;
        C2583 c2583M3906 = m3906(interfaceC2599);
        while (c2583M3906 != null) {
            if ((c2583M3906.f5439.f5628.f6630 & 262144) != 0) {
                while (abstractC29612 != null) {
                    if ((abstractC29612.f6636 & 262144) != 0) {
                        ?? M3899 = abstractC29612;
                        ?? c2059 = 0;
                        while (M3899 != 0) {
                            boolean zBooleanValue = true;
                            if (M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC25992 = (InterfaceC2599) M3899;
                                if (AbstractC5227.m9466(interfaceC2599.mo1919(), interfaceC25992.mo1919()) && interfaceC2599.getClass() == interfaceC25992.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC7387.invoke(interfaceC25992)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M3899.f6636 & 262144) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29613 = ((AbstractC2623) M3899).f5571;
                                int i = 0;
                                M3899 = M3899;
                                c2059 = c2059;
                                while (abstractC29613 != null) {
                                    if ((abstractC29613.f6636 & 262144) != 0) {
                                        i++;
                                        c2059 = c2059;
                                        if (i == 1) {
                                            M3899 = abstractC29613;
                                        } else {
                                            if (c2059 == 0) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c2059.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c2059.m2607(abstractC29613);
                                        }
                                    }
                                    abstractC29613 = abstractC29613.f6633;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                }
                                if (i == 1) {
                                }
                            }
                            M3899 = m3899(c2059);
                        }
                    }
                    abstractC29612 = abstractC29612.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC29612 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final void m3896(InterfaceC2622 interfaceC2622, Object obj, InterfaceC7387 interfaceC7387) {
        C2646 c2646;
        if (!((AbstractC2961) interfaceC2622).f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = ((AbstractC2961) interfaceC2622).f6637.f6629;
        C2583 c2583M3906 = m3906(interfaceC2622);
        while (c2583M3906 != null) {
            if ((c2583M3906.f5439.f5628.f6630 & 262144) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 262144) != 0) {
                        ?? M3899 = abstractC2961;
                        ?? c2059 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC2599 = (InterfaceC2599) M3899;
                                if (!(obj.equals(interfaceC2599.mo1919()) ? ((Boolean) interfaceC7387.invoke(interfaceC2599)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M3899.f6636 & 262144) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                                int i = 0;
                                M3899 = M3899;
                                c2059 = c2059;
                                while (abstractC29612 != null) {
                                    if ((abstractC29612.f6636 & 262144) != 0) {
                                        i++;
                                        c2059 = c2059;
                                        if (i == 1) {
                                            M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == 0) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c2059.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                    abstractC29612 = abstractC29612.f6633;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                }
                                if (i == 1) {
                                }
                            }
                            M3899 = m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final View m3897(InterfaceC2622 interfaceC2622) {
        if (!((AbstractC2961) interfaceC2622).f6637.f6624) {
            AbstractC8765.m13982("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC2592.m3866(m3906(interfaceC2622));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC2608 m3898(AbstractC2961 abstractC2961) {
        if ((abstractC2961.f6636 & 2) != 0) {
            if (abstractC2961 instanceof InterfaceC2608) {
                return (InterfaceC2608) abstractC2961;
            }
            if (abstractC2961 instanceof AbstractC2623) {
                AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961).f5571;
                while (abstractC29612 != 0) {
                    if (abstractC29612 instanceof InterfaceC2608) {
                        return (InterfaceC2608) abstractC29612;
                    }
                    abstractC29612 = (!(abstractC29612 instanceof AbstractC2623) || (abstractC29612.f6636 & 2) == 0) ? abstractC29612.f6633 : ((AbstractC2623) abstractC29612).f5571;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC2961 m3899(C2059 c2059) {
        int i;
        if (c2059 == null || (i = c2059.f3865) == 0) {
            return null;
        }
        return (AbstractC2961) c2059.m2613(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC2961 m3900(InterfaceC2622 interfaceC2622, int i) {
        AbstractC2961 abstractC2961 = ((AbstractC2961) interfaceC2622).f6637.f6633;
        if (abstractC2961 == null || (abstractC2961.f6630 & i) == 0) {
            return null;
        }
        while (abstractC2961 != null) {
            int i2 = abstractC2961.f6636;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC2961;
            }
            abstractC2961 = abstractC2961.f6633;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m3901(AbstractC2589 abstractC2589, AbstractC2524 abstractC2524) {
        AbstractC2589 abstractC2589Mo3763 = abstractC2589.mo3763();
        if (abstractC2589Mo3763 == null) {
            AbstractC8765.m13982("Child of " + abstractC2589 + " cannot be null when calculating alignment line");
        }
        if (abstractC2589.mo3761().mo2032().containsKey(abstractC2524)) {
            Integer num = (Integer) abstractC2589.mo3761().mo2032().get(abstractC2524);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM3851 = abstractC2589Mo3763.m3851(abstractC2524);
            if (iM3851 != Integer.MIN_VALUE) {
                abstractC2589Mo3763.f5493 = true;
                abstractC2589.f5492 = true;
                abstractC2589.mo3771();
                abstractC2589Mo3763.f5493 = false;
                abstractC2589.f5492 = false;
                return iM3851 + ((int) (abstractC2524 instanceof C2532 ? abstractC2589Mo3763.mo3762() & 4294967295L : abstractC2589Mo3763.mo3762() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3902(C2059 c2059, AbstractC2961 abstractC2961) {
        C2059 c2059M3799 = m3906(abstractC2961).m3799();
        int i = c2059M3799.f3865 - 1;
        Object[] objArr = c2059M3799.f3866;
        if (i < objArr.length) {
            while (i >= 0) {
                c2059.m2607(((C2583) objArr[i]).f5439.f5628);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m3903(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m3904(AbstractC2961 abstractC2961, InterfaceC7372 interfaceC7372) {
        C2625 c2625 = abstractC2961.f6634;
        if (c2625 == null) {
            c2625 = new C2625((InterfaceC2626) abstractC2961);
            abstractC2961.f6634 = c2625;
        }
        C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) m3907(abstractC2961)).getSnapshotObserver();
        snapshotObserver.f5619.m2806(c2625, C2625.f5574, interfaceC7372);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean m3905(C2583 c2583) {
        if (c2583.f5465 == null) {
            return false;
        }
        C2583 c2583M3816 = c2583.m3816();
        return (c2583M3816 != null ? c2583M3816.f5465 : null) == null || c2583.f5477.f5506;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2583 m3906(InterfaceC2622 interfaceC2622) {
        AbstractC2629 abstractC2629 = ((AbstractC2961) interfaceC2622).f6637.f6631;
        if (abstractC2629 != null) {
            return abstractC2629.f5604;
        }
        throw AbstractC0900.m699("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC2636 m3907(InterfaceC2622 interfaceC2622) {
        InterfaceC2636 interfaceC2636 = m3906(interfaceC2622).f5450;
        if (interfaceC2636 != null) {
            return interfaceC2636;
        }
        throw AbstractC0900.m699("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final AbstractC2629 m3908(InterfaceC2622 interfaceC2622, int i) {
        AbstractC2629 abstractC2629 = ((AbstractC2961) interfaceC2622).f6637.f6631;
        abstractC2629.getClass();
        if (abstractC2629.mo3842() != interfaceC2622 || !AbstractC2628.m3938(i)) {
            return abstractC2629;
        }
        AbstractC2629 abstractC26292 = abstractC2629.f5602;
        abstractC26292.getClass();
        return abstractC26292;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC2629 m3909(InterfaceC2622 interfaceC2622) {
        if (!((AbstractC2961) interfaceC2622).f6637.f6624) {
            AbstractC8765.m13982("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC2629 abstractC2629M3908 = m3908(interfaceC2622, 2);
        if (!abstractC2629M3908.mo3842().f6624) {
            AbstractC8765.m13982("LayoutCoordinates is not attached.");
        }
        return abstractC2629M3908;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m3910(InterfaceC2608 interfaceC2608) {
        m3906(interfaceC2608).m3806();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m3911(InterfaceC2616 interfaceC2616) {
        if (((AbstractC2961) interfaceC2616).f6637.f6624) {
            m3908(interfaceC2616, 1).m3942();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final boolean m3912(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m3913(C2583 c2583) {
        int i = AbstractC2576.f5390[c2583.f5477.f5504.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                C2583 c2583M3816 = c2583.m3816();
                if (c2583M3816 != null) {
                    return m3913(c2583M3816);
                }
                C6755.m11869("no parent for idle node");
                return false;
            }
            C5043.m9170();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m3914(InterfaceC2596 interfaceC2596) {
        m3906(interfaceC2596).m3805();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3915(long j) {
        return (j & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m3916(InterfaceC2618 interfaceC2618, AbstractC2225 abstractC2225) {
        if (!((AbstractC2961) interfaceC2618).f6637.f6624) {
            AbstractC8765.m13982("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C2088 c2088 = (C2088) m3906(interfaceC2618).f5440;
        c2088.getClass();
        return AbstractC2202.m3042(c2088, abstractC2225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3917(long j, long j2) {
        boolean zM3912 = m3912(j);
        if (zM3912 != m3912(j2)) {
            return zM3912 ? -1 : 1;
        }
        return (Math.min(m3919(j), m3919(j2)) >= 0.0f && m3915(j) != m3915(j2)) ? m3915(j) ? -1 : 1 : (int) Math.signum(m3919(j) - m3919(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList m3918(InterfaceC2534 interfaceC2534) {
        interfaceC2534.getClass();
        C2583 c2583Mo3764 = ((AbstractC2589) interfaceC2534).mo3764();
        boolean zM3913 = m3913(c2583Mo3764);
        C1089 c1089 = (C1089) c2583Mo3764.m3821();
        C2059 c2059 = (C2059) c1089.f1239;
        ArrayList arrayList = new ArrayList(c2059.f3865);
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c2583 = (C2583) c1089.get(i2);
            arrayList.add(zM3913 ? c2583.m3826() : c2583.m3818());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float m3919(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8157 m3920(AbstractC2961 abstractC2961, boolean z, boolean z2) {
        if (!abstractC2961.f6637.f6624) {
            return C8157.f19881;
        }
        if (z) {
            return m3908(abstractC2961, 8).m3945();
        }
        AbstractC2629 abstractC2629M3908 = m3908(abstractC2961, 8);
        return AbstractC2505.m3673(abstractC2629M3908).mo3649(abstractC2629M3908, z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC2599 m3921(AbstractC2623 abstractC2623, Object obj) {
        C2646 c2646;
        if (!abstractC2623.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = abstractC2623.f6637.f6629;
        C2583 c2583M3906 = m3906(abstractC2623);
        while (c2583M3906 != null) {
            if ((c2583M3906.f5439.f5628.f6630 & 262144) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 262144) != 0) {
                        AbstractC2961 abstractC2961M3899 = abstractC2961;
                        C2059 c2059 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC2599 = (InterfaceC2599) abstractC2961M3899;
                                if (obj.equals(interfaceC2599.mo1919())) {
                                    return interfaceC2599;
                                }
                            }
                            if ((abstractC2961M3899.f6636 & 262144) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i = 0;
                                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                    if ((abstractC29612.f6636 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC2961M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == null) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c2059.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2961M3899 = m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
        return null;
    }
}
