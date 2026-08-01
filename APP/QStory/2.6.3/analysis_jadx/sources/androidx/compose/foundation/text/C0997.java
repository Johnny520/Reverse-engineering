package androidx.compose.foundation.text;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2917 = AbstractC1367.m2474(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2031 f2919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1996 f2920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7896 f2921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public LayoutDirection f2922;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f2923;

    public C0997(LayoutDirection layoutDirection, InterfaceC7896 interfaceC7896, InterfaceC1996 interfaceC1996, C2031 c2031, Object obj) {
        this.f2922 = layoutDirection;
        this.f2921 = interfaceC7896;
        this.f2920 = interfaceC1996;
        this.f2919 = c2031;
        this.f2918 = obj;
        this.f2923 = AbstractC0996.m1916(this.f2919, this.f2921, this.f2920, AbstractC0996.f2916, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m1917(C0997 c0997, LayoutDirection layoutDirection, InterfaceC7896 interfaceC7896, C2031 c2031, int i) {
        if ((i & 1) != 0) {
            layoutDirection = c0997.f2922;
        }
        if ((i & 2) != 0) {
            interfaceC7896 = c0997.f2921;
        }
        InterfaceC1996 interfaceC1996 = c0997.f2920;
        if ((i & 8) != 0) {
            c2031 = c0997.f2919;
        }
        Object obj = c0997.f2918;
        LayoutDirection layoutDirection2 = c0997.f2922;
        InterfaceC1395 interfaceC1395 = c0997.f2917;
        if (layoutDirection == layoutDirection2 && AbstractC4395.m8907(interfaceC7896, c0997.f2921) && AbstractC4395.m8907(interfaceC1996, c0997.f2920) && AbstractC4395.m8907(c2031, c0997.f2919)) {
            if (AbstractC4395.m8907(obj, c0997.f2918)) {
                return;
            }
            c0997.f2918 = obj;
            ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
            return;
        }
        c0997.f2922 = layoutDirection;
        c0997.f2921 = interfaceC7896;
        c0997.f2920 = interfaceC1996;
        c0997.f2919 = c2031;
        ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
    }
}
