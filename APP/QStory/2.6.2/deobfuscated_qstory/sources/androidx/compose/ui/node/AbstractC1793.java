package androidx.compose.ui.node;

import androidx.appcompat.app.C0076;
import androidx.collection.AbstractC0234;
import androidx.collection.C0252;
import androidx.compose.animation.C0417;
import androidx.compose.foundation.C1096;
import androidx.compose.foundation.lazy.layout.C0719;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2124;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.C1480;
import androidx.compose.ui.focus.InterfaceC1462;
import androidx.compose.ui.focus.InterfaceC1469;
import androidx.compose.ui.input.pointer.C1640;
import androidx.compose.ui.layout.InterfaceC1668;
import androidx.compose.ui.layout.InterfaceC1687;
import androidx.compose.ui.modifier.InterfaceC1733;
import androidx.compose.ui.platform.C1890;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.relocation.InterfaceC1926;
import androidx.compose.ui.semantics.C1940;
import net.bytebuddy.jar.asm.Opcodes;
import p106.InterfaceC7306;
import p110.InterfaceC7319;
import p205.C7907;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0252 f5233;

    static {
        C0252 c0252 = AbstractC0234.f874;
        f5233 = new C0252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3362(AbstractC2128 abstractC2128) {
        if (!(abstractC2128 instanceof AbstractC1788)) {
            return m3363(abstractC2128);
        }
        AbstractC1788 abstractC1788 = (AbstractC1788) abstractC2128;
        int iM3362 = abstractC1788.f5224;
        for (AbstractC2128 abstractC21282 = abstractC1788.f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
            iM3362 |= m3362(abstractC21282);
        }
        return iM3362;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3363(AbstractC2128 abstractC2128) {
        int i = abstractC2128.f6290;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC2128.getClass();
        C0252 c0252 = f5233;
        int iM803 = c0252.m803(cls);
        if (iM803 >= 0) {
            return c0252.f916[iM803];
        }
        int i2 = abstractC2128 instanceof InterfaceC1773 ? 3 : 1;
        if (abstractC2128 instanceof InterfaceC1781) {
            i2 |= 4;
        }
        if (abstractC2128 instanceof InterfaceC1761) {
            i2 |= 8;
        }
        if (abstractC2128 instanceof InterfaceC1796) {
            i2 |= 16;
        }
        if (abstractC2128 instanceof InterfaceC1733) {
            i2 |= 32;
        }
        if (abstractC2128 instanceof InterfaceC1799) {
            i2 |= 64;
        }
        if (abstractC2128 instanceof InterfaceC1776) {
            i2 |= 4194432;
        } else if (abstractC2128 instanceof InterfaceC1740) {
            i2 |= 128;
        }
        if (abstractC2128 instanceof InterfaceC1782) {
            i2 |= 256;
        }
        if (abstractC2128 instanceof InterfaceC1687) {
            i2 |= 512;
        }
        if (abstractC2128 instanceof C1452) {
            i2 |= 1024;
        }
        if (abstractC2128 instanceof InterfaceC1469) {
            i2 |= 2048;
        }
        if (abstractC2128 instanceof InterfaceC1462) {
            i2 |= 4096;
        }
        if (abstractC2128 instanceof InterfaceC7306) {
            i2 |= 8192;
        }
        if (abstractC2128 instanceof C1890) {
            i2 |= 16384;
        }
        if (abstractC2128 instanceof InterfaceC1783) {
            i2 |= 32768;
        }
        if (abstractC2128 instanceof InterfaceC1764) {
            i2 |= 262144;
        }
        if (abstractC2128 instanceof InterfaceC1926) {
            i2 |= Opcodes.ASM8;
        }
        if (abstractC2128 instanceof InterfaceC7319) {
            i2 |= 2097152;
        }
        if (abstractC2128 instanceof C0719) {
            i2 |= 8388608;
        }
        c0252.m807(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m3364(InterfaceC2124 interfaceC2124) {
        int i = interfaceC2124 instanceof InterfaceC1668 ? 3 : 1;
        if (interfaceC2124 instanceof C1096) {
            i |= 4;
        }
        if (interfaceC2124 instanceof C1940) {
            i |= 8;
        }
        if (interfaceC2124 instanceof C1640) {
            i |= 16;
        }
        if (interfaceC2124 instanceof C0417) {
            i |= 64;
        }
        return interfaceC2124 instanceof InterfaceC1926 ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3365(AbstractC2128 abstractC2128) {
        if (!abstractC2128.f6278) {
            AbstractC7935.m13395("autoInvalidateUpdatedNode called on unattached node");
        }
        m3367(abstractC2128, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3366(AbstractC2128 abstractC2128, int i, int i2) {
        if (i2 != 0 || abstractC2128.mo1283()) {
            if ((i & 2) != 0 && (abstractC2128 instanceof InterfaceC1773)) {
                AbstractC1785.m3340((InterfaceC1773) abstractC2128);
                if (i2 == 2) {
                    AbstractC1794 abstractC1794M3338 = AbstractC1785.m3338(abstractC2128, 2);
                    abstractC1794M3338.f5254 = true;
                    abstractC1794M3338.f5262.invoke();
                    abstractC1794M3338.m3386();
                    if (!C7907.m13336(abstractC1794M3338.f5244, 0L)) {
                        abstractC1794M3338.f5258.m3223(abstractC1794M3338);
                    }
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC1785.m3336(abstractC2128).m3236();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                C1748 c1748M3336 = AbstractC1785.m3336(abstractC2128);
                C1751 c1751 = C1748.f5088;
                c1748M3336.m3215(false);
            }
            if ((i & 256) != 0 && (abstractC2128 instanceof InterfaceC1782)) {
                if (i2 == 1) {
                    C1748 c1748M33362 = AbstractC1785.m3336(abstractC2128);
                    c1748M33362.m3263(c1748M33362.f5126 + 1);
                } else if (i2 == 2) {
                    AbstractC1785.m3336(abstractC2128).m3263(r0.f5126 - 1);
                }
                if (i2 != 2) {
                    C1748 c1748M33363 = AbstractC1785.m3336(abstractC2128);
                    if (c1748M33363.f5126 != 0 && !c1748M33363.m3252() && !c1748M33363.m3249() && !c1748M33363.f5127) {
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748M33363);
                        C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC1884.f5493.f5047;
                        c0076.getClass();
                        if (c1748M33363.f5126 > 0) {
                            ((C1224) c0076.f227).m2037(c1748M33363);
                            c1748M33363.f5127 = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC1884.m3525(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC2128 instanceof InterfaceC1781)) {
                AbstractC1785.m3341((InterfaceC1781) abstractC2128);
            }
            if ((i & 8) != 0 && (abstractC2128 instanceof InterfaceC1761)) {
                AbstractC1785.m3336(abstractC2128).f5112 = true;
            }
            if ((i & 64) != 0 && (abstractC2128 instanceof InterfaceC1799)) {
                C1756 c1756 = AbstractC1785.m3336((InterfaceC1799) abstractC2128).f5131;
                c1756.f5166.f5034 = true;
                C1747 c1747 = c1756.f5164;
                if (c1747 != null) {
                    c1747.f5069 = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC2128 instanceof InterfaceC1469)) {
                InterfaceC1469 interfaceC1469 = (InterfaceC1469) abstractC2128;
                C1766.f5188 = null;
                interfaceC1469.mo2623(C1766.f5189);
                if (C1766.f5188 != null) {
                    AbstractC2128 abstractC21282 = (AbstractC2128) interfaceC1469;
                    if (!abstractC21282.f6291.f6278) {
                        AbstractC7935.m13395("visitChildren called on an unattached node");
                    }
                    C1224 c1224 = new C1224(0, new AbstractC2128[16]);
                    AbstractC2128 abstractC21283 = abstractC21282.f6291;
                    AbstractC2128 abstractC21284 = abstractC21283.f6287;
                    if (abstractC21284 == null) {
                        AbstractC1785.m3332(c1224, abstractC21283);
                    } else {
                        c1224.m2037(abstractC21284);
                    }
                    while (true) {
                        int i3 = c1224.f3519;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC2128 abstractC2128M3329 = (AbstractC2128) c1224.m2043(i3 - 1);
                        if ((abstractC2128M3329.f6284 & 1024) == 0) {
                            AbstractC1785.m3332(c1224, abstractC2128M3329);
                        } else {
                            while (true) {
                                if (abstractC2128M3329 == null) {
                                    break;
                                }
                                if ((abstractC2128M3329.f6290 & 1024) != 0) {
                                    C1224 c12242 = null;
                                    while (abstractC2128M3329 != null) {
                                        if (abstractC2128M3329 instanceof C1452) {
                                            C1452 c1452 = (C1452) abstractC2128M3329;
                                            C1480 c1480 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).f4188;
                                            if (c1480.f4197.m740(c1452)) {
                                                c1480.m2639();
                                            }
                                        } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                            int i4 = 0;
                                            for (AbstractC2128 abstractC21285 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21285 != null; abstractC21285 = abstractC21285.f6287) {
                                                if ((abstractC21285.f6290 & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC2128M3329 = abstractC21285;
                                                    } else {
                                                        if (c12242 == null) {
                                                            c12242 = new C1224(0, new AbstractC2128[16]);
                                                        }
                                                        if (abstractC2128M3329 != null) {
                                                            c12242.m2037(abstractC2128M3329);
                                                            abstractC2128M3329 = null;
                                                        }
                                                        c12242.m2037(abstractC21285);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC2128M3329 = AbstractC1785.m3329(c12242);
                                    }
                                } else {
                                    abstractC2128M3329 = abstractC2128M3329.f6287;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC2128 instanceof InterfaceC1462)) {
                InterfaceC1462 interfaceC1462 = (InterfaceC1462) abstractC2128;
                C1480 c14802 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(interfaceC1462)).getFocusOwner()).f4188;
                if (c14802.f4196.m740(interfaceC1462)) {
                    c14802.m2639();
                }
            }
            if ((i & 2097152) != 0 && (abstractC2128 instanceof InterfaceC7319) && i2 == 2) {
                ((InterfaceC7319) abstractC2128).mo1224();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3367(AbstractC2128 abstractC2128, int i, int i2) {
        if (!(abstractC2128 instanceof AbstractC1788)) {
            m3366(abstractC2128, i & abstractC2128.f6290, i2);
            return;
        }
        AbstractC1788 abstractC1788 = (AbstractC1788) abstractC2128;
        int i3 = abstractC1788.f5224;
        m3366(abstractC2128, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC2128 abstractC21282 = abstractC1788.f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
            m3367(abstractC21282, i4, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m3368(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
