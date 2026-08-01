package androidx.compose.p001ui.node;

import androidx.appcompat.app.C0923;
import androidx.collection.AbstractC1081;
import androidx.collection.C1099;
import androidx.compose.animation.C1263;
import androidx.compose.foundation.C1934;
import androidx.compose.foundation.lazy.layout.C1560;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2957;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.C2315;
import androidx.compose.p001ui.focus.InterfaceC2297;
import androidx.compose.p001ui.focus.InterfaceC2304;
import androidx.compose.p001ui.input.pointer.C2475;
import androidx.compose.p001ui.layout.InterfaceC2503;
import androidx.compose.p001ui.layout.InterfaceC2522;
import androidx.compose.p001ui.modifier.InterfaceC2568;
import androidx.compose.p001ui.platform.C2725;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.relocation.InterfaceC2761;
import androidx.compose.p001ui.semantics.C2775;
import androidx.compose.runtime.collection.C2059;
import net.bytebuddy.jar.asm.Opcodes;
import p122.InterfaceC8136;
import p126.InterfaceC8149;
import p221.C8737;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1099 f5579;

    static {
        C1099 c1099 = AbstractC1081.f1219;
        f5579 = new C1099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3932(AbstractC2961 abstractC2961) {
        if (!(abstractC2961 instanceof AbstractC2623)) {
            return m3933(abstractC2961);
        }
        AbstractC2623 abstractC2623 = (AbstractC2623) abstractC2961;
        int iM3932 = abstractC2623.f5570;
        for (AbstractC2961 abstractC29612 = abstractC2623.f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
            iM3932 |= m3932(abstractC29612);
        }
        return iM3932;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3933(AbstractC2961 abstractC2961) {
        int i = abstractC2961.f6636;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC2961.getClass();
        C1099 c1099 = f5579;
        int iM1364 = c1099.m1364(cls);
        if (iM1364 >= 0) {
            return c1099.f1261[iM1364];
        }
        int i2 = abstractC2961 instanceof InterfaceC2608 ? 3 : 1;
        if (abstractC2961 instanceof InterfaceC2616) {
            i2 |= 4;
        }
        if (abstractC2961 instanceof InterfaceC2596) {
            i2 |= 8;
        }
        if (abstractC2961 instanceof InterfaceC2631) {
            i2 |= 16;
        }
        if (abstractC2961 instanceof InterfaceC2568) {
            i2 |= 32;
        }
        if (abstractC2961 instanceof InterfaceC2634) {
            i2 |= 64;
        }
        if (abstractC2961 instanceof InterfaceC2611) {
            i2 |= 4194432;
        } else if (abstractC2961 instanceof InterfaceC2575) {
            i2 |= 128;
        }
        if (abstractC2961 instanceof InterfaceC2617) {
            i2 |= 256;
        }
        if (abstractC2961 instanceof InterfaceC2522) {
            i2 |= 512;
        }
        if (abstractC2961 instanceof C2287) {
            i2 |= 1024;
        }
        if (abstractC2961 instanceof InterfaceC2304) {
            i2 |= 2048;
        }
        if (abstractC2961 instanceof InterfaceC2297) {
            i2 |= 4096;
        }
        if (abstractC2961 instanceof InterfaceC8136) {
            i2 |= 8192;
        }
        if (abstractC2961 instanceof C2725) {
            i2 |= 16384;
        }
        if (abstractC2961 instanceof InterfaceC2618) {
            i2 |= 32768;
        }
        if (abstractC2961 instanceof InterfaceC2599) {
            i2 |= 262144;
        }
        if (abstractC2961 instanceof InterfaceC2761) {
            i2 |= Opcodes.ASM8;
        }
        if (abstractC2961 instanceof InterfaceC8149) {
            i2 |= 2097152;
        }
        if (abstractC2961 instanceof C1560) {
            i2 |= 8388608;
        }
        c1099.m1368(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m3934(InterfaceC2957 interfaceC2957) {
        int i = interfaceC2957 instanceof InterfaceC2503 ? 3 : 1;
        if (interfaceC2957 instanceof C1934) {
            i |= 4;
        }
        if (interfaceC2957 instanceof C2775) {
            i |= 8;
        }
        if (interfaceC2957 instanceof C2475) {
            i |= 16;
        }
        if (interfaceC2957 instanceof C1263) {
            i |= 64;
        }
        return interfaceC2957 instanceof InterfaceC2761 ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3935(AbstractC2961 abstractC2961) {
        if (!abstractC2961.f6624) {
            AbstractC8765.m13982("autoInvalidateUpdatedNode called on unattached node");
        }
        m3937(abstractC2961, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3936(AbstractC2961 abstractC2961, int i, int i2) {
        if (i2 != 0 || abstractC2961.mo1853()) {
            if ((i & 2) != 0 && (abstractC2961 instanceof InterfaceC2608)) {
                AbstractC2620.m3910((InterfaceC2608) abstractC2961);
                if (i2 == 2) {
                    AbstractC2629 abstractC2629M3908 = AbstractC2620.m3908(abstractC2961, 2);
                    abstractC2629M3908.f5600 = true;
                    abstractC2629M3908.f5608.invoke();
                    abstractC2629M3908.m3956();
                    if (!C8737.m13923(abstractC2629M3908.f5590, 0L)) {
                        abstractC2629M3908.f5604.m3793(abstractC2629M3908);
                    }
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC2620.m3906(abstractC2961).m3806();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                C2583 c2583M3906 = AbstractC2620.m3906(abstractC2961);
                C2586 c2586 = C2583.f5434;
                c2583M3906.m3785(false);
            }
            if ((i & 256) != 0 && (abstractC2961 instanceof InterfaceC2617)) {
                if (i2 == 1) {
                    C2583 c2583M39062 = AbstractC2620.m3906(abstractC2961);
                    c2583M39062.m3833(c2583M39062.f5472 + 1);
                } else if (i2 == 2) {
                    AbstractC2620.m3906(abstractC2961).m3833(r0.f5472 - 1);
                }
                if (i2 != 2) {
                    C2583 c2583M39063 = AbstractC2620.m3906(abstractC2961);
                    if (c2583M39063.f5472 != 0 && !c2583M39063.m3822() && !c2583M39063.m3819() && !c2583M39063.f5473) {
                        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M39063);
                        C0923 c0923 = viewTreeObserverOnGlobalLayoutListenerC2719.f5839.f5393;
                        c0923.getClass();
                        if (c2583M39063.f5472 > 0) {
                            ((C2059) c0923.f572).m2607(c2583M39063);
                            c2583M39063.f5473 = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC2719.m4095(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC2961 instanceof InterfaceC2616)) {
                AbstractC2620.m3911((InterfaceC2616) abstractC2961);
            }
            if ((i & 8) != 0 && (abstractC2961 instanceof InterfaceC2596)) {
                AbstractC2620.m3906(abstractC2961).f5458 = true;
            }
            if ((i & 64) != 0 && (abstractC2961 instanceof InterfaceC2634)) {
                C2591 c2591 = AbstractC2620.m3906((InterfaceC2634) abstractC2961).f5477;
                c2591.f5512.f5380 = true;
                C2582 c2582 = c2591.f5510;
                if (c2582 != null) {
                    c2582.f5415 = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC2961 instanceof InterfaceC2304)) {
                InterfaceC2304 interfaceC2304 = (InterfaceC2304) abstractC2961;
                C2601.f5534 = null;
                interfaceC2304.mo3193(C2601.f5535);
                if (C2601.f5534 != null) {
                    AbstractC2961 abstractC29612 = (AbstractC2961) interfaceC2304;
                    if (!abstractC29612.f6637.f6624) {
                        AbstractC8765.m13982("visitChildren called on an unattached node");
                    }
                    C2059 c2059 = new C2059(0, new AbstractC2961[16]);
                    AbstractC2961 abstractC29613 = abstractC29612.f6637;
                    AbstractC2961 abstractC29614 = abstractC29613.f6633;
                    if (abstractC29614 == null) {
                        AbstractC2620.m3902(c2059, abstractC29613);
                    } else {
                        c2059.m2607(abstractC29614);
                    }
                    while (true) {
                        int i3 = c2059.f3865;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC2961 abstractC2961M3899 = (AbstractC2961) c2059.m2613(i3 - 1);
                        if ((abstractC2961M3899.f6630 & 1024) == 0) {
                            AbstractC2620.m3902(c2059, abstractC2961M3899);
                        } else {
                            while (true) {
                                if (abstractC2961M3899 == null) {
                                    break;
                                }
                                if ((abstractC2961M3899.f6636 & 1024) != 0) {
                                    C2059 c20592 = null;
                                    while (abstractC2961M3899 != null) {
                                        if (abstractC2961M3899 instanceof C2287) {
                                            C2287 c2287 = (C2287) abstractC2961M3899;
                                            C2315 c2315 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).f4534;
                                            if (c2315.f4543.m1301(c2287)) {
                                                c2315.m3209();
                                            }
                                        } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                            int i4 = 0;
                                            for (AbstractC2961 abstractC29615 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29615 != null; abstractC29615 = abstractC29615.f6633) {
                                                if ((abstractC29615.f6636 & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC2961M3899 = abstractC29615;
                                                    } else {
                                                        if (c20592 == null) {
                                                            c20592 = new C2059(0, new AbstractC2961[16]);
                                                        }
                                                        if (abstractC2961M3899 != null) {
                                                            c20592.m2607(abstractC2961M3899);
                                                            abstractC2961M3899 = null;
                                                        }
                                                        c20592.m2607(abstractC29615);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC2961M3899 = AbstractC2620.m3899(c20592);
                                    }
                                } else {
                                    abstractC2961M3899 = abstractC2961M3899.f6633;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC2961 instanceof InterfaceC2297)) {
                InterfaceC2297 interfaceC2297 = (InterfaceC2297) abstractC2961;
                C2315 c23152 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(interfaceC2297)).getFocusOwner()).f4534;
                if (c23152.f4542.m1301(interfaceC2297)) {
                    c23152.m3209();
                }
            }
            if ((i & 2097152) != 0 && (abstractC2961 instanceof InterfaceC8149) && i2 == 2) {
                ((InterfaceC8149) abstractC2961).mo1794();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3937(AbstractC2961 abstractC2961, int i, int i2) {
        if (!(abstractC2961 instanceof AbstractC2623)) {
            m3936(abstractC2961, i & abstractC2961.f6636, i2);
            return;
        }
        AbstractC2623 abstractC2623 = (AbstractC2623) abstractC2961;
        int i3 = abstractC2623.f5570;
        m3936(abstractC2961, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC2961 abstractC29612 = abstractC2623.f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
            m3937(abstractC29612, i4, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m3938(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
