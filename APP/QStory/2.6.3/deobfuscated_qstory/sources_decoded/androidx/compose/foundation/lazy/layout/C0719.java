package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0742;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1702;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import io.ktor.util.C4211;
import kotlin.collections.AbstractC4339;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0719 extends AbstractC2128 implements InterfaceC1773, InterfaceC1702 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C0715 f2023 = new C0715();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0742 f2024;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f2025;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0541 f2026;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m1514(C0724 c0724, int i) {
        if (i == 5 || i == 6) {
            if (this.f2025 == Orientation.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f2025 == Orientation.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            C5925.m11311("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (m1515(i)) {
            if (c0724.f2034 >= this.f2024.f2128.m1551().f2206 - 1) {
                return false;
            }
        } else if (c0724.f2035 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final boolean m1515(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int i2 = AbstractC0714.f2018[AbstractC1785.m3346(this).f5100.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            C4211.m8611();
            return false;
        }
        if (i != 4) {
            C5925.m11311("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int i3 = AbstractC0714.f2018[AbstractC1785.m3346(this).f5100.ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        C4211.m8611();
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0723(abstractC1724Mo3055, 0));
    }
}
