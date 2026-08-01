package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1368;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1955;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1077 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3204;

    public /* synthetic */ C1077(int i) {
        this.f3204 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f3204;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                return MagnifierNode$onAttach$1.invokeSuspend$lambda$0(((Long) obj).longValue());
            case 1:
                ((C1758) ((InterfaceC1506) obj)).m3301();
                return c5175;
            case 2:
                return c5175;
            case 3:
                InterfaceC1368 interfaceC1368 = (InterfaceC1368) obj;
                int i2 = AbstractC1050.f3096;
                C1334 c1334 = AbstractC1835.f5335;
                C1253 c1253 = (C1253) interfaceC1368;
                c1253.getClass();
                Context context = (Context) AbstractC1367.m2473(c1253, c1334);
                C1253 c12532 = (C1253) interfaceC1368;
                InterfaceC7895 interfaceC7895 = (InterfaceC7895) AbstractC1367.m2473(c12532, AbstractC1902.f5587);
                C1089 c1089 = (C1089) AbstractC1367.m2473(c12532, AbstractC1088.f3215);
                if (c1089 == null) {
                    return null;
                }
                return new C1051(context, interfaceC7895, c1089.f3217, c1089.f3216);
            case 4:
                C1955 c1955 = C1955.f5773;
                InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
                C1947 c1947 = AbstractC1943.f5731;
                InterfaceC5087 interfaceC5087 = AbstractC1946.f5754[1];
                c1947.getClass();
                ((InterfaceC1944) obj).mo3580(c1947, c1955);
                return c5175;
            default:
                return new C1040(((Integer) obj).intValue());
        }
    }
}
