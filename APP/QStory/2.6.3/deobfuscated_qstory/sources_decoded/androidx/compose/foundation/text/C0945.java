package androidx.compose.foundation.text;

import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.InterfaceC1485;
import androidx.compose.ui.platform.C1901;
import androidx.compose.ui.platform.InterfaceC1871;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1485 f2690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0941 f2691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1871 f2692;

    public C0945(InterfaceC1871 interfaceC1871) {
        this.f2692 = interfaceC1871;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1870(int i) {
        InterfaceC1871 interfaceC1871;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            m1871();
        } else if (i != 1 && i != 0) {
            C5925.m11311("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            InterfaceC1485 interfaceC1485 = this.f2690;
            if (interfaceC1485 != null) {
                ((C1478) interfaceC1485).m2647(1, true);
                return true;
            }
            AbstractC4395.m8908("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (interfaceC1871 = this.f2692) == null) {
                return false;
            }
            ((C1901) interfaceC1871).m3596();
            return true;
        }
        InterfaceC1485 interfaceC14852 = this.f2690;
        if (interfaceC14852 != null) {
            ((C1478) interfaceC14852).m2647(2, true);
            return true;
        }
        AbstractC4395.m8908("focusManager");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0941 m1871() {
        C0941 c0941 = this.f2691;
        if (c0941 != null) {
            return c0941;
        }
        AbstractC4395.m8908("keyboardActions");
        throw null;
    }
}
