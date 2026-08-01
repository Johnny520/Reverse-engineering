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
import p106.InterfaceC7307;
import p110.InterfaceC7320;
import p205.C7908;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0252 f5234;

    static {
        C0252 c0252 = AbstractC0234.f874;
        f5234 = new C0252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3372(AbstractC2128 abstractC2128) {
        if (!(abstractC2128 instanceof AbstractC1788)) {
            return m3373(abstractC2128);
        }
        AbstractC1788 abstractC1788 = (AbstractC1788) abstractC2128;
        int iM3372 = abstractC1788.f5225;
        for (AbstractC2128 abstractC21282 = abstractC1788.f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
            iM3372 |= m3372(abstractC21282);
        }
        return iM3372;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3373(AbstractC2128 abstractC2128) {
        int i = abstractC2128.f6291;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC2128.getClass();
        C0252 c0252 = f5234;
        int iM804 = c0252.m804(cls);
        if (iM804 >= 0) {
            return c0252.f916[iM804];
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
        if (abstractC2128 instanceof InterfaceC7307) {
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
        if (abstractC2128 instanceof InterfaceC7320) {
            i2 |= 2097152;
        }
        if (abstractC2128 instanceof C0719) {
            i2 |= 8388608;
        }
        c0252.m808(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m3374(InterfaceC2124 interfaceC2124) {
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
    public static final void m3375(AbstractC2128 abstractC2128) {
        if (!abstractC2128.f6279) {
            AbstractC7936.m13423("autoInvalidateUpdatedNode called on unattached node");
        }
        m3377(abstractC2128, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3376(AbstractC2128 abstractC2128, int i, int i2) {
        if (i2 != 0 || abstractC2128.mo1293()) {
            if ((i & 2) != 0 && (abstractC2128 instanceof InterfaceC1773)) {
                AbstractC1785.m3350((InterfaceC1773) abstractC2128);
                if (i2 == 2) {
                    AbstractC1794 abstractC1794M3348 = AbstractC1785.m3348(abstractC2128, 2);
                    abstractC1794M3348.f5255 = true;
                    abstractC1794M3348.f5263.invoke();
                    abstractC1794M3348.m3396();
                    if (!C7908.m13364(abstractC1794M3348.f5245, 0L)) {
                        abstractC1794M3348.f5259.m3233(abstractC1794M3348);
                    }
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC1785.m3346(abstractC2128).m3246();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                C1748 c1748M3346 = AbstractC1785.m3346(abstractC2128);
                C1751 c1751 = C1748.f5089;
                c1748M3346.m3225(false);
            }
            if ((i & 256) != 0 && (abstractC2128 instanceof InterfaceC1782)) {
                if (i2 == 1) {
                    C1748 c1748M33462 = AbstractC1785.m3346(abstractC2128);
                    c1748M33462.m3273(c1748M33462.f5127 + 1);
                } else if (i2 == 2) {
                    AbstractC1785.m3346(abstractC2128).m3273(r0.f5127 - 1);
                }
                if (i2 != 2) {
                    C1748 c1748M33463 = AbstractC1785.m3346(abstractC2128);
                    if (c1748M33463.f5127 != 0 && !c1748M33463.m3262() && !c1748M33463.m3259() && !c1748M33463.f5128) {
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748M33463);
                        C0076 c0076 = viewTreeObserverOnGlobalLayoutListenerC1884.f5494.f5048;
                        c0076.getClass();
                        if (c1748M33463.f5127 > 0) {
                            ((C1224) c0076.f227).m2047(c1748M33463);
                            c1748M33463.f5128 = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC1884.m3535(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC2128 instanceof InterfaceC1781)) {
                AbstractC1785.m3351((InterfaceC1781) abstractC2128);
            }
            if ((i & 8) != 0 && (abstractC2128 instanceof InterfaceC1761)) {
                AbstractC1785.m3346(abstractC2128).f5113 = true;
            }
            if ((i & 64) != 0 && (abstractC2128 instanceof InterfaceC1799)) {
                C1756 c1756 = AbstractC1785.m3346((InterfaceC1799) abstractC2128).f5132;
                c1756.f5167.f5035 = true;
                C1747 c1747 = c1756.f5165;
                if (c1747 != null) {
                    c1747.f5070 = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC2128 instanceof InterfaceC1469)) {
                InterfaceC1469 interfaceC1469 = (InterfaceC1469) abstractC2128;
                C1766.f5189 = null;
                interfaceC1469.mo2633(C1766.f5190);
                if (C1766.f5189 != null) {
                    AbstractC2128 abstractC21282 = (AbstractC2128) interfaceC1469;
                    if (!abstractC21282.f6292.f6279) {
                        AbstractC7936.m13423("visitChildren called on an unattached node");
                    }
                    C1224 c1224 = new C1224(0, new AbstractC2128[16]);
                    AbstractC2128 abstractC21283 = abstractC21282.f6292;
                    AbstractC2128 abstractC21284 = abstractC21283.f6288;
                    if (abstractC21284 == null) {
                        AbstractC1785.m3342(c1224, abstractC21283);
                    } else {
                        c1224.m2047(abstractC21284);
                    }
                    while (true) {
                        int i3 = c1224.f3520;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC2128 abstractC2128M3339 = (AbstractC2128) c1224.m2053(i3 - 1);
                        if ((abstractC2128M3339.f6285 & 1024) == 0) {
                            AbstractC1785.m3342(c1224, abstractC2128M3339);
                        } else {
                            while (true) {
                                if (abstractC2128M3339 == null) {
                                    break;
                                }
                                if ((abstractC2128M3339.f6291 & 1024) != 0) {
                                    C1224 c12242 = null;
                                    while (abstractC2128M3339 != null) {
                                        if (abstractC2128M3339 instanceof C1452) {
                                            C1452 c1452 = (C1452) abstractC2128M3339;
                                            C1480 c1480 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).f4189;
                                            if (c1480.f4198.m741(c1452)) {
                                                c1480.m2649();
                                            }
                                        } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                            int i4 = 0;
                                            for (AbstractC2128 abstractC21285 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21285 != null; abstractC21285 = abstractC21285.f6288) {
                                                if ((abstractC21285.f6291 & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC2128M3339 = abstractC21285;
                                                    } else {
                                                        if (c12242 == null) {
                                                            c12242 = new C1224(0, new AbstractC2128[16]);
                                                        }
                                                        if (abstractC2128M3339 != null) {
                                                            c12242.m2047(abstractC2128M3339);
                                                            abstractC2128M3339 = null;
                                                        }
                                                        c12242.m2047(abstractC21285);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC2128M3339 = AbstractC1785.m3339(c12242);
                                    }
                                } else {
                                    abstractC2128M3339 = abstractC2128M3339.f6288;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC2128 instanceof InterfaceC1462)) {
                InterfaceC1462 interfaceC1462 = (InterfaceC1462) abstractC2128;
                C1480 c14802 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(interfaceC1462)).getFocusOwner()).f4189;
                if (c14802.f4197.m741(interfaceC1462)) {
                    c14802.m2649();
                }
            }
            if ((i & 2097152) != 0 && (abstractC2128 instanceof InterfaceC7320) && i2 == 2) {
                ((InterfaceC7320) abstractC2128).mo1234();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3377(AbstractC2128 abstractC2128, int i, int i2) {
        if (!(abstractC2128 instanceof AbstractC1788)) {
            m3376(abstractC2128, i & abstractC2128.f6291, i2);
            return;
        }
        AbstractC1788 abstractC1788 = (AbstractC1788) abstractC2128;
        int i3 = abstractC1788.f5225;
        m3376(abstractC2128, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC2128 abstractC21282 = abstractC1788.f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
            m3377(abstractC21282, i4, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m3378(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
