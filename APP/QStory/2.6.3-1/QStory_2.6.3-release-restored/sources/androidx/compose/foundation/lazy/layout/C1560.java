package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.C1382;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1583;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2537;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import io.ktor.util.C5043;
import kotlin.collections.AbstractC5171;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560 extends AbstractC2961 implements InterfaceC2608, InterfaceC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C1556 f2368 = new C1556();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1583 f2369;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f2370;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1382 f2371;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2074(C1565 c1565, int i) {
        if (i == 5 || i == 6) {
            if (this.f2370 == Orientation.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f2370 == Orientation.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            C6755.m11870("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (m2075(i)) {
            if (c1565.f2379 >= this.f2369.f2473.m2111().f2551 - 1) {
                return false;
            }
        } else if (c1565.f2380 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final boolean m2075(int i) {
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
            int i2 = AbstractC1555.f2363[AbstractC2620.m3906(this).f5445.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            C5043.m9170();
            return false;
        }
        if (i != 4) {
            C6755.m11870("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int i3 = AbstractC1555.f2363[AbstractC2620.m3906(this).f5445.ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        C5043.m9170();
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1564(abstractC2559Mo3615, 0));
    }
}
