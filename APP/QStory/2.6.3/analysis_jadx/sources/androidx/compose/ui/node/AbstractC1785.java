package androidx.compose.ui.node;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.collection.C0242;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.C1697;
import androidx.compose.ui.layout.InterfaceC1699;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4211;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7328;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1789 f5223 = new C1789(1);

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
    public static final void m3333(InterfaceC1764 interfaceC1764, InterfaceC6558 interfaceC6558) {
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1764;
        if (!abstractC2128.f6292.f6279) {
            AbstractC7936.m13423("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC21282 = abstractC2128.f6292;
        AbstractC2128 abstractC21283 = abstractC21282.f6288;
        if (abstractC21283 == null) {
            m3342(c1224, abstractC21282);
        } else {
            c1224.m2047(abstractC21283);
        }
        while (true) {
            int i = c1224.f3520;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC21284 = (AbstractC2128) c1224.m2053(i - 1);
            if ((abstractC21284.f6285 & 262144) != 0) {
                for (AbstractC2128 abstractC21285 = abstractC21284; abstractC21285 != null && abstractC21285.f6279; abstractC21285 = abstractC21285.f6288) {
                    if ((abstractC21285.f6291 & 262144) != 0) {
                        ?? M3339 = abstractC21285;
                        ?? c12242 = 0;
                        while (M3339 != 0) {
                            if (M3339 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC17642 = (InterfaceC1764) M3339;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (AbstractC4395.m8907(interfaceC1764.mo1359(), interfaceC17642.mo1359()) && interfaceC1764.getClass() == interfaceC17642.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC6558.invoke(interfaceC17642) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3339.f6291 & 262144) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21286 = ((AbstractC1788) M3339).f5226;
                                int i2 = 0;
                                M3339 = M3339;
                                c12242 = c12242;
                                while (abstractC21286 != null) {
                                    if ((abstractC21286.f6291 & 262144) != 0) {
                                        i2++;
                                        c12242 = c12242;
                                        if (i2 == 1) {
                                            M3339 = abstractC21286;
                                        } else {
                                            if (c12242 == 0) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c12242.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c12242.m2047(abstractC21286);
                                        }
                                    }
                                    abstractC21286 = abstractC21286.f6288;
                                    M3339 = M3339;
                                    c12242 = c12242;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3339 = m3339(c12242);
                        }
                    }
                }
            }
            m3342(c1224, abstractC21284);
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
    public static final void m3334(AbstractC2128 abstractC2128, String str, InterfaceC6558 interfaceC6558) {
        if (!abstractC2128.f6292.f6279) {
            AbstractC7936.m13423("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC21282 = abstractC2128.f6292;
        AbstractC2128 abstractC21283 = abstractC21282.f6288;
        if (abstractC21283 == null) {
            m3342(c1224, abstractC21282);
        } else {
            c1224.m2047(abstractC21283);
        }
        while (true) {
            int i = c1224.f3520;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC21284 = (AbstractC2128) c1224.m2053(i - 1);
            if ((abstractC21284.f6285 & 262144) != 0) {
                for (AbstractC2128 abstractC21285 = abstractC21284; abstractC21285 != null && abstractC21285.f6279; abstractC21285 = abstractC21285.f6288) {
                    if ((abstractC21285.f6291 & 262144) != 0) {
                        ?? M3339 = abstractC21285;
                        ?? c12242 = 0;
                        while (M3339 != 0) {
                            if (M3339 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) M3339;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(interfaceC1764.mo1359()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC6558.invoke(interfaceC1764) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3339.f6291 & 262144) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21286 = ((AbstractC1788) M3339).f5226;
                                int i2 = 0;
                                M3339 = M3339;
                                c12242 = c12242;
                                while (abstractC21286 != null) {
                                    if ((abstractC21286.f6291 & 262144) != 0) {
                                        i2++;
                                        c12242 = c12242;
                                        if (i2 == 1) {
                                            M3339 = abstractC21286;
                                        } else {
                                            if (c12242 == 0) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c12242.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c12242.m2047(abstractC21286);
                                        }
                                    }
                                    abstractC21286 = abstractC21286.f6288;
                                    M3339 = M3339;
                                    c12242 = c12242;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3339 = m3339(c12242);
                        }
                    }
                }
            }
            m3342(c1224, abstractC21284);
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
    public static final void m3335(InterfaceC1764 interfaceC1764, InterfaceC6558 interfaceC6558) {
        C1811 c1811;
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1764;
        if (!abstractC2128.f6292.f6279) {
            AbstractC7936.m13423("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC21282 = abstractC2128.f6292.f6284;
        C1748 c1748M3346 = m3346(interfaceC1764);
        while (c1748M3346 != null) {
            if ((c1748M3346.f5094.f5283.f6285 & 262144) != 0) {
                while (abstractC21282 != null) {
                    if ((abstractC21282.f6291 & 262144) != 0) {
                        ?? M3339 = abstractC21282;
                        ?? c1224 = 0;
                        while (M3339 != 0) {
                            boolean zBooleanValue = true;
                            if (M3339 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC17642 = (InterfaceC1764) M3339;
                                if (AbstractC4395.m8907(interfaceC1764.mo1359(), interfaceC17642.mo1359()) && interfaceC1764.getClass() == interfaceC17642.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC6558.invoke(interfaceC17642)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M3339.f6291 & 262144) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21283 = ((AbstractC1788) M3339).f5226;
                                int i = 0;
                                M3339 = M3339;
                                c1224 = c1224;
                                while (abstractC21283 != null) {
                                    if ((abstractC21283.f6291 & 262144) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3339 = abstractC21283;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c1224.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c1224.m2047(abstractC21283);
                                        }
                                    }
                                    abstractC21283 = abstractC21283.f6288;
                                    M3339 = M3339;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3339 = m3339(c1224);
                        }
                    }
                    abstractC21282 = abstractC21282.f6284;
                }
            }
            c1748M3346 = c1748M3346.m3256();
            abstractC21282 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
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
    public static final void m3336(InterfaceC1787 interfaceC1787, Object obj, InterfaceC6558 interfaceC6558) {
        C1811 c1811;
        if (!((AbstractC2128) interfaceC1787).f6292.f6279) {
            AbstractC7936.m13423("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6292.f6284;
        C1748 c1748M3346 = m3346(interfaceC1787);
        while (c1748M3346 != null) {
            if ((c1748M3346.f5094.f5283.f6285 & 262144) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 262144) != 0) {
                        ?? M3339 = abstractC2128;
                        ?? c1224 = 0;
                        while (M3339 != 0) {
                            if (M3339 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) M3339;
                                if (!(obj.equals(interfaceC1764.mo1359()) ? ((Boolean) interfaceC6558.invoke(interfaceC1764)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M3339.f6291 & 262144) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) M3339).f5226;
                                int i = 0;
                                M3339 = M3339;
                                c1224 = c1224;
                                while (abstractC21282 != null) {
                                    if ((abstractC21282.f6291 & 262144) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3339 = abstractC21282;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c1224.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c1224.m2047(abstractC21282);
                                        }
                                    }
                                    abstractC21282 = abstractC21282.f6288;
                                    M3339 = M3339;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3339 = m3339(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6284;
                }
            }
            c1748M3346 = c1748M3346.m3256();
            abstractC2128 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final View m3337(InterfaceC1787 interfaceC1787) {
        if (!((AbstractC2128) interfaceC1787).f6292.f6279) {
            AbstractC7936.m13423("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC1757.m3306(m3346(interfaceC1787));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC1773 m3338(AbstractC2128 abstractC2128) {
        if ((abstractC2128.f6291 & 2) != 0) {
            if (abstractC2128 instanceof InterfaceC1773) {
                return (InterfaceC1773) abstractC2128;
            }
            if (abstractC2128 instanceof AbstractC1788) {
                AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128).f5226;
                while (abstractC21282 != 0) {
                    if (abstractC21282 instanceof InterfaceC1773) {
                        return (InterfaceC1773) abstractC21282;
                    }
                    abstractC21282 = (!(abstractC21282 instanceof AbstractC1788) || (abstractC21282.f6291 & 2) == 0) ? abstractC21282.f6288 : ((AbstractC1788) abstractC21282).f5226;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC2128 m3339(C1224 c1224) {
        int i;
        if (c1224 == null || (i = c1224.f3520) == 0) {
            return null;
        }
        return (AbstractC2128) c1224.m2053(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC2128 m3340(InterfaceC1787 interfaceC1787, int i) {
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6292.f6288;
        if (abstractC2128 == null || (abstractC2128.f6285 & i) == 0) {
            return null;
        }
        while (abstractC2128 != null) {
            int i2 = abstractC2128.f6291;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC2128;
            }
            abstractC2128 = abstractC2128.f6288;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m3341(AbstractC1754 abstractC1754, AbstractC1689 abstractC1689) {
        AbstractC1754 abstractC1754Mo3203 = abstractC1754.mo3203();
        if (abstractC1754Mo3203 == null) {
            AbstractC7936.m13423("Child of " + abstractC1754 + " cannot be null when calculating alignment line");
        }
        if (abstractC1754.mo3201().mo1472().containsKey(abstractC1689)) {
            Integer num = (Integer) abstractC1754.mo3201().mo1472().get(abstractC1689);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM3291 = abstractC1754Mo3203.m3291(abstractC1689);
            if (iM3291 != Integer.MIN_VALUE) {
                abstractC1754Mo3203.f5148 = true;
                abstractC1754.f5147 = true;
                abstractC1754.mo3211();
                abstractC1754Mo3203.f5148 = false;
                abstractC1754.f5147 = false;
                return iM3291 + ((int) (abstractC1689 instanceof C1697 ? abstractC1754Mo3203.mo3202() & 4294967295L : abstractC1754Mo3203.mo3202() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3342(C1224 c1224, AbstractC2128 abstractC2128) {
        C1224 c1224M3239 = m3346(abstractC2128).m3239();
        int i = c1224M3239.f3520 - 1;
        Object[] objArr = c1224M3239.f3521;
        if (i < objArr.length) {
            while (i >= 0) {
                c1224.m2047(((C1748) objArr[i]).f5094.f5283);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m3343(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m3344(AbstractC2128 abstractC2128, InterfaceC6543 interfaceC6543) {
        C1790 c1790 = abstractC2128.f6289;
        if (c1790 == null) {
            c1790 = new C1790((InterfaceC1791) abstractC2128);
            abstractC2128.f6289 = c1790;
        }
        C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) m3347(abstractC2128)).getSnapshotObserver();
        snapshotObserver.f5274.m2246(c1790, C1790.f5229, interfaceC6543);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean m3345(C1748 c1748) {
        if (c1748.f5120 == null) {
            return false;
        }
        C1748 c1748M3256 = c1748.m3256();
        return (c1748M3256 != null ? c1748M3256.f5120 : null) == null || c1748.f5132.f5161;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1748 m3346(InterfaceC1787 interfaceC1787) {
        AbstractC1794 abstractC1794 = ((AbstractC2128) interfaceC1787).f6292.f6286;
        if (abstractC1794 != null) {
            return abstractC1794.f5259;
        }
        throw AbstractC0053.m139("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC1801 m3347(InterfaceC1787 interfaceC1787) {
        InterfaceC1801 interfaceC1801 = m3346(interfaceC1787).f5105;
        if (interfaceC1801 != null) {
            return interfaceC1801;
        }
        throw AbstractC0053.m139("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final AbstractC1794 m3348(InterfaceC1787 interfaceC1787, int i) {
        AbstractC1794 abstractC1794 = ((AbstractC2128) interfaceC1787).f6292.f6286;
        abstractC1794.getClass();
        if (abstractC1794.mo3282() != interfaceC1787 || !AbstractC1793.m3378(i)) {
            return abstractC1794;
        }
        AbstractC1794 abstractC17942 = abstractC1794.f5257;
        abstractC17942.getClass();
        return abstractC17942;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC1794 m3349(InterfaceC1787 interfaceC1787) {
        if (!((AbstractC2128) interfaceC1787).f6292.f6279) {
            AbstractC7936.m13423("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC1794 abstractC1794M3348 = m3348(interfaceC1787, 2);
        if (!abstractC1794M3348.mo3282().f6279) {
            AbstractC7936.m13423("LayoutCoordinates is not attached.");
        }
        return abstractC1794M3348;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m3350(InterfaceC1773 interfaceC1773) {
        m3346(interfaceC1773).m3246();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m3351(InterfaceC1781 interfaceC1781) {
        if (((AbstractC2128) interfaceC1781).f6292.f6279) {
            m3348(interfaceC1781, 1).m3382();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final boolean m3352(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m3353(C1748 c1748) {
        int i = AbstractC1741.f5045[c1748.f5132.f5159.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                C1748 c1748M3256 = c1748.m3256();
                if (c1748M3256 != null) {
                    return m3353(c1748M3256);
                }
                C5925.m11310("no parent for idle node");
                return false;
            }
            C4211.m8611();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m3354(InterfaceC1761 interfaceC1761) {
        m3346(interfaceC1761).m3245();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3355(long j) {
        return (j & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m3356(InterfaceC1783 interfaceC1783, AbstractC1390 abstractC1390) {
        if (!((AbstractC2128) interfaceC1783).f6292.f6279) {
            AbstractC7936.m13423("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C1253 c1253 = (C1253) m3346(interfaceC1783).f5095;
        c1253.getClass();
        return AbstractC1367.m2482(c1253, abstractC1390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3357(long j, long j2) {
        boolean zM3352 = m3352(j);
        if (zM3352 != m3352(j2)) {
            return zM3352 ? -1 : 1;
        }
        return (Math.min(m3359(j), m3359(j2)) >= 0.0f && m3355(j) != m3355(j2)) ? m3355(j) ? -1 : 1 : (int) Math.signum(m3359(j) - m3359(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList m3358(InterfaceC1699 interfaceC1699) {
        interfaceC1699.getClass();
        C1748 c1748Mo3204 = ((AbstractC1754) interfaceC1699).mo3204();
        boolean zM3353 = m3353(c1748Mo3204);
        C0242 c0242 = (C0242) c1748Mo3204.m3261();
        C1224 c1224 = (C1224) c0242.f894;
        ArrayList arrayList = new ArrayList(c1224.f3520);
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c1748 = (C1748) c0242.get(i2);
            arrayList.add(zM3353 ? c1748.m3266() : c1748.m3258());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float m3359(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C7328 m3360(AbstractC2128 abstractC2128, boolean z, boolean z2) {
        if (!abstractC2128.f6292.f6279) {
            return C7328.f19536;
        }
        if (z) {
            return m3348(abstractC2128, 8).m3385();
        }
        AbstractC1794 abstractC1794M3348 = m3348(abstractC2128, 8);
        return AbstractC1670.m3113(abstractC1794M3348).mo3089(abstractC1794M3348, z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC1764 m3361(AbstractC1788 abstractC1788, Object obj) {
        C1811 c1811;
        if (!abstractC1788.f6292.f6279) {
            AbstractC7936.m13423("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = abstractC1788.f6292.f6284;
        C1748 c1748M3346 = m3346(abstractC1788);
        while (c1748M3346 != null) {
            if ((c1748M3346.f5094.f5283.f6285 & 262144) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 262144) != 0) {
                        AbstractC2128 abstractC2128M3339 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) abstractC2128M3339;
                                if (obj.equals(interfaceC1764.mo1359())) {
                                    return interfaceC1764;
                                }
                            }
                            if ((abstractC2128M3339.f6291 & 262144) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                                    if ((abstractC21282.f6291 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC2128M3339 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c1224.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c1224.m2047(abstractC21282);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2128M3339 = m3339(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6284;
                }
            }
            c1748M3346 = c1748M3346.m3256();
            abstractC2128 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
        }
        return null;
    }
}
