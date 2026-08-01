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
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4388;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963 extends AbstractC2128 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Paint f5832;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f5833;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getRectManager();
        Object obj = this.f5833;
        rectManager.getClass();
        if ((AbstractC4388.m8894(0, obj) ? (InterfaceC6543) obj : null) == null) {
            return;
        }
        rectManager.f5821.m776(obj);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getRectManager();
        InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3681invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3681invoke() {
                AbstractC1785.m3351(this.this$0);
            }
        };
        rectManager.f5821.m775(interfaceC6543);
        this.f5833 = interfaceC6543;
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        C0137 c0137 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getRectManager().f5823;
        Canvas canvasM2915 = AbstractC1594.m2915(((C1758) interfaceC1506).f5176.f4284.m386());
        Paint paint = this.f5832;
        long[] jArr = (long[]) c0137.f595;
        int i = c0137.f596;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            canvasM2915.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }
}
