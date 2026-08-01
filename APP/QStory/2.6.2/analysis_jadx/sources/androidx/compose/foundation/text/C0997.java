package androidx.compose.foundation.text;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2916 = AbstractC1367.m2465(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2031 f2918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1996 f2919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7895 f2920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public LayoutDirection f2921;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f2922;

    public C0997(LayoutDirection layoutDirection, InterfaceC7895 interfaceC7895, InterfaceC1996 interfaceC1996, C2031 c2031, Object obj) {
        this.f2921 = layoutDirection;
        this.f2920 = interfaceC7895;
        this.f2919 = interfaceC1996;
        this.f2918 = c2031;
        this.f2917 = obj;
        this.f2922 = AbstractC0996.m1906(this.f2918, this.f2920, this.f2919, AbstractC0996.f2915, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m1907(C0997 c0997, LayoutDirection layoutDirection, InterfaceC7895 interfaceC7895, C2031 c2031, int i) {
        if ((i & 1) != 0) {
            layoutDirection = c0997.f2921;
        }
        if ((i & 2) != 0) {
            interfaceC7895 = c0997.f2920;
        }
        InterfaceC1996 interfaceC1996 = c0997.f2919;
        if ((i & 8) != 0) {
            c2031 = c0997.f2918;
        }
        Object obj = c0997.f2917;
        LayoutDirection layoutDirection2 = c0997.f2921;
        InterfaceC1395 interfaceC1395 = c0997.f2916;
        if (layoutDirection == layoutDirection2 && AbstractC4394.m8917(interfaceC7895, c0997.f2920) && AbstractC4394.m8917(interfaceC1996, c0997.f2919) && AbstractC4394.m8917(c2031, c0997.f2918)) {
            if (AbstractC4394.m8917(obj, c0997.f2917)) {
                return;
            }
            c0997.f2917 = obj;
            ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
            return;
        }
        c0997.f2921 = layoutDirection;
        c0997.f2920 = interfaceC7895;
        c0997.f2919 = interfaceC1996;
        c0997.f2918 = c2031;
        ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
    }
}
