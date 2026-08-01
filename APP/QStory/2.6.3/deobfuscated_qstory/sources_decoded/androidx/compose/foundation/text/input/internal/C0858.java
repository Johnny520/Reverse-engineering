package androidx.compose.foundation.text.input.internal;

import androidx.activity.C0041;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.material3.internal.SwipeEdge;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.flow.InterfaceC5318;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2406;

    public C0858(InterfaceC0875 interfaceC0875) {
        this.f2406 = 0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        switch (this.f2406) {
            case 0:
                throw null;
            case 1:
                long j = ((C7329) obj).f19541;
                throw null;
            case 2:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                if ((interfaceC0582 instanceof C0575) || (interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0572)) {
                    throw null;
                }
                throw null;
            case 3:
                C0041 c0041 = (C0041) obj;
                float f = c0041.f83;
                int i = c0041.f80;
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

    public /* synthetic */ C0858(int i) {
        this.f2406 = i;
    }
}
