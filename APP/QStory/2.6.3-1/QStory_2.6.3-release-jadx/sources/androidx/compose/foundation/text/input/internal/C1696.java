package androidx.compose.foundation.text.input.internal;

import androidx.activity.C0888;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.material3.internal.SwipeEdge;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.flow.InterfaceC6150;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1696 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2751;

    public C1696(InterfaceC1713 interfaceC1713) {
        this.f2751 = 0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        switch (this.f2751) {
            case 0:
                throw null;
            case 1:
                long j = ((C8158) obj).f19886;
                throw null;
            case 2:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                if ((interfaceC1423 instanceof C1416) || (interfaceC1423 instanceof C1417) || (interfaceC1423 instanceof C1413)) {
                    throw null;
                }
                throw null;
            case 3:
                C0888 c0888 = (C0888) obj;
                float f = c0888.f428;
                int i = c0888.f425;
                if (i == 0) {
                    SwipeEdge swipeEdge = SwipeEdge.Left;
                    throw null;
                }
                if (i != 1) {
                    SwipeEdge swipeEdge2 = SwipeEdge.Left;
                    throw null;
                }
                SwipeEdge swipeEdge3 = SwipeEdge.Left;
                throw null;
            default:
                throw null;
        }
    }

    public /* synthetic */ C1696(int i) {
        this.f2751 = i;
    }
}
