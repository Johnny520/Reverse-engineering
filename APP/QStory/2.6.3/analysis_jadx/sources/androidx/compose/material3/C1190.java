package androidx.compose.material3;

import androidx.appcompat.app.C0113;
import androidx.compose.animation.core.C0362;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.material.ripple.AbstractC1109;
import androidx.compose.material.ripple.C1103;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5176;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1190 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1191 f3393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3394;

    public /* synthetic */ C1190(C1191 c1191, int i) {
        this.f3394 = i;
        this.f3393 = c1191;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f3394;
        C1191 c1191 = this.f3393;
        switch (i) {
            case 0:
                C1140 c1140 = (C1140) AbstractC1785.m3356(c1191, AbstractC1142.f3282);
                C1103 c1103 = c1191.f3395;
                if (c1140 == null) {
                    if (c1103 != null) {
                        c1191.m3368(c1103);
                    }
                    c1191.f3395 = null;
                } else if (c1103 == null) {
                    C0113 c0113 = new C0113(c1191, 15);
                    C1190 c1190 = new C1190(c1191, 1);
                    InterfaceC0579 interfaceC0579 = c1191.f3399;
                    boolean z = c1191.f3398;
                    float f = c1191.f3397;
                    C0362 c0362 = AbstractC1109.f3256;
                    C1103 c11032 = new C1103(interfaceC0579, z, f, c0113, c1190);
                    c1191.m3364(c11032);
                    c1191.f3395 = c11032;
                }
                return C5176.f14739;
            default:
                return AbstractC1143.f3283;
        }
    }
}
