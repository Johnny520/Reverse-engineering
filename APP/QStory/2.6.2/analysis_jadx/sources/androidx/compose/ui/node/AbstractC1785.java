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
import io.ktor.util.C4210;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7327;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1789 f5222 = new C1789(1);

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
    public static final void m3323(InterfaceC1764 interfaceC1764, InterfaceC6557 interfaceC6557) {
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1764;
        if (!abstractC2128.f6291.f6278) {
            AbstractC7935.m13395("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC21282 = abstractC2128.f6291;
        AbstractC2128 abstractC21283 = abstractC21282.f6287;
        if (abstractC21283 == null) {
            m3332(c1224, abstractC21282);
        } else {
            c1224.m2037(abstractC21283);
        }
        while (true) {
            int i = c1224.f3519;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC21284 = (AbstractC2128) c1224.m2043(i - 1);
            if ((abstractC21284.f6284 & 262144) != 0) {
                for (AbstractC2128 abstractC21285 = abstractC21284; abstractC21285 != null && abstractC21285.f6278; abstractC21285 = abstractC21285.f6287) {
                    if ((abstractC21285.f6290 & 262144) != 0) {
                        ?? M3329 = abstractC21285;
                        ?? c12242 = 0;
                        while (M3329 != 0) {
                            if (M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC17642 = (InterfaceC1764) M3329;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (AbstractC4394.m8917(interfaceC1764.mo1349(), interfaceC17642.mo1349()) && interfaceC1764.getClass() == interfaceC17642.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC6557.invoke(interfaceC17642) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3329.f6290 & 262144) != 0 && (M3329 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21286 = ((AbstractC1788) M3329).f5225;
                                int i2 = 0;
                                M3329 = M3329;
                                c12242 = c12242;
                                while (abstractC21286 != null) {
                                    if ((abstractC21286.f6290 & 262144) != 0) {
                                        i2++;
                                        c12242 = c12242;
                                        if (i2 == 1) {
                                            M3329 = abstractC21286;
                                        } else {
                                            if (c12242 == 0) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3329 != 0) {
                                                c12242.m2037(M3329);
                                                M3329 = 0;
                                            }
                                            c12242.m2037(abstractC21286);
                                        }
                                    }
                                    abstractC21286 = abstractC21286.f6287;
                                    M3329 = M3329;
                                    c12242 = c12242;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3329 = m3329(c12242);
                        }
                    }
                }
            }
            m3332(c1224, abstractC21284);
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
    public static final void m3324(AbstractC2128 abstractC2128, String str, InterfaceC6557 interfaceC6557) {
        if (!abstractC2128.f6291.f6278) {
            AbstractC7935.m13395("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC21282 = abstractC2128.f6291;
        AbstractC2128 abstractC21283 = abstractC21282.f6287;
        if (abstractC21283 == null) {
            m3332(c1224, abstractC21282);
        } else {
            c1224.m2037(abstractC21283);
        }
        while (true) {
            int i = c1224.f3519;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC21284 = (AbstractC2128) c1224.m2043(i - 1);
            if ((abstractC21284.f6284 & 262144) != 0) {
                for (AbstractC2128 abstractC21285 = abstractC21284; abstractC21285 != null && abstractC21285.f6278; abstractC21285 = abstractC21285.f6287) {
                    if ((abstractC21285.f6290 & 262144) != 0) {
                        ?? M3329 = abstractC21285;
                        ?? c12242 = 0;
                        while (M3329 != 0) {
                            if (M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) M3329;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(interfaceC1764.mo1349()) ? (TraversableNode$Companion$TraverseDescendantsAction) interfaceC6557.invoke(interfaceC1764) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((M3329.f6290 & 262144) != 0 && (M3329 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21286 = ((AbstractC1788) M3329).f5225;
                                int i2 = 0;
                                M3329 = M3329;
                                c12242 = c12242;
                                while (abstractC21286 != null) {
                                    if ((abstractC21286.f6290 & 262144) != 0) {
                                        i2++;
                                        c12242 = c12242;
                                        if (i2 == 1) {
                                            M3329 = abstractC21286;
                                        } else {
                                            if (c12242 == 0) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3329 != 0) {
                                                c12242.m2037(M3329);
                                                M3329 = 0;
                                            }
                                            c12242.m2037(abstractC21286);
                                        }
                                    }
                                    abstractC21286 = abstractC21286.f6287;
                                    M3329 = M3329;
                                    c12242 = c12242;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3329 = m3329(c12242);
                        }
                    }
                }
            }
            m3332(c1224, abstractC21284);
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
    public static final void m3325(InterfaceC1764 interfaceC1764, InterfaceC6557 interfaceC6557) {
        C1811 c1811;
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1764;
        if (!abstractC2128.f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC21282 = abstractC2128.f6291.f6283;
        C1748 c1748M3336 = m3336(interfaceC1764);
        while (c1748M3336 != null) {
            if ((c1748M3336.f5093.f5282.f6284 & 262144) != 0) {
                while (abstractC21282 != null) {
                    if ((abstractC21282.f6290 & 262144) != 0) {
                        ?? M3329 = abstractC21282;
                        ?? c1224 = 0;
                        while (M3329 != 0) {
                            boolean zBooleanValue = true;
                            if (M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC17642 = (InterfaceC1764) M3329;
                                if (AbstractC4394.m8917(interfaceC1764.mo1349(), interfaceC17642.mo1349()) && interfaceC1764.getClass() == interfaceC17642.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC6557.invoke(interfaceC17642)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M3329.f6290 & 262144) != 0 && (M3329 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21283 = ((AbstractC1788) M3329).f5225;
                                int i = 0;
                                M3329 = M3329;
                                c1224 = c1224;
                                while (abstractC21283 != null) {
                                    if ((abstractC21283.f6290 & 262144) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3329 = abstractC21283;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3329 != 0) {
                                                c1224.m2037(M3329);
                                                M3329 = 0;
                                            }
                                            c1224.m2037(abstractC21283);
                                        }
                                    }
                                    abstractC21283 = abstractC21283.f6287;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3329 = m3329(c1224);
                        }
                    }
                    abstractC21282 = abstractC21282.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC21282 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
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
    public static final void m3326(InterfaceC1787 interfaceC1787, Object obj, InterfaceC6557 interfaceC6557) {
        C1811 c1811;
        if (!((AbstractC2128) interfaceC1787).f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6291.f6283;
        C1748 c1748M3336 = m3336(interfaceC1787);
        while (c1748M3336 != null) {
            if ((c1748M3336.f5093.f5282.f6284 & 262144) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 262144) != 0) {
                        ?? M3329 = abstractC2128;
                        ?? c1224 = 0;
                        while (M3329 != 0) {
                            if (M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) M3329;
                                if (!(obj.equals(interfaceC1764.mo1349()) ? ((Boolean) interfaceC6557.invoke(interfaceC1764)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M3329.f6290 & 262144) != 0 && (M3329 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21282 = ((AbstractC1788) M3329).f5225;
                                int i = 0;
                                M3329 = M3329;
                                c1224 = c1224;
                                while (abstractC21282 != null) {
                                    if ((abstractC21282.f6290 & 262144) != 0) {
                                        i++;
                                        c1224 = c1224;
                                        if (i == 1) {
                                            M3329 = abstractC21282;
                                        } else {
                                            if (c1224 == 0) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3329 != 0) {
                                                c1224.m2037(M3329);
                                                M3329 = 0;
                                            }
                                            c1224.m2037(abstractC21282);
                                        }
                                    }
                                    abstractC21282 = abstractC21282.f6287;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                }
                                if (i == 1) {
                                }
                            }
                            M3329 = m3329(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final View m3327(InterfaceC1787 interfaceC1787) {
        if (!((AbstractC2128) interfaceC1787).f6291.f6278) {
            AbstractC7935.m13395("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC1757.m3296(m3336(interfaceC1787));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC1773 m3328(AbstractC2128 abstractC2128) {
        if ((abstractC2128.f6290 & 2) != 0) {
            if (abstractC2128 instanceof InterfaceC1773) {
                return (InterfaceC1773) abstractC2128;
            }
            if (abstractC2128 instanceof AbstractC1788) {
                AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128).f5225;
                while (abstractC21282 != 0) {
                    if (abstractC21282 instanceof InterfaceC1773) {
                        return (InterfaceC1773) abstractC21282;
                    }
                    abstractC21282 = (!(abstractC21282 instanceof AbstractC1788) || (abstractC21282.f6290 & 2) == 0) ? abstractC21282.f6287 : ((AbstractC1788) abstractC21282).f5225;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC2128 m3329(C1224 c1224) {
        int i;
        if (c1224 == null || (i = c1224.f3519) == 0) {
            return null;
        }
        return (AbstractC2128) c1224.m2043(i - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC2128 m3330(InterfaceC1787 interfaceC1787, int i) {
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6291.f6287;
        if (abstractC2128 == null || (abstractC2128.f6284 & i) == 0) {
            return null;
        }
        while (abstractC2128 != null) {
            int i2 = abstractC2128.f6290;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC2128;
            }
            abstractC2128 = abstractC2128.f6287;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m3331(AbstractC1754 abstractC1754, AbstractC1689 abstractC1689) {
        AbstractC1754 abstractC1754Mo3193 = abstractC1754.mo3193();
        if (abstractC1754Mo3193 == null) {
            AbstractC7935.m13395("Child of " + abstractC1754 + " cannot be null when calculating alignment line");
        }
        if (abstractC1754.mo3191().mo1462().containsKey(abstractC1689)) {
            Integer num = (Integer) abstractC1754.mo3191().mo1462().get(abstractC1689);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM3281 = abstractC1754Mo3193.m3281(abstractC1689);
            if (iM3281 != Integer.MIN_VALUE) {
                abstractC1754Mo3193.f5147 = true;
                abstractC1754.f5146 = true;
                abstractC1754.mo3201();
                abstractC1754Mo3193.f5147 = false;
                abstractC1754.f5146 = false;
                return iM3281 + ((int) (abstractC1689 instanceof C1697 ? abstractC1754Mo3193.mo3192() & 4294967295L : abstractC1754Mo3193.mo3192() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3332(C1224 c1224, AbstractC2128 abstractC2128) {
        C1224 c1224M3229 = m3336(abstractC2128).m3229();
        int i = c1224M3229.f3519 - 1;
        Object[] objArr = c1224M3229.f3520;
        if (i < objArr.length) {
            while (i >= 0) {
                c1224.m2037(((C1748) objArr[i]).f5093.f5282);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m3333(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m3334(AbstractC2128 abstractC2128, InterfaceC6542 interfaceC6542) {
        C1790 c1790 = abstractC2128.f6288;
        if (c1790 == null) {
            c1790 = new C1790((InterfaceC1791) abstractC2128);
            abstractC2128.f6288 = c1790;
        }
        C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) m3337(abstractC2128)).getSnapshotObserver();
        snapshotObserver.f5273.m2236(c1790, C1790.f5228, interfaceC6542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean m3335(C1748 c1748) {
        if (c1748.f5119 == null) {
            return false;
        }
        C1748 c1748M3246 = c1748.m3246();
        return (c1748M3246 != null ? c1748M3246.f5119 : null) == null || c1748.f5131.f5160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1748 m3336(InterfaceC1787 interfaceC1787) {
        AbstractC1794 abstractC1794 = ((AbstractC2128) interfaceC1787).f6291.f6285;
        if (abstractC1794 != null) {
            return abstractC1794.f5258;
        }
        throw AbstractC0053.m139("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC1801 m3337(InterfaceC1787 interfaceC1787) {
        InterfaceC1801 interfaceC1801 = m3336(interfaceC1787).f5104;
        if (interfaceC1801 != null) {
            return interfaceC1801;
        }
        throw AbstractC0053.m139("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final AbstractC1794 m3338(InterfaceC1787 interfaceC1787, int i) {
        AbstractC1794 abstractC1794 = ((AbstractC2128) interfaceC1787).f6291.f6285;
        abstractC1794.getClass();
        if (abstractC1794.mo3272() != interfaceC1787 || !AbstractC1793.m3368(i)) {
            return abstractC1794;
        }
        AbstractC1794 abstractC17942 = abstractC1794.f5256;
        abstractC17942.getClass();
        return abstractC17942;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC1794 m3339(InterfaceC1787 interfaceC1787) {
        if (!((AbstractC2128) interfaceC1787).f6291.f6278) {
            AbstractC7935.m13395("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC1794 abstractC1794M3338 = m3338(interfaceC1787, 2);
        if (!abstractC1794M3338.mo3272().f6278) {
            AbstractC7935.m13395("LayoutCoordinates is not attached.");
        }
        return abstractC1794M3338;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m3340(InterfaceC1773 interfaceC1773) {
        m3336(interfaceC1773).m3236();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m3341(InterfaceC1781 interfaceC1781) {
        if (((AbstractC2128) interfaceC1781).f6291.f6278) {
            m3338(interfaceC1781, 1).m3372();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final boolean m3342(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m3343(C1748 c1748) {
        int i = AbstractC1741.f5044[c1748.f5131.f5158.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                C1748 c1748M3246 = c1748.m3246();
                if (c1748M3246 != null) {
                    return m3343(c1748M3246);
                }
                C5919.m11249("no parent for idle node");
                return false;
            }
            C4210.m8621();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m3344(InterfaceC1761 interfaceC1761) {
        m3336(interfaceC1761).m3235();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3345(long j) {
        return (j & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m3346(InterfaceC1783 interfaceC1783, AbstractC1390 abstractC1390) {
        if (!((AbstractC2128) interfaceC1783).f6291.f6278) {
            AbstractC7935.m13395("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C1253 c1253 = (C1253) m3336(interfaceC1783).f5094;
        c1253.getClass();
        return AbstractC1367.m2473(c1253, abstractC1390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3347(long j, long j2) {
        boolean zM3342 = m3342(j);
        if (zM3342 != m3342(j2)) {
            return zM3342 ? -1 : 1;
        }
        return (Math.min(m3349(j), m3349(j2)) >= 0.0f && m3345(j) != m3345(j2)) ? m3345(j) ? -1 : 1 : (int) Math.signum(m3349(j) - m3349(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList m3348(InterfaceC1699 interfaceC1699) {
        interfaceC1699.getClass();
        C1748 c1748Mo3194 = ((AbstractC1754) interfaceC1699).mo3194();
        boolean zM3343 = m3343(c1748Mo3194);
        C0242 c0242 = (C0242) c1748Mo3194.m3251();
        C1224 c1224 = (C1224) c0242.f894;
        ArrayList arrayList = new ArrayList(c1224.f3519);
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c1748 = (C1748) c0242.get(i2);
            arrayList.add(zM3343 ? c1748.m3256() : c1748.m3248());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float m3349(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C7327 m3350(AbstractC2128 abstractC2128, boolean z, boolean z2) {
        if (!abstractC2128.f6291.f6278) {
            return C7327.f19541;
        }
        if (z) {
            return m3338(abstractC2128, 8).m3375();
        }
        AbstractC1794 abstractC1794M3338 = m3338(abstractC2128, 8);
        return AbstractC1670.m3103(abstractC1794M3338).mo3079(abstractC1794M3338, z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC1764 m3351(AbstractC1788 abstractC1788, Object obj) {
        C1811 c1811;
        if (!abstractC1788.f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = abstractC1788.f6291.f6283;
        C1748 c1748M3336 = m3336(abstractC1788);
        while (c1748M3336 != null) {
            if ((c1748M3336.f5093.f5282.f6284 & 262144) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 262144) != 0) {
                        AbstractC2128 abstractC2128M3329 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC1764 = (InterfaceC1764) abstractC2128M3329;
                                if (obj.equals(interfaceC1764.mo1349())) {
                                    return interfaceC1764;
                                }
                            }
                            if ((abstractC2128M3329.f6290 & 262144) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                    if ((abstractC21282.f6290 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC2128M3329 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c1224.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c1224.m2037(abstractC21282);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2128M3329 = m3329(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
        return null;
    }
}
