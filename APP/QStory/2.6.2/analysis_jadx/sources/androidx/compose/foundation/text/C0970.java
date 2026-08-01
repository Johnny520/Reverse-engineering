package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import kotlin.C5175;
import p052.InterfaceC6553;
import top.yukonga.miuix.kmp.basic.AbstractC6021;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0970 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2760;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f2761;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f2762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2763;

    public /* synthetic */ C0970(Object obj, InterfaceC2129 interfaceC2129, long j, int i, int i2) {
        this.f2763 = i2;
        this.f2760 = obj;
        this.f2761 = interfaceC2129;
        this.f2762 = j;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2763;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f2760;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(1);
                AbstractC0968.m1875((InterfaceC0918) obj3, this.f2761, this.f2762, (InterfaceC1373) obj, iM2460);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(3513);
                AbstractC6021.m11322((AbstractC1528) obj3, this.f2761, this.f2762, (InterfaceC1373) obj, iM24602);
                break;
        }
        return c5175;
    }
}
