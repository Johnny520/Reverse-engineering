package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1461 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f2071;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f2072;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f2073;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f2074;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f2075;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1948(InterfaceC2488 interfaceC2488) {
        int iMo1903;
        int iMo19032;
        int iMo19033;
        int i = 0;
        if (Float.isNaN(this.f2074)) {
            iMo1903 = Integer.MAX_VALUE;
        } else {
            iMo1903 = interfaceC2488.mo1903(this.f2074);
            if (iMo1903 < 0) {
                iMo1903 = 0;
            }
        }
        if (Float.isNaN(this.f2073)) {
            iMo19032 = Integer.MAX_VALUE;
        } else {
            iMo19032 = interfaceC2488.mo1903(this.f2073);
            if (iMo19032 < 0) {
                iMo19032 = 0;
            }
        }
        if (Float.isNaN(this.f2071)) {
            iMo19033 = 0;
        } else {
            iMo19033 = interfaceC2488.mo1903(this.f2071);
            if (iMo19033 < 0) {
                iMo19033 = 0;
            }
            if (iMo19033 > iMo1903) {
                iMo19033 = iMo1903;
            }
            if (iMo19033 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.f2075)) {
            int iMo19034 = interfaceC2488.mo1903(this.f2075);
            if (iMo19034 < 0) {
                iMo19034 = 0;
            }
            if (iMo19034 > iMo19032) {
                iMo19034 = iMo19032;
            }
            if (iMo19034 != Integer.MAX_VALUE) {
                i = iMo19034;
            }
        }
        return AbstractC8726.m13884(iMo19033, iMo1903, i, iMo19032);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        long jM1948 = m1948(abstractC2589);
        if (C8727.m13891(jM1948)) {
            return C8727.m13897(jM1948);
        }
        if (!this.f2072) {
            i = AbstractC8726.m13886(i, jM1948);
        }
        return AbstractC8726.m13879(interfaceC2533.mo3617(i), jM1948);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        long jM1948 = m1948(abstractC2589);
        if (C8727.m13890(jM1948)) {
            return C8727.m13896(jM1948);
        }
        if (!this.f2072) {
            i = AbstractC8726.m13879(i, jM1948);
        }
        return AbstractC8726.m13886(interfaceC2533.mo3618(i), jM1948);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        long jM1948 = m1948(abstractC2589);
        if (C8727.m13891(jM1948)) {
            return C8727.m13897(jM1948);
        }
        if (!this.f2072) {
            i = AbstractC8726.m13886(i, jM1948);
        }
        return AbstractC8726.m13879(interfaceC2533.mo3614(i), jM1948);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        long jM1948 = m1948(abstractC2589);
        if (C8727.m13890(jM1948)) {
            return C8727.m13896(jM1948);
        }
        if (!this.f2072) {
            i = AbstractC8726.m13879(i, jM1948);
        }
        return AbstractC8726.m13886(interfaceC2533.mo3619(i), jM1948);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        int iM13900;
        int iM13896;
        int iM13899;
        int iM13897;
        long jM13884;
        long jM1948 = m1948(interfaceC2488);
        if (this.f2072) {
            jM13884 = AbstractC8726.m13880(j, jM1948);
        } else {
            if (Float.isNaN(this.f2071)) {
                iM13900 = C8727.m13900(j);
                int iM138962 = C8727.m13896(jM1948);
                if (iM13900 > iM138962) {
                    iM13900 = iM138962;
                }
            } else {
                iM13900 = C8727.m13900(jM1948);
            }
            if (Float.isNaN(this.f2074)) {
                iM13896 = C8727.m13896(j);
                int iM139002 = C8727.m13900(jM1948);
                if (iM13896 < iM139002) {
                    iM13896 = iM139002;
                }
            } else {
                iM13896 = C8727.m13896(jM1948);
            }
            if (Float.isNaN(this.f2075)) {
                iM13899 = C8727.m13899(j);
                int iM138972 = C8727.m13897(jM1948);
                if (iM13899 > iM138972) {
                    iM13899 = iM138972;
                }
            } else {
                iM13899 = C8727.m13899(jM1948);
            }
            if (Float.isNaN(this.f2073)) {
                iM13897 = C8727.m13897(j);
                int iM138992 = C8727.m13899(jM1948);
                if (iM13897 < iM138992) {
                    iM13897 = iM138992;
                }
            } else {
                iM13897 = C8727.m13897(jM1948);
            }
            jM13884 = AbstractC8726.m13884(iM13900, iM13896, iM13899, iM13897);
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(jM13884);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1436(abstractC2559Mo3615, 2));
    }
}
