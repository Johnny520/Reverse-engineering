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
import kotlin.C5176;
import kotlin.reflect.InterfaceC5088;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1077 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3205;

    public /* synthetic */ C1077(int i) {
        this.f3205 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f3205;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                return MagnifierNode$onAttach$1.invokeSuspend$lambda$0(((Long) obj).longValue());
            case 1:
                ((C1758) ((InterfaceC1506) obj)).m3311();
                return c5176;
            case 2:
                return c5176;
            case 3:
                InterfaceC1368 interfaceC1368 = (InterfaceC1368) obj;
                int i2 = AbstractC1050.f3097;
                C1334 c1334 = AbstractC1835.f5336;
                C1253 c1253 = (C1253) interfaceC1368;
                c1253.getClass();
                Context context = (Context) AbstractC1367.m2482(c1253, c1334);
                C1253 c12532 = (C1253) interfaceC1368;
                InterfaceC7896 interfaceC7896 = (InterfaceC7896) AbstractC1367.m2482(c12532, AbstractC1902.f5588);
                C1089 c1089 = (C1089) AbstractC1367.m2482(c12532, AbstractC1088.f3216);
                if (c1089 == null) {
                    return null;
                }
                return new C1051(context, interfaceC7896, c1089.f3218, c1089.f3217);
            case 4:
                C1955 c1955 = C1955.f5774;
                InterfaceC5088[] interfaceC5088Arr = AbstractC1946.f5755;
                C1947 c1947 = AbstractC1943.f5732;
                InterfaceC5088 interfaceC5088 = AbstractC1946.f5755[1];
                c1947.getClass();
                ((InterfaceC1944) obj).mo3590(c1947, c1955);
                return c5176;
            default:
                return new C1040(((Integer) obj).intValue());
        }
    }
}
