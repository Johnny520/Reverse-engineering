package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.collection.C0242;
import androidx.collection.C0244;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.text.selection.C0889;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1787;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p121.AbstractC7388;
import p121.C7384;
import p121.C7387;
import p179.C7752;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1633(InterfaceC2129 interfaceC2129, C0824 c0824, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, C0914 c0914) {
        return interfaceC2129.mo3856(new C0826(c0824, interfaceC6557, interfaceC65572, c0914));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1634(InterfaceC6553 interfaceC6553) {
        return new C0816(interfaceC6553);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7387 m1635(InterfaceC1787 interfaceC1787) {
        C7384 c7384;
        C7752 c7752 = new C7752();
        AbstractC1785.m3326(interfaceC1787, C0817.f2331, new C1067(new C1067(c7752, 8), 9, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(c7752)));
        C0244 c0244 = new C0244();
        C0244 c02442 = c7752.f21045;
        Object[] objArr = c02442.f1005;
        int i = c02442.f1004;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        AbstractC7388 abstractC7388 = null;
        while (true) {
            c7384 = C7384.f20029;
            if (i3 >= i) {
                break;
            }
            AbstractC7388 abstractC73882 = (AbstractC7388) objArr[i3];
            if (!z || abstractC73882 != c7384) {
                if (abstractC73882 == c7384 && abstractC7388 == c7384) {
                    z = false;
                    break;
                    break;
                }
                if (abstractC73882 != c7384) {
                    C0244 c02443 = c7752.f21044;
                    Object[] objArr2 = c02443.f1005;
                    int i4 = c02443.f1004;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((InterfaceC6557) objArr2[i5]).invoke(abstractC73882)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                c0244.m774(abstractC73882);
                z = false;
                abstractC7388 = abstractC73882;
            }
            i3++;
        }
        if (((AbstractC7388) (c0244.m878() ? null : c0244.f1005[c0244.f1004 - 1])) == c7384) {
            c0244.m776(c0244.f1004 - 1);
        }
        C0242 c0242 = c0244.f897;
        if (c0242 == null) {
            c0242 = new C0242(c0244, i2);
            c0244.f897 = c0242;
        }
        return new C7387(c0242);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1636(InterfaceC2129 interfaceC2129, C0889 c0889) {
        return interfaceC2129.mo3856(new C0819(c0889));
    }
}
