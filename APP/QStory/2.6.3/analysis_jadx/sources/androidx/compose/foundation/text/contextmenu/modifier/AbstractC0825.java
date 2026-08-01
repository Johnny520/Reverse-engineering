package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.collection.C0242;
import androidx.collection.C0244;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.text.selection.C0889;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1787;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p121.AbstractC7389;
import p121.C7385;
import p121.C7388;
import p179.C7753;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1643(InterfaceC2129 interfaceC2129, C0824 c0824, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, C0914 c0914) {
        return interfaceC2129.mo3866(new C0826(c0824, interfaceC6558, interfaceC65582, c0914));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1644(InterfaceC6554 interfaceC6554) {
        return new C0816(interfaceC6554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7388 m1645(InterfaceC1787 interfaceC1787) {
        C7385 c7385;
        C7753 c7753 = new C7753();
        AbstractC1785.m3336(interfaceC1787, C0817.f2332, new C1067(new C1067(c7753, 8), 9, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(c7753)));
        C0244 c0244 = new C0244();
        C0244 c02442 = c7753.f21042;
        Object[] objArr = c02442.f1005;
        int i = c02442.f1004;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        AbstractC7389 abstractC7389 = null;
        while (true) {
            c7385 = C7385.f20024;
            if (i3 >= i) {
                break;
            }
            AbstractC7389 abstractC73892 = (AbstractC7389) objArr[i3];
            if (!z || abstractC73892 != c7385) {
                if (abstractC73892 == c7385 && abstractC7389 == c7385) {
                    z = false;
                    break;
                    break;
                }
                if (abstractC73892 != c7385) {
                    C0244 c02443 = c7753.f21041;
                    Object[] objArr2 = c02443.f1005;
                    int i4 = c02443.f1004;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((InterfaceC6558) objArr2[i5]).invoke(abstractC73892)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                c0244.m775(abstractC73892);
                z = false;
                abstractC7389 = abstractC73892;
            }
            i3++;
        }
        if (((AbstractC7389) (c0244.m879() ? null : c0244.f1005[c0244.f1004 - 1])) == c7385) {
            c0244.m777(c0244.f1004 - 1);
        }
        C0242 c0242 = c0244.f897;
        if (c0242 == null) {
            c0242 = new C0242(c0244, i2);
            c0244.f897 = c0242;
        }
        return new C7388(c0242);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1646(InterfaceC2129 interfaceC2129, C0889 c0889) {
        return interfaceC2129.mo3866(new C0819(c0889));
    }
}
