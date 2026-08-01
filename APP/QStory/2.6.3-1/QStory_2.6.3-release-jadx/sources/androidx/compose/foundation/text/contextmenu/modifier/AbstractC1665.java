package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.collection.C1089;
import androidx.collection.C1091;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.text.selection.C1727;
import androidx.compose.foundation.text.selection.C1752;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2622;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p137.AbstractC8218;
import p137.C8214;
import p137.C8217;
import p195.C8582;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1665 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2962 m2203(InterfaceC2962 interfaceC2962, C1664 c1664, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, C1752 c1752) {
        return interfaceC2962.mo4426(new C1666(c1664, interfaceC7387, interfaceC73872, c1752));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2204(InterfaceC7383 interfaceC7383) {
        return new C1656(interfaceC7383);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8217 m2205(InterfaceC2622 interfaceC2622) {
        C8214 c8214;
        C8582 c8582 = new C8582();
        AbstractC2620.m3896(interfaceC2622, C1657.f2677, new C1905(new C1905(c8582, 8), 9, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(c8582)));
        C1091 c1091 = new C1091();
        C1091 c10912 = c8582.f21387;
        Object[] objArr = c10912.f1350;
        int i = c10912.f1349;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        AbstractC8218 abstractC8218 = null;
        while (true) {
            c8214 = C8214.f20369;
            if (i3 >= i) {
                break;
            }
            AbstractC8218 abstractC82182 = (AbstractC8218) objArr[i3];
            if (!z || abstractC82182 != c8214) {
                if (abstractC82182 == c8214 && abstractC8218 == c8214) {
                    z = false;
                    break;
                    break;
                }
                if (abstractC82182 != c8214) {
                    C1091 c10913 = c8582.f21386;
                    Object[] objArr2 = c10913.f1350;
                    int i4 = c10913.f1349;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((InterfaceC7387) objArr2[i5]).invoke(abstractC82182)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                c1091.m1335(abstractC82182);
                z = false;
                abstractC8218 = abstractC82182;
            }
            i3++;
        }
        if (((AbstractC8218) (c1091.m1439() ? null : c1091.f1350[c1091.f1349 - 1])) == c8214) {
            c1091.m1337(c1091.f1349 - 1);
        }
        C1089 c1089 = c1091.f1242;
        if (c1089 == null) {
            c1089 = new C1089(c1091, i2);
            c1091.f1242 = c1089;
        }
        return new C8217(c1089);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2206(InterfaceC2962 interfaceC2962, C1727 c1727) {
        return interfaceC2962.mo4426(new C1659(c1727));
    }
}
