package androidx.compose.foundation.text;

import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2706;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2320 f3035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1779 f3036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2706 f3037;

    public C1783(InterfaceC2706 interfaceC2706) {
        this.f3037 = interfaceC2706;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2430(int i) {
        InterfaceC2706 interfaceC2706;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            m2431();
        } else if (i != 1 && i != 0) {
            C6755.m11870("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            InterfaceC2320 interfaceC2320 = this.f3035;
            if (interfaceC2320 != null) {
                ((C2313) interfaceC2320).m3207(1, true);
                return true;
            }
            AbstractC5227.m9467("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (interfaceC2706 = this.f3037) == null) {
                return false;
            }
            ((C2736) interfaceC2706).m4156();
            return true;
        }
        InterfaceC2320 interfaceC23202 = this.f3035;
        if (interfaceC23202 != null) {
            ((C2313) interfaceC23202).m3207(2, true);
            return true;
        }
        AbstractC5227.m9467("focusManager");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1779 m2431() {
        C1779 c1779 = this.f3036;
        if (c1779 != null) {
            return c1779;
        }
        AbstractC5227.m9467("keyboardActions");
        throw null;
    }
}
