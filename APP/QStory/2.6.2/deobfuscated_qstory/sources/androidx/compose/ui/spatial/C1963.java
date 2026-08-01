package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.C0137;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4387;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963 extends AbstractC2128 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Paint f5831;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f5832;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getRectManager();
        Object obj = this.f5832;
        rectManager.getClass();
        if ((AbstractC4387.m8904(0, obj) ? (InterfaceC6542) obj : null) == null) {
            return;
        }
        rectManager.f5820.m775(obj);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getRectManager();
        InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3671invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3671invoke() {
                AbstractC1785.m3341(this.this$0);
            }
        };
        rectManager.f5820.m774(interfaceC6542);
        this.f5832 = interfaceC6542;
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        C0137 c0137 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getRectManager().f5822;
        Canvas canvasM2905 = AbstractC1594.m2905(((C1758) interfaceC1506).f5175.f4283.m385());
        Paint paint = this.f5831;
        long[] jArr = (long[]) c0137.f595;
        int i = c0137.f596;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            canvasM2905.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }
}
